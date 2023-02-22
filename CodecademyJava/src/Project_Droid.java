public class Project_Droid {

    String name;
    int batteryLevel;

    public Project_Droid(String droidName) {

        name = droidName;
        batteryLevel = 100;

    }

    public void performTask(String task) {

        System.out.println(name + " is performing task: " + task);

    }

    public void batteryLevelState(int minus) {

        batteryLevel -= minus;
        System.out.println("Battery level: " + batteryLevel);

    }

    public String toString() {
        return "Hello, I’m the droid: " + name;
    }


    public static void main(String[] args) {

        Project_Droid codey = new Project_Droid("Codey");
        System.out.println(codey);

        codey.performTask("Dancing");
        codey.batteryLevelState(10);

    }

}