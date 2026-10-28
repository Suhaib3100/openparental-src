package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.f2;

/* compiled from: Atomic.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\bR\u0018\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00138\u0002X\u0082\u0004¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/internal/b;", "T", "Lkotlinx/coroutines/internal/k0;", "<init>", "()V", "", "decision", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "affected", "e", "failure", "Lkotlin/k2;", "c", "(Ljava/lang/Object;Ljava/lang/Object;)V", "b", "a", "()Lkotlinx/coroutines/internal/b;", "atomicOp", "Lkotlinx/atomicfu/AtomicRef;", "_consensus", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f2
@r1({"SMAP\nAtomic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Atomic.kt\nkotlinx/coroutines/internal/AtomicOp\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: classes7.dex */
public abstract class b<T> extends k0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final AtomicReferenceFieldUpdater f80750a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, ProtectedSandApp.s("蟕\u0001"));

    @fg.m
    @kd.x
    private volatile Object _consensus = a.f80724a;

    private final Object d(Object decision) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f80750a;
        Object obj = atomicReferenceFieldUpdater.get(this);
        Object obj2 = a.f80724a;
        return obj != obj2 ? obj : androidx.concurrent.futures.c.a(atomicReferenceFieldUpdater, this, obj2, decision) ? decision : atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.k0
    @fg.l
    public b<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.k0
    @fg.m
    public final Object b(@fg.m Object affected) {
        Object obj = f80750a.get(this);
        if (obj == a.f80724a) {
            obj = d(e(affected));
        }
        c(affected, obj);
        return obj;
    }

    public abstract void c(T affected, @fg.m Object failure);

    @fg.m
    public abstract Object e(T affected);
}
