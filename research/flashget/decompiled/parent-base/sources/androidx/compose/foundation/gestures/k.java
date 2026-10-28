package androidx.compose.foundation.gestures;

import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: Scrollable.kt */
@x4
@androidx.compose.foundation.z0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/k;", "", "", "offset", "size", "containerSize", "a", "(FFF)F", "Landroidx/compose/animation/core/k;", "b", "()Landroidx/compose/animation/core/k;", "scrollAnimationSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f4104a;

    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/gestures/k$a;", "", "<init>", "()V", "Landroidx/compose/animation/core/k;", "", "b", "Landroidx/compose/animation/core/k;", "()Landroidx/compose/animation/core/k;", "DefaultScrollAnimationSpec", "Landroidx/compose/foundation/gestures/k;", "c", "Landroidx/compose/foundation/gestures/k;", "a", "()Landroidx/compose/foundation/gestures/k;", "DefaultBringIntoViewSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.k$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f4104a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final androidx.compose.animation.core.k<Float> DefaultScrollAnimationSpec = androidx.compose.animation.core.l.p(0.0f, 0.0f, null, 7, null);

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final k DefaultBringIntoViewSpec = new C0070a();

        /* compiled from: Scrollable.kt */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"androidx/compose/foundation/gestures/k$a$a", "Landroidx/compose/foundation/gestures/k;", "", "offset", "size", "containerSize", "a", "(FFF)F", "Landroidx/compose/animation/core/k;", "b", "Landroidx/compose/animation/core/k;", "()Landroidx/compose/animation/core/k;", "scrollAnimationSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.gestures.k$a$a, reason: collision with other inner class name */
        public static final class C0070a implements k {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final androidx.compose.animation.core.k<Float> scrollAnimationSpec = Companion.f4104a.b();

            C0070a() {
            }

            @Override // androidx.compose.foundation.gestures.k
            public float a(float offset, float size, float containerSize) {
                float f4 = size + offset;
                if ((offset >= 0.0f && f4 <= containerSize) || (offset < 0.0f && f4 > containerSize)) {
                    return 0.0f;
                }
                float f5 = f4 - containerSize;
                return Math.abs(offset) < Math.abs(f5) ? offset : f5;
            }

            @Override // androidx.compose.foundation.gestures.k
            @fg.l
            public androidx.compose.animation.core.k<Float> b() {
                return this.scrollAnimationSpec;
            }
        }

        private Companion() {
        }

        @fg.l
        public final k a() {
            return DefaultBringIntoViewSpec;
        }

        @fg.l
        public final androidx.compose.animation.core.k<Float> b() {
            return DefaultScrollAnimationSpec;
        }
    }

    float a(float offset, float size, float containerSize);

    @fg.l
    default androidx.compose.animation.core.k<Float> b() {
        return INSTANCE.b();
    }
}
