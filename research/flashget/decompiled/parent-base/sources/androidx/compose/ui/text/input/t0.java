package androidx.compose.ui.text.input;

import androidx.compose.ui.graphics.y4;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: TextInputService.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JM\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0006H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\tH&¢\u0006\u0004\b\u0013\u0010\u0010J!\u0010\u0016\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010%\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/t0;", "", "Landroidx/compose/ui/text/input/z0;", "value", "Landroidx/compose/ui/text/input/z;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/p;", "Lkotlin/k2;", "onEditCommand", "Landroidx/compose/ui/text/input/y;", "onImeActionPerformed", "c", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/z;Lld/l;Lld/l;)V", "a", "()V", "b", "h", "d", "oldValue", "newValue", "e", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/z0;)V", "Li0/i;", "rect", "g", "(Li0/i;)V", "textFieldValue", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "Landroidx/compose/ui/graphics/y4;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "f", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/p0;Landroidx/compose/ui/text/n0;Lld/l;Li0/i;Li0/i;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface t0 {
    default void a() {
    }

    void b();

    void c(@fg.l z0 value, @fg.l z imeOptions, @fg.l ld.l<? super List<? extends p>, k2> onEditCommand, @fg.l ld.l<? super y, k2> onImeActionPerformed);

    void d();

    void e(@fg.m z0 oldValue, @fg.l z0 newValue);

    default void f(@fg.l z0 textFieldValue, @fg.l p0 offsetMapping, @fg.l androidx.compose.ui.text.n0 textLayoutResult, @fg.l ld.l<? super y4, k2> textFieldToRootTransform, @fg.l i0.i innerTextFieldBounds, @fg.l i0.i decorationBoxBounds) {
    }

    default void g(@fg.l i0.i rect) {
    }

    void h();
}
