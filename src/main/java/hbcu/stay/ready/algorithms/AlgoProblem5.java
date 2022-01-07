package hbcu.stay.ready.algorithms;

public class AlgoProblem5 {

    public String greatEncrypt(String message, int shift){

        String response = "";

        for(char c : message.toCharArray()){
            if(Character.isLetter(c)) {
                c += shift;
            }
            response += c;
        }

        return response;

    }
}
