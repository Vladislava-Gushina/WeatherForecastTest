module org.vladislava_g.weatherforecasttest {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens org.vladislava_g.weatherforecasttest to javafx.fxml;
    exports org.vladislava_g.weatherforecasttest;
    exports org.vladislava_g.weatherforecasttest.url;
    opens org.vladislava_g.weatherforecasttest.url to javafx.fxml;
    exports org.vladislava_g.weatherforecasttest.backgroundView;
    opens org.vladislava_g.weatherforecasttest.backgroundView to javafx.fxml;
}