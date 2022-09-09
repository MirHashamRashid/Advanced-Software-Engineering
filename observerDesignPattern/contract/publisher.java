package contract;

public interface publisher {
    public void registerSubscriber(subscriber s);

    public void removeSbscriber(subscriber s);

    public void notifySubScriber();
}