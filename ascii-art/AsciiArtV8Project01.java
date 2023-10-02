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
public class AsciiArtV8Project01 {
    public static void main(String[] args) {
        Board nameBoard = new Board(10, '.');

        //AlJawharah 
        nameBoard.setValue(0, 0, 'A');
        nameBoard.setValue(1, 1, 'l');
        nameBoard.setValue(2, 2, 'J');
        nameBoard.setValue(3, 3, 'a');
        nameBoard.setValue(4, 4, 'w');
        nameBoard.setValue(5, 5, 'h');
        nameBoard.setValue(6, 6, 'a');
        nameBoard.setValue(7, 7, 'r');
        nameBoard.setValue(8, 8, 'a');
        nameBoard.setValue(9, 9, 'h');
        
        //AlQahtani
        nameBoard.setValue(0, 9, 'A');
        nameBoard.setValue(1,8, 'l');
        nameBoard.setValue(2, 7, 'Q');
        nameBoard.setValue(3, 6, 'a');
        nameBoard.setValue(5, 4, 'h');
        nameBoard.setValue(6, 3, 't');
        nameBoard.setValue(7, 2, 'a');
        nameBoard.setValue(8, 1, 'n');
        nameBoard.setValue(9, 0, 'i');
       
        char centerCharacter = '+';

        nameBoard.setValue(4, 0, centerCharacter);
        nameBoard.setValue(4, 1, centerCharacter);
        nameBoard.setValue(4, 2, centerCharacter);
        nameBoard.setValue(4, 3, '[');
        nameBoard.setValue(4, 5 ,']');
        nameBoard.setValue(4, 6, centerCharacter);
        nameBoard.setValue(4, 7, centerCharacter);
        nameBoard.setValue(4, 8, centerCharacter);
        nameBoard.setValue(4, 9, centerCharacter);

        char verticalCharacter = '|';

        nameBoard.setValue(0, 4, verticalCharacter);
        nameBoard.setValue(1, 4, verticalCharacter);
        nameBoard.setValue(2, 4, verticalCharacter);
        nameBoard.setValue(3, 4, verticalCharacter);
        nameBoard.setValue(5, 4, verticalCharacter);
        nameBoard.setValue(6, 4, verticalCharacter);
        nameBoard.setValue(7, 4, verticalCharacter);
        nameBoard.setValue(8, 4, verticalCharacter);
        nameBoard.setValue(9, 4, verticalCharacter);

        char theCharacter = '#';

        nameBoard.setValue(3, 0, theCharacter);
        nameBoard.setValue(3, 9, theCharacter);
        nameBoard.setValue(5, 0, theCharacter);
        nameBoard.setValue(5, 9, theCharacter);
        
        char theLeftCharacter  = '(';
        char theRightCharacter = ')';

        nameBoard.setValue(0, 3, theLeftCharacter);
        nameBoard.setValue(0, 5, theRightCharacter);

        nameBoard.setValue(9, 3, theLeftCharacter);
        nameBoard.setValue(9, 5, theRightCharacter);

        nameBoard.draw();
    }
}
