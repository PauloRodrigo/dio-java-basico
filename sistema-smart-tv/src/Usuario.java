public class Usuario {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SmartTv smartTv = new SmartTv();


        System.out.println("TV Ligada? "+smartTv.ligada);
        System.out.println("Qual Volume? "+smartTv.volume);
        System.out.println("Qual Canal? "+smartTv.canal);

        smartTv.volumeUp();
        smartTv.canalDown();

        smartTv.onOff();

        smartTv.volumeUp();

        statusTV(smartTv);
    }

    public void statusTV(SmartTv smartTv){
        System.out.println("TV Ligada? "+smartTv.ligada);
        System.out.println("Qual Volume? "+smartTv.volume);
        System.out.println("Qual Canal? "+smartTv.canal);
    }

}
