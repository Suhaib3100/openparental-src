package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.c1;
import kotlin.coroutines.g;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: ContinuationImpl.kt */
@c1(version = "1.3")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/d;", "", "completion", "Lkotlin/coroutines/g;", "_context", "<init>", "(Lkotlin/coroutines/d;Lkotlin/coroutines/g;)V", "(Lkotlin/coroutines/d;)V", "intercepted", "()Lkotlin/coroutines/d;", "Lkotlin/k2;", "releaseIntercepted", "()V", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/g;", "context", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
/* loaded from: classes7.dex */
public abstract class d extends a {

    @fg.m
    private final kotlin.coroutines.g _context;

    @fg.m
    private transient kotlin.coroutines.d<Object> intercepted;

    public d(@fg.m kotlin.coroutines.d<Object> dVar, @fg.m kotlin.coroutines.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // kotlin.coroutines.d
    @fg.l
    public kotlin.coroutines.g getContext() {
        kotlin.coroutines.g gVar = this._context;
        l0.m(gVar);
        return gVar;
    }

    @fg.l
    public final kotlin.coroutines.d<Object> intercepted() {
        kotlin.coroutines.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            kotlin.coroutines.e eVar = (kotlin.coroutines.e) getContext().c(kotlin.coroutines.e.INSTANCE);
            if (eVar == null || (dVar = eVar.m(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        kotlin.coroutines.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b c5 = getContext().c(kotlin.coroutines.e.INSTANCE);
            l0.m(c5);
            ((kotlin.coroutines.e) c5).i(dVar);
        }
        this.intercepted = c.f75073b;
    }

    public d(@fg.m kotlin.coroutines.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
