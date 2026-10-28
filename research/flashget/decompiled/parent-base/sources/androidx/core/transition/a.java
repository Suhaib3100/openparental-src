package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.l;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a9\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\t\u001a9\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\t\u001a9\u0010\f\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\f\u0010\t\u001a9\u0010\r\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\t\u001aÍ\u0001\u0010\u0013\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroid/transition/Transition;", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "transition", "Lkotlin/k2;", "action", "Landroid/transition/Transition$TransitionListener;", "d", "(Landroid/transition/Transition;Lld/l;)Landroid/transition/Transition$TransitionListener;", "g", "c", "f", "e", "onEnd", "onStart", "onCancel", "onResume", "onPause", "a", "(Landroid/transition/Transition;Lld/l;Lld/l;Lld/l;Lld/l;Lld/l;)Landroid/transition/Transition$TransitionListener;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n1#1,69:1\n47#1,9:70\n66#1,2:79\n47#1,9:81\n66#1,2:90\n47#1,9:92\n66#1,2:101\n47#1,9:103\n66#1,2:112\n47#1,9:114\n66#1,2:123\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n24#1:70,9\n24#1:79,2\n29#1:81,9\n29#1:90,2\n34#1:92,9\n34#1:101,2\n39#1:103,9\n39#1:112,2\n44#1:114,9\n44#1:123,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/k2;", "a", "(Landroid/transition/Transition;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.core.transition.a$a, reason: collision with other inner class name */
    public static final class C0434a extends n0 implements l<Transition, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0434a f26817b = new C0434a(1);

        public C0434a() {
            super(1);
        }

        public final void a(Transition transition) {
        }

        @Override // ld.l
        public k2 invoke(Transition transition) {
            return k2.f75408a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/k2;", "a", "(Landroid/transition/Transition;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends n0 implements l<Transition, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f26818b = new b(1);

        public b() {
            super(1);
        }

        public final void a(Transition transition) {
        }

        @Override // ld.l
        public k2 invoke(Transition transition) {
            return k2.f75408a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/k2;", "a", "(Landroid/transition/Transition;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends n0 implements l<Transition, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f26819b = new c(1);

        public c() {
            super(1);
        }

        public final void a(Transition transition) {
        }

        @Override // ld.l
        public k2 invoke(Transition transition) {
            return k2.f75408a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/k2;", "a", "(Landroid/transition/Transition;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d extends n0 implements l<Transition, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f26820b = new d(1);

        public d() {
            super(1);
        }

        public final void a(Transition transition) {
        }

        @Override // ld.l
        public k2 invoke(Transition transition) {
            return k2.f75408a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/k2;", "a", "(Landroid/transition/Transition;)V"}, k = 3, mv = {1, 8, 0})
    public static final class e extends n0 implements l<Transition, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f26821b = new e(1);

        public e() {
            super(1);
        }

        public final void a(Transition transition) {
        }

        @Override // ld.l
        public k2 invoke(Transition transition) {
            return k2.f75408a;
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/k2;", "onTransitionEnd", "(Landroid/transition/Transition;)V", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    public static final class f implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<Transition, k2> f26822a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Transition, k2> f26823b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Transition, k2> f26824c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<Transition, k2> f26825d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<Transition, k2> f26826e;

        /* JADX WARN: Multi-variable type inference failed */
        public f(l<? super Transition, k2> lVar, l<? super Transition, k2> lVar2, l<? super Transition, k2> lVar3, l<? super Transition, k2> lVar4, l<? super Transition, k2> lVar5) {
            this.f26822a = lVar;
            this.f26823b = lVar2;
            this.f26824c = lVar3;
            this.f26825d = lVar4;
            this.f26826e = lVar5;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            this.f26825d.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f26822a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.f26824c.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.f26823b.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            this.f26826e.invoke(transition);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b¸\u0006\u0000"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/k2;", "onTransitionEnd", "(Landroid/transition/Transition;)V", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n48#2:65\n51#3:66\n52#4:67\n49#5:68\n*E\n"})
    public static final class g implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f26827a;

        public g(l lVar) {
            this.f26827a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            this.f26827a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b¸\u0006\u0000"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/k2;", "onTransitionEnd", "(Landroid/transition/Transition;)V", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n51#2:65\n52#3:66\n50#4:67\n49#5:68\n*E\n"})
    public static final class h implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f26828a;

        public h(l lVar) {
            this.f26828a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f26828a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b¸\u0006\u0000"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/k2;", "onTransitionEnd", "(Landroid/transition/Transition;)V", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n48#2:65\n51#3:66\n50#4:67\n49#5:68\n*E\n"})
    public static final class i implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f26829a;

        public i(l lVar) {
            this.f26829a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            this.f26829a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b¸\u0006\u0000"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/k2;", "onTransitionEnd", "(Landroid/transition/Transition;)V", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,64:1\n48#2:65\n52#3:66\n50#4:67\n49#5:68\n*E\n"})
    public static final class j implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f26830a;

        public j(l lVar) {
            this.f26830a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            this.f26830a.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b¸\u0006\u0000"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/k2;", "onTransitionEnd", "(Landroid/transition/Transition;)V", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n*L\n1#1,64:1\n48#2:65\n51#3:66\n52#4:67\n50#5:68\n*E\n"})
    public static final class k implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f26831a;

        public k(l lVar) {
            this.f26831a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            this.f26831a.invoke(transition);
        }
    }

    @fg.l
    public static final Transition.TransitionListener a(@fg.l Transition transition, @fg.l l<? super Transition, k2> lVar, @fg.l l<? super Transition, k2> lVar2, @fg.l l<? super Transition, k2> lVar3, @fg.l l<? super Transition, k2> lVar4, @fg.l l<? super Transition, k2> lVar5) {
        f fVar = new f(lVar, lVar4, lVar5, lVar3, lVar2);
        transition.addListener(fVar);
        return fVar;
    }

    public static /* synthetic */ Transition.TransitionListener b(Transition transition, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            lVar = C0434a.f26817b;
        }
        if ((i4 & 2) != 0) {
            lVar2 = b.f26818b;
        }
        l lVar6 = lVar2;
        if ((i4 & 4) != 0) {
            lVar3 = c.f26819b;
        }
        l lVar7 = lVar3;
        if ((i4 & 8) != 0) {
            lVar4 = d.f26820b;
        }
        if ((i4 & 16) != 0) {
            lVar5 = e.f26821b;
        }
        f fVar = new f(lVar, lVar4, lVar5, lVar7, lVar6);
        transition.addListener(fVar);
        return fVar;
    }

    @fg.l
    public static final Transition.TransitionListener c(@fg.l Transition transition, @fg.l l<? super Transition, k2> lVar) {
        g gVar = new g(lVar);
        transition.addListener(gVar);
        return gVar;
    }

    @fg.l
    public static final Transition.TransitionListener d(@fg.l Transition transition, @fg.l l<? super Transition, k2> lVar) {
        h hVar = new h(lVar);
        transition.addListener(hVar);
        return hVar;
    }

    @fg.l
    public static final Transition.TransitionListener e(@fg.l Transition transition, @fg.l l<? super Transition, k2> lVar) {
        i iVar = new i(lVar);
        transition.addListener(iVar);
        return iVar;
    }

    @fg.l
    public static final Transition.TransitionListener f(@fg.l Transition transition, @fg.l l<? super Transition, k2> lVar) {
        j jVar = new j(lVar);
        transition.addListener(jVar);
        return jVar;
    }

    @fg.l
    public static final Transition.TransitionListener g(@fg.l Transition transition, @fg.l l<? super Transition, k2> lVar) {
        k kVar = new k(lVar);
        transition.addListener(kVar);
        return kVar;
    }
}
