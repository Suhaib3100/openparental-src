package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.g;

/* compiled from: SafeCollector.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000e*\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/internal/l;", "Lkotlin/coroutines/g;", "", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lkotlin/coroutines/g;)V", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/g$b;", "operation", "g", "(Ljava/lang/Object;Lld/p;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/g$c;", "key", "c", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "d", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g;", "context", "O", "(Lkotlin/coroutines/g;)Lkotlin/coroutines/g;", "b", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class l implements kotlin.coroutines.g {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final Throwable e;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ kotlin.coroutines.g f80139c;

    public l(@fg.l Throwable th, @fg.l kotlin.coroutines.g gVar) {
        this.e = th;
        this.f80139c = gVar;
    }

    @Override // kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g O(@fg.l kotlin.coroutines.g context) {
        return this.f80139c.O(context);
    }

    @Override // kotlin.coroutines.g
    @fg.m
    public <E extends g.b> E c(@fg.l g.c<E> key) {
        return (E) this.f80139c.c(key);
    }

    @Override // kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g d(@fg.l g.c<?> key) {
        return this.f80139c.d(key);
    }

    @Override // kotlin.coroutines.g
    public <R> R g(R initial, @fg.l ld.p<? super R, ? super g.b, ? extends R> operation) {
        return (R) this.f80139c.g(initial, operation);
    }
}
