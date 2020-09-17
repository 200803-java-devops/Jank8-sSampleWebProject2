package sample2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Tomcat server = new Tomcat();
        server.setPort(8080);
        server.setBaseDir(new File("target/tomcat").getAbsolutePath());
        server.getConnector();
        server.addWebapp("", new File("src/main/Static").getAbsolutePath());
        try {
            server.start();
            server.getServer().await();
        } catch (LifecycleException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println();
        }
    }
}