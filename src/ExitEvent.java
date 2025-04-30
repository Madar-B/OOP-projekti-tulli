
public class ExitEvent extends Event {

    private Kulkuneuvo vehicle;

    public ExitEvent(double time, Kulkuneuvo vehicle) {
        super(time);
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        System.out.println("Выезд ТС: " + vehicle);
    }
}
