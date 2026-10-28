package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: Context.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\u001a;\u0010\u0013\u001a\u00020\u000e*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"", "T", "Landroid/content/Context;", "a", "(Landroid/content/Context;)Ljava/lang/Object;", "Landroid/util/AttributeSet;", "set", "", "attrs", "", "defStyleAttr", "defStyleRes", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "Lkotlin/m2;", "Lkotlin/u;", "block", "c", "resourceId", "b", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class h {
    public static final <T> T a(Context context) {
        l0.p(context, "<this>");
        l0.P();
        return (T) d.o(context, Object.class);
    }

    public static final void b(@d5.d Context context, @h1 int i5, @d5.d int[] attrs, @d5.d q3.l<? super TypedArray, m2> block) {
        l0.p(context, "<this>");
        l0.p(attrs, "attrs");
        l0.p(block, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, attrs);
        l0.o(obtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        block.N(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static final void c(@d5.d Context context, @d5.e AttributeSet attributeSet, @d5.d int[] attrs, @androidx.annotation.f int i5, @h1 int i6, @d5.d q3.l<? super TypedArray, m2> block) {
        l0.p(context, "<this>");
        l0.p(attrs, "attrs");
        l0.p(block, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, attrs, i5, i6);
        l0.o(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        block.N(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void d(Context context, AttributeSet attributeSet, int[] attrs, int i5, int i6, q3.l block, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            attributeSet = null;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = 0;
        }
        l0.p(context, "<this>");
        l0.p(attrs, "attrs");
        l0.p(block, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, attrs, i5, i6);
        l0.o(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        block.N(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
