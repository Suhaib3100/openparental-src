package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.o5;
import androidx.view.AbstractC1450w;
import androidx.view.C1442q1;
import androidx.view.InterfaceC1423e0;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u00062\u00020\u0001:\u0005\u0006\b\t\n\u000bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/o5;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lld/a;", "b", "c", "d", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface o5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f20055a;

    /* compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/o5$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/o5;", "a", "()Landroidx/compose/ui/platform/o5;", "Default", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.o5$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f20055a = new Companion();

        private Companion() {
        }

        @fg.l
        public final o5 a() {
            return c.f20061b;
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/o5$b;", "Landroidx/compose/ui/platform/o5;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lld/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements o5 {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final b f20056b = new b();

        /* renamed from: c, reason: collision with root package name */
        public static final int f20057c = 0;

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f20058b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0366b f20059c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractComposeView abstractComposeView, ViewOnAttachStateChangeListenerC0366b viewOnAttachStateChangeListenerC0366b) {
                super(0);
                this.f20058b = abstractComposeView;
                this.f20059c = viewOnAttachStateChangeListenerC0366b;
            }

            public final void a() {
                this.f20058b.removeOnAttachStateChangeListener(this.f20059c);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/o5$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lkotlin/k2;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.o5$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC0366b implements View.OnAttachStateChangeListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f20060b;

            ViewOnAttachStateChangeListenerC0366b(AbstractComposeView abstractComposeView) {
                this.f20060b = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@fg.l View v4) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@fg.l View v4) {
                this.f20060b.i();
            }
        }

        private b() {
        }

        @Override // androidx.compose.ui.platform.o5
        @fg.l
        public ld.a<kotlin.k2> a(@fg.l AbstractComposeView view) {
            ViewOnAttachStateChangeListenerC0366b viewOnAttachStateChangeListenerC0366b = new ViewOnAttachStateChangeListenerC0366b(view);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0366b);
            return new a(view, viewOnAttachStateChangeListenerC0366b);
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/o5$c;", "Landroidx/compose/ui/platform/o5;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lld/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements o5 {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final c f20061b = new c();

        /* renamed from: c, reason: collision with root package name */
        public static final int f20062c = 0;

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f20063b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f20064c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.customview.poolingcontainer.b f20065d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractComposeView abstractComposeView, b bVar, androidx.customview.poolingcontainer.b bVar2) {
                super(0);
                this.f20063b = abstractComposeView;
                this.f20064c = bVar;
                this.f20065d = bVar2;
            }

            public final void a() {
                this.f20063b.removeOnAttachStateChangeListener(this.f20064c);
                androidx.customview.poolingcontainer.a.g(this.f20063b, this.f20065d);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/o5$c$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lkotlin/k2;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements View.OnAttachStateChangeListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f20066b;

            b(AbstractComposeView abstractComposeView) {
                this.f20066b = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@fg.l View v4) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@fg.l View v4) {
                if (androidx.customview.poolingcontainer.a.f(this.f20066b)) {
                    return;
                }
                this.f20066b.i();
            }
        }

        private c() {
        }

        public static void b(AbstractComposeView abstractComposeView) {
            abstractComposeView.i();
        }

        private static final void c(AbstractComposeView abstractComposeView) {
            abstractComposeView.i();
        }

        @Override // androidx.compose.ui.platform.o5
        @fg.l
        public ld.a<kotlin.k2> a(@fg.l final AbstractComposeView view) {
            b bVar = new b(view);
            view.addOnAttachStateChangeListener(bVar);
            androidx.customview.poolingcontainer.b bVar2 = new androidx.customview.poolingcontainer.b() { // from class: androidx.compose.ui.platform.p5
                @Override // androidx.customview.poolingcontainer.b
                public final void e() {
                    o5.c.b(AbstractComposeView.this);
                }
            };
            androidx.customview.poolingcontainer.a.a(view, bVar2);
            return new a(view, bVar, bVar2);
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/o5$e;", "Landroidx/compose/ui/platform/o5;", "<init>", "()V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lld/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements o5 {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final e f20069b = new e();

        /* renamed from: c, reason: collision with root package name */
        public static final int f20070c = 0;

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f20071b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f20072c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractComposeView abstractComposeView, c cVar) {
                super(0);
                this.f20071b = abstractComposeView;
                this.f20072c = cVar;
            }

            public final void a() {
                this.f20071b.removeOnAttachStateChangeListener(this.f20072c);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k1.h<ld.a<kotlin.k2>> f20073b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(k1.h<ld.a<kotlin.k2>> hVar) {
                super(0);
                this.f20073b = hVar;
            }

            public final void a() {
                this.f20073b.f75329b.invoke();
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/o5$e$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lkotlin/k2;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c implements View.OnAttachStateChangeListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractComposeView f20074b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1.h<ld.a<kotlin.k2>> f20075c;

            c(AbstractComposeView abstractComposeView, k1.h<ld.a<kotlin.k2>> hVar) {
                this.f20074b = abstractComposeView;
                this.f20075c = hVar;
            }

            /* JADX WARN: Type inference failed for: r3v7, types: [T, ld.a] */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@fg.l View v4) {
                ?? c5;
                InterfaceC1423e0 a5 = C1442q1.a(this.f20074b);
                AbstractComposeView abstractComposeView = this.f20074b;
                if (a5 == null) {
                    throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
                }
                k1.h<ld.a<kotlin.k2>> hVar = this.f20075c;
                c5 = r5.c(abstractComposeView, a5.getLifecycle());
                hVar.f75329b = c5;
                this.f20074b.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@fg.l View v4) {
            }
        }

        private e() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.o5$e$a] */
        @Override // androidx.compose.ui.platform.o5
        @fg.l
        public ld.a<kotlin.k2> a(@fg.l AbstractComposeView view) {
            ld.a<kotlin.k2> c5;
            if (!view.isAttachedToWindow()) {
                k1.h hVar = new k1.h();
                c cVar = new c(view, hVar);
                view.addOnAttachStateChangeListener(cVar);
                hVar.f75329b = new a(view, cVar);
                return new b(hVar);
            }
            InterfaceC1423e0 a5 = C1442q1.a(view);
            if (a5 != null) {
                c5 = r5.c(view, a5.getLifecycle());
                return c5;
            }
            throw new IllegalStateException(("View tree for " + view + " has no ViewTreeLifecycleOwner").toString());
        }
    }

    @fg.l
    ld.a<kotlin.k2> a(@fg.l AbstractComposeView view);

    /* compiled from: ViewCompositionStrategy.android.kt */
    @androidx.compose.runtime.internal.u(parameters = 0)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/o5$d;", "Landroidx/compose/ui/platform/o5;", "Landroidx/lifecycle/w;", "lifecycle", "<init>", "(Landroidx/lifecycle/w;)V", "Landroidx/lifecycle/e0;", "lifecycleOwner", "(Landroidx/lifecycle/e0;)V", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lld/a;", "b", "Landroidx/lifecycle/w;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements o5 {

        /* renamed from: c, reason: collision with root package name */
        public static final int f20067c = 8;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final AbstractC1450w lifecycle;

        public d(@fg.l AbstractC1450w abstractC1450w) {
            this.lifecycle = abstractC1450w;
        }

        @Override // androidx.compose.ui.platform.o5
        @fg.l
        public ld.a<kotlin.k2> a(@fg.l AbstractComposeView view) {
            ld.a<kotlin.k2> c5;
            c5 = r5.c(view, this.lifecycle);
            return c5;
        }

        public d(@fg.l InterfaceC1423e0 interfaceC1423e0) {
            this(interfaceC1423e0.getLifecycle());
        }
    }
}
