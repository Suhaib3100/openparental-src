package androidx.compose.ui.text.platform.extensions;

import android.text.style.TtsSpan;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.text.z0;
import fg.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TtsAnnotationExtensions.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/x0;", "Landroid/text/style/TtsSpan;", "a", "(Landroidx/compose/ui/text/x0;)Landroid/text/style/TtsSpan;", "Landroidx/compose/ui/text/z0;", "b", "(Landroidx/compose/ui/text/z0;)Landroid/text/style/TtsSpan;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    @l
    public static final TtsSpan a(@l x0 x0Var) {
        if (x0Var instanceof z0) {
            return b((z0) x0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public static final TtsSpan b(@l z0 z0Var) {
        return new TtsSpan.VerbatimBuilder(z0Var.getVerbatim()).build();
    }
}
