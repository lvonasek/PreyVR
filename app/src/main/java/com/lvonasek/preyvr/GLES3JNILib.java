
package com.lvonasek.preyvr;

import android.app.Activity;
import android.view.Surface;

// Wrapper for native library

public class GLES3JNILib
{
	// Activity lifecycle
	public static native void onCreate( Activity obj, String commandLineParams, float ss, long msaa );
	public static native void onStart( Object obj );
	public static native void onResume();
	public static native void onPause();
	public static native void onDestroy();

	// Surface lifecycle
	public static native void onSurfaceCreated( Surface s );
	public static native void onSurfaceChanged( Surface s );

	public static native void setText(String key, String value);
}
