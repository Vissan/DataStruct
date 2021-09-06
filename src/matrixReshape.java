import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class matrixReshape {
    public int[][] solution(int[][] mat, int r, int c) {
        if (mat.length*mat[0].length != r*c)
            return mat;
        List<Integer> list = new ArrayList<>();
        for (int[] ints : mat)
            for (int j = 0; j < mat[0].length; j++)
                list.add(ints[j]);
        int[][] result = new int[r][c];
        int index_x = 0, index_y = 0, index = 0;
        for (int k=0; k<r; k++)
            for (int m=0; m<c; m++)
                result[index_x++][index_y++] = list.get(index++);

        return result;
    }
}
