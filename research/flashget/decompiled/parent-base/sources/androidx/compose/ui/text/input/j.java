package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import kotlin.Metadata;

/* compiled from: CursorAnchorInfoBuilder.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/input/j;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "Li0/i;", "innerTextFieldBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Landroidx/compose/ui/text/n0;Li0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(34)
/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final j f21045a = new j();

    private j() {
    }

    @fg.l
    @androidx.annotation.u
    @kd.n
    public static final CursorAnchorInfo.Builder a(@fg.l CursorAnchorInfo.Builder builder, @fg.l androidx.compose.ui.text.n0 textLayoutResult, @fg.l i0.i innerTextFieldBounds) {
        int r4;
        int r5;
        if (!innerTextFieldBounds.L() && (r4 = textLayoutResult.r(innerTextFieldBounds.getTop())) <= (r5 = textLayoutResult.r(innerTextFieldBounds.j()))) {
            while (true) {
                builder.addVisibleLineBounds(textLayoutResult.s(r4), textLayoutResult.v(r4), textLayoutResult.t(r4), textLayoutResult.m(r4));
                if (r4 == r5) {
                    break;
                }
                r4++;
            }
        }
        return builder;
    }
}
