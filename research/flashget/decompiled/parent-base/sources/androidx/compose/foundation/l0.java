package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;

/* compiled from: Clickable.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\u0001*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0018\u0010\u0013\u001a\u00020\u0001*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/h;", "", "c", "(Landroidx/compose/ui/node/h;)Z", "Landroid/view/View;", "e", "(Landroid/view/View;)Z", "", "a", "J", "()J", "TapIndicationDelay", "Landroidx/compose/ui/input/key/c;", "f", "(Landroid/view/KeyEvent;)Z", "isPress", "b", "isClick", "d", "isEnter", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f4767a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f4767a;
    }

    public static final boolean b(@fg.l KeyEvent keyEvent) {
        int b5 = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.INSTANCE.getClass();
        return androidx.compose.ui.input.key.d.g(b5, androidx.compose.ui.input.key.d.f18650d) && d(keyEvent);
    }

    public static final boolean c(@fg.l androidx.compose.ui.node.h hVar) {
        return e((View) androidx.compose.ui.node.i.a(hVar, androidx.compose.ui.platform.o0.k()));
    }

    private static final boolean d(KeyEvent keyEvent) {
        int a5 = (int) (androidx.compose.ui.input.key.e.a(keyEvent) >> 32);
        return a5 == 23 || a5 == 66 || a5 == 160;
    }

    private static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(@fg.l KeyEvent keyEvent) {
        int b5 = androidx.compose.ui.input.key.e.b(keyEvent);
        androidx.compose.ui.input.key.d.INSTANCE.getClass();
        return androidx.compose.ui.input.key.d.g(b5, androidx.compose.ui.input.key.d.f18651e) && d(keyEvent);
    }
}
