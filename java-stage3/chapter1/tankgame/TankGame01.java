package com.tankgame;

import javax.swing.*;

/**
 * @author lanyangyang
 */
public class TankGame01 extends JFrame {
    //定义MyPanel
    MyPanel mp = null;
    static void main(String[] args) {

        TankGame01 tankGame01 = new TankGame01();
    }
    public TankGame01 (){

        mp = new MyPanel();
        this.add(mp);//游戏绘 图区域
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
