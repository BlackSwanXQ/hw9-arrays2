public class Main {
    public static void main(String[] args) {
        task1();
//task4
        System.out.println("task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseFullName);
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int arr[] = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        int sumMin = arr[0];
        int sumMax = 0;
        double averageAmount = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > sumMax) {
                sumMax = arr[i];
            }
            if (arr[i] < sumMin) {
                sumMin = arr[i];
            }
        }
//task1
        System.out.println("task1");
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
//task2
        System.out.println("task2");
        System.out.println("Минимальная сумма трат за день составила " + sumMin + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + sumMax + " рублей.");
//task3
        System.out.println("task3");
        averageAmount = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей.");
    }
}