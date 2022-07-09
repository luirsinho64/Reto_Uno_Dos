package com.mycompany.calculadorabasica;

import javax.swing.JOptionPane;

/**
 *
 * @author Luirhsiño Sánchez Surincho
 */
public class CalculadoraBasica {

    public static void main(String[] args) {

        ClsCalculator calc = new ClsCalculator();
        String menuIni = calc.menuInicial(), menuCal = calc.menuCalculadora();
        int opcion = 0, control = 2, opcion2 = 0, control2 = 7;
        double resultado = 0;

        do {
            String seleccion = JOptionPane.showInputDialog(null, menuIni, "Inicio", JOptionPane.INFORMATION_MESSAGE);

            if (calc.esNumero(seleccion)) {
                opcion = Integer.parseInt(seleccion);
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un dato numérico.", "ERROR", JOptionPane.ERROR_MESSAGE);
                seleccion = "";
            }

            if (opcion < 1 || opcion > 2) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un numéro del menú.", "ERROR", JOptionPane.ERROR_MESSAGE);
                seleccion = "";
            }

            if (opcion == 1) {
                do {
                    String selec = JOptionPane.showInputDialog(null, menuCal, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
                    
                    if (calc.esNumero(selec)) {
                        opcion2 = Integer.parseInt(selec);
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un dato numérico.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        selec = "";
                    }

                    if (opcion2 < 1 || opcion2 > 7) {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un numéro del menú.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        selec = "";
                    }                    
                    else {
                        resultado = calc.Calculadora(opcion2);
                        JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                        selec = JOptionPane.showInputDialog(null, menuCal, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
                    }
                } while (control2 != opcion2);
            }
        } while (control != opcion);
    }
}
