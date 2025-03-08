/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ru.mtuci.thermalcomparator;
import javax.swing.JOptionPane;

/**
 *
 * @author wakoo
 */
public class ThermalComparator {

    public static void main(String[] args) {
        String input1;
        int ugol;
        input1 = JOptionPane.showInputDialog(null, "Введите температуру");
        int temp = Integer.parseInt(input1);
        if (temp == 10 || temp < 30) {
            if (temp == 10) {
                ugol = -72;
            } else {
                ugol = -36;
            };
            JOptionPane.showMessageDialog(null, "Вода холодная, большой влево на " + ugol + " градусов.");
        } else if (temp == 20 || temp < 30) {
            if (temp == 20) {
                ugol = -54;
            } else {
                ugol = -27;
            };
            JOptionPane.showMessageDialog(null, "Вода прохладная, небольшой влево на " + ugol + " градусов.");
        } else {
            JOptionPane.showMessageDialog(null, "Вода тёплая: нуль");
        };
    }
}
