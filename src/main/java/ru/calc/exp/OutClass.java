package ru.calc.exp;


public class OutClass {
    String [] tokensBlanks;
    private int pos;


    public OutClass(String scan) {
        this.tokensBlanks = scan.split(" ");
        this.pos = 0;
    }

    public int calc(){
        int first = Integer.parseInt(tokensBlanks[pos++]);

        while (pos < tokensBlanks.length){
            String oper = tokensBlanks[pos];
            if(!oper.equals("+") && !oper.equals("-")){
                break;
            }else {
                pos++;
            }
            int second = Integer.parseInt(tokensBlanks[pos++]);
            if(oper.equals("+")){
                first += second;
            }else
                first -= second;
        }
        return first;
    }

}
