package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.core.view.y1;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.e
/* loaded from: classes.dex */
public class PagerTitleStrip extends ViewGroup {
    private static final int[] C = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    private static final int[] D = {R.attr.textAllCaps};
    private static final float E = 0.6f;
    private static final int F = 16;
    private int A;
    int B;

    /* renamed from: o, reason: collision with root package name */
    ViewPager f10344o;

    /* renamed from: p, reason: collision with root package name */
    TextView f10345p;

    /* renamed from: q, reason: collision with root package name */
    TextView f10346q;

    /* renamed from: r, reason: collision with root package name */
    TextView f10347r;

    /* renamed from: s, reason: collision with root package name */
    private int f10348s;

    /* renamed from: t, reason: collision with root package name */
    float f10349t;

    /* renamed from: u, reason: collision with root package name */
    private int f10350u;

    /* renamed from: v, reason: collision with root package name */
    private int f10351v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10352w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f10353x;

    /* renamed from: y, reason: collision with root package name */
    private final a f10354y;

    /* renamed from: z, reason: collision with root package name */
    private WeakReference<androidx.viewpager.widget.a> f10355z;

    /* loaded from: classes3.dex */
    private class a extends DataSetObserver implements ViewPager.i, ViewPager.h {

        /* renamed from: a, reason: collision with root package name */
        private int f10356a;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i5, float f6, int i6) {
            if (f6 > 0.5f) {
                i5++;
            }
            PagerTitleStrip.this.k(i5, f6, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            PagerTitleStrip.this.i(aVar, aVar2);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i5) {
            this.f10356a = i5;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(int i5) {
            if (this.f10356a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.j(pagerTitleStrip.f10344o.x(), PagerTitleStrip.this.f10344o.u());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f6 = pagerTitleStrip2.f10349t;
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                pagerTitleStrip2.k(pagerTitleStrip2.f10344o.x(), f6, true);
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.j(pagerTitleStrip.f10344o.x(), PagerTitleStrip.this.f10344o.u());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f6 = pagerTitleStrip2.f10349t;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            pagerTitleStrip2.k(pagerTitleStrip2.f10344o.x(), f6, true);
        }
    }

    private static class b extends SingleLineTransformationMethod {

        /* renamed from: o, reason: collision with root package name */
        private Locale f10358o;

        b(Context context) {
            this.f10358o = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f10358o);
            }
            return null;
        }
    }

    public PagerTitleStrip(@o0 Context context) {
        this(context, null);
    }

