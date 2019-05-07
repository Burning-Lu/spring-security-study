package com.fiberhome.security.core;

import com.fiberhome.security.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lu Liang liang
 * @date 2019/4/24  15:10
 */

/**
 * 让SecurityProperties配置生效
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
}
