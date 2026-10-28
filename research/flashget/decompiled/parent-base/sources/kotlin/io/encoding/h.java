package kotlin.io.encoding;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;

/* compiled from: Base64IOStream.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljava/io/InputStream;", "Lkotlin/io/encoding/a;", "base64", "a", "(Ljava/io/InputStream;Lkotlin/io/encoding/a;)Ljava/io/InputStream;", "Ljava/io/OutputStream;", "b", "(Ljava/io/OutputStream;Lkotlin/io/encoding/a;)Ljava/io/OutputStream;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/encoding/StreamEncodingKt")
/* loaded from: classes7.dex */
class h {
    @l
    @c1(version = "1.8")
    @f
    public static final InputStream a(@l InputStream inputStream, @l a aVar) {
        l0.p(inputStream, ProtectedSandApp.s("揥\u0001"));
        l0.p(aVar, ProtectedSandApp.s("揦\u0001"));
        return new d(inputStream, aVar);
    }

    @l
    @c1(version = "1.8")
    @f
    public static final OutputStream b(@l OutputStream outputStream, @l a aVar) {
        l0.p(outputStream, ProtectedSandApp.s("揥\u0001"));
        l0.p(aVar, ProtectedSandApp.s("揦\u0001"));
        return new e(outputStream, aVar);
    }
}
