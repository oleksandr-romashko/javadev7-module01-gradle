package global.goit.edu.romashko.printer;

public class Main {
    public static void main(String[] args) {
        final String name = "Oleksandr";
        final String lastName = "Romashko";

        User user = new User(name, lastName);

        UserPrinter printer = new UserPrinter();
        printer.printName(user);
    }
}
