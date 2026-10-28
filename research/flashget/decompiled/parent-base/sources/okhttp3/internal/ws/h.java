package okhttp3.internal.ws;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.g2;
import kotlin.jvm.internal.l0;
import okio.m;
import okio.o;
import okio.p;

/* compiled from: WebSocketReader.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u00015B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0015¨\u0006;"}, d2 = {"Lokhttp3/internal/ws/h;", "Ljava/io/Closeable;", "", "isClient", "Lokio/o;", "source", "Lokhttp3/internal/ws/h$a;", "frameCallback", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLokio/o;Lokhttp3/internal/ws/h$a;ZZ)V", "Lkotlin/k2;", "d", "()V", "c", "f", "g", "e", "b", "close", "Z", "closed", "", "I", "opcode", "", "J", "frameLength", "isFinalFrame", "isControlFrame", "readingCompressedMessage", "Lokio/m;", "h", "Lokio/m;", "controlFrameBuffer", "i", "messageFrameBuffer", "Lokhttp3/internal/ws/c;", "j", "Lokhttp3/internal/ws/c;", "messageInflater", "", "k", "[B", "maskKey", "Lokio/m$a;", "l", "Lokio/m$a;", "maskCursor", "m", "n", "Lokio/o;", "a", "()Lokio/o;", "o", "Lokhttp3/internal/ws/h$a;", "p", "q", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class h implements Closeable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int opcode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long frameLength;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isFinalFrame;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isControlFrame;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean readingCompressedMessage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final m controlFrameBuffer;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final m messageFrameBuffer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private c messageInflater;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final byte[] maskKey;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final m.a maskCursor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isClient;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @l
    private final o source;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final a frameCallback;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean perMessageDeflate;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* compiled from: WebSocketReader.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/ws/h$a;", "", "", "text", "Lkotlin/k2;", "e", "(Ljava/lang/String;)V", "Lokio/p;", "bytes", "d", "(Lokio/p;)V", "payload", "f", "i", "", "code", "reason", "j", "(ILjava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        void d(@l p bytes) throws IOException;

        void e(@l String text) throws IOException;

        void f(@l p payload);

        void i(@l p payload);

        void j(int code, @l String reason);
    }

    public h(boolean z4, @l o oVar, @l a aVar, boolean z5, boolean z6) {
        l0.p(oVar, ProtectedSandApp.s("ổ"));
        l0.p(aVar, ProtectedSandApp.s("Ỗ"));
        this.isClient = z4;
        this.source = oVar;
        this.frameCallback = aVar;
        this.perMessageDeflate = z5;
        this.noContextTakeover = z6;
        this.controlFrameBuffer = new m();
        this.messageFrameBuffer = new m();
        this.maskKey = z4 ? null : new byte[4];
        this.maskCursor = z4 ? null : new m.a();
    }

    private final void c() throws IOException {
        short s4;
        String str;
        long j4 = this.frameLength;
        if (j4 > 0) {
            this.source.t0(this.controlFrameBuffer, j4);
            if (!this.isClient) {
                m mVar = this.controlFrameBuffer;
                m.a aVar = this.maskCursor;
                l0.m(aVar);
                mVar.H(aVar);
                this.maskCursor.d(0L);
                g gVar = g.f84973w;
                m.a aVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                l0.m(bArr);
                gVar.c(aVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                long size = this.controlFrameBuffer.size();
                if (size == 1) {
                    throw new ProtocolException(ProtectedSandApp.s("Ộ"));
                }
                if (size != 0) {
                    s4 = this.controlFrameBuffer.readShort();
                    str = this.controlFrameBuffer.n3();
                    String b5 = g.f84973w.b(s4);
                    if (b5 != null) {
                        throw new ProtocolException(b5);
                    }
                } else {
                    s4 = 1005;
                    str = "";
                }
                this.frameCallback.j(s4, str);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.f(this.controlFrameBuffer.b3());
                return;
            case 10:
                this.frameCallback.i(this.controlFrameBuffer.b3());
                return;
            default:
                throw new ProtocolException(ProtectedSandApp.s("ỗ") + okhttp3.internal.d.Y(this.opcode));
        }
    }

    private final void d() throws IOException, ProtocolException {
        boolean z4;
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("Ợ"));
        }
        long timeoutNanos = this.source.getTimeout().getTimeoutNanos();
        this.source.getTimeout().b();
        try {
            int b5 = okhttp3.internal.d.b(this.source.readByte(), 255);
            this.source.getTimeout().i(timeoutNanos, TimeUnit.NANOSECONDS);
            int i4 = b5 & 15;
            this.opcode = i4;
            boolean z5 = (b5 & 128) != 0;
            this.isFinalFrame = z5;
            boolean z6 = (b5 & 8) != 0;
            this.isControlFrame = z6;
            if (z6 && !z5) {
                throw new ProtocolException(ProtectedSandApp.s("ộ"));
            }
            boolean z7 = (b5 & 64) != 0;
            String s4 = ProtectedSandApp.s("Ớ");
            if (i4 == 1 || i4 == 2) {
                if (!z7) {
                    z4 = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException(s4);
                    }
                    z4 = true;
                }
                this.readingCompressedMessage = z4;
            } else if (z7) {
                throw new ProtocolException(s4);
            }
            if ((b5 & 32) != 0) {
                throw new ProtocolException(ProtectedSandApp.s("ỡ"));
            }
            if ((b5 & 16) != 0) {
                throw new ProtocolException(ProtectedSandApp.s("Ỡ"));
            }
            byte readByte = this.source.readByte();
            boolean z10 = (readByte & 128) != 0;
            if (z10 == this.isClient) {
                throw new ProtocolException(this.isClient ? ProtectedSandApp.s("ớ") : ProtectedSandApp.s("Ờ"));
            }
            long j4 = readByte & Byte.MAX_VALUE;
            this.frameLength = j4;
            if (j4 == 126) {
                this.frameLength = this.source.readShort() & g2.f75095e;
            } else if (j4 == 127) {
                long readLong = this.source.readLong();
                this.frameLength = readLong;
                if (readLong < 0) {
                    throw new ProtocolException(ProtectedSandApp.s("ờ") + okhttp3.internal.d.Z(this.frameLength) + ProtectedSandApp.s("Ở"));
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException(ProtectedSandApp.s("ở"));
            }
            if (z10) {
                o oVar = this.source;
                byte[] bArr = this.maskKey;
                l0.m(bArr);
                oVar.readFully(bArr);
            }
        } catch (Throwable th) {
            this.source.getTimeout().i(timeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void e() throws IOException {
        while (!this.closed) {
            long j4 = this.frameLength;
            if (j4 > 0) {
                this.source.t0(this.messageFrameBuffer, j4);
                if (!this.isClient) {
                    m mVar = this.messageFrameBuffer;
                    m.a aVar = this.maskCursor;
                    l0.m(aVar);
                    mVar.H(aVar);
                    this.maskCursor.d(this.messageFrameBuffer.size() - this.frameLength);
                    g gVar = g.f84973w;
                    m.a aVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    l0.m(bArr);
                    gVar.c(aVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            g();
            if (this.opcode != 0) {
                throw new ProtocolException(ProtectedSandApp.s("ợ") + okhttp3.internal.d.Y(this.opcode));
            }
        }
        throw new IOException(ProtectedSandApp.s("Ợ"));
    }

    private final void f() throws IOException {
        int i4 = this.opcode;
        if (i4 != 1 && i4 != 2) {
            throw new ProtocolException(ProtectedSandApp.s("Ụ") + okhttp3.internal.d.Y(i4));
        }
        e();
        if (this.readingCompressedMessage) {
            c cVar = this.messageInflater;
            if (cVar == null) {
                cVar = new c(this.noContextTakeover);
                this.messageInflater = cVar;
            }
            cVar.a(this.messageFrameBuffer);
        }
        if (i4 == 1) {
            this.frameCallback.e(this.messageFrameBuffer.n3());
        } else {
            this.frameCallback.d(this.messageFrameBuffer.b3());
        }
    }

    private final void g() throws IOException {
        while (!this.closed) {
            d();
            if (!this.isControlFrame) {
                return;
            } else {
                c();
            }
        }
    }

    @l
    /* renamed from: a, reason: from getter */
    public final o getSource() {
        return this.source;
    }

    public final void b() throws IOException {
        d();
        if (this.isControlFrame) {
            c();
        } else {
            f();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c cVar = this.messageInflater;
        if (cVar != null) {
            cVar.close();
        }
    }
}
