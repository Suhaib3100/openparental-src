package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.w0;
import kotlinx.coroutines.selects.l;

/* compiled from: SelectUnbiased.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000f\u001a\u00020\u0007*\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00010\u00122\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0013H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J[\u0010\u0019\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u0016\"\u0004\b\u0002\u0010\u0011*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u00012\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0013H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00028\u0000H\u0091@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u0012\u0012\u000e\u0012\f0\u001eR\b\u0012\u0004\u0012\u00028\u00000\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lkotlinx/coroutines/selects/t;", "R", "Lkotlinx/coroutines/selects/l;", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlin/coroutines/g;)V", "Lkotlin/k2;", "t0", "()V", "Lkotlinx/coroutines/selects/e;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "b", "(Lkotlinx/coroutines/selects/e;Lld/l;)V", "Q", "Lkotlinx/coroutines/selects/g;", "Lkotlin/Function2;", "c", "(Lkotlinx/coroutines/selects/g;Lld/p;)V", "P", "Lkotlinx/coroutines/selects/i;", "param", "m", "(Lkotlinx/coroutines/selects/i;Ljava/lang/Object;Lld/p;)V", "W", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "Lkotlinx/coroutines/selects/l$a;", "h", "Ljava/util/List;", "clausesToRegister", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@w0
@r1({"SMAP\nSelectUnbiased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1855#2,2:69\n*S KotlinDebug\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n*L\n63#1:69,2\n*E\n"})
/* loaded from: classes7.dex */
public class t<R> extends l<R> {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<l<R>.a> clausesToRegister;

    public t(@fg.l kotlin.coroutines.g gVar) {
        super(gVar);
        this.clausesToRegister = new ArrayList();
    }

    @w0
    static <R> Object s0(t<R> tVar, kotlin.coroutines.d<? super R> dVar) {
        tVar.t0();
        return l.Z(tVar, dVar);
    }

    private final void t0() {
        try {
            Collections.shuffle(this.clausesToRegister);
            Iterator<T> it = this.clausesToRegister.iterator();
            while (it.hasNext()) {
                l.m0(this, (l.a) it.next(), false, 1, null);
            }
        } finally {
            this.clausesToRegister.clear();
        }
    }

    @Override // kotlinx.coroutines.selects.l
    @fg.m
    @w0
    public Object W(@fg.l kotlin.coroutines.d<? super R> dVar) {
        return s0(this, dVar);
    }

    @Override // kotlinx.coroutines.selects.l, kotlinx.coroutines.selects.c
    public void b(@fg.l e eVar, @fg.l ld.l<? super kotlin.coroutines.d<? super R>, ? extends Object> lVar) {
        this.clausesToRegister.add(new l.a(eVar.getClauseObject(), eVar.a(), eVar.c(), o.l(), lVar, eVar.b()));
    }

    @Override // kotlinx.coroutines.selects.l, kotlinx.coroutines.selects.c
    public <Q> void c(@fg.l g<? extends Q> gVar, @fg.l ld.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        this.clausesToRegister.add(new l.a(gVar.getClauseObject(), gVar.a(), gVar.c(), null, pVar, gVar.b()));
    }

    @Override // kotlinx.coroutines.selects.l, kotlinx.coroutines.selects.c
    public <P, Q> void m(@fg.l i<? super P, ? extends Q> iVar, P p4, @fg.l ld.p<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        this.clausesToRegister.add(new l.a(iVar.getClauseObject(), iVar.a(), iVar.c(), p4, pVar, iVar.b()));
    }
}
