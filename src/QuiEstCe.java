import extensions.CSVFile;
class QuiEstCe extends Program {
    
//----------------------------------------FONCTIONS AFFICHAGE FIGURES ET ANIMAUX-----------------------------------------------------

    void printCarre() {
	for (int i=1; i<=9; i++) {
	    for (int j=1; j<=9; j++) {
		if(i == 1 || i== 9) {
		    print("* ");
		} else if(j==1 || j==9) {
		    print("* ");
		} else {
		    print("  ");
		}
	    }
	    println();
	}
	println("    1- Carre");
    }

    void printRectangle() {
	up(10);
	for(int i=1; i<=5; i++) {
	    forward(25); 
	    for(int j=1; j<= 9; j++) {
		if(i == 1 || i==5) {
		    print("* ");
		} else if(j==1 || j==9) {
		    print("* ");
		} else {
		    print("  ");
		}
	    }
	    print("\n");
	}
	forward(25); println("   2- Rectangle");
    }

    void printTriangleIsocele() {
	up(7);
	for(int i=0; i<5; i++) {
	    forward(50);
	    for(int j = 1; j <= 9; j++) {
		if(i==4) {
		    if(j >= 5-i && j <= 5+i) {
			print("* ");
		    } else {
			print("  ");
		    }
		} else if(j == 5-i || j == 5+i) {
		    print("* ");
		} else {
		    print("  ");
		}
	    }
	    print("\n");
	}
	forward(50); println("3- Triangle isocele");
    }

    void printLosange() {
	up(7);
	for(int i=0; i<9; i++) {
	    forward(75);
	    for(int j=0; j <= 9; j++) {
		if(j == abs(4-i) || j == 4+i-((i/4)*(i%4)*2)) {
		    print("* ");
		} else {
		    print("  ");
		}
	    }
	    println();
	}
	forward(75); println("   4- Losange");
	    
    }

    void printTriangleRectangle() {
	up(10);
	for(int i=0; i<9; i++) {
	    forward(100);
	    for(int j=0; j<=i; j++) {
		if(i!=8) {
		    if(j==0 || j==i) {
			print("* ");
		    } else {
			print("  ");
		    }
		} else {
		    print("* ");
		}
	    }
	    println();
	}
	forward(100); println("5- Triangle rectangle");
    }

    void printTriangleEquilateral() {
	up(10);
	for(int i=0; i<8; i++) {
	    forward(130);
	    for(int j=0; j<16; j++) {
		if(j == 8-i || j == 8+i) {
		    print("*");
		} else {
		    print(" ");
		}
	    }
	    println();
	}
	forward(130); println("* * * * * * * * *");
	forward(128); println("6- Triangle equilateral");
    }

    void printQuadrilatere() {
	down();
	println("       *\n      * *\n     *   *\n    *     *\n   *       *\n  *         *\n *           *\n*             *\n*              *\n* * * * * * * * *\n7- Quadrilatere");
    }

    void printTrapeze() {
	up(11);
	forward(25); println("      * * *");
	for(int i=1; i<6; i++) {
	    forward(25);
	    for(int j=0; j<=10+i; j++) {
		if(j==6-i || j==10+i) {
		    print('*');
		} else {
		    print(' ');
		}
	    }
	    println();
	}
	forward(25); println("* * * * * * * * *"); forward(25); println("   8- Trapeze");
    }

    void printParallelogramme() {
	up(8);
	for(int i=0; i<7; i++) {
	    forward(50);
	    for(int j=0; j<17-i; j++) {
		if(i==0 || i==6) {
		    if(j%2==0 && j>=6-i) {
			print('*');
		    } else {
			print(' ');
		    }
		} else if(j==6-i || j==16-i) {
		    print('*');
		} else {
		    print(' ');
		}
	    }
	    println();
	}
	forward(50); println("9- Parallelogramme");
    }

