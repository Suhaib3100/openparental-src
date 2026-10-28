package com.google.android.gms.dynamic;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.LifecycleDelegate;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    private T zaa;

    @q0
    private Bundle zab;
    private LinkedList<zah> zac;
    private final OnDelegateCreatedListener<T> zad = new zaa(this);

    @KeepForSdk
    public DeferredLifecycleHelper() {
    }

    @KeepForSdk
    public static void showGooglePlayUnavailableMessage(@o0 FrameLayout frameLayout) {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String zad = com.google.android.gms.common.internal.zac.zad(context, isGooglePlayServicesAvailable);
        String zac = com.google.android.gms.common.internal.zac.zac(context, isGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(zad);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(zac);
            linearLayout.addView(button);
            button.setOnClickListener(new zae(context, errorResolutionIntent));
        }
    }

    private final void zae(int i5) {
        while (!this.zac.isEmpty() && this.zac.getLast().zaa() >= i5) {
            this.zac.removeLast();
        }
    }

    private final void zaf(@q0 Bundle bundle, zah zahVar) {
        T t5 = this.zaa;
        if (t5 != null) {
            zahVar.zab(t5);
            return;
        }
        if (this.zac == null) {
            this.zac = new LinkedList<>();
        }
        this.zac.add(zahVar);
        if (bundle != null) {
            Bundle bundle2 = this.zab;
            if (bundle2 == null) {
                this.zab = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.zad);
    }

    @KeepForSdk
    protected abstract void createDelegate(@o0 OnDelegateCreatedListener<T> onDelegateCreatedListener);

    @o0
    @KeepForSdk
    public T getDelegate() {
        return this.zaa;
    }

    @KeepForSdk
    protected void handleGooglePlayUnavailable(@o0 FrameLayout frameLayout) {
        showGooglePlayUnavailableMessage(frameLayout);
    }

    @KeepForSdk
    public void onCreate(@q0 Bundle bundle) {
        zaf(bundle, new zac(this, bundle));
    }

    @o0
    @KeepForSdk
    public View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        zaf(bundle, new zad(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zaa == null) {
            handleGooglePlayUnavailable(frameLayout);
        }
        return frameLayout;
    }

    @KeepForSdk
    public void onDestroy() {
        T t5 = this.zaa;
        if (t5 != null) {
            t5.onDestroy();
        } else {
            zae(1);
        }
    }

    @KeepForSdk
    public void onDestroyView() {
        T t5 = this.zaa;
        if (t5 != null) {
            t5.onDestroyView();
        } else {
            zae(2);
        }
    }

    @KeepForSdk
    public void onInflate(@o0 Activity activity, @o0 Bundle bundle, @q0 Bundle bundle2) {
        zaf(bundle2, new zab(this, activity, bundle, bundle2));
    }

    @KeepForSdk
    public void onLowMemory() {
        T t5 = this.zaa;
        if (t5 != null) {
            t5.onLowMemory();
        }
    }

    @KeepForSdk
    public void onPause() {
        T t5 = this.zaa;
        if (t5 != null) {
            t5.onPause();
        } else {
            zae(5);
        }
    }

    @KeepForSdk
    public void onResume() {
        zaf(null, new zag(this));
    }

    @KeepForSdk
    public void onSaveInstanceState(@o0 Bundle bundle) {
        T t5 = this.zaa;
        if (t5 != null) {
            t5.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.zab;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @KeepForSdk
    public void onStart() {
        zaf(null, new zaf(this));
    }

    @KeepForSdk
    public void onStop() {
        T t5 = this.zaa;
        if (t5 != null) {
            t5.onStop();
        } else {
            zae(4);
        }
    }
}
