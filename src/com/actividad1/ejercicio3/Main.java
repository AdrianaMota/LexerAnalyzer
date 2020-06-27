package com.actividad1.ejercicio3;

import jflex.exceptions.SilentExit;

import javax.swing.*;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        try {

            String inputDialog = JOptionPane.showInputDialog("Ejercicio 3. Introduzca indicador:");
            StringReader result = new StringReader(inputDialog);

            Lexer lexer = new Lexer(result);

            JOptionPane.showMessageDialog(null, "Expresión Regular= " + lexer.yylex());
        } catch (Exception e) {
            System.out.println("Error lexico!");
        }
    }

    public static void generateAnalyzer(String[] path) {
        try {
            jflex.Main.generate(path);
        } catch (SilentExit err) {
            System.out.println("Ha ocurrido un error en la creación del lexer!");
        }
    }
}
