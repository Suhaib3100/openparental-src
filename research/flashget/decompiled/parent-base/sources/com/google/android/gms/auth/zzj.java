package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.auth.zzby;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzj implements zzk {
    final /* synthetic */ String zza;
    final /* synthetic */ Context zzb;

    zzj(String str, Context context) {
        this.zza = str;
        this.zzb = context;
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ Object zza(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle zzg = com.google.android.gms.internal.auth.zze.zzb(iBinder).zzg(this.zza);
        zzl.zzc(zzg);
        String string = zzg.getString(ProtectedSandApp.s("좛"));
        Intent intent = (Intent) zzg.getParcelable(ProtectedSandApp.s("좜"));
        PendingIntent pendingIntent = (PendingIntent) zzg.getParcelable(ProtectedSandApp.s("좝"));
        if (zzby.zzc.equals(zzby.zza(string))) {
            return Boolean.TRUE;
        }
        Context context = this.zzb;
        ProtectedSandApp.s("좞");
        zzl.zzn(context, ProtectedSandApp.s("윝"), string, intent, pendingIntent);
        throw new GoogleAuthException(ProtectedSandApp.s("좟"));
    }
}
