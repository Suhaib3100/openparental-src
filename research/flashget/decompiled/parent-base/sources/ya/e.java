package ya;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* compiled from: PictureParameterSet.java */
/* loaded from: classes6.dex */
public class e extends b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f93313a;

    /* renamed from: b, reason: collision with root package name */
    public int f93314b;

    /* renamed from: c, reason: collision with root package name */
    public int f93315c;

    /* renamed from: d, reason: collision with root package name */
    public int f93316d;

    /* renamed from: e, reason: collision with root package name */
    public int f93317e;

    /* renamed from: f, reason: collision with root package name */
    public int f93318f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93319g;

    /* renamed from: h, reason: collision with root package name */
    public int f93320h;

    /* renamed from: i, reason: collision with root package name */
    public int f93321i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f93322j;

    /* renamed from: k, reason: collision with root package name */
    public int f93323k;

    /* renamed from: l, reason: collision with root package name */
    public int f93324l;

    /* renamed from: m, reason: collision with root package name */
    public int f93325m;

    /* renamed from: n, reason: collision with root package name */
    public int f93326n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f93327o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f93328p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f93329q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f93330r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f93331s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f93332t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f93333u;

    /* renamed from: v, reason: collision with root package name */
    public int[] f93334v;

    /* renamed from: w, reason: collision with root package name */
    public a f93335w;

    /* compiled from: PictureParameterSet.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f93336a;

        /* renamed from: b, reason: collision with root package name */
        public g f93337b = new g();

        /* renamed from: c, reason: collision with root package name */
        public int f93338c;

        /* renamed from: d, reason: collision with root package name */
        public boolean[] f93339d;

        public String toString() {
            return ProtectedSandApp.s("㣫\u0001") + this.f93336a + ProtectedSandApp.s("㣬\u0001") + this.f93337b + ProtectedSandApp.s("㣭\u0001") + this.f93338c + ProtectedSandApp.s("㣮\u0001") + this.f93339d + '}';
        }
    }

    public static e b(InputStream inputStream) throws IOException {
        com.googlecode.mp4parser.h264.read.b bVar = new com.googlecode.mp4parser.h264.read.b(inputStream);
        e eVar = new e();
        eVar.f93317e = bVar.y(ProtectedSandApp.s("㣯\u0001"));
        eVar.f93318f = bVar.y(ProtectedSandApp.s("㣰\u0001"));
        eVar.f93313a = bVar.p(ProtectedSandApp.s("㣱\u0001"));
        eVar.f93319g = bVar.p(ProtectedSandApp.s("㣲\u0001"));
        int y4 = bVar.y(ProtectedSandApp.s("㣳\u0001"));
        eVar.f93320h = y4;
        if (y4 > 0) {
            int y5 = bVar.y(ProtectedSandApp.s("㣴\u0001"));
            eVar.f93321i = y5;
            int i4 = eVar.f93320h;
            eVar.f93330r = new int[i4 + 1];
            eVar.f93331s = new int[i4 + 1];
            eVar.f93332t = new int[i4 + 1];
            if (y5 == 0) {
                for (int i5 = 0; i5 <= eVar.f93320h; i5++) {
                    eVar.f93332t[i5] = bVar.y(ProtectedSandApp.s("㣵\u0001"));
                }
            } else if (y5 == 2) {
                for (int i6 = 0; i6 < eVar.f93320h; i6++) {
                    eVar.f93330r[i6] = bVar.y(ProtectedSandApp.s("㣶\u0001"));
                    eVar.f93331s[i6] = bVar.y(ProtectedSandApp.s("㣷\u0001"));
                }
            } else {
                int i7 = 3;
                if (y5 == 3 || y5 == 4 || y5 == 5) {
                    eVar.f93333u = bVar.p(ProtectedSandApp.s("㣻\u0001"));
                    eVar.f93316d = bVar.y(ProtectedSandApp.s("㣼\u0001"));
                } else if (y5 == 6) {
                    if (i4 + 1 <= 4) {
                        i7 = 1;
                        if (i4 + 1 > 2) {
                            i7 = 2;
                        }
                    }
                    int y6 = bVar.y(ProtectedSandApp.s("㣸\u0001"));
                    eVar.f93334v = new int[y6 + 1];
                    for (int i10 = 0; i10 <= y6; i10++) {
                        eVar.f93334v[i10] = (int) bVar.s(i7, ProtectedSandApp.s("㣹\u0001") + i10 + ProtectedSandApp.s("㣺\u0001"));
                    }
                }
            }
        }
        eVar.f93314b = bVar.y(ProtectedSandApp.s("㣽\u0001"));
        eVar.f93315c = bVar.y(ProtectedSandApp.s("㣾\u0001"));
        eVar.f93322j = bVar.p(ProtectedSandApp.s("㣿\u0001"));
        eVar.f93323k = (int) bVar.s(2, ProtectedSandApp.s("㤀\u0001"));
        eVar.f93324l = bVar.t(ProtectedSandApp.s("㤁\u0001"));
        eVar.f93325m = bVar.t(ProtectedSandApp.s("㤂\u0001"));
        eVar.f93326n = bVar.t(ProtectedSandApp.s("㤃\u0001"));
        eVar.f93327o = bVar.p(ProtectedSandApp.s("㤄\u0001"));
        eVar.f93328p = bVar.p(ProtectedSandApp.s("㤅\u0001"));
        eVar.f93329q = bVar.p(ProtectedSandApp.s("㤆\u0001"));
        if (bVar.f()) {
            a aVar = new a();
            eVar.f93335w = aVar;
            aVar.f93336a = bVar.p(ProtectedSandApp.s("㤇\u0001"));
            if (bVar.p(ProtectedSandApp.s("㤈\u0001"))) {
                for (int i11 = 0; i11 < ((eVar.f93335w.f93336a ? 1 : 0) * 2) + 6; i11++) {
                    if (bVar.p(ProtectedSandApp.s("㤉\u0001"))) {
                        g gVar = eVar.f93335w.f93337b;
                        f[] fVarArr = new f[8];
                        gVar.f93342a = fVarArr;
                        f[] fVarArr2 = new f[8];
                        gVar.f93343b = fVarArr2;
                        if (i11 < 6) {
                            fVarArr[i11] = f.a(bVar, 16);
                        } else {
                            fVarArr2[i11 - 6] = f.a(bVar, 64);
                        }
                    }
                }
            }
            eVar.f93335w.f93338c = bVar.t(ProtectedSandApp.s("㤊\u0001"));
        }
        bVar.v();
        return eVar;
    }

    public static e c(byte[] bArr) throws IOException {
        return b(new ByteArrayInputStream(bArr));
    }

    @Override // ya.b
    public void a(OutputStream outputStream) throws IOException {
        za.b bVar = new za.b(outputStream);
        bVar.n(this.f93317e);
        bVar.n(this.f93318f);
        bVar.b(this.f93313a ? 1 : 0);
        bVar.b(this.f93319g ? 1 : 0);
        bVar.n(this.f93320h);
        if (this.f93320h > 0) {
            bVar.n(this.f93321i);
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            int i4 = this.f93321i;
            if (i4 == 0) {
                for (int i5 = 0; i5 <= this.f93320h; i5++) {
                    bVar.n(iArr3[i5]);
                }
            } else if (i4 == 2) {
                for (int i6 = 0; i6 < this.f93320h; i6++) {
                    bVar.n(iArr[i6]);
                    bVar.n(iArr2[i6]);
                }
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                bVar.b(this.f93333u ? 1 : 0);
                bVar.n(this.f93316d);
            } else if (i4 == 6) {
                int i7 = this.f93320h;
                int i10 = i7 + 1 <= 4 ? i7 + 1 > 2 ? 2 : 1 : 3;
                bVar.n(this.f93334v.length);
                int i11 = 0;
                while (true) {
                    if (i11 > this.f93334v.length) {
                        break;
                    }
                    bVar.e(r6[i11], i10);
                    i11++;
                }
            }
        }
        bVar.n(this.f93314b);
        bVar.n(this.f93315c);
        bVar.b(this.f93322j ? 1 : 0);
        bVar.h(this.f93323k, 2, ProtectedSandApp.s("㤀\u0001"));
        bVar.i(this.f93324l, ProtectedSandApp.s("㤁\u0001"));
        bVar.i(this.f93325m, ProtectedSandApp.s("㤂\u0001"));
        bVar.i(this.f93326n, ProtectedSandApp.s("㤃\u0001"));
        bVar.b(this.f93327o ? 1 : 0);
        bVar.b(this.f93328p ? 1 : 0);
        bVar.b(this.f93329q ? 1 : 0);
        a aVar = this.f93335w;
        if (aVar != null) {
            bVar.b(aVar.f93336a ? 1 : 0);
            bVar.b(this.f93335w.f93337b != null ? 1 : 0);
            if (this.f93335w.f93337b != null) {
                int i12 = 0;
                while (true) {
                    a aVar2 = this.f93335w;
                    if (i12 >= ((aVar2.f93336a ? 1 : 0) * 2) + 6) {
                        break;
                    }
                    if (i12 < 6) {
                        bVar.b(aVar2.f93337b.f93342a[i12] != null ? 1 : 0);
                        f fVar = this.f93335w.f93337b.f93342a[i12];
                        if (fVar != null) {
                            fVar.b(bVar);
                        }
                    } else {
                        int i13 = i12 - 6;
                        bVar.b(aVar2.f93337b.f93343b[i13] != null ? 1 : 0);
                        f fVar2 = this.f93335w.f93337b.f93343b[i13];
                        if (fVar2 != null) {
                            fVar2.b(bVar);
                        }
                    }
                    i12++;
                }
            }
            bVar.i(this.f93335w.f93338c, ProtectedSandApp.s("㤋\u0001"));
        }
        bVar.k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!Arrays.equals(this.f93331s, eVar.f93331s) || this.f93326n != eVar.f93326n || this.f93328p != eVar.f93328p || this.f93327o != eVar.f93327o || this.f93313a != eVar.f93313a) {
            return false;
        }
        a aVar = this.f93335w;
        if (aVar == null) {
            if (eVar.f93335w != null) {
                return false;
            }
        } else if (!aVar.equals(eVar.f93335w)) {
            return false;
        }
        return this.f93314b == eVar.f93314b && this.f93315c == eVar.f93315c && this.f93320h == eVar.f93320h && this.f93324l == eVar.f93324l && this.f93325m == eVar.f93325m && this.f93319g == eVar.f93319g && this.f93317e == eVar.f93317e && this.f93329q == eVar.f93329q && Arrays.equals(this.f93332t, eVar.f93332t) && this.f93318f == eVar.f93318f && this.f93333u == eVar.f93333u && this.f93316d == eVar.f93316d && Arrays.equals(this.f93334v, eVar.f93334v) && this.f93321i == eVar.f93321i && Arrays.equals(this.f93330r, eVar.f93330r) && this.f93323k == eVar.f93323k && this.f93322j == eVar.f93322j;
    }

    public int hashCode() {
        int hashCode = (((((((((Arrays.hashCode(this.f93331s) + 31) * 31) + this.f93326n) * 31) + (this.f93328p ? 1231 : 1237)) * 31) + (this.f93327o ? 1231 : 1237)) * 31) + (this.f93313a ? 1231 : 1237)) * 31;
        a aVar = this.f93335w;
        return ((((Arrays.hashCode(this.f93330r) + ((((Arrays.hashCode(this.f93334v) + ((((((((Arrays.hashCode(this.f93332t) + ((((((((((((((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f93314b) * 31) + this.f93315c) * 31) + this.f93320h) * 31) + this.f93324l) * 31) + this.f93325m) * 31) + (this.f93319g ? 1231 : 1237)) * 31) + this.f93317e) * 31) + (this.f93329q ? 1231 : 1237)) * 31)) * 31) + this.f93318f) * 31) + (this.f93333u ? 1231 : 1237)) * 31) + this.f93316d) * 31)) * 31) + this.f93321i) * 31)) * 31) + this.f93323k) * 31) + (this.f93322j ? 1231 : 1237);
    }

    public String toString() {
        return ProtectedSandApp.s("㤌\u0001") + this.f93313a + ProtectedSandApp.s("㤍\u0001") + this.f93314b + ProtectedSandApp.s("㤎\u0001") + this.f93315c + ProtectedSandApp.s("㤏\u0001") + this.f93316d + ProtectedSandApp.s("㤐\u0001") + this.f93317e + ProtectedSandApp.s("㤑\u0001") + this.f93318f + ProtectedSandApp.s("㤒\u0001") + this.f93319g + ProtectedSandApp.s("㤓\u0001") + this.f93320h + ProtectedSandApp.s("㤔\u0001") + this.f93321i + ProtectedSandApp.s("㤕\u0001") + this.f93322j + ProtectedSandApp.s("㤖\u0001") + this.f93323k + ProtectedSandApp.s("㤗\u0001") + this.f93324l + ProtectedSandApp.s("㤘\u0001") + this.f93325m + ProtectedSandApp.s("㤙\u0001") + this.f93326n + ProtectedSandApp.s("㤚\u0001") + this.f93327o + ProtectedSandApp.s("㤛\u0001") + this.f93328p + ProtectedSandApp.s("㤜\u0001") + this.f93329q + ProtectedSandApp.s("㤝\u0001") + this.f93330r + ProtectedSandApp.s("㤞\u0001") + this.f93331s + ProtectedSandApp.s("㤟\u0001") + this.f93332t + ProtectedSandApp.s("㤠\u0001") + this.f93333u + ProtectedSandApp.s("㤡\u0001") + this.f93334v + ProtectedSandApp.s("㤢\u0001") + this.f93335w + '}';
    }
}
