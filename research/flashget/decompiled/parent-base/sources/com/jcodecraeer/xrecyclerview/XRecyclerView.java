package com.jcodecraeer.xrecyclerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.o0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.appbar.AppBarLayout;
import com.jcodecraeer.xrecyclerview.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class XRecyclerView extends RecyclerView {

    /* renamed from: v, reason: collision with root package name */
    private static final int f64869v = 10000;

    /* renamed from: w, reason: collision with root package name */
    private static final int f64870w = 10001;

    /* renamed from: x, reason: collision with root package name */
    private static final int f64871x = 10002;

    /* renamed from: y, reason: collision with root package name */
    private static List<Integer> f64872y = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f64873b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f64874c;

    /* renamed from: d, reason: collision with root package name */
    private int f64875d;

    /* renamed from: e, reason: collision with root package name */
    private int f64876e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<View> f64877f;

    /* renamed from: g, reason: collision with root package name */
    private g f64878g;

    /* renamed from: h, reason: collision with root package name */
    private float f64879h;

    /* renamed from: i, reason: collision with root package name */
    private float f64880i;

    /* renamed from: j, reason: collision with root package name */
    private com.jcodecraeer.xrecyclerview.d f64881j;

    /* renamed from: k, reason: collision with root package name */
    private e f64882k;

    /* renamed from: l, reason: collision with root package name */
    private ArrowRefreshHeader f64883l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f64884m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f64885n;

    /* renamed from: o, reason: collision with root package name */
    private View f64886o;

    /* renamed from: p, reason: collision with root package name */
    private View f64887p;

    /* renamed from: q, reason: collision with root package name */
    private final RecyclerView.j f64888q;

    /* renamed from: r, reason: collision with root package name */
    private a.EnumC0973a f64889r;

    /* renamed from: s, reason: collision with root package name */
    private int f64890s;

    /* renamed from: t, reason: collision with root package name */
    private int f64891t;

    /* renamed from: u, reason: collision with root package name */
    private f f64892u;

    class a extends GridLayoutManager.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f64893a;

        a(GridLayoutManager gridLayoutManager) {
            this.f64893a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int getSpanSize(int i4) {
            if (XRecyclerView.this.f64878g.h(i4) || XRecyclerView.this.f64878g.g(i4) || XRecyclerView.this.f64878g.i(i4)) {
                return this.f64893a.M();
            }
            return 1;
        }
    }

    class b extends com.jcodecraeer.xrecyclerview.a {
        b() {
        }

        @Override // com.jcodecraeer.xrecyclerview.a
        public void b(AppBarLayout appBarLayout, a.EnumC0973a enumC0973a) {
            XRecyclerView.this.f64889r = enumC0973a;
        }
    }

    private class c extends RecyclerView.j {
        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            if (XRecyclerView.this.f64878g != null) {
                XRecyclerView.this.f64878g.notifyDataSetChanged();
            }
            if (XRecyclerView.this.f64878g == null || XRecyclerView.this.f64886o == null) {
                return;
            }
            int e4 = XRecyclerView.this.f64878g.e();
            int i4 = e4 + 1;
            if (XRecyclerView.this.f64885n) {
                i4 = e4 + 2;
            }
            if (XRecyclerView.this.f64878g.getItemCount() == i4) {
                XRecyclerView.this.f64886o.setVisibility(0);
                XRecyclerView.this.setVisibility(8);
            } else {
                XRecyclerView.this.f64886o.setVisibility(8);
                XRecyclerView.this.setVisibility(0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i4, int i5) {
            XRecyclerView.this.f64878g.notifyItemRangeChanged(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i4, int i5, Object obj) {
            XRecyclerView.this.f64878g.notifyItemRangeChanged(i4, i5, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i4, int i5) {
            XRecyclerView.this.f64878g.notifyItemRangeInserted(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i4, int i5, int i6) {
            XRecyclerView.this.f64878g.notifyItemMoved(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i4, int i5) {
            XRecyclerView.this.f64878g.notifyItemRangeRemoved(i4, i5);
        }

        private c() {
        }
    }

    public class d extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f64897a;

        /* renamed from: b, reason: collision with root package name */
        private int f64898b;

        public d(Drawable drawable) {
            this.f64897a = drawable;
        }

        private void c(Canvas canvas, RecyclerView recyclerView) {
            int paddingTop = recyclerView.getPaddingTop();
            int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            for (int i4 = 0; i4 < childCount - 1; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                int marginEnd = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).getMarginEnd() + childAt.getRight();
                this.f64897a.setBounds(marginEnd, paddingTop, this.f64897a.getIntrinsicWidth() + marginEnd, height);
                this.f64897a.draw(canvas);
            }
        }

        private void d(Canvas canvas, RecyclerView recyclerView) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i4 = 0; i4 < childCount - 1; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                this.f64897a.setBounds(paddingLeft, bottom, width, this.f64897a.getIntrinsicHeight() + bottom);
                this.f64897a.draw(canvas);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            if (recyclerView.getChildAdapterPosition(view) <= XRecyclerView.this.f64878g.e() + 1) {
                return;
            }
            int orientation = ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
            this.f64898b = orientation;
            if (orientation == 0) {
                rect.left = this.f64897a.getIntrinsicWidth();
            } else if (orientation == 1) {
                rect.top = this.f64897a.getIntrinsicHeight();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int i4 = this.f64898b;
            if (i4 == 0) {
                c(canvas, recyclerView);
            } else if (i4 == 1) {
                d(canvas, recyclerView);
            }
        }
    }

    public interface e {
        void a();

        void onLoadMore();
    }

    public interface f {
        void a(int i4);

        int b();
    }

    public XRecyclerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A(int i4) {
        return i4 == 10000 || i4 == 10001 || f64872y.contains(Integer.valueOf(i4));
    }

    private int p(int[] iArr) {
        int i4 = iArr[0];
        for (int i5 : iArr) {
            if (i5 > i4) {
                i4 = i5;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View u(int i4) {
        ArrayList<View> arrayList;
        if (x(i4) && (arrayList = this.f64877f) != null) {
            return arrayList.get(i4 - 10002);
        }
        return null;
    }

    private void w() {
        if (this.f64884m) {
            ArrowRefreshHeader arrowRefreshHeader = new ArrowRefreshHeader(getContext());
            this.f64883l = arrowRefreshHeader;
            arrowRefreshHeader.n(this.f64875d);
        }
        LoadingMoreFooter loadingMoreFooter = new LoadingMoreFooter(getContext());
        loadingMoreFooter.f(this.f64876e);
        this.f64887p = loadingMoreFooter;
        loadingMoreFooter.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x(int i4) {
        ArrayList<View> arrayList = this.f64877f;
        return arrayList != null && f64872y != null && arrayList.size() > 0 && f64872y.contains(Integer.valueOf(i4));
    }

    private boolean y() {
        ArrowRefreshHeader arrowRefreshHeader = this.f64883l;
        return (arrowRefreshHeader == null || arrowRefreshHeader.getParent() == null) ? false : true;
    }

    public void B() {
        this.f64873b = false;
        U(false);
        View view = this.f64887p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).g(1);
            return;
        }
        com.jcodecraeer.xrecyclerview.d dVar = this.f64881j;
        if (dVar != null) {
            dVar.c(view);
        }
    }

    public void C(int i4) {
        if (this.f64878g.f64900b == null) {
            return;
        }
        this.f64878g.f64900b.notifyItemChanged(v() + i4);
    }

    public void D(int i4, Object obj) {
        if (this.f64878g.f64900b == null) {
            return;
        }
        this.f64878g.f64900b.notifyItemChanged(v() + i4, obj);
    }

    public <T> void E(List<T> list, int i4) {
        if (this.f64878g.f64900b == null) {
            return;
        }
        int v4 = v();
        this.f64878g.f64900b.notifyItemInserted(i4 + v4);
        this.f64878g.f64900b.notifyItemRangeChanged(v4, list.size(), new Object());
    }

    public <T> void F(List<T> list, int i4) {
        if (this.f64878g.f64900b == null) {
            return;
        }
        int v4 = v();
        this.f64878g.f64900b.notifyItemRemoved(i4 + v4);
        this.f64878g.f64900b.notifyItemRangeChanged(v4, list.size(), new Object());
    }

    public void G() {
        if (!this.f64884m || this.f64882k == null) {
            return;
        }
        this.f64883l.q(2);
        this.f64882k.a();
    }

    public void H() {
        ArrowRefreshHeader arrowRefreshHeader = this.f64883l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.c();
        }
        U(false);
    }

    public void I() {
        ArrayList<View> arrayList = this.f64877f;
        if (arrayList == null || f64872y == null) {
            return;
        }
        arrayList.clear();
        g gVar = this.f64878g;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    public void J(@o0 View view) {
        ArrayList<View> arrayList = this.f64877f;
        if (arrayList == null || f64872y == null || view == null) {
            return;
        }
        Iterator<View> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            if (next == view) {
                this.f64877f.remove(next);
                break;
            }
        }
        g gVar = this.f64878g;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    public void K() {
        U(false);
        B();
        H();
    }

    public void L(int i4) {
        ArrowRefreshHeader arrowRefreshHeader = this.f64883l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.m(i4);
        }
    }

    public void M(float f4) {
        if (f4 <= 0.5d) {
            return;
        }
        this.f64880i = f4;
    }

    @Deprecated
    public void N(View view) {
        this.f64886o = view;
        this.f64888q.a();
    }

    public void O(@o0 View view, @o0 com.jcodecraeer.xrecyclerview.d dVar) {
        if (view == null || dVar == null) {
            return;
        }
        this.f64887p = view;
        this.f64881j = dVar;
    }

    public void P(String str, String str2) {
        View view = this.f64887p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).d(str);
            ((LoadingMoreFooter) this.f64887p).e(str2);
        }
    }

    public void Q(int i4) {
        this.f64890s = i4;
    }

    public void R(e eVar) {
        this.f64882k = eVar;
    }

    public void S(boolean z4) {
        this.f64885n = z4;
        if (z4) {
            return;
        }
        View view = this.f64887p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).g(1);
        }
    }

    public void T(int i4) {
        this.f64876e = i4;
        View view = this.f64887p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).f(i4);
        }
    }

    public void U(boolean z4) {
        this.f64873b = false;
        this.f64874c = z4;
        View view = this.f64887p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).g(z4 ? 2 : 1);
            return;
        }
        com.jcodecraeer.xrecyclerview.d dVar = this.f64881j;
        if (dVar != null) {
            dVar.b(view, z4);
        }
    }

    public void V(boolean z4) {
        this.f64884m = z4;
    }

    public void W(ArrowRefreshHeader arrowRefreshHeader) {
        this.f64883l = arrowRefreshHeader;
    }

    public void X(int i4) {
        this.f64875d = i4;
        ArrowRefreshHeader arrowRefreshHeader = this.f64883l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.n(i4);
        }
    }

    public void Y(String str) {
        ArrowRefreshHeader arrowRefreshHeader = this.f64883l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.s(str);
        }
    }

    public void Z(Boolean bool) {
        ArrowRefreshHeader arrowRefreshHeader = this.f64883l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.p(bool);
        }
    }

    public void a0(f fVar) {
        this.f64892u = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public RecyclerView.h getAdapter() {
        g gVar = this.f64878g;
        if (gVar != null) {
            return gVar.f();
        }
        return null;
    }

    public void n(View view) {
        List<Integer> list;
        ArrayList<View> arrayList = this.f64877f;
        if (arrayList == null || (list = f64872y) == null) {
            return;
        }
        list.add(Integer.valueOf(arrayList.size() + f64871x));
        this.f64877f.add(view);
        g gVar = this.f64878g;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    public void o() {
        ArrayList<View> arrayList = this.f64877f;
        if (arrayList != null) {
            arrayList.clear();
            this.f64877f = null;
        }
        View view = this.f64887p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).a();
            this.f64887p = null;
        }
        ArrowRefreshHeader arrowRefreshHeader = this.f64883l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.d();
            this.f64883l = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        AppBarLayout appBarLayout;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (parent != null && !(parent instanceof CoordinatorLayout)) {
            parent = parent.getParent();
        }
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    appBarLayout = null;
                    break;
                }
                View childAt = coordinatorLayout.getChildAt(childCount);
                if (childAt instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) childAt;
                    break;
                }
                childCount--;
            }
            if (appBarLayout != null) {
                appBarLayout.c(new b());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        try {
            super.onLayout(z4, i4, i5, i6, i7);
        } catch (Exception e4) {
            e4.getMessage();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i4) {
        int findLastVisibleItemPosition;
        super.onScrollStateChanged(i4);
        if (i4 != 0 || this.f64882k == null || this.f64873b || !this.f64885n) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            findLastVisibleItemPosition = ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.h0()];
            staggeredGridLayoutManager.W(iArr);
            findLastVisibleItemPosition = p(iArr);
        } else {
            findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        int v4 = v() + layoutManager.getItemCount();
        ArrowRefreshHeader arrowRefreshHeader = this.f64883l;
        int h4 = arrowRefreshHeader != null ? arrowRefreshHeader.h() : 3;
        if (layoutManager.getChildCount() <= 0 || findLastVisibleItemPosition < v4 - this.f64890s || v4 < layoutManager.getChildCount() || this.f64874c || h4 >= 2) {
            return;
        }
        this.f64873b = true;
        View view = this.f64887p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).g(0);
        } else {
            com.jcodecraeer.xrecyclerview.d dVar = this.f64881j;
            if (dVar != null) {
                dVar.a(view);
            }
        }
        this.f64882k.onLoadMore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i4, int i5) {
        super.onScrolled(i4, i5);
        f fVar = this.f64892u;
        if (fVar == null) {
            return;
        }
        int b5 = fVar.b();
        int i6 = this.f64891t + i5;
        this.f64891t = i6;
        if (i6 <= 0) {
            this.f64892u.a(0);
        } else if (i6 > b5 || i6 <= 0) {
            this.f64892u.a(255);
        } else {
            this.f64892u.a((int) ((i6 / b5) * 255.0f));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ArrowRefreshHeader arrowRefreshHeader;
        ArrowRefreshHeader arrowRefreshHeader2;
        e eVar;
        if (this.f64879h == -1.0f) {
            this.f64879h = motionEvent.getRawY();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f64879h = motionEvent.getRawY();
        } else if (action != 2) {
            this.f64879h = -1.0f;
            if (y() && this.f64884m && this.f64889r == a.EnumC0973a.EXPANDED && (arrowRefreshHeader2 = this.f64883l) != null && arrowRefreshHeader2.b() && (eVar = this.f64882k) != null) {
                eVar.a();
            }
        } else {
            float rawY = motionEvent.getRawY() - this.f64879h;
            this.f64879h = motionEvent.getRawY();
            if (y() && this.f64884m && this.f64889r == a.EnumC0973a.EXPANDED && (arrowRefreshHeader = this.f64883l) != null) {
                arrowRefreshHeader.a(rawY / this.f64880i);
                if (this.f64883l.i() > 0 && this.f64883l.h() < 2) {
                    return false;
                }
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e4) {
            e4.printStackTrace();
            return true;
        }
    }

    public LoadingMoreFooter q() {
        View view = this.f64887p;
        if (view != null && (view instanceof LoadingMoreFooter)) {
            return (LoadingMoreFooter) view;
        }
        return null;
    }

    public ArrowRefreshHeader r() {
        ArrowRefreshHeader arrowRefreshHeader = this.f64883l;
        if (arrowRefreshHeader == null) {
            return null;
        }
        return arrowRefreshHeader;
    }

    @Deprecated
    public View s() {
        return this.f64886o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i4) {
        super.scrollToPosition(i4);
        if (i4 == 0) {
            this.f64891t = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.h hVar) {
        g gVar = new g(hVar);
        this.f64878g = gVar;
        super.setAdapter(gVar);
        hVar.registerAdapterDataObserver(this.f64888q);
        this.f64888q.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        if (this.f64878g == null || !(layoutManager instanceof GridLayoutManager)) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        gridLayoutManager.W(new a(gridLayoutManager));
    }

    public View t() {
        return this.f64887p;
    }

    public int v() {
        g gVar = this.f64878g;
        if (gVar == null) {
            return 0;
        }
        return gVar.e() + 1;
    }

    public boolean z() {
        ArrowRefreshHeader arrowRefreshHeader = this.f64883l;
        return arrowRefreshHeader != null && arrowRefreshHeader.h() == 2;
    }

    public XRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public XRecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f64873b = false;
        this.f64874c = false;
        this.f64875d = -1;
        this.f64876e = -1;
        this.f64877f = new ArrayList<>();
        this.f64879h = -1.0f;
        this.f64880i = 3.0f;
        this.f64884m = true;
        this.f64885n = true;
        this.f64888q = new c();
        this.f64889r = a.EnumC0973a.EXPANDED;
        this.f64890s = 1;
        this.f64891t = 0;
        w();
    }

    private class g extends RecyclerView.h<RecyclerView.e0> {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView.h f64900b;

        class a extends GridLayoutManager.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ GridLayoutManager f64902a;

            a(GridLayoutManager gridLayoutManager) {
                this.f64902a = gridLayoutManager;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int i4) {
                if (g.this.h(i4) || g.this.g(i4) || g.this.i(i4)) {
                    return this.f64902a.M();
                }
                return 1;
            }
        }

        private class b extends RecyclerView.e0 {
            public b(View view) {
                super(view);
            }
        }

        public g(RecyclerView.h hVar) {
            this.f64900b = hVar;
        }

        public int e() {
            if (XRecyclerView.this.f64877f == null) {
                return 0;
            }
            return XRecyclerView.this.f64877f.size();
        }

        public RecyclerView.h f() {
            return this.f64900b;
        }

        public boolean g(int i4) {
            return XRecyclerView.this.f64885n && i4 == getItemCount() - 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            int i4 = XRecyclerView.this.f64885n ? 2 : 1;
            if (this.f64900b != null) {
                return this.f64900b.getItemCount() + e() + i4;
            }
            return e() + i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i4) {
            int e4;
            if (this.f64900b == null || i4 < e() + 1 || (e4 = i4 - (e() + 1)) >= this.f64900b.getItemCount()) {
                return -1L;
            }
            return this.f64900b.getItemId(e4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i4) {
            int e4 = i4 - (e() + 1);
            if (i(i4)) {
                return 10000;
            }
            if (h(i4)) {
                return ((Integer) XRecyclerView.f64872y.get(i4 - 1)).intValue();
            }
            if (g(i4)) {
                return 10001;
            }
            RecyclerView.h hVar = this.f64900b;
            if (hVar == null || e4 >= hVar.getItemCount()) {
                return 0;
            }
            int itemViewType = this.f64900b.getItemViewType(e4);
            if (XRecyclerView.this.A(itemViewType)) {
                throw new IllegalStateException(ProtectedSandApp.s("ᑷ\u0001"));
            }
            return itemViewType;
        }

        public boolean h(int i4) {
            return XRecyclerView.this.f64877f != null && i4 >= 1 && i4 < XRecyclerView.this.f64877f.size() + 1;
        }

        public boolean i(int i4) {
            return i4 == 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                gridLayoutManager.W(new a(gridLayoutManager));
            }
            this.f64900b.onAttachedToRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.e0 e0Var, int i4) {
            if (h(i4) || i(i4)) {
                return;
            }
            int e4 = i4 - (e() + 1);
            RecyclerView.h hVar = this.f64900b;
            if (hVar == null || e4 >= hVar.getItemCount()) {
                return;
            }
            this.f64900b.onBindViewHolder(e0Var, e4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
            return i4 == 10000 ? new b(XRecyclerView.this.f64883l) : XRecyclerView.this.x(i4) ? new b(XRecyclerView.this.u(i4)) : i4 == 10001 ? new b(XRecyclerView.this.f64887p) : this.f64900b.onCreateViewHolder(viewGroup, i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
            this.f64900b.onDetachedFromRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
            return this.f64900b.onFailedToRecycleView(e0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
            super.onViewAttachedToWindow(e0Var);
            ViewGroup.LayoutParams layoutParams = e0Var.itemView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && (h(e0Var.getLayoutPosition()) || i(e0Var.getLayoutPosition()) || g(e0Var.getLayoutPosition()))) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).o(true);
            }
            this.f64900b.onViewAttachedToWindow(e0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
            this.f64900b.onViewDetachedFromWindow(e0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onViewRecycled(RecyclerView.e0 e0Var) {
            if (e0Var instanceof b) {
                return;
            }
            this.f64900b.onViewRecycled(e0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void registerAdapterDataObserver(RecyclerView.j jVar) {
            this.f64900b.registerAdapterDataObserver(jVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void unregisterAdapterDataObserver(RecyclerView.j jVar) {
            this.f64900b.unregisterAdapterDataObserver(jVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.e0 e0Var, int i4, List<Object> list) {
            if (h(i4) || i(i4)) {
                return;
            }
            int e4 = i4 - (e() + 1);
            RecyclerView.h hVar = this.f64900b;
            if (hVar == null || e4 >= hVar.getItemCount()) {
                return;
            }
            if (list.isEmpty()) {
                this.f64900b.onBindViewHolder(e0Var, e4);
            } else {
                this.f64900b.onBindViewHolder(e0Var, e4, list);
            }
        }
    }
}
