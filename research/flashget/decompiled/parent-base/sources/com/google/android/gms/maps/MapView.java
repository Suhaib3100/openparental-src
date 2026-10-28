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
public class MapView extends FrameLayout {
    private final zzai zza;

    public MapView(@o0 Context context) {
        super(context);
        this.zza = new zzai(this, context, null);
        setClickable(true);
    }

    public void getMapAsync(@o0 OnMapReadyCallback onMapReadyCallback) {
        Preconditions.checkMainThread(ProtectedSandApp.s("\uda46"));
        Preconditions.checkNotNull(onMapReadyCallback, ProtectedSandApp.s("\uda47"));
        this.zza.zza(onMapReadyCallback);
    }

    public void onCreate(@q0 Bundle bundle) {
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

    public void onEnterAmbient(@q0 Bundle bundle) {
        Preconditions.checkMainThread(ProtectedSandApp.s("\uda48"));
        zzai zzaiVar = this.zza;
        if (zzaiVar.getDelegate() != null) {
            ((zzah) zzaiVar.getDelegate()).zza(bundle);
        }
    }

    public void onExitAmbient() {
        Preconditions.checkMainThread(ProtectedSandApp.s("\uda49"));
        zzai zzaiVar = this.zza;
        if (zzaiVar.getDelegate() != null) {
            ((zzah) zzaiVar.getDelegate()).zzb();
        }
    }

    public void onLowMemory() {
        this.zza.onLowMemory();
    }

    public void onPause() {
        this.zza.onPause();
    }

    public void onResume() {
        this.zza.onResume();
    }

    public void onSaveInstanceState(@o0 Bundle bundle) {
        this.zza.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.zza.onStart();
    }

    public void onStop() {
        this.zza.onStop();
    }

    public MapView(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = new zzai(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(@o0 Context context, @o0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.zza = new zzai(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(@o0 Context context, @q0 GoogleMapOptions googleMapOptions) {
        super(context);
        this.zza = new zzai(this, context, googleMapOptions);
        setClickable(true);
    }
}
