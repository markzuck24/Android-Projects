package com.example.aditya.myapplication;

import android.location.Location;
import android.location.LocationListener;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.*;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

public class MainActivity extends AppCompatActivity implements GoogleApiClientConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, LocationListener
{


    private final String TAG = "aj";
    private TextView txt;
    private GoogleApiClient mGoogleApiClient;
    public LocationRequest mlocationRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();

        txt = (TextView) findViewById(R.id.text);
    }

    protected void onStart()

    {
        super.onStart();
        //connect the client
        mGoogleApiClient.connect();
    }

    protected void onStop()
    {
        //disconnect the client
        mGoogleApiClient.disconnect();
        super.onStop();
    }

    public void onConnected(Bundle bundle)
    {
        mlocationRequest = LocationRequest.create();
        mlocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        mlocationRequest.setInterval(1000);

        LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mlocationRequest, (com.google.android.gms.location.LocationListener) this);
    }

    public void onLocationChanged(Location location)
    {
        Log.i(TAG, String.valueOf(location.getLatitude()));
        txt.setText(Double.toString(location.getLatitude()));
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    public void onConnectionSuspended(int i)
    {
        Log.i(TAG, "GoogleApiClient connection has been suspended");

    }

    public void onConnectionFailed(ConnectionResult connectionResult)
    {
        Log.i(TAG, "GoogleApiClient connection has failed");
    }

}
