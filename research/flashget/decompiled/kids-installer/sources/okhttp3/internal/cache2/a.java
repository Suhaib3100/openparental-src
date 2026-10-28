package okhttp3.internal.cache2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.m;

/* compiled from: FileOperator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache2/a;", "", "", "pos", "Lokio/m;", "source", "byteCount", "Lkotlin/m2;", "b", "sink", "a", "Ljava/nio/channels/FileChannel;", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FileChannel fileChannel;

    public a(@d FileChannel fileChannel) {
        l0.p(fileChannel, ProtectedSandApp.s("愿"));
        this.fileChannel = fileChannel;
    }

    public final void a(long j5, @d m mVar, long j6) {
        l0.p(mVar, ProtectedSandApp.s("慀"));
        if (j6 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j6 > 0) {
            long transferTo = this.fileChannel.transferTo(j5, j6, mVar);
            j5 += transferTo;
            j6 -= transferTo;
        }
    }

    public final void b(long j5, @d m mVar, long j6) throws IOException {
        l0.p(mVar, ProtectedSandApp.s("慁"));
        if (j6 < 0 || j6 > mVar.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j6 > 0) {
            long transferFrom = this.fileChannel.transferFrom(mVar, j5, j6);
            j5 += transferFrom;
            j6 -= transferFrom;
        }
    }
}
