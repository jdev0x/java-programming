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

    public void draw(){
        for (int c = 0; c < this.board.length; c++){
        for(int cc = 0; cc < this.board[c].length; cc++){
            if (this.board[c][cc] == 0){
                System.out.print(".");
            }else if(this.board[c][cc] == 1){
                System.out.print("-");
            }else if(this.board[c][cc] == 2){
                System.out.print("_");
            }else if(this.board[c][cc] == 3){
                System.out.print("|");
            }else if(this.board[c][cc]== 4){
                System.out.print("/");
            }
        }
        System.out.println(""); 
       }
    }
}
public class AsciiArtV3 {
    public static void main(String[] args) {
    
    Board theBoard = new Board(32, 32);
    theBoard.draw();
    }
}
