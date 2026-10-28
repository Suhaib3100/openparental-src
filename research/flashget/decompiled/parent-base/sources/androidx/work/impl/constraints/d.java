package androidx.work.impl.constraints;

import android.content.Context;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.impl.constraints.controllers.c;
import androidx.work.impl.constraints.controllers.f;
import androidx.work.impl.constraints.controllers.g;
import androidx.work.impl.constraints.controllers.h;
import androidx.work.impl.model.r;
import androidx.work.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkConstraintsTracker.java */
/* loaded from: classes3.dex */
public class d implements c.a {

    /* renamed from: d, reason: collision with root package name */
    private static final String f36122d = s.f("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final c f36123a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.constraints.controllers.c<?>[] f36124b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f36125c;

    public d(@o0 Context context, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor, @q0 c callback) {
        Context applicationContext = context.getApplicationContext();
        this.f36123a = callback;
        this.f36124b = new androidx.work.impl.constraints.controllers.c[]{new androidx.work.impl.constraints.controllers.a(applicationContext, taskExecutor), new androidx.work.impl.constraints.controllers.b(applicationContext, taskExecutor), new h(applicationContext, taskExecutor), new androidx.work.impl.constraints.controllers.d(applicationContext, taskExecutor), new g(applicationContext, taskExecutor), new f(applicationContext, taskExecutor), new androidx.work.impl.constraints.controllers.e(applicationContext, taskExecutor)};
        this.f36125c = new Object();
    }

    @Override // androidx.work.impl.constraints.controllers.c.a
    public void a(@o0 List<String> workSpecIds) {
        synchronized (this.f36125c) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String str : workSpecIds) {
                    if (c(str)) {
                        s.c().a(f36122d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                c cVar = this.f36123a;
                if (cVar != null) {
                    cVar.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.constraints.controllers.c.a
    public void b(@o0 List<String> workSpecIds) {
        synchronized (this.f36125c) {
            try {
                c cVar = this.f36123a;
                if (cVar != null) {
                    cVar.b(workSpecIds);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(@o0 String workSpecId) {
        synchronized (this.f36125c) {
            try {
                for (androidx.work.impl.constraints.controllers.c<?> cVar : this.f36124b) {
                    if (cVar.d(workSpecId)) {
                        s.c().a(f36122d, String.format("Work %s constrained by %s", workSpecId, cVar.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(@o0 Iterable<r> workSpecs) {
        synchronized (this.f36125c) {
            try {
                for (androidx.work.impl.constraints.controllers.c<?> cVar : this.f36124b) {
                    cVar.g(null);
                }
                for (androidx.work.impl.constraints.controllers.c<?> cVar2 : this.f36124b) {
                    cVar2.e(workSpecs);
                }
                for (androidx.work.impl.constraints.controllers.c<?> cVar3 : this.f36124b) {
                    cVar3.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.f36125c) {
            try {
                for (androidx.work.impl.constraints.controllers.c<?> cVar : this.f36124b) {
                    cVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @m1
    d(@q0 c callback, androidx.work.impl.constraints.controllers.c<?>[] controllers) {
        this.f36123a = callback;
        this.f36124b = controllers;
        this.f36125c = new Object();
    }
}
