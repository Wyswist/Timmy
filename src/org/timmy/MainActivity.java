package org.timmy;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.WindowManager;

public class MainActivity extends ActionBarActivity {	
	TimmyCameraListener listener;
	CameraBridgeViewBase openCamerView;
	
    private BaseLoaderCallback mLoaderCallback = new BaseLoaderCallback(this) {
    	@Override
    	public void onManagerConnected(int status) {
    		switch (status) {
    		case LoaderCallbackInterface.SUCCESS:  
    			openCamerView.enableView();
    			break;
    		default:
    			super.onManagerConnected(status);
    			break;
            }
        }
    };
	
	public MainActivity() {
		this.listener = new TimmyCameraListener();
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);                                     
        setContentView(R.layout.activity_main);                                                                  
        openCamerView = (CameraBridgeViewBase) findViewById(R.id.cameraView);                            
        openCamerView.setVisibility(SurfaceView.VISIBLE);                                                     
        openCamerView.setCvCameraViewListener(listener);       
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
    @Override
    public void onResume()
    {   
        super.onResume();
        OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_2_4_6, this, mLoaderCallback);
    }
	
    @Override
    public void onPause()
    {
        super.onPause();
        if (openCamerView != null)
        	openCamerView.disableView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (openCamerView != null)
        	openCamerView.disableView();
    }

}
