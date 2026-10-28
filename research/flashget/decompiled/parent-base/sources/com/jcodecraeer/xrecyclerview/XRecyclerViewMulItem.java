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
public class XRecyclerViewMulItem extends RecyclerView {

    /* renamed from: w, reason: collision with root package name */
    private static final int f64905w = 10000;

    /* renamed from: x, reason: collision with root package name */
    private static final int f64906x = 10001;

    /* renamed from: y, reason: collision with root package name */
    private static final int f64907y = 10002;

    /* renamed from: z, reason: collision with root package name */
    private static List<Integer> f64908z = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f64909b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f64910c;

    /* renamed from: d, reason: collision with root package name */
    private int f64911d;

    /* renamed from: e, reason: collision with root package name */
    private int f64912e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<View> f64913f;

    /* renamed from: g, reason: collision with root package name */
    private h f64914g;

    /* renamed from: h, reason: collision with root package name */
    private float f64915h;

    /* renamed from: i, reason: collision with root package name */
    private float f64916i;

    /* renamed from: j, reason: collision with root package name */
    private com.jcodecraeer.xrecyclerview.d f64917j;

    /* renamed from: k, reason: collision with root package name */
    private e f64918k;

    /* renamed from: l, reason: collision with root package name */
    private ArrowRefreshHeader f64919l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f64920m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f64921n;

    /* renamed from: o, reason: collision with root package name */
    private View f64922o;

    /* renamed from: p, reason: collision with root package name */
    private View f64923p;

    /* renamed from: q, reason: collision with root package name */
    private final RecyclerView.j f64924q;

    /* renamed from: r, reason: collision with root package name */
    private a.EnumC0973a f64925r;

    /* renamed from: s, reason: collision with root package name */
    private int f64926s;

    /* renamed from: t, reason: collision with root package name */
    private g f64927t;

    /* renamed from: u, reason: collision with root package name */
    private int f64928u;

    /* renamed from: v, reason: collision with root package name */
    private f f64929v;

    class a extends GridLayoutManager.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f64930a;

        a(GridLayoutManager gridLayoutManager) {
            this.f64930a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int getSpanSize(int i4) {
            if (XRecyclerViewMulItem.this.f64914g.h(i4) || XRecyclerViewMulItem.this.f64914g.g(i4) || XRecyclerViewMulItem.this.f64914g.i(i4)) {
                return this.f64930a.M();
            }
            return 1;
        }
    }

    class b extends com.jcodecraeer.xrecyclerview.a {
        b() {
        }

        @Override // com.jcodecraeer.xrecyclerview.a
        public void b(AppBarLayout appBarLayout, a.EnumC0973a enumC0973a) {
            XRecyclerViewMulItem.this.f64925r = enumC0973a;
        }
    }

