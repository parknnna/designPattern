package behavioral.interpreterPattern;

public class TerminalExpression implements Expression{
    final String data;
    
    public TerminalExpression(String data) {
        this.data = data;
    }
    
    @Override
    public boolean interpreter(String con) {
        
        if(con.contains(data)) return true;
        else return false;
    }
}