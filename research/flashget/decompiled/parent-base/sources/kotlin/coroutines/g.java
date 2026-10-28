package kotlin.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.coroutines.e;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import ld.p;

/* compiled from: CoroutineContext.kt */
@c1(version = "1.3")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001:\u0002\u0013\u0006J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/g;", "", "Lkotlin/coroutines/g$b;", "E", "Lkotlin/coroutines/g$c;", "key", "c", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "g", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "context", "O", "(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;", "d", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface g {

    /* compiled from: CoroutineContext.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: CoroutineContext.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/g;", "acc", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.coroutines.g$a$a, reason: collision with other inner class name */
        static final class C1055a extends n0 implements p<g, b, g> {

            /* renamed from: b, reason: collision with root package name */
            public static final C1055a f75056b = new C1055a(2);

            C1055a() {
                super(2);
            }

            @Override // ld.p
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(@l g gVar, @l b bVar) {
                kotlin.coroutines.c cVar;
                l0.p(gVar, ProtectedSandApp.s("挋\u0001"));
                l0.p(bVar, ProtectedSandApp.s("挌\u0001"));
                g d5 = gVar.d(bVar.getKey());
                i iVar = i.f75057b;
                if (d5 == iVar) {
                    return bVar;
                }
                e.Companion companion = e.INSTANCE;
                e eVar = (e) d5.c(companion);
                if (eVar == null) {
                    cVar = new kotlin.coroutines.c(d5, bVar);
                } else {
                    g d6 = d5.d(companion);
                    if (d6 == iVar) {
                        return new kotlin.coroutines.c(bVar, eVar);
                    }
                    cVar = new kotlin.coroutines.c(new kotlin.coroutines.c(d6, bVar), eVar);
                }
                return cVar;
            }
        }

        @l
        public static g a(@l g gVar, @l g gVar2) {
            l0.p(gVar2, ProtectedSandApp.s("挍\u0001"));
            return gVar2 == i.f75057b ? gVar : (g) gVar2.g(gVar, C1055a.f75056b);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "E", "Lkotlin/coroutines/g$c;", "key", "c", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "g", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "d", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "getKey", "()Lkotlin/coroutines/g$c;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends g {

        /* compiled from: CoroutineContext.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public static <R> R a(@l b bVar, R r4, @l p<? super R, ? super b, ? extends R> pVar) {
                l0.p(pVar, ProtectedSandApp.s("挎\u0001"));
                return pVar.invoke(r4, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @m
            public static <E extends b> E b(@l b bVar, @l c<E> cVar) {
                l0.p(cVar, ProtectedSandApp.s("挏\u0001"));
                if (!l0.g(bVar.getKey(), cVar)) {
                    return null;
                }
                l0.n(bVar, ProtectedSandApp.s("挐\u0001"));
                return bVar;
            }

            @l
            public static g c(@l b bVar, @l c<?> cVar) {
                l0.p(cVar, ProtectedSandApp.s("挏\u0001"));
                return l0.g(bVar.getKey(), cVar) ? i.f75057b : bVar;
            }

            @l
            public static g d(@l b bVar, @l g gVar) {
                l0.p(gVar, ProtectedSandApp.s("挑\u0001"));
                return a.a(bVar, gVar);
            }
        }

        @Override // kotlin.coroutines.g
        @m
        <E extends b> E c(@l c<E> key);

        @Override // kotlin.coroutines.g
        @l
        g d(@l c<?> key);

        @Override // kotlin.coroutines.g
        <R> R g(R initial, @l p<? super R, ? super b, ? extends R> operation);

        @l
        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/g$c;", "Lkotlin/coroutines/g$b;", "E", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c<E extends b> {
    }

    @l
    g O(@l g context);

    @m
    <E extends b> E c(@l c<E> key);

    @l
    g d(@l c<?> key);

    <R> R g(R initial, @l p<? super R, ? super b, ? extends R> operation);
}
