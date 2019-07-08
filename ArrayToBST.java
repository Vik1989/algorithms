package InterviewMCQs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayToBST {

    Node root;

    class Node{

        Integer data;
        Node left = null;
        Node right = null;

        Node(Integer data){
            this.data = data;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer i = Integer.parseInt(br.readLine());

        Integer[] givenArray = new Integer[i];
        String[] arrayElements = br.readLine().split(" ");

        for(int k = 0; k < i; k++){
            givenArray[k] = Integer.parseInt(arrayElements[k]);
        }
        Arrays.sort(givenArray);

        ArrayToBST arrayToBST = new ArrayToBST();

        arrayToBST.root = arrayToBST.convertToBST(givenArray,0, givenArray.length-1);

        System.out.println(maxDepth(arrayToBST.root));

    }

    static int maxDepth(Node node)
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    private Node convertToBST(Integer[] givenArray, int startIndex, int endIndex) {

        if(startIndex > endIndex){
            return  null;
        }

        int mid = (startIndex + endIndex)/2;

        Node root = new Node(givenArray[mid]);

        root.right = convertToBST(givenArray,mid+1,endIndex);
        root.left = convertToBST(givenArray,startIndex, mid-1);

        return root;
    }
}
