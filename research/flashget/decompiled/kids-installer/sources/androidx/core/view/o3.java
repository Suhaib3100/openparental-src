package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.i0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\u0007\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\n\u001a\u00020\t*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\u000b\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\f\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\bø\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0010\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\u0087\b\u001a5\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0013\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0014\u001a\u00020\r2\b\b\u0003\u0010\u0011\u001a\u00020\rH\u0086\b\u001a\u0017\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\rH\u0086\b\u001a(\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0086\bø\u0001\u0000\u001a(\u0010\u001d\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0087\bø\u0001\u0000\u001a\u0014\u0010!\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a)\u0010%\u001a\u00020\u0005*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\u0086\bø\u0001\u0000\u001a<\u0010'\u001a\u00020\u0005\"\n\b\u0000\u0010&\u0018\u0001*\u00020\"*\u00020\u00002\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b#H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\"*\u0010/\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\"*\u00102\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.\"*\u00105\u001a\u00020)*\u00020\u00002\u0006\u0010*\u001a\u00020)8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.\"\u0016\u00108\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0016\u0010:\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b9\u00107\"\u0016\u0010<\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b;\u00107\"\u0016\u0010>\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b=\u00107\"\u0016\u0010@\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b?\u00107\"\u0016\u0010B\u001a\u00020\r*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bA\u00107\"\u001b\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bE\u0010F\"\u001b\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000C*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bH\u0010F\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006J"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "view", "Lkotlin/m2;", "action", "d", "c", "Landroidx/core/view/r1;", "e", "a", "b", "", "start", "top", "end", "bottom", "C", "left", "right", "A", "size", "w", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "s", "t", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "f", "Landroid/view/ViewGroup$LayoutParams;", "Lkotlin/u;", "block", "y", "T", "z", "(Landroid/view/View;Lq3/l;)V", "", "value", "r", "(Landroid/view/View;)Z", "x", "(Landroid/view/View;Z)V", "isVisible", "q", "v", "isInvisible", "p", "u", "isGone", "l", "(Landroid/view/View;)I", "marginLeft", "o", "marginTop", "m", "marginRight", "j", "marginBottom", "n", "marginStart", "k", "marginEnd", "Lkotlin/sequences/m;", "Landroid/view/ViewParent;", "i", "(Landroid/view/View;)Lkotlin/sequences/m;", "ancestors", "h", "allViews", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class o3 {

    /* compiled from: View.kt */
    @DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {406, 408}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/sequences/o;", "Landroid/view/View;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes4.dex */
    static final class a extends RestrictedSuspendLambda implements q3.p<SequenceScope<? super View>, Continuation<? super kotlin.m2>, Object> {

        /* renamed from: q, reason: collision with root package name */
        int f5618q;

        /* renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f5619r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f5620s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5620s = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            SequenceScope sequenceScope;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f5618q;
            if (i5 == 0) {
                kotlin.a1.n(obj);
                sequenceScope = (SequenceScope) this.f5619r;
                View view = this.f5620s;
                this.f5619r = sequenceScope;
                this.f5618q = 1;
                if (sequenceScope.f(view, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    return kotlin.m2.f23662a;
                }
                sequenceScope = (SequenceScope) this.f5619r;
                kotlin.a1.n(obj);
            }
            View view2 = this.f5620s;
            if (view2 instanceof ViewGroup) {
                Sequence<View> f6 = n3.f((ViewGroup) view2);
                this.f5619r = null;
                this.f5618q = 2;
                if (sequenceScope.j(f6, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return kotlin.m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d SequenceScope<? super View> sequenceScope, @d5.e Continuation<? super kotlin.m2> continuation) {
            return ((a) c(sequenceScope, continuation)).A(kotlin.m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<kotlin.m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            a aVar = new a(this.f5620s, continuation);
            aVar.f5619r = obj;
            return aVar;
        }
    }

    /* compiled from: View.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class b extends kotlin.jvm.internal.h0 implements q3.l<ViewParent, ViewParent> {

        /* renamed from: x, reason: collision with root package name */
        public static final b f5621x = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // q3.l
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final ViewParent N(@d5.d ViewParent p02) {
            kotlin.jvm.internal.l0.p(p02, "p0");
            return p02.getParent();
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/core/view/o3$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lkotlin/m2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f5622o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.l<View, kotlin.m2> f5623p;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, q3.l<? super View, kotlin.m2> lVar) {
            this.f5622o = view;
            this.f5623p = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@d5.d View view) {
            kotlin.jvm.internal.l0.p(view, "view");
            this.f5622o.removeOnAttachStateChangeListener(this);
            this.f5623p.N(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@d5.d View view) {
            kotlin.jvm.internal.l0.p(view, "view");
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/core/view/o3$d", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lkotlin/m2;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class d implements View.OnAttachStateChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ View f5624o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.l<View, kotlin.m2> f5625p;

        /* JADX WARN: Multi-variable type inference failed */
        public d(View view, q3.l<? super View, kotlin.m2> lVar) {
            this.f5624o = view;
            this.f5625p = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@d5.d View view) {
            kotlin.jvm.internal.l0.p(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@d5.d View view) {
            kotlin.jvm.internal.l0.p(view, "view");
            this.f5624o.removeOnAttachStateChangeListener(this);
            this.f5625p.N(view);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/view/o3$f", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lkotlin/m2;", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.l f5626o;

        public e(q3.l lVar) {
            this.f5626o = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@d5.d View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            kotlin.jvm.internal.l0.p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f5626o.N(view);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"androidx/core/view/o3$f", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lkotlin/m2;", "onLayoutChange", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class f implements View.OnLayoutChangeListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.l<View, kotlin.m2> f5627o;

        /* JADX WARN: Multi-variable type inference failed */
        public f(q3.l<? super View, kotlin.m2> lVar) {
            this.f5627o = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@d5.d View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            kotlin.jvm.internal.l0.p(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f5627o.N(view);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.l<View, kotlin.m2> f5628o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ View f5629p;

        /* JADX WARN: Multi-variable type inference failed */
        public g(q3.l<? super View, kotlin.m2> lVar, View view) {
            this.f5628o = lVar;
            this.f5629p = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5628o.N(this.f5629p);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.a<kotlin.m2> f5630o;

        public h(q3.a<kotlin.m2> aVar) {
            this.f5630o = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5630o.n();
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.a<kotlin.m2> f5631o;

        public i(q3.a<kotlin.m2> aVar) {
            this.f5631o = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5631o.n();
        }
    }

    public static final void A(@d5.d View view, @androidx.annotation.u0 int i5, @androidx.annotation.u0 int i6, @androidx.annotation.u0 int i7, @androidx.annotation.u0 int i8) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        view.setPadding(i5, i6, i7, i8);
    }

    public static /* synthetic */ void B(View view, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = view.getPaddingLeft();
        }
        if ((i9 & 2) != 0) {
            i6 = view.getPaddingTop();
        }
        if ((i9 & 4) != 0) {
            i7 = view.getPaddingRight();
        }
        if ((i9 & 8) != 0) {
            i8 = view.getPaddingBottom();
        }
        kotlin.jvm.internal.l0.p(view, "<this>");
        view.setPadding(i5, i6, i7, i8);
    }

    @androidx.annotation.x0(17)
    public static final void C(@d5.d View view, @androidx.annotation.u0 int i5, @androidx.annotation.u0 int i6, @androidx.annotation.u0 int i7, @androidx.annotation.u0 int i8) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        view.setPaddingRelative(i5, i6, i7, i8);
    }

    public static /* synthetic */ void D(View view, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = view.getPaddingStart();
        }
        if ((i9 & 2) != 0) {
            i6 = view.getPaddingTop();
        }
        if ((i9 & 4) != 0) {
            i7 = view.getPaddingEnd();
        }
        if ((i9 & 8) != 0) {
            i8 = view.getPaddingBottom();
        }
        kotlin.jvm.internal.l0.p(view, "<this>");
        view.setPaddingRelative(i5, i6, i7, i8);
    }

    public static final void a(@d5.d View view, @d5.d q3.l<? super View, kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        if (y1.O0(view)) {
            action.N(view);
        } else {
            view.addOnAttachStateChangeListener(new c(view, action));
        }
    }

    public static final void b(@d5.d View view, @d5.d q3.l<? super View, kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        if (y1.O0(view)) {
            view.addOnAttachStateChangeListener(new d(view, action));
        } else {
            action.N(view);
        }
    }

    public static final void c(@d5.d View view, @d5.d q3.l<? super View, kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        if (!y1.U0(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new e(action));
        } else {
            action.N(view);
        }
    }

    public static final void d(@d5.d View view, @d5.d q3.l<? super View, kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        view.addOnLayoutChangeListener(new f(action));
    }

    @d5.d
    public static final r1 e(@d5.d View view, @d5.d q3.l<? super View, kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        r1 a6 = r1.a(view, new g(action, view));
        kotlin.jvm.internal.l0.o(a6, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return a6;
    }

    @d5.d
    public static final Bitmap f(@d5.d View view, @d5.d Bitmap.Config config) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        kotlin.jvm.internal.l0.p(config, "config");
        if (!y1.U0(view)) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        kotlin.jvm.internal.l0.o(createBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap g(View view, Bitmap.Config config, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return f(view, config);
    }

    @d5.d
    public static final Sequence<View> h(@d5.d View view) {
        Sequence<View> b6;
        kotlin.jvm.internal.l0.p(view, "<this>");
        b6 = kotlin.sequences.q.b(new a(view, null));
        return b6;
    }

    @d5.d
    public static final Sequence<ViewParent> i(@d5.d View view) {
        Sequence<ViewParent> l5;
        kotlin.jvm.internal.l0.p(view, "<this>");
        l5 = kotlin.sequences.s.l(view.getParent(), b.f5621x);
        return l5;
    }

    public static final int j(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return 0;
        }
        return marginLayoutParams.bottomMargin;
    }

    public static final int k(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return i0.a.b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int l(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return 0;
        }
        return marginLayoutParams.leftMargin;
    }

    public static final int m(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return 0;
        }
        return marginLayoutParams.rightMargin;
    }

    public static final int n(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return i0.a.c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int o(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return 0;
        }
        return marginLayoutParams.topMargin;
    }

    public static final boolean p(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean q(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final boolean r(@d5.d View view) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        return view.getVisibility() == 0;
    }

    @d5.d
    public static final Runnable s(@d5.d View view, long j5, @d5.d q3.a<kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        h hVar = new h(action);
        view.postDelayed(hVar, j5);
        return hVar;
    }

    @androidx.annotation.x0(16)
    @d5.d
    public static final Runnable t(@d5.d View view, long j5, @d5.d q3.a<kotlin.m2> action) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        kotlin.jvm.internal.l0.p(action, "action");
        i iVar = new i(action);
        view.postOnAnimationDelayed(iVar, j5);
        return iVar;
    }

    public static final void u(@d5.d View view, boolean z5) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        view.setVisibility(z5 ? 8 : 0);
    }

    public static final void v(@d5.d View view, boolean z5) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        view.setVisibility(z5 ? 4 : 0);
    }

    public static final void w(@d5.d View view, @androidx.annotation.u0 int i5) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        view.setPadding(i5, i5, i5, i5);
    }

    public static final void x(@d5.d View view, boolean z5) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        view.setVisibility(z5 ? 0 : 8);
    }

    public static final void y(@d5.d View view, @d5.d q3.l<? super ViewGroup.LayoutParams, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        block.N(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @p3.i(name = "updateLayoutParamsTyped")
    public static final <T extends ViewGroup.LayoutParams> void z(View view, q3.l<? super T, kotlin.m2> block) {
        kotlin.jvm.internal.l0.p(view, "<this>");
        kotlin.jvm.internal.l0.p(block, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.l0.P();
        block.N(layoutParams);
        view.setLayoutParams(layoutParams);
    }
}
