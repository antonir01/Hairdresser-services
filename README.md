# Salon Management System

A simple console-based Java application to manage a hair salon. It supports **customer reservations**, **employee management**, and **stock management**.

---

## Features

### Customer
- Sign up and log in.
- Make a reservation for services:
  - Cutting
  - Styling
  - Coloring
  - Washing and Conditioning
- View their own reservations.
- Choose a payment method: CASH, PAYPAL, or TRANSFER.

### Employee
- Log in with a PIN.
- View all reservations.
- Manage stock:
  - View current stock items.
  - Add new stock items (type and price).

### Admin
- Create employee accounts.
- Access all employee functionalities.
- Manage the salon more broadly.

---

## Admin Account

The system includes a default **root admin account** created automatically:

- **Full Name:** `root`  
- **Phone Number:** `111 111 111`  
- **PIN:** `1111`  
- **Position:** `admin`

Use this account to log in and create additional employee accounts.

---

## Installation

1. Clone the repository or download the source files.
2. Compile all Java files:

```bash
javac *.java
