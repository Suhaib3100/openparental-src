package kotlinx.coroutines.sync;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.m2;
import kotlinx.coroutines.o;

/* compiled from: Semaphore.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/sync/a;", "Lkotlinx/coroutines/o;", "", "cause", "Lkotlin/m2;", "a", "", "toString", "Lkotlinx/coroutines/sync/i;", "o", "Lkotlinx/coroutines/sync/i;", "segment", "", "p", "I", "index", "<init>", "(Lkotlinx/coroutines/sync/i;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class a extends o {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final i segment;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final int index;

    public a(@d5.d i iVar, int i5) {
        this.segment = iVar;
        this.index = i5;
    }

    @Override // q3.l
    public /* bridge */ /* synthetic */ m2 N(Throwable th) {
        a(th);
        return m2.f23662a;
    }

    @Override // kotlinx.coroutines.p
    public void a(@d5.e Throwable th) {
        this.segment.s(this.index);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("醀") + this.segment + ProtectedSandApp.s("醁") + this.index + ']';
    }
}
