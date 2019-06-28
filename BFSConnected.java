package com.vikash.practice.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFSConnected {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //enter the number of vertices
        System.out.println("Enter the number of vertices");

        int vertices = 0;

        try {
            vertices = Integer.parseInt(bufferedReader.readLine());

            int[][] matrix = new int[vertices][vertices];
            System.out.println("Enter the adjacency matrix");

            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    matrix[i][j] = Integer.parseInt(bufferedReader.readLine());
                }
            }

            System.out.println("Enter the source vertex");

            int source = 0;

            source = Integer.parseInt(bufferedReader.readLine());
            if (source > vertices) {
                throw new IllegalArgumentException("Source cannot be greater than the number of vertices");
            }
            //call the BFS method

            boolean connected = bfsConnected(matrix, source);

            System.out.println("The graph is connected : "+ connected);

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean bfsConnected(int[][] matrix, int source) {

        Queue<Integer> vertices = new LinkedList<Integer>();

        HashSet<Integer> visited = new HashSet<Integer>();

        vertices.add(source);

        visited.add(source);

        while (!vertices.isEmpty()){

            System.out.println(vertices.peek());

            int startNode = vertices.poll();

            for(int i = 0; i < matrix.length ; i++){

                if(matrix[startNode][i] == 1){

                    if(!visited.contains(i)){

                        visited.add(i);

                        vertices.add(i);

                    }
                }
            }
        }

        if(visited.size() == matrix.length){

            return true;
        }

        return false;
    }
}