package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: KeyEvent.kt */
@kd.g
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/key/c;", "", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "nativeKeyEvent", "b", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "", "g", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "", "f", "(Landroid/view/KeyEvent;)I", "other", "", "c", "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "a", "Landroid/view/KeyEvent;", "e", "()Landroid/view/KeyEvent;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final KeyEvent nativeKeyEvent;

    private /* synthetic */ c(KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    public static final /* synthetic */ c a(KeyEvent keyEvent) {
        return new c(keyEvent);
    }

    @l
    public static KeyEvent b(@l KeyEvent keyEvent) {
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof c) && l0.g(keyEvent, ((c) obj).nativeKeyEvent);
    }

    public static final boolean d(KeyEvent keyEvent, KeyEvent keyEvent2) {
        return l0.g(keyEvent, keyEvent2);
    }

    public static int f(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String g(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    @l
    /* renamed from: e, reason: from getter */
    public final KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public boolean equals(Object obj) {
        return c(this.nativeKeyEvent, obj);
    }

    public final /* synthetic */ KeyEvent h() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return this.nativeKeyEvent.hashCode();
    }

    public String toString() {
        return g(this.nativeKeyEvent);
    }
}
