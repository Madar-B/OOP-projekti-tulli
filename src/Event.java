
public abstract class Event implements Comparable<Event> {

    protected double time; // AIKA MILLO EVENT TAPAHTUU SIMULAATION MINUUTEISSA

    public Event(double time) {

        this.time = time;
    }

    public double getTime() {
        return time;
    }

    //METODI JOKA TULEE KU EVENT KUTSUTAA
    public abstract void execute();

    // FOR PriorityQueue — TAPAHTUMAT VERTAILLAAN AJAN PERUSTEEL
    public int compareTo(Event other) {
        return Double.compare(this.time, other.time);
    }
}
