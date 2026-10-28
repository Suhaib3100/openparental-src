package androidx.view;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.x0;
import androidx.view.Activity;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.channels.z;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import ld.p;

/* compiled from: PipHintTracker.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Landroid/app/Activity;", "Landroid/view/View;", "view", "Lkotlin/k2;", "b", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/d;)Ljava/lang/Object;", "activity-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.activity.g0, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class Activity {

    /* compiled from: PipHintTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Rect;", "hint", "Lkotlin/k2;", "a", "(Landroid/graphics/Rect;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.g0$a, reason: from Kotlin metadata */
    static final class Rect<T> implements j {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f534b;

        Rect(android.app.Activity activity) {
            this.f534b = activity;
        }

        @Override // kotlinx.coroutines.flow.j
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(@l android.graphics.Rect rect, @l d<? super k2> dVar) {
            c.f434a.a(this.f534b, rect);
            return k2.f75408a;
        }
    }

    /* compiled from: PipHintTracker.kt */
    @f(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/b0;", "Landroid/graphics/Rect;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.activity.g0$b */
    static final class b extends o implements p<b0<? super android.graphics.Rect>, d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f535b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f536c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f537d;

        /* compiled from: PipHintTracker.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.activity.g0$b$a */
        static final class a extends n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f538b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f539c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ View.OnLayoutChangeListener f540d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0006b f541e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, ViewOnAttachStateChangeListenerC0006b viewOnAttachStateChangeListenerC0006b) {
                super(0);
                this.f538b = view;
                this.f539c = onScrollChangedListener;
                this.f540d = onLayoutChangeListener;
                this.f541e = viewOnAttachStateChangeListenerC0006b;
            }

            public final void a() {
                this.f538b.getViewTreeObserver().removeOnScrollChangedListener(this.f539c);
                this.f538b.removeOnLayoutChangeListener(this.f540d);
                this.f538b.removeOnAttachStateChangeListener(this.f541e);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* compiled from: PipHintTracker.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/activity/g0$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lkotlin/k2;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "activity-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.activity.g0$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0006b implements View.OnAttachStateChangeListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0<android.graphics.Rect> f542b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f543c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f544d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ View.OnLayoutChangeListener f545e;

            /* JADX WARN: Multi-variable type inference failed */
            ViewOnAttachStateChangeListenerC0006b(b0<? super android.graphics.Rect> b0Var, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
                this.f542b = b0Var;
                this.f543c = view;
                this.f544d = onScrollChangedListener;
                this.f545e = onLayoutChangeListener;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@l View v4) {
                this.f542b.M(Activity.c(this.f543c));
                this.f543c.getViewTreeObserver().addOnScrollChangedListener(this.f544d);
                this.f543c.addOnLayoutChangeListener(this.f545e);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@l View v4) {
                v4.getViewTreeObserver().removeOnScrollChangedListener(this.f544d);
                v4.removeOnLayoutChangeListener(this.f545e);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view, d<? super b> dVar) {
            super(2, dVar);
            this.f537d = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(b0 b0Var, View view, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
            if (i4 == i10 && i6 == i12 && i5 == i11 && i7 == i13) {
                return;
            }
            b0Var.M(Activity.c(view));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(b0 b0Var, View view) {
            b0Var.M(Activity.c(view));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final d<k2> create(@m Object obj, @l d<?> dVar) {
            b bVar = new b(this.f537d, dVar);
            bVar.f536c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f535b;
            if (i4 == 0) {
                a1.n(obj);
                final b0 b0Var = (b0) this.f536c;
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.h0
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i5, int i6, int i7, int i10, int i11, int i12, int i13, int i14) {
                        Activity.b.n(b0.this, view, i5, i6, i7, i10, i11, i12, i13, i14);
                    }
                };
                final View view = this.f537d;
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.i0
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final void onScrollChanged() {
                        Activity.b.q(b0.this, view);
                    }
                };
                ViewOnAttachStateChangeListenerC0006b viewOnAttachStateChangeListenerC0006b = new ViewOnAttachStateChangeListenerC0006b(b0Var, this.f537d, onScrollChangedListener, onLayoutChangeListener);
                androidx.view.b bVar = androidx.view.b.f433a;
                View view2 = this.f537d;
                bVar.getClass();
                if (view2.isAttachedToWindow()) {
                    b0Var.M(Activity.c(this.f537d));
                    this.f537d.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    this.f537d.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                this.f537d.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0006b);
                a aVar2 = new a(this.f537d, onScrollChangedListener, onLayoutChangeListener, viewOnAttachStateChangeListenerC0006b);
                this.f535b = 1;
                if (z.a(b0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l b0<? super android.graphics.Rect> b0Var, @m d<? super k2> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    @m
    @x0(26)
    public static final Object b(@l android.app.Activity activity, @l View view, @l d<? super k2> dVar) {
        Object a5 = k.s(new b(view, null)).a(new Rect(activity), dVar);
        return a5 == a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Rect c(View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
