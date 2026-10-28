package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.core.view.x1;
import d.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
class r {

    /* renamed from: n, reason: collision with root package name */
    private static final int f2016n = 12;

    /* renamed from: o, reason: collision with root package name */
    private static final int f2017o = 112;

    /* renamed from: p, reason: collision with root package name */
    private static final int f2018p = 1;

    /* renamed from: s, reason: collision with root package name */
    static final float f2021s = -1.0f;

    /* renamed from: t, reason: collision with root package name */
    private static final int f2022t = 1048576;

    /* renamed from: a, reason: collision with root package name */
    private int f2023a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2024b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f2025c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f2026d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f2027e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f2028f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f2029g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f2030h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.o0
    private final TextView f2031i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f2032j;

    /* renamed from: k, reason: collision with root package name */
    private final f f2033k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f2014l = "ACTVAutoSizeHelper";

    /* renamed from: m, reason: collision with root package name */
    private static final RectF f2015m = new RectF();

    /* renamed from: q, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f2019q = new ConcurrentHashMap<>();

    /* renamed from: r, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f2020r = new ConcurrentHashMap<>();

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.x0(16)
    private static final class a {
        private a() {
        }

        @androidx.annotation.u
        @androidx.annotation.o0
        static StaticLayout a(@androidx.annotation.o0 CharSequence charSequence, @androidx.annotation.o0 Layout.Alignment alignment, int i4, @androidx.annotation.o0 TextView textView, @androidx.annotation.o0 TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i4, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @androidx.annotation.u
        static int b(@androidx.annotation.o0 TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.x0(18)
    private static final class b {
        private b() {
        }

        @androidx.annotation.u
        static boolean a(@androidx.annotation.o0 View view) {
            return view.isInLayout();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.x0(23)
    private static final class c {
        private c() {
        }

        @androidx.annotation.u
        @androidx.annotation.o0
        static StaticLayout a(@androidx.annotation.o0 CharSequence charSequence, @androidx.annotation.o0 Layout.Alignment alignment, int i4, int i5, @androidx.annotation.o0 TextView textView, @androidx.annotation.o0 TextPaint textPaint, @androidx.annotation.o0 f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i4);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i5 == -1) {
                i5 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i5);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
            }
            return obtain.build();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.x0(23)
    private static class d extends f {
        d() {
        }

        @Override // androidx.appcompat.widget.r.f
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) r.p(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.x0(29)
    private static class e extends d {
        e() {
        }

        @Override // androidx.appcompat.widget.r.d, androidx.appcompat.widget.r.f
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.r.f
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static class f {
        f() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) r.p(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    r(@androidx.annotation.o0 TextView textView) {
        this.f2031i = textView;
        this.f2032j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2033k = new e();
        } else {
            this.f2033k = new d();
        }
    }

    private boolean A(int i4, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f2031i.getText();
        TransformationMethod transformationMethod = this.f2031i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f2031i)) != null) {
            text = transformation;
        }
        int b5 = a.b(this.f2031i);
        o(i4);
        StaticLayout e4 = e(text, (Layout.Alignment) p(this.f2031i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b5);
        return (b5 == -1 || (e4.getLineCount() <= b5 && e4.getLineEnd(e4.getLineCount() - 1) == text.length())) && ((float) e4.getHeight()) <= rectF.bottom;
    }

    private boolean B() {
        return !(this.f2031i instanceof AppCompatEditText);
    }

    private void C(float f4, float f5, float f6) throws IllegalArgumentException {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        }
        if (f5 <= f4) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f2023a = 1;
        this.f2026d = f4;
        this.f2027e = f5;
        this.f2025c = f6;
        this.f2029g = false;
    }

    private static <T> T a(@androidx.annotation.o0 Object obj, @androidx.annotation.o0 String str, @androidx.annotation.o0 T t4) {
        try {
            Field m4 = m(str);
            return m4 == null ? t4 : (T) m4.get(obj);
        } catch (IllegalAccessException unused) {
            return t4;
        }
    }

    private int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f2023a = 0;
        this.f2026d = -1.0f;
        this.f2027e = -1.0f;
        this.f2025c = -1.0f;
        this.f2028f = new int[0];
        this.f2024b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i4) {
        return new StaticLayout(charSequence, this.f2030h, i4, alignment, ((Float) a(this.f2031i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f2031i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f2031i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    private int g(RectF rectF) {
        int length = this.f2028f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = 1;
        int i5 = length - 1;
        int i6 = 0;
        while (i4 <= i5) {
            int i7 = (i4 + i5) / 2;
            if (A(this.f2028f[i7], rectF)) {
                int i10 = i7 + 1;
                i6 = i4;
                i4 = i10;
            } else {
                i6 = i7 - 1;
                i5 = i6;
            }
        }
        return this.f2028f[i6];
    }

    @androidx.annotation.q0
    private static Field m(@androidx.annotation.o0 String str) {
        try {
            Field field = f2020r.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f2020r.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @androidx.annotation.q0
    private static Method n(@androidx.annotation.o0 String str) {
        try {
            Method method = f2019q.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                f2019q.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    static <T> T p(@androidx.annotation.o0 Object obj, @androidx.annotation.o0 String str, @androidx.annotation.o0 T t4) {
        try {
            return (T) n(str).invoke(obj, null);
        } catch (Exception unused) {
            return t4;
        }
    }

    private void v(float f4) {
        if (f4 != this.f2031i.getPaint().getTextSize()) {
            this.f2031i.getPaint().setTextSize(f4);
            boolean a5 = b.a(this.f2031i);
            if (this.f2031i.getLayout() != null) {
                this.f2024b = false;
                try {
                    Method n4 = n("nullLayouts");
                    if (n4 != null) {
                        n4.invoke(this.f2031i, null);
                    }
                } catch (Exception unused) {
                }
                if (a5) {
                    this.f2031i.forceLayout();
                } else {
                    this.f2031i.requestLayout();
                }
                this.f2031i.invalidate();
            }
        }
    }

    private boolean x() {
        if (B() && this.f2023a == 1) {
            if (!this.f2029g || this.f2028f.length == 0) {
                int floor = ((int) Math.floor((this.f2027e - this.f2026d) / this.f2025c)) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = Math.round((i4 * this.f2025c) + this.f2026d);
                }
                this.f2028f = c(iArr);
            }
            this.f2024b = true;
        } else {
            this.f2024b = false;
        }
        return this.f2024b;
    }

    private void y(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = typedArray.getDimensionPixelSize(i4, -1);
            }
            this.f2028f = c(iArr);
            z();
        }
    }

    private boolean z() {
        boolean z4 = this.f2028f.length > 0;
        this.f2029g = z4;
        if (z4) {
            this.f2023a = 1;
            this.f2026d = r0[0];
            this.f2027e = r0[r1 - 1];
            this.f2025c = -1.0f;
        }
        return z4;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void b() {
        if (q()) {
            if (this.f2024b) {
                if (this.f2031i.getMeasuredHeight() <= 0 || this.f2031i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2033k.b(this.f2031i) ? 1048576 : (this.f2031i.getMeasuredWidth() - this.f2031i.getTotalPaddingLeft()) - this.f2031i.getTotalPaddingRight();
                int height = (this.f2031i.getHeight() - this.f2031i.getCompoundPaddingBottom()) - this.f2031i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2015m;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float g4 = g(rectF);
                        if (g4 != this.f2031i.getTextSize()) {
                            w(0, g4);
                        }
                    } finally {
                    }
                }
            }
            this.f2024b = true;
        }
    }

    @androidx.annotation.o0
    @m1
    StaticLayout e(@androidx.annotation.o0 CharSequence charSequence, @androidx.annotation.o0 Layout.Alignment alignment, int i4, int i5) {
        return c.a(charSequence, alignment, i4, i5, this.f2031i, this.f2030h, this.f2033k);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    int h() {
        return Math.round(this.f2027e);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    int i() {
        return Math.round(this.f2026d);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    int j() {
        return Math.round(this.f2025c);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    int[] k() {
        return this.f2028f;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    int l() {
        return this.f2023a;
    }

    @m1
    void o(int i4) {
        TextPaint textPaint = this.f2030h;
        if (textPaint == null) {
            this.f2030h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2030h.set(this.f2031i.getPaint());
        this.f2030h.setTextSize(i4);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    boolean q() {
        return B() && this.f2023a != 0;
    }

    void r(@androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        int resourceId;
        Context context = this.f2032j;
        int[] iArr = a.m.f73595v0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        TextView textView = this.f2031i;
        x1.F1(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i4, 0);
        int i5 = a.m.B0;
        if (obtainStyledAttributes.hasValue(i5)) {
            this.f2023a = obtainStyledAttributes.getInt(i5, 0);
        }
        int i6 = a.m.A0;
        float dimension = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = a.m.f73610y0;
        float dimension2 = obtainStyledAttributes.hasValue(i7) ? obtainStyledAttributes.getDimension(i7, -1.0f) : -1.0f;
        int i10 = a.m.f73605x0;
        float dimension3 = obtainStyledAttributes.hasValue(i10) ? obtainStyledAttributes.getDimension(i10, -1.0f) : -1.0f;
        int i11 = a.m.f73615z0;
        if (obtainStyledAttributes.hasValue(i11) && (resourceId = obtainStyledAttributes.getResourceId(i11, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            y(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!B()) {
            this.f2023a = 0;
            return;
        }
        if (this.f2023a == 1) {
            if (!this.f2029g) {
                DisplayMetrics displayMetrics = this.f2032j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                C(dimension2, dimension3, dimension);
            }
            x();
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void s(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (B()) {
            DisplayMetrics displayMetrics = this.f2032j.getResources().getDisplayMetrics();
            C(TypedValue.applyDimension(i7, i4, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (x()) {
                b();
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void t(@androidx.annotation.o0 int[] iArr, int i4) throws IllegalArgumentException {
        if (B()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2032j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                this.f2028f = c(iArr2);
                if (!z()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2029g = false;
            }
            if (x()) {
                b();
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void u(int i4) {
        if (B()) {
            if (i4 == 0) {
                d();
                return;
            }
            if (i4 != 1) {
                throw new IllegalArgumentException(android.support.v4.media.a.a("Unknown auto-size text type: ", i4));
            }
            DisplayMetrics displayMetrics = this.f2032j.getResources().getDisplayMetrics();
            C(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (x()) {
                b();
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void w(int i4, float f4) {
        Context context = this.f2032j;
        v(TypedValue.applyDimension(i4, f4, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
