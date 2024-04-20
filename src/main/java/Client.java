import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public abstract class Client {
    private final String name;
    private final String surname;
    private final LocalDate birthDate;

    private boolean active;
    private Adress adress;
    private PaidCard paidCard;
    private boolean needMedicalInsurance;


    public Client(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public PaidCard getPaidCard() {
        return paidCard;
    }

    public void setPaidCard(PaidCard paidCard) {
        this.paidCard = paidCard;
    }

    public boolean NeedMedicalInsurance() {
        return needMedicalInsurance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return active == client.active && needMedicalInsurance == client.needMedicalInsurance && Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(birthDate, client.birthDate) && Objects.equals(adress, client.adress) && Objects.equals(paidCard, client.paidCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, active, adress, paidCard, needMedicalInsurance);
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", active=" + active +
                ", adress=" + adress +
                ", paidCard=" + paidCard +
                ", needMedicalInsurance=" + needMedicalInsurance +
                '}';
    }
    public void setNeedMedicalInsurance(boolean needMedicalInsurance) {
        this.needMedicalInsurance = needMedicalInsurance;
    }
    public abstract int calculateClientPresent();

    public boolean needMedicalInsurance() {
        Period period = Period.between(birthDate, LocalDate.now());
        int age = period.getYears();
        if (active && age >= 55 && adress.getCity() == City.BERLIN) return true;
        return false;
    }
    /*всем сотрудникам старше 35 лет - нужна мед страховка
    всем активным клиентам старше 55 лет проживающим в Берлине  нужна медстрахова*/

}


















