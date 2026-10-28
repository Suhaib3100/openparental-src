package com.scwang.smart.refresh.classics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.n;
import androidx.annotation.o0;
import androidx.annotation.v;
import androidx.core.content.d;
import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.layout.constant.c;
import com.scwang.smart.refresh.layout.simple.b;
import oc.b;
import qc.e;
import qc.f;

/* loaded from: classes6.dex */
public abstract class ClassicsAbstract<T extends ClassicsAbstract<?>> extends b implements qc.a {

    /* renamed from: r, reason: collision with root package name */
    public static final int f70534r = b.C1303b.f83788c;

    /* renamed from: s, reason: collision with root package name */
    public static final int f70535s = b.C1303b.f83786a;

    /* renamed from: t, reason: collision with root package name */
    public static final int f70536t = b.C1303b.f83787b;

    /* renamed from: e, reason: collision with root package name */
    protected TextView f70537e;

    /* renamed from: f, reason: collision with root package name */
    protected ImageView f70538f;

    /* renamed from: g, reason: collision with root package name */
    protected ImageView f70539g;

    /* renamed from: h, reason: collision with root package name */
    protected e f70540h;

    /* renamed from: i, reason: collision with root package name */
    protected com.scwang.smart.drawable.a f70541i;

    /* renamed from: j, reason: collision with root package name */
    protected com.scwang.smart.drawable.a f70542j;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f70543k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f70544l;

    /* renamed from: m, reason: collision with root package name */
    protected int f70545m;

    /* renamed from: n, reason: collision with root package name */
    protected int f70546n;

    /* renamed from: o, reason: collision with root package name */
    protected int f70547o;

    /* renamed from: p, reason: collision with root package name */
    protected int f70548p;

    /* renamed from: q, reason: collision with root package name */
    protected int f70549q;

    public ClassicsAbstract(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f70546n = 500;
        this.f70547o = 20;
        this.f70548p = 20;
        this.f70549q = 0;
        this.f70698c = c.f70685d;
    }

    public T A(float f4) {
        ImageView imageView = this.f70538f;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int c5 = com.scwang.smart.refresh.layout.util.b.c(f4);
        layoutParams.width = c5;
        layoutParams.height = c5;
        imageView.setLayoutParams(layoutParams);
        return m();
    }

    public T B(int i4) {
        ViewGroup.LayoutParams layoutParams = this.f70538f.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i4;
        this.f70538f.setLayoutParams(layoutParams);
        return m();
    }

    public T C(float f4) {
        ImageView imageView = this.f70538f;
        ImageView imageView2 = this.f70539g;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
        int c5 = com.scwang.smart.refresh.layout.util.b.c(f4);
        marginLayoutParams2.rightMargin = c5;
        marginLayoutParams.rightMargin = c5;
        imageView.setLayoutParams(marginLayoutParams);
        imageView2.setLayoutParams(marginLayoutParams2);
        return m();
    }

    public T D(int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f70538f.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f70539g.getLayoutParams();
        marginLayoutParams2.rightMargin = i4;
        marginLayoutParams.rightMargin = i4;
        this.f70538f.setLayoutParams(marginLayoutParams);
        this.f70539g.setLayoutParams(marginLayoutParams2);
        return m();
    }

    public T E(float f4) {
        ImageView imageView = this.f70539g;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int c5 = com.scwang.smart.refresh.layout.util.b.c(f4);
        layoutParams.width = c5;
        layoutParams.height = c5;
        imageView.setLayoutParams(layoutParams);
        return m();
    }

    public T F(int i4) {
        ViewGroup.LayoutParams layoutParams = this.f70539g.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i4;
        this.f70539g.setLayoutParams(layoutParams);
        return m();
    }

    public T G(float f4) {
        ImageView imageView = this.f70538f;
        ImageView imageView2 = this.f70539g;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int c5 = com.scwang.smart.refresh.layout.util.b.c(f4);
        layoutParams2.width = c5;
        layoutParams.width = c5;
        int c6 = com.scwang.smart.refresh.layout.util.b.c(f4);
        layoutParams2.height = c6;
        layoutParams.height = c6;
        imageView.setLayoutParams(layoutParams);
        imageView2.setLayoutParams(layoutParams2);
        return m();
    }

    public T H(int i4) {
        ViewGroup.LayoutParams layoutParams = this.f70538f.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f70539g.getLayoutParams();
        layoutParams2.width = i4;
        layoutParams.width = i4;
        layoutParams2.height = i4;
        layoutParams.height = i4;
        this.f70538f.setLayoutParams(layoutParams);
        this.f70539g.setLayoutParams(layoutParams2);
        return m();
    }

    public T I(int i4) {
        this.f70546n = i4;
        return m();
    }

