abstract class Enemy {
  int maxHealth;
  int currHealth;
  int attackPower;

  public void takeDamage(int damage) {
    currHealth -= damage;
  }

  public boolean isAlive() {
    return (currHealth >= 0)? true : false;
  }

  public int getAttackPower() {
    return attackPower;
  }

}
