package com.qa.Game;

import java.util.Scanner;

public class Game {
	private int xPos;
	private int yPos;
	
	private String direction; 
	Scanner stdIn = new Scanner(System.in); 
	
	public void moveNorth() {
		yPos += 10; 
		System.out.println("You moved NORTH!");
	}
	
	public void moveSouth() {
		yPos -= 10;
		System.out.println("You moved SOUTH!");
	}
	public void moveEast() {
		xPos += 10; 
		System.out.println("You moved EAST!");
	}
	
	public void moveWest() {
		xPos -= 10;
		System.out.println("You moved WEST!");
	}
	public int getXPosition() {
		return this.xPos;
	}
	
	public int getYPosition() {
		return this.yPos;
	}
	
	public void setXPositon(int i) {
		this.xPos = i;
	}
	
	public void setYPositon(int i) {
		this.yPos = i;
	}
	
	public void printingPos() {
		System.out.println("You are position " + getXPosition() + " , " + getYPosition());
	}
	
	public void instructions() {
		System.out.println("You are in the middle of an infinite grey swamp. \nThere are many features around you.  \nType in 'north', 'south', 'east' or 'west' to move around the swamp!");
		direction = stdIn.nextLine();
		
		
		switch (direction) {
		case "north":
			moveNorth();
			break;
		case "south":
			moveSouth();
			break;
		case "east":
			moveEast();
			break;
		case "west":
			moveWest();
			break;
		default:
			System.out.println("Please type in either north, south, east or west");
		}
	
	}
	
}
