package Game;

import Objects.Obj_Grenade;
import Objects.Obj_Thunder;
import Objects.Obj_key;

public class AssetSetter {
    GamePanel gp;
    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setObject(){
        gp.obj[0] = new Obj_key();
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;

        gp.obj[1] = new Obj_key();
        gp.obj[1].worldX = 23 * gp.tileSize;
        gp.obj[1].worldY = 46 * gp.tileSize;

        gp.obj[2] = new Obj_key();
        gp.obj[2].worldX = 7 * gp.tileSize;
        gp.obj[2].worldY = 23 * gp.tileSize;

        gp.obj[3] = new Obj_Thunder();
        gp.obj[3].worldX = 15 * gp.tileSize;
        gp.obj[3].worldY = 10 * gp.tileSize;

        gp.obj[4] = new Obj_Thunder();
        gp.obj[4].worldX = 20 * gp.tileSize;
        gp.obj[4].worldY = 17 * gp.tileSize;

        gp.obj[5] = new Obj_Thunder();
        gp.obj[5].worldX = 23 * gp.tileSize;
        gp.obj[5].worldY = 46 * gp.tileSize;

        gp.obj[6] = new Obj_Grenade();
        gp.obj[6].worldX = 23 * gp.tileSize;
        gp.obj[6].worldY = 7 * gp.tileSize;

        gp.obj[7] = new Obj_Grenade();
        gp.obj[7].worldX = 40 * gp.tileSize;
        gp.obj[7].worldY = 40 * gp.tileSize;

        gp.obj[8] = new Obj_Grenade();
        gp.obj[8].worldX = 12 * gp.tileSize;
        gp.obj[8].worldY = 9 * gp.tileSize;
    }
}
