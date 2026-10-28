package org.apache.commons.lang3.time;

import androidx.compose.material3.z3;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: StopWatch.java */
/* loaded from: classes6.dex */
public class m {

    /* renamed from: g, reason: collision with root package name */
    private static final long f86371g = 1000000;

    /* renamed from: a, reason: collision with root package name */
    private final String f86372a;

    /* renamed from: b, reason: collision with root package name */
    private c f86373b;

    /* renamed from: c, reason: collision with root package name */
    private b f86374c;

    /* renamed from: d, reason: collision with root package name */
    private long f86375d;

    /* renamed from: e, reason: collision with root package name */
    private long f86376e;

    /* renamed from: f, reason: collision with root package name */
    private long f86377f;

    /* compiled from: StopWatch.java */
    private enum b {
        SPLIT,
        UNSPLIT
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StopWatch.java */
    private static abstract class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c RUNNING;
        public static final c STOPPED;
        public static final c SUSPENDED;
        public static final c UNSTARTED;

        /* compiled from: StopWatch.java */
        enum a extends c {
            a(String str, int i4) {
                super(str, i4);
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isStarted() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isStopped() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isSuspended() {
                return false;
            }
        }

        /* compiled from: StopWatch.java */
        enum b extends c {
            b(String str, int i4) {
                super(str, i4);
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isStarted() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isStopped() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isSuspended() {
                return false;
            }
        }

        /* compiled from: StopWatch.java */
        /* renamed from: org.apache.commons.lang3.time.m$c$c, reason: collision with other inner class name */
        enum C1341c extends c {
            C1341c(String str, int i4) {
                super(str, i4);
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isStarted() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isStopped() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isSuspended() {
                return true;
            }
        }

        /* compiled from: StopWatch.java */
        enum d extends c {
            d(String str, int i4) {
                super(str, i4);
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isStarted() {
                return false;
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isStopped() {
                return true;
            }

            @Override // org.apache.commons.lang3.time.m.c
            boolean isSuspended() {
                return false;
            }
        }

        static {
            a aVar = new a("RUNNING", 0);
            RUNNING = aVar;
            b bVar = new b("STOPPED", 1);
            STOPPED = bVar;
            C1341c c1341c = new C1341c("SUSPENDED", 2);
            SUSPENDED = c1341c;
            d dVar = new d("UNSTARTED", 3);
            UNSTARTED = dVar;
            $VALUES = new c[]{aVar, bVar, c1341c, dVar};
        }

        private c(String str, int i4) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        abstract boolean isStarted();

        abstract boolean isStopped();

        abstract boolean isSuspended();
    }

    public m() {
        this(null);
    }

    public static m a() {
        return new m(null);
    }

    public static m b() {
        m mVar = new m(null);
        mVar.r();
        return mVar;
    }

    public String c() {
        return f.d(h());
    }

    public String d() {
        return f.d(j());
    }

    public String e() {
        return this.f86372a;
    }

    public long f() {
        long j4;
        long j5;
        c cVar = this.f86373b;
        if (cVar == c.STOPPED || cVar == c.SUSPENDED) {
            j4 = this.f86377f;
            j5 = this.f86375d;
        } else {
            if (cVar == c.UNSTARTED) {
                return 0L;
            }
            if (cVar != c.RUNNING) {
                throw new RuntimeException("Illegal running state has occurred.");
            }
            j4 = System.nanoTime();
            j5 = this.f86375d;
        }
        return j4 - j5;
    }

    public long g() {
        if (this.f86374c == b.SPLIT) {
            return this.f86377f - this.f86375d;
        }
        throw new IllegalStateException("Stopwatch must be split to get the split time. ");
    }

    public long h() {
        return g() / 1000000;
    }

    public long i() {
        if (this.f86373b != c.UNSTARTED) {
            return this.f86376e;
        }
        throw new IllegalStateException("Stopwatch has not been started");
    }

    public long j() {
        return f() / 1000000;
    }

    public long k(TimeUnit timeUnit) {
        return timeUnit.convert(f(), TimeUnit.NANOSECONDS);
    }

    public boolean l() {
        return this.f86373b.isStarted();
    }

    public boolean m() {
        return this.f86373b.isStopped();
    }

    public boolean n() {
        return this.f86373b.isSuspended();
    }

    public void o() {
        this.f86373b = c.UNSTARTED;
        this.f86374c = b.UNSPLIT;
    }

    public void p() {
        if (this.f86373b != c.SUSPENDED) {
            throw new IllegalStateException("Stopwatch must be suspended to resume. ");
        }
        this.f86375d = (System.nanoTime() - this.f86377f) + this.f86375d;
        this.f86373b = c.RUNNING;
    }

    public void q() {
        if (this.f86373b != c.RUNNING) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        this.f86377f = System.nanoTime();
        this.f86374c = b.SPLIT;
    }

    public void r() {
        c cVar = this.f86373b;
        if (cVar == c.STOPPED) {
            throw new IllegalStateException("Stopwatch must be reset before being restarted. ");
        }
        if (cVar != c.UNSTARTED) {
            throw new IllegalStateException("Stopwatch already started. ");
        }
        this.f86375d = System.nanoTime();
        this.f86376e = System.currentTimeMillis();
        this.f86373b = c.RUNNING;
    }

    public void s() {
        c cVar = this.f86373b;
        c cVar2 = c.RUNNING;
        if (cVar != cVar2 && cVar != c.SUSPENDED) {
            throw new IllegalStateException("Stopwatch is not running. ");
        }
        if (cVar == cVar2) {
            this.f86377f = System.nanoTime();
        }
        this.f86373b = c.STOPPED;
    }

    public void t() {
        if (this.f86373b != c.RUNNING) {
            throw new IllegalStateException("Stopwatch must be running to suspend. ");
        }
        this.f86377f = System.nanoTime();
        this.f86373b = c.SUSPENDED;
    }

    public String toString() {
        String objects = Objects.toString(this.f86372a, "");
        String d5 = d();
        return objects.isEmpty() ? d5 : z3.a(objects, " ", d5);
    }

    public String u() {
        String objects = Objects.toString(this.f86372a, "");
        String c5 = c();
        return objects.isEmpty() ? c5 : z3.a(objects, " ", c5);
    }

    public void v() {
        if (this.f86374c != b.SPLIT) {
            throw new IllegalStateException("Stopwatch has not been split. ");
        }
        this.f86374c = b.UNSPLIT;
    }

    public m(String str) {
        this.f86373b = c.UNSTARTED;
        this.f86374c = b.UNSPLIT;
        this.f86372a = str;
    }
}
