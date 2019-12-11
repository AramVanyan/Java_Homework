public class Task1 {
    public static void printArray(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void fillWithZeros(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=0;
        }
    }
    public static void fillFromOneToThousand(int [] arr){
        for (int i = 0; i <arr.length; i++) {
            arr[i]=i+1;
        }
    }
    public static void fillWithEvenNumbers(byte [] arr){
        int count = 0;
        for (int i = -30; i <=30; i++) {
            if(i!=0 && i%2==0){
                arr[count++] = (byte)i;
            }
        }
    }
    public static void main(String[] args) {

    }
}
