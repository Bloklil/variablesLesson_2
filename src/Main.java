public class Main {
    public static void main(String[] args) {

        byte a = -19;
        short b = 163;
        int c = 39001;
        long d = 89_898_111;
        float e = 9f;
System.out.println("Задание 1");
System.out.println("Значение переменной <а> с типом данных byte равно " +a);
System.out.println("Значение переменной <b> с типом данных short равно " +b);
System.out.println("Значение переменной <c> с типом данных int равно " +c);
System.out.println("Значение переменной <d> с типом данных long равно " +d);
System.out.println("Значение переменной <e> с типом данных float равно " +e);

        System.out.println("Задание 2");
        float x = 27.12f;
        float klass = 2.786f;
        long glass = 987_678_965_549L;
        short arrow = 569;
        short frog = -159;
        short home = 27897;
        byte gnom = 67;

        System.out.println("Задание 3");
byte class1 = 23;
byte class2 = 27;
byte class3 = 30;
short totalLeaf = 480;
short totalStudent = (short) (class1 + class2 + class3);
short totalLeafStudent = (short) (totalLeaf / totalStudent);
System.out.println("На каждого ученика расчитано " +totalLeafStudent+ " листов");

        System.out.println("Задание 4");
        byte productionProductivity = 16 / 2; //в минуту
        short production20min = (short) (productionProductivity * 20);
        short production1day =(short) (productionProductivity * 60 * 24);
        int production3day = production1day * 3;
        int production1ear = production1day * 365;
System.out.println("За 20 минут машина произвела " +production20min+ " штук бутылок");
System.out.println("За 1 день машина произвела " +production1day+ " штук бутылок");
System.out.println("За 3 дня машина произвела " +production3day+ " штук бутылок");
System.out.println("За год машина произвела " +production1ear+ " штук бутылок");

        System.out.println("Задание 5");
        byte whitePot = 2;
        byte brownPot = 4;
        byte potPaint =(byte) (whitePot + brownPot); // банок краски на класс
        byte totalPot = 120;
        byte totalklass =(byte) (totalPot / potPaint);
        byte totalWhitePot =(byte) (totalklass * whitePot);
        byte totalBrownPot =(byte) (totalklass * brownPot);
System.out.println("В школе, где " +totalklass+ " классов,нужно " +totalWhitePot+ " банок белой краски и " +totalBrownPot+ " банок коричневой краски");

        System.out.println("Задание 6");
        short bananWeight = 5 * 80;
        float milkWeight = 0.971f * 200; //плотность молока
        short plombirWeight = 2 * 100;
        short eggWeight = 4 * 70;
        float dishWeightTotal = bananWeight +  milkWeight + plombirWeight + eggWeight;
        float dishWeightTotalKG = ((bananWeight + milkWeight + plombirWeight + eggWeight)/1000);
        double dishWeightTotalKG1 = Math.round(dishWeightTotalKG * 1000.0) / 1000.0;
        System.out.println( +dishWeightTotal+ " грамм готового продукта получается, либо " +dishWeightTotalKG1+ " в килограммах");

            System.out.println("Задание 7");

            byte throwOffWeight = 7;
            short lostWeight250 = (7 * 1000) / 250;
            short lostWeight500 = (7 * 1000) / 500;
            float averageLostWeight = (float) Math.ceil((7*1000) / ((250+500)/2));
            System.out.println("При потере потере 250 грамм в день, потребуется " +lostWeight250+" дней");
            System.out.println("При потере потере 500 грамм в день, потребуется " +lostWeight500+" дней");
            System.out.println("В среднем при потере веса потребуется " +averageLostWeight+" дней");

        System.out.println("Задание 8");

        int moneyMasha = 67760; //текущая зп
        int moneyDenis = 83690;
        int moneyKristina = 76230;
        int differenceM = (moneyMasha * 10) / 100; // прирост 10 процентов
        int differenceD = (moneyDenis * 10) / 100;
        int differenceK = (moneyKristina * 10) / 100;
        int increaseMoneyM = (moneyMasha * 10) / 100 + moneyMasha; // ЗП после прироста
        int increaseMoneyD = (moneyDenis * 10) / 100 + moneyDenis;
        int increaseMoneyK = (moneyKristina * 10) / 100 + moneyKristina;
        int differenceYearM = increaseMoneyM * 12; // годовая зп
        int differenceYearD = increaseMoneyD * 12;
        int differenceYearK = increaseMoneyK * 12;
        int moneyM_Eyar = moneyMasha * 12; // зп за год ранее
        int moneyD_Eyar = moneyDenis * 12;
        int moneyK_Eyar = moneyKristina * 12;
        System.out.println("Маша теперь получает " +increaseMoneyM+ " рублей в месяц. Её зарплата выросла на " +differenceM+ ". Годовой доход теперь составляет " +differenceYearM+ " рублей");
        System.out.println("Денис теперь получает " +increaseMoneyD+ " рублей в месяц. Её зарплата выросла на " +differenceD+ ". Годовой доход теперь составляет " +differenceYearD+ " рублей");
        System.out.println("А Кристина теперь получает " +increaseMoneyK+ " рублей в месяц. Её зарплата выросла на " +differenceK+ ". Годовой доход теперь составляет " +differenceYearK+ " рублей");
        System.out.println("Ранее Маша за год получала " +moneyM_Eyar+ " рублей. Денис за год получал " +moneyD_Eyar+ " рублей. Кристина ранее за год получала " +moneyK_Eyar+ " рублей");
        
    }
}