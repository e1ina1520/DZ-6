public class Boss extends GameEntity {
    private int sword;

    public int getSword() {
        return sword;
    }

    public void setSword(int sword) {
        this.sword = sword;
    }
    public String printInfo(){
        return getHealth()+ " "+ getDamage()+ " "+ getSword();
    }
}

