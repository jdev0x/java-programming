enum XOValue {
    EMPTY, X, O
}

class XOCell {
    private XOValue value;

    public XOCell(){
        this.value = XOValue.EMPTY;
    }

    public XOCell(XOValue value){
        this.value = value;
    }

    public void setValue(XOValue value){
        this.value = value;
    }
    
    public XOValue getValue(){
        return this.value;
    }

    public boolean isX(){
        return this.value == XOValue.X;
    }

    public boolean isO(){
        return this.value == XOValue.O;
    }

}

class XORow {
    private XOCell [] columns;

    public XORow(){
        this.columns = new XOCell[3];

        this.columns[0] = new XOCell();
        this.columns[1] = new XOCell();
        this.columns[2] = new XOCell();
    }

    public XOCell [] getColumns(){
        return this.columns;
    }

    public void setCellValue(int index, XOValue value){
        this.columns[index].setValue(value);
    }

    public boolean isX(){
        return this.columns[0].isX() && this.columns[1].isX() && this.columns[2].isX();
    }

    public boolean isO(){
        return this.columns[0].isO() && this.columns[1].isO() && this.columns[2].isO();
    }
}

class XOBoard{
    private XORow [] rows;

    public XOBoard(){
        this.rows = new XORow[3];

        this.rows[0] = new XORow();
        this.rows[1] = new XORow();
        this.rows[2] = new XORow();
    }

    public XORow [] getRows(){
        return this.rows;
    }
    
    public void setCellValue(int row, int column, XOValue value){
        this.rows[row].setCellValue(column, value);
    }

    protected  boolean isColX(int index){
        return this.rows[0].getColumns()[index].isX() && 
               this.rows[1].getColumns()[index].isX() &&
               this.rows[2].getColumns()[index].isX();
    }

    protected boolean isColO(int index){
        return this.rows[0].getColumns()[index].isO() &&
               this.rows[1].getColumns()[index].isO() &&
               this.rows[2].getColumns()[index].isO();
    }

    protected boolean isCrossX(){
        boolean isCross = this.rows[0].getColumns()[0].isX() && 
               this.rows[1].getColumns()[1].isX() &&
               this.rows[2].getColumns()[2].isX();
        
        if(!isCross){
            isCross = this.rows[0].getColumns()[2].isX() &&
            this.rows[1].getColumns()[1].isX() &&
            this.rows[2].getColumns()[0].isX();
        }

        return isCross;
    }

    protected boolean isCrossO(){
        boolean isCross = this.rows[0].getColumns()[0].isO() &&
        this.rows[1].getColumns()[1].isO() &&
        this.rows[2].getColumns()[2].isO();

        if(!isCross){
            isCross = this.rows[0].getColumns()[2].isO() &&
                      this.rows[1].getColumns()[1].isO() &&
                      this.rows[2].getColumns()[0].isO();
        }

        return isCross;
    }

    protected boolean isRowX(){
        return this.rows[0].isX() || this.rows[1].isX() || this.rows[2].isX();
    }

    protected boolean isRowO(){
        return this.rows[0].isO() || this.rows[1].isO() || this.rows[2].isO();
    }

    public boolean isX(){
        return this.isColX(0) || this.isColX(1) || this.isColX(2) ||
               this.isRowX() || this.isCrossX();
    }

    public boolean isO(){
        return this.isColO(0) || this.isColO(1) || this.isColO(2) ||
               this.isRowO() || this.isCrossO();
    }

    public boolean check(){
        return this.isX() || this.isO();
    }

}

public class XOProject {
    public static void main(String[] args) {
        
        XOBoard board = new XOBoard();
        board.setCellValue(0, 0, XOValue.X);
        board.setCellValue(0, 1, XOValue.O);
        board.setCellValue(0, 2, XOValue.X);

        board.setCellValue(1, 0, XOValue.O);
        board.setCellValue(1, 1, XOValue.X);
        board.setCellValue(1, 2, XOValue.O);

        board.setCellValue(2, 0, XOValue.X);
        board.setCellValue(2, 1, XOValue.O);
        board.setCellValue(2, 2, XOValue.O);

        System.out.println(board.check());

    }
}
