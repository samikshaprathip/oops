// Interface 1
interface Playable {
    void play();
}

// Interface 2
interface Recordable {
    void record();
}

// Class implementing multiple interfaces
class MusicPlayer implements Playable, Recordable {
    @Override
    public void play() {
        System.out.println("Music is playing...");
    }

    @Override
    public void record() {
        System.out.println("Recording started...");
    }

    void stop() {
        System.out.println("Stopped.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // Call interface methods
        player.play();
        player.record();

        // Call class-specific method
        player.stop();
    }
}
