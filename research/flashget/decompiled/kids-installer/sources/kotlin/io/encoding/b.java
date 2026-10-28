package kotlin.io.encoding;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.l0;
import kotlin.text.Charsets;

/* compiled from: Base64JVM.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u001a%\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a5\u0010\b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b\u001a%\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0081\b¨\u0006\u000e"}, d2 = {"platformCharsToBytes", "", "Lkotlin/io/encoding/Base64;", "source", "", "startIndex", "", "endIndex", "platformEncodeIntoByteArray", "destination", "destinationOffset", "platformEncodeToByteArray", "platformEncodeToString", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {
    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @InlineOnly
    private static final byte[] a(Base64 base64, CharSequence charSequence, int i5, int i6) {
        l0.p(base64, ProtectedSandApp.s("㿄"));
        l0.p(charSequence, ProtectedSandApp.s("㿅"));
        if (!(charSequence instanceof String)) {
            return base64.e(charSequence, i5, i6);
        }
        base64.g(charSequence.length(), i5, i6);
        String substring = ((String) charSequence).substring(i5, i6);
        l0.o(substring, ProtectedSandApp.s("㿆"));
        Charset charset = Charsets.f27054g;
        l0.n(substring, ProtectedSandApp.s("㿇"));
        byte[] bytes = substring.getBytes(charset);
        l0.o(bytes, ProtectedSandApp.s("㿈"));
        return bytes;
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @InlineOnly
    private static final int b(Base64 base64, byte[] bArr, byte[] bArr2, int i5, int i6, int i7) {
        l0.p(base64, ProtectedSandApp.s("㿉"));
        l0.p(bArr, ProtectedSandApp.s("㿊"));
        l0.p(bArr2, ProtectedSandApp.s("㿋"));
        return base64.v(bArr, bArr2, i5, i6, i7);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @InlineOnly
    private static final byte[] c(Base64 base64, byte[] bArr, int i5, int i6) {
        l0.p(base64, ProtectedSandApp.s("㿌"));
        l0.p(bArr, ProtectedSandApp.s("㿍"));
        return base64.B(bArr, i5, i6);
    }

    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    @InlineOnly
    private static final String d(Base64 base64, byte[] bArr, int i5, int i6) {
        l0.p(base64, ProtectedSandApp.s("㿎"));
        l0.p(bArr, ProtectedSandApp.s("㿏"));
        return new String(base64.B(bArr, i5, i6), Charsets.f27054g);
    }
}
