interface LightAction {
    void activate();
}

public class SmartLightDemo {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Lights ON due to motion.");
        LightAction nightTrigger = () -> System.out.println("Dim warm lights ON (night mode).");
        LightAction voiceTrigger = () -> System.out.println("Lights changing color via voice command.");

        motionTrigger.activate();
        nightTrigger.activate();
        voiceTrigger.activate();
    }
}