package org.threeten.bp.zone;

import androidx.compose.material3.j4;
import androidx.constraintlayout.core.motion.utils.w;
import com.tencent.mmkv.MMKV;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import org.threeten.bp.chrono.o;
import org.threeten.bp.j;
import org.threeten.bp.s;

/* compiled from: ZoneOffsetTransitionRule.java */
/* loaded from: classes9.dex */
public final class e implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    private static final long f88434k = 6889046316657758795L;

    /* renamed from: l, reason: collision with root package name */
    private static final int f88435l = 86400;

    /* renamed from: b, reason: collision with root package name */
    private final j f88436b;

    /* renamed from: c, reason: collision with root package name */
    private final byte f88437c;

    /* renamed from: d, reason: collision with root package name */
    private final org.threeten.bp.d f88438d;

    /* renamed from: e, reason: collision with root package name */
    private final org.threeten.bp.i f88439e;

    /* renamed from: f, reason: collision with root package name */
    private final int f88440f;

    /* renamed from: g, reason: collision with root package name */
    private final b f88441g;

    /* renamed from: h, reason: collision with root package name */
    private final s f88442h;

    /* renamed from: i, reason: collision with root package name */
    private final s f88443i;

    /* renamed from: j, reason: collision with root package name */
    private final s f88444j;

    /* compiled from: ZoneOffsetTransitionRule.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88445a;

        static {
            int[] iArr = new int[b.values().length];
            f88445a = iArr;
            try {
                iArr[b.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88445a[b.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ZoneOffsetTransitionRule.java */
    public enum b {
        UTC,
        WALL,
        STANDARD;

        public org.threeten.bp.h createDateTime(org.threeten.bp.h hVar, s sVar, s sVar2) {
            int i4 = a.f88445a[ordinal()];
            return i4 != 1 ? i4 != 2 ? hVar : hVar.L0(sVar2.v() - sVar.v()) : hVar.L0(sVar2.v() - s.f88337o.v());
        }
    }

    e(j jVar, int i4, org.threeten.bp.d dVar, org.threeten.bp.i iVar, int i5, b bVar, s sVar, s sVar2, s sVar3) {
        this.f88436b = jVar;
        this.f88437c = (byte) i4;
        this.f88438d = dVar;
        this.f88439e = iVar;
        this.f88440f = i5;
        this.f88441g = bVar;
        this.f88442h = sVar;
        this.f88443i = sVar2;
        this.f88444j = sVar3;
    }

    private void a(StringBuilder sb, long j4) {
        if (j4 < 10) {
            sb.append(0);
        }
        sb.append(j4);
    }

    public static e l(j jVar, int i4, org.threeten.bp.d dVar, org.threeten.bp.i iVar, boolean z4, b bVar, s sVar, s sVar2, s sVar3) {
        ng.d.j(jVar, "month");
        ng.d.j(iVar, "time");
        ng.d.j(bVar, "timeDefnition");
        ng.d.j(sVar, "standardOffset");
        ng.d.j(sVar2, "offsetBefore");
        ng.d.j(sVar3, "offsetAfter");
        if (i4 < -28 || i4 > 31 || i4 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (!z4 || iVar.equals(org.threeten.bp.i.f88243h)) {
            return new e(jVar, i4, dVar, iVar, z4 ? 1 : 0, bVar, sVar, sVar2, sVar3);
        }
        throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
    }

    static e m(DataInput dataInput) throws IOException {
        int readInt = dataInput.readInt();
        j of2 = j.of(readInt >>> 28);
        int i4 = ((264241152 & readInt) >>> 22) - 32;
        int i5 = (3670016 & readInt) >>> 19;
        org.threeten.bp.d of3 = i5 == 0 ? null : org.threeten.bp.d.of(i5);
        int i6 = (507904 & readInt) >>> 14;
        b bVar = b.values()[(readInt & 12288) >>> 12];
        int i7 = (readInt & 4080) >>> 4;
        int i10 = (readInt & 12) >>> 2;
        int i11 = readInt & 3;
        int readInt2 = i6 == 31 ? dataInput.readInt() : i6 * MMKV.ExpireInHour;
        s A = s.A(i7 == 255 ? dataInput.readInt() : (i7 - 128) * w.b.f22438j);
        s A2 = i10 == 3 ? s.A(dataInput.readInt()) : s.A((i10 * 1800) + A.v());
        s A3 = i11 == 3 ? s.A(dataInput.readInt()) : s.A((i11 * 1800) + A.v());
        if (i4 < -28 || i4 > 31 || i4 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        return new e(of2, i4, of3, org.threeten.bp.i.T(ng.d.f(readInt2, 86400)), ng.d.d(readInt2, 86400), bVar, A, A2, A3);
    }

    private Object writeReplace() {
        return new org.threeten.bp.zone.a((byte) 3, this);
    }

    public d b(int i4) {
        org.threeten.bp.g y02;
        byte b5 = this.f88437c;
        if (b5 < 0) {
            j jVar = this.f88436b;
            y02 = org.threeten.bp.g.y0(i4, jVar, jVar.length(o.f88011f.v(i4)) + 1 + this.f88437c);
            org.threeten.bp.d dVar = this.f88438d;
            if (dVar != null) {
                y02 = y02.J(org.threeten.bp.temporal.h.m(dVar));
            }
        } else {
            y02 = org.threeten.bp.g.y0(i4, this.f88436b, b5);
            org.threeten.bp.d dVar2 = this.f88438d;
            if (dVar2 != null) {
                y02 = y02.J(org.threeten.bp.temporal.h.k(dVar2));
            }
        }
        return new d(this.f88441g.createDateTime(org.threeten.bp.h.y0(y02.F0(this.f88440f), this.f88439e), this.f88442h, this.f88443i), this.f88443i, this.f88444j);
    }

    public int c() {
        return this.f88437c;
    }

    public org.threeten.bp.d d() {
        return this.f88438d;
    }

    public org.threeten.bp.i e() {
        return this.f88439e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f88436b == eVar.f88436b && this.f88437c == eVar.f88437c && this.f88438d == eVar.f88438d && this.f88441g == eVar.f88441g && this.f88440f == eVar.f88440f && this.f88439e.equals(eVar.f88439e) && this.f88442h.equals(eVar.f88442h) && this.f88443i.equals(eVar.f88443i) && this.f88444j.equals(eVar.f88444j);
    }

    public j f() {
        return this.f88436b;
    }

    public s g() {
        return this.f88444j;
    }

    public s h() {
        return this.f88443i;
    }

    public int hashCode() {
        int g02 = ((this.f88439e.g0() + this.f88440f) << 15) + (this.f88436b.ordinal() << 11) + ((this.f88437c + 32) << 5);
        org.threeten.bp.d dVar = this.f88438d;
        return ((this.f88442h.hashCode() ^ (this.f88441g.ordinal() + (g02 + ((dVar == null ? 7 : dVar.ordinal()) << 2)))) ^ this.f88443i.hashCode()) ^ this.f88444j.hashCode();
    }

    public s i() {
        return this.f88442h;
    }

    public b j() {
        return this.f88441g;
    }

    public boolean k() {
        return this.f88440f == 1 && this.f88439e.equals(org.threeten.bp.i.f88243h);
    }

    void n(DataOutput dataOutput) throws IOException {
        int g02 = (this.f88440f * 86400) + this.f88439e.g0();
        int v4 = this.f88442h.v();
        int v5 = this.f88443i.v() - v4;
        int v6 = this.f88444j.v() - v4;
        int s4 = (g02 % MMKV.ExpireInHour != 0 || g02 > 86400) ? 31 : g02 == 86400 ? 24 : this.f88439e.s();
        int i4 = v4 % w.b.f22438j == 0 ? (v4 / w.b.f22438j) + 128 : 255;
        int i5 = (v5 == 0 || v5 == 1800 || v5 == 3600) ? v5 / 1800 : 3;
        int i6 = (v6 == 0 || v6 == 1800 || v6 == 3600) ? v6 / 1800 : 3;
        org.threeten.bp.d dVar = this.f88438d;
        dataOutput.writeInt((this.f88436b.getValue() << 28) + ((this.f88437c + 32) << 22) + ((dVar == null ? 0 : dVar.getValue()) << 19) + (s4 << 14) + (this.f88441g.ordinal() << 12) + (i4 << 4) + (i5 << 2) + i6);
        if (s4 == 31) {
            dataOutput.writeInt(g02);
        }
        if (i4 == 255) {
            dataOutput.writeInt(v4);
        }
        if (i5 == 3) {
            dataOutput.writeInt(this.f88443i.v());
        }
        if (i6 == 3) {
            dataOutput.writeInt(this.f88444j.v());
        }
    }

    public String toString() {
        StringBuilder a5 = j4.a("TransitionRule[");
        a5.append(this.f88443i.compareTo(this.f88444j) > 0 ? "Gap " : "Overlap ");
        a5.append(this.f88443i);
        a5.append(" to ");
        a5.append(this.f88444j);
        a5.append(", ");
        org.threeten.bp.d dVar = this.f88438d;
        if (dVar != null) {
            byte b5 = this.f88437c;
            if (b5 == -1) {
                a5.append(dVar.name());
                a5.append(" on or before last day of ");
                a5.append(this.f88436b.name());
            } else if (b5 < 0) {
                a5.append(dVar.name());
                a5.append(" on or before last day minus ");
                a5.append((-this.f88437c) - 1);
                a5.append(" of ");
                a5.append(this.f88436b.name());
            } else {
                a5.append(dVar.name());
                a5.append(" on or after ");
                a5.append(this.f88436b.name());
                a5.append(' ');
                a5.append((int) this.f88437c);
            }
        } else {
            a5.append(this.f88436b.name());
            a5.append(' ');
            a5.append((int) this.f88437c);
        }
        a5.append(" at ");
        if (this.f88440f == 0) {
            a5.append(this.f88439e);
        } else {
            a(a5, ng.d.e((this.f88440f * 1440) + (this.f88439e.g0() / 60), 60L));
            a5.append(':');
            a(a5, ng.d.g(r3, 60));
        }
        a5.append(" ");
        a5.append(this.f88441g);
        a5.append(", standard offset ");
        a5.append(this.f88442h);
        a5.append(']');
        return a5.toString();
    }
}
