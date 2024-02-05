package Entity;

import Game.GamePanel;
import Game.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Entity{
    GamePanel gp;
    KeyHandler keyH;
    public final int screenX;
    public final int screenY;
    public Player(GamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
        screenX = gp.screenWidth/2 - (gp.tileSize/2);
        screenY = gp.screenHeight/2 - (gp.tileSize/2);
        solidArea = new Rectangle();
        solidArea.x = 8;
        solidArea.y = 15;
        solidArea.width = 32;
        solidArea.height = 32;
        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues(){
        worldX = gp.tileSize * 23;
        worldY = gp.tileSize * 21;
        speed = 4;
        direction = "initial";
    }
    public void getPlayerImage(){
        try{
            initialRight = ImageIO.read(getClass().getResourceAsStream("/Player/initialRight.png"));
            initialLeft = ImageIO.read(getClass().getResourceAsStream("/Player/initialLeft.png"));
            up1 = ImageIO.read(getClass().getResourceAsStream("/Player/up1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/Player/up2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/Player/right1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/Player/right2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/Player/left1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/Player/left2.png"));
            sprintRight = ImageIO.read(getClass().getResourceAsStream("/Player/sprintRight.png"));
            sprintLeft = ImageIO.read(getClass().getResourceAsStream("/Player/sprintLeft.png"));
            jumpUp = ImageIO.read(getClass().getResourceAsStream("/Player/jumpUp.png"));
            jumpDown = ImageIO.read(getClass().getResourceAsStream("/Player/jumpDown.png"));

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void update(){
        if(keyH.upPressed == true || keyH.downPressed || keyH.rightPressed || keyH.leftPressed || keyH.spacePressed){
            if(keyH.upPressed) {
                direction = "up";
                worldY -= speed;
            }
            else if(keyH.downPressed) {
                direction = "down";
            }
            else if(keyH.leftPressed) {
                direction = "left";
            }
            else if(keyH.rightPressed){
                direction = "right";
            }
            else if(keyH.spacePressed){
                direction = "jumpUp";
            }
            //collision m3 tile
            collisionOn = false;
            gp.cChecker.checkTile(this);

            //kn mfamech yjm y9adm
            if (collisionOn == false){
                switch(direction){
                    case "up":
                        worldY -= speed;
                        break;
                    case "down":
                        worldY += speed;
                        break;
                    case "left":
                        worldX -= speed;
                        break;
                    case "right":
                        worldX += speed;
                        break;
                }
            }
            spriteCounter++;
            if (spriteCounter > 10){
                if(spriteNum == 1){
                    spriteNum = 2;
                }
                else if (spriteNum == 2){
                spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }
        else {
            direction = "initial";
        }
    }
    public void draw(Graphics2D g2){
        //g2.setColor(Color.white);
        //g2.fillRect(x, y, gp.tileSize, gp.tileSize); // x,y,width,height
        BufferedImage image = null;
        switch (direction){
            case "up":
                if (spriteNum == 1){
                    image = up1;
                }
                if (spriteNum == 2){
                    image = up2;
                }
                break;
            case "down":
                if (spriteNum == 1){
                    image = up1;
                }
                if (spriteNum == 2){
                    image = up2;
                }
                break;
            case "right":
                if (spriteNum == 1){
                    image = right1;
                }
                if (spriteNum == 2){
                    image = right2;
                }
                break;
            case "left":
                if (spriteNum == 1){
                    image = left1;
                }
                if (spriteNum == 2){
                    image = left2;
                }
                break;
            case "initial":
                image = initialRight;
                break;
            case "jumpUp":
                image = jumpUp;
                break;
            case "jumpDown":
                image = jumpDown;
                break;
        }
        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
    }
}