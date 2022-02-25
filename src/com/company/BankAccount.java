package com.company;

public class BankAccount {
        double Amount;

        public double getAmount() {
            return Amount;
        }

        public void deposit(double sum){
            Amount = Amount + sum;
        }

        public void WithDraw(double sum) throws LimitException {
            if (sum > Amount){
                throw new LimitException("У вас не достаточно средств ", getAmount() );
            } else {
                Amount = Amount - sum;
            }
        }
}
