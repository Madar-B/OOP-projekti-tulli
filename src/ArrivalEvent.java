
public class ArrivalEvent extends Event {
    private Kulkuneuvo vehicle;

    public ArrivalEvent(double time, Kulkuneuvo vehicle) {
        super(time);
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        // LOGICS
        System.out.println("Прибытие ТС: " + vehicle);
    }
}
