package androidx.core.transition;

import android.transition.Transition;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import q3.l;

/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a5\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\bø\u0001\u0000\u001a5\u0010\t\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\bø\u0001\u0000\u001a5\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\bø\u0001\u0000\u001a5\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\bø\u0001\u0000\u001a5\u0010\f\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\bø\u0001\u0000\u001aÉ\u0001\u0010\u0012\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Landroid/transition/Transition;", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "transition", "Lkotlin/m2;", "action", "Landroid/transition/Transition$TransitionListener;", "d", "g", "c", "f", "e", "onEnd", "onStart", "onCancel", "onResume", "onPause", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class a {

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.core.transition.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0052a extends Lambda implements l<Transition, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0052a f5213p = new C0052a();

        public C0052a() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Transition transition) {
            a(transition);
            return m2.f23662a;
        }

        public final void a(@d5.d Transition it) {
            l0.p(it, "it");
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends Lambda implements l<Transition, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f5214p = new b();

        public b() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Transition transition) {
            a(transition);
            return m2.f23662a;
        }

        public final void a(@d5.d Transition it) {
            l0.p(it, "it");
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class c extends Lambda implements l<Transition, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f5215p = new c();

        public c() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Transition transition) {
            a(transition);
            return m2.f23662a;
        }

        public final void a(@d5.d Transition it) {
            l0.p(it, "it");
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class d extends Lambda implements l<Transition, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f5216p = new d();

        public d() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Transition transition) {
            a(transition);
            return m2.f23662a;
        }

        public final void a(@d5.d Transition it) {
            l0.p(it, "it");
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/transition/Transition;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class e extends Lambda implements l<Transition, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final e f5217p = new e();

        public e() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Transition transition) {
            a(transition);
            return m2.f23662a;
        }

        public final void a(@d5.d Transition it) {
            l0.p(it, "it");
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/m2;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class f implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<Transition, m2> f5218a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Transition, m2> f5219b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Transition, m2> f5220c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l<Transition, m2> f5221d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ l<Transition, m2> f5222e;

        /* JADX WARN: Multi-variable type inference failed */
        public f(l<? super Transition, m2> lVar, l<? super Transition, m2> lVar2, l<? super Transition, m2> lVar3, l<? super Transition, m2> lVar4, l<? super Transition, m2> lVar5) {
            this.f5218a = lVar;
            this.f5219b = lVar2;
            this.f5220c = lVar3;
            this.f5221d = lVar4;
            this.f5222e = lVar5;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@d5.d Transition transition) {
            l0.p(transition, "transition");
            this.f5221d.N(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@d5.d Transition transition) {
            l0.p(transition, "transition");
            this.f5218a.N(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@d5.d Transition transition) {
            l0.p(transition, "transition");
            this.f5220c.N(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@d5.d Transition transition) {
            l0.p(transition, "transition");
            this.f5219b.N(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@d5.d Transition transition) {
            l0.p(transition, "transition");
            this.f5222e.N(transition);
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/m2;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class g implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f5223a;

        public g(l lVar) {
            this.f5223a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@d5.d Transition transition) {
            l0.p(transition, "transition");
            this.f5223a.N(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/m2;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class h implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f5224a;

        public h(l lVar) {
            this.f5224a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@d5.d Transition transition) {
            l0.p(transition, "transition");
            this.f5224a.N(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/m2;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class i implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f5225a;

        public i(l lVar) {
            this.f5225a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@d5.d Transition transition) {
            l0.p(transition, "transition");
            this.f5225a.N(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/m2;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class j implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f5226a;

        public j(l lVar) {
            this.f5226a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@d5.d Transition transition) {
            l0.p(transition, "transition");
            this.f5226a.N(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }
    }

    /* compiled from: Transition.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"androidx/core/transition/a$f", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lkotlin/m2;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class k implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f5227a;

        public k(l lVar) {
            this.f5227a = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@d5.d Transition transition) {
            l0.p(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@d5.d Transition transition) {
            l0.p(transition, "transition");
            this.f5227a.N(transition);
        }
    }

    @x0(19)
    @d5.d
    public static final Transition.TransitionListener a(@d5.d Transition transition, @d5.d l<? super Transition, m2> onEnd, @d5.d l<? super Transition, m2> onStart, @d5.d l<? super Transition, m2> onCancel, @d5.d l<? super Transition, m2> onResume, @d5.d l<? super Transition, m2> onPause) {
        l0.p(transition, "<this>");
        l0.p(onEnd, "onEnd");
        l0.p(onStart, "onStart");
        l0.p(onCancel, "onCancel");
        l0.p(onResume, "onResume");
        l0.p(onPause, "onPause");
        f fVar = new f(onEnd, onResume, onPause, onCancel, onStart);
        transition.addListener(fVar);
        return fVar;
    }

    public static /* synthetic */ Transition.TransitionListener b(Transition transition, l onEnd, l lVar, l lVar2, l onResume, l onPause, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            onEnd = C0052a.f5213p;
        }
        if ((i5 & 2) != 0) {
            lVar = b.f5214p;
        }
        l onStart = lVar;
        if ((i5 & 4) != 0) {
            lVar2 = c.f5215p;
        }
        l onCancel = lVar2;
        if ((i5 & 8) != 0) {
            onResume = d.f5216p;
        }
        if ((i5 & 16) != 0) {
            onPause = e.f5217p;
        }
        l0.p(transition, "<this>");
        l0.p(onEnd, "onEnd");
        l0.p(onStart, "onStart");
        l0.p(onCancel, "onCancel");
        l0.p(onResume, "onResume");
        l0.p(onPause, "onPause");
        f fVar = new f(onEnd, onResume, onPause, onCancel, onStart);
        transition.addListener(fVar);
        return fVar;
    }

    @x0(19)
    @d5.d
    public static final Transition.TransitionListener c(@d5.d Transition transition, @d5.d l<? super Transition, m2> action) {
        l0.p(transition, "<this>");
        l0.p(action, "action");
        g gVar = new g(action);
        transition.addListener(gVar);
        return gVar;
    }

    @x0(19)
    @d5.d
    public static final Transition.TransitionListener d(@d5.d Transition transition, @d5.d l<? super Transition, m2> action) {
        l0.p(transition, "<this>");
        l0.p(action, "action");
        h hVar = new h(action);
        transition.addListener(hVar);
        return hVar;
    }

    @x0(19)
    @d5.d
    public static final Transition.TransitionListener e(@d5.d Transition transition, @d5.d l<? super Transition, m2> action) {
        l0.p(transition, "<this>");
        l0.p(action, "action");
        i iVar = new i(action);
        transition.addListener(iVar);
        return iVar;
    }

    @x0(19)
    @d5.d
    public static final Transition.TransitionListener f(@d5.d Transition transition, @d5.d l<? super Transition, m2> action) {
        l0.p(transition, "<this>");
        l0.p(action, "action");
        j jVar = new j(action);
        transition.addListener(jVar);
        return jVar;
    }

    @x0(19)
    @d5.d
    public static final Transition.TransitionListener g(@d5.d Transition transition, @d5.d l<? super Transition, m2> action) {
        l0.p(transition, "<this>");
        l0.p(action, "action");
        k kVar = new k(action);
        transition.addListener(kVar);
        return kVar;
    }
}
