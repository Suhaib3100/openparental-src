package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import androidx.compose.ui.graphics.q5;
import kotlin.Metadata;

/* compiled from: CursorAnchorInfoBuilder.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/input/h;", "", "<init>", "()V", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "Li0/i;", "decorationBoxBounds", "a", "(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Li0/i;)Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(33)
/* loaded from: classes.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final h f21036a = new h();

    private h() {
    }

    @fg.l
    @androidx.annotation.u
    @kd.n
    public static final CursorAnchorInfo.Builder a(@fg.l CursorAnchorInfo.Builder builder, @fg.l i0.i decorationBoxBounds) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = g.a().setEditorBounds(q5.c(decorationBoxBounds));
        handwritingBounds = editorBounds.setHandwritingBounds(q5.c(decorationBoxBounds));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
