package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
public final class zak extends zap {
    private final SparseArray<zaj> zad;

    private zak(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment, GoogleApiAvailability.getInstance());
        this.zad = new SparseArray<>();
        this.mLifecycleFragment.addCallback(ProtectedSandApp.s("∛"), this);
    }

    public static zak zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = LifecycleCallback.getFragment(lifecycleActivity);
        zak zakVar = (zak) fragment.getCallbackOrNull(ProtectedSandApp.s("∜"), zak.class);
        return zakVar != null ? zakVar : new zak(fragment);
    }

    @q0
    private final zaj zai(int i5) {
        if (this.zad.size() <= i5) {
            return null;
        }
        SparseArray<zaj> sparseArray = this.zad;
        return sparseArray.get(sparseArray.keyAt(i5));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i5 = 0; i5 < this.zad.size(); i5++) {
            zaj zai = zai(i5);
            if (zai != null) {
                printWriter.append((CharSequence) str).append((CharSequence) ProtectedSandApp.s("∝")).print(zai.zaa);
                printWriter.println(ProtectedSandApp.s("∞"));
                zai.zab.dump(String.valueOf(str).concat(ProtectedSandApp.s("∟")), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        new StringBuilder(String.valueOf(this.zad).length() + 14);
        if (this.zab.get() == null) {
            for (int i5 = 0; i5 < this.zad.size(); i5++) {
                zaj zai = zai(i5);
                if (zai != null) {
                    zai.zab.connect();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        for (int i5 = 0; i5 < this.zad.size(); i5++) {
            zaj zai = zai(i5);
            if (zai != null) {
                zai.zab.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zab(ConnectionResult connectionResult, int i5) {
        if (i5 < 0) {
            Log.wtf(ProtectedSandApp.s("∠"), ProtectedSandApp.s("∡"), new Exception());
            return;
        }
        zaj zajVar = this.zad.get(i5);
        if (zajVar != null) {
            zae(i5);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zajVar.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zap
    protected final void zac() {
        for (int i5 = 0; i5 < this.zad.size(); i5++) {
            zaj zai = zai(i5);
            if (zai != null) {
                zai.zab.connect();
            }
        }
    }

    public final void zad(int i5, GoogleApiClient googleApiClient, @q0 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, ProtectedSandApp.s("∢"));
        boolean z5 = this.zad.indexOfKey(i5) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append(ProtectedSandApp.s("∣"));
        sb.append(i5);
        Preconditions.checkState(z5, sb.toString());
        zam zamVar = this.zab.get();
        new StringBuilder(String.valueOf(zamVar).length() + 49);
        zaj zajVar = new zaj(this, i5, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(zajVar);
        this.zad.put(i5, zajVar);
        if (this.zaa && zamVar == null) {
            ProtectedSandApp.s("∤").concat(googleApiClient.toString());
            googleApiClient.connect();
        }
    }

    public final void zae(int i5) {
        zaj zajVar = this.zad.get(i5);
        this.zad.remove(i5);
        if (zajVar != null) {
            zajVar.zab.unregisterConnectionFailedListener(zajVar);
            zajVar.zab.disconnect();
        }
    }
}
