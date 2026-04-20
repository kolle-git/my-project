public class ArrayContainsAValue{
    public static void main(String[] args){
        int[] arr = {10, 20, 30};
        int value = 20;
        boolean isContainsValue =  containsValue(arr, value);
        System.out.println(isContainsValue);//true
    }
    private static boolean containsValue(int[] arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }
}