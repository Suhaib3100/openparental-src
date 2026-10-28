package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.d2;
import kotlin.Metadata;
import org.apache.http.HttpStatus;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a9\u0010\u0007\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\t\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a9\u0010\u000b\u001a\u00020\n*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\r\u0010\b\u001a9\u0010\u000e\u001a\u00020\u0005*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\b\u001a<\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0012\u001a\u00020\u000f2\b\b\u0003\u0010\u0013\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a<\u0010\u0018\u001a\u00020\u0005*\u00020\u00002\b\b\u0003\u0010\u0016\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000f2\b\b\u0003\u0010\u0017\u001a\u00020\u000f2\b\b\u0003\u0010\u0013\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u0018\u0010\u0015\u001a\u001e\u0010\u001a\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u000fH\u0086\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a,\u0010 \u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0086\b¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u001f*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e¢\u0006\u0004\b\"\u0010!\u001a\u001b\u0010&\u001a\u00020%*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'\u001a-\u0010+\u001a\u00020\u0005*\u00020\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b)H\u0086\b¢\u0006\u0004\b+\u0010\b\u001a9\u0010-\u001a\u00020\u0005\"\n\b\u0000\u0010,\u0018\u0001*\u00020(*\u00020\u00002\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b)H\u0087\b¢\u0006\u0004\b-\u0010\b\"*\u00104\u001a\u00020.*\u00020\u00002\u0006\u0010/\u001a\u00020.8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103\"*\u00107\u001a\u00020.*\u00020\u00002\u0006\u0010/\u001a\u00020.8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00101\"\u0004\b6\u00103\"*\u0010:\u001a\u00020.*\u00020\u00002\u0006\u0010/\u001a\u00020.8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00101\"\u0004\b9\u00103\"\u0016\u0010=\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b;\u0010<\"\u0016\u0010?\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b>\u0010<\"\u0016\u0010A\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b@\u0010<\"\u0016\u0010C\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bB\u0010<\"\u0016\u0010E\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bD\u0010<\"\u0016\u0010G\u001a\u00020\u000f*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\bF\u0010<\"\u001b\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bJ\u0010K\"\u001b\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00000H*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bM\u0010K¨\u0006O"}, d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Lkotlin/r0;", "name", "view", "Lkotlin/k2;", "action", "e", "(Landroid/view/View;Lld/l;)V", "d", "Landroidx/core/view/g1;", "f", "(Landroid/view/View;Lld/l;)Landroidx/core/view/g1;", "b", "c", "", "start", "top", "end", "bottom", "E", "(Landroid/view/View;IIII)V", "left", "right", "C", "size", "y", "(Landroid/view/View;I)V", "", "delayInMillis", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "t", "(Landroid/view/View;JLld/a;)Ljava/lang/Runnable;", "u", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "g", "(Landroid/view/View;Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "Landroid/view/ViewGroup$LayoutParams;", "Lkotlin/u;", "block", "A", "T", "B", "", "value", "s", "(Landroid/view/View;)Z", "z", "(Landroid/view/View;Z)V", "isVisible", "r", "x", "isInvisible", "q", "w", "isGone", "m", "(Landroid/view/View;)I", "marginLeft", "p", "marginTop", "n", "marginRight", "k", "marginBottom", "o", "marginStart", "l", "marginEnd", "Lkotlin/sequences/m;", "Landroid/view/ViewParent;", "j", "(Landroid/view/View;)Lkotlin/sequences/m;", "ancestors", "i", "allViews", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,415:1\n37#1,2:416\n55#1:418\n327#1,4:422\n42#2,3:419\n*S KotlinDebug\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt\n*L\n70#1:416,2\n70#1:418\n311#1:422,4\n233#1:419,3\n*E\n"})
/* loaded from: classes3.dex */
public final class f2 {

    /* compiled from: View.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {HttpStatus.SC_GONE, HttpStatus.SC_PRECONDITION_FAILED}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/o;", "Landroid/view/View;", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super View>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        int f27132c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f27133d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f27134e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f27134e = view;
        }

        @Override // ld.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.sequences.o<? super View> oVar, kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((a) create(oVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<kotlin.k2> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f27134e, dVar);
            aVar.f27133d = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.sequences.o oVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f27132c;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                oVar = (kotlin.sequences.o) this.f27133d;
                View view = this.f27134e;
                this.f27133d = oVar;
                this.f27132c = 1;
                if (oVar.b(view, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    return kotlin.k2.f75408a;
                }
                oVar = (kotlin.sequences.o) this.f27133d;
                kotlin.a1.n(obj);
            }
            View view2 = this.f27134e;
            if (view2 instanceof ViewGroup) {
                d2.d dVar = new d2.d((ViewGroup) view2);
                this.f27133d = null;
                this.f27132c = 2;
                if (oVar.e(dVar, this) == aVar) {
                    return aVar;
                }
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: View.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class b extends kotlin.jvm.internal.h0 implements ld.l<ViewParent, ViewParent> {

        /* renamed from: d, reason: collision with root package name */
        public static final b f27135d = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        public final ViewParent Z(ViewParent viewParent) {
            return viewParent.getParent();
        }

        @Override // ld.l
        public ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/core/view/f2$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lkotlin/k2;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f27136b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<View, kotlin.k2> f27137c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view, ld.l<? super View, kotlin.k2> lVar) {
            this.f27136b = view;
            this.f27137c = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f27136b.removeOnAttachStateChangeListener(this);
            this.f27137c.invoke(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/core/view/f2$d", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lkotlin/k2;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    public static final class d implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f27138b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<View, kotlin.k2> f27139c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(View view, ld.l<? super View, kotlin.k2> lVar) {
            this.f27138b = view;
            this.f27139c = lVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f27138b.removeOnAttachStateChangeListener(this);
            this.f27139c.invoke(view);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010¸\u0006\u0000"}, d2 = {"androidx/core/view/f2$f", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lkotlin/k2;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,52:1\n70#2:53\n*E\n"})
    public static final class e implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l f27140b;

        public e(ld.l lVar) {
            this.f27140b = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top2, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            this.f27140b.invoke(view);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/view/f2$f", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lkotlin/k2;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    public static final class f implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<View, kotlin.k2> f27141b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(ld.l<? super View, kotlin.k2> lVar) {
            this.f27141b = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int left, int top2, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            this.f27141b.invoke(view);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<View, kotlin.k2> f27142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f27143c;

        /* JADX WARN: Multi-variable type inference failed */
        public g(ld.l<? super View, kotlin.k2> lVar, View view) {
            this.f27142b = lVar;
            this.f27143c = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27142b.invoke(this.f27143c);
        }
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class h implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f27144b;

        public h(ld.a<kotlin.k2> aVar) {
            this.f27144b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27144b.invoke();
        }
    }

    public static final void A(@fg.l View view, @fg.l ld.l<? super ViewGroup.LayoutParams, kotlin.k2> lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @kd.i(name = "updateLayoutParamsTyped")
    public static final <T extends ViewGroup.LayoutParams> void B(View view, ld.l<? super T, kotlin.k2> lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.l0.P();
        lVar.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void C(@fg.l View view, @androidx.annotation.u0 int i4, @androidx.annotation.u0 int i5, @androidx.annotation.u0 int i6, @androidx.annotation.u0 int i7) {
        view.setPadding(i4, i5, i6, i7);
    }

    public static /* synthetic */ void D(View view, int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = view.getPaddingLeft();
        }
        if ((i10 & 2) != 0) {
            i5 = view.getPaddingTop();
        }
        if ((i10 & 4) != 0) {
            i6 = view.getPaddingRight();
        }
        if ((i10 & 8) != 0) {
            i7 = view.getPaddingBottom();
        }
        view.setPadding(i4, i5, i6, i7);
    }

    public static final void E(@fg.l View view, @androidx.annotation.u0 int i4, @androidx.annotation.u0 int i5, @androidx.annotation.u0 int i6, @androidx.annotation.u0 int i7) {
        view.setPaddingRelative(i4, i5, i6, i7);
    }

    public static /* synthetic */ void F(View view, int i4, int i5, int i6, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = view.getPaddingStart();
        }
        if ((i10 & 2) != 0) {
            i5 = view.getPaddingTop();
        }
        if ((i10 & 4) != 0) {
            i6 = view.getPaddingEnd();
        }
        if ((i10 & 8) != 0) {
            i7 = view.getPaddingBottom();
        }
        view.setPaddingRelative(i4, i5, i6, i7);
    }

    public static void a(ld.a aVar) {
        aVar.invoke();
    }

    public static final void b(@fg.l View view, @fg.l ld.l<? super View, kotlin.k2> lVar) {
        if (view.isAttachedToWindow()) {
            lVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new c(view, lVar));
        }
    }

    public static final void c(@fg.l View view, @fg.l ld.l<? super View, kotlin.k2> lVar) {
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new d(view, lVar));
        } else {
            lVar.invoke(view);
        }
    }

    public static final void d(@fg.l View view, @fg.l ld.l<? super View, kotlin.k2> lVar) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new e(lVar));
        } else {
            lVar.invoke(view);
        }
    }

    public static final void e(@fg.l View view, @fg.l ld.l<? super View, kotlin.k2> lVar) {
        view.addOnLayoutChangeListener(new f(lVar));
    }

    @fg.l
    public static final g1 f(@fg.l View view, @fg.l ld.l<? super View, kotlin.k2> lVar) {
        return g1.a(view, new g(lVar, view));
    }

    @fg.l
    public static final Bitmap g(@fg.l View view, @fg.l Bitmap.Config config) {
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap h(View view, Bitmap.Config config, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return g(view, config);
    }

    @fg.l
    public static final kotlin.sequences.m<View> i(@fg.l View view) {
        return kotlin.sequences.p.b(new a(view, null));
    }

    @fg.l
    public static final kotlin.sequences.m<ViewParent> j(@fg.l View view) {
        return kotlin.sequences.p.l(view.getParent(), b.f27135d);
    }

    public static final int k(@fg.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int l(@fg.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        return 0;
    }

    public static final int m(@fg.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int n(@fg.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int o(@fg.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        }
        return 0;
    }

    public static final int p(@fg.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean q(@fg.l View view) {
        return view.getVisibility() == 8;
    }

    public static final boolean r(@fg.l View view) {
        return view.getVisibility() == 4;
    }

    public static final boolean s(@fg.l View view) {
        return view.getVisibility() == 0;
    }

    @fg.l
    public static final Runnable t(@fg.l View view, long j4, @fg.l ld.a<kotlin.k2> aVar) {
        h hVar = new h(aVar);
        view.postDelayed(hVar, j4);
        return hVar;
    }

    @fg.l
    public static final Runnable u(@fg.l View view, long j4, @fg.l final ld.a<kotlin.k2> aVar) {
        Runnable runnable = new Runnable() { // from class: androidx.core.view.e2
            @Override // java.lang.Runnable
            public final void run() {
                ld.a.this.invoke();
            }
        };
        view.postOnAnimationDelayed(runnable, j4);
        return runnable;
    }

    private static final void v(ld.a aVar) {
        aVar.invoke();
    }

    public static final void w(@fg.l View view, boolean z4) {
        view.setVisibility(z4 ? 8 : 0);
    }

    public static final void x(@fg.l View view, boolean z4) {
        view.setVisibility(z4 ? 4 : 0);
    }

    public static final void y(@fg.l View view, @androidx.annotation.u0 int i4) {
        view.setPadding(i4, i4, i4, i4);
    }

    public static final void z(@fg.l View view, boolean z4) {
        view.setVisibility(z4 ? 0 : 8);
    }
}
