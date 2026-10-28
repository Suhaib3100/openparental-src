package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.g;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: KeyTrigger.java */
/* loaded from: classes.dex */
public class m extends f {

    /* renamed from: m0, reason: collision with root package name */
    public static final int f23449m0 = 5;
    private int D = -1;
    private String E = null;
    private int F;
    private String G;
    private String H;
    private int I;
    private int J;
    private View K;
    float L;
    private boolean M;
    private boolean N;
    private boolean O;
    private float P;
    private float Q;
    private boolean R;
    int S;
    int T;
    int U;
    RectF V;
    RectF W;
    HashMap<String, Method> X;

    /* renamed from: l0, reason: collision with root package name */
    public static final String f23448l0 = "CROSS";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f23447k0 = "triggerReceiver";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f23446j0 = "negativeCross";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f23445i0 = "positiveCross";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f23444h0 = "triggerID";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f23443g0 = "triggerCollisionId";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f23442f0 = "triggerCollisionView";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f23441e0 = "triggerSlack";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f23440d0 = "postLayout";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f23439c0 = "viewTransitionOnNegativeCross";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f23438b0 = "viewTransitionOnPositiveCross";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f23437a0 = "viewTransitionOnCross";
    static final String Y = "KeyTrigger";
    private static final String Z = "KeyTrigger";

    /* compiled from: KeyTrigger.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final int f23450a = 1;

        /* renamed from: b, reason: collision with root package name */
        private static final int f23451b = 2;

        /* renamed from: c, reason: collision with root package name */
        private static final int f23452c = 4;

        /* renamed from: d, reason: collision with root package name */
        private static final int f23453d = 5;

        /* renamed from: e, reason: collision with root package name */
        private static final int f23454e = 6;

        /* renamed from: f, reason: collision with root package name */
        private static final int f23455f = 7;

        /* renamed from: g, reason: collision with root package name */
        private static final int f23456g = 8;

        /* renamed from: h, reason: collision with root package name */
        private static final int f23457h = 9;

        /* renamed from: i, reason: collision with root package name */
        private static final int f23458i = 10;

        /* renamed from: j, reason: collision with root package name */
        private static final int f23459j = 11;

        /* renamed from: k, reason: collision with root package name */
        private static final int f23460k = 12;

        /* renamed from: l, reason: collision with root package name */
        private static final int f23461l = 13;

        /* renamed from: m, reason: collision with root package name */
        private static final int f23462m = 14;

