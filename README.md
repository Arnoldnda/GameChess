# ♟️ GameChess - Déplacement des Pièces

Ce projet Java est un exemple d'utilisation de l'**héritage**, du **polymorphisme** et de la **surcharge de méthode**.  
Il montre comment représenter des pièces d'échecs et valider leurs mouvements selon les règles du jeu.

## 🚀 Fonctionnalités

✅ Classe **`Piece`** :
- Attribut `position` (ligne, colonne)
- Vérification si un mouvement est dans les limites de l'échiquier (1 à 8)

✅ Classe **`Reine`** (hérite de `Piece`) :
- Remplace la méthode `isValidMove`
- Vérifie si le déplacement est valide pour une reine (même ligne, même colonne, diagonale)

✅ Classe **`Position`** :
- Stocke les coordonnées d'une case

✅ Classe **`Main`** :
- Crée une reine
- Teste différents déplacements
- Affiche si le déplacement est valide ou non

## 🛠️ Comment exécuter le projet
1️⃣ Cloner le dépôt : git clone https://github.com/Arnoldnda/GameChess.git

2️⃣ Ouvrir dans IntelliJ (ou un autre IDE)

3️⃣ Exécuter Main.java

## 🤝 Auteur
Berni ✌🏽
