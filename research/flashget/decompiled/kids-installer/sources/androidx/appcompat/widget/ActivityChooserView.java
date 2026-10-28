package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.appcompat.widget.c;
import androidx.core.view.y1;
import d.a;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class ActivityChooserView extends ViewGroup implements c.a {
    private ListPopupWindow A;
    PopupWindow.OnDismissListener B;
    boolean C;
    int D;
    private boolean E;
    private int F;

    /* renamed from: o, reason: collision with root package name */
    final f f828o;

    /* renamed from: p, reason: collision with root package name */
    private final g f829p;

    /* renamed from: q, reason: collision with root package name */
    private final View f830q;

    /* renamed from: r, reason: collision with root package name */
    private final Drawable f831r;

    /* renamed from: s, reason: collision with root package name */
    final FrameLayout f832s;

    /* renamed from: t, reason: collision with root package name */
    private final ImageView f833t;

    /* renamed from: u, reason: collision with root package name */
    final FrameLayout f834u;

    /* renamed from: v, reason: collision with root package name */
    private final ImageView f835v;

    /* renamed from: w, reason: collision with root package name */
    private final int f836w;

    /* renamed from: x, reason: collision with root package name */
    androidx.core.view.b f837x;

    /* renamed from: y, reason: collision with root package name */
    final DataSetObserver f838y;

    /* renamed from: z, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f839z;

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: o, reason: collision with root package name */
        private static final int[] f840o = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            z0 F = z0.F(context, attributeSet, f840o);
            setBackgroundDrawable(F.h(0));
            F.I();
        }
    }

    /* loaded from: classes.dex */
    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f828o.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f828o.notifyDataSetInvalidated();
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.e()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.d().dismiss();
                    return;
                }
                ActivityChooserView.this.d().a();
                androidx.core.view.b bVar = ActivityChooserView.this.f837x;
                if (bVar != null) {
                    bVar.m(true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends View.AccessibilityDelegate {
        c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            androidx.core.view.accessibility.g0.X1(accessibilityNodeInfo).T0(true);
        }
    }

    class d extends h0 {
        d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.h0
        public androidx.appcompat.view.menu.q b() {
            return ActivityChooserView.this.d();
        }

        @Override // androidx.appcompat.widget.h0
        protected boolean c() {
            ActivityChooserView.this.l();
            return true;
        }

        @Override // androidx.appcompat.widget.h0
        protected boolean d() {
            ActivityChooserView.this.b();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.n();
        }
    }

    /* loaded from: classes.dex */
    private class f extends BaseAdapter {

        /* renamed from: u, reason: collision with root package name */
        public static final int f846u = Integer.MAX_VALUE;

        /* renamed from: v, reason: collision with root package name */
        public static final int f847v = 4;

        /* renamed from: w, reason: collision with root package name */
        private static final int f848w = 0;

        /* renamed from: x, reason: collision with root package name */
        private static final int f849x = 1;

        /* renamed from: y, reason: collision with root package name */
        private static final int f850y = 3;

        /* renamed from: o, reason: collision with root package name */
        private androidx.appcompat.widget.c f851o;

        /* renamed from: p, reason: collision with root package name */
        private int f852p = 4;

        /* renamed from: q, reason: collision with root package name */
        private boolean f853q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f854r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f855s;

        f() {
        }

        public int a() {
            return this.f851o.f();
        }

        public androidx.appcompat.widget.c b() {
            return this.f851o;
        }

        public ResolveInfo c() {
            return this.f851o.h();
        }

        public int d() {
            return this.f851o.j();
        }

        public boolean e() {
            return this.f853q;
        }

        public int f() {
            int i5 = this.f852p;
            this.f852p = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i6 = 0;
            View view = null;
            for (int i7 = 0; i7 < count; i7++) {
                view = getView(i7, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i6 = Math.max(i6, view.getMeasuredWidth());
            }
            this.f852p = i5;
            return i6;
        }

        public void g(androidx.appcompat.widget.c cVar) {
            androidx.appcompat.widget.c b6 = ActivityChooserView.this.f828o.b();
            if (b6 != null && ActivityChooserView.this.isShown()) {
                b6.unregisterObserver(ActivityChooserView.this.f838y);
            }
            this.f851o = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.f838y);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int f6 = this.f851o.f();
            if (!this.f853q && this.f851o.h() != null) {
                f6--;
            }
            int min = Math.min(f6, this.f852p);
            return this.f855s ? min + 1 : min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i5) {
            int itemViewType = getItemViewType(i5);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f853q && this.f851o.h() != null) {
                i5++;
            }
            return this.f851o.e(i5);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i5) {
            return i5;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i5) {
            return (this.f855s && i5 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i5);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.k.f21951h, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(a.h.L1)).setText(ActivityChooserView.this.getContext().getString(a.l.f21974e));
                return inflate;
            }
            if (view == null || view.getId() != a.h.E0) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.k.f21951h, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(a.h.f21921w0);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i5);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(a.h.L1)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f853q && i5 == 0 && this.f854r) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i5) {
            if (this.f852p != i5) {
                this.f852p = i5;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z5, boolean z6) {
            if (this.f853q == z5 && this.f854r == z6) {
                return;
            }
            this.f853q = z5;
            this.f854r = z6;
            notifyDataSetChanged();
        }

        public void j(boolean z5) {
            if (this.f855s != z5) {
                this.f855s = z5;
                notifyDataSetChanged();
            }
        }
    }

    /* loaded from: classes.dex */
    private class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        private void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.B;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f834u) {
                if (view != activityChooserView.f832s) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.C = false;
                activityChooserView.m(activityChooserView.D);
                return;
            }
            activityChooserView.b();
            Intent b6 = ActivityChooserView.this.f828o.b().b(ActivityChooserView.this.f828o.b().g(ActivityChooserView.this.f828o.c()));
            if (b6 != null) {
                b6.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(b6);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            androidx.core.view.b bVar = ActivityChooserView.this.f837x;
            if (bVar != null) {
                bVar.m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i5);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.m(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.b();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.C) {
                if (i5 > 0) {
                    activityChooserView.f828o.b().r(i5);
                    return;
                }
                return;
            }
            if (!activityChooserView.f828o.e()) {
                i5++;
            }
            Intent b6 = ActivityChooserView.this.f828o.b().b(i5);
            if (b6 != null) {
                b6.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(b6);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f834u) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f828o.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.C = true;
                activityChooserView2.m(activityChooserView2.D);
            }
            return true;
        }
    }

    public ActivityChooserView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.c.a
    @androidx.annotation.c1({c1.a.LIBRARY})
    public void a(androidx.appcompat.widget.c cVar) {
        this.f828o.g(cVar);
        if (e()) {
            b();
            l();
        }
    }

    public boolean b() {
        if (!e()) {
            return true;
        }
        d().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f839z);
        return true;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public androidx.appcompat.widget.c c() {
        return this.f828o.b();
    }

    ListPopupWindow d() {
        if (this.A == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.A = listPopupWindow;
            listPopupWindow.q(this.f828o);
            this.A.S(this);
            this.A.d0(true);
            this.A.f0(this.f829p);
            this.A.e0(this.f829p);
        }
        return this.A;
    }

    public boolean e() {
        return d().c();
    }

    public void f(int i5) {
        this.F = i5;
    }

    public void g(int i5) {
        this.f833t.setContentDescription(getContext().getString(i5));
    }

    public void h(Drawable drawable) {
        this.f833t.setImageDrawable(drawable);
    }

    public void i(int i5) {
        this.D = i5;
    }

    public void j(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void k(androidx.core.view.b bVar) {
        this.f837x = bVar;
    }

    public boolean l() {
        if (e() || !this.E) {
            return false;
        }
        this.C = false;
        m(this.D);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    void m(int i5) {
        if (this.f828o.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f839z);
        ?? r02 = this.f834u.getVisibility() == 0 ? 1 : 0;
        int a6 = this.f828o.a();
        if (i5 == Integer.MAX_VALUE || a6 <= i5 + r02) {
            this.f828o.j(false);
            this.f828o.h(i5);
        } else {
            this.f828o.j(true);
            this.f828o.h(i5 - 1);
        }
        ListPopupWindow d6 = d();
        if (d6.c()) {
            return;
        }
        if (this.C || r02 == 0) {
            this.f828o.i(true, r02);
        } else {
            this.f828o.i(false, false);
        }
        d6.U(Math.min(this.f828o.f(), this.f836w));
        d6.a();
        androidx.core.view.b bVar = this.f837x;
        if (bVar != null) {
            bVar.m(true);
        }
        d6.k().setContentDescription(getContext().getString(a.l.f21975f));
        d6.k().setSelector(new ColorDrawable(0));
    }

    void n() {
        if (this.f828o.getCount() > 0) {
            this.f832s.setEnabled(true);
        } else {
            this.f832s.setEnabled(false);
        }
        int a6 = this.f828o.a();
        int d6 = this.f828o.d();
        if (a6 == 1 || (a6 > 1 && d6 > 0)) {
            this.f834u.setVisibility(0);
            ResolveInfo c6 = this.f828o.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f835v.setImageDrawable(c6.loadIcon(packageManager));
            if (this.F != 0) {
                this.f834u.setContentDescription(getContext().getString(this.F, c6.loadLabel(packageManager)));
            }
        } else {
            this.f834u.setVisibility(8);
        }
        if (this.f834u.getVisibility() == 0) {
            this.f830q.setBackgroundDrawable(this.f831r);
        } else {
            this.f830q.setBackgroundDrawable(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.c b6 = this.f828o.b();
        if (b6 != null) {
            b6.registerObserver(this.f838y);
        }
        this.E = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c b6 = this.f828o.b();
        if (b6 != null) {
            b6.unregisterObserver(this.f838y);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f839z);
        }
        if (e()) {
            b();
        }
        this.E = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        this.f830q.layout(0, 0, i7 - i5, i8 - i6);
        if (e()) {
            return;
        }
        b();
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        View view = this.f830q;
        if (this.f834u.getVisibility() != 0) {
            i6 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i6), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        }
        measureChild(view, i5, i6);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public ActivityChooserView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f838y = new a();
        this.f839z = new b();
        this.D = 4;
        int[] iArr = a.n.Q;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, 0);
        y1.z1(this, context, iArr, attributeSet, obtainStyledAttributes, i5, 0);
        this.D = obtainStyledAttributes.getInt(a.n.S, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(a.n.R);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(a.k.f21950g, (ViewGroup) this, true);
        g gVar = new g();
        this.f829p = gVar;
        View findViewById = findViewById(a.h.Z);
        this.f830q = findViewById;
        this.f831r = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(a.h.f21894n0);
        this.f834u = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i6 = a.h.f21927y0;
        this.f835v = (ImageView) frameLayout.findViewById(i6);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(a.h.f21903q0);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f832s = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i6);
        this.f833t = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f828o = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.f836w = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.f.f21796x));
    }
}
