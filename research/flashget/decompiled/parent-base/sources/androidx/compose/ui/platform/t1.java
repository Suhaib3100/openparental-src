package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: InfiniteAnimationPolicy.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ4\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H¦@¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/t1;", "Lkotlin/coroutines/g$b;", "R", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "t", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "e0", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface t1 extends g.b {

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f20140b;

    /* compiled from: InfiniteAnimationPolicy.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static <R> R a(@fg.l t1 t1Var, R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(t1Var, r4, pVar);
        }

        @fg.m
        public static <E extends g.b> E b(@fg.l t1 t1Var, @fg.l g.c<E> cVar) {
            return (E) g.b.a.b(t1Var, cVar);
        }

        @fg.l
        @Deprecated
        public static g.c<?> c(@fg.l t1 t1Var) {
            return t1.B0(t1Var);
        }

        @fg.l
        public static kotlin.coroutines.g d(@fg.l t1 t1Var, @fg.l g.c<?> cVar) {
            return g.b.a.c(t1Var, cVar);
        }

        @fg.l
        public static kotlin.coroutines.g e(@fg.l t1 t1Var, @fg.l kotlin.coroutines.g gVar) {
            return g.b.a.d(t1Var, gVar);
        }
    }

    /* compiled from: InfiniteAnimationPolicy.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/t1$b;", "Lkotlin/coroutines/g$c;", "Landroidx/compose/ui/platform/t1;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.t1$b, reason: from kotlin metadata */
    public static final class Companion implements g.c<t1> {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f20140b = new Companion();

        private Companion() {
        }
    }

    static g.c B0(t1 t1Var) {
        t1Var.getClass();
        return INSTANCE;
    }

    @Override // kotlin.coroutines.g.b
    @fg.l
    default g.c<?> getKey() {
        return INSTANCE;
    }

    @fg.m
    <R> Object t(@fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar, @fg.l kotlin.coroutines.d<? super R> dVar);
}
