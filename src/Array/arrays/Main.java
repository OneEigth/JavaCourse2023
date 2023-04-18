package Array.arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        arrays[0]=1;
        arrays[1]=-2;
        arrays[2]=3;
        arrays[3]=-4;
        arrays[4]=5;
        arrays[5]=-6;
        arrays[6]=7;
        arrays[7]=-8;
        arrays[8]=9;
        arrays[9]=-10;

        int[] arrays2 = new int[]{7, -3, 9, -11, 18, 99, 2, 11};

        Tasks tasks=new Tasks();

        TaskLesson taskLesson = new TaskLesson();

        //taskLesson.showFirstThreeElements(arrays);

        //tasks.showFirstThreeElements(arrays);
        //tasks.showFirstHalf(arrays);
        //tasks.showSecondHalf(arrays);
        //tasks.showAllWithoutFirstAndLastElements(arrays);
        //tasks.showLastThreeElements(arrays);
        //tasks.showEvenElements(arrays);
        //tasks.showCountEvenAndOdd(arrays);
        //tasks.showElementsThatAreGreaterThanThePreviousOne(arrays2);
        //tasks.showMaxAndMinElements(arrays2);

        taskLesson.ShowPositiveAndNegativeElements(arrays);
    }
}
