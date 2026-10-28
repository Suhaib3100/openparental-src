package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;

/* compiled from: Trackers.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class g {

    /* renamed from: e, reason: collision with root package name */
    private static g f36147e;

    /* renamed from: a, reason: collision with root package name */
    private a f36148a;

    /* renamed from: b, reason: collision with root package name */
    private b f36149b;

    /* renamed from: c, reason: collision with root package name */
    private e f36150c;

    /* renamed from: d, reason: collision with root package name */
    private f f36151d;

    private g(@o0 Context context, @o0 androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        Context applicationContext = context.getApplicationContext();
        this.f36148a = new a(applicationContext, taskExecutor);
        this.f36149b = new b(applicationContext, taskExecutor);
        this.f36150c = new e(applicationContext, taskExecutor);
        this.f36151d = new f(applicationContext, taskExecutor);
    }

    @o0
    public static synchronized g c(Context context, androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        g gVar;
        synchronized (g.class) {
            try {
                if (f36147e == null) {
                    f36147e = new g(context, taskExecutor);
                }
                gVar = f36147e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @m1
    public static synchronized void f(@o0 g trackers) {
        synchronized (g.class) {
            f36147e = trackers;
        }
    }

    @o0
    public a a() {
        return this.f36148a;
    }

    @o0
    public b b() {
        return this.f36149b;
    }

    @o0
    public e d() {
        return this.f36150c;
    }

    @o0
    public f e() {
        return this.f36151d;
    }
}
