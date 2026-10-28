package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012U\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b\u0012i\b\u0002\u0010\u0011\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e\u0018\u00010\u0004j\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017Ri\u0010\f\u001aQ\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR{\u0010\u0011\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0007¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u000e\u0018\u00010\u0004j\u0004\u0018\u0001`\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aRi\u0010\u001e\u001aQ\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004j\u0002`\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/selects/f;", "Lkotlinx/coroutines/selects/e;", "", "clauseObject", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "Lkotlinx/coroutines/selects/m;", "select", "param", "Lkotlin/k2;", "Lkotlinx/coroutines/selects/RegistrationFunction;", "regFunc", "internalResult", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "onCancellationConstructor", "<init>", "(Ljava/lang/Object;Lld/q;Lld/q;)V", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Lld/q;", "()Lld/q;", "c", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "processResFunc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object clauseObject;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<Object, m<?>, Object, k2> regFunc;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.q<m<?>, Object, Object, ld.l<Throwable, k2>> onCancellationConstructor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<Object, Object, Object, Object> processResFunc;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@fg.l Object obj, @fg.l ld.q<Object, ? super m<?>, Object, k2> qVar, @fg.m ld.q<? super m<?>, Object, Object, ? extends ld.l<? super Throwable, k2>> qVar2) {
        ld.q<Object, Object, Object, Object> qVar3;
        this.clauseObject = obj;
        this.regFunc = qVar;
        this.onCancellationConstructor = qVar2;
        qVar3 = o.f81070a;
        this.processResFunc = qVar3;
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

    public /* synthetic */ f(Object obj, ld.q qVar, ld.q qVar2, int i4, w wVar) {
        this(obj, qVar, (i4 & 4) != 0 ? null : qVar2);
    }
}
