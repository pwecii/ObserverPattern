package com.newsagency.observer;

/**
 * Concrete Observer class representing a news subscriber
 */
public class ConcreteSubscriber implements Subscriber {
    private String subscriberName;
    private NewsAgency newsAgency;

    public ConcreteSubscriber(String subscriberName, NewsAgency newsAgency) {
        this.subscriberName = subscriberName;
        this.newsAgency = newsAgency;
        newsAgency.attach(this);
    }

    @Override
    public void update(String news) {
        System.out.println("[" + subscriberName + "] received update: " + news);
    }

    public void unsubscribe() {
        newsAgency.detach(this);
        System.out.println("[" + subscriberName + "] has unsubscribed.");
    }

    public String getSubscriberName() {
        return subscriberName;
    }
}