module com.nmt.quizzappv2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.nmt.quizzappv2 to javafx.fxml;
    exports com.nmt.quizzappv2;
    exports com.nmt.pojo;
    
}
