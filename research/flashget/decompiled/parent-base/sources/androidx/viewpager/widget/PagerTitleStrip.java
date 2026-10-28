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
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.e
/* loaded from: classes3.dex */
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f35482p = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f35483q = {R.attr.textAllCaps};

    /* renamed from: r, reason: collision with root package name */
    private static final float f35484r = 0.6f;

    /* renamed from: s, reason: collision with root package name */
    private static final int f35485s = 16;

    /* renamed from: b, reason: collision with root package name */
    ViewPager f35486b;

    /* renamed from: c, reason: collision with root package name */
    TextView f35487c;

    /* renamed from: d, reason: collision with root package name */
    TextView f35488d;

    /* renamed from: e, reason: collision with root package name */
    TextView f35489e;

    /* renamed from: f, reason: collision with root package name */
    private int f35490f;

    /* renamed from: g, reason: collision with root package name */
    float f35491g;

    /* renamed from: h, reason: collision with root package name */
    private int f35492h;

    /* renamed from: i, reason: collision with root package name */
    private int f35493i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f35494j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35495k;

    /* renamed from: l, reason: collision with root package name */
    private final a f35496l;

    /* renamed from: m, reason: collision with root package name */
    private WeakReference<androidx.viewpager.widget.a> f35497m;

    /* renamed from: n, reason: collision with root package name */
    private int f35498n;

    /* renamed from: o, reason: collision with root package name */
    int f35499o;

    private class a extends DataSetObserver implements ViewPager.i, ViewPager.h {

        /* renamed from: a, reason: collision with root package name */
        private int f35500a;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i4, float f4, int i5) {
            if (f4 > 0.5f) {
                i4++;
            }
            PagerTitleStrip.this.k(i4, f4, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            PagerTitleStrip.this.i(aVar, aVar2);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void c(int i4) {
            this.f35500a = i4;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(int i4) {
            if (this.f35500a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.j(pagerTitleStrip.f35486b.x(), PagerTitleStrip.this.f35486b.u());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f4 = pagerTitleStrip2.f35491g;
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
                pagerTitleStrip2.k(pagerTitleStrip2.f35486b.x(), f4, true);
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.j(pagerTitleStrip.f35486b.x(), PagerTitleStrip.this.f35486b.u());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f4 = pagerTitleStrip2.f35491g;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            pagerTitleStrip2.k(pagerTitleStrip2.f35486b.x(), f4, true);
        }
    }

    private static class b extends SingleLineTransformationMethod {

        /* renamed from: a, reason: collision with root package name */
        private Locale f35502a;

        b(Context context) {
            this.f35502a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f35502a);
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
        return this.f35492h;
    }

    public void c(int i4) {
        this.f35493i = i4;
        requestLayout();
    }

    public void d(@x(from = 0.0d, to = 1.0d) float f4) {
        int i4 = ((int) (f4 * 255.0f)) & 255;
        this.f35498n = i4;
        int i5 = (i4 << 24) | (this.f35499o & 16777215);
        this.f35487c.setTextColor(i5);
        this.f35489e.setTextColor(i5);
    }

    public void f(@l int i4) {
        this.f35499o = i4;
        this.f35488d.setTextColor(i4);
        int i5 = (this.f35498n << 24) | (this.f35499o & 16777215);
        this.f35487c.setTextColor(i5);
        this.f35489e.setTextColor(i5);
    }

    public void g(int i4, float f4) {
        this.f35487c.setTextSize(i4, f4);
        this.f35488d.setTextSize(i4, f4);
        this.f35489e.setTextSize(i4, f4);
    }

    public void h(int i4) {
        this.f35492h = i4;
        requestLayout();
    }

    void i(androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        if (aVar != null) {
            aVar.x(this.f35496l);
            this.f35497m = null;
        }
        if (aVar2 != null) {
            aVar2.p(this.f35496l);
            this.f35497m = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f35486b;
        if (viewPager != null) {
            this.f35490f = -1;
            this.f35491g = -1.0f;
            j(viewPager.x(), aVar2);
            requestLayout();
        }
    }

    void j(int i4, androidx.viewpager.widget.a aVar) {
        int h4 = aVar != null ? aVar.h() : 0;
        this.f35494j = true;
        CharSequence charSequence = null;
        this.f35487c.setText((i4 < 1 || aVar == null) ? null : aVar.j(i4 - 1));
        this.f35488d.setText((aVar == null || i4 >= h4) ? null : aVar.j(i4));
        int i5 = i4 + 1;
        if (i5 < h4 && aVar != null) {
            charSequence = aVar.j(i5);
        }
        this.f35489e.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f35487c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f35488d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f35489e.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f35490f = i4;
        if (!this.f35495k) {
            k(i4, this.f35491g, false);
        }
        this.f35494j = false;
    }

    void k(int i4, float f4, boolean z4) {
        int i5;
        int i6;
        int i7;
        int i10;
        if (i4 != this.f35490f) {
            j(i4, this.f35486b.u());
        } else if (!z4 && f4 == this.f35491g) {
            return;
        }
        this.f35495k = true;
        int measuredWidth = this.f35487c.getMeasuredWidth();
        int measuredWidth2 = this.f35488d.getMeasuredWidth();
        int measuredWidth3 = this.f35489e.getMeasuredWidth();
        int i11 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i12 = paddingRight + i11;
        int i13 = (width - (paddingLeft + i11)) - i12;
        float f5 = 0.5f + f4;
        if (f5 > 1.0f) {
            f5 -= 1.0f;
        }
        int i14 = ((width - i12) - ((int) (i13 * f5))) - i11;
        int i15 = measuredWidth2 + i14;
        int baseline = this.f35487c.getBaseline();
        int baseline2 = this.f35488d.getBaseline();
        int baseline3 = this.f35489e.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i16 = max - baseline;
        int i17 = max - baseline2;
        int i18 = max - baseline3;
        int max2 = Math.max(Math.max(this.f35487c.getMeasuredHeight() + i16, this.f35488d.getMeasuredHeight() + i17), this.f35489e.getMeasuredHeight() + i18);
        int i19 = this.f35493i & 112;
        if (i19 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else {
            if (i19 != 80) {
                i6 = i16 + paddingTop;
                i7 = i17 + paddingTop;
                i10 = paddingTop + i18;
                TextView textView = this.f35488d;
                textView.layout(i14, i7, i15, textView.getMeasuredHeight() + i7);
                int min = Math.min(paddingLeft, (i14 - this.f35492h) - measuredWidth);
                TextView textView2 = this.f35487c;
                textView2.layout(min, i6, measuredWidth + min, textView2.getMeasuredHeight() + i6);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i15 + this.f35492h);
                TextView textView3 = this.f35489e;
                textView3.layout(max3, i10, max3 + measuredWidth3, textView3.getMeasuredHeight() + i10);
                this.f35491g = f4;
                this.f35495k = false;
            }
            i5 = (height - paddingBottom) - max2;
        }
        i6 = i16 + i5;
        i7 = i17 + i5;
        i10 = i5 + i18;
        TextView textView4 = this.f35488d;
        textView4.layout(i14, i7, i15, textView4.getMeasuredHeight() + i7);
        int min2 = Math.min(paddingLeft, (i14 - this.f35492h) - measuredWidth);
        TextView textView22 = this.f35487c;
        textView22.layout(min2, i6, measuredWidth + min2, textView22.getMeasuredHeight() + i6);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i15 + this.f35492h);
        TextView textView32 = this.f35489e;
        textView32.layout(max32, i10, max32 + measuredWidth3, textView32.getMeasuredHeight() + i10);
        this.f35491g = f4;
        this.f35495k = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        androidx.viewpager.widget.a u4 = viewPager.u();
        viewPager.c0(this.f35496l);
        viewPager.b(this.f35496l);
        this.f35486b = viewPager;
        WeakReference<androidx.viewpager.widget.a> weakReference = this.f35497m;
        i(weakReference != null ? weakReference.get() : null, u4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f35486b;
        if (viewPager != null) {
            i(viewPager.u(), null);
            this.f35486b.c0(null);
            this.f35486b.S(this.f35496l);
            this.f35486b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        if (this.f35486b != null) {
            float f4 = this.f35491g;
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            k(this.f35490f, f4, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int max;
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i4);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, (int) (size * 0.2f), -2);
        this.f35487c.measure(childMeasureSpec2, childMeasureSpec);
        this.f35488d.measure(childMeasureSpec2, childMeasureSpec);
        this.f35489e.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i5) == 1073741824) {
            max = View.MeasureSpec.getSize(i5);
        } else {
            max = Math.max(a(), this.f35488d.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i5, this.f35488d.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f35494j) {
            return;
        }
        super.requestLayout();
    }

    public PagerTitleStrip(@o0 Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35490f = -1;
        this.f35491g = -1.0f;
        this.f35496l = new a();
        TextView textView = new TextView(context);
        this.f35487c = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f35488d = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f35489e = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f35482p);
        boolean z4 = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f35487c.setTextAppearance(resourceId);
            this.f35488d.setTextAppearance(resourceId);
            this.f35489e.setTextAppearance(resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            g(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f35487c.setTextColor(color);
            this.f35488d.setTextColor(color);
            this.f35489e.setTextColor(color);
        }
        this.f35493i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f35499o = this.f35488d.getTextColors().getDefaultColor();
        d(f35484r);
        TextView textView4 = this.f35487c;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.f35488d.setEllipsize(truncateAt);
        this.f35489e.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f35483q);
            z4 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z4) {
            e(this.f35487c);
            e(this.f35488d);
            e(this.f35489e);
        } else {
            this.f35487c.setSingleLine();
            this.f35488d.setSingleLine();
            this.f35489e.setSingleLine();
        }
        this.f35492h = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
