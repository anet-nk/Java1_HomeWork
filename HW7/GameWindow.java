package Lesson7;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame  {
    private int winWidth = 1024;
    private int winHeight = 668;
    private int winPosX = 300;
    private int winPosY = 100;

    private GameMap map;
    private JPanel gui;

    private JPanel gameControlDiv;
    private JButton btnStartGame;
    private JButton btnExitGame;

    private JPanel gameInfoDiv;
    private JLabel countLevelInfo;
    private JLabel mapSizeInfo;
    private JLabel countEnemyInfo;

    private JPanel playerInfoDiv;
    private JLabel playerHealthInfo;
    private JLabel playerAttackPointInfo;
    private JLabel playerLocationInfo;

    private JPanel playerControllerDiv;
    private JPanel playerControllerDiv1;
    private JPanel playerControllerDiv2;
    private JPanel playerControllerDiv3;
    private JButton playerMoveUP;
    private JButton playerMoveDown;
    private JButton playerMoveLeft;
    private JButton playerMoveRight;


    private JPanel logDiv;

    GameWindow() {
        setupWindow();

        map = new GameMap();

        setupGui();

        add(gui, BorderLayout.EAST);
        add(map);


        setVisible(true);
    }

    private void setupGui() {
        gui = new JPanel();
        gui.setLayout(new GridLayout(5, 1));

        setupGameControl();
        setupGameInfo();
        setupPlayerInfo();
        setupPlayerController();

        gui.add(gameControlDiv);
        gui.add(gameInfoDiv);
        gui.add(playerInfoDiv);
        gui.add(playerControllerDiv);

    }

    private void setupGameControl() {
        gameControlDiv = new JPanel();
        gameControlDiv.setLayout(new GridLayout(3,1));

        btnStartGame = new JButton("<html><i>Start Game</s></html>");
        btnExitGame = new JButton("<html><i>Exit Game</i></html>");

        gameControlDiv.add(new JLabel(" == Game Menu == "));
        gameControlDiv.add(btnStartGame);
        gameControlDiv.add(btnExitGame);
    }

    private void setupGameInfo() {
        gameInfoDiv = new JPanel();
        gameInfoDiv.setLayout(new GridLayout(4,1));

        countLevelInfo = new JLabel("Level: -");
        mapSizeInfo = new JLabel("Size: -:-");
        countEnemyInfo = new JLabel("Count enemies: -");

        gameInfoDiv.add(new JLabel(" == Game Info == "));
        gameInfoDiv.add(countLevelInfo);
        gameInfoDiv.add(mapSizeInfo);
        gameInfoDiv.add(countEnemyInfo);
    }

    private void setupPlayerInfo() {
        playerInfoDiv = new JPanel();
        playerInfoDiv.setLayout(new GridLayout(4,1));

        playerHealthInfo = new JLabel("Health: -");
        playerAttackPointInfo = new JLabel("Attack point: -");
        playerLocationInfo = new JLabel("Coordinates: -;-");

        playerInfoDiv.add(new JLabel(" == Player Info == "));
        playerInfoDiv.add(playerHealthInfo);
        playerInfoDiv.add(playerAttackPointInfo);
        playerInfoDiv.add(playerLocationInfo);

    }

    private void setupPlayerController() {
        playerControllerDiv = new JPanel();
        playerControllerDiv.setLayout(new GridLayout(3,1));

        playerControllerDiv1 = new JPanel();
        playerControllerDiv2 = new JPanel();
        playerControllerDiv2.setLayout(new GridLayout(2,3));
        playerControllerDiv3 = new JPanel();

        playerMoveUP = new JButton("\uD83E\uDC95");
        playerMoveLeft = new JButton("\uD83E\uDC94");
        playerMoveDown = new JButton("\uD83E\uDC97");
        playerMoveRight = new JButton("\uD83E\uDC96");

        playerControllerDiv2.add(new JPanel());
        playerControllerDiv2.add(playerMoveUP);
        playerControllerDiv2.add(new JPanel());
        playerControllerDiv2.add(playerMoveLeft);
        playerControllerDiv2.add(playerMoveDown);
        playerControllerDiv2.add(playerMoveRight);

        playerControllerDiv.add(playerControllerDiv1);
        playerControllerDiv.add(playerControllerDiv2);
        playerControllerDiv.add(playerControllerDiv2);
//        playerControllerDiv = new JPanel();
//        playerControllerDiv.setLayout(new GridLayout(2,3));
//
//        playerMoveUP = new JButton("\uD83E\uDC95");
//        playerMoveLeft = new JButton("\uD83E\uDC94");
//        playerMoveDown = new JButton("\uD83E\uDC97");
//        playerMoveRight = new JButton("\uD83E\uDC96");
//
//        playerControllerDiv.add(new JPanel());
//        playerControllerDiv.add(playerMoveUP);
//        playerControllerDiv.add(new JPanel());
//        playerControllerDiv.add(playerMoveLeft);
//        playerControllerDiv.add(playerMoveDown);
//        playerControllerDiv.add(playerMoveRight);

    }

    private void setupLog() {

    }


    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(winPosX, winPosY);
        setSize(winWidth, winHeight);
        setTitle("This is my Game");
        setResizable(true);
    }
}
