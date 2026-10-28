package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes3.dex */
final class g extends RecyclerView.s {

    /* renamed from: n, reason: collision with root package name */
    private static final int f10499n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f10500o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f10501p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f10502q = 3;

    /* renamed from: r, reason: collision with root package name */
    private static final int f10503r = 4;

    /* renamed from: s, reason: collision with root package name */
    private static final int f10504s = -1;

    /* renamed from: a, reason: collision with root package name */
    private ViewPager2.j f10505a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final ViewPager2 f10506b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final RecyclerView f10507c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final LinearLayoutManager f10508d;

    /* renamed from: e, reason: collision with root package name */
    private int f10509e;

    /* renamed from: f, reason: collision with root package name */
    private int f10510f;

    /* renamed from: g, reason: collision with root package name */
    private a f10511g;

    /* renamed from: h, reason: collision with root package name */
    private int f10512h;

    /* renamed from: i, reason: collision with root package name */
    private int f10513i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10514j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10515k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10516l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10517m;

    /* compiled from: ScrollEventAdapter.java */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f10518a;

        /* renamed from: b, reason: collision with root package name */
        float f10519b;

        /* renamed from: c, reason: collision with root package name */
        int f10520c;

        a() {
        }

        void a() {
            this.f10518a = -1;
            this.f10519b = 0.0f;
            this.f10520c = 0;
        }
    }

    g(@o0 ViewPager2 viewPager2) {
        this.f10506b = viewPager2;
        RecyclerView recyclerView = viewPager2.f10461x;
        this.f10507c = recyclerView;
        this.f10508d = (LinearLayoutManager) recyclerView.H0();
        this.f10511g = new a();
        q();
    }

    private void c(int i5, float f6, int i6) {
        ViewPager2.j jVar = this.f10505a;
        if (jVar != null) {
            jVar.b(i5, f6, i6);
        }
    }

    private void d(int i5) {
        ViewPager2.j jVar = this.f10505a;
        if (jVar != null) {
            jVar.c(i5);
        }
    }

    private void e(int i5) {
        if ((this.f10509e == 3 && this.f10510f == 0) || this.f10510f == i5) {
            return;
        }
        this.f10510f = i5;
        ViewPager2.j jVar = this.f10505a;
        if (jVar != null) {
            jVar.a(i5);
        }
    }

    private int f() {
        return this.f10508d.x2();
    }

    private boolean l() {
        int i5 = this.f10509e;
        return i5 == 1 || i5 == 4;
    }

    private void q() {
        this.f10509e = 0;
        this.f10510f = 0;
        this.f10511g.a();
        this.f10512h = -1;
        this.f10513i = -1;
        this.f10514j = false;
        this.f10515k = false;
        this.f10517m = false;
        this.f10516l = false;
    }

    private void s(boolean z5) {
        this.f10517m = z5;
        this.f10509e = z5 ? 4 : 1;
        int i5 = this.f10513i;
        if (i5 != -1) {
            this.f10512h = i5;
            this.f10513i = -1;
        } else if (this.f10512h == -1) {
            this.f10512h = f();
        }
        e(1);
    }

    private void t() {
        int top;
        a aVar = this.f10511g;
        int x22 = this.f10508d.x2();
        aVar.f10518a = x22;
        if (x22 == -1) {
            aVar.a();
            return;
        }
        View J = this.f10508d.J(x22);
        if (J == null) {
            aVar.a();
            return;
        }
        int j02 = this.f10508d.j0(J);
        int u02 = this.f10508d.u0(J);
        int x02 = this.f10508d.x0(J);
        int O = this.f10508d.O(J);
        ViewGroup.LayoutParams layoutParams = J.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            j02 += marginLayoutParams.leftMargin;
            u02 += marginLayoutParams.rightMargin;
            x02 += marginLayoutParams.topMargin;
            O += marginLayoutParams.bottomMargin;
        }
        int height = J.getHeight() + x02 + O;
        int width = J.getWidth() + j02 + u02;
        if (this.f10508d.M2() == 0) {
            top = (J.getLeft() - j02) - this.f10507c.getPaddingLeft();
            if (this.f10506b.r()) {
                top = -top;
            }
            height = width;
        } else {
            top = (J.getTop() - x02) - this.f10507c.getPaddingTop();
        }
        int i5 = -top;
        aVar.f10520c = i5;
        if (i5 >= 0) {
            aVar.f10519b = height == 0 ? 0.0f : i5 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f10508d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f10520c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void a(@o0 RecyclerView recyclerView, int i5) {
        boolean z5 = true;
        if (!(this.f10509e == 1 && this.f10510f == 1) && i5 == 1) {
            s(false);
            return;
        }
        if (l() && i5 == 2) {
            if (this.f10515k) {
                e(2);
                this.f10514j = true;
                return;
            }
            return;
        }
        if (l() && i5 == 0) {
            t();
            if (this.f10515k) {
                a aVar = this.f10511g;
                if (aVar.f10520c == 0) {
                    int i6 = this.f10512h;
                    int i7 = aVar.f10518a;
                    if (i6 != i7) {
                        d(i7);
                    }
                } else {
                    z5 = false;
                }
            } else {
                int i8 = this.f10511g.f10518a;
                if (i8 != -1) {
                    c(i8, 0.0f, 0);
                }
            }
            if (z5) {
                e(0);
                q();
            }
        }
        if (this.f10509e == 2 && i5 == 0 && this.f10516l) {
            t();
            a aVar2 = this.f10511g;
            if (aVar2.f10520c == 0) {
                int i9 = this.f10513i;
                int i10 = aVar2.f10518a;
                if (i9 != i10) {
                    if (i10 == -1) {
                        i10 = 0;
                    }
                    d(i10);
                }
                e(0);
                q();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r5 < 0) == r3.f10506b.r()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(@androidx.annotation.o0 androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f10515k = r4
            r3.t()
            boolean r0 = r3.f10514j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3d
            r3.f10514j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f10506b
            boolean r6 = r6.r()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = r2
            goto L23
        L22:
            r5 = r4
        L23:
            if (r5 == 0) goto L2f
            androidx.viewpager2.widget.g$a r5 = r3.f10511g
            int r6 = r5.f10520c
            if (r6 == 0) goto L2f
            int r5 = r5.f10518a
            int r5 = r5 + r4
            goto L33
        L2f:
            androidx.viewpager2.widget.g$a r5 = r3.f10511g
            int r5 = r5.f10518a
        L33:
            r3.f10513i = r5
            int r6 = r3.f10512h
            if (r6 == r5) goto L4b
            r3.d(r5)
            goto L4b
        L3d:
            int r5 = r3.f10509e
            if (r5 != 0) goto L4b
            androidx.viewpager2.widget.g$a r5 = r3.f10511g
            int r5 = r5.f10518a
            if (r5 != r1) goto L48
            r5 = r2
        L48:
            r3.d(r5)
        L4b:
            androidx.viewpager2.widget.g$a r5 = r3.f10511g
            int r6 = r5.f10518a
            if (r6 != r1) goto L52
            r6 = r2
        L52:
            float r0 = r5.f10519b
            int r5 = r5.f10520c
            r3.c(r6, r0, r5)
            androidx.viewpager2.widget.g$a r5 = r3.f10511g
            int r6 = r5.f10518a
            int r0 = r3.f10513i
            if (r6 == r0) goto L63
            if (r0 != r1) goto L71
        L63:
            int r5 = r5.f10520c
            if (r5 != 0) goto L71
            int r5 = r3.f10510f
            if (r5 == r4) goto L71
            r3.e(r2)
            r3.q()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.g.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    double g() {
        t();
        a aVar = this.f10511g;
        return aVar.f10518a + aVar.f10519b;
    }

    int h() {
        return this.f10510f;
    }

    boolean i() {
        return this.f10510f == 1;
    }

    boolean j() {
        return this.f10517m;
    }

    boolean k() {
        return this.f10510f == 0;
    }

    void m() {
        this.f10509e = 4;
        s(true);
    }

    void n() {
        this.f10516l = true;
    }

    void o() {
        if (!i() || this.f10517m) {
            this.f10517m = false;
            t();
            a aVar = this.f10511g;
            if (aVar.f10520c != 0) {
                e(2);
                return;
            }
            int i5 = aVar.f10518a;
            if (i5 != this.f10512h) {
                d(i5);
            }
            e(0);
            q();
        }
    }

    void p(int i5, boolean z5) {
        this.f10509e = z5 ? 2 : 3;
        this.f10517m = false;
        boolean z6 = this.f10513i != i5;
        this.f10513i = i5;
        e(2);
        if (z6) {
            d(i5);
        }
    }

    void r(ViewPager2.j jVar) {
        this.f10505a = jVar;
    }
}
