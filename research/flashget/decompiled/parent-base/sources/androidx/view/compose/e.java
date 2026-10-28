package androidx.view.compose;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.i;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.w0;
import androidx.compose.ui.platform.o0;
import androidx.view.InterfaceC1423e0;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.c0;
import androidx.view.f0;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.l;
import ld.p;

/* compiled from: BackHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "enabled", "Lkotlin/Function0;", "Lkotlin/k2;", "onBack", "a", "(ZLld/a;Landroidx/compose/runtime/t;II)V", "currentOnBack", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,110:1\n25#2:111\n50#2:118\n49#2:119\n955#3,6:112\n955#3,6:120\n76#4:126\n89#5:127\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n*L\n86#1:111\n94#1:118\n94#1:119\n86#1:112,6\n94#1:120,6\n100#1:126\n84#1:127\n*E\n"})
/* loaded from: classes.dex */
public final class e {

    /* compiled from: BackHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f444b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f445c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d dVar, boolean z4) {
            super(0);
            this.f444b = dVar;
            this.f445c = z4;
        }

        public final void a() {
            this.f444b.setEnabled(this.f445c);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: BackHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,110:1\n62#2,5:111\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n105#1:111,5\n*E\n"})
    static final class b extends n0 implements l<w0, v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f446b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC1423e0 f447c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f448d;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt$BackHandler$2\n*L\n1#1,483:1\n106#2,2:484\n*E\n"})
        public static final class a implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f449a;

            public a(d dVar) {
                this.f449a = dVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f449a.remove();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OnBackPressedDispatcher onBackPressedDispatcher, InterfaceC1423e0 interfaceC1423e0, d dVar) {
            super(1);
            this.f446b = onBackPressedDispatcher;
            this.f447c = interfaceC1423e0;
            this.f448d = dVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@fg.l w0 w0Var) {
            this.f446b.i(this.f447c, this.f448d);
            return new a(this.f448d);
        }
    }

    /* compiled from: BackHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f450b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f451c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f452d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f453e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z4, ld.a<k2> aVar, int i4, int i5) {
            super(2);
            this.f450b = z4;
            this.f451c = aVar;
            this.f452d = i4;
            this.f453e = i5;
        }

        public final void a(@m t tVar, int i4) {
            e.a(this.f450b, this.f451c, tVar, this.f452d | 1, this.f453e);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BackHandler.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/activity/compose/e$d", "Landroidx/activity/c0;", "Lkotlin/k2;", "handleOnBackPressed", "()V", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends c0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b5<ld.a<k2>> f454a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z4, b5<? extends ld.a<k2>> b5Var) {
            super(z4);
            this.f454a = b5Var;
        }

        @Override // androidx.view.c0
        public void handleOnBackPressed() {
            this.f454a.getValue().invoke();
        }
    }

    @i
    public static final void a(boolean z4, @fg.l ld.a<k2> aVar, @m t tVar, int i4, int i5) {
        int i6;
        t o4 = tVar.o(-361453782);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.b(z4) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.q0(aVar) ? 32 : 16;
        }
        if ((i6 & 91) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                z4 = true;
            }
            b5 u4 = o4.u(aVar, o4, (i6 >> 3) & 14);
            o4.P(-3687241);
            Object Q = o4.Q();
            t.Companion companion = t.INSTANCE;
            if (Q == companion.a()) {
                Q = new d(z4, u4);
                o4.E(Q);
            }
            o4.p0();
            d dVar = (d) Q;
            Boolean valueOf = Boolean.valueOf(z4);
            o4.P(-3686552);
            boolean q02 = o4.q0(valueOf) | o4.q0(dVar);
            Object Q2 = o4.Q();
            if (q02 || Q2 == companion.a()) {
                Q2 = new a(dVar, z4);
                o4.E(Q2);
            }
            o4.p0();
            a1.k((ld.a) Q2, o4, 0);
            f0 a5 = i.f464a.a(o4, 6);
            if (a5 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            OnBackPressedDispatcher onBackPressedDispatcher = a5.getOnBackPressedDispatcher();
            InterfaceC1423e0 interfaceC1423e0 = (InterfaceC1423e0) o4.x(o0.i());
            a1.b(interfaceC1423e0, onBackPressedDispatcher, new b(onBackPressedDispatcher, interfaceC1423e0, dVar), o4, 72);
        }
        t3 t4 = o4.t();
        if (t4 == null) {
            return;
        }
        t4.a(new c(z4, aVar, i4, i5));
    }

    private static final ld.a<k2> b(b5<? extends ld.a<k2>> b5Var) {
        return b5Var.getValue();
    }

    public static final ld.a c(b5 b5Var) {
        return (ld.a) b5Var.getValue();
    }
}
