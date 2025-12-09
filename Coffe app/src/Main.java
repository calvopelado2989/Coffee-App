public class Main {
    public static void main(String[] args) {
        // (Opcional) Usa el look and feel del sistema
        try {
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        javax.swing.SwingUtilities.invokeLater(() -> new CoffeeApp().setVisible(true));
    }
}