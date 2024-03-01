module di.componentesblackjack {
    requires javafx.controls;
    requires javafx.fxml;

    opens di.componentesblackjack.carta to javafx.fxml;
    exports di.componentesblackjack.carta;
}