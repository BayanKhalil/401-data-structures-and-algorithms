package HashTable;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable {


    LinkedList<HashNode>[] buckets  = new LinkedList[5];

    public int hash (String key) {
        int len = key.length();
        int addedAscii = 0;
        for (int i = 0; i < len; i ++) {
            char character = key.charAt(i);
            int ascii = (int) character;
            addedAscii += ascii;
        }
        return addedAscii * 599 % buckets.length;

    }


    public boolean add (String key, String value) {

        int index = hash(key);
        HashNode node = new HashNode(key, value);

        if (buckets [index] == null) {
            buckets [index] = new LinkedList<>();
        }

        if(contains(key)) {
            return false;
        } else {
            buckets [index].add(node);
        }
        return true;
    }

    public boolean contains (String key) {
        int index = hash(key);


        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        for (int i = 0; i < buckets[index].size(); i++) {
            if (buckets [index].get(i).key.equals(key)){
                return true;
            }
        }
        return false;
    }



    @Override
    public String toString() {
        return "HashTable{" +
                "buckets=" + Arrays.toString(buckets) +
                '}';
    }
}


