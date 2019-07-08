package InterviewMCQs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HackerEarthArray2 {

    public static void main(String args[] ) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer noOfTestCases = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < noOfTestCases ; i++) {

            String range = br.readLine();
            Integer startIndex = Integer.parseInt(range.split(" ")[0]);
            Integer endIndex = Integer.parseInt(range.split(" ")[1]);

            int primeCount = 0;
            int compositeCount = 0;

            for(int j = startIndex; j <= endIndex; j++){
                if(findifPrime(startIndex++)){
                    ++primeCount;
                }else{
                    ++compositeCount;
                }

            }
            System.out.println(primeCount*compositeCount);
        }
    }

    private static boolean findifPrime(Integer number) {

        BigInteger bigInteger = BigInteger.valueOf(number);

        return bigInteger.isProbablePrime(number);
    }
}

