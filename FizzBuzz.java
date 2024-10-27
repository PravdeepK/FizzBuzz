//assignment 1 task 1

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) { // create loop that prints from 1 to 50

            /* first checks if number can be divided by both 5 and 3 (needs to do
            this one first or else it will just check if its divisible by 3 or 5 and not
            check for both*/
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            }
            //then checks if it is only divisible by 3
            else if (i % 3 == 0){
                System.out.println("fizz");
            }
            //lastly checks if its divisible by 5
            else if (i % 5 == 0){
                System.out.println("buzz");
            }
            //if its neither it prints out just the normal number
            else {System.out.println(i);}
        }
    }
}

