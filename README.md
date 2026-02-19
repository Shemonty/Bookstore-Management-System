## Project Overview

The Bookshop Management System is a desktop application developed using Java Swing to automate and streamline bookshop operations. It is designed to improve efficiency in managing inventory, sales transactions, and customer data through a structured and user-friendly graphical interface.
The system supports multiple user roles, including administrators and customers, and provides tools for maintaining accurate records and generating purchase bills.

## Features
Admin Features
Add new books to the inventory
Update book information such as name, author, quantity, and price
Delete unavailable or restricted books
View customer purchase history
Customer Features
View available books
Purchase multiple books in a single transaction
View personal purchase history
Generate and print bills in PDF format

## Technologies Used
Java Swing – Graphical User Interface
JDBC (Java Database Connectivity) – Database integration
MySQL – Database management system
NetBeans IDE – Development environment
Java Print API – Bill printing and PDF generation

## Project Structure
Bookshop-Management-System/
│
├── src/                 # Java source files
├── database/            # MySQL scripts
├── resources/           # Images and assets
├── lib/                 # External libraries
└── README.md            # Documentation

## Installation and Setup
Prerequisites
Java JDK 8 or later
MySQL Server
NetBeans IDE (recommended)
MySQL JDBC Driver
Setup Steps
Clone the repository:
git clone https://github.com/your-username/bookshop-management-system.git
Open the project in NetBeans.
Create a database in MySQL and import the provided SQL file.
Configure the database connection by editing the relevant connection file:
Update database URL, username, and password.
Build and run the project.

## Usage Guide
Admin
Log in using admin credentials
Manage book inventory
Monitor customer purchase records

Customer
Register and log in
Browse available books
Add items to cart
Complete purchase and generate bill


## Future Enhancements
Web-based version
Mobile application support
Advanced reporting system
Online payment integration
Enhanced security and role management
