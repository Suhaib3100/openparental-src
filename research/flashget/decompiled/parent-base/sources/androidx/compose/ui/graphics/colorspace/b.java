package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.g0;
import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: ColorModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\t8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/b;", "", "", "packedValue", "f", "(J)J", "", "l", "(J)Ljava/lang/String;", "", "k", "(J)I", "other", "", "g", "(JLjava/lang/Object;)Z", "a", "J", "j", "i", "()V", "componentCount", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kd.g
@m1
@r1({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,91:1\n55#2:92\n48#2:93\n48#2:94\n48#2:95\n48#2:96\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n49#1:92\n58#1:93\n65#1:94\n72#1:95\n80#1:96\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final long f17669c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f17670d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f17671e;

    /* renamed from: f, reason: collision with root package name */
    private static final long f17672f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* compiled from: ColorModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/b$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/b;", "Rgb", "J", "c", "()J", "Xyz", "d", "Lab", "b", "Cmyk", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.colorspace.b$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final long a() {
            return b.f17672f;
        }

        public final long b() {
            return b.f17671e;
        }

        public final long c() {
            return b.f17669c;
        }

        public final long d() {
            return b.f17670d;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        long j4 = 3;
        long j5 = j4 << 32;
        f17669c = (0 & 4294967295L) | j5;
        f17670d = (1 & 4294967295L) | j5;
        f17671e = j5 | (2 & 4294967295L);
        f17672f = (j4 & 4294967295L) | (4 << 32);
    }

    private /* synthetic */ b(long j4) {
        this.packedValue = j4;
    }

    public static final /* synthetic */ b e(long j4) {
        return new b(j4);
    }

    public static long f(long j4) {
        return j4;
    }

    public static boolean g(long j4, Object obj) {
        return (obj instanceof b) && j4 == ((b) obj).packedValue;
    }

    public static final boolean h(long j4, long j5) {
        return j4 == j5;
    }

    @x4
    public static /* synthetic */ void i() {
    }

    @g0(from = 1, to = 4)
    public static final int j(long j4) {
        return (int) (j4 >> 32);
    }

    public static int k(long j4) {
        return Long.hashCode(j4);
    }

    @fg.l
    public static String l(long j4) {
        return h(j4, f17669c) ? "Rgb" : h(j4, f17670d) ? "Xyz" : h(j4, f17671e) ? "Lab" : h(j4, f17672f) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return g(this.packedValue, obj);
    }

    public int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    /* renamed from: m, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @fg.l
    public String toString() {
        return l(this.packedValue);
    }
}
