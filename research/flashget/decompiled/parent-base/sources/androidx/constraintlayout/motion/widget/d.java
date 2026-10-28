package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: DesignTool.java */
/* loaded from: classes.dex */
public class d implements v {

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f23298g = false;

    /* renamed from: h, reason: collision with root package name */
    private static final String f23299h = "DesignTool";

    /* renamed from: i, reason: collision with root package name */
    static final HashMap<Pair<Integer, Integer>, String> f23300i;

    /* renamed from: j, reason: collision with root package name */
    static final HashMap<String, String> f23301j;

    /* renamed from: a, reason: collision with root package name */
    private final MotionLayout f23302a;

    /* renamed from: b, reason: collision with root package name */
    private t f23303b;

    /* renamed from: c, reason: collision with root package name */
    private String f23304c = null;

    /* renamed from: d, reason: collision with root package name */
    private String f23305d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f23306e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f23307f = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        f23300i = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        f23301j = hashMap2;
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

    public d(MotionLayout motionLayout) {
        this.f23302a = motionLayout;
    }

    private static void j(int dpi, androidx.constraintlayout.widget.d set, View view, HashMap<String, String> attributes, int from, int to) {
        String str = f23300i.get(Pair.create(Integer.valueOf(from), Integer.valueOf(to)));
        String str2 = attributes.get(str);
        if (str2 != null) {
            String str3 = f23301j.get(str);
            set.L(view.getId(), from, Integer.parseInt(str2), to, str3 != null ? k(dpi, attributes.get(str3)) : 0);
        }
    }

    private static int k(int dpi, String value) {
        int indexOf;
        if (value == null || (indexOf = value.indexOf(100)) == -1) {
            return 0;
        }
        return (int) ((Integer.valueOf(value.substring(0, indexOf)).intValue() * dpi) / 160.0f);
    }

    private static void l(int dpi, androidx.constraintlayout.widget.d set, View view, HashMap<String, String> attributes) {
        String str = attributes.get("layout_editor_absoluteX");
        if (str != null) {
            set.W0(view.getId(), k(dpi, str));
        }
        String str2 = attributes.get("layout_editor_absoluteY");
        if (str2 != null) {
            set.X0(view.getId(), k(dpi, str2));
        }
    }

