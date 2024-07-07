class slash implements Runnable // warna class slash extends Thread
{
    public void run() {
        for(int i=0;i<=45;i++){

            try{
                System.out.print("/");

            }

            catch(Exception ie){

                System.out.println(ie);
            }
        }

    }
}
class star implements Runnable  // warna class star extends Thread
{
    public void run() {
        for(int i=0;i<=45;i++){

            try{
                System.out.print("*");
                Thread.sleep(1800);

            }

            catch(Exception ie){

                System.out.println(ie);
            }
        }

    }
}
 class dollar implements Runnable
{
    public void run(){
        for (int i=0; i<=45; i++){

            try{
                System.out.print("$");
                Thread.sleep(2000);

            }
            catch (Exception ie){

                System.out.println(ie);
            }

        }
    }
}




 class notMain {

    public static void main(String args[]) {

        slash obj1 = new slash();
        Thread sex = new Thread(obj1);
        sex.setName("Bat");
        dollar obj2 = new dollar();
        Thread doSex = new Thread(obj2);
        doSex.setName("Ball");
        star obj3 = new star();
        Thread noSex = new Thread(obj3);
        noSex.setName("Bails");

        sex.start();  // extends waale me direct thread ke object ko start call dene ka par implements waale me ek aur object bana ke uske parameter me thread ka object daalne ka
        doSex.start();
        noSex.start();

        System.out.println("THREAD Id's of ALL THREADS : ");
        System.out.println("THREAD Id of obj1 : " +sex.getId());
        System.out.println("THREAD Id of obj2 : " +doSex.getId());
        System.out.println("THREAD Id of obj3 : " +noSex.getId());
        System.out.println("THE NAME OF THREAD Slash is : " +sex.getName());
        System.out.println("THE NAME OF THREAD Dollar is : " +doSex.getName());
        System.out.println("THE NAME OF THREAD Star is : " +noSex.getName());
        sex.setPriority(10);




    }
}
