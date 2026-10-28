package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.c1;
import d.a;
import java.lang.ref.WeakReference;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: o, reason: collision with root package name */
    private int f1086o;

    /* renamed from: p, reason: collision with root package name */
    private int f1087p;

    /* renamed from: q, reason: collision with root package name */
    private WeakReference<View> f1088q;

    /* renamed from: r, reason: collision with root package name */
    private LayoutInflater f1089r;

    /* renamed from: s, reason: collision with root package name */
    private a f1090s;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int a() {
        return this.f1087p;
    }

    public LayoutInflater b() {
        return this.f1089r;
    }

    public int c() {
        return this.f1086o;
    }

    public View d() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1086o == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f1089r;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f1086o, viewGroup, false);
        int i5 = this.f1087p;
        if (i5 != -1) {
            inflate.setId(i5);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f1088q = new WeakReference<>(inflate);
        a aVar = this.f1090s;
        if (aVar != null) {
            aVar.a(this, inflate);
        }
        return inflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public void e(int i5) {
        this.f1087p = i5;
    }

    public void f(LayoutInflater layoutInflater) {
        this.f1089r = layoutInflater;
    }

    public void g(int i5) {
        this.f1086o = i5;
    }

    public void h(a aVar) {
        this.f1090s = aVar;
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        WeakReference<View> weakReference = this.f1088q;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i5);
            return;
        }
        super.setVisibility(i5);
        if (i5 == 0 || i5 == 4) {
            d();
        }
    }

    public ViewStubCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f1086o = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.h8, i5, 0);
        this.f1087p = obtainStyledAttributes.getResourceId(a.n.k8, -1);
        this.f1086o = obtainStyledAttributes.getResourceId(a.n.j8, 0);
        setId(obtainStyledAttributes.getResourceId(a.n.i8, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