    void printElephant() {
	println("       ____");
	println("    .'`    `';--.___.-.");
	println("   /        /       \\  \\");
	println(" /|         )     ..|  (");
	println("\" \\         '--' \\  |--'");
	println("   \\     |       /\\=\\");
	println("    |   /__.|  ||  '.`-,");
	println("    |__|_|  |__||    `'`");
	println("    `\"\"`\"`  `\"\"``\n");
	println("     1- Elephants");
    }

    void printChat() {
	up(11);
	forward(30); println("               ,");
	forward(30); println("             _/((");
	forward(30); println("    _.---. .'   `\\");
	forward(30); println("  .'      `     ^ T=");
	forward(30); println(" /     \\       .--'");
	forward(30); println("|      /       )'-.");
	forward(30); println("; ,   <__..-(   '-.)");
	forward(30); println(" \\ \\-.__)    ``--._)");
	forward(30); println("  '.'-.__.-.");
	forward(30); println("    '-...-'");
	forward(30); println("      2- Chat");
    }

    void printMouche() {
	up(11);
	forward(56); println("            ,");
	forward(56); println("        `-.   \\    .-'");
	forward(56); println(",-\"`````\"\"-\\__ |  /");
	forward(56); println(" '-.._    _.-'` '-o,");
	forward(56); println("     _>--:{{<   ) |)");
	forward(56); println(" .-''      '-.__.-o`");
	forward(56); println("'-._____..-/`  |  \\");
	forward(56); println("        ,-'   /    `-.");
	forward(56); println("              `\n");
	forward(56); println("      3- Mouche");
    }

    void printGorille() {
	up(11);
	forward(85); println("      .\"`\".");
	forward(85); println("  .-./ _=_ \\.-.");
	forward(85); println(" {  (,(oYo),) }}");
	forward(85); println(" {{ |   \"   |} }");
	forward(85); println(" { { \\(---)/  }}");
	forward(85); println(" {{  }'-=-'{ } }");
	forward(85); println(" { { }._:_.{  }}");
	forward(85); println(" {{  } -:- { } }");
	forward(85); println(" {_{ }`===`{  _}");
	forward(85); println("((((\\)     (/))))");
	forward(85); println("    4- Gorille");
    }

    void printChauveSouris() {
	up(11);
	forward(108); println("               /'.    .'\\");
	forward(108); println("               \\( \\__/ )/");
	forward(108); println("         ___   / (.)(.) \\  _ __");
	forward(108); println("    _.-\"`_  `-.|  ____  |.-`  _`\"-._");
	forward(108); println(" .- .-'//||`'-.\\  V--V  /.-'`||\\\\'-.'-.");
	forward(108); println("`'-'-.// ||    /  .__.  \\    || \\\\.-'-'`");
	forward(108); println("      `-.||_.._|        |_.._||.-'");
	forward(108); println("               \\ ((  )) /");
	forward(108); println("                '.    .'");
	forward(108); println("                  `\\/`");
	forward(108); println("            5- Chauve-Souris\n");
    }

    void printCheval() {
	println("                   ;;");
	println("                 ,;;'\\");
	println("      __       ,;;' ' \\");
	println("    /'  '\\'~~'~' \\ /'\\.)");
	println(" ,;(      )    /  |.");
	println(",;' \\    /-.,,(   ) \\");
	println("     ) /       ) / )|");
	println("     ||        ||  \\)");
	println("     (_\\       (_\\\n");
	println("       6- Cheval");
    }

    void printPoule() {
	up(11);
	forward(31); println(" _/}");
	forward(31); println("`>' \\");
	forward(31); println(" `|  \\");
	forward(31); println("  |  /'-.    .-.");
	forward(31); println("  \\'   ';`--' .'");
	forward(31); println("   \\'.   `'-./");
	forward(31); println("    '.`\"-..-;`");
	forward(31); println("      `;-..'");
	forward(31); println("      _| _|");
	forward(31); println("       /` /`");
	forward(31); println("    7- Poule");
    }

