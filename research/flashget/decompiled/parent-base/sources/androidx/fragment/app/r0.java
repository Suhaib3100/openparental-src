package androidx.fragment.app;

import androidx.view.InterfaceC1449v;
import androidx.view.h1;
import androidx.view.j1;
import androidx.view.k1;
import androidx.view.n1;
import androidx.view.o1;
import kotlin.Metadata;
import kotlin.jvm.internal.l1;

/* compiled from: FragmentViewModelLazy.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aQ\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function0;", "Landroidx/lifecycle/o1;", "ownerProducer", "Landroidx/lifecycle/k1$b;", "factoryProducer", "Lkotlin/b0;", "e", "(Landroidx/fragment/app/Fragment;Lld/a;Lld/a;)Lkotlin/b0;", "a", "(Landroidx/fragment/app/Fragment;Lld/a;)Lkotlin/b0;", "Lkotlin/reflect/d;", "viewModelClass", "Landroidx/lifecycle/n1;", "storeProducer", "c", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Lld/a;Lld/a;)Lkotlin/b0;", "fragment-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class r0 {

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/n1;", "<anonymous>", "()Landroidx/lifecycle/n1;"}, k = 3, mv = {1, 5, 1})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.a<n1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f30059b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f30059b = fragment;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n1 invoke() {
            n1 viewModelStore = this.f30059b.requireActivity().getViewModelStore();
            kotlin.jvm.internal.l0.o(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/k1$b;", "<anonymous>", "()Landroidx/lifecycle/k1$b;"}, k = 3, mv = {1, 5, 1})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.a<k1.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f30060b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f30060b = fragment;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k1.b invoke() {
            k1.b defaultViewModelProviderFactory = this.f30060b.requireActivity().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.l0.o(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/k1$b;", "<anonymous>", "()Landroidx/lifecycle/k1$b;"}, k = 3, mv = {1, 5, 1})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<k1.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f30061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Fragment fragment) {
            super(0);
            this.f30061b = fragment;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k1.b invoke() {
            k1.b defaultViewModelProviderFactory = this.f30061b.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.l0.o(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/fragment/app/Fragment;", "<anonymous>", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {1, 5, 1})
    public static final class d extends kotlin.jvm.internal.n0 implements ld.a<Fragment> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f30062b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f30062b = fragment;
        }

        @fg.l
        public final Fragment a() {
            return this.f30062b;
        }

        @Override // ld.a
        public Fragment invoke() {
            return this.f30062b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/n1;", "<anonymous>", "()Landroidx/lifecycle/n1;"}, k = 3, mv = {1, 5, 1})
    public static final class e extends kotlin.jvm.internal.n0 implements ld.a<n1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<o1> f30063b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(ld.a<? extends o1> aVar) {
            super(0);
            this.f30063b = aVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n1 invoke() {
            n1 viewModelStore = this.f30063b.invoke().getViewModelStore();
            kotlin.jvm.internal.l0.o(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/k1$b;", "<anonymous>", "()Landroidx/lifecycle/k1$b;"}, k = 3, mv = {1, 5, 1})
    public static final class f extends kotlin.jvm.internal.n0 implements ld.a<k1.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<o1> f30064b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f30065c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(ld.a<? extends o1> aVar, Fragment fragment) {
            super(0);
            this.f30064b = aVar;
            this.f30065c = fragment;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k1.b invoke() {
            o1 invoke = this.f30064b.invoke();
            InterfaceC1449v interfaceC1449v = invoke instanceof InterfaceC1449v ? (InterfaceC1449v) invoke : null;
            k1.b defaultViewModelProviderFactory = interfaceC1449v != null ? interfaceC1449v.getDefaultViewModelProviderFactory() : null;
            if (defaultViewModelProviderFactory == null) {
                defaultViewModelProviderFactory = this.f30065c.getDefaultViewModelProviderFactory();
            }
            kotlin.jvm.internal.l0.o(defaultViewModelProviderFactory, "(ownerProducer() as? Has…tViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    @androidx.annotation.l0
    public static final <VM extends h1> kotlin.b0<VM> a(Fragment fragment, ld.a<? extends k1.b> aVar) {
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.P();
        kotlin.reflect.d d5 = l1.d(h1.class);
        a aVar2 = new a(fragment);
        if (aVar == null) {
            aVar = new b(fragment);
        }
        return c(fragment, d5, aVar2, aVar);
    }

    public static kotlin.b0 b(Fragment fragment, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.P();
        kotlin.reflect.d d5 = l1.d(h1.class);
        a aVar2 = new a(fragment);
        if (aVar == null) {
            aVar = new b(fragment);
        }
        return c(fragment, d5, aVar2, aVar);
    }

    @fg.l
    @androidx.annotation.l0
    public static final <VM extends h1> kotlin.b0<VM> c(@fg.l Fragment fragment, @fg.l kotlin.reflect.d<VM> viewModelClass, @fg.l ld.a<? extends n1> storeProducer, @fg.m ld.a<? extends k1.b> aVar) {
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.p(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.l0.p(storeProducer, "storeProducer");
        if (aVar == null) {
            aVar = new c(fragment);
        }
        return new j1(viewModelClass, storeProducer, aVar);
    }

    public static /* synthetic */ kotlin.b0 d(Fragment fragment, kotlin.reflect.d dVar, ld.a aVar, ld.a aVar2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            aVar2 = null;
        }
        return c(fragment, dVar, aVar, aVar2);
    }

    @androidx.annotation.l0
    public static final <VM extends h1> kotlin.b0<VM> e(Fragment fragment, ld.a<? extends o1> ownerProducer, ld.a<? extends k1.b> aVar) {
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.p(ownerProducer, "ownerProducer");
        kotlin.jvm.internal.l0.P();
        kotlin.reflect.d d5 = l1.d(h1.class);
        e eVar = new e(ownerProducer);
        if (aVar == null) {
            aVar = new f(ownerProducer, fragment);
        }
        return c(fragment, d5, eVar, aVar);
    }

    public static kotlin.b0 f(Fragment fragment, ld.a ownerProducer, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            ownerProducer = new d(fragment);
        }
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.p(ownerProducer, "ownerProducer");
        kotlin.jvm.internal.l0.P();
        kotlin.reflect.d d5 = l1.d(h1.class);
        e eVar = new e(ownerProducer);
        if (aVar == null) {
            aVar = new f(ownerProducer, fragment);
        }
        return c(fragment, d5, eVar, aVar);
    }
}
