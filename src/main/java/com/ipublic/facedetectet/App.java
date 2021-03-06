package com.ipublic.facedetectet;


public class App {
	static {
		// System.loadLibrary( org.opencv.core.Core.NATIVE_LIBRARY_NAME);
		// OpenCV.loadShared();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to OpenCV " + Core.VERSION);
		Mat m = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0));
		System.out.println("OpenCV Mat: " + m);
		Mat mr1 = m.row(1);
		mr1.setTo(new Scalar(1));
		Mat mc5 = m.col(5);
		mc5.setTo(new Scalar(5));
		System.out.println("OpenCV Mat data:\n" + m.dump());
	}
}