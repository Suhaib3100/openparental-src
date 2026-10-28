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

    /* renamed from: b, reason: collision with root package name */
    private int f1703b;

    /* renamed from: c, reason: collision with root package name */
    private int f1704c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference<View> f1705d;

    /* renamed from: e, reason: collision with root package name */
    private LayoutInflater f1706e;

    /* renamed from: f, reason: collision with root package name */
    private a f1707f;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int a() {
        return this.f1704c;
    }

    public LayoutInflater b() {
        return this.f1706e;
    }

    public int c() {
        return this.f1703b;
    }

    public View d() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1703b == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f1706e;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f1703b, viewGroup, false);
        int i4 = this.f1704c;
        if (i4 != -1) {
            inflate.setId(i4);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f1705d = new WeakReference<>(inflate);
        a aVar = this.f1707f;
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

    public void e(int i4) {
        this.f1704c = i4;
    }

    public void f(LayoutInflater layoutInflater) {
        this.f1706e = layoutInflater;
    }

    public void g(int i4) {
        this.f1703b = i4;
    }

    public void h(a aVar) {
        this.f1707f = aVar;
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference<View> weakReference = this.f1705d;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i4);
            return;
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            d();
        }
    }

    public ViewStubCompat(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1703b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m.U6, i4, 0);
        this.f1704c = obtainStyledAttributes.getResourceId(a.m.X6, -1);
        this.f1703b = obtainStyledAttributes.getResourceId(a.m.W6, 0);
        setId(obtainStyledAttributes.getResourceId(a.m.V6, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
