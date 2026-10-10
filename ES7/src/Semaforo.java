public class Semaforo {
    private boolean stato;
    private String colore;


    public Semaforo() {
        this.stato = false;
        this.colore = "";
    }


    public void accendi(){
        this.stato = true;
        this.colore = "VERDE";
    }


    public void spegni(){
        this.stato = false;
        this.colore = "";
    }


    public void toggle(){
        if(stato){
            spegni();
        }
        else{
            accendi();
        }
    }


    public String avanza() {

        if (stato) {
            if(colore.equals("VERDE")){
                this.colore = ("GIALLO");
            }
            else if(colore.equals("GIALLO")){
                this.colore = "ROSSO";
            }
            else{
                this.colore = "VERDE";
            }
        }
        else{
            this.colore.equals("");
        }
        return this.colore;

    }


    public boolean isAcceso(){
        return this.stato;
    }


    public String getColore(){
        return this.colore;
    }


    public String toString(){



        if(stato){
            return ("Il Semaforo è acceso sul " + this.colore);
        }
        else {
            return ("Il Semaforo è spento");
        }

    }

}