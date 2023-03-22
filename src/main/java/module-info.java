module com.shoothzj.filesherlock {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.shoothzj.filesherlock to javafx.fxml;
    exports com.shoothzj.filesherlock;
}
