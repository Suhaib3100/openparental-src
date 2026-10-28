package androidx.compose.ui.text.style;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: BaselineShift.kt */
@kd.g
@m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/style/a;", "", "", "multiplier", "e", "(F)F", "", "j", "(F)Ljava/lang/String;", "", "i", "(F)I", "other", "", "f", "(FLjava/lang/Object;)Z", "a", "F", "h", "()F", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final float f21298c = 0.5f;

    /* renamed from: d, reason: collision with root package name */
    private static final float f21299d = -0.5f;

    /* renamed from: e, reason: collision with root package name */
    private static final float f21300e = 0.0f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float multiplier;

    /* compiled from: BaselineShift.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/style/a$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/a;", "Superscript", "F", "e", "()F", "f", "Subscript", "c", "d", "None", "a", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.style.a$a, reason: collision with other inner class name and from kotlin metadata */
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

        public final float a() {
            return a.f21300e;
        }

        public final float c() {
            return a.f21299d;
        }

        public final float e() {
            return a.f21298c;
        }

        public Companion(w wVar) {
        }
    }

    private /* synthetic */ a(float f4) {
        this.multiplier = f4;
    }

    public static final /* synthetic */ a d(float f4) {
        return new a(f4);
    }

    public static float e(float f4) {
        return f4;
    }

    public static boolean f(float f4, Object obj) {
        return (obj instanceof a) && Float.compare(f4, ((a) obj).multiplier) == 0;
    }

    public static final boolean g(float f4, float f5) {
        return Float.compare(f4, f5) == 0;
    }

    public static int i(float f4) {
        return Float.hashCode(f4);
    }

    public static String j(float f4) {
        return "BaselineShift(multiplier=" + f4 + ')';
    }

    public boolean equals(Object obj) {
        return f(this.multiplier, obj);
    }

    /* renamed from: h, reason: from getter */
    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return Float.hashCode(this.multiplier);
    }

    public final /* synthetic */ float k() {
        return this.multiplier;
    }

    public String toString() {
        return j(this.multiplier);
    }
}
