package HashTable;

import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Scanner;

public class RepeatedWord {

    public String repeatedWord(String stringToRead) {
        Hashtable Words=new Hashtable();
        stringToRead = stringToRead.toLowerCase();
        String[] token = stringToRead.split(" ");

        for (int i = 0; i < token.length; i++) {
            if (Words.containsKey(token[i]))
              return token[i];
            else

                Words.put(token[i],1);
        }
       return null;
    }


}



