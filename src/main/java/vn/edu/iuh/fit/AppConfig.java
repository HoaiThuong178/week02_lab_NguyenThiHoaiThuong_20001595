package vn.edu.iuh.fit;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import vn.edu.iuh.fit.connection.Connection;

@ApplicationPath("/api")
public class AppConfig extends Application {
    public AppConfig() {
        Connection.getInstance().getEntityManager();
    }
}
