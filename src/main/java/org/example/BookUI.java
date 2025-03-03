package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

class BookUI {
    private final BookService bookService = new BookService();
    private final JFrame frame = new JFrame("Book Tracking System");
    private final DefaultTableModel tableModel = new DefaultTableModel(new String[]{"Title", "Author", "Category", "Year"}, 0);
    private final JTable table = new JTable(tableModel);
    private final JComboBox<String> categoryFilter = new JComboBox<>();

    public BookUI() {
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        JButton addButton = new JButton("Add Book");
        JButton editButton = new JButton("Edit Book");
        JButton deleteButton = new JButton("Delete Book");
        JButton filterButton = new JButton("Filter by Category");

        panel.add(new JLabel("Category:"));
        panel.add(categoryFilter);
        panel.add(filterButton);
        panel.add(addButton);
        panel.add(editButton);
        panel.add(deleteButton);

        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> openBookForm(null, -1));
        editButton.addActionListener(e -> editSelectedBook());
        deleteButton.addActionListener(e -> deleteSelectedBook());
        filterButton.addActionListener(e -> filterBooksByCategory());

        refreshCategoryFilter();
        frame.setVisible(true);
    }

    private void openBookForm(Book book, int index) {
        JTextField titleField = new JTextField(book != null ? book.getTitle() : "");
        JTextField authorField = new JTextField(book != null ? book.getAuthor() : "");
        JTextField categoryField = new JTextField(book != null ? book.getCategory() : "");
        JTextField yearField = new JTextField(book != null ? String.valueOf(book.getPublicationYear()) : "");

        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(new JLabel("Title:"));
        panel.add(titleField);
        panel.add(new JLabel("Author:"));
        panel.add(authorField);
        panel.add(new JLabel("Category:"));
        panel.add(categoryField);
        panel.add(new JLabel("Year:"));
        panel.add(yearField);

        int result = JOptionPane.showConfirmDialog(frame, panel, book == null ? "Add Book" : "Edit Book", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                int year = Integer.parseInt(yearField.getText());
                if (year < 1500 || year > java.time.Year.now().getValue()) {
                    JOptionPane.showMessageDialog(frame, "Invalid year! Must be between 1500 and current year.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (titleField.getText().isEmpty() || authorField.getText().isEmpty() || categoryField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields are mandatory!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                Book newBook = new Book(titleField.getText(), authorField.getText(), categoryField.getText(), year);
                if (book == null) {
                    bookService.addBook(newBook);
                } else {
                    bookService.updateBook(index, newBook);
                }
                refreshTable();
                refreshCategoryFilter();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid year format!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void editSelectedBook() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            Book book = bookService.getBooks().get(selectedRow);
            openBookForm(book, selectedRow);
        }
    }

    private void deleteSelectedBook() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            bookService.deleteBook(selectedRow);
            refreshTable();
            refreshCategoryFilter();
        }
    }

    private void refreshTable() {
        tableModel.setRowCount(0);
        for (Book book : bookService.getBooks()) {
            tableModel.addRow(new Object[]{book.getTitle(), book.getAuthor(), book.getCategory(), book.getPublicationYear()});
        }
    }

    private void refreshCategoryFilter() {
        categoryFilter.removeAllItems();
        categoryFilter.addItem("All");
        for (String category : bookService.getCategorySummary().keySet()) {
            categoryFilter.addItem(category);
        }
    }

    private void filterBooksByCategory() {
        String selectedCategory = (String) categoryFilter.getSelectedItem();
        tableModel.setRowCount(0);
        List<Book> filteredBooks = bookService.getBooks();
        if (!"All".equals(selectedCategory)) {
            filteredBooks = filteredBooks.stream()
                    .filter(book -> book.getCategory().equals(selectedCategory))
                    .collect(Collectors.toList());
        }
        for (Book book : filteredBooks) {
            tableModel.addRow(new Object[]{book.getTitle(), book.getAuthor(), book.getCategory(), book.getPublicationYear()});
        }
    }
}
