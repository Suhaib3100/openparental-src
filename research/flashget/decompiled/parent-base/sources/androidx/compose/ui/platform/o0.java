package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.t;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1461e;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00148\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\" \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017\"\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\u00148\u0006¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017\"\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b(\u0010\u0017¨\u0006*²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "content", "a", "(Landroidx/compose/ui/platform/AndroidComposeView;Lld/p;Landroidx/compose/runtime/t;I)V", "Landroid/content/Context;", "context", "Landroid/content/res/Configuration;", "configuration", "Landroidx/compose/ui/res/e;", "m", "(Landroid/content/Context;Landroid/content/res/Configuration;Landroidx/compose/runtime/t;I)Landroidx/compose/ui/res/e;", "", "name", "", "l", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/a3;", "f", "()Landroidx/compose/runtime/a3;", "LocalConfiguration", "b", "g", "LocalContext", "c", "h", "LocalImageVectorCache", "Landroidx/lifecycle/e0;", "d", "i", "LocalLifecycleOwner", "Landroidx/savedstate/e;", "e", "j", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "k", "LocalView", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,166:1\n25#2:167\n25#2:180\n25#2:187\n25#2:194\n25#2:201\n25#2:209\n1116#3,6:168\n1116#3,6:174\n1116#3,6:181\n1116#3,6:188\n1116#3,6:195\n1116#3,3:202\n1119#3,3:206\n1116#3,6:210\n1#4:205\n81#5:216\n107#5,2:217\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt\n*L\n89#1:167\n95#1:180\n100#1:187\n133#1:194\n134#1:201\n137#1:209\n89#1:168,6\n93#1:174,6\n95#1:181,6\n100#1:188,6\n133#1:195,6\n134#1:202,3\n134#1:206,3\n137#1:210,6\n89#1:216\n89#1:217,2\n*E\n"})
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<Configuration> f20026a = androidx.compose.runtime.f0.e(null, a.f20032b, 1, null);

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<Context> f20027b = androidx.compose.runtime.f0.f(b.f20033b);

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<androidx.compose.ui.res.e> f20028c = androidx.compose.runtime.f0.f(c.f20034b);

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<InterfaceC1423e0> f20029d = androidx.compose.runtime.f0.f(d.f20035b);

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<InterfaceC1461e> f20030e = androidx.compose.runtime.f0.f(e.f20036b);

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<View> f20031f = androidx.compose.runtime.f0.f(f.f20037b);

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/res/Configuration;", "a", "()Landroid/content/res/Configuration;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Configuration> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20032b = new a(0);

        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            o0.l("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Context;", "a", "()Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<Context> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f20033b = new b(0);

        b() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            o0.l("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/res/e;", "a", "()Landroidx/compose/ui/res/e;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.res.e> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f20034b = new c(0);

        c() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.res.e invoke() {
            o0.l("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/e0;", "a", "()Landroidx/lifecycle/e0;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<InterfaceC1423e0> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f20035b = new d(0);

        d() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1423e0 invoke() {
            o0.l("LocalLifecycleOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/savedstate/e;", "a", "()Landroidx/savedstate/e;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<InterfaceC1461e> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f20036b = new e(0);

        e() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1461e invoke() {
            o0.l("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.a<View> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f20037b = new f(0);

        f() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            o0.l("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "Lkotlin/k2;", "a", "(Landroid/content/res/Configuration;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<Configuration, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<Configuration> f20038b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.runtime.k2<Configuration> k2Var) {
            super(1);
            this.f20038b = k2Var;
        }

        public final void a(@fg.l Configuration configuration) {
            o0.d(this.f20038b, new Configuration(configuration));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Configuration configuration) {
            a(configuration);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,166:1\n64#2,5:167\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2\n*L\n104#1:167,5\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ n1 f20039b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2\n*L\n1#1,497:1\n105#2,2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n1 f20040a;

            public a(n1 n1Var) {
                this.f20040a = n1Var;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f20040a.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(n1 n1Var) {
            super(1);
            this.f20039b = n1Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            return new a(this.f20039b);
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f20041b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x0 f20042c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f20043d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(AndroidComposeView androidComposeView, x0 x0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f20041b = androidComposeView;
            this.f20042c = x0Var;
            this.f20043d = pVar;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1471621628, i4, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:118)");
            }
            h1.a(this.f20041b, this.f20042c, this.f20043d, tVar, 72);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f20044b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f20045c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f20046d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(AndroidComposeView androidComposeView, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f20044b = androidComposeView;
            this.f20045c = pVar;
            this.f20046d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            o0.a(this.f20044b, this.f20045c, tVar, androidx.compose.runtime.g3.b(this.f20046d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAndroidCompositionLocals.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,166:1\n64#2,5:167\n*S KotlinDebug\n*F\n+ 1 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n*L\n156#1:167,5\n*E\n"})
    static final class k extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f20047b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f20048c;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidCompositionLocals.android.kt\nandroidx/compose/ui/platform/AndroidCompositionLocals_androidKt$obtainImageVectorCache$1\n*L\n1#1,497:1\n157#2,2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f20049a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f20050b;

            public a(Context context, l lVar) {
                this.f20049a = context;
                this.f20050b = lVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f20049a.getApplicationContext().unregisterComponentCallbacks(this.f20050b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f20047b = context;
            this.f20048c = lVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            this.f20047b.getApplicationContext().registerComponentCallbacks(this.f20048c);
            return new a(this.f20047b, this.f20048c);
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/o0$l", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "configuration", "Lkotlin/k2;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l implements ComponentCallbacks2 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Configuration f20051b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.res.e f20052c;

        l(Configuration configuration, androidx.compose.ui.res.e eVar) {
            this.f20051b = configuration;
            this.f20052c = eVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@fg.l Configuration configuration) {
            this.f20052c.c(this.f20051b.updateFrom(configuration));
            this.f20051b.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f20052c.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            this.f20052c.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.l AndroidComposeView androidComposeView, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(1396852028);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1396852028, i4, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        Context context = androidComposeView.getContext();
        o4.P(-492369756);
        Object Q = o4.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q == companion.a()) {
            Q = androidx.compose.runtime.t4.g(new Configuration(context.getResources().getConfiguration()), null, 2, null);
            o4.E(Q);
        }
        o4.p0();
        androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) Q;
        o4.P(-797338989);
        boolean q02 = o4.q0(k2Var);
        Object Q2 = o4.Q();
        if (q02 || Q2 == companion.a()) {
            Q2 = new g(k2Var);
            o4.E(Q2);
        }
        o4.p0();
        androidComposeView.x1((ld.l) Q2);
        o4.P(-492369756);
        Object Q3 = o4.Q();
        if (Q3 == companion.a()) {
            Q3 = new x0(context);
            o4.E(Q3);
        }
        o4.p0();
        x0 x0Var = (x0) Q3;
        AndroidComposeView.c W0 = androidComposeView.W0();
        if (W0 == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        o4.P(-492369756);
        Object Q4 = o4.Q();
        if (Q4 == companion.a()) {
            Q4 = p1.b(androidComposeView, W0.getSavedStateRegistryOwner());
            o4.E(Q4);
        }
        o4.p0();
        n1 n1Var = (n1) Q4;
        androidx.compose.runtime.a1.c(kotlin.k2.f75408a, new h(n1Var), o4, 6);
        androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{f20026a.e((Configuration) k2Var.getValue()), f20027b.e(context), f20029d.e(W0.getLifecycleOwner()), f20030e.e(W0.getSavedStateRegistryOwner()), androidx.compose.runtime.saveable.k.b().e(n1Var), f20031f.e(androidComposeView), f20028c.e(m(context, (Configuration) k2Var.getValue(), o4, 72))}, androidx.compose.runtime.internal.c.b(o4, 1471621628, true, new i(androidComposeView, x0Var, pVar)), o4, 56);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new j(androidComposeView, pVar, i4));
        }
    }

    private static final Configuration b(androidx.compose.runtime.k2<Configuration> k2Var) {
        return k2Var.getValue();
    }

    private static final void c(androidx.compose.runtime.k2<Configuration> k2Var, Configuration configuration) {
        k2Var.setValue(configuration);
    }

    public static final void d(androidx.compose.runtime.k2 k2Var, Configuration configuration) {
        k2Var.setValue(configuration);
    }

    @fg.l
    public static final androidx.compose.runtime.a3<Configuration> f() {
        return f20026a;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<Context> g() {
        return f20027b;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<androidx.compose.ui.res.e> h() {
        return f20028c;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<InterfaceC1423e0> i() {
        return f20029d;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<InterfaceC1461e> j() {
        return f20030e;
    }

    @fg.l
    public static final androidx.compose.runtime.a3<View> k() {
        return f20031f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @androidx.compose.runtime.x4
    @androidx.compose.runtime.i
    private static final androidx.compose.ui.res.e m(Context context, Configuration configuration, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-485908294);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-485908294, i4, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:131)");
        }
        tVar.P(-492369756);
        Object Q = tVar.Q();
        t.Companion companion = androidx.compose.runtime.t.INSTANCE;
        if (Q == companion.a()) {
            Q = new androidx.compose.ui.res.e();
            tVar.E(Q);
        }
        tVar.p0();
        androidx.compose.ui.res.e eVar = (androidx.compose.ui.res.e) Q;
        tVar.P(-492369756);
        Object Q2 = tVar.Q();
        Object obj = Q2;
        if (Q2 == companion.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            tVar.E(configuration2);
            obj = configuration2;
        }
        tVar.p0();
        Configuration configuration3 = (Configuration) obj;
        tVar.P(-492369756);
        Object Q3 = tVar.Q();
        if (Q3 == companion.a()) {
            Q3 = new l(configuration3, eVar);
            tVar.E(Q3);
        }
        tVar.p0();
        androidx.compose.runtime.a1.c(eVar, new k(context, (l) Q3), tVar, 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return eVar;
    }
}
