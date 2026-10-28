package androidx.compose.ui.input.key;

import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: KeyEvent.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/key/d;", "", "", "value", "e", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f18649c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f18650d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f18651e = 2;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: KeyEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/input/key/d$a;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/d;", "Unknown", "I", "c", "()I", "KeyUp", "b", "KeyDown", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.input.key.d$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a() {
            return d.f18651e;
        }

        public final int b() {
            return d.f18650d;
        }

        public final int c() {
            return d.f18649c;
        }

        public Companion(w wVar) {
        }
    }

    private /* synthetic */ d(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ d d(int i4) {
        return new d(i4);
    }

    public static int e(int i4) {
        return i4;
    }

    public static boolean f(int i4, Object obj) {
        return (obj instanceof d) && i4 == ((d) obj).value;
    }

    public static final boolean g(int i4, int i5) {
        return i4 == i5;
    }

    public static int h(int i4) {
        return Integer.hashCode(i4);
    }

    @l
    public static String i(int i4) {
        return g(i4, f18650d) ? "KeyUp" : g(i4, f18651e) ? "KeyDown" : g(i4, f18649c) ? "Unknown" : "Invalid";
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

    @l
    public String toString() {
        return i(this.value);
    }
}
