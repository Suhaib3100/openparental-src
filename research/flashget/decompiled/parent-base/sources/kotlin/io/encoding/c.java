package kotlin.io.encoding;

import fg.l;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.r1;

/* compiled from: Base64.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000e\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007\"\u001a\u0010\u0013\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u0012\u0004\b\u0012\u0010\r¨\u0006\u0014"}, d2 = {"", "symbol", "", "g", "(I)Z", "", "a", "[B", "base64EncodeMap", "", "b", "[I", "e", "()V", "base64DecodeMap", "c", "base64UrlEncodeMap", "d", "f", "base64UrlDecodeMap", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,643:1\n13384#2,3:644\n13384#2,3:647\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n580#1:644,3\n597#1:647,3\n*E\n"})
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final byte[] f75134a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final int[] f75135b;

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final byte[] f75136c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final int[] f75137d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f75134a = bArr;
        int[] iArr = new int[256];
        int i4 = 0;
        kotlin.collections.l.T1(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            iArr[bArr[i5]] = i6;
            i5++;
            i6++;
        }
        f75135b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f75136c = bArr2;
        int[] iArr2 = new int[256];
        kotlin.collections.l.T1(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i7 = 0;
        while (i4 < length2) {
            iArr2[bArr2[i4]] = i7;
            i4++;
            i7++;
        }
        f75137d = iArr2;
    }

    @f
    private static /* synthetic */ void e() {
    }

    @f
    private static /* synthetic */ void f() {
    }

    @c1(version = "1.8")
    @f
    public static final boolean g(int i4) {
        if (i4 >= 0) {
            int[] iArr = f75135b;
            if (i4 < iArr.length && iArr[i4] != -1) {
                return true;
            }
        }
        return false;
    }
}
