import Transport.Car;

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
        Human vova = new Human("Владимир", 21, "Казань");
        System.out.println(vova);
        Human noname = new Human(null, 0, null);
        System.out.println(noname);

        System.out.println("***");

        Car lada = new Car("Lada", "Grande", 2015, "Россия", "желтый", 1.7, "", 0);
        System.out.println(lada);
        Car audi = new Car("Audi", "A8", 2020, "Германия", "черный", 3.0, "", 0);
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0, "", 0);
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage", 2018, "Южная Корея", "крвсный", 2.4, "", 0);
        System.out.println(kia);
        if (!kia.checkInsurance()){
            System.out.println("Kia: Продлите страховку");
        }
        Car hyndai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6, "", 0);
        System.out.println(hyndai);
        hyndai.setRegNumber("Х777ХХ777");
        hyndai.changeTyres();
        Car.Insurance insurance = hyndai.new Insurance(365, 5000, "XXX12454");
        hyndai.setInsurance(insurance);
        if (!hyndai.checkInsurance()){
            System.out.println("Hyndai: Продлите страховку");
        }
        if (!hyndai.checkInsuranceNumber()){
            System.out.println("Hyndai: Некорректный номер страховки");
        }
        System.out.println(hyndai);

        System.out.println("***");

        Flower rose = new Flower("красный", "Голландия", 35.59);
        System.out.println(rose);
        Flower chrysanthemum = new Flower("синий", "", 15, 5);
        System.out.println(chrysanthemum);
        Flower peony = new Flower("розовый", "Англия", 15, 5);
        System.out.println(peony);
        Flower gypsophila = new Flower("желтый", "Ткрция", 19.5, 10);
        System.out.println(gypsophila);
    }
}