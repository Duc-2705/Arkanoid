package com.arkanoid.objects.powerups;

import com.arkanoid.objects.GameObject;
import com.arkanoid.objects.moveable.Paddle;

public class ExpandPaddlePowerUp extends PowerUp {
    public void applyEffect(GameObject obj) {
        if (obj instanceof Paddle) {
            Paddle paddle = (Paddle) obj; // Down-Casting
            paddle.setWidth(paddle.getWidth() * 2); // Tang width len 2 lan
        }
    }
    
    public void removeEffect(GameObject obj) {
        if (obj instanceof Paddle) {
            Paddle paddle = (Paddle) obj; // Down-Casting
            paddle.setWidth(paddle.getWidth() / 2); // Giam width 2 lan
        }
    }

    public ExpandPaddlePowerUp(int x, int y, int width, int height, String type, int duration) {
        super(x, y, width, height, type, duration);
    }

    public void update() {
        
    }

    public void render() {
    }
}
