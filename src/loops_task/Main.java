package loops_task;

public class Main {
    public static void main (String[] args){
    int[] numbers = {1, 2, 3, 4, 5, 6};

    int counter = 0;
    int sum = 0;
    for (int num : numbers){
        counter++;
        sum += num;
System.out.println(counter + ") Num is " + num + ", sum is " + sum);

       }
    System.out.println("________________________");
    System.out.println("Sum of numbers is " + sum);
    }
}
