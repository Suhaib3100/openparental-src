package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Utf8.kt */
@kd.i(name = "Utf8")
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0011\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0015\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\u00020\u0010*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a;\u0010\u0019\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a;\u0010\u001b\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001a\u001a;\u0010\u001c\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u001d\"\u0014\u0010 \u001a\u00020\u00178\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u001f\"\u0014\u0010\"\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010!\"\u0014\u0010#\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010!\"\u0014\u0010$\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010!\"\u0014\u0010%\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010!\"\u0014\u0010&\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010!\"\u0014\u0010'\u001a\u00020\u00018\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"", "", "beginIndex", "endIndex", "", "k", "(Ljava/lang/String;II)J", "codePoint", "", "a", "(I)Z", "", "byte", "b", "(B)Z", "Lkotlin/Function1;", "Lkotlin/k2;", "yield", "g", "(Ljava/lang/String;IILld/l;)V", "", "h", "([BIILld/l;)V", "", "f", "c", "([BIILld/l;)I", "d", "e", "B", "REPLACEMENT_BYTE", "C", "REPLACEMENT_CHARACTER", "I", "REPLACEMENT_CODE_POINT", "HIGH_SURROGATE_HEADER", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f85265a = 63;

    /* renamed from: b, reason: collision with root package name */
    public static final char f85266b = 65533;

    /* renamed from: c, reason: collision with root package name */
    public static final int f85267c = 65533;

    /* renamed from: d, reason: collision with root package name */
    public static final int f85268d = 55232;

    /* renamed from: e, reason: collision with root package name */
    public static final int f85269e = 56320;

    /* renamed from: f, reason: collision with root package name */
    public static final int f85270f = 3968;

    /* renamed from: g, reason: collision with root package name */
    public static final int f85271g = -123008;

    /* renamed from: h, reason: collision with root package name */
    public static final int f85272h = 3678080;

    public static final boolean a(int i4) {
        return (i4 >= 0 && 31 >= i4) || (127 <= i4 && 159 >= i4);
    }

    public static final boolean b(byte b5) {
        return (b5 & 192) == 128;
    }

    public static final int c(@fg.l byte[] bArr, int i4, int i5, @fg.l ld.l<? super Integer, k2> lVar) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("․"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("‥"));
        int i6 = i4 + 1;
        Integer valueOf = Integer.valueOf(f85267c);
        if (i5 <= i6) {
            lVar.invoke(valueOf);
            return 1;
        }
        byte b5 = bArr[i4];
        byte b6 = bArr[i6];
        if ((b6 & 192) != 128) {
            lVar.invoke(valueOf);
            return 1;
        }
        int i7 = (b6 ^ 3968) ^ (b5 << 6);
        if (i7 < 128) {
            lVar.invoke(valueOf);
            return 2;
        }
        lVar.invoke(Integer.valueOf(i7));
        return 2;
    }

    public static final int d(@fg.l byte[] bArr, int i4, int i5, @fg.l ld.l<? super Integer, k2> lVar) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("…"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("‥"));
        int i6 = i4 + 2;
        Integer valueOf = Integer.valueOf(f85267c);
        if (i5 <= i6) {
            lVar.invoke(valueOf);
            int i7 = i4 + 1;
            return (i5 <= i7 || (bArr[i7] & 192) != 128) ? 1 : 2;
        }
        byte b5 = bArr[i4];
        byte b6 = bArr[i4 + 1];
        if ((b6 & 192) != 128) {
            lVar.invoke(valueOf);
            return 1;
        }
        byte b7 = bArr[i6];
        if ((b7 & 192) != 128) {
            lVar.invoke(valueOf);
            return 2;
        }
        int i10 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b5 << 12);
        if (i10 < 2048) {
            lVar.invoke(valueOf);
            return 3;
        }
        if (55296 <= i10 && 57343 >= i10) {
            lVar.invoke(valueOf);
            return 3;
        }
        lVar.invoke(Integer.valueOf(i10));
        return 3;
    }

    public static final int e(@fg.l byte[] bArr, int i4, int i5, @fg.l ld.l<? super Integer, k2> lVar) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("‧"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("‥"));
        int i6 = i4 + 3;
        Integer valueOf = Integer.valueOf(f85267c);
        if (i5 <= i6) {
            lVar.invoke(valueOf);
            int i7 = i4 + 1;
            if (i5 <= i7 || (bArr[i7] & 192) != 128) {
                return 1;
            }
            int i10 = i4 + 2;
            return (i5 <= i10 || (bArr[i10] & 192) != 128) ? 2 : 3;
        }
        byte b5 = bArr[i4];
        byte b6 = bArr[i4 + 1];
        if ((b6 & 192) != 128) {
            lVar.invoke(valueOf);
            return 1;
        }
        byte b7 = bArr[i4 + 2];
        if ((b7 & 192) != 128) {
            lVar.invoke(valueOf);
            return 2;
        }
        byte b10 = bArr[i6];
        if ((b10 & 192) != 128) {
            lVar.invoke(valueOf);
            return 3;
        }
        int i11 = (((b10 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b5 << com.google.common.base.c.f54875u);
        if (i11 > 1114111) {
            lVar.invoke(valueOf);
            return 4;
        }
        if (55296 <= i11 && 57343 >= i11) {
            lVar.invoke(valueOf);
            return 4;
        }
        if (i11 < 65536) {
            lVar.invoke(valueOf);
            return 4;
        }
        lVar.invoke(Integer.valueOf(i11));
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
    
        if ((r11[r0] & 192) == 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008c, code lost:
    
        if ((r11[r0] & 192) == 128) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@fg.l byte[] r11, int r12, int r13, @fg.l ld.l<? super java.lang.Character, kotlin.k2> r14) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.r0.f(byte[], int, int, ld.l):void");
    }

    public static final void g(@fg.l String str, int i4, int i5, @fg.l ld.l<? super Byte, k2> lVar) {
        int i6;
        char charAt;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("\u2029"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("‥"));
        while (i4 < i5) {
            char charAt2 = str.charAt(i4);
            if (kotlin.jvm.internal.l0.t(charAt2, 128) < 0) {
                lVar.invoke(Byte.valueOf((byte) charAt2));
                i4++;
                while (i4 < i5 && kotlin.jvm.internal.l0.t(str.charAt(i4), 128) < 0) {
                    lVar.invoke(Byte.valueOf((byte) str.charAt(i4)));
                    i4++;
                }
            } else {
                if (kotlin.jvm.internal.l0.t(charAt2, 2048) < 0) {
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 >> 6) | 192)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 > charAt2 || 57343 < charAt2) {
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (kotlin.jvm.internal.l0.t(charAt2, 56319) > 0 || i5 <= (i6 = i4 + 1) || 56320 > (charAt = str.charAt(i6)) || 57343 < charAt) {
                    lVar.invoke(Byte.valueOf(f85265a));
                } else {
                    int charAt3 = (str.charAt(i6) + (charAt2 << '\n')) - 56613888;
                    lVar.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i4 += 2;
                }
                i4++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
    
        if ((r11[r0] & 192) == 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008a, code lost:
    
        if ((r11[r0] & 192) == 128) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(@fg.l byte[] r11, int r12, int r13, @fg.l ld.l<? super java.lang.Integer, kotlin.k2> r14) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.r0.h(byte[], int, int, ld.l):void");
    }

    @kd.j
    @kd.i(name = "size")
    public static final long i(@fg.l String str) {
        return l(str, 0, 0, 3, null);
    }

    @kd.j
    @kd.i(name = "size")
    public static final long j(@fg.l String str, int i4) {
        return l(str, i4, 0, 2, null);
    }

    @kd.j
    @kd.i(name = "size")
    public static final long k(@fg.l String str, int i4, int i5) {
        int i6;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("\u202b"));
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("‰"), i4).toString());
        }
        if (!(i5 >= i4)) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("\u202e"), i5, ProtectedSandApp.s(" "), i4).toString());
        }
        if (!(i5 <= str.length())) {
            StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("\u202c"), i5, ProtectedSandApp.s("\u202d"));
            a5.append(str.length());
            throw new IllegalArgumentException(a5.toString().toString());
        }
        long j4 = 0;
        while (i4 < i5) {
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                j4++;
            } else {
                if (charAt < 2048) {
                    i6 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i6 = 3;
                } else {
                    int i7 = i4 + 1;
                    char charAt2 = i7 < i5 ? str.charAt(i7) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j4++;
                        i4 = i7;
                    } else {
                        j4 += 4;
                        i4 += 2;
                    }
                }
                j4 += i6;
            }
            i4++;
        }
        return j4;
    }

    public static /* synthetic */ long l(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return k(str, i4, i5);
    }
}
