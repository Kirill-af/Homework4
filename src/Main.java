public class Main {
    public static void main(String[] args) {

        //Задание № 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен"  + age +  ", то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Задание № 2
        int temperature = 10;
        if (temperature < 5)
        {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + temperature + "градусов, можно идти без шапки.");
        }
        //Задание № 3
        int speed = 70;
        if (speed > 60)
        {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
        //Задание № 4
        int ages = 18;

        if (ages >= 2 && ages <= 6) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в детский сад.");
        }
        if (ages >= 7 && ages <= 17) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в школу.");
        }
        if (ages >= 18 && ages <= 24) {
            System.out.println("Если возраст человека равен " + ages + ", то его место в университете.");
        }
        if (ages > 24) {
            System.out.println("Если возраст человека равен " + ages + ", то ему пора ходить на работу.");
        }
        //Задание № 5
        int age1 = 12;

        if (age1 < 5) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему нельзя кататься на аттракционе.");
        }
        if (age1 >= 5 && age1 < 14) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (age1 >= 14) {
            System.out.println("Если возраст ребенка равен " + age1 + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        //Задание № 6
        int passengers = 80;

        int capacity = 102;
        int sittingPlaces = 60;

        if (passengers <= sittingPlaces) {
            System.out.println("В вагоне есть сидячее место для пассажира.");
        }
        if (passengers <= capacity) {
            System.out.println("В вагоне есть стоячее место для пассажира.");
        }
        else {
            System.out.println("Вагон уже полностью забит, мест нет.");
        }

        //Задание № 7
        int one = 10;
        int two = 20;
        int three = 30;

        if (one >= two && one >= three)
        {
            System.out.println("Наибольшее число: " + one);
        }
        else if (two >= one && two >= three)
        {
            System.out.println("Наибольшее чмло: " + two);
        }
        else
        {
            System.out.println("Наибольшее число: " + three);
        }
    }
}