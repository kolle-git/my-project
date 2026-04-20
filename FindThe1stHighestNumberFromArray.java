public class FindThe1stHighestNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        
        int max = arr[0]; // ✅ initialize with first element
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println(max); // 20
    }
}