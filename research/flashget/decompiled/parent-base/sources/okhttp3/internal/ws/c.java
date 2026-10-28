package okhttp3.internal.ws;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.m;
import okio.o0;
import okio.y;

/* compiled from: MessageInflater.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/ws/c;", "Ljava/io/Closeable;", "", "noContextTakeover", "<init>", "(Z)V", "Lokio/m;", "buffer", "Lkotlin/k2;", "a", "(Lokio/m;)V", "close", "()V", "b", "Lokio/m;", "deflatedBytes", "Ljava/util/zip/Inflater;", "c", "Ljava/util/zip/Inflater;", "inflater", "Lokio/y;", "d", "Lokio/y;", "inflaterSource", "e", "Z", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class c implements Closeable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m deflatedBytes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y inflaterSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    public c(boolean z4) {
        this.noContextTakeover = z4;
        m mVar = new m();
        this.deflatedBytes = mVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new y((o0) mVar, inflater);
    }

    public final void a(@l m buffer) throws IOException {
        l0.p(buffer, ProtectedSandApp.s("Ẇ"));
        if (!(this.deflatedBytes.size() == 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ẇ"));
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.b1(buffer);
        this.deflatedBytes.writeInt(65535);
        long size = this.deflatedBytes.size() + this.inflater.getBytesRead();
        do {
            this.inflaterSource.a(buffer, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < size);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }
}
