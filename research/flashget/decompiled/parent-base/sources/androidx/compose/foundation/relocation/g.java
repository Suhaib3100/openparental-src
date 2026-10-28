package androidx.compose.foundation.relocation;

import androidx.compose.foundation.z0;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.unit.v;
import fg.l;
import fg.m;
import i0.o;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: BringIntoViewRequester.kt */
@z0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/relocation/g;", "Landroidx/compose/foundation/relocation/a;", "Landroidx/compose/foundation/relocation/d;", "requester", "<init>", "(Landroidx/compose/foundation/relocation/d;)V", "Lkotlin/k2;", "C7", "()V", "i7", "D7", "j7", "Li0/i;", "rect", "B7", "(Li0/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "s", "Landroidx/compose/foundation/relocation/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,197:1\n728#2,2:198\n735#2,2:200\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n*L\n168#1:198,2\n175#1:200,2\n*E\n"})
/* loaded from: classes.dex */
public final class g extends androidx.compose.foundation.relocation.a {

    /* renamed from: t, reason: collision with root package name */
    public static final int f6971t = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @l
    private d requester;

    /* compiled from: BringIntoViewRequester.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/i;", "a", "()Li0/i;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<i0.i> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i0.i f6973b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f6974c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0.i iVar, g gVar) {
            super(0);
            this.f6973b = iVar;
            this.f6974c = gVar;
        }

        @Override // ld.a
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i0.i invoke() {
            i0.i iVar = this.f6973b;
            if (iVar != null) {
                return iVar;
            }
            androidx.compose.ui.layout.u y7 = this.f6974c.y7();
            if (y7 != null) {
                return o.m(v.f(y7.c()));
            }
            return null;
        }
    }

    public g(@l d dVar) {
        this.requester = dVar;
    }

    private final void C7() {
        d dVar = this.requester;
        if (dVar instanceof e) {
            l0.n(dVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((e) dVar).c().j0(this);
        }
    }

    @m
    public final Object B7(@m i0.i iVar, @l kotlin.coroutines.d<? super k2> dVar) {
        c A7 = A7();
        androidx.compose.ui.layout.u y7 = y7();
        if (y7 == null) {
            return k2.f75408a;
        }
        Object m22 = A7.m2(y7, new a(iVar, this), dVar);
        return m22 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? m22 : k2.f75408a;
    }

    public final void D7(@l d requester) {
        C7();
        if (requester instanceof e) {
            ((e) requester).c().b(this);
        }
        this.requester = requester;
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        D7(this.requester);
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        C7();
    }
}
