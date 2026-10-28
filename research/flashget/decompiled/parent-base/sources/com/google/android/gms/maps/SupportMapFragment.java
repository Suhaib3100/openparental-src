package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.Fragment;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public class SupportMapFragment extends Fragment {
    private final zzaw zza = new zzaw(this);

    @o0
    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public void getMapAsync(@o0 OnMapReadyCallback onMapReadyCallback) {
        Preconditions.checkMainThread(ProtectedSandApp.s("\uda62"));
        Preconditions.checkNotNull(onMapReadyCallback, ProtectedSandApp.s("\uda63"));
        this.zza.zzb(onMapReadyCallback);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@q0 Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@o0 Activity activity) {
        super.onAttach(activity);
        zzaw.zza(this.zza, activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@q0 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onCreate(bundle);
            this.zza.onCreate(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @o0
    public View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        View onCreateView = this.zza.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.zza.onDestroy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.zza.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(@q0 Bundle bundle) {
        Preconditions.checkMainThread(ProtectedSandApp.s("\uda64"));
        zzaw zzawVar = this.zza;
        if (zzawVar.getDelegate() != null) {
            ((zzav) zzawVar.getDelegate()).zza(bundle);
        }
    }

    public final void onExitAmbient() {
        Preconditions.checkMainThread(ProtectedSandApp.s("\uda65"));
        zzaw zzawVar = this.zza;
        if (zzawVar.getDelegate() != null) {
            ((zzav) zzawVar.getDelegate()).zzb();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(@o0 Activity activity, @o0 AttributeSet attributeSet, @q0 Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            zzaw.zza(this.zza, activity);
            GoogleMapOptions createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(ProtectedSandApp.s("\uda61"), createFromAttributes);
            this.zza.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.zza.onLowMemory();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.zza.onPause();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.zza.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@o0 Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.onSaveInstanceState(bundle);
        this.zza.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.zza.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.zza.onStop();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(@q0 Bundle bundle) {
        super.setArguments(bundle);
    }

    @o0
    public static SupportMapFragment newInstance(@q0 GoogleMapOptions googleMapOptions) {
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ProtectedSandApp.s("\uda61"), googleMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }
}
