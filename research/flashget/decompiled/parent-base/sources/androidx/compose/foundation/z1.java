package androidx.compose.foundation;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: BasicMarquee.kt */
@x4
@z0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bç\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J#\u0010\u0006\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/z1;", "", "Landroidx/compose/ui/unit/d;", "", "contentWidth", "containerWidth", "a", "(Landroidx/compose/ui/unit/d;II)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface z1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f9277a;

    /* compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/z1$a;", "", "<init>", "()V", "", "fraction", "Landroidx/compose/foundation/z1;", "b", "(F)Landroidx/compose/foundation/z1;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.z1$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f9277a = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int c(float f4, androidx.compose.ui.unit.d dVar, int i4, int i5) {
            return kotlin.math.b.L0(f4 * i5);
        }

        @fg.l
        @z0
        public final z1 b(float fraction) {
            return new y1(fraction);
        }
    }

    @z0
    int a(@fg.l androidx.compose.ui.unit.d dVar, int i4, int i5);
}
