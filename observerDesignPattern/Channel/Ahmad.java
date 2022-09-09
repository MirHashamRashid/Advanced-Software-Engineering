package Channel;

import contract.subscriber;

public class Ahmad implements subscriber {

    public String watchTime;
    public String likes;

    @Override
    public void update(String watchTime, String likes) {
        this.watchTime = watchTime;
        this.likes = likes;
        System.out.println("user likes and watchTime" + likes + watchTime);
    }

}
