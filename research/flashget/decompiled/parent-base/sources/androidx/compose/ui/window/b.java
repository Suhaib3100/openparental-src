package androidx.compose.ui.window;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.v3;
import androidx.compose.runtime.w0;
import androidx.compose.runtime.x;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.m0;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.unit.w;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a:\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a,\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\u0017\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "onDismissRequest", "Landroidx/compose/ui/window/g;", "properties", "Landroidx/compose/runtime/i;", "content", "a", "(Lld/a;Landroidx/compose/ui/window/g;Lld/p;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/q;", "modifier", "c", "(Landroidx/compose/ui/q;Lld/p;Landroidx/compose/runtime/t;II)V", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,466:1\n74#2:467\n74#2:468\n74#2:469\n50#3:470\n49#3:471\n456#3,8:489\n464#3,6:503\n1116#4,6:472\n79#5,11:478\n92#5:509\n3737#6,6:497\n81#7:510\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n*L\n156#1:467\n157#1:468\n158#1:469\n162#1:470\n162#1:471\n454#1:489,8\n454#1:503,6\n162#1:472,6\n454#1:478,11\n454#1:509\n454#1:497,6\n160#1:510\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,466:1\n64#2,5:467\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n*L\n186#1:467,5\n*E\n"})
    static final class a extends n0 implements ld.l<w0, v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f21635b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n*L\n1#1,497:1\n187#2,3:498\n*E\n"})
        /* renamed from: androidx.compose.ui.window.b$a$a, reason: collision with other inner class name */
        public static final class C0379a implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f21636a;

            public C0379a(i iVar) {
                this.f21636a = iVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f21636a.dismiss();
                this.f21636a.m();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(1);
            this.f21635b = iVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@fg.l w0 w0Var) {
            this.f21635b.show();
            return new C0379a(this.f21635b);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.window.b$b, reason: collision with other inner class name */
    static final class C0380b extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f21637b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f21638c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.g f21639d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w f21640e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0380b(i iVar, ld.a<k2> aVar, androidx.compose.ui.window.g gVar, w wVar) {
            super(0);
            this.f21637b = iVar;
            this.f21638c = aVar;
            this.f21639d = gVar;
            this.f21640e = wVar;
        }

        public final void a() {
            this.f21637b.q(this.f21638c, this.f21639d, this.f21640e);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f21641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.g f21642c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<t, Integer, k2> f21643d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f21644e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f21645f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.a<k2> aVar, androidx.compose.ui.window.g gVar, ld.p<? super t, ? super Integer, k2> pVar, int i4, int i5) {
            super(2);
            this.f21641b = aVar;
            this.f21642c = gVar;
            this.f21643d = pVar;
            this.f21644e = i4;
            this.f21645f = i5;
        }

        public final void a(@fg.m t tVar, int i4) {
            b.a(this.f21641b, this.f21642c, this.f21643d, tVar, g3.b(this.f21644e | 1), this.f21645f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b5<ld.p<t, Integer, k2>> f21646b;

        /* compiled from: AndroidDialog.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.l<z, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f21647b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l z zVar) {
                androidx.compose.ui.semantics.w.m(zVar);
            }

            @Override // ld.l
            public k2 invoke(z zVar) {
                androidx.compose.ui.semantics.w.m(zVar);
                return k2.f75408a;
            }
        }

        /* compiled from: AndroidDialog.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.window.b$d$b, reason: collision with other inner class name */
        static final class C0381b extends n0 implements ld.p<t, Integer, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b5<ld.p<t, Integer, k2>> f21648b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0381b(b5<? extends ld.p<? super t, ? super Integer, k2>> b5Var) {
                super(2);
                this.f21648b = b5Var;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m t tVar, int i4) {
                if ((i4 & 11) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (x.b0()) {
                    x.r0(-533674951, i4, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:176)");
                }
                if (androidx.compose.animation.r.a(0, this.f21648b.getValue(), tVar)) {
                    x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
                a(tVar, num.intValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(b5<? extends ld.p<? super t, ? super Integer, k2>> b5Var) {
            super(2);
            this.f21646b = b5Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(488261145, i4, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:173)");
            }
            b.c(androidx.compose.ui.semantics.o.f(androidx.compose.ui.q.INSTANCE, false, a.f21647b, 1, null), androidx.compose.runtime.internal.c.b(tVar, -533674951, true, new C0381b(this.f21646b)), tVar, 48, 0);
            if (x.b0()) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/UUID;"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.a<UUID> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f21649b = new e(0);

        e() {
            super(0);
        }

        public final UUID a() {
            return UUID.randomUUID();
        }

        @Override // ld.a
        public UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,466:1\n151#2,3:467\n33#2,4:470\n154#2,2:474\n38#2:476\n156#2:477\n171#2,13:478\n171#2,13:491\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n*L\n458#1:467,3\n458#1:470,4\n458#1:474,2\n458#1:476\n458#1:477\n459#1:478,13\n460#1:491,13\n*E\n"})
    static final class f implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final f f21650a = new f();

        /* compiled from: AndroidDialog.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,466:1\n33#2,6:467\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1$1\n*L\n462#1:467,6\n*E\n"})
        static final class a extends n0 implements ld.l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<i1> f21651b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends i1> list) {
                super(1);
                this.f21651b = list;
            }

            public final void a(@fg.l i1.a aVar) {
                List<i1> list = this.f21651b;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    i1.a.m(aVar, list.get(i4), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
                a(aVar);
                return k2.f75408a;
            }
        }

        f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v26 */
        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l o0 o0Var, @fg.l List<? extends l0> list, long j4) {
            Object obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                i4 = androidx.compose.animation.n.a(list.get(i4), j4, arrayList, i4, 1);
            }
            i1 i1Var = null;
            int i5 = 1;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int width = ((i1) obj).getWidth();
                int J = kotlin.collections.w.J(arrayList);
                if (1 <= J) {
                    int i6 = 1;
                    while (true) {
                        Object obj2 = arrayList.get(i6);
                        int width2 = ((i1) obj2).getWidth();
                        if (width < width2) {
                            obj = obj2;
                            width = width2;
                        }
                        if (i6 == J) {
                            break;
                        }
                        i6++;
                    }
                }
            }
            i1 i1Var2 = (i1) obj;
            int width3 = i1Var2 != null ? i1Var2.getWidth() : androidx.compose.ui.unit.b.r(j4);
            if (!arrayList.isEmpty()) {
                ?? r02 = arrayList.get(0);
                int height = ((i1) r02).getHeight();
                int J2 = kotlin.collections.w.J(arrayList);
                boolean z4 = r02;
                if (1 <= J2) {
                    while (true) {
                        Object obj3 = arrayList.get(i5);
                        int height2 = ((i1) obj3).getHeight();
                        r02 = z4;
                        if (height < height2) {
                            r02 = obj3;
                            height = height2;
                        }
                        if (i5 == J2) {
                            break;
                        }
                        i5++;
                        z4 = r02;
                    }
                }
                i1Var = r02;
            }
            i1 i1Var3 = i1Var;
            return o0.x2(o0Var, width3, i1Var3 != null ? i1Var3.getHeight() : androidx.compose.ui.unit.b.q(j4), null, new a(arrayList), 4, null);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f21652b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<t, Integer, k2> f21653c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21654d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f21655e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.q qVar, ld.p<? super t, ? super Integer, k2> pVar, int i4, int i5) {
            super(2);
            this.f21652b = qVar;
            this.f21653c = pVar;
            this.f21654d = i4;
            this.f21655e = i5;
        }

        public final void a(@fg.m t tVar, int i4) {
            b.c(this.f21652b, this.f21653c, tVar, g3.b(this.f21654d | 1), this.f21655e);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l ld.a<kotlin.k2> r19, @fg.m androidx.compose.ui.window.g r20, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r21, @fg.m androidx.compose.runtime.t r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.a(ld.a, androidx.compose.ui.window.g, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    private static final ld.p<t, Integer, k2> b(b5<? extends ld.p<? super t, ? super Integer, k2>> b5Var) {
        return (ld.p) b5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void c(androidx.compose.ui.q qVar, ld.p<? super t, ? super Integer, k2> pVar, t tVar, int i4, int i5) {
        int i6;
        t o4 = tVar.o(-1177876616);
        int i7 = i5 & 1;
        if (i7 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.q0(qVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i6 & 91) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = androidx.compose.ui.q.INSTANCE;
            }
            if (x.b0()) {
                x.r0(-1177876616, i6, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:452)");
            }
            f fVar = f.f21650a;
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            g0 B = o4.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion.a();
            ld.q<v3<androidx.compose.ui.node.g>, t, Integer, k2> g4 = a0.g(qVar);
            int i10 = ((((((i6 >> 3) & 14) | 384) | ((i6 << 3) & 112)) << 9) & 7168) | 6;
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            m5.j(o4, fVar, companion.f());
            m5.j(o4, B, companion.h());
            ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion.b();
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, b5);
            }
            androidx.compose.animation.e.a(0, g4, v3.a(o4), o4, 2058660585);
            pVar.invoke(o4, Integer.valueOf((i10 >> 9) & 14));
            o4.p0();
            o4.H();
            o4.p0();
            if (x.b0()) {
                x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new g(qVar, pVar, i4, i5));
        }
    }

    public static final ld.p d(b5 b5Var) {
        return (ld.p) b5Var.getValue();
    }
}
