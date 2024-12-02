package com.company;

public class pt_294_set_zero_matrix_brute_force_and_better_solution {

    public static void main(String[] args) {

        int [][]mat={
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

//        Brute force solution:
//        for (int i = 0; i <mat.length ; i++) {
//            for (int j = 0; j <mat[i].length ; j++) {
//
//                if(mat[i][j]==0)
//                {
//                    for(int j1=0;j1< mat.length;j1++)
//                    {
//                        if(mat[i][j1]!=0)
//                        {
//                            mat[i][j1]=-1;
//                        }
//                    }
//                    for(int i1=0;i1< mat.length;i1++)
//                    {
//                        if(mat[i1][j]!=0)
//                        {
//                            mat[i1][j]=-1;
//                        }
//                    }
//
//                }
//            }
//
//        }

//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j <mat[0].length ; j++) {
//                if (mat[i][j]==-1)
//                {
//                    mat[i][j]=0;
//                }
//                System.out.print(mat[i][j]+"  ");
//            }
//            System.out.println();
//        }


//        Better Approach:
        int []row=new int[mat.length];
        int []column=new int[mat[0].length];

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length ; j++)
            {
                if(mat[i][j]==0)
                {
                    row[i]=1;
                    column[j]=1;
                }
            }
        }


        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length ; j++)
            {
                if(row[i]==1 ||column[j]==1)
                {
                    mat[i][j]=0;
                }
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
