package HashTable;

import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Scanner;

public class RepeatedWord {

    public String repeatedWord(String stringToRead) {
        HashTable Words = new HashTable();
        stringToRead = stringToRead.toLowerCase();
        String[] token = stringToRead.split(" ");

        for (int i = 0; i < token.length; i++) {
            if (Words.contains(token[i]))
              return token[i]; // word exists
            else

                Words.add(token[i],"1");
        }
       return null;
    }

}



