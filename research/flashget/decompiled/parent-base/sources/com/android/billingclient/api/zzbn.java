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
final class zzbn extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f40801b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f40802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbn(m mVar, Handler handler, t tVar) {
        super(handler);
        this.f40801b = tVar;
        Objects.requireNonNull(mVar);
        this.f40802c = mVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, @androidx.annotation.q0 Bundle bundle) {
        y.a d5 = y.d();
        d5.d(i4);
        if (i4 != 0) {
            if (bundle == null) {
                this.f40802c.y1(this.f40801b, n4.f40520h, zzjs.zzbr, null);
                return;
            }
            d5.b(zzc.zzj(bundle, ProtectedSandApp.s("آ")));
            int i5 = bundle.getInt(ProtectedSandApp.s("أ"));
            m mVar = this.f40802c;
            zzjs zzb = i5 != 0 ? zzjs.zzb(i5) : zzjs.zzw;
            y a5 = d5.a();
            String string = bundle.getString(ProtectedSandApp.s("ؤ"));
            int i6 = i4.f40395a;
            mVar.A1(i4.b(zzb, 39, a5, string, zzjz.zza));
        }
        this.f40801b.a(d5.a());
    }
}
