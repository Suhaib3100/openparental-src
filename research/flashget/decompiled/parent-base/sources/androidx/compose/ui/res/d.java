package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.v;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.s4;
import androidx.compose.ui.platform.o0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ImageResources.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/s4$a;", "Landroid/content/res/Resources;", "res", "", "id", "Landroidx/compose/ui/graphics/s4;", "b", "(Landroidx/compose/ui/graphics/s4$a;Landroid/content/res/Resources;I)Landroidx/compose/ui/graphics/s4;", "a", "(Landroidx/compose/ui/graphics/s4$a;ILandroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/s4;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nImageResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n74#2:61\n25#3:62\n36#3:69\n1116#4,6:63\n1116#4,6:70\n*S KotlinDebug\n*F\n+ 1 ImageResources.android.kt\nandroidx/compose/ui/res/ImageResources_androidKt\n*L\n54#1:61\n55#1:62\n58#1:69\n55#1:63,6\n58#1:70,6\n*E\n"})
/* loaded from: classes.dex */
public final class d {
    @l
    @androidx.compose.runtime.i
    public static final s4 a(@l s4.Companion companion, @v int i4, @m t tVar, int i5) {
        tVar.P(-304919470);
        if (x.b0()) {
            x.r0(-304919470, i5, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context = (Context) tVar.x(o0.g());
        tVar.P(-492369756);
        Object Q = tVar.Q();
        t.Companion companion2 = t.INSTANCE;
        if (Q == companion2.a()) {
            Q = new TypedValue();
            tVar.E(Q);
        }
        tVar.p0();
        TypedValue typedValue = (TypedValue) Q;
        context.getResources().getValue(i4, typedValue, true);
        CharSequence charSequence = typedValue.string;
        l0.m(charSequence);
        String obj = charSequence.toString();
        tVar.P(1157296644);
        boolean q02 = tVar.q0(obj);
        Object Q2 = tVar.Q();
        if (q02 || Q2 == companion2.a()) {
            Q2 = b(companion, context.getResources(), i4);
            tVar.E(Q2);
        }
        tVar.p0();
        s4 s4Var = (s4) Q2;
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return s4Var;
    }

    @l
    public static final s4 b(@l s4.Companion companion, @l Resources resources, @v int i4) {
        Drawable drawable = resources.getDrawable(i4, null);
        l0.n(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return new p0(((BitmapDrawable) drawable).getBitmap());
    }
}
