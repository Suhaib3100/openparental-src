package okhttp3.internal.ws;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.m;
import okio.m0;
import okio.p;
import okio.q;

/* compiled from: MessageDeflater.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lokhttp3/internal/ws/a;", "Ljava/io/Closeable;", "Lokio/m;", "Lokio/p;", "suffix", "", "b", "buffer", "Lkotlin/m2;", "a", "close", "o", "Lokio/m;", "deflatedBytes", "Ljava/util/zip/Deflater;", "p", "Ljava/util/zip/Deflater;", "deflater", "Lokio/q;", "q", "Lokio/q;", "deflaterSink", "r", "Z", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a implements Closeable {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final m deflatedBytes;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Deflater deflater;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final q deflaterSink;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    public a(boolean z5) {
        this.noContextTakeover = z5;
        m mVar = new m();
        this.deflatedBytes = mVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new q((m0) mVar, deflater);
    }

    private final boolean b(m mVar, p pVar) {
        return mVar.q0(mVar.size() - pVar.i0(), pVar);
    }

    public final void a(@d5.d m mVar) throws IOException {
        p pVar;
        l0.p(mVar, ProtectedSandApp.s("旟"));
        if (!(this.deflatedBytes.size() == 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("无").toString());
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.t0(mVar, mVar.size());
        this.deflaterSink.flush();
        m mVar2 = this.deflatedBytes;
        pVar = b.f31342a;
        if (b(mVar2, pVar)) {
            long size = this.deflatedBytes.size() - 4;
            m.a n02 = m.n0(this.deflatedBytes, null, 1, null);
            try {
                n02.c(size);
                kotlin.io.b.a(n02, null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        m mVar3 = this.deflatedBytes;
        mVar.t0(mVar3, mVar3.size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }
}
