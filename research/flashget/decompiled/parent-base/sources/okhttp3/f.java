package okhttp3;

import java.io.IOException;
import kotlin.Metadata;

/* compiled from: Callback.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/f;", "", "Lokhttp3/e;", "call", "Ljava/io/IOException;", "e", "Lkotlin/k2;", "a", "(Lokhttp3/e;Ljava/io/IOException;)V", "Lokhttp3/f0;", "response", "b", "(Lokhttp3/e;Lokhttp3/f0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public interface f {
    void a(@fg.l e call, @fg.l IOException e4);

    void b(@fg.l e call, @fg.l f0 response) throws IOException;
}
