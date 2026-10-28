package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.g;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
abstract class zza extends zzc {
    public final int zza;

    @q0
    public final Bundle zzb;
    final /* synthetic */ BaseGmsClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @g
    protected zza(BaseGmsClient baseGmsClient, @q0 int i4, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzc = baseGmsClient;
        this.zza = i4;
        this.zzb = bundle;
    }

    protected abstract boolean zza();

    protected abstract void zzb(ConnectionResult connectionResult);

    @Override // com.google.android.gms.common.internal.zzc
    protected final /* bridge */ /* synthetic */ void zzc(Object obj) {
        int i4 = this.zza;
        if (i4 != 0) {
            this.zzc.zzd(1, null);
            Bundle bundle = this.zzb;
            zzb(new ConnectionResult(i4, bundle != null ? (PendingIntent) bundle.getParcelable(ProtectedSandApp.s("쬿")) : null));
        } else {
            if (zza()) {
                return;
            }
            this.zzc.zzd(1, null);
            zzb(new ConnectionResult(8, null));
        }
    }
}
