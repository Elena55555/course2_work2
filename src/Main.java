public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание № 2 (2 курс) " );

        Hogwarts [] hogwarts   = {
                new Hogwarts(" Гарри Поттер ", 100, 100),
                new Hogwarts(" Гермиона Грейнджер ", 70, 80),
                new Hogwarts(" Рон Уизли ", 20, 80),
                new Hogwarts("Чжоу Чанг", 100, 90),
                new Hogwarts("Падма Патил", 80, 70),
                new Hogwarts("Маркус Белби", 90, 50),
                new Hogwarts("Чжоу Чанг", 100, 90),
                new Hogwarts("Падма Патил", 80, 70),
                new Hogwarts("Маркус Белби", 90, 50),
                new Hogwarts("Драко Малфой", 100, 100),
                new Hogwarts("Грэхэм Монтегю", 100, 80),
                new Hogwarts("Грегори Гойл", 20, 100),
        };

        System.out.println("размер списка " + hogwarts.length);
        for (int i = 0; i< hogwarts.length; i++) {
            Hogwarts hogwart   = hogwarts[i];
            System.out.println("Имя " +    hogwart.getName()   +
                    ", умение колдовать =" + hogwart.getWitchcraftOneHundredPoints() +
                    ",  умение трасгрессировать на расстояние =" + hogwart.getTransgressToDistanceOfOneHundredKilometers() +
                    '}' );


        }











        Gryffindor [] gryffindors  = {
                new Gryffindor(" Гарри Поттер ", 100, 100, 100, 100, 100),
                new Gryffindor(" Гермиона Грейнджер ", 70, 80, 50, 10, 70),
                new Gryffindor(" Рон Уизли ", 20, 80, 50, 10, 90),

        };


        Hufflepuff [] hufflepuffs = new Hufflepuff[3];
        hufflepuffs[0]= new Hufflepuff(" Захария Смит ", 100,22, 66, 77, 77);
        hufflepuffs [1] = new Hufflepuff(" Седрик Диггори ", 22, 33, 50, 70, 20);
        hufflepuffs [2] = new Hufflepuff(" Джастин Финч-Флетчли ", 10, 20, 40, 20, 100);



        Ravenclaw []  ravenclaws = new Ravenclaw[3];
        ravenclaws [0]=new Ravenclaw("Чжоу Чанг", 100, 90, 30, 70, 45, 90);
        ravenclaws [1]=new Ravenclaw("Падма Патил", 80, 70, 40, 50, 45, 80);
        ravenclaws [2]=new Ravenclaw("Маркус Белби", 90, 50, 70, 80, 45, 100);


        Slytherin [] slytherins = new Slytherin[3];
        slytherins [0] = new Slytherin("Драко Малфой", 100, 100, 100, 100, 100, 100, 100);
        slytherins [1] = new Slytherin("Грэхэм Монтегю", 100, 80, 80, 50, 100, 80, 50);
        slytherins [2] = new Slytherin("Грегори Гойл", 20, 100, 50, 20, 80, 90, 70);


        PrintService printService = new PrintService();

        printService.print(gryffindors);
        printService.sum(gryffindors);

        printService.print(hufflepuffs);
        printService.sum(hufflepuffs);

        printService.print(ravenclaws);
        printService.sum(ravenclaws);


        printService.print(slytherins);
        printService.sum(slytherins);

        printService.comparisonWitchcraft(gryffindors);
        printService.comparisonTransgress(gryffindors);



    }
}