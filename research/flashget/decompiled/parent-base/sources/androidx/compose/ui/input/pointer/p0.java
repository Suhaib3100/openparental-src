package androidx.compose.ui.input.pointer;

import androidx.compose.animation.core.a2;
import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@kd.g
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/p0;", "", "", "Landroidx/compose/ui/input/pointer/NativePointerKeyboardModifiers;", "packedValue", "b", "(I)I", "", "f", "(I)Ljava/lang/String;", "e", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int packedValue;

    private /* synthetic */ p0(int i4) {
        this.packedValue = i4;
    }

    public static final /* synthetic */ p0 a(int i4) {
        return new p0(i4);
    }

    public static int b(int i4) {
        return i4;
    }

    public static boolean c(int i4, Object obj) {
        return (obj instanceof p0) && i4 == ((p0) obj).packedValue;
    }

    public static final boolean d(int i4, int i5) {
        return i4 == i5;
    }

    public static int e(int i4) {
        return Integer.hashCode(i4);
    }

    public static String f(int i4) {
        return a2.a("PointerKeyboardModifiers(packedValue=", i4, ')');
    }

    public boolean equals(Object obj) {
        return c(this.packedValue, obj);
    }

    /* renamed from: g, reason: from getter */
    public final /* synthetic */ int getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return Integer.hashCode(this.packedValue);
    }

    public String toString() {
        return f(this.packedValue);
    }
}
