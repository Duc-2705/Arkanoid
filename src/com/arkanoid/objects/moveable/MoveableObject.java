package com.arkanoid.objects.moveable;

import com.arkanoid.objects.GameObject;

public abstract class MoveableObject extends GameObject{
    protected int dx, dy;

    public abstract void move();
}