    void printLion() {
	up(11);
	forward(54); println("   ,%%%%%%%,");
	forward(54); println(" ,%%/\\%%%%/\\%,");
	forward(54); println(",%%%\\c \"\" J/%%,");
	forward(54); println("%%%%/ d  b \\%%%");
	forward(54); println("%%%%    _  |%%%");
	forward(54); println("`%%%%(=_Y_=)%%'");
	forward(54); println(" `%%%%`\\7/%%%'");
	forward(54); println("   `%%%%%%%'\n\n");
	forward(54); println("    8- Lion");
    }

    void printMouton() {
	up(11);
	forward(75); println("             __");
	forward(75); println("   ,'```--'''  ``-''-.");
	forward(75); println(" ,'            ,-- ,-'.");
	forward(75); println("(//            `\"'| 'a \\");
	forward(75); println("  |    `;         |--._/");
	forward(75); println("  \\    _;-._,    /");
	forward(75); println("   \\__/\\\\   \\__,'");
	forward(75); println("    ||  `'   \\|\\\\");
	forward(75); println("    \\\\        \\\\`'");
	forward(75); println("     `'        `'");
	forward(75); println("      9- Mouton");
    }
	
    
    void printFigures(boolean[] tab) {
	if(tab[0]) { printCarre(); } else {  text("black"); printCarre(); reset(); }
	if(tab[1]) { printRectangle(); } else { text("black"); printRectangle(); reset(); }
	if(tab[2]) { printTriangleIsocele(); } else { text("black"); printTriangleIsocele(); reset(); }
	if(tab[3]) { printLosange(); } else { text("black"); printLosange(); reset(); }
	if(tab[4]) { printTriangleRectangle(); } else { text("black"); printTriangleRectangle(); reset(); }
	if(tab[5]) { printTriangleEquilateral(); } else { text("black"); printTriangleEquilateral(); reset(); }
	if(tab[6]) { printQuadrilatere(); } else { text("black"); printQuadrilatere();  reset(); }
	if(tab[7]) { printTrapeze(); } else { text("black"); printTrapeze();  reset(); }
	if(tab[8]) { printParallelogramme(); } else { text("black"); printParallelogramme(); reset(); }
	cursor(24,1);
    }

    void printAnimaux(boolean[] tab) {
	if(tab[0]) { printElephant(); } else { text("black"); printElephant(); reset(); }
	if(tab[1]) { printChat(); } else { text("black"); printChat();  reset(); }
	if(tab[2]) { printMouche(); } else { text("black"); printMouche();  reset(); }
	if(tab[3]) { printGorille(); } else { text("black"); printGorille(); reset(); }
	if(tab[4]) { printChauveSouris(); } else { text("black"); printChauveSouris(); reset(); }
	if(tab[5]) { printCheval(); } else { text("black"); printCheval(); reset(); }
	if(tab[6]) { printPoule(); } else { text("black"); printPoule(); reset();}
	if(tab[7]) { printLion(); } else { text("black"); printLion(); reset(); } 
	if(tab[8]) { printMouton(); } else { text("black"); printMouton(); reset(); }
	cursor(25,1);
    }

    void afficherObjets(boolean theme, boolean[] visibles) {
	clearScreen(); cursor(1,1);
	if(theme) {
	    printFigures(visibles);
	} else {
	    printAnimaux(visibles);
	}
    }


//-------------------------------------------------------MENU ET SCORES--------------------------------------------------------------

    String lireChaine() {
	show();
	String chaine = readString();
	hide();
	return chaine;
    }
    
