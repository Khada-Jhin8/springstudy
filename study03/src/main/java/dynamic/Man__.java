package dynamic;

public class Man__ {
    public static void main(String[] args) {
        Landlady_ landlady = new Landlady_();
        Myproxy myproxy = new Myproxy(landlady);
        RentInterface proxy = (RentInterface) myproxy.getProxy();
        proxy.rent();
        Uitls.getProxyClass("Proxy$0", landlady.getClass());
    }
}


