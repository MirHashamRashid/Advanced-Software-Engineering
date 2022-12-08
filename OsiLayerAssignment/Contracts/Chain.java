import Request.Data;

public interface Chain {
    public void setNextChain(Chain nextChain);

    public void process(Data request);
}