        /* renamed from: n, reason: collision with root package name */
        private static SparseIntArray f23463n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f23463n = sparseIntArray;
            sparseIntArray.append(g.m.f25112mg, 8);
            f23463n.append(g.m.f25168qg, 4);
            f23463n.append(g.m.f25181rg, 1);
            f23463n.append(g.m.sg, 2);
            f23463n.append(g.m.f25126ng, 7);
            f23463n.append(g.m.tg, 6);
            f23463n.append(g.m.vg, 5);
            f23463n.append(g.m.f25154pg, 9);
            f23463n.append(g.m.f25140og, 10);
            f23463n.append(g.m.ug, 11);
            f23463n.append(g.m.wg, 12);
            f23463n.append(g.m.xg, 13);
            f23463n.append(g.m.yg, 14);
        }

        private a() {
        }

        public static void a(m c5, TypedArray a5, Context context) {
            int indexCount = a5.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = a5.getIndex(i4);
                switch (f23463n.get(index)) {
                    case 1:
                        c5.G = a5.getString(index);
                        break;
                    case 2:
                        c5.H = a5.getString(index);
                        break;
                    case 3:
                    default:
                        Integer.toHexString(index);
                        f23463n.get(index);
                        break;
                    case 4:
                        c5.E = a5.getString(index);
                        break;
                    case 5:
                        c5.L = a5.getFloat(index, c5.L);
                        break;
                    case 6:
                        c5.I = a5.getResourceId(index, c5.I);
                        break;
                    case 7:
                        if (MotionLayout.l4) {
                            int resourceId = a5.getResourceId(index, c5.f23330b);
                            c5.f23330b = resourceId;
                            if (resourceId == -1) {
                                c5.f23331c = a5.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (a5.peekValue(index).type == 3) {
                            c5.f23331c = a5.getString(index);
                            break;
                        } else {
                            c5.f23330b = a5.getResourceId(index, c5.f23330b);
                            break;
                        }
                    case 8:
                        int integer = a5.getInteger(index, c5.f23329a);
                        c5.f23329a = integer;
                        c5.P = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        c5.J = a5.getResourceId(index, c5.J);
                        break;
                    case 10:
                        c5.R = a5.getBoolean(index, c5.R);
                        break;
                    case 11:
                        c5.F = a5.getResourceId(index, c5.F);
                        break;
                    case 12:
                        c5.U = a5.getResourceId(index, c5.U);
                        break;
                    case 13:
                        c5.S = a5.getResourceId(index, c5.S);
                        break;
                    case 14:
                        c5.T = a5.getResourceId(index, c5.T);
                        break;
                }
            }
        }
    }

    public m() {
        int i4 = f.f23308f;
        this.F = i4;
        this.G = null;
        this.H = null;
        this.I = i4;
        this.J = i4;
        this.K = null;
        this.L = 0.1f;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = Float.NaN;
        this.R = false;
        this.S = i4;
        this.T = i4;
        this.U = i4;
        this.V = new RectF();
        this.W = new RectF();
        this.X = new HashMap<>();
        this.f23332d = 5;
        this.f23333e = new HashMap<>();
    }

    private void B(String str, View call) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            C(str, call);
            return;
        }
        if (this.X.containsKey(str)) {
            method = this.X.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = call.getClass().getMethod(str, null);
                this.X.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.X.put(str, null);
                call.getClass();
                c.k(call);
                return;
            }
        }
        try {
            method.invoke(call, null);
        } catch (Exception unused2) {
            call.getClass();
            c.k(call);
        }
    }

    private void C(String str, View view) {
        boolean z4 = str.length() == 1;
        if (!z4) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f23333e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z4 || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.f23333e.get(str2);
                if (aVar != null) {
                    aVar.a(view);
                }
            }
        }
    }

    private void E(RectF rect, View child, boolean postLayout) {
        rect.top = child.getTop();
        rect.bottom = child.getBottom();
        rect.left = child.getLeft();
        rect.right = child.getRight();
        if (postLayout) {
            child.getMatrix().mapRect(rect);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(float r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.A(float, android.view.View):void");
    }

    int D() {
        return this.D;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> splines) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* renamed from: b */
    public f clone() {
        return new m().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f src) {
        super.c(src);
        m mVar = (m) src;
        this.D = mVar.D;
        this.E = mVar.E;
        this.F = mVar.F;
        this.G = mVar.G;
        this.H = mVar.H;
        this.I = mVar.I;
        this.J = mVar.J;
        this.K = mVar.K;
        this.L = mVar.L;
        this.M = mVar.M;
        this.N = mVar.N;
        this.O = mVar.O;
        this.P = mVar.P;
        this.Q = mVar.Q;
        this.R = mVar.R;
        this.V = mVar.V;
        this.W = mVar.W;
        this.X = mVar.X;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> attributes) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attrs) {
        a.a(this, context.obtainStyledAttributes(attrs, g.m.f25099lg), context);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String tag, Object value) {
        tag.getClass();
        switch (tag) {
            case "positiveCross":
                this.H = value.toString();
                break;
            case "viewTransitionOnPositiveCross":
                this.T = n(value);
                break;
            case "triggerCollisionId":
                this.J = n(value);
                break;
            case "triggerID":
                this.I = n(value);
                break;
            case "negativeCross":
                this.G = value.toString();
                break;
            case "triggerCollisionView":
                this.K = (View) value;
                break;
            case "viewTransitionOnNegativeCross":
                this.S = n(value);
                break;
            case "CROSS":
                this.E = value.toString();
                break;
            case "triggerSlack":
                this.L = m(value);
                break;
            case "viewTransitionOnCross":
                this.U = n(value);
                break;
            case "postLayout":
                this.R = l(value);
                break;
            case "triggerReceiver":
                this.F = n(value);
                break;
        }
    }
}
