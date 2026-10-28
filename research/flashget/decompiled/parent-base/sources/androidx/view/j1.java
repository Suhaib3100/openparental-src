package androidx.view;

import androidx.view.h1;
import androidx.view.k1;
import fg.l;
import fg.m;
import kd.b;
import kd.j;
import kotlin.AbstractC1477a;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.reflect.d;

/* compiled from: ViewModelLazy.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/j1;", "Landroidx/lifecycle/h1;", "VM", "Lkotlin/b0;", "Lkotlin/reflect/d;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/n1;", "storeProducer", "Landroidx/lifecycle/k1$b;", "factoryProducer", "Lm2/a;", "extrasProducer", "<init>", "(Lkotlin/reflect/d;Lld/a;Lld/a;Lld/a;)V", "", "p", "()Z", "b", "Lkotlin/reflect/d;", "c", "Lld/a;", "d", "e", "f", "Landroidx/lifecycle/h1;", "cached", "a", "()Landroidx/lifecycle/h1;", "value", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j1<VM extends h1> implements b0<VM> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final d<VM> viewModelClass;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.a<n1> storeProducer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.a<k1.b> factoryProducer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.a<AbstractC1477a> extrasProducer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @m
    private VM cached;

    /* compiled from: ViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Lm2/a$a;", "a", "()Lm2/a$a;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<AbstractC1477a.C1272a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f30359b = new a(0);

        a() {
            super(0);
        }

        @l
        public final AbstractC1477a.C1272a a() {
            return AbstractC1477a.C1272a.f81491b;
        }

        @Override // ld.a
        public AbstractC1477a.C1272a invoke() {
            return AbstractC1477a.C1272a.f81491b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public j1(@l d<VM> viewModelClass, @l ld.a<? extends n1> storeProducer, @l ld.a<? extends k1.b> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        l0.p(viewModelClass, "viewModelClass");
        l0.p(storeProducer, "storeProducer");
        l0.p(factoryProducer, "factoryProducer");
    }

    @Override // kotlin.b0
    @l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new k1(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).a(b.e(this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }

    @Override // kotlin.b0
    public boolean p() {
        return this.cached != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public j1(@l d<VM> viewModelClass, @l ld.a<? extends n1> storeProducer, @l ld.a<? extends k1.b> factoryProducer, @l ld.a<? extends AbstractC1477a> extrasProducer) {
        l0.p(viewModelClass, "viewModelClass");
        l0.p(storeProducer, "storeProducer");
        l0.p(factoryProducer, "factoryProducer");
        l0.p(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    public /* synthetic */ j1(d dVar, ld.a aVar, ld.a aVar2, ld.a aVar3, int i4, w wVar) {
        this(dVar, aVar, aVar2, (i4 & 8) != 0 ? a.f30359b : aVar3);
    }
}
