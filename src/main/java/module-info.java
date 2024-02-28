module di.componentesblackjack {
    requires javafx.controls;
    requires javafx.fxml;


    opens di.componentesblackjack to javafx.fxml;
    exports di.componentesblackjack;
}