package com.mycompany.calculadorabasica;

import javax.swing.JOptionPane;

/**
 *
 * @author Luirhsiño Sanchez Surincho
 */
public class ClsCalculator {

    public double numeroUno, numeroDos, resultado;

    ClsCalculator() {
    }

    public ClsCalculator(double numeroUno, double numeroDos, double resultado) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
        this.resultado = resultado;
    }

    public boolean esNumero(String num) {
        if (num == null) {
            return false;
        }
        try {
            double dig = Double.parseDouble(num);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    
    public double recorteDecimal(double num){
        num = Math.round(num * 100);
        num = num / 100;
        return num;
    }
    
    public String menuInicial() {
        String menu = """
                          Seleccione una opción:

                          1. Realizar una operación.
                          2. Salir.
                          """;
        return menu;
    }

    public String menuCalculadora() {
        String menu = """
                          Seleccione una operación:

                          1. Suma.
                          2. Resta.
                          3. Multiplicación.
                          4. División.
                          5. Potencia.
                          6. Raiz cuadrada.
                          7. Salir.
                          """;
        return menu;
    }

    public double Calculadora(int sel) {
        
        String numUno, numDos;
        Boolean checkUno, checkDos;
        
        switch (sel) {
            case 1:
                numUno = JOptionPane.showInputDialog(null, "Digite el primer número.", "Primer número", JOptionPane.INFORMATION_MESSAGE);
                numDos = JOptionPane.showInputDialog(null, "Digite el segundo número.", "Segundo número", JOptionPane.INFORMATION_MESSAGE);
                checkUno = esNumero(numUno);
                checkDos = esNumero(numDos);

                if (checkUno == true && checkDos == true) {
                    numeroUno = Double.parseDouble(numUno);
                    numeroDos = Double.parseDouble(numDos);
                    resultado = numeroUno + numeroDos;
                    return recorteDecimal(resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un numéro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    numeroUno = 0;
                    numeroDos = 0;
                    break;
                }
            case 2:
                numUno = JOptionPane.showInputDialog(null, "Digite el primer número.", "Primer número", JOptionPane.INFORMATION_MESSAGE);
                numDos = JOptionPane.showInputDialog(null, "Digite el segundo número.", "Segundo número", JOptionPane.INFORMATION_MESSAGE);
                checkUno = esNumero(numUno);
                checkDos = esNumero(numDos);

                if (checkUno == true && checkDos == true) {
                    numeroUno = Double.parseDouble(numUno);
                    numeroDos = Double.parseDouble(numDos);
                    resultado = numeroUno - numeroDos;
                    return recorteDecimal(resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un numéro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    numeroUno = 0;
                    numeroDos = 0;
                    break;
                }
            case 3:
                numUno = JOptionPane.showInputDialog(null, "Digite el primer número.", "Primer número", JOptionPane.INFORMATION_MESSAGE);
                numDos = JOptionPane.showInputDialog(null, "Digite el segundo número.", "Segundo número", JOptionPane.INFORMATION_MESSAGE);
                checkUno = esNumero(numUno);
                checkDos = esNumero(numDos);

                if (checkUno == true && checkDos == true) {
                    numeroUno = Double.parseDouble(numUno);
                    numeroDos = Double.parseDouble(numDos);
                    resultado = numeroUno * numeroDos;
                    return recorteDecimal(resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un numéro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    numeroUno = 0;
                    numeroDos = 0;
                    break;
                }
            case 4:
                numUno = JOptionPane.showInputDialog(null, "Digite el primer número.", "Primer número", JOptionPane.INFORMATION_MESSAGE);
                numDos = JOptionPane.showInputDialog(null, "Digite el número divisor.", "Segundo número", JOptionPane.INFORMATION_MESSAGE);
                checkUno = esNumero(numUno);
                checkDos = esNumero(numDos);

                if (checkUno == true && checkDos == true) {
                    numeroUno = Double.parseDouble(numUno);
                    numeroDos = Double.parseDouble(numDos);
                    
                    if (numeroDos == 0) {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un numéro distinto a 0.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        numeroDos = 0;
                    } else {                        
                        resultado = numeroUno / numeroDos;
                        return recorteDecimal(resultado);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un numéro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    numeroUno = 0;
                    numeroDos = 0;
                    break;
                }
            case 5:
                numUno = JOptionPane.showInputDialog(null, "Digite el primer número.", "Primer número", JOptionPane.INFORMATION_MESSAGE);
                numDos = JOptionPane.showInputDialog(null, "Digite el segundo número.", "Segundo número", JOptionPane.INFORMATION_MESSAGE);
                checkUno = esNumero(numUno);
                checkDos = esNumero(numDos);

                if (checkUno == true && checkDos == true) {
                    numeroUno = Double.parseDouble(numUno);
                    numeroDos = Double.parseDouble(numDos);
                    resultado = Math.pow(numeroUno, numeroDos);
                return recorteDecimal(resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un numéro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    numeroUno = 0;
                    numeroDos = 0;
                    break;
                }                
            case 6:
                numUno = JOptionPane.showInputDialog(null, "Digite el primer número.", "Primer número", JOptionPane.INFORMATION_MESSAGE);
                checkUno = esNumero(numUno);
                
                if (checkUno == true) {
                    numeroUno = Double.parseDouble(numUno);
                    resultado = Math.sqrt(numeroUno);
                    return recorteDecimal(resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un numéro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    numeroUno = 0;
                    break;
                }
            case 7:
                return 0.0;
        }
        return 0.0;
    }
}
