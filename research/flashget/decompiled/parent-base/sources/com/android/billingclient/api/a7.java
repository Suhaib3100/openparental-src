package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzcf;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
final class a7 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f40277a;

    /* renamed from: b, reason: collision with root package name */
    private final a1 f40278b;

    /* renamed from: c, reason: collision with root package name */
    private final f1 f40279c;

    /* renamed from: d, reason: collision with root package name */
    private final e0 f40280d;

    /* renamed from: e, reason: collision with root package name */
    private final j4 f40281e;

    /* renamed from: h, reason: collision with root package name */
    private boolean f40284h;

    /* renamed from: i, reason: collision with root package name */
    private zzcf f40285i = zzcf.zzk();

    /* renamed from: f, reason: collision with root package name */
    private final z6 f40282f = new z6(this, true);

    /* renamed from: g, reason: collision with root package name */
    private final z6 f40283g = new z6(this, false);

    a7(Context context, a1 a1Var, a5 a5Var, f1 f1Var, e0 e0Var, j4 j4Var) {
        this.f40277a = context;
        this.f40278b = a1Var;
        this.f40279c = f1Var;
        this.f40280d = e0Var;
        this.f40281e = j4Var;
    }

    @androidx.annotation.q0
    final e0 c() {
        return this.f40280d;
    }

    @androidx.annotation.q0
    final a1 e() {
        return this.f40278b;
    }

    final void h() {
        z6 z6Var = this.f40282f;
        Context context = this.f40277a;
        z6Var.c(context);
        this.f40283g.c(context);
    }

    final void i(boolean z4) {
        IntentFilter intentFilter = new IntentFilter(ProtectedSandApp.s("ͥ"));
        IntentFilter intentFilter2 = new IntentFilter(ProtectedSandApp.s("ͦ"));
        intentFilter2.addAction(ProtectedSandApp.s("ͧ"));
        this.f40284h = z4;
        z6 z6Var = this.f40283g;
        Context context = this.f40277a;
        z6Var.a(context, intentFilter2);
        if (this.f40284h) {
            this.f40282f.b(context, intentFilter, ProtectedSandApp.s("ͨ"));
        } else {
            this.f40282f.a(context, intentFilter);
        }
    }

    final void j(zzcf zzcfVar) {
        this.f40285i = zzcfVar;
    }
}
