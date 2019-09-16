import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Hello {
    static Logger logger = LogManager.getLogger(Hello.class.getName());
    public boolean hello() {
        logger.error("Did it again!");
        logger.info("我是info信息");
        logger.debug("我是debug信息");
        logger.warn("我是warn信息");
        logger.fatal("我是fatal信息");
        logger.log(Level.DEBUG, "我是debug信息");
        return false;
    }
}
