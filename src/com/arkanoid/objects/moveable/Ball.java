package com.arkanoid.objects.moveable;

import com.arkanoid.objects.GameObject;

public class Ball extends MoveableObject {
    private int speed;
    private int directionX, directionY;

    public void bounceOff(GameObject other) {}
    public void checkCollision(GameObject other) {}

    public void move() {}
    public void update() {}
    public void render() {}
}