    void afficherMenu() {
	clearScreen(); cursor(1,1);
	cursor(8,1);
	text("yellow");
	forward(24); println(" _______   __   __   ___      _______   _______   _______              _______   _______     ______");
	forward(24); println("|       | |  | |  | |   |    |       | |       | |       |            |       | |       |   |      |");
	forward(24); println("|   _   | |  | |  | |   |    |    ___| |  _____| |_     _|    ____    |       | |    ___|   |___   |");
	forward(24); println("|  | |  | |  |_|  | |   |    |   |___  | |_____    |   |     |____|   |       | |   |___      __|  |");
	forward(24); println("|  |_|  | |       | |   |    |    ___| |_____  |   |   |              |      _| |    ___|    |_____|");
	forward(24); println("|      |  |       | |   |    |   |___   _____| |   |   |              |     |_  |   |___       __");
	forward(24); println("|____||_| |_______| |___|    |_______| |_______|   |___|              |_______| |_______|     |__|");
	text("green");
	cursor(21,1);
	forward(6); println("1- Commencer une partie");
	forward(6); println("2- Tableau des scores");
	forward(6); println("3- Quitter");
	reset();
    }

    int choixMenu() {
	String choix;
	forward(6); print("Entre le numero correspondant :  "); cusp();
	do {
	    curp(); clearEOL();
	    choix = lireChaine();
	} while(length(choix) != 1 || charAt(choix,0)-'0'<1 || charAt(choix,0)-'0'>3);
	return charAt(choix,0)-'0';
    }

    void afficherMeilleursScores(String[][] tab) {
	clearScreen(); cursor(1,1);
	afficherTab(tab);
	print("Appuie sur Entree pour revenir au menu.  ");
	lireChaine();
    }

    void afficherRegles(String nomJoueur) {
	clearScreen(); cursor(2,15);
	println("BIENVENUE "+nomJoueur+" !"); down(3);
	text("green");  println(getCell(loadCSV("ReglesPartie.csv",';'),0,0));  reset();
	down(4);
	print("Appuie sur Entree pour commencer la partie.  ");
	lireChaine();
    }

    String[][] CSVToString(CSVFile scores) {
	String[][] res = new String[rowCount(scores)][columnCount(scores)];
	for(int i=0; i<length(res,1); i++) {
	    for(int j=0; j<length(res,2); j++) {
		res[i][j] = getCell(scores,i,j);
	    }
	}
	return res;
    }

    void afficherTab(String[][] tab) {
	text("red");
	println("PSEUDONYMES             SCORES ATTEINTS\n");
	reset();
	for(int i=1; i<length(tab,1); i++) {
	    for(int j=0; j<length(tab,2); j++) {
		print(tab[i][j]);
		for(int k=length(tab[i][j]); k<25; k++) {
		    print(' ');
		}
	    }
	    println("\n");
	}
    }

    int StringToInt(String nombre) {
	int res=0;
	for(int i=0; i<length(nombre); i++) {
	    res = res + ((charAt(nombre,length(nombre)-1-i)-'0')*(int)pow(10,i));
	}
	return res;
    }

    String[] listePseudos(String[][] tab) {
	String[] res = new String[length(tab,1)-1];
	for(int i=0; i<length(res); i++) {
	    res[i] = tab[i+1][0];
	}
	return res;
    }

    boolean estPresent(String test, String[] liste) {
	for(int i=0; i<length(liste); i++) {
	    if(equals(test,liste[i])) {
		return true;
	    }
	}
	return false;
    }

    boolean chaineVide(String test) {
	for(int i=0; i<length(test); i++) {
	    if(charAt(test,i) != ' ') {
		return false;
	    }
	}
	return true;
    }

    String saisiePseudo(String[] pseudos) {
	String pseudo; boolean estUtilise; boolean estVide; boolean tropLong;
	print("Choisis ton pseudo ( entre 1 et 15 caracteres ) :  "); cusp();
	do {
	    curp(); clearEOL();
	    pseudo = lireChaine();
	    estVide = chaineVide(pseudo);
	    estUtilise = estPresent(pseudo,pseudos);
	    tropLong = length(pseudo)>11;
	    if(estVide) {
		print("Saisie vide."); delay(2000); clearLine();
	    } else if(estUtilise) {
		print("Pseudo déjà utilisé."); delay(2000); clearLine();
	    } else if(tropLong) {
		print("Pseudo trop long."); delay(2000); clearLine();
	    }
	} while(estVide || estUtilise || tropLong);
	return pseudo;
    }

