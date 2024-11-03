module org.hugo.ejercicior {

    requires javafx.fxml;


    requires javafx.controls;
    requires java.desktop;
    requires org.hugo.ejercicioq;
    opens org.hugo.ejercicior to javafx.fxml;
    exports org.hugo.ejercicior;
}