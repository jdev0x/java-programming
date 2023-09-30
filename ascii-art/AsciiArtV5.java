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

    public boolean setValue(int row, int col, int value){
        if(row < this.rows && col < this.cols){
            this.board[row][col] = value;
            return true;
        }
        return false;
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
public class AsciiArtV5 {
    public static void main(String[] args) {
    
    int boardSize = 32;
    Board b = new Board(boardSize, boardSize);
    
    b.setValue(0, 0, 4);
    b.setValue(0, boardSize - 1, 4);
    b.setValue(boardSize - 1, 0, 4);
    b.setValue(boardSize - 1, boardSize - 1, 4);
    if(!b.setValue(88, 3, 3)){
        System.out.println("it didnt work");
    }
    
    b.draw();

    }
}
