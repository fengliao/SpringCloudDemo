package com.fengliao;

import com.fengliao.utils.QRCodeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringCLoud中的“Discovery Service”有多种实现，比如：eureka, consul, zookeeper。
 * 1，@EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现
 * 2，@EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用
 * 如果你的classpath中添加了eureka，则它们的作用是一样的。
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RefreshScope
public class QrcodeApplication {
	private final Logger log= LoggerFactory.getLogger(QrcodeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(QrcodeApplication.class, args);
	}

	@Value("${QR.content}")
	String content;

	@Value("${QR.imgPath}")
	String imgPath;

	@Value("${QR.destPath}")
	String destPath;

	@GetMapping
	public String createImg(){
		long l = System.currentTimeMillis()/1000;
		String time = String.valueOf(l);
		try {
			Boolean flag = QRCodeUtil.encode(content, imgPath, destPath, true, time);
			if (!flag){
				return "二维码生成失败,请重试！";
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.info(e.getMessage());
		}
		return destPath+time+".jpg";
	}

}
