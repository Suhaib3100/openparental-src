package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.m2;

/* compiled from: Utf8.kt */
@p3.i(name = "Utf8")
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\f\n\u0002\b\u0010\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0080\b\u001a4\u0010\u0010\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rH\u0080\bø\u0001\u0000\u001a4\u0010\u0012\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0080\bø\u0001\u0000\u001a4\u0010\u0014\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\rH\u0080\bø\u0001\u0000\u001a4\u0010\u0015\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0080\bø\u0001\u0000\u001a4\u0010\u0016\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0080\bø\u0001\u0000\"\u0014\u0010\u0019\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00138\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c\"\u0014\u0010 \u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c\"\u0014\u0010!\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u001c\"\u0014\u0010\"\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#"}, d2 = {"", "", "beginIndex", "endIndex", "", "k", "(Ljava/lang/String;II)J", "codePoint", "", "a", "", "byte", "b", "Lkotlin/Function1;", "Lkotlin/m2;", "yield", "g", "", "h", "", "f", "c", "d", "e", "B", "REPLACEMENT_BYTE", "C", "REPLACEMENT_CHARACTER", "I", "REPLACEMENT_CODE_POINT", "HIGH_SURROGATE_HEADER", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f31710a = 63;

    /* renamed from: b, reason: collision with root package name */
    public static final char f31711b = 65533;

    /* renamed from: c, reason: collision with root package name */
    public static final int f31712c = 65533;

    /* renamed from: d, reason: collision with root package name */
    public static final int f31713d = 55232;

    /* renamed from: e, reason: collision with root package name */
    public static final int f31714e = 56320;

    /* renamed from: f, reason: collision with root package name */
    public static final int f31715f = 3968;

    /* renamed from: g, reason: collision with root package name */
    public static final int f31716g = -123008;

    /* renamed from: h, reason: collision with root package name */
    public static final int f31717h = 3678080;

    public static final boolean a(int i5) {
        return (i5 >= 0 && 31 >= i5) || (127 <= i5 && 159 >= i5);
    }

    public static final boolean b(byte b6) {
        return (b6 & 192) == 128;
    }

    public static final int c(@d5.d byte[] bArr, int i5, int i6, @d5.d q3.l<? super Integer, m2> lVar) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("棂"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("棃"));
        int i7 = i5 + 1;
        Integer valueOf = Integer.valueOf(f31712c);
        if (i6 <= i7) {
            lVar.N(valueOf);
            return 1;
        }
        byte b6 = bArr[i5];
        byte b7 = bArr[i7];
        if (!((b7 & 192) == 128)) {
            lVar.N(valueOf);
            return 1;
        }
        int i8 = (b7 ^ ByteCompanionObject.f23584b) ^ (b6 << 6);
        if (i8 < 128) {
            lVar.N(valueOf);
            return 2;
        }
        lVar.N(Integer.valueOf(i8));
        return 2;
    }

    public static final int d(@d5.d byte[] bArr, int i5, int i6, @d5.d q3.l<? super Integer, m2> lVar) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("棄"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("棅"));
        int i7 = i5 + 2;
        Integer valueOf = Integer.valueOf(f31712c);
        if (i6 <= i7) {
            lVar.N(valueOf);
            int i8 = i5 + 1;
            if (i6 > i8) {
                if ((bArr[i8] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b6 = bArr[i5];
        byte b7 = bArr[i5 + 1];
        if (!((b7 & 192) == 128)) {
            lVar.N(valueOf);
            return 1;
        }
        byte b8 = bArr[i7];
        if (!((b8 & 192) == 128)) {
            lVar.N(valueOf);
            return 2;
        }
        int i9 = ((b8 ^ ByteCompanionObject.f23584b) ^ (b7 << 6)) ^ (b6 << 12);
        if (i9 < 2048) {
            lVar.N(valueOf);
            return 3;
        }
        if (55296 <= i9 && 57343 >= i9) {
            lVar.N(valueOf);
            return 3;
        }
        lVar.N(Integer.valueOf(i9));
        return 3;
    }

    public static final int e(@d5.d byte[] bArr, int i5, int i6, @d5.d q3.l<? super Integer, m2> lVar) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("棆"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("棇"));
        int i7 = i5 + 3;
        Integer valueOf = Integer.valueOf(f31712c);
        if (i6 <= i7) {
            lVar.N(valueOf);
            int i8 = i5 + 1;
            if (i6 > i8) {
                if ((bArr[i8] & 192) == 128) {
                    int i9 = i5 + 2;
                    if (i6 > i9) {
                        if ((bArr[i9] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b6 = bArr[i5];
        byte b7 = bArr[i5 + 1];
        if (!((b7 & 192) == 128)) {
            lVar.N(valueOf);
            return 1;
        }
        byte b8 = bArr[i5 + 2];
        if (!((b8 & 192) == 128)) {
            lVar.N(valueOf);
            return 2;
        }
        byte b9 = bArr[i7];
        if (!((b9 & 192) == 128)) {
            lVar.N(valueOf);
            return 3;
        }
        int i10 = (((b9 ^ ByteCompanionObject.f23584b) ^ (b8 << 6)) ^ (b7 << 12)) ^ (b6 << 18);
        if (i10 > 1114111) {
            lVar.N(valueOf);
            return 4;
        }
        if (55296 <= i10 && 57343 >= i10) {
            lVar.N(valueOf);
            return 4;
        }
        if (i10 < 65536) {
            lVar.N(valueOf);
            return 4;
        }
        lVar.N(Integer.valueOf(i10));
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x011a, code lost:
    
        if (((r16[r4] & 192) == 128) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009b, code lost:
    
        if (((r16[r4] & 192) == 128) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@d5.d byte[] r16, int r17, int r18, @d5.d q3.l<? super java.lang.Character, kotlin.m2> r19) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.r0.f(byte[], int, int, q3.l):void");
    }

    public static final void g(@d5.d String str, int i5, int i6, @d5.d q3.l<? super Byte, m2> lVar) {
        int i7;
        char charAt;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("棊"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("棋"));
        while (i5 < i6) {
            char charAt2 = str.charAt(i5);
            if (kotlin.jvm.internal.l0.t(charAt2, 128) < 0) {
                lVar.N(Byte.valueOf((byte) charAt2));
                i5++;
                while (i5 < i6 && kotlin.jvm.internal.l0.t(str.charAt(i5), 128) < 0) {
                    lVar.N(Byte.valueOf((byte) str.charAt(i5)));
                    i5++;
                }
            } else {
                if (kotlin.jvm.internal.l0.t(charAt2, 2048) < 0) {
                    lVar.N(Byte.valueOf((byte) ((charAt2 >> 6) | 192)));
                    lVar.N(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 > charAt2 || 57343 < charAt2) {
                    lVar.N(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    lVar.N(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    lVar.N(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (kotlin.jvm.internal.l0.t(charAt2, 56319) > 0 || i6 <= (i7 = i5 + 1) || 56320 > (charAt = str.charAt(i7)) || 57343 < charAt) {
                    lVar.N(Byte.valueOf(f31710a));
                } else {
                    int charAt3 = (str.charAt(i7) + (charAt2 << '\n')) - 56613888;
                    lVar.N(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                    lVar.N(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    lVar.N(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    lVar.N(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i5 += 2;
                }
                i5++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
    
        if (((r16[r4] & 192) == 128) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0099, code lost:
    
        if (((r16[r4] & 192) == 128) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(@d5.d byte[] r16, int r17, int r18, @d5.d q3.l<? super java.lang.Integer, kotlin.m2> r19) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.r0.h(byte[], int, int, q3.l):void");
    }

    @p3.i(name = "size")
    @p3.j
    public static final long i(@d5.d String str) {
        return l(str, 0, 0, 3, null);
    }

    @p3.i(name = "size")
    @p3.j
    public static final long j(@d5.d String str, int i5) {
        return l(str, i5, 0, 2, null);
    }

    @p3.i(name = "size")
    @p3.j
    public static final long k(@d5.d String str, int i5, int i6) {
        int i7;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("棎"));
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("棓"), i5).toString());
        }
        if (!(i6 >= i5)) {
            throw new IllegalArgumentException(android.content.preferences.protobuf.v.a(ProtectedSandApp.s("棑"), i6, ProtectedSandApp.s("棒"), i5).toString());
        }
        if (!(i6 <= str.length())) {
            StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("棏"), i6, ProtectedSandApp.s("棐"));
            a6.append(str.length());
            throw new IllegalArgumentException(a6.toString().toString());
        }
        long j5 = 0;
        while (i5 < i6) {
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                j5++;
            } else {
                if (charAt < 2048) {
                    i7 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i7 = 3;
                } else {
                    int i8 = i5 + 1;
                    char charAt2 = i8 < i6 ? str.charAt(i8) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j5++;
                        i5 = i8;
                    } else {
                        j5 += 4;
                        i5 += 2;
                    }
                }
                j5 += i7;
            }
            i5++;
        }
        return j5;
    }

    public static /* synthetic */ long l(String str, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        return k(str, i5, i6);
    }
}
