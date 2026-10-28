package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.k2;
import kotlin.x0;

/* compiled from: Pipe.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u00020\b*\u00020\u00062\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0082\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010&\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010)\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R$\u0010-\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u000fR\u0017\u0010\r\u001a\u00020\u00068G¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b.\u0010\u0011R\u0017\u00101\u001a\u00020\u00128G¢\u0006\f\n\u0004\b\u0019\u0010/\u001a\u0004\b0\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lokio/g0;", "", "", "maxBufferSize", "<init>", "(J)V", "Lokio/m0;", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "block", "f", "(Lokio/m0;Lld/l;)V", "sink", "e", "(Lokio/m0;)V", "a", "()Lokio/m0;", "Lokio/o0;", "b", "()Lokio/o0;", "d", "()V", "Lokio/m;", "Lokio/m;", "g", "()Lokio/m;", "buffer", "", "Z", "h", "()Z", "m", "(Z)V", "canceled", "c", "k", "o", "sinkClosed", "l", "p", "sourceClosed", "Lokio/m0;", "i", "n", "foldedSink", "q", "Lokio/o0;", "r", "source", "J", "j", "()J", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m buffer = new m();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean canceled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean sinkClosed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean sourceClosed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private m0 foldedSink;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 sink;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o0 source;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long maxBufferSize;

    /* compiled from: Pipe.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"okio/g0$a", "Lokio/m0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/k2;", "write", "(Lokio/m;J)V", "flush", "()V", "close", "Lokio/q0;", "timeout", "()Lokio/q0;", "b", "Lokio/q0;", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class a implements m0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q0 timeout = new q0();

        a() {
        }

        @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (g0.this.getBuffer()) {
                try {
                    if (g0.this.getSinkClosed()) {
                        return;
                    }
                    m0 foldedSink = g0.this.getFoldedSink();
                    if (foldedSink == null) {
                        if (g0.this.getSourceClosed() && g0.this.getBuffer().size() > 0) {
                            throw new IOException(ProtectedSandApp.s("Ἱ"));
                        }
                        g0.this.o(true);
                        m buffer = g0.this.getBuffer();
                        if (buffer == null) {
                            throw new NullPointerException(ProtectedSandApp.s("Ἲ"));
                        }
                        buffer.notifyAll();
                        foldedSink = null;
                    }
                    k2 k2Var = k2.f75408a;
                    if (foldedSink != null) {
                        g0 g0Var = g0.this;
                        q0 timeout = foldedSink.getTimeout();
                        q0 timeout2 = g0Var.q().getTimeout();
                        long timeoutNanos = timeout.getTimeoutNanos();
                        long a5 = q0.INSTANCE.a(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        timeout.i(a5, timeUnit);
                        if (!timeout.getHasDeadline()) {
                            if (timeout2.getHasDeadline()) {
                                timeout.e(timeout2.d());
                            }
                            try {
                                foldedSink.close();
                                timeout.i(timeoutNanos, timeUnit);
                                if (timeout2.getHasDeadline()) {
                                    timeout.a();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                                if (timeout2.getHasDeadline()) {
                                    timeout.a();
                                }
                                throw th;
                            }
                        }
                        long d5 = timeout.d();
                        if (timeout2.getHasDeadline()) {
                            timeout.e(Math.min(timeout.d(), timeout2.d()));
                        }
                        try {
                            foldedSink.close();
                            timeout.i(timeoutNanos, timeUnit);
                            if (timeout2.getHasDeadline()) {
                                timeout.e(d5);
                            }
                        } catch (Throwable th2) {
                            timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.getHasDeadline()) {
                                timeout.e(d5);
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // okio.m0, java.io.Flushable
        public void flush() {
            m0 foldedSink;
            synchronized (g0.this.getBuffer()) {
                try {
                    if (g0.this.getSinkClosed()) {
                        throw new IllegalStateException(ProtectedSandApp.s("Ἴ"));
                    }
                    if (g0.this.getCanceled()) {
                        throw new IOException(ProtectedSandApp.s("Ἳ"));
                    }
                    foldedSink = g0.this.getFoldedSink();
                    if (foldedSink == null) {
                        if (g0.this.getSourceClosed() && g0.this.getBuffer().size() > 0) {
                            throw new IOException(ProtectedSandApp.s("Ἱ"));
                        }
                        foldedSink = null;
                    }
                    k2 k2Var = k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (foldedSink != null) {
                g0 g0Var = g0.this;
                q0 timeout = foldedSink.getTimeout();
                q0 timeout2 = g0Var.q().getTimeout();
                long timeoutNanos = timeout.getTimeoutNanos();
                long a5 = q0.INSTANCE.a(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout.i(a5, timeUnit);
                if (!timeout.getHasDeadline()) {
                    if (timeout2.getHasDeadline()) {
                        timeout.e(timeout2.d());
                    }
                    try {
                        foldedSink.flush();
                        timeout.i(timeoutNanos, timeUnit);
                        if (timeout2.getHasDeadline()) {
                            timeout.a();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.a();
                        }
                        throw th2;
                    }
                }
                long d5 = timeout.d();
                if (timeout2.getHasDeadline()) {
                    timeout.e(Math.min(timeout.d(), timeout2.d()));
                }
                try {
                    foldedSink.flush();
                    timeout.i(timeoutNanos, timeUnit);
                    if (timeout2.getHasDeadline()) {
                        timeout.e(d5);
                    }
                } catch (Throwable th3) {
                    timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout2.getHasDeadline()) {
                        timeout.e(d5);
                    }
                    throw th3;
                }
            }
        }

        @Override // okio.m0
        @fg.l
        /* renamed from: timeout, reason: from getter */
        public q0 getTimeout() {
            return this.timeout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
        
            r1 = kotlin.k2.f75408a;
         */
        @Override // okio.m0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void write(@fg.l okio.m r13, long r14) {
            /*
                Method dump skipped, instructions count: 339
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.g0.a.write(okio.m, long):void");
        }
    }

    /* compiled from: Pipe.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"okio/g0$b", "Lokio/o0;", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "Lkotlin/k2;", "close", "()V", "Lokio/q0;", "timeout", "()Lokio/q0;", "b", "Lokio/q0;", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class b implements o0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q0 timeout = new q0();

        b() {
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (g0.this.getBuffer()) {
                g0.this.p(true);
                m buffer = g0.this.getBuffer();
                if (buffer == null) {
                    throw new NullPointerException(ProtectedSandApp.s("Ἶ"));
                }
                buffer.notifyAll();
                k2 k2Var = k2.f75408a;
            }
        }

        @Override // okio.o0
        @fg.l
        /* renamed from: timeout, reason: from getter */
        public q0 getTimeout() {
            return this.timeout;
        }

        @Override // okio.o0
        public long w3(@fg.l m sink, long byteCount) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("Ἷ"));
            synchronized (g0.this.getBuffer()) {
                try {
                    if (g0.this.getSourceClosed()) {
                        throw new IllegalStateException(ProtectedSandApp.s("ὁ"));
                    }
                    if (g0.this.getCanceled()) {
                        throw new IOException(ProtectedSandApp.s("ὀ"));
                    }
                    while (g0.this.getBuffer().size() == 0) {
                        if (g0.this.getSinkClosed()) {
                            return -1L;
                        }
                        this.timeout.k(g0.this.getBuffer());
                        if (g0.this.getCanceled()) {
                            throw new IOException(ProtectedSandApp.s("ὀ"));
                        }
                    }
                    long w32 = g0.this.getBuffer().w3(sink, byteCount);
                    m buffer = g0.this.getBuffer();
                    if (buffer == null) {
                        throw new NullPointerException(ProtectedSandApp.s("Ἶ"));
                    }
                    buffer.notifyAll();
                    return w32;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public g0(long j4) {
        this.maxBufferSize = j4;
        if (!(j4 >= 1)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ὂ"), j4).toString());
        }
        this.sink = new a();
        this.source = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(m0 m0Var, ld.l<? super m0, k2> lVar) {
        q0 timeout = m0Var.getTimeout();
        q0 timeout2 = this.sink.getTimeout();
        long timeoutNanos = timeout.getTimeoutNanos();
        long a5 = q0.INSTANCE.a(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.i(a5, timeUnit);
        if (!timeout.getHasDeadline()) {
            if (timeout2.getHasDeadline()) {
                timeout.e(timeout2.d());
            }
            try {
                lVar.invoke(m0Var);
                timeout.i(timeoutNanos, timeUnit);
                if (timeout2.getHasDeadline()) {
                    timeout.a();
                    return;
                }
                return;
            } catch (Throwable th) {
                timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.getHasDeadline()) {
                    timeout.a();
                }
                throw th;
            }
        }
        long d5 = timeout.d();
        if (timeout2.getHasDeadline()) {
            timeout.e(Math.min(timeout.d(), timeout2.d()));
        }
        try {
            lVar.invoke(m0Var);
            timeout.i(timeoutNanos, timeUnit);
            if (timeout2.getHasDeadline()) {
                timeout.e(d5);
            }
        } catch (Throwable th2) {
            timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.getHasDeadline()) {
                timeout.e(d5);
            }
            throw th2;
        }
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "sink", imports = {}))
    @kd.i(name = "-deprecated_sink")
    /* renamed from: a, reason: from getter */
    public final m0 getSink() {
        return this.sink;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "source", imports = {}))
    @kd.i(name = "-deprecated_source")
    /* renamed from: b, reason: from getter */
    public final o0 getSource() {
        return this.source;
    }

    public final void d() {
        synchronized (this.buffer) {
            this.canceled = true;
            this.buffer.d();
            m mVar = this.buffer;
            if (mVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("ὃ"));
            }
            mVar.notifyAll();
            k2 k2Var = k2.f75408a;
        }
    }

    public final void e(@fg.l m0 sink) throws IOException {
        boolean z4;
        m mVar;
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("ὄ"));
        while (true) {
            synchronized (this.buffer) {
                if (!(this.foldedSink == null)) {
                    throw new IllegalStateException(ProtectedSandApp.s("\u1f46"));
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new IOException(ProtectedSandApp.s("ὅ"));
                }
                if (this.buffer.t2()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    return;
                }
                z4 = this.sinkClosed;
                mVar = new m();
                m mVar2 = this.buffer;
                mVar.write(mVar2, mVar2.size());
                m mVar3 = this.buffer;
                if (mVar3 == null) {
                    throw new NullPointerException(ProtectedSandApp.s("ὃ"));
                }
                mVar3.notifyAll();
                k2 k2Var = k2.f75408a;
            }
            try {
                sink.write(mVar, mVar.size());
                if (z4) {
                    sink.close();
                } else {
                    sink.flush();
                }
            } catch (Throwable th) {
                synchronized (this.buffer) {
                    try {
                        this.sourceClosed = true;
                        m mVar4 = this.buffer;
                        if (mVar4 == null) {
                            throw new NullPointerException(ProtectedSandApp.s("ὃ"));
                        }
                        mVar4.notifyAll();
                        k2 k2Var2 = k2.f75408a;
                        throw th;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    @fg.l
    /* renamed from: g, reason: from getter */
    public final m getBuffer() {
        return this.buffer;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    @fg.m
    /* renamed from: i, reason: from getter */
    public final m0 getFoldedSink() {
        return this.foldedSink;
    }

    /* renamed from: j, reason: from getter */
    public final long getMaxBufferSize() {
        return this.maxBufferSize;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getSinkClosed() {
        return this.sinkClosed;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getSourceClosed() {
        return this.sourceClosed;
    }

    public final void m(boolean z4) {
        this.canceled = z4;
    }

    public final void n(@fg.m m0 m0Var) {
        this.foldedSink = m0Var;
    }

    public final void o(boolean z4) {
        this.sinkClosed = z4;
    }

    public final void p(boolean z4) {
        this.sourceClosed = z4;
    }

    @fg.l
    @kd.i(name = "sink")
    public final m0 q() {
        return this.sink;
    }

    @fg.l
    @kd.i(name = "source")
    public final o0 r() {
        return this.source;
    }
}
