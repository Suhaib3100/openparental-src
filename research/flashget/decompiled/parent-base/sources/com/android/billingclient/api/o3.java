package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzas;
import com.google.android.gms.internal.play_billing.zzc;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class o3 extends zzas {

    /* renamed from: a, reason: collision with root package name */
    final WeakReference f40550a;

    /* renamed from: b, reason: collision with root package name */
    final ResultReceiver f40551b;

    /* synthetic */ o3(WeakReference weakReference, ResultReceiver resultReceiver, r3 r3Var) {
        this.f40550a = weakReference;
        this.f40551b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzat
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.f40551b;
        String s4 = ProtectedSandApp.s("Ժ");
        if (resultReceiver == null) {
            zzc.zzn(s4, ProtectedSandApp.s("Ի"));
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f40550a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(ProtectedSandApp.s("Լ"));
        if (activity == null || pendingIntent == null) {
            resultReceiver.send(0, null);
            zzc.zzn(s4, ProtectedSandApp.s("Հ"));
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra(ProtectedSandApp.s("Խ"), resultReceiver);
            intent.putExtra(ProtectedSandApp.s("Ծ"), pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e4) {
            this.f40551b.send(0, null);
            zzc.zzo(s4, ProtectedSandApp.s("Կ"), e4);
        }
    }
}
