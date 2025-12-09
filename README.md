# ☕ Coffee App

A small **Java console application** that simulates a coffee shop ordering system with **3 different coffee flavors**.

This project was created to practice **Java**, **OOP basics**, and **console interaction**.

---

## ✨ Features

- Menu with **three predefined coffee flavors**.
- Simple, interactive **console UI**.
- Clear separation between:
  - Menu / user interaction
  - Coffee representation (flavor, description, etc.)
- Ideal as a **beginner Java project** or portfolio piece.
- Easy to extend with:
  - Sizes (small / medium / large)
  - Sugar / milk options
  - Prices and receipts
  - Multiple coffees per order

---

## 📸 Conceptual Preview

    ========================
          COFFEE SHOP
    ========================
    1) Espresso
    2) Cappuccino
    3) Latte

    Choose your coffee (1-3):
    > 2
    You selected: Cappuccino
    Thanks for your order! ☕

---

## 🧱 Project Structure

The repository structure is:

    Coffee-App/
    ├── Coffe app/
    │   ├── (Java source files)
    │   └── ...
    └── README.md

All the `.java` files that make up the application live inside the `Coffe app` directory.

> The class that contains  
> `public static void main(String[] args)`  
> is the entry point of the app.

---

## 🛠️ Tech Stack

- **Language:** Java (JDK 8+ recommended)
- **Type of app:** Console / CLI
- **Paradigm:** Object-Oriented Programming (OOP)
- **Tools (optional):**
  - IntelliJ IDEA / VS Code / Eclipse
  - Git & GitHub for version control

---

## 🚀 Getting Started

### 1️⃣ Clone the repository

    git clone https://github.com/calvopelado2989/Coffee-App.git
    cd Coffee-App

### 2️⃣ Open in your IDE (recommended)

1. Open **IntelliJ IDEA**, **VS Code**, **Eclipse**, or your preferred IDE.
2. Open the `Coffee-App` folder as a project.
3. Inside the `Coffe app` folder, locate the class that contains:

       public static void main(String[] args)

4. Run that class from the IDE (Run ▶).

---

### 3️⃣ Run from the terminal (optional)

From inside the `Coffe app` directory:

    cd "Coffe app"
    javac *.java
    java Main

If your main class is called differently (for example, `CoffeeApp`), run:

    java CoffeeApp

---

## 🔍 How It Works

At a high level, the application:

1. Prints a **coffee menu** with 3 flavors.
2. Asks the user to **select one option** (usually 1–3).
3. Optionally creates a `Coffee` object (depending on your implementation) representing:
   - Name / flavor
   - Description
4. Shows a **confirmation** of the user’s choice.
5. Ends the program or could ask if the user wants to order again (if you add that logic).

This is a perfect playground to practice:

- `Scanner` for input  
- `System.out.println` for output  
- `if / else` or `switch` for menu choices  
- Classes and objects (for example, a `Coffee` class)

---

## 🧠 Learning Goals

This project is great for practicing:

- Basic **Java syntax**
- Understanding the **`main` method** and program entry point
- Console I/O with **`Scanner`**
- Conditionals: `if`, `else if`, `switch`
- Loops (if you add “order again” logic)
- Simple **OOP design** (e.g., a `Coffee` class)

---

## 🧩 Ideas for Future Improvements

Some ideas if you want to expand the project:

- **Prices & totals**  
  Add a price per coffee and calculate the order total.

- **Multiple items**  
  Let the user order more than one coffee before checkout.

- **Sizes & extras**  
  Size (S / M / L), extra shots, syrups, milk types, etc.

- **Input validation**  
  Handle invalid options (e.g., user types `10` or letters).

- **Localization**  
  Add support for both **English** and **Spanish** interface texts.

- **Unit tests**  
  Use **JUnit** to test your methods and business logic.

---

## 📄 License

This project is intended for **learning and educational purposes**.  
You are free to modify, improve, and reuse the code as you like.

---

Made with ☕ and Java.
