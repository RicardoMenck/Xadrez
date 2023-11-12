package curso.java.boardgame;

public class Position {
    private int row;
    private int column;

    //Método construtor
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    //Método para transformar a posicao em String
    @Override
    public String toString() {
        return "Posicao{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    //Métodos acessores e modificadores
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
