package okhttp3.internal.cache2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import okio.m;
import okio.o0;
import okio.p;
import okio.q0;
import p3.f;

/* compiled from: Relay.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 02\u00020\u0001:\u0002\u000f\nB5\b\u0002\u0012\b\u00102\u001a\u0004\u0018\u00010,\u0012\b\u00108\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010>\u001a\u00020\u0004\u0012\u0006\u0010@\u001a\u00020\u0002\u0012\u0006\u0010A\u001a\u00020\u0004¢\u0006\u0004\bD\u0010EJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010$\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u00102\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/\"\u0004\b0\u00101R$\u00108\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010>\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010?R\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u00109\u001a\u0004\b#\u0010;R\u0011\u0010C\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\bB\u0010\u001f¨\u0006F"}, d2 = {"Lokhttp3/internal/cache2/b;", "", "Lokio/p;", "prefix", "", "upstreamSize", "metadataSize", "Lkotlin/m2;", "u", "v", "b", "m", "Lokio/o0;", "n", "Ljava/lang/Thread;", "a", "Ljava/lang/Thread;", "k", "()Ljava/lang/Thread;", "t", "(Ljava/lang/Thread;)V", "upstreamReader", "Lokio/m;", "Lokio/m;", "i", "()Lokio/m;", "upstreamBuffer", "", "c", "Z", "e", "()Z", "o", "(Z)V", "complete", "d", "buffer", "", "I", "g", "()I", "q", "(I)V", "sourceCount", "Ljava/io/RandomAccessFile;", "f", "Ljava/io/RandomAccessFile;", "()Ljava/io/RandomAccessFile;", "p", "(Ljava/io/RandomAccessFile;)V", "file", "Lokio/o0;", "h", "()Lokio/o0;", "r", "(Lokio/o0;)V", "upstream", "J", "j", "()J", "s", "(J)V", "upstreamPos", "Lokio/p;", "metadata", "bufferMaxSize", "l", "isClosed", "<init>", "(Ljava/io/RandomAccessFile;Lokio/o0;JLokio/p;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: k, reason: collision with root package name */
    private static final int f30779k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final int f30780l = 2;

    /* renamed from: m, reason: collision with root package name */
    @d
    @f
    public static final p f30781m;

    /* renamed from: n, reason: collision with root package name */
    @d
    @f
    public static final p f30782n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f30783o = 32;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @e
    private Thread upstreamReader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private final m upstreamBuffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean complete;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final m buffer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int sourceCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @e
    private RandomAccessFile file;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @e
    private o0 upstream;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long upstreamPos;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p metadata;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long bufferMaxSize;

    /* compiled from: Relay.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/cache2/b$a;", "", "Ljava/io/File;", "file", "Lokio/o0;", "upstream", "Lokio/p;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/b;", "a", "b", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lokio/p;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.cache2.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d
        public final b a(@d File file, @d o0 upstream, @d p metadata, long bufferMaxSize) throws IOException {
            l0.p(file, ProtectedSandApp.s("慂"));
            l0.p(upstream, ProtectedSandApp.s("慃"));
            l0.p(metadata, ProtectedSandApp.s("慄"));
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, ProtectedSandApp.s("慅"));
            b bVar = new b(randomAccessFile, upstream, 0L, metadata, bufferMaxSize, null);
            randomAccessFile.setLength(0L);
            bVar.u(b.f30782n, -1L, -1L);
            return bVar;
        }

        @d
        public final b b(@d File file) throws IOException {
            l0.p(file, ProtectedSandApp.s("慆"));
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, ProtectedSandApp.s("慇"));
            FileChannel channel = randomAccessFile.getChannel();
            l0.o(channel, ProtectedSandApp.s("慈"));
            a aVar = new a(channel);
            m mVar = new m();
            aVar.a(0L, mVar, b.f30783o);
            p pVar = b.f30781m;
            if (!l0.g(mVar.v(pVar.i0()), pVar)) {
                throw new IOException(ProtectedSandApp.s("慉"));
            }
            long readLong = mVar.readLong();
            long readLong2 = mVar.readLong();
            m mVar2 = new m();
            aVar.a(readLong + b.f30783o, mVar2, readLong2);
            return new b(randomAccessFile, null, readLong, mVar2.x0(), 0L, null);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: Relay.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/cache2/b$b;", "Lokio/o0;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lokio/q0;", "h", "Lkotlin/m2;", "close", "o", "Lokio/q0;", "timeout", "Lokhttp3/internal/cache2/a;", "p", "Lokhttp3/internal/cache2/a;", "fileOperator", "q", "J", "sourcePos", "<init>", "(Lokhttp3/internal/cache2/b;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.cache2.b$b, reason: collision with other inner class name */
    public final class C0473b implements o0 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final q0 timeout = new q0();

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private a fileOperator;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private long sourcePos;

        public C0473b() {
            RandomAccessFile file = b.this.getFile();
            l0.m(file);
            FileChannel channel = file.getChannel();
            l0.o(channel, ProtectedSandApp.s("慊"));
            this.fileOperator = new a(channel);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
        
            if (r4 != 2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
        
            r8 = java.lang.Math.min(r21, r19.f30798r.getUpstreamPos() - r19.sourcePos);
            r2 = r19.fileOperator;
            kotlin.jvm.internal.l0.m(r2);
            r2.a(r19.sourcePos + okhttp3.internal.cache2.b.f30783o, r20, r8);
            r19.sourcePos += r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
        
            r0 = r19.f30798r.getUpstream();
            kotlin.jvm.internal.l0.m(r0);
            r14 = r0.X0(r19.f30798r.getUpstreamBuffer(), r19.f30798r.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
        
            if (r14 != (-1)) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d0, code lost:
        
            r0 = r19.f30798r;
            r0.b(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
        
            r2 = r19.f30798r;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00dc, code lost:
        
            r19.f30798r.t(null);
            r0 = r19.f30798r;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00e3, code lost:
        
            if (r0 == null) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
        
            r0.notifyAll();
            r0 = kotlin.m2.f23662a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00eb, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
        
            throw new java.lang.NullPointerException(com.flashget.kidsdownloader.ProtectedSandApp.s("慌"));
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00fb, code lost:
        
            r9 = java.lang.Math.min(r14, r21);
            r19.f30798r.getUpstreamBuffer().o(r20, 0, r9);
            r19.sourcePos += r9;
            r13 = r19.fileOperator;
            kotlin.jvm.internal.l0.m(r13);
            r13.b(r19.f30798r.getUpstreamPos() + okhttp3.internal.cache2.b.f30783o, r19.f30798r.getUpstreamBuffer().j(), r14);
            r2 = r19.f30798r;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0132, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0133, code lost:
        
            r19.f30798r.getBuffer().t0(r19.f30798r.getUpstreamBuffer(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0154, code lost:
        
            if (r19.f30798r.getBuffer().size() <= r19.f30798r.getBufferMaxSize()) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0156, code lost:
        
            r19.f30798r.getBuffer().skip(r19.f30798r.getBuffer().size() - r19.f30798r.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0170, code lost:
        
            r0 = r19.f30798r;
            r0.s(r0.getUpstreamPos() + r14);
            r0 = kotlin.m2.f23662a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x017c, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x017d, code lost:
        
            r2 = r19.f30798r;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x017f, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0180, code lost:
        
            r19.f30798r.t(null);
            r0 = r19.f30798r;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0187, code lost:
        
            if (r0 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0189, code lost:
        
            r0.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x018c, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x018d, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0199, code lost:
        
            throw new java.lang.NullPointerException(com.flashget.kidsdownloader.ProtectedSandApp.s("慍"));
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x01a0, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x01a3, code lost:
        
            monitor-enter(r19.f30798r);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01a4, code lost:
        
            r19.f30798r.t(null);
            r3 = r19.f30798r;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x01ab, code lost:
        
            if (r3 == null) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x01b8, code lost:
        
            throw new java.lang.NullPointerException(com.flashget.kidsdownloader.ProtectedSandApp.s("慎"));
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x01b9, code lost:
        
            r3.notifyAll();
            r3 = kotlin.m2.f23662a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x01bf, code lost:
        
            throw r0;
         */
        @Override // okio.o0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long X0(@d5.d okio.m r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 470
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.b.C0473b.X0(okio.m, long):long");
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            synchronized (b.this) {
                b.this.q(r2.getSourceCount() - 1);
                if (b.this.getSourceCount() == 0) {
                    RandomAccessFile file = b.this.getFile();
                    b.this.p(null);
                    randomAccessFile = file;
                }
                m2 m2Var = m2.f23662a;
            }
            if (randomAccessFile != null) {
                okhttp3.internal.d.l(randomAccessFile);
            }
        }

        @Override // okio.o0
        @d
        /* renamed from: h, reason: from getter */
        public q0 getTimeout() {
            return this.timeout;
        }
    }

    static {
        p.Companion companion = p.INSTANCE;
        f30781m = companion.l(ProtectedSandApp.s("慐"));
        f30782n = companion.l(ProtectedSandApp.s("慑"));
    }

    private b(RandomAccessFile randomAccessFile, o0 o0Var, long j5, p pVar, long j6) {
        this.file = randomAccessFile;
        this.upstream = o0Var;
        this.upstreamPos = j5;
        this.metadata = pVar;
        this.bufferMaxSize = j6;
        this.upstreamBuffer = new m();
        this.complete = this.upstream == null;
        this.buffer = new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(p pVar, long j5, long j6) throws IOException {
        m mVar = new m();
        mVar.S0(pVar);
        mVar.writeLong(j5);
        mVar.writeLong(j6);
        if (!(mVar.size() == f30783o)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("慓").toString());
        }
        RandomAccessFile randomAccessFile = this.file;
        l0.m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        l0.o(channel, ProtectedSandApp.s("慒"));
        new a(channel).b(0L, mVar, f30783o);
    }

    private final void v(long j5) throws IOException {
        m mVar = new m();
        mVar.S0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        l0.m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        l0.o(channel, ProtectedSandApp.s("慔"));
        new a(channel).b(f30783o + j5, mVar, this.metadata.i0());
    }

    public final void b(long j5) throws IOException {
        v(j5);
        RandomAccessFile randomAccessFile = this.file;
        l0.m(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        u(f30781m, j5, this.metadata.i0());
        RandomAccessFile randomAccessFile2 = this.file;
        l0.m(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            m2 m2Var = m2.f23662a;
        }
        o0 o0Var = this.upstream;
        if (o0Var != null) {
            okhttp3.internal.d.l(o0Var);
        }
        this.upstream = null;
    }

    @d
    /* renamed from: c, reason: from getter */
    public final m getBuffer() {
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

    @e
    /* renamed from: f, reason: from getter */
    public final RandomAccessFile getFile() {
        return this.file;
    }

    /* renamed from: g, reason: from getter */
    public final int getSourceCount() {
        return this.sourceCount;
    }

    @e
    /* renamed from: h, reason: from getter */
    public final o0 getUpstream() {
        return this.upstream;
    }

    @d
    /* renamed from: i, reason: from getter */
    public final m getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    /* renamed from: j, reason: from getter */
    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    @e
    /* renamed from: k, reason: from getter */
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean l() {
        return this.file == null;
    }

    @d
    /* renamed from: m, reason: from getter */
    public final p getMetadata() {
        return this.metadata;
    }

    @e
    public final o0 n() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new C0473b();
        }
    }

    public final void o(boolean z5) {
        this.complete = z5;
    }

    public final void p(@e RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void q(int i5) {
        this.sourceCount = i5;
    }

    public final void r(@e o0 o0Var) {
        this.upstream = o0Var;
    }

    public final void s(long j5) {
        this.upstreamPos = j5;
    }

    public final void t(@e Thread thread) {
        this.upstreamReader = thread;
    }

    public /* synthetic */ b(RandomAccessFile randomAccessFile, o0 o0Var, long j5, p pVar, long j6, w wVar) {
        this(randomAccessFile, o0Var, j5, pVar, j6);
    }
}
