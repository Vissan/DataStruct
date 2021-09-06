import sun.awt.image.ImageWatched;

import javax.swing.tree.TreeModel;
import java.util.ArrayList;
import java.util.List;

public class MyDFS {
    public List<Integer>[] map;
    public boolean[] vis;
    /**
     *  map用于储存图，vis用于储存节点的状态
     */
    public MyDFS(List<Integer>[] map , int n){
        this.map = map;
        vis = new boolean[n];
    }

    /*
        dfs方法
     */
    public void dfs(int i){
        System.out.print(" " + i + "->");
        vis[i] = true;
        for(int j=0;j<map[i].size();j++){
            if(!vis[map[i].get(j)]){
                this.dfs(map[i].get(j));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList[] input = new ArrayList[9];
        for(int i=0;i<9;i++){
            input[i] = new ArrayList<>();
        }
        input[1].add(2);
        input[2].add(1);
        input[1].add(3);
        input[3].add(1);
        input[2].add(4);
        input[4].add(2);
        input[2].add(5);
        input[5].add(2);
        input[3].add(6);
        input[6].add(3);
        input[3].add(7);
        input[7].add(3);
        input[4].add(8);
        input[8].add(4);
        input[5].add(8);
        input[8].add(5);
        input[6].add(7);
        input[7].add(6);

        MyDFS test = new MyDFS(input, 9);
        test.dfs(1);


    }
}
