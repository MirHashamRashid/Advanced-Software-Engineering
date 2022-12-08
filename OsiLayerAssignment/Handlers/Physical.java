import Request.Data;

public class Physical implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null) {
            request.addData("+Bits");
            System.out.println(request.getData());
        } else {
            nextInChain.process(request);
        }
    }
}
