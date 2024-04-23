/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p;

/**
 *
 * @author HIIT
 */
public class PlayerMovement {
  public static void movePlayer(char[][] forest, char direction) {
        // Find the player's current position
        int playerRow = -1;
        int playerCol = -1;
        for (int i = 0; i < forest.length; i++) {
            for (int j = 0; j < forest[i].length; j++) {
                if (forest[i][j] == 'P') {
                    playerRow = i;
                    playerCol = j;
                    break;
                }
            }
            if (playerRow != -1) {
                break;
            }
        }

        // Determine the new position based on the direction
        int newPlayerRow = playerRow;
        int newPlayerCol = playerCol;
        switch (direction) {
            case 'W':
                newPlayerRow--;
                break;
            case 'S':
                newPlayerRow++;
                break;
            case 'A':
                newPlayerCol--;
                break;
            case 'D':
                newPlayerCol++;
                break;
            default:
                System.out.println("Invalid direction. Use 'W', 'S', 'A', or 'D'.");
                return; // Exit the method if the direction is invalid
        }

        // Check if the new position is within boundaries and not a tree
        if (isValidMove(forest, newPlayerRow, newPlayerCol)) {
            // Update the player's position
            forest[playerRow][playerCol] = '.'; // Remove the player from the old position
            forest[newPlayerRow][newPlayerCol] = 'P'; // Place the player in the new position
        } else {
            System.out.println("Invalid move. Cannot move outside boundaries or onto a tree.");
        }
    }

    private static boolean isValidMove(char[][] forest, int row, int col) {
        return row >= 0 && row < forest.length && col >= 0 && col < forest[0].length && forest[row][col] != 'T';
    }

    public static void main(String[] args) {
        // Example usage:
        char[][] forest = {
            {'T', '.', 'T', '.', 'T'},
            {'.', '.', 'T', '.', 'T'},
            {'T', '.', '.', '.', 'P'},
            {'.', '.', 'T', '.', '.'},
            {'T', 'T', '.', '.', 'T'}
        };

        displayForest(forest);

        System.out.println("Moving player up...");
        movePlayer(forest, 'W');
        displayForest(forest);

        System.out.println("Moving player right...");
        movePlayer(forest, 'D');
        displayForest(forest);

        System.out.println("Moving player left...");
        movePlayer(forest, 'A');
        displayForest(forest);

        System.out.println("Moving player down...");
        movePlayer(forest, 'S');
        displayForest(forest);

        System.out.println("Trying an invalid move...");
        movePlayer(forest, 'X'); // Invalid move
    }

    public static void displayForest(char[][] forest) {
        // Display the forest as before
        // This method is assumed to be defined as shown in a previous example
    }
}


