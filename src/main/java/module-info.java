module com.mycompany.liebre_tortuga {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.liebre_tortuga to javafx.fxml;
    exports com.mycompany.liebre_tortuga;
}
