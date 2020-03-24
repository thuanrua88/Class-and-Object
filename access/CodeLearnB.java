package access;
import access.CodeLearnA;

public class CodeLearnB {
    public static void main(String[] args) {
        new CodeLearnA().methodPublic();
        new CodeLearnA().methodProtected();
        new CodeLearnA().methodDefault();
    }
    public void methodPublic(){
    }
    public void methodProtected(){
    }
    void methodDefault(){
    }
    private void methodPrivate(){
    }
}
