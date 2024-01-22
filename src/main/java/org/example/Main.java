package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Integer idDeudor;
        String tipoDocumentoDeudor, tipoDocumentoFiador;
        String documentoDeudor, nombresDeudor, apellidosDeudor, telefonoDeudor, direccionDeudor;
        String isFiador, nombresFiador, apellidosFiador, documentoFiador,telefonoFiador, direccionFiador;
        double valorBrutoDeLaMoto=30000000.0, valorTotalDelAMoto;
        double descuento=0.0, iva, porsentageCredito=0.0;
        double soat = 1000000.0, tipoCredito;
        boolean licenciaDeConduccion;
        boolean tieneDeudor;
        String tipoDeCompra;

        Scanner lea=new Scanner(System.in);

        System.out.println("************************");
        System.out.println("***** Mundo Yamaha *****");
        System.out.println("************************");

        System.out.println("Cuenta con licencia de conduccion?: ");
        licenciaDeConduccion = lea.nextBoolean();

        if (licenciaDeConduccion == true){
            System.out.println("Lo quiere a credito o de contado?: ");
            lea.nextLine();
            tipoDeCompra = lea.nextLine();
            if (tipoDeCompra.equals("credito")){
                System.out.println("procederemos a financiarlo");

                System.out.println("Tiene algun deudor para este crtedito?: ");
                tieneDeudor = lea.nextBoolean();
                lea.nextLine();
                if (tieneDeudor == true){
                    System.out.println("----- DATOS DEL DEUDOR  -----");
                    System.out.println("************************");
                    System.out.println("Nombre del deudor: ");
                    nombresDeudor=lea.nextLine();
                    System.out.println("Apellidos del deudor: ");
                    apellidosFiador=lea.nextLine();
                    System.out.println("Tipo de documento del deudor:");
                    tipoDocumentoDeudor=lea.nextLine();
                    System.out.println("Numero de documento: ");
                    documentoDeudor=lea.nextLine();
                    System.out.println("Telefono del deudor");
                    telefonoDeudor=lea.nextLine();
                    System.out.println("Direccion del deudor: ");
                    direccionDeudor=lea.nextLine();
                    lea.nextLine();

                    System.out.println("----- DATOS DEL FIADOR -----");
                    System.out.println("************************");
                    System.out.println("Nombre del fiador: ");
                    nombresFiador=lea.nextLine();
                    System.out.println("Apellidos del fiador: ");
                    apellidosFiador=lea.nextLine();
                    System.out.println("Tipo de documento del fiador: ");
                    tipoDocumentoFiador=lea.nextLine();
                    System.out.println("Numero de documento del fiadir: ");
                    documentoFiador=lea.nextLine();
                    System.out.println("Telefono del fiador: ");
                    telefonoFiador=lea.nextLine();
                    System.out.println("Direccion del fiador: ");
                    direccionFiador=lea.nextLine();
                    lea.nextLine();
                    System.out.println("que tipo de credito quieres?\n" +
                            "1/ Credito del 0% \n" + "2/ Credito del 30% \n" + "3/ Credito del 50%");
                    tipoCredito=lea.nextInt();
                    System.out.println();

                    if (tipoCredito == 1){
                        porsentageCredito = valorBrutoDeLaMoto *25 / 100;
                    }else if(tipoCredito == 2){
                        porsentageCredito = valorBrutoDeLaMoto *15 / 100;
                    }else if(tipoCredito == 3){
                        porsentageCredito = valorBrutoDeLaMoto *7 / 100;
                    }
                    iva = valorBrutoDeLaMoto * 19 / 100;
                    valorTotalDelAMoto = valorBrutoDeLaMoto + porsentageCredito + soat + iva - descuento;

                    System.out.println("***** FACTURA *****");
                    System.out.println("Precio bruto de la moto: $" + valorBrutoDeLaMoto);
                    System.out.println("Porcentaje del credito: $" + porsentageCredito);
                    System.out.println("Soat: $" + soat);
                    System.out.println("IVA: $" + iva);
                    System.out.println("Total descuento: $" + descuento);
                    System.out.println("Valor total de la moto: $" + valorTotalDelAMoto);
                    System.out.println("***** " + nombresDeudor + " FELICIDADES POR SU NUEVA MOTO :) *****");

                }else{
                    System.out.println("no tienes un fiador no podemos realizar el credito :(");
                }

            }else {
                descuento= valorBrutoDeLaMoto * 10 / 100;
                iva = valorBrutoDeLaMoto * 19 / 100;
                valorTotalDelAMoto = valorBrutoDeLaMoto+ soat + iva - descuento;
                System.out.println("***** FACTURA *****");
                System.out.println("Recibiras un descuento del 10% :)");
                System.out.println("Precio bruto de la moto: $" + valorBrutoDeLaMoto);
                System.out.println("Soat: $" + soat);
                System.out.println("IVA: $" + iva);
                System.out.println("Total descuento: $" + descuento);
                System.out.println("Valor total de la moto: $" + valorTotalDelAMoto);
                System.out.println("***** FELICIDADES POR SU NUEVA MOTO :) *****");
            }

        }
        else{
            System.out.println("no tienes licencia :(");
        }


    }
}