package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.billingclient.api.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class q5 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    private y f40629a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40630b = false;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.q0
    private final j4 f40631c;

    q5(@androidx.annotation.q0 j4 j4Var) {
        this.f40631c = j4Var;
    }

    @androidx.annotation.q0
    final y a() {
        return this.f40629a;
    }

    final void b() {
        this.f40629a = null;
    }

    final boolean c() {
        return this.f40630b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, @androidx.annotation.q0 Intent intent) {
        String s4 = ProtectedSandApp.s("ի");
        if (intent == null) {
            zzc.zzn(s4, ProtectedSandApp.s("լ"));
            return;
        }
        zzc.zzm(s4, ProtectedSandApp.s("խ").concat(String.valueOf(intent.getAction())));
        boolean equals = Objects.equals(intent.getAction(), ProtectedSandApp.s("ծ"));
        String s5 = ProtectedSandApp.s("կ");
        if (!equals) {
            if (!Objects.equals(intent.getAction(), ProtectedSandApp.s("ճ"))) {
                zzc.zzn(s4, ProtectedSandApp.s("մ").concat(String.valueOf(intent.getAction())));
                return;
            }
            this.f40630b = true;
            j4 j4Var = this.f40631c;
            if (j4Var != null) {
                j4Var.j(intent.getLongExtra(s5, 0L));
                return;
            }
            return;
        }
        String s6 = ProtectedSandApp.s("հ");
        if (!intent.hasExtra(s6)) {
            zzc.zzn(s4, ProtectedSandApp.s("ձ"));
            j4 j4Var2 = this.f40631c;
            if (j4Var2 != null) {
                j4Var2.e(null, intent.getLongExtra(s5, 0L));
                return;
            }
            return;
        }
        y.a d5 = y.d();
        d5.d(intent.getIntExtra(s6, 0));
        d5.b(zzbo.zzc(intent.getStringExtra(ProtectedSandApp.s("ղ"))));
        y a5 = d5.a();
        this.f40629a = a5;
        j4 j4Var3 = this.f40631c;
        if (j4Var3 != null) {
            j4Var3.e(a5, intent.getLongExtra(s5, 0L));
        }
    }
}
