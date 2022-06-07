
        package Paquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ///COSTO///
            double costo = 17.00;

            System.out.println("Aeropuerto CDMX");
            Scanner insertar = new Scanner(System.in);
            System.out.println("¿Cuántas horas utilizaste en el estacionamiento?");

            int horas = insertar.nextInt();
            costo = costo * horas;
            System.out.println("Debes: $" + costo + " Elige una opción para tu forma de pago");


        ///PAGO///
        Scanner menu = new Scanner(System.in);
        double pago = 0;
        int opcion = 0;

        do {
            System.out.println("1) $100");
            System.out.println("2) $50");
            System.out.println("3) $20");
            System.out.println("4) $10");
            System.out.println("5) $5");
            System.out.println("6) $2");
            System.out.println("7) $1");
            System.out.println("8) Salir");
            opcion = menu.nextInt();

            if (opcion == 1) {
                pago = pago + 100;
            } else if (opcion == 2) {
                pago = pago + 50;
            } else if (opcion == 3) {
                pago = pago + 20;
            } else if (opcion == 4) {
                pago = pago + 10;
            } else if (opcion == 5) {
                pago = pago + 5;
            } else if (opcion == 6) {
                pago = pago + 2;
            } else if (opcion == 7) {
                pago = pago + 1;
            } else if (opcion == 8) {
                System.out.println("¡GRACIAS! Vuelva pronto");
                pago = costo;
            }
            if(costo > 999) {
                costo = 999;
                System.out.println("El monto a pagar es de: " + costo);
            }

            System.out.println("Debes: $" + (costo - pago) + "Elige una opción para tu forma de pago");

        } while (pago < costo);

        ///CAMBIO///
        int cambio = (int) (pago-costo);
        int moneda10 = 0;
        int moneda5 = 0;
        int moneda2 = 0;
        int moneda1 = 0;

        if (pago>costo) {
            if(cambio>0) {
                moneda10 = cambio / 10;
                cambio = cambio % 10;
            }
            if (cambio>0) {
                moneda5 = cambio / 5;
                cambio = cambio % 5;
            }
            if (cambio>0) {
                moneda2 = cambio / 2;
                cambio = cambio % 2;
            }
            if (cambio<0) {
                moneda1 = cambio/1;
                cambio = cambio%1;
            }
            else {
                System.out.println(
                        "Cambio: $" + cambio + "\n"
                                + moneda10 + " moneda(s) de 10 \n"
                                + moneda5 + " moneda(s) de 5 \n"
                                + moneda2 + " moneda(s) de 2 \n"
                                + moneda1 + " moneda(s) de 1 \n"
                );
            }
        }
    }
}