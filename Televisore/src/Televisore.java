public class Televisore {
    private int canaleSintonizzato;
    private boolean acceso;
    private int volumeAttuale;
    private int totCanali;

    public Televisore (){
        this.totCanali = 999;
        this.acceso = false;
        this.volumeAttuale = 0;
    }

    public int getVolume(){
        return volumeAttuale;
    }

    public int getCanale(){
        return canaleSintonizzato;
    }

    public boolean setVolume(int volumeAttuale){

        if (acceso){

            if(volumeAttuale > 0 || volumeAttuale < 100){
                this.volumeAttuale = volumeAttuale;
                return true;
            }

        }
        return false;
    }

    public boolean canaleSuccessivo(){
        if (acceso){

            if (canaleSintonizzato < 999){
                canaleSintonizzato ++;
            }
            else {
                canaleSintonizzato = 1;
            }
            return true;
        }
        return false;
    }

    public boolean canalePrecedente(){
        if (acceso){

            if (canaleSintonizzato > 1){
                canaleSintonizzato --;
            }
            else{
                canaleSintonizzato = 999;
            }
            return true;
        }
        return false;
    }

    public boolean selezionaCanale (int canaleSintonizzato) {
        this.canaleSintonizzato = canaleSintonizzato;

        if (!acceso || canaleSintonizzato > 999 || canaleSintonizzato < 0){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){

        String verifica;
        if (acceso){
            verifica = "acceso";
        }
        else{
            verifica = "spento";
        }


        return "Il televisore è " + verifica + ", sul canale"
                + canaleSintonizzato + " e con il volume a " + volumeAttuale + ".";
    }
}