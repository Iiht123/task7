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
public class ForestDisplay {
 public static void displayForest(char[][] forest) {
        // Define visual representations for characters
        char treeSymbol ='*'; 
        char openSpaceSymbol = ' ';
        char playerSymbol = 'P';

        // Print the forest with visual representations
        for (char[] row : forest) {
            for (char cell : row) {
                char symbol;
                switch (cell) {
                    case 'T':
                        symbol = treeSymbol;
                        break;
                    case '.':
                        symbol = openSpaceSymbol;
                        break;
                    case 'P':
                        symbol = playerSymbol;
                        break;
                    default:
                        symbol = cell; // Use the character itself if it's not recognized
                        break;
                }
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
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
    }
}   

