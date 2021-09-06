import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<User> users = createUsers();
        float total = 0f, avg = 0f;
        Scanner sc = new Scanner(System.in);
        
        for (User user : users) {
            System.out.printf("%s'in harcamalari:\n", user.name);
            float input = 0;
            while(input != -1) {
                System.out.printf("\tHarcamayi gir (%s): ", user.name);
                input = readInput(sc);
                user.value += input;
            }
            total += user.value;
            System.out.printf("%s'in toplam harcamasi: %.2f\n", user.name, user.value);
        }

        avg = total / (float) users.size();

        System.out.printf("\nToplam harcama: %.2f\nKisi basina dusen harcama: %.2f\n\n", total, avg);

        List<User> hta = new ArrayList<>(); // higher than avg

        for (User user : users) {
            if (user.value > avg) {
                hta.add(user);
                continue;
            }
            float gap = avg - user.value;
            System.out.printf("%s\t--%.2f-->\tpool\n", user.name, gap);
        }

        for (User user : hta) {
            float gap = user.value - avg;
            System.out.printf("pool\t--%.2f-->\t%s\n", gap, user.name);
        }
    }

    static List<User> createUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Kadir"));
        users.add(new User("Sinan"));
        users.add(new User("Furkan"));
        users.add(new User("Yusuf"));

        return users;
    }

    static float readInput(Scanner sc) {
        return sc.nextFloat();
    }
}

class User {
    String name;
    float value;

    public User(String name) {
        this.name = name;
    }
} 
