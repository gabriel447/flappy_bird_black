package com.gcstudios.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.gcstudios.main.Game;

public class Tubo extends Entity{

	
	public Tubo(double x, double y, int width, int height, double speed, BufferedImage sprite) {
		super(x, y, width, height, speed, sprite);
	}
	
	private boolean score = false;

	public void tick() {
		x--;
		if(score == false){
	           if(x < Game.player.x){
	                        Game.score+=0.5;
	                        score = true;
	           }
	}
}
	
	//renderizar tubo
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(this.getX(), this.getY(), width, height);
		
		//renderizar com spritesheet
		/*if(sprite != null) {
			g.drawImage(sprite, this.getX(),this.getY(), width,height,null);
		}
		else {		
			g.setColor(Color.GREEN);
			g.fillRect(this.getX(), this.getY(), width, height);
		}*/
	}
	
}
