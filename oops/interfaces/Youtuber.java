package oops.interfaces;

 public abstract interface Youtuber extends Video{
	void makeVideo();
	
	// INTERFACE CAN HAVE METHODS BY USING A "DEFAULT" KEYWORD AFTER JAVA 8 UPDATES..........
	default void uploadVideo() {
		System.out.println("Upload the video");
	}
}
