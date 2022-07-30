public class Main {
    public static void main(String[] args) {

        Gryffindor garry = new Gryffindor("Гарри Поттер", 48, 58, 69, 20, 87);
        Gryffindor germiona = new Gryffindor("Гермиона Грейнджер", 63, 70, 69, 70, 20);
        Gryffindor ron = new Gryffindor("Рон Уизли", 10, 20, 30, 40, 50);

        Hufflepuff smit = new Hufflepuff("Захария Смит", 50, 40, 80, 60, 30);
        Hufflepuff digory = new Hufflepuff("Седрик Диггори", 20, 70, 10, 90, 30);
        Hufflepuff fingh = new Hufflepuff("Джастин Финч-Флетчли", 40, 90, 70, 30, 60);

        Ravenclaw ghang = new Ravenclaw("Чжоу Чанг", 10, 50, 60, 70, 90);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 20, 70, 90, 50, 40);
        Ravenclaw belbi = new Ravenclaw("Маркус Белби", 50, 60, 80, 10, 30);

        Slytherin drago = new Slytherin("Драко Малфой", 50, 10, 80, 60, 30, 60, 80);
        Slytherin greghem = new Slytherin("Грэхэм Монтегю", 40, 10, 30, 10, 30, 10, 80);
        Slytherin groy = new Slytherin("Грегори Гойл", 40, 10, 30, 10, 30, 10, 80);

        System.out.println(garry);
        System.out.println(digory);
        System.out.println(padma);
        System.out.println(drago);
        garry.compare(germiona);
        smit.compare(fingh);
        ghang.compare(belbi);
        drago.compare(greghem);
        digory.compareAll(padma);
        groy.compareAll(ron);
        belbi.compareAll(ghang);
    }
}


