package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: PressInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/m;", "Landroidx/compose/foundation/interaction/h;", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface m extends h {

    /* compiled from: PressInteraction.kt */
    @u(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/m$a;", "Landroidx/compose/foundation/interaction/m;", "Landroidx/compose/foundation/interaction/m$b;", "press", "<init>", "(Landroidx/compose/foundation/interaction/m$b;)V", "a", "Landroidx/compose/foundation/interaction/m$b;", "()Landroidx/compose/foundation/interaction/m$b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements m {

        /* renamed from: b, reason: collision with root package name */
        public static final int f4704b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b press;

        public a(@fg.l b bVar) {
            this.press = bVar;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final b getPress() {
            return this.press;
        }
    }

    /* compiled from: PressInteraction.kt */
    @u(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/m$b;", "Landroidx/compose/foundation/interaction/m;", "Li0/f;", "pressPosition", "<init>", "(JLkotlin/jvm/internal/w;)V", "a", "J", "()J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements m {

        /* renamed from: b, reason: collision with root package name */
        public static final int f4706b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long pressPosition;

        public /* synthetic */ b(long j4, w wVar) {
            this(j4);
        }

        /* renamed from: a, reason: from getter */
        public final long getPressPosition() {
            return this.pressPosition;
        }

        private b(long j4) {
            this.pressPosition = j4;
        }
    }

    /* compiled from: PressInteraction.kt */
    @u(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/m$c;", "Landroidx/compose/foundation/interaction/m;", "Landroidx/compose/foundation/interaction/m$b;", "press", "<init>", "(Landroidx/compose/foundation/interaction/m$b;)V", "a", "Landroidx/compose/foundation/interaction/m$b;", "()Landroidx/compose/foundation/interaction/m$b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements m {

        /* renamed from: b, reason: collision with root package name */
        public static final int f4708b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final b press;

        public c(@fg.l b bVar) {
            this.press = bVar;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final b getPress() {
            return this.press;
        }
    }
}
