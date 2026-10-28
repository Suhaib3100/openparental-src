package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;

/* compiled from: utfEncoding.kt */
/* loaded from: classes5.dex */
public final class j {
    @d5.d
    public static final byte[] a(@d5.d String[] strArr) {
        l0.p(strArr, ProtectedSandApp.s("丷"));
        int i5 = 0;
        for (String str : strArr) {
            i5 += str.length();
        }
        byte[] bArr = new byte[i5];
        int i6 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i7 = 0;
            while (i7 < length) {
                bArr[i6] = (byte) str2.charAt(i7);
                i7++;
                i6++;
            }
        }
        return bArr;
    }
}
