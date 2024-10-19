package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);
        double suma = 0.0;
        String promedioTemperatura;
        for(int i = 0; i<3; i++){
            System.out.print("Ingrese la temperatura " + (i+1) + ": " );
            suma += leerDato.nextDouble();
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        promedioTemperatura = decimalFormat.format(suma/3);
        System.out.print("El promedio de temperarura es: "+ promedioTemperatura + "°C");
    }
}