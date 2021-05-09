package homework11;

//Write program which contains enum with 3 values (name of value and int number).
//Print out in main in other class all pairs which you store in enum.

public class TaskThreeEnumValues {

    enum Monster {
        Goblin(1), Orc(3), Ogre(5);
        private int i;

        Monster(int i){
            this.i = i;
        }

        public int getI(){
            return i;
        }
    }

    public static class Main {
        public static void main(String[] args) {

            Monster monster;
            for (Monster current : Monster.values()) {
                monster = current;
                System.out.println(current + " size " + current.getI() + " meters");
            }
        }
    }

}