    int classement(int score, String[][] best) {
	int place = 1;
	while (place < length(best,1) && score <= StringToInt(best[place][1])) {
	    place++;
	}
	return place;
    }

    void decalage(String[][] t, int numCase) {
	for(int i=length(t)-1; i > numCase; i--) {
	    t[i][0]=t[i-1][0];
	    t[i][1] = t[i-1][1];
	}
    }

    void insertionTab(String [][] tab,int score,int rang, String pseudo) {
	decalage(tab,rang);
	tab[rang][0] = pseudo;
	tab[rang][1] = ""+score;
    }
    
    
 
//-------------------------------------------------VARIABLES GLOBALES----------------------------------------------------------------

    CSVFile Figures = loadCSV("QuestionsPropriétésFigures.csv",';');
    CSVFile Animaux = loadCSV("QuestionsPropriétésAnimaux.csv",';');
    
    
//------------------------------------------------FONCTIONS DEROULEMENT PARTIE-------------------------------------------------------

    String[] initQuestions(boolean theme) {
	CSVFile fichier;
	if(theme) {
	    fichier = Figures;
	} else {
	    fichier = Animaux;
	}
	String[] res = new String[rowCount(fichier)-1];
	for(int i=0; i<length(res); i++) {
	    res[i] = getCell(fichier,i+1,0);
	}
	return res;
    }

    boolean[] initProprietes(int numObjet) {
	CSVFile fichier;
	if(numObjet<9) {
	    fichier = Figures;
	} else {
	    fichier = Animaux;
	    numObjet = numObjet-9;
	}
	boolean[] res = new boolean[rowCount(fichier)-1];
	for(int i=0; i<length(res); i++) {
	    res[i] = equals(getCell(fichier,i+1,numObjet+1),"oui");
	}
	return res;
    }
    
    void decalageTab(int numQuest, int nbQuest, String[] questions, boolean[] proprietes) {
	for(int i=numQuest; i<length(questions)-nbQuest-1; i++) {
	    questions[i] = questions[i+1];
	    proprietes[i] = proprietes[i+1];
	}
    }
    
    int selectObjet(boolean theme) {
	int res = (int)(random()*9); // 9 candidats par theme
	if(!theme) {
	    res = res + 9;
	}
	return res;
    }

    boolean[] copieArray(boolean[] tab) {
	boolean[] res = new boolean[length(tab)];
	for(int i=0; i<length(res); i++) {
	    res[i] = tab[i];
	}
	return res;
    }

    String[] copieArray(String[] tab) {
	String[] res = new String[length(tab)];
	for(int i=0; i<length(res); i++) {
	    res[i] = tab[i];
	}
	return res;
    }

    boolean[] initTrueTab(int nbCases) {
	boolean[] tab = new boolean[nbCases];
	for(int i=0; i<nbCases; i++) {
	    tab[i] = true;
	}
	return tab;
    }

    void afficherQuestions(int nbQuestions, String[] liste) {
	text("blue");
	for(int i=0; i<length(liste)-nbQuestions; i++) {
	    println(i+1 +"- "+ liste[i]);
	}
	reset();
    }

    void afficherScore(int score,int best,int nbJeux) {
	text("green"); println("Ton score est de "+score+", le meilleur score est de "+best+".\nIl te reste "+(2-nbJeux)+" tours de jeux."); reset();
    }

    void printScoreFinal(int score, int best) {
	println("La partie est finie, ton score est de "+score+". "); delay(2500);
	if(score>best) {
	    println("Bravo ! Tu as battu le record de points !");
	}
    }

    void afficherPoints(int points) {
	cusp();
	text("green"); print("Tu peux encore marquer "+points+" points."); reset();
	delay(4000); curp(); clearEOL();
    }


    int questionJoueur(int nbQuestions, String[] listeQuestions) {
	String num;
	print("Entre le numero de la question : "); cusp();
	do {
	    curp(); clearEOL();
	    num = lireChaine(); 
	} while(length(num) != 1 || charAt(num,0)-'0'-1 < 0 || charAt(num,0)-'0'-1 >= length(listeQuestions) - nbQuestions);
	return charAt(num,0)-'0'-1;
    }

