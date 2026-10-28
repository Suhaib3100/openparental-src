package androidx.view.compose;

import androidx.compose.runtime.a1;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.i;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.w0;
import androidx.view.compose.d;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.j;
import fg.m;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.l;

/* compiled from: ActivityResultRegistry.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"I", "O", "Lb/a;", "contract", "Lkotlin/Function1;", "Lkotlin/k2;", "onResult", "Landroidx/activity/compose/j;", "a", "(Lb/a;Lld/l;Landroidx/compose/runtime/t;I)Landroidx/activity/compose/j;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,161:1\n25#2:162\n25#2:169\n955#3,6:163\n955#3,6:170\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:162\n98#1:169\n97#1:163,6\n98#1:170,6\n*E\n"})
/* loaded from: classes.dex */
public final class d {

    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"I", "O", "Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "b", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,161:1\n62#2,5:162\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n108#1:162,5\n*E\n"})
    static final class a extends n0 implements l<w0, v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.view.compose.b<I> f437b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistry f438c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f439d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b.a<I, O> f440e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b5<l<O, k2>> f441f;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n1#1,483:1\n109#2,2:484\n*E\n"})
        /* renamed from: androidx.activity.compose.d$a$a, reason: collision with other inner class name */
        public static final class C0004a implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.view.compose.b f442a;

            public C0004a(androidx.view.compose.b bVar) {
                this.f442a = bVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f442a.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.view.compose.b<I> bVar, ActivityResultRegistry activityResultRegistry, String str, b.a<I, O> aVar, b5<? extends l<? super O, k2>> b5Var) {
            super(1);
            this.f437b = bVar;
            this.f438c = activityResultRegistry;
            this.f439d = str;
            this.f440e = aVar;
            this.f441f = b5Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b5 b5Var, Object obj) {
            ((l) b5Var.getValue()).invoke(obj);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@fg.l w0 w0Var) {
            androidx.view.compose.b<I> bVar = this.f437b;
            ActivityResultRegistry activityResultRegistry = this.f438c;
            String str = this.f439d;
            Object obj = this.f440e;
            final b5<l<O, k2>> b5Var = this.f441f;
            bVar.c(activityResultRegistry.j(str, obj, new androidx.view.result.a() { // from class: androidx.activity.compose.c
                @Override // androidx.view.result.a
                public final void onActivityResult(Object obj2) {
                    d.a.c(b5.this, obj2);
                }
            }));
            return new C0004a(this.f437b);
        }
    }

    /* compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "O", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.a<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f443b = new b(0);

        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    @fg.l
    @i
    public static final <I, O> j<I, O> a(@fg.l b.a<I, O> aVar, @fg.l l<? super O, k2> lVar, @m t tVar, int i4) {
        tVar.P(-1408504823);
        b5 u4 = o4.u(aVar, tVar, 8);
        b5 u5 = o4.u(lVar, tVar, (i4 >> 3) & 14);
        String str = (String) androidx.compose.runtime.saveable.d.d(new Object[0], null, null, b.f443b, tVar, 3080, 6);
        j a5 = g.f456a.a(tVar, 6);
        if (a5 == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        ActivityResultRegistry activityResultRegistry = a5.getActivityResultRegistry();
        tVar.P(-3687241);
        Object Q = tVar.Q();
        t.Companion companion = t.INSTANCE;
        if (Q == companion.a()) {
            Q = new androidx.view.compose.b();
            tVar.E(Q);
        }
        tVar.p0();
        androidx.view.compose.b bVar = (androidx.view.compose.b) Q;
        tVar.P(-3687241);
        Object Q2 = tVar.Q();
        if (Q2 == companion.a()) {
            Q2 = new j(bVar, u4);
            tVar.E(Q2);
        }
        tVar.p0();
        j<I, O> jVar = (j) Q2;
        a1.a(activityResultRegistry, str, aVar, new a(bVar, activityResultRegistry, str, aVar, u5), tVar, 520);
        tVar.p0();
        return jVar;
    }
}
