package androidx.compose.material3;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.t;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import kotlin.Metadata;

/* compiled from: TouchExplorationStateProvider.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a9\u0010\u000b\u001a\u00020\u0007*\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/b5;", "", "c", "(Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "Landroidx/lifecycle/w;", "Lkotlin/Function1;", "Landroidx/lifecycle/w$a;", "Lkotlin/k2;", "handleEvent", "Lkotlin/Function0;", "onDispose", "a", "(Landroidx/lifecycle/w;Lld/l;Lld/a;Landroidx/compose/runtime/t;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n74#2:109\n74#2:122\n1116#3,6:110\n1116#3,6:116\n1116#3,6:123\n1116#3,6:129\n1116#3,6:135\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt\n*L\n41#1:109\n48#1:122\n42#1:110,6\n46#1:116,6\n49#1:123,6\n54#1:129,6\n67#1:135,6\n*E\n"})
/* loaded from: classes.dex */
public final class qb {

    /* compiled from: TouchExplorationStateProvider.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<AbstractC1450w.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f13906b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l AbstractC1450w.a aVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(AbstractC1450w.a aVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TouchExplorationStateProvider.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f13907b = new b(0);

        b() {
            super(0);
        }

        public final void a() {
        }

        @Override // ld.a
        public kotlin.k2 invoke() {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TouchExplorationStateProvider.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "b", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,108:1\n64#2,5:109\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$3$1\n*L\n72#1:109,5\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f13908b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<AbstractC1450w.a, kotlin.k2> f13909c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f13910d;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/TouchExplorationStateProvider_androidKt$ObserveState$3$1\n*L\n1#1,497:1\n73#2,3:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ld.a f13911a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC1450w f13912b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC1416b0 f13913c;

            public a(ld.a aVar, AbstractC1450w abstractC1450w, InterfaceC1416b0 interfaceC1416b0) {
                this.f13911a = aVar;
                this.f13912b = abstractC1450w;
                this.f13913c = interfaceC1416b0;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f13911a.invoke();
                this.f13912b.d(this.f13913c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(AbstractC1450w abstractC1450w, ld.l<? super AbstractC1450w.a, kotlin.k2> lVar, ld.a<kotlin.k2> aVar) {
            super(1);
            this.f13908b = abstractC1450w;
            this.f13909c = lVar;
            this.f13910d = aVar;
        }

        public static void a(ld.l lVar, InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
            lVar.invoke(aVar);
        }

        private static final void c(ld.l lVar, InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
            lVar.invoke(aVar);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            final ld.l<AbstractC1450w.a, kotlin.k2> lVar = this.f13909c;
            InterfaceC1416b0 interfaceC1416b0 = new InterfaceC1416b0() { // from class: androidx.compose.material3.rb
                @Override // androidx.view.InterfaceC1416b0
                public final void f(InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
                    ld.l.this.invoke(aVar);
                }
            };
            this.f13908b.a(interfaceC1416b0);
            return new a(this.f13910d, this.f13908b, interfaceC1416b0);
        }
    }

    /* compiled from: TouchExplorationStateProvider.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f13914b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<AbstractC1450w.a, kotlin.k2> f13915c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f13916d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13917e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13918f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(AbstractC1450w abstractC1450w, ld.l<? super AbstractC1450w.a, kotlin.k2> lVar, ld.a<kotlin.k2> aVar, int i4, int i5) {
            super(2);
            this.f13914b = abstractC1450w;
            this.f13915c = lVar;
            this.f13916d = aVar;
            this.f13917e = i4;
            this.f13918f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            qb.a(this.f13914b, this.f13915c, this.f13916d, tVar, androidx.compose.runtime.g3.b(this.f13917e | 1), this.f13918f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TouchExplorationStateProvider.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/w$a;", "event", "Lkotlin/k2;", "a", "(Landroidx/lifecycle/w$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<AbstractC1450w.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k6 f13919b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f13920c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k6 k6Var, AccessibilityManager accessibilityManager) {
            super(1);
            this.f13919b = k6Var;
            this.f13920c = accessibilityManager;
        }

        public final void a(@fg.l AbstractC1450w.a aVar) {
            if (aVar == AbstractC1450w.a.ON_RESUME) {
                this.f13919b.m(this.f13920c);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(AbstractC1450w.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TouchExplorationStateProvider.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k6 f13921b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f13922c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k6 k6Var, AccessibilityManager accessibilityManager) {
            super(0);
            this.f13921b = k6Var;
            this.f13922c = accessibilityManager;
        }

        public final void a() {
            this.f13921b.y(this.f13922c);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i
    public static final void a(AbstractC1450w abstractC1450w, ld.l<? super AbstractC1450w.a, kotlin.k2> lVar, ld.a<kotlin.k2> aVar, androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(-1703772404);
        if ((Integer.MIN_VALUE & i5) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (o4.S(abstractC1450w) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= o4.S(lVar) ? 32 : 16;
        }
        int i10 = i5 & 2;
        if (i10 != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= o4.S(aVar) ? 256 : 128;
        }
        if ((i6 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                lVar = a.f13906b;
            }
            if (i10 != 0) {
                aVar = b.f13907b;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1703772404, i6, -1, "androidx.compose.material3.ObserveState (TouchExplorationStateProvider.android.kt:65)");
            }
            o4.P(-1018043936);
            boolean S = ((i6 & 112) == 32) | o4.S(abstractC1450w) | ((i6 & 896) == 256);
            Object Q = o4.Q();
            if (S || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new c(abstractC1450w, lVar, aVar);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.runtime.a1.c(abstractC1450w, (ld.l) Q, o4, i6 & 14);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        ld.l<? super AbstractC1450w.a, kotlin.k2> lVar2 = lVar;
        ld.a<kotlin.k2> aVar2 = aVar;
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new d(abstractC1450w, lVar2, aVar2, i4, i5));
        }
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final androidx.compose.runtime.b5<Boolean> c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-906157724);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-906157724, i4, -1, "androidx.compose.material3.touchExplorationState (TouchExplorationStateProvider.android.kt:39)");
        }
        Context context = (Context) tVar.x(androidx.compose.ui.platform.o0.g());
        tVar.P(-1014858715);
        Object Q = tVar.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q == companion.a()) {
            Object systemService = context.getSystemService("accessibility");
            kotlin.jvm.internal.l0.n(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            Q = (AccessibilityManager) systemService;
            tVar.E(Q);
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) Q;
        Object a5 = w.a(tVar, -1014858590);
        if (a5 == companion.a()) {
            a5 = new k6();
            tVar.E(a5);
        }
        k6 k6Var = (k6) a5;
        tVar.p0();
        AbstractC1450w lifecycle = ((InterfaceC1423e0) tVar.x(androidx.compose.ui.platform.o0.i())).getLifecycle();
        tVar.P(-1014858487);
        boolean S = tVar.S(accessibilityManager);
        Object Q2 = tVar.Q();
        if (S || Q2 == companion.a()) {
            Q2 = new e(k6Var, accessibilityManager);
            tVar.E(Q2);
        }
        ld.l lVar = (ld.l) Q2;
        tVar.p0();
        tVar.P(-1014858321);
        boolean S2 = tVar.S(accessibilityManager);
        Object Q3 = tVar.Q();
        if (S2 || Q3 == companion.a()) {
            Q3 = new f(k6Var, accessibilityManager);
            tVar.E(Q3);
        }
        tVar.p0();
        a(lifecycle, lVar, (ld.a) Q3, tVar, 0, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k6Var;
    }
}
