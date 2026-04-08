package Exercício01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MonitorEnergia monitor = new MonitorEnergia(200);
        monitor.registar(3);
        monitor.registar(1);
        monitor.registar(2);
        monitor.registar(3);
        monitor.registar(2);

        System.out.println("Média dos consumos regitrados: " + monitor.media());
        System.out.println("Média de consumo do intervalo: " + monitor.media(2,4));
    }
}
