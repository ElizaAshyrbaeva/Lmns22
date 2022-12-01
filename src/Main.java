import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            number.add(random.nextInt(1, 100));
        }
        System.out.println(number);
        method(number);
    }

    public static void method(List<Integer> numbers) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        for (Integer integer : numbers) {
            if (integer % 2 == 1) {
                number1.add(integer);
            } else if (integer % 2 != 1) {
                number2.add(integer);
            }
        }
            System.out.println(number1);
            System.out.println(number2);

        }

    }






