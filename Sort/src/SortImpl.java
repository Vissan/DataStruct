public class SortImpl {
    public static void main(String[] args) throws Exception {
        Sort sort = new Sort();
        int a[] = {2,3,1,4,0};

        System.out.println("元素组为：");
        for (int i : a) {
            System.out.printf("%d ", i);
        }
        System.out.println("\n 排序后的数组为：");
        for (int j : sort.sort_byMerge(a)) {
            System.out.printf("%d ", j);
        }
    }
}
