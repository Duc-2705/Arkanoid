package com.arkanoid.objects.powerups;

import com.arkanoid.objects.GameObject;
import com.arkanoid.objects.moveable.Ball;
import com.arkanoid.objects.moveable.Paddle;

public class FastBallPowerUp extends PowerUp {
    public void applyEffect(GameObject obj) {
        if (obj instanceof Ball) {
            Ball ball = (Ball) obj; // Down-Casting
            ball.setSpeed(ball.getSpeed() * 2); // Tang speed len 2 lan
        }
    }

    public void removeEffect(GameObject obj) {
        if (obj instanceof Ball) {
            Ball ball = (Ball) obj; // Down-Casting
            ball.setSpeed(ball.getSpeed() / 2); // Giam speed len 2 lan
        }
    }

    public FastBallPowerUp(int x, int y, int width, int height, String type, int duration) {
        super(x, y, width, height, type, duration);
    }

    public void update() {
    }

    public void render() {
    }
}
