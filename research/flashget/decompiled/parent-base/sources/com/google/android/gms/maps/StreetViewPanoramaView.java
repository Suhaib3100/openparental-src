package com.google.android.gms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public class StreetViewPanoramaView extends FrameLayout {
    private final zzat zza;

    public StreetViewPanoramaView(@o0 Context context) {
        super((Context) Preconditions.checkNotNull(context, ProtectedSandApp.s("\uda5e")));
        this.zza = new zzat(this, context, null);
    }

    public void getStreetViewPanoramaAsync(@o0 OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        Preconditions.checkNotNull(onStreetViewPanoramaReadyCallback, ProtectedSandApp.s("\uda5f"));
        Preconditions.checkMainThread(ProtectedSandApp.s("\uda60"));
        this.zza.zza(onStreetViewPanoramaReadyCallback);
    }

    public final void onCreate(@q0 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.zza.onCreate(bundle);
            if (this.zza.getDelegate() == null) {
                DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.zza.onDestroy();
    }

    public final void onLowMemory() {
        this.zza.onLowMemory();
    }

    public final void onPause() {
        this.zza.onPause();
    }

    public void onResume() {
        this.zza.onResume();
    }

    public final void onSaveInstanceState(@o0 Bundle bundle) {
        this.zza.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.zza.onStart();
    }

    public void onStop() {
        this.zza.onStop();
    }

    public StreetViewPanoramaView(@o0 Context context, @o0 AttributeSet attributeSet) {
        super((Context) Preconditions.checkNotNull(context, ProtectedSandApp.s("\uda5e")), attributeSet);
        this.zza = new zzat(this, context, null);
    }

    public StreetViewPanoramaView(@o0 Context context, @o0 AttributeSet attributeSet, int i4) {
        super((Context) Preconditions.checkNotNull(context, ProtectedSandApp.s("\uda5e")), attributeSet, i4);
        this.zza = new zzat(this, context, null);
    }

    public StreetViewPanoramaView(@o0 Context context, @q0 StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super((Context) Preconditions.checkNotNull(context, ProtectedSandApp.s("\uda5e")));
        this.zza = new zzat(this, context, streetViewPanoramaOptions);
    }
}
