package okhttp3.internal.ws;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/ws/a;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lokio/m;", "Lokio/p;", "suffix", "b", "(Lokio/m;Lokio/p;)Z", "buffer", "Lkotlin/k2;", "a", "(Lokio/m;)V", "close", "()V", "Lokio/m;", "deflatedBytes", "Ljava/util/zip/Deflater;", "c", "Ljava/util/zip/Deflater;", "deflater", "Lokio/q;", "d", "Lokio/q;", "deflaterSink", "e", "Z", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class a implements Closeable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m deflatedBytes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Deflater deflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q deflaterSink;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    public a(boolean z4) {
        this.noContextTakeover = z4;
        m mVar = new m();
        this.deflatedBytes = mVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new q((m0) mVar, deflater);
    }

    private final boolean b(m mVar, p pVar) {
        return mVar.T0(mVar.size() - pVar.q(), pVar);
    }

    public final void a(@l m buffer) throws IOException {
        p pVar;
        l0.p(buffer, ProtectedSandApp.s("ẃ"));
        if (!(this.deflatedBytes.size() == 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("Ẅ"));
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.size());
        this.deflaterSink.flush();
        m mVar = this.deflatedBytes;
        pVar = b.f84882a;
        if (b(mVar, pVar)) {
            long size = this.deflatedBytes.size() - 4;
            m.a I = m.I(this.deflatedBytes, null, 1, null);
            try {
                I.c(size);
                kotlin.io.b.a(I, null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        m mVar2 = this.deflatedBytes;
        buffer.write(mVar2, mVar2.size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.deflaterSink.close();
    }
}
