package B.AutoWired;

public class WordSet {

    private String worldkey;
    private String worldvalue;

    public WordSet(String worldkey, String worldvalue){
        this.worldkey = worldkey;
        this.worldvalue = worldvalue;

    }

    public String getWorldkey() {
        return worldkey;
    }

    public void setWorldkey(String worldkey) {
        this.worldkey = worldkey;
    }

    public String getWorldvalue() {
        return worldvalue;
    }

    public void setWorldvalue(String worldvalue) {
        this.worldvalue = worldvalue;
    }
}
