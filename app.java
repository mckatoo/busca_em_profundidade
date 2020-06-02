package busca;

import grafos.*;

public class App {

  public static void main(String[] args) {
    System.out.println("Lista adjacente:\n" + listaAdjacente());
    System.out.println("-------------------------------------");
    System.out.println("Busca em profundidade:");
    new BuscaProfundidade().profundidade(listaAdjacente());
  }

  public static Grafo listaAdjacente(){
    Grafo g = new Grafo();
    Vertice seis = g.addVertice("6");
    Vertice cinco = g.addVertice("5");
    Vertice quatro = g.addVertice("4");
    Vertice tres = g.addVertice("3");
    Vertice dois = g.addVertice("2");
    Vertice um = g.addVertice("1");
    Aresta st = g.addAresta(seis, cinco);
    Aresta sa = g.addAresta(cinco, quatro);
    Aresta sy = g.addAresta(cinco, tres);
    Aresta ty = g.addAresta(quatro, dois);
    Aresta yt = g.addAresta(quatro, um);
    return g;
  }
}
