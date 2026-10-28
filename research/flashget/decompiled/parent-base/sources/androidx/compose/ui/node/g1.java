package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: NodeKind.kt */
@kd.g
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0086\fø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\f¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0006J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0004\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/g1;", "T", "", "", "mask", "b", "(I)I", "other", "g", "(II)I", "h", "", "i", "(I)Ljava/lang/String;", "f", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "e", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g1<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    private /* synthetic */ g1(int i4) {
        this.mask = i4;
    }

    public static final /* synthetic */ g1 a(int i4) {
        return new g1(i4);
    }

    public static <T> int b(int i4) {
        return i4;
    }

    public static boolean c(int i4, Object obj) {
        return (obj instanceof g1) && i4 == ((g1) obj).mask;
    }

    public static final boolean d(int i4, int i5) {
        return i4 == i5;
    }

    public static int f(int i4) {
        return Integer.hashCode(i4);
    }

    public static final int g(int i4, int i5) {
        return i4 | i5;
    }

    public static final int h(int i4, int i5) {
        return i4 | i5;
    }

    public static String i(int i4) {
        return androidx.compose.animation.core.a2.a("NodeKind(mask=", i4, ')');
    }

    /* renamed from: e, reason: from getter */
    public final int getMask() {
        return this.mask;
    }

    public boolean equals(Object obj) {
        return c(this.mask, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.mask);
    }

    public final /* synthetic */ int j() {
        return this.mask;
    }

    public String toString() {
        return i(this.mask);
    }
}
