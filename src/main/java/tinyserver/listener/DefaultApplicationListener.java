/**
 * 
 */
package tinyserver.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author lsk
 */
public class DefaultApplicationListener implements ApplicationListener<ApplicationEvent> {

    private final static Logger logger = LoggerFactory.getLogger(DefaultApplicationListener.class);

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        logger.info("=> Default ApplicationEvent : " + event);
    }

}
