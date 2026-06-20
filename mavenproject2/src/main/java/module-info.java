module com.nmt.mavenproject2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nmt.mavenproject2 to javafx.fxml;
    exports com.nmt.mavenproject2;
}
