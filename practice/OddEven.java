package practice;



// write program to sum odd integers in an array

public class OddEven {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int sum = 0;

        for (int i : arr) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

}






