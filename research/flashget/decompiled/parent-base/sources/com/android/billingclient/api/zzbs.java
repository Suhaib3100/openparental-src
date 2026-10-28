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
final class zzbs extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h0 f40806b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f40807c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbs(m mVar, Handler handler, h0 h0Var) {
        super(handler);
        this.f40806b = h0Var;
        Objects.requireNonNull(mVar);
        this.f40807c = mVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, @androidx.annotation.q0 Bundle bundle) {
        y.a d5 = y.d();
        d5.d(i4);
        if (i4 != 0) {
            if (bundle == null) {
                this.f40807c.u1(this.f40806b, n4.f40520h, zzjs.zzaI, null);
                return;
            }
            d5.b(zzc.zzj(bundle, ProtectedSandApp.s("ب")));
            int i5 = bundle.getInt(ProtectedSandApp.s("ة"));
            m mVar = this.f40807c;
            zzjs zzb = i5 != 0 ? zzjs.zzb(i5) : zzjs.zzw;
            y a5 = d5.a();
            String string = bundle.getString(ProtectedSandApp.s("ت"));
            int i6 = i4.f40395a;
            mVar.A1(i4.b(zzb, 25, a5, string, zzjz.zza));
        }
        this.f40806b.a(d5.a());
    }
}
