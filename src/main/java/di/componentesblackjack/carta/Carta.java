package di.componentesblackjack.carta;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Carta extends AnchorPane {

    //propiedades
    ControladorCarta controlador;

    Image imagen;

    //Constructor
    public Carta() {
        super();

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("vistaCarta.fxml"));

            controlador = new ControladorCarta();

            fxmlLoader.setController(controlador);

            Node nodo = fxmlLoader.load();

            this.getChildren().add(nodo);

            setImagen("Acarta");

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setImagen(String nombreImagen) {

        Image img = new Image(String.valueOf(getClass().getResourceAsStream("img/"+nombreImagen+".png")));

        this.controlador.getCarta().setImage(img);
    }
}
