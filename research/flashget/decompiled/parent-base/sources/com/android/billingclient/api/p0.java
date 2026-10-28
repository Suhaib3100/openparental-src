package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import com.android.billingclient.api.r;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzab;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdu;
import com.google.android.gms.internal.play_billing.zzej;
import com.google.android.gms.internal.play_billing.zzjs;
import java.util.concurrent.ExecutorService;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@e6
/* loaded from: classes3.dex */
final class p0 extends zzab {

    /* renamed from: l, reason: collision with root package name */
    private static final String f40553l = ProtectedSandApp.s("Ճ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f40554m = ProtectedSandApp.s("Ղ");

    /* renamed from: a, reason: collision with root package name */
    final s f40555a;

    /* renamed from: b, reason: collision with root package name */
    final int f40556b;

    /* renamed from: h, reason: collision with root package name */
    final int f40557h;

    /* renamed from: i, reason: collision with root package name */
    final Handler f40558i;

    /* renamed from: j, reason: collision with root package name */
    final ExecutorService f40559j;

    /* renamed from: k, reason: collision with root package name */
    final j4 f40560k;

    p0(s sVar, int i4, j4 j4Var, int i5, Handler handler, ExecutorService executorService) {
        sVar.getClass();
        this.f40555a = sVar;
        this.f40556b = i4;
        this.f40560k = j4Var;
        this.f40557h = i5;
        this.f40558i = handler;
        this.f40559j = executorService;
    }

    private void E(int i4, y yVar, zzjs zzjsVar, @androidx.annotation.q0 Exception exc) {
        p4.b(zzjsVar, yVar, this.f40560k, q4.zzb.zzb(), this.f40557h, exc == null ? null : i4.a(exc));
        this.f40555a.a(yVar, new r(i4));
    }

    private r.a F(zzej zzejVar) {
        zzdu zza = zzejVar.zza();
        int zze = zza.zze() - 2;
        int i4 = 1;
        if (zze != 1) {
            i4 = 2;
            if (zze != 2) {
                i4 = 0;
            }
        }
        return new r.a(i4, zza.zzc());
    }

    private void G(int i4, y yVar, Bundle bundle) {
        r rVar;
        if (i4 == 5) {
            try {
                byte[] byteArray = bundle.getByteArray(ProtectedSandApp.s("Ղ"));
                if (byteArray == null) {
                    E(5, n4.f40520h, zzjs.zzaS, null);
                    return;
                }
                zzej zzc = zzej.zzc(byteArray);
                if (!zzc.zze()) {
                    E(5, n4.f40520h, zzjs.zzaS, null);
                    return;
                }
                rVar = new r(5, F(zzc));
            } catch (Exception e4) {
                e = e4;
                i4 = 5;
                zzc.zzn(ProtectedSandApp.s("Ճ"), ProtectedSandApp.s("Մ"));
                E(i4, n4.f40520h, zzjs.zzaS, e);
                return;
            }
        } else {
            try {
                rVar = new r(i4);
            } catch (Exception e5) {
                e = e5;
                zzc.zzn(ProtectedSandApp.s("Ճ"), ProtectedSandApp.s("Մ"));
                E(i4, n4.f40520h, zzjs.zzaS, e);
                return;
            }
        }
        this.f40555a.a(yVar, rVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    @e6
    public void onDelegateToBackendResponse(Bundle bundle) {
        if (bundle == null) {
            j4 j4Var = this.f40560k;
            zzjs zzjsVar = zzjs.zzaT;
            y yVar = n4.f40520h;
            p4.a(zzjsVar, yVar, j4Var, q4.zzb.zzb(), this.f40557h);
            this.f40555a.a(yVar, new r(this.f40556b));
            return;
        }
        q4 q4Var = q4.zzb;
        y a5 = s4.a(bundle, ProtectedSandApp.s("Ճ"), q4Var.zzb(), this.f40560k, this.f40557h);
        if (this.f40555a != null) {
            G(this.f40556b, a5, bundle);
        } else {
            p4.a(zzjs.zzaR, a5, this.f40560k, q4Var.zzb(), this.f40557h);
        }
    }
}
