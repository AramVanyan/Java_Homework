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
    public static void fillWithOddNumbers(short [] arr){
        int count = 0;
        for (int i = 0; i <300; i++) {
            if(i%2!=0){
                arr[count++] = (short)i;
            }
        }
    }
    public static void printMultiplesOfFive(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%5==0) System.out.println(arr[i]);
        }
    }
    public static void printGreaterThan24_56(double [] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>24.56){
                System.out.println(arr[i]);
            }
        }
    }
    public static void printGreater35_56_OR_Less_minus34_655(float [] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>35.56||arr[i]<-34.655){
                System.out.println(arr[i]);
            }
        }
    }
    public static void sortInAscendingOrder(double [] arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]) {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void sortInDescendingOrder(double [] arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]<arr[j+1]) {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void numberOfa(String string){
        int count = 0;
        for (int i = 0; i <string.length() ; i++) {
            if(string.charAt(i)=='a') count++;
        }
        System.out.println(count);
    }
    public static void if_b_IsPresent(String string){
        boolean is_b_present = false;
        for (int i = 0; i <string.length() ; i++) {
            if(string.charAt(i)=='b'){
                is_b_present = true;
                break;
            }
        }
        System.out.println(is_b_present?"Yes":"No");
    }
    public static void numberOfPowersOfTwo(int [] arr){
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            boolean result = arr[i] > 0 && ((arr[i] & (arr[i] - 1)) == 0);
            if(result) count++;
        }
        System.out.println(count);
    }
}
