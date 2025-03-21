import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("Bro","broder");
        logininfo.put("Bru","BRUDER");
        logininfo.put("Bra","brader123");
    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}