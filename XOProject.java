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
}

public class XOProject {
    public static void main(String[] args) {
        // XOValue val = XOValue.EMPTY;
        
        // XOCell cell = new XOCell();
        // cell.setValue(XOValue.X);
        // System.out.println(cell.getValue());

        // XORow row = new XORow();
        // row.setCellValue(0, XOValue.X);
        // row.setCellValue(1, XOValue.O);
        // row.setCellValue(2, XOValue.X);

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

    }
}
