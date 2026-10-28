package okhttp3.internal.cache2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kd.f;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import okhttp3.internal.d;
import okio.o0;
import okio.p;
import okio.q0;

/* compiled from: Relay.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 ;2\u00020\u0001:\u0002\u001b\u0015B5\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u00100\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b(\u0010%R\"\u00107\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b8\u0010:\"\u0004\b;\u0010<R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010=\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010@R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010ER\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bB\u0010A\u001a\u0004\b/\u0010CR\u0011\u0010G\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\bF\u0010+¨\u0006H"}, d2 = {"Lokhttp3/internal/cache2/b;", "", "Ljava/io/RandomAccessFile;", "file", "Lokio/o0;", "upstream", "", "upstreamPos", "Lokio/p;", "metadata", "bufferMaxSize", "<init>", "(Ljava/io/RandomAccessFile;Lokio/o0;JLokio/p;J)V", "prefix", "upstreamSize", "metadataSize", "Lkotlin/k2;", "u", "(Lokio/p;JJ)V", "v", "(J)V", "b", "m", "()Lokio/p;", "n", "()Lokio/o0;", "Ljava/lang/Thread;", "a", "Ljava/lang/Thread;", "k", "()Ljava/lang/Thread;", "t", "(Ljava/lang/Thread;)V", "upstreamReader", "Lokio/m;", "Lokio/m;", "i", "()Lokio/m;", "upstreamBuffer", "", "c", "Z", "e", "()Z", "o", "(Z)V", "complete", "d", "buffer", "", "I", "g", "()I", "q", "(I)V", "sourceCount", "f", "Ljava/io/RandomAccessFile;", "()Ljava/io/RandomAccessFile;", "p", "(Ljava/io/RandomAccessFile;)V", "Lokio/o0;", "h", "r", "(Lokio/o0;)V", "J", "j", "()J", "s", "Lokio/p;", "l", "isClosed", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    private static final int f84300k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f84301l = 2;

    /* renamed from: m, reason: collision with root package name */
    @l
    @f
    public static final p f84302m;

    /* renamed from: n, reason: collision with root package name */
    @l
    @f
    public static final p f84303n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f84304o = 32;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private Thread upstreamReader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final okio.m upstreamBuffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean complete;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final okio.m buffer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int sourceCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private RandomAccessFile file;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @m
    private o0 upstream;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long upstreamPos;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p metadata;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long bufferMaxSize;

    /* compiled from: Relay.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/cache2/b$a;", "", "<init>", "()V", "Ljava/io/File;", "file", "Lokio/o0;", "upstream", "Lokio/p;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/b;", "a", "(Ljava/io/File;Lokio/o0;Lokio/p;J)Lokhttp3/internal/cache2/b;", "b", "(Ljava/io/File;)Lokhttp3/internal/cache2/b;", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lokio/p;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.cache2.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final b a(@l File file, @l o0 upstream, @l p metadata, long bufferMaxSize) throws IOException {
            l0.p(file, ProtectedSandApp.s("ꁜ\u0001"));
            l0.p(upstream, ProtectedSandApp.s("ꁝ\u0001"));
            l0.p(metadata, ProtectedSandApp.s("ꁞ\u0001"));
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, ProtectedSandApp.s("ꁟ\u0001"));
            b bVar = new b(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            bVar.u(b.f84303n, -1L, -1L);
            return bVar;
        }

        @l
        public final b b(@l File file) throws IOException {
            l0.p(file, ProtectedSandApp.s("ꁜ\u0001"));
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, ProtectedSandApp.s("ꁟ\u0001"));
            FileChannel channel = randomAccessFile.getChannel();
            l0.o(channel, ProtectedSandApp.s("ꁠ\u0001"));
            a aVar = new a(channel);
            okio.m mVar = new okio.m();
            aVar.a(0L, mVar, 32L);
            if (!l0.g(mVar.b2(r1.q()), b.f84302m)) {
                throw new IOException(ProtectedSandApp.s("ꁡ\u0001"));
            }
            long readLong = mVar.readLong();
            long readLong2 = mVar.readLong();
            okio.m mVar2 = new okio.m();
            aVar.a(readLong + 32, mVar2, readLong2);
            return new b(randomAccessFile, null, readLong, mVar2.b3(), 0L, null);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: Relay.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/cache2/b$b;", "Lokio/o0;", "<init>", "(Lokhttp3/internal/cache2/b;)V", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "Lokio/q0;", "timeout", "()Lokio/q0;", "Lkotlin/k2;", "close", "()V", "b", "Lokio/q0;", "Lokhttp3/internal/cache2/a;", "c", "Lokhttp3/internal/cache2/a;", "fileOperator", "d", "J", "sourcePos", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.cache2.b$b, reason: collision with other inner class name */
    public final class C1312b implements o0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final q0 timeout = new q0();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private a fileOperator;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private long sourcePos;

        public C1312b() {
            RandomAccessFile file = b.this.getFile();
            l0.m(file);
            FileChannel channel = file.getChannel();
            l0.o(channel, ProtectedSandApp.s("ꁢ\u0001"));
            this.fileOperator = new a(channel);
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (b.this) {
                try {
                    b.this.q(r2.getSourceCount() - 1);
                    if (b.this.getSourceCount() == 0) {
                        RandomAccessFile file = b.this.getFile();
                        b.this.p(null);
                        randomAccessFile = file;
                    }
                    k2 k2Var = k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile != null) {
                d.l(randomAccessFile);
            }
        }

        @Override // okio.o0
        @l
        /* renamed from: timeout, reason: from getter */
        public q0 getTimeout() {
            return this.timeout;
        }

        @Override // okio.o0
        public long w3(@l okio.m sink, long byteCount) throws IOException {
            l0.p(sink, ProtectedSandApp.s("ꁣ\u0001"));
            char c5 = 1;
            if (!(this.fileOperator != null)) {
                throw new IllegalStateException(ProtectedSandApp.s("ꁥ\u0001"));
            }
            synchronized (b.this) {
                while (true) {
                    if (this.sourcePos == b.this.getUpstreamPos()) {
                        if (!b.this.getComplete()) {
                            if (b.this.getUpstreamReader() == null) {
                                b.this.t(Thread.currentThread());
                                break;
                            }
                            this.timeout.k(b.this);
                        } else {
                            return -1L;
                        }
                    } else {
                        long upstreamPos = b.this.getUpstreamPos() - b.this.getBuffer().size();
                        if (this.sourcePos >= upstreamPos) {
                            long min = Math.min(byteCount, b.this.getUpstreamPos() - this.sourcePos);
                            b.this.getBuffer().n(sink, this.sourcePos - upstreamPos, min);
                            this.sourcePos += min;
                            return min;
                        }
                        c5 = 2;
                    }
                }
                if (c5 == 2) {
                    long min2 = Math.min(byteCount, b.this.getUpstreamPos() - this.sourcePos);
                    a aVar = this.fileOperator;
                    l0.m(aVar);
                    aVar.a(this.sourcePos + 32, sink, min2);
                    this.sourcePos += min2;
                    return min2;
                }
                try {
                    o0 upstream = b.this.getUpstream();
                    l0.m(upstream);
                    long w32 = upstream.w3(b.this.getUpstreamBuffer(), b.this.getBufferMaxSize());
                    if (w32 == -1) {
                        b bVar = b.this;
                        bVar.b(bVar.getUpstreamPos());
                        synchronized (b.this) {
                            b.this.t(null);
                            b bVar2 = b.this;
                            if (bVar2 == null) {
                                throw new NullPointerException(ProtectedSandApp.s("ꁤ\u0001"));
                            }
                            bVar2.notifyAll();
                            k2 k2Var = k2.f75408a;
                        }
                        return -1L;
                    }
                    long min3 = Math.min(w32, byteCount);
                    b.this.getUpstreamBuffer().n(sink, 0L, min3);
                    this.sourcePos += min3;
                    a aVar2 = this.fileOperator;
                    l0.m(aVar2);
                    aVar2.b(b.this.getUpstreamPos() + 32, b.this.getUpstreamBuffer().g(), w32);
                    synchronized (b.this) {
                        try {
                            b.this.getBuffer().write(b.this.getUpstreamBuffer(), w32);
                            if (b.this.getBuffer().size() > b.this.getBufferMaxSize()) {
                                b.this.getBuffer().skip(b.this.getBuffer().size() - b.this.getBufferMaxSize());
                            }
                            b bVar3 = b.this;
                            bVar3.s(bVar3.getUpstreamPos() + w32);
                            k2 k2Var2 = k2.f75408a;
                        } finally {
                        }
                    }
                    synchronized (b.this) {
                        b.this.t(null);
                        b bVar4 = b.this;
                        if (bVar4 == null) {
                            throw new NullPointerException(ProtectedSandApp.s("ꁤ\u0001"));
                        }
                        bVar4.notifyAll();
                    }
                    return min3;
                } catch (Throwable th) {
                    synchronized (b.this) {
                        try {
                            b.this.t(null);
                            b bVar5 = b.this;
                            if (bVar5 == null) {
                                throw new NullPointerException(ProtectedSandApp.s("ꁤ\u0001"));
                            }
                            bVar5.notifyAll();
                            k2 k2Var3 = k2.f75408a;
                            throw th;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    static {
        p.Companion companion = p.INSTANCE;
        f84302m = companion.l(ProtectedSandApp.s("ꁦ\u0001"));
        f84303n = companion.l(ProtectedSandApp.s("ꁧ\u0001"));
    }

    private b(RandomAccessFile randomAccessFile, o0 o0Var, long j4, p pVar, long j5) {
        this.file = randomAccessFile;
        this.upstream = o0Var;
        this.upstreamPos = j4;
        this.metadata = pVar;
        this.bufferMaxSize = j5;
        this.upstreamBuffer = new okio.m();
        this.complete = this.upstream == null;
        this.buffer = new okio.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(p prefix, long upstreamSize, long metadataSize) throws IOException {
        okio.m mVar = new okio.m();
        mVar.t3(prefix);
        mVar.writeLong(upstreamSize);
        mVar.writeLong(metadataSize);
        if (!(mVar.size() == 32)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ꁩ\u0001"));
        }
        RandomAccessFile randomAccessFile = this.file;
        l0.m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        l0.o(channel, ProtectedSandApp.s("ꁨ\u0001"));
        new a(channel).b(0L, mVar, 32L);
    }

    private final void v(long upstreamSize) throws IOException {
        okio.m mVar = new okio.m();
        mVar.t3(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        l0.m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        l0.o(channel, ProtectedSandApp.s("ꁨ\u0001"));
        new a(channel).b(32 + upstreamSize, mVar, this.metadata.q());
    }

    public final void b(long upstreamSize) throws IOException {
        v(upstreamSize);
        RandomAccessFile randomAccessFile = this.file;
        l0.m(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        u(f84302m, upstreamSize, this.metadata.q());
        RandomAccessFile randomAccessFile2 = this.file;
        l0.m(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            k2 k2Var = k2.f75408a;
        }
        o0 o0Var = this.upstream;
        if (o0Var != null) {
            d.l(o0Var);
        }
        this.upstream = null;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final okio.m getBuffer() {
        return this.buffer;
    }

    /* renamed from: d, reason: from getter */
    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getComplete() {
        return this.complete;
    }

    @m
    /* renamed from: f, reason: from getter */
    public final RandomAccessFile getFile() {
        return this.file;
    }

    /* renamed from: g, reason: from getter */
    public final int getSourceCount() {
        return this.sourceCount;
    }

    @m
    /* renamed from: h, reason: from getter */
    public final o0 getUpstream() {
        return this.upstream;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final okio.m getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    /* renamed from: j, reason: from getter */
    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    @m
    /* renamed from: k, reason: from getter */
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean l() {
        return this.file == null;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final p getMetadata() {
        return this.metadata;
    }

    @m
    public final o0 n() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new C1312b();
        }
    }

    public final void o(boolean z4) {
        this.complete = z4;
    }

    public final void p(@m RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void q(int i4) {
        this.sourceCount = i4;
    }

    public final void r(@m o0 o0Var) {
        this.upstream = o0Var;
    }

    public final void s(long j4) {
        this.upstreamPos = j4;
    }

    public final void t(@m Thread thread) {
        this.upstreamReader = thread;
    }

    public /* synthetic */ b(RandomAccessFile randomAccessFile, o0 o0Var, long j4, p pVar, long j5, w wVar) {
        this(randomAccessFile, o0Var, j4, pVar, j5);
    }
}
