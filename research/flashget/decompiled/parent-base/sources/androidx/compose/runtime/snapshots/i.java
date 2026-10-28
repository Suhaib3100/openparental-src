package androidx.compose.runtime.snapshots;

import androidx.compose.animation.core.a2;
import kotlin.Metadata;

/* compiled from: StateObjectImpl.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081@\u0018\u0000 \u00042\u00020\u0001:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "", "", "mask", "b", "(I)I", "reader", "k", "(II)I", "", "h", "(II)Z", "", "i", "(I)Ljava/lang/String;", "g", "other", "d", "(ILjava/lang/Object;)Z", "a", "I", "f", "()I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    /* compiled from: StateObjectImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0007\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\u000b\u001a\u00020\u00048Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/snapshots/i$a;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/i;", "a", "()I", "Composition", "c", "SnapshotStateObserver", "b", "SnapshotFlow", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.i$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return i.b(1);
        }

        public final int b() {
            return i.b(4);
        }

        public final int c() {
            return i.b(2);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ i(int i4) {
        this.mask = i4;
    }

    public static final /* synthetic */ i a(int i4) {
        return new i(i4);
    }

    public static int b(int i4) {
        return i4;
    }

    public static int c(int i4, int i5, kotlin.jvm.internal.w wVar) {
        if ((i5 & 1) != 0) {
            return 0;
        }
        return i4;
    }

    public static boolean d(int i4, Object obj) {
        return (obj instanceof i) && i4 == ((i) obj).mask;
    }

    public static final boolean e(int i4, int i5) {
        return i4 == i5;
    }

    public static int g(int i4) {
        return Integer.hashCode(i4);
    }

    public static final boolean h(int i4, int i5) {
        return (i4 & i5) != 0;
    }

    public static String i(int i4) {
        return a2.a("ReaderKind(mask=", i4, ')');
    }

    public static final int k(int i4, int i5) {
        return i4 | i5;
    }

    public boolean equals(Object obj) {
        return d(this.mask, obj);
    }

    /* renamed from: f, reason: from getter */
    public final int getMask() {
        return this.mask;
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
