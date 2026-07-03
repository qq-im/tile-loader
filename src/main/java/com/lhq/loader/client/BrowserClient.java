package com.lhq.loader.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * jxbrower客户端 - 已禁用
 * 配置 openClient: 0 时，此客户端不会启动
 * 
 * @author lhq
 *
 */
@Component
public class BrowserClient {
    private static final Logger logger = LoggerFactory.getLogger(BrowserClient.class);

    @Value("${server.port}")
    private int port;
    @Value("${server.servlet.context-path}")
    private String path;

    public void open() {
        logger.info("JxBrowser client is disabled. Please access the application via web browser at http://localhost:{}{}", port, path);
        // JxBrowser functionality removed - using web client only
        // To enable desktop client, set openClient: 1 in application.yml and add jxbrowser dependencies
    }
}
