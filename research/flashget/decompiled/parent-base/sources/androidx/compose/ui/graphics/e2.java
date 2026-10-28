package androidx.compose.ui.graphics;

import android.graphics.ColorFilter;
import kotlin.Metadata;

/* compiled from: ColorFilter.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/e2;", "", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(Landroid/graphics/ColorFilter;)V", "a", "Landroid/graphics/ColorFilter;", "()Landroid/graphics/ColorFilter;", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class e2 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ColorFilter nativeColorFilter;

    /* compiled from: ColorFilter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/e2$a;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/graphics/k1;", "blendMode", "Landroidx/compose/ui/graphics/e2;", "c", "(JI)Landroidx/compose/ui/graphics/e2;", "Landroidx/compose/ui/graphics/g2;", "colorMatrix", "a", "([F)Landroidx/compose/ui/graphics/e2;", "multiply", "add", "b", "(JJ)Landroidx/compose/ui/graphics/e2;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.e2$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static e2 d(Companion companion, long j4, int i4, int i5, Object obj) {
            if ((i5 & 2) != 0) {
                k1.INSTANCE.getClass();
                i4 = k1.f17879h;
            }
            return companion.c(j4, i4);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final e2 a(@fg.l float[] colorMatrix) {
            return new h2(colorMatrix, (kotlin.jvm.internal.w) null);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final e2 b(long multiply, long add) {
            return new v4(multiply, add, (kotlin.jvm.internal.w) null);
        }

        @androidx.compose.runtime.x4
        @fg.l
        public final e2 c(long color, int blendMode) {
            return new l1(color, blendMode, (kotlin.jvm.internal.w) null);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public e2(@fg.l ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final ColorFilter getNativeColorFilter() {
        return this.nativeColorFilter;
    }
}
