package di.componentesblackjack.carta;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControladorCarta {

    @FXML
    ImageView carta;

    public ImageView getCarta() {
        return this.carta;
    }
}
