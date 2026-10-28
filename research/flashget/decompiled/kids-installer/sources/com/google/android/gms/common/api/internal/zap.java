package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.x;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes3.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final AtomicReference<zam> zab;
    protected final GoogleApiAvailability zac;
    private final Handler zad;

    @VisibleForTesting
    zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zab = new AtomicReference<>(null);
        this.zad = new com.google.android.gms.internal.base.zaq(Looper.getMainLooper());
        this.zac = googleApiAvailability;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(ConnectionResult connectionResult, int i5) {
        this.zab.set(null);
        zab(connectionResult, i5);
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
    public final void onActivityResult(int i5, int i6, Intent intent) {
        zam zamVar = this.zab.get();
        if (i5 != 1) {
            if (i5 == 2) {
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
        } else if (i6 == -1) {
            zad();
            return;
        } else if (i6 == 0) {
            if (zamVar == null) {
                return;
            }
            zaa(new ConnectionResult(intent != null ? intent.getIntExtra(ProtectedSandApp.s("↹"), 13) : 13, null, zamVar.zab().toString()), zae(zamVar));
            return;
        }
        if (zamVar != null) {
            zaa(zamVar.zab(), zamVar.zaa());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        zaa(new ConnectionResult(13, null), zae(this.zab.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(@q0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zab.set(bundle.getBoolean(ProtectedSandApp.s("↺"), false) ? new zam(new ConnectionResult(bundle.getInt(ProtectedSandApp.s("↻")), (PendingIntent) bundle.getParcelable(ProtectedSandApp.s("↼"))), bundle.getInt(ProtectedSandApp.s("↽"), -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zam zamVar = this.zab.get();
        if (zamVar == null) {
            return;
        }
        bundle.putBoolean(ProtectedSandApp.s("↾"), true);
        bundle.putInt(ProtectedSandApp.s("↿"), zamVar.zaa());
        bundle.putInt(ProtectedSandApp.s("⇀"), zamVar.zab().getErrorCode());
        bundle.putParcelable(ProtectedSandApp.s("⇁"), zamVar.zab().getResolution());
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

    protected abstract void zab(ConnectionResult connectionResult, int i5);

    protected abstract void zac();

    public final void zah(ConnectionResult connectionResult, int i5) {
        zam zamVar = new zam(connectionResult, i5);
        if (x.a(this.zab, null, zamVar)) {
            this.zad.post(new zao(this, zamVar));
        }
    }
}
