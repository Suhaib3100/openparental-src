package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.layout.c2;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.snapshots.m;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v3;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.d6;
import androidx.compose.ui.platform.g5;
import androidx.compose.ui.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001að\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u001123\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0004\b\"\u0010#\u001a2\u0010'\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001dH\u0003¢\u0006\u0004\b'\u0010(\u001a#\u0010+\u001a\u00020\u0005*\u00020\u00052\u0006\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b+\u0010,\u001a'\u00100\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b0\u00101\u001a7\u00106\u001a\u00020\u00032\u0006\u00103\u001a\u0002022\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107\u001a\u0017\u00108\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b8\u00109\u001a4\u0010>\u001a\u00020\u0003*\u00020:2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u000b2\u0006\u00105\u001a\u000204H\u0080@¢\u0006\u0004\b>\u0010?\u001a\u001f\u0010A\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$2\u0006\u0010@\u001a\u00020\u0011H\u0003¢\u0006\u0004\bA\u0010B\u001a\u0017\u0010C\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\bC\u0010D\u001a'\u0010E\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010I\u001a\u00020\u00112\u0006\u0010H\u001a\u00020GH\u0000¢\u0006\u0004\bI\u0010J\"\u0014\u0010L\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010K¨\u0006N²\u0006\f\u0010M\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "value", "Lkotlin/Function1;", "Lkotlin/k2;", "onValueChange", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/text/v0;", "textStyle", "Landroidx/compose/ui/text/input/k1;", "visualTransformation", "Landroidx/compose/ui/text/n0;", "onTextLayout", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/ui/graphics/t1;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/z;", "imeOptions", "Landroidx/compose/foundation/text/d0;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "Lkotlin/r0;", "name", "innerTextField", "decorationBox", "a", "(Landroidx/compose/ui/text/input/z0;Lld/l;Landroidx/compose/ui/q;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/input/k1;Lld/l;Landroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/t1;ZIILandroidx/compose/ui/text/input/z;Landroidx/compose/foundation/text/d0;ZZLld/q;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/foundation/text/selection/s0;", "manager", "content", "c", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/text/selection/s0;Lld/p;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/foundation/text/c1;", "state", "q", "(Landroidx/compose/ui/q;Landroidx/compose/foundation/text/c1;Landroidx/compose/foundation/text/selection/s0;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/focus/a0;", "focusRequester", "allowKeyboard", "s", "(Landroidx/compose/foundation/text/c1;Landroidx/compose/ui/focus/a0;Z)V", "Landroidx/compose/ui/text/input/b1;", "textInputService", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "r", "(Landroidx/compose/ui/text/input/b1;Landroidx/compose/foundation/text/c1;Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/z;Landroidx/compose/ui/text/input/p0;)V", "n", "(Landroidx/compose/foundation/text/c1;)V", "Landroidx/compose/foundation/relocation/d;", "Landroidx/compose/foundation/text/m0;", "textDelegate", "textLayoutResult", "m", "(Landroidx/compose/foundation/relocation/d;Landroidx/compose/ui/text/input/z0;Landroidx/compose/foundation/text/m0;Landroidx/compose/ui/text/n0;Landroidx/compose/ui/text/input/p0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "show", "d", "(Landroidx/compose/foundation/text/selection/s0;ZLandroidx/compose/runtime/t;I)V", "e", "(Landroidx/compose/foundation/text/selection/s0;Landroidx/compose/runtime/t;I)V", "p", "(Landroidx/compose/foundation/text/c1;Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/p0;)V", "Landroidx/compose/ui/platform/d6;", "windowInfo", "o", "(Landroidx/compose/ui/platform/d6;)Z", "Z", "USE_WINDOW_FOCUS_ENABLED", "writeable", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1195:1\n25#2:1196\n50#2:1216\n49#2:1217\n36#2:1224\n25#2:1231\n25#2:1238\n25#2:1252\n25#2:1263\n456#2,8:1287\n464#2,3:1301\n467#2,3:1307\n36#2:1313\n1116#3,6:1197\n1116#3,6:1210\n1116#3,6:1218\n1116#3,6:1225\n1116#3,6:1232\n1116#3,6:1239\n1116#3,3:1253\n1119#3,3:1259\n1116#3,6:1264\n1116#3,6:1314\n1116#3,6:1321\n74#4:1203\n74#4:1204\n74#4:1205\n74#4:1206\n74#4:1207\n74#4:1208\n74#4:1209\n74#4:1245\n74#4:1246\n74#4:1247\n74#4:1320\n487#5,4:1248\n491#5,2:1256\n495#5:1262\n487#6:1258\n68#7,6:1270\n74#7:1304\n78#7:1311\n79#8,11:1276\n92#8:1310\n3737#9,6:1295\n30#10,2:1305\n1#11:1312\n495#12,4:1327\n500#12:1336\n129#13,5:1331\n81#14:1337\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n215#1:1196\n236#1:1216\n236#1:1217\n249#1:1224\n278#1:1231\n281#1:1238\n293#1:1252\n294#1:1263\n748#1:1287,8\n748#1:1301,3\n748#1:1307,3\n1128#1:1313\n215#1:1197,6\n233#1:1210,6\n236#1:1218,6\n249#1:1225,6\n278#1:1232,6\n281#1:1239,6\n293#1:1253,3\n293#1:1259,3\n294#1:1264,6\n1128#1:1314,6\n1145#1:1321,6\n219#1:1203\n220#1:1204\n221#1:1205\n222#1:1206\n223#1:1207\n224#1:1208\n225#1:1209\n287#1:1245\n288#1:1246\n289#1:1247\n1129#1:1320\n293#1:1248,4\n293#1:1256,2\n293#1:1262\n293#1:1258\n748#1:1270,6\n748#1:1304\n748#1:1311\n748#1:1276,11\n748#1:1310\n748#1:1295,6\n749#1:1305,2\n1175#1:1327,4\n1175#1:1336\n1175#1:1331,5\n345#1:1337\n*E\n"})
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f7463a = false;

    /* compiled from: CoreTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f7464b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.n0 n0Var) {
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.text.n0 n0Var) {
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2", f = "CoreTextField.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f7465b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c1 f7466c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b5<Boolean> f7467d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.b1 f7468e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7469f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z f7470g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.p0 f7471h;

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b5<Boolean> f7472b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b5<Boolean> b5Var) {
                super(0);
                this.f7472b = b5Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(k.b(this.f7472b));
            }
        }

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "writeable", "Lkotlin/k2;", "a", "(ZLkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text.k$b$b, reason: collision with other inner class name */
        static final class C0138b<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c1 f7473b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.b1 f7474c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7475d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.z f7476e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.p0 f7477f;

            C0138b(c1 c1Var, androidx.compose.ui.text.input.b1 b1Var, androidx.compose.foundation.text.selection.s0 s0Var, androidx.compose.ui.text.input.z zVar, androidx.compose.ui.text.input.p0 p0Var) {
                this.f7473b = c1Var;
                this.f7474c = b1Var;
                this.f7475d = s0Var;
                this.f7476e = zVar;
                this.f7477f = p0Var;
            }

            @fg.m
            public final Object a(boolean z4, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                if (z4 && this.f7473b.d()) {
                    k.r(this.f7474c, this.f7473b, this.f7475d.Q(), this.f7476e, this.f7477f);
                } else {
                    k.n(this.f7473b);
                }
                return k2.f75408a;
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c1 c1Var, b5<Boolean> b5Var, androidx.compose.ui.text.input.b1 b1Var, androidx.compose.foundation.text.selection.s0 s0Var, androidx.compose.ui.text.input.z zVar, androidx.compose.ui.text.input.p0 p0Var, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f7466c = c1Var;
            this.f7467d = b5Var;
            this.f7468e = b1Var;
            this.f7469f = s0Var;
            this.f7470g = zVar;
            this.f7471h = p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new b(this.f7466c, this.f7467d, this.f7468e, this.f7469f, this.f7470g, this.f7471h, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f7465b;
            try {
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    kotlinx.coroutines.flow.i w4 = o4.w(new a(this.f7467d));
                    C0138b c0138b = new C0138b(this.f7466c, this.f7468e, this.f7469f, this.f7470g, this.f7471h);
                    this.f7465b = 1;
                    if (w4.a(c0138b, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                k.n(this.f7466c);
                return k2.f75408a;
            } catch (Throwable th) {
                k.n(this.f7466c);
                throw th;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1195:1\n64#2,5:1196\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3\n*L\n590#1:1196,5\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7478b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$3\n*L\n1#1,497:1\n590#2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7479a;

            public a(androidx.compose.foundation.text.selection.s0 s0Var) {
                this.f7479a = s0Var;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f7479a.T();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.foundation.text.selection.s0 s0Var) {
            super(1);
            this.f7478b = s0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            return new a(this.f7478b);
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,1195:1\n64#2,5:1196\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n*L\n604#1:1196,5\n*E\n"})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.b1 f7480b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c1 f7481c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7482d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z f7483e;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$4\n*L\n1#1,497:1\n604#2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {
            @Override // androidx.compose.runtime.v0
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.text.input.b1 b1Var, c1 c1Var, androidx.compose.ui.text.input.z0 z0Var, androidx.compose.ui.text.input.z zVar) {
            super(1);
            this.f7480b = b1Var;
            this.f7481c = c1Var;
            this.f7482d = z0Var;
            this.f7483e = zVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            if (this.f7480b != null && this.f7481c.d()) {
                c1 c1Var = this.f7481c;
                c1Var.z(q0.INSTANCE.i(this.f7480b, this.f7482d, c1Var.getProcessor(), this.f7483e, this.f7481c.k(), this.f7481c.j()));
            }
            return new a();
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, androidx.compose.runtime.t, Integer, k2> f7484b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c1 f7485c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7486d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7487e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7488f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z0 f7489g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7490h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f7491i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7492j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7493k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7494l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7495m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.relocation.d f7496n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7497o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f7498p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f7499q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7500r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.p0 f7501s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f7502t;

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c1 f7503b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.v0 f7504c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f7505d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f7506e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z0 f7507f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.z0 f7508g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.k1 f7509h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.q f7510i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.q f7511j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.q f7512k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.q f7513l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.relocation.d f7514m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7515n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f7516o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ boolean f7517p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7518q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.p0 f7519r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.unit.d f7520s;

            /* compiled from: CoreTextField.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            @r1({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1195:1\n76#2,14:1196\n92#2:1230\n456#3,8:1210\n464#3,6:1224\n3737#4,6:1218\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n*L\n669#1:1196,14\n669#1:1230\n669#1:1210,8\n669#1:1224,6\n669#1:1218,6\n*E\n"})
            /* renamed from: androidx.compose.foundation.text.k$e$a$a, reason: collision with other inner class name */
            static final class C0139a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7521b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ c1 f7522c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f7523d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ boolean f7524e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7525f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.text.input.z0 f7526g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.text.input.p0 f7527h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.unit.d f7528i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ int f7529j;

                /* compiled from: CoreTextField.kt */
                @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/text/k$e$a$a$a", "Landroidx/compose/ui/layout/m0;", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "b", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                @r1({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1$2\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,1195:1\n495#2,4:1196\n500#2:1205\n129#3,5:1200\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1$2\n*L\n676#1:1196,4\n676#1:1205\n676#1:1200,5\n*E\n"})
                /* renamed from: androidx.compose.foundation.text.k$e$a$a$a, reason: collision with other inner class name */
                public static final class C0140a implements androidx.compose.ui.layout.m0 {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ c1 f7530a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7531b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.ui.text.input.z0 f7532c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.ui.text.input.p0 f7533d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.ui.unit.d f7534e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ int f7535f;

                    /* compiled from: CoreTextField.kt */
                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.foundation.text.k$e$a$a$a$a, reason: collision with other inner class name */
                    static final class C0141a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

                        /* renamed from: b, reason: collision with root package name */
                        public static final C0141a f7536b = new C0141a(1);

                        C0141a() {
                            super(1);
                        }

                        public final void a(@fg.l i1.a aVar) {
                        }

                        @Override // ld.l
                        public k2 invoke(i1.a aVar) {
                            return k2.f75408a;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    C0140a(c1 c1Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, androidx.compose.ui.text.input.z0 z0Var, androidx.compose.ui.text.input.p0 p0Var, androidx.compose.ui.unit.d dVar, int i4) {
                        this.f7530a = c1Var;
                        this.f7531b = lVar;
                        this.f7532c = z0Var;
                        this.f7533d = p0Var;
                        this.f7534e = dVar;
                        this.f7535f = i4;
                    }

                    @Override // androidx.compose.ui.layout.m0
                    @fg.l
                    public androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
                        m.Companion companion = androidx.compose.runtime.snapshots.m.INSTANCE;
                        c1 c1Var = this.f7530a;
                        androidx.compose.runtime.snapshots.m c5 = companion.c();
                        try {
                            androidx.compose.runtime.snapshots.m r4 = c5.r();
                            try {
                                e1 h4 = c1Var.h();
                                androidx.compose.ui.text.n0 value = h4 != null ? h4.getValue() : null;
                                c5.d();
                                kotlin.l1<Integer, Integer, androidx.compose.ui.text.n0> c6 = q0.INSTANCE.c(this.f7530a.getTextDelegate(), j4, o0Var.getLayoutDirection(), value);
                                int intValue = c6.a().intValue();
                                int intValue2 = c6.b().intValue();
                                androidx.compose.ui.text.n0 c7 = c6.c();
                                if (!kotlin.jvm.internal.l0.g(value, c7)) {
                                    this.f7530a.B(new e1(c7));
                                    this.f7531b.invoke(c7);
                                    k.p(this.f7530a, this.f7532c, this.f7533d);
                                }
                                this.f7530a.C(this.f7534e.R(this.f7535f == 1 ? n0.a(c7.m(0)) : 0));
                                return o0Var.U3(intValue, intValue2, kotlin.collections.z0.W(new kotlin.q0(androidx.compose.ui.layout.b.a(), Integer.valueOf(kotlin.math.b.L0(c7.getFirstBaseline()))), new kotlin.q0(androidx.compose.ui.layout.b.b(), Integer.valueOf(kotlin.math.b.L0(c7.getLastBaseline())))), C0141a.f7536b);
                            } finally {
                                c5.y(r4);
                            }
                        } catch (Throwable th) {
                            c5.d();
                            throw th;
                        }
                    }

                    @Override // androidx.compose.ui.layout.m0
                    public int b(@fg.l androidx.compose.ui.layout.q qVar, @fg.l List<? extends androidx.compose.ui.layout.p> list, int i4) {
                        this.f7530a.getTextDelegate().q(qVar.getLayoutDirection());
                        return this.f7530a.getTextDelegate().d();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0139a(androidx.compose.foundation.text.selection.s0 s0Var, c1 c1Var, boolean z4, boolean z5, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, androidx.compose.ui.text.input.z0 z0Var, androidx.compose.ui.text.input.p0 p0Var, androidx.compose.ui.unit.d dVar, int i4) {
                    super(2);
                    this.f7521b = s0Var;
                    this.f7522c = c1Var;
                    this.f7523d = z4;
                    this.f7524e = z5;
                    this.f7525f = lVar;
                    this.f7526g = z0Var;
                    this.f7527h = p0Var;
                    this.f7528i = dVar;
                    this.f7529j = i4;
                }

                @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.i
                public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                    if ((i4 & 11) == 2 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(-363167407, i4, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:668)");
                    }
                    C0140a c0140a = new C0140a(this.f7522c, this.f7525f, this.f7526g, this.f7527h, this.f7528i, this.f7529j);
                    tVar.P(-1323940314);
                    q.Companion companion = androidx.compose.ui.q.INSTANCE;
                    boolean z4 = false;
                    int j4 = androidx.compose.runtime.p.j(tVar, 0);
                    androidx.compose.runtime.g0 B = tVar.B();
                    g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
                    ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
                    ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g4 = androidx.compose.ui.layout.a0.g(companion);
                    if (tVar.s() == null) {
                        androidx.compose.runtime.p.n();
                    }
                    tVar.W();
                    if (tVar.getInserting()) {
                        tVar.F(a5);
                    } else {
                        tVar.C();
                    }
                    m5.j(tVar, c0140a, companion2.f());
                    m5.j(tVar, B, companion2.h());
                    ld.p<androidx.compose.ui.node.g, Integer, k2> b5 = companion2.b();
                    if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                        androidx.compose.animation.d.a(j4, tVar, j4, b5);
                    }
                    g4.R(v3.a(tVar), tVar, 0);
                    tVar.P(2058660585);
                    tVar.p0();
                    tVar.H();
                    tVar.p0();
                    androidx.compose.foundation.text.selection.s0 s0Var = this.f7521b;
                    if (this.f7522c.c() != androidx.compose.foundation.text.p.None && this.f7522c.g() != null) {
                        androidx.compose.ui.layout.u g5 = this.f7522c.g();
                        kotlin.jvm.internal.l0.m(g5);
                        if (g5.f() && this.f7523d) {
                            z4 = true;
                        }
                    }
                    k.d(s0Var, z4, tVar, 8);
                    if (this.f7522c.c() == androidx.compose.foundation.text.p.Cursor && !this.f7524e && this.f7523d) {
                        k.e(this.f7521b, tVar, 8);
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.q0();
                    }
                }

                @Override // ld.p
                public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                    a(tVar, num.intValue());
                    return k2.f75408a;
                }
            }

            /* compiled from: CoreTextField.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/e1;", "a", "()Landroidx/compose/foundation/text/e1;"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.jvm.internal.n0 implements ld.a<e1> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c1 f7537b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(c1 c1Var) {
                    super(0);
                    this.f7537b = c1Var;
                }

                @fg.m
                public final e1 a() {
                    return this.f7537b.h();
                }

                @Override // ld.a
                public e1 invoke() {
                    return this.f7537b.h();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c1 c1Var, androidx.compose.ui.text.v0 v0Var, int i4, int i5, z0 z0Var, androidx.compose.ui.text.input.z0 z0Var2, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.ui.q qVar, androidx.compose.ui.q qVar2, androidx.compose.ui.q qVar3, androidx.compose.ui.q qVar4, androidx.compose.foundation.relocation.d dVar, androidx.compose.foundation.text.selection.s0 s0Var, boolean z4, boolean z5, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, androidx.compose.ui.text.input.p0 p0Var, androidx.compose.ui.unit.d dVar2) {
                super(2);
                this.f7503b = c1Var;
                this.f7504c = v0Var;
                this.f7505d = i4;
                this.f7506e = i5;
                this.f7507f = z0Var;
                this.f7508g = z0Var2;
                this.f7509h = k1Var;
                this.f7510i = qVar;
                this.f7511j = qVar2;
                this.f7512k = qVar3;
                this.f7513l = qVar4;
                this.f7514m = dVar;
                this.f7515n = s0Var;
                this.f7516o = z4;
                this.f7517p = z5;
                this.f7518q = lVar;
                this.f7519r = p0Var;
                this.f7520s = dVar2;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 11) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(2032502107, i4, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:645)");
                }
                androidx.compose.foundation.text.selection.p0.a(androidx.compose.foundation.relocation.f.b(b1.a(y0.c(androidx.compose.foundation.text.r.a(c2.k(androidx.compose.ui.q.INSTANCE, this.f7503b.i(), 0.0f, 2, null), this.f7504c, this.f7505d, this.f7506e), this.f7507f, this.f7508g, this.f7509h, new b(this.f7503b)).w3(this.f7510i).w3(this.f7511j), this.f7504c).w3(this.f7512k).w3(this.f7513l), this.f7514m), androidx.compose.runtime.internal.c.b(tVar, -363167407, true, new C0139a(this.f7515n, this.f7503b, this.f7516o, this.f7517p, this.f7518q, this.f7508g, this.f7519r, this.f7520s, this.f7506e)), tVar, 48, 0);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.q<? super ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar, c1 c1Var, androidx.compose.ui.text.v0 v0Var, int i4, int i5, z0 z0Var, androidx.compose.ui.text.input.z0 z0Var2, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.ui.q qVar2, androidx.compose.ui.q qVar3, androidx.compose.ui.q qVar4, androidx.compose.ui.q qVar5, androidx.compose.foundation.relocation.d dVar, androidx.compose.foundation.text.selection.s0 s0Var, boolean z4, boolean z5, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, androidx.compose.ui.text.input.p0 p0Var, androidx.compose.ui.unit.d dVar2) {
            super(2);
            this.f7484b = qVar;
            this.f7485c = c1Var;
            this.f7486d = v0Var;
            this.f7487e = i4;
            this.f7488f = i5;
            this.f7489g = z0Var;
            this.f7490h = z0Var2;
            this.f7491i = k1Var;
            this.f7492j = qVar2;
            this.f7493k = qVar3;
            this.f7494l = qVar4;
            this.f7495m = qVar5;
            this.f7496n = dVar;
            this.f7497o = s0Var;
            this.f7498p = z4;
            this.f7499q = z5;
            this.f7500r = lVar;
            this.f7501s = p0Var;
            this.f7502t = dVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-374338080, i4, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:642)");
            }
            this.f7484b.R(androidx.compose.runtime.internal.c.b(tVar, 2032502107, true, new a(this.f7485c, this.f7486d, this.f7487e, this.f7488f, this.f7489g, this.f7490h, this.f7491i, this.f7492j, this.f7493k, this.f7494l, this.f7495m, this.f7496n, this.f7497o, this.f7498p, this.f7499q, this.f7500r, this.f7501s, this.f7502t)), tVar, 6);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7538b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, k2> f7539c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7540d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7541e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f7542f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7543g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f7544h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ t1 f7545i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f7546j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7547k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7548l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z f7549m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ d0 f7550n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f7551o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f7552p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, androidx.compose.runtime.t, Integer, k2> f7553q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f7554r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f7555s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f7556t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.ui.text.input.z0 z0Var, ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar, androidx.compose.ui.q qVar, androidx.compose.ui.text.v0 v0Var, androidx.compose.ui.text.input.k1 k1Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar2, androidx.compose.foundation.interaction.k kVar, t1 t1Var, boolean z4, int i4, int i5, androidx.compose.ui.text.input.z zVar, d0 d0Var, boolean z5, boolean z6, ld.q<? super ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i6, int i7, int i10) {
            super(2);
            this.f7538b = z0Var;
            this.f7539c = lVar;
            this.f7540d = qVar;
            this.f7541e = v0Var;
            this.f7542f = k1Var;
            this.f7543g = lVar2;
            this.f7544h = kVar;
            this.f7545i = t1Var;
            this.f7546j = z4;
            this.f7547k = i4;
            this.f7548l = i5;
            this.f7549m = zVar;
            this.f7550n = d0Var;
            this.f7551o = z5;
            this.f7552p = z6;
            this.f7553q = qVar2;
            this.f7554r = i6;
            this.f7555s = i7;
            this.f7556t = i10;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            k.a(this.f7538b, this.f7539c, this.f7540d, this.f7541e, this.f7542f, this.f7543g, this.f7544h, this.f7545i, this.f7546j, this.f7547k, this.f7548l, this.f7549m, this.f7550n, this.f7551o, this.f7552p, this.f7553q, tVar, g3.b(this.f7554r | 1), g3.b(this.f7555s), this.f7556t);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.layout.u, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f7557b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(c1 c1Var) {
            super(1);
            this.f7557b = c1Var;
        }

        public final void a(@fg.l androidx.compose.ui.layout.u uVar) {
            e1 h4 = this.f7557b.h();
            if (h4 == null) {
                return;
            }
            h4.k(uVar);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.layout.u uVar) {
            a(uVar);
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1195:1\n246#2:1196\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$drawModifier$1\n*L\n403#1:1196\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f7558b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7559c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.p0 f7560d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(c1 c1Var, androidx.compose.ui.text.input.z0 z0Var, androidx.compose.ui.text.input.p0 p0Var) {
            super(1);
            this.f7558b = c1Var;
            this.f7559c = z0Var;
            this.f7560d = p0Var;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            e1 h4 = this.f7558b.h();
            if (h4 != null) {
                androidx.compose.ui.text.input.z0 z0Var = this.f7559c;
                androidx.compose.ui.text.input.p0 p0Var = this.f7560d;
                c1 c1Var = this.f7558b;
                q0.INSTANCE.b(fVar.getDrawContext().i(), z0Var, p0Var, h4.getValue(), c1Var.getSelectionPaint());
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/j0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/focus/j0;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.focus.j0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f7561b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.b1 f7562c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7563d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7564e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7565f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z f7566g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.p0 f7567h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7568i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f7569j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.relocation.d f7570k;

        /* compiled from: CoreTextField.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f7571b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.relocation.d f7572c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.z0 f7573d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c1 f7574e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e1 f7575f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.p0 f7576g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.relocation.d dVar, androidx.compose.ui.text.input.z0 z0Var, c1 c1Var, e1 e1Var, androidx.compose.ui.text.input.p0 p0Var, kotlin.coroutines.d<? super a> dVar2) {
                super(2, dVar2);
                this.f7572c = dVar;
                this.f7573d = z0Var;
                this.f7574e = c1Var;
                this.f7575f = e1Var;
                this.f7576g = p0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f7572c, this.f7573d, this.f7574e, this.f7575f, this.f7576g, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f7571b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.foundation.relocation.d dVar = this.f7572c;
                    androidx.compose.ui.text.input.z0 z0Var = this.f7573d;
                    m0 textDelegate = this.f7574e.getTextDelegate();
                    androidx.compose.ui.text.n0 value = this.f7575f.getValue();
                    androidx.compose.ui.text.input.p0 p0Var = this.f7576g;
                    this.f7571b = 1;
                    if (k.m(dVar, z0Var, textDelegate, value, p0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(c1 c1Var, androidx.compose.ui.text.input.b1 b1Var, boolean z4, boolean z5, androidx.compose.ui.text.input.z0 z0Var, androidx.compose.ui.text.input.z zVar, androidx.compose.ui.text.input.p0 p0Var, androidx.compose.foundation.text.selection.s0 s0Var, kotlinx.coroutines.r0 r0Var, androidx.compose.foundation.relocation.d dVar) {
            super(1);
            this.f7561b = c1Var;
            this.f7562c = b1Var;
            this.f7563d = z4;
            this.f7564e = z5;
            this.f7565f = z0Var;
            this.f7566g = zVar;
            this.f7567h = p0Var;
            this.f7568i = s0Var;
            this.f7569j = r0Var;
            this.f7570k = dVar;
        }

        public final void a(@fg.l androidx.compose.ui.focus.j0 j0Var) {
            e1 h4;
            if (this.f7561b.d() == j0Var.isFocused()) {
                return;
            }
            this.f7561b.x(j0Var.isFocused());
            if (this.f7562c != null) {
                if (this.f7561b.d() && this.f7563d && !this.f7564e) {
                    k.r(this.f7562c, this.f7561b, this.f7565f, this.f7566g, this.f7567h);
                } else {
                    k.n(this.f7561b);
                }
                if (j0Var.isFocused() && (h4 = this.f7561b.h()) != null) {
                    kotlinx.coroutines.k.f(this.f7569j, null, null, new a(this.f7570k, this.f7565f, this.f7561b, h4, this.f7567h, null), 3, null);
                }
            }
            if (j0Var.isFocused()) {
                return;
            }
            androidx.compose.foundation.text.selection.s0.u(this.f7568i, null, 1, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.focus.j0 j0Var) {
            a(j0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.layout.u, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f7577b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7578c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ d6 f7579d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7580e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7581f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.p0 f7582g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(c1 c1Var, boolean z4, d6 d6Var, androidx.compose.foundation.text.selection.s0 s0Var, androidx.compose.ui.text.input.z0 z0Var, androidx.compose.ui.text.input.p0 p0Var) {
            super(1);
            this.f7577b = c1Var;
            this.f7578c = z4;
            this.f7579d = d6Var;
            this.f7580e = s0Var;
            this.f7581f = z0Var;
            this.f7582g = p0Var;
        }

        public final void a(@fg.l androidx.compose.ui.layout.u uVar) {
            this.f7577b.A(uVar);
            e1 h4 = this.f7577b.h();
            if (h4 != null) {
                h4.l(uVar);
            }
            if (this.f7578c) {
                if (this.f7577b.c() == androidx.compose.foundation.text.p.Selection) {
                    if (this.f7577b.p()) {
                        this.f7580e.k0();
                    } else {
                        this.f7580e.T();
                    }
                    this.f7577b.G(androidx.compose.foundation.text.selection.t0.c(this.f7580e, true));
                    this.f7577b.F(androidx.compose.foundation.text.selection.t0.c(this.f7580e, false));
                    this.f7577b.D(androidx.compose.ui.text.t0.h(this.f7581f.getSelection()));
                } else if (this.f7577b.c() == androidx.compose.foundation.text.p.Cursor) {
                    this.f7577b.D(androidx.compose.foundation.text.selection.t0.c(this.f7580e, true));
                }
                k.p(this.f7577b, this.f7581f, this.f7582g);
                e1 h5 = this.f7577b.h();
                if (h5 != null) {
                    c1 c1Var = this.f7577b;
                    androidx.compose.ui.text.input.z0 z0Var = this.f7581f;
                    androidx.compose.ui.text.input.p0 p0Var = this.f7582g;
                    androidx.compose.ui.text.input.h1 inputSession = c1Var.getInputSession();
                    if (inputSession == null || !c1Var.d()) {
                        return;
                    }
                    q0.INSTANCE.k(inputSession, z0Var, p0Var, h5);
                }
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.layout.u uVar) {
            a(uVar);
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.k$k, reason: collision with other inner class name */
    static final class C0142k extends kotlin.jvm.internal.n0 implements ld.l<Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f7583b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0142k(c1 c1Var) {
            super(1);
            this.f7583b = c1Var;
        }

        public final void a(boolean z4) {
            this.f7583b.y(z4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Boolean bool) {
            a(bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "offset", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<i0.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f7584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.a0 f7585c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7586d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7587e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.p0 f7588f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(c1 c1Var, androidx.compose.ui.focus.a0 a0Var, boolean z4, androidx.compose.foundation.text.selection.s0 s0Var, androidx.compose.ui.text.input.p0 p0Var) {
            super(1);
            this.f7584b = c1Var;
            this.f7585c = a0Var;
            this.f7586d = z4;
            this.f7587e = s0Var;
            this.f7588f = p0Var;
        }

        public final void a(long j4) {
            k.s(this.f7584b, this.f7585c, !this.f7586d);
            if (this.f7584b.d()) {
                if (this.f7584b.c() == androidx.compose.foundation.text.p.Selection) {
                    this.f7587e.t(i0.f.d(j4));
                    return;
                }
                e1 h4 = this.f7584b.h();
                if (h4 != null) {
                    c1 c1Var = this.f7584b;
                    q0.INSTANCE.j(j4, h4, c1Var.getProcessor(), this.f7588f, c1Var.k());
                    if (c1Var.getTextDelegate().getText().length() > 0) {
                        c1Var.w(androidx.compose.foundation.text.p.Cursor);
                    }
                }
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i0.f fVar) {
            a(fVar.getPackedValue());
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/z0;", "a", "()Landroidx/compose/foundation/text/z0;"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.a<z0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.j0 f7589b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.compose.foundation.gestures.j0 j0Var) {
            super(0);
            this.f7589b = j0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke() {
            return new z0(this.f7589b, 0.0f, 2, null);
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.i1 f7590b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7591c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f7592d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7593e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z f7594f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f7595g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ c1 f7596h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.p0 f7597i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7598j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.a0 f7599k;

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7600b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.foundation.text.selection.s0 s0Var) {
                super(0);
                this.f7600b = s0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f7600b.V();
                return Boolean.TRUE;
            }
        }

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/n0;", "it", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<List<androidx.compose.ui.text.n0>, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c1 f7601b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c1 c1Var) {
                super(1);
                this.f7601b = c1Var;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l List<androidx.compose.ui.text.n0> list) {
                boolean z4;
                if (this.f7601b.h() != null) {
                    e1 h4 = this.f7601b.h();
                    kotlin.jvm.internal.l0.m(h4);
                    list.add(h4.getValue());
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            }
        }

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "text", "", "a", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.e, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f7602b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f7603c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c1 f7604d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.semantics.z f7605e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(boolean z4, boolean z5, c1 c1Var, androidx.compose.ui.semantics.z zVar) {
                super(1);
                this.f7602b = z4;
                this.f7603c = z5;
                this.f7604d = c1Var;
                this.f7605e = zVar;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l androidx.compose.ui.text.e eVar) {
                k2 k2Var;
                if (this.f7602b || !this.f7603c) {
                    return Boolean.FALSE;
                }
                androidx.compose.ui.text.input.h1 inputSession = this.f7604d.getInputSession();
                if (inputSession != null) {
                    c1 c1Var = this.f7604d;
                    q0.INSTANCE.g(kotlin.collections.w.O(new androidx.compose.ui.text.input.m(), new androidx.compose.ui.text.input.b(eVar, 1)), c1Var.getProcessor(), c1Var.k(), inputSession);
                    k2Var = k2.f75408a;
                } else {
                    k2Var = null;
                }
                if (k2Var == null) {
                    ld.l<androidx.compose.ui.text.input.z0, k2> k4 = this.f7604d.k();
                    String text = eVar.getText();
                    int length = eVar.getText().length();
                    k4.invoke(new androidx.compose.ui.text.input.z0(text, androidx.compose.ui.text.u0.b(length, length), (androidx.compose.ui.text.t0) null, 4, (kotlin.jvm.internal.w) null));
                }
                return Boolean.TRUE;
            }
        }

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "text", "", "a", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.e, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f7606b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f7607c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c1 f7608d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.semantics.z f7609e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.z0 f7610f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(boolean z4, boolean z5, c1 c1Var, androidx.compose.ui.semantics.z zVar, androidx.compose.ui.text.input.z0 z0Var) {
                super(1);
                this.f7606b = z4;
                this.f7607c = z5;
                this.f7608d = c1Var;
                this.f7609e = zVar;
                this.f7610f = z0Var;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l androidx.compose.ui.text.e eVar) {
                k2 k2Var;
                if (this.f7606b || !this.f7607c) {
                    return Boolean.FALSE;
                }
                androidx.compose.ui.text.input.h1 inputSession = this.f7608d.getInputSession();
                if (inputSession != null) {
                    c1 c1Var = this.f7608d;
                    q0.INSTANCE.g(kotlin.collections.w.O(new androidx.compose.ui.text.input.u(), new androidx.compose.ui.text.input.b(eVar, 1)), c1Var.getProcessor(), c1Var.k(), inputSession);
                    k2Var = k2.f75408a;
                } else {
                    k2Var = null;
                }
                if (k2Var == null) {
                    androidx.compose.ui.text.input.z0 z0Var = this.f7610f;
                    c1 c1Var2 = this.f7608d;
                    String obj = kotlin.text.v.G4(z0Var.i(), androidx.compose.ui.text.t0.n(z0Var.getSelection()), (int) (z0Var.getSelection() & 4294967295L), eVar).toString();
                    int length = eVar.length() + ((int) (z0Var.getSelection() >> 32));
                    c1Var2.k().invoke(new androidx.compose.ui.text.input.z0(obj, androidx.compose.ui.text.u0.b(length, length), (androidx.compose.ui.text.t0) null, 4, (kotlin.jvm.internal.w) null));
                }
                return Boolean.TRUE;
            }
        }

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "selectionStart", "selectionEnd", "", "relativeToOriginalText", "a", "(IIZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class e extends kotlin.jvm.internal.n0 implements ld.q<Integer, Integer, Boolean, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.p0 f7611b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f7612c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.z0 f7613d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7614e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c1 f7615f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(androidx.compose.ui.text.input.p0 p0Var, boolean z4, androidx.compose.ui.text.input.z0 z0Var, androidx.compose.foundation.text.selection.s0 s0Var, c1 c1Var) {
                super(3);
                this.f7611b = p0Var;
                this.f7612c = z4;
                this.f7613d = z0Var;
                this.f7614e = s0Var;
                this.f7615f = c1Var;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ Boolean R(Integer num, Integer num2, Boolean bool) {
                return a(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            @fg.l
            public final Boolean a(int i4, int i5, boolean z4) {
                if (!z4) {
                    i4 = this.f7611b.a(i4);
                }
                if (!z4) {
                    i5 = this.f7611b.a(i5);
                }
                boolean z5 = false;
                if (this.f7612c && (i4 != androidx.compose.ui.text.t0.n(this.f7613d.getSelection()) || i5 != ((int) (this.f7613d.getSelection() & 4294967295L)))) {
                    if (Math.min(i4, i5) < 0 || Math.max(i4, i5) > this.f7613d.getAnnotatedString().length()) {
                        this.f7614e.x();
                    } else {
                        if (z4 || i4 == i5) {
                            this.f7614e.x();
                        } else {
                            androidx.compose.foundation.text.selection.s0.w(this.f7614e, false, 1, null);
                        }
                        this.f7615f.k().invoke(new androidx.compose.ui.text.input.z0(this.f7613d.getAnnotatedString(), androidx.compose.ui.text.u0.b(i4, i5), (androidx.compose.ui.text.t0) null, 4, (kotlin.jvm.internal.w) null));
                        z5 = true;
                    }
                }
                return Boolean.valueOf(z5);
            }
        }

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class f extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c1 f7616b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.input.z f7617c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(c1 c1Var, androidx.compose.ui.text.input.z zVar) {
                super(0);
                this.f7616b = c1Var;
                this.f7617c = zVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f7616b.j().invoke(androidx.compose.ui.text.input.y.i(this.f7617c.getImeAction()));
                return Boolean.TRUE;
            }
        }

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class g extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c1 f7618b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.focus.a0 f7619c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f7620d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(c1 c1Var, androidx.compose.ui.focus.a0 a0Var, boolean z4) {
                super(0);
                this.f7618b = c1Var;
                this.f7619c = a0Var;
                this.f7620d = z4;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                k.s(this.f7618b, this.f7619c, !this.f7620d);
                return Boolean.TRUE;
            }
        }

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class h extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7621b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(androidx.compose.foundation.text.selection.s0 s0Var) {
                super(0);
                this.f7621b = s0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                androidx.compose.foundation.text.selection.s0.w(this.f7621b, false, 1, null);
                return Boolean.TRUE;
            }
        }

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class i extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7622b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(androidx.compose.foundation.text.selection.s0 s0Var) {
                super(0);
                this.f7622b = s0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                androidx.compose.foundation.text.selection.s0.p(this.f7622b, false, 1, null);
                return Boolean.TRUE;
            }
        }

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class j extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7623b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(androidx.compose.foundation.text.selection.s0 s0Var) {
                super(0);
                this.f7623b = s0Var;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.f7623b.s();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(androidx.compose.ui.text.input.i1 i1Var, androidx.compose.ui.text.input.z0 z0Var, boolean z4, boolean z5, androidx.compose.ui.text.input.z zVar, boolean z6, c1 c1Var, androidx.compose.ui.text.input.p0 p0Var, androidx.compose.foundation.text.selection.s0 s0Var, androidx.compose.ui.focus.a0 a0Var) {
            super(1);
            this.f7590b = i1Var;
            this.f7591c = z0Var;
            this.f7592d = z4;
            this.f7593e = z5;
            this.f7594f = zVar;
            this.f7595g = z6;
            this.f7596h = c1Var;
            this.f7597i = p0Var;
            this.f7598j = s0Var;
            this.f7599k = a0Var;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.c1(zVar, this.f7590b.getText());
            androidx.compose.ui.semantics.w.v1(zVar, this.f7591c.getSelection());
            if (!this.f7592d) {
                androidx.compose.ui.semantics.w.n(zVar);
            }
            if (this.f7593e) {
                androidx.compose.ui.semantics.w.K0(zVar);
            }
            androidx.compose.ui.semantics.w.Z(zVar, null, new b(this.f7596h), 1, null);
            androidx.compose.ui.semantics.w.u1(zVar, null, new c(this.f7595g, this.f7592d, this.f7596h, zVar), 1, null);
            androidx.compose.ui.semantics.w.n0(zVar, null, new d(this.f7595g, this.f7592d, this.f7596h, zVar, this.f7591c), 1, null);
            androidx.compose.ui.semantics.w.o1(zVar, null, new e(this.f7597i, this.f7592d, this.f7591c, this.f7598j, this.f7596h), 1, null);
            androidx.compose.ui.semantics.w.z0(zVar, this.f7594f.getImeAction(), null, new f(this.f7596h, this.f7594f), 2, null);
            androidx.compose.ui.semantics.w.x0(zVar, null, new g(this.f7596h, this.f7599k, this.f7595g), 1, null);
            androidx.compose.ui.semantics.w.B0(zVar, null, new h(this.f7598j), 1, null);
            if (!androidx.compose.ui.text.t0.h(this.f7591c.getSelection()) && !this.f7593e) {
                androidx.compose.ui.semantics.w.j(zVar, null, new i(this.f7598j), 1, null);
                if (this.f7592d && !this.f7595g) {
                    androidx.compose.ui.semantics.w.l(zVar, null, new j(this.f7598j), 1, null);
                }
            }
            if (!this.f7592d || this.f7595g) {
                return;
            }
            androidx.compose.ui.semantics.w.M0(zVar, null, new a(this.f7598j), 1, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class o extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7624b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7625c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, k2> f7626d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7627e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(androidx.compose.ui.q qVar, androidx.compose.foundation.text.selection.s0 s0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4) {
            super(2);
            this.f7624b = qVar;
            this.f7625c = s0Var;
            this.f7626d = pVar;
            this.f7627e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            k.c(this.f7624b, this.f7625c, this.f7626d, tVar, g3.b(this.f7627e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class p extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7628b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f7629c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f7630d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(androidx.compose.foundation.text.selection.s0 s0Var, boolean z4, int i4) {
            super(2);
            this.f7628b = s0Var;
            this.f7629c = z4;
            this.f7630d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            k.d(this.f7628b, this.f7629c, tVar, g3.b(this.f7630d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", i = {}, l = {1134}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f7631b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f7632c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ o0 f7633d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7634e;

        /* compiled from: CoreTextField.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1", f = "CoreTextField.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f7635b;

            /* renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f7636c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.k0 f7637d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ o0 f7638e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7639f;

            /* compiled from: CoreTextField.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$1", f = "CoreTextField.kt", i = {}, l = {1138}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.foundation.text.k$q$a$a, reason: collision with other inner class name */
            static final class C0143a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f7640b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.input.pointer.k0 f7641c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ o0 f7642d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0143a(androidx.compose.ui.input.pointer.k0 k0Var, o0 o0Var, kotlin.coroutines.d<? super C0143a> dVar) {
                    super(2, dVar);
                    this.f7641c = k0Var;
                    this.f7642d = o0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new C0143a(this.f7641c, this.f7642d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f7640b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        androidx.compose.ui.input.pointer.k0 k0Var = this.f7641c;
                        o0 o0Var = this.f7642d;
                        this.f7640b = 1;
                        if (g0.c(k0Var, o0Var, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((C0143a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* compiled from: CoreTextField.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$2", f = "CoreTextField.kt", i = {}, l = {1141}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f7643b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.input.pointer.k0 f7644c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7645d;

                /* compiled from: CoreTextField.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.foundation.text.k$q$a$b$a, reason: collision with other inner class name */
                static final class C0144a extends kotlin.jvm.internal.n0 implements ld.l<i0.f, k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7646b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0144a(androidx.compose.foundation.text.selection.s0 s0Var) {
                        super(1);
                        this.f7646b = s0Var;
                    }

                    public final void a(long j4) {
                        this.f7646b.k0();
                    }

                    @Override // ld.l
                    public /* bridge */ /* synthetic */ k2 invoke(i0.f fVar) {
                        a(fVar.getPackedValue());
                        return k2.f75408a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(androidx.compose.ui.input.pointer.k0 k0Var, androidx.compose.foundation.text.selection.s0 s0Var, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f7644c = k0Var;
                    this.f7645d = s0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.l
                public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                    return new b(this.f7644c, this.f7645d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    int i4 = this.f7643b;
                    if (i4 == 0) {
                        kotlin.a1.n(obj);
                        androidx.compose.ui.input.pointer.k0 k0Var = this.f7644c;
                        C0144a c0144a = new C0144a(this.f7645d);
                        this.f7643b = 1;
                        if (androidx.compose.foundation.gestures.z0.m(k0Var, null, null, null, c0144a, this, 7, null) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a1.n(obj);
                    }
                    return k2.f75408a;
                }

                @Override // ld.p
                @fg.m
                public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                    return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.k0 k0Var, o0 o0Var, androidx.compose.foundation.text.selection.s0 s0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f7637d = k0Var;
                this.f7638e = o0Var;
                this.f7639f = s0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f7637d, this.f7638e, this.f7639f, dVar);
                aVar.f7636c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f7635b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
                kotlinx.coroutines.r0 r0Var = (kotlinx.coroutines.r0) this.f7636c;
                kotlinx.coroutines.t0 t0Var = kotlinx.coroutines.t0.UNDISPATCHED;
                kotlinx.coroutines.k.f(r0Var, null, t0Var, new C0143a(this.f7637d, this.f7638e, null), 1, null);
                kotlinx.coroutines.k.f(r0Var, null, t0Var, new b(this.f7637d, this.f7639f, null), 1, null);
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(o0 o0Var, androidx.compose.foundation.text.selection.s0 s0Var, kotlin.coroutines.d<? super q> dVar) {
            super(2, dVar);
            this.f7633d = o0Var;
            this.f7634e = s0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((q) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            q qVar = new q(this.f7633d, this.f7634e, dVar);
            qVar.f7632c = obj;
            return qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f7631b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                a aVar2 = new a((androidx.compose.ui.input.pointer.k0) this.f7632c, this.f7633d, this.f7634e, null);
                this.f7631b = 1;
                if (kotlinx.coroutines.s0.g(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f7647b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(long j4) {
            super(1);
            this.f7647b = j4;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            zVar.b(androidx.compose.foundation.text.selection.c0.d(), new androidx.compose.foundation.text.selection.b0(androidx.compose.foundation.text.o.Cursor, this.f7647b, androidx.compose.foundation.text.selection.a0.Middle, true, null));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class s extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7648b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7649c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(androidx.compose.foundation.text.selection.s0 s0Var, int i4) {
            super(2);
            this.f7648b = s0Var;
            this.f7649c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            k.e(this.f7648b, tVar, g3.b(this.f7649c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class t extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.input.key.c, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c1 f7650b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.s0 f7651c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(c1 c1Var, androidx.compose.foundation.text.selection.s0 s0Var) {
            super(1);
            this.f7650b = c1Var;
            this.f7651c = s0Var;
        }

        @fg.l
        public final Boolean a(@fg.l KeyEvent keyEvent) {
            boolean z4;
            if (this.f7650b.c() == androidx.compose.foundation.text.p.Selection && x.a(keyEvent)) {
                z4 = true;
                androidx.compose.foundation.text.selection.s0.u(this.f7651c, null, 1, null);
            } else {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            return a(cVar.h());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0685 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x039f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x040f  */
    /* JADX WARN: Type inference failed for: r0v32, types: [androidx.compose.ui.q] */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.ui.text.input.z0 r48, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> r49, @fg.m androidx.compose.ui.q r50, @fg.m androidx.compose.ui.text.v0 r51, @fg.m androidx.compose.ui.text.input.k1 r52, @fg.m ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> r53, @fg.m androidx.compose.foundation.interaction.k r54, @fg.m androidx.compose.ui.graphics.t1 r55, boolean r56, int r57, int r58, @fg.m androidx.compose.ui.text.input.z r59, @fg.m androidx.compose.foundation.text.d0 r60, boolean r61, boolean r62, @fg.m ld.q<? super ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2>, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r63, @fg.m androidx.compose.runtime.t r64, int r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 1989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.k.a(androidx.compose.ui.text.input.z0, ld.l, androidx.compose.ui.q, androidx.compose.ui.text.v0, androidx.compose.ui.text.input.k1, ld.l, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.t1, boolean, int, int, androidx.compose.ui.text.input.z, androidx.compose.foundation.text.d0, boolean, boolean, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void c(androidx.compose.ui.q qVar, androidx.compose.foundation.text.selection.s0 s0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(-20551815);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-20551815, i4, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:746)");
        }
        o4.P(733328855);
        androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, true, o4, 48, -1323940314);
        int j4 = androidx.compose.runtime.p.j(o4, 0);
        androidx.compose.runtime.g0 B = o4.B();
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        ld.a<androidx.compose.ui.node.g> a6 = companion.a();
        ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g4 = androidx.compose.ui.layout.a0.g(qVar);
        if (o4.s() == null) {
            androidx.compose.runtime.p.n();
        }
        o4.W();
        if (o4.getInserting()) {
            o4.F(a6);
        } else {
            o4.C();
        }
        ld.p a7 = androidx.compose.animation.p.a(companion, o4, a5, o4, B);
        if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, o4, j4, a7);
        }
        androidx.compose.animation.e.a(0, g4, v3.a(o4), o4, 2058660585);
        androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
        o4.P(-1985516685);
        pVar.invoke(o4, Integer.valueOf(((((i4 >> 3) & 112) | 8) >> 3) & 14));
        o4.p0();
        o4.p0();
        o4.H();
        o4.p0();
        o4.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new o(qVar, s0Var, pVar, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void d(androidx.compose.foundation.text.selection.s0 s0Var, boolean z4, androidx.compose.runtime.t tVar, int i4) {
        e1 h4;
        androidx.compose.ui.text.n0 value;
        androidx.compose.runtime.t o4 = tVar.o(626339208);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(626339208, i4, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1082)");
        }
        if (z4) {
            c1 state = s0Var.getState();
            androidx.compose.ui.text.n0 n0Var = null;
            if (state != null && (h4 = state.h()) != null && (value = h4.getValue()) != null) {
                c1 state2 = s0Var.getState();
                if (!(state2 != null ? state2.getIsLayoutResultStale() : true)) {
                    n0Var = value;
                }
            }
            if (n0Var != null) {
                if (!androidx.compose.ui.text.t0.h(s0Var.Q().getSelection())) {
                    int b5 = s0Var.getOffsetMapping().b((int) (s0Var.Q().getSelection() >> 32));
                    int b6 = s0Var.getOffsetMapping().b((int) (s0Var.Q().getSelection() & 4294967295L));
                    androidx.compose.ui.text.style.i c5 = n0Var.c(b5);
                    androidx.compose.ui.text.style.i c6 = n0Var.c(Math.max(b6 - 1, 0));
                    o4.P(-498386764);
                    c1 state3 = s0Var.getState();
                    if (state3 != null && state3.r()) {
                        androidx.compose.foundation.text.selection.t0.a(true, c5, s0Var, o4, 518);
                    }
                    o4.p0();
                    c1 state4 = s0Var.getState();
                    if (state4 != null && state4.q()) {
                        androidx.compose.foundation.text.selection.t0.a(false, c6, s0Var, o4, 518);
                    }
                }
                c1 state5 = s0Var.getState();
                if (state5 != null) {
                    if (s0Var.U()) {
                        state5.E(false);
                    }
                    if (state5.d()) {
                        if (state5.p()) {
                            s0Var.k0();
                        } else {
                            s0Var.T();
                        }
                    }
                }
            }
        } else {
            s0Var.T();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new p(s0Var, z4, i4));
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void e(@fg.l androidx.compose.foundation.text.selection.s0 s0Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.ui.text.e N;
        androidx.compose.runtime.t o4 = tVar.o(-1436003720);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1436003720, i4, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1125)");
        }
        c1 state = s0Var.getState();
        if (state != null && state.o() && (N = s0Var.N()) != null && N.length() > 0) {
            o4.P(1157296644);
            boolean q02 = o4.q0(s0Var);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = s0Var.r();
                o4.E(Q);
            }
            o4.p0();
            o0 o0Var = (o0) Q;
            long B = s0Var.B((androidx.compose.ui.unit.d) o4.x(androidx.compose.ui.platform.h1.i()));
            androidx.compose.ui.q e4 = androidx.compose.ui.input.pointer.u0.e(androidx.compose.ui.q.INSTANCE, o0Var, new q(o0Var, s0Var, null));
            o4.P(-272875148);
            boolean g4 = o4.g(B);
            Object Q2 = o4.Q();
            if (g4 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new r(B);
                o4.E(Q2);
            }
            o4.p0();
            androidx.compose.foundation.text.a.a(B, androidx.compose.ui.semantics.o.f(e4, false, (ld.l) Q2, 1, null), null, o4, 384);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new s(s0Var, i4));
        }
    }

    @fg.m
    public static final Object m(@fg.l androidx.compose.foundation.relocation.d dVar, @fg.l androidx.compose.ui.text.input.z0 z0Var, @fg.l m0 m0Var, @fg.l androidx.compose.ui.text.n0 n0Var, @fg.l androidx.compose.ui.text.input.p0 p0Var, @fg.l kotlin.coroutines.d<? super k2> dVar2) {
        int b5 = p0Var.b(androidx.compose.ui.text.t0.k(z0Var.getSelection()));
        Object a5 = dVar.a(b5 < n0Var.getLayoutInput().getText().length() ? n0Var.d(b5) : b5 != 0 ? n0Var.d(b5 - 1) : new i0.i(0.0f, 0.0f, 1.0f, androidx.compose.ui.unit.u.j(r0.b(m0Var.getStyle(), m0Var.getDensity(), m0Var.getFontFamilyResolver(), null, 0, 24, null))), dVar2);
        return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(c1 c1Var) {
        androidx.compose.ui.text.input.h1 inputSession = c1Var.getInputSession();
        if (inputSession != null) {
            q0.INSTANCE.f(inputSession, c1Var.getProcessor(), c1Var.k());
        }
        c1Var.z(null);
    }

    public static final boolean o(@fg.l d6 d6Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(c1 c1Var, androidx.compose.ui.text.input.z0 z0Var, androidx.compose.ui.text.input.p0 p0Var) {
        androidx.compose.runtime.snapshots.m c5 = androidx.compose.runtime.snapshots.m.INSTANCE.c();
        try {
            androidx.compose.runtime.snapshots.m r4 = c5.r();
            try {
                e1 h4 = c1Var.h();
                if (h4 == null) {
                    return;
                }
                androidx.compose.ui.text.input.h1 inputSession = c1Var.getInputSession();
                if (inputSession == null) {
                    return;
                }
                androidx.compose.ui.layout.u g4 = c1Var.g();
                if (g4 == null) {
                    return;
                }
                q0.INSTANCE.e(z0Var, c1Var.getTextDelegate(), h4.getValue(), g4, inputSession, c1Var.d(), p0Var);
                k2 k2Var = k2.f75408a;
            } finally {
                c5.y(r4);
            }
        } finally {
            c5.d();
        }
    }

    private static final androidx.compose.ui.q q(androidx.compose.ui.q qVar, c1 c1Var, androidx.compose.foundation.text.selection.s0 s0Var) {
        return androidx.compose.ui.input.key.f.b(qVar, new t(c1Var, s0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(androidx.compose.ui.text.input.b1 b1Var, c1 c1Var, androidx.compose.ui.text.input.z0 z0Var, androidx.compose.ui.text.input.z zVar, androidx.compose.ui.text.input.p0 p0Var) {
        c1Var.z(q0.INSTANCE.i(b1Var, z0Var, c1Var.getProcessor(), zVar, c1Var.k(), c1Var.j()));
        p(c1Var, z0Var, p0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(c1 c1Var, androidx.compose.ui.focus.a0 a0Var, boolean z4) {
        g5 keyboardController;
        if (!c1Var.d()) {
            a0Var.e();
        } else {
            if (!z4 || (keyboardController = c1Var.getKeyboardController()) == null) {
                return;
            }
            keyboardController.b();
        }
    }
}
