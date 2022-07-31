module com.jojoldu.book.springboot {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jojoldu.book.springboot to javafx.fxml;
    exports com.jojoldu.book.springboot;
}