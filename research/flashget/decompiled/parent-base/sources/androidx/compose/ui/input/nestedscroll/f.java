package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.k;
import fg.l;
import kd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: NestedScrollModifier.kt */
@g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/f;", "", "", "value", "f", "(I)I", "", "j", "(I)Ljava/lang/String;", "i", "other", "", "g", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f18687c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f18688d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f18689e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f18690f = 4;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: NestedScrollModifier.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001d\u0010\u000e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/f$a;", "", "<init>", "()V", "Landroidx/compose/ui/input/nestedscroll/f;", "Relocate", "I", "c", "()I", "d", "Drag", "a", "Fling", "b", "Wheel", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.input.nestedscroll.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @k
        @kotlin.k(message = "Do not use. Will be removed in the future.")
        public static /* synthetic */ void d() {
        }

        public final int a() {
            return f.f18687c;
        }

        public final int b() {
            return f.f18688d;
        }

        @k
        public final int c() {
            return f.f18689e;
        }

        public final int e() {
            return f.f18690f;
        }

        public Companion(w wVar) {
        }
    }

    private /* synthetic */ f(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ f e(int i4) {
        return new f(i4);
    }

    public static int f(int i4) {
        return i4;
    }

    public static boolean g(int i4, Object obj) {
        return (obj instanceof f) && i4 == ((f) obj).value;
    }

    public static final boolean h(int i4, int i5) {
        return i4 == i5;
    }

    public static int i(int i4) {
        return Integer.hashCode(i4);
    }

    @l
    public static String j(int i4) {
        return h(i4, f18687c) ? "Drag" : h(i4, f18688d) ? "Fling" : h(i4, f18689e) ? "Relocate" : h(i4, f18690f) ? "Wheel" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.value, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    /* renamed from: k, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @l
    public String toString() {
        return j(this.value);
    }
}
