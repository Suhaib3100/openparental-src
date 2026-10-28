package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.m2;

/* compiled from: AsyncTimeout.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ'\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0001J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"Lokio/k;", "Lokio/q0;", "", "now", "y", "Lkotlin/m2;", "v", "", "w", "B", "Lokio/m0;", "sink", "z", "Lokio/o0;", "source", "A", "T", "Lkotlin/Function0;", "block", "C", "(Lq3/a;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "q", "x", "f", "Z", "inQueue", "g", "Lokio/k;", "next", "h", "J", "timeoutAt", "<init>", "()V", "m", "a", "b", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public class k extends q0 {

    /* renamed from: i, reason: collision with root package name */
    private static final int f31656i = 65536;

    /* renamed from: j, reason: collision with root package name */
    private static final long f31657j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f31658k;

    /* renamed from: l, reason: collision with root package name */
    private static k f31659l;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean inQueue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private k next;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lokio/k$a;", "", "Lokio/k;", "node", "", "timeoutNanos", "", "hasDeadline", "Lkotlin/m2;", "e", "d", "c", "()Lokio/k;", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "head", "Lokio/k;", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okio.k$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(k node) {
            synchronized (k.class) {
                for (k kVar = k.f31659l; kVar != null; kVar = kVar.next) {
                    if (kVar.next == node) {
                        kVar.next = node.next;
                        node.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(k kVar, long j5, boolean z5) {
            synchronized (k.class) {
                if (k.f31659l == null) {
                    k.f31659l = new k();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (j5 != 0 && z5) {
                    kVar.timeoutAt = Math.min(j5, kVar.d() - nanoTime) + nanoTime;
                } else if (j5 != 0) {
                    kVar.timeoutAt = j5 + nanoTime;
                } else {
                    if (!z5) {
                        throw new AssertionError();
                    }
                    kVar.timeoutAt = kVar.d();
                }
                long r5 = k.r(kVar, nanoTime);
                k kVar2 = k.f31659l;
                kotlin.jvm.internal.l0.m(kVar2);
                while (kVar2.next != null) {
                    k kVar3 = kVar2.next;
                    kotlin.jvm.internal.l0.m(kVar3);
                    if (r5 < k.r(kVar3, nanoTime)) {
                        break;
                    }
                    kVar2 = kVar2.next;
                    kotlin.jvm.internal.l0.m(kVar2);
                }
                kVar.next = kVar2.next;
                kVar2.next = kVar;
                if (kVar2 == k.f31659l) {
                    k.class.notify();
                }
                m2 m2Var = m2.f23662a;
            }
        }

        @d5.e
        public final k c() throws InterruptedException {
            k kVar = k.f31659l;
            kotlin.jvm.internal.l0.m(kVar);
            k kVar2 = kVar.next;
            if (kVar2 == null) {
                long nanoTime = System.nanoTime();
                k.class.wait(k.f31657j);
                k kVar3 = k.f31659l;
                kotlin.jvm.internal.l0.m(kVar3);
                if (kVar3.next != null || System.nanoTime() - nanoTime < k.f31658k) {
                    return null;
                }
                return k.f31659l;
            }
            long r5 = k.r(kVar2, System.nanoTime());
            if (r5 > 0) {
                long j5 = r5 / 1000000;
                k.class.wait(j5, (int) (r5 - (1000000 * j5)));
                return null;
            }
            k kVar4 = k.f31659l;
            kotlin.jvm.internal.l0.m(kVar4);
            kVar4.next = kVar2.next;
            kVar2.next = null;
            return kVar2;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lokio/k$b;", "Ljava/lang/Thread;", "Lkotlin/m2;", "run", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    private static final class b extends Thread {
        public b() {
            super(ProtectedSandApp.s("桋"));
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            k c6;
            while (true) {
                try {
                    synchronized (k.class) {
                        c6 = k.INSTANCE.c();
                        if (c6 == k.f31659l) {
                            k.f31659l = null;
                            return;
                        }
                        m2 m2Var = m2.f23662a;
                    }
                    if (c6 != null) {
                        c6.B();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"okio/k$c", "Lokio/m0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "t0", "flush", "close", "Lokio/k;", "a", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class c implements m0 {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ m0 f31665p;

        c(m0 m0Var) {
            this.f31665p = m0Var;
        }

        @d5.d
        /* renamed from: a, reason: from getter */
        public k getF31664o() {
            return k.this;
        }

        @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            k kVar = k.this;
            kVar.v();
            try {
                this.f31665p.close();
                m2 m2Var = m2.f23662a;
                if (kVar.w()) {
                    throw kVar.q(null);
                }
            } catch (IOException e6) {
                if (!kVar.w()) {
                    throw e6;
                }
                throw kVar.q(e6);
            } finally {
                kVar.w();
            }
        }

        @Override // okio.m0, java.io.Flushable
        public void flush() {
            k kVar = k.this;
            kVar.v();
            try {
                this.f31665p.flush();
                m2 m2Var = m2.f23662a;
                if (kVar.w()) {
                    throw kVar.q(null);
                }
            } catch (IOException e6) {
                if (!kVar.w()) {
                    throw e6;
                }
                throw kVar.q(e6);
            } finally {
                kVar.w();
            }
        }

        @Override // okio.m0
        public q0 h() {
            return k.this;
        }

        @Override // okio.m0
        public void t0(@d5.d m mVar, long j5) {
            kotlin.jvm.internal.l0.p(mVar, ProtectedSandApp.s("鋿"));
            j.e(mVar.size(), 0L, j5);
            while (true) {
                long j6 = 0;
                if (j5 <= 0) {
                    return;
                }
                j0 j0Var = mVar.head;
                kotlin.jvm.internal.l0.m(j0Var);
                while (true) {
                    if (j6 >= 65536) {
                        break;
                    }
                    j6 += j0Var.limit - j0Var.pos;
                    if (j6 >= j5) {
                        j6 = j5;
                        break;
                    } else {
                        j0Var = j0Var.next;
                        kotlin.jvm.internal.l0.m(j0Var);
                    }
                }
                k kVar = k.this;
                kVar.v();
                try {
                    this.f31665p.t0(mVar, j6);
                    m2 m2Var = m2.f23662a;
                    if (kVar.w()) {
                        throw kVar.q(null);
                    }
                    j5 -= j6;
                } catch (IOException e6) {
                    if (!kVar.w()) {
                        throw e6;
                    }
                    throw kVar.q(e6);
                } finally {
                    kVar.w();
                }
            }
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("錀") + this.f31665p + ')';
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, d2 = {"okio/k$d", "Lokio/o0;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lkotlin/m2;", "close", "Lokio/k;", "a", "", "toString", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class d implements o0 {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ o0 f31667p;

        d(o0 o0Var) {
            this.f31667p = o0Var;
        }

        @Override // okio.o0
        public long X0(@d5.d m sink, long byteCount) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("錁"));
            k kVar = k.this;
            kVar.v();
            try {
                long X0 = this.f31667p.X0(sink, byteCount);
                if (kVar.w()) {
                    throw kVar.q(null);
                }
                return X0;
            } catch (IOException e6) {
                if (kVar.w()) {
                    throw kVar.q(e6);
                }
                throw e6;
            } finally {
                kVar.w();
            }
        }

        @d5.d
        /* renamed from: a, reason: from getter */
        public k getF31666o() {
            return k.this;
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            k kVar = k.this;
            kVar.v();
            try {
                this.f31667p.close();
                m2 m2Var = m2.f23662a;
                if (kVar.w()) {
                    throw kVar.q(null);
                }
            } catch (IOException e6) {
                if (!kVar.w()) {
                    throw e6;
                }
                throw kVar.q(e6);
            } finally {
                kVar.w();
            }
        }

        @Override // okio.o0
        public q0 h() {
            return k.this;
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("錂") + this.f31667p + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f31657j = millis;
        f31658k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long r(k kVar, long j5) {
        return kVar.timeoutAt - j5;
    }

    private final long y(long now) {
        return this.timeoutAt - now;
    }

    @d5.d
    public final o0 A(@d5.d o0 source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("醴"));
        return new d(source);
    }

    protected void B() {
    }

    public final <T> T C(@d5.d q3.a<? extends T> block) {
        kotlin.jvm.internal.l0.p(block, ProtectedSandApp.s("醵"));
        v();
        try {
            T n5 = block.n();
            if (w()) {
                throw q(null);
            }
            return n5;
        } catch (IOException e6) {
            if (w()) {
                throw q(e6);
            }
            throw e6;
        } finally {
            w();
        }
    }

    @PublishedApi
    @d5.d
    public final IOException q(@d5.e IOException cause) {
        return x(cause);
    }

    public final void v() {
        if (!(!this.inQueue)) {
            throw new IllegalStateException(ProtectedSandApp.s("醶").toString());
        }
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            this.inQueue = true;
            INSTANCE.e(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean w() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return INSTANCE.d(this);
    }

    @d5.d
    protected IOException x(@d5.e IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(ProtectedSandApp.s("醷"));
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    @d5.d
    public final m0 z(@d5.d m0 sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("醸"));
        return new c(sink);
    }
}
