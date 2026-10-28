package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: Animator.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a5\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\t\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\r\u001a\u00020\f*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\bø\u0001\u0000\u001a5\u0010\u000e\u001a\u00020\f*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\bø\u0001\u0000\u001a¤\u0001\u0010\u0013\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001aZ\u0010\u0016\u001a\u00020\f*\u00020\u00002#\b\u0006\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"Landroid/animation/Animator;", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "animator", "Lkotlin/m2;", "action", "Landroid/animation/Animator$AnimatorListener;", "f", "j", "e", "h", "Landroid/animation/Animator$AnimatorPauseListener;", "i", "g", "onEnd", "onStart", "onCancel", "onRepeat", "a", "onResume", "onPause", "c", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class a {

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: androidx.core.animation.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0026a extends Lambda implements q3.l<Animator, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final C0026a f3952p = new C0026a();

        public C0026a() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Animator animator) {
            a(animator);
            return m2.f23662a;
        }

        public final void a(@d5.d Animator it) {
            l0.p(it, "it");
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends Lambda implements q3.l<Animator, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final b f3953p = new b();

        public b() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Animator animator) {
            a(animator);
            return m2.f23662a;
        }

        public final void a(@d5.d Animator it) {
            l0.p(it, "it");
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class c extends Lambda implements q3.l<Animator, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final c f3954p = new c();

        public c() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Animator animator) {
            a(animator);
            return m2.f23662a;
        }

        public final void a(@d5.d Animator it) {
            l0.p(it, "it");
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class d extends Lambda implements q3.l<Animator, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f3955p = new d();

        public d() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Animator animator) {
            a(animator);
            return m2.f23662a;
        }

        public final void a(@d5.d Animator it) {
            l0.p(it, "it");
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/a$e", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/m2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.l<Animator, m2> f3956a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3.l<Animator, m2> f3957b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q3.l<Animator, m2> f3958c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q3.l<Animator, m2> f3959d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(q3.l<? super Animator, m2> lVar, q3.l<? super Animator, m2> lVar2, q3.l<? super Animator, m2> lVar3, q3.l<? super Animator, m2> lVar4) {
            this.f3956a = lVar;
            this.f3957b = lVar2;
            this.f3958c = lVar3;
            this.f3959d = lVar4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3958c.N(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3957b.N(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3956a.N(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3959d.N(animator);
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class f extends Lambda implements q3.l<Animator, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final f f3960p = new f();

        public f() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Animator animator) {
            a(animator);
            return m2.f23662a;
        }

        public final void a(@d5.d Animator it) {
            l0.p(it, "it");
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/animation/Animator;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class g extends Lambda implements q3.l<Animator, m2> {

        /* renamed from: p, reason: collision with root package name */
        public static final g f3961p = new g();

        public g() {
            super(1);
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Animator animator) {
            a(animator);
            return m2.f23662a;
        }

        public final void a(@d5.d Animator it) {
            l0.p(it, "it");
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/core/animation/a$h", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/m2;", "onAnimationPause", "onAnimationResume", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class h implements Animator.AnimatorPauseListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.l<Animator, m2> f3962a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3.l<Animator, m2> f3963b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(q3.l<? super Animator, m2> lVar, q3.l<? super Animator, m2> lVar2) {
            this.f3962a = lVar;
            this.f3963b = lVar2;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3962a.N(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3963b.N(animator);
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/a$e", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/m2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class i implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.l f3964a;

        public i(q3.l lVar) {
            this.f3964a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3964a.N(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/a$e", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/m2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class j implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.l f3965a;

        public j(q3.l lVar) {
            this.f3965a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3965a.N(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"androidx/core/animation/a$h", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/m2;", "onAnimationPause", "onAnimationResume", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class k implements Animator.AnimatorPauseListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.l f3966a;

        public k(q3.l lVar) {
            this.f3966a = lVar;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3966a.N(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/a$e", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/m2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class l implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.l f3967a;

        public l(q3.l lVar) {
            this.f3967a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3967a.N(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"androidx/core/animation/a$h", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/m2;", "onAnimationPause", "onAnimationResume", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class m implements Animator.AnimatorPauseListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.l f3968a;

        public m(q3.l lVar) {
            this.f3968a = lVar;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3968a.N(animator);
        }
    }

    /* compiled from: Animator.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"androidx/core/animation/a$e", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "Lkotlin/m2;", "onAnimationRepeat", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class n implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q3.l f3969a;

        public n(q3.l lVar) {
            this.f3969a = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@d5.d Animator animator) {
            l0.p(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@d5.d Animator animator) {
            l0.p(animator, "animator");
            this.f3969a.N(animator);
        }
    }

    @d5.d
    public static final Animator.AnimatorListener a(@d5.d Animator animator, @d5.d q3.l<? super Animator, m2> onEnd, @d5.d q3.l<? super Animator, m2> onStart, @d5.d q3.l<? super Animator, m2> onCancel, @d5.d q3.l<? super Animator, m2> onRepeat) {
        l0.p(animator, "<this>");
        l0.p(onEnd, "onEnd");
        l0.p(onStart, "onStart");
        l0.p(onCancel, "onCancel");
        l0.p(onRepeat, "onRepeat");
        e eVar = new e(onRepeat, onEnd, onCancel, onStart);
        animator.addListener(eVar);
        return eVar;
    }

    public static /* synthetic */ Animator.AnimatorListener b(Animator animator, q3.l onEnd, q3.l onStart, q3.l onCancel, q3.l onRepeat, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            onEnd = C0026a.f3952p;
        }
        if ((i5 & 2) != 0) {
            onStart = b.f3953p;
        }
        if ((i5 & 4) != 0) {
            onCancel = c.f3954p;
        }
        if ((i5 & 8) != 0) {
            onRepeat = d.f3955p;
        }
        l0.p(animator, "<this>");
        l0.p(onEnd, "onEnd");
        l0.p(onStart, "onStart");
        l0.p(onCancel, "onCancel");
        l0.p(onRepeat, "onRepeat");
        e eVar = new e(onRepeat, onEnd, onCancel, onStart);
        animator.addListener(eVar);
        return eVar;
    }

    @x0(19)
    @d5.d
    public static final Animator.AnimatorPauseListener c(@d5.d Animator animator, @d5.d q3.l<? super Animator, m2> onResume, @d5.d q3.l<? super Animator, m2> onPause) {
        l0.p(animator, "<this>");
        l0.p(onResume, "onResume");
        l0.p(onPause, "onPause");
        h hVar = new h(onPause, onResume);
        animator.addPauseListener(hVar);
        return hVar;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener d(Animator animator, q3.l onResume, q3.l onPause, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            onResume = f.f3960p;
        }
        if ((i5 & 2) != 0) {
            onPause = g.f3961p;
        }
        l0.p(animator, "<this>");
        l0.p(onResume, "onResume");
        l0.p(onPause, "onPause");
        h hVar = new h(onPause, onResume);
        animator.addPauseListener(hVar);
        return hVar;
    }

    @d5.d
    public static final Animator.AnimatorListener e(@d5.d Animator animator, @d5.d q3.l<? super Animator, m2> action) {
        l0.p(animator, "<this>");
        l0.p(action, "action");
        i iVar = new i(action);
        animator.addListener(iVar);
        return iVar;
    }

    @d5.d
    public static final Animator.AnimatorListener f(@d5.d Animator animator, @d5.d q3.l<? super Animator, m2> action) {
        l0.p(animator, "<this>");
        l0.p(action, "action");
        j jVar = new j(action);
        animator.addListener(jVar);
        return jVar;
    }

    @x0(19)
    @d5.d
    public static final Animator.AnimatorPauseListener g(@d5.d Animator animator, @d5.d q3.l<? super Animator, m2> action) {
        l0.p(animator, "<this>");
        l0.p(action, "action");
        k kVar = new k(action);
        animator.addPauseListener(kVar);
        return kVar;
    }

    @d5.d
    public static final Animator.AnimatorListener h(@d5.d Animator animator, @d5.d q3.l<? super Animator, m2> action) {
        l0.p(animator, "<this>");
        l0.p(action, "action");
        l lVar = new l(action);
        animator.addListener(lVar);
        return lVar;
    }

    @x0(19)
    @d5.d
    public static final Animator.AnimatorPauseListener i(@d5.d Animator animator, @d5.d q3.l<? super Animator, m2> action) {
        l0.p(animator, "<this>");
        l0.p(action, "action");
        m mVar = new m(action);
        animator.addPauseListener(mVar);
        return mVar;
    }

    @d5.d
    public static final Animator.AnimatorListener j(@d5.d Animator animator, @d5.d q3.l<? super Animator, m2> action) {
        l0.p(animator, "<this>");
        l0.p(action, "action");
        n nVar = new n(action);
        animator.addListener(nVar);
        return nVar;
    }
}
