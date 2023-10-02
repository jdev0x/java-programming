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

    public Board(int size, char defaultSymbol){
        this.rows = size;
        this.cols = size;
        this.defaultSymbol = defaultSymbol;
        this.board = new char[this.rows][this.cols];
        this.fillBoard();
    }

    public char [][] getBoard(){
        return this.board;
    }

    public int getRows(){
        return this.rows;
    }

    public int getCols(){
        return this.cols;
    }

    public char getDefaultSymbol(){
        return this.defaultSymbol;
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
public class AsciiArtV8 {
    public static void main(String[] args) {
        Board gameBoard = new Board(9, '.');
        Board playBoard = new Board(10, 10, '.');

        gameBoard.setValue(0, 0, '#');
        gameBoard.setValue(4, 4, '!');

        playBoard.setValue(8, 8, 'o');
        playBoard.setValue(4, 4, 'i');

        gameBoard.draw();
        playBoard.draw();
    
    }
}
