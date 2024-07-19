public class TestingPrint{
    public static void main(String[] args){
        char [][] arr = {{' ', ' ', 'X'}, {' ', 'X', 'X'}, {'X', 'X', 'X'}};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; i < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}