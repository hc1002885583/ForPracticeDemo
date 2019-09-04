public class Coder extends Employee {
    @Override
    public void work() {
        System.out.println("程序员要敲代码！");
    }

    public Coder() {
    }

    public Coder(String name, double salary, String id) {
        super(name, salary, id);
    }
}
