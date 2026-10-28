package androidx.content;

import androidx.annotation.d0;
import androidx.annotation.l0;
import androidx.content.fragment.g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r0;
import androidx.view.h1;
import androidx.view.k1;
import androidx.view.n1;
import fg.l;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;

/* compiled from: NavGraphViewModelLazy.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0010\u001a\u00020\u000f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/fragment/app/Fragment;", "", "navGraphId", "Lkotlin/Function0;", "Landroidx/lifecycle/k1$b;", "factoryProducer", "Lkotlin/b0;", "c", "(Landroidx/fragment/app/Fragment;ILld/a;)Lkotlin/b0;", "", "navGraphRoute", "d", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lld/a;)Lkotlin/b0;", "Landroidx/navigation/s;", "backStackEntry", "navigation-fragment_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o0 {

    /* compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/k1$b;", "a", "()Landroidx/lifecycle/k1$b;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends n0 implements ld.a<k1.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<k1.b> f31180b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0<s> f31181c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ld.a<? extends k1.b> aVar, b0<s> b0Var) {
            super(0);
            this.f31180b = aVar;
            this.f31181c = b0Var;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k1.b invoke() {
            ld.a<k1.b> aVar = this.f31180b;
            k1.b invoke = aVar == null ? null : aVar.invoke();
            return invoke == null ? this.f31181c.getValue().getDefaultViewModelProviderFactory() : invoke;
        }
    }

    /* compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/k1$b;", "a", "()Landroidx/lifecycle/k1$b;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends n0 implements ld.a<k1.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<k1.b> f31182b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0<s> f31183c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ld.a<? extends k1.b> aVar, b0<s> b0Var) {
            super(0);
            this.f31182b = aVar;
            this.f31183c = b0Var;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k1.b invoke() {
            ld.a<k1.b> aVar = this.f31182b;
            k1.b invoke = aVar == null ? null : aVar.invoke();
            return invoke == null ? this.f31183c.getValue().getDefaultViewModelProviderFactory() : invoke;
        }
    }

    /* compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/navigation/s;", "a", "()Landroidx/navigation/s;"}, k = 3, mv = {1, 6, 0})
    public static final class c extends n0 implements ld.a<s> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f31184b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f31185c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, int i4) {
            super(0);
            this.f31184b = fragment;
            this.f31185c = i4;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            return g.a(this.f31184b).D(this.f31185c);
        }
    }

    /* compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/navigation/s;", "a", "()Landroidx/navigation/s;"}, k = 3, mv = {1, 6, 0})
    public static final class d extends n0 implements ld.a<s> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f31186b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f31187c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment, String str) {
            super(0);
            this.f31186b = fragment;
            this.f31187c = str;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke() {
            return g.a(this.f31186b).E(this.f31187c);
        }
    }

    /* compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/n1;", "a", "()Landroidx/lifecycle/n1;"}, k = 3, mv = {1, 6, 0})
    public static final class e extends n0 implements ld.a<n1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0<s> f31188b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b0<s> b0Var) {
            super(0);
            this.f31188b = b0Var;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n1 invoke() {
            return this.f31188b.getValue().getViewModelStore();
        }
    }

    /* compiled from: NavGraphViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/h1;", "VM", "Landroidx/lifecycle/n1;", "a", "()Landroidx/lifecycle/n1;"}, k = 3, mv = {1, 6, 0})
    public static final class f extends n0 implements ld.a<n1> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0<s> f31189b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b0<s> b0Var) {
            super(0);
            this.f31189b = b0Var;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n1 invoke() {
            return this.f31189b.getValue().getViewModelStore();
        }
    }

    public static final s a(b0 b0Var) {
        return (s) b0Var.getValue();
    }

    public static final s b(b0 b0Var) {
        return (s) b0Var.getValue();
    }

    @l0
    public static final <VM extends h1> b0<VM> c(Fragment fragment, @d0 int i4, ld.a<? extends k1.b> aVar) {
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        b0 c5 = c0.c(new c(fragment, i4));
        e eVar = new e(c5);
        kotlin.jvm.internal.l0.P();
        return r0.c(fragment, l1.d(h1.class), eVar, new a(aVar, c5));
    }

    @l0
    public static final <VM extends h1> b0<VM> d(Fragment fragment, String navGraphRoute, ld.a<? extends k1.b> aVar) {
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.p(navGraphRoute, "navGraphRoute");
        b0 c5 = c0.c(new d(fragment, navGraphRoute));
        f fVar = new f(c5);
        kotlin.jvm.internal.l0.P();
        return r0.c(fragment, l1.d(h1.class), fVar, new b(aVar, c5));
    }

    public static b0 e(Fragment fragment, int i4, ld.a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        b0 c5 = c0.c(new c(fragment, i4));
        e eVar = new e(c5);
        kotlin.jvm.internal.l0.P();
        return r0.c(fragment, l1.d(h1.class), eVar, new a(aVar, c5));
    }

    public static b0 f(Fragment fragment, String navGraphRoute, ld.a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            aVar = null;
        }
        kotlin.jvm.internal.l0.p(fragment, "<this>");
        kotlin.jvm.internal.l0.p(navGraphRoute, "navGraphRoute");
        b0 c5 = c0.c(new d(fragment, navGraphRoute));
        f fVar = new f(c5);
        kotlin.jvm.internal.l0.P();
        return r0.c(fragment, l1.d(h1.class), fVar, new b(aVar, c5));
    }

    private static final s g(b0<s> b0Var) {
        return b0Var.getValue();
    }

    private static final s h(b0<s> b0Var) {
        return b0Var.getValue();
    }
}
