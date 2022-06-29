import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2, 3, 4));
        System.out.println(calculator.sum(2.3f, 3.76f, 4.24f));

        Scanner scanner = new Scanner(System.in);
        int a, b, c, selection;
        System.out.println(" Укажите два любых целых значения: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(" Зделайте свой выбор :");
        System.out.println("1.сумма");
        System.out.println("2.разница");
        System.out.println("3.деление");
        System.out.println("4.умножение");
        selection = scanner.nextInt();
        while(selection > 4){
            System.out.println("неверный выбор операции, повторите снова: ");
            selection = scanner.nextInt();

        }
        if(selection == 1) {
            c = calculator.add(a, b);
            System.out.println("Ответ: " +c);
        }
        else if(selection == 2) {
            c = calculator.sub(a, b);
            System.out.println("Ответ: " +c);
        }
        else if(selection == 3) {
            c = calculator.div(a, b);
            System.out.println("Ответ: " +c);
        }
        else if(selection == 4) {
            c = calculator.multi(a, b);
            System.out.println("Ответ: " +c);
        }

        }

    }