    private class c extends RecyclerView.j {
        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            if (XRecyclerViewMulItem.this.f64914g != null) {
                XRecyclerViewMulItem.this.f64914g.notifyDataSetChanged();
            }
            if (XRecyclerViewMulItem.this.f64914g == null || XRecyclerViewMulItem.this.f64922o == null) {
                return;
            }
            int e4 = XRecyclerViewMulItem.this.f64914g.e();
            int i4 = e4 + 1;
            if (XRecyclerViewMulItem.this.f64921n) {
                i4 = e4 + 2;
            }
            if (XRecyclerViewMulItem.this.f64914g.getItemCount() == i4) {
                XRecyclerViewMulItem.this.f64922o.setVisibility(0);
                XRecyclerViewMulItem.this.setVisibility(8);
            } else {
                XRecyclerViewMulItem.this.f64922o.setVisibility(8);
                XRecyclerViewMulItem.this.setVisibility(0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i4, int i5) {
            XRecyclerViewMulItem.this.f64914g.notifyItemRangeChanged(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i4, int i5, Object obj) {
            XRecyclerViewMulItem.this.f64914g.notifyItemRangeChanged(i4, i5, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i4, int i5) {
            XRecyclerViewMulItem.this.f64914g.notifyItemRangeInserted(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i4, int i5, int i6) {
            XRecyclerViewMulItem.this.f64914g.notifyItemMoved(i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i4, int i5) {
            XRecyclerViewMulItem.this.f64914g.notifyItemRangeRemoved(i4, i5);
        }

        private c() {
        }
    }

    public class d extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f64934a;

        /* renamed from: b, reason: collision with root package name */
        private int f64935b;

        public d(Drawable drawable) {
            this.f64934a = drawable;
        }

        private void c(Canvas canvas, RecyclerView recyclerView) {
            int paddingTop = recyclerView.getPaddingTop();
            int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            for (int i4 = 0; i4 < childCount - 1; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                int marginEnd = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).getMarginEnd() + childAt.getRight();
                this.f64934a.setBounds(marginEnd, paddingTop, this.f64934a.getIntrinsicWidth() + marginEnd, height);
                this.f64934a.draw(canvas);
            }
        }

        private void d(Canvas canvas, RecyclerView recyclerView) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i4 = 0; i4 < childCount - 1; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                this.f64934a.setBounds(paddingLeft, bottom, width, this.f64934a.getIntrinsicHeight() + bottom);
                this.f64934a.draw(canvas);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            if (recyclerView.getChildAdapterPosition(view) <= XRecyclerViewMulItem.this.f64914g.e() + 1) {
                return;
            }
            int orientation = ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
            this.f64935b = orientation;
            if (orientation == 0) {
                rect.left = this.f64934a.getIntrinsicWidth();
            } else if (orientation == 1) {
                rect.top = this.f64934a.getIntrinsicHeight();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int i4 = this.f64935b;
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

    public interface g {
        int a(GridLayoutManager gridLayoutManager, int i4);
    }

    public XRecyclerViewMulItem(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B(int i4) {
        return i4 == 10000 || i4 == 10001 || f64908z.contains(Integer.valueOf(i4));
    }

    private int q(int[] iArr) {
        int i4 = iArr[0];
        for (int i5 : iArr) {
            if (i5 > i4) {
                i4 = i5;
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View v(int i4) {
        ArrayList<View> arrayList;
        if (y(i4) && (arrayList = this.f64913f) != null) {
            return arrayList.get(i4 - 10002);
        }
        return null;
    }

    private void x() {
        if (this.f64920m) {
            ArrowRefreshHeader arrowRefreshHeader = new ArrowRefreshHeader(getContext());
            this.f64919l = arrowRefreshHeader;
            arrowRefreshHeader.n(this.f64911d);
        }
        LoadingMoreFooter loadingMoreFooter = new LoadingMoreFooter(getContext());
        loadingMoreFooter.f(this.f64912e);
        this.f64923p = loadingMoreFooter;
        loadingMoreFooter.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y(int i4) {
        ArrayList<View> arrayList = this.f64913f;
        return arrayList != null && f64908z != null && arrayList.size() > 0 && f64908z.contains(Integer.valueOf(i4));
    }

    private boolean z() {
        ArrowRefreshHeader arrowRefreshHeader = this.f64919l;
        return (arrowRefreshHeader == null || arrowRefreshHeader.getParent() == null) ? false : true;
    }

    public boolean A() {
        ArrowRefreshHeader arrowRefreshHeader = this.f64919l;
        return arrowRefreshHeader != null && arrowRefreshHeader.h() == 2;
    }

    public void C() {
        this.f64909b = false;
        V(false);
        View view = this.f64923p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).g(1);
            return;
        }
        com.jcodecraeer.xrecyclerview.d dVar = this.f64917j;
        if (dVar != null) {
            dVar.c(view);
        }
    }

    public void D(int i4) {
        if (this.f64914g.f64937b == null) {
            return;
        }
        this.f64914g.f64937b.notifyItemChanged(w() + i4);
    }

    public void E(int i4, Object obj) {
        if (this.f64914g.f64937b == null) {
            return;
        }
        this.f64914g.f64937b.notifyItemChanged(w() + i4, obj);
    }

    public <T> void F(List<T> list, int i4) {
        if (this.f64914g.f64937b == null) {
            return;
        }
        int w4 = w();
        this.f64914g.f64937b.notifyItemInserted(i4 + w4);
        this.f64914g.f64937b.notifyItemRangeChanged(w4, list.size(), new Object());
    }

    public <T> void G(List<T> list, int i4) {
        if (this.f64914g.f64937b == null) {
            return;
        }
        int w4 = w();
        this.f64914g.f64937b.notifyItemRemoved(i4 + w4);
        this.f64914g.f64937b.notifyItemRangeChanged(w4, list.size(), new Object());
    }

    public void H() {
        if (!this.f64920m || this.f64918k == null) {
            return;
        }
        this.f64919l.q(2);
        this.f64918k.a();
    }

    public void I() {
        ArrowRefreshHeader arrowRefreshHeader = this.f64919l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.c();
        }
        V(false);
    }

    public void J() {
        ArrayList<View> arrayList = this.f64913f;
        if (arrayList == null || f64908z == null) {
            return;
        }
        arrayList.clear();
        h hVar = this.f64914g;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    public void K(@o0 View view) {
        ArrayList<View> arrayList = this.f64913f;
        if (arrayList == null || f64908z == null || view == null) {
            return;
        }
        Iterator<View> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            if (next == view) {
                this.f64913f.remove(next);
                break;
            }
        }
        h hVar = this.f64914g;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    public void L() {
        V(false);
        C();
        I();
    }

    public void M(int i4) {
        ArrowRefreshHeader arrowRefreshHeader = this.f64919l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.m(i4);
        }
    }

    public void N(float f4) {
        if (f4 <= 0.5d) {
            return;
        }
        this.f64916i = f4;
    }

    @Deprecated
    public void O(View view) {
        this.f64922o = view;
        this.f64924q.a();
    }

    public void P(@o0 View view, @o0 com.jcodecraeer.xrecyclerview.d dVar) {
        if (view == null || dVar == null) {
            return;
        }
        this.f64923p = view;
        this.f64917j = dVar;
    }

    public void Q(String str, String str2) {
        View view = this.f64923p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).d(str);
            ((LoadingMoreFooter) this.f64923p).e(str2);
        }
    }

    public void R(int i4) {
        this.f64926s = i4;
    }

    public void S(e eVar) {
        this.f64918k = eVar;
    }

    public void T(boolean z4) {
        this.f64921n = z4;
        if (z4) {
            return;
        }
        View view = this.f64923p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).g(1);
        }
    }

    public void U(int i4) {
        this.f64912e = i4;
        View view = this.f64923p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).f(i4);
        }
    }