    void finPartie(boolean succes, int reponse, int points) {
	if(!succes) {
	    print("Dommage, vous n'avez pas reussi a avoir la bonne reponse ! ");
	}
	print("Il fallait trouver ");
	if(reponse==0) { print("Carre");}
	else if(reponse==1) { print("Rectangle");}
	else if(reponse==2) { print("Triangle isocele"); }
	else if(reponse==3) { print("Losange");}
	else if(reponse==4) { print("Triangle rectangle");}
	else if(reponse==5) { print("Triangle equilateral");}
	else if(reponse==6) { print("Quadrilatere");}
	else if(reponse==7) { print("Trapeze");}
	else if(reponse==8) { print("Parallelogramme");}
	else if(reponse==9) { print("Elephant"); }
	else if(reponse==10) { print("Chat"); }
	else if(reponse==11) { print("Mouche"); }
	else if(reponse==12) { print("Gorille"); }
	else if(reponse==13) { print("Chauve-souris"); }
	else if(reponse==14) { print("Cheval"); }
	else if(reponse==15) { print("Poule"); }
	else if(reponse==16) { print("Lion"); }
	else { print("Mouton"); }
	println(".\nTu marques "+points+" points.");
    }

    void reponseAuJoueur(int numQuest, boolean[] reponses) {
	if(reponses[numQuest]) {
	    println("oui");
	} else {
	    println("non");
	}
	delay(2500);
    }

    int solutionJoueur(boolean theme) {
	String reponse;
	print("Choisis le numero du candidat auquel tu penses : "); cusp();
	do {
	    curp(); clearEOL();
	    reponse = lireChaine();
	}while(length(reponse) != 1 || charAt(reponse,0)-'0'-1<0 || charAt(reponse,0)-'0'-1 >= 9); // 9 candidats
	int n = 9;
	if(theme) {
	    n=0;
	}
	return n+charAt(reponse,0)-'0'-1;
    }

    char choixJoueur() { // choix : poser question ou proposer solution
	String choix;
	print("Si tu souhaites poser une question ( coût : 10 points ), entre 'q' ; si tu souhaites proposer une solution, entre 's' ( coût ; 30 points en cas d'échec) : "); cusp();
	do {
	    curp(); clearEOL();
	    choix = lireChaine();
	} while(length(choix)!=1 || (charAt(choix,0) != 's' && charAt(choix,0) != 'q'));
	up(); clearEOL();
	return charAt(choix,0);
    }

    void modif(boolean[] tab, String numeros) {
	for(int i=0; i<length(numeros); i++) {
	    char c = charAt(numeros,i);
	    if(c>='1' && c<='9') {
		tab[c-1-'0'] = !tab[c-1-'0'];
	    }
	}
    }
	
    
//-----------------------------------------------------------ALGO--------------------------------------------------------------------
 
