package InterviewMCQs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerEarth3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String count = br.readLine();

        String line = br.readLine();
        String[] lineHeight = line.split(" ");

        int groupCount = 0;
        int elementsProcessed = 0;
        for(int i = 0; i < lineHeight.length-1; i++){

            if(Integer.parseInt(lineHeight[i+1])<Integer.parseInt(lineHeight[i])){

                groupCount++;
            }
            ++elementsProcessed;
        }
        if(elementsProcessed < lineHeight.length && Integer.parseInt(lineHeight[lineHeight.length-1]) - Integer.parseInt(lineHeight[lineHeight.length-2]) < 0){
            groupCount ++;
        }
        if(Integer.parseInt(count)>0 && groupCount == 0)
            groupCount++;

        System.out.println(groupCount);
    }
}