    public void V(boolean z4) {
        this.f64909b = false;
        this.f64910c = z4;
        View view = this.f64923p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).g(z4 ? 2 : 1);
            return;
        }
        com.jcodecraeer.xrecyclerview.d dVar = this.f64917j;
        if (dVar != null) {
            dVar.b(view, z4);
        }
    }

    public void W(boolean z4) {
        this.f64920m = z4;
    }

    public void X(ArrowRefreshHeader arrowRefreshHeader) {
        this.f64919l = arrowRefreshHeader;
    }

    public void Y(int i4) {
        this.f64911d = i4;
        ArrowRefreshHeader arrowRefreshHeader = this.f64919l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.n(i4);
        }
    }

    public void Z(String str) {
        ArrowRefreshHeader arrowRefreshHeader = this.f64919l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.s(str);
        }
    }

    public void a0(Boolean bool) {
        ArrowRefreshHeader arrowRefreshHeader = this.f64919l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.p(bool);
        }
    }

    public void b0(f fVar) {
        this.f64929v = fVar;
    }

    public void c0(g gVar) {
        this.f64927t = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public RecyclerView.h getAdapter() {
        h hVar = this.f64914g;
        if (hVar != null) {
            return hVar.f();
        }
        return null;
    }

    public void o(View view) {
        List<Integer> list;
        ArrayList<View> arrayList = this.f64913f;
        if (arrayList == null || (list = f64908z) == null) {
            return;
        }
        list.add(Integer.valueOf(arrayList.size() + f64907y));
        this.f64913f.add(view);
        h hVar = this.f64914g;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
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

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i4) {
        int findLastVisibleItemPosition;
        super.onScrollStateChanged(i4);
        if (i4 != 0 || this.f64918k == null || this.f64909b || !this.f64921n) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            findLastVisibleItemPosition = ((GridLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.h0()];
            staggeredGridLayoutManager.W(iArr);
            findLastVisibleItemPosition = q(iArr);
        } else {
            findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        int w4 = w() + layoutManager.getItemCount();
        ArrowRefreshHeader arrowRefreshHeader = this.f64919l;
        int h4 = arrowRefreshHeader != null ? arrowRefreshHeader.h() : 3;
        if (layoutManager.getChildCount() <= 0 || findLastVisibleItemPosition < w4 - this.f64926s || w4 < layoutManager.getChildCount() || this.f64910c || h4 >= 2) {
            return;
        }
        this.f64909b = true;
        View view = this.f64923p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).g(0);
        } else {
            com.jcodecraeer.xrecyclerview.d dVar = this.f64917j;
            if (dVar != null) {
                dVar.a(view);
            }
        }
        this.f64918k.onLoadMore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i4, int i5) {
        super.onScrolled(i4, i5);
        f fVar = this.f64929v;
        if (fVar == null) {
            return;
        }
        int b5 = fVar.b();
        int i6 = this.f64928u + i5;
        this.f64928u = i6;
        if (i6 <= 0) {
            this.f64929v.a(0);
        } else if (i6 > b5 || i6 <= 0) {
            this.f64929v.a(255);
        } else {
            this.f64929v.a((int) ((i6 / b5) * 255.0f));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ArrowRefreshHeader arrowRefreshHeader;
        ArrowRefreshHeader arrowRefreshHeader2;
        e eVar;
        if (this.f64915h == -1.0f) {
            this.f64915h = motionEvent.getRawY();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f64915h = motionEvent.getRawY();
        } else if (action != 2) {
            this.f64915h = -1.0f;
            if (z() && this.f64920m && this.f64925r == a.EnumC0973a.EXPANDED && (arrowRefreshHeader2 = this.f64919l) != null && arrowRefreshHeader2.b() && (eVar = this.f64918k) != null) {
                eVar.a();
            }
        } else {
            float rawY = motionEvent.getRawY() - this.f64915h;
            this.f64915h = motionEvent.getRawY();
            if (z() && this.f64920m && this.f64925r == a.EnumC0973a.EXPANDED && (arrowRefreshHeader = this.f64919l) != null) {
                arrowRefreshHeader.a(rawY / this.f64916i);
                if (this.f64919l.i() > 0 && this.f64919l.h() < 2) {
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

    public void p() {
        ArrayList<View> arrayList = this.f64913f;
        if (arrayList != null) {
            arrayList.clear();
            this.f64913f = null;
        }
        View view = this.f64923p;
        if (view instanceof LoadingMoreFooter) {
            ((LoadingMoreFooter) view).a();
            this.f64923p = null;
        }
        ArrowRefreshHeader arrowRefreshHeader = this.f64919l;
        if (arrowRefreshHeader != null) {
            arrowRefreshHeader.d();
            this.f64919l = null;
        }
    }

    public LoadingMoreFooter r() {
        View view = this.f64923p;
        if (view != null && (view instanceof LoadingMoreFooter)) {
            return (LoadingMoreFooter) view;
        }
        return null;
    }

    public ArrowRefreshHeader s() {
        ArrowRefreshHeader arrowRefreshHeader = this.f64919l;
        if (arrowRefreshHeader == null) {
            return null;
        }
        return arrowRefreshHeader;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void scrollToPosition(int i4) {
        super.scrollToPosition(i4);
        if (i4 == 0) {
            this.f64928u = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.h hVar) {
        h hVar2 = new h(hVar);
        this.f64914g = hVar2;
        super.setAdapter(hVar2);
        hVar.registerAdapterDataObserver(this.f64924q);
        this.f64924q.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        if (this.f64914g == null || !(layoutManager instanceof GridLayoutManager)) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        gridLayoutManager.W(new a(gridLayoutManager));
    }

    @Deprecated
    public View t() {
        return this.f64922o;
    }

    public View u() {
        return this.f64923p;
    }

    public int w() {
        h hVar = this.f64914g;
        if (hVar == null) {
            return 0;
        }
        return hVar.e() + 1;
    }

    public XRecyclerViewMulItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public XRecyclerViewMulItem(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f64909b = false;
        this.f64910c = false;
        this.f64911d = -1;
        this.f64912e = -1;
        this.f64913f = new ArrayList<>();
        this.f64915h = -1.0f;
        this.f64916i = 3.0f;
        this.f64920m = true;
        this.f64921n = true;
        this.f64924q = new c();
        this.f64925r = a.EnumC0973a.EXPANDED;
        this.f64926s = 1;
        this.f64928u = 0;
        x();
    }

    private class h extends RecyclerView.h<RecyclerView.e0> {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView.h f64937b;

        class a extends GridLayoutManager.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ GridLayoutManager f64939a;

            a(GridLayoutManager gridLayoutManager) {
                this.f64939a = gridLayoutManager;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int i4) {
                if (XRecyclerViewMulItem.this.f64927t != null) {
                    return (h.this.h(i4) || h.this.g(i4) || h.this.i(i4)) ? this.f64939a.M() : XRecyclerViewMulItem.this.f64927t.a(this.f64939a, i4 - (h.this.e() + 1));
                }
                if (h.this.h(i4) || h.this.g(i4) || h.this.i(i4)) {
                    return this.f64939a.M();
                }
                return 1;
            }
        }

        private class b extends RecyclerView.e0 {
            public b(View view) {
                super(view);
            }
        }

        public h(RecyclerView.h hVar) {
            this.f64937b = hVar;
        }

        public int e() {
            if (XRecyclerViewMulItem.this.f64913f == null) {
                return 0;
            }
            return XRecyclerViewMulItem.this.f64913f.size();
        }

        public RecyclerView.h f() {
            return this.f64937b;
        }

        public boolean g(int i4) {
            return XRecyclerViewMulItem.this.f64921n && i4 == getItemCount() - 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            int i4 = XRecyclerViewMulItem.this.f64921n ? 2 : 1;
            if (this.f64937b != null) {
                return this.f64937b.getItemCount() + e() + i4;
            }
            return e() + i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i4) {
            int e4;
            if (this.f64937b == null || i4 < e() + 1 || (e4 = i4 - (e() + 1)) >= this.f64937b.getItemCount()) {
                return -1L;
            }
            return this.f64937b.getItemId(e4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i4) {
            int e4 = i4 - (e() + 1);
            if (i(i4)) {
                return 10000;
            }
            if (h(i4)) {
                return ((Integer) XRecyclerViewMulItem.f64908z.get(i4 - 1)).intValue();
            }
            if (g(i4)) {
                return 10001;
            }
            RecyclerView.h hVar = this.f64937b;
            if (hVar == null || e4 >= hVar.getItemCount()) {
                return 0;
            }
            int itemViewType = this.f64937b.getItemViewType(e4);
            if (XRecyclerViewMulItem.this.B(itemViewType)) {
                throw new IllegalStateException(ProtectedSandApp.s("ᑸ\u0001"));
            }
            return itemViewType;
        }

        public boolean h(int i4) {
            return XRecyclerViewMulItem.this.f64913f != null && i4 >= 1 && i4 < XRecyclerViewMulItem.this.f64913f.size() + 1;
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
            this.f64937b.onAttachedToRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.e0 e0Var, int i4) {
            if (h(i4) || i(i4)) {
                return;
            }
            int e4 = i4 - (e() + 1);
            RecyclerView.h hVar = this.f64937b;
            if (hVar == null || e4 >= hVar.getItemCount()) {
                return;
            }
            this.f64937b.onBindViewHolder(e0Var, e4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
            return i4 == 10000 ? new b(XRecyclerViewMulItem.this.f64919l) : XRecyclerViewMulItem.this.y(i4) ? new b(XRecyclerViewMulItem.this.v(i4)) : i4 == 10001 ? new b(XRecyclerViewMulItem.this.f64923p) : this.f64937b.onCreateViewHolder(viewGroup, i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
            this.f64937b.onDetachedFromRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
            return this.f64937b.onFailedToRecycleView(e0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onViewAttachedToWindow(RecyclerView.e0 e0Var) {
            super.onViewAttachedToWindow(e0Var);
            ViewGroup.LayoutParams layoutParams = e0Var.itemView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && (h(e0Var.getLayoutPosition()) || i(e0Var.getLayoutPosition()) || g(e0Var.getLayoutPosition()))) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).o(true);
            }
            this.f64937b.onViewAttachedToWindow(e0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onViewDetachedFromWindow(RecyclerView.e0 e0Var) {
            this.f64937b.onViewDetachedFromWindow(e0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onViewRecycled(RecyclerView.e0 e0Var) {
            if (e0Var instanceof b) {
                return;
            }
            this.f64937b.onViewRecycled(e0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void registerAdapterDataObserver(RecyclerView.j jVar) {
            this.f64937b.registerAdapterDataObserver(jVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void unregisterAdapterDataObserver(RecyclerView.j jVar) {
            this.f64937b.unregisterAdapterDataObserver(jVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(RecyclerView.e0 e0Var, int i4, List<Object> list) {
            if (h(i4) || i(i4)) {
                return;
            }
            int e4 = i4 - (e() + 1);
            RecyclerView.h hVar = this.f64937b;
            if (hVar == null || e4 >= hVar.getItemCount()) {
                return;
            }
            if (list.isEmpty()) {
                this.f64937b.onBindViewHolder(e0Var, e4);
            } else {
                this.f64937b.onBindViewHolder(e0Var, e4, list);
            }
        }
    }
}
