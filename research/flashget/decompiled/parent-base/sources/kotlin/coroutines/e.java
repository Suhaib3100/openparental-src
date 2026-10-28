package kotlin.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.coroutines.g;
import kotlin.jvm.internal.l0;
import ld.p;

/* compiled from: ContinuationInterceptor.kt */
@c1(version = "1.3")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013J)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/e;", "Lkotlin/coroutines/g$b;", "T", "Lkotlin/coroutines/d;", "continuation", "m", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "Lkotlin/k2;", "i", "(Lkotlin/coroutines/d;)V", "E", "Lkotlin/coroutines/g$c;", "key", "c", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "d", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "m2", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface e extends g.b {

    /* renamed from: m2, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = Companion.f75053b;

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static <R> R a(@l e eVar, R r4, @l p<? super R, ? super g.b, ? extends R> pVar) {
            l0.p(pVar, ProtectedSandApp.s("挀\u0001"));
            return (R) g.b.a.a(eVar, r4, pVar);
        }

        @m
        public static <E extends g.b> E b(@l e eVar, @l g.c<E> cVar) {
            E e4;
            l0.p(cVar, ProtectedSandApp.s("持\u0001"));
            if (!(cVar instanceof b)) {
                if (e.INSTANCE != cVar) {
                    return null;
                }
                l0.n(eVar, ProtectedSandApp.s("挂\u0001"));
                return eVar;
            }
            b bVar = (b) cVar;
            if (!bVar.a(eVar.getKey()) || (e4 = (E) bVar.b(eVar)) == null) {
                return null;
            }
            return e4;
        }

        @l
        public static g c(@l e eVar, @l g.c<?> cVar) {
            l0.p(cVar, ProtectedSandApp.s("持\u0001"));
            if (!(cVar instanceof b)) {
                return e.INSTANCE == cVar ? i.f75057b : eVar;
            }
            b bVar = (b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : i.f75057b;
        }

        @l
        public static g d(@l e eVar, @l g gVar) {
            l0.p(gVar, ProtectedSandApp.s("挃\u0001"));
            return g.b.a.d(eVar, gVar);
        }

        public static void e(@l e eVar, @l d<?> dVar) {
            l0.p(dVar, ProtectedSandApp.s("挄\u0001"));
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/e$b;", "Lkotlin/coroutines/g$c;", "Lkotlin/coroutines/e;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.e$b, reason: from kotlin metadata */
    public static final class Companion implements g.c<e> {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f75053b = new Companion();

        private Companion() {
        }
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @m
    <E extends g.b> E c(@l g.c<E> key);

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @l
    g d(@l g.c<?> key);

    void i(@l d<?> continuation);

    @l
    <T> d<T> m(@l d<? super T> continuation);
}
