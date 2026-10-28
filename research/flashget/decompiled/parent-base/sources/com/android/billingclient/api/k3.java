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
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class k3 extends zzah {

    /* renamed from: a, reason: collision with root package name */
    final WeakReference f40451a;

    /* renamed from: b, reason: collision with root package name */
    final ResultReceiver f40452b;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ m f40453h;

    /* synthetic */ k3(m mVar, WeakReference weakReference, r0 r0Var, r3 r3Var) {
        Objects.requireNonNull(mVar);
        this.f40453h = mVar;
        this.f40451a = weakReference;
        this.f40452b = m.Q1(mVar, r0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.zzai
    public final void zza(Bundle bundle) throws RemoteException {
        String s4 = ProtectedSandApp.s("ӣ");
        if (bundle == null) {
            zzc.zzn(s4, ProtectedSandApp.s("Ӥ"));
            this.f40453h.g1(zzjs.zzbr, 37, n4.f40520h);
            this.f40452b.send(6, null);
            return;
        }
        String s5 = ProtectedSandApp.s("ӥ");
        if (!bundle.containsKey(s5)) {
            zzc.zzn(s4, ProtectedSandApp.s("Ӧ"));
            this.f40453h.g1(zzjs.zzbw, 37, n4.f40520h);
            this.f40452b.send(6, bundle);
            return;
        }
        int zzb = zzc.zzb(bundle, s4);
        if (zzb != 0) {
            zzc.zzn(s4, h1.a(zzb, ProtectedSandApp.s("ӧ")));
            this.f40452b.send(zzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(ProtectedSandApp.s("Ө"));
        String s6 = ProtectedSandApp.s("ө");
        String s7 = ProtectedSandApp.s("Ӫ");
        if (pendingIntent == null) {
            zzc.zzn(s4, ProtectedSandApp.s("ӫ"));
            Bundle bundle2 = new Bundle();
            bundle2.putInt(s5, 6);
            bundle2.putString(s7, s6);
            this.f40452b.send(6, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f40451a.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra(ProtectedSandApp.s("Ӭ"), this.f40452b);
            intent.putExtra(ProtectedSandApp.s("ӭ"), pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e4) {
            zzc.zzo(s4, ProtectedSandApp.s("Ӯ"), e4);
            Bundle bundle3 = new Bundle();
            bundle3.putInt(s5, 6);
            bundle3.putString(s7, s6);
            bundle3.putInt(ProtectedSandApp.s("ӯ"), zzjs.zzbE.zza());
            bundle3.putString(ProtectedSandApp.s("ӱ"), String.format(ProtectedSandApp.s("Ӱ"), e4.getClass().getName(), zzbo.zzc(e4.getMessage())));
            this.f40452b.send(6, bundle3);
        }
    }
}
