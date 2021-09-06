package pta;

import java.util.ArrayList;
import java.util.List;

public class setZeroes {
    public int[][] solution(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> column = new ArrayList<>();

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    column.add(j);
                }
            }
        }

        for (int i=0; i<matrix.length; i++) {
            for (Integer integer : column) {
                matrix[i][integer] = 0;
            }
        }
        for (int j=0; j<matrix[0].length; j++) {
            for (Integer row : rows) {
                matrix[row][j] = 0;
            }
        }
        return matrix;
    }
}
