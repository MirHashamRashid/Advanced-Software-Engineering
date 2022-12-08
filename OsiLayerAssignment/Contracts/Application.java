import Request.Data;

public class Application implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null) {
            // Do what application layer does (Process to process communication)
            nextInChain.process(request);
        } else {
            nextInChain.process(request);
        }
    }

}
