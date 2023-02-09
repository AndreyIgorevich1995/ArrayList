import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию:");
            String operationNumber = scanner.nextLine();
            if (operationNumber.equals("1")) {
                System.out.println("Какую покупку хотите добавить?");
                String newPurchase = scanner.nextLine();
                list.add(newPurchase);
                System.out.println("Итого в списке покупок: " + list.size());
            } else if (operationNumber.equals("2")) {
                System.out.println("Список покупок:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }
            } else if (operationNumber.equals("3")) {
                System.out.println("Список покупок:");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + 1 + ". " + list.get(i));
                }
                System.out.println("Какую хотите удалить? Введите номер или название");
                String delete = scanner.nextLine();
                int a;
                try {
                    a = Integer.parseInt(delete) - 1;
                    list.remove(a);
                } catch (NumberFormatException q) {
                    list.remove(delete);
                }
            } else if (operationNumber.equals("4")) {
                System.out.println("Введите текст для поиска:");
                String queryLower = scanner.nextLine().toLowerCase();
                System.out.println("Найдено:");
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).toLowerCase().contains(queryLower)) {
                        System.out.println(i + 1 + ". " + list.get(i));
                    }
                }
            }
        }
    }
}
