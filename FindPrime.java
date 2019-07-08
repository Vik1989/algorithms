package InterviewMCQs;

public class FindPrime {

    public static void main(String[] args){

         int num = 10;

         findIfPrime(num);
    }

    private static void findIfPrime(int num) {

       for(int i =2; i<= num/2; i++) {

           if(num%i!=0){
               System.out.println("The number is prime");
           }
       }
    }
}
