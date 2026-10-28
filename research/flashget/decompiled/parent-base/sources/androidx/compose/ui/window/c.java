package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.a3;
import androidx.compose.runtime.b3;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.f0;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.v3;
import androidx.compose.runtime.w0;
import androidx.compose.runtime.x;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.m0;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.u;
import androidx.compose.ui.node.g;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.unit.s;
import androidx.compose.ui.unit.w;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aF\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0013\b\b\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\tH\u0083\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010#\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u00192\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b#\u0010$\" \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+²\u0006\u0017\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\t8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/c;", "alignment", "Landroidx/compose/ui/unit/q;", "offset", "Lkotlin/Function0;", "Lkotlin/k2;", "onDismissRequest", "Landroidx/compose/ui/window/p;", "properties", "Landroidx/compose/runtime/i;", "content", "c", "(Landroidx/compose/ui/c;JLld/a;Landroidx/compose/ui/window/p;Lld/p;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/window/o;", "popupPositionProvider", "a", "(Landroidx/compose/ui/window/o;Lld/a;Landroidx/compose/ui/window/p;Lld/p;Landroidx/compose/runtime/t;II)V", "", "tag", "d", "(Ljava/lang/String;Lld/p;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/q;", "modifier", "e", "(Landroidx/compose/ui/q;Lld/p;Landroidx/compose/runtime/t;I)V", "Landroid/view/View;", "", "i", "(Landroid/view/View;)Z", "Landroid/graphics/Rect;", "Landroidx/compose/ui/unit/s;", "l", "(Landroid/graphics/Rect;)Landroidx/compose/ui/unit/s;", "view", "testTag", "j", "(Landroid/view/View;Ljava/lang/String;)Z", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/a3;", "h", "()Landroidx/compose/runtime/a3;", "LocalPopupTestTag", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,867:1\n50#2:868\n49#2:869\n25#2:880\n456#2,8:898\n464#2,6:912\n456#2,8:930\n464#2,6:944\n1116#3,6:870\n1116#3,6:881\n74#4:876\n74#4:877\n74#4:878\n74#4:879\n79#5,11:887\n92#5:918\n79#5,11:919\n92#5:950\n3737#6,6:906\n3737#6,6:938\n81#7:951\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n196#1:868\n196#1:869\n237#1:880\n311#1:898,8\n311#1:912,6\n343#1:930,8\n343#1:944,6\n196#1:870,6\n237#1:881,6\n230#1:876\n231#1:877\n232#1:878\n233#1:879\n311#1:887,11\n311#1:918\n343#1:919,11\n343#1:950\n311#1:906,6\n343#1:938,6\n235#1:951\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final a3<String> f21656a = f0.e(null, a.f21657b, 1, null);

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21657b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final String a() {
            return "DEFAULT_TEST_TAG";
        }

        @Override // ld.a
        public String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.c f21658b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f21659c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f21660d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ p f21661e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<t, Integer, k2> f21662f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f21663g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f21664h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.c cVar, long j4, ld.a<k2> aVar, p pVar, ld.p<? super t, ? super Integer, k2> pVar2, int i4, int i5) {
            super(2);
            this.f21658b = cVar;
            this.f21659c = j4;
            this.f21660d = aVar;
            this.f21661e = pVar;
            this.f21662f = pVar2;
            this.f21663g = i4;
            this.f21664h = i5;
        }

        public final void a(@fg.m t tVar, int i4) {
            c.c(this.f21658b, this.f21659c, this.f21660d, this.f21661e, this.f21662f, tVar, g3.b(this.f21663g | 1), this.f21664h);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,867:1\n64#2,5:868\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n*L\n273#1:868,5\n*E\n"})
    /* renamed from: androidx.compose.ui.window.c$c, reason: collision with other inner class name */
    static final class C0382c extends n0 implements ld.l<w0, v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.j f21665b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f21666c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f21667d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f21668e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w f21669f;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$2\n*L\n1#1,497:1\n274#2,4:498\n*E\n"})
        /* renamed from: androidx.compose.ui.window.c$c$a */
        public static final class a implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.window.j f21670a;

            public a(androidx.compose.ui.window.j jVar) {
                this.f21670a = jVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f21670a.i();
                this.f21670a.B();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0382c(androidx.compose.ui.window.j jVar, ld.a<k2> aVar, p pVar, String str, w wVar) {
            super(1);
            this.f21665b = jVar;
            this.f21666c = aVar;
            this.f21667d = pVar;
            this.f21668e = str;
            this.f21669f = wVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@fg.l w0 w0Var) {
            this.f21665b.Y();
            this.f21665b.a0(this.f21666c, this.f21667d, this.f21668e, this.f21669f);
            return new a(this.f21665b);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.j f21671b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f21672c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f21673d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f21674e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w f21675f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.window.j jVar, ld.a<k2> aVar, p pVar, String str, w wVar) {
            super(0);
            this.f21671b = jVar;
            this.f21672c = aVar;
            this.f21673d = pVar;
            this.f21674e = str;
            this.f21675f = wVar;
        }

        public final void a() {
            this.f21671b.a0(this.f21672c, this.f21673d, this.f21674e, this.f21675f);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,867:1\n64#2,5:868\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4\n*L\n292#1:868,5\n*E\n"})
    static final class e extends n0 implements ld.l<w0, v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.j f21676b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f21677c;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4\n*L\n1#1,497:1\n292#2:498\n*E\n"})
        public static final class a implements v0 {
            @Override // androidx.compose.runtime.v0
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.window.j jVar, o oVar) {
            super(1);
            this.f21676b = jVar;
            this.f21677c = oVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@fg.l w0 w0Var) {
            this.f21676b.V(this.f21677c);
            this.f21676b.d0();
            return new a();
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", i = {0}, l = {303}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f21678b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f21679c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.j f21680d;

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.l<Long, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f21681b = new a(1);

            a() {
                super(1);
            }

            public final void a(long j4) {
            }

            @Override // ld.l
            public k2 invoke(Long l4) {
                l4.longValue();
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.window.j jVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f21680d = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f21680d, dVar);
            fVar.f21679c = obj;
            return fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0031 -> B:5:0x0034). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r4) {
            /*
                r3 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r3.f21678b
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r3.f21679c
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.a1.n(r4)
                goto L34
            L11:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L19:
                kotlin.a1.n(r4)
                java.lang.Object r4 = r3.f21679c
                kotlinx.coroutines.r0 r4 = (kotlinx.coroutines.r0) r4
                r1 = r4
            L21:
                boolean r4 = kotlinx.coroutines.s0.k(r1)
                if (r4 == 0) goto L3a
                androidx.compose.ui.window.c$f$a r4 = androidx.compose.ui.window.c.f.a.f21681b
                r3.f21679c = r1
                r3.f21678b = r2
                java.lang.Object r4 = androidx.compose.ui.platform.u1.a(r4, r3)
                if (r4 != r0) goto L34
                return r0
            L34:
                androidx.compose.ui.window.j r4 = r3.f21680d
                r4.N()
                goto L21
            L3a:
                kotlin.k2 r4 = kotlin.k2.f75408a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.c.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "childCoordinates", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.l<u, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.j f21682b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.ui.window.j jVar) {
            super(1);
            this.f21682b = jVar;
        }

        public final void a(@fg.l u uVar) {
            u n02 = uVar.n0();
            l0.m(n02);
            this.f21682b.c0(n02);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(u uVar) {
            a(uVar);
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/b;", "<anonymous parameter 1>", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class h implements m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.j f21683a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f21684b;

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f21685b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l i1.a aVar) {
            }

            @Override // ld.l
            public k2 invoke(i1.a aVar) {
                return k2.f75408a;
            }
        }

        h(androidx.compose.ui.window.j jVar, w wVar) {
            this.f21683a = jVar;
            this.f21684b = wVar;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            this.f21683a.T(this.f21684b);
            return o0.x2(o0Var, 0, 0, null, a.f21685b, 4, null);
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f21686b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f21687c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f21688d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<t, Integer, k2> f21689e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f21690f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f21691g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(o oVar, ld.a<k2> aVar, p pVar, ld.p<? super t, ? super Integer, k2> pVar2, int i4, int i5) {
            super(2);
            this.f21686b = oVar;
            this.f21687c = aVar;
            this.f21688d = pVar;
            this.f21689e = pVar2;
            this.f21690f = i4;
            this.f21691g = i5;
        }

        public final void a(@fg.m t tVar, int i4) {
            c.a(this.f21686b, this.f21687c, this.f21688d, this.f21689e, tVar, g3.b(this.f21690f | 1), this.f21691g);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/UUID;"}, k = 3, mv = {1, 8, 0})
    static final class j extends n0 implements ld.a<UUID> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f21692b = new j(0);

        j() {
            super(0);
        }

        public final UUID a() {
            return UUID.randomUUID();
        }

        @Override // ld.a
        public UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,867:1\n343#2:868\n370#2:901\n79#3,11:869\n92#3:900\n456#4,8:880\n464#4,6:894\n3737#5,6:888\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$popupLayout$1$1$1\n*L\n248#1:868\n248#1:901\n248#1:869,11\n248#1:900\n248#1:880,8\n248#1:894,6\n248#1:888,6\n*E\n"})
    static final class k extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.j f21693b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b5<ld.p<t, Integer, k2>> f21694c;

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements ld.l<z, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f21695b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l z zVar) {
                androidx.compose.ui.semantics.w.P0(zVar);
            }

            @Override // ld.l
            public k2 invoke(z zVar) {
                androidx.compose.ui.semantics.w.P0(zVar);
                return k2.f75408a;
            }
        }

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends n0 implements ld.l<androidx.compose.ui.unit.u, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.window.j f21696b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.window.j jVar) {
                super(1);
                this.f21696b = jVar;
            }

            public final void a(long j4) {
                this.f21696b.U(androidx.compose.ui.unit.u.b(j4));
                this.f21696b.d0();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.unit.u uVar) {
                a(uVar.getPackedValue());
                return k2.f75408a;
            }
        }

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.window.c$k$c, reason: collision with other inner class name */
        static final class C0383c extends n0 implements ld.p<t, Integer, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b5<ld.p<t, Integer, k2>> f21697b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0383c(b5<? extends ld.p<? super t, ? super Integer, k2>> b5Var) {
                super(2);
                this.f21697b = b5Var;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m t tVar, int i4) {
                if ((i4 & 11) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (x.b0()) {
                    x.r0(606497925, i4, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:258)");
                }
                if (androidx.compose.animation.r.a(0, c.f(this.f21697b), tVar)) {
                    x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
                a(tVar, num.intValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(androidx.compose.ui.window.j jVar, b5<? extends ld.p<? super t, ? super Integer, k2>> b5Var) {
            super(2);
            this.f21693b = jVar;
            this.f21694c = b5Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(1302892335, i4, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:247)");
            }
            androidx.compose.ui.q a5 = androidx.compose.ui.draw.a.a(c1.a(androidx.compose.ui.semantics.o.f(androidx.compose.ui.q.INSTANCE, false, a.f21695b, 1, null), new b(this.f21693b)), this.f21693b.C() ? 1.0f : 0.0f);
            androidx.compose.runtime.internal.a b5 = androidx.compose.runtime.internal.c.b(tVar, 606497925, true, new C0383c(this.f21694c));
            tVar.P(1406149896);
            m mVar = m.f21701a;
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<v3<androidx.compose.ui.node.g>, t, Integer, k2> g4 = a0.g(a5);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            m5.j(tVar, mVar, companion.f());
            m5.j(tVar, B, companion.h());
            ld.p<androidx.compose.ui.node.g, Integer, k2> b6 = companion.b();
            if (tVar.getInserting() || !l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, b6);
            }
            androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
            b5.invoke(tVar, 6);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            if (x.b0()) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l extends n0 implements ld.p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f21698b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<t, Integer, k2> f21699c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f21700d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(String str, ld.p<? super t, ? super Integer, k2> pVar, int i4) {
            super(2);
            this.f21698b = str;
            this.f21699c = pVar;
            this.f21700d = i4;
        }

        public final void a(@fg.m t tVar, int i4) {
            c.d(this.f21698b, this.f21699c, tVar, g3.b(this.f21700d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,867:1\n151#2,3:868\n33#2,4:871\n154#2,2:875\n38#2:877\n156#2:878\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n*L\n353#1:868,3\n353#1:871,4\n353#1:875,2\n353#1:877\n353#1:878\n*E\n"})
    public static final class m implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final m f21701a = new m();

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$1\n*L\n1#1,867:1\n*E\n"})
        public static final class a extends n0 implements ld.l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f21702b = new a(1);

            public a() {
                super(1);
            }

            public final void a(@fg.l i1.a aVar) {
            }

            @Override // ld.l
            public k2 invoke(i1.a aVar) {
                return k2.f75408a;
            }
        }

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$2\n*L\n1#1,867:1\n*E\n"})
        public static final class b extends n0 implements ld.l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1 f21703b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i1 i1Var) {
                super(1);
                this.f21703b = i1Var;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.m(aVar, this.f21703b, 0, 0, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
                a(aVar);
                return k2.f75408a;
            }
        }

        /* compiled from: AndroidPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$3\n*L\n1#1,867:1\n*E\n"})
        /* renamed from: androidx.compose.ui.window.c$m$c, reason: collision with other inner class name */
        public static final class C0384c extends n0 implements ld.l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<i1> f21704b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0384c(List<? extends i1> list) {
                super(1);
                this.f21704b = list;
            }

            public final void a(@fg.l i1.a aVar) {
                int J = kotlin.collections.w.J(this.f21704b);
                if (J < 0) {
                    return;
                }
                int i4 = 0;
                while (true) {
                    i1.a.m(aVar, this.f21704b.get(i4), 0, 0, 0.0f, 4, null);
                    if (i4 == J) {
                        return;
                    } else {
                        i4++;
                    }
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
                a(aVar);
                return k2.f75408a;
            }
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            int i4;
            int i5;
            int size = list.size();
            if (size == 0) {
                return o0.x2(o0Var, 0, 0, null, a.f21702b, 4, null);
            }
            int i6 = 0;
            if (size == 1) {
                i1 m02 = list.get(0).m0(j4);
                return o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new b(m02), 4, null);
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            int i7 = 0;
            while (i7 < size2) {
                i7 = androidx.compose.animation.n.a(list.get(i7), j4, arrayList, i7, 1);
            }
            int J = kotlin.collections.w.J(arrayList);
            if (J >= 0) {
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    i1 i1Var = (i1) arrayList.get(i6);
                    i10 = Math.max(i10, i1Var.getWidth());
                    i11 = Math.max(i11, i1Var.getHeight());
                    if (i6 == J) {
                        break;
                    }
                    i6++;
                }
                i4 = i10;
                i5 = i11;
            } else {
                i4 = 0;
                i5 = 0;
            }
            return o0.x2(o0Var, i4, i5, null, new C0384c(arrayList), 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004a  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.ui.window.o r35, @fg.m ld.a<kotlin.k2> r36, @fg.m androidx.compose.ui.window.p r37, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r38, @fg.m androidx.compose.runtime.t r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.c.a(androidx.compose.ui.window.o, ld.a, androidx.compose.ui.window.p, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    private static final ld.p<t, Integer, k2> b(b5<? extends ld.p<? super t, ? super Integer, k2>> b5Var) {
        return (ld.p) b5Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0068  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.m androidx.compose.ui.c r25, long r26, @fg.m ld.a<kotlin.k2> r28, @fg.m androidx.compose.ui.window.p r29, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r30, @fg.m androidx.compose.runtime.t r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.c.c(androidx.compose.ui.c, long, ld.a, androidx.compose.ui.window.p, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    public static final void d(@fg.l String str, @fg.l ld.p<? super t, ? super Integer, k2> pVar, @fg.m t tVar, int i4) {
        int i5;
        t o4 = tVar.o(-498879600);
        if ((i4 & 14) == 0) {
            i5 = (o4.q0(str) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i5 & 91) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (x.b0()) {
                x.r0(-498879600, i5, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:333)");
            }
            f0.b(f21656a.e(str), pVar, o4, (i5 & 112) | b3.f15974d);
            if (x.b0()) {
                x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new l(str, pVar, i4));
        }
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    private static final void e(androidx.compose.ui.q qVar, ld.p<? super t, ? super Integer, k2> pVar, t tVar, int i4) {
        tVar.P(1406149896);
        m mVar = m.f21701a;
        tVar.P(-1323940314);
        int j4 = androidx.compose.runtime.p.j(tVar, 0);
        g0 B = tVar.B();
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        ld.a<androidx.compose.ui.node.g> a5 = companion.a();
        ld.q<v3<androidx.compose.ui.node.g>, t, Integer, k2> g4 = a0.g(qVar);
        int i5 = (((((i4 << 3) & 112) | ((i4 >> 3) & 14)) << 9) & 7168) | 6;
        if (tVar.s() == null) {
            androidx.compose.runtime.p.n();
        }
        tVar.W();
        if (tVar.getInserting()) {
            tVar.F(a5);
        } else {
            tVar.C();
        }
        m5.j(tVar, mVar, companion.f());
        m5.j(tVar, B, companion.h());
        ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion.b();
        if (tVar.getInserting() || !l0.g(tVar.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, tVar, j4, b5);
        }
        androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
        androidx.compose.material3.q.a((i5 >> 9) & 14, pVar, tVar);
    }

    public static final ld.p f(b5 b5Var) {
        return (ld.p) b5Var.getValue();
    }

    @fg.l
    public static final a3<String> h() {
        return f21656a;
    }

    public static final boolean i(@fg.l View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    @fg.p
    public static final boolean j(@fg.l View view, @fg.m String str) {
        return (view instanceof androidx.compose.ui.window.j) && (str == null || l0.g(str, ((androidx.compose.ui.window.j) view).M()));
    }

    public static /* synthetic */ boolean k(View view, String str, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = null;
        }
        return j(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s l(Rect rect) {
        return new s(rect.left, rect.top, rect.right, rect.bottom);
    }
}
