package ci.pigier.chess;

public class Piece {
    Position position;

    //constructeur
    public Piece (Position position) {
        this.position = position ;
    }

    public boolean isValidMove (Position newPosition ) {
        // Vérifie si la nouvelle position est sur l'échiquier
        if (newPosition.row > 0 && newPosition.row <= 8 && newPosition.column > 0 && newPosition.column <= 8 ){
            return true ;
        } else {
            return false ;
        }
    }
}
