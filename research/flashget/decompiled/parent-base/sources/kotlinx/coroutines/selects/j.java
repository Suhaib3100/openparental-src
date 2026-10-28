package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B¨\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012U\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0005\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\r\u0012U\u0010\u0011\u001aQ\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006j\u0002`\u0010\u0012i\b\u0002\u0010\u0016\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013\u0018\u00010\u0006j\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cRi\u0010\u000e\u001aQ\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0005\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006j\u0002`\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fRi\u0010\u0011\u001aQ\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0005\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006j\u0002`\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b \u0010\u001fR{\u0010\u0016\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\t¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0012\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\f0\u0013\u0018\u00010\u0006j\u0004\u0018\u0001`\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006!"}, d2 = {"Lkotlinx/coroutines/selects/j;", "P", "Q", "Lkotlinx/coroutines/selects/i;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/selects/m;", "select", "param", "Lkotlin/k2;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lld/q;Lld/q;Lld/q;)V", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Lld/q;", "()Lld/q;", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class j<P, Q> implements i<P, Q> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object clauseObject;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<Object, m<?>, Object, k2> regFunc;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<Object, Object, Object, Object> processResFunc;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.q<m<?>, Object, Object, ld.l<Throwable, k2>> onCancellationConstructor;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@fg.l Object obj, @fg.l ld.q<Object, ? super m<?>, Object, k2> qVar, @fg.l ld.q<Object, Object, Object, ? extends Object> qVar2, @fg.m ld.q<? super m<?>, Object, Object, ? extends ld.l<? super Throwable, k2>> qVar3) {
        this.clauseObject = obj;
        this.regFunc = qVar;
        this.processResFunc = qVar2;
        this.onCancellationConstructor = qVar3;
    }

    @Override // kotlinx.coroutines.selects.k
    @fg.l
    public ld.q<Object, m<?>, Object, k2> a() {
        return this.regFunc;
    }

    @Override // kotlinx.coroutines.selects.k
    @fg.m
    public ld.q<m<?>, Object, Object, ld.l<Throwable, k2>> b() {
        return this.onCancellationConstructor;
    }

    @Override // kotlinx.coroutines.selects.k
    @fg.l
    public ld.q<Object, Object, Object, Object> c() {
        return this.processResFunc;
    }

    @Override // kotlinx.coroutines.selects.k
    @fg.l
    /* renamed from: d, reason: from getter */
    public Object getClauseObject() {
        return this.clauseObject;
    }

    public /* synthetic */ j(Object obj, ld.q qVar, ld.q qVar2, ld.q qVar3, int i4, w wVar) {
        this(obj, qVar, qVar2, (i4 & 8) != 0 ? null : qVar3);
    }
}
