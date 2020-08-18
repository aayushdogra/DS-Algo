package oops.interfaces;

public class Person implements Student, Youtuber{

	public static void main(String[] args) {
		Person obj=new Person();
		obj.study();
		obj.makeVideo();
		obj.editVideo();
		obj.uploadVideo();

	}

	@Override
	public void makeVideo() {
		System.out.println("Person is making a video");
	}

	@Override
	public void study() {
		System.out.println("Person is studying");
	}

	@Override
	public void editVideo() {
		System.out.println("Edit the video");	
	}

// IF A METHOD IS COMMON IN BOTH INTERFACES WHICH ARE IMPLEMENTED THAN THE METHOD HAS TO OVERRIDE BY MAIN CLASS...
//	public void uploadVideo() {
//		System.out.println("Upload the video");
//	}
}

