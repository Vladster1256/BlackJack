package ctec.example.blackjack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TitleScreen extends Activity
{

	private Button quit;
	private Button start;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_title_screen);
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		quit.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View currentView)
			{
				Intent currentIntent = new Intent();
				setResult(RESULT_OK, currentIntent);
				finish();
			}
		});
		 start.setOnClickListener(new View.OnClickListener()
		 {
			 @Override
			 public void onClick(View currentView)
			 {
				 Intent myIntent = new Intent(currentView.getContext(), GameActivity.class);
				 startActivityForResult(myIntent,0);
			 }
		 });
		
	}
	
	
}
