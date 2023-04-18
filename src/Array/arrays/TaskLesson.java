package Array.arrays;

public class TaskLesson {
    public void showFirstThreeElements(int[] arrays) {
        for (int i = 0; i < 3; i++) {
            System.out.println(arrays[i]);
        }

    }

    public void showEvenElements(int[] arrays) {
        //Вывести чётные элементы массива по порядку (Вывести только чётные элементы массива по порядку)
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                System.out.println(arrays[i]);
            }
        }
    }

    public void ShowPositiveAndNegativeElements(int[] arrays) {
        int positiveSum = 0;
        int negativeSum = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > 0) {
                positiveSum = positiveSum + 1;
            } else {
                negativeSum = negativeSum + 1;
            }
        }
        System.out.println("+ " + positiveSum);
        System.out.println("- " + negativeSum);
    }
}
