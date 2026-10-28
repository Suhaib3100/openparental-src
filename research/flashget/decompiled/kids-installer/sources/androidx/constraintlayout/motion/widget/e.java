package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: DesignTool.java */
/* loaded from: classes2.dex */
public class e implements w {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f1793g = false;

    /* renamed from: h, reason: collision with root package name */
    private static final String f1794h = "DesignTool";

    /* renamed from: i, reason: collision with root package name */
    static final HashMap<Pair<Integer, Integer>, String> f1795i;

    /* renamed from: j, reason: collision with root package name */
    static final HashMap<String, String> f1796j;

    /* renamed from: a, reason: collision with root package name */
    private final MotionLayout f1797a;

    /* renamed from: b, reason: collision with root package name */
    private v f1798b;

    /* renamed from: c, reason: collision with root package name */
    private String f1799c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f1800d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f1801e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f1802f = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        f1795i = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        f1796j = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public e(MotionLayout motionLayout) {
        this.f1797a = motionLayout;
    }

    private static void j(int i5, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap, int i6, int i7) {
        String str = f1795i.get(Pair.create(Integer.valueOf(i6), Integer.valueOf(i7)));
        String str2 = hashMap.get(str);
        if (str2 != null) {
            String str3 = f1796j.get(str);
            int k5 = str3 != null ? k(i5, hashMap.get(str3)) : 0;
            dVar.E(view.getId(), i6, Integer.parseInt(str2), i7, k5);
        }
    }

