package nguyentienviet;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.logging.Logger;

@WebListener
public class tienviet implements HttpSessionAttributeListener {
    private static final Logger logger = Logger.getLogger(tienviet.class.getName());

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            logger.info("Session attribute 'inputString' added: " + event.getValue());
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            logger.info("Session attribute 'inputString' removed: " + event.getValue());
        }
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            logger.info("Session attribute 'inputString' replaced: " + event.getValue());
        }
    }
}
