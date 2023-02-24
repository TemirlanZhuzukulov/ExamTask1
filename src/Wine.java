import java.time.Period;
import java.util.Scanner;

public class Wine implements NewWine {
    private String name;
    private String brand;
    public Country country;
    private Period madeDate;

    public Wine(String name, String brand, Country country, Period madeDate) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.madeDate = madeDate;
    }

    public Wine() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Period getMadeDate() {
        return madeDate;
    }

    public void setMadeDate(Period madeDate) {
        this.madeDate = madeDate;
    }






    @Override
    public void newWine(Wine wine5) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("input name");
        wine5.getName();
        System.out.println("input brand");
        wine5.getBrand();
        wine5.getMadeDate();
        wine5.getCountry();
    }

    @Override
    public String toString() {
        return "Wine{" +
                ", name='" + getName()+ '\'' +
                ", brand='" + getBrand() + '\'' +
                ", country=" + getCountry() +
                ", madeDate=" + getMadeDate() +
                '}';
    }

    }


