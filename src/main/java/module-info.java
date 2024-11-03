module org.hugo.ejercicior {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.hugo.ejercicior to javafx.fxml;
    exports org.hugo.ejercicior;
}