package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzad;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import java.lang.ref.WeakReference;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class h3 extends zzad {

    /* renamed from: a, reason: collision with root package name */
    final WeakReference f40389a;

    /* renamed from: b, reason: collision with root package name */
    final ResultReceiver f40390b;

    /* synthetic */ h3(WeakReference weakReference, ResultReceiver resultReceiver, r3 r3Var) {
        this.f40389a = weakReference;
        this.f40390b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzae
    public final void zza(Bundle bundle) throws RemoteException {
        if (bundle == null) {
            this.f40390b.send(6, null);
            return;
        }
        String s4 = ProtectedSandApp.s("Ҟ");
        boolean containsKey = bundle.containsKey(s4);
        String s5 = ProtectedSandApp.s("ҟ");
        if (!containsKey) {
            zzc.zzn(s5, ProtectedSandApp.s("Ҡ"));
            this.f40390b.send(6, bundle);
            return;
        }
        int zzb = zzc.zzb(bundle, s5);
        if (zzb != 0) {
            zzc.zzn(s5, h1.a(zzb, ProtectedSandApp.s("ҡ")));
            this.f40390b.send(zzb, bundle);
            return;
        }
        String s6 = ProtectedSandApp.s("Ң");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(s6);
        if (pendingIntent == null) {
            zzc.zzm(s5, ProtectedSandApp.s("ң"));
            this.f40390b.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f40389a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra(ProtectedSandApp.s("Ҥ"), this.f40390b);
            intent.putExtra(s6, pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e4) {
            zzc.zzo(s5, ProtectedSandApp.s("ҥ"), e4);
            Bundle bundle2 = new Bundle();
            bundle2.putInt(s4, 6);
            bundle2.putString(ProtectedSandApp.s("Ҧ"), ProtectedSandApp.s("ҧ"));
            bundle2.putInt(ProtectedSandApp.s("Ҩ"), zzjs.zzax.zza());
            bundle2.putString(ProtectedSandApp.s("Ҫ"), String.format(ProtectedSandApp.s("ҩ"), e4.getClass().getName(), zzbo.zzc(e4.getMessage())));
            this.f40390b.send(6, bundle2);
        }
    }
}
