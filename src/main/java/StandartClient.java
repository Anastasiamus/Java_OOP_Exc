import java.time.LocalDate;
import java.util.Objects;

public class StandartClient extends Client{
    private boolean wasOnceInactive;

    public StandartClient(String name, String surname, LocalDate birthDate) {
        super(name, surname, birthDate);
    }

    public boolean isWasOnceInactive() {
        return wasOnceInactive;
    }

    public void setWasOnceInactive(boolean wasOnceInactive) {
        this.wasOnceInactive = wasOnceInactive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StandartClient that = (StandartClient) o;
        return wasOnceInactive == that.wasOnceInactive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wasOnceInactive);
    }

    @Override
    public String toString() {
        return "StandartClient{" +
                "wasOnceInactive=" + wasOnceInactive +
                '}';
    }
@Override
    public int calculateClientPresent() {
        if (isWasOnceInactive()) return 50;
        return 100;
    }
}

















