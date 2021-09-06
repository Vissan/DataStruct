import java.util.Arrays;

public class Sort {

    public int[] sort_bySelect(int b[]) {
        int[] a = b.clone();
        int len = a.length;

        for (int i = 0; i<len-1; i++) {
            int min = i;
            for (int j = i+1; j<len; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }

    public int[] sort_byBubble(int[] a) {
        int[] b = a.clone();
        int len = b.length;

        for (int i = 0; i < len-1; i++) {
            for (int j = 0;j < len-1-i; j++) {
                if (b[j+1] < b[j]) {
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                }
            }
        }
        return b;
    }

    public int[] sort_byInsert(int[] a) {
        int[] b = a.clone();
        int length = b.length;

        for (int i=1; i<length;i++) {
            int temp = b[i];
            int j = i-1;
            while (j>=0 && temp < b[j]) { //此处j应该要大于等于零，否则零的排序会出现问题
                b[j+1] = b[j];
                j--;
            }
            b[j+1] = temp;
        }
        return b;
    }

    public int[] sort_byShell(int[] a) {
      int length = a.length;
      int[] arr = a.clone();

      for (int step=length/2; step>=1; step/=2) {
          for (int i=step; i<length; i++) {
              int temp = arr[i];
              int j = i - step;
              while (j >= 0 && arr[j] > temp) {
                  arr[j + step] = arr[j];
                  j -= step;
              }
              arr[j + step] = temp;
          }
      }
      return arr;
    }

    public int[] sort_byMerge(int[] arr) {
        int[] a = arr.clone();
        int length = a.length;
        int middle = a.length/2;

        if (length<2)   return a;

        int[] left = Arrays.copyOfRange(a, 0, middle);
        int[] right = Arrays.copyOfRange(a, middle, length);

        return merge(sort_byMerge(left), sort_byMerge(right));
    }

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        int i = 0;

        while (left.length>0&&right.length>0) {
            if (left[0]<=right[0]) {
                result[i] = left[0];
                i++;
                left = Arrays.copyOfRange(left, 1, left.length);
            }
            else {
                result[i] = right[0];
                i++;
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        while (left.length>0) {
            result[i] = left[0];
            i++;
            left = Arrays.copyOfRange(left, 1, left.length);
        }

        while (right.length>0) {
            result[i] = right[0];
            i++;
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }

    public void sort_byQuick(int[] arr) {
        Arrays.sort(arr);
    }

}
