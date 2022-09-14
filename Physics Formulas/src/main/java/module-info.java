module com.example.physicsformulas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.physicsformulas to javafx.fxml;
    exports com.example.physicsformulas;
}