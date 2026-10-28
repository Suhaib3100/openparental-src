package androidx.compose.foundation.text2.input.internal.selection;

import android.annotation.SuppressLint;
import androidx.compose.foundation.text2.input.internal.j0;
import androidx.compose.foundation.text2.input.internal.m0;
import androidx.compose.foundation.u1;
import fg.l;
import kotlin.Metadata;

/* compiled from: AndroidTextFieldMagnifier.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "", "isFocused", "Landroidx/compose/foundation/text2/input/internal/selection/g;", "a", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/foundation/text2/input/internal/j0;Z)Landroidx/compose/foundation/text2/input/internal/selection/g;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* compiled from: AndroidTextFieldMagnifier.android.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/foundation/text2/input/internal/selection/a$a", "Landroidx/compose/foundation/text2/input/internal/selection/g;", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "textFieldSelectionState", "Landroidx/compose/foundation/text2/input/internal/j0;", "textLayoutState", "", "isFocused", "Lkotlin/k2;", "J7", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/foundation/text2/input/internal/j0;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.a$a, reason: collision with other inner class name */
    public static final class C0182a extends g {
        C0182a() {
        }

        @Override // androidx.compose.foundation.text2.input.internal.selection.g
        public void J7(@l m0 textFieldState, @l i textFieldSelectionState, @l j0 textLayoutState, boolean isFocused) {
        }
    }

    @l
    @SuppressLint({"ModifierFactoryExtensionFunction", "ModifierFactoryReturnType"})
    public static final g a(@l m0 m0Var, @l i iVar, @l j0 j0Var, boolean z4) {
        return u1.c(0, 1, null) ? new h(m0Var, iVar, j0Var, z4) : new C0182a();
    }
}
