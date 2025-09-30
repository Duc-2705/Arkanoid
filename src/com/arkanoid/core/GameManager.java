package com.arkanoid.core;

import com.arkanoid.objects.bricks.Brick;
import com.arkanoid.objects.moveable.Ball;
import com.arkanoid.objects.moveable.Paddle;
import com.arkanoid.objects.powerups.PowerUp;

import java.util.List;

public abstract class GameManager {
    public Paddle paddle;
    public Ball ball;
    public List<Brick> bricks;
    public List<PowerUp> powerUps;
    public int scores;
    public int lives;
    public int gameState;

    public void startGame() {}
    public void updateGame() {}
    public void handleInput() {}
    public void checkCollision() {}
    public void gameOver() {}
}
