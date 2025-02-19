package com.smartfoods;

import android.os.Bundle; // here
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactRootView;
import com.swmansion.gesturehandler.react.RNGestureHandlerEnabledRootView;
import android.content.res.Configuration;
import android.os.Build;

import org.devio.rn.splashscreen.SplashScreen; // here

public class MainActivity extends ReactActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.show(this , R.style.SplashTheme);  // here
        super.onCreate(savedInstanceState);
    }

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "smartfoods";
  }

   @Override
     protected ReactActivityDelegate createReactActivityDelegate() {
       return new ReactActivityDelegate(this, getMainComponentName()) {
         @Override
         protected ReactRootView createRootView() {
          return new RNGestureHandlerEnabledRootView(MainActivity.this);
         }
       };
     }

      @Override
         public void applyOverrideConfiguration(Configuration overrideConfiguration) {
             if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 25) {
                 return;
             }
             super.applyOverrideConfiguration(overrideConfiguration);
         }
}
