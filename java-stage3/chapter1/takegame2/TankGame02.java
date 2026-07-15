package com.takegame2;

import javax.swing.*;

/**
 * @author lanyangyang
 */
public class TankGame02 extends JFrame {
    //定义MyPanel
    MyPanel mp = null;
    static void main(String[] args) {

        TankGame02 tankGame01 = new TankGame02();
    }
    public TankGame02(){

        mp = new MyPanel();
        this.add(mp);//游戏绘 图区域
        this.setSize(1000,750);
        this.addKeyListener(mp);//让JFrame 监听键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
