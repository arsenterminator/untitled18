package com.company;

public class Main {
    public static void main(String[] args)  {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(20000);
        System.out.println("Ваш счет пополнился. Ваш текущий счет - " + bankAccount.Amount);

        while (true){
            try {
                System.out.println("Вы сняли со счета деньги. Ваш текущий счет - " + bankAccount.getAmount());
                bankAccount.WithDraw(6000);
            } catch (LimitException limitException) {
                System.out.println(limitException.getMessage());
                System.out.println("Ваш текущий счет - " + bankAccount.Amount);
                System.out.println("Мы сняли и всю ту оставшуюся сумму с вашего счета в размере - " + bankAccount.Amount + " сом");
                try {
                    bankAccount.WithDraw(bankAccount.Amount);
                    System.out.println(bankAccount.Amount);
                } catch (LimitException e) {
                    System.out.println("Круто");
                }
                break;
            }
        }
    }
}
