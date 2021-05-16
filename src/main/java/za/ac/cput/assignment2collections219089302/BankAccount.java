/*
BankAccount.java
This is a class that contains the constructors, getters and setters for the bank account object.
Dinelle Kotze
219089302
16 May 2021
 */

package za.ac.cput.assignment2collections219089302;

import java.util.Objects;

public class BankAccount
{
    private String accountHolder, bank, branch, accountType, accountNumber;

    public BankAccount(String accountHolder, String bank, String branch, String accountType, String accountNumber)
    {
        this.accountHolder = accountHolder;
        this.bank = bank;
        this.branch = branch;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder()
    {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder)
    {
        this.accountHolder = accountHolder;
    }

    public String getBank()
    {
        return bank;
    }

    public void setBank(String bank)
    {
        this.bank = bank;
    }

    public String getBranch()
    {
        return branch;
    }

    public void setBranch(String branch)
    {
        this.branch = branch;
    }

    public String getAccountType()
    {
        return accountType;
    }

    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    @Override
    public String toString()
    {
        return "BankAccount {" +
                "accountHolder = '" + accountHolder + '\'' +
                ", bank = '" + bank + '\'' +
                ", branch = '" + branch + '\'' +
                ", accountType = '" + accountType + '\'' +
                ", accountNumber = '" + accountNumber + '\'' +
                '}';
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNumber.equals(that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}
