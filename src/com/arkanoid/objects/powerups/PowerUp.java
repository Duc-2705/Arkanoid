package com.arkanoid.objects.powerups;

import com.arkanoid.objects.GameObject;
import com.arkanoid.objects.moveable.Paddle;

public abstract class PowerUp extends GameObject {
    protected String type;
    protected int duration;

    public PowerUp(int x, int y, int width, int height, String type, int duration) {
        super(x, y, width, height);
        this.type = type;
        this.duration = duration;
    }

    public abstract void applyEffect(GameObject obj);

    public abstract void removeEffect(GameObject obj);
}
