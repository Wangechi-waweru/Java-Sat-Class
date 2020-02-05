package Inheritance;

//Parent/Main Class
public class Parent {
    public String last_name = "Wakanda";
    public String Country = "Kenya";
    public String color = "Darkskin";
    private int bankAccount = 500000;

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void getDetails(){
        System.out.println(last_name);
        System.out.println(Country);
        System.out.println(color);
    }

}
/*Child class
To inherit use the key word extends
 */
class Child extends Parent{
    int age;
    public Child(int myage){
        age = myage;
    }

    public String school = "City primary";
}
class Myclass{
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child(13);

        System.out.println(p1.last_name);
        System.out.println(c1.last_name);

        System.out.println(c1.school);
        p1.getDetails();
        c1.getDetails();

        System.out.println(c1.age);

        int acc = p1.getBankAccount();
        System.out.println(acc);

        p1.setBankAccount(1000000);

        int acc1 = p1.getBankAccount();
        System.out.println(acc1);

    }
}