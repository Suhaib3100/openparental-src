package kotlinx.coroutines.flow.internal;

import a0.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.flow.internal.c;
import kotlinx.coroutines.flow.t0;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0013H\u0084\b¢\u0006\u0004\b\u0015\u0010\u0016R8\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0(8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010)¨\u0006+"}, d2 = {"Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/internal/c;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "k", "()Lkotlinx/coroutines/flow/internal/c;", "", "size", "", "l", "(I)[Lkotlinx/coroutines/flow/internal/c;", "i", "slot", "Lkotlin/k2;", "n", "(Lkotlinx/coroutines/flow/internal/c;)V", "Lkotlin/Function1;", "block", "m", "(Lld/l;)V", "<set-?>", "b", "[Lkotlinx/coroutines/flow/internal/c;", "p", "()[Lkotlinx/coroutines/flow/internal/c;", "slots", "c", "I", "o", "()I", "nCollectors", "d", "nextIndex", "Lkotlinx/coroutines/flow/internal/y;", "e", "Lkotlinx/coroutines/flow/internal/y;", "_subscriptionCount", "Lkotlinx/coroutines/flow/t0;", "()Lkotlinx/coroutines/flow/t0;", "subscriptionCount", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,132:1\n28#2,4:133\n28#2,4:138\n28#2,4:144\n20#3:137\n20#3:142\n20#3:148\n1#4:143\n13579#5,2:149\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n30#1:133,4\n45#1:138,4\n76#1:144,4\n30#1:137\n45#1:142\n76#1:148\n95#1:149,2\n*E\n"})
/* loaded from: classes7.dex */
public abstract class a<S extends c<?>> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private S[] slots;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nCollectors;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int nextIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private y _subscriptionCount;

    @fg.l
    public final t0<Integer> c() {
        y yVar;
        synchronized (this) {
            yVar = this._subscriptionCount;
            if (yVar == null) {
                yVar = new y(this.nCollectors);
                this._subscriptionCount = yVar;
            }
        }
        return yVar;
    }

    @fg.l
    protected final S i() {
        S s4;
        y yVar;
        synchronized (this) {
            try {
                S[] sArr = this.slots;
                if (sArr == null) {
                    sArr = l(2);
                    this.slots = sArr;
                } else if (this.nCollectors >= sArr.length) {
                    Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    l0.o(copyOf, ProtectedSandApp.s("蜏\u0001"));
                    this.slots = (S[]) ((c[]) copyOf);
                    sArr = (S[]) ((c[]) copyOf);
                }
                int i4 = this.nextIndex;
                do {
                    s4 = sArr[i4];
                    if (s4 == null) {
                        s4 = k();
                        sArr[i4] = s4;
                    }
                    i4++;
                    if (i4 >= sArr.length) {
                        i4 = 0;
                    }
                    l0.n(s4, ProtectedSandApp.s("蜐\u0001"));
                } while (!s4.a(this));
                this.nextIndex = i4;
                this.nCollectors++;
                yVar = this._subscriptionCount;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yVar != null) {
            yVar.f0(1);
        }
        return s4;
    }

    @fg.l
    protected abstract S k();

    @fg.l
    protected abstract S[] l(int size);

    protected final void m(@fg.l ld.l<? super S, k2> block) {
        S[] sArr;
        if (this.nCollectors == 0 || (sArr = this.slots) == null) {
            return;
        }
        for (b0 b0Var : sArr) {
            if (b0Var != null) {
                block.invoke(b0Var);
            }
        }
    }

    protected final void n(@fg.l S slot) {
        y yVar;
        int i4;
        kotlin.coroutines.d<k2>[] b5;
        synchronized (this) {
            try {
                int i5 = this.nCollectors - 1;
                this.nCollectors = i5;
                yVar = this._subscriptionCount;
                if (i5 == 0) {
                    this.nextIndex = 0;
                }
                l0.n(slot, ProtectedSandApp.s("蜐\u0001"));
                b5 = slot.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.d<k2> dVar : b5) {
            if (dVar != null) {
                z0.Companion companion = z0.INSTANCE;
                dVar.resumeWith(k2.f75408a);
            }
        }
        if (yVar != null) {
            yVar.f0(-1);
        }
    }

    /* renamed from: o, reason: from getter */
    protected final int getNCollectors() {
        return this.nCollectors;
    }

    @fg.m
    protected final S[] p() {
        return this.slots;
    }
}
