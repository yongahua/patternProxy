package gupao.vip.pattern.proxy.cgproxy;

public class CglibManagerTest {
    public static void main(String[] args) {
        try {
            Customer obj = (Customer) new CglibManager().getInstance(Customer.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
