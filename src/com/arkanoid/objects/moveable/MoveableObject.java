package com.arkanoid.objects.moveable;

import com.arkanoid.objects.GameObject;

public abstract class MoveableObject extends GameObject {
    protected int dx, dy;

    public MoveableObject(int x, int y, int width, int height, int dx, int dy) {
        super(x, y, width, height);
        this.dx = dx;
        this.dy = dy;
    }

    public abstract void move();
}
