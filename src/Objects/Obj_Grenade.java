package Objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Obj_Grenade extends SuperObject{
    public Obj_Grenade() {
        name = "Grenade";
        try {
            image = ImageIO.read((getClass().getResourceAsStream("/Objects/Grenade.png")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
