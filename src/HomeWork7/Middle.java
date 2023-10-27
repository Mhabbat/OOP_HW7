package HomeWork7;

public class Middle implements Observer {
    private String name;
    private int salary = 50000;

    public Middle(String name) { this.name = name; }
    public void receiveOffer(String nameCompany, String vacancy, int salary) {
        if (this.salary <= salary){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d))\n",
                    name, nameCompany, vacancy, salary);
        }
    }

}
