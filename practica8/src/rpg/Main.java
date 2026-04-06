package rpg;

import rpg.logic.GameController;
import rpg.ui.MenuUtils;

public class Main {
  public static void main(String[] args) {
    GameController gameController = new GameController();

    gameController.iniciar();
  }
}