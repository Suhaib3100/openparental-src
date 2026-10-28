package okhttp3.internal.cache2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.m;

/* compiled from: FileOperator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache2/a;", "", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "", "pos", "Lokio/m;", "source", "byteCount", "Lkotlin/k2;", "b", "(JLokio/m;J)V", "sink", "a", "Ljava/nio/channels/FileChannel;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FileChannel fileChannel;

    public a(@l FileChannel fileChannel) {
        l0.p(fileChannel, ProtectedSandApp.s("ꁙ\u0001"));
        this.fileChannel = fileChannel;
    }

    public final void a(long pos, @l m sink, long byteCount) {
        l0.p(sink, ProtectedSandApp.s("ꁚ\u0001"));
        if (byteCount < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long transferTo = this.fileChannel.transferTo(pos, byteCount, sink);
            pos += transferTo;
            byteCount -= transferTo;
        }
    }

    public final void b(long pos, @l m source, long byteCount) throws IOException {
        l0.p(source, ProtectedSandApp.s("ꁛ\u0001"));
        if (byteCount < 0 || byteCount > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long transferFrom = this.fileChannel.transferFrom(source, pos, byteCount);
            pos += transferFrom;
            byteCount -= transferFrom;
        }
    }
}
