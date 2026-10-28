package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import kotlin.Metadata;
import okio.p;

/* compiled from: -Base64.kt */
@kd.i(name = "-Base64")
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\f\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\f\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"", "", "a", "(Ljava/lang/String;)[B", "map", "b", "([B[B)Ljava/lang/String;", "[B", "d", "()[B", "BASE64", "e", "BASE64_URL_SAFE", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final byte[] f85156a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final byte[] f85157b;

    static {
        p.Companion companion = p.INSTANCE;
        f85156a = companion.l(ProtectedSandApp.s("Ἃ")).o();
        f85157b = companion.l(ProtectedSandApp.s("Ἄ")).o();
    }

    @fg.m
    public static final byte[] a(@fg.l String str) {
        int i4;
        char charAt;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("Ἅ"));
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i5 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i5];
        int i6 = 0;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt2 = str.charAt(i11);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i4 = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i4 = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i4 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i4 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i4 = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i7 = (i7 << 6) | i4;
            i6++;
            if (i6 % 4 == 0) {
                bArr[i10] = (byte) (i7 >> 16);
                int i12 = i10 + 2;
                bArr[i10 + 1] = (byte) (i7 >> 8);
                i10 += 3;
                bArr[i12] = (byte) i7;
            }
        }
        int i13 = i6 % 4;
        if (i13 == 1) {
            return null;
        }
        if (i13 == 2) {
            bArr[i10] = (byte) ((i7 << 12) >> 16);
            i10++;
        } else if (i13 == 3) {
            int i14 = i7 << 6;
            int i15 = i10 + 1;
            bArr[i10] = (byte) (i14 >> 16);
            i10 += 2;
            bArr[i15] = (byte) (i14 >> 8);
        }
        if (i10 == i5) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i10);
        kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("Ἆ"));
        return copyOf;
    }

    @fg.l
    public static final String b(@fg.l byte[] bArr, @fg.l byte[] bArr2) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("Ἇ"));
        kotlin.jvm.internal.l0.p(bArr2, ProtectedSandApp.s("ἐ"));
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            byte b5 = bArr[i4];
            int i6 = i4 + 2;
            byte b6 = bArr[i4 + 1];
            i4 += 3;
            byte b7 = bArr[i6];
            bArr3[i5] = bArr2[(b5 & 255) >> 2];
            bArr3[i5 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            int i7 = i5 + 3;
            bArr3[i5 + 2] = bArr2[((b6 & com.google.common.base.c.f54871q) << 2) | ((b7 & 255) >> 6)];
            i5 += 4;
            bArr3[i7] = bArr2[b7 & r0.f85265a];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b10 = bArr[i4];
            bArr3[i5] = bArr2[(b10 & 255) >> 2];
            bArr3[i5 + 1] = bArr2[(b10 & 3) << 4];
            byte b11 = (byte) 61;
            bArr3[i5 + 2] = b11;
            bArr3[i5 + 3] = b11;
        } else if (length2 == 2) {
            int i10 = i4 + 1;
            byte b12 = bArr[i4];
            byte b13 = bArr[i10];
            bArr3[i5] = bArr2[(b12 & 255) >> 2];
            bArr3[i5 + 1] = bArr2[((b12 & 3) << 4) | ((b13 & 255) >> 4)];
            bArr3[i5 + 2] = bArr2[(b13 & com.google.common.base.c.f54871q) << 2];
            bArr3[i5 + 3] = (byte) 61;
        }
        return i.c(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bArr2 = f85156a;
        }
        return b(bArr, bArr2);
    }

    @fg.l
    public static final byte[] d() {
        return f85156a;
    }

    @fg.l
    public static final byte[] e() {
        return f85157b;
    }
}
