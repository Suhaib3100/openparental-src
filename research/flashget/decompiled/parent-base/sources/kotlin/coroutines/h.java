package kotlin.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.coroutines.g;
import kotlin.jvm.internal.l0;
import kotlin.r;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/coroutines/g$b;", "E", "Lkotlin/coroutines/g$c;", "key", "a", "(Lkotlin/coroutines/g$b;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "b", "(Lkotlin/coroutines/g$b;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    @r
    @m
    @c1(version = "1.3")
    public static final <E extends g.b> E a(@l g.b bVar, @l g.c<E> cVar) {
        E e4;
        l0.p(bVar, ProtectedSandApp.s("挒\u0001"));
        l0.p(cVar, ProtectedSandApp.s("挓\u0001"));
        if (!(cVar instanceof b)) {
            if (bVar.getKey() == cVar) {
                return bVar;
            }
            return null;
        }
        b bVar2 = (b) cVar;
        if (!bVar2.a(bVar.getKey()) || (e4 = (E) bVar2.b(bVar)) == null) {
            return null;
        }
        return e4;
    }

    @l
    @r
    @c1(version = "1.3")
    public static final g b(@l g.b bVar, @l g.c<?> cVar) {
        l0.p(bVar, ProtectedSandApp.s("挒\u0001"));
        l0.p(cVar, ProtectedSandApp.s("挓\u0001"));
        if (!(cVar instanceof b)) {
            return bVar.getKey() == cVar ? i.f75057b : bVar;
        }
        b bVar2 = (b) cVar;
        return (!bVar2.a(bVar.getKey()) || bVar2.b(bVar) == null) ? bVar : i.f75057b;
    }
}
