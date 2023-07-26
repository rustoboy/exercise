module com.rustoboy.jenkinsdocker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rustoboy.jenkinsdocker to javafx.fxml;
    exports com.rustoboy.jenkinsdocker;
}