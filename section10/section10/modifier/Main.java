package section10.modifier;

public class Main {
    public static void main(String[] args) {
        Account miemie = new Account("miemie");
        miemie.deposit(10000000);
        miemie.withdraw(1000000000);
        miemie.deposit(1000000000);
        miemie.calculateBalance();

        System.out.println(miemie.getBalance());
    }
}
