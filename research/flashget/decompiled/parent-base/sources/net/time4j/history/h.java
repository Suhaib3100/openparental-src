package net.time4j.history;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: HistoricDate.java */
/* loaded from: classes7.dex */
public final class h implements Comparable<h> {

    /* renamed from: b, reason: collision with root package name */
    private final j f83198b;

    /* renamed from: c, reason: collision with root package name */
    private final int f83199c;

    /* renamed from: d, reason: collision with root package name */
    private final int f83200d;

    /* renamed from: e, reason: collision with root package name */
    private final int f83201e;

    h(j jVar, int i4, int i5, int i6) {
        this.f83198b = jVar;
        this.f83199c = i4;
        this.f83200d = i5;
        this.f83201e = i6;
    }

    public static h g(j jVar, int i4, int i5, int i6) {
        return h(jVar, i4, i5, i6, p.DUAL_DATING, o.f83227d);
    }

    public static h h(j jVar, int i4, int i5, int i6, p pVar, o oVar) {
        if (jVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("陼\u0001"));
        }
        if (i6 < 1 || i6 > 31) {
            throw new IllegalArgumentException(ProtectedSandApp.s("陻\u0001") + i(jVar, i4, i5, i6));
        }
        if (i5 < 1 || i5 > 12) {
            throw new IllegalArgumentException(ProtectedSandApp.s("険\u0001") + i(jVar, i4, i5, i6));
        }
        if (jVar == j.BYZANTINE) {
            if (i4 < 0 || (i4 == 0 && i5 < 9)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("陸\u0001") + i(jVar, i4, i5, i6));
            }
        } else if (i4 < 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("陹\u0001") + i(jVar, i4, i5, i6));
        }
        if (!pVar.equals(p.DUAL_DATING)) {
            i4 = oVar.f(jVar, i4).standardYear(pVar == p.AFTER_NEW_YEAR, oVar, jVar, i4, i5, i6);
        }
        return new h(jVar, i4, i5, i6);
    }

    private static String i(j jVar, int i4, int i5, int i6) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar);
        sb.append('-');
        String valueOf = String.valueOf(i4);
        for (int length = 4 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        sb.append('-');
        if (i5 < 10) {
            sb.append('0');
        }
        sb.append(i5);
        sb.append('-');
        if (i6 < 10) {
            sb.append('0');
        }
        sb.append(i6);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int annoDomini = this.f83198b.annoDomini(this.f83199c);
        int annoDomini2 = hVar.f83198b.annoDomini(hVar.f83199c);
        if (annoDomini < annoDomini2) {
            return -1;
        }
        if (annoDomini > annoDomini2) {
            return 1;
        }
        int i4 = this.f83200d - hVar.f83200d;
        if (i4 == 0) {
            i4 = this.f83201e - hVar.f83201e;
        }
        if (i4 < 0) {
            return -1;
        }
        return i4 > 0 ? 1 : 0;
    }

    public int b() {
        return this.f83201e;
    }

    public j c() {
        return this.f83198b;
    }

    public int d() {
        return this.f83200d;
    }

    public int e() {
        return this.f83199c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f83198b == hVar.f83198b && this.f83199c == hVar.f83199c && this.f83200d == hVar.f83200d && this.f83201e == hVar.f83201e;
    }

    public int f(o oVar) {
        return oVar.c(this);
    }

    public int hashCode() {
        int i4 = (this.f83200d * 32) + (this.f83199c * 1000) + this.f83201e;
        return this.f83198b == j.AD ? i4 : -i4;
    }

    public String toString() {
        return i(this.f83198b, this.f83199c, this.f83200d, this.f83201e);
    }
}
