package androidx.compose.ui;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: MotionDurationScale.kt */
@x4
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/s;", "Lkotlin/coroutines/g$b;", "", "B", "()F", "scaleFactor", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "W", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s extends g.b {

    /* renamed from: W, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f20271b;

    /* compiled from: MotionDurationScale.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <R> R a(@fg.l s sVar, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(sVar, r4, pVar);
        }

        @fg.m
        public static <E extends g.b> E b(@fg.l s sVar, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(sVar, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g c(@fg.l s sVar, @fg.l g.c<?> cVar) {
            return g.b.a.c(sVar, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g d(@fg.l s sVar, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(sVar, gVar);
        }
    }

    /* compiled from: MotionDurationScale.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/s$b;", "Lkotlin/coroutines/g$c;", "Landroidx/compose/ui/s;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.s$b, reason: from kotlin metadata */
    public static final class Companion implements g.c<s> {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f20271b = new Companion();

        private Companion() {
        }
    }

    float B();

    @Override // kotlin.coroutines.g.b
    @fg.l
    default g.c<?> getKey() {
        return INSTANCE;
    }
}
