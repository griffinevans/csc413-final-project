abstract class Enemy {
  int maxHealth;
  int currHealth;
  int attackPower;
  String name;

  public void takeDamage(int damage) {
    currHealth -= damage;
  }

  public boolean isAlive() {
    return (currHealth >= 0)? true : false;
  }

  public int getAttackPower() {
    return attackPower;
  }

  public String getName() {
    return name;
  }

}
