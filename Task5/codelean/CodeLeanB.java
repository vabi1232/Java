package Task5.codelean;

public class CodeLeanB
{
    public static void main(String[] args) {
        new CodeLeanA().methodPublic();
        new CodeLeanA().methodProtected();
        new CodeLeanA().methodDefault();
    }
    public void methodPublic(){

    }
    protected void methodProtected(){}
    void methodDefault(){}
}
