package org.und4;

import javax.xml.stream.events.EndDocument;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Repeticion2_Ej15 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");

        System.out.print("Introduce una hora en formato (HH:MM:SS): ");
        String hora = sc.next();

        char hr = hora.charAt(0);
        char hr2 = hora.charAt(1);
        char min = hora.charAt(3);
        char min2 = hora.charAt(4);
        char sec = hora.charAt(6);
        char sec2 = hora.charAt(7);

        String horas = String.valueOf(hr) + hr2;
        String minutos = String.valueOf(min) + min2;
        String segundos = String.valueOf(sec) + sec2;

        int segs = Integer.parseInt(segundos);
        int mins = Integer.parseInt(minutos);
        int hors = Integer.parseInt(horas);

        while (true) {

            if (segs > 59 || mins > 59 || hors > 23) {
                System.out.print("Formato incorrecto, vuelve a introducirla: ");
                String hora2 = sc.next();

                hr = hora2.charAt(0);
                hr2 = hora2.charAt(1);
                min = hora2.charAt(3);
                min2 = hora2.charAt(4);
                sec = hora2.charAt(6);
                sec2 = hora2.charAt(7);

                horas = String.valueOf(hr) + hr2;
                minutos = String.valueOf(min) + min2;
                segundos = String.valueOf(sec) + sec2;

                segs = Integer.parseInt(segundos);
                mins = Integer.parseInt(minutos);
                hors = Integer.parseInt(horas);
            }

        else {
                segs++;
                Thread.sleep(1000);
                if (segs >= 60) {
                    mins++;
                    segs = 0;
                    if (mins >= 60) {
                        hors++;
                        mins = 0;
                        if (hors >= 24) {
                            hors = 0;
                            mins = 0;
                            segs = 0;
                        }
                    }
                }
                System.out.println(df.format(hors) + ":" + df.format(mins) + ":" + df.format(segs));
            }
        }
    }
}