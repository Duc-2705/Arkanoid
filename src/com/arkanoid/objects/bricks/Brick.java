package com.arkanoid.objects.bricks;

import com.arkanoid.objects.GameObject;

public abstract class Brick extends GameObject {
    protected int hitPoints;
    protected String type;

    public void takeHit() {}

    public boolean isDestroyed() {
        return false;
    }
}
