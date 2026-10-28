package okhttp3.internal.cache;

import com.flashget.kidsdownloader.ProtectedSandApp;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.text.Regex;
import kotlin.text.Typography;
import kotlin.text.e0;
import kotlin.text.h0;
import okio.a0;
import okio.m0;
import okio.n;
import okio.o;
import okio.o0;
import okio.s;
import org.apache.commons.io.k;
import p3.j;
import q3.l;

/* compiled from: DiskLruCache.kt */
@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b*\u0001]\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0004stuvB9\b\u0000\u0012\u0006\u0010f\u001a\u00020a\u0012\u0006\u0010i\u001a\u000204\u0012\u0006\u0010k\u001a\u00020F\u0012\u0006\u0010n\u001a\u00020F\u0012\u0006\u00103\u001a\u00020\u0016\u0012\u0006\u0010p\u001a\u00020o¢\u0006\u0004\bq\u0010rJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002J \u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007J\u0006\u0010\u001a\u001a\u00020\u0016J#\u0010\u001d\u001a\u00020\u00032\n\u0010\u001b\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010\"\u001a\u00020\u000b2\n\u0010!\u001a\u00060 R\u00020\u0000H\u0000¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\u0003H\u0016J\u0006\u0010%\u001a\u00020\u000bJ\b\u0010&\u001a\u00020\u0003H\u0016J\u0006\u0010'\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u0003J\u0006\u0010)\u001a\u00020\u0003J\u0010\u0010+\u001a\f\u0012\b\u0012\u00060\u0014R\u00020\u00000*R*\u00103\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00109\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u0014\u0010;\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010.R\u0018\u0010?\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010E\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060 R\u00020\u00000@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010K\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010CR\u0016\u0010M\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010CR\u0016\u0010O\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010CR\"\u0010T\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010C\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010CR\u0016\u0010W\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010CR\u0016\u0010Y\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010.R\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001a\u0010f\u001a\u00020a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0017\u0010i\u001a\u0002048\u0006¢\u0006\f\n\u0004\b\u0019\u00106\u001a\u0004\bg\u0010hR\u0014\u0010k\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010HR\u001a\u0010n\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010H\u001a\u0004\bl\u0010m¨\u0006w"}, d2 = {"Lokhttp3/internal/cache/d;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lkotlin/m2;", "k0", "Lokio/n;", "g0", "", "line", "l0", "i0", "", "f0", "z", "p0", "key", "F0", "e0", "m0", "()V", "Lokhttp3/internal/cache/d$d;", "P", "", "expectedSequenceNumber", "Lokhttp3/internal/cache/d$b;", "G", "size", "editor", "success", "B", "(Lokhttp3/internal/cache/d$b;Z)V", "n0", "Lokhttp3/internal/cache/d$c;", "entry", "o0", "(Lokhttp3/internal/cache/d$c;)Z", "flush", "isClosed", "close", "E0", "D", "O", "", "B0", "value", "o", "J", "b0", "()J", "A0", "(J)V", "maxSize", "Ljava/io/File;", "p", "Ljava/io/File;", "journalFile", "q", "journalFileTmp", "r", "journalFileBackup", "s", "t", "Lokio/n;", "journalWriter", "Ljava/util/LinkedHashMap;", "u", "Ljava/util/LinkedHashMap;", "Z", "()Ljava/util/LinkedHashMap;", "lruEntries", "", "v", "I", "redundantOpCount", "w", "hasJournalErrors", "x", "civilizedFileSystem", "y", "initialized", "R", "()Z", "y0", "(Z)V", "closed", "A", "mostRecentTrimFailed", "mostRecentRebuildFailed", "C", "nextSequenceNumber", "Lokhttp3/internal/concurrent/c;", "Lokhttp3/internal/concurrent/c;", "cleanupQueue", "okhttp3/internal/cache/d$e", "E", "Lokhttp3/internal/cache/d$e;", "cleanupTask", "Lokhttp3/internal/io/a;", "F", "Lokhttp3/internal/io/a;", "X", "()Lokhttp3/internal/io/a;", "fileSystem", "U", "()Ljava/io/File;", "directory", "H", "appVersion", "d0", "()I", "valueCount", "Lokhttp3/internal/concurrent/d;", "taskRunner", "<init>", "(Lokhttp3/internal/io/a;Ljava/io/File;IIJLokhttp3/internal/concurrent/d;)V", "a", "b", "c", "d", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class d implements Closeable, Flushable {

    /* renamed from: A, reason: from kotlin metadata */
    private boolean mostRecentTrimFailed;

    /* renamed from: B, reason: from kotlin metadata */
    private boolean mostRecentRebuildFailed;

    /* renamed from: C, reason: from kotlin metadata */
    private long nextSequenceNumber;

    /* renamed from: D, reason: from kotlin metadata */
    private final okhttp3.internal.concurrent.c cleanupQueue;

    /* renamed from: E, reason: from kotlin metadata */
    private final e cleanupTask;

    /* renamed from: F, reason: from kotlin metadata */
    @d5.d
    private final okhttp3.internal.io.a fileSystem;

    /* renamed from: G, reason: from kotlin metadata */
    @d5.d
    private final File directory;

    /* renamed from: H, reason: from kotlin metadata */
    private final int appVersion;

    /* renamed from: I, reason: from kotlin metadata */
    private final int valueCount;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long maxSize;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final File journalFile;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final File journalFileTmp;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final File journalFileBackup;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private n journalWriter;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final LinkedHashMap<String, c> lruEntries;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int redundantOpCount;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean hasJournalErrors;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean civilizedFileSystem;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    @d5.d
    @p3.f
    public static final String J = ProtectedSandApp.s("愑");

    @d5.d
    @p3.f
    public static final String K = ProtectedSandApp.s("愒");

    @d5.d
    @p3.f
    public static final String L = ProtectedSandApp.s("愓");

    @d5.d
    @p3.f
    public static final String M = ProtectedSandApp.s("愔");

    @d5.d
    @p3.f
    public static final String N = ProtectedSandApp.s("愕");

    @p3.f
    public static final long O = -1;

    @d5.d
    @p3.f
    public static final Regex P = new Regex(ProtectedSandApp.s("愖"));

    @d5.d
    @p3.f
    public static final String Q = ProtectedSandApp.s("愗");

    @d5.d
    @p3.f
    public static final String R = ProtectedSandApp.s("愘");

    @d5.d
    @p3.f
    public static final String S = ProtectedSandApp.s("愙");

    @d5.d
    @p3.f
    public static final String T = ProtectedSandApp.s("愚");

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u001a\u001a\u00060\u0015R\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001e\u0010\u001a\u001a\u00060\u0015R\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/cache/d$b;", "", "Lkotlin/m2;", "c", "()V", "", "index", "Lokio/o0;", "g", "Lokio/m0;", "f", "b", "a", "", "[Z", "e", "()[Z", "written", "", "Z", "done", "Lokhttp3/internal/cache/d$c;", "Lokhttp3/internal/cache/d;", "Lokhttp3/internal/cache/d$c;", "d", "()Lokhttp3/internal/cache/d$c;", "entry", "<init>", "(Lokhttp3/internal/cache/d;Lokhttp3/internal/cache/d$c;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final boolean[] written;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final c entry;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f30749d;

        /* compiled from: DiskLruCache.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/io/IOException;", "it", "Lkotlin/m2;", "a", "(Ljava/io/IOException;)V", "okhttp3/internal/cache/DiskLruCache$Editor$newSink$1$1"}, k = 3, mv = {1, 4, 0})
        /* loaded from: classes6.dex */
        static final class a extends Lambda implements l<IOException, m2> {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f30751q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i5) {
                super(1);
                this.f30751q = i5;
            }

            @Override // q3.l
            public /* bridge */ /* synthetic */ m2 N(IOException iOException) {
                a(iOException);
                return m2.f23662a;
            }

            public final void a(@d5.d IOException iOException) {
                l0.p(iOException, ProtectedSandApp.s("醟"));
                synchronized (b.this.f30749d) {
                    b.this.c();
                    m2 m2Var = m2.f23662a;
                }
            }
        }

        public b(@d5.d d dVar, c cVar) {
            l0.p(cVar, ProtectedSandApp.s("惾"));
            this.f30749d = dVar;
            this.entry = cVar;
            this.written = cVar.getReadable() ? null : new boolean[dVar.getValueCount()];
        }

        public final void a() throws IOException {
            synchronized (this.f30749d) {
                if (!(!this.done)) {
                    throw new IllegalStateException(ProtectedSandApp.s("惿").toString());
                }
                if (l0.g(this.entry.getCurrentEditor(), this)) {
                    this.f30749d.B(this, false);
                }
                this.done = true;
                m2 m2Var = m2.f23662a;
            }
        }

        public final void b() throws IOException {
            synchronized (this.f30749d) {
                if (!(!this.done)) {
                    throw new IllegalStateException(ProtectedSandApp.s("愀").toString());
                }
                if (l0.g(this.entry.getCurrentEditor(), this)) {
                    this.f30749d.B(this, true);
                }
                this.done = true;
                m2 m2Var = m2.f23662a;
            }
        }

        public final void c() {
            if (l0.g(this.entry.getCurrentEditor(), this)) {
                if (this.f30749d.civilizedFileSystem) {
                    this.f30749d.B(this, false);
                } else {
                    this.entry.q(true);
                }
            }
        }

        @d5.d
        /* renamed from: d, reason: from getter */
        public final c getEntry() {
            return this.entry;
        }

        @d5.e
        /* renamed from: e, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        @d5.d
        public final m0 f(int index) {
            synchronized (this.f30749d) {
                if (!(!this.done)) {
                    throw new IllegalStateException(ProtectedSandApp.s("愁").toString());
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
                    return new okhttp3.internal.cache.e(this.f30749d.getFileSystem().b(this.entry.c().get(index)), new a(index));
                } catch (FileNotFoundException unused) {
                    return a0.b();
                }
            }
        }

        @d5.e
        public final o0 g(int index) {
            synchronized (this.f30749d) {
                if (!(!this.done)) {
                    throw new IllegalStateException(ProtectedSandApp.s("愂").toString());
                }
                o0 o0Var = null;
                if (!this.entry.getReadable() || (!l0.g(this.entry.getCurrentEditor(), this)) || this.entry.getZombie()) {
                    return null;
                }
                try {
                    o0Var = this.f30749d.getFileSystem().a(this.entry.a().get(index));
                } catch (FileNotFoundException unused) {
                }
                return o0Var;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010D\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0018\u00010\u0012R\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\"\u0010 R\"\u0010+\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010.\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R(\u00105\u001a\b\u0018\u00010/R\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b\u001e\u00102\"\u0004\b3\u00104R\"\u0010:\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u00106\u001a\u0004\b0\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@R\u001a\u0010D\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010B\u001a\u0004\b%\u0010C¨\u0006G"}, d2 = {"Lokhttp3/internal/cache/d$c;", "", "", "", "strings", "", "j", "", "index", "Lokio/o0;", "k", "Lkotlin/m2;", "m", "(Ljava/util/List;)V", "Lokio/n;", "writer", "s", "(Lokio/n;)V", "Lokhttp3/internal/cache/d$d;", "Lokhttp3/internal/cache/d;", "r", "()Lokhttp3/internal/cache/d$d;", "", "a", "[J", "e", "()[J", "lengths", "", "Ljava/io/File;", "b", "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "c", "dirtyFiles", "", "d", "Z", "g", "()Z", "o", "(Z)V", "readable", "i", "q", "zombie", "Lokhttp3/internal/cache/d$b;", "f", "Lokhttp3/internal/cache/d$b;", "()Lokhttp3/internal/cache/d$b;", "l", "(Lokhttp3/internal/cache/d$b;)V", "currentEditor", "I", "()I", "n", "(I)V", "lockingSourceCount", "", "h", "J", "()J", "p", "(J)V", "sequenceNumber", "Ljava/lang/String;", "()Ljava/lang/String;", "key", "<init>", "(Lokhttp3/internal/cache/d;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final long[] lengths;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final List<File> cleanFiles;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final List<File> dirtyFiles;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean readable;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean zombie;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private b currentEditor;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int lockingSourceCount;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private long sequenceNumber;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final String key;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ d f30761j;

        /* compiled from: DiskLruCache.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"okhttp3/internal/cache/d$c$a", "Lokio/s;", "Lkotlin/m2;", "close", "", "p", "Z", "closed", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes6.dex */
        public static final class a extends s {

            /* renamed from: p, reason: collision with root package name and from kotlin metadata */
            private boolean closed;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ o0 f30764r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, o0 o0Var2) {
                super(o0Var2);
                this.f30764r = o0Var;
            }

            @Override // okio.s, okio.o0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.closed) {
                    return;
                }
                this.closed = true;
                synchronized (c.this.f30761j) {
                    c.this.n(r1.getLockingSourceCount() - 1);
                    if (c.this.getLockingSourceCount() == 0 && c.this.getZombie()) {
                        c cVar = c.this;
                        cVar.f30761j.o0(cVar);
                    }
                    m2 m2Var = m2.f23662a;
                }
            }
        }

        public c(@d5.d d dVar, String str) {
            l0.p(str, ProtectedSandApp.s("愃"));
            this.f30761j = dVar;
            this.key = str;
            this.lengths = new long[dVar.getValueCount()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append(k.f32026a);
            int length = sb.length();
            int valueCount = dVar.getValueCount();
            for (int i5 = 0; i5 < valueCount; i5++) {
                sb.append(i5);
                this.cleanFiles.add(new File(dVar.getDirectory(), sb.toString()));
                sb.append(ProtectedSandApp.s("愄"));
                this.dirtyFiles.add(new File(dVar.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void j(List<String> strings) throws IOException {
            throw new IOException(ProtectedSandApp.s("愅") + strings);
        }

        private final o0 k(int index) {
            o0 a6 = this.f30761j.getFileSystem().a(this.cleanFiles.get(index));
            if (this.f30761j.civilizedFileSystem) {
                return a6;
            }
            this.lockingSourceCount++;
            return new a(a6, a6);
        }

        @d5.d
        public final List<File> a() {
            return this.cleanFiles;
        }

        @d5.e
        /* renamed from: b, reason: from getter */
        public final b getCurrentEditor() {
            return this.currentEditor;
        }

        @d5.d
        public final List<File> c() {
            return this.dirtyFiles;
        }

        @d5.d
        /* renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @d5.d
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

        public final void l(@d5.e b bVar) {
            this.currentEditor = bVar;
        }

        public final void m(@d5.d List<String> strings) throws IOException {
            l0.p(strings, ProtectedSandApp.s("愆"));
            if (strings.size() != this.f30761j.getValueCount()) {
                j(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i5 = 0; i5 < size; i5++) {
                    this.lengths[i5] = Long.parseLong(strings.get(i5));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void n(int i5) {
            this.lockingSourceCount = i5;
        }

        public final void o(boolean z5) {
            this.readable = z5;
        }

        public final void p(long j5) {
            this.sequenceNumber = j5;
        }

        public final void q(boolean z5) {
            this.zombie = z5;
        }

        @d5.e
        public final C0472d r() {
            d dVar = this.f30761j;
            if (okhttp3.internal.d.f30936h && !Thread.holdsLock(dVar)) {
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("愇"));
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("愈"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("愉"));
                sb.append(dVar);
                throw new AssertionError(sb.toString());
            }
            if (!this.readable) {
                return null;
            }
            if (!this.f30761j.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount = this.f30761j.getValueCount();
                for (int i5 = 0; i5 < valueCount; i5++) {
                    arrayList.add(k(i5));
                }
                return new C0472d(this.f30761j, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    okhttp3.internal.d.l((o0) it.next());
                }
                try {
                    this.f30761j.o0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(@d5.d n writer) throws IOException {
            l0.p(writer, ProtectedSandApp.s("愊"));
            for (long j5 : this.lengths) {
                writer.writeByte(32).j1(j5);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/cache/d$d;", "Ljava/io/Closeable;", "", "d", "Lokhttp3/internal/cache/d$b;", "Lokhttp3/internal/cache/d;", "a", "", "index", "Lokio/o0;", "c", "", "b", "Lkotlin/m2;", "close", "o", "Ljava/lang/String;", "key", "p", "J", "sequenceNumber", "", "q", "Ljava/util/List;", "sources", "", "r", "[J", "lengths", "<init>", "(Lokhttp3/internal/cache/d;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.cache.d$d, reason: collision with other inner class name */
    public final class C0472d implements Closeable {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final long sequenceNumber;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final List<o0> sources;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final long[] lengths;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ d f30769s;

        /* JADX WARN: Multi-variable type inference failed */
        public C0472d(@d5.d d dVar, String str, @d5.d long j5, @d5.d List<? extends o0> list, long[] jArr) {
            l0.p(str, ProtectedSandApp.s("愋"));
            l0.p(list, ProtectedSandApp.s("愌"));
            l0.p(jArr, ProtectedSandApp.s("愍"));
            this.f30769s = dVar;
            this.key = str;
            this.sequenceNumber = j5;
            this.sources = list;
            this.lengths = jArr;
        }

        @d5.e
        public final b a() throws IOException {
            return this.f30769s.G(this.key, this.sequenceNumber);
        }

        public final long b(int index) {
            return this.lengths[index];
        }

        @d5.d
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

        @d5.d
        /* renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/internal/cache/d$e", "Lokhttp3/internal/concurrent/a;", "", "f", "okhttp"}, k = 1, mv = {1, 4, 0})
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
                    d.this.E0();
                } catch (IOException unused) {
                    d.this.mostRecentTrimFailed = true;
                }
                try {
                    if (d.this.f0()) {
                        d.this.m0();
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
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "Lkotlin/m2;", "a", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    static final class f extends Lambda implements l<IOException, m2> {
        f() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(IOException iOException) {
            a(iOException);
            return m2.f23662a;
        }

        public final void a(@d5.d IOException iOException) {
            l0.p(iOException, ProtectedSandApp.s("醠"));
            d dVar = d.this;
            if (!okhttp3.internal.d.f30936h || Thread.holdsLock(dVar)) {
                d.this.hasJournalErrors = true;
                return;
            }
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("醡"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("醢"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("醣"));
            sb.append(dVar);
            throw new AssertionError(sb.toString());
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0002J\r\u0010\u0006\u001a\u00060\u0002R\u00020\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R*\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012 \n*\b\u0018\u00010\tR\u00020\u00030\tR\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"okhttp3/internal/cache/d$g", "", "Lokhttp3/internal/cache/d$d;", "Lokhttp3/internal/cache/d;", "", "hasNext", "a", "Lkotlin/m2;", "remove", "Lokhttp3/internal/cache/d$c;", "kotlin.jvm.PlatformType", "o", "Ljava/util/Iterator;", "delegate", "p", "Lokhttp3/internal/cache/d$d;", "nextSnapshot", "q", "removeSnapshot", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes6.dex */
    public static final class g implements Iterator<C0472d>, r3.d {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final Iterator<c> delegate;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private C0472d nextSnapshot;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private C0472d removeSnapshot;

        g() {
            Iterator<c> it = new ArrayList(d.this.Z().values()).iterator();
            l0.o(it, ProtectedSandApp.s("醤"));
            this.delegate = it;
        }

        @Override // java.util.Iterator
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0472d next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            C0472d c0472d = this.nextSnapshot;
            this.removeSnapshot = c0472d;
            this.nextSnapshot = null;
            l0.m(c0472d);
            return c0472d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            C0472d r5;
            if (this.nextSnapshot != null) {
                return true;
            }
            synchronized (d.this) {
                if (d.this.getClosed()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    c next = this.delegate.next();
                    if (next != null && (r5 = next.r()) != null) {
                        this.nextSnapshot = r5;
                        return true;
                    }
                }
                m2 m2Var = m2.f23662a;
                return false;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            C0472d c0472d = this.removeSnapshot;
            if (c0472d == null) {
                throw new IllegalStateException(ProtectedSandApp.s("醥").toString());
            }
            try {
                d.this.n0(c0472d.getKey());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.removeSnapshot = null;
                throw th;
            }
            this.removeSnapshot = null;
        }
    }

    public d(@d5.d okhttp3.internal.io.a aVar, @d5.d File file, int i5, int i6, long j5, @d5.d okhttp3.internal.concurrent.d dVar) {
        l0.p(aVar, ProtectedSandApp.s("愛"));
        l0.p(file, ProtectedSandApp.s("愜"));
        l0.p(dVar, ProtectedSandApp.s("愝"));
        this.fileSystem = aVar;
        this.directory = file;
        this.appVersion = i5;
        this.valueCount = i6;
        this.maxSize = j5;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = dVar.j();
        this.cleanupTask = new e(androidx.concurrent.futures.a.a(new StringBuilder(), okhttp3.internal.d.f30937i, ProtectedSandApp.s("愞")));
        if (!(j5 > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("愠").toString());
        }
        if (!(i6 > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("感").toString());
        }
        this.journalFile = new File(file, J);
        this.journalFileTmp = new File(file, K);
        this.journalFileBackup = new File(file, L);
    }

    private final void F0(String str) {
        if (P.k(str)) {
            return;
        }
        throw new IllegalArgumentException((ProtectedSandApp.s("愡") + str + Typography.f27126b).toString());
    }

    public static /* synthetic */ b H(d dVar, String str, long j5, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            j5 = O;
        }
        return dVar.G(str, j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f0() {
        int i5 = this.redundantOpCount;
        return i5 >= 2000 && i5 >= this.lruEntries.size();
    }

    private final n g0() throws FileNotFoundException {
        return a0.c(new okhttp3.internal.cache.e(this.fileSystem.g(this.journalFile), new f()));
    }

    private final void i0() throws IOException {
        this.fileSystem.f(this.journalFileTmp);
        Iterator<c> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            l0.o(next, ProtectedSandApp.s("愢"));
            c cVar = next;
            int i5 = 0;
            if (cVar.getCurrentEditor() == null) {
                int i6 = this.valueCount;
                while (i5 < i6) {
                    this.size += cVar.getLengths()[i5];
                    i5++;
                }
            } else {
                cVar.l(null);
                int i7 = this.valueCount;
                while (i5 < i7) {
                    this.fileSystem.f(cVar.a().get(i5));
                    this.fileSystem.f(cVar.c().get(i5));
                    i5++;
                }
                it.remove();
            }
        }
    }

    private final void k0() throws IOException {
        String s5 = ProtectedSandApp.s("愣");
        String s6 = ProtectedSandApp.s("愤");
        o d6 = a0.d(this.fileSystem.a(this.journalFile));
        try {
            String G0 = d6.G0();
            String G02 = d6.G0();
            String G03 = d6.G0();
            String G04 = d6.G0();
            String G05 = d6.G0();
            if (!(!l0.g(M, G0)) && !(!l0.g(N, G02)) && !(!l0.g(String.valueOf(this.appVersion), G03)) && !(!l0.g(String.valueOf(this.valueCount), G04))) {
                int i5 = 0;
                if (!(G05.length() > 0)) {
                    while (true) {
                        try {
                            l0(d6.G0());
                            i5++;
                        } catch (EOFException unused) {
                            this.redundantOpCount = i5 - this.lruEntries.size();
                            if (d6.M()) {
                                this.journalWriter = g0();
                            } else {
                                m0();
                            }
                            m2 m2Var = m2.f23662a;
                            kotlin.io.b.a(d6, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException(s6 + G0 + s5 + G02 + s5 + G04 + s5 + G05 + ']');
        } finally {
        }
    }

    private final void l0(String str) throws IOException {
        int o32;
        int o33;
        String substring;
        boolean s22;
        boolean s23;
        boolean s24;
        List<String> Q4;
        boolean s25;
        o32 = h0.o3(str, ' ', 0, false, 6, null);
        String s5 = ProtectedSandApp.s("愥");
        if (o32 == -1) {
            throw new IOException(androidx.constraintlayout.motion.widget.g.a(s5, str));
        }
        int i5 = o32 + 1;
        o33 = h0.o3(str, ' ', i5, false, 4, null);
        String s6 = ProtectedSandApp.s("愦");
        String s7 = ProtectedSandApp.s("愧");
        if (o33 == -1) {
            if (str == null) {
                throw new NullPointerException(s7);
            }
            substring = str.substring(i5);
            l0.o(substring, s6);
            String str2 = S;
            if (o32 == str2.length()) {
                s25 = e0.s2(str, str2, false, 2, null);
                if (s25) {
                    this.lruEntries.remove(substring);
                    return;
                }
            }
        } else {
            if (str == null) {
                throw new NullPointerException(s7);
            }
            substring = str.substring(i5, o33);
            l0.o(substring, ProtectedSandApp.s("愨"));
        }
        c cVar = this.lruEntries.get(substring);
        if (cVar == null) {
            cVar = new c(this, substring);
            this.lruEntries.put(substring, cVar);
        }
        if (o33 != -1) {
            String str3 = Q;
            if (o32 == str3.length()) {
                s24 = e0.s2(str, str3, false, 2, null);
                if (s24) {
                    int i6 = o33 + 1;
                    if (str == null) {
                        throw new NullPointerException(s7);
                    }
                    String substring2 = str.substring(i6);
                    l0.o(substring2, s6);
                    Q4 = h0.Q4(substring2, new char[]{' '}, false, 0, 6, null);
                    cVar.o(true);
                    cVar.l(null);
                    cVar.m(Q4);
                    return;
                }
            }
        }
        if (o33 == -1) {
            String str4 = R;
            if (o32 == str4.length()) {
                s23 = e0.s2(str, str4, false, 2, null);
                if (s23) {
                    cVar.l(new b(this, cVar));
                    return;
                }
            }
        }
        if (o33 == -1) {
            String str5 = T;
            if (o32 == str5.length()) {
                s22 = e0.s2(str, str5, false, 2, null);
                if (s22) {
                    return;
                }
            }
        }
        throw new IOException(androidx.constraintlayout.motion.widget.g.a(s5, str));
    }

    private final boolean p0() {
        for (c cVar : this.lruEntries.values()) {
            if (!cVar.getZombie()) {
                l0.o(cVar, ProtectedSandApp.s("愩"));
                o0(cVar);
                return true;
            }
        }
        return false;
    }

    private final synchronized void z() {
        if (!(!this.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("愪").toString());
        }
    }

    public final synchronized void A0(long j5) {
        this.maxSize = j5;
        if (this.initialized) {
            okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized void B(@d5.d b editor, boolean success) throws IOException {
        l0.p(editor, ProtectedSandApp.s("愫"));
        c entry = editor.getEntry();
        if (!l0.g(entry.getCurrentEditor(), editor)) {
            throw new IllegalStateException(ProtectedSandApp.s("愭").toString());
        }
        if (success && !entry.getReadable()) {
            int i5 = this.valueCount;
            for (int i6 = 0; i6 < i5; i6++) {
                boolean[] written = editor.getWritten();
                l0.m(written);
                if (!written[i6]) {
                    editor.a();
                    throw new IllegalStateException(ProtectedSandApp.s("愬") + i6);
                }
                if (!this.fileSystem.d(entry.c().get(i6))) {
                    editor.a();
                    return;
                }
            }
        }
        int i7 = this.valueCount;
        for (int i8 = 0; i8 < i7; i8++) {
            File file = entry.c().get(i8);
            if (!success || entry.getZombie()) {
                this.fileSystem.f(file);
            } else if (this.fileSystem.d(file)) {
                File file2 = entry.a().get(i8);
                this.fileSystem.e(file, file2);
                long j5 = entry.getLengths()[i8];
                long h5 = this.fileSystem.h(file2);
                entry.getLengths()[i8] = h5;
                this.size = (this.size - j5) + h5;
            }
        }
        entry.l(null);
        if (entry.getZombie()) {
            o0(entry);
            return;
        }
        this.redundantOpCount++;
        n nVar = this.journalWriter;
        l0.m(nVar);
        if (!entry.getReadable() && !success) {
            this.lruEntries.remove(entry.getKey());
            nVar.j0(S).writeByte(32);
            nVar.j0(entry.getKey());
            nVar.writeByte(10);
            nVar.flush();
            if (this.size <= this.maxSize || f0()) {
                okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
        }
        entry.o(true);
        nVar.j0(Q).writeByte(32);
        nVar.j0(entry.getKey());
        entry.s(nVar);
        nVar.writeByte(10);
        if (success) {
            long j6 = this.nextSequenceNumber;
            this.nextSequenceNumber = 1 + j6;
            entry.p(j6);
        }
        nVar.flush();
        if (this.size <= this.maxSize) {
        }
        okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
    }

    @d5.d
    public final synchronized Iterator<C0472d> B0() throws IOException {
        e0();
        return new g();
    }

    public final void D() throws IOException {
        close();
        this.fileSystem.c(this.directory);
    }

    public final void E0() throws IOException {
        while (this.size > this.maxSize) {
            if (!p0()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    @d5.e
    @j
    public final b F(@d5.d String str) throws IOException {
        return H(this, str, 0L, 2, null);
    }

    @d5.e
    @j
    public final synchronized b G(@d5.d String key, long expectedSequenceNumber) throws IOException {
        l0.p(key, ProtectedSandApp.s("愮"));
        e0();
        z();
        F0(key);
        c cVar = this.lruEntries.get(key);
        if (expectedSequenceNumber != O && (cVar == null || cVar.getSequenceNumber() != expectedSequenceNumber)) {
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
            nVar.j0(R).writeByte(32).j0(key).writeByte(10);
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

    public final synchronized void O() throws IOException {
        e0();
        Collection<c> values = this.lruEntries.values();
        l0.o(values, ProtectedSandApp.s("愯"));
        Object[] array = values.toArray(new c[0]);
        if (array == null) {
            throw new NullPointerException(ProtectedSandApp.s("愱"));
        }
        for (c cVar : (c[]) array) {
            l0.o(cVar, ProtectedSandApp.s("愰"));
            o0(cVar);
        }
        this.mostRecentTrimFailed = false;
    }

    @d5.e
    public final synchronized C0472d P(@d5.d String key) throws IOException {
        l0.p(key, ProtectedSandApp.s("愲"));
        e0();
        z();
        F0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return null;
        }
        l0.o(cVar, ProtectedSandApp.s("愳"));
        C0472d r5 = cVar.r();
        if (r5 == null) {
            return null;
        }
        this.redundantOpCount++;
        n nVar = this.journalWriter;
        l0.m(nVar);
        nVar.j0(T).writeByte(32).j0(key).writeByte(10);
        if (f0()) {
            okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return r5;
    }

    /* renamed from: R, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    @d5.d
    /* renamed from: U, reason: from getter */
    public final File getDirectory() {
        return this.directory;
    }

    @d5.d
    /* renamed from: X, reason: from getter */
    public final okhttp3.internal.io.a getFileSystem() {
        return this.fileSystem;
    }

    @d5.d
    public final LinkedHashMap<String, c> Z() {
        return this.lruEntries;
    }

    public final synchronized long b0() {
        return this.maxSize;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        b currentEditor;
        if (this.initialized && !this.closed) {
            Collection<c> values = this.lruEntries.values();
            l0.o(values, ProtectedSandApp.s("愴"));
            Object[] array = values.toArray(new c[0]);
            if (array == null) {
                throw new NullPointerException(ProtectedSandApp.s("愵"));
            }
            for (c cVar : (c[]) array) {
                if (cVar.getCurrentEditor() != null && (currentEditor = cVar.getCurrentEditor()) != null) {
                    currentEditor.c();
                }
            }
            E0();
            n nVar = this.journalWriter;
            l0.m(nVar);
            nVar.close();
            this.journalWriter = null;
            this.closed = true;
            return;
        }
        this.closed = true;
    }

    /* renamed from: d0, reason: from getter */
    public final int getValueCount() {
        return this.valueCount;
    }

    public final synchronized void e0() throws IOException {
        String s5 = ProtectedSandApp.s("愶");
        String s6 = ProtectedSandApp.s("愷");
        synchronized (this) {
            if (okhttp3.internal.d.f30936h && !Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder(s6);
                Thread currentThread = Thread.currentThread();
                l0.o(currentThread, ProtectedSandApp.s("愸"));
                sb.append(currentThread.getName());
                sb.append(ProtectedSandApp.s("愹"));
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.d(this.journalFileBackup)) {
                if (this.fileSystem.d(this.journalFile)) {
                    this.fileSystem.f(this.journalFileBackup);
                } else {
                    this.fileSystem.e(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = okhttp3.internal.d.J(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.d(this.journalFile)) {
                try {
                    k0();
                    i0();
                    this.initialized = true;
                    return;
                } catch (IOException e6) {
                    okhttp3.internal.platform.j.INSTANCE.getClass();
                    okhttp3.internal.platform.j.f31323a.m(s5 + this.directory + ProtectedSandApp.s("愺") + e6.getMessage() + ProtectedSandApp.s("愻"), 5, e6);
                    try {
                        D();
                        this.closed = false;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            m0();
            this.initialized = true;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.initialized) {
            z();
            E0();
            n nVar = this.journalWriter;
            l0.m(nVar);
            nVar.flush();
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void m0() throws IOException {
        n nVar = this.journalWriter;
        if (nVar != null) {
            nVar.close();
        }
        n c6 = a0.c(this.fileSystem.b(this.journalFileTmp));
        try {
            c6.j0(M).writeByte(10);
            c6.j0(N).writeByte(10);
            c6.j1(this.appVersion).writeByte(10);
            c6.j1(this.valueCount).writeByte(10);
            c6.writeByte(10);
            for (c cVar : this.lruEntries.values()) {
                if (cVar.getCurrentEditor() != null) {
                    c6.j0(R).writeByte(32);
                    c6.j0(cVar.getKey());
                    c6.writeByte(10);
                } else {
                    c6.j0(Q).writeByte(32);
                    c6.j0(cVar.getKey());
                    cVar.s(c6);
                    c6.writeByte(10);
                }
            }
            m2 m2Var = m2.f23662a;
            kotlin.io.b.a(c6, null);
            if (this.fileSystem.d(this.journalFile)) {
                this.fileSystem.e(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.e(this.journalFileTmp, this.journalFile);
            this.fileSystem.f(this.journalFileBackup);
            this.journalWriter = g0();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } finally {
        }
    }

    public final synchronized boolean n0(@d5.d String key) throws IOException {
        l0.p(key, ProtectedSandApp.s("愼"));
        e0();
        z();
        F0(key);
        c cVar = this.lruEntries.get(key);
        if (cVar == null) {
            return false;
        }
        l0.o(cVar, ProtectedSandApp.s("愽"));
        boolean o02 = o0(cVar);
        if (o02 && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return o02;
    }

    public final boolean o0(@d5.d c entry) throws IOException {
        n nVar;
        l0.p(entry, ProtectedSandApp.s("愾"));
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount() > 0 && (nVar = this.journalWriter) != null) {
                nVar.j0(R);
                nVar.writeByte(32);
                nVar.j0(entry.getKey());
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
        int i5 = this.valueCount;
        for (int i6 = 0; i6 < i5; i6++) {
            this.fileSystem.f(entry.a().get(i6));
            this.size -= entry.getLengths()[i6];
            entry.getLengths()[i6] = 0;
        }
        this.redundantOpCount++;
        n nVar2 = this.journalWriter;
        if (nVar2 != null) {
            nVar2.j0(S);
            nVar2.writeByte(32);
            nVar2.j0(entry.getKey());
            nVar2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey());
        if (f0()) {
            okhttp3.internal.concurrent.c.p(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final synchronized long size() throws IOException {
        e0();
        return this.size;
    }

    public final void y0(boolean z5) {
        this.closed = z5;
    }
}
