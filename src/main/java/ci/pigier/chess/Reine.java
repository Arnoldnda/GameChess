package ci.pigier.chess;

public class Reine extends Piece{
    //constructeur
    public  Reine (Position position) {
        super(position) ; //appel le constructeur parents
    }

    @Override
    public boolean isValidMove (Position newPosition){
        // Vérifie si la nouvelle position est sur l'échiquier
        if ( ! super.isValidMove(newPosition) ) {
            return false ;
        }

        // Déplacement de la reine : même ligne, même colonne, ou diagonale
        int posRow = Math.abs(newPosition.row - position.row) ;
        int posColumn = Math.abs(newPosition.column - position.column) ;

        if (posRow == posColumn || //diagonal
            position.row == newPosition.row || //même ligne
            position.column == newPosition.column  //même colonne
        )
        {
            return true ;
        }

        return false ;
    }
}
