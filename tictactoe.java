public class tictactoe {
    public static void main(String[] args){
        char[][] board=new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("Player 1 is X and Player 2 is O");
        char player=X;
        boolean gameOver=false;
        Scanner sc=new Scanner(System.in);
        while(!gameOver){
            printBoard(board);
            System.out.println("Player "+player+" turn");
            int row=sc.nextInt();
            int col=sc.nextInt();
            if(board[row][col]==' '){
                board[row][col]=player;
            }else{
                System.out.println("Invalid move");
            }
            gameOver=hasWon(board,player);
        }
    }
    boolean hasWon(char[][] board, char player){
        for(int i=0;i<3;i++){
            if(board[i][0]==player && board[i][1]==player && board[i][2])
        }
    }
}
