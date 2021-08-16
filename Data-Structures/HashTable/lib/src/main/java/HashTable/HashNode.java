package HashTable;



public class HashNode {
    public String key;
    public String value;

    public HashNode(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashNode{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
