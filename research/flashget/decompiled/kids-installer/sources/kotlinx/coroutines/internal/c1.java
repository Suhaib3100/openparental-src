package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.r3;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/c1;", "", "Lkotlinx/coroutines/r3;", "element", "value", "Lkotlin/m2;", "a", "Lkotlin/coroutines/g;", "context", "b", "Lkotlin/coroutines/g;", "", "[Ljava/lang/Object;", "values", "c", "[Lkotlinx/coroutines/r3;", "elements", "", "d", "I", "i", "n", "<init>", "(Lkotlin/coroutines/g;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
final class c1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    @p3.f
    public final CoroutineContext context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Object[] values;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final r3<Object>[] elements;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int i;

    public c1(@d5.d CoroutineContext coroutineContext, int i5) {
        this.context = coroutineContext;
        this.values = new Object[i5];
        this.elements = new r3[i5];
    }

    public final void a(@d5.d r3<?> r3Var, @d5.e Object obj) {
        Object[] objArr = this.values;
        int i5 = this.i;
        objArr[i5] = obj;
        r3<Object>[] r3VarArr = this.elements;
        this.i = i5 + 1;
        r3VarArr[i5] = r3Var;
    }

    public final void b(@d5.d CoroutineContext coroutineContext) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i5 = length - 1;
            r3<Object> r3Var = this.elements[length];
            kotlin.jvm.internal.l0.m(r3Var);
            r3Var.f0(coroutineContext, this.values[length]);
            if (i5 < 0) {
                return;
            } else {
                length = i5;
            }
        }
    }
}