    private static void e(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    int a() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int b() {
        return this.f10350u;
    }

    public void c(int i5) {
        this.f10351v = i5;
        requestLayout();
    }

    public void d(@x(from = 0.0d, to = 1.0d) float f6) {
        int i5 = ((int) (f6 * 255.0f)) & 255;
        this.A = i5;
        int i6 = (i5 << 24) | (this.B & y1.f5757s);
        this.f10345p.setTextColor(i6);
        this.f10347r.setTextColor(i6);
    }

    public void f(@l int i5) {
        this.B = i5;
        this.f10346q.setTextColor(i5);
        int i6 = (this.A << 24) | (this.B & y1.f5757s);
        this.f10345p.setTextColor(i6);
        this.f10347r.setTextColor(i6);
    }

    public void g(int i5, float f6) {
        this.f10345p.setTextSize(i5, f6);
        this.f10346q.setTextSize(i5, f6);
        this.f10347r.setTextSize(i5, f6);
    }

    public void h(int i5) {
        this.f10350u = i5;
        requestLayout();
    }

    void i(androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        if (aVar != null) {
            aVar.x(this.f10354y);
            this.f10355z = null;
        }
        if (aVar2 != null) {
            aVar2.p(this.f10354y);
            this.f10355z = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f10344o;
        if (viewPager != null) {
            this.f10348s = -1;
            this.f10349t = -1.0f;
            j(viewPager.x(), aVar2);
            requestLayout();
        }
    }

    void j(int i5, androidx.viewpager.widget.a aVar) {
        int h5 = aVar != null ? aVar.h() : 0;
        this.f10352w = true;
        CharSequence charSequence = null;
        this.f10345p.setText((i5 < 1 || aVar == null) ? null : aVar.j(i5 - 1));
        this.f10346q.setText((aVar == null || i5 >= h5) ? null : aVar.j(i5));
        int i6 = i5 + 1;
        if (i6 < h5 && aVar != null) {
            charSequence = aVar.j(i6);
        }
        this.f10347r.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f10345p.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f10346q.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f10347r.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f10348s = i5;
        if (!this.f10353x) {
            k(i5, this.f10349t, false);
        }
        this.f10352w = false;
    }

    void k(int i5, float f6, boolean z5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (i5 != this.f10348s) {
            j(i5, this.f10344o.u());
        } else if (!z5 && f6 == this.f10349t) {
            return;
        }
        this.f10353x = true;
        int measuredWidth = this.f10345p.getMeasuredWidth();
        int measuredWidth2 = this.f10346q.getMeasuredWidth();
        int measuredWidth3 = this.f10347r.getMeasuredWidth();
        int i10 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i11 = paddingRight + i10;
        int i12 = (width - (paddingLeft + i10)) - i11;
        float f7 = 0.5f + f6;
        if (f7 > 1.0f) {
            f7 -= 1.0f;
        }
        int i13 = ((width - i11) - ((int) (i12 * f7))) - i10;
        int i14 = measuredWidth2 + i13;
        int baseline = this.f10345p.getBaseline();
        int baseline2 = this.f10346q.getBaseline();
        int baseline3 = this.f10347r.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i15 = max - baseline;
        int i16 = max - baseline2;
        int i17 = max - baseline3;
        int max2 = Math.max(Math.max(this.f10345p.getMeasuredHeight() + i15, this.f10346q.getMeasuredHeight() + i16), this.f10347r.getMeasuredHeight() + i17);
        int i18 = this.f10351v & 112;
        if (i18 == 16) {
            i6 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else {
            if (i18 != 80) {
                i7 = i15 + paddingTop;
                i8 = i16 + paddingTop;
                i9 = paddingTop + i17;
                TextView textView = this.f10346q;
                textView.layout(i13, i8, i14, textView.getMeasuredHeight() + i8);
                int min = Math.min(paddingLeft, (i13 - this.f10350u) - measuredWidth);
                TextView textView2 = this.f10345p;
                textView2.layout(min, i7, measuredWidth + min, textView2.getMeasuredHeight() + i7);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i14 + this.f10350u);
                TextView textView3 = this.f10347r;
                textView3.layout(max3, i9, max3 + measuredWidth3, textView3.getMeasuredHeight() + i9);
                this.f10349t = f6;
                this.f10353x = false;
            }
            i6 = (height - paddingBottom) - max2;
        }
        i7 = i15 + i6;
        i8 = i16 + i6;
        i9 = i6 + i17;
        TextView textView4 = this.f10346q;
        textView4.layout(i13, i8, i14, textView4.getMeasuredHeight() + i8);
        int min2 = Math.min(paddingLeft, (i13 - this.f10350u) - measuredWidth);
        TextView textView22 = this.f10345p;
        textView22.layout(min2, i7, measuredWidth + min2, textView22.getMeasuredHeight() + i7);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i14 + this.f10350u);
        TextView textView32 = this.f10347r;
        textView32.layout(max32, i9, max32 + measuredWidth3, textView32.getMeasuredHeight() + i9);
        this.f10349t = f6;
        this.f10353x = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        androidx.viewpager.widget.a u5 = viewPager.u();
        viewPager.c0(this.f10354y);
        viewPager.b(this.f10354y);
        this.f10344o = viewPager;
        WeakReference<androidx.viewpager.widget.a> weakReference = this.f10355z;
        i(weakReference != null ? weakReference.get() : null, u5);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f10344o;
        if (viewPager != null) {
            i(viewPager.u(), null);
            this.f10344o.c0(null);
            this.f10344o.S(this.f10354y);
            this.f10344o = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        if (this.f10344o != null) {
            float f6 = this.f10349t;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            k(this.f10348s, f6, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int max;
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i5);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, (int) (size * 0.2f), -2);
        this.f10345p.measure(childMeasureSpec2, childMeasureSpec);
        this.f10346q.measure(childMeasureSpec2, childMeasureSpec);
        this.f10347r.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i6) == 1073741824) {
            max = View.MeasureSpec.getSize(i6);
        } else {
            max = Math.max(a(), this.f10346q.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i6, this.f10346q.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f10352w) {
            return;
        }
        super.requestLayout();
    }

    public PagerTitleStrip(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10348s = -1;
        this.f10349t = -1.0f;
        this.f10354y = new a();
        TextView textView = new TextView(context);
        this.f10345p = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f10346q = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f10347r = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C);
        boolean z5 = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f10345p.setTextAppearance(resourceId);
            this.f10346q.setTextAppearance(resourceId);
            this.f10347r.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            g(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f10345p.setTextColor(color);
            this.f10346q.setTextColor(color);
            this.f10347r.setTextColor(color);
        }
        this.f10351v = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.B = this.f10346q.getTextColors().getDefaultColor();
        d(E);
        this.f10345p.setEllipsize(TextUtils.TruncateAt.END);
        this.f10346q.setEllipsize(TextUtils.TruncateAt.END);
        this.f10347r.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, D);
            z5 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z5) {
            e(this.f10345p);
            e(this.f10346q);
            e(this.f10347r);
        } else {
            this.f10345p.setSingleLine();
            this.f10346q.setSingleLine();
            this.f10347r.setSingleLine();
        }
        this.f10350u = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
