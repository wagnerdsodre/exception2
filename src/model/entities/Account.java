package model.entities;

import model.exception.customException;

public class Account {
 private Integer number;
 private String holder;
 private Double balance;
 private Double withdrawLimit;

 
 public Account() {
	 
 }
 
public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
	this.number = number;
	this.holder = holder;
	this.balance = balance;
	this.withdrawLimit = withdrawLimit;
}

public Integer getNumber() {
	return number;
}

public void setNumber(Integer number) {
	this.number = number;
}

public String getHolder() {
	return holder;
}

public void setHolder(String holder) {
	this.holder = holder;
}

public Double getBalance() {
	return balance;
}

public Double getWithdrawLimit() {
	return withdrawLimit;
}


public void deposit(double amount) {
	
	balance += amount;
	
}


 public void withdraw (double value) {
	 
	 if (!(value >= getBalance() || value > withdrawLimit)) {
	 balance -= value;
	 }
	 else if((value > getBalance())) {
		 throw new customException("Não há saldo suficiente para o saque: " + "O valor é superior ao saldo:"+ getBalance());
	 }else {
		 throw new customException("O valor do saque deve ser inferior a: " + withdrawLimit);
	 }
}
 
  
 
 @Override
 public String toString() {
	 StringBuilder sb = new StringBuilder();
	 sb.append("\n*******************");
	 sb.append("\n"+getHolder()+" - Saldo:"+ balance);
	 
	 return sb.toString();
 }
 
 

}
