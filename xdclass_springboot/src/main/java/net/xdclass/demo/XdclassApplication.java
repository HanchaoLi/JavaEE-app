package net.xdclass.demo;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//equals
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
@ServletComponentScan
public class XdclassApplication {

	public static void main(String[] args) throws Exception{
    	SpringApplication.run(XdclassApplication.class, args);
    }
	@Bean  
    public MultipartConfigElement multipartConfigElement() {  
        MultipartConfigFactory factory = new MultipartConfigFactory();  
        //单个文件最大  
        factory.setMaxFileSize("102400KB"); //KB,MB  
        /// 设置总上传数据总大小  
        factory.setMaxRequestSize("1024000KB");  
        return factory.createMultipartConfig();  
    }  
	// if want to packing to war, use below code
//	public class XdclassApplication extends SpringBootServletInitializer {
//
//	    @Override
//	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//	        return application.sources(XdclassApplication.class);
//	    }
//
//	    public static void main(String[] args) throws Exception {
//	        SpringApplication.run(XdclassApplication.class, args);
//	    }
//
//	}
}
