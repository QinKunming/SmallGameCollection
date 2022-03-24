/*
 * Project Name: Gobang
 * Class Name: StartChessJFrame
 * Description:五子棋小游戏实例
 * Date: 2021-11-27 21:05
 * Copyright: QinKunming All rights reserved.
 * QQ:12738777 Mail:12738777@qq.com
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*
 * 五子棋的主框架，程序启动类
 */
public class StartChessJFrame extends JFrame {

    private ChessBoard chessBoard;//对战面板
    private Panel toolbar;//工具条面板
    private Button startButton;//设置开始按钮
    private Button backButton;//设置悔棋按钮
    private Button exitButton;//设置退出按钮

    public StartChessJFrame(){

        setTitle("单机版五子棋");//设置标题
        chessBoard=new ChessBoard();//初始化面板对象，创建和添加菜单
        MyItemListener lis=new MyItemListener();//初始化按钮事件监听器内部类
        toolbar=new Panel();//工具面板栏实例化
        startButton=new Button("ReStart");
        backButton=new Button("Retract");
        exitButton=new Button("Quit");//三个按钮初始化
        toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));//将工具面板按钮用FlowLayout布局
        toolbar.add(backButton);
        toolbar.add(startButton);
        toolbar.add(exitButton);//将三个按钮添加到工具面板上
        startButton.addActionListener(lis);
        backButton.addActionListener(lis);
        exitButton.addActionListener(lis);//将三个按钮事件注册监听事件
        add(toolbar,BorderLayout.SOUTH);//将工具面板布局到界面南方也就是下面
        add(chessBoard);//将面板对象添加到窗体上
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置界面关闭事件
        pack();//自适应大小

    }

    private class MyItemListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            Object obj=e.getSource();//获取事件源
            if(obj==startButton){
                System.out.println("重新开始...");//重新开始
                //JFiveFrame.this内部类引用外部类
                chessBoard.restartGame();
            }else if(obj==exitButton){
                System.exit(0);//结束应用程序
            }else if(obj==backButton){
                System.out.println("悔棋...");//悔棋
                chessBoard.goback();
            }
        }

    }

    public static void main(String[] args) {
        StartChessJFrame f=new StartChessJFrame();//创建主框架
        f.setVisible(true);//显示主框架
    }

}