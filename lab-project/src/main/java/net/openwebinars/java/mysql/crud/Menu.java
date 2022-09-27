package net.openwebinars.java.mysql.crud;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class Menu {

    private KeyboardReader reader;

    public Menu() {
        reader = new KeyboardReader();
    }

    public void init() {

        int opcion;

        do {
            menu();
            opcion = reader.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 0:
                    System.out.println("\nSaliendo del programa...\n");
                    break;
                default:
                    System.err.println("\nEl número introducido no se corresponde con una operación válida\n\n");
            }



        } while (opcion != 0);



    }

    public void menu() {

        System.out.println("SISTEMA DE GESTIÓN DE EMPLEADOS");
        System.out.println("===============================\n");
        System.out.println("\n-> Introduzca una opción de entre las siguientes\n");
        System.out.println("0: Salir");
        System.out.println("1: Listar todos los empleados");
        System.out.println("2: Listar un empleado por su ID");
        System.out.println("3: Insertar un nuevo empleado");
        System.out.println("4: Actualizar un empleado");
        System.out.println("5: Eliminar un empleado");
        System.out.print("\nOpción: ");
    }


    static class KeyboardReader {

        BufferedReader br;
        StringTokenizer st;

        public KeyboardReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in)
            );
        }

        String next() {

            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException ex) {
                    System.err.println("Error leyendo del teclado");
                    ex.printStackTrace();
                }
            }
            return st.nextToken();

        }

        int nextInt() { return Integer.parseInt(next()); }

        double nextDouble() { return Double.parseDouble(next()); }

        LocalDate nextLocalDate() {
            return LocalDate.parse(next(),
                    DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }

        String nextLine() {

            String str = "";
            try {
                if (st.hasMoreElements())
                    str = st.nextToken("\n");
                else
                    str = br.readLine();
            } catch (IOException ex) {
                System.err.println("Error leyendo del teclado");
                ex.printStackTrace();
            }
            return str;
        }

    }


}
