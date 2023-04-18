package Array.arrays;

public class Tasks {
    public void showFirstThreeElements(int[] arrays) {
        //Вывести первые 3 элемента массива (Вывести первые 3 элемента массива используя цикл for).
        int i = 0;
        for (i = 0; i <= 2; i++) {
            System.out.println(arrays[i]);
        }
    }

    public void showFirstHalf(int[] arrays) {
        //Вывести первую половину массива (Вывести первую первую половину элементов массива при помощи цикла for).
        //Реализация задачи должна работать при любом чётном количестве элементов.
        int i =0;
        for (i = 0; i < arrays.length/2; i++) {
            System.out.println(arrays[i]);
        }
    }

    public void showSecondHalf(int[] arrays){
        //Вывести вторую половину массива (Вывести вторую половину элементов массива при помощи цикла for).
        //Реализация задачи должна работать при любом чётном количестве элементов.
        int i=0;
        for (i = arrays.length/2; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    public void showAllWithoutFirstAndLastElements(int[]arrays){
        //Вывести все элементы кроме первого и последнего.
        for (int i = 1; i < arrays.length-1; i++) {
            System.out.println(arrays[i]);
        }
    }

    public void showLastThreeElements(int[] arrays){
        //Вывести последние 3 элемента массива (к примеру для массива [7, -3, 9, -11, 18, 99, 2, 11]
        // вывод должен быть таким: 99, 2, 11)
        for (int i = arrays.length-3; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    public void showEvenElements(int[] arrays){
        //Вывести чётные элементы массива по порядку (Вывести только чётные элементы массива по порядку)
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2==0){
                System.out.println(arrays[i]);
            }
        }
    }

    public void showCountEvenAndOdd (int[] arrays){
        //Вывести количество положительных и отрицательных элементов (Необходимо определить количество положительных и
        //отрицательных элементов в массиве и вывести его). В реализации задачи понадобится определить 2 переменные для
        //хранения количества элементов: Одна переменная для хранения количества положительных элементов, допустим
        //positiveCount.
        //Вторая для хранения количества отрицательных элементов, допустим negativeCount. Названия переменных можно
        //выбирать на своё усмотрение.
        int positiveCount=0;
        int negativeCount=0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > 0) {
                positiveCount = positiveCount +1;
            } else {
                negativeCount = negativeCount +1;
            }
        }
        System.out.println("колличество положительных: "+positiveCount);
        System.out.println("колличество отрицательных: "+negativeCount);
    }

    public void showElementsThatAreGreaterThanThePreviousOne (int[] arrays){
        //Вывести элементы массива которые больше предыдущего (Необходимо вывести все
        // элементы массива которые больше чем впереди стоящий). Для массива [7, -3, 9, -11, 18, 99, 2, 11]
        // вывод должен быть таким: 9, 18, 99, 11.

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i+1]>arrays[i]){
                System.out.println(arrays[i+1]);
            }
        }
    }

    public void showMaxAndMinElements(int[] arrays){
        int max = 0;
        int min = 0;
        for (int i = 0; i <arrays.length ; i++) {
            if(arrays[i]<min){
                min=arrays[i];
            }else if(arrays[i]>max) {
                max=arrays[i];
            }
        }
        System.out.println("максимальный элемент: "+max);
        System.out.println("минимальный элемент: "+min);
    }
}



