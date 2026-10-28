package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import okio.p;

/* compiled from: -Base64.kt */
@p3.i(name = "-Base64")
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\n\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\u0016\u0010\u0004\u001a\u00020\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0000\"\u001a\u0010\b\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"", "", "a", "map", "b", "[B", "d", "()[B", "BASE64", "e", "BASE64_URL_SAFE", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final byte[] f31600a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final byte[] f31601b;

    static {
        p.a aVar = p.f31689t;
        f31600a = aVar.l(ProtectedSandApp.s("柮")).y();
        f31601b = aVar.l(ProtectedSandApp.s("柯")).y();
    }

    @d5.e
    public static final byte[] a(@d5.d String str) {
        int i5;
        char charAt;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("柰"));
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i6 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i6];
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt2 = str.charAt(i10);
            if ('A' <= charAt2 && 'Z' >= charAt2) {
                i5 = charAt2 - 'A';
            } else if ('a' <= charAt2 && 'z' >= charAt2) {
                i5 = charAt2 - 'G';
            } else if ('0' <= charAt2 && '9' >= charAt2) {
                i5 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i5 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i5 = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i8 = (i8 << 6) | i5;
            i7++;
            if (i7 % 4 == 0) {
                int i11 = i9 + 1;
                bArr[i9] = (byte) (i8 >> 16);
                int i12 = i11 + 1;
                bArr[i11] = (byte) (i8 >> 8);
                bArr[i12] = (byte) i8;
                i9 = i12 + 1;
            }
        }
        int i13 = i7 % 4;
        if (i13 == 1) {
            return null;
        }
        if (i13 == 2) {
            bArr[i9] = (byte) ((i8 << 12) >> 16);
            i9++;
        } else if (i13 == 3) {
            int i14 = i8 << 6;
            int i15 = i9 + 1;
            bArr[i9] = (byte) (i14 >> 16);
            i9 = i15 + 1;
            bArr[i15] = (byte) (i14 >> 8);
        }
        if (i9 == i6) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i9);
        kotlin.jvm.internal.l0.o(copyOf, ProtectedSandApp.s("柱"));
        return copyOf;
    }

    @d5.d
    public static final String b(@d5.d byte[] bArr, @d5.d byte[] bArr2) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("柲"));
        kotlin.jvm.internal.l0.p(bArr2, ProtectedSandApp.s("柳"));
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = i5 + 1;
            byte b6 = bArr[i5];
            int i8 = i7 + 1;
            byte b7 = bArr[i7];
            int i9 = i8 + 1;
            byte b8 = bArr[i8];
            int i10 = i6 + 1;
            bArr3[i6] = bArr2[(b6 & UByte.f27220r) >> 2];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[((b6 & 3) << 4) | ((b7 & UByte.f27220r) >> 4)];
            int i12 = i11 + 1;
            bArr3[i11] = bArr2[((b7 & 15) << 2) | ((b8 & UByte.f27220r) >> 6)];
            i6 = i12 + 1;
            bArr3[i12] = bArr2[b8 & r0.f31710a];
            i5 = i9;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b9 = bArr[i5];
            int i13 = i6 + 1;
            bArr3[i6] = bArr2[(b9 & UByte.f27220r) >> 2];
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[(b9 & 3) << 4];
            byte b10 = (byte) 61;
            bArr3[i14] = b10;
            bArr3[i14 + 1] = b10;
        } else if (length2 == 2) {
            int i15 = i5 + 1;
            byte b11 = bArr[i5];
            byte b12 = bArr[i15];
            int i16 = i6 + 1;
            bArr3[i6] = bArr2[(b11 & UByte.f27220r) >> 2];
            int i17 = i16 + 1;
            bArr3[i16] = bArr2[((b11 & 3) << 4) | ((b12 & UByte.f27220r) >> 4)];
            bArr3[i17] = bArr2[(b12 & 15) << 2];
            bArr3[i17 + 1] = (byte) 61;
        }
        return i.c(bArr3);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            bArr2 = f31600a;
        }
        return b(bArr, bArr2);
    }

    @d5.d
    public static final byte[] d() {
        return f31600a;
    }

    @d5.d
    public static final byte[] e() {
        return f31601b;
    }
}
