package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class zzbr extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f40804b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f40805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbr(m mVar, Handler handler, e eVar) {
        super(handler);
        this.f40804b = eVar;
        Objects.requireNonNull(mVar);
        this.f40805c = mVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, @androidx.annotation.q0 Bundle bundle) {
        y.a d5 = y.d();
        d5.d(i4);
        if (i4 != 0) {
            if (bundle == null) {
                this.f40805c.x1(this.f40804b, n4.f40520h, zzjs.zzau, null);
                return;
            }
            d5.b(zzc.zzj(bundle, ProtectedSandApp.s("إ")));
            int i5 = bundle.getInt(ProtectedSandApp.s("ئ"));
            m mVar = this.f40805c;
            zzjs zzb = i5 != 0 ? zzjs.zzb(i5) : zzjs.zzw;
            y a5 = d5.a();
            String string = bundle.getString(ProtectedSandApp.s("ا"));
            int i6 = i4.f40395a;
            mVar.A1(i4.b(zzb, 16, a5, string, zzjz.zza));
        }
        this.f40804b.a(d5.a());
    }
}
