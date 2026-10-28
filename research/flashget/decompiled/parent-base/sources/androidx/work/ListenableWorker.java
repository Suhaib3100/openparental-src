package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.c1;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class ListenableWorker {

    /* renamed from: b, reason: collision with root package name */
    @o0
    private Context f35894b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private WorkerParameters f35895c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f35896d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35897e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f35898f;

    public static abstract class a {

        @c1({c1.a.LIBRARY_GROUP})
        /* renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0638a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final f f35899a;

            public C0638a() {
                this(f.f35969c);
            }

            @Override // androidx.work.ListenableWorker.a
            @o0
            public f c() {
                return this.f35899a;
            }

            public boolean equals(Object o4) {
                if (this == o4) {
                    return true;
                }
                if (o4 == null || C0638a.class != o4.getClass()) {
                    return false;
                }
                return this.f35899a.equals(((C0638a) o4).f35899a);
            }

            public int hashCode() {
                return this.f35899a.hashCode() + (C0638a.class.getName().hashCode() * 31);
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f35899a + '}';
            }

            public C0638a(@o0 f outputData) {
                this.f35899a = outputData;
            }
        }

        @c1({c1.a.LIBRARY_GROUP})
        public static final class b extends a {
            @Override // androidx.work.ListenableWorker.a
            @o0
            public f c() {
                return f.f35969c;
            }

            public boolean equals(Object o4) {
                if (this == o4) {
                    return true;
                }
                return o4 != null && b.class == o4.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        @c1({c1.a.LIBRARY_GROUP})
        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final f f35900a;

            public c() {
                this(f.f35969c);
            }

            @Override // androidx.work.ListenableWorker.a
            @o0
            public f c() {
                return this.f35900a;
            }

            public boolean equals(Object o4) {
                if (this == o4) {
                    return true;
                }
                if (o4 == null || c.class != o4.getClass()) {
                    return false;
                }
                return this.f35900a.equals(((c) o4).f35900a);
            }

            public int hashCode() {
                return this.f35900a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public String toString() {
                return "Success {mOutputData=" + this.f35900a + '}';
            }

            public c(@o0 f outputData) {
                this.f35900a = outputData;
            }
        }

        @c1({c1.a.LIBRARY_GROUP})
        a() {
        }

        @o0
        public static a a() {
            return new C0638a();
        }

        @o0
        public static a b(@o0 f outputData) {
            return new C0638a(outputData);
        }

        @o0
        public static a d() {
            return new b();
        }

        @o0
        public static a e() {
            return new c();
        }

        @o0
        public static a f(@o0 f outputData) {
            return new c(outputData);
        }

        @o0
        public abstract f c();
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@o0 Context appContext, @o0 WorkerParameters workerParams) {
        if (appContext == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParams == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f35894b = appContext;
        this.f35895c = workerParams;
    }

    @o0
    public final Context a() {
        return this.f35894b;
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public Executor c() {
        return this.f35895c.a();
    }

    @o0
    public ListenableFuture<l> d() {
        androidx.work.impl.utils.futures.c u4 = androidx.work.impl.utils.futures.c.u();
        u4.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return u4;
    }

    @o0
    public final UUID e() {
        return this.f35895c.c();
    }

    @o0
    public final f g() {
        return this.f35895c.d();
    }

    @q0
    @x0(28)
    public final Network h() {
        return this.f35895c.e();
    }

    @androidx.annotation.g0(from = 0)
    public final int i() {
        return this.f35895c.g();
    }

    @o0
    public final Set<String> j() {
        return this.f35895c.i();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public androidx.work.impl.utils.taskexecutor.a k() {
        return this.f35895c.j();
    }

    @o0
    @x0(24)
    public final List<String> l() {
        return this.f35895c.k();
    }

    @o0
    @x0(24)
    public final List<Uri> m() {
        return this.f35895c.l();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public j0 n() {
        return this.f35895c.m();
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean o() {
        return this.f35898f;
    }

    public final boolean p() {
        return this.f35896d;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final boolean q() {
        return this.f35897e;
    }

    public void r() {
    }

    @o0
    public final ListenableFuture<Void> s(@o0 l foregroundInfo) {
        this.f35898f = true;
        return this.f35895c.b().a(this.f35894b, this.f35895c.c(), foregroundInfo);
    }

    @o0
    public ListenableFuture<Void> t(@o0 f data) {
        return this.f35895c.f().a(this.f35894b, this.f35895c.c(), data);
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void u(boolean runInForeground) {
        this.f35898f = runInForeground;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public final void v() {
        this.f35897e = true;
    }

    @o0
    @l0
    public abstract ListenableFuture<a> w();

    @c1({c1.a.LIBRARY_GROUP})
    public final void x() {
        this.f35896d = true;
        r();
    }
}
