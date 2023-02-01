package C.configration.configration;

import C.configration.DataBaseConnectionInfo;
import C.configration.dao.StudentDao;
import C.configration.service.EMSInformationService;
import C.configration.service.StudentModifyService;
import C.configration.service.StudentRegisterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MemberConfig {

    @Bean
    public StudentDao studentDao(){
        return new StudentDao();
    }

    @Bean
    public StudentRegisterService registerService(){
        return new StudentRegisterService(studentDao());
    }
    @Bean
    public StudentModifyService modifyService(){
        return  new StudentModifyService(studentDao());
    }
    @Bean
    public DataBaseConnectionInfo dataBaseConnectionInfoDev(){
        DataBaseConnectionInfo infoDev = new DataBaseConnectionInfo;
        infoDev.setJdbcUrl("jdbc:oracle:thin:@192.168.0.1:1521:xe");
        infoDev.setUserId("masterid");
        infoDev.setUserPw("masterpw");

        return infoDev;
    }
    public EMSInformationService informationService(){
        EMSInformationService inform = new EMSInformationService();

        inform.setInfo("Education Management System program was developed in 2015.");
        inform.setCopyRight("COPYRIGHT(C) 2015 EMS CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION.");

        ArrayList<String> developers = new ArrayList<String>();
        developers.add("Cheney.");
        developers.add("Eloy.");
        developers.add("Jasper.");
        developers.add("Dillon.");
        developers.add("Kian.");
        inform.setDevelopers(developers);

        Map<String,String> map = new HashMap<String,String>();
        map.put("Cheney","cheney@spring.org");
        inform.setAdministrators(map);

        Map<String,DataBaseConnectionInfo>dbinfo = new HashMap<String,DataBaseConnectionInfo>();
        dbinfo.put("dev",dataBaseConnectionInfoDev());
        inform.setDbInfos(dbinfo);

        return inform;

    }



}
