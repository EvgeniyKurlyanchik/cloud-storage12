module ru.gb.server {
    requires io.netty.transport;
    requires io.netty.codec;
    requires java.sql;
    requires lombok;
    requires commons;

    opens ru.gb.server to javafx.fxml;
    exports ru.gb.server;
    exports ru.gb.server.handler;
    opens ru.gb.server.handler to javafx.fxml;
}
