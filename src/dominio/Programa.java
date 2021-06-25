package dominio;


public class Programa {
    private double ejex, ejey;

    public Programa(double ejex, double ejey) {
        this.ejex = ejex;
        this.ejey = ejey;
    }
    public double getEjex() {
        return ejex;
    }
    public void setEjex(double ejex) {
        this.ejex = ejex;
    }
    public double getEjey() {
        return ejey;
    }
    public void setEjey(double ejey) {
        this.ejey = ejey;
    }
    @Override
    public String toString(){
    return this.ejex+"  "+this.ejey;
    }
}