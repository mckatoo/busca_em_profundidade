import java.util.ArrayList;
import java.util.List;

public class Grafo {

  public List<Vertice> vertices = new ArrayList<Vertice>();

  public List<Aresta> arestas = new ArrayList<Aresta>();

  Vertice addVertice(String nome) {
    Vertice v = new Vertice(nome);
    vertices.add(v);
    return v;
  }

  Aresta addAresta(Vertice origem, Vertice destino) {
    Aresta e = new Aresta(origem, destino);
    origem.addAdj(e);
    arestas.add(e);
    return e;
  }

  public String toString() {
    String r = "";
    for (Vertice u : vertices) {
      r += u.nome + " -> ";
      for (Aresta e : u.adj) {
        Vertice v = e.destino;
        r += v.nome + ", ";
      }
      r += "\n";
    }
    return r;
  }
}
