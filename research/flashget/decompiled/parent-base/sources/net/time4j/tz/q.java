package net.time4j.tz;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: ZonalTransition.java */
/* loaded from: classes7.dex */
public final class q implements Comparable<q>, Serializable {
    private static final long serialVersionUID = 4594838367057225304L;
    private final int dst;
    private final long posix;
    private final int previous;
    private final int total;

    public q(long j4, int i4, int i5, int i6) {
        this.posix = j4;
        this.previous = i4;
        this.total = i5;
        this.dst = i6;
        b(i4);
        b(i5);
        a(i6);
    }

    private static void a(int i4) {
        if (i4 != Integer.MAX_VALUE) {
            b(i4);
        }
    }

    private static void b(int i4) {
        if (i4 < -64800 || i4 > 64800) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鶬\u0001"), i4));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        try {
            b(this.previous);
            b(this.total);
            a(this.dst);
        } catch (IllegalArgumentException e4) {
            throw new InvalidObjectException(e4.getMessage());
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(q qVar) {
        long j4 = this.posix - qVar.posix;
        if (j4 == 0) {
            j4 = this.previous - qVar.previous;
            if (j4 == 0) {
                j4 = this.total - qVar.total;
                if (j4 == 0) {
                    j4 = d() - qVar.d();
                    if (j4 == 0) {
                        return 0;
                    }
                }
            }
        }
        return j4 < 0 ? -1 : 1;
    }

    public int d() {
        int i4 = this.dst;
        if (i4 == Integer.MAX_VALUE) {
            return 0;
        }
        return i4;
    }

    public long e() {
        return this.posix;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.posix == qVar.posix && this.previous == qVar.previous && this.total == qVar.total && d() == qVar.d();
    }

    public int f() {
        return this.previous;
    }

    public int g() {
        return this.total - this.previous;
    }

    public int h() {
        return this.total - d();
    }

    public int hashCode() {
        long j4 = this.posix;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public int i() {
        return this.total;
    }

    public boolean j() {
        return this.total > this.previous;
    }

    public boolean k() {
        return this.total < this.previous;
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(128, ProtectedSandApp.s("鶭\u0001"));
        a5.append(this.posix);
        a5.append(ProtectedSandApp.s("鶮\u0001"));
        a5.append(this.previous);
        a5.append(ProtectedSandApp.s("鶯\u0001"));
        a5.append(this.total);
        a5.append(ProtectedSandApp.s("鶰\u0001"));
        a5.append(d());
        a5.append(']');
        return a5.toString();
    }
}
