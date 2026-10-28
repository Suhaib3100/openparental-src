package androidx.compose.foundation.gestures;

import kotlin.Metadata;

/* compiled from: Draggable.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/t;", "", "<init>", "()V", "a", "b", "c", "d", "Landroidx/compose/foundation/gestures/t$a;", "Landroidx/compose/foundation/gestures/t$b;", "Landroidx/compose/foundation/gestures/t$c;", "Landroidx/compose/foundation/gestures/t$d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4315a = 0;

    /* compiled from: Draggable.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/t$a;", "Landroidx/compose/foundation/gestures/t;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends t {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final a f4316b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f4317c = 0;

        private a() {
            super(null);
        }
    }

    /* compiled from: Draggable.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/t$b;", "Landroidx/compose/foundation/gestures/t;", "Li0/f;", "delta", "<init>", "(JLkotlin/jvm/internal/w;)V", "b", "J", "a", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends t {

        /* renamed from: c, reason: collision with root package name */
        public static final int f4318c = 0;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long delta;

        public /* synthetic */ b(long j4, kotlin.jvm.internal.w wVar) {
            this(j4);
        }

        /* renamed from: a, reason: from getter */
        public final long getDelta() {
            return this.delta;
        }

        private b(long j4) {
            super(null);
            this.delta = j4;
        }
    }

    /* compiled from: Draggable.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/t$c;", "Landroidx/compose/foundation/gestures/t;", "Li0/f;", "startPoint", "<init>", "(JLkotlin/jvm/internal/w;)V", "b", "J", "a", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends t {

        /* renamed from: c, reason: collision with root package name */
        public static final int f4320c = 0;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long startPoint;

        public /* synthetic */ c(long j4, kotlin.jvm.internal.w wVar) {
            this(j4);
        }

        /* renamed from: a, reason: from getter */
        public final long getStartPoint() {
            return this.startPoint;
        }

        private c(long j4) {
            super(null);
            this.startPoint = j4;
        }
    }

    /* compiled from: Draggable.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/t$d;", "Landroidx/compose/foundation/gestures/t;", "Landroidx/compose/ui/unit/c0;", "velocity", "<init>", "(JLkotlin/jvm/internal/w;)V", "b", "J", "a", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends t {

        /* renamed from: c, reason: collision with root package name */
        public static final int f4322c = 0;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long velocity;

        public /* synthetic */ d(long j4, kotlin.jvm.internal.w wVar) {
            this(j4);
        }

        /* renamed from: a, reason: from getter */
        public final long getVelocity() {
            return this.velocity;
        }

        private d(long j4) {
            super(null);
            this.velocity = j4;
        }
    }

    public /* synthetic */ t(kotlin.jvm.internal.w wVar) {
        this();
    }

    private t() {
    }
}
