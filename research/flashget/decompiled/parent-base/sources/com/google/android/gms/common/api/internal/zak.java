package com.google.android.gms.common.api.internal;

import android.support.v4.media.a;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zak extends zap {
    private final SparseArray zad;

    private zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new SparseArray();
        this.mLifecycleFragment.addCallback(ProtectedSandApp.s("쪀"), this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zak zakVar = (zak) fragment.getCallbackOrNull(ProtectedSandApp.s("쪀"), zak.class);
        return zakVar != null ? zakVar : new zak(fragment);
    }

    @q0
    private final zaj zai(int i4) {
        if (this.zad.size() <= i4) {
            return null;
        }
        SparseArray sparseArray = this.zad;
        return (zaj) sparseArray.get(sparseArray.keyAt(i4));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i4 = 0; i4 < this.zad.size(); i4++) {
            zaj zai = zai(i4);
            if (zai != null) {
                printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("쪁")).print(zai.zaa);
                printWriter.println(ProtectedSandApp.s("쪂"));
                zai.zab.dump(String.valueOf(str).concat(ProtectedSandApp.s("쪃")), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        String.valueOf(this.zad);
        if (this.zab.get() == null) {
            for (int i4 = 0; i4 < this.zad.size(); i4++) {
                zaj zai = zai(i4);
                if (zai != null) {
                    zai.zab.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i4 = 0; i4 < this.zad.size(); i4++) {
            zaj zai = zai(i4);
            if (zai != null) {
                zai.zab.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(ConnectionResult connectionResult, int i4) {
        if (i4 < 0) {
            Log.wtf(ProtectedSandApp.s("쪀"), ProtectedSandApp.s("쪄"), new Exception());
            return;
        }
        zaj zajVar = (zaj) this.zad.get(i4);
        if (zajVar != null) {
            zae(i4);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zajVar.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
        for (int i4 = 0; i4 < this.zad.size(); i4++) {
            zaj zai = zai(i4);
            if (zai != null) {
                zai.zab.connect();
            }
        }
    }

    public final void zad(int i4, GoogleApiClient googleApiClient, @q0 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, ProtectedSandApp.s("쪅"));
        int indexOfKey = this.zad.indexOfKey(i4);
        Preconditions.checkState(indexOfKey < 0, a.a(ProtectedSandApp.s("쪆"), i4));
        zam zamVar = (zam) this.zab.get();
        String.valueOf(zamVar);
        zaj zajVar = new zaj(this, i4, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(zajVar);
        this.zad.put(i4, zajVar);
        if (this.zaa && zamVar == null) {
            ProtectedSandApp.s("쪇").concat(googleApiClient.toString());
            googleApiClient.connect();
        }
    }

    public final void zae(int i4) {
        zaj zajVar = (zaj) this.zad.get(i4);
        this.zad.remove(i4);
        if (zajVar != null) {
            zajVar.zab.unregisterConnectionFailedListener(zajVar);
            zajVar.zab.disconnect();
        }
    }
}
