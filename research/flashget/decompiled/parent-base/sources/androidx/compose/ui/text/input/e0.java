package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;

/* compiled from: InputState.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "Landroid/view/inputmethod/ExtractedText;", "a", "(Landroidx/compose/ui/text/input/z0;)Landroid/view/inputmethod/ExtractedText;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e0 {
    @fg.l
    public static final ExtractedText a(@fg.l z0 z0Var) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = z0Var.i();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = z0Var.i().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = androidx.compose.ui.text.t0.l(z0Var.getSelection());
        extractedText.selectionEnd = androidx.compose.ui.text.t0.k(z0Var.getSelection());
        extractedText.flags = !kotlin.text.v.S2(z0Var.i(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
