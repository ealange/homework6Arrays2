public class Main {
    public static void main(String[] args) {
        //task1
        int[] arr = generateRandomArray();
        int sumOfMonth = 0;
        for (int i : arr) {
            sumOfMonth += i;
        }

        System.out.println("Сумма трат составила " + sumOfMonth + " рублей.");

        //task2
        int minPerDay = arr[0];
        int maxPerDay = arr[0];
        for (int i : arr) {
            if (minPerDay > i) {
                minPerDay = i;
            }
            if (maxPerDay < i) {
                maxPerDay = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPerDay + " рублей. Максимальная сумма трат за день составила " + maxPerDay + " рублей");

        //task3
        double averageOfMonth=sumOfMonth/30;
        System.out.println("Средняя сумма трат за месяц составила " + averageOfMonth + " рублей.");

        //task4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=reverseFullName.length-1; i >= 0; i--)
              {
                  System.out.print(reverseFullName[i]);

        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
