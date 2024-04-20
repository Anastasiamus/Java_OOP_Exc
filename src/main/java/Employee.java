import java.time.LocalDate;
import java.util.Objects;

public class Employee implements HumanResources{
    private final String name;
    private final String surname;
    private Adress homeAdress;
    private LocalDate birthday;



    public Employee(String name, String surname, LocalDate localDate) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Adress getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(Adress homeAdress) {
        this.homeAdress = homeAdress;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(homeAdress, employee.homeAdress) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, homeAdress, birthday);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", homeAdress=" + homeAdress +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean needMedicalInsurance() {
        return false;
    }
}
