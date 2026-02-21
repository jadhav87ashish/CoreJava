package Tut16Encapsulation;

public class AccountMain {
    public static void main(String[] args) {

        Account acc = new Account();
        acc.setAccno(1001);
        System.out.println(acc.getAccno());

        Account userName = new Account();
        userName.setName("Ashish Jadhav");
        System.out.println(userName.getName());


        Account balance = new Account();
        balance.setAmount(50000.50);
        System.out.println(balance.getAmount());

    }
}
