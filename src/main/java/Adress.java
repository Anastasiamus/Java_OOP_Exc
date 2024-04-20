import java.util.Objects;

public class Adress {
    private City city;
    private int houseNumber;

    public Adress(City city, int houseNumber) {
        this.city = city;
        this.houseNumber = houseNumber;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adress adress = (Adress) o;
        return houseNumber == adress.houseNumber && city == adress.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, houseNumber);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city=" + city +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
