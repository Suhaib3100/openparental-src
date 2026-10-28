package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: utfEncoding.kt */
@r1({"SMAP\nutfEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n37#2,2:74\n1#3:76\n*S KotlinDebug\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n*L\n55#1:74,2\n*E\n"})
/* loaded from: classes7.dex */
public final class j {
    @l
    public static final byte[] a(@l String[] strArr) {
        l0.p(strArr, ProtectedSandApp.s("痙\u0001"));
        int i4 = 0;
        for (String str : strArr) {
            i4 += str.length();
        }
        byte[] bArr = new byte[i4];
        int i5 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i6 = 0;
            while (i6 < length) {
                bArr[i5] = (byte) str2.charAt(i6);
                i6++;
                i5++;
            }
        }
        return bArr;
    }
}
