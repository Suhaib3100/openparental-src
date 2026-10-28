package okhttp3.internal.ws;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.m;
import okio.n;
import okio.p;

/* compiled from: WebSocketWriter.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b!\u00103R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010%R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lokhttp3/internal/ws/i;", "Ljava/io/Closeable;", "", "isClient", "Lokio/n;", "sink", "Ljava/util/Random;", "random", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "<init>", "(ZLokio/n;Ljava/util/Random;ZZJ)V", "", "opcode", "Lokio/p;", "payload", "Lkotlin/k2;", "d", "(ILokio/p;)V", "f", "(Lokio/p;)V", "g", "code", "reason", "c", "formatOpcode", "data", "e", "close", "()V", "Lokio/m;", "b", "Lokio/m;", "messageBuffer", "sinkBuffer", "Z", "writerClosed", "Lokhttp3/internal/ws/a;", "Lokhttp3/internal/ws/a;", "messageDeflater", "", "[B", "maskKey", "Lokio/m$a;", "Lokio/m$a;", "maskCursor", "h", "i", "Lokio/n;", "()Lokio/n;", "j", "Ljava/util/Random;", "a", "()Ljava/util/Random;", "k", "l", "m", "J", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class i implements Closeable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m messageBuffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m sinkBuffer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean writerClosed;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private a messageDeflater;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final byte[] maskKey;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m.a maskCursor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isClient;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    private final n sink;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    private final Random random;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean perMessageDeflate;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long minimumDeflateSize;

    public i(boolean z4, @l n nVar, @l Random random, boolean z5, boolean z6, long j4) {
        l0.p(nVar, ProtectedSandApp.s("ụ"));
        l0.p(random, ProtectedSandApp.s("Ủ"));
        this.isClient = z4;
        this.sink = nVar;
        this.random = random;
        this.perMessageDeflate = z5;
        this.noContextTakeover = z6;
        this.minimumDeflateSize = j4;
        this.messageBuffer = new m();
        this.sinkBuffer = nVar.getBufferField();
        this.maskKey = z4 ? new byte[4] : null;
        this.maskCursor = z4 ? new m.a() : null;
    }

    private final void d(int opcode, p payload) throws IOException {
        if (this.writerClosed) {
            throw new IOException(ProtectedSandApp.s("Ứ"));
        }
        int q4 = payload.q();
        if (!(((long) q4) <= 125)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ủ"));
        }
        this.sinkBuffer.writeByte(opcode | 128);
        if (this.isClient) {
            this.sinkBuffer.writeByte(q4 | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            l0.m(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (q4 > 0) {
                long size = this.sinkBuffer.size();
                this.sinkBuffer.t3(payload);
                m mVar = this.sinkBuffer;
                m.a aVar = this.maskCursor;
                l0.m(aVar);
                mVar.H(aVar);
                this.maskCursor.d(size);
                g.f84973w.c(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.writeByte(q4);
            this.sinkBuffer.t3(payload);
        }
        this.sink.flush();
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Random getRandom() {
        return this.random;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final n getSink() {
        return this.sink;
    }

    public final void c(int code, @fg.m p reason) throws IOException {
        p pVar = p.f85244f;
        if (code != 0 || reason != null) {
            if (code != 0) {
                g.f84973w.d(code);
            }
            m mVar = new m();
            mVar.writeShort(code);
            if (reason != null) {
                mVar.t3(reason);
            }
            pVar = mVar.b3();
        }
        try {
            d(8, pVar);
        } finally {
            this.writerClosed = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar = this.messageDeflater;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void e(int formatOpcode, @l p data) throws IOException {
        l0.p(data, ProtectedSandApp.s("ứ"));
        if (this.writerClosed) {
            throw new IOException(ProtectedSandApp.s("Ứ"));
        }
        this.messageBuffer.t3(data);
        int i4 = formatOpcode | 128;
        if (this.perMessageDeflate && data.q() >= this.minimumDeflateSize) {
            a aVar = this.messageDeflater;
            if (aVar == null) {
                aVar = new a(this.noContextTakeover);
                this.messageDeflater = aVar;
            }
            aVar.a(this.messageBuffer);
            i4 = formatOpcode | 192;
        }
        long size = this.messageBuffer.size();
        this.sinkBuffer.writeByte(i4);
        int i5 = this.isClient ? 128 : 0;
        if (size <= 125) {
            this.sinkBuffer.writeByte(i5 | ((int) size));
        } else if (size <= g.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.writeByte(i5 | 126);
            this.sinkBuffer.writeShort((int) size);
        } else {
            this.sinkBuffer.writeByte(i5 | 127);
            this.sinkBuffer.writeLong(size);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            l0.m(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                m mVar = this.messageBuffer;
                m.a aVar2 = this.maskCursor;
                l0.m(aVar2);
                mVar.H(aVar2);
                this.maskCursor.d(0L);
                g.f84973w.c(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, size);
        this.sink.d0();
    }

    public final void f(@l p payload) throws IOException {
        l0.p(payload, ProtectedSandApp.s("Ừ"));
        d(9, payload);
    }

    public final void g(@l p payload) throws IOException {
        l0.p(payload, ProtectedSandApp.s("Ừ"));
        d(10, payload);
    }
}
