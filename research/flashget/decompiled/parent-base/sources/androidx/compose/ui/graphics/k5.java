package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: PathOperation.kt */
@kd.g
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/k5;", "", "", "value", "g", "(I)I", "", "k", "(I)Ljava/lang/String;", "j", "other", "", "h", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k5 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f17900c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f17901d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f17902e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f17903f = 3;

    /* renamed from: g, reason: collision with root package name */
    private static final int f17904g = 4;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: PathOperation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/k5$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/k5;", "Difference", "I", "a", "()I", "Intersect", "b", "Union", "d", "Xor", "e", "ReverseDifference", "c", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.k5$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return k5.f17900c;
        }

        public final int b() {
            return k5.f17901d;
        }

        public final int c() {
            return k5.f17904g;
        }

        public final int d() {
            return k5.f17902e;
        }

        public final int e() {
            return k5.f17903f;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ k5(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ k5 f(int i4) {
        return new k5(i4);
    }

    public static int g(int i4) {
        return i4;
    }

    public static boolean h(int i4, Object obj) {
        return (obj instanceof k5) && i4 == ((k5) obj).value;
    }

    public static final boolean i(int i4, int i5) {
        return i4 == i5;
    }

    public static int j(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String k(int i4) {
        return i(i4, f17900c) ? "Difference" : i(i4, f17901d) ? "Intersect" : i(i4, f17902e) ? "Union" : i(i4, f17903f) ? "Xor" : i(i4, f17904g) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.value, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    /* renamed from: l, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @fg.l
    public String toString() {
        return k(this.value);
    }
}
