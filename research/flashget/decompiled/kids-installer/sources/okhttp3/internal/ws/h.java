package okhttp3.internal.ws;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.l0;
import okio.m;
import okio.o;
import okio.p;

/* compiled from: WebSocketReader.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u00013B/\u0012\u0006\u0010/\u001a\u00020\n\u0012\u0006\u00105\u001a\u000200\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010;\u001a\u00020\n\u0012\u0006\u0010=\u001a\u00020\n¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\fR\u0017\u00105\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\fR\u0014\u0010=\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\f¨\u0006@"}, d2 = {"Lokhttp3/internal/ws/h;", "Ljava/io/Closeable;", "Lkotlin/m2;", "d", "c", "g", "j", "e", "b", "close", "", "o", "Z", "closed", "", "p", "I", "opcode", "", "q", "J", "frameLength", "r", "isFinalFrame", "s", "isControlFrame", "t", "readingCompressedMessage", "Lokio/m;", "u", "Lokio/m;", "controlFrameBuffer", "v", "messageFrameBuffer", "Lokhttp3/internal/ws/c;", "w", "Lokhttp3/internal/ws/c;", "messageInflater", "", "x", "[B", "maskKey", "Lokio/m$a;", "y", "Lokio/m$a;", "maskCursor", "z", "isClient", "Lokio/o;", "A", "Lokio/o;", "a", "()Lokio/o;", "source", "Lokhttp3/internal/ws/h$a;", "B", "Lokhttp3/internal/ws/h$a;", "frameCallback", "C", "perMessageDeflate", "D", "noContextTakeover", "<init>", "(ZLokio/o;Lokhttp3/internal/ws/h$a;ZZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class h implements Closeable {

    /* renamed from: A, reason: from kotlin metadata */
    @d5.d
    private final o source;

    /* renamed from: B, reason: from kotlin metadata */
    private final a frameCallback;

    /* renamed from: C, reason: from kotlin metadata */
    private final boolean perMessageDeflate;

    /* renamed from: D, reason: from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int opcode;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long frameLength;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isFinalFrame;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isControlFrame;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean readingCompressedMessage;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final m controlFrameBuffer;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final m messageFrameBuffer;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private c messageInflater;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final byte[] maskKey;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final m.a maskCursor;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final boolean isClient;

    /* compiled from: WebSocketReader.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H&¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/ws/h$a;", "", "", "text", "Lkotlin/m2;", "d", "Lokio/p;", "bytes", "c", "payload", "e", "i", "", "code", "reason", "j", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        void c(@d5.d p pVar) throws IOException;

        void d(@d5.d String str) throws IOException;

        void e(@d5.d p pVar);

        void i(@d5.d p pVar);

        void j(int i5, @d5.d String str);
    }

    public h(boolean z5, @d5.d o oVar, @d5.d a aVar, boolean z6, boolean z7) {
        l0.p(oVar, ProtectedSandApp.s("旽"));
        l0.p(aVar, ProtectedSandApp.s("旾"));
        this.isClient = z5;
        this.source = oVar;
        this.frameCallback = aVar;
        this.perMessageDeflate = z6;
        this.noContextTakeover = z7;
        this.controlFrameBuffer = new m();
        this.messageFrameBuffer = new m();
        this.maskKey = z5 ? null : new byte[4];
        this.maskCursor = z5 ? null : new m.a();
    }

    private final void c() throws IOException {
        short s5;
        String str;
        long j5 = this.frameLength;
        if (j5 > 0) {
            this.source.S(this.controlFrameBuffer, j5);
            if (!this.isClient) {
                m mVar = this.controlFrameBuffer;
                m.a aVar = this.maskCursor;
                l0.m(aVar);
                mVar.m0(aVar);
                this.maskCursor.d(0L);
                g gVar = g.f31433w;
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
                    throw new ProtocolException(ProtectedSandApp.s("昀"));
                }
                if (size != 0) {
                    s5 = this.controlFrameBuffer.readShort();
                    str = this.controlFrameBuffer.L0();
                    String b6 = g.f31433w.b(s5);
                    if (b6 != null) {
                        throw new ProtocolException(b6);
                    }
                } else {
                    s5 = 1005;
                    str = "";
                }
                this.frameCallback.j(s5, str);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.e(this.controlFrameBuffer.x0());
                return;
            case 10:
                this.frameCallback.i(this.controlFrameBuffer.x0());
                return;
            default:
                throw new ProtocolException(ProtectedSandApp.s("旿") + okhttp3.internal.d.Y(this.opcode));
        }
    }

    private final void d() throws IOException, ProtocolException {
        boolean z5;
        if (this.closed) {
            throw new IOException(ProtectedSandApp.s("昊"));
        }
        long timeoutNanos = this.source.getTimeout().getTimeoutNanos();
        this.source.getTimeout().b();
        try {
            int b6 = okhttp3.internal.d.b(this.source.readByte(), 255);
            this.source.getTimeout().i(timeoutNanos, TimeUnit.NANOSECONDS);
            int i5 = b6 & 15;
            this.opcode = i5;
            boolean z6 = (b6 & 128) != 0;
            this.isFinalFrame = z6;
            boolean z7 = (b6 & 8) != 0;
            this.isControlFrame = z7;
            if (z7 && !z6) {
                throw new ProtocolException(ProtectedSandApp.s("昁"));
            }
            boolean z8 = (b6 & 64) != 0;
            String s5 = ProtectedSandApp.s("昂");
            if (i5 == 1 || i5 == 2) {
                if (!z8) {
                    z5 = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException(s5);
                    }
                    z5 = true;
                }
                this.readingCompressedMessage = z5;
            } else if (z8) {
                throw new ProtocolException(s5);
            }
            if ((b6 & 32) != 0) {
                throw new ProtocolException(ProtectedSandApp.s("昉"));
            }
            if ((b6 & 16) != 0) {
                throw new ProtocolException(ProtectedSandApp.s("昈"));
            }
            int readByte = this.source.readByte() & UByte.f27220r;
            boolean z9 = (readByte & 128) != 0;
            if (z9 == this.isClient) {
                throw new ProtocolException(this.isClient ? ProtectedSandApp.s("昃") : ProtectedSandApp.s("昄"));
            }
            long j5 = readByte & 127;
            this.frameLength = j5;
            if (j5 == 126) {
                this.frameLength = this.source.readShort() & UShort.f23340r;
            } else if (j5 == 127) {
                long readLong = this.source.readLong();
                this.frameLength = readLong;
                if (readLong < 0) {
                    throw new ProtocolException(ProtectedSandApp.s("昅") + okhttp3.internal.d.Z(this.frameLength) + ProtectedSandApp.s("昆"));
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException(ProtectedSandApp.s("昇"));
            }
            if (z9) {
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
            long j5 = this.frameLength;
            if (j5 > 0) {
                this.source.S(this.messageFrameBuffer, j5);
                if (!this.isClient) {
                    m mVar = this.messageFrameBuffer;
                    m.a aVar = this.maskCursor;
                    l0.m(aVar);
                    mVar.m0(aVar);
                    this.maskCursor.d(this.messageFrameBuffer.size() - this.frameLength);
                    g gVar = g.f31433w;
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
            j();
            if (this.opcode != 0) {
                throw new ProtocolException(ProtectedSandApp.s("昋") + okhttp3.internal.d.Y(this.opcode));
            }
        }
        throw new IOException(ProtectedSandApp.s("昌"));
    }

    private final void g() throws IOException {
        int i5 = this.opcode;
        if (i5 != 1 && i5 != 2) {
            throw new ProtocolException(ProtectedSandApp.s("昍") + okhttp3.internal.d.Y(i5));
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
        if (i5 == 1) {
            this.frameCallback.d(this.messageFrameBuffer.L0());
        } else {
            this.frameCallback.c(this.messageFrameBuffer.x0());
        }
    }

    private final void j() throws IOException {
        while (!this.closed) {
            d();
            if (!this.isControlFrame) {
                return;
            } else {
                c();
            }
        }
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final o getSource() {
        return this.source;
    }

    public final void b() throws IOException {
        d();
        if (this.isControlFrame) {
            c();
        } else {
            g();
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
