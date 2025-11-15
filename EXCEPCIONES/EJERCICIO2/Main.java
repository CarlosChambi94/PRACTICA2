package EXCEPCIONES.EJERCICIO2;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Ingrese el primer número: ");
                int n1 = Calculadora.convertirAEntero(sc.nextLine());

                System.out.print("Ingrese el segundo número: ");
                int n2 = Calculadora.convertirAEntero(sc.nextLine());

                System.out.println("\n--- Operaciones ---");
                System.out.println("Suma: " + Calculadora.sumar(n1, n2));
                System.out.println("Resta: " + Calculadora.restar(n1, n2));
                System.out.println("Multiplicación: " + Calculadora.multiplicar(n1, n2));

                try {
                    System.out.println("División: " + Calculadora.dividir(n1, n2));
                } catch (ArithmeticException e) {
                    System.out.println("Error en la división: " + e.getMessage());
                }

            } catch (NumeroInvalidoException e) {
                System.out.println("Error de entrada: " + e.getMessage());
            }
        }
    }

