package ve;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001c\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\u000f\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0080\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0013\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a,\u0010\u0017\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u001a\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\rH\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001d\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001cH\u0080\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a,\u0010\u001f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010\"\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020!H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a$\u0010$\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b$\u0010%\u001a\u001c\u0010'\u001a\u00020\n*\u00020\u00002\u0006\u0010&\u001a\u00020\rH\u0080\b¢\u0006\u0004\b'\u0010\u001b\u001a\u001c\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\rH\u0080\b¢\u0006\u0004\b)\u0010\u001b\u001a\u001c\u0010*\u001a\u00020\n*\u00020\u00002\u0006\u0010(\u001a\u00020\rH\u0080\b¢\u0006\u0004\b*\u0010\u001b\u001a\u001c\u0010+\u001a\u00020\n*\u00020\u00002\u0006\u0010$\u001a\u00020\rH\u0080\b¢\u0006\u0004\b+\u0010\u001b\u001a\u001c\u0010,\u001a\u00020\n*\u00020\u00002\u0006\u0010$\u001a\u00020\rH\u0080\b¢\u0006\u0004\b,\u0010\u001b\u001a\u001c\u0010(\u001a\u00020\n*\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b(\u0010-\u001a\u001c\u0010.\u001a\u00020\n*\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b.\u0010-\u001a\u001c\u0010/\u001a\u00020\n*\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b/\u0010-\u001a\u001c\u00100\u001a\u00020\n*\u00020\u00002\u0006\u0010*\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b0\u0010-\u001a\u0014\u00101\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b1\u00102\u001a\u0014\u0010&\u001a\u00020\n*\u00020\u0000H\u0080\b¢\u0006\u0004\b&\u00102\u001a\u0014\u00103\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b3\u00104\u001a\u0014\u00105\u001a\u00020\u0005*\u00020\u0000H\u0080\b¢\u0006\u0004\b5\u00104\u001a\u0014\u00107\u001a\u000206*\u00020\u0000H\u0080\b¢\u0006\u0004\b7\u00108\u001a\u0014\u00109\u001a\u00020\u0011*\u00020\u0000H\u0080\b¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lokio/h0;", "Lokio/m;", "source", "", "byteCount", "Lkotlin/k2;", "l", "(Lokio/h0;Lokio/m;J)V", "Lokio/p;", "byteString", "Lokio/n;", "g", "(Lokio/h0;Lokio/p;)Lokio/n;", "", "offset", "h", "(Lokio/h0;Lokio/p;II)Lokio/n;", "", "string", "w", "(Lokio/h0;Ljava/lang/String;)Lokio/n;", "beginIndex", "endIndex", "x", "(Lokio/h0;Ljava/lang/String;II)Lokio/n;", "codePoint", "y", "(Lokio/h0;I)Lokio/n;", "", "j", "(Lokio/h0;[B)Lokio/n;", "k", "(Lokio/h0;[BII)Lokio/n;", "Lokio/o0;", "m", "(Lokio/h0;Lokio/o0;)J", "i", "(Lokio/h0;Lokio/o0;J)Lokio/n;", "b", "n", "s", "u", "v", "q", "r", "(Lokio/h0;J)Lokio/n;", "t", "o", "p", "c", "(Lokio/h0;)Lokio/n;", "d", "(Lokio/h0;)V", "a", "Lokio/q0;", "e", "(Lokio/h0;)Lokio/q0;", "f", "(Lokio/h0;)Ljava/lang/String;", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class c {
    public static final void a(@l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("ℑ"));
        if (h0Var.closed) {
            return;
        }
        try {
            if (h0Var.bufferField.size() > 0) {
                m0 m0Var = h0Var.sink;
                m mVar = h0Var.bufferField;
                m0Var.write(mVar, mVar.size());
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

    @l
    public static final n b(@l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("ℒ"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        long size = h0Var.bufferField.size();
        if (size > 0) {
            h0Var.sink.write(h0Var.bufferField, size);
        }
        return h0Var;
    }

    @l
    public static final n c(@l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("℔"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        long f4 = h0Var.bufferField.f();
        if (f4 > 0) {
            h0Var.sink.write(h0Var.bufferField, f4);
        }
        return h0Var;
    }

    public static final void d(@l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("ℕ"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        if (h0Var.bufferField.size() > 0) {
            m0 m0Var = h0Var.sink;
            m mVar = h0Var.bufferField;
            m0Var.write(mVar, mVar.size());
        }
        h0Var.sink.flush();
    }

    @l
    public static final q0 e(@l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("№"));
        return h0Var.sink.getTimeout();
    }

    @l
    public static final String f(@l h0 h0Var) {
        l0.p(h0Var, ProtectedSandApp.s("℗"));
        return ProtectedSandApp.s("℘") + h0Var.sink + ')';
    }

    @l
    public static final n g(@l h0 h0Var, @l p pVar) {
        l0.p(h0Var, ProtectedSandApp.s("ℙ"));
        l0.p(pVar, ProtectedSandApp.s("ℚ"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.t3(pVar);
        return h0Var.y0();
    }

    @l
    public static final n h(@l h0 h0Var, @l p pVar, int i4, int i5) {
        l0.p(h0Var, ProtectedSandApp.s("ℙ"));
        l0.p(pVar, ProtectedSandApp.s("ℚ"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.h2(pVar, i4, i5);
        return h0Var.y0();
    }

    @l
    public static final n i(@l h0 h0Var, @l o0 o0Var, long j4) {
        l0.p(h0Var, ProtectedSandApp.s("ℙ"));
        l0.p(o0Var, ProtectedSandApp.s("ℛ"));
        while (j4 > 0) {
            long w32 = o0Var.w3(h0Var.bufferField, j4);
            if (w32 == -1) {
                throw new EOFException();
            }
            j4 -= w32;
            h0Var.y0();
        }
        return h0Var;
    }

    @l
    public static final n j(@l h0 h0Var, @l byte[] bArr) {
        l0.p(h0Var, ProtectedSandApp.s("ℙ"));
        l0.p(bArr, ProtectedSandApp.s("ℛ"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.write(bArr);
        return h0Var.y0();
    }

    @l
    public static final n k(@l h0 h0Var, @l byte[] bArr, int i4, int i5) {
        l0.p(h0Var, ProtectedSandApp.s("ℙ"));
        l0.p(bArr, ProtectedSandApp.s("ℛ"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.write(bArr, i4, i5);
        return h0Var.y0();
    }

    public static final void l(@l h0 h0Var, @l m mVar, long j4) {
        l0.p(h0Var, ProtectedSandApp.s("ℙ"));
        l0.p(mVar, ProtectedSandApp.s("ℛ"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.write(mVar, j4);
        h0Var.y0();
    }

    public static final long m(@l h0 h0Var, @l o0 o0Var) {
        l0.p(h0Var, ProtectedSandApp.s("ℜ"));
        l0.p(o0Var, ProtectedSandApp.s("ℛ"));
        long j4 = 0;
        while (true) {
            long w32 = o0Var.w3(h0Var.bufferField, 8192);
            if (w32 == -1) {
                return j4;
            }
            j4 += w32;
            h0Var.y0();
        }
    }

    @l
    public static final n n(@l h0 h0Var, int i4) {
        l0.p(h0Var, ProtectedSandApp.s("ℝ"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.writeByte(i4);
        return h0Var.y0();
    }

    @l
    public static final n o(@l h0 h0Var, long j4) {
        l0.p(h0Var, ProtectedSandApp.s("℞"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.N1(j4);
        return h0Var.y0();
    }

    @l
    public static final n p(@l h0 h0Var, long j4) {
        l0.p(h0Var, ProtectedSandApp.s("℟"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.a3(j4);
        return h0Var.y0();
    }

    @l
    public static final n q(@l h0 h0Var, int i4) {
        l0.p(h0Var, ProtectedSandApp.s("℠"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.writeInt(i4);
        return h0Var.y0();
    }

    @l
    public static final n r(@l h0 h0Var, int i4) {
        l0.p(h0Var, ProtectedSandApp.s("℡"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.s2(i4);
        return h0Var.y0();
    }

    @l
    public static final n s(@l h0 h0Var, long j4) {
        l0.p(h0Var, ProtectedSandApp.s("™"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.writeLong(j4);
        return h0Var.y0();
    }

    @l
    public static final n t(@l h0 h0Var, long j4) {
        l0.p(h0Var, ProtectedSandApp.s("℣"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.i0(j4);
        return h0Var.y0();
    }

    @l
    public static final n u(@l h0 h0Var, int i4) {
        l0.p(h0Var, ProtectedSandApp.s("ℤ"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.writeShort(i4);
        return h0Var.y0();
    }

    @l
    public static final n v(@l h0 h0Var, int i4) {
        l0.p(h0Var, ProtectedSandApp.s("℥"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.J2(i4);
        return h0Var.y0();
    }

    @l
    public static final n w(@l h0 h0Var, @l String str) {
        l0.p(h0Var, ProtectedSandApp.s("Ω"));
        l0.p(str, ProtectedSandApp.s("℧"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.Q0(str);
        return h0Var.y0();
    }

    @l
    public static final n x(@l h0 h0Var, @l String str, int i4, int i5) {
        l0.p(h0Var, ProtectedSandApp.s("Ω"));
        l0.p(str, ProtectedSandApp.s("℧"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.a1(str, i4, i5);
        return h0Var.y0();
    }

    @l
    public static final n y(@l h0 h0Var, int i4) {
        l0.p(h0Var, ProtectedSandApp.s("ℨ"));
        if (h0Var.closed) {
            throw new IllegalStateException(ProtectedSandApp.s("ℓ"));
        }
        h0Var.bufferField.f0(i4);
        return h0Var.y0();
    }
}
