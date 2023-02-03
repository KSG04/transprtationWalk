package C.configration.configration;

import C.configration.DataBaseConnectionInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig2 {


    @Bean
    public DataBaseConnectionInfo dataBaseConnectionInfoDev() {
        DataBaseConnectionInfo infoDev = new DataBaseConnectionInfo();
        infoDev.setJdbcUrl("jdbc:oracle:thin:@192.168.0.1:1521:xe");
        infoDev.setUserId("masterid");
        infoDev.setUserPw("masterpw");

        return infoDev;
    }
}