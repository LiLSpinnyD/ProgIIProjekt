import javafx.stage.Stage;

public class Main {
  public static void main(String[] args) {
    System.out.println("Yves ist cool");
    System.out.println("Yannis ist auch cool");
    System.out.println("Dominik ist am coolsten");
    System.out.println("Janik ist kacke");
  
    GUI g = new GUI();
    Stage stage = new Stage();
    g.start(stage);
    

  }
}