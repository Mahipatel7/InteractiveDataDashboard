module georgiancollegecomp.assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;


    opens georgiancollegecomp1011.assignment2 to javafx.fxml;
    exports georgiancollegecomp1011.assignment2;
}