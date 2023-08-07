module ku.cs.lab02javafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ku.cs.lab02javafx to javafx.fxml;
    exports ku.cs.lab02javafx;
}