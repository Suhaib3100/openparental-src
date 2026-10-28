package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.x;
import androidx.compose.runtime.z;
import androidx.compose.ui.node.g;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.node.p1;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.q;
import androidx.compose.ui.unit.w;
import androidx.compose.ui.v;
import androidx.view.InterfaceC1423e0;
import androidx.view.InterfaceC1461e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: AndroidView.android.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a^\u0010 \u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$\"(\u0010)\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b%8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Landroidx/compose/ui/q;", "modifier", "Lkotlin/k2;", "update", "a", "(Lld/l;Landroidx/compose/ui/q;Lld/l;Landroidx/compose/runtime/t;II)V", "onReset", "onRelease", "b", "(Lld/l;Landroidx/compose/ui/q;Lld/l;Lld/l;Lld/l;Landroidx/compose/runtime/t;II)V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/h0;", "d", "(Lld/l;Landroidx/compose/runtime/t;I)Lld/a;", "Landroidx/compose/runtime/m5;", "", "compositeKeyHash", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/lifecycle/e0;", "lifecycleOwner", "Landroidx/savedstate/e;", "savedStateRegistryOwner", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/runtime/g0;", "compositionLocalMap", "g", "(Landroidx/compose/runtime/t;Landroidx/compose/ui/q;ILandroidx/compose/ui/unit/d;Landroidx/lifecycle/e0;Landroidx/savedstate/e;Landroidx/compose/ui/unit/w;Landroidx/compose/runtime/g0;)V", "Landroidx/compose/ui/viewinterop/h;", "f", "(Landroidx/compose/ui/node/h0;)Landroidx/compose/ui/viewinterop/h;", "Lkotlin/u;", "Lld/l;", "e", "()Lld/l;", "NoOpUpdate", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,406:1\n74#2:407\n74#2:408\n74#2:409\n74#2:410\n74#2:431\n74#2:432\n74#2:433\n286#3,10:411\n251#3,10:421\n3737#4,6:434\n*S KotlinDebug\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/AndroidView_androidKt\n*L\n214#1:407\n215#1:408\n222#1:409\n223#1:410\n268#1:431\n270#1:432\n271#1:433\n226#1:411,10\n244#1:421,10\n308#1:434,6\n*E\n"})
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final ld.l<View, k2> f21595a = j.f21615b;

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a extends n0 implements ld.a<h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f21596b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.a aVar) {
            super(0);
            this.f21596b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.h0, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final h0 invoke() {
            return this.f21596b.invoke();
        }
    }

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class b extends n0 implements ld.a<h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f21597b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ld.a aVar) {
            super(0);
            this.f21597b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.h0, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final h0 invoke() {
            return this.f21597b.invoke();
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Context, T> f21598b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f21599c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<T, k2> f21600d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f21601e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f21602f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.l<? super Context, ? extends T> lVar, q qVar, ld.l<? super T, k2> lVar2, int i4, int i5) {
            super(2);
            this.f21598b = lVar;
            this.f21599c = qVar;
            this.f21600d = lVar2;
            this.f21601e = i4;
            this.f21602f = i5;
        }

        public final void a(@fg.m t tVar, int i4) {
            e.a(this.f21598b, this.f21599c, this.f21600d, tVar, g3.b(this.f21601e | 1), this.f21602f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/h0;", "Lkotlin/Function1;", "Lkotlin/k2;", "it", "a", "(Landroidx/compose/ui/node/h0;Lld/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class d<T> extends n0 implements ld.p<h0, ld.l<? super T, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f21603b = new d(2);

        d() {
            super(2);
        }

        public final void a(@fg.l h0 h0Var, @fg.l ld.l<? super T, k2> lVar) {
            e.f(h0Var).c0(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var, Object obj) {
            a(h0Var, (ld.l) obj);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/h0;", "Lkotlin/Function1;", "Lkotlin/k2;", "it", "a", "(Landroidx/compose/ui/node/h0;Lld/l;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.e$e, reason: collision with other inner class name */
    static final class C0378e<T> extends n0 implements ld.p<h0, ld.l<? super T, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0378e f21604b = new C0378e(2);

        C0378e() {
            super(2);
        }

        public final void a(@fg.l h0 h0Var, @fg.l ld.l<? super T, k2> lVar) {
            e.f(h0Var).e0(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var, Object obj) {
            a(h0Var, (ld.l) obj);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/h0;", "Lkotlin/Function1;", "Lkotlin/k2;", "it", "a", "(Landroidx/compose/ui/node/h0;Lld/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class f<T> extends n0 implements ld.p<h0, ld.l<? super T, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f21605b = new f(2);

        f() {
            super(2);
        }

        public final void a(@fg.l h0 h0Var, @fg.l ld.l<? super T, k2> lVar) {
            e.f(h0Var).b0(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var, Object obj) {
            a(h0Var, (ld.l) obj);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/h0;", "Lkotlin/Function1;", "Lkotlin/k2;", "it", "a", "(Landroidx/compose/ui/node/h0;Lld/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class g<T> extends n0 implements ld.p<h0, ld.l<? super T, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f21606b = new g(2);

        g() {
            super(2);
        }

        public final void a(@fg.l h0 h0Var, @fg.l ld.l<? super T, k2> lVar) {
            e.f(h0Var).e0(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var, Object obj) {
            a(h0Var, (ld.l) obj);
            return k2.f75408a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/h0;", "Lkotlin/Function1;", "Lkotlin/k2;", "it", "a", "(Landroidx/compose/ui/node/h0;Lld/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class h<T> extends n0 implements ld.p<h0, ld.l<? super T, ? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f21607b = new h(2);

        h() {
            super(2);
        }

        public final void a(@fg.l h0 h0Var, @fg.l ld.l<? super T, k2> lVar) {
            e.f(h0Var).b0(lVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var, Object obj) {
            a(h0Var, (ld.l) obj);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Context, T> f21608b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f21609c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<T, k2> f21610d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<T, k2> f21611e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.l<T, k2> f21612f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f21613g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f21614h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(ld.l<? super Context, ? extends T> lVar, q qVar, ld.l<? super T, k2> lVar2, ld.l<? super T, k2> lVar3, ld.l<? super T, k2> lVar4, int i4, int i5) {
            super(2);
            this.f21608b = lVar;
            this.f21609c = qVar;
            this.f21610d = lVar2;
            this.f21611e = lVar3;
            this.f21612f = lVar4;
            this.f21613g = i4;
            this.f21614h = i5;
        }

        public final void a(@fg.m t tVar, int i4) {
            e.b(this.f21608b, this.f21609c, this.f21610d, this.f21611e, this.f21612f, tVar, g3.b(this.f21613g | 1), this.f21614h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Lkotlin/k2;", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends n0 implements ld.l<View, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f21615b = new j(1);

        j() {
            super(1);
        }

        public final void a(@fg.l View view) {
        }

        @Override // ld.l
        public k2 invoke(View view) {
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/h0;", "a", "()Landroidx/compose/ui/node/h0;"}, k = 3, mv = {1, 8, 0})
    static final class k extends n0 implements ld.a<h0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f21616b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Context, T> f21617c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z f21618d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.saveable.i f21619e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f21620f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ View f21621g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(Context context, ld.l<? super Context, ? extends T> lVar, z zVar, androidx.compose.runtime.saveable.i iVar, int i4, View view) {
            super(0);
            this.f21616b = context;
            this.f21617c = lVar;
            this.f21618d = zVar;
            this.f21619e = iVar;
            this.f21620f = i4;
            this.f21621g = view;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h0 invoke() {
            Context context = this.f21616b;
            ld.l<Context, T> lVar = this.f21617c;
            z zVar = this.f21618d;
            androidx.compose.runtime.saveable.i iVar = this.f21619e;
            int i4 = this.f21620f;
            KeyEvent.Callback callback = this.f21621g;
            l0.n(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
            return new androidx.compose.ui.viewinterop.h(context, lVar, zVar, iVar, i4, (p1) callback).getLayoutNode();
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/q;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/q;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends n0 implements ld.p<h0, q, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f21622b = new l(2);

        l() {
            super(2);
        }

        public final void a(@fg.l h0 h0Var, @fg.l q qVar) {
            e.f(h0Var).M(qVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var, q qVar) {
            a(h0Var, qVar);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/unit/d;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/unit/d;)V"}, k = 3, mv = {1, 8, 0})
    static final class m extends n0 implements ld.p<h0, androidx.compose.ui.unit.d, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final m f21623b = new m(2);

        m() {
            super(2);
        }

        public final void a(@fg.l h0 h0Var, @fg.l androidx.compose.ui.unit.d dVar) {
            e.f(h0Var).K(dVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var, androidx.compose.ui.unit.d dVar) {
            a(h0Var, dVar);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/h0;", "Landroidx/lifecycle/e0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;Landroidx/lifecycle/e0;)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends n0 implements ld.p<h0, InterfaceC1423e0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f21624b = new n(2);

        n() {
            super(2);
        }

        public final void a(@fg.l h0 h0Var, @fg.l InterfaceC1423e0 interfaceC1423e0) {
            e.f(h0Var).L(interfaceC1423e0);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var, InterfaceC1423e0 interfaceC1423e0) {
            a(h0Var, interfaceC1423e0);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/h0;", "Landroidx/savedstate/e;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;Landroidx/savedstate/e;)V"}, k = 3, mv = {1, 8, 0})
    static final class o extends n0 implements ld.p<h0, InterfaceC1461e, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f21625b = new o(2);

        o() {
            super(2);
        }

        public final void a(@fg.l h0 h0Var, @fg.l InterfaceC1461e interfaceC1461e) {
            e.f(h0Var).S(interfaceC1461e);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var, InterfaceC1461e interfaceC1461e) {
            a(h0Var, interfaceC1461e);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/h0;", "Landroidx/compose/ui/unit/w;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/h0;Landroidx/compose/ui/unit/w;)V"}, k = 3, mv = {1, 8, 0})
    static final class p extends n0 implements ld.p<h0, w, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f21626b = new p(2);

        /* compiled from: AndroidView.android.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21627a;

            static {
                int[] iArr = new int[w.values().length];
                try {
                    iArr[w.Ltr.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[w.Rtl.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f21627a = iArr;
            }
        }

        p() {
            super(2);
        }

        public final void a(@fg.l h0 h0Var, @fg.l w wVar) {
            androidx.compose.ui.viewinterop.h f4 = e.f(h0Var);
            int i4 = a.f21627a[wVar.ordinal()];
            int i5 = 1;
            if (i4 == 1) {
                i5 = 0;
            } else if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f4.setLayoutDirection(i5);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(h0 h0Var, w wVar) {
            a(h0Var, wVar);
            return k2.f75408a;
        }
    }

    @v
    @androidx.compose.runtime.i
    public static final <T extends View> void a(@fg.l ld.l<? super Context, ? extends T> lVar, @fg.m q qVar, @fg.m ld.l<? super T, k2> lVar2, @fg.m t tVar, int i4, int i5) {
        int i6;
        t o4 = tVar.o(-1783766393);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i6 = (o4.S(lVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            i6 |= o4.q0(qVar) ? 32 : 16;
        }
        int i10 = i5 & 4;
        if (i10 != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            i6 |= o4.S(lVar2) ? 256 : 128;
        }
        if ((i6 & 731) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                qVar = q.INSTANCE;
            }
            if (i10 != 0) {
                lVar2 = f21595a;
            }
            if (x.b0()) {
                x.r0(-1783766393, i6, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:106)");
            }
            b(lVar, qVar, null, f21595a, lVar2, o4, (i6 & 14) | 3072 | (i6 & 112) | ((i6 << 6) & 57344), 4);
            if (x.b0()) {
                x.q0();
            }
        }
        q qVar2 = qVar;
        ld.l<? super T, k2> lVar3 = lVar2;
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(lVar, qVar2, lVar3, i4, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0048  */
    @androidx.compose.ui.v
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.view.View> void b(@fg.l ld.l<? super android.content.Context, ? extends T> r17, @fg.m androidx.compose.ui.q r18, @fg.m ld.l<? super T, kotlin.k2> r19, @fg.m ld.l<? super T, kotlin.k2> r20, @fg.m ld.l<? super T, kotlin.k2> r21, @fg.m androidx.compose.runtime.t r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.b(ld.l, androidx.compose.ui.q, ld.l, ld.l, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.runtime.i
    private static final <T extends View> ld.a<h0> d(ld.l<? super Context, ? extends T> lVar, t tVar, int i4) {
        tVar.P(2030558801);
        if (x.b0()) {
            x.r0(2030558801, i4, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:265)");
        }
        k kVar = new k((Context) tVar.x(o0.g()), lVar, androidx.compose.runtime.p.u(tVar, 0), (androidx.compose.runtime.saveable.i) tVar.x(androidx.compose.runtime.saveable.k.b()), androidx.compose.runtime.p.j(tVar, 0), (View) tVar.x(o0.k()));
        if (x.b0()) {
            x.q0();
        }
        tVar.p0();
        return kVar;
    }

    @fg.l
    public static final ld.l<View, k2> e() {
        return f21595a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> androidx.compose.ui.viewinterop.h<T> f(h0 h0Var) {
        androidx.compose.ui.viewinterop.c interopViewFactoryHolder = h0Var.getInteropViewFactoryHolder();
        if (interopViewFactoryHolder == null) {
            throw new IllegalStateException("Required value was null.");
        }
        l0.n(interopViewFactoryHolder, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
        return (androidx.compose.ui.viewinterop.h) interopViewFactoryHolder;
    }

    private static final <T extends View> void g(t tVar, q qVar, int i4, androidx.compose.ui.unit.d dVar, InterfaceC1423e0 interfaceC1423e0, InterfaceC1461e interfaceC1461e, w wVar, g0 g0Var) {
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        m5.j(tVar, g0Var, companion.h());
        m5.j(tVar, qVar, l.f21622b);
        m5.j(tVar, dVar, m.f21623b);
        m5.j(tVar, interfaceC1423e0, n.f21624b);
        m5.j(tVar, interfaceC1461e, o.f21625b);
        m5.j(tVar, wVar, p.f21626b);
        ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion.b();
        if (tVar.getInserting() || !l0.g(tVar.Q(), Integer.valueOf(i4))) {
            androidx.compose.animation.d.a(i4, tVar, i4, b5);
        }
    }
}
