public class Schach {

    public static void main(String[] args){
        char[][] board = createBoard();
        showBoard(board);
    }

    // Aufgabe 5
    public static char[][] createBoard(){
        char wK = '♔';
        char wD = '♕';
        char wT = '♖';
        char wL = '♗';
        char wS = '♘';
        char wB = '♙';
        char sK = '♚';
        char sD = '♛';
        char sT = '♜';
        char sL = '♝';
        char sS = '♞';
        char sB = '♟';
        char[][] board = {{sT, sS, sL, sD, sK, sL, sS, sT}, {sB, sB, sB, sB, sB, sB, sB, sB}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}, {wB, wB, wB, wB, wB, wB, wB, wB}, {wT, wS, wL, wD, wK, wL, wS, wT}};

        return board;
    }

    // Aufgabe 6
    public static void showBoard(char[][] board){
        for (int i = 0; i<8; i++) {
            System.out.println(board[i]);
        }
    }

    // Aufgabe 7
    public static void move(char[][] board, char fromCol, int fromRow, char toCol, int toRow){



    }

}
