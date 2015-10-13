package hig.androidkurs.examples.helloandorid;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	private String myLogTag = "MyTag";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.v(myLogTag, "Now the activity has been created!");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
//		getMenuInflater().inflate(R.menu.activity_main , menu);
		Log.v(myLogTag, "Now the content menu has been created!");
		return true;
	}
	
	public void onHitMe(View caller) {
		Log.v(myLogTag, "Someone hit Button 1");
	}
	
	
}
