package statics;

import java.awt.Frame;

import javax.swing.*;
import javax.xml.crypto.Data;

public class StartGames {
    public static void main(String[] args) {
        JFrame frame = new JFrame("贪吃蛇小游戏");
        // 设置界面的大小
        frame.setBounds(10, 10, 720);
        frame.setRsizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 画板功能

        frame.setVisible(true);
    }

    public static URL headURL = Data.class.getResource("D:\java贪吃蛇\kuangshen\src\statics\food.png");
}