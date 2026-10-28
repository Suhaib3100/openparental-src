package kotlin.io.encoding;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.l0;

/* compiled from: Base64IOStream.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"decodingWith", "Ljava/io/InputStream;", "base64", "Lkotlin/io/encoding/Base64;", "encodingWith", "Ljava/io/OutputStream;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/encoding/StreamEncodingKt")
/* loaded from: classes5.dex */
class h {
    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @d5.d
    public static final InputStream a(@d5.d InputStream inputStream, @d5.d Base64 base64) {
        l0.p(inputStream, ProtectedSandApp.s("㿣"));
        l0.p(base64, ProtectedSandApp.s("㿤"));
        return new DecodeInputStream(inputStream, base64);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @d5.d
    public static final OutputStream b(@d5.d OutputStream outputStream, @d5.d Base64 base64) {
        l0.p(outputStream, ProtectedSandApp.s("㿥"));
        l0.p(base64, ProtectedSandApp.s("㿦"));
        return new EncodeOutputStream(outputStream, base64);
    }
}
