// A combat manager is created when a combat encounter starts
class CombatManager {

  Player player;
  Enemy enemy;
  InputManager im;

  public CombatManager(Player player, Enemy enemy) {
    this.player = player;
    this.enemy = enemy;
    im = InputManager.getInstance();
  }

  /*
   *
   */
  public void startCombat() {
    System.out.println("You are locked in combat with a " + enemy.getName());
    String s = im.getInput();
    switch(s) {
      case "attack":
        System.out.println("You strike at the " + enemy.getName() + "with your weapon");
        break;
      default:
        break;
    }
  }
}
