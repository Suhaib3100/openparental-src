package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.i1;
import androidx.annotation.r;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: TypedArray.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0010\u001a\u00020\n*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a1\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d*\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Landroid/content/res/TypedArray;", "", "index", "Lkotlin/m2;", "a", "", "b", "c", "Landroid/content/res/ColorStateList;", "d", "", "e", "f", "g", "Landroid/graphics/drawable/Drawable;", "h", "i", "Landroid/graphics/Typeface;", "j", "k", "l", "m", "", "n", "", "p", "", "o", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "R", "Lkotlin/Function1;", "block", "q", "(Landroid/content/res/TypedArray;Lq3/l;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class o {
    private static final void a(TypedArray typedArray, @i1 int i5) {
        if (!typedArray.hasValue(i5)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean b(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        return typedArray.getBoolean(i5, false);
    }

    @androidx.annotation.l
    public static final int c(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        return typedArray.getColor(i5, 0);
    }

    @d5.d
    public static final ColorStateList d(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        ColorStateList colorStateList = typedArray.getColorStateList(i5);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float e(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        return typedArray.getDimension(i5, 0.0f);
    }

    @r
    public static final int f(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        return typedArray.getDimensionPixelOffset(i5, 0);
    }

    @r
    public static final int g(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        return typedArray.getDimensionPixelSize(i5, 0);
    }

    @d5.d
    public static final Drawable h(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        Drawable drawable = typedArray.getDrawable(i5);
        l0.m(drawable);
        l0.o(drawable, "getDrawable(index)!!");
        return drawable;
    }

    public static final float i(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        return typedArray.getFloat(i5, 0.0f);
    }

    @x0(26)
    @d5.d
    public static final Typeface j(@d5.d TypedArray typedArray, @i1 int i5) {
        Typeface font;
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        font = typedArray.getFont(i5);
        l0.m(font);
        l0.o(font, "getFont(index)!!");
        return font;
    }

    public static final int k(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        return typedArray.getInt(i5, 0);
    }

    public static final int l(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        return typedArray.getInteger(i5, 0);
    }

    @androidx.annotation.c
    public static final int m(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        return typedArray.getResourceId(i5, 0);
    }

    @d5.d
    public static final String n(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        String string = typedArray.getString(i5);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    @d5.d
    public static final CharSequence[] o(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        CharSequence[] textArray = typedArray.getTextArray(i5);
        l0.o(textArray, "getTextArray(index)");
        return textArray;
    }

    @d5.d
    public static final CharSequence p(@d5.d TypedArray typedArray, @i1 int i5) {
        l0.p(typedArray, "<this>");
        a(typedArray, i5);
        CharSequence text = typedArray.getText(i5);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final <R> R q(@d5.d TypedArray typedArray, @d5.d q3.l<? super TypedArray, ? extends R> block) {
        l0.p(typedArray, "<this>");
        l0.p(block, "block");
        R N = block.N(typedArray);
        typedArray.recycle();
        return N;
    }
}
