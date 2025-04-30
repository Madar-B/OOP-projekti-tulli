public class InspectionEvent extends Event {
    private Kulkuneuvo vehicle;

    public InspectionEvent(double time, Kulkuneuvo vehicle) {
        super(time);
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        // LOGICS
        System.out.println("Досмотр ТС: " + vehicle);
    }
}
