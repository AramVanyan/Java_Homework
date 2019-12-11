public class Main {
    public static void main(String[] args) {
        System.out.println(Task2.addTwoNumbers(4,5));
        System.out.println(Task2.multiplicationOfTwoDoubles(4.5,5.67));
        Task2.printIfGreater(1.234f,3.567f);
        Task2.printTheGreatest(45l,1234l,456l);
        Task2.printIfMale(new Human("Hayk","Hakobyan","male",45));
        System.out.println(Task2.returnLastNameOfTheOldest(
                new Human("Hayk","Hakobyan","male",45),
                new Human("Vardan","Ohanyan","male",25),
                new Human("Anna","Harutyunyan","female",19)
        ));
        Task2.printLastNamesTogether(
                new Human("Hayk","Hakobyan","male",45),
                new Human("Vardan","Ohanyan","male",25)
        );
        Task2.printIfTrue(new Human("Hayk","Hakobyan","male",45),true);
        System.out.println(Task2.printMaxElement(new int []{1,4,2,10,34,0}));
        System.out.println(Task2.printIndexOfMinimal(new float[]{1.234f,2.354f,0.124f,3.456f}));
        Task2.sortByIncreaseOfAge(
                new Human[]{
                        new Human("Hayk","Hakobyan","male",45),
                        new Human("Vardan","Ohanyan","male",25),
                        new Human("Anna","Harutyunyan","female",19),
                        new Human("Marat","Hovsepyan","male",21)

                }
        );

    }
}
