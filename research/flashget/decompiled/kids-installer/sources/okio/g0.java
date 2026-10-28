package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.m2;

/* compiled from: Pipe.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020,¢\u0006\u0004\b1\u00102J&\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0082\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0004R\u001a\u0010\u0014\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010\"\u001a\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR$\u0010'\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000bR\u0017\u0010+\u001a\u00020\f8G¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010\u000eR\u001a\u00100\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lokio/g0;", "", "Lokio/m0;", "Lkotlin/Function1;", "Lkotlin/m2;", "Lkotlin/u;", "block", "f", "sink", "e", "a", "()Lokio/m0;", "Lokio/o0;", "b", "()Lokio/o0;", "d", "Lokio/m;", "Lokio/m;", "g", "()Lokio/m;", "buffer", "", "Z", "h", "()Z", "m", "(Z)V", "canceled", "c", "k", "o", "sinkClosed", "l", "p", "sourceClosed", "Lokio/m0;", "i", "n", "(Lokio/m0;)V", "foldedSink", "q", "Lokio/o0;", "r", "source", "", "J", "j", "()J", "maxBufferSize", "<init>", "(J)V", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final m buffer = new m();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean canceled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean sinkClosed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean sourceClosed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private m0 foldedSink;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final m0 sink;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final o0 source;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long maxBufferSize;

    /* compiled from: Pipe.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"okio/g0$a", "Lokio/m0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "t0", "flush", "close", "Lokio/q0;", "h", "o", "Lokio/q0;", "timeout", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class a implements m0 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final q0 timeout = new q0();

        a() {
        }

        @Override // okio.m0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (g0.this.getBuffer()) {
                if (g0.this.getSinkClosed()) {
                    return;
                }
                m0 foldedSink = g0.this.getFoldedSink();
                if (foldedSink == null) {
                    if (g0.this.getSourceClosed() && g0.this.getBuffer().size() > 0) {
                        throw new IOException(ProtectedSandApp.s("銠"));
                    }
                    g0.this.o(true);
                    m buffer = g0.this.getBuffer();
                    if (buffer == null) {
                        throw new NullPointerException(ProtectedSandApp.s("銡"));
                    }
                    buffer.notifyAll();
                    foldedSink = null;
                }
                m2 m2Var = m2.f23662a;
                if (foldedSink != null) {
                    g0 g0Var = g0.this;
                    q0 timeout = foldedSink.getTimeout();
                    q0 timeout2 = g0Var.q().getTimeout();
                    long timeoutNanos = timeout.getTimeoutNanos();
                    long a6 = q0.INSTANCE.a(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.i(a6, timeUnit);
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
                    long d6 = timeout.d();
                    if (timeout2.getHasDeadline()) {
                        timeout.e(Math.min(timeout.d(), timeout2.d()));
                    }
                    try {
                        foldedSink.close();
                        timeout.i(timeoutNanos, timeUnit);
                        if (timeout2.getHasDeadline()) {
                            timeout.e(d6);
                        }
                    } catch (Throwable th2) {
                        timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.e(d6);
                        }
                        throw th2;
                    }
                }
            }
        }

        @Override // okio.m0, java.io.Flushable
        public void flush() {
            m0 foldedSink;
            synchronized (g0.this.getBuffer()) {
                if (!(!g0.this.getSinkClosed())) {
                    throw new IllegalStateException(ProtectedSandApp.s("銤").toString());
                }
                if (g0.this.getCanceled()) {
                    throw new IOException(ProtectedSandApp.s("銣"));
                }
                foldedSink = g0.this.getFoldedSink();
                if (foldedSink == null) {
                    if (g0.this.getSourceClosed() && g0.this.getBuffer().size() > 0) {
                        throw new IOException(ProtectedSandApp.s("銢"));
                    }
                    foldedSink = null;
                }
                m2 m2Var = m2.f23662a;
            }
            if (foldedSink != null) {
                g0 g0Var = g0.this;
                q0 timeout = foldedSink.getTimeout();
                q0 timeout2 = g0Var.q().getTimeout();
                long timeoutNanos = timeout.getTimeoutNanos();
                long a6 = q0.INSTANCE.a(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout.i(a6, timeUnit);
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
                    } catch (Throwable th) {
                        timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.getHasDeadline()) {
                            timeout.a();
                        }
                        throw th;
                    }
                }
                long d6 = timeout.d();
                if (timeout2.getHasDeadline()) {
                    timeout.e(Math.min(timeout.d(), timeout2.d()));
                }
                try {
                    foldedSink.flush();
                    timeout.i(timeoutNanos, timeUnit);
                    if (timeout2.getHasDeadline()) {
                        timeout.e(d6);
                    }
                } catch (Throwable th2) {
                    timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout2.getHasDeadline()) {
                        timeout.e(d6);
                    }
                    throw th2;
                }
            }
        }

        @Override // okio.m0
        @d5.d
        /* renamed from: h, reason: from getter */
        public q0 getTimeout() {
            return this.timeout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
        
            r1 = kotlin.m2.f23662a;
         */
        @Override // okio.m0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void t0(@d5.d okio.m r13, long r14) {
            /*
                Method dump skipped, instructions count: 343
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.g0.a.t0(okio.m, long):void");
        }
    }

    /* compiled from: Pipe.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"okio/g0$b", "Lokio/o0;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lkotlin/m2;", "close", "Lokio/q0;", "h", "o", "Lokio/q0;", "timeout", "okio"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class b implements o0 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final q0 timeout = new q0();

        b() {
        }

        @Override // okio.o0
        public long X0(@d5.d m sink, long byteCount) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("銫"));
            synchronized (g0.this.getBuffer()) {
                if (!(!g0.this.getSourceClosed())) {
                    throw new IllegalStateException(ProtectedSandApp.s("銯").toString());
                }
                if (g0.this.getCanceled()) {
                    throw new IOException(ProtectedSandApp.s("銮"));
                }
                while (g0.this.getBuffer().size() == 0) {
                    if (g0.this.getSinkClosed()) {
                        return -1L;
                    }
                    this.timeout.k(g0.this.getBuffer());
                    if (g0.this.getCanceled()) {
                        throw new IOException(ProtectedSandApp.s("銬"));
                    }
                }
                long X0 = g0.this.getBuffer().X0(sink, byteCount);
                m buffer = g0.this.getBuffer();
                if (buffer == null) {
                    throw new NullPointerException(ProtectedSandApp.s("銭"));
                }
                buffer.notifyAll();
                return X0;
            }
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (g0.this.getBuffer()) {
                g0.this.p(true);
                m buffer = g0.this.getBuffer();
                if (buffer == null) {
                    throw new NullPointerException(ProtectedSandApp.s("銰"));
                }
                buffer.notifyAll();
                m2 m2Var = m2.f23662a;
            }
        }

        @Override // okio.o0
        @d5.d
        /* renamed from: h, reason: from getter */
        public q0 getTimeout() {
            return this.timeout;
        }
    }

    public g0(long j5) {
        this.maxBufferSize = j5;
        if (!(j5 >= 1)) {
            throw new IllegalArgumentException(com.bumptech.glide.load.resource.bitmap.p0.a(ProtectedSandApp.s("栣"), j5).toString());
        }
        this.sink = new a();
        this.source = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(m0 m0Var, q3.l<? super m0, m2> lVar) {
        q0 timeout = m0Var.getTimeout();
        q0 timeout2 = this.sink.getTimeout();
        long timeoutNanos = timeout.getTimeoutNanos();
        long a6 = q0.INSTANCE.a(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.i(a6, timeUnit);
        if (!timeout.getHasDeadline()) {
            if (timeout2.getHasDeadline()) {
                timeout.e(timeout2.d());
            }
            try {
                lVar.N(m0Var);
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
        long d6 = timeout.d();
        if (timeout2.getHasDeadline()) {
            timeout.e(Math.min(timeout.d(), timeout2.d()));
        }
        try {
            lVar.N(m0Var);
            timeout.i(timeoutNanos, timeUnit);
            if (timeout2.getHasDeadline()) {
                timeout.e(d6);
            }
        } catch (Throwable th2) {
            timeout.i(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.getHasDeadline()) {
                timeout.e(d6);
            }
            throw th2;
        }
    }

    @p3.i(name = "-deprecated_sink")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sink", imports = {}))
    @d5.d
    /* renamed from: a, reason: from getter */
    public final m0 getSink() {
        return this.sink;
    }

    @p3.i(name = "-deprecated_source")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "source", imports = {}))
    @d5.d
    /* renamed from: b, reason: from getter */
    public final o0 getSource() {
        return this.source;
    }

    public final void d() {
        synchronized (this.buffer) {
            this.canceled = true;
            this.buffer.c();
            m mVar = this.buffer;
            if (mVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("栤"));
            }
            mVar.notifyAll();
            m2 m2Var = m2.f23662a;
        }
    }

    public final void e(@d5.d m0 m0Var) throws IOException {
        boolean z5;
        m mVar;
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("栥"));
        while (true) {
            synchronized (this.buffer) {
                if (!(this.foldedSink == null)) {
                    throw new IllegalStateException(ProtectedSandApp.s("栩").toString());
                }
                if (this.canceled) {
                    this.foldedSink = m0Var;
                    throw new IOException(ProtectedSandApp.s("栨"));
                }
                if (this.buffer.M()) {
                    this.sourceClosed = true;
                    this.foldedSink = m0Var;
                    return;
                }
                z5 = this.sinkClosed;
                mVar = new m();
                m mVar2 = this.buffer;
                mVar.t0(mVar2, mVar2.size());
                m mVar3 = this.buffer;
                if (mVar3 == null) {
                    throw new NullPointerException(ProtectedSandApp.s("栧"));
                }
                mVar3.notifyAll();
                m2 m2Var = m2.f23662a;
            }
            try {
                m0Var.t0(mVar, mVar.size());
                if (z5) {
                    m0Var.close();
                } else {
                    m0Var.flush();
                }
            } catch (Throwable th) {
                synchronized (this.buffer) {
                    this.sourceClosed = true;
                    m mVar4 = this.buffer;
                    if (mVar4 == null) {
                        throw new NullPointerException(ProtectedSandApp.s("栦"));
                    }
                    mVar4.notifyAll();
                    m2 m2Var2 = m2.f23662a;
                    throw th;
                }
            }
        }
    }

    @d5.d
    /* renamed from: g, reason: from getter */
    public final m getBuffer() {
        return this.buffer;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getCanceled() {
        return this.canceled;
    }

    @d5.e
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

    public final void m(boolean z5) {
        this.canceled = z5;
    }

    public final void n(@d5.e m0 m0Var) {
        this.foldedSink = m0Var;
    }

    public final void o(boolean z5) {
        this.sinkClosed = z5;
    }

    public final void p(boolean z5) {
        this.sourceClosed = z5;
    }

    @p3.i(name = "sink")
    @d5.d
    public final m0 q() {
        return this.sink;
    }

    @p3.i(name = "source")
    @d5.d
    public final o0 r() {
        return this.source;
    }
}
