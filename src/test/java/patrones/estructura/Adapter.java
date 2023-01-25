package patrones.estructura;

public class Adapter implements Target{

    private AdapterA adapter;

    public Adapter(AdapterA adapter) {
        this.adapter = adapter;
    }

    public String request() {
        return "Adapter Message Schema".concat(adapter.specificRequest());
    }

}
