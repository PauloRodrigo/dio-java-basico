public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public SmartTv(Boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }    

    public void onOff(){
        ligada = !ligada;
    }
    public void volumeUp(){
        if(ligada) {
            volume++;
        }
    }
    public void volumeDown(){
        if(ligada) {
            volume--;
        }
    }
    public void canalUp(){
        if(ligada) {
            canal++;
        }
    }
    public void canalDown(){
        if(ligada) {
            canal--;
        }
    }

   
    
}
