public class Student implements IPerson {

    public String name;

    public int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }


    @Override
    public void handleMoney() {
        System.out.println("Student" + this.name + "handle $" + this.money);
    }
}
