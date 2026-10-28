package okio;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: Source.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lokio/o0;", "Ljava/io/Closeable;", "Lokio/m;", "sink", "", "byteCount", "X0", "Lokio/q0;", "h", "Lkotlin/m2;", "close", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public interface o0 extends Closeable {
    long X0(@d5.d m sink, long byteCount) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    @d5.d
    q0 h();
}
