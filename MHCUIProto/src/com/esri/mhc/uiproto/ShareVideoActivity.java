package com.esri.mhc.uiproto;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;

public class ShareVideoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_share_video);

		Bundle extras = getIntent().getExtras();
		String lastVideoPath=null;
	    if (extras != null)
	    {
	        lastVideoPath = extras.getString("lastVideoPath");
	    }
	    else
	    {
	        //..oops!
	    }

		final VideoView videoView = (VideoView) findViewById(R.id.videoVWReplay);
		MediaController mediaController = new MediaController(this);
		mediaController.setAnchorView(videoView);
		videoView.setMediaController(mediaController);
		File root = Environment.getExternalStorageDirectory(); 
		if (lastVideoPath !=null){
		videoView
				.setVideoPath(root+lastVideoPath);
		videoView.start();	 
		}
	    
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.share_video, menu);
		return true;
	}

}
