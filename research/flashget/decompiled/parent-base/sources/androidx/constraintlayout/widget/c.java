package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: ConstraintProperties.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static final int f23951c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f23952d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f23953e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f23954f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f23955g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f23956h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f23957i = 7;

    /* renamed from: j, reason: collision with root package name */
    public static final int f23958j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f23959k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f23960l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f23961m = -2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f23962n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f23963o = 0;

    /* renamed from: a, reason: collision with root package name */
    ConstraintLayout.LayoutParams f23964a;

    /* renamed from: b, reason: collision with root package name */
    View f23965b;

    public c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f23964a = (ConstraintLayout.LayoutParams) layoutParams;
        this.f23965b = view;
    }

    private String K(int side) {
        switch (side) {
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

    public c A(float weight) {
        this.f23964a.M = weight;
        return this;
    }

    public c B(int anchor, int value) {
        switch (anchor) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f23964a).leftMargin = value;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f23964a).rightMargin = value;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f23964a).topMargin = value;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f23964a).bottomMargin = value;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f23964a.setMarginStart(value);
                return this;
            case 7:
                this.f23964a.setMarginEnd(value);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c C(int anchor) {
        switch (anchor) {
            case 1:
                ConstraintLayout.LayoutParams layoutParams = this.f23964a;
                layoutParams.f23839g = -1;
                layoutParams.f23837f = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
                layoutParams.f23862x = Integer.MIN_VALUE;
                return this;
            case 2:
                ConstraintLayout.LayoutParams layoutParams2 = this.f23964a;
                layoutParams2.f23843i = -1;
                layoutParams2.f23841h = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = -1;
                layoutParams2.f23864z = Integer.MIN_VALUE;
                return this;
            case 3:
                ConstraintLayout.LayoutParams layoutParams3 = this.f23964a;
                layoutParams3.f23847k = -1;
                layoutParams3.f23845j = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = -1;
                layoutParams3.f23863y = Integer.MIN_VALUE;
                return this;
            case 4:
                ConstraintLayout.LayoutParams layoutParams4 = this.f23964a;
                layoutParams4.f23849l = -1;
                layoutParams4.f23851m = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = -1;
                layoutParams4.A = Integer.MIN_VALUE;
                return this;
            case 5:
                this.f23964a.f23852n = -1;
                return this;
            case 6:
                ConstraintLayout.LayoutParams layoutParams5 = this.f23964a;
                layoutParams5.f23858t = -1;
                layoutParams5.f23859u = -1;
                layoutParams5.setMarginStart(-1);
                this.f23964a.B = Integer.MIN_VALUE;
                return this;
            case 7:
                ConstraintLayout.LayoutParams layoutParams6 = this.f23964a;
                layoutParams6.f23860v = -1;
                layoutParams6.f23861w = -1;
                layoutParams6.setMarginEnd(-1);
                this.f23964a.C = Integer.MIN_VALUE;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c D() {
        ConstraintLayout.LayoutParams layoutParams = this.f23964a;
        int i4 = layoutParams.f23839g;
        int i5 = layoutParams.f23841h;
        if (i4 == -1 && i5 == -1) {
            int i6 = layoutParams.f23858t;
            int i7 = layoutParams.f23860v;
            if (i6 != -1 || i7 != -1) {
                c cVar = new c(((ViewGroup) this.f23965b.getParent()).findViewById(i6));
                c cVar2 = new c(((ViewGroup) this.f23965b.getParent()).findViewById(i7));
                ConstraintLayout.LayoutParams layoutParams2 = this.f23964a;
                if (i6 != -1 && i7 != -1) {
                    cVar.m(7, i7, 6, 0);
                    cVar2.m(6, i4, 7, 0);
                } else if (i4 != -1 || i7 != -1) {
                    int i10 = layoutParams2.f23843i;
                    if (i10 != -1) {
                        cVar.m(7, i10, 7, 0);
                    } else {
                        int i11 = layoutParams2.f23837f;
                        if (i11 != -1) {
                            cVar2.m(6, i11, 6, 0);
                        }
                    }
                }
            }
            C(6);
            C(7);
        } else {
            c cVar3 = new c(((ViewGroup) this.f23965b.getParent()).findViewById(i4));
            c cVar4 = new c(((ViewGroup) this.f23965b.getParent()).findViewById(i5));
            ConstraintLayout.LayoutParams layoutParams3 = this.f23964a;
            if (i4 != -1 && i5 != -1) {
                cVar3.m(2, i5, 1, 0);
                cVar4.m(1, i4, 2, 0);
            } else if (i4 != -1 || i5 != -1) {
                int i12 = layoutParams3.f23843i;
                if (i12 != -1) {
                    cVar3.m(2, i12, 2, 0);
                } else {
                    int i13 = layoutParams3.f23837f;
                    if (i13 != -1) {
                        cVar4.m(1, i13, 1, 0);
                    }
                }
            }
            C(1);
            C(2);
        }
        return this;
    }

    public c E() {
        ConstraintLayout.LayoutParams layoutParams = this.f23964a;
        int i4 = layoutParams.f23847k;
        int i5 = layoutParams.f23849l;
        if (i4 != -1 || i5 != -1) {
            c cVar = new c(((ViewGroup) this.f23965b.getParent()).findViewById(i4));
            c cVar2 = new c(((ViewGroup) this.f23965b.getParent()).findViewById(i5));
            ConstraintLayout.LayoutParams layoutParams2 = this.f23964a;
            if (i4 != -1 && i5 != -1) {
                cVar.m(4, i5, 3, 0);
                cVar2.m(3, i4, 4, 0);
            } else if (i4 != -1 || i5 != -1) {
                int i6 = layoutParams2.f23851m;
                if (i6 != -1) {
                    cVar.m(4, i6, 4, 0);
                } else {
                    int i7 = layoutParams2.f23845j;
                    if (i7 != -1) {
                        cVar2.m(3, i7, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public c F(float rotation) {
        this.f23965b.setRotation(rotation);
        return this;
    }

    public c G(float rotationX) {
        this.f23965b.setRotationX(rotationX);
        return this;
    }

    public c H(float rotationY) {
        this.f23965b.setRotationY(rotationY);
        return this;
    }

    public c I(float scaleX) {
        this.f23965b.setScaleY(scaleX);
        return this;
    }

    public c J(float scaleY) {
        return this;
    }

    public c L(float transformPivotX, float transformPivotY) {
        this.f23965b.setPivotX(transformPivotX);
        this.f23965b.setPivotY(transformPivotY);
        return this;
    }

    public c M(float transformPivotX) {
        this.f23965b.setPivotX(transformPivotX);
        return this;
    }

    public c N(float transformPivotY) {
        this.f23965b.setPivotY(transformPivotY);
        return this;
    }

    public c O(float translationX, float translationY) {
        this.f23965b.setTranslationX(translationX);
        this.f23965b.setTranslationY(translationY);
        return this;
    }

    public c P(float translationX) {
        this.f23965b.setTranslationX(translationX);
        return this;
    }

    public c Q(float translationY) {
        this.f23965b.setTranslationY(translationY);
        return this;
    }

    public c R(float translationZ) {
        this.f23965b.setTranslationZ(translationZ);
        return this;
    }

    public c S(float bias) {
        this.f23964a.I = bias;
        return this;
    }

    public c T(int chainStyle) {
        this.f23964a.P = chainStyle;
        return this;
    }

    public c U(float weight) {
        this.f23964a.N = weight;
        return this;
    }

    public c V(int visibility) {
        this.f23965b.setVisibility(visibility);
        return this;
    }

    public c a(int leftId, int rightId) {
        m(1, leftId, leftId == 0 ? 1 : 2, 0);
        m(2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            new c(((ViewGroup) this.f23965b.getParent()).findViewById(leftId)).m(2, this.f23965b.getId(), 1, 0);
        }
        if (rightId != 0) {
            new c(((ViewGroup) this.f23965b.getParent()).findViewById(rightId)).m(1, this.f23965b.getId(), 2, 0);
        }
        return this;
    }

    public c b(int leftId, int rightId) {
        m(6, leftId, leftId == 0 ? 6 : 7, 0);
        m(7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            new c(((ViewGroup) this.f23965b.getParent()).findViewById(leftId)).m(7, this.f23965b.getId(), 6, 0);
        }
        if (rightId != 0) {
            new c(((ViewGroup) this.f23965b.getParent()).findViewById(rightId)).m(6, this.f23965b.getId(), 7, 0);
        }
        return this;
    }

    public c c(int topId, int bottomId) {
        m(3, topId, topId == 0 ? 3 : 4, 0);
        m(4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            new c(((ViewGroup) this.f23965b.getParent()).findViewById(topId)).m(4, this.f23965b.getId(), 3, 0);
        }
        if (bottomId != 0) {
            new c(((ViewGroup) this.f23965b.getParent()).findViewById(bottomId)).m(3, this.f23965b.getId(), 4, 0);
        }
        return this;
    }

    public c d(float alpha) {
        this.f23965b.setAlpha(alpha);
        return this;
    }

    public void e() {
    }

    public c f(int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        if (firstMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (secondMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (bias <= 0.0f || bias > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (firstSide == 1 || firstSide == 2) {
            m(1, firstID, firstSide, firstMargin);
            m(2, secondId, secondSide, secondMargin);
            this.f23964a.H = bias;
        } else if (firstSide == 6 || firstSide == 7) {
            m(6, firstID, firstSide, firstMargin);
            m(7, secondId, secondSide, secondMargin);
            this.f23964a.H = bias;
        } else {
            m(3, firstID, firstSide, firstMargin);
            m(4, secondId, secondSide, secondMargin);
            this.f23964a.I = bias;
        }
        return this;
    }

    public c g(int toView) {
        if (toView == 0) {
            f(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            f(toView, 2, 0, toView, 1, 0, 0.5f);
        }
        return this;
    }

    public c h(int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        m(1, leftId, leftSide, leftMargin);
        m(2, rightId, rightSide, rightMargin);
        this.f23964a.H = bias;
        return this;
    }

    public c i(int toView) {
        if (toView == 0) {
            f(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            f(toView, 7, 0, toView, 6, 0, 0.5f);
        }
        return this;
    }

    public c j(int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        m(6, startId, startSide, startMargin);
        m(7, endId, endSide, endMargin);
        this.f23964a.H = bias;
        return this;
    }

    public c k(int toView) {
        if (toView == 0) {
            f(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            f(toView, 4, 0, toView, 3, 0, 0.5f);
        }
        return this;
    }

    public c l(int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        m(3, topId, topSide, topMargin);
        m(4, bottomId, bottomSide, bottomMargin);
        this.f23964a.I = bias;
        return this;
    }

    public c m(int startSide, int endID, int endSide, int margin) {
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    ConstraintLayout.LayoutParams layoutParams = this.f23964a;
                    layoutParams.f23837f = endID;
                    layoutParams.f23839g = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("Left to "), K(endSide), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = this.f23964a;
                    layoutParams2.f23839g = endID;
                    layoutParams2.f23837f = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f23964a).leftMargin = margin;
                return this;
            case 2:
                if (endSide == 1) {
                    ConstraintLayout.LayoutParams layoutParams3 = this.f23964a;
                    layoutParams3.f23841h = endID;
                    layoutParams3.f23843i = -1;
                } else {
                    if (endSide != 2) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), K(endSide), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams4 = this.f23964a;
                    layoutParams4.f23843i = endID;
                    layoutParams4.f23841h = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f23964a).rightMargin = margin;
                return this;
            case 3:
                if (endSide == 3) {
                    ConstraintLayout.LayoutParams layoutParams5 = this.f23964a;
                    layoutParams5.f23845j = endID;
                    layoutParams5.f23847k = -1;
                    layoutParams5.f23852n = -1;
                    layoutParams5.f23853o = -1;
                    layoutParams5.f23854p = -1;
                } else {
                    if (endSide != 4) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), K(endSide), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams6 = this.f23964a;
                    layoutParams6.f23847k = endID;
                    layoutParams6.f23845j = -1;
                    layoutParams6.f23852n = -1;
                    layoutParams6.f23853o = -1;
                    layoutParams6.f23854p = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f23964a).topMargin = margin;
                return this;
            case 4:
                if (endSide == 4) {
                    ConstraintLayout.LayoutParams layoutParams7 = this.f23964a;
                    layoutParams7.f23851m = endID;
                    layoutParams7.f23849l = -1;
                    layoutParams7.f23852n = -1;
                    layoutParams7.f23853o = -1;
                    layoutParams7.f23854p = -1;
                } else {
                    if (endSide != 3) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), K(endSide), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams8 = this.f23964a;
                    layoutParams8.f23849l = endID;
                    layoutParams8.f23851m = -1;
                    layoutParams8.f23852n = -1;
                    layoutParams8.f23853o = -1;
                    layoutParams8.f23854p = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f23964a).bottomMargin = margin;
                return this;
            case 5:
                if (endSide == 5) {
                    ConstraintLayout.LayoutParams layoutParams9 = this.f23964a;
                    layoutParams9.f23852n = endID;
                    layoutParams9.f23851m = -1;
                    layoutParams9.f23849l = -1;
                    layoutParams9.f23845j = -1;
                    layoutParams9.f23847k = -1;
                }
                if (endSide == 3) {
                    ConstraintLayout.LayoutParams layoutParams10 = this.f23964a;
                    layoutParams10.f23853o = endID;
                    layoutParams10.f23851m = -1;
                    layoutParams10.f23849l = -1;
                    layoutParams10.f23845j = -1;
                    layoutParams10.f23847k = -1;
                } else {
                    if (endSide != 4) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), K(endSide), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams11 = this.f23964a;
                    layoutParams11.f23854p = endID;
                    layoutParams11.f23851m = -1;
                    layoutParams11.f23849l = -1;
                    layoutParams11.f23845j = -1;
                    layoutParams11.f23847k = -1;
                }
                this.f23964a.E = margin;
                return this;
            case 6:
                if (endSide == 6) {
                    ConstraintLayout.LayoutParams layoutParams12 = this.f23964a;
                    layoutParams12.f23859u = endID;
                    layoutParams12.f23858t = -1;
                } else {
                    if (endSide != 7) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), K(endSide), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams13 = this.f23964a;
                    layoutParams13.f23858t = endID;
                    layoutParams13.f23859u = -1;
                }
                this.f23964a.setMarginStart(margin);
                return this;
            case 7:
                if (endSide == 7) {
                    ConstraintLayout.LayoutParams layoutParams14 = this.f23964a;
                    layoutParams14.f23861w = endID;
                    layoutParams14.f23860v = -1;
                } else {
                    if (endSide != 6) {
                        throw new IllegalArgumentException(android.support.v4.media.c.a(new StringBuilder("right to "), K(endSide), " undefined"));
                    }
                    ConstraintLayout.LayoutParams layoutParams15 = this.f23964a;
                    layoutParams15.f23860v = endID;
                    layoutParams15.f23861w = -1;
                }
                this.f23964a.setMarginEnd(margin);
                return this;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(K(startSide));
                sb.append(" to ");
                throw new IllegalArgumentException(android.support.v4.media.c.a(sb, K(endSide), " unknown"));
        }
    }

    public c n(int height) {
        this.f23964a.R = height;
        return this;
    }

    public c o(int width) {
        this.f23964a.Q = width;
        return this;
    }

    public c p(int height) {
        ((ViewGroup.MarginLayoutParams) this.f23964a).height = height;
        return this;
    }

    public c q(int height) {
        this.f23964a.Q1 = height;
        return this;
    }

    public c r(int width) {
        this.f23964a.Z = width;
        return this;
    }

    public c s(int height) {
        this.f23964a.Y = height;
        return this;
    }

    public c t(int width) {
        this.f23964a.X = width;
        return this;
    }

    public c u(int width) {
        ((ViewGroup.MarginLayoutParams) this.f23964a).width = width;
        return this;
    }

    public c v(String ratio) {
        this.f23964a.J = ratio;
        return this;
    }

    public c w(float elevation) {
        this.f23965b.setElevation(elevation);
        return this;
    }

    public c x(int anchor, int value) {
        switch (anchor) {
            case 1:
                this.f23964a.f23862x = value;
                return this;
            case 2:
                this.f23964a.f23864z = value;
                return this;
            case 3:
                this.f23964a.f23863y = value;
                return this;
            case 4:
                this.f23964a.A = value;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f23964a.B = value;
                return this;
            case 7:
                this.f23964a.C = value;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public c y(float bias) {
        this.f23964a.H = bias;
        return this;
    }

    public c z(int chainStyle) {
        this.f23964a.O = chainStyle;
        return this;
    }
}
