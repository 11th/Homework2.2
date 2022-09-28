import java.beans.Introspector;
import java.util.Calendar;

public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String job;

    public Human(String name, int age, String town){
        this(name, age, town, null);
    }

    public Human(String name, int age, String town, String job){
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        }
        if (job != null && !job.isEmpty() && !job.isBlank()) {
            this.job = job;
        }
        setYearOfBirth(age);
        setTown(town);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int age) {
        if (age > 0) {
            this.yearOfBirth = Calendar.getInstance().get(Calendar.YEAR) - age;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        }
    }

    @Override
    public String toString() {
        String name = this.name;
        if (name == null){
            name = "Не указано";
        }
        String town = this.town;
        if (town == null){
            town = "Не указано";
        }
        String year = Integer.toString(this.yearOfBirth);
        if (this.yearOfBirth == 0){
            year = "Не указано";
        }
        String job = this.job;
        if (job == null){
            job = "Не указано";
        }
        return String.format(
                "Привет! Меня зовут %s. Я из города %s. Я родился в %s году. Я работаю на должности %s. Будем знакомы!",
                name, town, year, job
        );
    }
}
