package static_;

public class Proxy_ implements Rent{
    private Landlady Landlady;

    public Proxy_(Landlady landlady) {
        Landlady = landlady;
    }

    @Override

    public void toRent() {
        System.out.println("中介租房前操作");
        Landlady.toRent();
        System.out.println("中介租房后操作");
    }
}
