package Utils;
public class ValidInputVerifier {
    public boolean verifyInput(String x, String y){
        return x!= null && y!=null && !x.equals("") && !y.equals("");
    }
}
