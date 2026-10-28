package v4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import okio.h0;
import okio.m;
import okio.m0;
import okio.n;
import okio.o0;
import okio.p;
import okio.q0;

/* compiled from: RealBufferedSink.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0080\b\u001a%\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u0010\u001a\u00020\t*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0080\b\u001a%\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u0015\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u0017\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0016H\u0080\b\u001a%\u0010\u0018\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0019H\u0080\b\u001a\u001d\u0010\u001b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010 \u001a\u00020\t*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010!\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\"\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\t*\u00020\u00002\u0006\u0010 \u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010#\u001a\u00020\t*\u00020\u00002\u0006\u0010 \u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010$\u001a\u00020\t*\u00020\u00002\u0006\u0010 \u001a\u00020\u0003H\u0080\b\u001a\u0015\u0010%\u001a\u00020\t*\u00020\u00002\u0006\u0010 \u001a\u00020\u0003H\u0080\b\u001a\r\u0010&\u001a\u00020\t*\u00020\u0000H\u0080\b\u001a\r\u0010\u001c\u001a\u00020\t*\u00020\u0000H\u0080\b\u001a\r\u0010'\u001a\u00020\u0005*\u00020\u0000H\u0080\b\u001a\r\u0010(\u001a\u00020\u0005*\u00020\u0000H\u0080\b\u001a\r\u0010*\u001a\u00020)*\u00020\u0000H\u0080\b\u001a\r\u0010+\u001a\u00020\u000e*\u00020\u0000H\u0080\b¨\u0006,"}, d2 = {"Lokio/h0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/m2;", "l", "Lokio/p;", "byteString", "Lokio/n;", "g", "", "offset", "h", "", "string", "w", "beginIndex", "endIndex", "x", "codePoint", "y", "", "j", "k", "Lokio/o0;", "m", "i", "b", "n", "s", "u", "v", "q", "r", "t", "o", "p", "c", "d", "a", "Lokio/q0;", "e", "f", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class c {
    public static final void a(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("檤"));
        if (h0Var.closed) {
            return;
        }
        try {
            if (h0Var.bufferField.size() > 0) {
                m0 m0Var = h0Var.sink;
                m mVar = h0Var.bufferField;
                m0Var.t0(mVar, mVar.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            h0Var.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        h0Var.closed = true;
        if (th != null) {
            throw th;
        }
    }

    @d5.d
    public static final n b(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("檥"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("檦").toString());
        }
        long size = h0Var.bufferField.size();
        if (size > 0) {
            h0Var.sink.t0(h0Var.bufferField, size);
        }
        return h0Var;
    }

    @d5.d
    public static final n c(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("檧"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("檨").toString());
        }
        long e6 = h0Var.bufferField.e();
        if (e6 > 0) {
            h0Var.sink.t0(h0Var.bufferField, e6);
        }
        return h0Var;
    }

    public static final void d(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("檩"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("檪").toString());
        }
        if (h0Var.bufferField.size() > 0) {
            m0 m0Var = h0Var.sink;
            m mVar = h0Var.bufferField;
            m0Var.t0(mVar, mVar.size());
        }
        h0Var.sink.flush();
    }

    @d5.d
    public static final q0 e(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("檫"));
        return h0Var.sink.getTimeout();
    }

    @d5.d
    public static final String f(@d5.d h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("檬"));
        return ProtectedSandApp.s("檭") + h0Var.sink + ')';
    }

    @d5.d
    public static final n g(@d5.d h0 h0Var, @d5.d p pVar) {
        l0.p(h0Var, ProtectedSandApp.s("檮"));
        l0.p(pVar, ProtectedSandApp.s("檯"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("檰").toString());
        }
        h0Var.bufferField.S0(pVar);
        return h0Var.Y();
    }

    @d5.d
    public static final n h(@d5.d h0 h0Var, @d5.d p pVar, int i5, int i6) {
        l0.p(h0Var, ProtectedSandApp.s("檱"));
        l0.p(pVar, ProtectedSandApp.s("檲"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("檳").toString());
        }
        h0Var.bufferField.A(pVar, i5, i6);
        return h0Var.Y();
    }

    @d5.d
    public static final n i(@d5.d h0 h0Var, @d5.d o0 o0Var, long j5) {
        l0.p(h0Var, ProtectedSandApp.s("檴"));
        l0.p(o0Var, ProtectedSandApp.s("檵"));
        while (j5 > 0) {
            long X0 = o0Var.X0(h0Var.bufferField, j5);
            if (X0 == -1) {
                throw new EOFException();
            }
            j5 -= X0;
            h0Var.Y();
        }
        return h0Var;
    }

    @d5.d
    public static final n j(@d5.d h0 h0Var, @d5.d byte[] bArr) {
        l0.p(h0Var, ProtectedSandApp.s("檶"));
        l0.p(bArr, ProtectedSandApp.s("檷"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("檸").toString());
        }
        h0Var.bufferField.write(bArr);
        return h0Var.Y();
    }

    @d5.d
    public static final n k(@d5.d h0 h0Var, @d5.d byte[] bArr, int i5, int i6) {
        l0.p(h0Var, ProtectedSandApp.s("檹"));
        l0.p(bArr, ProtectedSandApp.s("檺"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("檻").toString());
        }
        h0Var.bufferField.write(bArr, i5, i6);
        return h0Var.Y();
    }

    public static final void l(@d5.d h0 h0Var, @d5.d m mVar, long j5) {
        l0.p(h0Var, ProtectedSandApp.s("檼"));
        l0.p(mVar, ProtectedSandApp.s("檽"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("檾").toString());
        }
        h0Var.bufferField.t0(mVar, j5);
        h0Var.Y();
    }

    public static final long m(@d5.d h0 h0Var, @d5.d o0 o0Var) {
        l0.p(h0Var, ProtectedSandApp.s("檿"));
        l0.p(o0Var, ProtectedSandApp.s("櫀"));
        long j5 = 0;
        while (true) {
            long X0 = o0Var.X0(h0Var.bufferField, 8192);
            if (X0 == -1) {
                return j5;
            }
            j5 += X0;
            h0Var.Y();
        }
    }

    @d5.d
    public static final n n(@d5.d h0 h0Var, int i5) {
        l0.p(h0Var, ProtectedSandApp.s("櫁"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫂").toString());
        }
        h0Var.bufferField.writeByte(i5);
        return h0Var.Y();
    }

    @d5.d
    public static final n o(@d5.d h0 h0Var, long j5) {
        l0.p(h0Var, ProtectedSandApp.s("櫃"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫄").toString());
        }
        h0Var.bufferField.j1(j5);
        return h0Var.Y();
    }

    @d5.d
    public static final n p(@d5.d h0 h0Var, long j5) {
        l0.p(h0Var, ProtectedSandApp.s("櫅"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫆").toString());
        }
        h0Var.bufferField.w0(j5);
        return h0Var.Y();
    }

    @d5.d
    public static final n q(@d5.d h0 h0Var, int i5) {
        l0.p(h0Var, ProtectedSandApp.s("櫇"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫈").toString());
        }
        h0Var.bufferField.writeInt(i5);
        return h0Var.Y();
    }

    @d5.d
    public static final n r(@d5.d h0 h0Var, int i5) {
        l0.p(h0Var, ProtectedSandApp.s("櫉"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫊").toString());
        }
        h0Var.bufferField.L(i5);
        return h0Var.Y();
    }

    @d5.d
    public static final n s(@d5.d h0 h0Var, long j5) {
        l0.p(h0Var, ProtectedSandApp.s("櫋"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫌").toString());
        }
        h0Var.bufferField.writeLong(j5);
        return h0Var.Y();
    }

    @d5.d
    public static final n t(@d5.d h0 h0Var, long j5) {
        l0.p(h0Var, ProtectedSandApp.s("櫍"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫎").toString());
        }
        h0Var.bufferField.E(j5);
        return h0Var.Y();
    }

    @d5.d
    public static final n u(@d5.d h0 h0Var, int i5) {
        l0.p(h0Var, ProtectedSandApp.s("櫏"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫐").toString());
        }
        h0Var.bufferField.writeShort(i5);
        return h0Var.Y();
    }

    @d5.d
    public static final n v(@d5.d h0 h0Var, int i5) {
        l0.p(h0Var, ProtectedSandApp.s("櫑"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫒").toString());
        }
        h0Var.bufferField.h0(i5);
        return h0Var.Y();
    }

    @d5.d
    public static final n w(@d5.d h0 h0Var, @d5.d String str) {
        l0.p(h0Var, ProtectedSandApp.s("櫓"));
        l0.p(str, ProtectedSandApp.s("櫔"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫕").toString());
        }
        h0Var.bufferField.j0(str);
        return h0Var.Y();
    }

    @d5.d
    public static final n x(@d5.d h0 h0Var, @d5.d String str, int i5, int i6) {
        l0.p(h0Var, ProtectedSandApp.s("櫖"));
        l0.p(str, ProtectedSandApp.s("櫗"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫘").toString());
        }
        h0Var.bufferField.u0(str, i5, i6);
        return h0Var.Y();
    }

    @d5.d
    public static final n y(@d5.d h0 h0Var, int i5) {
        l0.p(h0Var, ProtectedSandApp.s("櫙"));
        if (!(!h0Var.closed)) {
            throw new IllegalStateException(ProtectedSandApp.s("櫚").toString());
        }
        h0Var.bufferField.y(i5);
        return h0Var.Y();
    }
}
