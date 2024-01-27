package com.inteviewprep.Interface;

import java.util.ArrayList;

public class NQueens {
    public ArrayList<ArrayList<String>> solveNQueens(int n) {


        char[] col=new char[n];
        char diag1[]=new char[2*n];
        char diag2[]=new char[2*n];
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }

        ArrayList<ArrayList<String>> ans=new ArrayList<>();

        checkConfiguration(board,0,col,diag1,diag2,ans,n);
        return ans;
    }

    private static void checkConfiguration(char[][] board,int row,char[] col,char[] diag1,char[] diag2, ArrayList<ArrayList<String>> ans,int n) {

        if(row==n)
        {
            ArrayList<String> newList=new ArrayList<>();
            for(char[] b:board)
            {
                String str=String.valueOf(b);
                newList.add(str);
            }
            ans.add(newList);
            return ;
        }

        for(int j=0;j<n;j++)
        {
            if(col[j]=='#'||diag1[n+row-j]=='#'||diag2[row+j]=='#'){
                continue;
            }
            board[row][j]='Q';
            col[j]='#';
            diag1[n+row-j]='#';
            diag2[row+j]='#';
            checkConfiguration(board,row+1,col,diag1,diag2,ans,n);
            board[row][j]='.';
            col[j]='.';
            diag1[n+row-j]='.';
            diag2[row+j]='.';
        }
    }

    public static void main(String[] args) {
        NQueens nQueens=new NQueens();
        System.out.println( nQueens.solveNQueens(4));
    }
}
