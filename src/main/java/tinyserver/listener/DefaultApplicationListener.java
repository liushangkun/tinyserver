/**
 * 
 */
package tinyserver.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author lsk
 */
public class DefaultApplicationListener implements ApplicationListener<ApplicationEvent> {

    //    private final static Logger logger = LoggerFactory.getLogger(DefaultApplicationListener.class);

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
    }

}
