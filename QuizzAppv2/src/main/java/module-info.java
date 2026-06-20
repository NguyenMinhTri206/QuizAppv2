module com.nmt.quizzappv2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nmt.quizzappv2 to javafx.fxml;
    exports com.nmt.quizzappv2;
}
