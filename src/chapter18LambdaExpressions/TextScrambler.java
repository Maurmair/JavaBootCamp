package chapter18LambdaExpressions;

public class TextScrambler {
    public String scramble(String s){
        StringBuilder sb = new StringBuilder();
        for (char ss : s.toCharArray()){
            sb = (ss == 'a')? sb.append("@") : (ss == 'e') ? sb.append("€") : (ss == 'l') ? sb.append("1") : (ss == 'o') ? sb.append("0") :
                    sb.append(ss);
//            if (ss == 'a'){
//                sb.append("@");
//            } else if (ss == 'e') {
//                sb.append("€");
//            } else if (ss == 'l') {
//                sb.append("1");
//            } else if (ss == 'o') {
//                sb.append("0");
//            } else {
//                sb.append(ss);
//            }
        }
        return sb.toString();
    }
}
