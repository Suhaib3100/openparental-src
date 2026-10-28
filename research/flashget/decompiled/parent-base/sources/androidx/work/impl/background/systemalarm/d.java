package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.c1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.model.r;
import androidx.work.impl.utils.w;
import androidx.work.s;
import java.util.Collections;
import java.util.List;

/* compiled from: DelayMetCommandHandler.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class d implements androidx.work.impl.constraints.c, androidx.work.impl.b, w.b {

    /* renamed from: k, reason: collision with root package name */
    private static final String f36063k = s.f("DelayMetCommandHandler");

    /* renamed from: l, reason: collision with root package name */
    private static final int f36064l = 0;

    /* renamed from: m, reason: collision with root package name */
    private static final int f36065m = 1;

    /* renamed from: n, reason: collision with root package name */
    private static final int f36066n = 2;

    /* renamed from: b, reason: collision with root package name */
    private final Context f36067b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36068c;

    /* renamed from: d, reason: collision with root package name */
    private final String f36069d;

    /* renamed from: e, reason: collision with root package name */
    private final e f36070e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.work.impl.constraints.d f36071f;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private PowerManager.WakeLock f36074i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f36075j = false;

    /* renamed from: h, reason: collision with root package name */
    private int f36073h = 0;

    /* renamed from: g, reason: collision with root package name */
    private final Object f36072g = new Object();

    d(@o0 Context context, int startId, @o0 String workSpecId, @o0 e dispatcher) {
        this.f36067b = context;
        this.f36068c = startId;
        this.f36070e = dispatcher;
        this.f36069d = workSpecId;
        this.f36071f = new androidx.work.impl.constraints.d(context, dispatcher.f(), this);
    }

    private void c() {
        synchronized (this.f36072g) {
            try {
                this.f36071f.e();
                this.f36070e.h().f(this.f36069d);
                PowerManager.WakeLock wakeLock = this.f36074i;
                if (wakeLock != null && wakeLock.isHeld()) {
                    s.c().a(f36063k, String.format("Releasing wakelock %s for WorkSpec %s", this.f36074i, this.f36069d), new Throwable[0]);
                    this.f36074i.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void g() {
        synchronized (this.f36072g) {
            try {
                if (this.f36073h < 2) {
                    this.f36073h = 2;
                    s c5 = s.c();
                    String str = f36063k;
                    c5.a(str, String.format("Stopping work for WorkSpec %s", this.f36069d), new Throwable[0]);
                    Intent g4 = b.g(this.f36067b, this.f36069d);
                    e eVar = this.f36070e;
                    eVar.k(new e.b(eVar, g4, this.f36068c));
                    if (this.f36070e.d().h(this.f36069d)) {
                        s.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f36069d), new Throwable[0]);
                        Intent f4 = b.f(this.f36067b, this.f36069d);
                        e eVar2 = this.f36070e;
                        eVar2.k(new e.b(eVar2, f4, this.f36068c));
                    } else {
                        s.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f36069d), new Throwable[0]);
                    }
                } else {
                    s.c().a(f36063k, String.format("Already stopped work for %s", this.f36069d), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.utils.w.b
    public void a(@o0 String workSpecId) {
        s.c().a(f36063k, String.format("Exceeded time limits on execution for %s", workSpecId), new Throwable[0]);
        g();
    }

    @Override // androidx.work.impl.constraints.c
    public void b(@o0 List<String> workSpecIds) {
        g();
    }

    @n1
    void d() {
        this.f36074i = androidx.work.impl.utils.s.b(this.f36067b, String.format("%s (%s)", this.f36069d, Integer.valueOf(this.f36068c)));
        s c5 = s.c();
        String str = f36063k;
        c5.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f36074i, this.f36069d), new Throwable[0]);
        this.f36074i.acquire();
        r k4 = this.f36070e.g().M().k().k(this.f36069d);
        if (k4 == null) {
            g();
            return;
        }
        boolean b5 = k4.b();
        this.f36075j = b5;
        if (b5) {
            this.f36071f.d(Collections.singletonList(k4));
        } else {
            s.c().a(str, String.format("No constraints for %s", this.f36069d), new Throwable[0]);
            f(Collections.singletonList(this.f36069d));
        }
    }

    @Override // androidx.work.impl.b
    public void e(@o0 String workSpecId, boolean needsReschedule) {
        s.c().a(f36063k, String.format("onExecuted %s, %s", workSpecId, Boolean.valueOf(needsReschedule)), new Throwable[0]);
        c();
        if (needsReschedule) {
            Intent f4 = b.f(this.f36067b, this.f36069d);
            e eVar = this.f36070e;
            eVar.k(new e.b(eVar, f4, this.f36068c));
        }
        if (this.f36075j) {
            Intent a5 = b.a(this.f36067b);
            e eVar2 = this.f36070e;
            eVar2.k(new e.b(eVar2, a5, this.f36068c));
        }
    }

    @Override // androidx.work.impl.constraints.c
    public void f(@o0 List<String> workSpecIds) {
        if (workSpecIds.contains(this.f36069d)) {
            synchronized (this.f36072g) {
                try {
                    if (this.f36073h == 0) {
                        this.f36073h = 1;
                        s.c().a(f36063k, String.format("onAllConstraintsMet for %s", this.f36069d), new Throwable[0]);
                        if (this.f36070e.d().k(this.f36069d)) {
                            this.f36070e.h().e(this.f36069d, 600000L, this);
                        } else {
                            c();
                        }
                    } else {
                        s.c().a(f36063k, String.format("Already started work for %s", this.f36069d), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
