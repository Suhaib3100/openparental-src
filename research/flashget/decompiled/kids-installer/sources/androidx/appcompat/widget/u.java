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
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.core.view.y1;
import d.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
class u {

    /* renamed from: n, reason: collision with root package name */
    private static final int f1369n = 12;

    /* renamed from: o, reason: collision with root package name */
    private static final int f1370o = 112;

    /* renamed from: p, reason: collision with root package name */
    private static final int f1371p = 1;

    /* renamed from: s, reason: collision with root package name */
    static final float f1374s = -1.0f;

    /* renamed from: t, reason: collision with root package name */
    private static final int f1375t = 1048576;

    /* renamed from: a, reason: collision with root package name */
    private int f1376a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1377b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f1378c = f1374s;

    /* renamed from: d, reason: collision with root package name */
    private float f1379d = f1374s;

    /* renamed from: e, reason: collision with root package name */
    private float f1380e = f1374s;

    /* renamed from: f, reason: collision with root package name */
    private int[] f1381f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f1382g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f1383h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.o0
    private final TextView f1384i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f1385j;

    /* renamed from: k, reason: collision with root package name */
    private final c f1386k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f1367l = "ACTVAutoSizeHelper";

    /* renamed from: m, reason: collision with root package name */
    private static final RectF f1368m = new RectF();

