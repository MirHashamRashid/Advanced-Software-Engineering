import Request.Data;

public class Network implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null) {
            // Network header is added
            // Called packet
            request.addData("+NetworkLayer");
            nextInChain.process(request);
        } else {
            nextInChain.process(request);
        }
    }

}
