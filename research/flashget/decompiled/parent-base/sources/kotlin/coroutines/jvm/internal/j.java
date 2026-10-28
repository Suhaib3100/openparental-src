package kotlin.coroutines.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;

/* compiled from: ContinuationImpl.kt */
@c1(version = "1.3")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/coroutines/jvm/internal/j;", "Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/d;", "", "completion", "<init>", "(Lkotlin/coroutines/d;)V", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class j extends a {
    public j(@fg.m kotlin.coroutines.d<Object> dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != kotlin.coroutines.i.f75057b) {
            throw new IllegalArgumentException(ProtectedSandApp.s("戁\u0001"));
        }
    }

    @Override // kotlin.coroutines.d
    @fg.l
    public kotlin.coroutines.g getContext() {
        return kotlin.coroutines.i.f75057b;
    }
}
