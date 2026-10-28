package net.time4j;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* compiled from: OldApiTimezone.java */
/* loaded from: classes7.dex */
final class i0 extends TimeZone {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f83242b = false;
    private static final long serialVersionUID = -6919910650419401271L;
    private final net.time4j.tz.l tz;

    i0(net.time4j.tz.l lVar) {
        this.tz = lVar;
        setID(lVar.G().canonical());
    }

    net.time4j.tz.l b() {
        return this.tz;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i0) {
            return this.tz.equals(((i0) obj).tz);
        }
        return false;
    }

    @Override // java.util.TimeZone
    public int getDSTSavings() {
        int i4;
        net.time4j.tz.m F = this.tz.F();
        if (F != null) {
            List<net.time4j.tz.q> b5 = F.b();
            i4 = Integer.MIN_VALUE;
            for (int size = b5.size() - 1; size >= 0; size--) {
                int d5 = b5.get(size).d();
                if (i4 == Integer.MIN_VALUE) {
                    i4 = d5;
                } else if (i4 != d5) {
                    return Math.max(i4, d5) * 1000;
                }
            }
        } else {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 == Integer.MIN_VALUE) {
            return 0;
        }
        return i4 * 1000;
    }

    @Override // java.util.TimeZone
    public int getOffset(long j4) {
        return this.tz.I(x0.f83716c.b(Long.valueOf(j4))).i() * 1000;
    }

    @Override // java.util.TimeZone
    public int getRawOffset() {
        return this.tz.N(w0.b()).i() * 1000;
    }

    @Override // java.util.TimeZone
    public boolean hasSameRules(TimeZone timeZone) {
        if (this == timeZone) {
            return true;
        }
        if (timeZone instanceof i0) {
            return this.tz.F().equals(((i0) timeZone).tz.F());
        }
        return false;
    }

    public int hashCode() {
        return this.tz.hashCode();
    }

    @Override // java.util.TimeZone
    public boolean inDaylightTime(Date date) {
        return this.tz.T(x0.f83715b.b(date));
    }

    @Override // java.util.TimeZone
    public void setRawOffset(int i4) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m2.a(i0.class, sb, ProtectedSandApp.s("雉\u0001"));
        sb.append(this.tz.toString());
        return sb.toString();
    }

    @Override // java.util.TimeZone
    public boolean useDaylightTime() {
        net.time4j.tz.m F;
        if (this.tz.U() || (F = this.tz.F()) == null) {
            return false;
        }
        List<net.time4j.tz.q> b5 = F.b();
        int i4 = Integer.MIN_VALUE;
        for (int size = b5.size() - 1; size >= 0; size--) {
            int d5 = b5.get(size).d();
            if (i4 == Integer.MIN_VALUE) {
                i4 = d5;
            } else if (i4 != d5) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.TimeZone
    public int getOffset(int i4, int i5, int i6, int i7, int i10, int i11) {
        if (i11 >= 0 && i11 < 86400000) {
            if (i4 == 0) {
                i5 = 1 - i5;
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("雇\u0001"), i4));
                }
                if (i10 < 1 || i10 > 7) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("集\u0001"), i10));
                }
            }
            return this.tz.H(l0.r1(i5, i6 + 1, i7), m0.Y0().W(i11, j.MILLIS)).i() * 1000;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("雈\u0001"), i11));
    }
}
