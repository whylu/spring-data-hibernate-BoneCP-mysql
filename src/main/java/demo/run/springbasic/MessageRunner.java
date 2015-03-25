/*
 * Copyright© Institute for Information Industry
 * All rights reserved.
 * 本程式碼係屬財團法人資訊工業策進會版權所有，在未取得本會書面同意前，不得複製、散佈或修改。
 */
package demo.run.springbasic;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 程式資訊摘要：<P>
 * 類別名稱　　：MessageRunner.java<P>
 * 程式內容說明：<P>
 * 程式修改記錄：<P>
 * XXXX-XX-XX：<P>
 *@author minglungweng
 *@version 1.0
 *@since 1.0
 */
public class MessageRunner {

    final static Logger logger = LoggerFactory.getLogger(MessageRunner.class);
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        logger.info("Initializing Spring context.");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        
        logger.info("Spring context initialized.");

        Message message = (Message) applicationContext.getBean("message1");

        logger.debug("message='" + message.getMessage() + "'");
        
    }

}
