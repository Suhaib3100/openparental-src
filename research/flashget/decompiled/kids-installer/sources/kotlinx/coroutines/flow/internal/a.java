package kotlinx.coroutines.flow.internal;

import a0.c;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlinx.coroutines.flow.internal.c;
import kotlinx.coroutines.flow.t0;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b)\u0010\u001aJ\u000f\u0010\u0005\u001a\u00028\u0000H$¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t2\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0011H\u0084\bR>\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t2\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t8\u0004@BX\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0016\u0010 \u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070%8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/internal/c;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "i", "()Lkotlinx/coroutines/flow/internal/c;", "", "size", "", "l", "(I)[Lkotlinx/coroutines/flow/internal/c;", "h", "slot", "Lkotlin/m2;", "n", "(Lkotlinx/coroutines/flow/internal/c;)V", "Lkotlin/Function1;", "block", "m", "<set-?>", "o", "[Lkotlinx/coroutines/flow/internal/c;", "p", "()[Lkotlinx/coroutines/flow/internal/c;", "getSlots$annotations", "()V", "slots", "I", "()I", "nCollectors", "q", "nextIndex", "Lkotlinx/coroutines/flow/internal/y;", "r", "Lkotlinx/coroutines/flow/internal/y;", "_subscriptionCount", "Lkotlinx/coroutines/flow/t0;", "t", "()Lkotlinx/coroutines/flow/t0;", "subscriptionCount", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public abstract class a<S extends c<?>> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private S[] slots;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int nCollectors;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int nextIndex;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private y _subscriptionCount;

    protected static /* synthetic */ void q() {
    }

    @d5.d
    protected final S h() {
        S s5;
        y yVar;
        synchronized (this) {
            S[] sArr = this.slots;
            if (sArr == null) {
                sArr = l(2);
                this.slots = sArr;
            } else if (this.nCollectors >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                l0.o(copyOf, ProtectedSandApp.s("嵒"));
                this.slots = (S[]) ((c[]) copyOf);
                sArr = (S[]) ((c[]) copyOf);
            }
            int i5 = this.nextIndex;
            do {
                s5 = sArr[i5];
                if (s5 == null) {
                    s5 = i();
                    sArr[i5] = s5;
                }
                i5++;
                if (i5 >= sArr.length) {
                    i5 = 0;
                }
            } while (!s5.a(this));
            this.nextIndex = i5;
            this.nCollectors++;
            yVar = this._subscriptionCount;
        }
        if (yVar != null) {
            yVar.h0(1);
        }
        return s5;
    }

    @d5.d
    protected abstract S i();

    @d5.d
    protected abstract S[] l(int size);

    protected final void m(@d5.d q3.l<? super S, m2> lVar) {
        S[] sArr;
        if (this.nCollectors == 0 || (sArr = this.slots) == null) {
            return;
        }
        for (c.C0000c c0000c : sArr) {
            if (c0000c != null) {
                lVar.N(c0000c);
            }
        }
    }

    protected final void n(@d5.d S slot) {
        y yVar;
        int i5;
        Continuation<m2>[] b6;
        synchronized (this) {
            int i6 = this.nCollectors - 1;
            this.nCollectors = i6;
            yVar = this._subscriptionCount;
            if (i6 == 0) {
                this.nextIndex = 0;
            }
            b6 = slot.b(this);
        }
        for (Continuation<m2> continuation : b6) {
            if (continuation != null) {
                Result.a aVar = Result.f27242p;
                continuation.s(m2.f23662a);
            }
        }
        if (yVar != null) {
            yVar.h0(-1);
        }
    }

    /* renamed from: o, reason: from getter */
    protected final int getNCollectors() {
        return this.nCollectors;
    }

    @d5.e
    protected final S[] p() {
        return this.slots;
    }

    @d5.d
    public final t0<Integer> t() {
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
}
