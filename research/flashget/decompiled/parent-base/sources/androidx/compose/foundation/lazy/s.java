package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.j0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyListLayoutInfo.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u001a\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0014\u0010\u001e\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0014\u0010 \u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006!À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/s;", "", "", "Landroidx/compose/foundation/lazy/n;", "j", "()Ljava/util/List;", "visibleItemsInfo", "", "f", "()I", "viewportStartOffset", "d", "viewportEndOffset", "h", "totalItemsCount", "Landroidx/compose/ui/unit/u;", "b", "()J", "viewportSize", "Landroidx/compose/foundation/gestures/j0;", "a", "()Landroidx/compose/foundation/gestures/j0;", "orientation", "", "g", "()Z", "reverseLayout", "e", "beforeContentPadding", "c", "afterContentPadding", "i", "mainAxisItemSpacing", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s {

    /* compiled from: LazyListLayoutInfo.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @Deprecated
        public static int a(@fg.l s sVar) {
            sVar.getClass();
            return 0;
        }

        @Deprecated
        public static int b(@fg.l s sVar) {
            sVar.getClass();
            return 0;
        }

        @Deprecated
        public static int c(@fg.l s sVar) {
            sVar.getClass();
            return 0;
        }

        @fg.l
        @Deprecated
        public static j0 d(@fg.l s sVar) {
            sVar.getClass();
            return j0.Vertical;
        }

        @Deprecated
        public static boolean e(@fg.l s sVar) {
            sVar.getClass();
            return false;
        }

        @Deprecated
        public static long f(@fg.l s sVar) {
            return s.super.b();
        }
    }

    static j0 k(s sVar) {
        sVar.getClass();
        return j0.Vertical;
    }

    static boolean l(s sVar) {
        sVar.getClass();
        return false;
    }

    static int m(s sVar) {
        sVar.getClass();
        return 0;
    }

    static int n(s sVar) {
        sVar.getClass();
        return 0;
    }

    static int r(s sVar) {
        sVar.getClass();
        return 0;
    }

    @fg.l
    default j0 a() {
        return j0.Vertical;
    }

    default long b() {
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        return androidx.compose.ui.unit.u.f21529c;
    }

    default int c() {
        return 0;
    }

    int d();

    default int e() {
        return 0;
    }

    int f();

    default boolean g() {
        return false;
    }

    int h();

    default int i() {
        return 0;
    }

    @fg.l
    List<n> j();
}
