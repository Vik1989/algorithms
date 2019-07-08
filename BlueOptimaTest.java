package InterviewMCQs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BlueOptimaTest {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number of test cases");
        Integer testCount = Integer.parseInt(br.readLine());

        System.out.println("Enter the number of pencils");
        Integer pencilCount = Integer.parseInt(br.readLine());

        System.out.println("Enter the size of pencils");
        String sizes = br.readLine();

        String[] sizeArray = sizes.split(" ");

        String pairs = findPairs(sizeArray);

        System.out.println(pairs);
    }

    private static String findPairs(String[] sizeArray){

        String pairs = null;

        Arrays.sort(sizeArray);

        int pairCount = 0;
        for(int i =0; i < sizeArray.length; i++){

            for(int l =i+1; l < sizeArray.length; l++){
                if(Integer.parseInt(sizeArray[l] )/2> Integer.parseInt(sizeArray[i])){
                    pairCount++;
                    break;
                }
            }

        }
        String remainingPencilCount = String.valueOf(sizeArray.length - 2*pairCount);
        return pairCount + " "+ remainingPencilCount;
    }
}
