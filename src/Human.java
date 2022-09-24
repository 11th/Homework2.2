import java.util.Calendar;

public class Human {
    private String name;
    private int yearOfBirth;
    private String town;
    private String job;

    public Human(){
        this("Не указано", 0, "Не указано", "Не указано");
    }

    public Human(String name, int age, String town, String job){
        this.name = name;
        this.town = town;
        if (age >= 0) {
            this.yearOfBirth = Calendar.getInstance().get(Calendar.YEAR) - age;
        } else {
            this.yearOfBirth = Calendar.getInstance().get(Calendar.YEAR);
        }
        this.job = job;
    }

    @Override
    public String toString() {
        return String.format(
                "Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s. Будем знакомы!"
                ,name, town, yearOfBirth, job
        );
    }
}
