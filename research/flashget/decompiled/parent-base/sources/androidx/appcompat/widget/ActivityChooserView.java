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
import androidx.appcompat.widget.d;
import androidx.core.view.x1;
import d.a;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements d.a {

    /* renamed from: b, reason: collision with root package name */
    final f f1414b;

    /* renamed from: c, reason: collision with root package name */
    private final g f1415c;

    /* renamed from: d, reason: collision with root package name */
    private final View f1416d;

    /* renamed from: e, reason: collision with root package name */
    private final Drawable f1417e;

    /* renamed from: f, reason: collision with root package name */
    final FrameLayout f1418f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f1419g;

    /* renamed from: h, reason: collision with root package name */
    final FrameLayout f1420h;

    /* renamed from: i, reason: collision with root package name */
    private final ImageView f1421i;

    /* renamed from: j, reason: collision with root package name */
    private final int f1422j;

    /* renamed from: k, reason: collision with root package name */
    androidx.core.view.b f1423k;

    /* renamed from: l, reason: collision with root package name */
    final DataSetObserver f1424l;

    /* renamed from: m, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f1425m;

    /* renamed from: n, reason: collision with root package name */
    private ListPopupWindow f1426n;

    /* renamed from: o, reason: collision with root package name */
    PopupWindow.OnDismissListener f1427o;

    /* renamed from: p, reason: collision with root package name */
    boolean f1428p;

    /* renamed from: q, reason: collision with root package name */
    int f1429q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1430r;

    /* renamed from: s, reason: collision with root package name */
    private int f1431s;

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static class InnerLayout extends LinearLayout {

        /* renamed from: b, reason: collision with root package name */
        private static final int[] f1432b = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            t0 F = t0.F(context, attributeSet, f1432b);
            setBackgroundDrawable(F.h(0));
            F.I();
        }
    }

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f1414b.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f1414b.notifyDataSetInvalidated();
        }
    }

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
                ActivityChooserView.this.d().b();
                androidx.core.view.b bVar = ActivityChooserView.this.f1423k;
                if (bVar != null) {
                    bVar.m(true);
                }
            }
        }
    }

    class c extends View.AccessibilityDelegate {
        c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            androidx.core.view.accessibility.h0.r2(accessibilityNodeInfo).g1(true);
        }
    }

    class d extends e0 {
        d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.e0
        public androidx.appcompat.view.menu.r b() {
            return ActivityChooserView.this.d();
        }

        @Override // androidx.appcompat.widget.e0
        protected boolean c() {
            ActivityChooserView.this.l();
            return true;
        }

        @Override // androidx.appcompat.widget.e0
        protected boolean d() {
            ActivityChooserView.this.b();
            return true;
        }
    }

    class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.n();
        }
    }

    private class f extends BaseAdapter {

        /* renamed from: h, reason: collision with root package name */
        public static final int f1438h = Integer.MAX_VALUE;

        /* renamed from: i, reason: collision with root package name */
        public static final int f1439i = 4;

        /* renamed from: j, reason: collision with root package name */
        private static final int f1440j = 0;

        /* renamed from: k, reason: collision with root package name */
        private static final int f1441k = 1;

        /* renamed from: l, reason: collision with root package name */
        private static final int f1442l = 3;

        /* renamed from: b, reason: collision with root package name */
        private androidx.appcompat.widget.d f1443b;

        /* renamed from: c, reason: collision with root package name */
        private int f1444c = 4;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1445d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f1446e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f1447f;

        f() {
        }

        public int a() {
            return this.f1443b.f();
        }

        public androidx.appcompat.widget.d b() {
            return this.f1443b;
        }

        public ResolveInfo c() {
            return this.f1443b.h();
        }

        public int d() {
            return this.f1443b.j();
        }

        public boolean e() {
            return this.f1445d;
        }

        public int f() {
            int i4 = this.f1444c;
            this.f1444c = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i5 = 0;
            View view = null;
            for (int i6 = 0; i6 < count; i6++) {
                view = getView(i6, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i5 = Math.max(i5, view.getMeasuredWidth());
            }
            this.f1444c = i4;
            return i5;
        }

        public void g(androidx.appcompat.widget.d dVar) {
            androidx.appcompat.widget.d b5 = ActivityChooserView.this.f1414b.b();
            if (b5 != null && ActivityChooserView.this.isShown()) {
                b5.unregisterObserver(ActivityChooserView.this.f1424l);
            }
            this.f1443b = dVar;
            if (dVar != null && ActivityChooserView.this.isShown()) {
                dVar.registerObserver(ActivityChooserView.this.f1424l);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int f4 = this.f1443b.f();
            if (!this.f1445d && this.f1443b.h() != null) {
                f4--;
            }
            int min = Math.min(f4, this.f1444c);
            return this.f1447f ? min + 1 : min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f1445d && this.f1443b.h() != null) {
                i4++;
            }
            return this.f1443b.e(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return (this.f1447f && i4 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.j.f73306h, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(a.g.f73273s0)).setText(ActivityChooserView.this.getContext().getString(a.k.f73329e));
                return inflate;
            }
            if (view == null || view.getId() != a.g.H) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.j.f73306h, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(a.g.E);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i4);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(a.g.f73273s0)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f1445d && i4 == 0 && this.f1446e) {
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

        public void h(int i4) {
            if (this.f1444c != i4) {
                this.f1444c = i4;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z4, boolean z5) {
            if (this.f1445d == z4 && this.f1446e == z5) {
                return;
            }
            this.f1445d = z4;
            this.f1446e = z5;
            notifyDataSetChanged();
        }

        public void j(boolean z4) {
            if (this.f1447f != z4) {
                this.f1447f = z4;
                notifyDataSetChanged();
            }
        }
    }

    private class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        private void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f1427o;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f1420h) {
                if (view != activityChooserView.f1418f) {
                    throw new IllegalArgumentException();
                }
                activityChooserView.f1428p = false;
                activityChooserView.m(activityChooserView.f1429q);
                return;
            }
            activityChooserView.b();
            Intent b5 = ActivityChooserView.this.f1414b.b().b(ActivityChooserView.this.f1414b.b().g(ActivityChooserView.this.f1414b.c()));
            if (b5 != null) {
                b5.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(b5);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            androidx.core.view.b bVar = ActivityChooserView.this.f1423k;
            if (bVar != null) {
                bVar.m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    throw new IllegalArgumentException();
                }
                ActivityChooserView.this.m(Integer.MAX_VALUE);
                return;
            }
            ActivityChooserView.this.b();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f1428p) {
                if (i4 > 0) {
                    activityChooserView.f1414b.b().r(i4);
                    return;
                }
                return;
            }
            if (!activityChooserView.f1414b.e()) {
                i4++;
            }
            Intent b5 = ActivityChooserView.this.f1414b.b().b(i4);
            if (b5 != null) {
                b5.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(b5);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view != activityChooserView.f1420h) {
                throw new IllegalArgumentException();
            }
            if (activityChooserView.f1414b.getCount() > 0) {
                ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                activityChooserView2.f1428p = true;
                activityChooserView2.m(activityChooserView2.f1429q);
            }
            return true;
        }
    }

    public ActivityChooserView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.d.a
    @androidx.annotation.c1({c1.a.LIBRARY})
    public void a(androidx.appcompat.widget.d dVar) {
        this.f1414b.g(dVar);
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
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1425m);
        return true;
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public androidx.appcompat.widget.d c() {
        return this.f1414b.b();
    }

    ListPopupWindow d() {
        if (this.f1426n == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f1426n = listPopupWindow;
            listPopupWindow.o(this.f1414b);
            this.f1426n.S(this);
            this.f1426n.d0(true);
            this.f1426n.f0(this.f1415c);
            this.f1426n.e0(this.f1415c);
        }
        return this.f1426n;
    }

    public boolean e() {
        return d().c();
    }

    public void f(int i4) {
        this.f1431s = i4;
    }

    public void g(int i4) {
        this.f1419g.setContentDescription(getContext().getString(i4));
    }

    public void h(Drawable drawable) {
        this.f1419g.setImageDrawable(drawable);
    }

    public void i(int i4) {
        this.f1429q = i4;
    }

    public void j(PopupWindow.OnDismissListener onDismissListener) {
        this.f1427o = onDismissListener;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void k(androidx.core.view.b bVar) {
        this.f1423k = bVar;
    }

    public boolean l() {
        if (e() || !this.f1430r) {
            return false;
        }
        this.f1428p = false;
        m(this.f1429q);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    void m(int i4) {
        if (this.f1414b.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1425m);
        ?? r02 = this.f1420h.getVisibility() == 0 ? 1 : 0;
        int a5 = this.f1414b.a();
        if (i4 == Integer.MAX_VALUE || a5 <= i4 + r02) {
            this.f1414b.j(false);
            this.f1414b.h(i4);
        } else {
            this.f1414b.j(true);
            this.f1414b.h(i4 - 1);
        }
        ListPopupWindow d5 = d();
        if (d5.c()) {
            return;
        }
        if (this.f1428p || r02 == 0) {
            this.f1414b.i(true, r02);
        } else {
            this.f1414b.i(false, false);
        }
        d5.U(Math.min(this.f1414b.f(), this.f1422j));
        d5.b();
        androidx.core.view.b bVar = this.f1423k;
        if (bVar != null) {
            bVar.m(true);
        }
        d5.q().setContentDescription(getContext().getString(a.k.f73330f));
        d5.q().setSelector(new ColorDrawable(0));
    }

    void n() {
        if (this.f1414b.getCount() > 0) {
            this.f1418f.setEnabled(true);
        } else {
            this.f1418f.setEnabled(false);
        }
        int a5 = this.f1414b.a();
        int d5 = this.f1414b.d();
        if (a5 == 1 || (a5 > 1 && d5 > 0)) {
            this.f1420h.setVisibility(0);
            ResolveInfo c5 = this.f1414b.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1421i.setImageDrawable(c5.loadIcon(packageManager));
            if (this.f1431s != 0) {
                this.f1420h.setContentDescription(getContext().getString(this.f1431s, c5.loadLabel(packageManager)));
            }
        } else {
            this.f1420h.setVisibility(8);
        }
        if (this.f1420h.getVisibility() == 0) {
            this.f1416d.setBackgroundDrawable(this.f1417e);
        } else {
            this.f1416d.setBackgroundDrawable(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.d b5 = this.f1414b.b();
        if (b5 != null) {
            b5.registerObserver(this.f1424l);
        }
        this.f1430r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.d b5 = this.f1414b.b();
        if (b5 != null) {
            b5.unregisterObserver(this.f1424l);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1425m);
        }
        if (e()) {
            b();
        }
        this.f1430r = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        this.f1416d.layout(0, 0, i6 - i4, i7 - i5);
        if (e()) {
            return;
        }
        b();
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        View view = this.f1416d;
        if (this.f1420h.getVisibility() != 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), 1073741824);
        }
        measureChild(view, i4, i5);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public ActivityChooserView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1424l = new a();
        this.f1425m = new b();
        this.f1429q = 4;
        int[] iArr = a.m.Q;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        x1.F1(this, context, iArr, attributeSet, obtainStyledAttributes, i4, 0);
        this.f1429q = obtainStyledAttributes.getInt(a.m.S, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(a.m.R);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(a.j.f73305g, (ViewGroup) this, true);
        g gVar = new g();
        this.f1415c = gVar;
        View findViewById = findViewById(a.g.f73262n);
        this.f1416d = findViewById;
        this.f1417e = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(a.g.f73284y);
        this.f1420h = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i5 = a.g.F;
        this.f1421i = (ImageView) frameLayout.findViewById(i5);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(a.g.A);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f1418f = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i5);
        this.f1419g = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f1414b = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.f1422j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.e.f73178x));
    }
}
