package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzb extends com.google.android.gms.internal.common.zzg {
    final /* synthetic */ BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zza = baseGmsClient;
    }

    private static final void zza(Message message) {
        zzc zzcVar = (zzc) message.obj;
        if (zzcVar != null) {
            zzcVar.zze();
        }
    }

    private static final boolean zzb(Message message) {
        int i4 = message.what;
        return i4 == 2 || i4 == 1 || i4 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient baseGmsClient = this.zza;
        if (baseGmsClient.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        int i4 = message.what;
        if ((i4 == 1 || i4 == 7 || ((i4 == 4 && !baseGmsClient.enableLocalFallback()) || message.what == 5)) && !baseGmsClient.isConnecting()) {
            zza(message);
            return;
        }
        int i5 = message.what;
        if (i5 == 4) {
            baseGmsClient.zzn(new ConnectionResult(message.arg2));
            if (baseGmsClient.zzg() && !baseGmsClient.zzo()) {
                baseGmsClient.zzd(3, null);
                return;
            }
            ConnectionResult zzm = baseGmsClient.zzm() != null ? baseGmsClient.zzm() : new ConnectionResult(8);
            baseGmsClient.zzc.onReportServiceBinding(zzm);
            baseGmsClient.onConnectionFailed(zzm);
            return;
        }
        if (i5 == 5) {
            ConnectionResult zzm2 = baseGmsClient.zzm() != null ? baseGmsClient.zzm() : new ConnectionResult(8);
            baseGmsClient.zzc.onReportServiceBinding(zzm2);
            baseGmsClient.onConnectionFailed(zzm2);
            return;
        }
        if (i5 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            baseGmsClient.zzc.onReportServiceBinding(connectionResult);
            baseGmsClient.onConnectionFailed(connectionResult);
            return;
        }
        if (i5 == 6) {
            baseGmsClient.zzd(5, null);
            if (baseGmsClient.zzk() != null) {
                baseGmsClient.zzk().onConnectionSuspended(message.arg2);
            }
            baseGmsClient.onConnectionSuspended(message.arg2);
            baseGmsClient.zze(5, 1, null);
            return;
        }
        if (i5 == 2 && !baseGmsClient.isConnected()) {
            zza(message);
            return;
        }
        if (zzb(message)) {
            ((zzc) message.obj).zzd();
            return;
        }
        int i6 = message.what;
        StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 34);
        sb.append(ProtectedSandApp.s("쭑"));
        sb.append(i6);
        Log.wtf(ProtectedSandApp.s("쭒"), sb.toString(), new Exception());
    }
}
