import java.util.Scanner;
class PrimeFactorsForGivenNumber{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter any number to find its prime factors:- ");
        int n=sc.nextInt();
        int fact=0;
        int start=2;
        int cama=1;
        int check=1;
        
        while(true){
            if(check==1){
                //In first loop it will check given num is prime or not, it it is prime it will print prime factors and exit entire loop.
                //Note:- this block only run one time because any prime num have only two prime factors 1 and itself so this block will print 1 and given num and exit entire loop.
                for(int c=2; c<=(int)Math.sqrt(n); c++){
                    if(n%c==0){
                        fact++;
                    }
                }
                if(fact==0){
                    System.out.print(n+"*1");
                    break;
                }
                check=2;
            }
            //If the given number is not a prime number then run below code till we get all the prime factors of given number:-
            fact=0;
            for(int i=2; i<=(int)Math.sqrt(start); i++){
                //This block will take one by one prime num based on condition
                if(start%i==0){
                    fact++;
                }
            }
            if(fact==0){
                //This block only run if the above start num prime num.
                if(start==n){
                    //When the given num and start value become equal this block will print last start var value and exit entire loop.
                    System.out.print("*"+start);
                    break;
                }else if(n%start==0){
                    //If given num exactly divisble by above start prime num then it will divide the given num with start num and again store result num in to 'n' var and print the Start var value.
                    n=n/start;
                    if(cama==1){
                        System.out.print(start);
                        cama=2;
                    }else{
                        System.out.print("*"+start);
                    }
                }else{
                    //If above start prime num not divide exactly given number, then this block will run and increment the start var value.
                    start++;
                }
            }else{
                //If start var value is not a prime number then this block will run and increment the start var value and continue the loop.
                start++;
            }
        }
    }
}

