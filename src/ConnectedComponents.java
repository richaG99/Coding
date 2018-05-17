public class ConnectedComponents {

    public static void main(String args[]) {
        int[][] arr = {
                {1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 1},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 0, 0},
        };

        ConnectedComponents c = new ConnectedComponents();
        int count = c.findConnectedComponents(arr);
        System.out.println(count);
    }

    public int findConnectedComponents(int[][] arr) {
        if (arr == null) {
            return 0;
        }
        int row = arr.length;
        int col = arr[0].length;

        int connectedComp = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) {
                    connectedComp++;
                    visitgrid(arr, i, j, row, col);
                }
            }
        }
        return connectedComp;
    }

    public void visitgrid(int[][] arr, int i, int j, int row, int col) {
        if (i >= 0 && i < row && j >= 0 && j < col) {
            if (arr[i][j] == 1) {
                arr[i][j] = 0;
                visitgrid(arr, i - 1, j, row, col);
                visitgrid(arr, i + 1, j + 1, row, col);
                visitgrid(arr, i, j + 1, row, col);
                visitgrid(arr, i + 1, j + 1, row, col);
                visitgrid(arr, i + 1, j, row, col);
                visitgrid(arr, i + 1, j - 1, row, col);
                visitgrid(arr, i, j - 1, row, col);
                visitgrid(arr, i - 1, j - 1, row, col);
            }
        }
    }
}
