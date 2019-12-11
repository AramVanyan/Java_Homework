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
    public static void printIfMale(Human human){
        if(human.getGender()=="male") System.out.println("Yes");
        else System.out.println("No");
    }
    public static String returnLastNameOfTheOldest(Human human1,Human human2,Human human3){
        int age1 = human1.getAge();
        int age2 = human2.getAge();
        int age3 = human3.getAge();
        return age1>age2?(age1>age3?human1.getLastName():human3.getLastName()):(age2>age3?human2.getLastName():human3.getLastName());
    }
    public static void printLastNamesTogether(Human human1,Human human2){
        System.out.println(human1.getLastName() + human2.getLastName());
    }
    public static void printIfTrue(Human human,boolean bool){
        System.out.println(bool?human.getFirstName():human.getLastName());
    }
    public static int printMaxElement(int []arr){
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
