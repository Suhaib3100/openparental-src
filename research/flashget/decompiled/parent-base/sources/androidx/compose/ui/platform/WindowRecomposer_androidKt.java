package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.t;
import androidx.view.AbstractC1450w;
import androidx.view.C1442q1;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlinx.coroutines.flow.o0;

/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0011\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\",\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0003\"\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001c\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001e\u0010!\u001a\u00020\u000e*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroid/view/View;", "Landroidx/compose/runtime/z;", "d", "(Landroid/view/View;)Landroidx/compose/runtime/z;", "Landroid/content/Context;", "applicationContext", "Lkotlinx/coroutines/flow/t0;", "", "e", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/t0;", "Lkotlin/coroutines/g;", "coroutineContext", "Landroidx/lifecycle/w;", "lifecycle", "Landroidx/compose/runtime/i3;", "b", "(Landroid/view/View;Lkotlin/coroutines/g;Landroidx/lifecycle/w;)Landroidx/compose/runtime/i3;", "", "a", "Ljava/util/Map;", "animationScale", "value", "f", "j", "(Landroid/view/View;Landroidx/compose/runtime/z;)V", "compositionContext", "g", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "h", "(Landroid/view/View;)Landroidx/compose/runtime/i3;", "i", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n35#2:443\n361#3,7:444\n1#4:451\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/WindowRecomposer_androidKt\n*L\n98#1:443\n99#1:444,7\n*E\n"})
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final Map<Context, kotlinx.coroutines.flow.t0<Float>> f19693a = new LinkedHashMap();

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lkotlin/k2;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f19694b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.i3 f19695c;

        a(View view, androidx.compose.runtime.i3 i3Var) {
            this.f19694b = view;
            this.f19695c = i3Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@fg.l View v4) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@fg.l View v4) {
            this.f19694b.removeOnAttachStateChangeListener(this);
            this.f19695c.o0();
        }
    }

    /* compiled from: WindowRecomposer.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {115, 121}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.flow.j<? super Float>, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f19696b;

        /* renamed from: c, reason: collision with root package name */
        int f19697c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f19698d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ContentResolver f19699e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Uri f19700f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f19701g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.l<kotlin.k2> f19702h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Context f19703i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ContentResolver contentResolver, Uri uri, c cVar, kotlinx.coroutines.channels.l<kotlin.k2> lVar, Context context, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f19699e = contentResolver;
            this.f19700f = uri;
            this.f19701g = cVar;
            this.f19702h = lVar;
            this.f19703i = context;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.flow.j<? super Float> jVar, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f19699e, this.f19700f, this.f19701g, this.f19702h, this.f19703i, dVar);
            bVar.f19698d = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:9:0x0046, B:14:0x0056, B:16:0x005e, B:25:0x002b, B:27:0x0040), top: B:2:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:8:0x0017). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r8.f19697c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r8.f19696b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r4 = r8.f19698d
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L19
            L17:
                r9 = r4
                goto L46
            L19:
                r9 = move-exception
                goto L8b
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.f19696b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r4 = r8.f19698d
                kotlinx.coroutines.flow.j r4 = (kotlinx.coroutines.flow.j) r4
                kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L19
                goto L56
            L2f:
                kotlin.a1.n(r9)
                java.lang.Object r9 = r8.f19698d
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
                android.content.ContentResolver r1 = r8.f19699e
                android.net.Uri r4 = r8.f19700f
                r5 = 0
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r6 = r8.f19701g
                r1.registerContentObserver(r4, r5, r6)
                kotlinx.coroutines.channels.l<kotlin.k2> r1 = r8.f19702h     // Catch: java.lang.Throwable -> L19
                kotlinx.coroutines.channels.n r1 = r1.iterator()     // Catch: java.lang.Throwable -> L19
            L46:
                r8.f19698d = r9     // Catch: java.lang.Throwable -> L19
                r8.f19696b = r1     // Catch: java.lang.Throwable -> L19
                r8.f19697c = r3     // Catch: java.lang.Throwable -> L19
                java.lang.Object r4 = r1.c(r8)     // Catch: java.lang.Throwable -> L19
                if (r4 != r0) goto L53
                return r0
            L53:
                r7 = r4
                r4 = r9
                r9 = r7
            L56:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L19
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L19
                if (r9 == 0) goto L81
                r1.next()     // Catch: java.lang.Throwable -> L19
                android.content.Context r9 = r8.f19703i     // Catch: java.lang.Throwable -> L19
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L19
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L19
                java.lang.Float r5 = new java.lang.Float     // Catch: java.lang.Throwable -> L19
                r5.<init>(r9)     // Catch: java.lang.Throwable -> L19
                r8.f19698d = r4     // Catch: java.lang.Throwable -> L19
                r8.f19696b = r1     // Catch: java.lang.Throwable -> L19
                r8.f19697c = r2     // Catch: java.lang.Throwable -> L19
                java.lang.Object r9 = r4.emit(r5, r8)     // Catch: java.lang.Throwable -> L19
                if (r9 != r0) goto L17
                return r0
            L81:
                android.content.ContentResolver r9 = r8.f19699e
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r0 = r8.f19701g
                r9.unregisterContentObserver(r0)
                kotlin.k2 r9 = kotlin.k2.f75408a
                return r9
            L8b:
                android.content.ContentResolver r0 = r8.f19699e
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r1 = r8.f19701g
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/WindowRecomposer_androidKt$c", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "Lkotlin/k2;", "onChange", "(ZLandroid/net/Uri;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.l<kotlin.k2> f19704a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlinx.coroutines.channels.l<kotlin.k2> lVar, Handler handler) {
            super(handler);
            this.f19704a = lVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, @fg.m Uri uri) {
            this.f19704a.M(kotlin.k2.f75408a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.compose.ui.platform.f2] */
    @fg.l
    @androidx.compose.ui.k
    public static final androidx.compose.runtime.i3 b(@fg.l final View view, @fg.l kotlin.coroutines.g gVar, @fg.m AbstractC1450w abstractC1450w) {
        final androidx.compose.runtime.r2 r2Var;
        if (gVar.c(kotlin.coroutines.e.INSTANCE) == null || gVar.c(androidx.compose.runtime.a2.INSTANCE) == null) {
            gVar = u0.INSTANCE.a().O(gVar);
        }
        androidx.compose.runtime.a2 a2Var = (androidx.compose.runtime.a2) gVar.c(androidx.compose.runtime.a2.INSTANCE);
        if (a2Var != null) {
            androidx.compose.runtime.r2 r2Var2 = new androidx.compose.runtime.r2(a2Var);
            r2Var2.j();
            r2Var = r2Var2;
        } else {
            r2Var = null;
        }
        final k1.h hVar = new k1.h();
        androidx.compose.ui.s sVar = (androidx.compose.ui.s) gVar.c(androidx.compose.ui.s.INSTANCE);
        androidx.compose.ui.s sVar2 = sVar;
        if (sVar == null) {
            ?? f2Var = new f2();
            hVar.f75329b = f2Var;
            sVar2 = f2Var;
        }
        kotlin.coroutines.g O = gVar.O(r2Var != null ? r2Var : kotlin.coroutines.i.f75057b).O(sVar2);
        final androidx.compose.runtime.i3 i3Var = new androidx.compose.runtime.i3(O);
        i3Var.H0();
        final kotlinx.coroutines.r0 a5 = kotlinx.coroutines.s0.a(O);
        if (abstractC1450w == null) {
            InterfaceC1423e0 a6 = C1442q1.a(view);
            abstractC1450w = a6 != null ? a6.getLifecycle() : null;
        }
        if (abstractC1450w != null) {
            view.addOnAttachStateChangeListener(new a(view, i3Var));
            abstractC1450w.a(new InterfaceC1416b0() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                /* compiled from: WindowRecomposer.android.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f19710a;

                    static {
                        int[] iArr = new int[AbstractC1450w.a.values().length];
                        try {
                            iArr[AbstractC1450w.a.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[AbstractC1450w.a.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[AbstractC1450w.a.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[AbstractC1450w.a.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[AbstractC1450w.a.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[AbstractC1450w.a.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[AbstractC1450w.a.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        f19710a = iArr;
                    }
                }

                /* compiled from: WindowRecomposer.android.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {394}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                    /* renamed from: b, reason: collision with root package name */
                    int f19711b;

                    /* renamed from: c, reason: collision with root package name */
                    private /* synthetic */ Object f19712c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ k1.h<f2> f19713d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.runtime.i3 f19714e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ InterfaceC1423e0 f19715f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f19716g;

                    /* renamed from: h, reason: collision with root package name */
                    final /* synthetic */ View f19717h;

                    /* compiled from: WindowRecomposer.android.kt */
                    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", i = {}, l = {389}, m = "invokeSuspend", n = {}, s = {})
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                        /* renamed from: b, reason: collision with root package name */
                        int f19718b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ kotlinx.coroutines.flow.t0<Float> f19719c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ f2 f19720d;

                        /* compiled from: WindowRecomposer.android.kt */
                        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "scaleFactor", "Lkotlin/k2;", "a", "(FLkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
                        /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a$a, reason: collision with other inner class name */
                        static final class C0355a<T> implements kotlinx.coroutines.flow.j {

                            /* renamed from: b, reason: collision with root package name */
                            final /* synthetic */ f2 f19721b;

                            C0355a(f2 f2Var) {
                                this.f19721b = f2Var;
                            }

                            @fg.m
                            public final Object a(float f4, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
                                this.f19721b.a(f4);
                                return kotlin.k2.f75408a;
                            }

                            @Override // kotlinx.coroutines.flow.j
                            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                                return a(((Number) obj).floatValue(), dVar);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        a(kotlinx.coroutines.flow.t0<Float> t0Var, f2 f2Var, kotlin.coroutines.d<? super a> dVar) {
                            super(2, dVar);
                            this.f19719c = t0Var;
                            this.f19720d = f2Var;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @fg.l
                        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                            return new a(this.f19719c, this.f19720d, dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        @fg.m
                        public final Object invokeSuspend(@fg.l Object obj) {
                            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                            int i4 = this.f19718b;
                            if (i4 == 0) {
                                kotlin.a1.n(obj);
                                kotlinx.coroutines.flow.t0<Float> t0Var = this.f19719c;
                                C0355a c0355a = new C0355a(this.f19720d);
                                this.f19718b = 1;
                                if (t0Var.a(c0355a, this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i4 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.a1.n(obj);
                            }
                            throw new KotlinNothingValueException();
                        }

                        @Override // ld.p
                        @fg.m
                        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                            return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(k1.h<f2> hVar, androidx.compose.runtime.i3 i3Var, InterfaceC1423e0 interfaceC1423e0, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, kotlin.coroutines.d<? super b> dVar) {
                        super(2, dVar);
                        this.f19713d = hVar;
                        this.f19714e = i3Var;
                        this.f19715f = interfaceC1423e0;
                        this.f19716g = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
                        this.f19717h = view;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.l
                    public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                        b bVar = new b(this.f19713d, this.f19714e, this.f19715f, this.f19716g, this.f19717h, dVar);
                        bVar.f19712c = obj;
                        return bVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
                    @Override // kotlin.coroutines.jvm.internal.a
                    @fg.m
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r12) {
                        /*
                            r11 = this;
                            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                            int r1 = r11.f19711b
                            r2 = 1
                            r3 = 0
                            if (r1 == 0) goto L1d
                            if (r1 != r2) goto L15
                            java.lang.Object r0 = r11.f19712c
                            kotlinx.coroutines.k2 r0 = (kotlinx.coroutines.k2) r0
                            kotlin.a1.n(r12)     // Catch: java.lang.Throwable -> L12
                            goto L68
                        L12:
                            r12 = move-exception
                            goto L7f
                        L15:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r0)
                            throw r12
                        L1d:
                            kotlin.a1.n(r12)
                            java.lang.Object r12 = r11.f19712c
                            r4 = r12
                            kotlinx.coroutines.r0 r4 = (kotlinx.coroutines.r0) r4
                            kotlin.jvm.internal.k1$h<androidx.compose.ui.platform.f2> r12 = r11.f19713d     // Catch: java.lang.Throwable -> L56
                            T r12 = r12.f75329b     // Catch: java.lang.Throwable -> L56
                            androidx.compose.ui.platform.f2 r12 = (androidx.compose.ui.platform.f2) r12     // Catch: java.lang.Throwable -> L56
                            if (r12 == 0) goto L59
                            android.view.View r1 = r11.f19717h     // Catch: java.lang.Throwable -> L56
                            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L56
                            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L56
                            kotlinx.coroutines.flow.t0 r1 = androidx.compose.ui.platform.WindowRecomposer_androidKt.a(r1)     // Catch: java.lang.Throwable -> L56
                            java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L56
                            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L56
                            float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L56
                            r12.a(r5)     // Catch: java.lang.Throwable -> L56
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a     // Catch: java.lang.Throwable -> L56
                            r7.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L56
                            r8 = 3
                            r9 = 0
                            r5 = 0
                            r6 = 0
                            kotlinx.coroutines.k2 r12 = kotlinx.coroutines.i.e(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L56
                            goto L5a
                        L56:
                            r12 = move-exception
                            r0 = r3
                            goto L7f
                        L59:
                            r12 = r3
                        L5a:
                            androidx.compose.runtime.i3 r1 = r11.f19714e     // Catch: java.lang.Throwable -> L7b
                            r11.f19712c = r12     // Catch: java.lang.Throwable -> L7b
                            r11.f19711b = r2     // Catch: java.lang.Throwable -> L7b
                            java.lang.Object r1 = r1.Y0(r11)     // Catch: java.lang.Throwable -> L7b
                            if (r1 != r0) goto L67
                            return r0
                        L67:
                            r0 = r12
                        L68:
                            if (r0 == 0) goto L6d
                            kotlinx.coroutines.k2.a.b(r0, r3, r2, r3)
                        L6d:
                            androidx.lifecycle.e0 r12 = r11.f19715f
                            androidx.lifecycle.w r12 = r12.getLifecycle()
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.f19716g
                            r12.d(r0)
                            kotlin.k2 r12 = kotlin.k2.f75408a
                            return r12
                        L7b:
                            r0 = move-exception
                            r10 = r0
                            r0 = r12
                            r12 = r10
                        L7f:
                            if (r0 == 0) goto L84
                            kotlinx.coroutines.k2.a.b(r0, r3, r2, r3)
                        L84:
                            androidx.lifecycle.e0 r0 = r11.f19715f
                            androidx.lifecycle.w r0 = r0.getLifecycle()
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.f19716g
                            r0.d(r1)
                            throw r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.b.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // ld.p
                    @fg.m
                    public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                        return ((b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                    }
                }

                @Override // androidx.view.InterfaceC1416b0
                public void f(@fg.l InterfaceC1423e0 source, @fg.l AbstractC1450w.a event) {
                    int i4 = a.f19710a[event.ordinal()];
                    if (i4 == 1) {
                        kotlinx.coroutines.k.f(kotlinx.coroutines.r0.this, null, kotlinx.coroutines.t0.UNDISPATCHED, new b(hVar, i3Var, source, this, view, null), 1, null);
                        return;
                    }
                    if (i4 == 2) {
                        androidx.compose.runtime.r2 r2Var3 = r2Var;
                        if (r2Var3 != null) {
                            r2Var3.p();
                        }
                        i3Var.V0();
                        return;
                    }
                    if (i4 == 3) {
                        i3Var.H0();
                    } else {
                        if (i4 != 4) {
                            return;
                        }
                        i3Var.o0();
                    }
                }
            });
            return i3Var;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ androidx.compose.runtime.i3 c(View view, kotlin.coroutines.g gVar, AbstractC1450w abstractC1450w, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = kotlin.coroutines.i.f75057b;
        }
        if ((i4 & 2) != 0) {
            abstractC1450w = null;
        }
        return b(view, gVar, abstractC1450w);
    }

    @fg.m
    public static final androidx.compose.runtime.z d(@fg.l View view) {
        androidx.compose.runtime.z f4 = f(view);
        if (f4 != null) {
            return f4;
        }
        for (ViewParent parent = view.getParent(); f4 == null && (parent instanceof View); parent = parent.getParent()) {
            f4 = f((View) parent);
        }
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.flow.t0<Float> e(Context context) {
        kotlinx.coroutines.flow.t0<Float> t0Var;
        Map<Context, kotlinx.coroutines.flow.t0<Float>> map = f19693a;
        synchronized (map) {
            try {
                kotlinx.coroutines.flow.t0<Float> t0Var2 = map.get(context);
                if (t0Var2 == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    kotlinx.coroutines.channels.l d5 = kotlinx.coroutines.channels.o.d(-1, null, null, 6, null);
                    t0Var2 = kotlinx.coroutines.flow.k.O1(kotlinx.coroutines.flow.k.J0(new b(contentResolver, uriFor, new c(d5, androidx.core.os.k.a(Looper.getMainLooper())), d5, context, null)), kotlinx.coroutines.s0.b(), o0.Companion.b(kotlinx.coroutines.flow.o0.INSTANCE, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, t0Var2);
                }
                t0Var = t0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t0Var;
    }

    @fg.m
    public static final androidx.compose.runtime.z f(@fg.l View view) {
        Object tag = view.getTag(t.b.G);
        if (tag instanceof androidx.compose.runtime.z) {
            return (androidx.compose.runtime.z) tag;
        }
        return null;
    }

    private static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    @fg.l
    public static final androidx.compose.runtime.i3 h(@fg.l View view) {
        if (!view.isAttachedToWindow()) {
            throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
        }
        View g4 = g(view);
        androidx.compose.runtime.z f4 = f(g4);
        if (f4 == null) {
            return i6.f19941a.b(g4);
        }
        if (f4 instanceof androidx.compose.runtime.i3) {
            return (androidx.compose.runtime.i3) f4;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static /* synthetic */ void i(View view) {
    }

    public static final void j(@fg.l View view, @fg.m androidx.compose.runtime.z zVar) {
        view.setTag(t.b.G, zVar);
    }
}
