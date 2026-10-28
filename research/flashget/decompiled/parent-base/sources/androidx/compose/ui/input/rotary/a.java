package androidx.compose.ui.input.rotary;

import androidx.compose.ui.q;
import fg.l;
import kotlin.Metadata;

/* compiled from: RotaryInputModifier.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/input/rotary/d;", "", "onRotaryScrollEvent", "b", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "onPreRotaryScrollEvent", "a", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    @l
    public static final q a(@l q qVar, @l ld.l<? super d, Boolean> lVar) {
        return qVar.w3(new RotaryInputElement(null, lVar));
    }

    @l
    public static final q b(@l q qVar, @l ld.l<? super d, Boolean> lVar) {
        return qVar.w3(new RotaryInputElement(lVar, null));
    }
}
