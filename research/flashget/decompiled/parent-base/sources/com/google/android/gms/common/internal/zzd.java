package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.g;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@m1
/* loaded from: classes5.dex */
public final class zzd extends zzz {

    @q0
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(@o0 BaseGmsClient baseGmsClient, int i4) {
        this.zza = baseGmsClient;
        this.zzb = i4;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @g
    public final void onPostInitComplete(int i4, @o0 IBinder iBinder, @q0 Bundle bundle) {
        Preconditions.checkNotNull(this.zza, ProtectedSandApp.s("쭔"));
        this.zza.onPostInitHandler(i4, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @g
    public final void zzb(int i4, @q0 Bundle bundle) {
        Log.wtf(ProtectedSandApp.s("쭕"), ProtectedSandApp.s("쭖"), new Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @g
    public final void zzc(int i4, @o0 IBinder iBinder, @o0 zzj zzjVar) {
        BaseGmsClient baseGmsClient = this.zza;
        Preconditions.checkNotNull(baseGmsClient, ProtectedSandApp.s("쭗"));
        Preconditions.checkNotNull(zzjVar);
        baseGmsClient.zzc(zzjVar);
        onPostInitComplete(i4, iBinder, zzjVar.zza);
    }
}
