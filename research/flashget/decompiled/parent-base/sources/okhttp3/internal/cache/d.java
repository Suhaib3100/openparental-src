package okhttp3.internal.cache;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlin.text.r;
import kotlin.text.v;
import okhttp3.internal.platform.j;
import okio.a0;
import okio.m0;
import okio.n;
import okio.o;
import okio.o0;
import okio.s;

/* compiled from: DiskLruCache.kt */
@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\r*\u0001o\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0004zAEHB9\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010\u001f\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\u0019J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0010H\u0000¢\u0006\u0004\b#\u0010\u0012J\u001e\u0010%\u001a\b\u0018\u00010$R\u00020\u00002\u0006\u0010 \u001a\u00020\u0016H\u0086\u0002¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\b\u0018\u00010(R\u00020\u00002\u0006\u0010 \u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020\nH\u0007¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\u00102\n\u0010-\u001a\u00060(R\u00020\u00002\u0006\u0010.\u001a\u00020\u001bH\u0000¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0016¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u00020\u001b2\n\u00104\u001a\u000603R\u00020\u0000H\u0000¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0010H\u0016¢\u0006\u0004\b7\u0010\u0012J\r\u00108\u001a\u00020\u001b¢\u0006\u0004\b8\u0010\u001dJ\u000f\u00109\u001a\u00020\u0010H\u0016¢\u0006\u0004\b9\u0010\u0012J\r\u0010:\u001a\u00020\u0010¢\u0006\u0004\b:\u0010\u0012J\r\u0010;\u001a\u00020\u0010¢\u0006\u0004\b;\u0010\u0012J\r\u0010<\u001a\u00020\u0010¢\u0006\u0004\b<\u0010\u0012J\u0017\u0010>\u001a\f\u0012\b\u0012\u00060$R\u00020\u00000=¢\u0006\u0004\b>\u0010?R*\u0010\u000b\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\"\u001a\u0004\bB\u0010,\"\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0014\u0010K\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FR\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010\"R\u0018\u0010O\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR*\u0010U\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u000603R\u00020\u00000P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0016\u0010X\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010[\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010]\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0016\u0010_\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010ZR\"\u0010d\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010Z\u001a\u0004\ba\u0010\u001d\"\u0004\bb\u0010cR\u0016\u0010f\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010ZR\u0016\u0010h\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010ZR\u0016\u0010j\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010\"R\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010s\u001a\u0004\bt\u0010uR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u0010F\u001a\u0004\bv\u0010wR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010WR\u001a\u0010\t\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\bx\u0010W\u001a\u0004\bW\u0010y¨\u0006{"}, d2 = {"Lokhttp3/internal/cache/d;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/io/a;", "fileSystem", "Ljava/io/File;", "directory", "", "appVersion", "valueCount", "", "maxSize", "Lokhttp3/internal/concurrent/d;", "taskRunner", "<init>", "(Lokhttp3/internal/io/a;Ljava/io/File;IIJLokhttp3/internal/concurrent/d;)V", "Lkotlin/k2;", "N", "()V", "Lokio/n;", "L", "()Lokio/n;", "", "line", "O", "(Ljava/lang/String;)V", "M", "", "K", "()Z", "s", "Y", "key", "q0", "J", "Q", "Lokhttp3/internal/cache/d$d;", "C", "(Ljava/lang/String;)Lokhttp3/internal/cache/d$d;", "expectedSequenceNumber", "Lokhttp3/internal/cache/d$b;", "y", "(Ljava/lang/String;J)Lokhttp3/internal/cache/d$b;", "size", "()J", "editor", "success", "t", "(Lokhttp3/internal/cache/d$b;Z)V", "S", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/d$c;", "entry", "X", "(Lokhttp3/internal/cache/d$c;)Z", "flush", "isClosed", "close", "o0", "u", "B", "", "n0", "()Ljava/util/Iterator;", "value", "b", "H", "j0", "(J)V", "c", "Ljava/io/File;", "journalFile", "d", "journalFileTmp", "e", "journalFileBackup", "f", "g", "Lokio/n;", "journalWriter", "Ljava/util/LinkedHashMap;", "h", "Ljava/util/LinkedHashMap;", "G", "()Ljava/util/LinkedHashMap;", "lruEntries", "i", "I", "redundantOpCount", "j", "Z", "hasJournalErrors", "k", "civilizedFileSystem", "l", "initialized", "m", "D", "c0", "(Z)V", "closed", "n", "mostRecentTrimFailed", "o", "mostRecentRebuildFailed", "p", "nextSequenceNumber", "Lokhttp3/internal/concurrent/c;", "q", "Lokhttp3/internal/concurrent/c;", "cleanupQueue", "okhttp3/internal/cache/d$e", "r", "Lokhttp3/internal/cache/d$e;", "cleanupTask", "Lokhttp3/internal/io/a;", "F", "()Lokhttp3/internal/io/a;", "E", "()Ljava/io/File;", "v", "()I", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class d implements Closeable, Flushable {

    @kd.f
    public static final long B = -1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long maxSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final File journalFile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final File journalFileTmp;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final File journalFileBackup;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private n journalWriter;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @l
    private final LinkedHashMap<String, c> lruEntries;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int redundantOpCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean hasJournalErrors;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean civilizedFileSystem;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentTrimFailed;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean mostRecentRebuildFailed;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long nextSequenceNumber;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.internal.concurrent.c cleanupQueue;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final e cleanupTask;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @l
    private final okhttp3.internal.io.a fileSystem;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @l
    private final File directory;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final int appVersion;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final int valueCount;

    @l
    @kd.f
    public static final String A = ProtectedSandApp.s("ꀭ\u0001");

    /* renamed from: w, reason: collision with root package name */
    @l
    @kd.f
    public static final String f84242w = ProtectedSandApp.s("ꀮ\u0001");

    /* renamed from: x, reason: collision with root package name */
    @l
    @kd.f
    public static final String f84243x = ProtectedSandApp.s("ꀯ\u0001");

    /* renamed from: y, reason: collision with root package name */
    @l
    @kd.f
    public static final String f84244y = ProtectedSandApp.s("ꀰ\u0001");

    /* renamed from: z, reason: collision with root package name */
    @l
    @kd.f
    public static final String f84245z = ProtectedSandApp.s("ꀱ\u0001");

    @l
    @kd.f
    public static final r C = new r(ProtectedSandApp.s("ꀲ\u0001"));

    @l
    @kd.f
    public static final String D = ProtectedSandApp.s("ꀳ\u0001");

    @l
    @kd.f
    public static final String E = ProtectedSandApp.s("ꀴ\u0001");

    @l
    @kd.f
    public static final String F = ProtectedSandApp.s("ꀵ\u0001");

    @l
    @kd.f
    public static final String G = ProtectedSandApp.s("ꀶ\u0001");

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\tJ\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u001e\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/cache/d$b;", "", "Lokhttp3/internal/cache/d$c;", "Lokhttp3/internal/cache/d;", "entry", "<init>", "(Lokhttp3/internal/cache/d;Lokhttp3/internal/cache/d$c;)V", "Lkotlin/k2;", "c", "()V", "", "index", "Lokio/o0;", "g", "(I)Lokio/o0;", "Lokio/m0;", "f", "(I)Lokio/m0;", "b", "a", "", "[Z", "e", "()[Z", "written", "", "Z", "done", "Lokhttp3/internal/cache/d$c;", "d", "()Lokhttp3/internal/cache/d$c;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @m
        private final boolean[] written;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final c entry;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f84270d;

        /* compiled from: DiskLruCache.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/io/IOException;", "it", "Lkotlin/k2;", "a", "(Ljava/io/IOException;)V", "okhttp3/internal/cache/DiskLruCache$Editor$newSink$1$1"}, k = 3, mv = {1, 4, 0})
        static final class a extends n0 implements ld.l<IOException, k2> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f84272c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i4) {
                super(1);
                this.f84272c = i4;
            }

            public final void a(@l IOException iOException) {
                l0.p(iOException, ProtectedSandApp.s("ꀖ\u0001"));
                synchronized (b.this.f84270d) {
                    b.this.c();
                    k2 k2Var = k2.f75408a;
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(IOException iOException) {
                a(iOException);
                return k2.f75408a;
            }
        }

        public b(@l d dVar, c cVar) {
            l0.p(cVar, ProtectedSandApp.s("ꀗ\u0001"));
            this.f84270d = dVar;
            this.entry = cVar;
            this.written = cVar.getReadable() ? null : new boolean[dVar.getValueCount()];
        }

        public final void a() throws IOException {
            synchronized (this.f84270d) {
                try {
                    if (this.done) {
                        throw new IllegalStateException(ProtectedSandApp.s("ꀘ\u0001"));
                    }
                    if (l0.g(this.entry.getCurrentEditor(), this)) {
                        this.f84270d.t(this, false);
                    }
                    this.done = true;
                    k2 k2Var = k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() throws IOException {
            synchronized (this.f84270d) {
                try {
                    if (this.done) {
                        throw new IllegalStateException(ProtectedSandApp.s("ꀘ\u0001"));
                    }
                    if (l0.g(this.entry.getCurrentEditor(), this)) {
                        this.f84270d.t(this, true);
                    }
                    this.done = true;
                    k2 k2Var = k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (l0.g(this.entry.getCurrentEditor(), this)) {
                if (this.f84270d.civilizedFileSystem) {
                    this.f84270d.t(this, false);
                } else {
                    this.entry.q(true);
                }
            }
        }

        @l
        /* renamed from: d, reason: from getter */
        public final c getEntry() {
            return this.entry;
        }

        @m
        /* renamed from: e, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        @l
        public final m0 f(int index) {
            synchronized (this.f84270d) {
                if (this.done) {
                    throw new IllegalStateException(ProtectedSandApp.s("ꀘ\u0001"));
                }
                if (!l0.g(this.entry.getCurrentEditor(), this)) {
                    return a0.b();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    l0.m(zArr);
                    zArr[index] = true;
                }
                try {
                    return new okhttp3.internal.cache.e(this.f84270d.getFileSystem().f(this.entry.c().get(index)), new a(index));
                } catch (FileNotFoundException unused) {
                    return a0.b();
                }
            }
        }

        @m
        public final o0 g(int index) {
            synchronized (this.f84270d) {
                if (this.done) {
                    throw new IllegalStateException(ProtectedSandApp.s("ꀘ\u0001"));
                }
                o0 o0Var = null;
                if (!this.entry.getReadable() || !l0.g(this.entry.getCurrentEditor(), this) || this.entry.getZombie()) {
                    return null;
                }
                try {
                    o0Var = this.f84270d.getFileSystem().e(this.entry.a().get(index));
                } catch (FileNotFoundException unused) {
                }
                return o0Var;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\b\u0018\u00010\u0017R\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%R \u0010(\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010%R\"\u00100\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00103\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R(\u0010:\u001a\b\u0018\u000104R\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b#\u00107\"\u0004\b8\u00109R\"\u0010?\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010;\u001a\u0004\b5\u0010<\"\u0004\b=\u0010>R\"\u0010F\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bA\u0010C\"\u0004\bD\u0010ER\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010G\u001a\u0004\b*\u0010H¨\u0006I"}, d2 = {"Lokhttp3/internal/cache/d$c;", "", "", "key", "<init>", "(Lokhttp3/internal/cache/d;Ljava/lang/String;)V", "", "strings", "", "j", "(Ljava/util/List;)Ljava/lang/Void;", "", "index", "Lokio/o0;", "k", "(I)Lokio/o0;", "Lkotlin/k2;", "m", "(Ljava/util/List;)V", "Lokio/n;", "writer", "s", "(Lokio/n;)V", "Lokhttp3/internal/cache/d$d;", "Lokhttp3/internal/cache/d;", "r", "()Lokhttp3/internal/cache/d$d;", "", "a", "[J", "e", "()[J", "lengths", "", "Ljava/io/File;", "b", "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "c", "dirtyFiles", "", "d", "Z", "g", "()Z", "o", "(Z)V", "readable", "i", "q", "zombie", "Lokhttp3/internal/cache/d$b;", "f", "Lokhttp3/internal/cache/d$b;", "()Lokhttp3/internal/cache/d$b;", "l", "(Lokhttp3/internal/cache/d$b;)V", "currentEditor", "I", "()I", "n", "(I)V", "lockingSourceCount", "", "h", "J", "()J", "p", "(J)V", "sequenceNumber", "Ljava/lang/String;", "()Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final long[] lengths;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<File> cleanFiles;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<File> dirtyFiles;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean readable;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean zombie;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @m
        private b currentEditor;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int lockingSourceCount;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private long sequenceNumber;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @l
        private final String key;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ d f84282j;

        /* compiled from: DiskLruCache.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"okhttp3/internal/cache/d$c$a", "Lokio/s;", "Lkotlin/k2;", "close", "()V", "", "c", "Z", "closed", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class a extends s {

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private boolean closed;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ o0 f84285e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, o0 o0Var2) {
                super(o0Var2);
                this.f84285e = o0Var;
            }

            @Override // okio.s, okio.o0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.closed) {
                    return;
                }
                this.closed = true;
                synchronized (c.this.f84282j) {
                    try {
                        c.this.n(r1.getLockingSourceCount() - 1);
                        if (c.this.getLockingSourceCount() == 0 && c.this.getZombie()) {
                            c cVar = c.this;
                            cVar.f84282j.X(cVar);
                        }
                        k2 k2Var = k2.f75408a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c(@l d dVar, String str) {
            l0.p(str, ProtectedSandApp.s("ꀙ\u0001"));
            this.f84282j = dVar;
            this.key = str;
            this.lengths = new long[dVar.getValueCount()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount = dVar.getValueCount();
            for (int i4 = 0; i4 < valueCount; i4++) {
                sb.append(i4);
                this.cleanFiles.add(new File(dVar.getDirectory(), sb.toString()));
                sb.append(ProtectedSandApp.s("ꀚ\u0001"));
                this.dirtyFiles.add(new File(dVar.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void j(List<String> strings) throws IOException {
            throw new IOException(ProtectedSandApp.s("ꀛ\u0001") + strings);
        }

        private final o0 k(int index) {
            o0 e4 = this.f84282j.getFileSystem().e(this.cleanFiles.get(index));
            if (this.f84282j.civilizedFileSystem) {
                return e4;
            }
            this.lockingSourceCount++;
            return new a(e4, e4);
        }

        @l
        public final List<File> a() {
            return this.cleanFiles;
        }

        @m
        /* renamed from: b, reason: from getter */
        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        @l
        public final List<File> c() {
            return this.dirtyFiles;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        /* renamed from: f, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        /* renamed from: h, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void l(@m b bVar) {
            this.currentEditor = bVar;
        }

        public final void m(@l List<String> strings) throws IOException {
            l0.p(strings, ProtectedSandApp.s("ꀜ\u0001"));
            if (strings.size() != this.f84282j.getValueCount()) {
                j(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i4 = 0; i4 < size; i4++) {
                    this.lengths[i4] = Long.parseLong(strings.get(i4));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void n(int i4) {
            this.lockingSourceCount = i4;
        }

        public final void o(boolean z4) {
            this.readable = z4;
        }

        public final void p(long j4) {
            this.sequenceNumber = j4;
        }

        public final void q(boolean z4) {
            this.zombie = z4;
        }

        @m
        public final C1311d r() {
            d dVar = this.f84282j;
            if (okhttp3.internal.d.f84463h && !Thread.holdsLock(dVar)) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꀝ\u0001"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("ꀞ\u0001"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("ꀟ\u0001"));
                sb.append(dVar);
                throw new AssertionError(sb.toString());
            }
            if (!this.readable) {
                return null;
            }
            if (!this.f84282j.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = this.f84282j.getValueCount();
                for (int i4 = 0; i4 < valueCount; i4++) {
                    arrayList.add(k(i4));
                }
                return new C1311d(this.f84282j, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    okhttp3.internal.d.l((o0) it.next());
                }
                try {
                    this.f84282j.X(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(@l n writer) throws IOException {
            l0.p(writer, ProtectedSandApp.s("ꀠ\u0001"));
            for (long j4 : this.lengths) {
                writer.writeByte(32).N1(j4);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0018\u00010\u000fR\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lokhttp3/internal/cache/d$d;", "Ljava/io/Closeable;", "", "key", "", "sequenceNumber", "", "Lokio/o0;", "sources", "", "lengths", "<init>", "(Lokhttp3/internal/cache/d;Ljava/lang/String;JLjava/util/List;[J)V", "d", "()Ljava/lang/String;", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "a", "()Lokhttp3/internal/cache/d$b;", "", "index", "c", "(I)Lokio/o0;", "b", "(I)J", "Lkotlin/k2;", "close", "()V", "Ljava/lang/String;", "J", "Ljava/util/List;", "e", "[J", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.cache.d$d, reason: collision with other inner class name */
    public final class C1311d implements Closeable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long sequenceNumber;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<o0> sources;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f84290f;

        /* JADX WARN: Multi-variable type inference failed */
        public C1311d(@l d dVar, String str, @l long j4, @l List<? extends o0> list, long[] jArr) {
            l0.p(str, ProtectedSandApp.s("ꀡ\u0001"));
            l0.p(list, ProtectedSandApp.s("ꀢ\u0001"));
            l0.p(jArr, ProtectedSandApp.s("ꀣ\u0001"));
            this.f84290f = dVar;
            this.key = str;
            this.sequenceNumber = j4;
            this.sources = list;
            this.lengths = jArr;
        }

        @m
        public final b a() throws IOException {
            return this.f84290f.y(this.key, this.sequenceNumber);
        }

        public final long b(int index) {
            return this.lengths[index];
        }

        @l
        public final o0 c(int index) {
            return this.sources.get(index);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<o0> it = this.sources.iterator();
            while (it.hasNext()) {
                okhttp3.internal.d.l(it.next());
            }
        }

        @l
        /* renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/cache/d$e", "Lokhttp3/internal/concurrent/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class e extends okhttp3.internal.concurrent.a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            synchronized (d.this) {
                if (!d.this.initialized || d.this.getClosed()) {
                    return -1L;
                }
                try {
                    d.this.o0();
                } catch (IOException unused) {
                    d.this.mostRecentTrimFailed = true;
                }
                try {
                    if (d.this.K()) {
                        d.this.Q();
                        d.this.redundantOpCount = 0;
                    }
                } catch (IOException unused2) {
                    d.this.mostRecentRebuildFailed = true;
                    d.this.journalWriter = a0.c(a0.b());
                }
                return -1L;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Lkotlin/k2;", "a", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 4, 0})
    static final class f extends n0 implements ld.l<IOException, k2> {
        f() {
            super(1);
        }

        public final void a(@l IOException iOException) {
            l0.p(iOException, ProtectedSandApp.s("ꀧ\u0001"));
            d dVar = d.this;
            if (!okhttp3.internal.d.f84463h || Thread.holdsLock(dVar)) {
                d.this.hasJournalErrors = true;
                return;
            }
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꀨ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꀩ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꀪ\u0001"));
            sb.append(dVar);
            throw new AssertionError(sb.toString());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(IOException iOException) {
            a(iOException);
            return k2.f75408a;
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR*\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012 \r*\b\u0018\u00010\fR\u00020\u00030\fR\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"okhttp3/internal/cache/d$g", "", "Lokhttp3/internal/cache/d$d;", "Lokhttp3/internal/cache/d;", "", "hasNext", "()Z", "b", "()Lokhttp3/internal/cache/d$d;", "Lkotlin/k2;", "remove", "()V", "Lokhttp3/internal/cache/d$c;", "kotlin.jvm.PlatformType", "Ljava/util/Iterator;", "delegate", "c", "Lokhttp3/internal/cache/d$d;", "nextSnapshot", "d", "removeSnapshot", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class g implements Iterator<C1311d>, md.d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Iterator<c> delegate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private C1311d nextSnapshot;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private C1311d removeSnapshot;

        g() {
            Iterator<c> it = new ArrayList(d.this.G().values()).iterator();
            l0.o(it, ProtectedSandApp.s("ꀫ\u0001"));
            this.delegate = it;
        }

        @Override // java.util.Iterator
        @l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1311d next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            C1311d c1311d = this.nextSnapshot;
            this.removeSnapshot = c1311d;
            this.nextSnapshot = null;
            l0.m(c1311d);
            return c1311d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            C1311d r4;
            if (this.nextSnapshot != null) {
                return true;
            }
            synchronized (d.this) {
                if (d.this.getClosed()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    c next = this.delegate.next();
                    if (next != null && (r4 = next.r()) != null) {
                        this.nextSnapshot = r4;
                        return true;
                    }
                }
                k2 k2Var = k2.f75408a;
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            C1311d c1311d = this.removeSnapshot;
            if (c1311d == null) {
                throw new IllegalStateException(ProtectedSandApp.s("ꀬ\u0001"));
            }
            try {
                d.this.S(c1311d.getKey());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.removeSnapshot = null;
                throw th;
            }
            this.removeSnapshot = null;
        }
    }

    public d(@l okhttp3.internal.io.a aVar, @l File file, int i4, int i5, long j4, @l okhttp3.internal.concurrent.d dVar) {
        l0.p(aVar, ProtectedSandApp.s("ꀷ\u0001"));
        l0.p(file, ProtectedSandApp.s("ꀸ\u0001"));
        l0.p(dVar, ProtectedSandApp.s("ꀹ\u0001"));
        this.fileSystem = aVar;
        this.directory = file;
        this.appVersion = i4;
        this.valueCount = i5;
        this.maxSize = j4;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = dVar.j();
        this.cleanupTask = new e(android.support.v4.media.c.a(new StringBuilder(), okhttp3.internal.d.f84464i, ProtectedSandApp.s("ꀺ\u0001")));
        if (!(j4 > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ꀼ\u0001"));
        }
        if (!(i5 > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ꀻ\u0001"));
        }
        this.journalFile = new File(file, f84242w);
        this.journalFileTmp = new File(file, f84243x);
        this.journalFileBackup = new File(file, f84244y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean K() {
        int i4 = this.redundantOpCount;
        return i4 >= 2000 && i4 >= this.lruEntries.size();
    }

    private final n L() throws FileNotFoundException {
        return a0.c(new okhttp3.internal.cache.e(this.fileSystem.c(this.journalFile), new f()));
    }

    private final void M() throws IOException {
        this.fileSystem.h(this.journalFileTmp);
        Iterator<c> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            l0.o(next, ProtectedSandApp.s("ꀽ\u0001"));
            c cVar = next;
            int i4 = 0;
            if (cVar.getCurrentEditor() == null) {
                int i5 = this.valueCount;
                while (i4 < i5) {
                    this.size += cVar.getLengths()[i4];
                    i4++;
                }
            } else {
                cVar.l(null);
                int i6 = this.valueCount;
                while (i4 < i6) {
                    this.fileSystem.h(cVar.a().get(i4));
                    this.fileSystem.h(cVar.c().get(i4));
                    i4++;
                }
                it.remove();
            }
        }
    }

    private final void N() throws IOException {
        String s4 = ProtectedSandApp.s("ꀾ\u0001");
        String s5 = ProtectedSandApp.s("ꀿ\u0001");
        o d5 = a0.d(this.fileSystem.e(this.journalFile));
        try {
            String m12 = d5.m1();
            String m13 = d5.m1();
            String m14 = d5.m1();
            String m15 = d5.m1();
            String m16 = d5.m1();
            if (!l0.g(f84245z, m12) || !l0.g(A, m13) || !l0.g(String.valueOf(this.appVersion), m14) || !l0.g(String.valueOf(this.valueCount), m15) || m16.length() > 0) {
                throw new IOException(s5 + m12 + s4 + m13 + s4 + m15 + s4 + m16 + ']');
            }
            int i4 = 0;
            while (true) {
                try {
                    O(d5.m1());
                    i4++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i4 - this.lruEntries.size();
                    if (d5.t2()) {
                        this.journalWriter = L();
                    } else {
                        Q();
                    }
                    k2 k2Var = k2.f75408a;
                    kotlin.io.b.a(d5, null);
                    return;
                }
            }
        } finally {
        }
    }

    private final void O(String line) throws IOException {
        String substring;
        int o32 = v.o3(line, ' ', 0, false, 6, null);
        String s4 = ProtectedSandApp.s("ꁀ\u0001");
        if (o32 == -1) {
            throw new IOException(androidx.constraintlayout.core.motion.key.c.a(s4, line));
        }
        int i4 = o32 + 1;
        int o33 = v.o3(line, ' ', i4, false, 4, null);
        String s5 = ProtectedSandApp.s("ꁁ\u0001");
        String s6 = ProtectedSandApp.s("ꁂ\u0001");
        if (o33 == -1) {
            if (line == null) {
                throw new NullPointerException(s6);
            }
            substring = line.substring(i4);
            l0.o(substring, s5);
            String str = F;
            if (o32 == str.length() && v.s2(line, str, false, 2, null)) {
                this.lruEntries.remove(substring);
                return;
            }
        } else {
            if (line == null) {
                throw new NullPointerException(s6);
            }
            substring = line.substring(i4, o33);
            l0.o(substring, ProtectedSandApp.s("ꁃ\u0001"));
        }
        c cVar = this.lruEntries.get(substring);
        if (cVar == null) {
            cVar = new c(this, substring);
            this.lruEntries.put(substring, cVar);
        }
        if (o33 != -1) {
            String str2 = D;
            if (o32 == str2.length() && v.s2(line, str2, false, 2, null)) {
                int i5 = o33 + 1;
                if (line == null) {
                    throw new NullPointerException(s6);
                }
                String substring2 = line.substring(i5);
                l0.o(substring2, s5);
                List<String> Q4 = v.Q4(substring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(Q4);
                return;
            }
        }
        if (o33 == -1) {
            String str3 = E;
            if (o32 == str3.length() && v.s2(line, str3, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (o33 == -1) {
            String str4 = G;
            if (o32 == str4.length() && v.s2(line, str4, false, 2, null)) {
                return;
            }
        }
        throw new IOException(androidx.constraintlayout.core.motion.key.c.a(s4, line));
    }

    private final boolean Y() {
        for (c cVar : this.lruEntries.values()) {
            if (!cVar.getZombie()) {
                l0.o(cVar, ProtectedSandApp.s("ꁄ\u0001"));
                X(cVar);
                return true;
            }
        }
        return false;
    }

    private final void q0(String key) {
        if (C.k(key)) {
            return;
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("ꁅ\u0001") + key + kotlin.text.m0.quote).toString());
    }

    private final synchronized void s() {
        if (this.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ꁆ\u0001"));
        }
    }

    public static /* synthetic */ b z(d dVar, String str, long j4, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            j4 = B;
        }
        return dVar.y(str, j4);
    }

    public final synchronized void B() throws IOException {
        try {
            J();
            Collection<c> values = this.lruEntries.values();
            l0.o(values, ProtectedSandApp.s("ꁇ\u0001"));
            Object[] array = values.toArray(new c[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꁉ\u0001"));
            }
            for (c cVar : (c[]) array) {
                l0.o(cVar, ProtectedSandApp.s("ꁈ\u0001"));
                X(cVar);
            }
            this.mostRecentTrimFailed = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @m
    public final synchronized C1311d C(@l String key) throws IOException {
        l0.p(key, ProtectedSandApp.s("ꁊ\u0001"));
        J();
        s();
        q0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return null;
        }
        l0.o(cVar, ProtectedSandApp.s("ꁋ\u0001"));
        C1311d r4 = cVar.r();
        if (r4 == null) {
            return null;
        }
        this.redundantOpCount++;
        n nVar = this.journalWriter;
        l0.m(nVar);
        nVar.Q0(G).writeByte(32).Q0(key).writeByte(10);
        if (K()) {
            okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return r4;
    }

    /* renamed from: D, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    @l
    /* renamed from: E, reason: from getter */
    public final File getDirectory() {
        return this.directory;
    }

    @l
    /* renamed from: F, reason: from getter */
    public final okhttp3.internal.io.a getFileSystem() {
        return this.fileSystem;
    }

    @l
    public final LinkedHashMap<String, c> G() {
        return this.lruEntries;
    }

    public final synchronized long H() {
        return this.maxSize;
    }

    /* renamed from: I, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final synchronized void J() throws IOException {
        String s4 = ProtectedSandApp.s("ꁌ\u0001");
        String s5 = ProtectedSandApp.s("ꁍ\u0001");
        synchronized (this) {
            try {
                if (okhttp3.internal.d.f84463h && !Thread.holdsLock(this)) {
                    StringBuilder sb = new StringBuilder(s5);
                    Thread currentThread = Thread.currentThread();
                    l0.o(currentThread, ProtectedSandApp.s("ꁎ\u0001"));
                    sb.append(currentThread.getName());
                    sb.append(ProtectedSandApp.s("ꁏ\u0001"));
                    sb.append(this);
                    throw new AssertionError(sb.toString());
                }
                if (this.initialized) {
                    return;
                }
                if (this.fileSystem.b(this.journalFileBackup)) {
                    if (this.fileSystem.b(this.journalFile)) {
                        this.fileSystem.h(this.journalFileBackup);
                    } else {
                        this.fileSystem.g(this.journalFileBackup, this.journalFile);
                    }
                }
                this.civilizedFileSystem = okhttp3.internal.d.J(this.fileSystem, this.journalFileBackup);
                if (this.fileSystem.b(this.journalFile)) {
                    try {
                        N();
                        M();
                        this.initialized = true;
                        return;
                    } catch (IOException e4) {
                        j.INSTANCE.getClass();
                        j.f84863a.m(s4 + this.directory + ProtectedSandApp.s("ꁐ\u0001") + e4.getMessage() + ProtectedSandApp.s("ꁑ\u0001"), 5, e4);
                        try {
                            u();
                            this.closed = false;
                        } catch (Throwable th) {
                            this.closed = false;
                            throw th;
                        }
                    }
                }
                Q();
                this.initialized = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void Q() throws IOException {
        try {
            n nVar = this.journalWriter;
            if (nVar != null) {
                nVar.close();
            }
            n c5 = a0.c(this.fileSystem.f(this.journalFileTmp));
            try {
                c5.Q0(f84245z).writeByte(10);
                c5.Q0(A).writeByte(10);
                c5.N1(this.appVersion).writeByte(10);
                c5.N1(this.valueCount).writeByte(10);
                c5.writeByte(10);
                for (c cVar : this.lruEntries.values()) {
                    if (cVar.getCurrentEditor() != null) {
                        c5.Q0(E).writeByte(32);
                        c5.Q0(cVar.getKey());
                        c5.writeByte(10);
                    } else {
                        c5.Q0(D).writeByte(32);
                        c5.Q0(cVar.getKey());
                        cVar.s(c5);
                        c5.writeByte(10);
                    }
                }
                k2 k2Var = k2.f75408a;
                kotlin.io.b.a(c5, null);
                if (this.fileSystem.b(this.journalFile)) {
                    this.fileSystem.g(this.journalFile, this.journalFileBackup);
                }
                this.fileSystem.g(this.journalFileTmp, this.journalFile);
                this.fileSystem.h(this.journalFileBackup);
                this.journalWriter = L();
                this.hasJournalErrors = false;
                this.mostRecentRebuildFailed = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean S(@l String key) throws IOException {
        l0.p(key, ProtectedSandApp.s("ꁊ\u0001"));
        J();
        s();
        q0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return false;
        }
        l0.o(cVar, ProtectedSandApp.s("ꁒ\u0001"));
        boolean X = X(cVar);
        if (X && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return X;
    }

    public final boolean X(@l c entry) throws IOException {
        n nVar;
        l0.p(entry, ProtectedSandApp.s("ꁈ\u0001"));
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (nVar = this.journalWriter) != null) {
                nVar.Q0(E);
                nVar.writeByte(32);
                nVar.Q0(entry.getKey());
                nVar.writeByte(10);
                nVar.flush();
            }
            if (entry.getLockingSourceCount() > 0 || entry.getCurrentEditor() != null) {
                entry.q(true);
                return true;
            }
        }
        b currentEditor = entry.getCurrentEditor();
        if (currentEditor != null) {
            currentEditor.c();
        }
        int i4 = this.valueCount;
        for (int i5 = 0; i5 < i4; i5++) {
            this.fileSystem.h(entry.a().get(i5));
            this.size -= entry.getLengths()[i5];
            entry.getLengths()[i5] = 0;
        }
        this.redundantOpCount++;
        n nVar2 = this.journalWriter;
        if (nVar2 != null) {
            nVar2.Q0(F);
            nVar2.writeByte(32);
            nVar2.Q0(entry.getKey());
            nVar2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (K()) {
            okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void c0(boolean z4) {
        this.closed = z4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        b currentEditor;
        try {
            if (this.initialized && !this.closed) {
                Collection<c> values = this.lruEntries.values();
                l0.o(values, ProtectedSandApp.s("ꁇ\u0001"));
                Object[] array = values.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException(ProtectedSandApp.s("ꁉ\u0001"));
                }
                for (c cVar : (c[]) array) {
                    if (cVar.getCurrentEditor() != null && (currentEditor = cVar.getCurrentEditor()) != null) {
                        currentEditor.c();
                    }
                }
                o0();
                n nVar = this.journalWriter;
                l0.m(nVar);
                nVar.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.initialized) {
            s();
            o0();
            n nVar = this.journalWriter;
            l0.m(nVar);
            nVar.flush();
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void j0(long j4) {
        this.maxSize = j4;
        if (this.initialized) {
            okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    @l
    public final synchronized Iterator<C1311d> n0() throws IOException {
        J();
        return new g();
    }

    public final void o0() throws IOException {
        while (this.size > this.maxSize) {
            if (!Y()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    public final synchronized long size() throws IOException {
        J();
        return this.size;
    }

    public final synchronized void t(@l b editor, boolean success) throws IOException {
        l0.p(editor, ProtectedSandApp.s("ꁓ\u0001"));
        c entry = editor.getEntry();
        if (!l0.g(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException(ProtectedSandApp.s("ꁕ\u0001"));
        }
        if (success && !entry.getReadable()) {
            int i4 = this.valueCount;
            for (int i5 = 0; i5 < i4; i5++) {
                boolean[] written = editor.getWritten();
                l0.m(written);
                if (!written[i5]) {
                    editor.a();
                    throw new IllegalStateException(ProtectedSandApp.s("ꁔ\u0001") + i5);
                }
                if (!this.fileSystem.b(entry.c().get(i5))) {
                    editor.a();
                    return;
                }
            }
        }
        int i6 = this.valueCount;
        for (int i7 = 0; i7 < i6; i7++) {
            File file = entry.c().get(i7);
            if (!success || entry.getZombie()) {
                this.fileSystem.h(file);
            } else if (this.fileSystem.b(file)) {
                File file2 = entry.a().get(i7);
                this.fileSystem.g(file, file2);
                long j4 = entry.getLengths()[i7];
                long d5 = this.fileSystem.d(file2);
                entry.getLengths()[i7] = d5;
                this.size = (this.size - j4) + d5;
            }
        }
        entry.l(null);
        if (entry.getZombie()) {
            X(entry);
            return;
        }
        this.redundantOpCount++;
        n nVar = this.journalWriter;
        l0.m(nVar);
        if (!entry.getReadable() && !success) {
            this.lruEntries.remove(entry.getKey());
            nVar.Q0(F).writeByte(32);
            nVar.Q0(entry.getKey());
            nVar.writeByte(10);
            nVar.flush();
            if (this.size <= this.maxSize || K()) {
                okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
        }
        entry.o(true);
        nVar.Q0(D).writeByte(32);
        nVar.Q0(entry.getKey());
        entry.s(nVar);
        nVar.writeByte(10);
        if (success) {
            long j5 = this.nextSequenceNumber;
            this.nextSequenceNumber = 1 + j5;
            entry.p(j5);
        }
        nVar.flush();
        if (this.size <= this.maxSize) {
        }
        okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }

    public final void u() throws IOException {
        close();
        this.fileSystem.a(this.directory);
    }

    @m
    @kd.j
    public final b x(@l String str) throws IOException {
        return z(this, str, 0L, 2, null);
    }

    @m
    @kd.j
    public final synchronized b y(@l String key, long expectedSequenceNumber) throws IOException {
        l0.p(key, ProtectedSandApp.s("ꁊ\u0001"));
        J();
        s();
        q0(key);
        c cVar = this.lruEntries.get(key);
        if (expectedSequenceNumber != B && (cVar == null || cVar.getSequenceNumber() != expectedSequenceNumber)) {
            return null;
        }
        if ((cVar != null ? cVar.getCurrentEditor() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.getLockingSourceCount() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            n nVar = this.journalWriter;
            l0.m(nVar);
            nVar.Q0(E).writeByte(32).Q0(key).writeByte(10);
            nVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.lruEntries.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }
}
