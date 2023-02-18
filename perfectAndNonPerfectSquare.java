import java.util.Scanner;
class perfectAndNonPerfectSquare{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter any number to find its perfect square:- ");
        int userInput=sc.nextInt();
        int start =1;
        int square=0;
        
        while(true){
            square=start*start;
            if(square==userInput){
                //If the given number is perfect square root this block will print perfect square and break the loop.
                System.out.print("The perfect sqare of "+userInput+" is:- "+start);
                break;
            }else if(square>userInput){
                /*
                  This block will run when given number is a non perfect square root and give non perfect square to given number and exit loop.

                  This block will find non perfect square root for given number.
                  example:- √10 
                  steps:-
                    4-(16-10)/2*4
                    4-6/8
                    3.25
                    non perfect square of √10 is ~ 3.25
                */
                float remaining=(float)(square-userInput)/(2*start);
                float finalSquare=start-remaining;
                System.out.print("The non perfect sqare of "+userInput+" is:- "+finalSquare);
                break; 
            }
            start++;
        }
    }
}
