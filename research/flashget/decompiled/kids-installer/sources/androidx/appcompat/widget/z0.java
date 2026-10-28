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
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1410a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f1411b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f1412c;

    private z0(Context context, TypedArray typedArray) {
        this.f1410a = context;
        this.f1411b = typedArray;
    }

    public static z0 E(Context context, int i5, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(i5, iArr));
    }

    public static z0 F(Context context, AttributeSet attributeSet, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static z0 G(Context context, AttributeSet attributeSet, int[] iArr, int i5, int i6) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr, i5, i6));
    }

    public boolean A(int i5, TypedValue typedValue) {
        return this.f1411b.getValue(i5, typedValue);
    }

    public TypedArray B() {
        return this.f1411b;
    }

    public boolean C(int i5) {
        return this.f1411b.hasValue(i5);
    }

    public int D() {
        return this.f1411b.length();
    }

    public TypedValue H(int i5) {
        return this.f1411b.peekValue(i5);
    }

    public void I() {
        this.f1411b.recycle();
    }

    public boolean a(int i5, boolean z5) {
        return this.f1411b.getBoolean(i5, z5);
    }

    @androidx.annotation.x0(21)
    public int b() {
        return this.f1411b.getChangingConfigurations();
    }

    public int c(int i5, int i6) {
        return this.f1411b.getColor(i5, i6);
    }

    public ColorStateList d(int i5) {
        int resourceId;
        ColorStateList c6;
        return (!this.f1411b.hasValue(i5) || (resourceId = this.f1411b.getResourceId(i5, 0)) == 0 || (c6 = androidx.appcompat.content.res.a.c(this.f1410a, resourceId)) == null) ? this.f1411b.getColorStateList(i5) : c6;
    }

    public float e(int i5, float f6) {
        return this.f1411b.getDimension(i5, f6);
    }

    public int f(int i5, int i6) {
        return this.f1411b.getDimensionPixelOffset(i5, i6);
    }

    public int g(int i5, int i6) {
        return this.f1411b.getDimensionPixelSize(i5, i6);
    }

    public Drawable h(int i5) {
        int resourceId;
        return (!this.f1411b.hasValue(i5) || (resourceId = this.f1411b.getResourceId(i5, 0)) == 0) ? this.f1411b.getDrawable(i5) : androidx.appcompat.content.res.a.d(this.f1410a, resourceId);
    }

    public Drawable i(int i5) {
        int resourceId;
        if (!this.f1411b.hasValue(i5) || (resourceId = this.f1411b.getResourceId(i5, 0)) == 0) {
            return null;
        }
        return f.b().d(this.f1410a, resourceId, true);
    }

    public float j(int i5, float f6) {
        return this.f1411b.getFloat(i5, f6);
    }

    @androidx.annotation.q0
    public Typeface k(@i1 int i5, int i6, @androidx.annotation.q0 i.g gVar) {
        int resourceId = this.f1411b.getResourceId(i5, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1412c == null) {
            this.f1412c = new TypedValue();
        }
        return androidx.core.content.res.i.k(this.f1410a, resourceId, this.f1412c, i6, gVar);
    }

    public float l(int i5, int i6, int i7, float f6) {
        return this.f1411b.getFraction(i5, i6, i7, f6);
    }

    public int m(int i5) {
        return this.f1411b.getIndex(i5);
    }

    public int n() {
        return this.f1411b.getIndexCount();
    }

    public int o(int i5, int i6) {
        return this.f1411b.getInt(i5, i6);
    }

    public int p(int i5, int i6) {
        return this.f1411b.getInteger(i5, i6);
    }

    public int q(int i5, int i6) {
        return this.f1411b.getLayoutDimension(i5, i6);
    }

    public int r(int i5, String str) {
        return this.f1411b.getLayoutDimension(i5, str);
    }

    public String s(int i5) {
        return this.f1411b.getNonResourceString(i5);
    }

    public String t() {
        return this.f1411b.getPositionDescription();
    }

    public int u(int i5, int i6) {
        return this.f1411b.getResourceId(i5, i6);
    }

    public Resources v() {
        return this.f1411b.getResources();
    }

    public String w(int i5) {
        return this.f1411b.getString(i5);
    }

    public CharSequence x(int i5) {
        return this.f1411b.getText(i5);
    }

    public CharSequence[] y(int i5) {
        return this.f1411b.getTextArray(i5);
    }

    public int z(int i5) {
        return this.f1411b.getType(i5);
    }
}