    public T J(@l int i4) {
        this.f70544l = true;
        this.f70545m = i4;
        e eVar = this.f70540h;
        if (eVar != null) {
            eVar.b(this, i4);
        }
        return m();
    }

    public T K(@n int i4) {
        J(d.getColor(getContext(), i4));
        return m();
    }

    public T L(Bitmap bitmap) {
        this.f70542j = null;
        this.f70539g.setImageBitmap(bitmap);
        return m();
    }

    public T M(Drawable drawable) {
        this.f70542j = null;
        this.f70539g.setImageDrawable(drawable);
        return m();
    }

    public T N(@v int i4) {
        this.f70542j = null;
        this.f70539g.setImageResource(i4);
        return m();
    }

    public T O(c cVar) {
        this.f70698c = cVar;
        return m();
    }

    public T P(float f4) {
        this.f70537e.setTextSize(f4);
        e eVar = this.f70540h;
        if (eVar != null) {
            eVar.d(this);
        }
        return m();
    }

    public T Q(int i4, float f4) {
        this.f70537e.setTextSize(i4, f4);
        e eVar = this.f70540h;
        if (eVar != null) {
            eVar.d(this);
        }
        return m();
    }

    @Override // com.scwang.smart.refresh.layout.simple.b, qc.a
    public void d(@l int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && !this.f70544l) {
                J(iArr[0]);
                this.f70544l = false;
            }
            if (this.f70543k) {
                return;
            }
            if (iArr.length > 1) {
                t(iArr[1]);
            }
            this.f70543k = false;
        }
    }

    @Override // com.scwang.smart.refresh.layout.simple.b, qc.a
    public void f(@o0 f fVar, int i4, int i5) {
        r(fVar, i4, i5);
    }

    @Override // com.scwang.smart.refresh.layout.simple.b, qc.a
    public void h(@o0 e eVar, int i4, int i5) {
        this.f70540h = eVar;
        eVar.b(this, this.f70545m);
    }

    @Override // com.scwang.smart.refresh.layout.simple.b, qc.a
    public int l(@o0 f fVar, boolean z4) {
        ImageView imageView = this.f70539g;
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(0.0f).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.f70546n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected T m() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageView imageView = this.f70538f;
        ImageView imageView2 = this.f70539g;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        Object drawable = this.f70539g.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f70549q == 0) {
            this.f70547o = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.f70548p = paddingBottom;
            if (this.f70547o == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i6 = this.f70547o;
                if (i6 == 0) {
                    i6 = com.scwang.smart.refresh.layout.util.b.c(20.0f);
                }
                this.f70547o = i6;
                int i7 = this.f70548p;
                if (i7 == 0) {
                    i7 = com.scwang.smart.refresh.layout.util.b.c(20.0f);
                }
                this.f70548p = i7;
                setPadding(paddingLeft, this.f70547o, paddingRight, i7);
            }
            setClipToPadding(false);
        }
        if (View.MeasureSpec.getMode(i5) == 1073741824) {
            int size = View.MeasureSpec.getSize(i5);
            int i10 = this.f70549q;
            if (size < i10) {
                int i11 = (size - i10) / 2;
                setPadding(getPaddingLeft(), i11, getPaddingRight(), i11);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.f70547o, getPaddingRight(), this.f70548p);
        }
        super.onMeasure(i4, i5);
        if (this.f70549q == 0) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                int measuredHeight = getChildAt(i12).getMeasuredHeight();
                if (this.f70549q < measuredHeight) {
                    this.f70549q = measuredHeight;
                }
            }
        }
    }

    @Override // com.scwang.smart.refresh.layout.simple.b, qc.a
    public void r(@o0 f fVar, int i4, int i5) {
        ImageView imageView = this.f70539g;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            Object drawable = this.f70539g.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    public T t(@l int i4) {
        this.f70543k = true;
        this.f70537e.setTextColor(i4);
        com.scwang.smart.drawable.a aVar = this.f70541i;
        if (aVar != null) {
            aVar.a(i4);
            this.f70538f.invalidateDrawable(this.f70541i);
        }
        com.scwang.smart.drawable.a aVar2 = this.f70542j;
        if (aVar2 != null) {
            aVar2.a(i4);
            this.f70539g.invalidateDrawable(this.f70542j);
        }
        return m();
    }

    public T w(@n int i4) {
        t(d.getColor(getContext(), i4));
        return m();
    }

    public T x(Bitmap bitmap) {
        this.f70541i = null;
        this.f70538f.setImageBitmap(bitmap);
        return m();
    }

    public T y(Drawable drawable) {
        this.f70541i = null;
        this.f70538f.setImageDrawable(drawable);
        return m();
    }

    public T z(@v int i4) {
        this.f70541i = null;
        this.f70538f.setImageResource(i4);
        return m();
    }
}
