package ve;

import androidx.collection.p0;
import androidx.collection.s;
import androidx.compose.foundation.text.q;
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.m0;
import okio.d0;
import okio.i;
import okio.j;
import okio.j0;
import okio.k0;
import okio.m;
import okio.o0;
import okio.p;
import okio.r0;

/* compiled from: Buffer.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0011\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0011*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\f2\u001a\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u001a\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a,\u0010\u001f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010!\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a\u0014\u0010$\u001a\u00020#*\u00020\u000bH\u0080\b¢\u0006\u0004\b$\u0010%\u001a\u0014\u0010'\u001a\u00020&*\u00020\u000bH\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010+\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b+\u0010\"\u001a\u001c\u0010-\u001a\u00020#*\u00020\u000b2\u0006\u0010,\u001a\u00020\fH\u0080\b¢\u0006\u0004\b-\u0010.\u001a\u0014\u00100\u001a\u00020/*\u00020\u000bH\u0080\b¢\u0006\u0004\b0\u00101\u001a\u001c\u00102\u001a\u00020/*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b2\u00103\u001a0\u00106\u001a\u00020\u000b*\u00020\u000b2\u0006\u00105\u001a\u0002042\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u001c\u00109\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\b9\u0010:\u001a\u001c\u0010\u0011\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0011\u0010:\u001a\u001c\u0010<\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010;\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b<\u0010=\u001a\u001c\u0010?\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010>\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b?\u0010@\u001a,\u0010A\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bA\u0010B\u001a\u0014\u0010C\u001a\u00020\u0004*\u00020\u000bH\u0080\b¢\u0006\u0004\bC\u0010D\u001a\u001c\u0010E\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bE\u0010F\u001a\u001c\u0010H\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010G\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bH\u0010I\u001a\u001c\u0010J\u001a\u00020/*\u00020\u000b2\u0006\u0010G\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bJ\u0010K\u001a,\u0010L\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010G\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bL\u0010M\u001a\u0014\u0010N\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bN\u0010\"\u001a\u0014\u0010O\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bO\u0010\"\u001a\u0014\u0010P\u001a\u000204*\u00020\u000bH\u0080\b¢\u0006\u0004\bP\u0010Q\u001a\u001c\u0010R\u001a\u000204*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bR\u0010S\u001a\u001c\u0010T\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0080\b¢\u0006\u0004\bT\u0010U\u001a$\u00108\u001a\u00020/*\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\b8\u0010V\u001a\u001c\u0010X\u001a\u00020\f*\u00020\u000b2\u0006\u0010G\u001a\u00020WH\u0080\b¢\u0006\u0004\bX\u0010Y\u001a\u001c\u0010Z\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bZ\u0010\u0010\u001a\u0016\u0010[\u001a\u0004\u0018\u00010\u000e*\u00020\u000bH\u0080\b¢\u0006\u0004\b[\u0010\\\u001a\u001c\u0010^\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010]\u001a\u00020\fH\u0080\b¢\u0006\u0004\b^\u0010\u0010\u001a\u0014\u0010_\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b_\u0010*\u001a,\u0010c\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010`\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020\u00022\u0006\u0010b\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bc\u0010d\u001a\u001c\u0010f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bf\u0010g\u001a\u001c\u0010i\u001a\u00020\f*\u00020\u000b2\u0006\u0010>\u001a\u00020hH\u0080\b¢\u0006\u0004\bi\u0010j\u001a$\u0010k\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010>\u001a\u00020h2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bk\u0010l\u001a\u001c\u0010m\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bm\u0010g\u001a\u001c\u0010n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010P\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bn\u0010g\u001a\u001c\u0010p\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010o\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bp\u0010g\u001a\u001c\u0010q\u001a\u00020\u000b*\u00020\u000b2\u0006\u00108\u001a\u00020\fH\u0080\b¢\u0006\u0004\bq\u0010:\u001a$\u0010r\u001a\u00020/*\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\br\u0010V\u001a$\u0010s\u001a\u00020\f*\u00020\u000b2\u0006\u0010G\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\fH\u0080\b¢\u0006\u0004\bs\u0010t\u001a,\u0010v\u001a\u00020\f*\u00020\u000b2\u0006\u0010!\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010u\u001a\u00020\fH\u0080\b¢\u0006\u0004\bv\u0010w\u001a$\u0010o\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\fH\u0080\b¢\u0006\u0004\bo\u0010x\u001a$\u0010z\u001a\u00020\f*\u00020\u000b2\u0006\u0010y\u001a\u0002042\u0006\u0010\u0012\u001a\u00020\fH\u0080\b¢\u0006\u0004\bz\u0010x\u001a4\u0010{\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0005\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b{\u0010|\u001a\u001f\u0010\u007f\u001a\u00020\b*\u00020\u000b2\b\u0010~\u001a\u0004\u0018\u00010}H\u0080\b¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a\u0016\u0010\u0081\u0001\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0005\b\u0081\u0001\u0010*\u001a\u0017\u0010\u0082\u0001\u001a\u00020\u000b*\u00020\u000bH\u0080\b¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0016\u0010\u0084\u0001\u001a\u000204*\u00020\u000bH\u0080\b¢\u0006\u0005\b\u0084\u0001\u0010Q\u001a\u001f\u0010\u0085\u0001\u001a\u000204*\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0080\b¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u001e\u0010\u008a\u0001\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b0\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0016\u0010\u008b\u0001\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0007\n\u0005\b!\u0010\u0085\u0001\"\u0016\u0010\u008c\u0001\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010<\"\u0015\u0010\u008d\u0001\u001a\u00020\f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010<\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008e\u0001"}, d2 = {"Lokio/j0;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "a0", "(Lokio/j0;I[BII)Z", "Lokio/m;", "", "newline", "", "b0", "(Lokio/m;J)Ljava/lang/String;", "T", "fromIndex", "Lkotlin/Function2;", "lambda", "c0", "(Lokio/m;JLld/p;)Ljava/lang/Object;", "Lokio/d0;", "options", "selectTruncated", "d0", "(Lokio/m;Lokio/d0;Z)I", "out", "offset", "byteCount", "d", "(Lokio/m;Lokio/m;JJ)Lokio/m;", "b", "(Lokio/m;)J", "", "p", "(Lokio/m;)B", "", "A", "(Lokio/m;)S", "y", "(Lokio/m;)I", "z", "pos", "f", "(Lokio/m;J)B", "Lkotlin/k2;", "a", "(Lokio/m;)V", "G", "(Lokio/m;J)V", "Lokio/p;", "byteString", "K", "(Lokio/m;Lokio/p;II)Lokio/m;", "v", "S", "(Lokio/m;J)Lokio/m;", "minimumCapacity", "J", "(Lokio/m;I)Lokio/j0;", "source", "M", "(Lokio/m;[B)Lokio/m;", "N", "(Lokio/m;[BII)Lokio/m;", "q", "(Lokio/m;)[B", "r", "(Lokio/m;J)[B", "sink", "l", "(Lokio/m;[B)I", "w", "(Lokio/m;[B)V", "m", "(Lokio/m;[BII)I", "u", "x", "s", "(Lokio/m;)Lokio/p;", "t", "(Lokio/m;J)Lokio/p;", "F", "(Lokio/m;Lokio/d0;)I", "(Lokio/m;Lokio/m;J)V", "Lokio/m0;", "o", "(Lokio/m;Lokio/m0;)J", "B", "D", "(Lokio/m;)Ljava/lang/String;", "limit", "E", "C", "string", "beginIndex", "endIndex", "X", "(Lokio/m;Ljava/lang/String;II)Lokio/m;", "codePoint", "Y", "(Lokio/m;I)Lokio/m;", "Lokio/o0;", "Q", "(Lokio/m;Lokio/o0;)J", "L", "(Lokio/m;Lokio/o0;J)Lokio/m;", "R", "W", "i", "U", "V", "O", "n", "(Lokio/m;Lokio/m;J)J", "toIndex", "h", "(Lokio/m;BJJ)J", "(Lokio/m;Lokio/p;J)J", "targetBytes", "j", "k", "(Lokio/m;JLokio/p;II)Z", "", "other", "e", "(Lokio/m;Ljava/lang/Object;)Z", "g", "c", "(Lokio/m;)Lokio/m;", "H", "I", "(Lokio/m;I)Lokio/p;", "[B", "Z", "()[B", "HEX_DIGIT_BYTES", "SEGMENTING_THRESHOLD", "OVERFLOW_ZONE", "OVERFLOW_DIGIT_START", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    private static final byte[] f92843a = i.a(ProtectedSandApp.s("₎"));

    /* renamed from: b, reason: collision with root package name */
    public static final int f92844b = 4096;

    /* renamed from: c, reason: collision with root package name */
    public static final long f92845c = -922337203685477580L;

    /* renamed from: d, reason: collision with root package name */
    public static final long f92846d = -7;

    public static final short A(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("\u208f"));
        if (mVar.size() < 2) {
            throw new EOFException();
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        int i4 = j0Var.pos;
        int i5 = j0Var.limit;
        if (i5 - i4 < 2) {
            return (short) ((mVar.readByte() & 255) | ((mVar.readByte() & 255) << 8));
        }
        byte[] bArr = j0Var.data;
        int i6 = i4 + 1;
        int i7 = (bArr[i4] & 255) << 8;
        int i10 = i4 + 2;
        int i11 = (bArr[i6] & 255) | i7;
        mVar.Y(mVar.size() - 2);
        if (i10 == i5) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i10;
        }
        return (short) i11;
    }

    @l
    public static final String B(@l m mVar, long j4) {
        l0.p(mVar, ProtectedSandApp.s("ₐ"));
        if (!(j4 >= 0 && j4 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("ₑ"), j4).toString());
        }
        if (mVar.size() < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        int i4 = j0Var.pos;
        if (i4 + j4 > j0Var.limit) {
            return f.c(mVar.q1(j4), 0, 0, 3, null);
        }
        int i5 = (int) j4;
        String b5 = f.b(j0Var.data, i4, i4 + i5);
        j0Var.pos += i5;
        mVar.Y(mVar.size() - j4);
        if (j0Var.pos == j0Var.limit) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        }
        return b5;
    }

    public static final int C(@l m mVar) {
        int i4;
        int i5;
        int i6;
        l0.p(mVar, ProtectedSandApp.s("ₒ"));
        if (mVar.size() == 0) {
            throw new EOFException();
        }
        byte z4 = mVar.z(0L);
        if ((z4 & 128) == 0) {
            i4 = z4 & Byte.MAX_VALUE;
            i6 = 0;
            i5 = 1;
        } else if ((z4 & 224) == 192) {
            i4 = z4 & com.google.common.base.c.I;
            i5 = 2;
            i6 = 128;
        } else if ((z4 & 240) == 224) {
            i4 = z4 & com.google.common.base.c.f54871q;
            i5 = 3;
            i6 = 2048;
        } else {
            if ((z4 & 248) != 240) {
                mVar.skip(1L);
                return r0.f85267c;
            }
            i4 = z4 & 7;
            i5 = 4;
            i6 = 65536;
        }
        long j4 = i5;
        if (mVar.size() < j4) {
            StringBuilder a5 = s.a(ProtectedSandApp.s("ₓ"), i5, ProtectedSandApp.s("ₔ"));
            a5.append(mVar.size());
            a5.append(ProtectedSandApp.s("ₕ"));
            a5.append(j.m(z4));
            a5.append(')');
            throw new EOFException(a5.toString());
        }
        for (int i7 = 1; i7 < i5; i7++) {
            long j5 = i7;
            byte z5 = mVar.z(j5);
            if ((z5 & 192) != 128) {
                mVar.skip(j5);
                return r0.f85267c;
            }
            i4 = (i4 << 6) | (z5 & r0.f85265a);
        }
        mVar.skip(j4);
        return i4 > 1114111 ? r0.f85267c : ((55296 <= i4 && 57343 >= i4) || i4 < i6) ? r0.f85267c : i4;
    }

    @fg.m
    public static final String D(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("ₖ"));
        long Q1 = mVar.Q1((byte) 10);
        if (Q1 != -1) {
            return b0(mVar, Q1);
        }
        if (mVar.size() != 0) {
            return mVar.q3(mVar.size(), kotlin.text.f.UTF_8);
        }
        return null;
    }

    @l
    public static final String E(@l m mVar, long j4) {
        l0.p(mVar, ProtectedSandApp.s("ₗ"));
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("ₚ"), j4).toString());
        }
        long j5 = j4 != Long.MAX_VALUE ? j4 + 1 : Long.MAX_VALUE;
        byte b5 = (byte) 10;
        long v02 = mVar.v0(b5, 0L, j5);
        if (v02 != -1) {
            return b0(mVar, v02);
        }
        if (j5 < mVar.size() && mVar.z(j5 - 1) == ((byte) 13) && mVar.z(j5) == b5) {
            return b0(mVar, j5);
        }
        m mVar2 = new m();
        mVar.n(mVar2, 0L, Math.min(32, mVar.size()));
        throw new EOFException(ProtectedSandApp.s("ₘ") + Math.min(mVar.size(), j4) + ProtectedSandApp.s("ₙ") + mVar2.b3().s() + m0.ellipsis);
    }

    public static final int F(@l m mVar, @l d0 d0Var) {
        l0.p(mVar, ProtectedSandApp.s("ₛ"));
        l0.p(d0Var, ProtectedSandApp.s("ₜ"));
        int e02 = e0(mVar, d0Var, false, 2, null);
        if (e02 == -1) {
            return -1;
        }
        mVar.skip(d0Var.getByteStrings()[e02].q());
        return e02;
    }

    public static final void G(@l m mVar, long j4) {
        l0.p(mVar, ProtectedSandApp.s("\u209d"));
        while (j4 > 0) {
            j0 j0Var = mVar.head;
            if (j0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j4, j0Var.limit - j0Var.pos);
            long j5 = min;
            mVar.Y(mVar.size() - j5);
            j4 -= j5;
            int i4 = j0Var.pos + min;
            j0Var.pos = i4;
            if (i4 == j0Var.limit) {
                mVar.head = j0Var.b();
                k0.d(j0Var);
            }
        }
    }

    @l
    public static final p H(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("\u209e"));
        if (mVar.size() <= ((long) Integer.MAX_VALUE)) {
            return mVar.A0((int) mVar.size());
        }
        throw new IllegalStateException((ProtectedSandApp.s("\u209f") + mVar.size()).toString());
    }

    @l
    public static final p I(@l m mVar, int i4) {
        l0.p(mVar, ProtectedSandApp.s("\u209e"));
        if (i4 == 0) {
            return p.f85244f;
        }
        j.e(mVar.size(), 0L, i4);
        j0 j0Var = mVar.head;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            l0.m(j0Var);
            int i10 = j0Var.limit;
            int i11 = j0Var.pos;
            if (i10 == i11) {
                throw new AssertionError(ProtectedSandApp.s("₠"));
            }
            i6 += i10 - i11;
            i7++;
            j0Var = j0Var.next;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        j0 j0Var2 = mVar.head;
        int i12 = 0;
        while (i5 < i4) {
            l0.m(j0Var2);
            bArr[i12] = j0Var2.data;
            i5 += j0Var2.limit - j0Var2.pos;
            iArr[i12] = Math.min(i5, i4);
            iArr[i12 + i7] = j0Var2.pos;
            j0Var2.shared = true;
            i12++;
            j0Var2 = j0Var2.next;
        }
        return new okio.l0(bArr, iArr);
    }

    @l
    public static final j0 J(@l m mVar, int i4) {
        l0.p(mVar, ProtectedSandApp.s("₡"));
        if (!(i4 >= 1 && i4 <= 8192)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("₢"));
        }
        j0 j0Var = mVar.head;
        if (j0Var != null) {
            l0.m(j0Var);
            j0 j0Var2 = j0Var.prev;
            l0.m(j0Var2);
            return (j0Var2.limit + i4 > 8192 || !j0Var2.owner) ? j0Var2.c(k0.e()) : j0Var2;
        }
        j0 e4 = k0.e();
        mVar.head = e4;
        e4.prev = e4;
        e4.next = e4;
        return e4;
    }

    @l
    public static final m K(@l m mVar, @l p pVar, int i4, int i5) {
        l0.p(mVar, ProtectedSandApp.s("₣"));
        l0.p(pVar, ProtectedSandApp.s("₤"));
        pVar.r0(mVar, i4, i5);
        return mVar;
    }

    @l
    public static final m L(@l m mVar, @l o0 o0Var, long j4) {
        l0.p(mVar, ProtectedSandApp.s("₣"));
        l0.p(o0Var, ProtectedSandApp.s("₥"));
        while (j4 > 0) {
            long w32 = o0Var.w3(mVar, j4);
            if (w32 == -1) {
                throw new EOFException();
            }
            j4 -= w32;
        }
        return mVar;
    }

    @l
    public static final m M(@l m mVar, @l byte[] bArr) {
        l0.p(mVar, ProtectedSandApp.s("₣"));
        l0.p(bArr, ProtectedSandApp.s("₥"));
        return mVar.write(bArr, 0, bArr.length);
    }

    @l
    public static final m N(@l m mVar, @l byte[] bArr, int i4, int i5) {
        l0.p(mVar, ProtectedSandApp.s("₣"));
        l0.p(bArr, ProtectedSandApp.s("₥"));
        long j4 = i5;
        j.e(bArr.length, i4, j4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            j0 B0 = mVar.B0(1);
            int min = Math.min(i6 - i4, 8192 - B0.limit);
            int i7 = i4 + min;
            kotlin.collections.l.v0(bArr, B0.data, B0.limit, i4, i7);
            B0.limit += min;
            i4 = i7;
        }
        mVar.Y(mVar.size() + j4);
        return mVar;
    }

    public static final void O(@l m mVar, @l m mVar2, long j4) {
        j0 j0Var;
        l0.p(mVar, ProtectedSandApp.s("₣"));
        l0.p(mVar2, ProtectedSandApp.s("₥"));
        if (!(mVar2 != mVar)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("₦"));
        }
        j.e(mVar2.size(), 0L, j4);
        while (j4 > 0) {
            j0 j0Var2 = mVar2.head;
            l0.m(j0Var2);
            int i4 = j0Var2.limit;
            l0.m(mVar2.head);
            if (j4 < i4 - r2.pos) {
                j0 j0Var3 = mVar.head;
                if (j0Var3 != null) {
                    l0.m(j0Var3);
                    j0Var = j0Var3.prev;
                } else {
                    j0Var = null;
                }
                if (j0Var != null && j0Var.owner) {
                    if ((j0Var.limit + j4) - (j0Var.shared ? 0 : j0Var.pos) <= 8192) {
                        j0 j0Var4 = mVar2.head;
                        l0.m(j0Var4);
                        j0Var4.g(j0Var, (int) j4);
                        mVar2.Y(mVar2.size() - j4);
                        mVar.Y(mVar.size() + j4);
                        return;
                    }
                }
                j0 j0Var5 = mVar2.head;
                l0.m(j0Var5);
                mVar2.head = j0Var5.e((int) j4);
            }
            j0 j0Var6 = mVar2.head;
            l0.m(j0Var6);
            long j5 = j0Var6.limit - j0Var6.pos;
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
            mVar2.Y(mVar2.size() - j5);
            mVar.Y(mVar.size() + j5);
            j4 -= j5;
        }
    }

    public static m P(m mVar, p pVar, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = pVar.q();
        }
        l0.p(mVar, ProtectedSandApp.s("₣"));
        l0.p(pVar, ProtectedSandApp.s("₤"));
        pVar.r0(mVar, i4, i5);
        return mVar;
    }

    public static final long Q(@l m mVar, @l o0 o0Var) {
        l0.p(mVar, ProtectedSandApp.s("₧"));
        l0.p(o0Var, ProtectedSandApp.s("₥"));
        long j4 = 0;
        while (true) {
            long w32 = o0Var.w3(mVar, 8192);
            if (w32 == -1) {
                return j4;
            }
            j4 += w32;
        }
    }

    @l
    public static final m R(@l m mVar, int i4) {
        l0.p(mVar, ProtectedSandApp.s("₨"));
        j0 B0 = mVar.B0(1);
        byte[] bArr = B0.data;
        int i5 = B0.limit;
        B0.limit = i5 + 1;
        bArr[i5] = (byte) i4;
        mVar.Y(mVar.size() + 1);
        return mVar;
    }

    @l
    public static final m S(@l m mVar, long j4) {
        boolean z4;
        l0.p(mVar, ProtectedSandApp.s("₩"));
        if (j4 == 0) {
            return mVar.writeByte(48);
        }
        int i4 = 1;
        if (j4 < 0) {
            j4 = -j4;
            if (j4 < 0) {
                return mVar.Q0(ProtectedSandApp.s("₪"));
            }
            z4 = true;
        } else {
            z4 = false;
        }
        if (j4 >= 100000000) {
            i4 = j4 < 1000000000000L ? j4 < okhttp3.internal.connection.f.f84407v ? j4 < 1000000000 ? 9 : 10 : j4 < 100000000000L ? 11 : 12 : j4 < 1000000000000000L ? j4 < 10000000000000L ? 13 : j4 < 100000000000000L ? 14 : 15 : j4 < 100000000000000000L ? j4 < 10000000000000000L ? 16 : 17 : j4 < 1000000000000000000L ? 18 : 19;
        } else if (j4 >= i0.f35991f) {
            i4 = j4 < 1000000 ? j4 < 100000 ? 5 : 6 : j4 < 10000000 ? 7 : 8;
        } else if (j4 >= 100) {
            i4 = j4 < 1000 ? 3 : 4;
        } else if (j4 >= 10) {
            i4 = 2;
        }
        if (z4) {
            i4++;
        }
        j0 B0 = mVar.B0(i4);
        byte[] bArr = B0.data;
        int i5 = B0.limit + i4;
        while (j4 != 0) {
            long j5 = 10;
            i5--;
            bArr[i5] = f92843a[(int) (j4 % j5)];
            j4 /= j5;
        }
        if (z4) {
            bArr[i5 - 1] = (byte) 45;
        }
        B0.limit += i4;
        mVar.Y(mVar.size() + i4);
        return mVar;
    }

    @l
    public static final m T(@l m mVar, long j4) {
        l0.p(mVar, ProtectedSandApp.s("₫"));
        if (j4 == 0) {
            return mVar.writeByte(48);
        }
        long j5 = (j4 >>> 1) | j4;
        long j6 = j5 | (j5 >>> 2);
        long j7 = j6 | (j6 >>> 4);
        long j10 = j7 | (j7 >>> 8);
        long j11 = j10 | (j10 >>> 16);
        long j12 = j11 | (j11 >>> 32);
        long j13 = j12 - ((j12 >>> 1) & 6148914691236517205L);
        long j14 = ((j13 >>> 2) & 3689348814741910323L) + (j13 & 3689348814741910323L);
        long j15 = ((j14 >>> 4) + j14) & 1085102592571150095L;
        long j16 = j15 + (j15 >>> 8);
        long j17 = j16 + (j16 >>> 16);
        int i4 = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + 3) / 4);
        j0 B0 = mVar.B0(i4);
        byte[] bArr = B0.data;
        int i5 = B0.limit;
        for (int i6 = (i5 + i4) - 1; i6 >= i5; i6--) {
            bArr[i6] = f92843a[(int) (15 & j4)];
            j4 >>>= 4;
        }
        B0.limit += i4;
        mVar.Y(mVar.size() + i4);
        return mVar;
    }

    @l
    public static final m U(@l m mVar, int i4) {
        l0.p(mVar, ProtectedSandApp.s("€"));
        j0 B0 = mVar.B0(4);
        byte[] bArr = B0.data;
        int i5 = B0.limit;
        bArr[i5] = (byte) ((i4 >>> 24) & 255);
        bArr[i5 + 1] = (byte) ((i4 >>> 16) & 255);
        bArr[i5 + 2] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 3] = (byte) (i4 & 255);
        B0.limit = i5 + 4;
        mVar.Y(mVar.size() + 4);
        return mVar;
    }

    @l
    public static final m V(@l m mVar, long j4) {
        l0.p(mVar, ProtectedSandApp.s("₭"));
        j0 B0 = mVar.B0(8);
        byte[] bArr = B0.data;
        int i4 = B0.limit;
        bArr[i4] = (byte) ((j4 >>> 56) & 255);
        bArr[i4 + 1] = (byte) ((j4 >>> 48) & 255);
        bArr[i4 + 2] = (byte) ((j4 >>> 40) & 255);
        bArr[i4 + 3] = (byte) ((j4 >>> 32) & 255);
        bArr[i4 + 4] = (byte) ((j4 >>> 24) & 255);
        bArr[i4 + 5] = (byte) ((j4 >>> 16) & 255);
        bArr[i4 + 6] = (byte) ((j4 >>> 8) & 255);
        bArr[i4 + 7] = (byte) (j4 & 255);
        B0.limit = i4 + 8;
        mVar.Y(mVar.size() + 8);
        return mVar;
    }

    @l
    public static final m W(@l m mVar, int i4) {
        l0.p(mVar, ProtectedSandApp.s("₮"));
        j0 B0 = mVar.B0(2);
        byte[] bArr = B0.data;
        int i5 = B0.limit;
        bArr[i5] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 1] = (byte) (i4 & 255);
        B0.limit = i5 + 2;
        mVar.Y(mVar.size() + 2);
        return mVar;
    }

    @l
    public static final m X(@l m mVar, @l String str, int i4, int i5) {
        l0.p(mVar, ProtectedSandApp.s("₯"));
        l0.p(str, ProtectedSandApp.s("₰"));
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("₵"), i4).toString());
        }
        if (!(i5 >= i4)) {
            throw new IllegalArgumentException(q.a(ProtectedSandApp.s("₳"), i5, ProtectedSandApp.s("₴"), i4).toString());
        }
        if (!(i5 <= str.length())) {
            StringBuilder a5 = s.a(ProtectedSandApp.s("₱"), i5, ProtectedSandApp.s("₲"));
            a5.append(str.length());
            throw new IllegalArgumentException(a5.toString().toString());
        }
        while (i4 < i5) {
            char charAt = str.charAt(i4);
            if (charAt < 128) {
                j0 B0 = mVar.B0(1);
                byte[] bArr = B0.data;
                int i6 = B0.limit - i4;
                int min = Math.min(i5, 8192 - i6);
                int i7 = i4 + 1;
                bArr[i4 + i6] = (byte) charAt;
                while (i7 < min) {
                    char charAt2 = str.charAt(i7);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i7 + i6] = (byte) charAt2;
                    i7++;
                }
                int i10 = B0.limit;
                int i11 = (i6 + i7) - i10;
                B0.limit = i10 + i11;
                mVar.Y(mVar.size() + i11);
                i4 = i7;
            } else {
                if (charAt < 2048) {
                    j0 B02 = mVar.B0(2);
                    byte[] bArr2 = B02.data;
                    int i12 = B02.limit;
                    bArr2[i12] = (byte) ((charAt >> 6) | 192);
                    bArr2[i12 + 1] = (byte) ((charAt & '?') | 128);
                    B02.limit = i12 + 2;
                    mVar.Y(mVar.size() + 2);
                } else if (charAt < 55296 || charAt > 57343) {
                    j0 B03 = mVar.B0(3);
                    byte[] bArr3 = B03.data;
                    int i13 = B03.limit;
                    bArr3[i13] = (byte) ((charAt >> '\f') | 224);
                    bArr3[i13 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    bArr3[i13 + 2] = (byte) ((charAt & '?') | 128);
                    B03.limit = i13 + 3;
                    mVar.Y(mVar.size() + 3);
                } else {
                    int i14 = i4 + 1;
                    char charAt3 = i14 < i5 ? str.charAt(i14) : (char) 0;
                    if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        mVar.writeByte(63);
                        i4 = i14;
                    } else {
                        int i15 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        j0 B04 = mVar.B0(4);
                        byte[] bArr4 = B04.data;
                        int i16 = B04.limit;
                        bArr4[i16] = (byte) ((i15 >> 18) | 240);
                        bArr4[i16 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                        bArr4[i16 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                        bArr4[i16 + 3] = (byte) ((i15 & 63) | 128);
                        B04.limit = i16 + 4;
                        mVar.Y(mVar.size() + 4);
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
        return mVar;
    }

    @l
    public static final m Y(@l m mVar, int i4) {
        l0.p(mVar, ProtectedSandApp.s("₶"));
        if (i4 < 128) {
            mVar.writeByte(i4);
        } else if (i4 < 2048) {
            j0 B0 = mVar.B0(2);
            byte[] bArr = B0.data;
            int i5 = B0.limit;
            bArr[i5] = (byte) ((i4 >> 6) | 192);
            bArr[i5 + 1] = (byte) ((i4 & 63) | 128);
            B0.limit = i5 + 2;
            mVar.Y(mVar.size() + 2);
        } else if (55296 <= i4 && 57343 >= i4) {
            mVar.writeByte(63);
        } else if (i4 < 65536) {
            j0 B02 = mVar.B0(3);
            byte[] bArr2 = B02.data;
            int i6 = B02.limit;
            bArr2[i6] = (byte) ((i4 >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i4 >> 6) & 63) | 128);
            bArr2[i6 + 2] = (byte) ((i4 & 63) | 128);
            B02.limit = i6 + 3;
            mVar.Y(mVar.size() + 3);
        } else {
            if (i4 > 1114111) {
                throw new IllegalArgumentException(ProtectedSandApp.s("₷") + j.n(i4));
            }
            j0 B03 = mVar.B0(4);
            byte[] bArr3 = B03.data;
            int i7 = B03.limit;
            bArr3[i7] = (byte) ((i4 >> 18) | 240);
            bArr3[i7 + 1] = (byte) (((i4 >> 12) & 63) | 128);
            bArr3[i7 + 2] = (byte) (((i4 >> 6) & 63) | 128);
            bArr3[i7 + 3] = (byte) ((i4 & 63) | 128);
            B03.limit = i7 + 4;
            mVar.Y(mVar.size() + 4);
        }
        return mVar;
    }

    @l
    public static final byte[] Z() {
        return f92843a;
    }

    public static final void a(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("₸"));
        mVar.skip(mVar.size());
    }

    public static final boolean a0(@l j0 j0Var, int i4, @l byte[] bArr, int i5, int i6) {
        l0.p(j0Var, ProtectedSandApp.s("₹"));
        l0.p(bArr, ProtectedSandApp.s("₺"));
        int i7 = j0Var.limit;
        byte[] bArr2 = j0Var.data;
        while (i5 < i6) {
            if (i4 == i7) {
                j0Var = j0Var.next;
                l0.m(j0Var);
                byte[] bArr3 = j0Var.data;
                bArr2 = bArr3;
                i4 = j0Var.pos;
                i7 = j0Var.limit;
            }
            if (bArr2[i4] != bArr[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    public static final long b(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("₻"));
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

    @l
    public static final String b0(@l m mVar, long j4) {
        l0.p(mVar, ProtectedSandApp.s("₼"));
        if (j4 > 0) {
            long j5 = j4 - 1;
            if (mVar.z(j5) == ((byte) 13)) {
                String q32 = mVar.q3(j5, kotlin.text.f.UTF_8);
                mVar.skip(2L);
                return q32;
            }
        }
        mVar.getClass();
        String q33 = mVar.q3(j4, kotlin.text.f.UTF_8);
        mVar.skip(1L);
        return q33;
    }

    @l
    public static final m c(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("₽"));
        m mVar2 = new m();
        if (mVar.size() == 0) {
            return mVar2;
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        j0 d5 = j0Var.d();
        mVar2.head = d5;
        d5.prev = d5;
        d5.next = d5;
        for (j0 j0Var2 = j0Var.next; j0Var2 != j0Var; j0Var2 = j0Var2.next) {
            j0 j0Var3 = d5.prev;
            l0.m(j0Var3);
            l0.m(j0Var2);
            j0Var3.c(j0Var2.d());
        }
        mVar2.Y(mVar.size());
        return mVar2;
    }

    public static final <T> T c0(@l m mVar, long j4, @l ld.p<? super j0, ? super Long, ? extends T> pVar) {
        l0.p(mVar, ProtectedSandApp.s("₾"));
        l0.p(pVar, ProtectedSandApp.s("₿"));
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            return pVar.invoke(null, -1L);
        }
        if (mVar.size() - j4 < j4) {
            long size = mVar.size();
            while (size > j4) {
                j0Var = j0Var.prev;
                l0.m(j0Var);
                size -= j0Var.limit - j0Var.pos;
            }
            return pVar.invoke(j0Var, Long.valueOf(size));
        }
        long j5 = 0;
        while (true) {
            long j6 = (j0Var.limit - j0Var.pos) + j5;
            if (j6 > j4) {
                return pVar.invoke(j0Var, Long.valueOf(j5));
            }
            j0Var = j0Var.next;
            l0.m(j0Var);
            j5 = j6;
        }
    }

    @l
    public static final m d(@l m mVar, @l m mVar2, long j4, long j5) {
        l0.p(mVar, ProtectedSandApp.s("⃀"));
        l0.p(mVar2, ProtectedSandApp.s("\u20c1"));
        j.e(mVar.size(), j4, j5);
        if (j5 == 0) {
            return mVar;
        }
        mVar2.Y(mVar2.size() + j5);
        j0 j0Var = mVar.head;
        while (true) {
            l0.m(j0Var);
            int i4 = j0Var.limit;
            int i5 = j0Var.pos;
            if (j4 < i4 - i5) {
                break;
            }
            j4 -= i4 - i5;
            j0Var = j0Var.next;
        }
        while (j5 > 0) {
            l0.m(j0Var);
            j0 d5 = j0Var.d();
            int i6 = d5.pos + ((int) j4);
            d5.pos = i6;
            d5.limit = Math.min(i6 + ((int) j5), d5.limit);
            j0 j0Var2 = mVar2.head;
            if (j0Var2 == null) {
                d5.prev = d5;
                d5.next = d5;
                mVar2.head = d5;
            } else {
                l0.m(j0Var2);
                j0 j0Var3 = j0Var2.prev;
                l0.m(j0Var3);
                j0Var3.c(d5);
            }
            j5 -= d5.limit - d5.pos;
            j0Var = j0Var.next;
            j4 = 0;
        }
        return mVar;
    }

    public static final int d0(@l m mVar, @l d0 d0Var, boolean z4) {
        int i4;
        int i5;
        j0 j0Var;
        int i6;
        int i7;
        l0.p(mVar, ProtectedSandApp.s("\u20c2"));
        l0.p(d0Var, ProtectedSandApp.s("ₜ"));
        j0 j0Var2 = mVar.head;
        if (j0Var2 == null) {
            return z4 ? -2 : -1;
        }
        byte[] bArr = j0Var2.data;
        int i10 = j0Var2.pos;
        int i11 = j0Var2.limit;
        int[] trie = d0Var.getTrie();
        j0 j0Var3 = j0Var2;
        int i12 = -1;
        int i13 = 0;
        loop0: while (true) {
            int i14 = i13 + 1;
            int i15 = trie[i13];
            int i16 = i13 + 2;
            int i17 = trie[i14];
            if (i17 != -1) {
                i12 = i17;
            }
            if (j0Var3 == null) {
                break;
            }
            if (i15 >= 0) {
                i4 = i10 + 1;
                int i18 = bArr[i10] & 255;
                int i19 = i16 + i15;
                while (i16 != i19) {
                    if (i18 == trie[i16]) {
                        i5 = trie[i16 + i15];
                        if (i4 == i11) {
                            j0Var3 = j0Var3.next;
                            l0.m(j0Var3);
                            i4 = j0Var3.pos;
                            bArr = j0Var3.data;
                            i11 = j0Var3.limit;
                            if (j0Var3 == j0Var2) {
                                j0Var3 = null;
                            }
                        }
                    } else {
                        i16++;
                    }
                }
                return i12;
            }
            int i20 = (i15 * (-1)) + i16;
            while (true) {
                int i21 = i10 + 1;
                int i22 = i16 + 1;
                if ((bArr[i10] & 255) != trie[i16]) {
                    return i12;
                }
                boolean z5 = i22 == i20;
                if (i21 == i11) {
                    l0.m(j0Var3);
                    j0 j0Var4 = j0Var3.next;
                    l0.m(j0Var4);
                    i7 = j0Var4.pos;
                    byte[] bArr2 = j0Var4.data;
                    i6 = j0Var4.limit;
                    if (j0Var4 != j0Var2) {
                        j0Var = j0Var4;
                        bArr = bArr2;
                    } else {
                        if (!z5) {
                            break loop0;
                        }
                        bArr = bArr2;
                        j0Var = null;
                    }
                } else {
                    j0Var = j0Var3;
                    i6 = i11;
                    i7 = i21;
                }
                if (z5) {
                    i5 = trie[i22];
                    i4 = i7;
                    i11 = i6;
                    j0Var3 = j0Var;
                    break;
                }
                i10 = i7;
                i11 = i6;
                j0Var3 = j0Var;
                i16 = i22;
            }
            if (i5 >= 0) {
                return i5;
            }
            i13 = -i5;
            i10 = i4;
        }
        if (z4) {
            return -2;
        }
        return i12;
    }

    public static final boolean e(@l m mVar, @fg.m Object obj) {
        l0.p(mVar, ProtectedSandApp.s("\u20c3"));
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
        int i4 = j0Var.pos;
        int i5 = j0Var2.pos;
        long j4 = 0;
        while (j4 < mVar.size()) {
            long min = Math.min(j0Var.limit - i4, j0Var2.limit - i5);
            long j5 = 0;
            while (j5 < min) {
                int i6 = i4 + 1;
                int i7 = i5 + 1;
                if (j0Var.data[i4] != j0Var2.data[i5]) {
                    return false;
                }
                j5++;
                i4 = i6;
                i5 = i7;
            }
            if (i4 == j0Var.limit) {
                j0Var = j0Var.next;
                l0.m(j0Var);
                i4 = j0Var.pos;
            }
            if (i5 == j0Var2.limit) {
                j0Var2 = j0Var2.next;
                l0.m(j0Var2);
                i5 = j0Var2.pos;
            }
            j4 += min;
        }
        return true;
    }

    public static /* synthetic */ int e0(m mVar, d0 d0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return d0(mVar, d0Var, z4);
    }

    public static final byte f(@l m mVar, long j4) {
        l0.p(mVar, ProtectedSandApp.s("\u20c4"));
        j.e(mVar.size(), j4, 1L);
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            l0.m(null);
            throw null;
        }
        if (mVar.size() - j4 < j4) {
            long size = mVar.size();
            while (size > j4) {
                j0Var = j0Var.prev;
                l0.m(j0Var);
                size -= j0Var.limit - j0Var.pos;
            }
            l0.m(j0Var);
            return j0Var.data[(int) ((j0Var.pos + j4) - size)];
        }
        long j5 = 0;
        while (true) {
            long j6 = (j0Var.limit - j0Var.pos) + j5;
            if (j6 > j4) {
                l0.m(j0Var);
                return j0Var.data[(int) ((j0Var.pos + j4) - j5)];
            }
            j0Var = j0Var.next;
            l0.m(j0Var);
            j5 = j6;
        }
    }

    public static final int g(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("\u20c5"));
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = j0Var.limit;
            for (int i6 = j0Var.pos; i6 < i5; i6++) {
                i4 = (i4 * 31) + j0Var.data[i6];
            }
            j0Var = j0Var.next;
            l0.m(j0Var);
        } while (j0Var != mVar.head);
        return i4;
    }

    public static final long h(@l m mVar, byte b5, long j4, long j5) {
        j0 j0Var;
        int i4;
        l0.p(mVar, ProtectedSandApp.s("\u20c6"));
        long j6 = 0;
        if (!(0 <= j4 && j5 >= j4)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("\u20c7") + mVar.size() + ProtectedSandApp.s("\u20c8") + j4 + ProtectedSandApp.s("\u20c9") + j5).toString());
        }
        if (j5 > mVar.size()) {
            j5 = mVar.size();
        }
        if (j4 == j5 || (j0Var = mVar.head) == null) {
            return -1L;
        }
        if (mVar.size() - j4 < j4) {
            j6 = mVar.size();
            while (j6 > j4) {
                j0Var = j0Var.prev;
                l0.m(j0Var);
                j6 -= j0Var.limit - j0Var.pos;
            }
            while (j6 < j5) {
                byte[] bArr = j0Var.data;
                int min = (int) Math.min(j0Var.limit, (j0Var.pos + j5) - j6);
                i4 = (int) ((j0Var.pos + j4) - j6);
                while (i4 < min) {
                    if (bArr[i4] != b5) {
                        i4++;
                    }
                }
                j6 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                l0.m(j0Var);
                j4 = j6;
            }
            return -1L;
        }
        while (true) {
            long j7 = (j0Var.limit - j0Var.pos) + j6;
            if (j7 > j4) {
                break;
            }
            j0Var = j0Var.next;
            l0.m(j0Var);
            j6 = j7;
        }
        while (j6 < j5) {
            byte[] bArr2 = j0Var.data;
            int min2 = (int) Math.min(j0Var.limit, (j0Var.pos + j5) - j6);
            i4 = (int) ((j0Var.pos + j4) - j6);
            while (i4 < min2) {
                if (bArr2[i4] != b5) {
                    i4++;
                }
            }
            j6 += j0Var.limit - j0Var.pos;
            j0Var = j0Var.next;
            l0.m(j0Var);
            j4 = j6;
        }
        return -1L;
        return (i4 - j0Var.pos) + j6;
    }

    public static final long i(@l m mVar, @l p pVar, long j4) {
        long j5 = j4;
        l0.p(mVar, ProtectedSandApp.s("\u20c6"));
        l0.p(pVar, ProtectedSandApp.s("₺"));
        boolean z4 = true;
        if (!(pVar.q() > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u20cb"));
        }
        long j6 = 0;
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("\u20ca"), j5).toString());
        }
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            return -1L;
        }
        if (mVar.size() - j5 < j5) {
            long size = mVar.size();
            while (size > j5) {
                j0Var = j0Var.prev;
                l0.m(j0Var);
                size -= j0Var.limit - j0Var.pos;
            }
            byte[] data = pVar.getData();
            byte b5 = data[0];
            int q4 = pVar.q();
            long size2 = (mVar.size() - q4) + 1;
            while (size < size2) {
                byte[] bArr = j0Var.data;
                int min = (int) Math.min(j0Var.limit, (j0Var.pos + size2) - size);
                for (int i4 = (int) ((j0Var.pos + j5) - size); i4 < min; i4++) {
                    if (bArr[i4] == b5 && a0(j0Var, i4 + 1, data, 1, q4)) {
                        return (i4 - j0Var.pos) + size;
                    }
                }
                size += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                l0.m(j0Var);
                j5 = size;
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
            z4 = z4;
        }
        byte[] data2 = pVar.getData();
        byte b6 = data2[0];
        int q5 = pVar.q();
        long size3 = (mVar.size() - q5) + 1;
        while (j6 < size3) {
            byte[] bArr2 = j0Var.data;
            long j10 = j6;
            int min2 = (int) Math.min(j0Var.limit, (j0Var.pos + size3) - j6);
            for (int i5 = (int) ((j0Var.pos + j5) - j10); i5 < min2; i5++) {
                if (bArr2[i5] == b6 && a0(j0Var, i5 + 1, data2, 1, q5)) {
                    return (i5 - j0Var.pos) + j10;
                }
            }
            j6 = j10 + (j0Var.limit - j0Var.pos);
            j0Var = j0Var.next;
            l0.m(j0Var);
            j5 = j6;
        }
        return -1L;
    }

    public static final long j(@l m mVar, @l p pVar, long j4) {
        int i4;
        int i5;
        l0.p(mVar, ProtectedSandApp.s("\u20cc"));
        l0.p(pVar, ProtectedSandApp.s("\u20cd"));
        long j5 = 0;
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("\u20ca"), j4).toString());
        }
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            return -1L;
        }
        if (mVar.size() - j4 < j4) {
            j5 = mVar.size();
            while (j5 > j4) {
                j0Var = j0Var.prev;
                l0.m(j0Var);
                j5 -= j0Var.limit - j0Var.pos;
            }
            if (pVar.q() == 2) {
                byte G = pVar.G(0);
                byte G2 = pVar.G(1);
                while (j5 < mVar.size()) {
                    byte[] bArr = j0Var.data;
                    i4 = (int) ((j0Var.pos + j4) - j5);
                    int i6 = j0Var.limit;
                    while (i4 < i6) {
                        byte b5 = bArr[i4];
                        if (b5 != G && b5 != G2) {
                            i4++;
                        }
                        i5 = j0Var.pos;
                    }
                    j5 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    l0.m(j0Var);
                    j4 = j5;
                }
            } else {
                byte[] data = pVar.getData();
                while (j5 < mVar.size()) {
                    byte[] bArr2 = j0Var.data;
                    i4 = (int) ((j0Var.pos + j4) - j5);
                    int i7 = j0Var.limit;
                    while (i4 < i7) {
                        byte b6 = bArr2[i4];
                        for (byte b7 : data) {
                            if (b6 == b7) {
                                i5 = j0Var.pos;
                            }
                        }
                        i4++;
                    }
                    j5 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    l0.m(j0Var);
                    j4 = j5;
                }
            }
            return -1L;
        }
        while (true) {
            long j6 = (j0Var.limit - j0Var.pos) + j5;
            if (j6 > j4) {
                break;
            }
            j0Var = j0Var.next;
            l0.m(j0Var);
            j5 = j6;
        }
        if (pVar.q() == 2) {
            byte G3 = pVar.G(0);
            byte G4 = pVar.G(1);
            while (j5 < mVar.size()) {
                byte[] bArr3 = j0Var.data;
                i4 = (int) ((j0Var.pos + j4) - j5);
                int i10 = j0Var.limit;
                while (i4 < i10) {
                    byte b10 = bArr3[i4];
                    if (b10 != G3 && b10 != G4) {
                        i4++;
                    }
                    i5 = j0Var.pos;
                }
                j5 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                l0.m(j0Var);
                j4 = j5;
            }
        } else {
            byte[] data2 = pVar.getData();
            while (j5 < mVar.size()) {
                byte[] bArr4 = j0Var.data;
                i4 = (int) ((j0Var.pos + j4) - j5);
                int i11 = j0Var.limit;
                while (i4 < i11) {
                    byte b11 = bArr4[i4];
                    for (byte b12 : data2) {
                        if (b11 == b12) {
                            i5 = j0Var.pos;
                        }
                    }
                    i4++;
                }
                j5 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                l0.m(j0Var);
                j4 = j5;
            }
        }
        return -1L;
        return (i4 - i5) + j5;
    }

    public static final boolean k(@l m mVar, long j4, @l p pVar, int i4, int i5) {
        l0.p(mVar, ProtectedSandApp.s("\u20ce"));
        l0.p(pVar, ProtectedSandApp.s("₺"));
        if (j4 < 0 || i4 < 0 || i5 < 0 || mVar.size() - j4 < i5 || pVar.q() - i4 < i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (mVar.z(i6 + j4) != pVar.G(i4 + i6)) {
                return false;
            }
        }
        return true;
    }

    public static final int l(@l m mVar, @l byte[] bArr) {
        l0.p(mVar, ProtectedSandApp.s("\u20cf"));
        l0.p(bArr, ProtectedSandApp.s("⃐"));
        return mVar.read(bArr, 0, bArr.length);
    }

    public static final int m(@l m mVar, @l byte[] bArr, int i4, int i5) {
        l0.p(mVar, ProtectedSandApp.s("\u20cf"));
        l0.p(bArr, ProtectedSandApp.s("⃐"));
        j.e(bArr.length, i4, i5);
        j0 j0Var = mVar.head;
        if (j0Var == null) {
            return -1;
        }
        int min = Math.min(i5, j0Var.limit - j0Var.pos);
        byte[] bArr2 = j0Var.data;
        int i6 = j0Var.pos;
        kotlin.collections.l.v0(bArr2, bArr, i4, i6, i6 + min);
        j0Var.pos += min;
        mVar.Y(mVar.size() - min);
        if (j0Var.pos == j0Var.limit) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        }
        return min;
    }

    public static final long n(@l m mVar, @l m mVar2, long j4) {
        l0.p(mVar, ProtectedSandApp.s("\u20cf"));
        l0.p(mVar2, ProtectedSandApp.s("⃐"));
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("⃑"), j4).toString());
        }
        if (mVar.size() == 0) {
            return -1L;
        }
        if (j4 > mVar.size()) {
            j4 = mVar.size();
        }
        mVar2.write(mVar, j4);
        return j4;
    }

    public static final long o(@l m mVar, @l okio.m0 m0Var) {
        l0.p(mVar, ProtectedSandApp.s("⃒"));
        l0.p(m0Var, ProtectedSandApp.s("⃐"));
        long size = mVar.size();
        if (size > 0) {
            m0Var.write(mVar, size);
        }
        return size;
    }

    public static final byte p(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("⃓"));
        if (mVar.size() == 0) {
            throw new EOFException();
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        int i4 = j0Var.pos;
        int i5 = j0Var.limit;
        int i6 = i4 + 1;
        byte b5 = j0Var.data[i4];
        mVar.Y(mVar.size() - 1);
        if (i6 == i5) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i6;
        }
        return b5;
    }

    @l
    public static final byte[] q(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("⃔"));
        return mVar.q1(mVar.size());
    }

    @l
    public static final byte[] r(@l m mVar, long j4) {
        l0.p(mVar, ProtectedSandApp.s("⃔"));
        if (!(j4 >= 0 && j4 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("ₑ"), j4).toString());
        }
        if (mVar.size() < j4) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j4];
        mVar.readFully(bArr);
        return bArr;
    }

    @l
    public static final p s(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("⃕"));
        return mVar.b2(mVar.size());
    }

    @l
    public static final p t(@l m mVar, long j4) {
        l0.p(mVar, ProtectedSandApp.s("⃕"));
        if (!(j4 >= 0 && j4 <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("ₑ"), j4).toString());
        }
        if (mVar.size() < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new p(mVar.q1(j4));
        }
        p A0 = mVar.A0((int) j4);
        mVar.skip(j4);
        return A0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be A[EDGE_INSN: B:46:0x00be->B:40:0x00be BREAK  A[LOOP:0: B:4:0x001a->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long u(@fg.l okio.m r15) {
        /*
            java.lang.String r0 = "⃖"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
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
            okio.m r15 = r15.N1(r3)
            okio.m r15 = r15.writeByte(r11)
            if (r1 != 0) goto L5d
            r15.readByte()
        L5d:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "⃗"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            java.lang.String r15 = r15.n3()
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
            java.lang.String r1 = "⃘"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
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
            r15.Y(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: ve.a.u(okio.m):long");
    }

    public static final void v(@l m mVar, @l m mVar2, long j4) {
        l0.p(mVar, ProtectedSandApp.s("⃙"));
        l0.p(mVar2, ProtectedSandApp.s("⃐"));
        if (mVar.size() >= j4) {
            mVar2.write(mVar, j4);
        } else {
            mVar2.write(mVar, mVar.size());
            throw new EOFException();
        }
    }

    public static final void w(@l m mVar, @l byte[] bArr) {
        l0.p(mVar, ProtectedSandApp.s("⃙"));
        l0.p(bArr, ProtectedSandApp.s("⃐"));
        int i4 = 0;
        while (i4 < bArr.length) {
            int read = mVar.read(bArr, i4, bArr.length - i4);
            if (read == -1) {
                throw new EOFException();
            }
            i4 += read;
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
    public static final long x(@fg.l okio.m r14) {
        /*
            java.lang.String r0 = "⃚"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
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
            okio.m r14 = r14.a3(r4)
            okio.m r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "⃗"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            java.lang.String r14 = r14.n3()
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
            java.lang.String r1 = "⃛"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
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
            r14.Y(r1)
            return r4
        Lc3:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.a.x(okio.m):long");
    }

    public static final int y(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("⃜"));
        if (mVar.size() < 4) {
            throw new EOFException();
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        int i4 = j0Var.pos;
        int i5 = j0Var.limit;
        if (i5 - i4 < 4) {
            return (mVar.readByte() & 255) | ((mVar.readByte() & 255) << 24) | ((mVar.readByte() & 255) << 16) | ((mVar.readByte() & 255) << 8);
        }
        byte[] bArr = j0Var.data;
        int i6 = i4 + 3;
        int i7 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i10 = i4 + 4;
        int i11 = (bArr[i6] & 255) | i7;
        mVar.Y(mVar.size() - 4);
        if (i10 == i5) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i10;
        }
        return i11;
    }

    public static final long z(@l m mVar) {
        l0.p(mVar, ProtectedSandApp.s("⃝"));
        if (mVar.size() < 8) {
            throw new EOFException();
        }
        j0 j0Var = mVar.head;
        l0.m(j0Var);
        int i4 = j0Var.pos;
        int i5 = j0Var.limit;
        if (i5 - i4 < 8) {
            return ((mVar.readInt() & 4294967295L) << 32) | (4294967295L & mVar.readInt());
        }
        byte[] bArr = j0Var.data;
        int i6 = i4 + 7;
        long j4 = ((bArr[i4] & 255) << 56) | ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
        int i7 = i4 + 8;
        long j5 = j4 | (bArr[i6] & 255);
        mVar.Y(mVar.size() - 8);
        if (i7 == i5) {
            mVar.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i7;
        }
        return j5;
    }
}
