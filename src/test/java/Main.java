import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        BankAccount bank = new BankAccount(1, "PKO BP", 5261283, 63363);
        BankAccount bank1 = new BankAccount(2, "MBank", 7128191, 13865);
        BankAccount bank2 = new BankAccount(3, "Santander", 5238653, 614253);
        BankAccount bank3 = new BankAccount(4, "Zywnosci", 8634251, 751342);

        User klient = new User("Jan", "Kowalski", 72, bank);
        User klient1 = new User("Piotr", "Nowak", 84, bank1);
        User klient2 = new User("Krzysztof", "Kwiatkowski", 32, bank2);
        User klient3 = new User("Ola", "Lewandowska", 27, bank3);
        User klient4 = new User("Bartosz", "Kowalski", 15, bank2);


        List<User> listaklientow = new ArrayList<>();
        listaklientow.add(klient);
        listaklientow.add(klient1);
        listaklientow.add(klient2);
        listaklientow.add(klient3);
        listaklientow.add(klient4);


        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("listaklientow.json"), listaklientow);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            System.out.println("Podaj nazwisko klienta lub wpisz EXIT");

            Scanner scanner = new Scanner(System.in);

            String login = scanner.nextLine();

            String lastName = login;

            switch (lastName) {


                case "Kowalski":

//
                    User.getLastName();
                    User.getLastName().equals(User.getLastName());


                    if (true)
                        System.out.println("Więcej niż jeden rekord. Podaj imię");
                    String imieduplikatu = scanner.nextLine();

                    String name = imieduplikatu;

                    switch (name) {

                        case "Jan":
                            System.out.println("Imię: " + klient.getName());
                            System.out.println("Nazwisko: " + klient.getLastName());
                            System.out.println("Wiek: " + klient.getAge());
                            System.out.println("Dane Bankowe: " + klient.getBank());

                            break;

                        case "Bartosz":
                            System.out.println("Imię: " + klient4.getName());
                            System.out.println("Nazwisko: " + klient4.getLastName());
                            System.out.println("Wiek: " + klient4.getAge());
                            System.out.println("Dane Bankowe: " + klient4.getBank());

                            break;
                    }

                    break;


                case "Nowak":
                    System.out.println("Imię: " + klient1.getName());
                    System.out.println("Nazwisko: " + klient1.getLastName());
                    System.out.println("Wiek: " + klient1.getAge());
                    System.out.println("Dane Bankowe: " + klient1.getBank());

                    break;

                case "Kwiatkowski":
                    System.out.println("Imię: " + klient2.getName());
                    System.out.println("Nazwisko: " + klient2.getLastName());
                    System.out.println("Wiek: " + klient2.getAge());
                    System.out.println("Dane Bankowe: " + klient2.getBank());

                    break;

                case "Lewandowska":
                    System.out.println("Imię: " + klient3.getName());
                    System.out.println("Nazwisko: " + klient3.getLastName());
                    System.out.println("Wiek: " + klient3.getAge());
                    System.out.println("Dane Bankowe: " + klient3.getBank());

                    break;


                case "EXIT":
                    return;


                default:
                    System.out.println("Nie ma takiego klienta");
            }

        }


    }
}