    private static int k(int i5, String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(str.substring(0, indexOf)).intValue() * i5) / 160.0f);
    }

    private static void l(int i5, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap) {
        String str = hashMap.get("layout_editor_absoluteX");
        if (str != null) {
            dVar.F0(view.getId(), k(i5, str));
        }
        String str2 = hashMap.get("layout_editor_absoluteY");
        if (str2 != null) {
            dVar.G0(view.getId(), k(i5, str2));
        }
    }

    private static void m(androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap, int i5) {
        String str = hashMap.get(i5 == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (i5 == 0) {
                dVar.O0(view.getId(), Float.parseFloat(str));
            } else if (i5 == 1) {
                dVar.i1(view.getId(), Float.parseFloat(str));
            }
        }
    }

    private static void n(int i5, androidx.constraintlayout.widget.d dVar, View view, HashMap<String, String> hashMap, int i6) {
        String str = hashMap.get(i6 == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int k5 = !str.equalsIgnoreCase("wrap_content") ? k(i5, str) : -2;
            if (i6 == 0) {
                dVar.P(view.getId(), k5);
            } else {
                dVar.I(view.getId(), k5);
            }
        }
    }

    public String A() {
        if (this.f1799c != null && this.f1800d != null) {
            float y5 = y();
            if (y5 <= 0.01f) {
                return this.f1799c;
            }
            if (y5 >= 0.99f) {
                return this.f1800d;
            }
        }
        return this.f1799c;
    }

    public boolean B() {
        return (this.f1799c == null || this.f1800d == null) ? false : true;
    }

    public void C(Object obj, String str, Object obj2) {
        if (obj instanceof f) {
            ((f) obj).f(str, obj2);
            this.f1797a.e1();
            this.f1797a.f1733o0 = true;
        }
    }

    public void D(String str) {
        if (str == null) {
            str = "motion_base";
        }
        if (this.f1799c == str) {
            return;
        }
        this.f1799c = str;
        this.f1800d = null;
        MotionLayout motionLayout = this.f1797a;
        if (motionLayout.U == null) {
            motionLayout.U = this.f1798b;
        }
        int Z0 = motionLayout.Z0(str);
        this.f1801e = Z0;
        if (Z0 != 0) {
            if (Z0 == this.f1797a.P0()) {
                this.f1797a.l1(0.0f);
            } else if (Z0 == this.f1797a.M0()) {
                this.f1797a.l1(1.0f);
            } else {
                this.f1797a.z1(Z0);
                this.f1797a.l1(1.0f);
            }
        }
        this.f1797a.requestLayout();
    }

    public void E(String str, String str2) {
        MotionLayout motionLayout = this.f1797a;
        if (motionLayout.U == null) {
            motionLayout.U = this.f1798b;
        }
        int Z0 = motionLayout.Z0(str);
        int Z02 = this.f1797a.Z0(str2);
        this.f1797a.q1(Z0, Z02);
        this.f1801e = Z0;
        this.f1802f = Z02;
        this.f1799c = str;
        this.f1800d = str2;
    }

    public void F(Object obj, int i5) {
        s sVar = this.f1797a.f1721g0.get(obj);
        if (sVar != null) {
            sVar.C(i5);
            this.f1797a.invalidate();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.w
    public long a() {
        return this.f1797a.T0();
    }

    @Override // androidx.constraintlayout.motion.widget.w
    public int b(int i5, String str, Object obj, float[] fArr, int i6, float[] fArr2, int i7) {
        s sVar;
        View view = (View) obj;
        if (i5 != 0) {
            MotionLayout motionLayout = this.f1797a;
            if (motionLayout.U == null || view == null || (sVar = motionLayout.f1721g0.get(view)) == null) {
                return -1;
            }
        } else {
            sVar = null;
        }
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            int p5 = this.f1797a.U.p() / 16;
            sVar.f(fArr2, p5);
            return p5;
        }
        if (i5 == 2) {
            int p6 = this.f1797a.U.p() / 16;
            sVar.e(fArr2, null);
            return p6;
        }
        if (i5 != 3) {
            return -1;
        }
        int p7 = this.f1797a.U.p() / 16;
        return sVar.j(str, fArr2, i7);
    }

    @Override // androidx.constraintlayout.motion.widget.w
    public boolean c(Object obj, int i5, int i6, float f6, float f7) {
        MotionLayout motionLayout = this.f1797a;
        if (motionLayout.U == null) {
            return false;
        }
        s sVar = motionLayout.f1721g0.get(obj);
        MotionLayout motionLayout2 = this.f1797a;
        int i7 = (int) (motionLayout2.f1727j0 * 100.0f);
        if (sVar == null) {
            return false;
        }
        View view = (View) obj;
        if (!motionLayout2.U.I(view, i7)) {
            return false;
        }
        float q5 = sVar.q(2, f6, f7);
        float q6 = sVar.q(5, f6, f7);
        this.f1797a.U.Y(view, i7, "motion:percentX", Float.valueOf(q5));
        this.f1797a.U.Y(view, i7, "motion:percentY", Float.valueOf(q6));
        this.f1797a.e1();
        this.f1797a.y0(true);
        this.f1797a.invalidate();
        return true;
    }

    @Override // androidx.constraintlayout.motion.widget.w
    public void d(float f6) {
        MotionLayout motionLayout = this.f1797a;
        if (motionLayout.U == null) {
            motionLayout.U = this.f1798b;
        }
        motionLayout.l1(f6);
        this.f1797a.y0(true);
        this.f1797a.requestLayout();
        this.f1797a.invalidate();
    }

    @Override // androidx.constraintlayout.motion.widget.w
    public Boolean e(Object obj, Object obj2, float f6, float f7, String[] strArr, float[] fArr) {
        if (!(obj instanceof n)) {
            return Boolean.FALSE;
        }
        View view = (View) obj2;
        this.f1797a.f1721g0.get(view).A(view, (n) obj, f6, f7, strArr, fArr);
        this.f1797a.e1();
        this.f1797a.f1733o0 = true;
        return Boolean.TRUE;
    }

    @Override // androidx.constraintlayout.motion.widget.w
    public void f(Object obj, int i5, String str, Object obj2) {
        v vVar = this.f1797a.U;
        if (vVar != null) {
            vVar.Y((View) obj, i5, str, obj2);
            MotionLayout motionLayout = this.f1797a;
            motionLayout.f1731m0 = i5 / 100.0f;
            motionLayout.f1729k0 = 0.0f;
            motionLayout.e1();
            this.f1797a.y0(true);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.w
    public void g(int i5, String str, Object obj, Object obj2) {
        View view = (View) obj;
        HashMap hashMap = (HashMap) obj2;
        int Z0 = this.f1797a.Z0(str);
        androidx.constraintlayout.widget.d k5 = this.f1797a.U.k(Z0);
        if (k5 == null) {
            return;
        }
        k5.x(view.getId());
        n(i5, k5, view, hashMap, 0);
        n(i5, k5, view, hashMap, 1);
        j(i5, k5, view, hashMap, 6, 6);
        j(i5, k5, view, hashMap, 6, 7);
        j(i5, k5, view, hashMap, 7, 7);
        j(i5, k5, view, hashMap, 7, 6);
        j(i5, k5, view, hashMap, 1, 1);
        j(i5, k5, view, hashMap, 1, 2);
        j(i5, k5, view, hashMap, 2, 2);
        j(i5, k5, view, hashMap, 2, 1);
        j(i5, k5, view, hashMap, 3, 3);
        j(i5, k5, view, hashMap, 3, 4);
        j(i5, k5, view, hashMap, 4, 3);
        j(i5, k5, view, hashMap, 4, 4);
        j(i5, k5, view, hashMap, 5, 5);
        m(k5, view, hashMap, 0);
        m(k5, view, hashMap, 1);
        l(i5, k5, view, hashMap);
        this.f1797a.C1(Z0, k5);
        this.f1797a.requestLayout();
    }

    @Override // androidx.constraintlayout.motion.widget.w
    public float h(Object obj, int i5, float f6, float f7) {
        return this.f1797a.f1721g0.get((View) obj).q(i5, f6, f7);
    }

    @Override // androidx.constraintlayout.motion.widget.w
    public Object i(Object obj, float f6, float f7) {
        s sVar;
        View view = (View) obj;
        MotionLayout motionLayout = this.f1797a;
        if (motionLayout.U == null) {
            return -1;
        }
        if (view == null || (sVar = motionLayout.f1721g0.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return sVar.r(viewGroup.getWidth(), viewGroup.getHeight(), f6, f7);
    }

    public void o(boolean z5) {
        this.f1797a.w0(z5);
    }

    public void p(String str) {
        MotionLayout motionLayout = this.f1797a;
        if (motionLayout.U == null) {
            motionLayout.U = this.f1798b;
        }
        int Z0 = motionLayout.Z0(str);
        System.out.println(" dumping  " + str + " (" + Z0 + ")");
        try {
            this.f1797a.U.k(Z0).Z(this.f1797a.U, new int[0]);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public int q(Object obj, float[] fArr) {
        v vVar = this.f1797a.U;
        if (vVar == null) {
            return -1;
        }
        int p5 = vVar.p() / 16;
        s sVar = this.f1797a.f1721g0.get(obj);
        if (sVar == null) {
            return 0;
        }
        sVar.e(fArr, null);
        return p5;
    }

    public int r(Object obj, float[] fArr, int i5) {
        MotionLayout motionLayout = this.f1797a;
        if (motionLayout.U == null) {
            return -1;
        }
        s sVar = motionLayout.f1721g0.get(obj);
        if (sVar == null) {
            return 0;
        }
        sVar.f(fArr, i5);
        return i5;
    }

    public void s(Object obj, float[] fArr) {
        v vVar = this.f1797a.U;
        if (vVar == null) {
            return;
        }
        int p5 = vVar.p() / 16;
        s sVar = this.f1797a.f1721g0.get(obj);
        if (sVar == null) {
            return;
        }
        sVar.h(fArr, p5);
    }

    public String t() {
        int M0 = this.f1797a.M0();
        if (this.f1802f == M0) {
            return this.f1800d;
        }
        String H0 = this.f1797a.H0(M0);
        if (H0 != null) {
            this.f1800d = H0;
            this.f1802f = M0;
        }
        return H0;
    }

    public int u(Object obj, int i5, int[] iArr) {
        s sVar = this.f1797a.f1721g0.get((View) obj);
        if (sVar == null) {
            return 0;
        }
        return sVar.p(i5, iArr);
    }

    public int v(Object obj, int[] iArr, float[] fArr) {
        s sVar = this.f1797a.f1721g0.get((View) obj);
        if (sVar == null) {
            return 0;
        }
        return sVar.w(iArr, fArr);
    }

    public Object w(int i5, int i6, int i7) {
        MotionLayout motionLayout = this.f1797a;
        v vVar = motionLayout.U;
        if (vVar == null) {
            return null;
        }
        return vVar.u(motionLayout.getContext(), i5, i6, i7);
    }

    public Object x(Object obj, int i5, int i6) {
        if (this.f1797a.U == null) {
            return null;
        }
        int id = ((View) obj).getId();
        MotionLayout motionLayout = this.f1797a;
        return motionLayout.U.u(motionLayout.getContext(), i5, id, i6);
    }

    public float y() {
        return this.f1797a.O0();
    }

    public String z() {
        int P0 = this.f1797a.P0();
        if (this.f1801e == P0) {
            return this.f1799c;
        }
        String H0 = this.f1797a.H0(P0);
        if (H0 != null) {
            this.f1799c = H0;
            this.f1801e = P0;
        }
        return this.f1797a.H0(P0);
    }
}
