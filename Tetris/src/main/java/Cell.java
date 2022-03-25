/*
 * Class Name: Cell
 * Description:
 * Date: 2022-03-25 14:47
 * Copyright: 秦坤明
 */

import java.awt.Image;

/**
 * 格子
 * 每一个小格子，就有所在的行 列 和图片
 */
public class Cell {
    private int row;
    private int col;
    //private int color;
    private Image image;//格子的贴图

    public Cell() {
    }

    public Cell(int row, int col, Image image) {
        super();
        this.row = row;
        this.col = col;
        this.image = image;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }


    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void moveRight(){
        col++;
        //System.out.println("Cell moveRight()" + col);
    }

    public void moveLeft(){
        col--;
    }

    public void moveDown(){
        row++;
    }

    @Override
    public String toString() {
        return "["+row+","+col+"]";
    }
}