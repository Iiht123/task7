/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p;
import java.util.Random;

public class ForestGenerator {
    public static char[][] generateForest(int rows, int cols) {
        char[][] forest = new char[rows][cols];
        Random random = new Random();

        // Populate the forest with open spaces and trees
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (random.nextDouble() < 0.7) {
                    forest[i][j] = '.'; // Open space
                } else {
                    forest[i][j] = 'T'; // Tree
                }
            }
        }

        // Place the player 'P' at a random empty location
        int playerRow, playerCol;
        do {
            playerRow = random.nextInt(rows);
            playerCol = random.nextInt(cols);
        } while (forest[playerRow][playerCol] != '.'); // Repeat until an empty location is found
        forest[playerRow][playerCol] = 'P'; // Place the player

        return forest;
    }

    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        char[][] forest = generateForest(rows, cols);

        // Print the generated forest
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(forest[i][j] + " ");
            }
            System.out.println();
        }
    }
}
