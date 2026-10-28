package androidx.compose.foundation.text2.input.internal;

import androidx.compose.animation.core.c1;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.g6;
import androidx.compose.ui.graphics.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextFieldCoreModifier.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0018\u0010\u0019\u001a\u00020\u0005*\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/unit/d;", "", "cursorOffset", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "", "rtl", "textFieldWidth", "Li0/i;", "e", "(Landroidx/compose/ui/unit/d;ILandroidx/compose/ui/text/n0;ZI)Li0/i;", "", "g", "(F)F", "Landroidx/compose/animation/core/k;", "a", "Landroidx/compose/animation/core/k;", "cursorAnimationSpec", "Landroidx/compose/ui/unit/h;", "b", "F", "DefaultCursorThickness", "Landroidx/compose/ui/graphics/t1;", "f", "(Landroidx/compose/ui/graphics/t1;)Z", "isSpecified", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,584:1\n652#2:585\n154#3:586\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierKt\n*L\n535#1:585\n529#1:586\n*E\n"})
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.k<Float> f9005a = androidx.compose.animation.core.l.f(androidx.compose.animation.core.l.g(a.f9007b), null, 0, 6, null);

    /* renamed from: b, reason: collision with root package name */
    private static final float f9006b = androidx.compose.ui.unit.h.g(2);

    /* compiled from: TextFieldCoreModifier.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/c1$b;", "", "Lkotlin/k2;", "a", "(Landroidx/compose/animation/core/c1$b;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<c1.b<Float>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9007b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l c1.b<Float> bVar) {
            bVar.h(1000);
            Float valueOf = Float.valueOf(1.0f);
            bVar.a(valueOf, 0);
            bVar.a(valueOf, 499);
            Float valueOf2 = Float.valueOf(0.0f);
            bVar.a(valueOf2, 500);
            bVar.a(valueOf2, 999);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(c1.b<Float> bVar) {
            a(bVar);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0.i e(androidx.compose.ui.unit.d dVar, int i4, androidx.compose.ui.text.n0 n0Var, boolean z4, int i5) {
        i0.i iVar;
        if (n0Var == null || (iVar = n0Var.e(kotlin.ranges.s.J(i4, new kotlin.ranges.l(0, n0Var.getLayoutInput().getText().length(), 1)))) == null) {
            i0.i.INSTANCE.getClass();
            iVar = i0.i.f74153g;
        }
        i0.i iVar2 = iVar;
        int q22 = dVar.q2(f9006b);
        return i0.i.h(iVar2, z4 ? (i5 - iVar2.t()) - q22 : iVar2.t(), 0.0f, z4 ? i5 - iVar2.t() : iVar2.t() + q22, 0.0f, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(t1 t1Var) {
        if (t1Var instanceof g6) {
            long value = ((g6) t1Var).getValue();
            d2.INSTANCE.getClass();
            if (value == d2.f17778o) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(float f4) {
        if (Float.isNaN(f4) || Float.isInfinite(f4)) {
            return f4;
        }
        return (float) (f4 > 0.0f ? Math.ceil(f4) : Math.floor(f4));
    }
}
