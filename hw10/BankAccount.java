/*  Team Dank Memes - Ayman Ahmed, Zhixing Che, Alan Chen
    APCS1 pd5
    HW9 - CMYM
    2015-09-29
*/

public class BankAccount {
    
    //instance variables
    String name;
    String pass; 
    Integer pin; 
    Integer accnum; 
    Integer balance; // yadayada necessary string stuff
    
    public BankAccount() {
        name = null;
        pass = null;
        pin = 1000;
        accnum = 100000000;
        balance = 0;
    }
    public void AccountInformation() { //printing account information!
        System.out.println("Name: " + name);
        System.out.println("Password: " + pass);
        System.out.println("Pin Number: " + pin.toString());
        System.out.println("Account Number: " + accnum.toString());
        System.out.println("Current Balance: " + balance.toString());
    }
    
    public void nameChange(String newname) { //changing name (hopefully not used often?!??!?)
        name = newname;
        System.out.println("Your name has been successfully changed to " + newname);  //confirmation of name change
    }
    
    public void passwordChange(String newpass) { //changing password (wow this looks so encrypted what a secure bank!)
        pass = newpass;
        System.out.println("Your password has been successfully changed to " + newpass);  //confirmation of password change
    }
    
    public void pinChange(Integer newpin) { //changing 4 digit pin number
        if (newpin.toString().length() != 4) { //protection against an end user/coder who doesn't know the rules
            pin = 9999;
            System.out.println("Sorry, please try again. Your new pin number must be 4 digits long.");
        }
        else {
            pin = newpin;  
            System.out.println("Your 4 digit pin has been successfully changed to " + newpin.toString()); //confirmation of 4 digit pin change
        }
    }
    
    public void accountnumberChange(Integer newaccnum) { //changing 9 digit account number\
        if (newaccnum.toString().length() != 9) { //more making sure the user knows the rules
            accnum = 999999999;
            System.out.println("Sorry, please try again. Your new account number must be 9 digits long.");
        }
        else {
            accnum = newaccnum;  
            System.out.println("Your 9 digit account number has been successfully changed to " + newaccnum.toString());  //confirmation of account number change
        }
    }
    
    public void deposit(Integer amount) { //depositing money!!! (a rare occurence)
        if (amount < 0) {
            System.out.println("Sorry, you cannot deposit a negative amount of money. Please deposit a positive value!");
        }
        else if (amount == 0) {
            System.out.println("Sorry, you cannot deposit no money. Please deposit a positive value!");
        }
        else {
            balance = balance + amount;
            System.out.println("You have successfully deposited $" + amount.toString() + " to your account. Your current balance is $" + balance.toString());
        }

    }
    
    public void withdraw(Integer amount) { //withdrawing money (an all too common occurence)
        if (balance - amount < 0) {
            System.out.println("You cannot take out this amount of money, or else your balance goes below 0. The maximum you can take out is " + balance);
        }
        else {
            balance = balance - amount;
            System.out.println("You have successfully withdrawn $" + amount.toString() + " from your account. Your current balance is $" + balance);
        }
        
    }
    
    public boolean authenticate(String uname, String apass) {
        if (uname == name && apass == pass) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        BankAccount info = new BankAccount();
        
        info.deposit(220);
        info.withdraw(500);
        info.pinChange(2323);
        info.accountnumberChange(123653834);
        info.passwordChange("supersecretbankpassword");
        info.nameChange("John Smith");
        
        
    }
    
}

