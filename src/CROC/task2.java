package CROC;

import java.util.Scanner;

class task2 {


    public static void main(String[] args) {
        instruction();
    }

    public static void instruction() {
        System.out.println("Вам представится 4 звуковоспроизводящих устройства"
                + "\n Вы можете выбрать это устройство и подходящий к нему носитель"
                + "\n В каждом носителе есть несколько музыкальных композиций"
                + "\n Напишите 'старт' для запуска приложения, 'стоп' для его закрытия: ");
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String start = in.nextLine();

            if (start.equals("старт")) {
                audioPlayer();
            } else if (start.equals("стоп")) {
                System.out.println("Хорошего дня!");
                in.close();
                return;
            } else {
                System.out.println("Неверная команда!");
            }
        }
    }

    // вывод главного меню
    public static void audioPlayer() {
        System.out.print("Выберите звуковоспроизводящее устройство"
                + "\n 1 - Аудиоплеер"
                + "\n 2 - Виниловый проигрыватель"
                + "\n 3 - Персональный компьютер"
                + "\n 4 - Кассетный плеер"
                + "\n 5 - НАЗАД!: ");
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println("");
            switch (n) {
                case 1:
                    storage("Аудиоплеер");
                    break;
                case 2:
                    storage("Виниловый проигрыватель");
                    break;
                case 3:
                    storage("Персональный компьютер");
                    break;
                case 4:
                    storage("Кассетный плеер");
                case 5:
                    instruction();
                    return;
                default:
                    System.out.println("Неверная команда!");
            }

        }
    }

    public static void storage(String typeOfAudioPLayer) {
        System.out.print("Выберите носители музыкальных композиций"
                + "\n 1 - SD-накопитель"
                + "\n 2 - Виниловая пластинка"
                + "\n 3 - USB-накопитель"
                + "\n 4 - Касета"
                + "\n 5 - НАЗАД!: ");
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println("");
            switch (n) {
                case 1:
                    if (typeOfAudioPLayer.equals("Аудиоплеер")) {
                        music(1);
                    } else {
                        System.out.println("Этот носитель не подходит для " + typeOfAudioPLayer);
                    }
                    break;
                case 2:
                    if (typeOfAudioPLayer.equals("Виниловый проигрыватель")) {
                        music(2);
                    } else {
                        System.out.println("Этот носитель не подходит для " + typeOfAudioPLayer);
                    }
                    break;
                case 3:
                    if (typeOfAudioPLayer.equals("Персональный компьютер")) {
                        music(3);
                    } else {
                        System.out.println("Этот носитель не подходит для " + typeOfAudioPLayer);
                    }
                    break;
                case 4:
                    if (typeOfAudioPLayer.equals("Кассетный плеер")) {
                        music(4);
                    } else {
                        System.out.println("Этот носитель не подходит для " + typeOfAudioPLayer);
                    }
                    break;
                case 5:
                    audioPlayer();
                    return;
                default:
                    System.out.println("Неверная команда!");
            }

        }
    }

    public static void music(int typeOfStorage) {
        String musicOne = "",
                musicTwo = "",
                musicThree = "",
                musicFour = "";
        switch (typeOfStorage) {
            case 1:
                musicOne = "Август";
                musicTwo = "Ветра";
                musicThree = "Дуга";
                musicFour = "Сирень";
                break;
            case 2:
                musicOne = "МУККА";
                musicTwo = "ХЛЕБ";
                musicThree = "Jony";
                musicFour = "Panda Eyes";
                break;
            case 3:
                musicOne = "Zatox";
                musicTwo = "Rew";
                musicThree = "МЫ";
                musicFour = "ATL";
                break;
            case 4:
                musicOne = "Mnogoznaal";
                musicTwo = "The Weeknd";
                musicThree = "Niletto";
                musicFour = "Panda Eyes";

        }
        System.out.print("Выберите носители музыкальных устройств"
                + "\n 1 - " + musicOne
                + "\n 2 - " + musicTwo
                + "\n 3 - " + musicThree
                + "\n 4 - " + musicFour
                + "\n 5 - НАЗАД!: ");
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            System.out.println("");
            switch (n) {
                case 1:
                    System.out.println("Играет музыка: Бах");
                    break;
                case 2:
                    System.out.println("Играет музыка: Ария");
                    break;
                case 3:
                    System.out.println("Играет музыка: Рамштайн");
                    break;
                case 4:
                    System.out.println("Играет музыка: КиШ");
                    break;
                case 5:
                    audioPlayer();
            }

        }
    }

}