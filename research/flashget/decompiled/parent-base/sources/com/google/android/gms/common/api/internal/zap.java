package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.m1;
import androidx.annotation.q0;
import androidx.compose.animation.core.k1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final AtomicReference zab;
    protected final GoogleApiAvailability zac;
    private final Handler zad;

    @m1
    zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zab = new AtomicReference(null);
        this.zad = new com.google.android.gms.internal.base.zau(Looper.getMainLooper());
        this.zac = googleApiAvailability;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(ConnectionResult connectionResult, int i4) {
        this.zab.set(null);
        zab(connectionResult, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zad() {
        this.zab.set(null);
        zac();
    }

    private static final int zae(@q0 zam zamVar) {
        if (zamVar == null) {
            return -1;
        }
        return zamVar.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i4, int i5, Intent intent) {
        zam zamVar = (zam) this.zab.get();
        if (i4 != 1) {
            if (i4 == 2) {
                int isGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(getActivity());
                if (isGooglePlayServicesAvailable == 0) {
                    zad();
                    return;
                } else {
                    if (zamVar == null) {
                        return;
                    }
                    if (zamVar.zab().getErrorCode() == 18 && isGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i5 == -1) {
            zad();
            return;
        } else if (i5 == 0) {
            if (zamVar != null) {
                zaa(new ConnectionResult(intent != null ? intent.getIntExtra(ProtectedSandApp.s("쨝"), 13) : 13, null, zamVar.zab().toString()), zae(zamVar));
                return;
            }
            return;
        }
        if (zamVar != null) {
            zaa(zamVar.zab(), zamVar.zaa());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        zaa(new ConnectionResult(13, null), zae((zam) this.zab.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zab.set(bundle.getBoolean(ProtectedSandApp.s("쨞"), false) ? new zam(new ConnectionResult(bundle.getInt(ProtectedSandApp.s("쨟")), (PendingIntent) bundle.getParcelable(ProtectedSandApp.s("쨠"))), bundle.getInt(ProtectedSandApp.s("쨡"), -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zam zamVar = (zam) this.zab.get();
        if (zamVar == null) {
            return;
        }
        bundle.putBoolean(ProtectedSandApp.s("쨞"), true);
        bundle.putInt(ProtectedSandApp.s("쨡"), zamVar.zaa());
        bundle.putInt(ProtectedSandApp.s("쨟"), zamVar.zab().getErrorCode());
        bundle.putParcelable(ProtectedSandApp.s("쨠"), zamVar.zab().getResolution());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.zaa = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.zaa = false;
    }

    protected abstract void zab(ConnectionResult connectionResult, int i4);

    protected abstract void zac();

    public final void zah(ConnectionResult connectionResult, int i4) {
        AtomicReference atomicReference;
        zam zamVar = new zam(connectionResult, i4);
        do {
            atomicReference = this.zab;
            if (k1.a(atomicReference, null, zamVar)) {
                this.zad.post(new zao(this, zamVar));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
