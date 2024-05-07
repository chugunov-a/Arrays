
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        {
            int[] payments = {100000, 150000, 130000, 126700, 113900};
            int sum = 0;
            for (int i = 0; i < payments.length; i++) {
                sum += payments[i];
                if (i == payments.length - 1) {
                    System.out.println(" Сумма трат за меясц составила " + sum + " рублей");
                }
            }
        }
        System.out.println("Задание 2");
        {
            int[] payments = {100000, 150000, 130000, 126700, 113900};
            int minPayment = 0;
            int maxPayment = 0;
            for (final int current : payments) {
                if (current > maxPayment) {
                    maxPayment = current;
                }
                for (final int current2 : payments) {
                    if (current2 < current) {
                        minPayment = current2;
                    }
                }
            }
            System.out.println(" Минимальная сумма трат за неделю составила " + minPayment +
                    ". Максимальная сумма трат за неделю составила " + maxPayment + " рублей");
        }
        System.out.println("Задание 3");
        {
            int[] payments = {100000, 150000, 130000, 126700, 113999};
            double sum = 0;
            int avg;
            double avg1;
            for (int i = 0; i < payments.length; i++) {
                sum += payments[i];
                if (i == payments.length - 1) {
                    if (sum % payments.length == 0) {
                        avg = (int) (sum / payments.length);
                        System.out.println(" Средняя сумма трат за месяц составила " + avg + " рублей");
                    } else {
                        avg1 = sum / payments.length;
                        System.out.println(" Средняя сумма трат за месяц составила " + avg1 + " рублей");
                    }
                }
            }
        }
        System.out.println("Задание 4");
        {
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i < reverseFullName.length && i > -1; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
    }
}
