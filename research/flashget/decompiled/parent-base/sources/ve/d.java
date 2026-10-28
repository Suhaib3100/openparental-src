package ve;

import androidx.collection.p0;
import androidx.compose.runtime.snapshots.f0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.a0;
import okio.d0;
import okio.i0;
import okio.j;
import okio.m;
import okio.m0;
import okio.o;
import okio.p;
import okio.q0;

/* compiled from: RealBufferedSource.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0080\b¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0013\u001a\u00020\u0012*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0015\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u001a\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0014\u0010\u001d\u001a\u00020\u001c*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010!\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001cH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a,\u0010$\u001a\u00020\u0019*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0019H\u0080\b¢\u0006\u0004\b$\u0010%\u001a$\u0010&\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b&\u0010'\u001a\u001c\u0010)\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020(H\u0080\b¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010,\u001a\u00020+*\u00020\u0000H\u0080\b¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010.\u001a\u00020+*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0016\u00100\u001a\u0004\u0018\u00010+*\u00020\u0000H\u0080\b¢\u0006\u0004\b0\u0010-\u001a\u001c\u00102\u001a\u00020+*\u00020\u00002\u0006\u00101\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b2\u0010/\u001a\u0014\u00103\u001a\u00020\u0019*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00104\u001a\u0014\u00106\u001a\u000205*\u00020\u0000H\u0080\b¢\u0006\u0004\b6\u00107\u001a\u0014\u00108\u001a\u000205*\u00020\u0000H\u0080\b¢\u0006\u0004\b8\u00107\u001a\u0014\u00109\u001a\u00020\u0019*\u00020\u0000H\u0080\b¢\u0006\u0004\b9\u00104\u001a\u0014\u0010:\u001a\u00020\u0019*\u00020\u0000H\u0080\b¢\u0006\u0004\b:\u00104\u001a\u0014\u0010;\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b;\u0010<\u001a\u0014\u0010=\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b=\u0010<\u001a\u0014\u0010>\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b>\u0010<\u001a\u0014\u0010?\u001a\u00020\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b?\u0010<\u001a\u001c\u0010@\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b@\u0010\f\u001a,\u0010C\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\bC\u0010D\u001a$\u0010F\u001a\u00020\u0003*\u00020\u00002\u0006\u0010E\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\bF\u0010G\u001a$\u0010I\u001a\u00020\u0003*\u00020\u00002\u0006\u0010H\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\bI\u0010G\u001a4\u0010K\u001a\u00020\u0007*\u00020\u00002\u0006\u0010#\u001a\u00020\u00032\u0006\u0010E\u001a\u00020\u00122\u0006\u0010J\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0019H\u0080\b¢\u0006\u0004\bK\u0010L\u001a\u0014\u0010N\u001a\u00020M*\u00020\u0000H\u0080\b¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\bP\u0010Q\u001a\u0014\u0010S\u001a\u00020R*\u00020\u0000H\u0080\b¢\u0006\u0004\bS\u0010T\u001a\u0014\u0010U\u001a\u00020+*\u00020\u0000H\u0080\b¢\u0006\u0004\bU\u0010-¨\u0006V"}, d2 = {"Lokio/i0;", "Lokio/m;", "sink", "", "byteCount", "i", "(Lokio/i0;Lokio/m;J)J", "", "b", "(Lokio/i0;)Z", "Lkotlin/k2;", "F", "(Lokio/i0;J)V", "E", "(Lokio/i0;J)Z", "", "k", "(Lokio/i0;)B", "Lokio/p;", "n", "(Lokio/i0;)Lokio/p;", "o", "(Lokio/i0;J)Lokio/p;", "Lokio/d0;", "options", "", "G", "(Lokio/i0;Lokio/d0;)I", "", "l", "(Lokio/i0;)[B", "m", "(Lokio/i0;J)[B", "r", "(Lokio/i0;[B)V", "offset", "h", "(Lokio/i0;[BII)I", "q", "(Lokio/i0;Lokio/m;J)V", "Lokio/m0;", "j", "(Lokio/i0;Lokio/m0;)J", "", "z", "(Lokio/i0;)Ljava/lang/String;", "A", "(Lokio/i0;J)Ljava/lang/String;", "C", "limit", "D", "B", "(Lokio/i0;)I", "", "x", "(Lokio/i0;)S", "y", "t", "u", "v", "(Lokio/i0;)J", "w", "p", "s", "H", "fromIndex", "toIndex", "c", "(Lokio/i0;BJJ)J", "bytes", "d", "(Lokio/i0;Lokio/p;J)J", "targetBytes", "e", "bytesOffset", "g", "(Lokio/i0;JLokio/p;II)Z", "Lokio/o;", "f", "(Lokio/i0;)Lokio/o;", "a", "(Lokio/i0;)V", "Lokio/q0;", "I", "(Lokio/i0;)Lokio/q0;", "J", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class d {
    @l
    public static final String A(@l i0 i0Var, long j4) {
        l0.p(i0Var, ProtectedSandApp.s("℩"));
        i0Var.J1(j4);
        m mVar = i0Var.bufferField;
        mVar.getClass();
        return mVar.q3(j4, kotlin.text.f.UTF_8);
    }

    public static final int B(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("K"));
        i0Var.J1(1L);
        byte z4 = i0Var.bufferField.z(0L);
        if ((z4 & 224) == 192) {
            i0Var.J1(2L);
        } else if ((z4 & 240) == 224) {
            i0Var.J1(3L);
        } else if ((z4 & 248) == 240) {
            i0Var.J1(4L);
        }
        return i0Var.bufferField.Z2();
    }

    @fg.m
    public static final String C(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("Å"));
        long Q1 = i0Var.Q1((byte) 10);
        if (Q1 != -1) {
            return a.b0(i0Var.bufferField, Q1);
        }
        if (i0Var.bufferField.size() != 0) {
            return i0Var.V1(i0Var.bufferField.size());
        }
        return null;
    }

    @l
    public static final String D(@l i0 i0Var, long j4) {
        l0.p(i0Var, ProtectedSandApp.s("ℬ"));
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("ℰ"), j4).toString());
        }
        long j5 = j4 == Long.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        byte b5 = (byte) 10;
        long v02 = i0Var.v0(b5, 0L, j5);
        if (v02 != -1) {
            return a.b0(i0Var.bufferField, v02);
        }
        if (j5 < Long.MAX_VALUE && i0Var.h1(j5) && i0Var.bufferField.z(j5 - 1) == ((byte) 13) && i0Var.h1(1 + j5) && i0Var.bufferField.z(j5) == b5) {
            return a.b0(i0Var.bufferField, j5);
        }
        m mVar = new m();
        m mVar2 = i0Var.bufferField;
        mVar2.n(mVar, 0L, Math.min(32, mVar2.size()));
        throw new EOFException(ProtectedSandApp.s("ℭ") + Math.min(i0Var.bufferField.size(), j4) + ProtectedSandApp.s("℮") + mVar.b3().s() + ProtectedSandApp.s("ℯ"));
    }

    public static final boolean E(@l i0 i0Var, long j4) {
        l0.p(i0Var, ProtectedSandApp.s("ℱ"));
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("ℳ"), j4).toString());
        }
        if (i0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ⅎ"));
        }
        while (i0Var.bufferField.size() < j4) {
            if (i0Var.source.w3(i0Var.bufferField, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void F(@l i0 i0Var, long j4) {
        l0.p(i0Var, ProtectedSandApp.s("ℴ"));
        if (!i0Var.h1(j4)) {
            throw new EOFException();
        }
    }

    public static final int G(@l i0 i0Var, @l d0 d0Var) {
        l0.p(i0Var, ProtectedSandApp.s("ℵ"));
        l0.p(d0Var, ProtectedSandApp.s("ℶ"));
        if (i0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ⅎ"));
        }
        do {
            int d02 = a.d0(i0Var.bufferField, d0Var, true);
            if (d02 != -2) {
                if (d02 == -1) {
                    return -1;
                }
                i0Var.bufferField.skip(d0Var.getByteStrings()[d02].q());
                return d02;
            }
        } while (i0Var.source.w3(i0Var.bufferField, 8192) != -1);
        return -1;
    }

    public static final void H(@l i0 i0Var, long j4) {
        l0.p(i0Var, ProtectedSandApp.s("ℷ"));
        if (i0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ⅎ"));
        }
        while (j4 > 0) {
            if (i0Var.bufferField.size() == 0 && i0Var.source.w3(i0Var.bufferField, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j4, i0Var.bufferField.size());
            i0Var.bufferField.skip(min);
            j4 -= min;
        }
    }

    @l
    public static final q0 I(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("ℸ"));
        return i0Var.source.getTimeout();
    }

    @l
    public static final String J(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("ℹ"));
        return ProtectedSandApp.s("℺") + i0Var.source + ')';
    }

    public static final void a(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("℻"));
        if (i0Var.closed) {
            return;
        }
        i0Var.closed = true;
        i0Var.source.close();
        i0Var.bufferField.d();
    }

    public static final boolean b(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("ℼ"));
        if (i0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ⅎ"));
        }
        return i0Var.bufferField.t2() && i0Var.source.w3(i0Var.bufferField, (long) 8192) == -1;
    }

    public static final long c(@l i0 i0Var, byte b5, long j4, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("ℽ"));
        if (i0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ⅎ"));
        }
        if (!(0 <= j4 && j5 >= j4)) {
            StringBuilder a5 = f0.a(ProtectedSandApp.s("ℾ"), j4, ProtectedSandApp.s("ℿ"));
            a5.append(j5);
            throw new IllegalArgumentException(a5.toString().toString());
        }
        while (j4 < j5) {
            long v02 = i0Var.bufferField.v0(b5, j4, j5);
            if (v02 == -1) {
                long size = i0Var.bufferField.size();
                if (size >= j5 || i0Var.source.w3(i0Var.bufferField, 8192) == -1) {
                    break;
                }
                j4 = Math.max(j4, size);
            } else {
                return v02;
            }
        }
        return -1L;
    }

    public static final long d(@l i0 i0Var, @l p pVar, long j4) {
        l0.p(i0Var, ProtectedSandApp.s("ℽ"));
        l0.p(pVar, ProtectedSandApp.s("⅀"));
        if (i0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ⅎ"));
        }
        while (true) {
            long V = i0Var.bufferField.V(pVar, j4);
            if (V != -1) {
                return V;
            }
            long size = i0Var.bufferField.size();
            if (i0Var.source.w3(i0Var.bufferField, 8192) == -1) {
                return -1L;
            }
            j4 = Math.max(j4, (size - pVar.q()) + 1);
        }
    }

    public static final long e(@l i0 i0Var, @l p pVar, long j4) {
        l0.p(i0Var, ProtectedSandApp.s("⅁"));
        l0.p(pVar, ProtectedSandApp.s("⅂"));
        if (i0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ⅎ"));
        }
        while (true) {
            long I1 = i0Var.bufferField.I1(pVar, j4);
            if (I1 != -1) {
                return I1;
            }
            long size = i0Var.bufferField.size();
            if (i0Var.source.w3(i0Var.bufferField, 8192) == -1) {
                return -1L;
            }
            j4 = Math.max(j4, size);
        }
    }

    @l
    public static final o f(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("⅃"));
        return a0.d(new okio.f0(i0Var));
    }

    public static final boolean g(@l i0 i0Var, long j4, @l p pVar, int i4, int i5) {
        l0.p(i0Var, ProtectedSandApp.s("⅄"));
        l0.p(pVar, ProtectedSandApp.s("⅀"));
        if (i0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ⅎ"));
        }
        if (j4 < 0 || i4 < 0 || i5 < 0 || pVar.q() - i4 < i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            long j5 = i6 + j4;
            if (!i0Var.h1(1 + j5) || i0Var.bufferField.z(j5) != pVar.G(i4 + i6)) {
                return false;
            }
        }
        return true;
    }

    public static final int h(@l i0 i0Var, @l byte[] bArr, int i4, int i5) {
        l0.p(i0Var, ProtectedSandApp.s("ⅅ"));
        l0.p(bArr, ProtectedSandApp.s("ⅆ"));
        long j4 = i5;
        j.e(bArr.length, i4, j4);
        if (i0Var.bufferField.size() == 0 && i0Var.source.w3(i0Var.bufferField, 8192) == -1) {
            return -1;
        }
        return i0Var.bufferField.read(bArr, i4, (int) Math.min(j4, i0Var.bufferField.size()));
    }

    public static final long i(@l i0 i0Var, @l m mVar, long j4) {
        l0.p(i0Var, ProtectedSandApp.s("ⅅ"));
        l0.p(mVar, ProtectedSandApp.s("ⅆ"));
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("ℳ"), j4).toString());
        }
        if (i0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("Ⅎ"));
        }
        if (i0Var.bufferField.size() == 0 && i0Var.source.w3(i0Var.bufferField, 8192) == -1) {
            return -1L;
        }
        return i0Var.bufferField.w3(mVar, Math.min(j4, i0Var.bufferField.size()));
    }

    public static final long j(@l i0 i0Var, @l m0 m0Var) {
        l0.p(i0Var, ProtectedSandApp.s("ⅇ"));
        l0.p(m0Var, ProtectedSandApp.s("ⅆ"));
        long j4 = 0;
        while (i0Var.source.w3(i0Var.bufferField, 8192) != -1) {
            long f4 = i0Var.bufferField.f();
            if (f4 > 0) {
                j4 += f4;
                m0Var.write(i0Var.bufferField, f4);
            }
        }
        if (i0Var.bufferField.size() <= 0) {
            return j4;
        }
        long size = j4 + i0Var.bufferField.size();
        m mVar = i0Var.bufferField;
        m0Var.write(mVar, mVar.size());
        return size;
    }

    public static final byte k(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("ⅈ"));
        i0Var.J1(1L);
        return i0Var.bufferField.readByte();
    }

    @l
    public static final byte[] l(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("ⅉ"));
        i0Var.bufferField.b1(i0Var.source);
        return i0Var.bufferField.p2();
    }

    @l
    public static final byte[] m(@l i0 i0Var, long j4) {
        l0.p(i0Var, ProtectedSandApp.s("ⅉ"));
        i0Var.J1(j4);
        return i0Var.bufferField.q1(j4);
    }

    @l
    public static final p n(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("⅊"));
        i0Var.bufferField.b1(i0Var.source);
        return i0Var.bufferField.b3();
    }

    @l
    public static final p o(@l i0 i0Var, long j4) {
        l0.p(i0Var, ProtectedSandApp.s("⅊"));
        i0Var.J1(j4);
        return i0Var.bufferField.b2(j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r0 = new java.lang.StringBuilder(com.flashget.parentalcontrol.ProtectedSandApp.s("⅌"));
        r1 = java.lang.Integer.toString(r8, kotlin.text.c.a(kotlin.text.c.a(16)));
        kotlin.jvm.internal.l0.o(r1, com.flashget.parentalcontrol.ProtectedSandApp.s("⅍"));
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long p(@fg.l okio.i0 r10) {
        /*
            java.lang.String r0 = "⅋"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r10, r0)
            r0 = 1
            r10.J1(r0)
            r2 = 0
            r4 = r2
        L11:
            long r6 = r4 + r0
            boolean r8 = r10.h1(r6)
            if (r8 == 0) goto L67
            okio.m r8 = r10.bufferField
            byte r8 = r8.z(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L29
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L33
        L29:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L35
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L33
            goto L35
        L33:
            r4 = r6
            goto L11
        L35:
            if (r4 == 0) goto L38
            goto L67
        L38:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "⅌"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            r1 = 16
            int r1 = kotlin.text.c.a(r1)
            int r1 = kotlin.text.c.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "⅍"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            kotlin.jvm.internal.l0.o(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L67:
            okio.m r10 = r10.bufferField
            long r0 = r10.y2()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.d.p(okio.i0):long");
    }

    public static final void q(@l i0 i0Var, @l m mVar, long j4) {
        l0.p(i0Var, ProtectedSandApp.s("ⅎ"));
        l0.p(mVar, ProtectedSandApp.s("ⅆ"));
        try {
            i0Var.J1(j4);
            i0Var.bufferField.t0(mVar, j4);
        } catch (EOFException e4) {
            mVar.b1(i0Var.bufferField);
            throw e4;
        }
    }

    public static final void r(@l i0 i0Var, @l byte[] bArr) {
        l0.p(i0Var, ProtectedSandApp.s("ⅎ"));
        l0.p(bArr, ProtectedSandApp.s("ⅆ"));
        try {
            i0Var.J1(bArr.length);
            i0Var.bufferField.readFully(bArr);
        } catch (EOFException e4) {
            int i4 = 0;
            while (i0Var.bufferField.size() > 0) {
                m mVar = i0Var.bufferField;
                int read = mVar.read(bArr, i4, (int) mVar.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i4 += read;
            }
            throw e4;
        }
    }

    public static final long s(@l i0 i0Var) {
        byte z4;
        l0.p(i0Var, ProtectedSandApp.s("⅏"));
        i0Var.J1(1L);
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            if (!i0Var.h1(i5)) {
                break;
            }
            z4 = i0Var.bufferField.z(i4);
            if ((z4 < ((byte) 48) || z4 > ((byte) 57)) && ((z4 < ((byte) 97) || z4 > ((byte) 102)) && (z4 < ((byte) 65) || z4 > ((byte) 70)))) {
                break;
            }
            i4 = i5;
        }
        if (i4 == 0) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⅐"));
            String num = Integer.toString(z4, kotlin.text.c.a(kotlin.text.c.a(16)));
            l0.o(num, ProtectedSandApp.s("⅍"));
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return i0Var.bufferField.H3();
    }

    public static final int t(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("⅑"));
        i0Var.J1(4L);
        return i0Var.bufferField.readInt();
    }

    public static final int u(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("⅒"));
        i0Var.J1(4L);
        return i0Var.bufferField.k3();
    }

    public static final long v(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("⅓"));
        i0Var.J1(8L);
        return i0Var.bufferField.readLong();
    }

    public static final long w(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("⅔"));
        i0Var.J1(8L);
        return i0Var.bufferField.z1();
    }

    public static final short x(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("⅕"));
        i0Var.J1(2L);
        return i0Var.bufferField.readShort();
    }

    public static final short y(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("⅖"));
        i0Var.J1(2L);
        return i0Var.bufferField.v1();
    }

    @l
    public static final String z(@l i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("℩"));
        i0Var.bufferField.b1(i0Var.source);
        return i0Var.bufferField.n3();
    }
}
