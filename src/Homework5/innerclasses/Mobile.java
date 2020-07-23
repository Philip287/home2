package Homework5.innerclasses;

public class Mobile {
    private Display display;
    private Battary battary;
    private Camera camera;
    private Identifier identifier;


    public Mobile(DisplayStatus Display, boolean Battary, boolean Camera, Identifier identifier) {
        this.display = new Display(Display);
        this.battary = new Battary(Battary);
        this.camera = new Camera(Camera);
        this.identifier = identifier;
//        this.switcher = switcher;
    }

    public void showInnerState() {
        display.showStatus();
        battary.showBattaryEmpty();
        camera.showCameraPresence();

        System.out.println(identifier.getMobileReadableString().toString());

    }

    private class Display {

        private DisplayStatus status;

        public Display(DisplayStatus status) {
            this.status = status;
        }

        public void setStatus(DisplayStatus status) {
            this.status = status;
        }

        public void showStatus() {
            System.out.println("Status: " + status.getValue());
        }
    }

    private class Battary {

        private boolean isEmpty;

        public Battary(boolean isEmpty) {
            this.isEmpty = isEmpty;
        }

        public void showBattaryEmpty() {
            System.out.println(String.format("Battary is %sempty", isEmpty ? "" : "not "));
        }

        public boolean isEmpty() {
            return isEmpty;
        }
    }

    private class Camera {

        private boolean isPresent;

        public Camera(boolean isPresent) {
            this.isPresent = isPresent;
        }

        public void showCameraPresence() {
            System.out.println(String.format("Camera is %spresent", isPresent ? "" : "not "));
//            if (isPresent == true) {
////                System.out.println("Camera is present");
////            } else {
////                System.out.println("Camera is not present");
////            }

        }

        public boolean isPresent() {
            return isPresent;
        }
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Battary getBattary() {
        return battary;
    }

    public void setBattary(Battary battary) {
        this.battary = battary;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }
}
