package B.AutoWired.Dao;

import B.AutoWired.WordSet;

import java.util.HashMap;
import java.util.Map;

public class WordDao {

    Map<String, WordSet> worldDB = new HashMap<String, WordSet>();


    public void insert(WordSet wordSet){
        worldDB.put(wordSet.getWorldkey(), wordSet);
    }
    public WordSet select(String worldkey){
        return worldDB.get(worldkey);
    }
}
