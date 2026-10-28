package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlinx.coroutines.l3;

/* compiled from: ThreadContext.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/e1;", "", "Lkotlin/coroutines/g;", "context", "", "n", "<init>", "(Lkotlin/coroutines/g;I)V", "Lkotlinx/coroutines/l3;", "element", "value", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/l3;Ljava/lang/Object;)V", "b", "(Lkotlin/coroutines/g;)V", "Lkotlin/coroutines/g;", "", "[Ljava/lang/Object;", "values", "c", "[Lkotlinx/coroutines/l3;", "elements", "d", "I", "i", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class e1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final kotlin.coroutines.g context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] values;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l3<Object>[] elements;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int i;

    public e1(@fg.l kotlin.coroutines.g gVar, int i4) {
        this.context = gVar;
        this.values = new Object[i4];
        this.elements = new l3[i4];
    }

    public final void a(@fg.l l3<?> element, @fg.m Object value) {
        Object[] objArr = this.values;
        int i4 = this.i;
        objArr[i4] = value;
        l3<Object>[] l3VarArr = this.elements;
        this.i = i4 + 1;
        kotlin.jvm.internal.l0.n(element, ProtectedSandApp.s("蟜\u0001"));
        l3VarArr[i4] = element;
    }

    public final void b(@fg.l kotlin.coroutines.g context) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i4 = length - 1;
            l3<Object> l3Var = this.elements[length];
            kotlin.jvm.internal.l0.m(l3Var);
            l3Var.H(context, this.values[length]);
            if (i4 < 0) {
                return;
            } else {
                length = i4;
            }
        }
    }
}
