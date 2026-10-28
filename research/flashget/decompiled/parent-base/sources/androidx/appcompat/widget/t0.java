package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.c1;
import androidx.annotation.i1;
import androidx.core.content.res.i;

/* compiled from: TintTypedArray.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2039a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f2040b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f2041c;

    /* compiled from: TintTypedArray.java */
    @androidx.annotation.x0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(TypedArray typedArray) {
            return typedArray.getChangingConfigurations();
        }

        @androidx.annotation.u
        static int b(TypedArray typedArray, int i4) {
            return typedArray.getType(i4);
        }
    }

    private t0(Context context, TypedArray typedArray) {
        this.f2039a = context;
        this.f2040b = typedArray;
    }

    public static t0 E(Context context, int i4, int[] iArr) {
        return new t0(context, context.obtainStyledAttributes(i4, iArr));
    }

    public static t0 F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new t0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static t0 G(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5) {
        return new t0(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i5));
    }

    public boolean A(int i4, TypedValue typedValue) {
        return this.f2040b.getValue(i4, typedValue);
    }

    public TypedArray B() {
        return this.f2040b;
    }

    public boolean C(int i4) {
        return this.f2040b.hasValue(i4);
    }

    public int D() {
        return this.f2040b.length();
    }

    public TypedValue H(int i4) {
        return this.f2040b.peekValue(i4);
    }

    public void I() {
        this.f2040b.recycle();
    }

    public boolean a(int i4, boolean z4) {
        return this.f2040b.getBoolean(i4, z4);
    }

    @androidx.annotation.x0(21)
    public int b() {
        return a.a(this.f2040b);
    }

    public int c(int i4, int i5) {
        return this.f2040b.getColor(i4, i5);
    }

    public ColorStateList d(int i4) {
        int resourceId;
        ColorStateList colorStateList;
        return (!this.f2040b.hasValue(i4) || (resourceId = this.f2040b.getResourceId(i4, 0)) == 0 || (colorStateList = androidx.core.content.d.getColorStateList(this.f2039a, resourceId)) == null) ? this.f2040b.getColorStateList(i4) : colorStateList;
    }

    public float e(int i4, float f4) {
        return this.f2040b.getDimension(i4, f4);
    }

    public int f(int i4, int i5) {
        return this.f2040b.getDimensionPixelOffset(i4, i5);
    }

    public int g(int i4, int i5) {
        return this.f2040b.getDimensionPixelSize(i4, i5);
    }

    public Drawable h(int i4) {
        int resourceId;
        return (!this.f2040b.hasValue(i4) || (resourceId = this.f2040b.getResourceId(i4, 0)) == 0) ? this.f2040b.getDrawable(i4) : e.a.b(this.f2039a, resourceId);
    }

    public Drawable i(int i4) {
        int resourceId;
        if (!this.f2040b.hasValue(i4) || (resourceId = this.f2040b.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return h.b().d(this.f2039a, resourceId, true);
    }

    public float j(int i4, float f4) {
        return this.f2040b.getFloat(i4, f4);
    }

    @androidx.annotation.q0
    public Typeface k(@i1 int i4, int i5, @androidx.annotation.q0 i.f fVar) {
        int resourceId = this.f2040b.getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2041c == null) {
            this.f2041c = new TypedValue();
        }
        return androidx.core.content.res.i.k(this.f2039a, resourceId, this.f2041c, i5, fVar);
    }

    public float l(int i4, int i5, int i6, float f4) {
        return this.f2040b.getFraction(i4, i5, i6, f4);
    }

    public int m(int i4) {
        return this.f2040b.getIndex(i4);
    }

    public int n() {
        return this.f2040b.getIndexCount();
    }

    public int o(int i4, int i5) {
        return this.f2040b.getInt(i4, i5);
    }

    public int p(int i4, int i5) {
        return this.f2040b.getInteger(i4, i5);
    }

    public int q(int i4, int i5) {
        return this.f2040b.getLayoutDimension(i4, i5);
    }

    public int r(int i4, String str) {
        return this.f2040b.getLayoutDimension(i4, str);
    }

    public String s(int i4) {
        return this.f2040b.getNonResourceString(i4);
    }

    public String t() {
        return this.f2040b.getPositionDescription();
    }

    public int u(int i4, int i5) {
        return this.f2040b.getResourceId(i4, i5);
    }

    public Resources v() {
        return this.f2040b.getResources();
    }

    public String w(int i4) {
        return this.f2040b.getString(i4);
    }

    public CharSequence x(int i4) {
        return this.f2040b.getText(i4);
    }

    public CharSequence[] y(int i4) {
        return this.f2040b.getTextArray(i4);
    }

    public int z(int i4) {
        return a.b(this.f2040b, i4);
    }
}
