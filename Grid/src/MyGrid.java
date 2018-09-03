import com.grid.controler.AbstractGridControler;
import com.grid.controler.GridControler;
import com.grid.model.AbstractGridModel;
import com.grid.model.Grid;
import com.grid.view.GridView;

// https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/25552-mieux-structurer-son-code-le-pattern-mvc
public class MyGrid {

	public static void main(String[] args) {
		// Instanciation de notre mod�le
		AbstractGridModel grid = new Grid();
		// Cr�ation du contr�leur
		AbstractGridControler controler = new GridControler(grid);
		// Cr�ation de notre fen�tre avec le grid en param�tre
		GridView gridView = new GridView(controler);
		// Ajout de la fen�tre comme observer de notre mod�le
		grid.addObserver(gridView);
	}
}