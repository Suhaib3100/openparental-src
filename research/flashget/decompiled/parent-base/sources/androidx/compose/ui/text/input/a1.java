package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* compiled from: TextFieldValue.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "", "maxChars", "Landroidx/compose/ui/text/e;", "c", "(Landroidx/compose/ui/text/input/z0;I)Landroidx/compose/ui/text/e;", "b", "a", "(Landroidx/compose/ui/text/input/z0;)Landroidx/compose/ui/text/e;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a1 {
    @fg.l
    public static final androidx.compose.ui.text.e a(@fg.l z0 z0Var) {
        return z0Var.getAnnotatedString().s(z0Var.getSelection());
    }

    @fg.l
    public static final androidx.compose.ui.text.e b(@fg.l z0 z0Var, int i4) {
        return z0Var.getAnnotatedString().subSequence(androidx.compose.ui.text.t0.k(z0Var.getSelection()), Math.min(androidx.compose.ui.text.t0.k(z0Var.getSelection()) + i4, z0Var.i().length()));
    }

    @fg.l
    public static final androidx.compose.ui.text.e c(@fg.l z0 z0Var, int i4) {
        return z0Var.getAnnotatedString().subSequence(Math.max(0, androidx.compose.ui.text.t0.l(z0Var.getSelection()) - i4), androidx.compose.ui.text.t0.l(z0Var.getSelection()));
    }
}
