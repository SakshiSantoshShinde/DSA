class Solution {
    public void setZeroes(int[][] matrix) {

        ArrayList<Integer> arri = new ArrayList<>();
        ArrayList<Integer> arrj = new ArrayList<>();

        // Find all original zeros
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    arri.add(i);
                    arrj.add(j);
                }
            }
        }

        for(int r : arri)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                matrix[r][j] = 0;
            }
        }

        for(int c : arrj)
        {
            for(int i = 0; i < matrix.length; i++)
            {
                matrix[i][c] = 0;
            }
        }
    }
}