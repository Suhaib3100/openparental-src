package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationStatusCodes;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
final class zzaw extends zzaj {
    private BaseImplementation.ResultHolder<Status> zza;

    public zzaw(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i4, String[] strArr) {
        if (this.zza == null) {
            Log.wtf(ProtectedSandApp.s("텁"), ProtectedSandApp.s("텂"), new Exception());
        } else {
            this.zza.setResult(LocationStatusCodes.zzb(LocationStatusCodes.zza(i4)));
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i4, String[] strArr) {
        Log.wtf(ProtectedSandApp.s("텁"), ProtectedSandApp.s("텃"), new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i4, PendingIntent pendingIntent) {
        Log.wtf(ProtectedSandApp.s("텁"), ProtectedSandApp.s("텄"), new Exception());
    }
}
