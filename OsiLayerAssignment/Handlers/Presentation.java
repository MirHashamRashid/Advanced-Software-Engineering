import Request.Data;

public class Presentation implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {

        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null) {

            request.addData("+ Presentationlayer");
            nextInChain.process(request);
        } else {
            nextInChain.process(request);
        }
    }
}
