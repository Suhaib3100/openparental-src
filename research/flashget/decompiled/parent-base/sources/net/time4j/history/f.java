package net.time4j.history;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.b0;
import net.time4j.l0;

/* compiled from: CutOverEvent.java */
/* loaded from: classes7.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    final long f83186a;

    /* renamed from: b, reason: collision with root package name */
    final c f83187b;

    /* renamed from: c, reason: collision with root package name */
    final h f83188c;

    /* renamed from: d, reason: collision with root package name */
    final h f83189d;

    f(long j4, c cVar, c cVar2) {
        this.f83186a = j4;
        this.f83187b = cVar2;
        if (j4 != Long.MIN_VALUE) {
            this.f83188c = cVar2.fromMJD(j4);
            this.f83189d = cVar.fromMJD(j4 - 1);
        } else {
            h hVar = new h(j.BC, 1000000000, 1, 1);
            this.f83188c = hVar;
            this.f83189d = hVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f83186a == fVar.f83186a && this.f83187b == fVar.f83187b && this.f83189d.equals(fVar.f83189d);
    }

    public int hashCode() {
        long j4 = this.f83186a;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m2.a(f.class, sb, ProtectedSandApp.s("陬\u0001"));
        sb.append(this.f83186a);
        sb.append(ProtectedSandApp.s("陭\u0001"));
        sb.append(l0.w1(this.f83186a, b0.MODIFIED_JULIAN_DATE));
        sb.append(ProtectedSandApp.s("陮\u0001"));
        sb.append(this.f83187b);
        sb.append(ProtectedSandApp.s("陯\u0001"));
        sb.append(this.f83189d);
        sb.append(ProtectedSandApp.s("陰\u0001"));
        sb.append(this.f83188c);
        sb.append(']');
        return sb.toString();
    }
}
