package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.Metadata;

/* compiled from: FontStyle.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/k0;", "", "", "value", "d", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "other", "", "e", "(ILjava/lang/Object;)Z", "a", "I", "g", "()I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f20754c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f20755d = 1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: FontStyle.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\b\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR#\u0010\r\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\t\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/k0$a;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/font/k0;", "e", "()Ljava/util/List;", "Normal", "I", "c", "()I", "d", "Italic", "a", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.k0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void b() {
        }

        public static /* synthetic */ void d() {
        }

        public final int a() {
            return k0.f20755d;
        }

        public final int c() {
            return k0.f20754c;
        }

        @fg.l
        public final List<k0> e() {
            return kotlin.collections.w.O(k0.c(k0.f20754c), k0.c(k0.f20755d));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @kotlin.k(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @kotlin.x0(expression = "FontStyle.", imports = {}))
    private /* synthetic */ k0(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ k0 c(int i4) {
        return new k0(i4);
    }

    @kotlin.k(message = "Please use FontStyle.Normal or FontStyle.Italic", replaceWith = @kotlin.x0(expression = "FontStyle.", imports = {}))
    public static int d(int i4) {
        return i4;
    }

    public static boolean e(int i4, Object obj) {
        return (obj instanceof k0) && i4 == ((k0) obj).value;
    }

    public static final boolean f(int i4, int i5) {
        return i4 == i5;
    }

    public static int h(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String i(int i4) {
        return f(i4, f20754c) ? "Normal" : f(i4, f20755d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return e(this.value, obj);
    }

    /* renamed from: g, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Integer.hashCode(this.value);
    }

    public final /* synthetic */ int j() {
        return this.value;
    }

    @fg.l
    public String toString() {
        return i(this.value);
    }
}
