package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.w0;

/* compiled from: AsyncTimeout.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001f\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006,"}, d2 = {"Lokio/k;", "Lokio/q0;", "<init>", "()V", "", "now", "y", "(J)J", "Lkotlin/k2;", "v", "", "w", "()Z", "B", "Lokio/m0;", "sink", "z", "(Lokio/m0;)Lokio/m0;", "Lokio/o0;", "source", "A", "(Lokio/o0;)Lokio/o0;", "T", "Lkotlin/Function0;", "block", "C", "(Lld/a;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "q", "(Ljava/io/IOException;)Ljava/io/IOException;", "x", "f", "Z", "inQueue", "g", "Lokio/k;", "next", "h", "J", "timeoutAt", "m", "a", "b", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class k extends q0 {

    /* renamed from: i, reason: collision with root package name */
    private static final int f85212i = 65536;

    /* renamed from: j, reason: collision with root package name */
    private static final long f85213j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f85214k;

    /* renamed from: l, reason: collision with root package name */
    private static k f85215l;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean inQueue;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private k next;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokio/k$a;", "", "<init>", "()V", "Lokio/k;", "node", "", "timeoutNanos", "", "hasDeadline", "Lkotlin/k2;", "e", "(Lokio/k;JZ)V", "d", "(Lokio/k;)Z", "c", "()Lokio/k;", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "head", "Lokio/k;", "okio"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okio.k$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(k node) {
            synchronized (k.class) {
                for (k kVar = k.f85215l; kVar != null; kVar = kVar.next) {
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
        public final void e(k node, long timeoutNanos, boolean hasDeadline) {
            synchronized (k.class) {
                try {
                    if (k.f85215l == null) {
                        k.f85215l = new k();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (timeoutNanos != 0 && hasDeadline) {
                        node.timeoutAt = Math.min(timeoutNanos, node.d() - nanoTime) + nanoTime;
                    } else if (timeoutNanos != 0) {
                        node.timeoutAt = timeoutNanos + nanoTime;
                    } else {
                        if (!hasDeadline) {
                            throw new AssertionError();
                        }
                        node.timeoutAt = node.d();
                    }
                    long r4 = k.r(node, nanoTime);
                    k kVar = k.f85215l;
                    kotlin.jvm.internal.l0.m(kVar);
                    while (kVar.next != null) {
                        k kVar2 = kVar.next;
                        kotlin.jvm.internal.l0.m(kVar2);
                        if (r4 < k.r(kVar2, nanoTime)) {
                            break;
                        }
                        kVar = kVar.next;
                        kotlin.jvm.internal.l0.m(kVar);
                    }
                    node.next = kVar.next;
                    kVar.next = node;
                    if (kVar == k.f85215l) {
                        k.class.notify();
                    }
                    k2 k2Var = k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @fg.m
        public final k c() throws InterruptedException {
            k kVar = k.f85215l;
            kotlin.jvm.internal.l0.m(kVar);
            k kVar2 = kVar.next;
            if (kVar2 == null) {
                long nanoTime = System.nanoTime();
                k.class.wait(k.f85213j);
                k kVar3 = k.f85215l;
                kotlin.jvm.internal.l0.m(kVar3);
                if (kVar3.next != null || System.nanoTime() - nanoTime < k.f85214k) {
                    return null;
                }
                return k.f85215l;
            }
            long r4 = k.r(kVar2, System.nanoTime());
            if (r4 > 0) {
                long j4 = r4 / 1000000;
                k.class.wait(j4, (int) (r4 - (1000000 * j4)));
                return null;
            }
            k kVar4 = k.f85215l;
            kotlin.jvm.internal.l0.m(kVar4);
            kVar4.next = kVar2.next;
            kVar2.next = null;
            return kVar2;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lokio/k$b;", "Ljava/lang/Thread;", "<init>", "()V", "Lkotlin/k2;", "run", "okio"}, k = 1, mv = {1, 4, 0})
    private static final class b extends Thread {
        public b() {
            super(ProtectedSandApp.s("ύ"));
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            k c5;
            while (true) {
                try {
                    synchronized (k.class) {
                        c5 = k.INSTANCE.c();
                        if (c5 == k.f85215l) {
                            k.f85215l = null;
                            return;
                        }
                        k2 k2Var = k2.f75408a;
                    }
                    if (c5 != null) {
                        c5.B();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"okio/k$c", "Lokio/m0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/k2;", "write", "(Lokio/m;J)V", "flush", "()V", "close", "Lokio/k;", "a", "()Lokio/k;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class c implements m0 {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m0 f85221c;

        c(m0 m0Var) {
            this.f85221c = m0Var;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public k getF85220b() {
            return k.this;
        }

        @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            k kVar = k.this;
            kVar.v();
            try {
                this.f85221c.close();
                k2 k2Var = k2.f75408a;
                if (kVar.w()) {
                    throw kVar.x(null);
                }
            } catch (IOException e4) {
                if (!kVar.w()) {
                    throw e4;
                }
                throw kVar.x(e4);
            } finally {
                kVar.w();
            }
        }

        @Override // okio.m0, java.io.Flushable
        public void flush() {
            k kVar = k.this;
            kVar.v();
            try {
                this.f85221c.flush();
                k2 k2Var = k2.f75408a;
                if (kVar.w()) {
                    throw kVar.x(null);
                }
            } catch (IOException e4) {
                if (!kVar.w()) {
                    throw e4;
                }
                throw kVar.x(e4);
            } finally {
                kVar.w();
            }
        }

        @Override // okio.m0
        /* renamed from: timeout */
        public q0 getTimeout() {
            return k.this;
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("ὼ") + this.f85221c + ')';
        }

        @Override // okio.m0
        public void write(@fg.l m source, long byteCount) {
            kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("ώ"));
            j.e(source.size(), 0L, byteCount);
            while (true) {
                long j4 = 0;
                if (byteCount <= 0) {
                    return;
                }
                j0 j0Var = source.head;
                kotlin.jvm.internal.l0.m(j0Var);
                while (true) {
                    if (j4 >= 65536) {
                        break;
                    }
                    j4 += j0Var.limit - j0Var.pos;
                    if (j4 >= byteCount) {
                        j4 = byteCount;
                        break;
                    } else {
                        j0Var = j0Var.next;
                        kotlin.jvm.internal.l0.m(j0Var);
                    }
                }
                k kVar = k.this;
                kVar.v();
                try {
                    this.f85221c.write(source, j4);
                    k2 k2Var = k2.f75408a;
                    if (kVar.w()) {
                        throw kVar.x(null);
                    }
                    byteCount -= j4;
                } catch (IOException e4) {
                    if (!kVar.w()) {
                        throw e4;
                    }
                    throw kVar.x(e4);
                } finally {
                    kVar.w();
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"okio/k$d", "Lokio/o0;", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "Lkotlin/k2;", "close", "()V", "Lokio/k;", "a", "()Lokio/k;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class d implements o0 {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0 f85223c;

        d(o0 o0Var) {
            this.f85223c = o0Var;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public k getF85222b() {
            return k.this;
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            k kVar = k.this;
            kVar.v();
            try {
                this.f85223c.close();
                k2 k2Var = k2.f75408a;
                if (kVar.w()) {
                    throw kVar.x(null);
                }
            } catch (IOException e4) {
                if (!kVar.w()) {
                    throw e4;
                }
                throw kVar.x(e4);
            } finally {
                kVar.w();
            }
        }

        @Override // okio.o0
        /* renamed from: timeout */
        public q0 getTimeout() {
            return k.this;
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("\u1f7e") + this.f85223c + ')';
        }

        @Override // okio.o0
        public long w3(@fg.l m sink, long byteCount) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("\u1f7f"));
            k kVar = k.this;
            kVar.v();
            try {
                long w32 = this.f85223c.w3(sink, byteCount);
                if (kVar.w()) {
                    throw kVar.x(null);
                }
                return w32;
            } catch (IOException e4) {
                if (kVar.w()) {
                    throw kVar.x(e4);
                }
                throw e4;
            } finally {
                kVar.w();
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f85213j = millis;
        f85214k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long r(k kVar, long j4) {
        return kVar.timeoutAt - j4;
    }

    private final long y(long now) {
        return this.timeoutAt - now;
    }

    @fg.l
    public final o0 A(@fg.l o0 source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("ᵙ"));
        return new d(source);
    }

    protected void B() {
    }

    public final <T> T C(@fg.l ld.a<? extends T> block) {
        kotlin.jvm.internal.l0.p(block, ProtectedSandApp.s("ᵚ"));
        v();
        try {
            T invoke = block.invoke();
            if (w()) {
                throw x(null);
            }
            return invoke;
        } catch (IOException e4) {
            if (w()) {
                throw x(e4);
            }
            throw e4;
        } finally {
            w();
        }
    }

    @fg.l
    @w0
    public final IOException q(@fg.m IOException cause) {
        return x(cause);
    }

    public final void v() {
        if (this.inQueue) {
            throw new IllegalStateException(ProtectedSandApp.s("ᵛ"));
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

    @fg.l
    protected IOException x(@fg.m IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(ProtectedSandApp.s("ᵜ"));
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    @fg.l
    public final m0 z(@fg.l m0 sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("ᵝ"));
        return new c(sink);
    }
}
