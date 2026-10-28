package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: LazyListSnapLayoutInfoProvider.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/c;", "", "", "value", "e", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f4252c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f4253d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f4254e = 2;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: LazyListSnapLayoutInfoProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/c$a;", "", "<init>", "()V", "Landroidx/compose/foundation/gestures/snapping/c;", "ClosestItem", "I", "a", "()I", "NextItem", "b", "PreviousItem", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.snapping.c$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return c.f4252c;
        }

        public final int b() {
            return c.f4253d;
        }

        public final int c() {
            return c.f4254e;
        }

        public Companion(w wVar) {
        }
    }

    private /* synthetic */ c(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ c d(int i4) {
        return new c(i4);
    }

    public static int e(int i4) {
        return i4;
    }

    public static boolean f(int i4, Object obj) {
        return (obj instanceof c) && i4 == ((c) obj).value;
    }

    public static final boolean g(int i4, int i5) {
        return i4 == i5;
    }

    public static int h(int i4) {
        return Integer.hashCode(i4);
    }

    public static String i(int i4) {
        return a2.a("FinalSnappingItem(value=", i4, ')');
    }

    public boolean equals(Object obj) {
        return f(this.value, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    /* renamed from: j, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return i(this.value);
    }
}
