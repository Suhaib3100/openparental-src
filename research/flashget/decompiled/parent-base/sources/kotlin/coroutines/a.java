package kotlin.coroutines;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.coroutines.g;
import kotlin.jvm.internal.l0;
import ld.p;

/* compiled from: CoroutineContextImpl.kt */
@c1(version = "1.3")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/coroutines/a;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g$c;", "key", "<init>", "(Lkotlin/coroutines/g$c;)V", "b", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a implements g.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final g.c<?> key;

    public a(@l g.c<?> cVar) {
        l0.p(cVar, ProtectedSandApp.s("拮\u0001"));
        this.key = cVar;
    }

    @Override // kotlin.coroutines.g
    @l
    public g O(@l g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @m
    public <E extends g.b> E c(@l g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @l
    public g d(@l g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R g(R r4, @l p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r4, pVar);
    }

    @Override // kotlin.coroutines.g.b
    @l
    public g.c<?> getKey() {
        return this.key;
    }
}
