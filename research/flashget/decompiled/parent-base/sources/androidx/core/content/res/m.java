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
import kotlin.jvm.internal.r1;

/* compiled from: TypedArray.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\n\u001a\u001d\u0010\u0012\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\n\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u000e*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0010\u001a\u001d\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001a\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\n\u001a\u001b\u0010\u001b\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001b\u0010\n\u001a\u001d\u0010\u001c\u001a\u00020\u0001*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\n\u001a\u001b\u0010\u001e\u001a\u00020\u001d*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010!\u001a\u00020 *\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"\u001a!\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%\u001a.\u0010)\u001a\u00028\u0000\"\u0004\b\u0000\u0010&*\u00020\u00002\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000'H\u0086\b¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroid/content/res/TypedArray;", "", "index", "Lkotlin/k2;", "a", "(Landroid/content/res/TypedArray;I)V", "", "b", "(Landroid/content/res/TypedArray;I)Z", "c", "(Landroid/content/res/TypedArray;I)I", "Landroid/content/res/ColorStateList;", "d", "(Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;", "", "e", "(Landroid/content/res/TypedArray;I)F", "f", "g", "Landroid/graphics/drawable/Drawable;", "h", "(Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;", "i", "Landroid/graphics/Typeface;", "j", "(Landroid/content/res/TypedArray;I)Landroid/graphics/Typeface;", "k", "l", "m", "", "n", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "", "p", "(Landroid/content/res/TypedArray;I)Ljava/lang/CharSequence;", "", "o", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "R", "Lkotlin/Function1;", "block", "q", "(Landroid/content/res/TypedArray;Lld/l;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTypedArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
/* loaded from: classes3.dex */
public final class m {
    private static final void a(TypedArray typedArray, @i1 int i4) {
        if (!typedArray.hasValue(i4)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean b(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        return typedArray.getBoolean(i4, false);
    }

    @androidx.annotation.l
    public static final int c(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        return typedArray.getColor(i4, 0);
    }

    @fg.l
    public static final ColorStateList d(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        ColorStateList colorStateList = typedArray.getColorStateList(i4);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.");
    }

    public static final float e(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        return typedArray.getDimension(i4, 0.0f);
    }

    @r
    public static final int f(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        return typedArray.getDimensionPixelOffset(i4, 0);
    }

    @r
    public static final int g(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        return typedArray.getDimensionPixelSize(i4, 0);
    }

    @fg.l
    public static final Drawable h(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        Drawable drawable = typedArray.getDrawable(i4);
        l0.m(drawable);
        return drawable;
    }

    public static final float i(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        return typedArray.getFloat(i4, 0.0f);
    }

    @fg.l
    @x0(26)
    public static final Typeface j(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        return l.a(typedArray, i4);
    }

    public static final int k(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        return typedArray.getInt(i4, 0);
    }

    public static final int l(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        return typedArray.getInteger(i4, 0);
    }

    @androidx.annotation.c
    public static final int m(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        return typedArray.getResourceId(i4, 0);
    }

    @fg.l
    public static final String n(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        String string = typedArray.getString(i4);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.");
    }

    @fg.l
    public static final CharSequence[] o(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        return typedArray.getTextArray(i4);
    }

    @fg.l
    public static final CharSequence p(@fg.l TypedArray typedArray, @i1 int i4) {
        a(typedArray, i4);
        CharSequence text = typedArray.getText(i4);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.");
    }

    public static final <R> R q(@fg.l TypedArray typedArray, @fg.l ld.l<? super TypedArray, ? extends R> lVar) {
        R invoke = lVar.invoke(typedArray);
        typedArray.recycle();
        return invoke;
    }
}
