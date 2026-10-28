package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.lang3.m;

/* compiled from: MotionKeyAttributes.java */
/* loaded from: classes.dex */
public class d extends b {
    static final String P = "KeyAttribute";
    private static final String Q = "KeyAttributes";
    private static final boolean R = false;
    public static final int S = 1;

    /* renamed from: y, reason: collision with root package name */
    private String f22122y;

    /* renamed from: z, reason: collision with root package name */
    private int f22123z = -1;
    private int A = 0;
    private float B = Float.NaN;
    private float C = Float.NaN;
    private float D = Float.NaN;
    private float E = Float.NaN;
    private float F = Float.NaN;
    private float G = Float.NaN;
    private float H = Float.NaN;
    private float I = Float.NaN;
    private float J = Float.NaN;
    private float K = Float.NaN;
    private float L = Float.NaN;
    private float M = Float.NaN;
    private float N = Float.NaN;
    private float O = Float.NaN;

    public d() {
        this.f22120k = 1;
        this.f22121l = new HashMap<>();
    }

    private float w(int i4) {
        if (i4 == 100) {
            return this.f22117h;
        }
        switch (i4) {
            case 303:
                return this.B;
            case 304:
                return this.L;
            case 305:
                return this.M;
            case 306:
                return this.N;
            case 307:
                return this.C;
            case 308:
                return this.E;
            case 309:
                return this.F;
            case 310:
                return this.D;
            case 311:
                return this.J;
            case 312:
                return this.K;
            case 313:
                return this.G;
            case 314:
                return this.H;
            case 315:
                return this.O;
            case w.a.f22419q /* 316 */:
                return this.I;
            default:
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public int a(String str) {
        return w.a.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i4, int i5) {
        if (i4 == 100) {
            this.f22117h = i5;
            return true;
        }
        if (i4 == 301) {
            this.f22123z = i5;
            return true;
        }
        if (i4 == 302) {
            this.A = i5;
            return true;
        }
        if (b(i4, i5)) {
            return true;
        }
        return super.b(i4, i5);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i4, float f4) {
        if (i4 == 100) {
            this.I = f4;
            return true;
        }
        switch (i4) {
            case 303:
                this.B = f4;
                return true;
            case 304:
                this.L = f4;
                return true;
            case 305:
                this.M = f4;
                return true;
            case 306:
                this.N = f4;
                return true;
            case 307:
                this.C = f4;
                return true;
            case 308:
                this.E = f4;
                return true;
            case 309:
                this.F = f4;
                return true;
            case 310:
                this.D = f4;
                return true;
            case 311:
                this.J = f4;
                return true;
            case 312:
                this.K = f4;
                return true;
            case 313:
                this.G = f4;
                return true;
            case 314:
                this.H = f4;
                return true;
            case 315:
                this.O = f4;
                return true;
            case w.a.f22419q /* 316 */:
                this.I = f4;
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean e(int i4, String str) {
        if (i4 == 101) {
            this.f22119j = str;
            return true;
        }
        if (i4 != 317) {
            return super.e(i4, str);
        }
        this.f22122y = str;
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, p> hashMap) {
        for (String str : hashMap.keySet()) {
            p pVar = hashMap.get(str);
            if (pVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    char c5 = 65535;
                    switch (str.hashCode()) {
                        case -1249320806:
                            if (str.equals("rotationX")) {
                                c5 = 0;
                                break;
                            }
                            break;
                        case -1249320805:
                            if (str.equals("rotationY")) {
                                c5 = 1;
                                break;
                            }
                            break;
                        case -1249320804:
                            if (str.equals("rotationZ")) {
                                c5 = 2;
                                break;
                            }
                            break;
                        case -1225497657:
                            if (str.equals("translationX")) {
                                c5 = 3;
                                break;
                            }
                            break;
                        case -1225497656:
                            if (str.equals("translationY")) {
                                c5 = 4;
                                break;
                            }
                            break;
                        case -1225497655:
                            if (str.equals("translationZ")) {
                                c5 = 5;
                                break;
                            }
                            break;
                        case -1001078227:
                            if (str.equals("progress")) {
                                c5 = 6;
                                break;
                            }
                            break;
                        case -987906986:
                            if (str.equals("pivotX")) {
                                c5 = 7;
                                break;
                            }
                            break;
                        case -987906985:
                            if (str.equals("pivotY")) {
                                c5 = '\b';
                                break;
                            }
                            break;
                        case -908189618:
                            if (str.equals("scaleX")) {
                                c5 = '\t';
                                break;
                            }
                            break;
                        case -908189617:
                            if (str.equals("scaleY")) {
                                c5 = '\n';
                                break;
                            }
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                c5 = 11;
                                break;
                            }
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                c5 = '\f';
                                break;
                            }
                            break;
                        case 803192288:
                            if (str.equals("pathRotate")) {
                                c5 = m.f86065d;
                                break;
                            }
                            break;
                    }
                    switch (c5) {
                        case 0:
                            if (Float.isNaN(this.E)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.E);
                                break;
                            }
                        case 1:
                            if (Float.isNaN(this.F)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.F);
                                break;
                            }
                        case 2:
                            if (Float.isNaN(this.D)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.D);
                                break;
                            }
                        case 3:
                            if (Float.isNaN(this.L)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.L);
                                break;
                            }
                        case 4:
                            if (Float.isNaN(this.M)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.M);
                                break;
                            }
                        case 5:
                            if (Float.isNaN(this.N)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.N);
                                break;
                            }
                        case 6:
                            if (Float.isNaN(this.O)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.O);
                                break;
                            }
                        case 7:
                            if (Float.isNaN(this.E)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.G);
                                break;
                            }
                        case '\b':
                            if (Float.isNaN(this.F)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.H);
                                break;
                            }
                        case '\t':
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.J);
                                break;
                            }
                        case '\n':
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.K);
                                break;
                            }
                        case 11:
                            if (Float.isNaN(this.C)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.C);
                                break;
                            }
                        case '\f':
                            if (Float.isNaN(this.B)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.B);
                                break;
                            }
                        case '\r':
                            if (Float.isNaN(this.I)) {
                                break;
                            } else {
                                pVar.g(this.f22117h, this.I);
                                break;
                            }
                        default:
                            System.err.println("not supported by KeyAttributes ".concat(str));
                            break;
                    }
                } else {
                    androidx.constraintlayout.core.motion.b bVar = this.f22121l.get(str.substring(7));
                    if (bVar != null) {
                        ((p.c) pVar).k(this.f22117h, bVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: g */
    public b clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.B)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("progress");
        }
        if (this.f22121l.size() > 0) {
            Iterator<String> it = this.f22121l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void q(HashMap<String, Integer> hashMap) {
        if (!Float.isNaN(this.B)) {
            hashMap.put("alpha", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.C)) {
            hashMap.put("elevation", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.D)) {
            hashMap.put("rotationZ", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.E)) {
            hashMap.put("rotationX", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.F)) {
            hashMap.put("rotationY", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.G)) {
            hashMap.put("pivotX", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.H)) {
            hashMap.put("pivotY", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.L)) {
            hashMap.put("translationX", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.M)) {
            hashMap.put("translationY", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.N)) {
            hashMap.put("translationZ", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.I)) {
            hashMap.put("pathRotate", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.J)) {
            hashMap.put("scaleX", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.K)) {
            hashMap.put("scaleY", Integer.valueOf(this.f22123z));
        }
        if (!Float.isNaN(this.O)) {
            hashMap.put("progress", Integer.valueOf(this.f22123z));
        }
        if (this.f22121l.size() > 0) {
            Iterator<String> it = this.f22121l.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(c.a("CUSTOM,", it.next()), Integer.valueOf(this.f22123z));
            }
        }
    }

    public int v() {
        return this.f22123z;
    }

    public void x() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        System.out.println(" ------------- " + this.f22117h + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            int a5 = w.a.a(strArr[i4]);
            System.out.println(strArr[i4] + ":" + w(a5));
        }
    }
}
