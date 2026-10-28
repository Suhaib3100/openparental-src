package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composer.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083@\u0018\u0000 \u00172\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0014\u001a\u00020\u000b8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\u000b8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/i1;", "", "", "value", "e", "(I)I", "", "l", "(I)Ljava/lang/String;", "i", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "h", "()I", "j", "(I)Z", "isNode", "k", "isReusable", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class i1 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f16456c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f16457d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f16458e = 2;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/i1$a;", "", "<init>", "()V", "Landroidx/compose/runtime/i1;", "Group", "I", "a", "()I", "Node", "b", "ReusableNode", "c", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.i1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return i1.f16456c;
        }

        public final int b() {
            return i1.f16457d;
        }

        public final int c() {
            return i1.f16458e;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ i1(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ i1 d(int i4) {
        return new i1(i4);
    }

    private static int e(int i4) {
        return i4;
    }

    public static boolean f(int i4, Object obj) {
        return (obj instanceof i1) && i4 == ((i1) obj).value;
    }

    public static final boolean g(int i4, int i5) {
        return i4 == i5;
    }

    public static int i(int i4) {
        return Integer.hashCode(i4);
    }

    public static final boolean j(int i4) {
        INSTANCE.getClass();
        return i4 != f16456c;
    }

    public static final boolean k(int i4) {
        INSTANCE.getClass();
        return i4 != f16457d;
    }

    public static String l(int i4) {
        return androidx.compose.animation.core.a2.a("GroupKind(value=", i4, ')');
    }

    public boolean equals(Object obj) {
        return f(this.value, obj);
    }

    /* renamed from: h, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final /* synthetic */ int m() {
        return this.value;
    }

    public String toString() {
        return l(this.value);
    }
}
