package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzah;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import java.lang.ref.WeakReference;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class j3 extends zzah {

    /* renamed from: a, reason: collision with root package name */
    final WeakReference f40438a;

    /* renamed from: b, reason: collision with root package name */
    final ResultReceiver f40439b;

    /* synthetic */ j3(WeakReference weakReference, ResultReceiver resultReceiver, r3 r3Var) {
        this.f40438a = weakReference;
        this.f40439b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzai
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.f40439b.send(6, null);
            return;
        }
        String s4 = ProtectedSandApp.s("ӊ");
        boolean containsKey = bundle.containsKey(s4);
        String s5 = ProtectedSandApp.s("Ӌ");
        if (!containsKey) {
            zzc.zzn(s5, ProtectedSandApp.s("ӌ"));
            this.f40439b.send(6, bundle);
            return;
        }
        int zzb = zzc.zzb(bundle, s5);
        if (zzb != 0) {
            zzc.zzn(s5, h1.a(zzb, ProtectedSandApp.s("Ӎ")));
            this.f40439b.send(zzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(ProtectedSandApp.s("ӎ"));
        String s6 = ProtectedSandApp.s("ӏ");
        String s7 = ProtectedSandApp.s("Ӑ");
        if (pendingIntent == null) {
            zzc.zzn(s5, ProtectedSandApp.s("ӑ"));
            Bundle bundle2 = new Bundle();
            bundle2.putInt(s4, 6);
            bundle2.putString(s7, s6);
            this.f40439b.send(6, bundle2);
            return;
        }
        try {
            Activity activity = (Activity) this.f40438a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra(ProtectedSandApp.s("Ӓ"), this.f40439b);
            intent.putExtra(ProtectedSandApp.s("ӓ"), pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e4) {
            zzc.zzo(s5, ProtectedSandApp.s("Ӕ"), e4);
            Bundle bundle3 = new Bundle();
            bundle3.putInt(s4, 6);
            bundle3.putString(s7, s6);
            bundle3.putInt(ProtectedSandApp.s("ӕ"), zzjs.zzaK.zza());
            bundle3.putString(ProtectedSandApp.s("ӗ"), String.format(ProtectedSandApp.s("Ӗ"), e4.getClass().getName(), zzbo.zzc(e4.getMessage())));
            this.f40439b.send(6, bundle3);
        }
    }
}
