package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.i;
import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.motion.utils.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.lang3.m;

/* compiled from: MotionKeyCycle.java */
/* loaded from: classes.dex */
public class e extends b {
    private static final String R = "KeyCycle";
    static final String S = "KeyCycle";
    public static final String T = "wavePeriod";
    public static final String U = "waveOffset";
    public static final String V = "wavePhase";
    public static final String W = "waveShape";
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* renamed from: a0, reason: collision with root package name */
    public static final int f22124a0 = 3;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f22125b0 = 4;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f22126c0 = 5;

    /* renamed from: d0, reason: collision with root package name */
    public static final int f22127d0 = 6;

    /* renamed from: e0, reason: collision with root package name */
    public static final int f22128e0 = 4;

    /* renamed from: y, reason: collision with root package name */
    private String f22129y = null;

    /* renamed from: z, reason: collision with root package name */
    private int f22130z = 0;
    private int A = -1;
    private String B = null;
    private float C = Float.NaN;
    private float D = 0.0f;
    private float E = 0.0f;
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
    private float P = Float.NaN;
    private float Q = Float.NaN;

    public e() {
        this.f22120k = 4;
        this.f22121l = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.constraintlayout.core.motion.utils.w
    public int a(String str) {
        char c5;
        str.getClass();
        switch (str.hashCode()) {
            case -1581616630:
                if (str.equals("customWave")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case -1310311125:
                if (str.equals("easing")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c5 = 5;
                    break;
                }
                c5 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c5 = 6;
                    break;
                }
                c5 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c5 = 7;
                    break;
                }
                c5 = 65535;
                break;
            case -1019779949:
                if (str.equals("offset")) {
                    c5 = '\b';
                    break;
                }
                c5 = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c5 = '\t';
                    break;
                }
                c5 = 65535;
                break;
            case -991726143:
                if (str.equals("period")) {
                    c5 = '\n';
                    break;
                }
                c5 = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c5 = 11;
                    break;
                }
                c5 = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c5 = '\f';
                    break;
                }
                c5 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c5 = m.f86065d;
                    break;
                }
                c5 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c5 = 14;
                    break;
                }
                c5 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c5 = 15;
                    break;
                }
                c5 = 65535;
                break;
            case 106629499:
                if (str.equals("phase")) {
                    c5 = 16;
                    break;
                }
                c5 = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c5 = 17;
                    break;
                }
                c5 = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c5 = 18;
                    break;
                }
                c5 = 65535;
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c5 = 19;
                    break;
                }
                c5 = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c5 = 20;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        switch (c5) {
            case 0:
                return 422;
            case 1:
                return 420;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case '\b':
                return 424;
            case '\t':
                return 315;
            case '\n':
                return 423;
            case 11:
                return 313;
            case '\f':
                return 314;
            case '\r':
                return 311;
            case 14:
                return 312;
            case 15:
                return 403;
            case 16:
                return w.c.f22467w;
            case 17:
                return 401;
            case 18:
                return 416;
            case 19:
                return 421;
            case 20:
                return 402;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i4, int i5) {
        if (i4 == 401) {
            this.f22130z = i5;
            return true;
        }
        if (i4 == 421) {
            this.A = i5;
            return true;
        }
        if (c(i4, i5)) {
            return true;
        }
        return super.b(i4, i5);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i4, float f4) {
        if (i4 == 315) {
            this.F = f4;
            return true;
        }
        if (i4 == 403) {
            this.G = f4;
            return true;
        }
        if (i4 == 416) {
            this.J = f4;
            return true;
        }
        switch (i4) {
            case 304:
                this.O = f4;
                return true;
            case 305:
                this.P = f4;
                return true;
            case 306:
                this.Q = f4;
                return true;
            case 307:
                this.H = f4;
                return true;
            case 308:
                this.K = f4;
                return true;
            case 309:
                this.L = f4;
                return true;
            case 310:
                this.I = f4;
                return true;
            case 311:
                this.M = f4;
                return true;
            case 312:
                this.N = f4;
                return true;
            default:
                switch (i4) {
                    case 423:
                        this.C = f4;
                        return true;
                    case 424:
                        this.D = f4;
                        return true;
                    case w.c.f22467w /* 425 */:
                        this.E = f4;
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.w
    public boolean e(int i4, String str) {
        if (i4 == 420) {
            this.f22129y = str;
            return true;
        }
        if (i4 != 422) {
            return super.e(i4, str);
        }
        this.B = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, p> hashMap) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* renamed from: g */
    public b clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("translationZ");
        }
        if (this.f22121l.size() > 0) {
            Iterator<String> it = this.f22121l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, i> hashMap) {
        i iVar;
        i iVar2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.core.motion.b bVar = this.f22121l.get(str.substring(7));
                if (bVar != null && bVar.m() == 901 && (iVar = hashMap.get(str)) != null) {
                    iVar.g(this.f22117h, this.A, this.B, -1, this.C, this.D, this.E, bVar.n(), bVar);
                }
            } else {
                float x4 = x(str);
                if (!Float.isNaN(x4) && (iVar2 = hashMap.get(str)) != null) {
                    iVar2.f(this.f22117h, this.A, this.B, -1, this.C, this.D, this.E, x4);
                }
            }
        }
    }

    public void w() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.A + ", mWavePeriod=" + this.C + ", mWaveOffset=" + this.D + ", mWavePhase=" + this.E + ", mRotation=" + this.I + '}');
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public float x(String str) {
        str.getClass();
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
            case -1019779949:
                if (str.equals("offset")) {
                    c5 = 6;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c5 = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c5 = '\b';
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c5 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c5 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c5 = 11;
                    break;
                }
                break;
            case 106629499:
                if (str.equals("phase")) {
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
                return this.K;
            case 1:
                return this.L;
            case 2:
                return this.I;
            case 3:
                return this.O;
            case 4:
                return this.P;
            case 5:
                return this.Q;
            case 6:
                return this.D;
            case 7:
                return this.F;
            case '\b':
                return this.M;
            case '\t':
                return this.N;
            case '\n':
                return this.H;
            case 11:
                return this.G;
            case '\f':
                return this.E;
            case '\r':
                return this.J;
            default:
                return Float.NaN;
        }
    }

    public void y() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        x.c(" ------------- " + this.f22117h + " -------------");
        x.c("MotionKeyCycle{Shape=" + this.A + ", Period=" + this.C + ", Offset=" + this.D + ", Phase=" + this.E + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            w.a.a(strArr[i4]);
            x.c(strArr[i4] + ":" + x(strArr[i4]));
        }
    }
}
