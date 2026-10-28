package v4;

import com.bumptech.glide.load.resource.bitmap.p0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.a0;
import okio.d0;
import okio.f0;
import okio.i0;
import okio.j;
import okio.m;
import okio.m0;
import okio.o;
import okio.p;
import okio.q0;

/* compiled from: RealBufferedSource.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0080\b\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\r\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0080\b\u001a\r\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0080\b\u001a\r\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u0016\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u0019\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\u0080\b\u001a\u001d\u0010\u001a\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u001c\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001bH\u0080\b\u001a\r\u0010\u001e\u001a\u00020\u001d*\u00020\u0000H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\u001d*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u000f\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\u0000H\u0080\b\u001a\u0015\u0010\"\u001a\u00020\u001d*\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0080\b\u001a\r\u0010#\u001a\u00020\u0012*\u00020\u0000H\u0080\b\u001a\r\u0010%\u001a\u00020$*\u00020\u0000H\u0080\b\u001a\r\u0010&\u001a\u00020$*\u00020\u0000H\u0080\b\u001a\r\u0010'\u001a\u00020\u0012*\u00020\u0000H\u0080\b\u001a\r\u0010(\u001a\u00020\u0012*\u00020\u0000H\u0080\b\u001a\r\u0010)\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010*\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010+\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\r\u0010,\u001a\u00020\u0003*\u00020\u0000H\u0080\b\u001a\u0015\u0010-\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a%\u00100\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0003H\u0080\b\u001a\u001d\u00102\u001a\u00020\u0003*\u00020\u00002\u0006\u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0003H\u0080\b\u001a\u001d\u00104\u001a\u00020\u0003*\u00020\u00002\u0006\u00103\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0003H\u0080\b\u001a-\u00106\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u00101\u001a\u00020\r2\u0006\u00105\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0012H\u0080\b\u001a\r\u00108\u001a\u000207*\u00020\u0000H\u0080\b\u001a\r\u00109\u001a\u00020\b*\u00020\u0000H\u0080\b\u001a\r\u0010;\u001a\u00020:*\u00020\u0000H\u0080\b\u001a\r\u0010<\u001a\u00020\u001d*\u00020\u0000H\u0080\b¨\u0006="}, d2 = {"Lokio/i0;", "Lokio/m;", "sink", "", "byteCount", "i", "", "b", "Lkotlin/m2;", "F", "E", "", "k", "Lokio/p;", "n", "o", "Lokio/d0;", "options", "", "G", "", "l", "m", "r", "offset", "h", "q", "Lokio/m0;", "j", "", "z", "A", "C", "limit", "D", "B", "", "x", "y", "t", "u", "v", "w", "p", "s", "H", "fromIndex", "toIndex", "c", "bytes", "d", "targetBytes", "e", "bytesOffset", "g", "Lokio/o;", "f", "a", "Lokio/q0;", "I", "J", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class d {
    @d5.d
    public static final String A(@d5.d i0 i0Var, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("櫛"));
        i0Var.h1(j5);
        return i0Var.bufferField.q(j5);
    }

    public static final int B(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("櫜"));
        i0Var.h1(1L);
        byte b02 = i0Var.bufferField.b0(0L);
        if ((b02 & 224) == 192) {
            i0Var.h1(2L);
        } else if ((b02 & 240) == 224) {
            i0Var.h1(3L);
        } else if ((b02 & 248) == 240) {
            i0Var.h1(4L);
        }
        return i0Var.bufferField.s0();
    }

    @d5.e
    public static final String C(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("櫝"));
        long l12 = i0Var.l1((byte) 10);
        if (l12 != -1) {
            return a.b0(i0Var.bufferField, l12);
        }
        if (i0Var.bufferField.size() != 0) {
            return i0Var.q(i0Var.bufferField.size());
        }
        return null;
    }

    @d5.d
    public static final String D(@d5.d i0 i0Var, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("櫞"));
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("櫢"), j5).toString());
        }
        long j6 = j5 == Long.MAX_VALUE ? Long.MAX_VALUE : j5 + 1;
        byte b6 = (byte) 10;
        long T = i0Var.T(b6, 0L, j6);
        if (T != -1) {
            return a.b0(i0Var.bufferField, T);
        }
        if (j6 < Long.MAX_VALUE && i0Var.C0(j6) && i0Var.bufferField.b0(j6 - 1) == ((byte) 13) && i0Var.C0(1 + j6) && i0Var.bufferField.b0(j6) == b6) {
            return a.b0(i0Var.bufferField, j6);
        }
        m mVar = new m();
        m mVar2 = i0Var.bufferField;
        mVar2.o(mVar, 0L, Math.min(32, mVar2.size()));
        throw new EOFException(ProtectedSandApp.s("櫟") + Math.min(i0Var.bufferField.size(), j5) + ProtectedSandApp.s("櫠") + mVar.x0().C() + ProtectedSandApp.s("櫡"));
    }

    public static final boolean E(@d5.d i0 i0Var, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("櫣"));
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("櫥"), j5).toString());
        }
        if (!(!i0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫤").toString());
        }
        while (i0Var.bufferField.size() < j5) {
            if (i0Var.source.X0(i0Var.bufferField, 8192) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void F(@d5.d i0 i0Var, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("櫦"));
        if (!i0Var.C0(j5)) {
            throw new EOFException();
        }
    }

    public static final int G(@d5.d i0 i0Var, @d5.d d0 d0Var) {
        l0.p(i0Var, ProtectedSandApp.s("櫧"));
        l0.p(d0Var, ProtectedSandApp.s("櫨"));
        if (!(!i0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫩").toString());
        }
        do {
            int d02 = a.d0(i0Var.bufferField, d0Var, true);
            if (d02 != -2) {
                if (d02 == -1) {
                    return -1;
                }
                i0Var.bufferField.skip(d0Var.getByteStrings()[d02].i0());
                return d02;
            }
        } while (i0Var.source.X0(i0Var.bufferField, 8192) != -1);
        return -1;
    }

    public static final void H(@d5.d i0 i0Var, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("櫪"));
        if (!(!i0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫫").toString());
        }
        while (j5 > 0) {
            if (i0Var.bufferField.size() == 0 && i0Var.source.X0(i0Var.bufferField, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j5, i0Var.bufferField.size());
            i0Var.bufferField.skip(min);
            j5 -= min;
        }
    }

    @d5.d
    public static final q0 I(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("櫬"));
        return i0Var.source.getTimeout();
    }

    @d5.d
    public static final String J(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("櫭"));
        return ProtectedSandApp.s("櫮") + i0Var.source + ')';
    }

    public static final void a(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("櫯"));
        if (i0Var.closed) {
            return;
        }
        i0Var.closed = true;
        i0Var.source.close();
        i0Var.bufferField.c();
    }

    public static final boolean b(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("櫰"));
        if (!i0Var.closed) {
            return i0Var.bufferField.M() && i0Var.source.X0(i0Var.bufferField, (long) 8192) == -1;
        }
        throw new IllegalStateException(ProtectedSandApp.s("櫱").toString());
    }

    public static final long c(@d5.d i0 i0Var, byte b6, long j5, long j6) {
        l0.p(i0Var, ProtectedSandApp.s("櫲"));
        if (!(!i0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫵").toString());
        }
        if (!(0 <= j5 && j6 >= j5)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("櫳") + j5 + ProtectedSandApp.s("櫴") + j6).toString());
        }
        while (j5 < j6) {
            long T = i0Var.bufferField.T(b6, j5, j6);
            if (T == -1) {
                long size = i0Var.bufferField.size();
                if (size >= j6 || i0Var.source.X0(i0Var.bufferField, 8192) == -1) {
                    break;
                }
                j5 = Math.max(j5, size);
            } else {
                return T;
            }
        }
        return -1L;
    }

    public static final long d(@d5.d i0 i0Var, @d5.d p pVar, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("櫶"));
        l0.p(pVar, ProtectedSandApp.s("櫷"));
        if (!(!i0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫸").toString());
        }
        while (true) {
            long u5 = i0Var.bufferField.u(pVar, j5);
            if (u5 != -1) {
                return u5;
            }
            long size = i0Var.bufferField.size();
            if (i0Var.source.X0(i0Var.bufferField, 8192) == -1) {
                return -1L;
            }
            j5 = Math.max(j5, (size - pVar.i0()) + 1);
        }
    }

    public static final long e(@d5.d i0 i0Var, @d5.d p pVar, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("櫹"));
        l0.p(pVar, ProtectedSandApp.s("櫺"));
        if (!(!i0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫻").toString());
        }
        while (true) {
            long e12 = i0Var.bufferField.e1(pVar, j5);
            if (e12 != -1) {
                return e12;
            }
            long size = i0Var.bufferField.size();
            if (i0Var.source.X0(i0Var.bufferField, 8192) == -1) {
                return -1L;
            }
            j5 = Math.max(j5, size);
        }
    }

    @d5.d
    public static final o f(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("櫼"));
        return a0.d(new f0(i0Var));
    }

    public static final boolean g(@d5.d i0 i0Var, long j5, @d5.d p pVar, int i5, int i6) {
        l0.p(i0Var, ProtectedSandApp.s("櫽"));
        l0.p(pVar, ProtectedSandApp.s("櫾"));
        if (!(!i0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫿").toString());
        }
        if (j5 < 0 || i5 < 0 || i6 < 0 || pVar.i0() - i5 < i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            long j6 = i7 + j5;
            if (!i0Var.C0(1 + j6) || i0Var.bufferField.b0(j6) != pVar.x(i5 + i7)) {
                return false;
            }
        }
        return true;
    }

    public static final int h(@d5.d i0 i0Var, @d5.d byte[] bArr, int i5, int i6) {
        l0.p(i0Var, ProtectedSandApp.s("欀"));
        l0.p(bArr, ProtectedSandApp.s("欁"));
        long j5 = i6;
        j.e(bArr.length, i5, j5);
        if (i0Var.bufferField.size() == 0 && i0Var.source.X0(i0Var.bufferField, 8192) == -1) {
            return -1;
        }
        return i0Var.bufferField.read(bArr, i5, (int) Math.min(j5, i0Var.bufferField.size()));
    }

    public static final long i(@d5.d i0 i0Var, @d5.d m mVar, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("欂"));
        l0.p(mVar, ProtectedSandApp.s("欃"));
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("欅"), j5).toString());
        }
        if (!(!i0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("欄").toString());
        }
        if (i0Var.bufferField.size() == 0 && i0Var.source.X0(i0Var.bufferField, 8192) == -1) {
            return -1L;
        }
        return i0Var.bufferField.X0(mVar, Math.min(j5, i0Var.bufferField.size()));
    }

    public static final long j(@d5.d i0 i0Var, @d5.d m0 m0Var) {
        l0.p(i0Var, ProtectedSandApp.s("欆"));
        l0.p(m0Var, ProtectedSandApp.s("欇"));
        long j5 = 0;
        while (i0Var.source.X0(i0Var.bufferField, 8192) != -1) {
            long e6 = i0Var.bufferField.e();
            if (e6 > 0) {
                j5 += e6;
                m0Var.t0(i0Var.bufferField, e6);
            }
        }
        if (i0Var.bufferField.size() <= 0) {
            return j5;
        }
        long size = j5 + i0Var.bufferField.size();
        m mVar = i0Var.bufferField;
        m0Var.t0(mVar, mVar.size());
        return size;
    }

    public static final byte k(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("欈"));
        i0Var.h1(1L);
        return i0Var.bufferField.readByte();
    }

    @d5.d
    public static final byte[] l(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("欉"));
        i0Var.bufferField.v0(i0Var.source);
        return i0Var.bufferField.I();
    }

    @d5.d
    public static final byte[] m(@d5.d i0 i0Var, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("權"));
        i0Var.h1(j5);
        return i0Var.bufferField.K0(j5);
    }

    @d5.d
    public static final p n(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("欋"));
        i0Var.bufferField.v0(i0Var.source);
        return i0Var.bufferField.x0();
    }

    @d5.d
    public static final p o(@d5.d i0 i0Var, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("欌"));
        i0Var.h1(j5);
        return i0Var.bufferField.v(j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r0 = new java.lang.StringBuilder(com.flashget.kidsdownloader.ProtectedSandApp.s("欎"));
        r1 = kotlin.text.d.a(16);
        r1 = kotlin.text.d.a(r1);
        r1 = java.lang.Integer.toString(r8, r1);
        kotlin.jvm.internal.l0.o(r1, com.flashget.kidsdownloader.ProtectedSandApp.s("欏"));
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long p(@d5.d okio.i0 r10) {
        /*
            java.lang.String r0 = "欍"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r10, r0)
            r0 = 1
            r10.h1(r0)
            r2 = 0
            r4 = r2
        L11:
            long r6 = r4 + r0
            boolean r8 = r10.C0(r6)
            if (r8 == 0) goto L67
            okio.m r8 = r10.bufferField
            byte r8 = r8.b0(r4)
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
            java.lang.String r1 = "欎"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            r0.<init>(r1)
            r1 = 16
            int r1 = kotlin.text.c.a(r1)
            int r1 = kotlin.text.c.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "欏"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            kotlin.jvm.internal.l0.o(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L67:
            okio.m r10 = r10.bufferField
            long r0 = r10.a0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.d.p(okio.i0):long");
    }

    public static final void q(@d5.d i0 i0Var, @d5.d m mVar, long j5) {
        l0.p(i0Var, ProtectedSandApp.s("欐"));
        l0.p(mVar, ProtectedSandApp.s("欑"));
        try {
            i0Var.h1(j5);
            i0Var.bufferField.S(mVar, j5);
        } catch (EOFException e6) {
            mVar.v0(i0Var.bufferField);
            throw e6;
        }
    }

    public static final void r(@d5.d i0 i0Var, @d5.d byte[] bArr) {
        l0.p(i0Var, ProtectedSandApp.s("欒"));
        l0.p(bArr, ProtectedSandApp.s("欓"));
        try {
            i0Var.h1(bArr.length);
            i0Var.bufferField.readFully(bArr);
        } catch (EOFException e6) {
            int i5 = 0;
            while (i0Var.bufferField.size() > 0) {
                m mVar = i0Var.bufferField;
                int read = mVar.read(bArr, i5, (int) mVar.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i5 += read;
            }
            throw e6;
        }
    }

    public static final long s(@d5.d i0 i0Var) {
        byte b02;
        int a6;
        int a7;
        l0.p(i0Var, ProtectedSandApp.s("欔"));
        i0Var.h1(1L);
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            if (!i0Var.C0(i6)) {
                break;
            }
            b02 = i0Var.bufferField.b0(i5);
            if ((b02 < ((byte) 48) || b02 > ((byte) 57)) && ((b02 < ((byte) 97) || b02 > ((byte) 102)) && (b02 < ((byte) 65) || b02 > ((byte) 70)))) {
                break;
            }
            i5 = i6;
        }
        if (i5 == 0) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("欕"));
            a6 = kotlin.text.d.a(16);
            a7 = kotlin.text.d.a(a6);
            String num = Integer.toString(b02, a7);
            l0.o(num, ProtectedSandApp.s("欖"));
            sb.append(num);
            throw new NumberFormatException(sb.toString());
        }
        return i0Var.bufferField.o1();
    }

    public static final int t(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("欗"));
        i0Var.h1(4L);
        return i0Var.bufferField.readInt();
    }

    public static final int u(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("欘"));
        i0Var.h1(4L);
        return i0Var.bufferField.H0();
    }

    public static final long v(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("欙"));
        i0Var.h1(8L);
        return i0Var.bufferField.readLong();
    }

    public static final long w(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("欚"));
        i0Var.h1(8L);
        return i0Var.bufferField.Y0();
    }

    public static final short x(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("欛"));
        i0Var.h1(2L);
        return i0Var.bufferField.readShort();
    }

    public static final short y(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("欜"));
        i0Var.h1(2L);
        return i0Var.bufferField.V0();
    }

    @d5.d
    public static final String z(@d5.d i0 i0Var) {
        l0.p(i0Var, ProtectedSandApp.s("欝"));
        i0Var.bufferField.v0(i0Var.source);
        return i0Var.bufferField.L0();
    }
}
