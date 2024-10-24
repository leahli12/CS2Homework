public class EvenMoreChaos {
    public String chaos = "hello";
    public int oCounter = 0;
    public int i = 4;
    // TASK: How many "o"s will be in this.chaos?

    public static void main(String[] args) {
        EvenMoreChaos m = new EvenMoreChaos();
    }

    public EvenMoreChaos(){
        System.out.println(chaos + "hi");
        for (int i = 3; i < 19; i+=7){
            String chaos = "o";
            chaos += "o";
            if (this.chaos.length() % 5 == 0){
                for(int j = 0; j < this.chaos.length(); j++){
                    chaos += chaos;
                }
                this.chaos += chaos;
            }
        }
        someMoreChaos();
        System.out.println(chaos);
        countO();
    }

    public void someMoreChaos(){
        i--;
        String chaos = "o";
        if(i > -1){
            this.chaos = this.chaos.substring(0, this.chaos.length() - 4);
            System.out.println(chaos + "o");
            someMoreChaos();
        }
    }

    public void countO(){
        String s = chaos.substring(4);
        System.out.println(s.length());
    }
}
