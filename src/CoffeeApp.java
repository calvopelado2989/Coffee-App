import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class CoffeeApp extends JFrame {
    private final JTextField txtNombre;
    private final JComboBox<String> cmbSabor;
    private final JSpinner spCantidad;
    private final JLabel lblPrecioUnit;
    private final JTextArea txtRecibo;

    private final Map<String, Double> precios = new HashMap<>();

    public CoffeeApp() {
        super("Coffee Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 420);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(12, 12));

        // Precios por sabor
        precios.put("Chocolate", 20.0);
        precios.put("Capuccino", 25.0);
        precios.put("Otro", 15.0);

        // Panel formulario
        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(8, 8, 8, 8);
        c.fill = GridBagConstraints.HORIZONTAL;

        // Nombre
        c.gridx = 0; c.gridy = 0;
        form.add(new JLabel("¿Cómo te llamas?"), c);
        txtNombre = new JTextField();
        c.gridx = 1; c.gridy = 0;
        form.add(txtNombre, c);

        // Sabor
        c.gridx = 0; c.gridy = 1;
        form.add(new JLabel("Sabor de café:"), c);
        cmbSabor = new JComboBox<>(new String[]{"Chocolate", "Capuccino", "Otro"});
        c.gridx = 1; c.gridy = 1;
        form.add(cmbSabor, c);

        // Cantidad
        c.gridx = 0; c.gridy = 2;
        form.add(new JLabel("Cantidad:"), c);
        spCantidad = new JSpinner(new SpinnerNumberModel(1, 1, 20, 1));
        c.gridx = 1; c.gridy = 2;
        form.add(spCantidad, c);

        // Precio unitario
        c.gridx = 0; c.gridy = 3;
        form.add(new JLabel("Precio unitario:"), c);
        lblPrecioUnit = new JLabel("$ " + precioDe((String) cmbSabor.getSelectedItem()));
        c.gridx = 1; c.gridy = 3;
        form.add(lblPrecioUnit, c);

        add(form, BorderLayout.NORTH);

        // Recibo
        txtRecibo = new JTextArea();
        txtRecibo.setEditable(false);
        txtRecibo.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));
        add(new JScrollPane(txtRecibo), BorderLayout.CENTER);

        // Botones
        JPanel acciones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnCalcular = new JButton("Calcular precio");
        JButton btnConfirmar = new JButton("Confirmar pedido");
        acciones.add(btnCalcular);
        acciones.add(btnConfirmar);
        add(acciones, BorderLayout.SOUTH);

        // Eventos
        cmbSabor.addActionListener(e -> actualizarPrecioUnit());
        btnCalcular.addActionListener(this::calcular);
        btnConfirmar.addActionListener(this::confirmar);

        actualizarPrecioUnit();
    }

    private double precioDe(String sabor) {
        return precios.getOrDefault(sabor, 15.0);
    }

    private void actualizarPrecioUnit() {
        String sabor = (String) cmbSabor.getSelectedItem();
        lblPrecioUnit.setText("$ " + precioDe(sabor));
    }

    private void calcular(ActionEvent e) {
        String nombre = txtNombre.getText().trim();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor escribe tu nombre.",
                    "Falta nombre", JOptionPane.WARNING_MESSAGE);
            return;
        }


        if (nombre.equalsIgnoreCase("Lucas")) {
            nombre = "Lucas. Te amo";
        }

        String sabor = (String) cmbSabor.getSelectedItem();
        int cant = (int) spCantidad.getValue();
        double precio = precioDe(sabor);

        Coffe order = new Coffe(precio, sabor, nombre, cant);
        txtRecibo.setText(order.toString());
    }

    private void confirmar(ActionEvent e) {
        if (txtRecibo.getText().isEmpty()) {
            calcular(e); // Calcula si no lo hizo aún
            if (txtRecibo.getText().isEmpty()) return;
        }
        JOptionPane.showMessageDialog(this,
                "¡Pedido confirmado!\n\n" + txtRecibo.getText(),
                "Confirmación", JOptionPane.INFORMATION_MESSAGE);
    }
}