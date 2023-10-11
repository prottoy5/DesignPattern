// Receiver interface
interface Device {
    void turnOn();
    void turnOff();
}

// Concrete Receivers
class Light implements Device {
    @Override
    public void turnOn() {
        System.out.println("Light is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off.");
    }
}

class Fan implements Device {
    @Override
    public void turnOn() {
        System.out.println("Fan is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is off.");
    }
}

class SmartLock implements Device {
    @Override
    public void turnOn() {
        System.out.println("Smart Lock is locked.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Lock is unlocked.");
    }
}

// Command interface
interface Command {
    void execute();
}

// Concrete Commands
class TurnOnCommand implements Command {
    private Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}

class TurnOffCommand implements Command {
    private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}

// Remote Control
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

public class HomeAutomation {
    public static void main(String[] args) {
        // Create devices
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();
        SmartLock frontDoorLock = new SmartLock();

        // Create commands
        Command turnOnLivingRoomLight = new TurnOnCommand(livingRoomLight);
        Command turnOffCeilingFan = new TurnOffCommand(ceilingFan);
        Command lockFrontDoor = new TurnOnCommand(frontDoorLock);

        // Create a remote control
        RemoteControl remote = new RemoteControl();

        // Set and press different buttons
        remote.setCommand(turnOnLivingRoomLight);
        remote.pressButton();

        remote.setCommand(turnOffCeilingFan);
        remote.pressButton();

        remote.setCommand(lockFrontDoor);
        remote.pressButton();
    }
}

