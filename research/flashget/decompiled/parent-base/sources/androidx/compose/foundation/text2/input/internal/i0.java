package androidx.compose.foundation.text2.input.internal;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: TextInputSession.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00042\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/i0;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/k2;", "Lkotlin/u;", "block", "c", "(Lld/l;)V", "Landroid/view/KeyEvent;", "keyEvent", "sendKeyEvent", "(Landroid/view/KeyEvent;)V", "Landroidx/compose/ui/text/input/y;", "imeAction", "a", "(I)V", "Landroidx/compose/foundation/text2/input/q;", "b", "()Landroidx/compose/foundation/text2/input/q;", "text", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface i0 {
    void a(int imeAction);

    @fg.l
    androidx.compose.foundation.text2.input.q b();

    void c(@fg.l ld.l<? super m, k2> block);

    void sendKeyEvent(@fg.l KeyEvent keyEvent);
}
