package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* compiled from: Transformable.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/a1;", "", "<init>", "()V", "a", "b", "c", "Landroidx/compose/foundation/gestures/a1$a;", "Landroidx/compose/foundation/gestures/a1$b;", "Landroidx/compose/foundation/gestures/a1$c;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
abstract class a1 {

    /* compiled from: Transformable.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/gestures/a1$a;", "Landroidx/compose/foundation/gestures/a1;", "", "zoomChange", "Li0/f;", "panChange", "rotationChange", "<init>", "(FJFLkotlin/jvm/internal/w;)V", "a", "F", "c", "()F", "b", "J", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends a1 {

        /* renamed from: d, reason: collision with root package name */
        public static final int f3762d = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float zoomChange;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long panChange;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float rotationChange;

        public /* synthetic */ a(float f4, long j4, float f5, kotlin.jvm.internal.w wVar) {
            this(f4, j4, f5);
        }

        /* renamed from: a, reason: from getter */
        public final long getPanChange() {
            return this.panChange;
        }

        /* renamed from: b, reason: from getter */
        public final float getRotationChange() {
            return this.rotationChange;
        }

        /* renamed from: c, reason: from getter */
        public final float getZoomChange() {
            return this.zoomChange;
        }

        private a(float f4, long j4, float f5) {
            this.zoomChange = f4;
            this.panChange = j4;
            this.rotationChange = f5;
        }
    }

    /* compiled from: Transformable.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/a1$b;", "Landroidx/compose/foundation/gestures/a1;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends a1 {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final b f3766a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f3767b = 0;

        private b() {
        }
    }

    /* compiled from: Transformable.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/a1$c;", "Landroidx/compose/foundation/gestures/a1;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends a1 {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final c f3768a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final int f3769b = 0;

        private c() {
        }
    }

    private a1() {
    }

    public a1(kotlin.jvm.internal.w wVar) {
    }
}
