class Board {
    private int rows;
    private int cols;
    private char [][] board;

    public Board(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.board = new char[this.rows][this.cols];
    }

    public char [][] getBoard(){
        return this.board;
    }

    public boolean setValue(int row, int col, char value){
        if(row < this.rows && col < this.cols){
            this.board[row][col] = value;
            return true;
        }
        return false;
    }

    public void draw(){
        for (int row = 0; row < this.board.length; row++){
            for(int col = 0; col < this.board[row].length; col++){
                System.out.print(this.board[row][col]);
            }
        System.out.println(); 
       }
    }
}
public class AsciiArtV6 {
    public static void main(String[] args) {
    
    int boardSize = 3;
    Board b = new Board(boardSize, boardSize);
    
    b.setValue(0, 0, 'o');
    b.setValue(0, boardSize - 1, 'x');
    b.setValue(boardSize - 1, 0, 'o');
    b.setValue(boardSize - 1, boardSize - 1, 'x');
    
    b.draw();

    }
}
