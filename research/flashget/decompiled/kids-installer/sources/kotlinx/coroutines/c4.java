package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Unconfined.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/c4;", "Lkotlin/coroutines/a;", "", "p", "Z", "dispatcherWasUnconfined", "<init>", "()V", "q", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes6.dex */
public final class c4 extends AbstractCoroutineContextElement {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @p3.f
    public boolean dispatcherWasUnconfined;

    /* compiled from: Unconfined.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/c4$a;", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/c4;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.c4$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion implements CoroutineContext.c<c4> {
        private Companion() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public c4() {
        super(INSTANCE);
    }
}
