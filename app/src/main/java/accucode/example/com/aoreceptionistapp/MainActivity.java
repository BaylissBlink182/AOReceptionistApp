package accucode.example.com.aoreceptionistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.plus.*;

import com.google.android.gms.drive.Drive;
import com.google.android.gms.play_services.*;


public class MainActivity extends AppCompatActivity  {

    public GoogleApiClient mGoogleApiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GoogleApiClient instance creation
//        GoogleApiClient mGoogleApiClient = new GoogleApiClient.Builder(this)
//                .enableAutoManage(this ,(OnConnectionFailedListener) this)
//                .addApi(Plus.API)
//                .addScope(Plus.SCOPE_PLUS_LOGIN)
//                .setAccountName("bcarr@accucode.com")
//              .build();

    }
//   @Override
//    public  void onConnectionFailed(ConnectionResult result){
//
//   }

//    gapi.hangout.onApiReady.add(addEventObj(eventObj) {
//        startMyApp();
//    }
}
