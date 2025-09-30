package com.arkanoid.objects.powerups;

import com.arkanoid.objects.GameObject;
import com.arkanoid.objects.moveable.Paddle;

public abstract class PowerUp extends GameObject {
    protected String type;
    protected int duration;

    public abstract void applyEffect(Paddle paddle);
    public abstract void removeEffect(Paddle paddle);
}
