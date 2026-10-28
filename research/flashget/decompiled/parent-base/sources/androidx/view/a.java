package androidx.view;

import androidx.annotation.l0;
import androidx.view.h1;
import androidx.view.j1;
import androidx.view.k1;
import androidx.view.n1;
import fg.l;
import kotlin.AbstractC1477a;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;

/* compiled from: ActivityViewModelLazy.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001aJ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/activity/ComponentActivity;", "Lkotlin/Function0;", "Landroidx/lifecycle/k1$b;", "factoryProducer", "Lkotlin/b0;", "a", "(Landroidx/activity/ComponentActivity;Lld/a;)Lkotlin/b0;", "Lm2/a;", "extrasProducer", "b", "(Landroidx/activity/ComponentActivity;Lld/a;Lld/a;)Lkotlin/b0;", "activity-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/n1;", "a", "()Landroidx/lifecycle/n1;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$1\n*L\n1#1,90:1\n*E\n"})
    /* renamed from: androidx.activity.a$a, reason: collision with other inner class name */
    public static final class C0003a extends n0 implements ld.a<n1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f423b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0003a(ComponentActivity componentActivity) {
            super(0);
            this.f423b = componentActivity;
        }

        @l
        public final n1 a() {
            return this.f423b.getViewModelStore();
        }

        @Override // ld.a
        public n1 invoke() {
            return this.f423b.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Lm2/a;", "a", "()Lm2/a;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$2\n*L\n1#1,90:1\n*E\n"})
    public static final class b extends n0 implements ld.a<AbstractC1477a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f424b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f424b = componentActivity;
        }

        @l
        public final AbstractC1477a a() {
            return this.f424b.getDefaultViewModelCreationExtras();
        }

        @Override // ld.a
        public AbstractC1477a invoke() {
            return this.f424b.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/n1;", "a", "()Landroidx/lifecycle/n1;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$3\n*L\n1#1,90:1\n*E\n"})
    public static final class c extends n0 implements ld.a<n1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f425b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f425b = componentActivity;
        }

        @l
        public final n1 a() {
            return this.f425b.getViewModelStore();
        }

        @Override // ld.a
        public n1 invoke() {
            return this.f425b.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Lm2/a;", "a", "()Lm2/a;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
    public static final class d extends n0 implements ld.a<AbstractC1477a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<AbstractC1477a> f426b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f427c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(ld.a<? extends AbstractC1477a> aVar, ComponentActivity componentActivity) {
            super(0);
            this.f426b = aVar;
            this.f427c = componentActivity;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1477a invoke() {
            AbstractC1477a invoke;
            ld.a<AbstractC1477a> aVar = this.f426b;
            return (aVar == null || (invoke = aVar.invoke()) == null) ? this.f427c.getDefaultViewModelCreationExtras() : invoke;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/k1$b;", "a", "()Landroidx/lifecycle/k1$b;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$1\n*L\n1#1,90:1\n*E\n"})
    public static final class e extends n0 implements ld.a<k1.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f428b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f428b = componentActivity;
        }

        @l
        public final k1.b a() {
            return this.f428b.getDefaultViewModelProviderFactory();
        }

        @Override // ld.a
        public k1.b invoke() {
            return this.f428b.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/k1$b;", "a", "()Landroidx/lifecycle/k1$b;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$factoryPromise$2\n*L\n1#1,90:1\n*E\n"})
    public static final class f extends n0 implements ld.a<k1.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f429b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f429b = componentActivity;
        }

        @l
        public final k1.b a() {
            return this.f429b.getDefaultViewModelProviderFactory();
        }

        @Override // ld.a
        public k1.b invoke() {
            return this.f429b.getDefaultViewModelProviderFactory();
        }
    }

    @k(level = m.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    @l0
    public static final <VM extends h1> b0<VM> a(ComponentActivity componentActivity, ld.a<? extends k1.b> aVar) {
        if (aVar == null) {
            aVar = new e(componentActivity);
        }
        kotlin.jvm.internal.l0.P();
        return new j1(l1.d(h1.class), new C0003a(componentActivity), aVar, new b(componentActivity));
    }

    @l0
    public static final <VM extends h1> b0<VM> b(ComponentActivity componentActivity, ld.a<? extends AbstractC1477a> aVar, ld.a<? extends k1.b> aVar2) {
        if (aVar2 == null) {
            aVar2 = new f(componentActivity);
        }
        kotlin.jvm.internal.l0.P();
        return new j1(l1.d(h1.class), new c(componentActivity), aVar2, new d(aVar, componentActivity));
    }

    public static b0 c(ComponentActivity componentActivity, ld.a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new e(componentActivity);
        }
        kotlin.jvm.internal.l0.P();
        return new j1(l1.d(h1.class), new C0003a(componentActivity), aVar, new b(componentActivity));
    }

    public static b0 d(ComponentActivity componentActivity, ld.a aVar, ld.a aVar2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        if ((i4 & 2) != 0) {
            aVar2 = null;
        }
        if (aVar2 == null) {
            aVar2 = new f(componentActivity);
        }
        kotlin.jvm.internal.l0.P();
        return new j1(l1.d(h1.class), new c(componentActivity), aVar2, new d(aVar, componentActivity));
    }
}
