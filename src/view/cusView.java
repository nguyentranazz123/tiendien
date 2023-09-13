/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.cusManager;
import model.customer;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.ManagerController;

import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputFilter.Status;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class cusView extends JFrame {

    public JPanel contentPane;
    public cusManager model;
    public JTextField textField_GuestID;
    private JTable table;
    public JTextField textFieldaddID;
    public JTextField textFieldAddName;
    public JTextField textFieldAddAddress;
    public JTextField textFieldAddPhone;
    public JTextField textFieldAddNewNumber;
    public JTextField textFieldAddOldNumber;
    public ButtonGroup btn_sex;
    public ButtonGroup btn_type;
    public JRadioButton rdbtnFemale;
    public JRadioButton rdbtnMale;
    public JRadioButton rdbtnFamily;
    public JRadioButton rdbtnUnit;
    public JRadioButton rdbtnVip;
    private boolean cusSex;
    private boolean cusType;
    private boolean cusType2;
    private boolean cusType3;
    private int bill;
    private JTextField textFieldBill;
    public JLabel Jpnstatus;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    cusView frame = new cusView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public cusView() {
        this.model = new cusManager();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1054, 650);

        ActionListener ac = new ManagerController(this);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnNewMenu = new JMenu("File");
        mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("Open");
        mntmNewMenuItem.addActionListener(ac);
        mntmNewMenuItem.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        mnNewMenu.add(mntmNewMenuItem);

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("SaveFile");
        mntmNewMenuItem_1.addActionListener(ac);
        mntmNewMenuItem_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        mnNewMenu.add(mntmNewMenuItem_1);
        contentPane = new JPanel();
        contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblGuestId = new JLabel("Guest ID");
        lblGuestId.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGuestId.setBounds(573, 9, 66, 55);
        contentPane.add(lblGuestId);

        textField_GuestID = new JTextField();
        textField_GuestID.setColumns(10);
        textField_GuestID.setBounds(649, 22, 195, 32);
        contentPane.add(textField_GuestID);

        JButton btnSearch2 = new JButton("Search");
        btnSearch2.addActionListener(ac);
        btnSearch2.setBackground(new Color(143, 188, 143));
        btnSearch2.setForeground(SystemColor.desktop);
        btnSearch2.setBounds(864, 20, 89, 37);
        contentPane.add(btnSearch2);

        table = new JTable();
        table.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        table.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Guest ID", "Name", "Address", "Phone Number", "Sex", "Guest Type", "Old number", "New number"
                }
        ));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        scrollPane.setBounds(7, 88, 1021, 206);
        contentPane.add(scrollPane);
        table.setRowHeight(30);

        textFieldaddID = new JTextField();
        textFieldaddID.setColumns(10);
        textFieldaddID.setBounds(106, 321, 146, 27);
        contentPane.add(textFieldaddID);

        JLabel lbAddId = new JLabel("Guest ID");
        lbAddId.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbAddId.setBounds(17, 314, 59, 37);
        contentPane.add(lbAddId);

        textFieldAddName = new JTextField();
        textFieldAddName.setColumns(10);
        textFieldAddName.setBounds(106, 365, 146, 27);
        contentPane.add(textFieldAddName);

        JLabel lbaddName = new JLabel("Guest Name");
        lbaddName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbaddName.setBounds(17, 358, 82, 37);
        contentPane.add(lbaddName);

        JLabel lbaddAddress = new JLabel("Address");
        lbaddAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbaddAddress.setBounds(283, 311, 59, 37);
        contentPane.add(lbaddAddress);

        JLabel lbaddPhone = new JLabel("Phone");
        lbaddPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbaddPhone.setBounds(283, 358, 59, 37);
        contentPane.add(lbaddPhone);

        JLabel lbaddSex = new JLabel("Sex");
        lbaddSex.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbaddSex.setBounds(526, 314, 41, 37);
        contentPane.add(lbaddSex);

        JLabel lbaddType = new JLabel("Guest Type");
        lbaddType.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbaddType.setBounds(526, 355, 82, 37);
        contentPane.add(lbaddType);

        textFieldAddAddress = new JTextField();
        textFieldAddAddress.setColumns(10);
        textFieldAddAddress.setBounds(344, 321, 146, 27);
        contentPane.add(textFieldAddAddress);

        textFieldAddPhone = new JTextField();
        textFieldAddPhone.setColumns(10);
        textFieldAddPhone.setBounds(344, 365, 146, 27);
        contentPane.add(textFieldAddPhone);

        textFieldAddNewNumber = new JTextField();
        textFieldAddNewNumber.setColumns(10);
        textFieldAddNewNumber.setBounds(874, 365, 146, 27);
        contentPane.add(textFieldAddNewNumber);

        JLabel lbaddOldNumber = new JLabel("Old number");
        lbaddOldNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbaddOldNumber.setBounds(786, 314, 82, 37);
        contentPane.add(lbaddOldNumber);

        textFieldAddOldNumber = new JTextField();
        textFieldAddOldNumber.setColumns(10);
        textFieldAddOldNumber.setBounds(874, 321, 146, 27);
        contentPane.add(textFieldAddOldNumber);

        JLabel lbaddNewNumber = new JLabel("New number");
        lbaddNewNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lbaddNewNumber.setBounds(786, 355, 82, 37);
        contentPane.add(lbaddNewNumber);

        rdbtnMale = new JRadioButton("Male");
        rdbtnMale.setBounds(614, 321, 59, 27);
        contentPane.add(rdbtnMale);

        rdbtnFemale = new JRadioButton("Female");
        rdbtnFemale.setBounds(675, 322, 75, 25);
        contentPane.add(rdbtnFemale);

        btn_sex = new ButtonGroup();
        btn_sex.add(rdbtnMale);
        btn_sex.add(rdbtnFemale);

        JButton btnInsert = new JButton("Save");
        btnInsert.setBackground(new Color(143, 188, 143));
        btnInsert.setForeground(SystemColor.desktop);
        btnInsert.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });
        btnInsert.addActionListener(ac);
        btnInsert.setBounds(396, 500, 104, 55);
        contentPane.add(btnInsert);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setBackground(new Color(143, 188, 143));
        btnDelete.setForeground(SystemColor.desktop);
        btnDelete.addActionListener(ac);
        btnDelete.setBounds(150, 500, 102, 55);
        contentPane.add(btnDelete);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.setBackground(new Color(143, 188, 143));
        btnUpdate.setForeground(SystemColor.desktop);
        btnUpdate.addActionListener(ac);
        btnUpdate.setBounds(279, 500, 89, 55);
        contentPane.add(btnUpdate);

        JButton btnEnter = new JButton("Insert");
        btnEnter.setBackground(new Color(143, 188, 143));
        btnEnter.setForeground(SystemColor.desktop);
        btnEnter.addActionListener(ac);
        btnEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnEnter.setBounds(30, 500, 89, 55);
        contentPane.add(btnEnter);

        JButton btnCancel = new JButton("Remove");
        btnCancel.setBackground(new Color(143, 188, 143));
        btnCancel.setForeground(SystemColor.desktop);
        btnCancel.addActionListener(ac);
        btnCancel.setBounds(527, 500, 89, 55);
        contentPane.add(btnCancel);

        JSeparator separator = new JSeparator();
        separator.setBounds(7, 473, 1018, 2);
        contentPane.add(separator);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(7, 75, 1018, 2);
        contentPane.add(separator_1);

        JButton btnCheckBill = new JButton("Check Bill");
        btnCheckBill.setBackground(SystemColor.activeCaption);
        btnCheckBill.addActionListener(ac);
        btnCheckBill.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnCheckBill.setBounds(686, 488, 146, 86);
        contentPane.add(btnCheckBill);

        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(10, 426, 1018, 2);
        contentPane.add(separator_2);

        JLabel lblNewLabel = new JLabel("Money Total");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(843, 486, 178, 28);
        contentPane.add(lblNewLabel);

        rdbtnFamily = new JRadioButton("Family");
        rdbtnFamily.setFont(new Font("Tahoma", Font.PLAIN, 12));
        rdbtnFamily.setBounds(614, 358, 59, 32);
        contentPane.add(rdbtnFamily);

        rdbtnUnit = new JRadioButton("Business");
        rdbtnUnit.setFont(new Font("Tahoma", Font.PLAIN, 12));
        rdbtnUnit.setBounds(614, 391, 110, 27);
        contentPane.add(rdbtnUnit);

        rdbtnVip = new JRadioButton("Vip");
        rdbtnVip.setBounds(675, 365, 66, 23);
        contentPane.add(rdbtnVip);

        btn_type = new ButtonGroup();
        btn_type.add(rdbtnFamily);
        btn_type.add(rdbtnUnit);
        btn_type.add(rdbtnVip);

        textFieldBill = new JTextField();
        textFieldBill.setColumns(10);
        textFieldBill.setBounds(842, 517, 146, 46);
        contentPane.add(textFieldBill);

        Jpnstatus = new JLabel("");
        Jpnstatus.setFont(new Font("Tahoma", Font.BOLD, 14));
        Jpnstatus.setBounds(78, 430, 301, 32);
        contentPane.add(Jpnstatus);

        JLabel lblNewLabel_1 = new JLabel("Status: ");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setBounds(20, 435, 56, 27);
        contentPane.add(lblNewLabel_1);

        JLabel lblElectricManagement = new JLabel("Electric Management");
        lblElectricManagement.setForeground(new Color(0, 0, 0));
        lblElectricManagement.setFont(new Font("Tahoma", Font.BOLD, 23));
        lblElectricManagement.setBounds(161, 9, 397, 55);
        contentPane.add(lblElectricManagement);

        JPanel panel = new JPanel();
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(94, 9, 373, 55);
        contentPane.add(panel);

        this.setVisible(true);
    }

    public void reset() {
        // TODO Auto-generated method stub
        textFieldaddID.setText("");
        textFieldAddAddress.setText("");
        textFieldAddName.setText("");
        textFieldAddPhone.setText("");
        textFieldAddOldNumber.setText("");
        textFieldAddNewNumber.setText("");
        btn_sex.clearSelection();
        btn_type.clearSelection();
        Jpnstatus.setText("");
    }

    public void getcuslist(customer ctm) {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        model_table.addRow(new Object[]{ctm.getCusCode(), ctm.getCusName(),
             ctm.getCusAddress(), ctm.getCusPhone(),
             ctm.getCusSex(), ctm.getCusType(),
             ctm.getNumberFirst(), ctm.getNumberLast()});
    }

    public void addCustomer(customer ctm) {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        if (!this.model.alreadyAnID(ctm)) {
            if (ctm.getNumberFirst() <= ctm.getNumberLast()) {
                this.model.insert(ctm);
                this.getcuslist(ctm);
                this.reset();
            } else {
                JOptionPane.showMessageDialog(this, "New number must be bigger than old number!!");
                textFieldAddOldNumber.setText("");
                textFieldAddNewNumber.setText("");
            }
        } else {
            int choose = JOptionPane.showConfirmDialog(this, "Are you want to update ?");
            if (choose == JOptionPane.YES_OPTION) {
                Jpnstatus.setText("Added!");
                this.model.update(ctm);
                int rowCount = model_table.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    String id = model_table.getValueAt(i, 0) + "";
                    if (id.equals(ctm.getCusCode() + "")) {
                        model_table.setValueAt(ctm.getCusCode() + "", i, 0);
                        model_table.setValueAt(ctm.getCusName() + "", i, 1);
                        model_table.setValueAt(ctm.getCusAddress() + "", i, 2);
                        model_table.setValueAt(ctm.getCusPhone() + "", i, 3);
                        model_table.setValueAt(ctm.getCusSex() + "", i, 4);
                        model_table.setValueAt(ctm.getCusType() + "", i, 5);
                        model_table.setValueAt(ctm.getNumberFirst() + "", i, 6);
                        model_table.setValueAt(ctm.getNumberLast() + "", i, 7);
                        
                        
                    }
                }
            } else {
                textFieldaddID.setText("");
                Jpnstatus.setText("Customer ID already exists!");
            }
        }
    }

    public void actionAdd() {
        int cusCode = Integer.valueOf(this.textFieldaddID.getText());
        String cusName = this.textFieldAddName.getText();
        String cusAddress = this.textFieldAddAddress.getText();
        int cusPhone = Integer.valueOf(this.textFieldAddPhone.getText());
        int numberFirst = Integer.valueOf(this.textFieldAddOldNumber.getText());
        int numberLast = Integer.valueOf(this.textFieldAddNewNumber.getText());
        
        String cusSex = "Male";
        if (this.rdbtnMale.isSelected()) {
            cusSex = "Male";
        } else if (this.rdbtnFemale.isSelected()) {
            cusSex = "Female";
        }

        String cusType = "Family";
        if (this.rdbtnFamily.isSelected()) {
            cusType = "Family";
        } else if (this.rdbtnUnit.isSelected()) {
            cusType = "Business";
        } else if (this.rdbtnVip.isSelected()) {
            cusType = "Vip";
        }
        if(numberFirst > numberLast){
            JOptionPane.showMessageDialog(this, "New number must be bigger than old number!!");
                textFieldAddOldNumber.setText("");
                textFieldAddNewNumber.setText("");
        }
        
        else{
        customer ctm = new customer(cusCode, cusName, cusAddress, cusSex, cusPhone, cusType, numberFirst, numberLast);
        this.addCustomer(ctm);
    }
    }

    public void updateCustomer(customer ctm) {
        // TODO Auto-generated method stub
        this.model.update(ctm);
    }

    public customer getCus() {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int i_row = table.getSelectedRow();
        int cusCode = Integer.valueOf(model_table.getValueAt(i_row, 0) + "");
        String cusName = model_table.getValueAt(i_row, 1) + "";
        String cusAddress = model_table.getValueAt(i_row, 2) + "";
        int cusPhone = Integer.valueOf(model_table.getValueAt(i_row, 3) + "");
        String textSex = model_table.getValueAt(i_row, 4) + "";

        int numberFirst = Integer.valueOf(model_table.getValueAt(i_row, 6) + "");
        int numberLast = Integer.valueOf(model_table.getValueAt(i_row, 7) + "");

        customer ctm = new customer(cusCode, cusName, cusAddress, cusAddress, cusPhone, textSex, numberFirst, numberLast);
        return ctm;
    }

    public void showInfo() {
        customer ctm = getCus();
        // TODO Auto-generated method stub
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int i_row = table.getSelectedRow();

        this.textFieldaddID.setText(ctm.getCusCode() + "");
        this.textFieldAddName.setText(ctm.getCusName());
        this.textFieldAddAddress.setText(ctm.getCusAddress());
        this.textFieldAddPhone.setText(ctm.getCusPhone()+ "");

        String textSex = model_table.getValueAt(i_row, 4) + "";
        cusSex = textSex.equals("Male");
        if (cusSex) {
            rdbtnMale.setSelected(true);
        } else {
            rdbtnFemale.setSelected(true);
        }

        String textType = model_table.getValueAt(i_row, 5) + "";
        String textType2 = model_table.getValueAt(i_row, 5) + "";
        String textType3 = model_table.getValueAt(i_row, 5) + "";
        cusType = textType.equals("Family");
        cusType2 = textType2.equals("Vip");
        cusType3 = textType3.equals("Business");
        if (cusType) {
            rdbtnFamily.setSelected(true);
        } else if (cusType2) {
            rdbtnVip.setSelected(true);
        } else if (cusType3) {
            rdbtnUnit.setSelected(true);
        }
        
        this.textFieldAddOldNumber.setText(ctm.getNumberFirst() + "");
        this.textFieldAddNewNumber.setText(ctm.getNumberLast() + "");
    }
    

    public void deleteRow() {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int i_row = table.getSelectedRow();
        model_table.removeRow(i_row);
    }

    public void removeRow() {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int rowCount = model_table.getRowCount();
        customer ctm = getCus();

        for (int i = 0; i < rowCount; i++) {
            String id = model_table.getValueAt(i, 0) + "";
            if (id.equals(ctm.getCusCode() + "")) {
                model_table.setValueAt("", i, 0);
                model_table.setValueAt("", i, 1);
                model_table.setValueAt("", i, 2);
                model_table.setValueAt("", i, 3);
                model_table.setValueAt("", i, 4);
                model_table.setValueAt("", i, 5);
                model_table.setValueAt("", i, 6);
                model_table.setValueAt("", i, 7);
                this.model.delete(ctm);
            }
        }

    }

    public void deleteCustomer() {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int choose = JOptionPane.showConfirmDialog(this, "Are you sure to delete this customer?");
        if (choose == JOptionPane.YES_OPTION) {
            removeRow();
            deleteRow();

        }
        textFieldaddID.setText("");
        textFieldAddAddress.setText("");
        textFieldAddName.setText("");
        textFieldAddPhone.setText("");
        textFieldAddOldNumber.setText("");
        textFieldAddNewNumber.setText("");
        textFieldBill.setText("");
        btn_sex.clearSelection();
        btn_type.clearSelection();
    }

    public void checkBill() {
        // TODO Auto-generated method stub
        customer ctm = getCus();
        bill = (ctm.getNumberLast() - ctm.getNumberFirst()) * 500;
        this.textFieldBill.setText(bill + " USD");
    }

    public void cusSearch() {
        int location = -1;
        String cusID = this.textField_GuestID.getText();
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        int rowCount = model_table.getRowCount();

        if (cusID.length() > 0) {
            for (int i = 0; i < rowCount; i++) {
                String id = model_table.getValueAt(i, 0) + "";
                if (cusID.equals(id)) {
                    location = i;
                    break;
                }
            }
            if (location >= 0) {
                table.setRowSelectionInterval(location, location);
                showInfo();
            } else {
                JOptionPane.showMessageDialog(this, "Not found id: " + cusID + " !!");
            }

        }
    }

    public void addCUs(customer ctm) {
        DefaultTableModel model_table = (DefaultTableModel) table.getModel();
        model_table.addRow(new Object[]{ctm.getCusCode(), ctm.getCusName(),
             ctm.getCusAddress(), ctm.getCusPhone(),
             ctm.getCusSex(), ctm.getCusType(),
             ctm.getNumberFirst(), ctm.getNumberLast()});
    }

    public void openFile(String path) {
        File file = new File(path);
        try {
            this.model.setTenFile(path);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void thucHienOpenFile() {
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            openFile(file.getAbsolutePath());
        }
    }

    public void saveFile(String path) {
        File file = new File(path);
        try {
            this.model.setTenFile(path);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < table.getRowCount(); i++) {//rows
                for (int j = 0; j < table.getColumnCount(); j++) {//columns
                    bw.write(table.getValueAt(i, j).toString() + " ");
                }
                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void thucHienSaveFile() {
        if (this.model.getTenFile().length() > 0) {
            saveFile(this.model.getTenFile());
        } else {
            JFileChooser fc = new JFileChooser();
            int returnVal = fc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                saveFile(file.getAbsolutePath());
            }
        }
    }
}
