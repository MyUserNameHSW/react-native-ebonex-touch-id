
package com.ebonex.touchid;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNTouchidModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNTouchidModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNTouchid";
  }
}