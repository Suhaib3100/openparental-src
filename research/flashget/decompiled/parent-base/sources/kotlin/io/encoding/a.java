package kotlin.io.encoding;

import androidx.collection.n1;
import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okio.r0;

/* compiled from: Base64.kt */
@c1(version = "1.8")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0012\b\u0017\u0018\u0000 =2\u00020\u0001:\u00017B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0014J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J;\u0010!\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u0012J)\u0010#\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J?\u0010(\u001a\u00028\u0000\"\f\b\u0000\u0010'*\u00060%j\u0002`&2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J)\u0010*\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b*\u0010 J;\u0010+\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\u0012J)\u0010-\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020,2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J;\u0010/\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020,2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b/\u00100J'\u00101\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b1\u0010 J7\u00102\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b2\u0010\u0012J'\u00103\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020,2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b3\u0010.J\u0017\u00104\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b4\u00105J'\u00106\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b6\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:¨\u0006>"}, d2 = {"Lkotlin/io/encoding/a;", "", "", "isUrlSafe", "isMimeScheme", "<init>", "(ZZ)V", "", "sourceSize", "w", "(I)I", "", "source", "destination", "destinationOffset", "startIndex", "endIndex", "l", "([B[BIII)I", "q", "([BII)I", "padIndex", "byteStart", "C", "([BIII)I", "F", "destinationSize", "capacityNeeded", "Lkotlin/k2;", "f", "(III)V", "z", "([BII)[B", "t", "", "r", "([BII)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "x", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "i", "n", "", "h", "(Ljava/lang/CharSequence;II)[B", "m", "(Ljava/lang/CharSequence;[BIII)I", "B", "v", "e", "d", "([B)Ljava/lang/String;", "g", "a", "Z", "E", "()Z", "b", "D", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@f
/* loaded from: classes7.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private static final int f75122d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final int f75123e = 6;

    /* renamed from: f, reason: collision with root package name */
    public static final int f75124f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f75125g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f75126h = 61;

    /* renamed from: i, reason: collision with root package name */
    public static final int f75127i = 76;

    /* renamed from: j, reason: collision with root package name */
    private static final int f75128j = 19;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isUrlSafe;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isMimeScheme;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: k, reason: collision with root package name */
    @l
    private static final byte[] f75129k = {13, 10};

    /* renamed from: l, reason: collision with root package name */
    @l
    private static final a f75130l = new a(true, false);

    /* renamed from: m, reason: collision with root package name */
    @l
    private static final a f75131m = new a(false, true);

    /* compiled from: Base64.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lkotlin/io/encoding/a$a;", "Lkotlin/io/encoding/a;", "<init>", "()V", "", "mimeLineSeparatorSymbols", "[B", "H", "()[B", "UrlSafe", "Lkotlin/io/encoding/a;", "I", "()Lkotlin/io/encoding/a;", "Mime", "G", "", "bitsPerByte", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "", "padSymbol", "B", "symbolsPerGroup", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.encoding.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion extends a {
        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final a G() {
            return a.f75131m;
        }

        @l
        public final byte[] H() {
            return a.f75129k;
        }

        @l
        public final a I() {
            return a.f75130l;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Companion() {
            /*
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.a.Companion.<init>():void");
        }
    }

    public /* synthetic */ a(boolean z4, boolean z5, w wVar) {
        this(z4, z5);
    }

    public static /* synthetic */ byte[] A(a aVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("掱\u0001"));
        }
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = bArr.length;
        }
        return aVar.z(bArr, i4, i5);
    }

    private final int C(byte[] source, int padIndex, int endIndex, int byteStart) {
        if (byteStart == -8) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("掴\u0001"), padIndex));
        }
        if (byteStart != -6) {
            if (byteStart == -4) {
                padIndex = F(source, padIndex + 1, endIndex);
                if (padIndex == endIndex || source[padIndex] != 61) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("掳\u0001"), padIndex));
                }
            } else if (byteStart != -2) {
                throw new IllegalStateException(ProtectedSandApp.s("掲\u0001"));
            }
        }
        return padIndex + 1;
    }

    private final int F(byte[] source, int startIndex, int endIndex) {
        int[] iArr;
        if (!this.isMimeScheme) {
            return startIndex;
        }
        while (startIndex < endIndex) {
            int i4 = source[startIndex] & 255;
            iArr = c.f75135b;
            if (iArr[i4] != -1) {
                return startIndex;
            }
            startIndex++;
        }
        return startIndex;
    }

    private final void f(int destinationSize, int destinationOffset, int capacityNeeded) {
        String s4 = ProtectedSandApp.s("掵\u0001");
        if (destinationOffset < 0 || destinationOffset > destinationSize) {
            throw new IndexOutOfBoundsException(q.a(ProtectedSandApp.s("掸\u0001"), destinationOffset, s4, destinationSize));
        }
        int i4 = destinationOffset + capacityNeeded;
        if (i4 < 0 || i4 > destinationSize) {
            StringBuilder a5 = n1.a(ProtectedSandApp.s("掶\u0001"), destinationOffset, s4, destinationSize, ProtectedSandApp.s("掷\u0001"));
            a5.append(capacityNeeded);
            throw new IndexOutOfBoundsException(a5.toString());
        }
    }

    public static /* synthetic */ byte[] j(a aVar, CharSequence charSequence, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("掹\u0001"));
        }
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = charSequence.length();
        }
        return aVar.h(charSequence, i4, i5);
    }

    public static /* synthetic */ byte[] k(a aVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("掹\u0001"));
        }
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = bArr.length;
        }
        return aVar.i(bArr, i4, i5);
    }

    private final int l(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        String s4;
        String s5;
        String s6;
        int[] iArr = this.isUrlSafe ? c.f75137d : c.f75135b;
        int i4 = -8;
        int i5 = destinationOffset;
        int i6 = -8;
        int i7 = 0;
        int i10 = startIndex;
        while (true) {
            s4 = ProtectedSandApp.s("掺\u0001");
            s5 = ProtectedSandApp.s("掻\u0001");
            s6 = ProtectedSandApp.s("掼\u0001");
            if (i10 >= endIndex) {
                break;
            }
            if (i6 == i4 && i10 + 3 < endIndex) {
                int i11 = i10 + 4;
                int i12 = (iArr[source[i10] & 255] << 18) | (iArr[source[i10 + 1] & 255] << 12) | (iArr[source[i10 + 2] & 255] << 6) | iArr[source[i10 + 3] & 255];
                if (i12 >= 0) {
                    destination[i5] = (byte) (i12 >> 16);
                    int i13 = i5 + 2;
                    destination[i5 + 1] = (byte) (i12 >> 8);
                    i5 += 3;
                    destination[i13] = (byte) i12;
                    i10 = i11;
                    i4 = -8;
                }
            }
            int i14 = source[i10] & 255;
            int i15 = iArr[i14];
            if (i15 >= 0) {
                i10++;
                i7 = (i7 << 6) | i15;
                int i16 = i6 + 6;
                if (i16 >= 0) {
                    destination[i5] = (byte) (i7 >>> i16);
                    i7 &= (1 << i16) - 1;
                    i6 -= 2;
                    i5++;
                } else {
                    i6 = i16;
                }
            } else {
                if (i15 == -2) {
                    i10 = C(source, i10, endIndex, i6);
                    break;
                }
                if (!this.isMimeScheme) {
                    StringBuilder sb = new StringBuilder(ProtectedSandApp.s("掽\u0001"));
                    sb.append((char) i14);
                    sb.append(s6);
                    String num = Integer.toString(i14, kotlin.text.c.a(8));
                    l0.o(num, s5);
                    sb.append(num);
                    sb.append(s4);
                    sb.append(i10);
                    throw new IllegalArgumentException(sb.toString());
                }
                i10++;
            }
            i4 = -8;
        }
        if (i6 == -2) {
            throw new IllegalArgumentException(ProtectedSandApp.s("揀\u0001"));
        }
        int F = F(source, i10, endIndex);
        if (F >= endIndex) {
            return i5 - destinationOffset;
        }
        int i17 = source[F] & 255;
        StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("掾\u0001"));
        sb2.append((char) i17);
        sb2.append(s6);
        String num2 = Integer.toString(i17, kotlin.text.c.a(8));
        l0.o(num2, s5);
        sb2.append(num2);
        sb2.append(s4);
        throw new IllegalArgumentException(android.support.v4.media.b.a(sb2, F - 1, ProtectedSandApp.s("掿\u0001")));
    }

    public static /* synthetic */ int o(a aVar, CharSequence charSequence, byte[] bArr, int i4, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("揁\u0001"));
        }
        int i10 = (i7 & 4) != 0 ? 0 : i4;
        int i11 = (i7 & 8) != 0 ? 0 : i5;
        if ((i7 & 16) != 0) {
            i6 = charSequence.length();
        }
        return aVar.m(charSequence, bArr, i10, i11, i6);
    }

    public static /* synthetic */ int p(a aVar, byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("揁\u0001"));
        }
        int i10 = (i7 & 4) != 0 ? 0 : i4;
        int i11 = (i7 & 8) != 0 ? 0 : i5;
        if ((i7 & 16) != 0) {
            i6 = bArr.length;
        }
        return aVar.n(bArr, bArr2, i10, i11, i6);
    }

    private final int q(byte[] source, int startIndex, int endIndex) {
        int[] iArr;
        int i4 = endIndex - startIndex;
        if (i4 == 0) {
            return 0;
        }
        if (i4 == 1) {
            throw new IllegalArgumentException(q.a(ProtectedSandApp.s("揂\u0001"), startIndex, ProtectedSandApp.s("揃\u0001"), endIndex));
        }
        if (this.isMimeScheme) {
            while (true) {
                if (startIndex >= endIndex) {
                    break;
                }
                int i5 = source[startIndex] & 255;
                iArr = c.f75135b;
                int i6 = iArr[i5];
                if (i6 < 0) {
                    if (i6 == -2) {
                        i4 -= endIndex - startIndex;
                        break;
                    }
                    i4--;
                }
                startIndex++;
            }
        } else if (source[endIndex - 1] == 61) {
            i4 = source[endIndex + (-2)] == 61 ? i4 - 2 : i4 - 1;
        }
        return (int) ((i4 * 6) / 8);
    }

    public static /* synthetic */ String s(a aVar, byte[] bArr, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("揄\u0001"));
        }
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = bArr.length;
        }
        return aVar.r(bArr, i4, i5);
    }

    public static /* synthetic */ int u(a aVar, byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("揅\u0001"));
        }
        int i10 = (i7 & 4) != 0 ? 0 : i4;
        int i11 = (i7 & 8) != 0 ? 0 : i5;
        if ((i7 & 16) != 0) {
            i6 = bArr.length;
        }
        return aVar.t(bArr, bArr2, i10, i11, i6);
    }

    private final int w(int sourceSize) {
        int i4 = (sourceSize + 2) / 3;
        int i5 = ((this.isMimeScheme ? (i4 - 1) / 19 : 0) * 2) + (i4 * 4);
        if (i5 >= 0) {
            return i5;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("揆\u0001"));
    }

    public static /* synthetic */ Appendable y(a aVar, byte[] bArr, Appendable appendable, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("揇\u0001"));
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = bArr.length;
        }
        return aVar.x(bArr, appendable, i4, i5);
    }

    @l
    public final byte[] B(@l byte[] source, int startIndex, int endIndex) {
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        g(source.length, startIndex, endIndex);
        byte[] bArr = new byte[w(endIndex - startIndex)];
        v(source, bArr, 0, startIndex, endIndex);
        return bArr;
    }

    /* renamed from: D, reason: from getter */
    public final boolean getIsMimeScheme() {
        return this.isMimeScheme;
    }

    /* renamed from: E, reason: from getter */
    public final boolean getIsUrlSafe() {
        return this.isUrlSafe;
    }

    @l
    public final String d(@l byte[] source) {
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        StringBuilder sb = new StringBuilder(source.length);
        for (byte b5 : source) {
            sb.append((char) b5);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("掻\u0001"));
        return sb2;
    }

    @l
    public final byte[] e(@l CharSequence source, int startIndex, int endIndex) {
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        g(source.length(), startIndex, endIndex);
        byte[] bArr = new byte[endIndex - startIndex];
        int i4 = 0;
        while (startIndex < endIndex) {
            char charAt = source.charAt(startIndex);
            if (charAt <= 255) {
                bArr[i4] = (byte) charAt;
                i4++;
            } else {
                bArr[i4] = r0.f85265a;
                i4++;
            }
            startIndex++;
        }
        return bArr;
    }

    public final void g(int sourceSize, int startIndex, int endIndex) {
        kotlin.collections.c.INSTANCE.a(startIndex, endIndex, sourceSize);
    }

    @l
    public final byte[] h(@l CharSequence source, int startIndex, int endIndex) {
        byte[] e4;
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        if (source instanceof String) {
            g(((String) source).length(), startIndex, endIndex);
            String substring = ((String) source).substring(startIndex, endIndex);
            l0.o(substring, ProtectedSandApp.s("揉\u0001"));
            Charset charset = kotlin.text.f.ISO_8859_1;
            l0.n(substring, ProtectedSandApp.s("揊\u0001"));
            e4 = substring.getBytes(charset);
            l0.o(e4, ProtectedSandApp.s("揋\u0001"));
        } else {
            e4 = e(source, startIndex, endIndex);
        }
        return k(this, e4, 0, 0, 6, null);
    }

    @l
    public final byte[] i(@l byte[] source, int startIndex, int endIndex) {
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        g(source.length, startIndex, endIndex);
        int q4 = q(source, startIndex, endIndex);
        byte[] bArr = new byte[q4];
        if (l(source, bArr, 0, startIndex, endIndex) == q4) {
            return bArr;
        }
        throw new IllegalStateException(ProtectedSandApp.s("揌\u0001"));
    }

    public final int m(@l CharSequence source, @l byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        byte[] e4;
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        l0.p(destination, ProtectedSandApp.s("揍\u0001"));
        if (source instanceof String) {
            g(((String) source).length(), startIndex, endIndex);
            String substring = ((String) source).substring(startIndex, endIndex);
            l0.o(substring, ProtectedSandApp.s("揉\u0001"));
            Charset charset = kotlin.text.f.ISO_8859_1;
            l0.n(substring, ProtectedSandApp.s("揊\u0001"));
            e4 = substring.getBytes(charset);
            l0.o(e4, ProtectedSandApp.s("揋\u0001"));
        } else {
            e4 = e(source, startIndex, endIndex);
        }
        return p(this, e4, destination, destinationOffset, 0, 0, 24, null);
    }

    public final int n(@l byte[] source, @l byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        l0.p(destination, ProtectedSandApp.s("揍\u0001"));
        g(source.length, startIndex, endIndex);
        f(destination.length, destinationOffset, q(source, startIndex, endIndex));
        return l(source, destination, destinationOffset, startIndex, endIndex);
    }

    @l
    public final String r(@l byte[] source, int startIndex, int endIndex) {
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        return new String(B(source, startIndex, endIndex), kotlin.text.f.ISO_8859_1);
    }

    public final int t(@l byte[] source, @l byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        l0.p(destination, ProtectedSandApp.s("揍\u0001"));
        return v(source, destination, destinationOffset, startIndex, endIndex);
    }

    public final int v(@l byte[] source, @l byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i4 = startIndex;
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        l0.p(destination, ProtectedSandApp.s("揍\u0001"));
        g(source.length, i4, endIndex);
        f(destination.length, destinationOffset, w(endIndex - i4));
        byte[] bArr = this.isUrlSafe ? c.f75136c : c.f75134a;
        int i5 = this.isMimeScheme ? 19 : Integer.MAX_VALUE;
        int i6 = destinationOffset;
        while (i4 + 2 < endIndex) {
            int min = Math.min((endIndex - i4) / 3, i5);
            for (int i7 = 0; i7 < min; i7++) {
                int i10 = source[i4] & 255;
                int i11 = i4 + 2;
                int i12 = source[i4 + 1] & 255;
                i4 += 3;
                int i13 = (i12 << 8) | (i10 << 16) | (source[i11] & 255);
                destination[i6] = bArr[i13 >>> 18];
                destination[i6 + 1] = bArr[(i13 >>> 12) & 63];
                int i14 = i6 + 3;
                destination[i6 + 2] = bArr[(i13 >>> 6) & 63];
                i6 += 4;
                destination[i14] = bArr[i13 & 63];
            }
            if (min == i5 && i4 != endIndex) {
                int i15 = i6 + 1;
                byte[] bArr2 = f75129k;
                destination[i6] = bArr2[0];
                i6 += 2;
                destination[i15] = bArr2[1];
            }
        }
        int i16 = endIndex - i4;
        if (i16 == 1) {
            int i17 = (source[i4] & 255) << 4;
            destination[i6] = bArr[i17 >>> 6];
            destination[i6 + 1] = bArr[i17 & 63];
            int i18 = i6 + 3;
            destination[i6 + 2] = f75126h;
            i6 += 4;
            destination[i18] = f75126h;
            i4++;
        } else if (i16 == 2) {
            int i19 = i4 + 1;
            int i20 = source[i4] & 255;
            i4 += 2;
            int i21 = ((source[i19] & 255) << 2) | (i20 << 10);
            destination[i6] = bArr[i21 >>> 12];
            destination[i6 + 1] = bArr[(i21 >>> 6) & 63];
            int i22 = i6 + 3;
            destination[i6 + 2] = bArr[i21 & 63];
            i6 += 4;
            destination[i22] = f75126h;
        }
        if (i4 == endIndex) {
            return i6 - destinationOffset;
        }
        throw new IllegalStateException(ProtectedSandApp.s("揌\u0001"));
    }

    @l
    public final <A extends Appendable> A x(@l byte[] source, @l A destination, int startIndex, int endIndex) {
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        l0.p(destination, ProtectedSandApp.s("揍\u0001"));
        destination.append(new String(B(source, startIndex, endIndex), kotlin.text.f.ISO_8859_1));
        return destination;
    }

    @l
    public final byte[] z(@l byte[] source, int startIndex, int endIndex) {
        l0.p(source, ProtectedSandApp.s("揈\u0001"));
        return B(source, startIndex, endIndex);
    }

    private a(boolean z4, boolean z5) {
        this.isUrlSafe = z4;
        this.isMimeScheme = z5;
        if (z4 && z5) {
            throw new IllegalArgumentException(ProtectedSandApp.s("掰\u0001"));
        }
    }
}
