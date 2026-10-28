package kotlin.io.encoding;

import android.content.preferences.protobuf.v;
import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.Charsets;
import okio.r0;

/* compiled from: Base64.kt */
@SinceKotlin(version = "1.8")
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 22\u00020\u0001:\u00012B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ%\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0013J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J%\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u001bJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J0\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J \u0010 \u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J4\u0010\"\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J5\u0010#\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b$J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J=\u0010&\u001a\u0002H'\"\f\b\u0000\u0010'*\u00060(j\u0002`)2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u0002H'2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010*J\"\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011J%\u0010,\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0002\b-J(\u0010.\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002J \u00101\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u00063"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "isUrlSafe", "", "isMimeScheme", "(ZZ)V", "isMimeScheme$kotlin_stdlib", "()Z", "isUrlSafe$kotlin_stdlib", "bytesToStringImpl", "", "source", "", "bytesToStringImpl$kotlin_stdlib", "charsToBytesImpl", "", "startIndex", "", "endIndex", "charsToBytesImpl$kotlin_stdlib", "checkDestinationBounds", "", "destinationSize", "destinationOffset", "capacityNeeded", "checkSourceBounds", "sourceSize", "checkSourceBounds$kotlin_stdlib", "decode", "decodeImpl", "destination", "decodeIntoByteArray", "decodeSize", "encode", "encodeIntoByteArray", "encodeIntoByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeSize", "encodeToAppendable", "A", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "encodeToByteArray", "encodeToByteArrayImpl", "encodeToByteArrayImpl$kotlin_stdlib", "handlePaddingSymbol", "padIndex", "byteStart", "skipIllegalSymbolsIfMime", "Default", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalEncodingApi
/* renamed from: kotlin.io.encoding.a, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public class Base64 {

    /* renamed from: d, reason: collision with root package name */
    private static final int f23363d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final int f23364e = 6;

    /* renamed from: f, reason: collision with root package name */
    public static final int f23365f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f23366g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f23367h = 61;

    /* renamed from: i, reason: collision with root package name */
    public static final int f23368i = 76;

    /* renamed from: j, reason: collision with root package name */
    private static final int f23369j = 19;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23373a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23374b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    public static final a f23362c = new a(null);

    /* renamed from: k, reason: collision with root package name */
    @d5.d
    private static final byte[] f23370k = {13, 10};

    /* renamed from: l, reason: collision with root package name */
    @d5.d
    private static final Base64 f23371l = new Base64(true, false);

    /* renamed from: m, reason: collision with root package name */
    @d5.d
    private static final Base64 f23372m = new Base64(false, true);

    /* compiled from: Base64.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "()V", "Mime", "getMime", "()Lkotlin/io/encoding/Base64;", "UrlSafe", "getUrlSafe", "bitsPerByte", "", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "mimeLineSeparatorSymbols", "", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "padSymbol", "", "symbolsPerGroup", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.io.encoding.a$a */
    public static final class a extends Base64 {
        public /* synthetic */ a(w wVar) {
            this();
        }

        @d5.d
        public final Base64 G() {
            return Base64.f23372m;
        }

        @d5.d
        public final byte[] H() {
            return Base64.f23370k;
        }

        @d5.d
        public final Base64 I() {
            return Base64.f23371l;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private a() {
            /*
                r2 = this;
                r0 = 0
                r1 = 0
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.encoding.Base64.a.<init>():void");
        }
    }

    public /* synthetic */ Base64(boolean z5, boolean z6, w wVar) {
        this(z5, z6);
    }

    public static /* synthetic */ byte[] A(Base64 base64, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㾑"));
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return base64.z(bArr, i5, i6);
    }

    private final int C(byte[] bArr, int i5, int i6, int i7) {
        if (i7 == -8) {
            throw new IllegalArgumentException(s.a(ProtectedSandApp.s("㾔"), i5));
        }
        if (i7 != -6) {
            if (i7 == -4) {
                i5 = F(bArr, i5 + 1, i6);
                if (i5 == i6 || bArr[i5] != 61) {
                    throw new IllegalArgumentException(s.a(ProtectedSandApp.s("㾓"), i5));
                }
            } else if (i7 != -2) {
                throw new IllegalStateException(ProtectedSandApp.s("㾒").toString());
            }
        }
        return i5 + 1;
    }

    private final int F(byte[] bArr, int i5, int i6) {
        int[] iArr;
        if (!this.f23374b) {
            return i5;
        }
        while (i5 < i6) {
            int i7 = bArr[i5] & UByte.f27220r;
            iArr = c.f23376b;
            if (iArr[i7] != -1) {
                return i5;
            }
            i5++;
        }
        return i5;
    }

    private final void f(int i5, int i6, int i7) {
        String s5 = ProtectedSandApp.s("㾕");
        if (i6 < 0 || i6 > i5) {
            throw new IndexOutOfBoundsException(v.a(ProtectedSandApp.s("㾘"), i6, s5, i5));
        }
        int i8 = i6 + i7;
        if (i8 < 0 || i8 > i5) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("㾖") + i6 + s5 + i5 + ProtectedSandApp.s("㾗") + i7);
        }
    }

    public static /* synthetic */ byte[] j(Base64 base64, CharSequence charSequence, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㾙"));
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = charSequence.length();
        }
        return base64.h(charSequence, i5, i6);
    }

    public static /* synthetic */ byte[] k(Base64 base64, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㾚"));
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return base64.i(bArr, i5, i6);
    }

    private final int l(byte[] bArr, byte[] bArr2, int i5, int i6, int i7) {
        String s5;
        String s6;
        String s7;
        int a6;
        int a7;
        int[] iArr = this.f23373a ? c.f23378d : c.f23376b;
        int i8 = -8;
        int i9 = i5;
        int i10 = -8;
        int i11 = 0;
        int i12 = i6;
        while (true) {
            s5 = ProtectedSandApp.s("㾛");
            s6 = ProtectedSandApp.s("㾜");
            s7 = ProtectedSandApp.s("㾝");
            if (i12 >= i7) {
                break;
            }
            if (i10 == i8 && i12 + 3 < i7) {
                int i13 = i12 + 1;
                int i14 = iArr[bArr[i12] & UByte.f27220r];
                int i15 = i13 + 1;
                int i16 = iArr[bArr[i13] & UByte.f27220r];
                int i17 = i15 + 1;
                int i18 = iArr[bArr[i15] & UByte.f27220r];
                int i19 = i17 + 1;
                int i20 = (i18 << 6) | (i14 << 18) | (i16 << 12) | iArr[bArr[i17] & UByte.f27220r];
                if (i20 >= 0) {
                    int i21 = i9 + 1;
                    bArr2[i9] = (byte) (i20 >> 16);
                    int i22 = i21 + 1;
                    bArr2[i21] = (byte) (i20 >> 8);
                    bArr2[i22] = (byte) i20;
                    i9 = i22 + 1;
                    i12 = i19;
                    i8 = -8;
                } else {
                    i12 = i19 - 4;
                }
            }
            int i23 = bArr[i12] & UByte.f27220r;
            int i24 = iArr[i23];
            if (i24 >= 0) {
                i12++;
                i11 = (i11 << 6) | i24;
                i10 += 6;
                if (i10 >= 0) {
                    bArr2[i9] = (byte) (i11 >>> i10);
                    i11 &= (1 << i10) - 1;
                    i10 -= 8;
                    i9++;
                }
            } else {
                if (i24 == -2) {
                    i12 = C(bArr, i12, i7, i10);
                    break;
                }
                if (!this.f23374b) {
                    StringBuilder sb = new StringBuilder(ProtectedSandApp.s("㾞"));
                    sb.append((char) i23);
                    sb.append(s7);
                    a7 = kotlin.text.d.a(8);
                    String num = Integer.toString(i23, a7);
                    l0.o(num, s6);
                    sb.append(num);
                    sb.append(s5);
                    sb.append(i12);
                    throw new IllegalArgumentException(sb.toString());
                }
                i12++;
            }
            i8 = -8;
        }
        if (i10 == -2) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㾡"));
        }
        int F = F(bArr, i12, i7);
        if (F >= i7) {
            return i9 - i5;
        }
        int i25 = bArr[F] & UByte.f27220r;
        StringBuilder sb2 = new StringBuilder(ProtectedSandApp.s("㾟"));
        sb2.append((char) i25);
        sb2.append(s7);
        a6 = kotlin.text.d.a(8);
        String num2 = Integer.toString(i25, a6);
        l0.o(num2, s6);
        sb2.append(num2);
        sb2.append(s5);
        sb2.append(F - 1);
        sb2.append(ProtectedSandApp.s("㾠"));
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ int o(Base64 base64, CharSequence charSequence, byte[] bArr, int i5, int i6, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㾢"));
        }
        int i9 = (i8 & 4) != 0 ? 0 : i5;
        int i10 = (i8 & 8) != 0 ? 0 : i6;
        if ((i8 & 16) != 0) {
            i7 = charSequence.length();
        }
        return base64.m(charSequence, bArr, i9, i10, i7);
    }

    public static /* synthetic */ int p(Base64 base64, byte[] bArr, byte[] bArr2, int i5, int i6, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㾣"));
        }
        int i9 = (i8 & 4) != 0 ? 0 : i5;
        int i10 = (i8 & 8) != 0 ? 0 : i6;
        if ((i8 & 16) != 0) {
            i7 = bArr.length;
        }
        return base64.n(bArr, bArr2, i9, i10, i7);
    }

    private final int q(byte[] bArr, int i5, int i6) {
        int[] iArr;
        int i7 = i6 - i5;
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 1) {
            throw new IllegalArgumentException(v.a(ProtectedSandApp.s("㾤"), i5, ProtectedSandApp.s("㾥"), i6));
        }
        if (this.f23374b) {
            while (true) {
                if (i5 >= i6) {
                    break;
                }
                int i8 = bArr[i5] & UByte.f27220r;
                iArr = c.f23376b;
                int i9 = iArr[i8];
                if (i9 < 0) {
                    if (i9 == -2) {
                        i7 -= i6 - i5;
                        break;
                    }
                    i7--;
                }
                i5++;
            }
        } else if (bArr[i6 - 1] == 61) {
            i7--;
            if (bArr[i6 - 2] == 61) {
                i7--;
            }
        }
        return (int) ((i7 * 6) / 8);
    }

    public static /* synthetic */ String s(Base64 base64, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㾦"));
        }
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = bArr.length;
        }
        return base64.r(bArr, i5, i6);
    }

    public static /* synthetic */ int u(Base64 base64, byte[] bArr, byte[] bArr2, int i5, int i6, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㾧"));
        }
        int i9 = (i8 & 4) != 0 ? 0 : i5;
        int i10 = (i8 & 8) != 0 ? 0 : i6;
        if ((i8 & 16) != 0) {
            i7 = bArr.length;
        }
        return base64.t(bArr, bArr2, i9, i10, i7);
    }

    private final int w(int i5) {
        int i6 = ((i5 + 3) - 1) / 3;
        int i7 = ((this.f23374b ? (i6 - 1) / 19 : 0) * 2) + (i6 * 4);
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㾨"));
    }

    public static /* synthetic */ Appendable y(Base64 base64, byte[] bArr, Appendable appendable, int i5, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("㾩"));
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = bArr.length;
        }
        return base64.x(bArr, appendable, i5, i6);
    }

    @d5.d
    public final byte[] B(@d5.d byte[] bArr, int i5, int i6) {
        l0.p(bArr, ProtectedSandApp.s("㾪"));
        g(bArr.length, i5, i6);
        byte[] bArr2 = new byte[w(i6 - i5)];
        v(bArr, bArr2, 0, i5, i6);
        return bArr2;
    }

    /* renamed from: D, reason: from getter */
    public final boolean getF23374b() {
        return this.f23374b;
    }

    /* renamed from: E, reason: from getter */
    public final boolean getF23373a() {
        return this.f23373a;
    }

    @d5.d
    public final String d(@d5.d byte[] bArr) {
        l0.p(bArr, ProtectedSandApp.s("㾫"));
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b6 : bArr) {
            sb.append((char) b6);
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("㾬"));
        return sb2;
    }

    @d5.d
    public final byte[] e(@d5.d CharSequence charSequence, int i5, int i6) {
        l0.p(charSequence, ProtectedSandApp.s("㾭"));
        g(charSequence.length(), i5, i6);
        byte[] bArr = new byte[i6 - i5];
        int i7 = 0;
        while (i5 < i6) {
            char charAt = charSequence.charAt(i5);
            if (charAt <= 255) {
                bArr[i7] = (byte) charAt;
                i7++;
            } else {
                bArr[i7] = r0.f31710a;
                i7++;
            }
            i5++;
        }
        return bArr;
    }

    public final void g(int i5, int i6, int i7) {
        AbstractList.f23126o.a(i6, i7, i5);
    }

    @d5.d
    public final byte[] h(@d5.d CharSequence charSequence, int i5, int i6) {
        byte[] e6;
        l0.p(charSequence, ProtectedSandApp.s("㾮"));
        if (charSequence instanceof String) {
            g(charSequence.length(), i5, i6);
            String substring = ((String) charSequence).substring(i5, i6);
            l0.o(substring, ProtectedSandApp.s("㾯"));
            Charset charset = Charsets.f27054g;
            l0.n(substring, ProtectedSandApp.s("㾰"));
            e6 = substring.getBytes(charset);
            l0.o(e6, ProtectedSandApp.s("㾱"));
        } else {
            e6 = e(charSequence, i5, i6);
        }
        return k(this, e6, 0, 0, 6, null);
    }

    @d5.d
    public final byte[] i(@d5.d byte[] bArr, int i5, int i6) {
        l0.p(bArr, ProtectedSandApp.s("㾲"));
        g(bArr.length, i5, i6);
        int q5 = q(bArr, i5, i6);
        byte[] bArr2 = new byte[q5];
        if (l(bArr, bArr2, 0, i5, i6) == q5) {
            return bArr2;
        }
        throw new IllegalStateException(ProtectedSandApp.s("㾳").toString());
    }

    public final int m(@d5.d CharSequence charSequence, @d5.d byte[] bArr, int i5, int i6, int i7) {
        byte[] e6;
        l0.p(charSequence, ProtectedSandApp.s("㾴"));
        l0.p(bArr, ProtectedSandApp.s("㾵"));
        if (charSequence instanceof String) {
            g(charSequence.length(), i6, i7);
            String substring = ((String) charSequence).substring(i6, i7);
            l0.o(substring, ProtectedSandApp.s("㾶"));
            Charset charset = Charsets.f27054g;
            l0.n(substring, ProtectedSandApp.s("㾷"));
            e6 = substring.getBytes(charset);
            l0.o(e6, ProtectedSandApp.s("㾸"));
        } else {
            e6 = e(charSequence, i6, i7);
        }
        return p(this, e6, bArr, i5, 0, 0, 24, null);
    }

    public final int n(@d5.d byte[] bArr, @d5.d byte[] bArr2, int i5, int i6, int i7) {
        l0.p(bArr, ProtectedSandApp.s("㾹"));
        l0.p(bArr2, ProtectedSandApp.s("㾺"));
        g(bArr.length, i6, i7);
        f(bArr2.length, i5, q(bArr, i6, i7));
        return l(bArr, bArr2, i5, i6, i7);
    }

    @d5.d
    public final String r(@d5.d byte[] bArr, int i5, int i6) {
        l0.p(bArr, ProtectedSandApp.s("㾻"));
        return new String(B(bArr, i5, i6), Charsets.f27054g);
    }

    public final int t(@d5.d byte[] bArr, @d5.d byte[] bArr2, int i5, int i6, int i7) {
        l0.p(bArr, ProtectedSandApp.s("㾼"));
        l0.p(bArr2, ProtectedSandApp.s("㾽"));
        return v(bArr, bArr2, i5, i6, i7);
    }

    public final int v(@d5.d byte[] bArr, @d5.d byte[] bArr2, int i5, int i6, int i7) {
        l0.p(bArr, ProtectedSandApp.s("㾾"));
        l0.p(bArr2, ProtectedSandApp.s("㾿"));
        g(bArr.length, i6, i7);
        f(bArr2.length, i5, w(i7 - i6));
        byte[] bArr3 = this.f23373a ? c.f23377c : c.f23375a;
        int i8 = this.f23374b ? 19 : Integer.MAX_VALUE;
        int i9 = i5;
        while (true) {
            if (i6 + 2 >= i7) {
                break;
            }
            int min = Math.min((i7 - i6) / 3, i8);
            int i10 = 0;
            while (i10 < min) {
                int i11 = i6 + 1;
                int i12 = i11 + 1;
                int i13 = ((bArr[i6] & UByte.f27220r) << 16) | ((bArr[i11] & UByte.f27220r) << 8) | (bArr[i12] & UByte.f27220r);
                int i14 = i9 + 1;
                bArr2[i9] = bArr3[i13 >>> 18];
                int i15 = i14 + 1;
                bArr2[i14] = bArr3[(i13 >>> 12) & 63];
                int i16 = i15 + 1;
                bArr2[i15] = bArr3[(i13 >>> 6) & 63];
                i9 = i16 + 1;
                bArr2[i16] = bArr3[i13 & 63];
                i10++;
                i6 = i12 + 1;
            }
            if (min == i8 && i6 != i7) {
                int i17 = i9 + 1;
                byte[] bArr4 = f23370k;
                bArr2[i9] = bArr4[0];
                i9 = i17 + 1;
                bArr2[i17] = bArr4[1];
            }
        }
        int i18 = i7 - i6;
        if (i18 == 1) {
            int i19 = i6 + 1;
            int i20 = (bArr[i6] & UByte.f27220r) << 4;
            int i21 = i9 + 1;
            bArr2[i9] = bArr3[i20 >>> 6];
            int i22 = i21 + 1;
            bArr2[i21] = bArr3[i20 & 63];
            int i23 = i22 + 1;
            bArr2[i22] = f23367h;
            i9 = i23 + 1;
            bArr2[i23] = f23367h;
            i6 = i19;
        } else if (i18 == 2) {
            int i24 = i6 + 1;
            int i25 = i24 + 1;
            int i26 = ((bArr[i24] & UByte.f27220r) << 2) | ((bArr[i6] & UByte.f27220r) << 10);
            int i27 = i9 + 1;
            bArr2[i9] = bArr3[i26 >>> 12];
            int i28 = i27 + 1;
            bArr2[i27] = bArr3[(i26 >>> 6) & 63];
            int i29 = i28 + 1;
            bArr2[i28] = bArr3[i26 & 63];
            i9 = i29 + 1;
            bArr2[i29] = f23367h;
            i6 = i25;
        }
        if (i6 == i7) {
            return i9 - i5;
        }
        throw new IllegalStateException(ProtectedSandApp.s("㿀").toString());
    }

    @d5.d
    public final <A extends Appendable> A x(@d5.d byte[] bArr, @d5.d A a6, int i5, int i6) {
        l0.p(bArr, ProtectedSandApp.s("㿁"));
        l0.p(a6, ProtectedSandApp.s("㿂"));
        a6.append(new String(B(bArr, i5, i6), Charsets.f27054g));
        return a6;
    }

    @d5.d
    public final byte[] z(@d5.d byte[] bArr, int i5, int i6) {
        l0.p(bArr, ProtectedSandApp.s("㿃"));
        return B(bArr, i5, i6);
    }

    private Base64(boolean z5, boolean z6) {
        this.f23373a = z5;
        this.f23374b = z6;
        if (!((z5 && z6) ? false : true)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("㾐").toString());
        }
    }
}
