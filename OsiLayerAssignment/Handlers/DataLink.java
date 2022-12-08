import Request.Data;

public class DataLink implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null) {
            // DataLink header is added
            // Called frame
            request.addData("+DataLinkLayer");
            nextInChain.process(request);
        } else {
            nextInChain.process(request);
        }
    }

}
