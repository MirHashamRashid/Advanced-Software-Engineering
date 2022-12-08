import Request.Data;

public class Session implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null) {
            request.addData("+SessionLayer");
            nextInChain.process(request);
        } else {
            nextInChain.process(request);
        }
    }
}
