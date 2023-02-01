package B.AutoWired.service;

import B.AutoWired.Dao.WordDao;
import B.AutoWired.WordSet;

public class WordSearchService {

    private WordDao wordDao;

    public WordSearchService(WordDao wordDao){
        this.wordDao = wordDao;
    }

    public WordSet search(String worldkey){
        if (verify(worldkey)){
            return wordDao.select(worldkey);
        }else {
            System.out.println("없는 아이디");
        }
        return  null;
    }


    public boolean verify(String worldkey){
        WordSet wordSet = wordDao.select(worldkey);

        return wordSet != null ? true : false;

    }

    public void initMethod(){
        System.out.println("빈 생성시 자동 출력");
    }

    public void destroyMethod(){
        System.out.println("빈 해제시 자동 출력");
    }
}
