package com.tonkan.rain.entity.mob;

import com.tonkan.rain.entity.Entity;
import com.tonkan.rain.graphics.Sprite;

public abstract class Mob extends Entity {

	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;

	protected void move(int xa, int ya) {
		if (xa > 0) dir = 1;
		if (xa < 0) dir = 3;
		if (ya > 0) dir = 2;
		if (ya < 0) dir = 0;
		
		if (!collision()) {
			x += xa;
			y += ya;
		}
	}

	public void update() {
	}

	public void render() {
	}

	private boolean collision() {
		return false;
	}

}
