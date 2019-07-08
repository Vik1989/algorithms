package InterviewMCQs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class HackerEarthArray1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] count = br.readLine().split(" ");

        Integer colorCount = Integer.parseInt(count[1]);
        String[] map = br.readLine().split(" ");

        Integer[] streetMap = new Integer[map.length];
        Integer k = 0;

        for (String s: map) {

            streetMap[k++] = Integer.parseInt(s);
        }

        k = null;

        Integer usedColors = 0;

        //from first colorCount indexes. how many colors are missing
        for (int i =0 ; i < Integer.parseInt(count[0]); i++){

            if(i + colorCount < streetMap.length){
                if(streetMap[i+colorCount] != streetMap[i] && streetMap[i]!=0 && streetMap[i+colorCount]!=0){
                    System.out.println("-1");
                    return;
                }
            }

            if(streetMap[i]!=0)
            usedColors++;
        }

        if(colorCount - usedColors == colorCount) {
            numWays(colorCount);
        }else if(colorCount - usedColors == 0){
            System.out.println("-1");
        }else {
            numWays(colorCount-usedColors);
        }
    }

    private static void numWays(Integer n) {

        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact.mod(BigInteger.valueOf(10^9+7)));
    }
}
