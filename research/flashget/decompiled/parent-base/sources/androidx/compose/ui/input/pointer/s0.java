package androidx.compose.ui.input.pointer;

import androidx.compose.animation.core.a2;
import kotlin.Metadata;

/* compiled from: PointerInputEventProcessor.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/s0;", "", "", "value", "b", "(I)I", "", "h", "(I)Ljava/lang/String;", "g", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "f", "(I)Z", "dispatchedToAPointerInputModifier", "e", "anyMovementConsumed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    private /* synthetic */ s0(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ s0 a(int i4) {
        return new s0(i4);
    }

    public static int b(int i4) {
        return i4;
    }

    public static boolean c(int i4, Object obj) {
        return (obj instanceof s0) && i4 == ((s0) obj).value;
    }

    public static final boolean d(int i4, int i5) {
        return i4 == i5;
    }

    public static final boolean e(int i4) {
        return (i4 & 2) != 0;
    }

    public static final boolean f(int i4) {
        return (i4 & 1) != 0;
    }

    public static int g(int i4) {
        return Integer.hashCode(i4);
    }

    public static String h(int i4) {
        return a2.a("ProcessResult(value=", i4, ')');
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    /* renamed from: i, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return h(this.value);
    }
}
