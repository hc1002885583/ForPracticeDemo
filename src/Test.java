public class Test {
    public static void main(String[] args) {
        Employee em=new Coder();
        em.work();
        Employee em2=new Manager(30);
        em2.work();
        System.out.println("-------------------");
    }
}
