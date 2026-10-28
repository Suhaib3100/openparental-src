package com.android.billingclient.api;

import android.os.Bundle;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzaj;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzce;
import com.google.android.gms.internal.play_billing.zzcf;
import com.google.android.gms.internal.play_billing.zzjs;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class l3 extends zzaj {

    /* renamed from: a, reason: collision with root package name */
    final d3 f40460a;

    /* renamed from: b, reason: collision with root package name */
    final Boolean f40461b;

    /* renamed from: h, reason: collision with root package name */
    final int f40462h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ m f40463i;

    /* synthetic */ l3(m mVar, d3 d3Var, Boolean bool, int i4, r3 r3Var) {
        Objects.requireNonNull(mVar);
        this.f40463i = mVar;
        this.f40460a = d3Var;
        this.f40461b = bool;
        this.f40462h = i4;
    }

    private final void E(d3 d3Var, y yVar, zzjs zzjsVar, boolean z4, @androidx.annotation.q0 String str, int i4) {
        this.f40463i.E1(0);
        d3Var.i(yVar, zzjsVar, str, z4, i4);
        d3Var.k(yVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzak
    public final void zza(Bundle bundle) {
        int i4;
        Object obj;
        int i5;
        a7 a7Var;
        a7 a7Var2;
        zzcf zzcfVar;
        if (bundle == null) {
            zzc.zzn(ProtectedSandApp.s("Ӳ"), ProtectedSandApp.s("ӳ"));
            E(this.f40460a, n4.f40520h, zzjs.zzbr, this.f40461b.booleanValue(), null, this.f40462h);
            return;
        }
        if (!bundle.containsKey(ProtectedSandApp.s("Ӵ"))) {
            zzc.zzn(ProtectedSandApp.s("Ӳ"), ProtectedSandApp.s("ӵ"));
            E(this.f40460a, n4.f40520h, zzjs.zzby, this.f40461b.booleanValue(), null, this.f40462h);
            return;
        }
        if (bundle.getInt(ProtectedSandApp.s("Ӵ")) != 0) {
            E(this.f40460a, n4.a(bundle.getInt(ProtectedSandApp.s("Ӵ")), bundle.getString(ProtectedSandApp.s("Ӷ"), "")), zzjs.zzbz, this.f40461b.booleanValue(), android.support.v4.media.a.a(ProtectedSandApp.s("ӷ"), bundle.getInt(ProtectedSandApp.s("Ӵ"))), this.f40462h);
            return;
        }
        if (!bundle.containsKey(ProtectedSandApp.s("Ӹ"))) {
            zzc.zzn(ProtectedSandApp.s("Ӳ"), ProtectedSandApp.s("ӹ"));
            E(this.f40460a, n4.f40520h, zzjs.zzbx, this.f40461b.booleanValue(), null, this.f40462h);
            return;
        }
        int i6 = bundle.getInt(ProtectedSandApp.s("Ӹ"));
        m mVar = this.f40463i;
        m.U0(mVar, i6);
        mVar.f40476l = i6 >= 5;
        mVar.f40475k = i6 >= 3;
        Bundle bundle2 = bundle.getBundle(ProtectedSandApp.s("Ӻ"));
        if (bundle2 != null) {
            try {
                w4.g(bundle2.getBoolean(ProtectedSandApp.s("ӻ")));
            } catch (Throwable th) {
                zzc.zzo(ProtectedSandApp.s("Ӳ"), ProtectedSandApp.s("Ӽ").concat(bundle2.toString()), th);
            }
            try {
                w4.f(bundle2.getLong(ProtectedSandApp.s("ӽ")));
            } catch (Throwable th2) {
                zzc.zzo(ProtectedSandApp.s("Ӳ"), ProtectedSandApp.s("Ӿ").concat(bundle2.toString()), th2);
            }
            try {
                w4.d(bundle2.getLong(ProtectedSandApp.s("ӿ")));
            } catch (Throwable th3) {
                zzc.zzo(ProtectedSandApp.s("Ӳ"), ProtectedSandApp.s("Ԁ").concat(bundle2.toString()), th3);
            }
            try {
                w4.e(bundle2.getInt(ProtectedSandApp.s("ԁ")));
            } catch (Throwable th4) {
                zzc.zzo(ProtectedSandApp.s("Ӳ"), ProtectedSandApp.s("Ԃ").concat(bundle2.toString()), th4);
            }
            try {
                w4.h(bundle2.getBoolean(ProtectedSandApp.s("ԃ")));
            } catch (Throwable th5) {
                zzc.zzo(ProtectedSandApp.s("Ӳ"), ProtectedSandApp.s("Ԅ").concat(bundle2.toString()), th5);
            }
        }
        Bundle bundle3 = bundle.getBundle(ProtectedSandApp.s("ԅ"));
        if (bundle3 != null) {
            zzce zzceVar = new zzce();
            for (c6 c6Var : c6.values()) {
                if (bundle3.getBoolean(c6Var.name(), false)) {
                    zzceVar.zzb(c6Var);
                }
            }
            m mVar2 = this.f40463i;
            mVar2.J = zzceVar.zzc();
            a7Var = mVar2.f40470f;
            if (a7Var != null) {
                a7Var2 = mVar2.f40470f;
                zzcfVar = mVar2.J;
                a7Var2.j(zzcfVar);
            }
        }
        m mVar3 = this.f40463i;
        i4 = mVar3.f40477m;
        if (i4 < 3) {
            zzc.zzn(ProtectedSandApp.s("Ӳ"), ProtectedSandApp.s("Ԇ"));
            E(this.f40460a, n4.f40514b, zzjs.zzJ, this.f40461b.booleanValue(), null, this.f40462h);
            return;
        }
        d3 d3Var = this.f40460a;
        Boolean bool = this.f40461b;
        int i7 = this.f40462h;
        boolean booleanValue = bool.booleanValue();
        m.W0(mVar3, 0);
        obj = mVar3.f40465a;
        synchronized (obj) {
            try {
                i5 = mVar3.f40466b;
                if (i5 == 3) {
                    return;
                }
                d3Var.j(booleanValue, i7);
                d3Var.k(n4.f40521i);
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }
}
