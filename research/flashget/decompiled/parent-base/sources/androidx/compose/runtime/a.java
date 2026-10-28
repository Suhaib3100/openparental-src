package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Applier.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0014\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0007H$¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0011\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR*\u0010!\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u00008\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a\"\u0004\b \u0010\u0005¨\u0006\""}, d2 = {"Landroidx/compose/runtime/a;", "T", "Landroidx/compose/runtime/e;", "root", "<init>", "(Ljava/lang/Object;)V", "node", "Lkotlin/k2;", "i", "k", "()V", "clear", "n", "", "", "index", "count", "o", "(Ljava/util/List;II)V", "from", "to", "m", "(Ljava/util/List;III)V", "a", "Ljava/lang/Object;", "l", "()Ljava/lang/Object;", "b", "Ljava/util/List;", "stack", "<set-?>", "c", "p", "current", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nApplier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Applier.kt\nandroidx/compose/runtime/AbstractApplier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"})
/* loaded from: classes.dex */
public abstract class a<T> implements e<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f15895d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<T> stack = new ArrayList();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private T current;

    public a(T t4) {
        this.root = t4;
        this.current = t4;
    }

    @Override // androidx.compose.runtime.e
    public T b() {
        return this.current;
    }

    @Override // androidx.compose.runtime.e
    public final void clear() {
        this.stack.clear();
        p(this.root);
        n();
    }

    @Override // androidx.compose.runtime.e
    public void i(T node) {
        this.stack.add(b());
        p(node);
    }

    @Override // androidx.compose.runtime.e
    public void k() {
        if (this.stack.isEmpty()) {
            throw new IllegalStateException("empty stack");
        }
        p(this.stack.remove(r0.size() - 1));
    }

    public final T l() {
        return this.root;
    }

    protected final void m(@fg.l List<T> list, int i4, int i5, int i6) {
        int i7 = i4 > i5 ? i5 : i5 - i6;
        if (i6 != 1) {
            List<T> subList = list.subList(i4, i6 + i4);
            List Y5 = kotlin.collections.w.Y5(subList);
            subList.clear();
            list.addAll(i7, Y5);
            return;
        }
        if (i4 == i5 + 1 || i4 == i5 - 1) {
            list.set(i4, list.set(i5, list.get(i4)));
        } else {
            list.add(i7, list.remove(i4));
        }
    }

    protected abstract void n();

    protected final void o(@fg.l List<T> list, int i4, int i5) {
        if (i5 == 1) {
            list.remove(i4);
        } else {
            list.subList(i4, i5 + i4).clear();
        }
    }

    protected void p(T t4) {
        this.current = t4;
    }
}
