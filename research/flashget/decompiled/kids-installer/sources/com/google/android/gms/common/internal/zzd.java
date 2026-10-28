package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.g;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzd extends zzab {

    @q0
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(@o0 BaseGmsClient baseGmsClient, int i5) {
        this.zza = baseGmsClient;
        this.zzb = i5;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @g
    public final void onPostInitComplete(int i5, @o0 IBinder iBinder, @q0 Bundle bundle) {
        Preconditions.checkNotNull(this.zza, ProtectedSandApp.s("≢"));
        this.zza.onPostInitHandler(i5, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @g
    public final void zzb(int i5, @q0 Bundle bundle) {
        Log.wtf(ProtectedSandApp.s("≣"), ProtectedSandApp.s("≤"), new Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @g
    public final void zzc(int i5, @o0 IBinder iBinder, @o0 zzj zzjVar) {
        BaseGmsClient baseGmsClient = this.zza;
        Preconditions.checkNotNull(baseGmsClient, ProtectedSandApp.s("≥"));
        Preconditions.checkNotNull(zzjVar);
        BaseGmsClient.zzj(baseGmsClient, zzjVar);
        onPostInitComplete(i5, iBinder, zzjVar.zza);
    }
}
