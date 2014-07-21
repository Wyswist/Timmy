package org.timmy;

import org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewListener2;
import org.opencv.core.Mat;


public class TimmyCameraListener implements CvCameraViewListener2 {
	@Override
	public void onCameraViewStarted(final int width, final int height) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void onCameraViewStopped() {
		// TODO Auto-generated method stub
	}

	@Override
	public Mat onCameraFrame(final CvCameraViewFrame inputFrame) {
		// TODO Auto-generated method stub
		System.out.println(" Camera frame: " + inputFrame);
		return null;
	}

}
