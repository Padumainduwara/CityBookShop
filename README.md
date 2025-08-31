# City Book Shop Management System

This is a desktop application for managing a bookshop, built using Java Swing. It provides different interfaces for managers and cashiers, allowing them to manage books, users, and sales.

## Features

* **User Authentication:** Secure login for both managers and cashiers.
* **Role-Based Access:** Different dashboards and functionalities for managers and cashiers.
* **Book Management:**
    * Add new books with details like Book ID, Name, Category, Author, and Price.
    * View a list of all available books.
    * Search for specific books by their ID.
* **User Management (Manager only):**
    * Create new user accounts for managers and cashiers.
    * View a list of all registered users (managers and cashiers).

## Technologies Used

* **Java:** The core programming language used for the application.
* **Java Swing:** For creating the graphical user interface (GUI).
* **File System:** Used for storing and retrieving data for books, managers, and cashiers.

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

Make sure you have a Java Development Kit (JDK) installed on your machine.

### Installation

1.  **Clone the repo**
    ```sh
    git clone [https://github.com/your_username/CityBookShop.git](https://github.com/your_username/CityBookShop.git)
    ```
2.  **Open the project** in your favorite Java IDE (like NetBeans, Eclipse, or IntelliJ IDEA).
3.  **Compile the project** to build the necessary class files.

## Usage

1.  Run the `WelcomeForm.java` file to start the application.
2.  From the main interface, you can choose to log in as a Manager or a Cashier.
3.  **Manager:**
    * Login with your manager credentials.
    * You will be directed to the manager's dashboard, where you can:
        * Add new books to the inventory.
        * View all books.
        * Search for books.
        * View all users.
        * Create new user accounts.
4.  **Cashier:**
    * Login with your cashier credentials.
    * You will be directed to the cashier's dashboard, where you can:
        * View all books.
        * Search for books.

## Project Structure
