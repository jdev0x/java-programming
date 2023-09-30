class Board {
    private int rows;
    private int cols;
    private char [][] board;
    private char defaultSymbol;

    public Board(int rows, int cols, char defaultSymbol){
        this.rows = rows;
        this.cols = cols;
        this.defaultSymbol = defaultSymbol;
        this.board = new char[this.rows][this.cols];
        this.fillBoard();
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

    public void fillBoard(){
        for(int row = 0; row < this.board.length; row++){
            for(int col = 0; col < this.board[row].length; col++){
                this.board[row][col] = this.defaultSymbol;
            }
        }
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
public class AsciiArtV7 {
    public static void main(String[] args) {
    
    int boardSize = 3;
    Board b = new Board(boardSize, boardSize, '.');
    
   b.setValue(0, 0, 'o');
   b.setValue(0, 1, 'x');
   b.setValue(0, 2, 'x');
   b.setValue(1, 0, 'x');
   b.setValue(1, 1, 'o');
   b.setValue(1, 2, 'o');
   b.setValue(2, 0, 'x');
   b.setValue(2, 1, 'o');
   b.setValue(2, 2, 'o');

    b.draw();

    }
}
