package snake.lib;

import javax.swing.JFrame;

public class StartGame {
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "true");
        JFrame frame = new JFrame("贪吃蛇小游戏");
        frame.setBounds(10, 10, 900, 720);// 界面大小
        frame.setResizable(false);// 大小不可改变
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}