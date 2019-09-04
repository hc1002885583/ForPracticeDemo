public class Manager extends Employee {
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, String id, int bonus) {
        super(name, salary, id);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理开会喝茶！");
    }

}
