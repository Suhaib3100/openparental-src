package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.u;
import kotlin.Metadata;

/* compiled from: FocusInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/d;", "Landroidx/compose/foundation/interaction/h;", "a", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d extends h {

    /* compiled from: FocusInteraction.kt */
    @u(parameters = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/d$a;", "Landroidx/compose/foundation/interaction/d;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f4687a = 0;
    }

    /* compiled from: FocusInteraction.kt */
    @u(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/d$b;", "Landroidx/compose/foundation/interaction/d;", "Landroidx/compose/foundation/interaction/d$a;", "focus", "<init>", "(Landroidx/compose/foundation/interaction/d$a;)V", "a", "Landroidx/compose/foundation/interaction/d$a;", "()Landroidx/compose/foundation/interaction/d$a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements d {

        /* renamed from: b, reason: collision with root package name */
        public static final int f4688b = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final a focus;

        public b(@fg.l a aVar) {
            this.focus = aVar;
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final a getFocus() {
            return this.focus;
        }
    }
}
