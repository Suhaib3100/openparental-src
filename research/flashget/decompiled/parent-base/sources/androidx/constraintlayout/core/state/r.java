package androidx.constraintlayout.core.state;

import androidx.compose.material3.j4;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.q;
import androidx.constraintlayout.core.widgets.d;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Set;

/* compiled from: WidgetFrame.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: u, reason: collision with root package name */
    private static final boolean f22749u = true;

    /* renamed from: v, reason: collision with root package name */
    public static float f22750v = Float.NaN;

    /* renamed from: a, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.e f22751a;

    /* renamed from: b, reason: collision with root package name */
    public int f22752b;

    /* renamed from: c, reason: collision with root package name */
    public int f22753c;

    /* renamed from: d, reason: collision with root package name */
    public int f22754d;

    /* renamed from: e, reason: collision with root package name */
    public int f22755e;

    /* renamed from: f, reason: collision with root package name */
    public float f22756f;

    /* renamed from: g, reason: collision with root package name */
    public float f22757g;

    /* renamed from: h, reason: collision with root package name */
    public float f22758h;

    /* renamed from: i, reason: collision with root package name */
    public float f22759i;

    /* renamed from: j, reason: collision with root package name */
    public float f22760j;

    /* renamed from: k, reason: collision with root package name */
    public float f22761k;

    /* renamed from: l, reason: collision with root package name */
    public float f22762l;

    /* renamed from: m, reason: collision with root package name */
    public float f22763m;

    /* renamed from: n, reason: collision with root package name */
    public float f22764n;

    /* renamed from: o, reason: collision with root package name */
    public float f22765o;

    /* renamed from: p, reason: collision with root package name */
    public float f22766p;

    /* renamed from: q, reason: collision with root package name */
    public float f22767q;

    /* renamed from: r, reason: collision with root package name */
    public int f22768r;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap<String, androidx.constraintlayout.core.motion.b> f22769s;

    /* renamed from: t, reason: collision with root package name */
    public String f22770t;

    public r() {
        this.f22751a = null;
        this.f22752b = 0;
        this.f22753c = 0;
        this.f22754d = 0;
        this.f22755e = 0;
        this.f22756f = Float.NaN;
        this.f22757g = Float.NaN;
        this.f22758h = Float.NaN;
        this.f22759i = Float.NaN;
        this.f22760j = Float.NaN;
        this.f22761k = Float.NaN;
        this.f22762l = Float.NaN;
        this.f22763m = Float.NaN;
        this.f22764n = Float.NaN;
        this.f22765o = Float.NaN;
        this.f22766p = Float.NaN;
        this.f22767q = Float.NaN;
        this.f22768r = 0;
        this.f22769s = new HashMap<>();
        this.f22770t = null;
    }

    private static void a(StringBuilder sb, String str, float f4) {
        if (Float.isNaN(f4)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f4);
        sb.append(",\n");
    }

    private static void b(StringBuilder sb, String str, int i4) {
        sb.append(str);
        sb.append(": ");
        sb.append(i4);
        sb.append(",\n");
    }

    private static float m(float f4, float f5, float f6, float f7) {
        boolean isNaN = Float.isNaN(f4);
        boolean isNaN2 = Float.isNaN(f5);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f4 = f6;
        }
        if (isNaN2) {
            f5 = f6;
        }
        return androidx.appcompat.graphics.drawable.d.a(f5, f4, f7, f4);
    }

    public static void n(int i4, int i5, r rVar, r rVar2, r rVar3, q qVar, float f4) {
        int i6;
        float f5;
        int i7;
        int i10;
        float f6;
        float f7;
        int i11;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f11 = 100.0f * f4;
        int i18 = (int) f11;
        int i19 = rVar2.f22752b;
        int i20 = rVar2.f22753c;
        int i21 = rVar3.f22752b;
        int i22 = rVar3.f22753c;
        int i23 = rVar2.f22754d - i19;
        int i24 = rVar2.f22755e - i20;
        int i25 = rVar3.f22754d - i21;
        int i26 = rVar3.f22755e - i22;
        float f12 = rVar2.f22766p;
        float f13 = rVar3.f22766p;
        if (rVar2.f22768r == 8) {
            i20 = (int) (i20 - (i26 / 2.0f));
            i10 = (int) (i19 - (i25 / 2.0f));
            if (Float.isNaN(f12)) {
                i7 = i26;
                i6 = i25;
                f5 = 0.0f;
            } else {
                f5 = f12;
                i6 = i25;
                i7 = i26;
            }
        } else {
            i6 = i23;
            f5 = f12;
            i7 = i24;
            i10 = i19;
        }
        if (rVar3.f22768r == 8) {
            i21 = (int) (i21 - (i6 / 2.0f));
            i22 = (int) (i22 - (i7 / 2.0f));
            i25 = i6;
            i26 = i7;
            if (Float.isNaN(f13)) {
                f13 = 0.0f;
            }
        }
        if (Float.isNaN(f5) && !Float.isNaN(f13)) {
            f5 = 1.0f;
        }
        if (!Float.isNaN(f5) && Float.isNaN(f13)) {
            f13 = 1.0f;
        }
        if (rVar2.f22768r == 4) {
            f7 = f13;
            f6 = 0.0f;
        } else {
            f6 = f5;
            f7 = f13;
        }
        float f14 = rVar3.f22768r == 4 ? 0.0f : f7;
        if (rVar.f22751a == null || !qVar.N()) {
            i11 = i20;
            f10 = f4;
            i12 = i10;
            i13 = i21;
        } else {
            q.a x4 = qVar.x(rVar.f22751a.f22961o, i18);
            i11 = i20;
            q.a w4 = qVar.w(rVar.f22751a.f22961o, i18);
            if (x4 == w4) {
                w4 = null;
            }
            if (x4 != null) {
                i10 = (int) (x4.f22737d * i4);
                i15 = i21;
                i14 = i5;
                i11 = (int) (x4.f22738e * i14);
                i16 = x4.f22734a;
            } else {
                i14 = i5;
                i15 = i21;
                i16 = 0;
            }
            i12 = i10;
            if (w4 != null) {
                i13 = (int) (w4.f22737d * i4);
                i22 = (int) (w4.f22738e * i14);
                i17 = w4.f22734a;
            } else {
                i17 = 100;
                i13 = i15;
            }
            f10 = (f11 - i16) / (i17 - i16);
        }
        int i27 = i11;
        rVar.f22751a = rVar2.f22751a;
        int i28 = (int) (((i13 - i12) * f10) + i12);
        rVar.f22752b = i28;
        int i29 = (int) ((f10 * (i22 - i27)) + i27);
        rVar.f22753c = i29;
        float f15 = 1.0f - f4;
        rVar.f22754d = i28 + ((int) ((i25 * f4) + (i6 * f15)));
        rVar.f22755e = i29 + ((int) ((i26 * f4) + (f15 * i7)));
        rVar.f22756f = m(rVar2.f22756f, rVar3.f22756f, 0.5f, f4);
        rVar.f22757g = m(rVar2.f22757g, rVar3.f22757g, 0.5f, f4);
        rVar.f22758h = m(rVar2.f22758h, rVar3.f22758h, 0.0f, f4);
        rVar.f22759i = m(rVar2.f22759i, rVar3.f22759i, 0.0f, f4);
        rVar.f22760j = m(rVar2.f22760j, rVar3.f22760j, 0.0f, f4);
        rVar.f22764n = m(rVar2.f22764n, rVar3.f22764n, 1.0f, f4);
        rVar.f22765o = m(rVar2.f22765o, rVar3.f22765o, 1.0f, f4);
        rVar.f22761k = m(rVar2.f22761k, rVar3.f22761k, 0.0f, f4);
        rVar.f22762l = m(rVar2.f22762l, rVar3.f22762l, 0.0f, f4);
        rVar.f22763m = m(rVar2.f22763m, rVar3.f22763m, 0.0f, f4);
        rVar.f22766p = m(f6, f14, 1.0f, f4);
        Set<String> keySet = rVar3.f22769s.keySet();
        rVar.f22769s.clear();
        for (String str : keySet) {
            if (rVar2.f22769s.containsKey(str)) {
                androidx.constraintlayout.core.motion.b bVar = rVar2.f22769s.get(str);
                androidx.constraintlayout.core.motion.b bVar2 = rVar3.f22769s.get(str);
                androidx.constraintlayout.core.motion.b bVar3 = new androidx.constraintlayout.core.motion.b(bVar);
                rVar.f22769s.put(str, bVar3);
                if (bVar.r() == 1) {
                    bVar3.y(Float.valueOf(m(bVar.n(), bVar2.n(), 0.0f, f4)));
                } else {
                    int r4 = bVar.r();
                    float[] fArr = new float[r4];
                    float[] fArr2 = new float[r4];
                    bVar.o(fArr);
                    bVar2.o(fArr2);
                    for (int i30 = 0; i30 < r4; i30++) {
                        fArr[i30] = m(fArr[i30], fArr2[i30], 0.0f, f4);
                        bVar3.z(fArr);
                    }
                }
            }
        }
    }

    private void u(StringBuilder sb, d.b bVar) {
        androidx.constraintlayout.core.widgets.d r4 = this.f22751a.r(bVar);
        if (r4 == null || r4.f22902f == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(bVar.name());
        sb.append(": ['");
        String str = r4.f22902f.i().f22961o;
        if (str == null) {
            str = "#PARENT";
        }
        sb.append(str);
        sb.append("', '");
        sb.append(r4.f22902f.l().name());
        sb.append("', '");
        sb.append(r4.f22903g);
        sb.append("'],\n");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean A(String str, androidx.constraintlayout.core.parser.d dVar) throws CLParsingException {
        str.getClass();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c5 = 2;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c5 = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c5 = 4;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c5 = 5;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c5 = 6;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c5 = 7;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c5 = '\b';
                    break;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c5 = '\t';
                    break;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c5 = '\n';
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c5 = 11;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c5 = '\f';
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c5 = org.apache.commons.lang3.m.f86065d;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c5 = 14;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c5 = 15;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c5 = 16;
                    break;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    c5 = 17;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                f22750v = dVar.j();
                return true;
            case 1:
                this.f22755e = dVar.l();
                return true;
            case 2:
                q(dVar);
                return true;
            case 3:
                this.f22758h = dVar.j();
                return true;
            case 4:
                this.f22759i = dVar.j();
                return true;
            case 5:
                this.f22760j = dVar.j();
                return true;
            case 6:
                this.f22761k = dVar.j();
                return true;
            case 7:
                this.f22762l = dVar.j();
                return true;
            case '\b':
                this.f22763m = dVar.j();
                return true;
            case '\t':
                this.f22756f = dVar.j();
                return true;
            case '\n':
                this.f22757g = dVar.j();
                return true;
            case 11:
                this.f22764n = dVar.j();
                return true;
            case '\f':
                this.f22765o = dVar.j();
                return true;
            case '\r':
                this.f22753c = dVar.l();
                return true;
            case 14:
                this.f22752b = dVar.l();
                return true;
            case 15:
                this.f22766p = dVar.j();
                return true;
            case 16:
                this.f22754d = dVar.l();
                return true;
            case 17:
                this.f22767q = dVar.j();
                return true;
            default:
                return false;
        }
    }

    public r B() {
        androidx.constraintlayout.core.widgets.e eVar = this.f22751a;
        if (eVar != null) {
            this.f22752b = eVar.L();
            this.f22753c = this.f22751a.e0();
            this.f22754d = this.f22751a.X();
            this.f22755e = this.f22751a.v();
            D(this.f22751a.f22959n);
        }
        return this;
    }

    public r C(androidx.constraintlayout.core.widgets.e eVar) {
        if (eVar == null) {
            return this;
        }
        this.f22751a = eVar;
        B();
        return this;
    }

    public void D(r rVar) {
        this.f22756f = rVar.f22756f;
        this.f22757g = rVar.f22757g;
        this.f22758h = rVar.f22758h;
        this.f22759i = rVar.f22759i;
        this.f22760j = rVar.f22760j;
        this.f22761k = rVar.f22761k;
        this.f22762l = rVar.f22762l;
        this.f22763m = rVar.f22763m;
        this.f22764n = rVar.f22764n;
        this.f22765o = rVar.f22765o;
        this.f22766p = rVar.f22766p;
        this.f22768r = rVar.f22768r;
        this.f22769s.clear();
        for (androidx.constraintlayout.core.motion.b bVar : rVar.f22769s.values()) {
            this.f22769s.put(bVar.k(), bVar.d());
        }
    }

    public int E() {
        return Math.max(0, this.f22754d - this.f22752b);
    }

    public void c(String str, int i4) {
        w(str, w.b.f22440l, i4);
    }

    public void d(String str, float f4) {
        v(str, w.b.f22439k, f4);
    }

    public float e() {
        return ((this.f22754d - r0) / 2.0f) + this.f22752b;
    }

    public float f() {
        return ((this.f22755e - r0) / 2.0f) + this.f22753c;
    }

    public androidx.constraintlayout.core.motion.b g(String str) {
        return this.f22769s.get(str);
    }

    public Set<String> h() {
        return this.f22769s.keySet();
    }

    public int i(String str) {
        if (this.f22769s.containsKey(str)) {
            return this.f22769s.get(str).g();
        }
        return -21880;
    }

    public float j(String str) {
        if (this.f22769s.containsKey(str)) {
            return this.f22769s.get(str).h();
        }
        return Float.NaN;
    }

    public String k() {
        androidx.constraintlayout.core.widgets.e eVar = this.f22751a;
        return eVar == null ? "unknown" : eVar.f22961o;
    }

    public int l() {
        return Math.max(0, this.f22755e - this.f22753c);
    }

    public boolean o() {
        return Float.isNaN(this.f22758h) && Float.isNaN(this.f22759i) && Float.isNaN(this.f22760j) && Float.isNaN(this.f22761k) && Float.isNaN(this.f22762l) && Float.isNaN(this.f22763m) && Float.isNaN(this.f22764n) && Float.isNaN(this.f22765o) && Float.isNaN(this.f22766p);
    }

    void p(String str) {
        String a5;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder a6 = androidx.constraintlayout.core.e.a(".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName(), " ");
        a6.append(hashCode() % 1000);
        String sb = a6.toString();
        if (this.f22751a != null) {
            StringBuilder a7 = androidx.constraintlayout.core.e.a(sb, "/");
            a7.append(this.f22751a.hashCode() % 1000);
            a5 = a7.toString();
        } else {
            a5 = androidx.compose.runtime.changelist.j.a(sb, "/NULL");
        }
        System.out.println(a5 + " " + str);
    }

    void q(androidx.constraintlayout.core.parser.d dVar) throws CLParsingException {
        androidx.constraintlayout.core.parser.g gVar = (androidx.constraintlayout.core.parser.g) dVar;
        int size = gVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.constraintlayout.core.parser.e eVar = (androidx.constraintlayout.core.parser.e) gVar.K(i4);
            eVar.c();
            androidx.constraintlayout.core.parser.d n02 = eVar.n0();
            String c5 = n02.c();
            if (c5.matches("#[0-9a-fA-F]+")) {
                w(eVar.c(), w.b.f22440l, Integer.parseInt(c5.substring(1), 16));
            } else if (n02 instanceof androidx.constraintlayout.core.parser.f) {
                v(eVar.c(), w.b.f22439k, n02.j());
            } else {
                x(eVar.c(), w.b.f22441m, c5);
            }
        }
    }

    void r() {
        String a5;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder a6 = androidx.constraintlayout.core.e.a(".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName(), " ");
        a6.append(hashCode() % 1000);
        String sb = a6.toString();
        if (this.f22751a != null) {
            StringBuilder a7 = androidx.constraintlayout.core.e.a(sb, "/");
            a7.append(this.f22751a.hashCode() % 1000);
            a7.append(" ");
            a5 = a7.toString();
        } else {
            a5 = androidx.compose.runtime.changelist.j.a(sb, "/NULL ");
        }
        HashMap<String, androidx.constraintlayout.core.motion.b> hashMap = this.f22769s;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                PrintStream printStream = System.out;
                StringBuilder a8 = j4.a(a5);
                a8.append(this.f22769s.get(str).toString());
                printStream.println(a8.toString());
            }
        }
    }

    public StringBuilder s(StringBuilder sb) {
        return t(sb, false);
    }

    public StringBuilder t(StringBuilder sb, boolean z4) {
        sb.append("{\n");
        b(sb, "left", this.f22752b);
        b(sb, "top", this.f22753c);
        b(sb, "right", this.f22754d);
        b(sb, "bottom", this.f22755e);
        a(sb, "pivotX", this.f22756f);
        a(sb, "pivotY", this.f22757g);
        a(sb, "rotationX", this.f22758h);
        a(sb, "rotationY", this.f22759i);
        a(sb, "rotationZ", this.f22760j);
        a(sb, "translationX", this.f22761k);
        a(sb, "translationY", this.f22762l);
        a(sb, "translationZ", this.f22763m);
        a(sb, "scaleX", this.f22764n);
        a(sb, "scaleY", this.f22765o);
        a(sb, "alpha", this.f22766p);
        b(sb, "visibility", this.f22768r);
        a(sb, "interpolatedPos", this.f22767q);
        if (this.f22751a != null) {
            for (d.b bVar : d.b.values()) {
                u(sb, bVar);
            }
        }
        if (z4) {
            a(sb, "phone_orientation", f22750v);
        }
        if (z4) {
            a(sb, "phone_orientation", f22750v);
        }
        if (this.f22769s.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.f22769s.keySet()) {
                androidx.constraintlayout.core.motion.b bVar2 = this.f22769s.get(str);
                sb.append(str);
                sb.append(": ");
                switch (bVar2.m()) {
                    case w.b.f22438j /* 900 */:
                        sb.append(bVar2.i());
                        sb.append(",\n");
                        break;
                    case w.b.f22439k /* 901 */:
                    case w.b.f22443o /* 905 */:
                        sb.append(bVar2.h());
                        sb.append(",\n");
                        break;
                    case w.b.f22440l /* 902 */:
                        sb.append("'");
                        sb.append(androidx.constraintlayout.core.motion.b.c(bVar2.i()));
                        sb.append("',\n");
                        break;
                    case w.b.f22441m /* 903 */:
                        sb.append("'");
                        sb.append(bVar2.l());
                        sb.append("',\n");
                        break;
                    case w.b.f22442n /* 904 */:
                        sb.append("'");
                        sb.append(bVar2.f());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public void v(String str, int i4, float f4) {
        if (this.f22769s.containsKey(str)) {
            this.f22769s.get(str).u(f4);
        } else {
            this.f22769s.put(str, new androidx.constraintlayout.core.motion.b(str, i4, f4));
        }
    }

    public void w(String str, int i4, int i5) {
        if (this.f22769s.containsKey(str)) {
            this.f22769s.get(str).v(i5);
        } else {
            this.f22769s.put(str, new androidx.constraintlayout.core.motion.b(str, i4, i5));
        }
    }

    public void x(String str, int i4, String str2) {
        if (this.f22769s.containsKey(str)) {
            this.f22769s.get(str).x(str2);
        } else {
            this.f22769s.put(str, new androidx.constraintlayout.core.motion.b(str, i4, str2));
        }
    }

    public void y(String str, int i4, boolean z4) {
        if (this.f22769s.containsKey(str)) {
            this.f22769s.get(str).t(z4);
        } else {
            this.f22769s.put(str, new androidx.constraintlayout.core.motion.b(str, i4, z4));
        }
    }

    public void z(androidx.constraintlayout.core.motion.a aVar, float[] fArr) {
    }

    public r(androidx.constraintlayout.core.widgets.e eVar) {
        this.f22751a = null;
        this.f22752b = 0;
        this.f22753c = 0;
        this.f22754d = 0;
        this.f22755e = 0;
        this.f22756f = Float.NaN;
        this.f22757g = Float.NaN;
        this.f22758h = Float.NaN;
        this.f22759i = Float.NaN;
        this.f22760j = Float.NaN;
        this.f22761k = Float.NaN;
        this.f22762l = Float.NaN;
        this.f22763m = Float.NaN;
        this.f22764n = Float.NaN;
        this.f22765o = Float.NaN;
        this.f22766p = Float.NaN;
        this.f22767q = Float.NaN;
        this.f22768r = 0;
        this.f22769s = new HashMap<>();
        this.f22770t = null;
        this.f22751a = eVar;
    }

    public r(r rVar) {
        this.f22751a = null;
        this.f22752b = 0;
        this.f22753c = 0;
        this.f22754d = 0;
        this.f22755e = 0;
        this.f22756f = Float.NaN;
        this.f22757g = Float.NaN;
        this.f22758h = Float.NaN;
        this.f22759i = Float.NaN;
        this.f22760j = Float.NaN;
        this.f22761k = Float.NaN;
        this.f22762l = Float.NaN;
        this.f22763m = Float.NaN;
        this.f22764n = Float.NaN;
        this.f22765o = Float.NaN;
        this.f22766p = Float.NaN;
        this.f22767q = Float.NaN;
        this.f22768r = 0;
        this.f22769s = new HashMap<>();
        this.f22770t = null;
        this.f22751a = rVar.f22751a;
        this.f22752b = rVar.f22752b;
        this.f22753c = rVar.f22753c;
        this.f22754d = rVar.f22754d;
        this.f22755e = rVar.f22755e;
        D(rVar);
    }
}
