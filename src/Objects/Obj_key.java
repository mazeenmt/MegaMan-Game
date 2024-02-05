package Objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Obj_key extends SuperObject{
    public Obj_key(){
        try{
            image = ImageIO.read((getClass().getResourceAsStream("/Objects/Key.png")));

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
