public class PrintService {
    public void print(Gryffindor []  gryffindors){
        for (int i = 0; i< gryffindors.length; i++) {
            Gryffindor gryffindor  = gryffindors[i];

            System.out.println(" Имя = " + gryffindor.getName() + ",  уменение колдовать = "+ gryffindor.getWitchcraftOneHundredPoints() +
                    ",  умение трансгрессировать =  " + gryffindor.getTransgressToDistanceOfOneHundredKilometers() + ",  благородство = " +
                    gryffindor.getNobility() + ",  честь = " + gryffindor.getHonor() + ",  храбрость = " + gryffindor.getBravery());
        }
    }
    public static void sum(Gryffindor []  gryffindors) {
//        System.out.println("Метод, выводящий результат суммы балов 2 - ух учеников факультета  Griffindor ");
        int sumScoresGriffindor = 0;
        for (int i = 0; i < gryffindors.length - 1; i++) {
            Gryffindor gryffindor = gryffindors[i];
            sumScoresGriffindor =  gryffindor.getWitchcraftOneHundredPoints() + gryffindor.getTransgressToDistanceOfOneHundredKilometers() +
                    gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery();
            System.out.println(sumScoresGriffindor);

        }
        System.out.println("Гарри Поттер  лучший Гриффиндорец, чем  Гермиона Грейнджер ");
    }
    public void print(Hufflepuff[] hufflepuffs) {
        System.out.println(" Размер списка " + hufflepuffs .length);
        for (int i = 0; i< hufflepuffs .length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println( " Имя " + hufflepuff.getName() + ",  умение колдовать = " + hufflepuff.getWitchcraftOneHundredPoints() +
                    ",  умение трансгрессировать = " + hufflepuff.getTransgressToDistanceOfOneHundredKilometers()   +
                    ",  трудолюбие = " + hufflepuff.getHardworking()  +
                    ",  верность = " + hufflepuff.getLoyal() +
                    ", честность = " + hufflepuff.getHonest());
        }
    }
    public void sum(Hufflepuff[] hufflepuffs) {
        int sumScoresHufflepuff  = 0;
        for (int i = 0; i < hufflepuffs.length-1; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            sumScoresHufflepuff  =  hufflepuff.getWitchcraftOneHundredPoints() +
                    hufflepuff.getTransgressToDistanceOfOneHundredKilometers()   +
                    hufflepuff.getHardworking()  +
                    hufflepuff.getLoyal() +
                    hufflepuff.getHonest()  ;
            System.out.println(sumScoresHufflepuff );
        }
        System.out.println( " Захария Смит лучшая студентка Пуффендуй, чем Седрик Диггори ");
    }
    public void print(Ravenclaw[] ravenclaws) {

        System.out.println(" Размер списка " + ravenclaws.length);
        for (int i = 0; i< ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(" Имя " + ravenclaw.getName() +
                    ",  умение колдовать = " + ravenclaw.getWitchcraftOneHundredPoints() +
                    ",  умение  трансгрессировать = " + ravenclaw.getTransgressToDistanceOfOneHundredKilometers()  +
                    ", ум = " + ravenclaw.getSmart()  +
                    ", мудрость = " + ravenclaw.getWise()  +
                    ", остроумие = " + ravenclaw.getWitty()  +
                    ", творчество = " + ravenclaw.getFullOfCreativity() );
        }
    }
    public void sum(Ravenclaw[] ravenclaws) {
        int sumScoresRavenclaw = 0;
        for (int i = 0; i < ravenclaws.length-1; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            sumScoresRavenclaw =  ravenclaw.getWitchcraftOneHundredPoints()   + ravenclaw.getTransgressToDistanceOfOneHundredKilometers()  +
                    ravenclaw.getSmart()  +  ravenclaw.getWise()  +  ravenclaw.getWitty()  + ravenclaw.getFullOfCreativity();
            System.out.println(sumScoresRavenclaw);
        }
        System.out.println(" Чжоу Чанг  лучший студент Когтеврана, чем Падма Патил");
    }
    public void print(Slytherin[] slytherins) {
        System.out.println("размер списка " + slytherins.length);
        for (int i = 0; i< slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(" Имя " + slytherin.getName() + ", умение колдовать = " +
                    slytherin.getWitchcraftOneHundredPoints()  +
                    ",  умение трансгрессировать = "  + slytherin.getTransgressToDistanceOfOneHundredKilometers() +
                    ",  хитрость = " + slytherin.getCunning() +
                    ",  решительность = " + slytherin.getDetermination()  +
                    ", амбициозность = " + slytherin.getAmbition()  +
                    ",  находчивость = " + slytherin.getResourcefulness()  +
                    ",  жажда власти = " + slytherin.getThirstForPower()  +
                    '}'  );
        }
    }
    public void sum(Slytherin[] slytherins) {
        int sumScoresSlitherin = 0;
        for (int i = 0; i < slytherins.length-1; i++) {
            Slytherin slytherin = slytherins[i];
            sumScoresSlitherin = slytherin.getWitchcraftOneHundredPoints()  +
                    slytherin.getTransgressToDistanceOfOneHundredKilometers() +
                    slytherin.getCunning() +
                    slytherin.getDetermination()  +
                    slytherin.getAmbition()  +
                    slytherin.getResourcefulness()  +
                    slytherin.getThirstForPower()  ;
            System.out.println(sumScoresSlitherin );
        }
        System.out.println("Драко Малфой лучший студент Слизерина, чем Грэхэм Монтегю");
    }

    public void comparisonWitchcraft(Gryffindor[] gryffindors) {
//        System.out.println( "Сравнение по признаку силы магии двух первых студентов в Гриффиндоре ");
        int max = 0;
        String names = null;
        for (int i = 0; i < gryffindors.length-1 ; i++) {
            if (max == gryffindors[i].getWitchcraftOneHundredPoints()) {
                names +=   gryffindors[i].getName();
            } else if (max < gryffindors[i].getWitchcraftOneHundredPoints()) {
                max = gryffindors[i].getWitchcraftOneHundredPoints();
                names = gryffindors[i].getName();
            }
        }
        System.out.println(names + " - лучший студент факультета Гриффиндор по признаку силы магии, чем Гермиона Грейнджер");
    }
    public void comparisonTransgress(Gryffindor[] gryffindors) {
//        System.out.println( "Сравнение по признаку расстояния трансгресии двух первых студентов в Гриффиндоре ");
        int max2 = 0;
        String names2 = null;
        for (int i = 0; i < gryffindors.length-1 ; i++) {
            if (max2 == gryffindors[i].getTransgressToDistanceOfOneHundredKilometers()) {
                names2 +=   gryffindors[i].getName();
            } else if (max2 < gryffindors[i].getTransgressToDistanceOfOneHundredKilometers()) {
                max2 = gryffindors[i].getTransgressToDistanceOfOneHundredKilometers();
                names2 = gryffindors[i].getName();
            }
        }
        System.out.println(names2 + " - лучший студент факультета Гриффиндор по расстоянию трангрессировать, чем Гермиона Грейнджер");
    }
}
