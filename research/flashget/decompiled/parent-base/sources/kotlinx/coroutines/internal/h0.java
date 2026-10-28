package kotlinx.coroutines.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: OnDemandAllocatingPool.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\f\u001a\u00020\u000b*\u00020\u0003H\u0082\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u000b\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004R\u0013\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001b8\u0002X\u0082\u0004¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/internal/h0;", "T", "", "", "maxCapacity", "Lkotlin/Function1;", "create", "<init>", "(ILld/l;)V", "f", "()I", "", "c", "(I)Z", "a", "()Z", "", "b", "()Ljava/util/List;", "", "e", "()Ljava/lang/String;", "toString", "I", "Lld/l;", "Lkotlinx/atomicfu/AtomicInt;", "controlState", "Lkotlinx/atomicfu/AtomicArray;", "elements", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,107:1\n41#1:108\n41#1:109\n35#1,7:110\n41#1:127\n1549#2:117\n1620#2,2:118\n1622#2:122\n1549#2:123\n1620#2,3:124\n101#3,2:120\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n35#1:108\n54#1:109\n76#1:110,7\n92#1:127\n77#1:117\n77#1:118,2\n77#1:122\n91#1:123\n91#1:124,3\n79#1:120,2\n*E\n"})
/* loaded from: classes7.dex */
public final class h0<T> {

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final AtomicIntegerFieldUpdater f80776d = AtomicIntegerFieldUpdater.newUpdater(h0.class, ProtectedSandApp.s("蟣\u0001"));

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxCapacity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Integer, T> create;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final AtomicReferenceArray f80779c;

    @kd.x
    private volatile int controlState;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(int i4, @fg.l ld.l<? super Integer, ? extends T> lVar) {
        this.maxCapacity = i4;
        this.create = lVar;
        this.f80779c = new AtomicReferenceArray(i4);
    }

    private final boolean c(int i4) {
        return (i4 & Integer.MIN_VALUE) != 0;
    }

    private final void d(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ld.l<? super Integer, k2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final int f() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80776d;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!f80776d.compareAndSet(this, i4, Integer.MIN_VALUE | i4));
        return i4;
    }

    public final boolean a() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80776d;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i4) != 0) {
                return false;
            }
            if (i4 >= this.maxCapacity) {
                return true;
            }
        } while (!f80776d.compareAndSet(this, i4, i4 + 1));
        this.f80779c.set(i4, this.create.invoke(Integer.valueOf(i4)));
        return true;
    }

    @fg.l
    public final List<T> b() {
        int i4;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f80776d;
        while (true) {
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & Integer.MIN_VALUE) != 0) {
                i4 = 0;
                break;
            }
            if (f80776d.compareAndSet(this, i4, Integer.MIN_VALUE | i4)) {
                break;
            }
        }
        kotlin.ranges.l W1 = kotlin.ranges.s.W1(0, i4);
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int c5 = ((kotlin.collections.u0) it).c();
            do {
                andSet = this.f80779c.getAndSet(c5, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    @fg.l
    public final String e() {
        int i4 = f80776d.get(this);
        kotlin.ranges.l W1 = kotlin.ranges.s.W1(0, Integer.MAX_VALUE & i4);
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f80779c.get(((kotlin.collections.u0) it).c()));
        }
        return androidx.compose.runtime.changelist.j.a(arrayList.toString(), (i4 & Integer.MIN_VALUE) != 0 ? ProtectedSandApp.s("蟤\u0001") : "");
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蟥\u0001") + e() + ')';
    }
}
