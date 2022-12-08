package Request;

public class Data {
    private String data;

    public Data(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void addData(String data) {
        this.data = this.data + data;
    }
}
