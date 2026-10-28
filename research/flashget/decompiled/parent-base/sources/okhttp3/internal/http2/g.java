package okhttp3.internal.http2;

import androidx.collection.r2;
import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.internal.http2.c;
import okio.m;
import okio.o;
import okio.o0;
import okio.p;
import okio.q0;

/* compiled from: Http2Reader.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0003/# B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J/\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J/\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J/\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.¨\u00060"}, d2 = {"Lokhttp3/internal/http2/g;", "Ljava/io/Closeable;", "Lokio/o;", "source", "", "client", "<init>", "(Lokio/o;Z)V", "Lokhttp3/internal/http2/g$c;", "handler", "", "length", "flags", "streamId", "Lkotlin/k2;", "g", "(Lokhttp3/internal/http2/g$c;III)V", "padding", "", "Lokhttp3/internal/http2/b;", "f", "(IIII)Ljava/util/List;", "d", "k", "i", "(Lokhttp3/internal/http2/g$c;I)V", "m", "n", "l", "h", "e", "o", "c", "(Lokhttp3/internal/http2/g$c;)V", "requireSettings", "b", "(ZLokhttp3/internal/http2/g$c;)Z", "close", "()V", "Lokhttp3/internal/http2/g$b;", "Lokhttp3/internal/http2/g$b;", "continuation", "Lokhttp3/internal/http2/c$a;", "Lokhttp3/internal/http2/c$a;", "hpackReader", "Lokio/o;", "Z", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class g implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final Logger f84730f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b continuation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c.a hpackReader;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o source;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http2/g$a;", "", "<init>", "()V", "", "length", "flags", "padding", "b", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.http2.g$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final Logger a() {
            return g.f84730f;
        }

        public final int b(int length, int flags, int padding) throws IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            throw new IOException(q.a(ProtectedSandApp.s("ᴝ"), padding, ProtectedSandApp.s("ᴞ"), length));
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010!\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\"\u0010#\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010%\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b$\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&¨\u0006'"}, d2 = {"Lokhttp3/internal/http2/g$b;", "Lokio/o0;", "Lokio/o;", "source", "<init>", "(Lokio/o;)V", "Lkotlin/k2;", "f", "()V", "Lokio/m;", "sink", "", "byteCount", "w3", "(Lokio/m;J)J", "Lokio/q0;", "timeout", "()Lokio/q0;", "close", "", "b", "I", "c", "()I", "i", "(I)V", "length", "a", "g", "flags", "d", "e", "l", "streamId", "h", "left", "k", "padding", "Lokio/o;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b implements o0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int length;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int flags;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int streamId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int left;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private int padding;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final o source;

        public b(@fg.l o oVar) {
            l0.p(oVar, ProtectedSandApp.s("ᴟ"));
            this.source = oVar;
        }

        private final void f() throws IOException {
            int i4 = this.streamId;
            int R = okhttp3.internal.d.R(this.source);
            this.left = R;
            this.length = R;
            int readByte = this.source.readByte() & 255;
            this.flags = this.source.readByte() & 255;
            Companion companion = g.INSTANCE;
            companion.getClass();
            if (g.f84730f.isLoggable(Level.FINE)) {
                companion.getClass();
                g.f84730f.fine(d.f84609x.c(true, this.streamId, this.length, readByte, this.flags));
            }
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = readInt;
            if (readByte == 9) {
                if (readInt != i4) {
                    throw new IOException(ProtectedSandApp.s("ᴠ"));
                }
            } else {
                throw new IOException(readByte + ProtectedSandApp.s("ᴡ"));
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

        public final void g(int i4) {
            this.flags = i4;
        }

        public final void h(int i4) {
            this.left = i4;
        }

        public final void i(int i4) {
            this.length = i4;
        }

        public final void k(int i4) {
            this.padding = i4;
        }

        public final void l(int i4) {
            this.streamId = i4;
        }

        @Override // okio.o0
        @fg.l
        /* renamed from: timeout */
        public q0 getTimeout() {
            return this.source.getTimeout();
        }

        @Override // okio.o0
        public long w3(@fg.l m sink, long byteCount) throws IOException {
            l0.p(sink, ProtectedSandApp.s("ᴢ"));
            while (true) {
                int i4 = this.left;
                if (i4 != 0) {
                    long w32 = this.source.w3(sink, Math.min(byteCount, i4));
                    if (w32 == -1) {
                        return -1L;
                    }
                    this.left -= (int) w32;
                    return w32;
                }
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                f();
            }
        }
    }

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b2\u00103J?\u0010:\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u0002042\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020'H&¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lokhttp3/internal/http2/g$c;", "", "", "inFinished", "", "streamId", "Lokio/o;", "source", "length", "Lkotlin/k2;", "j", "(ZILokio/o;I)V", "associatedStreamId", "", "Lokhttp3/internal/http2/b;", "headerBlock", "b", "(ZIILjava/util/List;)V", "Lokhttp3/internal/http2/a;", "errorCode", "n", "(ILokhttp3/internal/http2/a;)V", "clearPrevious", "Lokhttp3/internal/http2/l;", "settings", "a", "(ZLokhttp3/internal/http2/l;)V", "h", "()V", "ack", "payload1", "payload2", "l", "(ZII)V", "lastGoodStreamId", "Lokio/p;", "debugData", "p", "(ILokhttp3/internal/http2/a;Lokio/p;)V", "", "windowSizeIncrement", "c", "(IJ)V", "streamDependency", "weight", "exclusive", "m", "(IIIZ)V", "promisedStreamId", "requestHeaders", "f", "(IILjava/util/List;)V", "", "origin", "protocol", "host", "port", "maxAge", "d", "(ILjava/lang/String;Lokio/p;Ljava/lang/String;IJ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface c {
        void a(boolean clearPrevious, @fg.l l settings);

        void b(boolean inFinished, int streamId, int associatedStreamId, @fg.l List<okhttp3.internal.http2.b> headerBlock);

        void c(int streamId, long windowSizeIncrement);

        void d(int streamId, @fg.l String origin, @fg.l p protocol, @fg.l String host, int port, long maxAge);

        void f(int streamId, int promisedStreamId, @fg.l List<okhttp3.internal.http2.b> requestHeaders) throws IOException;

        void h();

        void j(boolean inFinished, int streamId, @fg.l o source, int length) throws IOException;

        void l(boolean ack, int payload1, int payload2);

        void m(int streamId, int streamDependency, int weight, boolean exclusive);

        void n(int streamId, @fg.l a errorCode);

        void p(int lastGoodStreamId, @fg.l a errorCode, @fg.l p debugData);
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        l0.o(logger, ProtectedSandApp.s("ᴣ"));
        f84730f = logger;
    }

    public g(@fg.l o oVar, boolean z4) {
        l0.p(oVar, ProtectedSandApp.s("ᴤ"));
        this.source = oVar;
        this.client = z4;
        b bVar = new b(oVar);
        this.continuation = bVar;
        this.hpackReader = new c.a(bVar, 4096, 0, 4, null);
    }

    private final void d(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException(ProtectedSandApp.s("ᴦ"));
        }
        boolean z4 = (flags & 1) != 0;
        if ((flags & 32) != 0) {
            throw new IOException(ProtectedSandApp.s("ᴥ"));
        }
        int b5 = (flags & 8) != 0 ? okhttp3.internal.d.b(this.source.readByte(), 255) : 0;
        handler.j(z4, streamId, this.source, INSTANCE.b(length, flags, b5));
        this.source.skip(b5);
    }

    private final void e(c handler, int length, int flags, int streamId) throws IOException {
        if (length < 8) {
            throw new IOException(android.support.v4.media.a.a(ProtectedSandApp.s("ᴩ"), length));
        }
        if (streamId != 0) {
            throw new IOException(ProtectedSandApp.s("ᴨ"));
        }
        int readInt = this.source.readInt();
        int readInt2 = this.source.readInt();
        int i4 = length - 8;
        a a5 = a.INSTANCE.a(readInt2);
        if (a5 == null) {
            throw new IOException(android.support.v4.media.a.a(ProtectedSandApp.s("ᴧ"), readInt2));
        }
        p pVar = p.f85244f;
        if (i4 > 0) {
            pVar = this.source.b2(i4);
        }
        handler.p(readInt, a5, pVar);
    }

    private final List<okhttp3.internal.http2.b> f(int length, int padding, int flags, int streamId) throws IOException {
        this.continuation.h(length);
        b bVar = this.continuation;
        bVar.i(bVar.getLeft());
        this.continuation.k(padding);
        this.continuation.g(flags);
        this.continuation.l(streamId);
        this.hpackReader.l();
        return this.hpackReader.e();
    }

    private final void g(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException(ProtectedSandApp.s("ᴪ"));
        }
        boolean z4 = (flags & 1) != 0;
        int b5 = (flags & 8) != 0 ? okhttp3.internal.d.b(this.source.readByte(), 255) : 0;
        if ((flags & 32) != 0) {
            i(handler, streamId);
            length -= 5;
        }
        handler.b(z4, streamId, -1, f(INSTANCE.b(length, flags, b5), b5, flags, streamId));
    }

    private final void h(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 8) {
            throw new IOException(android.support.v4.media.a.a(ProtectedSandApp.s("ᴬ"), length));
        }
        if (streamId != 0) {
            throw new IOException(ProtectedSandApp.s("ᴫ"));
        }
        handler.l((flags & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void i(c handler, int streamId) throws IOException {
        int readInt = this.source.readInt();
        handler.m(streamId, readInt & Integer.MAX_VALUE, okhttp3.internal.d.b(this.source.readByte(), 255) + 1, (((int) 2147483648L) & readInt) != 0);
    }

    private final void k(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 5) {
            throw new IOException(r2.a(ProtectedSandApp.s("ᴮ"), length, ProtectedSandApp.s("ᴯ")));
        }
        if (streamId == 0) {
            throw new IOException(ProtectedSandApp.s("ᴭ"));
        }
        i(handler, streamId);
    }

    private final void l(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException(ProtectedSandApp.s("ᴰ"));
        }
        int b5 = (flags & 8) != 0 ? okhttp3.internal.d.b(this.source.readByte(), 255) : 0;
        handler.f(streamId, this.source.readInt() & Integer.MAX_VALUE, f(INSTANCE.b(length - 4, flags, b5), b5, flags, streamId));
    }

    private final void m(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException(r2.a(ProtectedSandApp.s("ᴳ"), length, ProtectedSandApp.s("ᴴ")));
        }
        if (streamId == 0) {
            throw new IOException(ProtectedSandApp.s("ᴲ"));
        }
        int readInt = this.source.readInt();
        a a5 = a.INSTANCE.a(readInt);
        if (a5 == null) {
            throw new IOException(android.support.v4.media.a.a(ProtectedSandApp.s("ᴱ"), readInt));
        }
        handler.n(streamId, a5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        throw new java.io.IOException(android.support.v4.media.a.a(com.flashget.parentalcontrol.ProtectedSandApp.s("ᴶ"), r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(okhttp3.internal.http2.g.c r8, int r9, int r10, int r11) throws java.io.IOException {
        /*
            r7 = this;
            if (r11 != 0) goto Lb6
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L18
            if (r9 != 0) goto Lc
            r8.h()
            return
        Lc:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "ᴵ"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
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
            int r1 = r9.getFirst()
            int r2 = r9.getLast()
            int r9 = r9.getStep()
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
            java.lang.String r9 = "ᴶ"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            java.lang.String r9 = android.support.v4.media.a.a(r9, r4)
            r8.<init>(r9)
            throw r8
        L78:
            if (r4 < 0) goto L7c
            r3 = 7
            goto L9b
        L7c:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "ᴷ"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
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
            java.lang.String r9 = "ᴸ"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            r8.<init>(r9)
            throw r8
        L9b:
            r10.k(r3, r4)
            if (r1 == r2) goto La2
            int r1 = r1 + r9
            goto L3e
        La2:
            r8.a(r0, r10)
            return
        La6:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r10 = "ᴹ"
            java.lang.String r10 = com.flashget.parentalcontrol.ProtectedSandApp.s(r10)
            java.lang.String r9 = android.support.v4.media.a.a(r10, r9)
            r8.<init>(r9)
            throw r8
        Lb6:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "ᴺ"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.g.n(okhttp3.internal.http2.g$c, int, int, int):void");
    }

    private final void o(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException(android.support.v4.media.a.a(ProtectedSandApp.s("ᴼ"), length));
        }
        long d5 = okhttp3.internal.d.d(this.source.readInt(), 2147483647L);
        if (d5 == 0) {
            throw new IOException(ProtectedSandApp.s("ᴻ"));
        }
        handler.c(streamId, d5);
    }

    public final boolean b(boolean requireSettings, @fg.l c handler) throws IOException {
        l0.p(handler, ProtectedSandApp.s("ᴽ"));
        try {
            this.source.J1(9L);
            int R = okhttp3.internal.d.R(this.source);
            if (R > 16384) {
                throw new IOException(android.support.v4.media.a.a(ProtectedSandApp.s("ᴿ"), R));
            }
            int readByte = this.source.readByte() & 255;
            int readByte2 = this.source.readByte() & 255;
            int readInt = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger = f84730f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(d.f84609x.c(true, readInt, R, readByte, readByte2));
            }
            if (requireSettings && readByte != 4) {
                throw new IOException(ProtectedSandApp.s("ᴾ") + d.f84609x.b(readByte));
            }
            switch (readByte) {
                case 0:
                    d(handler, R, readByte2, readInt);
                    return true;
                case 1:
                    g(handler, R, readByte2, readInt);
                    return true;
                case 2:
                    k(handler, R, readByte2, readInt);
                    return true;
                case 3:
                    m(handler, R, readByte2, readInt);
                    return true;
                case 4:
                    n(handler, R, readByte2, readInt);
                    return true;
                case 5:
                    l(handler, R, readByte2, readInt);
                    return true;
                case 6:
                    h(handler, R, readByte2, readInt);
                    return true;
                case 7:
                    e(handler, R, readByte2, readInt);
                    return true;
                case 8:
                    o(handler, R, readByte2, readInt);
                    return true;
                default:
                    this.source.skip(R);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(@fg.l c handler) throws IOException {
        l0.p(handler, ProtectedSandApp.s("ᴽ"));
        if (this.client) {
            if (!b(true, handler)) {
                throw new IOException(ProtectedSandApp.s("ᵀ"));
            }
            return;
        }
        o oVar = this.source;
        p pVar = d.CONNECTION_PREFACE;
        p b22 = oVar.b2(pVar.q());
        Logger logger = f84730f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(okhttp3.internal.d.v(ProtectedSandApp.s("ᵁ") + b22.s(), new Object[0]));
        }
        if (l0.g(pVar, b22)) {
            return;
        }
        throw new IOException(ProtectedSandApp.s("ᵂ") + b22.o0());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.source.close();
    }
}
