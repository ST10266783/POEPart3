/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TaskReport extends JFrame {
    private JTable table;
    private JButton exitButton;

    public TaskReport() {
        // Create a new DefaultTableModel to hold the data
        DefaultTableModel model = new DefaultTableModel();

        // Create a table to display the data
        table = new JTable(model);
        table.setFillsViewportHeight(true);

        // Create a button to allow the user to exit the program
        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add the table and button to the frame
        add(table, BorderLayout.CENTER);
        add(exitButton, BorderLayout.SOUTH);

        // Update the data in the table from the Task class
        updateData();
    }

    private void updateData() {
        // Retrieve the data from the Task class
        List<Task> tasks = Task.getAllTasks();

        // Clear the table
        model.clearData();

        // Add the data to the table
        for (Task task : tasks) {
            Object[] row = {task.getDeveloper(), task.getDuration(), task.getName(), task.getStatus()};
            model.addRow(row);
        }
    }

    private void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("All Tasks", 0, 20);
    }

    public static void main(String[] args) {
        // Create a new TaskReport window
        TaskReport window = new TaskReport();

        // Display the window
        window.setVisible(true);
    }