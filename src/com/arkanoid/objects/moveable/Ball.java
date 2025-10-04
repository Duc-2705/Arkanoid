package com.arkanoid.objects.moveable;

import com.arkanoid.objects.GameObject;
import com.arkanoid.objects.powerups.PowerUp;

public class Ball extends MoveableObject {
    private int speed;
    private int directionX, directionY;
    private PowerUp currentPowerUp;

    public Ball(int x, int y, int width, int height, int dx, int dy, int speed, int directionX, int directionY) {
        super(x, y, width, height, dx, dy);
        this.speed = speed;
        this.directionX = directionX;
        this.directionY = directionY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void bounceOff(GameObject other) {}
    public void checkCollision(GameObject other) {}

    public void applyPowerUp(PowerUp powerUp) {
        currentPowerUp = powerUp;
        currentPowerUp.applyEffect(this);
    }

    public void move() {}
    public void update() {}
    public void render() {}
}
