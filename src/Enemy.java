abstract class Enemy {
  int maxHealth;
  int currHealth;

  public void takeDamage(int damage) {
    currHealth -= damage;
  }

  public boolean isAlive() {
    return (currHealth >= 0)? true : false;
  }

  public abstract void attack();
}
