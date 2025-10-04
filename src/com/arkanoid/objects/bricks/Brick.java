package com.arkanoid.objects.bricks;

import com.arkanoid.objects.GameObject;

public abstract class Brick extends GameObject {
    protected int hitPoints;
    protected String type;

    public Brick(int x, int y, int width, int height, int hitPoints, String type) {
        super(x, y, width, height);
        this.hitPoints = hitPoints;
        this.type = type;
    }   

    public void takeHit() {}

    public boolean isDestroyed() {
        return false;
    }
}
