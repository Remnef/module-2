package Facade_;

public class SocialMediaFacade {
    private Twiter twiter;
    private Facebook facebook;
    private LinkedIn linkedIn;

    public SocialMediaFacade(Twiter twiter, Facebook facebook, LinkedIn linkedIn) {
        this.twiter = twiter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }

    public void share(String message){
        this.twiter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twiter.share();
        this.linkedIn.share();
        this.facebook.share();
    }
}
