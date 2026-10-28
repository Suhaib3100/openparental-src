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
final class p3 extends zzad {

    /* renamed from: a, reason: collision with root package name */
    final WeakReference f40567a;

    /* renamed from: b, reason: collision with root package name */
    final ResultReceiver f40568b;

    /* synthetic */ p3(WeakReference weakReference, ResultReceiver resultReceiver, r3 r3Var) {
        this.f40567a = weakReference;
        this.f40568b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzae
    public final void zza(Bundle bundle) throws RemoteException {
        String s4 = ProtectedSandApp.s("Յ");
        if (bundle == null) {
            this.f40568b.send(6, null);
            return;
        }
        String s5 = ProtectedSandApp.s("Ն");
        boolean containsKey = bundle.containsKey(s5);
        String s6 = ProtectedSandApp.s("Շ");
        if (!containsKey) {
            zzc.zzn(s6, ProtectedSandApp.s("Ո"));
            this.f40568b.send(6, bundle);
            return;
        }
        int zzb = zzc.zzb(bundle, s6);
        if (zzb != 0) {
            zzc.zzn(s6, h1.a(zzb, ProtectedSandApp.s("Չ")));
            this.f40568b.send(zzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(ProtectedSandApp.s("Պ"));
        if (pendingIntent == null) {
            zzc.zzm(s6, ProtectedSandApp.s("Ջ"));
            this.f40568b.send(0, bundle);
            return;
        }
        try {
            Activity activity = (Activity) this.f40567a.get();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
                intent.putExtra(ProtectedSandApp.s("Ռ"), this.f40568b);
                intent.putExtra(ProtectedSandApp.s("Ս"), pendingIntent);
                activity.startActivity(intent);
                return;
            }
            zzc.zzn(s6, ProtectedSandApp.s("Վ"));
            Bundle bundle2 = new Bundle();
            bundle2.putInt(s5, 5);
            bundle2.putString(s4, ProtectedSandApp.s("Տ"));
            this.f40568b.send(5, bundle2);
        } catch (RuntimeException e4) {
            zzc.zzo(s6, ProtectedSandApp.s("Ր"), e4);
            Bundle bundle3 = new Bundle();
            bundle3.putInt(s5, 6);
            bundle3.putString(s4, ProtectedSandApp.s("Ց"));
            bundle3.putInt(ProtectedSandApp.s("Ւ"), zzjs.zzbt.zza());
            bundle3.putString(ProtectedSandApp.s("Ք"), String.format(ProtectedSandApp.s("Փ"), e4.getClass().getName(), zzbo.zzc(e4.getMessage())));
            this.f40568b.send(6, bundle3);
        }
    }
}
