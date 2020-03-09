package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row){
        boolean result = true;
            for(int j = 0; j < board.length; j ++){
                if(board[row][j] != 'X'){
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column){
        boolean result = true;
        for(int i = 0; i < board.length; i ++){
            for(int j = 0; j < board.length; j ++){
                if(board[i][column] != 'X'){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board){
        char[] rs1 = new char[board.length];
        for(int i = 0; i < rs1.length; i++){
            rs1[i] = board[i][i];
        }
        return rs1;
    }

    public static boolean isWin(char[][] board){
        boolean result = false;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(monoHorizontal(board,2) || monoVertical(board,2)){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
