package kotlin.io.encoding;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;

/* compiled from: Base64JVM.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001a,\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\u0007\u0010\b\u001a,\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\n\u0010\u000b\u001a<\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a,\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/io/encoding/a;", "", "source", "", "startIndex", "endIndex", "", "a", "(Lkotlin/io/encoding/a;Ljava/lang/CharSequence;II)[B", "", "d", "(Lkotlin/io/encoding/a;[BII)Ljava/lang/String;", "destination", "destinationOffset", "b", "(Lkotlin/io/encoding/a;[B[BIII)I", "c", "(Lkotlin/io/encoding/a;[BII)[B", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    @c1(version = "1.8")
    @f
    @kotlin.internal.f
    private static final byte[] a(a aVar, CharSequence charSequence, int i4, int i5) {
        l0.p(aVar, ProtectedSandApp.s("揎\u0001"));
        l0.p(charSequence, ProtectedSandApp.s("描\u0001"));
        if (!(charSequence instanceof String)) {
            return aVar.e(charSequence, i4, i5);
        }
        aVar.g(((String) charSequence).length(), i4, i5);
        String substring = ((String) charSequence).substring(i4, i5);
        l0.o(substring, ProtectedSandApp.s("提\u0001"));
        Charset charset = kotlin.text.f.ISO_8859_1;
        l0.n(substring, ProtectedSandApp.s("揑\u0001"));
        byte[] bytes = substring.getBytes(charset);
        l0.o(bytes, ProtectedSandApp.s("插\u0001"));
        return bytes;
    }

    @c1(version = "1.8")
    @f
    @kotlin.internal.f
    private static final int b(a aVar, byte[] bArr, byte[] bArr2, int i4, int i5, int i6) {
        l0.p(aVar, ProtectedSandApp.s("揎\u0001"));
        l0.p(bArr, ProtectedSandApp.s("描\u0001"));
        l0.p(bArr2, ProtectedSandApp.s("揓\u0001"));
        return aVar.v(bArr, bArr2, i4, i5, i6);
    }

    @c1(version = "1.8")
    @f
    @kotlin.internal.f
    private static final byte[] c(a aVar, byte[] bArr, int i4, int i5) {
        l0.p(aVar, ProtectedSandApp.s("揎\u0001"));
        l0.p(bArr, ProtectedSandApp.s("描\u0001"));
        return aVar.B(bArr, i4, i5);
    }

    @c1(version = "1.8")
    @f
    @kotlin.internal.f
    private static final String d(a aVar, byte[] bArr, int i4, int i5) {
        l0.p(aVar, ProtectedSandApp.s("揎\u0001"));
        l0.p(bArr, ProtectedSandApp.s("描\u0001"));
        return new String(aVar.B(bArr, i4, i5), kotlin.text.f.ISO_8859_1);
    }
}
