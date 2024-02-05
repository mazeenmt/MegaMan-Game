package Entity;

import java.awt.image.BufferedImage;
import java.awt.Rectangle;

public class Entity {
    public int worldX, worldY;
    public int speed;
    public BufferedImage up1, up2, right1, right2, left1, left2, sprintLeft, sprintRight, initialLeft, initialRight, jumpUp, jumpDown;
    public String direction;
    public int spriteCounter = 0;
    public int spriteNum = 1;
    public Rectangle solidArea; //parties ml player li taaml collision
    public boolean collisionOn = false;
}
