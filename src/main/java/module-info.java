module org.hugo.ejercicior {

    requires javafx.fxml;

    requires org.hugo.ejercicioq;
    requires javafx.controls;
    requires java.desktop;

    opens org.hugo.ejercicior to javafx.fxml;
    exports org.hugo.ejercicior;
}