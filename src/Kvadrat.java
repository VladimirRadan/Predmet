public class Kvadrat extends Predmet{

    double a;

    @Override
    public void povrsina() {
        System.out.println("Povrsina kvadrata: " + Math.pow(a, 2));
    }


}
