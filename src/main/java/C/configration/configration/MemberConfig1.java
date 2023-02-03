package C.configration.configration;

import C.configration.dao.StudentDao;
import C.configration.service.StudentModifyService;
import C.configration.service.StudentRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig1 {

    @Bean
    public StudentDao studentDao() {
        return new StudentDao();
    }

    @Bean
    public StudentRegisterService registerService() {
        return new StudentRegisterService(studentDao());
    }

    @Bean
    public StudentModifyService modifyService() {
        return new StudentModifyService(studentDao());
    }
}