package android.view;

import android.view.c1;
import android.view.f1;
import d5.d;
import d5.e;
import kotlin.AbstractC0540a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.KClass;
import p3.b;
import p3.j;

/* compiled from: ViewModelLazy.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\n¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/e1;", "Landroidx/lifecycle/c1;", "VM", "Lkotlin/b0;", "", "l", "Lkotlin/reflect/d;", "o", "Lkotlin/reflect/d;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/h1;", "p", "Lq3/a;", "storeProducer", "Landroidx/lifecycle/f1$b;", "q", "factoryProducer", "Ll0/a;", "r", "extrasProducer", "s", "Landroidx/lifecycle/c1;", "cached", "a", "()Landroidx/lifecycle/c1;", "value", "<init>", "(Lkotlin/reflect/d;Lq3/a;Lq3/a;Lq3/a;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e1<VM extends c1> implements Lazy<VM> {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d
    private final KClass<VM> viewModelClass;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d
    private final q3.a<h1> storeProducer;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d
    private final q3.a<f1.b> factoryProducer;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @d
    private final q3.a<AbstractC0540a> extrasProducer;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @e
    private VM cached;

    /* compiled from: ViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Ll0/a$a;", "a", "()Ll0/a$a;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements q3.a<AbstractC0540a.C0459a> {

        /* renamed from: p, reason: collision with root package name */
        public static final a f8532p = new a();

        a() {
            super(0);
        }

        @d
        public final AbstractC0540a.C0459a a() {
            return AbstractC0540a.C0459a.f29101b;
        }

        @Override // q3.a
        public AbstractC0540a.C0459a n() {
            return AbstractC0540a.C0459a.f29101b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public e1(@d KClass<VM> viewModelClass, @d q3.a<? extends h1> storeProducer, @d q3.a<? extends f1.b> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        l0.p(viewModelClass, "viewModelClass");
        l0.p(storeProducer, "storeProducer");
        l0.p(factoryProducer, "factoryProducer");
    }

    @Override // kotlin.Lazy
    @d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new f1(this.storeProducer.n(), this.factoryProducer.n(), this.extrasProducer.n()).a(b.e(this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }

    @Override // kotlin.Lazy
    public boolean l() {
        return this.cached != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public e1(@d KClass<VM> viewModelClass, @d q3.a<? extends h1> storeProducer, @d q3.a<? extends f1.b> factoryProducer, @d q3.a<? extends AbstractC0540a> extrasProducer) {
        l0.p(viewModelClass, "viewModelClass");
        l0.p(storeProducer, "storeProducer");
        l0.p(factoryProducer, "factoryProducer");
        l0.p(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    public /* synthetic */ e1(KClass kClass, q3.a aVar, q3.a aVar2, q3.a aVar3, int i5, w wVar) {
        this(kClass, aVar, aVar2, (i5 & 8) != 0 ? a.f8532p : aVar3);
    }
}
