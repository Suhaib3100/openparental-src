package okhttp3.internal.ws;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.m;
import okio.n;
import okio.p;

/* compiled from: WebSocketWriter.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010(\u001a\u00020\u0017\u0012\u0006\u0010.\u001a\u00020)\u0012\u0006\u00104\u001a\u00020/\u0012\u0006\u00106\u001a\u00020\u0017\u0012\u0006\u00108\u001a\u00020\u0017\u0012\u0006\u0010<\u001a\u000209¢\u0006\u0004\b=\u0010>J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019R\u0014\u00108\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0019R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lokhttp3/internal/ws/i;", "Ljava/io/Closeable;", "", "opcode", "Lokio/p;", "payload", "Lkotlin/m2;", "d", "g", "j", "code", "reason", "c", "formatOpcode", "data", "e", "close", "Lokio/m;", "o", "Lokio/m;", "messageBuffer", "p", "sinkBuffer", "", "q", "Z", "writerClosed", "Lokhttp3/internal/ws/a;", "r", "Lokhttp3/internal/ws/a;", "messageDeflater", "", "s", "[B", "maskKey", "Lokio/m$a;", "t", "Lokio/m$a;", "maskCursor", "u", "isClient", "Lokio/n;", "v", "Lokio/n;", "b", "()Lokio/n;", "sink", "Ljava/util/Random;", "w", "Ljava/util/Random;", "a", "()Ljava/util/Random;", "random", "x", "perMessageDeflate", "y", "noContextTakeover", "", "z", "J", "minimumDeflateSize", "<init>", "(ZLokio/n;Ljava/util/Random;ZZJ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class i implements Closeable {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final m messageBuffer;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final m sinkBuffer;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean writerClosed;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private a messageDeflater;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final byte[] maskKey;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final m.a maskCursor;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final boolean isClient;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final n sink;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Random random;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final boolean perMessageDeflate;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final long minimumDeflateSize;

    public i(boolean z5, @d5.d n nVar, @d5.d Random random, boolean z6, boolean z7, long j5) {
        l0.p(nVar, ProtectedSandApp.s("明"));
        l0.p(random, ProtectedSandApp.s("昏"));
        this.isClient = z5;
        this.sink = nVar;
        this.random = random;
        this.perMessageDeflate = z6;
        this.noContextTakeover = z7;
        this.minimumDeflateSize = j5;
        this.messageBuffer = new m();
        this.sinkBuffer = nVar.i();
        this.maskKey = z5 ? new byte[4] : null;
        this.maskCursor = z5 ? new m.a() : null;
    }

    private final void d(int i5, p pVar) throws IOException {
        if (this.writerClosed) {
            throw new IOException(ProtectedSandApp.s("昑"));
        }
        int i02 = pVar.i0();
        if (!(((long) i02) <= 125)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("昐").toString());
        }
        this.sinkBuffer.writeByte(i5 | 128);
        if (this.isClient) {
            this.sinkBuffer.writeByte(i02 | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            l0.m(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (i02 > 0) {
                long size = this.sinkBuffer.size();
                this.sinkBuffer.S0(pVar);
                m mVar = this.sinkBuffer;
                m.a aVar = this.maskCursor;
                l0.m(aVar);
                mVar.m0(aVar);
                this.maskCursor.d(size);
                g.f31433w.c(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.writeByte(i02);
            this.sinkBuffer.S0(pVar);
        }
        this.sink.flush();
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final Random getRandom() {
        return this.random;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final n getSink() {
        return this.sink;
    }

    public final void c(int i5, @d5.e p pVar) throws IOException {
        p pVar2 = p.f31688s;
        if (i5 != 0 || pVar != null) {
            if (i5 != 0) {
                g.f31433w.d(i5);
            }
            m mVar = new m();
            mVar.writeShort(i5);
            if (pVar != null) {
                mVar.S0(pVar);
            }
            pVar2 = mVar.x0();
        }
        try {
            d(8, pVar2);
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

    public final void e(int i5, @d5.d p pVar) throws IOException {
        l0.p(pVar, ProtectedSandApp.s("昒"));
        if (this.writerClosed) {
            throw new IOException(ProtectedSandApp.s("易"));
        }
        this.messageBuffer.S0(pVar);
        int i6 = i5 | 128;
        if (this.perMessageDeflate && pVar.i0() >= this.minimumDeflateSize) {
            a aVar = this.messageDeflater;
            if (aVar == null) {
                aVar = new a(this.noContextTakeover);
                this.messageDeflater = aVar;
            }
            aVar.a(this.messageBuffer);
            i6 |= 64;
        }
        long size = this.messageBuffer.size();
        this.sinkBuffer.writeByte(i6);
        int i7 = this.isClient ? 128 : 0;
        if (size <= 125) {
            this.sinkBuffer.writeByte(((int) size) | i7);
        } else if (size <= g.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.writeByte(i7 | 126);
            this.sinkBuffer.writeShort((int) size);
        } else {
            this.sinkBuffer.writeByte(i7 | 127);
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
                mVar.m0(aVar2);
                this.maskCursor.d(0L);
                g.f31433w.c(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.t0(this.messageBuffer, size);
        this.sink.x();
    }

    public final void g(@d5.d p pVar) throws IOException {
        l0.p(pVar, ProtectedSandApp.s("昔"));
        d(9, pVar);
    }

    public final void j(@d5.d p pVar) throws IOException {
        l0.p(pVar, ProtectedSandApp.s("昕"));
        d(10, pVar);
    }
}
