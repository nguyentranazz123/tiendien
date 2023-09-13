/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import javax.swing.UIManager;

import view.cusView;

public class Tester {
	public static void main(String[] args) {
            try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new cusView();
        } catch (Exception e) {
            e.printStackTrace();
        }
		 
	}
}
