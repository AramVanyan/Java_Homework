public class Task2 {
    public static int addTwoNumbers(int a,int b){
        return a+b;
    }
    public static double multiplicationOfTwoDoubles(double a,double b){
        return a*b;
    }
    public static void printIfGreater(float a,float b){
        System.out.println(a>b?"Yes":"No");
    }
    public static void printTheGreatest(long a,long b,long c){
        System.out.println(a>b?(a>c?a:c):(b>c?b:c));
    }

    public static void main(String[] args) {

    }
}
