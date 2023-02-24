import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDate dateMade1 = LocalDate.of(2022, 1, 1);
        LocalDate dateMade2 = LocalDate.of(2021, 1, 1);
        LocalDate dateMade3 = LocalDate.of(2023, 1, 1);


        Wine wine1 = new Wine("red", "mix", Country.USA, Period.ofYears(Period.between(dateMade1, LocalDate.now()).getYears()));
        Wine wine2 = new Wine("Black", "lux", Country.RUSSIAN, Period.ofYears(Period.between(dateMade1, LocalDate.now()).getYears()));
        Wine wine3 = new Wine("White", "luxary", Country.GERMANY, Period.ofYears(Period.between(dateMade1, LocalDate.now()).getYears()));

        Wine[] wines = {wine1, wine2, wine3};

        Wine[] wines2 = {wine1, wine3};


        WineMaker wineMaker1 = new WineMaker("Jake", wines, 5, "ds105");
        WineMaker wineMaker2 = new WineMaker("Pole", wines2, 10, "hj98");

        System.out.println(wineMaker1);
        System.out.println(wineMaker2);
        System.out.println("if you want add wine input 1 or not 2");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                Wine wine5 = new Wine();
                System.out.println("input name");
                wine5.setName(scanner.next());
                System.out.println("input brand");
                wine5.setBrand(scanner.next());
                Wine[] wines1 = {wine1, wine2, wine5};

                wine5.newWine(wine5);

                Wine[] wines3 = {wine1, wine5};
                for (Wine w : wines3) {
                    System.out.println(w);
                }
                WineMaker wineMaker3= new WineMaker("Joy",wines3,1,"sad12");


                break;
            default:
                System.out.println("buy");


        }

    }
}