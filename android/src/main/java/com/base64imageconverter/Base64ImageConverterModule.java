package com.base64imageconverter;


import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = Base64ImageConverterModule.NAME)
public class Base64ImageConverterModule extends ReactContextBaseJavaModule {
  public static final String NAME = "Base64ImageConverter";


  private native void nativeInstall(long jsiPtr, String docDir);

  public Base64ImageConverterModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }

  @ReactMethod(isBlockingSynchronousMethod = true)
  public boolean install() {
    try {
      System.loadLibrary("Base64ImageConverter");
System.out.println("shivam tripathi");
      ReactApplicationContext context = getReactApplicationContext();
      nativeInstall(
        context.getJavaScriptContextHolder().get(),
        context.getFilesDir().getAbsolutePath()
      );
      return true;
    } catch (Exception exception) {
      return false;
    }
  }



}
