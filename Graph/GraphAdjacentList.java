package Graph;

import java.util.ArrayList;

public class GraphAdjacentList {
    ArrayList<ArrayList<Integer>> adlist;

    GraphAdjacentList(int vertex) {
        adlist = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
            adlist.add(new ArrayList<>());
        }
    }

    public void addEdge(int s, int d) {
        adlist.get(s).add(d);
        adlist.get(d).add(s);
    }
    public void print(){
        for(int i=0;i<adlist.size();i++){
            for(int j=0;j<adlist.get(i).size();j++){
                System.out.print(adlist.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        GraphAdjacentList graph = new GraphAdjacentList(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.print();
    }
}