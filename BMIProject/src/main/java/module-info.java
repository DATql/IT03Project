module com.mycompany.bmiproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bmiproject to javafx.fxml;
    exports com.mycompany.bmiproject;
}
