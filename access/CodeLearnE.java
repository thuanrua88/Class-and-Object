package access;
import access.CodeLearnB;

public class CodeLearnE extends CodeLearnB {
    public static void main(String[] args) {
        new CodeLearnB().methodPublic();
        new CodeLearnB().methodProtected();

        new CodeLearnE().methodProtected();
    }
}
