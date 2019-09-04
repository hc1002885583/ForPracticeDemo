public class OverLoadDemo {
    public static void main(String[] args) {
        /*
        方法重载的概念：
        同一个类中的多个方法，出现方法名相同，但是参数列表不同的情况，
        参数列表不同：
        参数个数不同，
        参数的对应数据类型不同
        方法重载与方法的返回类型无关
         */
        //需求：定义方法，分别比较两个int/long/double的数据，判断他们是否相同
        int a = 10;
        int b = 10;
        boolean result = compare(a, b);
        System.out.println(result);
        System.out.println("------------------------");
        long c = 10;
        long d = 10;
        boolean result1 = compare(c, d);
        System.out.println(result1);
        System.out.println("------------------------");
        double e = 10;
        double f = 10;
        boolean result2 = compare(e, f);
        System.out.println(result2);
    }

    public static boolean compare(int a, int b) {
        System.out.println("判断两个int类型的数据是否相同");
        return a == b;
    }

    public static boolean compare(long a, long b) {
        System.out.println("判断两个long类型的数据是否相同");
        return a == b;
    }

    public static boolean compare(double a, double b) {
        System.out.println("判断两个double类型的数据是否相同");
        return a == b;
    }
}
