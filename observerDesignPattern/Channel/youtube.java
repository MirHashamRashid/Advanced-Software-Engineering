package Channel;

import java.util.List;

import contract.publisher;
import contract.subscriber;

public class youtube implements publisher {
    public String watchTime;
    public String likes;
    public List<subscriber> subscribers;

    public youtube() {
        subscribers = new List<subscriber>();
    }

    @Override
    public void registerSubscriber(subscriber s) {
        subscribers.add(s);

    }

    @Override
    public void removeSbscriber(subscriber s) {
        subscribers.remove(s);
    }

    @Override
    public void notifySubScriber() {
        for (subscriber subscriber : subscribers) {
            subscriber.update(watchTime, likes);
        }

    }

    public void youtubeChanges() {
        notifySubScriber();
    }

    public void setMeasurments(String watchTime, String likes) {
        this.likes = likes;
        this.watchTime = watchTime;
    }
}