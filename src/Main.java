import java.time.LocalDate;

public class Main {
    public static boolean checkingYear(int year){
        boolean checkingResult;
        if(year % 100 == 0 || year % 4 > 0 ){//каждый 4 год высокосный -> по остатку на 4 и всё на этом
            checkingResult = false;
        }
        else {
            checkingResult = true;
        }
        return checkingResult;
    }

    public static void recommendationForInstallingProgram(byte os, int devYear) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && currentYear > devYear) {
            System.out.println("Вы используете iOS год выхода вашего устройства " + devYear
                    + " Рекомендуется установить Lite версию");
        } else if (os == 0 && currentYear <= devYear) {
            System.out.println("Вы используете iOS год выхода вашего устройства " + devYear
                    + " Рекомендуется установить полную версию");
        } else if (os == 1 && currentYear > devYear) {
            System.out.println("Вы используете Android год выхода вашего устройства " + devYear
                    + " Рекомендуется установить Lite версию");
        } else if (os == 1 && currentYear <= devYear) {
            System.out.println("Вы используете Android год выхода вашего устройства " + devYear
                    + " Рекомендуется установить полную версию");
        }
    }

    public static void deliveryNotification(int distance){
        if(distance<= 20){
            System.out.println("Доставка вашей карты займет " + 1 + " день");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Доставка вашей карты займет " + 2 + " дня");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Доставка вашей карты займет " + 3 + " дня");
        }else {
            System.out.println("Невозможное значение или слишком большое расстояние, рекомендуем связатсья с " +
                    "вашим менеджером");
        }
    }
    public static void main(String[] args) {
        //Задание 1
        int year = 800;//год
        boolean check = checkingYear(year);//решил побаловатся с булами. возвращем сюда значение метода
        if(check == true){
            System.out.println(year + " Высокосный год");
        }else{
            System.out.println(year + " Не высокосный");
        }
        //Задание 2
        System.out.println();
        byte typeOS = 1;
        int deviceYear = 2023;
        recommendationForInstallingProgram(typeOS,deviceYear);
        //Задание 3
        System.out.println();
        int deliveryDistance = 30;
        deliveryNotification(deliveryDistance);

    }
}