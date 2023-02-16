package com.mycompany.bmiproject;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int a =1;
        if (a <1)
        App.setRoot("secondary");
    }
}
