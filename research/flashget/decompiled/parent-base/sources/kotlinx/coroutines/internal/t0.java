package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.f2;

/* compiled from: Synchronized.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007*\u0010\b\u0007\u0010\t\"\u00020\u00012\u00020\u0001B\u0002\b\b¨\u0006\n"}, d2 = {"T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "b", "(Ljava/lang/Object;Lld/a;)Ljava/lang/Object;", "Lkotlinx/coroutines/f2;", "SynchronizedObject", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class t0 {
    @f2
    public static /* synthetic */ void a() {
    }

    @f2
    public static final <T> T b(@fg.l Object obj, @fg.l ld.a<? extends T> aVar) {
        T invoke;
        synchronized (obj) {
            invoke = aVar.invoke();
        }
        return invoke;
    }
}
