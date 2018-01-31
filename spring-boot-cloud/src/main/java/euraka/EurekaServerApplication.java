package euraka;

import com.boot.springbootcloud.SpringBootCloudApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.*;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by zhengweiyfw on 2018/1/30.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
