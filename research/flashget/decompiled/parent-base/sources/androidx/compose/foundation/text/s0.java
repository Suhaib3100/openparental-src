package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.platform.g5;
import kotlin.Metadata;

/* compiled from: TextFieldFocusModifier.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/foundation/text/c1;", "state", "Landroidx/compose/ui/focus/m;", "focusManager", "b", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/text/c1;Landroidx/compose/ui/focus/m;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/input/key/c;", "", "keyCode", "", "c", "(Landroid/view/KeyEvent;I)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s0 {

    /* compiled from: TextFieldFocusModifier.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.key.c, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.m f7883b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c1 f7884c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.focus.m mVar, c1 c1Var) {
            super(1);
            this.f7883b = mVar;
            this.f7884c = c1Var;
        }

        @fg.l
        public final Boolean a(@fg.l KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean z4 = false;
            if (device != null && device.supportsSource(androidx.core.view.h0.f27183j) && !device.isVirtual()) {
                int b5 = androidx.compose.ui.input.key.e.b(keyEvent);
                androidx.compose.ui.input.key.d.INSTANCE.getClass();
                if (androidx.compose.ui.input.key.d.g(b5, androidx.compose.ui.input.key.d.f18651e)) {
                    if (s0.c(keyEvent, 19)) {
                        androidx.compose.ui.focus.m mVar = this.f7883b;
                        androidx.compose.ui.focus.f.INSTANCE.getClass();
                        z4 = mVar.g(androidx.compose.ui.focus.f.f17530g);
                    } else if (s0.c(keyEvent, 20)) {
                        androidx.compose.ui.focus.m mVar2 = this.f7883b;
                        androidx.compose.ui.focus.f.INSTANCE.getClass();
                        z4 = mVar2.g(androidx.compose.ui.focus.f.f17531h);
                    } else if (s0.c(keyEvent, 21)) {
                        androidx.compose.ui.focus.m mVar3 = this.f7883b;
                        androidx.compose.ui.focus.f.INSTANCE.getClass();
                        z4 = mVar3.g(androidx.compose.ui.focus.f.f17528e);
                    } else if (s0.c(keyEvent, 22)) {
                        androidx.compose.ui.focus.m mVar4 = this.f7883b;
                        androidx.compose.ui.focus.f.INSTANCE.getClass();
                        z4 = mVar4.g(androidx.compose.ui.focus.f.f17529f);
                    } else if (s0.c(keyEvent, 23)) {
                        g5 keyboardController = this.f7884c.getKeyboardController();
                        if (keyboardController != null) {
                            keyboardController.b();
                        }
                        z4 = true;
                    }
                }
            }
            return Boolean.valueOf(z4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            return a(cVar.h());
        }
    }

    @fg.l
    public static final androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, @fg.l c1 c1Var, @fg.l androidx.compose.ui.focus.m mVar) {
        return androidx.compose.ui.input.key.f.b(qVar, new a(mVar, c1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(KeyEvent keyEvent, int i4) {
        return ((int) (androidx.compose.ui.input.key.e.a(keyEvent) >> 32)) == i4;
    }
}
