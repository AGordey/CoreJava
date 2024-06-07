package Lecture7;

public class Cosmodrome {
    private Rocket rocket;

    public Cosmodrome(Rocket rocket) {
        this.rocket = rocket;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public void start() throws InterruptedException {
        if (rocket.beforeStartCheck()) {
            for (int i = 9; i >= 0; i--) {
                System.out.print(i + " ");
                Thread.sleep(100);
            }
            System.out.println();
            rocket.start();
        } else {
            System.out.println("Предстартовая проверка ракеты "+ rocket.getName() +" неудачная");
        }
        ;
    }

    public static void main(String[] args) throws InterruptedException {
        Cosmodrome cosm = new Cosmodrome(new Rocket("Marusia", 5));
        cosm.start();
    }

}
