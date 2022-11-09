public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1500);
        boss.setDamage(350);
        boss.setSword(150);
        System.out.println("BOSS");
//        System.out.println("Health:"+ " " + boss.getHealth());
//        System.out.println("Damage:" + " " + boss.getDamage());
//        System.out.println("Sword:" + " " + boss.getSword());

        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(900);
        skeleton1.setDamage(100);
        skeleton1.setSword(40);
        skeleton1.setArrows(50);
        System.out.println("SKELETON1");
        System.out.println(skeleton1.printInfo());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(850);
        skeleton2.setDamage(120);
        skeleton2.setSword(50);
        skeleton2.setArrows(60);
        System.out.println("SKELETON2");
        System.out.println(skeleton2.printInfo());
    }
}

