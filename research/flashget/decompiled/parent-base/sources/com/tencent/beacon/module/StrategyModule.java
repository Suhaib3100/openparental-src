package com.tencent.beacon.module;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.b.e;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.d.a;
import com.tencent.beacon.d.b;
import com.tencent.beacon.d.h;
import com.tencent.beacon.d.i;

/* loaded from: classes6.dex */
public class StrategyModule implements BeaconModule {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f71668a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private i f71670c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71672e = false;

    /* renamed from: d, reason: collision with root package name */
    private b f71671d = b.b();

    /* renamed from: b, reason: collision with root package name */
    private a f71669b = a.a();

    public StrategyModule() {
        h.d().a(this.f71669b);
        this.f71670c = new i(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        if (!this.f71670c.a()) {
            com.tencent.beacon.a.b.b.a().a(this.f71670c);
        }
    }

    public boolean c() {
        boolean z4;
        synchronized (f71668a) {
            z4 = this.f71672e;
        }
        return z4;
    }

    @Override // com.tencent.beacon.module.BeaconModule
    public void a(Context context) {
        c.a(ProtectedSandApp.s("㐔\u0001"), new Object[0]);
        this.f71670c.b();
        d();
        e.a(context, new e.a() { // from class: com.tencent.beacon.module.StrategyModule.1
            @Override // com.tencent.beacon.base.net.b.e.a
            public void a() {
                synchronized (StrategyModule.this) {
                    try {
                        if (!StrategyModule.this.c() && !StrategyModule.this.f71670c.a()) {
                            StrategyModule.this.d();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.tencent.beacon.base.net.b.e.a
            public void b() {
            }
        });
    }

    public b b() {
        return this.f71671d;
    }

    public void a(boolean z4) {
        synchronized (f71668a) {
            this.f71672e = z4;
        }
    }

    public a a() {
        return this.f71669b;
    }
}
