/*
 * Write your program inside the main method to build
 * a staicase in a 2D array of characters according
 * to the assignment description
 *
 * To compile:
 *        javac StaircaseBuilder.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class StaircaseBuilder {
    public static void main(String[] args) {

        // WRITE YOUR CODE HERE
        int d = Integer.parseInt(args[0]);
        int brickTotal = Integer.parseInt(args[1]);
        int bricksRemaining = brickTotal;

        //creating empty staircase 2D array
        char [][] staircase = new char[d][d];
        for(int i = 0; i < staircase.length; i++){
            for(int j = 0; j < staircase[i].length; j++){
                staircase[i][j] = ' ';
            }
        }

        int column = 0;
        int steps = 1;
        //while there are still bricks remaining AND the column is < the dimension
        //this ensures that it doesn't go out of bounds even if there are extra bricks
        while(bricksRemaining > 0  && column < staircase.length){
            for(int i = 1; i <= steps; i++){
                staircase[staircase.length - i][column] = 'X';
                bricksRemaining -= 1;
                if(bricksRemaining == 0){
                    break;
                }
            }
            steps += 1;
            column += 1;
        }

        for(int i = 0; i < staircase.length; i++){
            for(int j = 0; j < staircase[i].length; j++){
                System.out.print(staircase[i][j]);
            }
            System.out.println();
        }
        System.out.println("Bricks remaining: " + bricksRemaining);
    }
}
