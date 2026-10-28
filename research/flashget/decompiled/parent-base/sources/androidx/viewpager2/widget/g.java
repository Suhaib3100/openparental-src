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
    private static final int f35662n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f35663o = 1;

    /* renamed from: p, reason: collision with root package name */
    private static final int f35664p = 2;

    /* renamed from: q, reason: collision with root package name */
    private static final int f35665q = 3;

    /* renamed from: r, reason: collision with root package name */
    private static final int f35666r = 4;

    /* renamed from: s, reason: collision with root package name */
    private static final int f35667s = -1;

    /* renamed from: a, reason: collision with root package name */
    private ViewPager2.j f35668a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final ViewPager2 f35669b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final RecyclerView f35670c;

    /* renamed from: d, reason: collision with root package name */
    @o0
    private final LinearLayoutManager f35671d;

    /* renamed from: e, reason: collision with root package name */
    private int f35672e;

    /* renamed from: f, reason: collision with root package name */
    private int f35673f;

    /* renamed from: g, reason: collision with root package name */
    private a f35674g;

    /* renamed from: h, reason: collision with root package name */
    private int f35675h;

    /* renamed from: i, reason: collision with root package name */
    private int f35676i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35677j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35678k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f35679l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f35680m;

    /* compiled from: ScrollEventAdapter.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f35681a;

        /* renamed from: b, reason: collision with root package name */
        float f35682b;

        /* renamed from: c, reason: collision with root package name */
        int f35683c;

        a() {
        }

        void a() {
            this.f35681a = -1;
            this.f35682b = 0.0f;
            this.f35683c = 0;
        }
    }

    g(@o0 ViewPager2 viewPager2) {
        this.f35669b = viewPager2;
        RecyclerView recyclerView = viewPager2.f35614k;
        this.f35670c = recyclerView;
        this.f35671d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f35674g = new a();
        o();
    }

    private void a(int i4, float f4, int i5) {
        ViewPager2.j jVar = this.f35668a;
        if (jVar != null) {
            jVar.onPageScrolled(i4, f4, i5);
        }
    }

    private void b(int i4) {
        ViewPager2.j jVar = this.f35668a;
        if (jVar != null) {
            jVar.onPageSelected(i4);
        }
    }

    private void c(int i4) {
        if ((this.f35672e == 3 && this.f35673f == 0) || this.f35673f == i4) {
            return;
        }
        this.f35673f = i4;
        ViewPager2.j jVar = this.f35668a;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i4);
        }
    }

    private int d() {
        return this.f35671d.findFirstVisibleItemPosition();
    }

    private boolean j() {
        int i4 = this.f35672e;
        return i4 == 1 || i4 == 4;
    }

    private void o() {
        this.f35672e = 0;
        this.f35673f = 0;
        this.f35674g.a();
        this.f35675h = -1;
        this.f35676i = -1;
        this.f35677j = false;
        this.f35678k = false;
        this.f35680m = false;
        this.f35679l = false;
    }

    private void q(boolean z4) {
        this.f35680m = z4;
        this.f35672e = z4 ? 4 : 1;
        int i4 = this.f35676i;
        if (i4 != -1) {
            this.f35675h = i4;
            this.f35676i = -1;
        } else if (this.f35675h == -1) {
            this.f35675h = this.f35671d.findFirstVisibleItemPosition();
        }
        c(1);
    }

    private void r() {
        int top2;
        a aVar = this.f35674g;
        int findFirstVisibleItemPosition = this.f35671d.findFirstVisibleItemPosition();
        aVar.f35681a = findFirstVisibleItemPosition;
        if (findFirstVisibleItemPosition == -1) {
            aVar.a();
            return;
        }
        View findViewByPosition = this.f35671d.findViewByPosition(findFirstVisibleItemPosition);
        if (findViewByPosition == null) {
            aVar.a();
            return;
        }
        int leftDecorationWidth = this.f35671d.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.f35671d.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.f35671d.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.f35671d.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f35671d.getOrientation() == 0) {
            top2 = (findViewByPosition.getLeft() - leftDecorationWidth) - this.f35670c.getPaddingLeft();
            if (this.f35669b.r()) {
                top2 = -top2;
            }
            height = width;
        } else {
            top2 = (findViewByPosition.getTop() - topDecorationHeight) - this.f35670c.getPaddingTop();
        }
        int i4 = -top2;
        aVar.f35683c = i4;
        if (i4 >= 0) {
            aVar.f35682b = height == 0 ? 0.0f : i4 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f35671d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f35683c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    double e() {
        r();
        a aVar = this.f35674g;
        return aVar.f35681a + aVar.f35682b;
    }

    int f() {
        return this.f35673f;
    }

    boolean g() {
        return this.f35673f == 1;
    }

    boolean h() {
        return this.f35680m;
    }

    boolean i() {
        return this.f35673f == 0;
    }

    void k() {
        this.f35672e = 4;
        q(true);
    }

    void l() {
        this.f35679l = true;
    }

    void m() {
        if (!g() || this.f35680m) {
            this.f35680m = false;
            r();
            a aVar = this.f35674g;
            if (aVar.f35683c != 0) {
                c(2);
                return;
            }
            int i4 = aVar.f35681a;
            if (i4 != this.f35675h) {
                b(i4);
            }
            c(0);
            o();
        }
    }

    void n(int i4, boolean z4) {
        this.f35672e = z4 ? 2 : 3;
        this.f35680m = false;
        boolean z5 = this.f35676i != i4;
        this.f35676i = i4;
        c(2);
        if (z5) {
            b(i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public void onScrollStateChanged(@o0 RecyclerView recyclerView, int i4) {
        if (!(this.f35672e == 1 && this.f35673f == 1) && i4 == 1) {
            q(false);
            return;
        }
        if (j() && i4 == 2) {
            if (this.f35678k) {
                c(2);
                this.f35677j = true;
                return;
            }
            return;
        }
        if (j() && i4 == 0) {
            r();
            if (this.f35678k) {
                a aVar = this.f35674g;
                if (aVar.f35683c == 0) {
                    int i5 = this.f35675h;
                    int i6 = aVar.f35681a;
                    if (i5 != i6) {
                        b(i6);
                    }
                }
            } else {
                int i7 = this.f35674g.f35681a;
                if (i7 != -1) {
                    a(i7, 0.0f, 0);
                }
            }
            c(0);
            o();
        }
        if (this.f35672e == 2 && i4 == 0 && this.f35679l) {
            r();
            a aVar2 = this.f35674g;
            if (aVar2.f35683c == 0) {
                int i10 = this.f35676i;
                int i11 = aVar2.f35681a;
                if (i10 != i11) {
                    if (i11 == -1) {
                        i11 = 0;
                    }
                    b(i11);
                }
                c(0);
                o();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if ((r5 < 0) == r3.f35669b.r()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(@androidx.annotation.o0 androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f35678k = r4
            r3.r()
            boolean r0 = r3.f35677j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f35677j = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f35669b
            boolean r6 = r6.r()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.g$a r5 = r3.f35674g
            int r6 = r5.f35683c
            if (r6 == 0) goto L29
            int r5 = r5.f35681a
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.g$a r5 = r3.f35674g
            int r5 = r5.f35681a
        L2d:
            r3.f35676i = r5
            int r6 = r3.f35675h
            if (r6 == r5) goto L45
            r3.b(r5)
            goto L45
        L37:
            int r5 = r3.f35672e
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.g$a r5 = r3.f35674g
            int r5 = r5.f35681a
            if (r5 != r1) goto L42
            r5 = r2
        L42:
            r3.b(r5)
        L45:
            androidx.viewpager2.widget.g$a r5 = r3.f35674g
            int r6 = r5.f35681a
            if (r6 != r1) goto L4c
            r6 = r2
        L4c:
            float r0 = r5.f35682b
            int r5 = r5.f35683c
            r3.a(r6, r0, r5)
            androidx.viewpager2.widget.g$a r5 = r3.f35674g
            int r6 = r5.f35681a
            int r0 = r3.f35676i
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.f35683c
            if (r5 != 0) goto L6b
            int r5 = r3.f35673f
            if (r5 == r4) goto L6b
            r3.c(r2)
            r3.o()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.g.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    void p(ViewPager2.j jVar) {
        this.f35668a = jVar;
    }
}
