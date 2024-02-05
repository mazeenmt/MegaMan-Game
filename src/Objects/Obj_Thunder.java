package Objects;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Obj_Thunder extends SuperObject {
    public Obj_Thunder() {
        name = "Thunder";
        try {
            image = ImageIO.read((getClass().getResourceAsStream("/Objects/Thunder.png")));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
