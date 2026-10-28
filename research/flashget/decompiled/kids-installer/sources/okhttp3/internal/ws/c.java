package okhttp3.internal.ws;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.m;
import okio.o0;
import okio.y;

/* compiled from: MessageInflater.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/ws/c;", "Ljava/io/Closeable;", "Lokio/m;", "buffer", "Lkotlin/m2;", "a", "close", "o", "Lokio/m;", "deflatedBytes", "Ljava/util/zip/Inflater;", "p", "Ljava/util/zip/Inflater;", "inflater", "Lokio/y;", "q", "Lokio/y;", "inflaterSource", "", "r", "Z", "noContextTakeover", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class c implements Closeable {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final m deflatedBytes;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Inflater inflater;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final y inflaterSource;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean noContextTakeover;

    public c(boolean z5) {
        this.noContextTakeover = z5;
        m mVar = new m();
        this.deflatedBytes = mVar;
        Inflater inflater = new Inflater(true);
        this.inflater = inflater;
        this.inflaterSource = new y((o0) mVar, inflater);
    }

    public final void a(@d5.d m mVar) throws IOException {
        l0.p(mVar, ProtectedSandApp.s("既"));
        if (!(this.deflatedBytes.size() == 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("旣").toString());
        }
        if (this.noContextTakeover) {
            this.inflater.reset();
        }
        this.deflatedBytes.v0(mVar);
        this.deflatedBytes.writeInt(65535);
        long size = this.deflatedBytes.size() + this.inflater.getBytesRead();
        do {
            this.inflaterSource.a(mVar, Long.MAX_VALUE);
        } while (this.inflater.getBytesRead() < size);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inflaterSource.close();
    }
}
