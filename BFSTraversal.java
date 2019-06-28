package com.vikash.practice.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

    public static void main(String[] args){

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //enter the number of vertices
        System.out.println("Enter the number of vertices");
        int vertices = 0;

        try{
            vertices = Integer.parseInt(bufferedReader.readLine());

            int[][] matrix = new int[vertices][vertices];
            System.out.println("Enter the adjacency matrix");

            for(int i = 0; i < vertices; i++){
                for(int j = 0; j < vertices; j++){
                    matrix[i][j] = Integer.parseInt(bufferedReader.readLine());
                }
            }

            System.out.println("Enter the source vertex");

            int source = 0;

            source = Integer.parseInt(bufferedReader.readLine());
            if(source>vertices){
                throw new IllegalArgumentException("Source cannot be greater than the number of vertices");
            }
            //call the BFS method

            breadthFirstSearch(matrix, source);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void breadthFirstSearch(int[][] matrix, int source) {

        HashSet<Integer> visited = new HashSet<Integer>();

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(source);
        visited.add(source);
        while (!queue.isEmpty()) {

            System.out.println(queue.peek());

            int x = queue.poll();

            for (int i = 0; i < matrix.length; i++) {

                if(matrix[x][i] == 1){

                    if(!visited.contains(i)) {
                        queue.add(i);
                        visited.add(i);
                    }

                }
            }
    }
}
}
