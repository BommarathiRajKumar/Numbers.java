import java.util.Scanner;
class PrimeFactorsForGivenNumber{
    static Scanner sc=new Scanner(System.in);

    static void PrimeFactors(int n){
        int fact=0;
        int cama=1;
        for(int j=2; j<=(int)Math.sqrt(n); j++){
            if(n%j==0){
                fact++;
            }
            if(fact==1){
                break;
            }
        }
        if(fact==0){
            System.out.print(n);
            return;
        }
        
        for(int i=2; i<=n; i++){
            while(n%i==0){
                n = n/i;
                if(cama==1){
                    System.out.print(i);
                    cama=2;
                }else{
                    System.out.print("*"+i);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Please enter eny number to find its prime factors:- ");
        PrimeFactors(sc.nextInt());
    }
}
