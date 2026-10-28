package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: ConstraintProperties.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final int f2843c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2844d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f2845e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2846f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f2847g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f2848h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f2849i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f2850j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f2851k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f2852l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f2853m = -2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f2854n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f2855o = 0;

    /* renamed from: a, reason: collision with root package name */
    ConstraintLayout.LayoutParams f2856a;

    /* renamed from: b, reason: collision with root package name */
    View f2857b;

    public c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f2856a = (ConstraintLayout.LayoutParams) layoutParams;
        this.f2857b = view;
    }

    private String K(int i5) {
        switch (i5) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public c A(float f6) {
        this.f2856a.E = f6;
        return this;
    }

    public c B(int i5, int i6) {
        switch (i5) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f2856a).leftMargin = i6;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f2856a).rightMargin = i6;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f2856a).topMargin = i6;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f2856a).bottomMargin = i6;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f2856a.setMarginStart(i6);
                return this;
            case 7:
                this.f2856a.setMarginEnd(i6);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c C(int i5) {
        switch (i5) {
            case 1:
                ConstraintLayout.LayoutParams layoutParams = this.f2856a;
                layoutParams.f2738e = -1;
                layoutParams.f2736d = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
                layoutParams.f2764t = -1;
                return this;
            case 2:
                ConstraintLayout.LayoutParams layoutParams2 = this.f2856a;
                layoutParams2.f2742g = -1;
                layoutParams2.f2740f = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = -1;
                layoutParams2.f2766v = -1;
                return this;
            case 3:
                ConstraintLayout.LayoutParams layoutParams3 = this.f2856a;
                layoutParams3.f2746i = -1;
                layoutParams3.f2744h = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = -1;
                layoutParams3.f2765u = -1;
                return this;
            case 4:
                ConstraintLayout.LayoutParams layoutParams4 = this.f2856a;
                layoutParams4.f2748j = -1;
                layoutParams4.f2750k = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = -1;
                layoutParams4.f2767w = -1;
                return this;
            case 5:
                this.f2856a.f2752l = -1;
                return this;
            case 6:
                ConstraintLayout.LayoutParams layoutParams5 = this.f2856a;
                layoutParams5.f2760p = -1;
                layoutParams5.f2761q = -1;
                layoutParams5.setMarginStart(-1);
                this.f2856a.f2768x = -1;
                return this;
            case 7:
                ConstraintLayout.LayoutParams layoutParams6 = this.f2856a;
                layoutParams6.f2762r = -1;
                layoutParams6.f2763s = -1;
                layoutParams6.setMarginEnd(-1);
                this.f2856a.f2769y = -1;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c D() {
        ConstraintLayout.LayoutParams layoutParams = this.f2856a;
        int i5 = layoutParams.f2738e;
        int i6 = layoutParams.f2740f;
        if (i5 == -1 && i6 == -1) {
            int i7 = layoutParams.f2760p;
            int i8 = layoutParams.f2762r;
            if (i7 != -1 || i8 != -1) {
                c cVar = new c(((ViewGroup) this.f2857b.getParent()).findViewById(i7));
                c cVar2 = new c(((ViewGroup) this.f2857b.getParent()).findViewById(i8));
                ConstraintLayout.LayoutParams layoutParams2 = this.f2856a;
                if (i7 != -1 && i8 != -1) {
                    cVar.m(7, i8, 6, 0);
                    cVar2.m(6, i5, 7, 0);
                } else if (i5 != -1 || i8 != -1) {
                    int i9 = layoutParams2.f2742g;
                    if (i9 != -1) {
                        cVar.m(7, i9, 7, 0);
                    } else {
                        int i10 = layoutParams2.f2736d;
                        if (i10 != -1) {
                            cVar2.m(6, i10, 6, 0);
                        }
                    }
                }
            }
            C(6);
            C(7);
        } else {
            c cVar3 = new c(((ViewGroup) this.f2857b.getParent()).findViewById(i5));
            c cVar4 = new c(((ViewGroup) this.f2857b.getParent()).findViewById(i6));
            ConstraintLayout.LayoutParams layoutParams3 = this.f2856a;
            if (i5 != -1 && i6 != -1) {
                cVar3.m(2, i6, 1, 0);
                cVar4.m(1, i5, 2, 0);
            } else if (i5 != -1 || i6 != -1) {
                int i11 = layoutParams3.f2742g;
                if (i11 != -1) {
                    cVar3.m(2, i11, 2, 0);
                } else {
                    int i12 = layoutParams3.f2736d;
                    if (i12 != -1) {
                        cVar4.m(1, i12, 1, 0);
                    }
                }
            }
            C(1);
            C(2);
        }
        return this;
    }

    public c E() {
        ConstraintLayout.LayoutParams layoutParams = this.f2856a;
        int i5 = layoutParams.f2746i;
        int i6 = layoutParams.f2748j;
        if (i5 != -1 || i6 != -1) {
            c cVar = new c(((ViewGroup) this.f2857b.getParent()).findViewById(i5));
            c cVar2 = new c(((ViewGroup) this.f2857b.getParent()).findViewById(i6));
            ConstraintLayout.LayoutParams layoutParams2 = this.f2856a;
            if (i5 != -1 && i6 != -1) {
                cVar.m(4, i6, 3, 0);
                cVar2.m(3, i5, 4, 0);
            } else if (i5 != -1 || i6 != -1) {
                int i7 = layoutParams2.f2750k;
                if (i7 != -1) {
                    cVar.m(4, i7, 4, 0);
                } else {
                    int i8 = layoutParams2.f2744h;
                    if (i8 != -1) {
                        cVar2.m(3, i8, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public c F(float f6) {
        this.f2857b.setRotation(f6);
        return this;
    }

    public c G(float f6) {
        this.f2857b.setRotationX(f6);
        return this;
    }

    public c H(float f6) {
        this.f2857b.setRotationY(f6);
        return this;
    }

    public c I(float f6) {
        this.f2857b.setScaleY(f6);
        return this;
    }

    public c J(float f6) {
        return this;
    }

    public c L(float f6, float f7) {
        this.f2857b.setPivotX(f6);
        this.f2857b.setPivotY(f7);
        return this;
    }

    public c M(float f6) {
        this.f2857b.setPivotX(f6);
        return this;
    }

    public c N(float f6) {
        this.f2857b.setPivotY(f6);
        return this;
    }

    public c O(float f6, float f7) {
        this.f2857b.setTranslationX(f6);
        this.f2857b.setTranslationY(f7);
        return this;
    }

    public c P(float f6) {
        this.f2857b.setTranslationX(f6);
        return this;
    }

    public c Q(float f6) {
        this.f2857b.setTranslationY(f6);
        return this;
    }

    public c R(float f6) {
        this.f2857b.setTranslationZ(f6);
        return this;
    }

    public c S(float f6) {
        this.f2856a.A = f6;
        return this;
    }

    public c T(int i5) {
        this.f2856a.H = i5;
        return this;
    }

    public c U(float f6) {
        this.f2856a.F = f6;
        return this;
    }

    public c V(int i5) {
        this.f2857b.setVisibility(i5);
        return this;
    }

    public c a(int i5, int i6) {
        m(1, i5, i5 == 0 ? 1 : 2, 0);
        m(2, i6, i6 == 0 ? 2 : 1, 0);
        if (i5 != 0) {
            new c(((ViewGroup) this.f2857b.getParent()).findViewById(i5)).m(2, this.f2857b.getId(), 1, 0);
        }
        if (i6 != 0) {
            new c(((ViewGroup) this.f2857b.getParent()).findViewById(i6)).m(1, this.f2857b.getId(), 2, 0);
        }
        return this;
    }

    public c b(int i5, int i6) {
        m(6, i5, i5 == 0 ? 6 : 7, 0);
        m(7, i6, i6 == 0 ? 7 : 6, 0);
        if (i5 != 0) {
            new c(((ViewGroup) this.f2857b.getParent()).findViewById(i5)).m(7, this.f2857b.getId(), 6, 0);
        }
        if (i6 != 0) {
            new c(((ViewGroup) this.f2857b.getParent()).findViewById(i6)).m(6, this.f2857b.getId(), 7, 0);
        }
        return this;
    }

    public c c(int i5, int i6) {
        m(3, i5, i5 == 0 ? 3 : 4, 0);
        m(4, i6, i6 == 0 ? 4 : 3, 0);
        if (i5 != 0) {
            new c(((ViewGroup) this.f2857b.getParent()).findViewById(i5)).m(4, this.f2857b.getId(), 3, 0);
        }
        if (i6 != 0) {
            new c(((ViewGroup) this.f2857b.getParent()).findViewById(i6)).m(3, this.f2857b.getId(), 4, 0);
        }
        return this;
    }

    public c d(float f6) {
        this.f2857b.setAlpha(f6);
        return this;
    }

    public void e() {
    }

    public c f(int i5, int i6, int i7, int i8, int i9, int i10, float f6) {
        if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f6 <= 0.0f || f6 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i6 == 1 || i6 == 2) {
            m(1, i5, i6, i7);
            m(2, i8, i9, i10);
            this.f2856a.f2770z = f6;
        } else if (i6 == 6 || i6 == 7) {
            m(6, i5, i6, i7);
            m(7, i8, i9, i10);
            this.f2856a.f2770z = f6;
        } else {
            m(3, i5, i6, i7);
            m(4, i8, i9, i10);
            this.f2856a.A = f6;
        }
        return this;
    }

    public c g(int i5) {
        if (i5 == 0) {
            f(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            f(i5, 2, 0, i5, 1, 0, 0.5f);
        }
        return this;
    }

    public c h(int i5, int i6, int i7, int i8, int i9, int i10, float f6) {
        m(1, i5, i6, i7);
        m(2, i8, i9, i10);
        this.f2856a.f2770z = f6;
        return this;
    }

    public c i(int i5) {
        if (i5 == 0) {
            f(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            f(i5, 7, 0, i5, 6, 0, 0.5f);
        }
        return this;
    }

    public c j(int i5, int i6, int i7, int i8, int i9, int i10, float f6) {
        m(6, i5, i6, i7);
        m(7, i8, i9, i10);
        this.f2856a.f2770z = f6;
        return this;
    }

    public c k(int i5) {
        if (i5 == 0) {
            f(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            f(i5, 4, 0, i5, 3, 0, 0.5f);
        }
        return this;
    }

    public c l(int i5, int i6, int i7, int i8, int i9, int i10, float f6) {
        m(3, i5, i6, i7);
        m(4, i8, i9, i10);
        this.f2856a.A = f6;
        return this;
    }

    public c m(int i5, int i6, int i7, int i8) {
        switch (i5) {
            case 1:
                if (i7 == 1) {
                    ConstraintLayout.LayoutParams layoutParams = this.f2856a;
                    layoutParams.f2736d = i6;
                    layoutParams.f2738e = -1;
                } else {
                    if (i7 != 2) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("Left to "), K(i7), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = this.f2856a;
                    layoutParams2.f2738e = i6;
                    layoutParams2.f2736d = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f2856a).leftMargin = i8;
                return this;
            case 2:
                if (i7 == 1) {
                    ConstraintLayout.LayoutParams layoutParams3 = this.f2856a;
                    layoutParams3.f2740f = i6;
                    layoutParams3.f2742g = -1;
                } else {
                    if (i7 != 2) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), K(i7), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams4 = this.f2856a;
                    layoutParams4.f2742g = i6;
                    layoutParams4.f2740f = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f2856a).rightMargin = i8;
                return this;
            case 3:
                if (i7 == 3) {
                    ConstraintLayout.LayoutParams layoutParams5 = this.f2856a;
                    layoutParams5.f2744h = i6;
                    layoutParams5.f2746i = -1;
                    layoutParams5.f2752l = -1;
                } else {
                    if (i7 != 4) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), K(i7), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams6 = this.f2856a;
                    layoutParams6.f2746i = i6;
                    layoutParams6.f2744h = -1;
                    layoutParams6.f2752l = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f2856a).topMargin = i8;
                return this;
            case 4:
                if (i7 == 4) {
                    ConstraintLayout.LayoutParams layoutParams7 = this.f2856a;
                    layoutParams7.f2750k = i6;
                    layoutParams7.f2748j = -1;
                    layoutParams7.f2752l = -1;
                } else {
                    if (i7 != 3) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), K(i7), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams8 = this.f2856a;
                    layoutParams8.f2748j = i6;
                    layoutParams8.f2750k = -1;
                    layoutParams8.f2752l = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f2856a).bottomMargin = i8;
                return this;
            case 5:
                if (i7 != 5) {
                    throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), K(i7), " undefined"));
                }
                ConstraintLayout.LayoutParams layoutParams9 = this.f2856a;
                layoutParams9.f2752l = i6;
                layoutParams9.f2750k = -1;
                layoutParams9.f2748j = -1;
                layoutParams9.f2744h = -1;
                layoutParams9.f2746i = -1;
                return this;
            case 6:
                if (i7 == 6) {
                    ConstraintLayout.LayoutParams layoutParams10 = this.f2856a;
                    layoutParams10.f2761q = i6;
                    layoutParams10.f2760p = -1;
                } else {
                    if (i7 != 7) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), K(i7), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams11 = this.f2856a;
                    layoutParams11.f2760p = i6;
                    layoutParams11.f2761q = -1;
                }
                this.f2856a.setMarginStart(i8);
                return this;
            case 7:
                if (i7 == 7) {
                    ConstraintLayout.LayoutParams layoutParams12 = this.f2856a;
                    layoutParams12.f2763s = i6;
                    layoutParams12.f2762r = -1;
                } else {
                    if (i7 != 6) {
                        throw new IllegalArgumentException(androidx.concurrent.futures.a.a(new StringBuilder("right to "), K(i7), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams13 = this.f2856a;
                    layoutParams13.f2762r = i6;
                    layoutParams13.f2763s = -1;
                }
                this.f2856a.setMarginEnd(i8);
                return this;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(K(i5));
                sb.append(" to ");
                throw new IllegalArgumentException(androidx.concurrent.futures.a.a(sb, K(i7), " unknown"));
        }
    }

    public c n(int i5) {
        this.f2856a.J = i5;
        return this;
    }

    public c o(int i5) {
        this.f2856a.I = i5;
        return this;
    }

    public c p(int i5) {
        ((ViewGroup.MarginLayoutParams) this.f2856a).height = i5;
        return this;
    }

    public c q(int i5) {
        this.f2856a.N = i5;
        return this;
    }

    public c r(int i5) {
        this.f2856a.M = i5;
        return this;
    }

    public c s(int i5) {
        this.f2856a.L = i5;
        return this;
    }

    public c t(int i5) {
        this.f2856a.K = i5;
        return this;
    }

    public c u(int i5) {
        ((ViewGroup.MarginLayoutParams) this.f2856a).width = i5;
        return this;
    }

    public c v(String str) {
        this.f2856a.B = str;
        return this;
    }

    public c w(float f6) {
        this.f2857b.setElevation(f6);
        return this;
    }

    public c x(int i5, int i6) {
        switch (i5) {
            case 1:
                this.f2856a.f2764t = i6;
                return this;
            case 2:
                this.f2856a.f2766v = i6;
                return this;
            case 3:
                this.f2856a.f2765u = i6;
                return this;
            case 4:
                this.f2856a.f2767w = i6;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f2856a.f2768x = i6;
                return this;
            case 7:
                this.f2856a.f2769y = i6;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c y(float f6) {
        this.f2856a.f2770z = f6;
        return this;
    }

    public c z(int i5) {
        this.f2856a.G = i5;
        return this;
    }
}
