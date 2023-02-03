package C.configration.configration;

import C.configration.DataBaseConnectionInfo;
import C.configration.service.EMSInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MemberConfig3 {
    @Autowired
    DataBaseConnectionInfo dataBaseConnectionInfoDev;


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
        dbinfo.put("dev",dataBaseConnectionInfoDev);
        inform.setDbInfos(dbinfo);

        return inform;

    }



}
