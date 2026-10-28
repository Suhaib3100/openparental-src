package androidx.compose.ui.text.input;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: KeyboardCapitalization.kt */
@kd.g
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/input/f0;", "", "", "value", "f", "(I)I", "", "j", "(I)Ljava/lang/String;", "i", "other", "", "g", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final int f21018c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f21019d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f21020e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f21021f = 3;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* compiled from: KeyboardCapitalization.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/input/f0$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/f0;", "None", "I", "c", "()I", "d", "Characters", "a", "b", "Words", "g", "h", "Sentences", "e", "f", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.input.f0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        @x4
        public static /* synthetic */ void d() {
        }

        @x4
        public static /* synthetic */ void f() {
        }

        @x4
        public static /* synthetic */ void h() {
        }

        public final int a() {
            return f0.f21019d;
        }

        public final int c() {
            return f0.f21018c;
        }

        public final int e() {
            return f0.f21021f;
        }

        public final int g() {
            return f0.f21020e;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ f0(int i4) {
        this.value = i4;
    }

    public static final /* synthetic */ f0 e(int i4) {
        return new f0(i4);
    }

    public static int f(int i4) {
        return i4;
    }

    public static boolean g(int i4, Object obj) {
        return (obj instanceof f0) && i4 == ((f0) obj).value;
    }

    public static final boolean h(int i4, int i5) {
        return i4 == i5;
    }

    public static int i(int i4) {
        return Integer.hashCode(i4);
    }

    @fg.l
    public static String j(int i4) {
        return h(i4, f21018c) ? "None" : h(i4, f21019d) ? "Characters" : h(i4, f21020e) ? "Words" : h(i4, f21021f) ? "Sentences" : "Invalid";
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

    @fg.l
    public String toString() {
        return j(this.value);
    }
}