    private static void m(androidx.constraintlayout.widget.d set, View view, HashMap<String, String> attributes, int type) {
        String str = attributes.get(type == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias");
        if (str != null) {
            if (type == 0) {
                set.f1(view.getId(), Float.parseFloat(str));
            } else if (type == 1) {
                set.A1(view.getId(), Float.parseFloat(str));
            }
        }
    }

    private static void n(int dpi, androidx.constraintlayout.widget.d set, View view, HashMap<String, String> attributes, int type) {
        String str = attributes.get(type == 1 ? "layout_height" : "layout_width");
        if (str != null) {
            int k4 = !str.equalsIgnoreCase("wrap_content") ? k(dpi, str) : -2;
            if (type == 0) {
                set.W(view.getId(), k4);
            } else {
                set.P(view.getId(), k4);
            }
        }
    }

    public String A() {
        if (this.f23304c != null && this.f23305d != null) {
            float y4 = y();
            if (y4 <= 0.01f) {
                return this.f23304c;
            }
            if (y4 >= 0.99f) {
                return this.f23305d;
            }
        }
        return this.f23304c;
    }

    public boolean B() {
        return (this.f23304c == null || this.f23305d == null) ? false : true;
    }

    public void C(Object keyFrame, String tag, Object value) {
        if (keyFrame instanceof f) {
            ((f) keyFrame).j(tag, value);
            this.f23302a.v1();
            this.f23302a.S2 = true;
        }
    }

    public void D(String id2) {
        if (id2 == null) {
            id2 = "motion_base";
        }
        if (this.f23304c == id2) {
            return;
        }
        this.f23304c = id2;
        this.f23305d = null;
        MotionLayout motionLayout = this.f23302a;
        if (motionLayout.J == null) {
            motionLayout.J = this.f23303b;
        }
        int q12 = motionLayout.q1(id2);
        this.f23306e = q12;
        if (q12 != 0) {
            if (q12 == this.f23302a.c1()) {
                this.f23302a.F1(0.0f);
            } else if (q12 == this.f23302a.X0()) {
                this.f23302a.F1(1.0f);
            } else {
                this.f23302a.X1(q12);
                this.f23302a.F1(1.0f);
            }
        }
        this.f23302a.requestLayout();
    }

    public void E(String start, String end) {
        MotionLayout motionLayout = this.f23302a;
        if (motionLayout.J == null) {
            motionLayout.J = this.f23303b;
        }
        int q12 = motionLayout.q1(start);
        int q13 = this.f23302a.q1(end);
        this.f23302a.L1(q12, q13);
        this.f23306e = q12;
        this.f23307f = q13;
        this.f23304c = start;
        this.f23305d = end;
    }

    public void F(Object view, int debugMode) {
        o oVar;
        if ((view instanceof View) && (oVar = this.f23302a.V1.get(view)) != null) {
            oVar.S(debugMode);
            this.f23302a.invalidate();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.v
    public long a() {
        return this.f23302a.g1();
    }

    @Override // androidx.constraintlayout.motion.widget.v
    public int b(int cmd, String type, Object viewObject, float[] in, int inLength, float[] out, int outLength) {
        o oVar;
        View view = (View) viewObject;
        if (cmd != 0) {
            MotionLayout motionLayout = this.f23302a;
            if (motionLayout.J == null || view == null || (oVar = motionLayout.V1.get(view)) == null) {
                return -1;
            }
        } else {
            oVar = null;
        }
        if (cmd == 0) {
            return 1;
        }
        if (cmd == 1) {
            int t4 = this.f23302a.J.t() / 16;
            oVar.f(out, t4);
            return t4;
        }
        if (cmd == 2) {
            int t5 = this.f23302a.J.t() / 16;
            oVar.e(out, null);
            return t5;
        }
        if (cmd != 3) {
            return -1;
        }
        this.f23302a.J.t();
        return oVar.l(type, out, outLength);
    }

    @Override // androidx.constraintlayout.motion.widget.v
    public Boolean c(Object keyFrame, Object view, float x4, float y4, String[] attribute, float[] value) {
        if (!(keyFrame instanceof k)) {
            return Boolean.FALSE;
        }
        View view2 = (View) view;
        this.f23302a.V1.get(view2).N(view2, (k) keyFrame, x4, y4, attribute, value);
        this.f23302a.v1();
        this.f23302a.S2 = true;
        return Boolean.TRUE;
    }

    @Override // androidx.constraintlayout.motion.widget.v
    public boolean d(Object view, int position, int type, float x4, float y4) {
        if (!(view instanceof View)) {
            return false;
        }
        MotionLayout motionLayout = this.f23302a;
        if (motionLayout.J != null) {
            o oVar = motionLayout.V1.get(view);
            MotionLayout motionLayout2 = this.f23302a;
            int i4 = (int) (motionLayout2.N2 * 100.0f);
            if (oVar != null) {
                View view2 = (View) view;
                if (motionLayout2.J.S(view2, i4)) {
                    float y5 = oVar.y(2, x4, y4);
                    float y6 = oVar.y(5, x4, y4);
                    this.f23302a.J.l0(view2, i4, "motion:percentX", Float.valueOf(y5));
                    this.f23302a.J.l0(view2, i4, "motion:percentY", Float.valueOf(y6));
                    this.f23302a.v1();
                    this.f23302a.J0(true);
                    this.f23302a.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.motion.widget.v
    public void e(float position) {
        MotionLayout motionLayout = this.f23302a;
        if (motionLayout.J == null) {
            motionLayout.J = this.f23303b;
        }
        motionLayout.F1(position);
        this.f23302a.J0(true);
        this.f23302a.requestLayout();
        this.f23302a.invalidate();
    }

    @Override // androidx.constraintlayout.motion.widget.v
    public void f(Object view, int position, String name, Object value) {
        t tVar = this.f23302a.J;
        if (tVar != null) {
            tVar.l0((View) view, position, name, value);
            MotionLayout motionLayout = this.f23302a;
            motionLayout.Q2 = position / 100.0f;
            motionLayout.O2 = 0.0f;
            motionLayout.v1();
            this.f23302a.J0(true);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.v
    public void g(int dpi, String constraintSetId, Object opaqueView, Object opaqueAttributes) {
        View view = (View) opaqueView;
        HashMap hashMap = (HashMap) opaqueAttributes;
        int q12 = this.f23302a.q1(constraintSetId);
        androidx.constraintlayout.widget.d o4 = this.f23302a.J.o(q12);
        if (o4 == null) {
            return;
        }
        o4.E(view.getId());
        n(dpi, o4, view, hashMap, 0);
        n(dpi, o4, view, hashMap, 1);
        j(dpi, o4, view, hashMap, 6, 6);
        j(dpi, o4, view, hashMap, 6, 7);
        j(dpi, o4, view, hashMap, 7, 7);
        j(dpi, o4, view, hashMap, 7, 6);
        j(dpi, o4, view, hashMap, 1, 1);
        j(dpi, o4, view, hashMap, 1, 2);
        j(dpi, o4, view, hashMap, 2, 2);
        j(dpi, o4, view, hashMap, 2, 1);
        j(dpi, o4, view, hashMap, 3, 3);
        j(dpi, o4, view, hashMap, 3, 4);
        j(dpi, o4, view, hashMap, 4, 3);
        j(dpi, o4, view, hashMap, 4, 4);
        j(dpi, o4, view, hashMap, 5, 5);
        m(o4, view, hashMap, 0);
        m(o4, view, hashMap, 1);
        l(dpi, o4, view, hashMap);
        this.f23302a.c2(q12, o4);
        this.f23302a.requestLayout();
    }

    @Override // androidx.constraintlayout.motion.widget.v
    public float h(Object view, int type, float x4, float y4) {
        o oVar;
        if ((view instanceof View) && (oVar = this.f23302a.V1.get((View) view)) != null) {
            return oVar.y(type, x4, y4);
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.v
    public Object i(Object viewObject, float x4, float y4) {
        o oVar;
        View view = (View) viewObject;
        MotionLayout motionLayout = this.f23302a;
        if (motionLayout.J == null) {
            return -1;
        }
        if (view == null || (oVar = motionLayout.V1.get(view)) == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        return oVar.B(viewGroup.getWidth(), viewGroup.getHeight(), x4, y4);
    }

    public void o(boolean disable) {
        this.f23302a.F0(disable);
    }

    public void p(String set) {
        MotionLayout motionLayout = this.f23302a;
        if (motionLayout.J == null) {
            motionLayout.J = this.f23303b;
        }
        int q12 = motionLayout.q1(set);
        System.out.println(" dumping  " + set + " (" + q12 + ")");
        try {
            this.f23302a.J.o(q12).g0(this.f23302a.J, new int[0]);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public int q(Object view, float[] key) {
        t tVar = this.f23302a.J;
        if (tVar == null) {
            return -1;
        }
        int t4 = tVar.t() / 16;
        o oVar = this.f23302a.V1.get(view);
        if (oVar == null) {
            return 0;
        }
        oVar.e(key, null);
        return t4;
    }

    public int r(Object view, float[] path, int len) {
        MotionLayout motionLayout = this.f23302a;
        if (motionLayout.J == null) {
            return -1;
        }
        o oVar = motionLayout.V1.get(view);
        if (oVar == null) {
            return 0;
        }
        oVar.f(path, len);
        return len;
    }

    public void s(Object view, float[] path) {
        t tVar = this.f23302a.J;
        if (tVar == null) {
            return;
        }
        int t4 = tVar.t() / 16;
        o oVar = this.f23302a.V1.get(view);
        if (oVar == null) {
            return;
        }
        oVar.h(path, t4);
    }

    public String t() {
        int X0 = this.f23302a.X0();
        if (this.f23307f == X0) {
            return this.f23305d;
        }
        String S0 = this.f23302a.S0(X0);
        if (S0 != null) {
            this.f23305d = S0;
            this.f23307f = X0;
        }
        return S0;
    }

    public int u(Object view, int type, int[] info) {
        o oVar = this.f23302a.V1.get((View) view);
        if (oVar == null) {
            return 0;
        }
        return oVar.x(type, info);
    }

    public int v(Object view, int[] type, float[] pos) {
        o oVar = this.f23302a.V1.get((View) view);
        if (oVar == null) {
            return 0;
        }
        return oVar.z(type, pos);
    }

    public Object w(int type, int target, int position) {
        MotionLayout motionLayout = this.f23302a;
        t tVar = motionLayout.J;
        if (tVar == null) {
            return null;
        }
        return tVar.y(motionLayout.getContext(), type, target, position);
    }

    public Object x(Object view, int type, int position) {
        if (this.f23302a.J == null) {
            return null;
        }
        int id2 = ((View) view).getId();
        MotionLayout motionLayout = this.f23302a;
        return motionLayout.J.y(motionLayout.getContext(), type, id2, position);
    }

    public float y() {
        return this.f23302a.a1();
    }

    public String z() {
        int c12 = this.f23302a.c1();
        if (this.f23306e == c12) {
            return this.f23304c;
        }
        String S0 = this.f23302a.S0(c12);
        if (S0 != null) {
            this.f23304c = S0;
            this.f23306e = c12;
        }
        return this.f23302a.S0(c12);
    }
}
