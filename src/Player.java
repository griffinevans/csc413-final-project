/*
 *
 */

class Player {
  private static Player player_instance = null;

  private int maxHealth;
  private int currHealth;
  private int wealth;
  private int atkPow;

  private Player() {
    maxHealth = 10;
    currHealth = 10;
    wealth = 0;
    atkPow = 1;
  }

  public static Player getInstance() {
    if (player_instance == null) 
      player_instance = new Player();
    return player_instance;
  }

  /*
   * To take damage, subtract the amount of damage from the current health.
   */
  public void takeDamage(int damage) {
    currHealth -= damage;
  }

  public int getHealth() {
    return currHealth;
  }
  
  public int getWealth() {
    return wealth;
  }

}
