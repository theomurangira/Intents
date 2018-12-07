package rw.ac.unilak.intents;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
    }

    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.send:
                Intent it = new Intent();
                it.setAction(Intent.ACTION_SENDTO);
                it.setType("text/plain");
                it.putExtra(Intent.EXTRA_EMAIL,"theoneste@yahoo.com");
                it.putExtra(Intent.EXTRA_SUBJECT,"A text email");
                it.putExtra(Intent.EXTRA_TEXT,"Reminder for tommorrows meetting");
                if(it.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(it);
                }
                break;
            case (R.id.surf):
                it =new Intent();
                it.setAction(Intent.ACTION_VIEW);
                it.setData(Uri.parse("http://www.unilak.ac.rw"));
                if(it.resolveActivity(getPackageManager())!=null)
                {
                    startActivity(it);
                }
                break;
            case (R.id.dial):
                it =new Intent();
                it.setAction(Intent.ACTION_CALL);
                it.setData(Uri.parse("tel:+250785207523"));
                startActivity(it);
        }
    }
}
