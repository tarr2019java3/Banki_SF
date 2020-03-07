public class User {


    private String name;
    private String lastName;
    private int age;
    private BankAccount bank;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BankAccount getBank() {
        return bank;
    }

    public void setBank(BankAccount bank) {
        this.bank = bank;
    }

    public User(String name, String lastName, int age, BankAccount bank) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Klient: " +
                " IMIĘ " + name +
                ", NAZWISKO " + lastName  +
                ", WIEK " + age +
                ", BANK " + bank +
                '.';
    }

}









