public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", 35, "Минск", "бренд-менеджер");
        System.out.println(maksim);
        Human anna = new Human("Аня", 29, "Москва", "методист образовательных программ");
        System.out.println(anna);
        Human katya = new Human("Катя", 28, "Калининград", "продакт-менеджер");
        System.out.println(katya);
        Human artem = new Human("Артем", 27, "Москва", "директор по развитию бизнеса");
        System.out.println(artem);

        Human noname = new Human();
        System.out.println(noname);
    }
}