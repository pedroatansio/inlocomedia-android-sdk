package in.ubee.ads.example.activities;

import in.ubee.ads.example.R;
import in.ubee.ads.example.activities.util.BaseActivity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class NotificationActivity extends BaseActivity {

	public static final String EXTRA_NOTIFICATION_AD = "EXTRA_NOTIFICATION_AD";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification);
		
		Uri uri = getIntent().getData();
		
		((TextView) findViewById(R.id.tv_title)).setText(uri.getQueryParameter("title"));
		((TextView) findViewById(R.id.tv_description)).setText(uri.getQueryParameter("description"));
	}
}
