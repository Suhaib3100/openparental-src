package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.core.motion.utils.u;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.motion.utils.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MotionKeyTimeCycle.java */
/* loaded from: classes.dex */
public class g extends b {
    static final String Q = "KeyTimeCycle";
    private static final String R = "KeyTimeCycle";
    public static final int S = 3;

    /* renamed from: y, reason: collision with root package name */
    private String f22133y;

    /* renamed from: z, reason: collision with root package name */
    private int f22134z = -1;
    private float A = Float.NaN;
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
    private int M = 0;
    private String N = null;
    private float O = Float.NaN;
    private float P = 0.0f;

    public g() {
        this.f22120k = 3;
        this.f22121l = new HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public int a(String str) {
        return w.c.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i4, int i5) {
        if (i4 == 100) {
            this.f22117h = i5;
            return true;
        }
        if (i4 != 421) {
            return super.b(i4, i5);
        }
        this.M = i5;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i4, float f4) {
        if (i4 == 315) {
            this.L = t(Float.valueOf(f4));
            return true;
        }
        if (i4 == 401) {
            this.f22134z = u(Float.valueOf(f4));
            return true;
        }
        if (i4 == 403) {
            this.A = f4;
            return true;
        }
        if (i4 == 416) {
            this.F = t(Float.valueOf(f4));
            return true;
        }
        if (i4 == 423) {
            this.O = t(Float.valueOf(f4));
            return true;
        }
        if (i4 == 424) {
            this.P = t(Float.valueOf(f4));
            return true;
        }
        switch (i4) {
            case 304:
                this.I = t(Float.valueOf(f4));
                return true;
            case 305:
                this.J = t(Float.valueOf(f4));
                return true;
            case 306:
                this.K = t(Float.valueOf(f4));
                return true;
            case 307:
                this.B = t(Float.valueOf(f4));
                return true;
            case 308:
                this.D = t(Float.valueOf(f4));
                return true;
            case 309:
                this.E = t(Float.valueOf(f4));
                return true;
            case 310:
                this.C = t(Float.valueOf(f4));
                return true;
            case 311:
                this.G = t(Float.valueOf(f4));
                return true;
            case 312:
                this.H = t(Float.valueOf(f4));
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i4, boolean z4) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean e(int i4, String str) {
        if (i4 == 420) {
            this.f22133y = str;
            return true;
        }
        if (i4 != 421) {
            return super.e(i4, str);
        }
        this.M = 7;
        this.N = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, p> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: g */
    public b clone() {
        return new g().h(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.A)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.B)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("translationZ");
        }
        if (this.f22121l.size() > 0) {
            Iterator<String> it = this.f22121l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, u> hashMap) {
        for (String str : hashMap.keySet()) {
            u uVar = hashMap.get(str);
            if (uVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.D)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.D, this.O, this.M, this.P);
                                break;
                            }
                        case "rotationY":
                            if (Float.isNaN(this.E)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.E, this.O, this.M, this.P);
                                break;
                            }
                        case "rotationZ":
                            if (Float.isNaN(this.C)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.C, this.O, this.M, this.P);
                                break;
                            }
                        case "translationX":
                            if (Float.isNaN(this.I)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.I, this.O, this.M, this.P);
                                break;
                            }
                        case "translationY":
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.J, this.O, this.M, this.P);
                                break;
                            }
                        case "translationZ":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.K, this.O, this.M, this.P);
                                break;
                            }
                        case "progress":
                            if (Float.isNaN(this.L)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.L, this.O, this.M, this.P);
                                break;
                            }
                        case "scaleX":
                            if (Float.isNaN(this.G)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.G, this.O, this.M, this.P);
                                break;
                            }
                        case "scaleY":
                            if (Float.isNaN(this.H)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.H, this.O, this.M, this.P);
                                break;
                            }
                        case "elevation":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.K, this.O, this.M, this.P);
                                break;
                            }
                        case "alpha":
                            if (Float.isNaN(this.A)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.A, this.O, this.M, this.P);
                                break;
                            }
                        case "pathRotate":
                            if (Float.isNaN(this.F)) {
                                break;
                            } else {
                                uVar.c(this.f22117h, this.F, this.O, this.M, this.P);
                                break;
                            }
                        default:
                            x.f("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    androidx.constraintlayout.core.motion.b bVar = this.f22121l.get(str.substring(7));
                    if (bVar != null) {
                        ((u.b) uVar).g(this.f22117h, bVar, this.O, this.M, this.P);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public g h(b bVar) {
        super.h(bVar);
        g gVar = (g) bVar;
        this.f22133y = gVar.f22133y;
        this.f22134z = gVar.f22134z;
        this.M = gVar.M;
        this.O = gVar.O;
        this.P = gVar.P;
        this.L = gVar.L;
        this.A = gVar.A;
        this.B = gVar.B;
        this.C = gVar.C;
        this.F = gVar.F;
        this.D = gVar.D;
        this.E = gVar.E;
        this.G = gVar.G;
        this.H = gVar.H;
        this.I = gVar.I;
        this.J = gVar.J;
        this.K = gVar.K;
        return this;
    }
}