    void algorithm() {
	hide();
	final int nbToursPartie = 2;
	int choix;
	do {
	    String[][] tabScores = CSVToString(loadCSV("TabScores.csv",';'));
	    afficherMenu();
	    choix = choixMenu();
	    if(choix == 1) {
		int meilleurScore = StringToInt(tabScores[1][1]); // à déterminer avec fichier CSV
		int scorePartie=0;
		String pseudoJoueur = saisiePseudo(listePseudos(tabScores));
	      	afficherRegles(pseudoJoueur);
		    for(int i=0; i<nbToursPartie; i++) {
			boolean theme = i%2 == 0; // true : figures géométriques ; false : animaux
			int objet = selectObjet(theme);
			String[] questions = initQuestions(theme);
			int totalQuestions = length(questions);
			boolean[] proprietes = initProprietes(objet);
			boolean[] visibles = initTrueTab(9); // 9 candidats, tous visibles au début de la partie
			int cptQuestions=0;
			boolean trouve = false;
			int nbPoints = 100; // nombre de points diminuant au cours de la partie
			while(!trouve && nbPoints != 0) {
			    if(cptQuestions >= 1) {
				print("Tape les numeros des candidats que tu souhaites masquer ou demasquer, puis appuie sur Entree  ");
				modif(visibles,lireChaine());
			    }
			    afficherObjets(theme,visibles); // avec nettoyage de l'écran
			    afficherPoints(nbPoints);
			    if(nbPoints == 10 || cptQuestions == totalQuestions || choixJoueur() == 's') { 
				if(solutionJoueur(theme) == objet) {
				    trouve = true;
				    println("Bravo tu as trouve !");
				} else {
				    println("Ce n'est pas la bonne reponse.");
				    delay(1000);
				    nbPoints = nbPoints-30;
				    if(nbPoints < 0) {
					nbPoints = 0;
				    }
				}
			    } else {
				afficherQuestions(cptQuestions,questions);
				int questionPose = questionJoueur(cptQuestions,questions);
				print(questions[questionPose] + "  "); delay(1000);
				reponseAuJoueur(questionPose,proprietes);
				decalageTab(questionPose,cptQuestions,questions,proprietes);
				nbPoints = nbPoints-10;
				cptQuestions++;
			    }
			}
			finPartie(trouve,objet,nbPoints); delay(3000);
			scorePartie = scorePartie + nbPoints;
			if(i!=1) {
			    afficherScore(scorePartie,meilleurScore,i+1);
			    delay(3000);
			}
		    }
		printScoreFinal(scorePartie,meilleurScore);
		int place = classement(scorePartie,tabScores);
		if(place <= 10) {
		    if(place != 1) {
			println("Tu as obtenu le "+place+"eme meilleur score !"); delay(1200);
		    }
		    insertionTab(tabScores,scorePartie,place,pseudoJoueur);
		    saveCSV(tabScores,"TabScores.csv",';'); saveCSV(tabScores,"../ressources/TabScores.csv",';');
		}
	    } else if(choix == 2) {
		afficherMeilleursScores(tabScores);
	    }
	} while(choix != 3);
	show();
    }
	

//-------------------------------------------------FONCTIONS TESTS-------------------------------------------------------------------

    void testSelectObjet() {
	for(int i=0; i<20; i++) {
	    boolean theme = random() < 0.5;
	    int test = selectObjet(theme);
	    if(theme) {
		assertTrue(test >= 0 && test < 9);
	    } else {
		assertTrue(test >= 9 && test < 18);
	    }
	}
    }

    void testInitTrueTab() {
	assertArrayEquals(new boolean[] {true,true,true} , initTrueTab(3));
	assertArrayNotEquals(new boolean[] {false,true} , initTrueTab(2));
    }

    void testCopieArray() {
	boolean[] tabB = new boolean[] {true,true,false};
	String[] tabS = new String[] {"ab","abc","abcd",""};
	assertArrayEquals(tabB , copieArray(tabB));
	assertArrayEquals(tabS , copieArray(tabS));
    }

    void testEstPresent() {
	String[] test = new String[] {"Jean","Patrick","Michel","Eric"};
	assertTrue(estPresent("Jean",test));
	assertTrue(estPresent("Patrick",test));
	assertFalse(estPresent("Henry",test));
    }

    void testChaineVide() {
	assertTrue(chaineVide(""));
	assertTrue(chaineVide("    "));
	assertFalse(chaineVide("Bonjour   !  "));
    }
    
    void testInsertionTab() {
	String[][] t = new String[][] {{"Marie","100"},{"Max","80"},{"Paul","75"}};
	insertionTab(t,82,1, "Michel");
	assertArrayEquals(new String[][] {{"Marie","100"},{"Michel","82"},{"Max","80"}},t);
    }

    void testStringToInt() {
	assertEquals(2016, StringToInt("2016"));
	assertEquals(886469, StringToInt("886469"));
    }
}
