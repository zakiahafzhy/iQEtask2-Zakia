package simple_code;

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello World!");
        User newUser = new User();

        newUser.setNama("Zakia Hafzhy");
        newUser.setNoHP("0123456789");

        System.out.println(newUser.getInfo());
    }
}
