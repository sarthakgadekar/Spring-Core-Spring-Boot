package org.studentmanagement.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = {"org.studentmanagement.model", "org.studentmanagement.service"})
public class AppConfig
{
}
