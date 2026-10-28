package androidx.compose.foundation.text2.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.platform.g5;
import kotlin.Metadata;

/* compiled from: TextFieldKeyEventHandler.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/a;", "Landroidx/compose/foundation/text2/input/internal/c0;", "<init>", "()V", "Landroidx/compose/ui/input/key/c;", "event", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "textFieldSelectionState", "Landroidx/compose/ui/focus/m;", "focusManager", "Landroidx/compose/ui/platform/g5;", "keyboardController", "", "c", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/ui/focus/m;Landroidx/compose/ui/platform/g5;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f8552e = 0;

    @Override // androidx.compose.foundation.text2.input.internal.c0
    public boolean c(@fg.l KeyEvent event, @fg.l m0 textFieldState, @fg.l androidx.compose.foundation.text2.input.internal.selection.i textFieldSelectionState, @fg.l androidx.compose.ui.focus.m focusManager, @fg.l g5 keyboardController) {
        boolean c5;
        boolean c6;
        boolean c7;
        boolean c10;
        boolean c11;
        if (super.c(event, textFieldState, textFieldSelectionState, focusManager, keyboardController)) {
            return true;
        }
        InputDevice device = event.getDevice();
        if (device != null && device.supportsSource(androidx.core.view.h0.f27183j) && !device.isVirtual()) {
            int b5 = androidx.compose.ui.input.key.e.b(event);
            androidx.compose.ui.input.key.d.INSTANCE.getClass();
            if (androidx.compose.ui.input.key.d.g(b5, androidx.compose.ui.input.key.d.f18651e)) {
                c5 = d0.c(event, 19);
                if (c5) {
                    androidx.compose.ui.focus.f.INSTANCE.getClass();
                    return focusManager.g(androidx.compose.ui.focus.f.f17530g);
                }
                c6 = d0.c(event, 20);
                if (c6) {
                    androidx.compose.ui.focus.f.INSTANCE.getClass();
                    return focusManager.g(androidx.compose.ui.focus.f.f17531h);
                }
                c7 = d0.c(event, 21);
                if (c7) {
                    androidx.compose.ui.focus.f.INSTANCE.getClass();
                    return focusManager.g(androidx.compose.ui.focus.f.f17528e);
                }
                c10 = d0.c(event, 22);
                if (c10) {
                    androidx.compose.ui.focus.f.INSTANCE.getClass();
                    return focusManager.g(androidx.compose.ui.focus.f.f17529f);
                }
                c11 = d0.c(event, 23);
                if (c11) {
                    keyboardController.b();
                    return true;
                }
            }
        }
        return false;
    }
}
