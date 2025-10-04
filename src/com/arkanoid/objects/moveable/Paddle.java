package com.arkanoid.objects.moveable;

import com.arkanoid.objects.powerups.PowerUp;

public class Paddle extends  MoveableObject {
    private int speed;
    private PowerUp currentPowerUp;

    public Paddle(int x, int y, int width, int height, int dx, int dy, int speed) {
        super(x, y, width, height, dx, dy);
        this.speed = speed;
    }

    public void moveLeft() {};
    public void moveRight() {};

    public void applyPowerUp(PowerUp powerUp) {
        currentPowerUp = powerUp;
        currentPowerUp.applyEffect(this);
    };

    public void move() {};
    public void update() {}
    public void render() {}
}
