abstract class Animal {

    public abstract void Sound();
}

class Cat extends Animal {
    String sound;



    public Cat(String sound) {
        this.sound = sound;


    }



    public void Sound() {

         String sound = "MEOW";
        System.out.println("Sound made by Cat is : " + sound);
    }
}

class Dog extends Animal {
    String sound;


    public Dog(String sound) {
        this.sound = sound;
    }


        public void Sound() {

        String sound = "BHOW";
        System.out.println("Sound made by Dog is : " +sound);
    }
}

class Goat extends Animal {
    String sound;


    public Goat(String sound) {
        this.sound = sound;
    }


        public void Sound() {
            String sound = "MAEH-MAEH";

            System.out.println("Sound made by Goat is : " + sound);
        }
    }

    class abstractClassSoundWaalaCode {
        public static void main(String args[]) {
            Animal s = new Cat("");
            s.Sound();
            s = new Dog("");
            s.Sound();
            s = new Goat("");
            s.Sound();
        }
    }
    