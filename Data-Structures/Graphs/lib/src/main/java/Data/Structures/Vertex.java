package Data.Structures;

import java.util.Objects;

public class Vertex {

    String data;
    public int weight;

    public Vertex(String data) {
        this.data = data;
    }

    public Vertex() {
        super();
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vertex)) return false;
        Vertex vertex = (Vertex) obj;
        return data.equals(vertex.data);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data='" + data + '\'' +
                '}';
    }
}
