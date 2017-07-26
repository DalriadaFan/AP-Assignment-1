package calenfea;

public class Lexer {
    String code = "Let x\nLet y=0;x = y;x = x + 10;";
    String toks = "";
    boolean expr = false, expectExpr = false, expectDatType = false;
    String PrimaryKWords = "(Print|Let)";
    String SecondaryKWords = "(int|bool)";

    public void Lex(){

        for(int i=0; i<code.length();i++){

            toks+=code.charAt(i);

            if(code.charAt(i)==' '){
                toks="";
            }
            else if(toks.matches(PrimaryKWords)){
                AnalyseToken(toks);
                toks="";
            }
            else if(expectDatType == true){
                if(toks.matches(SecondaryKWords)){
                    AnalyseToken(toks);
                    toks="";
                }
                else{
                    System.out.println("Error: expected a data type.");
                }
            }
            else if(true){
                int j = 0;//chill your tits
            }
        }
    }

    public void AnalyseToken(String t){
        switch(t){
            case "Print":
                expectExpr = true;
                expectDatType = false;
                expr = false;
                break;

            case "Let":
                expectExpr = false;
                expectDatType = true;
                expr = false;
                break;

            case "int":
                expectExpr = true;
                expectDatType = false;
                expr = false;
                break;

            case "bool":
                expectExpr = true;
                expectDatType = false;
                expr = false;
                break;
        }
    }

    public void PrintTokens(){
        System.out.println(code);
    }

    public void PrintCode(){
        System.out.println(code);
    }
}