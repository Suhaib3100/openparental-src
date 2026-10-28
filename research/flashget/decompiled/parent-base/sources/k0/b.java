package k0;

import fg.l;
import java.util.List;
import kd.g;
import kotlin.Metadata;
import kotlin.collections.w;

/* compiled from: HapticFeedbackType.kt */
@g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00042\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Lk0/b;", "", "", "value", "b", "(I)I", "", "f", "(I)Ljava/lang/String;", "e", "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: HapticFeedbackType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lk0/b$a;", "", "<init>", "()V", "", "Lk0/b;", "c", "()Ljava/util/List;", "a", "()I", "LongPress", "b", "TextHandleMove", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k0.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return d.f74804a.a();
        }

        public final int b() {
            return d.f74804a.b();
        }

        @l
        public final List<b> c() {
            d dVar = d.f74804a;
            return w.O(b.a(dVar.a()), b.a(dVar.b()));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ b(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ b a(int i4) {
        return new b(i4);
    }

    public static int b(int i4) {
        return i4;
    }

    public static boolean c(int i4, Object obj) {
        return (obj instanceof b) && i4 == ((b) obj).value;
    }

    public static final boolean d(int i4, int i5) {
        return i4 == i5;
    }

    public static int e(int i4) {
        return Integer.hashCode(i4);
    }

    @l
    public static String f(int i4) {
        Companion companion = INSTANCE;
        companion.getClass();
        d dVar = d.f74804a;
        if (d(i4, dVar.a())) {
            return "LongPress";
        }
        companion.getClass();
        return d(i4, dVar.b()) ? "TextHandleMove" : "Invalid";
    }

    public boolean equals(Object obj) {
        return c(this.value, obj);
    }

    /* renamed from: g, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    @l
    public String toString() {
        return f(this.value);
    }
}
