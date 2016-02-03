import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by renannp on 2/1/16.
 */
@WebListener
public class TestWebListener implements ServletContextListener
{
    @Resource(mappedName = "java:jboss/datasources/TestDS")
    DataSource dataSource;

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        try {
            dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
