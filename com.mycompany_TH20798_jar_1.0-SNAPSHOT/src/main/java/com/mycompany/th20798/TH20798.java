package com.mycompany.th20798;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TH20798 {

    public static void main(String[] args) {
        // Δημιουργία Store και προϊόντων
        Store store = new Store();

        // Παράδειγμα χρήσης των overloading μεθόδων
        store.addProduct("Τυρί", 2, 5.99);
        store.addProduct(new Product("Γάλα", 4, 1.99));

        // Αποθήκευση προϊόντων σε CSV
        List<Product> productList = store.getProducts();
        Product.saveProductsToCSV(productList, "products.csv");

        // GUI demo για login
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passText = new JPasswordField();
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String pass = new String(passText.getPassword());
                if (user.equals("admin") && pass.equals("admin")) {
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Login failed!");
                }
            }
        });

        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(new JLabel()); // empty cell
        frame.add(loginButton);

        frame.setVisible(true);
    }
}