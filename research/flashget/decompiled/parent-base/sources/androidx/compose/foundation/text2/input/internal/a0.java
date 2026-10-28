package androidx.compose.foundation.text2.input.internal;

import kotlin.Metadata;

/* compiled from: TextFieldDecoratorModifier.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/f0;", "defaults", "a", "(Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/f0;)Landroidx/compose/foundation/text/f0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a0 {
    @fg.l
    public static final androidx.compose.foundation.text.f0 a(@fg.l androidx.compose.foundation.text.f0 f0Var, @fg.m androidx.compose.foundation.text.f0 f0Var2) {
        if (f0Var2 == null) {
            return f0Var;
        }
        int capitalization = f0Var.getCapitalization();
        androidx.compose.ui.text.input.f0.INSTANCE.getClass();
        int capitalization2 = !androidx.compose.ui.text.input.f0.h(capitalization, androidx.compose.ui.text.input.f0.f21018c) ? f0Var.getCapitalization() : f0Var2.getCapitalization();
        boolean z4 = f0Var.getAutoCorrect() && f0Var2.getAutoCorrect();
        int keyboardType = f0Var.getKeyboardType();
        androidx.compose.ui.text.input.g0.INSTANCE.getClass();
        int keyboardType2 = !androidx.compose.ui.text.input.g0.m(keyboardType, androidx.compose.ui.text.input.g0.f21025c) ? f0Var.getKeyboardType() : f0Var2.getKeyboardType();
        int imeAction = f0Var.getImeAction();
        androidx.compose.ui.text.input.y.INSTANCE.getClass();
        return new androidx.compose.foundation.text.f0(capitalization2, z4, keyboardType2, !androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21131c) ? f0Var.getImeAction() : f0Var2.getImeAction(), null, 16, null);
    }
}
