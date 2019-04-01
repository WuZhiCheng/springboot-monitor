package com.jhzx.bfp.trade.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
@EnableTurbine
public class BfpTradeMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BfpTradeMonitorApplication.class, args);
	}
}
