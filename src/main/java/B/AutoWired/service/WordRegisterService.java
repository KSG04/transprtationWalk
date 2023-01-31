package B.AutoWired.service;

import B.AutoWired.Dao.WordDao;
import B.AutoWired.WordSet;

public class WordRegisterService {

    private WordDao wordDao;

    public WordRegisterService(WordDao wordDao){
        this.wordDao = wordDao;
    }

    public void register(WordSet wordSet){

        String worldkey = wordSet.getWorldkey();
        if (verify(worldkey)){
            wordDao.insert(wordSet);
        }else {
            System.out.println("이미 사용하고 있는 아이디");
        }
    }

    public boolean verify(String worldkey){

        WordSet wordSet = wordDao.select(worldkey);
        return wordSet == null ? true : false;
    }

}