    /* renamed from: q, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f1372q = new ConcurrentHashMap<>();

    /* renamed from: r, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f1373r = new ConcurrentHashMap<>();

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.x0(23)
    /* loaded from: classes2.dex */
    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.u.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) u.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    @androidx.annotation.x0(29)
    /* loaded from: classes3.dex */
    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.u.a, androidx.appcompat.widget.u.c
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.u.c
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    private static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) u.r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    u(@androidx.annotation.o0 TextView textView) {
        this.f1384i = textView;
        this.f1385j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1386k = new b();
        } else {
            this.f1386k = new a();
        }
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i5 = 0; i5 < length; i5++) {
                iArr[i5] = typedArray.getDimensionPixelSize(i5, -1);
            }
            this.f1381f = c(iArr);
            B();
        }
    }

    private boolean B() {
        boolean z5 = this.f1381f.length > 0;
        this.f1382g = z5;
        if (z5) {
            this.f1376a = 1;
            this.f1379d = r0[0];
            this.f1380e = r0[r1 - 1];
            this.f1378c = f1374s;
        }
        return z5;
    }

    private boolean C(int i5, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1384i.getText();
        TransformationMethod transformationMethod = this.f1384i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1384i)) != null) {
            text = transformation;
        }
        int maxLines = this.f1384i.getMaxLines();
        q(i5);
        StaticLayout e6 = e(text, (Layout.Alignment) r(this.f1384i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e6.getLineCount() <= maxLines && e6.getLineEnd(e6.getLineCount() - 1) == text.length())) && ((float) e6.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.f1384i instanceof AppCompatEditText);
    }

    private void E(float f6, float f7, float f8) throws IllegalArgumentException {
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f6 + "px) is less or equal to (0px)");
        }
        if (f7 <= f6) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f7 + "px) is less or equal to minimum auto-size text size (" + f6 + "px)");
        }
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f8 + "px) is less or equal to (0px)");
        }
        this.f1376a = 1;
        this.f1379d = f6;
        this.f1380e = f7;
        this.f1378c = f8;
        this.f1382g = false;
    }

    private static <T> T a(@androidx.annotation.o0 Object obj, @androidx.annotation.o0 String str, @androidx.annotation.o0 T t5) {
        try {
            Field o5 = o(str);
            return o5 == null ? t5 : (T) o5.get(obj);
        } catch (IllegalAccessException unused) {
            return t5;
        }
    }

    private int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i5 : iArr) {
            if (i5 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i5)) < 0) {
                arrayList.add(Integer.valueOf(i5));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr2[i6] = ((Integer) arrayList.get(i6)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.f1376a = 0;
        this.f1379d = f1374s;
        this.f1380e = f1374s;
        this.f1378c = f1374s;
        this.f1381f = new int[0];
        this.f1377b = false;
    }

    @androidx.annotation.x0(23)
    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i5, int i6) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1383h, i5);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1384i.getLineSpacingExtra(), this.f1384i.getLineSpacingMultiplier()).setIncludePad(this.f1384i.getIncludeFontPadding()).setBreakStrategy(this.f1384i.getBreakStrategy()).setHyphenationFrequency(this.f1384i.getHyphenationFrequency());
        if (i6 == -1) {
            i6 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i6);
        try {
            this.f1386k.a(obtain, this.f1384i);
        } catch (ClassCastException unused) {
        }
        return obtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i5) {
        return new StaticLayout(charSequence, this.f1383h, i5, alignment, ((Float) a(this.f1384i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f1384i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f1384i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    @androidx.annotation.x0(16)
    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i5) {
        return new StaticLayout(charSequence, this.f1383h, i5, alignment, this.f1384i.getLineSpacingMultiplier(), this.f1384i.getLineSpacingExtra(), this.f1384i.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int length = this.f1381f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i5 = 1;
        int i6 = length - 1;
        int i7 = 0;
        while (i5 <= i6) {
            int i8 = (i5 + i6) / 2;
            if (C(this.f1381f[i8], rectF)) {
                int i9 = i8 + 1;
                i7 = i5;
                i5 = i9;
            } else {
                i7 = i8 - 1;
                i6 = i7;
            }
        }
        return this.f1381f[i7];
    }

    @androidx.annotation.q0
    private static Field o(@androidx.annotation.o0 String str) {
        try {
            Field field = f1373r.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1373r.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @androidx.annotation.q0
    private static Method p(@androidx.annotation.o0 String str) {
        try {
            Method method = f1372q.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1372q.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    static <T> T r(@androidx.annotation.o0 Object obj, @androidx.annotation.o0 String str, @androidx.annotation.o0 T t5) {
        try {
            return (T) p(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return t5;
        }
    }

    private void x(float f6) {
        if (f6 != this.f1384i.getPaint().getTextSize()) {
            this.f1384i.getPaint().setTextSize(f6);
            boolean isInLayout = this.f1384i.isInLayout();
            if (this.f1384i.getLayout() != null) {
                this.f1377b = false;
                try {
                    Method p5 = p("nullLayouts");
                    if (p5 != null) {
                        p5.invoke(this.f1384i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (isInLayout) {
                    this.f1384i.forceLayout();
                } else {
                    this.f1384i.requestLayout();
                }
                this.f1384i.invalidate();
            }
        }
    }

    private boolean z() {
        if (D() && this.f1376a == 1) {
            if (!this.f1382g || this.f1381f.length == 0) {
                int floor = ((int) Math.floor((this.f1380e - this.f1379d) / this.f1378c)) + 1;
                int[] iArr = new int[floor];
                for (int i5 = 0; i5 < floor; i5++) {
                    iArr[i5] = Math.round((i5 * this.f1378c) + this.f1379d);
                }
                this.f1381f = c(iArr);
            }
            this.f1377b = true;
        } else {
            this.f1377b = false;
        }
        return this.f1377b;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void b() {
        if (s()) {
            if (this.f1377b) {
                if (this.f1384i.getMeasuredHeight() <= 0 || this.f1384i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1386k.b(this.f1384i) ? 1048576 : (this.f1384i.getMeasuredWidth() - this.f1384i.getTotalPaddingLeft()) - this.f1384i.getTotalPaddingRight();
                int height = (this.f1384i.getHeight() - this.f1384i.getCompoundPaddingBottom()) - this.f1384i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1368m;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float i5 = i(rectF);
                    if (i5 != this.f1384i.getTextSize()) {
                        y(0, i5);
                    }
                }
            }
            this.f1377b = true;
        }
    }

    @m1
    StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i5, int i6) {
        return f(charSequence, alignment, i5, i6);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    int j() {
        return Math.round(this.f1380e);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    int k() {
        return Math.round(this.f1379d);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    int l() {
        return Math.round(this.f1378c);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    int[] m() {
        return this.f1381f;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    int n() {
        return this.f1376a;
    }

    @m1
    void q(int i5) {
        TextPaint textPaint = this.f1383h;
        if (textPaint == null) {
            this.f1383h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1383h.set(this.f1384i.getPaint());
        this.f1383h.setTextSize(i5);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    boolean s() {
        return D() && this.f1376a != 0;
    }

    void t(@androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        int resourceId;
        Context context = this.f1385j;
        int[] iArr = a.n.J0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i5, 0);
        TextView textView = this.f1384i;
        y1.z1(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i5, 0);
        int i6 = a.n.P0;
        if (obtainStyledAttributes.hasValue(i6)) {
            this.f1376a = obtainStyledAttributes.getInt(i6, 0);
        }
        int i7 = a.n.O0;
        float dimension = obtainStyledAttributes.hasValue(i7) ? obtainStyledAttributes.getDimension(i7, f1374s) : -1.0f;
        int i8 = a.n.M0;
        float dimension2 = obtainStyledAttributes.hasValue(i8) ? obtainStyledAttributes.getDimension(i8, f1374s) : -1.0f;
        int i9 = a.n.L0;
        float dimension3 = obtainStyledAttributes.hasValue(i9) ? obtainStyledAttributes.getDimension(i9, f1374s) : -1.0f;
        int i10 = a.n.N0;
        if (obtainStyledAttributes.hasValue(i10) && (resourceId = obtainStyledAttributes.getResourceId(i10, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!D()) {
            this.f1376a = 0;
            return;
        }
        if (this.f1376a == 1) {
            if (!this.f1382g) {
                DisplayMetrics displayMetrics = this.f1385j.getResources().getDisplayMetrics();
                if (dimension2 == f1374s) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == f1374s) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == f1374s) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void u(int i5, int i6, int i7, int i8) throws IllegalArgumentException {
        if (D()) {
            DisplayMetrics displayMetrics = this.f1385j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i8, i5, displayMetrics), TypedValue.applyDimension(i8, i6, displayMetrics), TypedValue.applyDimension(i8, i7, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void v(@androidx.annotation.o0 int[] iArr, int i5) throws IllegalArgumentException {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i5 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1385j.getResources().getDisplayMetrics();
                    for (int i6 = 0; i6 < length; i6++) {
                        iArr2[i6] = Math.round(TypedValue.applyDimension(i5, iArr[i6], displayMetrics));
                    }
                }
                this.f1381f = c(iArr2);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1382g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void w(int i5) {
        if (D()) {
            if (i5 == 0) {
                d();
                return;
            }
            if (i5 != 1) {
                throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("Unknown auto-size text type: ", i5));
            }
            DisplayMetrics displayMetrics = this.f1385j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z()) {
                b();
            }
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    void y(int i5, float f6) {
        Context context = this.f1385j;
        x(TypedValue.applyDimension(i5, f6, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
