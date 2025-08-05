package org.example;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rase calculateLider = new Rase();

        Automobil moskvich = new Automobil(null, 0);
        while (true) {
            System.out.println("Введите название машины №1:");
            moskvich.name = scanner.nextLine(); //без Line не реагирует на пустой ввод - точнее не завершает его
            if (moskvich.name.isEmpty()) {
                System.out.println("Название не должно быть пустым!");
                continue; // иначе break далее завершит цикл и программа перейдет к следующему блоку
            } break;
        }
        while (true) {
            System.out.println("Введите скорость машины №1:");

            String notEnter = scanner.nextLine(); //для проверки пустого ввода значения скорости + (ниже с преобразователем) если значение не числовое
            if (notEnter.isEmpty()) {
                System.out.println("Значение скорости не должно быть пустым!");
                continue;
            }
            try {
                moskvich.speed = Integer.parseInt(notEnter); // преобразуется только если было введено интовое значение (поэтому hasNextInt доп-но не нужен)
            } catch (NumberFormatException e) { // вид ошибки преобразования, если строкове значение оказалось не интовое
                System.out.println("Некорректное значение скорости! Введите целое число!");
                continue;
            }
            if (moskvich.speed < 0 || moskvich.speed > 250) { // вместо вложенного цикла объединил проверку по ним в одном
                System.out.println("Скорость должна быть в диапазоне от 0 до 250!");
                continue;
            }
            break;
        }

        calculateLider.newLider(moskvich.name, moskvich.speed);

        Automobil volga = new Automobil(null, 0);
        while (true) {
            System.out.println("Введите название машины №2:");
            volga.name = scanner.nextLine();
            if (volga.name.isEmpty()) {
                System.out.println("Название не должно быть пустым!");
                continue;
            } break;
        }
        while (true) {
            System.out.println("Введите скорость машины №2:");

            String notEnter = scanner.nextLine();
            if (notEnter.isEmpty()) {
                System.out.println("Значение скорости не должно быть пустым!");
                continue;
            }
            try {
                volga.speed = Integer.parseInt(notEnter);
            } catch (NumberFormatException e) {
                System.out.println("Некорректное значение скорости! Введите целое число!");
                continue;
            }
            if (volga.speed < 0 || volga.speed > 250) {
                System.out.println("Скорость должна быть в диапазоне от 0 до 250!");
                continue;
            }
            break;
        }

        calculateLider.newLider(volga.name, volga.speed);

        Automobil lada = new Automobil(null, 0);
        while (true) {
            System.out.println("Введите название машины №3:");
            lada.name = scanner.nextLine();
            if (lada.name.isEmpty()) {
                System.out.println("Название не должно быть пустым!");
                continue;
            } break;
        }
        while (true) {
            System.out.println("Введите скорость машины №3:");

            String notEnter = scanner.nextLine();
            if (notEnter.isEmpty()) {
                System.out.println("Значение скорости не должно быть пустым!");
                continue;
            }
            try {
                lada.speed = Integer.parseInt(notEnter);
            } catch (NumberFormatException e) {
                System.out.println("Некорректное значение скорости! Введите целое число!");
                continue;
            }
            if (lada.speed < 0 || lada.speed > 250) {
                System.out.println("Скорость должна быть в диапазоне от 0 до 250!");
                continue;
            }
            break;
        }

        calculateLider.newLider(lada.name, lada.speed);

        System.out.println("Самая быстрая машина: " + calculateLider.lider);

        scanner.close();
    }
}

class Rase {
    String lider;
    int oldDistance;

    public Rase() {
        this.lider = "";
        this.oldDistance = 0;
    }

    void newLider (String name, int speed) {
        int distance = speed*24;
        if (lider.isEmpty()) {
            lider = name;
            oldDistance = distance;
        } else {
            if (distance > oldDistance) {
                lider = name;
                oldDistance = distance;
            }
          }
     }
    }

class Automobil {

    String name;
    int speed;

    public Automobil(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    }