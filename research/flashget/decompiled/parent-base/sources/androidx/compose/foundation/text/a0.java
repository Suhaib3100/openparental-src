package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: KeyMapping.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/y;", "a", "Landroidx/compose/foundation/text/y;", "()Landroidx/compose/foundation/text/y;", "platformDefaultKeyMapping", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final y f7109a = new a();

    /* compiled from: KeyMapping.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/text/a0$a", "Landroidx/compose/foundation/text/y;", "Landroidx/compose/ui/input/key/c;", "event", "Landroidx/compose/foundation/text/w;", "a", "(Landroid/view/KeyEvent;)Landroidx/compose/foundation/text/w;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements y {
        a() {
        }

        @Override // androidx.compose.foundation.text.y
        @fg.m
        public w a(@fg.l KeyEvent event) {
            w wVar = null;
            if (event.isShiftPressed() && event.isAltPressed()) {
                long a5 = androidx.compose.ui.input.key.e.a(event);
                h0 h0Var = h0.f7413a;
                if (androidx.compose.ui.input.key.b.E4(a5, h0Var.i())) {
                    wVar = w.SELECT_LINE_LEFT;
                } else if (androidx.compose.ui.input.key.b.E4(a5, h0Var.j())) {
                    wVar = w.SELECT_LINE_RIGHT;
                } else if (androidx.compose.ui.input.key.b.E4(a5, h0Var.k())) {
                    wVar = w.SELECT_HOME;
                } else if (androidx.compose.ui.input.key.b.E4(a5, h0Var.h())) {
                    wVar = w.SELECT_END;
                }
            } else if (event.isAltPressed()) {
                long a6 = androidx.compose.ui.input.key.e.a(event);
                h0 h0Var2 = h0.f7413a;
                if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.i())) {
                    wVar = w.LINE_LEFT;
                } else if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.j())) {
                    wVar = w.LINE_RIGHT;
                } else if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.k())) {
                    wVar = w.HOME;
                } else if (androidx.compose.ui.input.key.b.E4(a6, h0Var2.h())) {
                    wVar = w.END;
                }
            }
            return wVar == null ? z.b().a(event) : wVar;
        }
    }

    @fg.l
    public static final y a() {
        return f7109a;
    }
}
