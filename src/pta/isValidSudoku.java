package pta;

import java.awt.*;
import java.util.HashMap;

public class isValidSudoku {
    public boolean solution(char[][] board) {
        /**
         * init hashmap
         */
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] column = new HashMap[9];
        HashMap<Integer, Integer>[] box = new HashMap[9];
        for (int i=0; i<9; i++) {
            rows[i] = new HashMap<>();
            column[i] = new HashMap<>();
            box[i] = new HashMap<>();
        }

        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (board[i][j]!='.') {
                    int num = (int) board[i][j];
                    int box_index = (i/3)*3+j/3;
                    rows[i].put(num, rows[i].getOrDefault(num, 0)+1);
                    column[j].put(num, column[j].getOrDefault(num, 0)+1);
                    box[box_index].put(num, box[box_index].getOrDefault(num, 0)+1);

                    if (rows[i].get(num)>1||column[j].get(num)>1||box[box_index].get(num)>1)
                        return false;
                }
            }
        }
        return true;
    }
}
