class Board {
    private int rows;
    private int cols;
    private int [][] board;

    public Board(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.board = new int[this.rows][this.cols];
    }

    public int [][] getBoard(){
        return this.board;
    }
}
public class AsciiArtV2 {
    public static void main(String[] args) {
    
    Board theBoard = new Board(16, 16);
    Board myBoard = new Board(7, 3);
    Board thisBoard = new Board(100, 100);

    int [][] board = myBoard.getBoard();
    
       for (int c = 0; c < board.length; c++){
        for(int cc = 0; cc < board[c].length; cc++){
            if (board[c][cc] == 0){
                System.out.print(".");
            }else if(board[c][cc] == 1){
                System.out.print("-");
            }else if(board[c][cc] == 2){
                System.out.print("_");
            }else if(board[c][cc] == 3){
                System.out.print("|");
            }else if(board[c][cc]== 4){
                System.out.print("/");
            }
        }
        System.out.println(""); 
       }
    }
}
