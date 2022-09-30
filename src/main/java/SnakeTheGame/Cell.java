package SnakeTheGame;

public class Cell {
    //body
    private int x;
    private int y;
    private int item;

    //constructor
    public Cell(int x, int y, int item) {
        this.x = x;
        this.y = y;
        this.item = item;
    }

    //getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getItem() {
        return item;
    }

    //setters
    public void setItem(int item) {
        this.item = item;
    }

    //methods


}
