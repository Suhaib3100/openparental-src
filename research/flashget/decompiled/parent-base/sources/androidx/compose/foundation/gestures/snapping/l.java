package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.z0;
import kotlin.Metadata;

/* compiled from: SnapPositionInLayout.kt */
@z0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\bç\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ7\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/l;", "", "", "layoutSize", "itemSize", "beforeContentPadding", "afterContentPadding", "itemIndex", "a", "(IIIII)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f4313a;

    /* compiled from: SnapPositionInLayout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/l$a;", "", "<init>", "()V", "Landroidx/compose/foundation/gestures/snapping/l;", "b", "Landroidx/compose/foundation/gestures/snapping/l;", "c", "()Landroidx/compose/foundation/gestures/snapping/l;", "CenterToCenter", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.snapping.l$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f4313a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final l CenterToCenter = new k();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int b(int i4, int i5, int i6, int i7, int i10) {
            return (((i4 - i6) - i7) / 2) - (i5 / 2);
        }

        @fg.l
        public final l c() {
            return CenterToCenter;
        }
    }

    int a(int layoutSize, int itemSize, int beforeContentPadding, int afterContentPadding, int itemIndex);
}
