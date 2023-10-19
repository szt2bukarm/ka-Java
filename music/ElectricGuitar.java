package music;

 class ElectricGuitar extends stringedInstrument {
    String sound;
    public ElectricGuitar(int numberOfStrings, String sound) {
        this.numberOfStrings = numberOfStrings;
        this.sound = sound;
        this.name = "Electric Guitar";
    }

    @Override
    public void play() {
        System.out.println("Elektromos gitar jatszasa.");
        sound();
    }

    @Override
    public void sound() {
        System.out.println(sound);
    }
}
