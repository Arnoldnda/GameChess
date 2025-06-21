package ci.pigier.chess;

public class Main {
    public static void main (String[] args){
        Position initialPosition = new Position(1, 4) ;
        Reine reine = new Reine(initialPosition) ;

        Position move1 = new Position(4,1 ) ; // diagonale
        Position move2 = new Position(1, 6) ; // ligne
        Position move3 = new Position(5, 4) ; // colonne
        Position move4 = new Position(9, 8) ; // hors échiquier
        Position move5 = new Position(5, 6) ; // mouvement invalide

        Move(reine, move1) ;
        Move(reine, move2) ;
        Move(reine, move3) ;
        Move(reine, move4) ;
        Move(reine, move5) ;
    }

    public  static void Move (Reine reine, Position position ){
        if (reine.isValidMove(position)){
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("Nope, can't do!");
        }
    }
}
