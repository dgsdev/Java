//**Resolver desafio**

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete a seguinte função para que a mesma devolva todos os possíveis números
     * de 4 dígitos, onde cada um seja menor ou igual a <maxDigit>,
     * e a soma dos dígitos de cada número gerado seja 21
     * Exemplos com maxDigit=6: 3666, 4566
     *
     * Caso nenhum número seja encontrado, retornar null.
     */
    public static List<Integer> calculation(int maxDigit) {
	    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int maxDigit = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Result.calculation(maxDigit);

        if(result != null){
            for (int i = 0; i < result.size(); i++) {
                if(i > 0){
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(String.valueOf(result.get(i)));
            }            
        }else{
            bufferedWriter.write("null");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
