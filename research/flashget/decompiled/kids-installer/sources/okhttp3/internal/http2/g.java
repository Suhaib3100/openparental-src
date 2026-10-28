package okhttp3.internal.http2;

import android.content.preferences.protobuf.v;
import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.internal.http2.c;
import okio.m;
import okio.o;
import okio.o0;
import okio.p;
import okio.q0;

/* compiled from: Http2Reader.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0003+\u001a\u0017B\u0017\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\bH\u0016R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010'¨\u0006,"}, d2 = {"Lokhttp3/internal/http2/g;", "Ljava/io/Closeable;", "Lokhttp3/internal/http2/g$c;", "handler", "", "length", "flags", "streamId", "Lkotlin/m2;", "j", "padding", "", "Lokhttp3/internal/http2/b;", "g", "d", "m", "l", "o", "r", "n", "k", "e", "t", "c", "", "requireSettings", "b", "close", "Lokhttp3/internal/http2/g$b;", "Lokhttp3/internal/http2/g$b;", "continuation", "Lokhttp3/internal/http2/c$a;", "p", "Lokhttp3/internal/http2/c$a;", "hpackReader", "Lokio/o;", "q", "Lokio/o;", "source", "Z", "client", "<init>", "(Lokio/o;Z)V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class g implements Closeable {

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private static final Logger f31190s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final b continuation;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final c.a hpackReader;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final o source;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/internal/http2/g$a;", "", "", "length", "flags", "padding", "b", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http2.g$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final Logger a() {
            return g.f31190s;
        }

        public final int b(int length, int flags, int padding) throws IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            throw new IOException(v.a(ProtectedSandApp.s("摪"), padding, ProtectedSandApp.s("摫"), length));
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\u001f\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010#\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lokhttp3/internal/http2/g$b;", "Lokio/o0;", "Lkotlin/m2;", "g", "Lokio/m;", "sink", "", "byteCount", "X0", "Lokio/q0;", "h", "close", "", "o", "I", "c", "()I", "l", "(I)V", "length", "p", "a", "j", "flags", "q", "e", "n", "streamId", "r", "b", "k", "left", "s", "d", "m", "padding", "Lokio/o;", "t", "Lokio/o;", "source", "<init>", "(Lokio/o;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b implements o0 {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private int length;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private int flags;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private int streamId;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private int left;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private int padding;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final o source;

        public b(@d5.d o oVar) {
            l0.p(oVar, ProtectedSandApp.s("摬"));
            this.source = oVar;
        }

        private final void g() throws IOException {
            int i5 = this.streamId;
            int R = okhttp3.internal.d.R(this.source);
            this.left = R;
            this.length = R;
            int readByte = this.source.readByte() & UByte.f27220r;
            this.flags = this.source.readByte() & UByte.f27220r;
            Companion companion = g.INSTANCE;
            companion.getClass();
            if (g.f31190s.isLoggable(Level.FINE)) {
                companion.getClass();
                g.f31190s.fine(d.f31082x.c(true, this.streamId, this.length, readByte, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (readByte == 9) {
                if (readInt != i5) {
                    throw new IOException(ProtectedSandApp.s("摭"));
                }
            } else {
                throw new IOException(readByte + ProtectedSandApp.s("摮"));
            }
        }

        @Override // okio.o0
        public long X0(@d5.d m sink, long byteCount) throws IOException {
            l0.p(sink, ProtectedSandApp.s("摯"));
            while (true) {
                int i5 = this.left;
                if (i5 != 0) {
                    long X0 = this.source.X0(sink, Math.min(byteCount, i5));
                    if (X0 == -1) {
                        return -1L;
                    }
                    this.left -= (int) X0;
                    return X0;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                g();
            }
        }

        /* renamed from: a, reason: from getter */
        public final int getFlags() {
            return this.flags;
        }

        /* renamed from: b, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        /* renamed from: c, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        /* renamed from: d, reason: from getter */
        public final int getPadding() {
            return this.padding;
        }

        /* renamed from: e, reason: from getter */
        public final int getStreamId() {
            return this.streamId;
        }

        @Override // okio.o0
        @d5.d
        /* renamed from: h */
        public q0 getTimeout() {
            return this.source.getTimeout();
        }

        public final void j(int i5) {
            this.flags = i5;
        }

        public final void k(int i5) {
            this.left = i5;
        }

        public final void l(int i5) {
            this.length = i5;
        }

        public final void m(int i5) {
            this.padding = i5;
        }

        public final void n(int i5) {
            this.streamId = i5;
        }
    }

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J.\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0017\u001a\u00020\tH&J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H&J \u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&J(\u0010&\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002H&J&\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J8\u00100\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020 H&¨\u00061"}, d2 = {"Lokhttp3/internal/http2/g$c;", "", "", "inFinished", "", "streamId", "Lokio/o;", "source", "length", "Lkotlin/m2;", "i", "associatedStreamId", "", "Lokhttp3/internal/http2/b;", "headerBlock", "c", "Lokhttp3/internal/http2/a;", "errorCode", "l", "clearPrevious", "Lokhttp3/internal/http2/l;", "settings", "b", "a", "ack", "payload1", "payload2", "j", "lastGoodStreamId", "Lokio/p;", "debugData", "r", "", "windowSizeIncrement", "d", "streamDependency", "weight", "exclusive", "k", "promisedStreamId", "requestHeaders", "m", "", "origin", "protocol", "host", "port", "maxAge", "g", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface c {
        void a();

        void b(boolean z5, @d5.d l lVar);

        void c(boolean z5, int i5, int i6, @d5.d List<okhttp3.internal.http2.b> list);

        void d(int i5, long j5);

        void g(int i5, @d5.d String str, @d5.d p pVar, @d5.d String str2, int i6, long j5);

        void i(boolean z5, int i5, @d5.d o oVar, int i6) throws IOException;

        void j(boolean z5, int i5, int i6);

        void k(int i5, int i6, int i7, boolean z5);

        void l(int i5, @d5.d a aVar);

        void m(int i5, int i6, @d5.d List<okhttp3.internal.http2.b> list) throws IOException;

        void r(int i5, @d5.d a aVar, @d5.d p pVar);
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        l0.o(logger, ProtectedSandApp.s("摰"));
        f31190s = logger;
    }

    public g(@d5.d o oVar, boolean z5) {
        l0.p(oVar, ProtectedSandApp.s("摱"));
        this.source = oVar;
        this.client = z5;
        b bVar = new b(oVar);
        this.continuation = bVar;
        this.hpackReader = new c.a(bVar, 4096, 0, 4, null);
    }

    private final void d(c cVar, int i5, int i6, int i7) throws IOException {
        if (i7 == 0) {
            throw new IOException(ProtectedSandApp.s("摳"));
        }
        boolean z5 = (i6 & 1) != 0;
        if ((i6 & 32) != 0) {
            throw new IOException(ProtectedSandApp.s("摲"));
        }
        int b6 = (i6 & 8) != 0 ? okhttp3.internal.d.b(this.source.readByte(), 255) : 0;
        cVar.i(z5, i7, this.source, INSTANCE.b(i5, i6, b6));
        this.source.skip(b6);
    }

    private final void e(c cVar, int i5, int i6, int i7) throws IOException {
        if (i5 < 8) {
            throw new IOException(s.a(ProtectedSandApp.s("摶"), i5));
        }
        if (i7 != 0) {
            throw new IOException(ProtectedSandApp.s("摵"));
        }
        int readInt = this.source.readInt();
        int readInt2 = this.source.readInt();
        int i8 = i5 - 8;
        a a6 = a.INSTANCE.a(readInt2);
        if (a6 == null) {
            throw new IOException(s.a(ProtectedSandApp.s("摴"), readInt2));
        }
        p pVar = p.f31688s;
        if (i8 > 0) {
            pVar = this.source.v(i8);
        }
        cVar.r(readInt, a6, pVar);
    }

    private final List<okhttp3.internal.http2.b> g(int length, int padding, int flags, int streamId) throws IOException {
        this.continuation.k(length);
        b bVar = this.continuation;
        bVar.l(bVar.getLeft());
        this.continuation.m(padding);
        this.continuation.j(flags);
        this.continuation.n(streamId);
        this.hpackReader.l();
        return this.hpackReader.e();
    }

    private final void j(c cVar, int i5, int i6, int i7) throws IOException {
        if (i7 == 0) {
            throw new IOException(ProtectedSandApp.s("摷"));
        }
        boolean z5 = (i6 & 1) != 0;
        int b6 = (i6 & 8) != 0 ? okhttp3.internal.d.b(this.source.readByte(), 255) : 0;
        if ((i6 & 32) != 0) {
            l(cVar, i7);
            i5 -= 5;
        }
        cVar.c(z5, i7, -1, g(INSTANCE.b(i5, i6, b6), b6, i6, i7));
    }

    private final void k(c cVar, int i5, int i6, int i7) throws IOException {
        if (i5 != 8) {
            throw new IOException(s.a(ProtectedSandApp.s("摹"), i5));
        }
        if (i7 != 0) {
            throw new IOException(ProtectedSandApp.s("摸"));
        }
        cVar.j((i6 & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void l(c cVar, int i5) throws IOException {
        int readInt = this.source.readInt();
        cVar.k(i5, readInt & Integer.MAX_VALUE, okhttp3.internal.d.b(this.source.readByte(), 255) + 1, (((int) 2147483648L) & readInt) != 0);
    }

    private final void m(c cVar, int i5, int i6, int i7) throws IOException {
        if (i5 != 5) {
            throw new IOException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("摻"), i5, ProtectedSandApp.s("摼")));
        }
        if (i7 == 0) {
            throw new IOException(ProtectedSandApp.s("摺"));
        }
        l(cVar, i7);
    }

    private final void n(c cVar, int i5, int i6, int i7) throws IOException {
        if (i7 == 0) {
            throw new IOException(ProtectedSandApp.s("摽"));
        }
        int b6 = (i6 & 8) != 0 ? okhttp3.internal.d.b(this.source.readByte(), 255) : 0;
        cVar.m(i7, this.source.readInt() & Integer.MAX_VALUE, g(INSTANCE.b(i5 - 4, i6, b6), b6, i6, i7));
    }

    private final void o(c cVar, int i5, int i6, int i7) throws IOException {
        if (i5 != 4) {
            throw new IOException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("撀"), i5, ProtectedSandApp.s("撁")));
        }
        if (i7 == 0) {
            throw new IOException(ProtectedSandApp.s("摿"));
        }
        int readInt = this.source.readInt();
        a a6 = a.INSTANCE.a(readInt);
        if (a6 == null) {
            throw new IOException(s.a(ProtectedSandApp.s("摾"), readInt));
        }
        cVar.l(i7, a6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        throw new java.io.IOException(androidx.appcompat.view.menu.s.a(com.flashget.kidsdownloader.ProtectedSandApp.s("撃"), r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r(okhttp3.internal.http2.g.c r8, int r9, int r10, int r11) throws java.io.IOException {
        /*
            r7 = this;
            if (r11 != 0) goto Lb6
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L18
            if (r9 != 0) goto Lc
            r8.a()
            return
        Lc:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "撂"
            java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
            r8.<init>(r9)
            throw r8
        L18:
            int r10 = r9 % 6
            if (r10 != 0) goto La6
            okhttp3.internal.http2.l r10 = new okhttp3.internal.http2.l
            r10.<init>()
            r0 = 0
            kotlin.ranges.l r9 = kotlin.ranges.s.W1(r0, r9)
            r1 = 6
            kotlin.ranges.j r9 = kotlin.ranges.s.B1(r9, r1)
            int r1 = r9.getF23724o()
            int r2 = r9.getF23725p()
            int r9 = r9.getF23726q()
            if (r9 < 0) goto L3c
            if (r1 > r2) goto La2
            goto L3e
        L3c:
            if (r1 < r2) goto La2
        L3e:
            okio.o r3 = r7.source
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = okhttp3.internal.d.c(r3, r4)
            okio.o r4 = r7.source
            int r4 = r4.readInt()
            r5 = 2
            if (r3 == r5) goto L8a
            r5 = 3
            r6 = 4
            if (r3 == r5) goto L88
            if (r3 == r6) goto L78
            r5 = 5
            if (r3 == r5) goto L5e
            goto L9b
        L5e:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L68
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L68
            goto L9b
        L68:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "撃"
            java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
            java.lang.String r9 = androidx.appcompat.view.menu.s.a(r9, r4)
            r8.<init>(r9)
            throw r8
        L78:
            if (r4 < 0) goto L7c
            r3 = 7
            goto L9b
        L7c:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "撄"
            java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
            r8.<init>(r9)
            throw r8
        L88:
            r3 = r6
            goto L9b
        L8a:
            if (r4 == 0) goto L9b
            if (r4 != r11) goto L8f
            goto L9b
        L8f:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "撅"
            java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
            r8.<init>(r9)
            throw r8
        L9b:
            r10.k(r3, r4)
            if (r1 == r2) goto La2
            int r1 = r1 + r9
            goto L3e
        La2:
            r8.b(r0, r10)
            return
        La6:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r10 = "撆"
            java.lang.String r10 = com.flashget.kidsdownloader.ProtectedSandApp.s(r10)
            java.lang.String r9 = androidx.appcompat.view.menu.s.a(r10, r9)
            r8.<init>(r9)
            throw r8
        Lb6:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "撇"
            java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.g.r(okhttp3.internal.http2.g$c, int, int, int):void");
    }

    private final void t(c cVar, int i5, int i6, int i7) throws IOException {
        if (i5 != 4) {
            throw new IOException(s.a(ProtectedSandApp.s("撉"), i5));
        }
        long d6 = okhttp3.internal.d.d(this.source.readInt(), 2147483647L);
        if (d6 == 0) {
            throw new IOException(ProtectedSandApp.s("撈"));
        }
        cVar.d(i7, d6);
    }

    public final boolean b(boolean requireSettings, @d5.d c handler) throws IOException {
        l0.p(handler, ProtectedSandApp.s("撊"));
        try {
            this.source.h1(9L);
            int R = okhttp3.internal.d.R(this.source);
            if (R > 16384) {
                throw new IOException(s.a(ProtectedSandApp.s("撌"), R));
            }
            int readByte = this.source.readByte() & UByte.f27220r;
            int readByte2 = this.source.readByte() & UByte.f27220r;
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger = f31190s;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(d.f31082x.c(true, readInt, R, readByte, readByte2));
            }
            if (requireSettings && readByte != 4) {
                throw new IOException(ProtectedSandApp.s("撋") + d.f31082x.b(readByte));
            }
            switch (readByte) {
                case 0:
                    d(handler, R, readByte2, readInt);
                    return true;
                case 1:
                    j(handler, R, readByte2, readInt);
                    return true;
                case 2:
                    m(handler, R, readByte2, readInt);
                    return true;
                case 3:
                    o(handler, R, readByte2, readInt);
                    return true;
                case 4:
                    r(handler, R, readByte2, readInt);
                    return true;
                case 5:
                    n(handler, R, readByte2, readInt);
                    return true;
                case 6:
                    k(handler, R, readByte2, readInt);
                    return true;
                case 7:
                    e(handler, R, readByte2, readInt);
                    return true;
                case 8:
                    t(handler, R, readByte2, readInt);
                    return true;
                default:
                    this.source.skip(R);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(@d5.d c cVar) throws IOException {
        l0.p(cVar, ProtectedSandApp.s("撍"));
        if (this.client) {
            if (!b(true, cVar)) {
                throw new IOException(ProtectedSandApp.s("撎"));
            }
            return;
        }
        o oVar = this.source;
        p pVar = d.CONNECTION_PREFACE;
        p v5 = oVar.v(pVar.i0());
        Logger logger = f31190s;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(okhttp3.internal.d.v(ProtectedSandApp.s("撏") + v5.C(), new Object[0]));
        }
        if (!l0.g(pVar, v5)) {
            throw new IOException(ProtectedSandApp.s("撐") + v5.t0());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }
}
