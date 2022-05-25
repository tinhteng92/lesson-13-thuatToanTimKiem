package Optional2;

import java.util.Scanner;

public class TimKiemNhiPhanBangDeQuy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[]arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "]");
            arr[i]= scanner.nextInt();
        }
        sortArr(arr);
        for(int a : arr){
            System.out.println(a);
        }

        System.out.println("Nhập số cần tìm: ");
        int value = scanner.nextInt();

        int result = 


    }
    public static void sortArr(int[]arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (right > left) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (value > arr[mid]) {
                return binarySearch(arr, left = mid + 1, right, value);
            } else {
                return binarySearch(arr, left, right = mid - 1, value);
            }

        }
        return -1;
    }
}
