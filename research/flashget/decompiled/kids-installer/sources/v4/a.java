package v4;

import android.content.preferences.protobuf.v;
import androidx.appcompat.view.menu.s;
import androidx.core.app.x;
import com.bumptech.glide.load.resource.bitmap.p0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.l0;
import kotlin.text.Typography;
import okio.d0;
import okio.i;
import okio.j;
import okio.j0;
import okio.k0;
import okio.m;
import okio.m0;
import okio.o0;
import okio.p;
import okio.r0;

/* compiled from: Buffer.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aA\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000b2\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0011H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0018\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0000\u001a%\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u001e*\u00020\nH\u0080\b\u001a\r\u0010!\u001a\u00020 *\u00020\nH\u0080\b\u001a\r\u0010\"\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a\r\u0010#\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\u0015\u0010%\u001a\u00020\u001e*\u00020\n2\u0006\u0010$\u001a\u00020\u000bH\u0080\b\u001a\r\u0010'\u001a\u00020&*\u00020\nH\u0080\b\u001a\u0015\u0010(\u001a\u00020&*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a)\u0010+\u001a\u00020\n*\u00020\n2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010/\u001a\u00020\u0000*\u00020\n2\u0006\u0010.\u001a\u00020\u0002H\u0080\b\u001a\u0015\u00101\u001a\u00020\n*\u00020\n2\u0006\u00100\u001a\u00020\u0004H\u0080\b\u001a%\u00102\u001a\u00020\n*\u00020\n2\u0006\u00100\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\r\u00103\u001a\u00020\u0004*\u00020\nH\u0080\b\u001a\u0015\u00104\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00106\u001a\u00020\u0002*\u00020\n2\u0006\u00105\u001a\u00020\u0004H\u0080\b\u001a\u0015\u00107\u001a\u00020&*\u00020\n2\u0006\u00105\u001a\u00020\u0004H\u0080\b\u001a%\u00108\u001a\u00020\u0002*\u00020\n2\u0006\u00105\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\r\u00109\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u0010:\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u0010;\u001a\u00020)*\u00020\nH\u0080\b\u001a\u0015\u0010<\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010=\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0080\b\u001a\u001d\u0010,\u001a\u00020&*\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010?\u001a\u00020\u000b*\u00020\n2\u0006\u00105\u001a\u00020>H\u0080\b\u001a\u0015\u0010@\u001a\u00020\r*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u000f\u0010A\u001a\u0004\u0018\u00010\r*\u00020\nH\u0080\b\u001a\u0015\u0010C\u001a\u00020\r*\u00020\n2\u0006\u0010B\u001a\u00020\u000bH\u0080\b\u001a\r\u0010D\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a%\u0010H\u001a\u00020\n*\u00020\n2\u0006\u0010E\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010L\u001a\u00020\u000b*\u00020\n2\u0006\u00100\u001a\u00020KH\u0080\b\u001a\u001d\u0010M\u001a\u00020\n*\u00020\n2\u0006\u00100\u001a\u00020K2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010;\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010P\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010R\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010S\u001a\u00020&*\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010T\u001a\u00020\u000b*\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a%\u0010V\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010U\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010P\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010X\u001a\u00020\u000b*\u00020\n2\u0006\u0010W\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\u0080\b\u001a-\u0010Y\u001a\u00020\b*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0017\u0010\\\u001a\u00020\b*\u00020\n2\b\u0010[\u001a\u0004\u0018\u00010ZH\u0080\b\u001a\r\u0010]\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a\r\u0010^\u001a\u00020\n*\u00020\nH\u0080\b\u001a\r\u0010_\u001a\u00020)*\u00020\nH\u0080\b\u001a\u0015\u0010`\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\"\u001a\u0010d\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010a\u001a\u0004\bb\u0010c\"\u0014\u0010e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010`\"\u0014\u0010f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b^\u0010/\"\u0014\u0010g\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010/\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006h"}, d2 = {"Lokio/j0;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "a0", "Lokio/m;", "", "newline", "", "b0", "T", "fromIndex", "Lkotlin/Function2;", "lambda", "c0", "(Lokio/m;JLq3/p;)Ljava/lang/Object;", "Lokio/d0;", "options", "selectTruncated", "d0", "out", "offset", "byteCount", "d", "b", "", "p", "", "A", "y", "z", "pos", "f", "Lkotlin/m2;", "a", "G", "Lokio/p;", "byteString", "K", "v", "S", "minimumCapacity", "J", "source", "M", "N", "q", "r", "sink", "l", "w", "m", "u", "x", "s", "t", "F", "Lokio/m0;", "o", "B", "D", "limit", "E", "C", "string", "beginIndex", "endIndex", "X", "codePoint", "Y", "Lokio/o0;", "Q", "L", "R", "W", "i", "U", "V", "O", "n", "toIndex", "h", "targetBytes", "j", "k", "", "other", "e", "g", "c", "H", "I", "[B", "Z", "()[B", "HEX_DIGIT_BYTES", "SEGMENTING_THRESHOLD", "OVERFLOW_ZONE", "OVERFLOW_DIGIT_START", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private static final byte[] f33893a = i.a(ProtectedSandApp.s("槵"));

    /* renamed from: b, reason: collision with root package name */
    public static final int f33894b = 4096;

    /* renamed from: c, reason: collision with root package name */
    public static final long f33895c = -922337203685477580L;

    /* renamed from: d, reason: collision with root package name */
    public static final long f33896d = -7;

    public static final short A(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("槶"));
        if (mVar.size() < 2) {
            throw new EOFException();
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        int i5 = j0Var.pos;
        int i6 = j0Var.limit;
        if (i6 - i5 < 2) {
            return (short) ((mVar.readByte() & UByte.f27220r) | ((mVar.readByte() & UByte.f27220r) << 8));
        }
        byte[] bArr = j0Var.data;
        int i7 = i5 + 1;
        int i8 = i7 + 1;
        int i9 = ((bArr[i5] & UByte.f27220r) << 8) | (bArr[i7] & UByte.f27220r);
        mVar.M0(mVar.size() - 2);
        if (i8 == i6) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i8;
        }
        return (short) i9;
    }

    @d5.d
    public static final String B(@d5.d m mVar, long j5) {
        l0.p(mVar, ProtectedSandApp.s("槷"));
        if (!(j5 >= 0 && j5 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("槸"), j5).toString());
        }
        if (mVar.size() < j5) {
            throw new EOFException();
        }
        if (j5 == 0) {
            return "";
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        int i5 = j0Var.pos;
        if (i5 + j5 > j0Var.limit) {
            return f.c(mVar.K0(j5), 0, 0, 3, null);
        }
        int i6 = (int) j5;
        String b6 = f.b(j0Var.data, i5, i5 + i6);
        j0Var.pos += i6;
        mVar.M0(mVar.size() - j5);
        if (j0Var.pos == j0Var.limit) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        }
        return b6;
    }

    public static final int C(@d5.d m mVar) {
        int i5;
        int i6;
        int i7;
        l0.p(mVar, ProtectedSandApp.s("槹"));
        if (mVar.size() == 0) {
            throw new EOFException();
        }
        byte b02 = mVar.b0(0L);
        if ((b02 & ByteCompanionObject.f23584b) == 0) {
            i5 = b02 & ByteCompanionObject.f23585c;
            i7 = 0;
            i6 = 1;
        } else if ((b02 & 224) == 192) {
            i5 = b02 & 31;
            i6 = 2;
            i7 = 128;
        } else if ((b02 & 240) == 224) {
            i5 = b02 & 15;
            i6 = 3;
            i7 = 2048;
        } else {
            if ((b02 & 248) != 240) {
                mVar.skip(1L);
                return r0.f31712c;
            }
            i5 = b02 & 7;
            i6 = 4;
            i7 = 65536;
        }
        long j5 = i6;
        if (mVar.size() < j5) {
            StringBuilder a6 = x.a(ProtectedSandApp.s("槺"), i6, ProtectedSandApp.s("槻"));
            a6.append(mVar.size());
            a6.append(ProtectedSandApp.s("槼"));
            a6.append(j.m(b02));
            a6.append(')');
            throw new EOFException(a6.toString());
        }
        for (int i8 = 1; i8 < i6; i8++) {
            long j6 = i8;
            byte b03 = mVar.b0(j6);
            if ((b03 & 192) != 128) {
                mVar.skip(j6);
                return r0.f31712c;
            }
            i5 = (i5 << 6) | (b03 & r0.f31710a);
        }
        mVar.skip(j5);
        return i5 > 1114111 ? r0.f31712c : ((55296 <= i5 && 57343 >= i5) || i5 < i7) ? r0.f31712c : i5;
    }

    @d5.e
    public static final String D(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("槽"));
        long l12 = mVar.l1((byte) 10);
        if (l12 != -1) {
            return b0(mVar, l12);
        }
        if (mVar.size() != 0) {
            return mVar.q(mVar.size());
        }
        return null;
    }

    @d5.d
    public static final String E(@d5.d m mVar, long j5) {
        l0.p(mVar, ProtectedSandApp.s("槾"));
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("樁"), j5).toString());
        }
        long j6 = j5 != Long.MAX_VALUE ? j5 + 1 : Long.MAX_VALUE;
        byte b6 = (byte) 10;
        long T = mVar.T(b6, 0L, j6);
        if (T != -1) {
            return b0(mVar, T);
        }
        if (j6 < mVar.size() && mVar.b0(j6 - 1) == ((byte) 13) && mVar.b0(j6) == b6) {
            return b0(mVar, j6);
        }
        m mVar2 = new m();
        mVar.o(mVar2, 0L, Math.min(32, mVar.size()));
        throw new EOFException(ProtectedSandApp.s("槿") + Math.min(mVar.size(), j5) + ProtectedSandApp.s("樀") + mVar2.x0().C() + Typography.F);
    }

    public static final int F(@d5.d m mVar, @d5.d d0 d0Var) {
        l0.p(mVar, ProtectedSandApp.s("樂"));
        l0.p(d0Var, ProtectedSandApp.s("樃"));
        int e02 = e0(mVar, d0Var, false, 2, null);
        if (e02 == -1) {
            return -1;
        }
        mVar.skip(d0Var.getByteStrings()[e02].i0());
        return e02;
    }

    public static final void G(@d5.d m mVar, long j5) {
        l0.p(mVar, ProtectedSandApp.s("樄"));
        while (j5 > 0) {
            j0 j0Var = mVar.head;
            if (j0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j5, j0Var.limit - j0Var.pos);
            long j6 = min;
            mVar.M0(mVar.size() - j6);
            j5 -= j6;
            int i5 = j0Var.pos + min;
            j0Var.pos = i5;
            if (i5 == j0Var.limit) {
                mVar.head = j0Var.b();
                k0.d(j0Var);
            }
        }
    }

    @d5.d
    public static final p H(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("樅"));
        if (mVar.size() <= ((long) Integer.MAX_VALUE)) {
            return mVar.f1((int) mVar.size());
        }
        throw new IllegalStateException((ProtectedSandApp.s("樆") + mVar.size()).toString());
    }

    @d5.d
    public static final p I(@d5.d m mVar, int i5) {
        l0.p(mVar, ProtectedSandApp.s("樇"));
        if (i5 == 0) {
            return p.f31688s;
        }
        j.e(mVar.size(), 0L, i5);
        j0 j0Var = mVar.head;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            l0.m(j0Var);
            int i9 = j0Var.limit;
            int i10 = j0Var.pos;
            if (i9 == i10) {
                throw new AssertionError(ProtectedSandApp.s("樈"));
            }
            i7 += i9 - i10;
            i8++;
            j0Var = j0Var.next;
        }
        byte[][] bArr = new byte[i8][];
        int[] iArr = new int[i8 * 2];
        j0 j0Var2 = mVar.head;
        int i11 = 0;
        while (i6 < i5) {
            l0.m(j0Var2);
            bArr[i11] = j0Var2.data;
            i6 += j0Var2.limit - j0Var2.pos;
            iArr[i11] = Math.min(i6, i5);
            iArr[i11 + i8] = j0Var2.pos;
            j0Var2.shared = true;
            i11++;
            j0Var2 = j0Var2.next;
        }
        return new okio.l0(bArr, iArr);
    }

    @d5.d
    public static final j0 J(@d5.d m mVar, int i5) {
        l0.p(mVar, ProtectedSandApp.s("樉"));
        if (!(i5 >= 1 && i5 <= 8192)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("樊").toString());
        }
        j0 j0Var = mVar.head;
        if (j0Var != null) {
            l0.m(j0Var);
            j0 j0Var2 = j0Var.prev;
            l0.m(j0Var2);
            return (j0Var2.limit + i5 > 8192 || !j0Var2.owner) ? j0Var2.c(k0.e()) : j0Var2;
        }
        j0 e6 = k0.e();
        mVar.head = e6;
        e6.prev = e6;
        e6.next = e6;
        return e6;
    }

    @d5.d
    public static final m K(@d5.d m mVar, @d5.d p pVar, int i5, int i6) {
        l0.p(mVar, ProtectedSandApp.s("樋"));
        l0.p(pVar, ProtectedSandApp.s("樌"));
        pVar.v0(mVar, i5, i6);
        return mVar;
    }

    @d5.d
    public static final m L(@d5.d m mVar, @d5.d o0 o0Var, long j5) {
        l0.p(mVar, ProtectedSandApp.s("樍"));
        l0.p(o0Var, ProtectedSandApp.s("樎"));
        while (j5 > 0) {
            long X0 = o0Var.X0(mVar, j5);
            if (X0 == -1) {
                throw new EOFException();
            }
            j5 -= X0;
        }
        return mVar;
    }

    @d5.d
    public static final m M(@d5.d m mVar, @d5.d byte[] bArr) {
        l0.p(mVar, ProtectedSandApp.s("樏"));
        l0.p(bArr, ProtectedSandApp.s("樐"));
        return mVar.write(bArr, 0, bArr.length);
    }

    @d5.d
    public static final m N(@d5.d m mVar, @d5.d byte[] bArr, int i5, int i6) {
        l0.p(mVar, ProtectedSandApp.s("樑"));
        l0.p(bArr, ProtectedSandApp.s("樒"));
        long j5 = i6;
        j.e(bArr.length, i5, j5);
        int i7 = i6 + i5;
        while (i5 < i7) {
            j0 i12 = mVar.i1(1);
            int min = Math.min(i7 - i5, 8192 - i12.limit);
            int i8 = i5 + min;
            kotlin.collections.p.v0(bArr, i12.data, i12.limit, i5, i8);
            i12.limit += min;
            i5 = i8;
        }
        mVar.M0(mVar.size() + j5);
        return mVar;
    }

    public static final void O(@d5.d m mVar, @d5.d m mVar2, long j5) {
        j0 j0Var;
        l0.p(mVar, ProtectedSandApp.s("樓"));
        l0.p(mVar2, ProtectedSandApp.s("樔"));
        if (!(mVar2 != mVar)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("樕").toString());
        }
        j.e(mVar2.size(), 0L, j5);
        while (j5 > 0) {
            j0 j0Var2 = mVar2.head;
            l0.m(j0Var2);
            int i5 = j0Var2.limit;
            l0.m(mVar2.head);
            if (j5 < i5 - r2.pos) {
                j0 j0Var3 = mVar.head;
                if (j0Var3 != null) {
                    l0.m(j0Var3);
                    j0Var = j0Var3.prev;
                } else {
                    j0Var = null;
                }
                if (j0Var != null && j0Var.owner) {
                    if ((j0Var.limit + j5) - (j0Var.shared ? 0 : j0Var.pos) <= 8192) {
                        j0 j0Var4 = mVar2.head;
                        l0.m(j0Var4);
                        j0Var4.g(j0Var, (int) j5);
                        mVar2.M0(mVar2.size() - j5);
                        mVar.M0(mVar.size() + j5);
                        return;
                    }
                }
                j0 j0Var5 = mVar2.head;
                l0.m(j0Var5);
                mVar2.head = j0Var5.e((int) j5);
            }
            j0 j0Var6 = mVar2.head;
            l0.m(j0Var6);
            long j6 = j0Var6.limit - j0Var6.pos;
            mVar2.head = j0Var6.b();
            j0 j0Var7 = mVar.head;
            if (j0Var7 == null) {
                mVar.head = j0Var6;
                j0Var6.prev = j0Var6;
                j0Var6.next = j0Var6;
            } else {
                l0.m(j0Var7);
                j0 j0Var8 = j0Var7.prev;
                l0.m(j0Var8);
                j0Var8.c(j0Var6).a();
            }
            mVar2.M0(mVar2.size() - j6);
            mVar.M0(mVar.size() + j6);
            j5 -= j6;
        }
    }

    public static /* synthetic */ m P(m mVar, p pVar, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = pVar.i0();
        }
        l0.p(mVar, ProtectedSandApp.s("樖"));
        l0.p(pVar, ProtectedSandApp.s("樗"));
        pVar.v0(mVar, i5, i6);
        return mVar;
    }

    public static final long Q(@d5.d m mVar, @d5.d o0 o0Var) {
        l0.p(mVar, ProtectedSandApp.s("樘"));
        l0.p(o0Var, ProtectedSandApp.s("標"));
        long j5 = 0;
        while (true) {
            long X0 = o0Var.X0(mVar, 8192);
            if (X0 == -1) {
                return j5;
            }
            j5 += X0;
        }
    }

    @d5.d
    public static final m R(@d5.d m mVar, int i5) {
        l0.p(mVar, ProtectedSandApp.s("樚"));
        j0 i12 = mVar.i1(1);
        byte[] bArr = i12.data;
        int i6 = i12.limit;
        i12.limit = i6 + 1;
        bArr[i6] = (byte) i5;
        mVar.M0(mVar.size() + 1);
        return mVar;
    }

    @d5.d
    public static final m S(@d5.d m mVar, long j5) {
        boolean z5;
        l0.p(mVar, ProtectedSandApp.s("樛"));
        if (j5 == 0) {
            return mVar.writeByte(48);
        }
        int i5 = 1;
        if (j5 < 0) {
            j5 = -j5;
            if (j5 < 0) {
                return mVar.j0(ProtectedSandApp.s("樜"));
            }
            z5 = true;
        } else {
            z5 = false;
        }
        if (j5 >= 100000000) {
            i5 = j5 < 1000000000000L ? j5 < okhttp3.internal.connection.f.f30880v ? j5 < 1000000000 ? 9 : 10 : j5 < 100000000000L ? 11 : 12 : j5 < 1000000000000000L ? j5 < 10000000000000L ? 13 : j5 < 100000000000000L ? 14 : 15 : j5 < 100000000000000000L ? j5 < 10000000000000000L ? 16 : 17 : j5 < 1000000000000000000L ? 18 : 19;
        } else if (j5 >= 10000) {
            i5 = j5 < 1000000 ? j5 < 100000 ? 5 : 6 : j5 < 10000000 ? 7 : 8;
        } else if (j5 >= 100) {
            i5 = j5 < 1000 ? 3 : 4;
        } else if (j5 >= 10) {
            i5 = 2;
        }
        if (z5) {
            i5++;
        }
        j0 i12 = mVar.i1(i5);
        byte[] bArr = i12.data;
        int i6 = i12.limit + i5;
        while (j5 != 0) {
            long j6 = 10;
            i6--;
            bArr[i6] = f33893a[(int) (j5 % j6)];
            j5 /= j6;
        }
        if (z5) {
            bArr[i6 - 1] = (byte) 45;
        }
        i12.limit += i5;
        mVar.M0(mVar.size() + i5);
        return mVar;
    }

    @d5.d
    public static final m T(@d5.d m mVar, long j5) {
        l0.p(mVar, ProtectedSandApp.s("樝"));
        if (j5 == 0) {
            return mVar.writeByte(48);
        }
        long j6 = (j5 >>> 1) | j5;
        long j7 = j6 | (j6 >>> 2);
        long j8 = j7 | (j7 >>> 4);
        long j9 = j8 | (j8 >>> 8);
        long j10 = j9 | (j9 >>> 16);
        long j11 = j10 | (j10 >>> 32);
        long j12 = j11 - ((j11 >>> 1) & 6148914691236517205L);
        long j13 = ((j12 >>> 2) & 3689348814741910323L) + (j12 & 3689348814741910323L);
        long j14 = ((j13 >>> 4) + j13) & 1085102592571150095L;
        long j15 = j14 + (j14 >>> 8);
        long j16 = j15 + (j15 >>> 16);
        int i5 = (int) ((((j16 & 63) + ((j16 >>> 32) & 63)) + 3) / 4);
        j0 i12 = mVar.i1(i5);
        byte[] bArr = i12.data;
        int i6 = i12.limit;
        for (int i7 = (i6 + i5) - 1; i7 >= i6; i7--) {
            bArr[i7] = f33893a[(int) (15 & j5)];
            j5 >>>= 4;
        }
        i12.limit += i5;
        mVar.M0(mVar.size() + i5);
        return mVar;
    }

    @d5.d
    public static final m U(@d5.d m mVar, int i5) {
        l0.p(mVar, ProtectedSandApp.s("樞"));
        j0 i12 = mVar.i1(4);
        byte[] bArr = i12.data;
        int i6 = i12.limit;
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i5 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i5 >>> 8) & 255);
        bArr[i9] = (byte) (i5 & 255);
        i12.limit = i9 + 1;
        mVar.M0(mVar.size() + 4);
        return mVar;
    }

    @d5.d
    public static final m V(@d5.d m mVar, long j5) {
        l0.p(mVar, ProtectedSandApp.s("樟"));
        j0 i12 = mVar.i1(8);
        byte[] bArr = i12.data;
        int i5 = i12.limit;
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j5 >>> 56) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j5 >>> 48) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j5 >>> 40) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j5 >>> 32) & 255);
        int i10 = i9 + 1;
        bArr[i9] = (byte) ((j5 >>> 24) & 255);
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j5 >>> 16) & 255);
        int i13 = i11 + 1;
        bArr[i11] = (byte) ((j5 >>> 8) & 255);
        bArr[i13] = (byte) (j5 & 255);
        i12.limit = i13 + 1;
        mVar.M0(mVar.size() + 8);
        return mVar;
    }

    @d5.d
    public static final m W(@d5.d m mVar, int i5) {
        l0.p(mVar, ProtectedSandApp.s("樠"));
        j0 i12 = mVar.i1(2);
        byte[] bArr = i12.data;
        int i6 = i12.limit;
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >>> 8) & 255);
        bArr[i7] = (byte) (i5 & 255);
        i12.limit = i7 + 1;
        mVar.M0(mVar.size() + 2);
        return mVar;
    }

    @d5.d
    public static final m X(@d5.d m mVar, @d5.d String str, int i5, int i6) {
        char charAt;
        l0.p(mVar, ProtectedSandApp.s("模"));
        l0.p(str, ProtectedSandApp.s("樢"));
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(s.a(ProtectedSandApp.s("樧"), i5).toString());
        }
        if (!(i6 >= i5)) {
            throw new IllegalArgumentException(v.a(ProtectedSandApp.s("樥"), i6, ProtectedSandApp.s("樦"), i5).toString());
        }
        if (!(i6 <= str.length())) {
            StringBuilder a6 = x.a(ProtectedSandApp.s("樣"), i6, ProtectedSandApp.s("樤"));
            a6.append(str.length());
            throw new IllegalArgumentException(a6.toString().toString());
        }
        while (i5 < i6) {
            char charAt2 = str.charAt(i5);
            if (charAt2 < 128) {
                j0 i12 = mVar.i1(1);
                byte[] bArr = i12.data;
                int i7 = i12.limit - i5;
                int min = Math.min(i6, 8192 - i7);
                int i8 = i5 + 1;
                bArr[i5 + i7] = (byte) charAt2;
                while (true) {
                    i5 = i8;
                    if (i5 >= min || (charAt = str.charAt(i5)) >= 128) {
                        break;
                    }
                    i8 = i5 + 1;
                    bArr[i5 + i7] = (byte) charAt;
                }
                int i9 = i12.limit;
                int i10 = (i7 + i5) - i9;
                i12.limit = i9 + i10;
                mVar.M0(mVar.size() + i10);
            } else {
                if (charAt2 < 2048) {
                    j0 i13 = mVar.i1(2);
                    byte[] bArr2 = i13.data;
                    int i11 = i13.limit;
                    bArr2[i11] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i11 + 1] = (byte) ((charAt2 & '?') | 128);
                    i13.limit = i11 + 2;
                    mVar.M0(mVar.size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    j0 i14 = mVar.i1(3);
                    byte[] bArr3 = i14.data;
                    int i15 = i14.limit;
                    bArr3[i15] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i15 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i15 + 2] = (byte) ((charAt2 & '?') | 128);
                    i14.limit = i15 + 3;
                    mVar.M0(mVar.size() + 3);
                } else {
                    int i16 = i5 + 1;
                    char charAt3 = i16 < i6 ? str.charAt(i16) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        mVar.writeByte(63);
                        i5 = i16;
                    } else {
                        int i17 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        j0 i18 = mVar.i1(4);
                        byte[] bArr4 = i18.data;
                        int i19 = i18.limit;
                        bArr4[i19] = (byte) ((i17 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i17 & 63) | 128);
                        i18.limit = i19 + 4;
                        mVar.M0(mVar.size() + 4);
                        i5 += 2;
                    }
                }
                i5++;
            }
        }
        return mVar;
    }

    @d5.d
    public static final m Y(@d5.d m mVar, int i5) {
        l0.p(mVar, ProtectedSandApp.s("樨"));
        if (i5 < 128) {
            mVar.writeByte(i5);
        } else if (i5 < 2048) {
            j0 i12 = mVar.i1(2);
            byte[] bArr = i12.data;
            int i6 = i12.limit;
            bArr[i6] = (byte) ((i5 >> 6) | 192);
            bArr[i6 + 1] = (byte) ((i5 & 63) | 128);
            i12.limit = i6 + 2;
            mVar.M0(mVar.size() + 2);
        } else if (55296 <= i5 && 57343 >= i5) {
            mVar.writeByte(63);
        } else if (i5 < 65536) {
            j0 i13 = mVar.i1(3);
            byte[] bArr2 = i13.data;
            int i7 = i13.limit;
            bArr2[i7] = (byte) ((i5 >> 12) | 224);
            bArr2[i7 + 1] = (byte) (((i5 >> 6) & 63) | 128);
            bArr2[i7 + 2] = (byte) ((i5 & 63) | 128);
            i13.limit = i7 + 3;
            mVar.M0(mVar.size() + 3);
        } else {
            if (i5 > 1114111) {
                throw new IllegalArgumentException(ProtectedSandApp.s("権") + j.n(i5));
            }
            j0 i14 = mVar.i1(4);
            byte[] bArr3 = i14.data;
            int i8 = i14.limit;
            bArr3[i8] = (byte) ((i5 >> 18) | 240);
            bArr3[i8 + 1] = (byte) (((i5 >> 12) & 63) | 128);
            bArr3[i8 + 2] = (byte) (((i5 >> 6) & 63) | 128);
            bArr3[i8 + 3] = (byte) ((i5 & 63) | 128);
            i14.limit = i8 + 4;
            mVar.M0(mVar.size() + 4);
        }
        return mVar;
    }

    @d5.d
    public static final byte[] Z() {
        return f33893a;
    }

    public static final void a(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("横"));
        mVar.skip(mVar.size());
    }

    public static final boolean a0(@d5.d j0 j0Var, int i5, @d5.d byte[] bArr, int i6, int i7) {
        l0.p(j0Var, ProtectedSandApp.s("樫"));
        l0.p(bArr, ProtectedSandApp.s("樬"));
        int i8 = j0Var.limit;
        byte[] bArr2 = j0Var.data;
        while (i6 < i7) {
            if (i5 == i8) {
                j0Var = j0Var.next;
                l0.m(j0Var);
                byte[] bArr3 = j0Var.data;
                bArr2 = bArr3;
                i5 = j0Var.pos;
                i8 = j0Var.limit;
            }
            if (bArr2[i5] != bArr[i6]) {
                return false;
            }
            i5++;
            i6++;
        }
        return true;
    }

    public static final long b(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("樭"));
        long size = mVar.size();
        if (size == 0) {
            return 0L;
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        j0 j0Var2 = j0Var.prev;
        l0.m(j0Var2);
        return (j0Var2.limit >= 8192 || !j0Var2.owner) ? size : size - (r2 - j0Var2.pos);
    }

    @d5.d
    public static final String b0(@d5.d m mVar, long j5) {
        l0.p(mVar, ProtectedSandApp.s("樮"));
        if (j5 > 0) {
            long j6 = j5 - 1;
            if (mVar.b0(j6) == ((byte) 13)) {
                String q5 = mVar.q(j6);
                mVar.skip(2L);
                return q5;
            }
        }
        String q6 = mVar.q(j5);
        mVar.skip(1L);
        return q6;
    }

    @d5.d
    public static final m c(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("樯"));
        m mVar2 = new m();
        if (mVar.size() == 0) {
            return mVar2;
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        j0 d6 = j0Var.d();
        mVar2.head = d6;
        d6.prev = d6;
        d6.next = d6;
        for (j0 j0Var2 = j0Var.next; j0Var2 != j0Var; j0Var2 = j0Var2.next) {
            j0 j0Var3 = d6.prev;
            l0.m(j0Var3);
            l0.m(j0Var2);
            j0Var3.c(j0Var2.d());
        }
        mVar2.M0(mVar.size());
        return mVar2;
    }

    public static final <T> T c0(@d5.d m mVar, long j5, @d5.d q3.p<? super j0, ? super Long, ? extends T> pVar) {
        l0.p(mVar, ProtectedSandApp.s("樰"));
        l0.p(pVar, ProtectedSandApp.s("樱"));
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            return pVar.g0(null, -1L);
        }
        if (mVar.size() - j5 < j5) {
            long size = mVar.size();
            while (size > j5) {
                j0Var = j0Var.prev;
                l0.m(j0Var);
                size -= j0Var.limit - j0Var.pos;
            }
            return pVar.g0(j0Var, Long.valueOf(size));
        }
        long j6 = 0;
        while (true) {
            long j7 = (j0Var.limit - j0Var.pos) + j6;
            if (j7 > j5) {
                return pVar.g0(j0Var, Long.valueOf(j6));
            }
            j0Var = j0Var.next;
            l0.m(j0Var);
            j6 = j7;
        }
    }

    @d5.d
    public static final m d(@d5.d m mVar, @d5.d m mVar2, long j5, long j6) {
        l0.p(mVar, ProtectedSandApp.s("樲"));
        l0.p(mVar2, ProtectedSandApp.s("樳"));
        j.e(mVar.size(), j5, j6);
        if (j6 == 0) {
            return mVar;
        }
        mVar2.M0(mVar2.size() + j6);
        j0 j0Var = mVar.head;
        while (true) {
            l0.m(j0Var);
            int i5 = j0Var.limit;
            int i6 = j0Var.pos;
            if (j5 < i5 - i6) {
                break;
            }
            j5 -= i5 - i6;
            j0Var = j0Var.next;
        }
        while (j6 > 0) {
            l0.m(j0Var);
            j0 d6 = j0Var.d();
            int i7 = d6.pos + ((int) j5);
            d6.pos = i7;
            d6.limit = Math.min(i7 + ((int) j6), d6.limit);
            j0 j0Var2 = mVar2.head;
            if (j0Var2 == null) {
                d6.prev = d6;
                d6.next = d6;
                mVar2.head = d6;
            } else {
                l0.m(j0Var2);
                j0 j0Var3 = j0Var2.prev;
                l0.m(j0Var3);
                j0Var3.c(d6);
            }
            j6 -= d6.limit - d6.pos;
            j0Var = j0Var.next;
            j5 = 0;
        }
        return mVar;
    }

    public static final int d0(@d5.d m mVar, @d5.d d0 d0Var, boolean z5) {
        int i5;
        int i6;
        int i7;
        int i8;
        j0 j0Var;
        l0.p(mVar, ProtectedSandApp.s("樴"));
        l0.p(d0Var, ProtectedSandApp.s("樵"));
        j0 j0Var2 = mVar.head;
        if (j0Var2 == null) {
            return z5 ? -2 : -1;
        }
        byte[] bArr = j0Var2.data;
        int i9 = j0Var2.pos;
        int i10 = j0Var2.limit;
        int[] trie = d0Var.getTrie();
        j0 j0Var3 = j0Var2;
        int i11 = -1;
        int i12 = 0;
        loop0: while (true) {
            int i13 = i12 + 1;
            int i14 = trie[i12];
            int i15 = i13 + 1;
            int i16 = trie[i13];
            if (i16 != -1) {
                i11 = i16;
            }
            if (j0Var3 == null) {
                break;
            }
            if (i14 >= 0) {
                i5 = i9 + 1;
                int i17 = bArr[i9] & UByte.f27220r;
                int i18 = i15 + i14;
                while (i15 != i18) {
                    if (i17 == trie[i15]) {
                        i6 = trie[i15 + i14];
                        if (i5 == i10) {
                            j0Var3 = j0Var3.next;
                            l0.m(j0Var3);
                            i5 = j0Var3.pos;
                            bArr = j0Var3.data;
                            i10 = j0Var3.limit;
                            if (j0Var3 == j0Var2) {
                                j0Var3 = null;
                            }
                        }
                    } else {
                        i15++;
                    }
                }
                return i11;
            }
            int i19 = (i14 * (-1)) + i15;
            while (true) {
                int i20 = i9 + 1;
                int i21 = i15 + 1;
                if ((bArr[i9] & UByte.f27220r) != trie[i15]) {
                    return i11;
                }
                boolean z6 = i21 == i19;
                if (i20 == i10) {
                    l0.m(j0Var3);
                    j0 j0Var4 = j0Var3.next;
                    l0.m(j0Var4);
                    i8 = j0Var4.pos;
                    byte[] bArr2 = j0Var4.data;
                    i7 = j0Var4.limit;
                    if (j0Var4 != j0Var2) {
                        j0Var = j0Var4;
                        bArr = bArr2;
                    } else {
                        if (!z6) {
                            break loop0;
                        }
                        bArr = bArr2;
                        j0Var = null;
                    }
                } else {
                    j0 j0Var5 = j0Var3;
                    i7 = i10;
                    i8 = i20;
                    j0Var = j0Var5;
                }
                if (z6) {
                    i6 = trie[i21];
                    i5 = i8;
                    i10 = i7;
                    j0Var3 = j0Var;
                    break;
                }
                i9 = i8;
                i10 = i7;
                i15 = i21;
                j0Var3 = j0Var;
            }
            if (i6 >= 0) {
                return i6;
            }
            i12 = -i6;
            i9 = i5;
        }
        if (z5) {
            return -2;
        }
        return i11;
    }

    public static final boolean e(@d5.d m mVar, @d5.e Object obj) {
        l0.p(mVar, ProtectedSandApp.s("樶"));
        if (mVar == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar2 = (m) obj;
        if (mVar.size() != mVar2.size()) {
            return false;
        }
        if (mVar.size() == 0) {
            return true;
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        j0 j0Var2 = mVar2.head;
        l0.m(j0Var2);
        int i5 = j0Var.pos;
        int i6 = j0Var2.pos;
        long j5 = 0;
        while (j5 < mVar.size()) {
            long min = Math.min(j0Var.limit - i5, j0Var2.limit - i6);
            long j6 = 0;
            while (j6 < min) {
                int i7 = i5 + 1;
                int i8 = i6 + 1;
                if (j0Var.data[i5] != j0Var2.data[i6]) {
                    return false;
                }
                j6++;
                i5 = i7;
                i6 = i8;
            }
            if (i5 == j0Var.limit) {
                j0Var = j0Var.next;
                l0.m(j0Var);
                i5 = j0Var.pos;
            }
            if (i6 == j0Var2.limit) {
                j0Var2 = j0Var2.next;
                l0.m(j0Var2);
                i6 = j0Var2.pos;
            }
            j5 += min;
        }
        return true;
    }

    public static /* synthetic */ int e0(m mVar, d0 d0Var, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return d0(mVar, d0Var, z5);
    }

    public static final byte f(@d5.d m mVar, long j5) {
        l0.p(mVar, ProtectedSandApp.s("樷"));
        j.e(mVar.size(), j5, 1L);
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            l0.m(null);
            throw null;
        }
        if (mVar.size() - j5 < j5) {
            long size = mVar.size();
            while (size > j5) {
                j0Var = j0Var.prev;
                l0.m(j0Var);
                size -= j0Var.limit - j0Var.pos;
            }
            l0.m(j0Var);
            return j0Var.data[(int) ((j0Var.pos + j5) - size)];
        }
        long j6 = 0;
        while (true) {
            long j7 = (j0Var.limit - j0Var.pos) + j6;
            if (j7 > j5) {
                l0.m(j0Var);
                return j0Var.data[(int) ((j0Var.pos + j5) - j6)];
            }
            j0Var = j0Var.next;
            l0.m(j0Var);
            j6 = j7;
        }
    }

    public static final int g(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("樸"));
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            return 0;
        }
        int i5 = 1;
        do {
            int i6 = j0Var.limit;
            for (int i7 = j0Var.pos; i7 < i6; i7++) {
                i5 = (i5 * 31) + j0Var.data[i7];
            }
            j0Var = j0Var.next;
            l0.m(j0Var);
        } while (j0Var != mVar.head);
        return i5;
    }

    public static final long h(@d5.d m mVar, byte b6, long j5, long j6) {
        j0 j0Var;
        int i5;
        l0.p(mVar, ProtectedSandApp.s("樹"));
        long j7 = 0;
        if (!(0 <= j5 && j6 >= j5)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("樺") + mVar.size() + ProtectedSandApp.s("樻") + j5 + ProtectedSandApp.s("樼") + j6).toString());
        }
        if (j6 > mVar.size()) {
            j6 = mVar.size();
        }
        if (j5 == j6 || (j0Var = mVar.head) == null) {
            return -1L;
        }
        if (mVar.size() - j5 < j5) {
            j7 = mVar.size();
            while (j7 > j5) {
                j0Var = j0Var.prev;
                l0.m(j0Var);
                j7 -= j0Var.limit - j0Var.pos;
            }
            while (j7 < j6) {
                byte[] bArr = j0Var.data;
                int min = (int) Math.min(j0Var.limit, (j0Var.pos + j6) - j7);
                i5 = (int) ((j0Var.pos + j5) - j7);
                while (i5 < min) {
                    if (bArr[i5] != b6) {
                        i5++;
                    }
                }
                j7 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                l0.m(j0Var);
                j5 = j7;
            }
            return -1L;
        }
        while (true) {
            long j8 = (j0Var.limit - j0Var.pos) + j7;
            if (j8 > j5) {
                break;
            }
            j0Var = j0Var.next;
            l0.m(j0Var);
            j7 = j8;
        }
        while (j7 < j6) {
            byte[] bArr2 = j0Var.data;
            int min2 = (int) Math.min(j0Var.limit, (j0Var.pos + j6) - j7);
            i5 = (int) ((j0Var.pos + j5) - j7);
            while (i5 < min2) {
                if (bArr2[i5] != b6) {
                    i5++;
                }
            }
            j7 += j0Var.limit - j0Var.pos;
            j0Var = j0Var.next;
            l0.m(j0Var);
            j5 = j7;
        }
        return -1L;
        return (i5 - j0Var.pos) + j7;
    }

    public static final long i(@d5.d m mVar, @d5.d p pVar, long j5) {
        int i5;
        l0.p(mVar, ProtectedSandApp.s("樽"));
        l0.p(pVar, ProtectedSandApp.s("樾"));
        if (!(pVar.i0() > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("橀").toString());
        }
        long j6 = 0;
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("樿"), j5).toString());
        }
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            return -1L;
        }
        if (mVar.size() - j5 < j5) {
            j6 = mVar.size();
            while (j6 > j5) {
                j0Var = j0Var.prev;
                l0.m(j0Var);
                j6 -= j0Var.limit - j0Var.pos;
            }
            byte[] N = pVar.N();
            byte b6 = N[0];
            int i02 = pVar.i0();
            long size = (mVar.size() - i02) + 1;
            while (j6 < size) {
                byte[] bArr = j0Var.data;
                int min = (int) Math.min(j0Var.limit, (j0Var.pos + size) - j6);
                i5 = (int) ((j0Var.pos + j5) - j6);
                while (i5 < min) {
                    if (bArr[i5] != b6 || !a0(j0Var, i5 + 1, N, 1, i02)) {
                        i5++;
                    }
                }
                j6 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                l0.m(j0Var);
                j5 = j6;
            }
            return -1L;
        }
        while (true) {
            long j7 = (j0Var.limit - j0Var.pos) + j6;
            if (j7 > j5) {
                break;
            }
            j0Var = j0Var.next;
            l0.m(j0Var);
            j6 = j7;
        }
        byte[] N2 = pVar.N();
        byte b7 = N2[0];
        int i03 = pVar.i0();
        long size2 = (mVar.size() - i03) + 1;
        while (j6 < size2) {
            byte[] bArr2 = j0Var.data;
            int min2 = (int) Math.min(j0Var.limit, (j0Var.pos + size2) - j6);
            i5 = (int) ((j0Var.pos + j5) - j6);
            while (i5 < min2) {
                if (bArr2[i5] != b7 || !a0(j0Var, i5 + 1, N2, 1, i03)) {
                    i5++;
                }
            }
            j6 += j0Var.limit - j0Var.pos;
            j0Var = j0Var.next;
            l0.m(j0Var);
            j5 = j6;
        }
        return -1L;
        return (i5 - j0Var.pos) + j6;
    }

    public static final long j(@d5.d m mVar, @d5.d p pVar, long j5) {
        int i5;
        int i6;
        l0.p(mVar, ProtectedSandApp.s("橁"));
        l0.p(pVar, ProtectedSandApp.s("橂"));
        long j6 = 0;
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("橃"), j5).toString());
        }
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            return -1L;
        }
        if (mVar.size() - j5 < j5) {
            j6 = mVar.size();
            while (j6 > j5) {
                j0Var = j0Var.prev;
                l0.m(j0Var);
                j6 -= j0Var.limit - j0Var.pos;
            }
            if (pVar.i0() == 2) {
                byte x5 = pVar.x(0);
                byte x6 = pVar.x(1);
                while (j6 < mVar.size()) {
                    byte[] bArr = j0Var.data;
                    i5 = (int) ((j0Var.pos + j5) - j6);
                    int i7 = j0Var.limit;
                    while (i5 < i7) {
                        byte b6 = bArr[i5];
                        if (b6 != x5 && b6 != x6) {
                            i5++;
                        }
                        i6 = j0Var.pos;
                    }
                    j6 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    l0.m(j0Var);
                    j5 = j6;
                }
            } else {
                byte[] N = pVar.N();
                while (j6 < mVar.size()) {
                    byte[] bArr2 = j0Var.data;
                    i5 = (int) ((j0Var.pos + j5) - j6);
                    int i8 = j0Var.limit;
                    while (i5 < i8) {
                        byte b7 = bArr2[i5];
                        for (byte b8 : N) {
                            if (b7 == b8) {
                                i6 = j0Var.pos;
                            }
                        }
                        i5++;
                    }
                    j6 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    l0.m(j0Var);
                    j5 = j6;
                }
            }
            return -1L;
        }
        while (true) {
            long j7 = (j0Var.limit - j0Var.pos) + j6;
            if (j7 > j5) {
                break;
            }
            j0Var = j0Var.next;
            l0.m(j0Var);
            j6 = j7;
        }
        if (pVar.i0() == 2) {
            byte x7 = pVar.x(0);
            byte x8 = pVar.x(1);
            while (j6 < mVar.size()) {
                byte[] bArr3 = j0Var.data;
                i5 = (int) ((j0Var.pos + j5) - j6);
                int i9 = j0Var.limit;
                while (i5 < i9) {
                    byte b9 = bArr3[i5];
                    if (b9 != x7 && b9 != x8) {
                        i5++;
                    }
                    i6 = j0Var.pos;
                }
                j6 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                l0.m(j0Var);
                j5 = j6;
            }
        } else {
            byte[] N2 = pVar.N();
            while (j6 < mVar.size()) {
                byte[] bArr4 = j0Var.data;
                i5 = (int) ((j0Var.pos + j5) - j6);
                int i10 = j0Var.limit;
                while (i5 < i10) {
                    byte b10 = bArr4[i5];
                    for (byte b11 : N2) {
                        if (b10 == b11) {
                            i6 = j0Var.pos;
                        }
                    }
                    i5++;
                }
                j6 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                l0.m(j0Var);
                j5 = j6;
            }
        }
        return -1L;
        return (i5 - i6) + j6;
    }

    public static final boolean k(@d5.d m mVar, long j5, @d5.d p pVar, int i5, int i6) {
        l0.p(mVar, ProtectedSandApp.s("橄"));
        l0.p(pVar, ProtectedSandApp.s("橅"));
        if (j5 < 0 || i5 < 0 || i6 < 0 || mVar.size() - j5 < i6 || pVar.i0() - i5 < i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (mVar.b0(i7 + j5) != pVar.x(i5 + i7)) {
                return false;
            }
        }
        return true;
    }

    public static final int l(@d5.d m mVar, @d5.d byte[] bArr) {
        l0.p(mVar, ProtectedSandApp.s("橆"));
        l0.p(bArr, ProtectedSandApp.s("橇"));
        return mVar.read(bArr, 0, bArr.length);
    }

    public static final int m(@d5.d m mVar, @d5.d byte[] bArr, int i5, int i6) {
        l0.p(mVar, ProtectedSandApp.s("橈"));
        l0.p(bArr, ProtectedSandApp.s("橉"));
        j.e(bArr.length, i5, i6);
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            return -1;
        }
        int min = Math.min(i6, j0Var.limit - j0Var.pos);
        byte[] bArr2 = j0Var.data;
        int i7 = j0Var.pos;
        kotlin.collections.p.v0(bArr2, bArr, i5, i7, i7 + min);
        j0Var.pos += min;
        mVar.M0(mVar.size() - min);
        if (j0Var.pos == j0Var.limit) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        }
        return min;
    }

    public static final long n(@d5.d m mVar, @d5.d m mVar2, long j5) {
        l0.p(mVar, ProtectedSandApp.s("橊"));
        l0.p(mVar2, ProtectedSandApp.s("橋"));
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("橌"), j5).toString());
        }
        if (mVar.size() == 0) {
            return -1L;
        }
        if (j5 > mVar.size()) {
            j5 = mVar.size();
        }
        mVar2.t0(mVar, j5);
        return j5;
    }

    public static final long o(@d5.d m mVar, @d5.d m0 m0Var) {
        l0.p(mVar, ProtectedSandApp.s("橍"));
        l0.p(m0Var, ProtectedSandApp.s("橎"));
        long size = mVar.size();
        if (size > 0) {
            m0Var.t0(mVar, size);
        }
        return size;
    }

    public static final byte p(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("橏"));
        if (mVar.size() == 0) {
            throw new EOFException();
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        int i5 = j0Var.pos;
        int i6 = j0Var.limit;
        int i7 = i5 + 1;
        byte b6 = j0Var.data[i5];
        mVar.M0(mVar.size() - 1);
        if (i7 == i6) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i7;
        }
        return b6;
    }

    @d5.d
    public static final byte[] q(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("橐"));
        return mVar.K0(mVar.size());
    }

    @d5.d
    public static final byte[] r(@d5.d m mVar, long j5) {
        l0.p(mVar, ProtectedSandApp.s("橑"));
        if (!(j5 >= 0 && j5 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("橒"), j5).toString());
        }
        if (mVar.size() < j5) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j5];
        mVar.readFully(bArr);
        return bArr;
    }

    @d5.d
    public static final p s(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("橓"));
        return mVar.v(mVar.size());
    }

    @d5.d
    public static final p t(@d5.d m mVar, long j5) {
        l0.p(mVar, ProtectedSandApp.s("橔"));
        if (!(j5 >= 0 && j5 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("橕"), j5).toString());
        }
        if (mVar.size() < j5) {
            throw new EOFException();
        }
        if (j5 < 4096) {
            return new p(mVar.K0(j5));
        }
        p f12 = mVar.f1((int) j5);
        mVar.skip(j5);
        return f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be A[EDGE_INSN: B:46:0x00be->B:40:0x00be BREAK  A[LOOP:0: B:4:0x001a->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long u(@d5.d okio.m r15) {
        /*
            java.lang.String r0 = "橖"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r15, r0)
            long r0 = r15.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lcc
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L1a:
            okio.j0 r7 = r15.head
            kotlin.jvm.internal.l0.m(r7)
            byte[] r8 = r7.data
            int r9 = r7.pos
            int r10 = r7.limit
        L25:
            if (r9 >= r10) goto Laa
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L79
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L79
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L4b
            if (r13 != 0) goto L45
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L45
            goto L4b
        L45:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L85
        L4b:
            okio.m r15 = new okio.m
            r15.<init>()
            okio.m r15 = r15.j1(r3)
            okio.m r15 = r15.writeByte(r11)
            if (r1 != 0) goto L5d
            r15.readByte()
        L5d:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "橗"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            java.lang.String r15 = r15.L0()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L79:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L8a
            if (r0 != 0) goto L8a
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L85:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L25
        L8a:
            if (r0 == 0) goto L8e
            r2 = r13
            goto Laa
        L8e:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "橘"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            java.lang.String r1 = okio.j.m(r11)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        Laa:
            if (r9 != r10) goto Lb6
            okio.j0 r8 = r7.b()
            r15.head = r8
            okio.k0.d(r7)
            goto Lb8
        Lb6:
            r7.pos = r9
        Lb8:
            if (r2 != 0) goto Lbe
            okio.j0 r7 = r15.head
            if (r7 != 0) goto L1a
        Lbe:
            long r5 = r15.size()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.M0(r5)
            if (r1 == 0) goto Lca
            goto Lcb
        Lca:
            long r3 = -r3
        Lcb:
            return r3
        Lcc:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.a.u(okio.m):long");
    }

    public static final void v(@d5.d m mVar, @d5.d m mVar2, long j5) {
        l0.p(mVar, ProtectedSandApp.s("橙"));
        l0.p(mVar2, ProtectedSandApp.s("橚"));
        if (mVar.size() >= j5) {
            mVar2.t0(mVar, j5);
        } else {
            mVar2.t0(mVar, mVar.size());
            throw new EOFException();
        }
    }

    public static final void w(@d5.d m mVar, @d5.d byte[] bArr) {
        l0.p(mVar, ProtectedSandApp.s("橛"));
        l0.p(bArr, ProtectedSandApp.s("橜"));
        int i5 = 0;
        while (i5 < bArr.length) {
            int read = mVar.read(bArr, i5, bArr.length - i5);
            if (read == -1) {
                throw new EOFException();
            }
            i5 += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9 A[EDGE_INSN: B:39:0x00b9->B:36:0x00b9 BREAK  A[LOOP:0: B:4:0x0016->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long x(@d5.d okio.m r14) {
        /*
            java.lang.String r0 = "橝"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lc3
            r0 = 0
            r1 = r0
            r4 = r2
        L16:
            okio.j0 r6 = r14.head
            kotlin.jvm.internal.l0.m(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L21:
            if (r8 >= r9) goto La5
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L32
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L32
            int r11 = r10 - r11
            goto L4c
        L32:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L41
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L41
        L3c:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L4c
        L41:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L85
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L85
            goto L3c
        L4c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L5c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L21
        L5c:
            okio.m r14 = new okio.m
            r14.<init>()
            okio.m r14 = r14.w0(r4)
            okio.m r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "橞"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            java.lang.String r14 = r14.L0()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L85:
            if (r0 == 0) goto L89
            r1 = 1
            goto La5
        L89:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "機"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            java.lang.String r1 = okio.j.m(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        La5:
            if (r8 != r9) goto Lb1
            okio.j0 r7 = r6.b()
            r14.head = r7
            okio.k0.d(r6)
            goto Lb3
        Lb1:
            r6.pos = r8
        Lb3:
            if (r1 != 0) goto Lb9
            okio.j0 r6 = r14.head
            if (r6 != 0) goto L16
        Lb9:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.M0(r1)
            return r4
        Lc3:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.a.x(okio.m):long");
    }

    public static final int y(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("橠"));
        if (mVar.size() < 4) {
            throw new EOFException();
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        int i5 = j0Var.pos;
        int i6 = j0Var.limit;
        if (i6 - i5 < 4) {
            return (mVar.readByte() & UByte.f27220r) | ((mVar.readByte() & UByte.f27220r) << 24) | ((mVar.readByte() & UByte.f27220r) << 16) | ((mVar.readByte() & UByte.f27220r) << 8);
        }
        byte[] bArr = j0Var.data;
        int i7 = i5 + 1;
        int i8 = i7 + 1;
        int i9 = ((bArr[i5] & UByte.f27220r) << 24) | ((bArr[i7] & UByte.f27220r) << 16);
        int i10 = i8 + 1;
        int i11 = i9 | ((bArr[i8] & UByte.f27220r) << 8);
        int i12 = i10 + 1;
        int i13 = i11 | (bArr[i10] & UByte.f27220r);
        mVar.M0(mVar.size() - 4);
        if (i12 == i6) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i12;
        }
        return i13;
    }

    public static final long z(@d5.d m mVar) {
        l0.p(mVar, ProtectedSandApp.s("橡"));
        if (mVar.size() < 8) {
            throw new EOFException();
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        int i5 = j0Var.pos;
        int i6 = j0Var.limit;
        if (i6 - i5 < 8) {
            return ((mVar.readInt() & 4294967295L) << 32) | (4294967295L & mVar.readInt());
        }
        byte[] bArr = j0Var.data;
        long j5 = (bArr[i5] & 255) << 56;
        int i7 = i5 + 1 + 1 + 1;
        long j6 = j5 | ((bArr[r7] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j7 = j6 | ((bArr[i7] & 255) << 32) | ((bArr[r1] & 255) << 24);
        long j8 = j7 | ((bArr[r8] & 255) << 16);
        long j9 = j8 | ((bArr[r1] & 255) << 8);
        int i8 = i7 + 1 + 1 + 1 + 1 + 1;
        long j10 = j9 | (bArr[r8] & 255);
        mVar.M0(mVar.size() - 8);
        if (i8 == i6) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i8;
        }
        return j10;
    }
}
