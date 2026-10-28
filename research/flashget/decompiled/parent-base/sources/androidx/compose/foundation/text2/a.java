package androidx.compose.foundation.text2;

import android.view.KeyEvent;
import androidx.compose.foundation.text.a0;
import androidx.compose.foundation.text.c0;
import androidx.compose.foundation.text.f0;
import androidx.compose.foundation.text2.input.t;
import androidx.compose.foundation.text2.input.u;
import androidx.compose.foundation.w2;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v3;
import androidx.compose.runtime.x;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.layout.m0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.platform.i5;
import androidx.compose.ui.platform.k5;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.text.input.y;
import androidx.compose.ui.text.input.z0;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.v;
import ld.p;

/* compiled from: BasicSecureTextField.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aè\u0001\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u001728\b\u0002\u0010!\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aÔ\u0001\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u001728\b\u0002\u0010!\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010.\u001a\"\u00101\u001a\u00020\u00032\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u00030\u001b¢\u0006\u0002\b/H\u0003¢\u0006\u0004\b1\u00102\"\u0014\u00105\u001a\u0002038\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068²\u0006\u000e\u00107\u001a\u0002068\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/k2;", "onValueChange", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/foundation/text2/input/g;", "onSubmit", "Landroidx/compose/ui/text/input/y;", "imeAction", "Landroidx/compose/foundation/text2/input/w;", "textObfuscationMode", "Landroidx/compose/ui/text/input/g0;", "keyboardType", "", "enabled", "Landroidx/compose/foundation/text2/input/h;", "inputTransformation", "Landroidx/compose/ui/text/v0;", "textStyle", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/ui/graphics/t1;", "cursorBrush", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/d;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/n0;", "Lkotlin/r0;", "name", "getResult", "Lkotlin/u;", "onTextLayout", "Landroidx/compose/foundation/text2/f;", "decorator", "Landroidx/compose/foundation/w2;", "scrollState", "a", "(Ljava/lang/String;Lld/l;Landroidx/compose/ui/q;Landroidx/compose/foundation/text2/input/g;IIIZLandroidx/compose/foundation/text2/input/h;Landroidx/compose/ui/text/v0;Landroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/t1;Lld/p;Landroidx/compose/foundation/text2/f;Landroidx/compose/foundation/w2;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/foundation/text2/input/u;", "state", "b", "(Landroidx/compose/foundation/text2/input/u;Landroidx/compose/ui/q;Landroidx/compose/foundation/text2/input/g;IIIZLandroidx/compose/foundation/text2/input/h;Landroidx/compose/ui/text/v0;Landroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/t1;Lld/p;Landroidx/compose/foundation/text2/f;Landroidx/compose/foundation/w2;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/foundation/text/d0;", "f", "(Landroidx/compose/foundation/text2/input/g;)Landroidx/compose/foundation/text/d0;", "Landroidx/compose/runtime/i;", "content", "e", "(Lld/p;Landroidx/compose/runtime/t;I)V", "", "J", "LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS", "Landroidx/compose/ui/text/input/z0;", "valueWithSelection", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/BasicSecureTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,523:1\n25#2:524\n25#2:531\n25#2:548\n36#2:559\n36#2:567\n1116#3,6:525\n1116#3,6:532\n1116#3,6:538\n1116#3,3:549\n1119#3,3:555\n1116#3,6:560\n1116#3,6:568\n487#4,4:544\n491#4,2:552\n495#4:558\n487#5:554\n74#6:566\n81#7:574\n107#7,2:575\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/BasicSecureTextFieldKt\n*L\n159#1:524\n169#1:531\n282#1:548\n283#1:559\n493#1:567\n159#1:525,6\n169#1:532,6\n184#1:538,6\n282#1:549,3\n282#1:555,3\n283#1:560,6\n493#1:568,6\n282#1:544,4\n282#1:552,2\n282#1:558\n282#1:554\n492#1:566\n169#1:574\n169#1:575,2\n*E\n"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f8346a = 1500;

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text2.a$a, reason: collision with other inner class name */
    static final class C0172a extends n0 implements ld.l<z0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<String, k2> f8347b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<z0> f8348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0172a(ld.l<? super String, k2> lVar, androidx.compose.runtime.k2<z0> k2Var) {
            super(1);
            this.f8347b = lVar;
            this.f8348c = k2Var;
        }

        public final void a(@fg.l z0 z0Var) {
            if (!l0.g(z0Var.i(), this.f8348c.getValue().i())) {
                this.f8347b.invoke(z0Var.i());
            }
            this.f8348c.setValue(z0Var);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(z0 z0Var) {
            a(z0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8349b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, k2> f8350c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f8351d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.g f8352e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8353f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f8354g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f8355h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f8356i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.h f8357j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ v0 f8358k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f8359l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ t1 f8360m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.ui.unit.d, ld.a<androidx.compose.ui.text.n0>, k2> f8361n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.f f8362o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ w2 f8363p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f8364q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f8365r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f8366s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, ld.l<? super String, k2> lVar, q qVar, androidx.compose.foundation.text2.input.g gVar, int i4, int i5, int i6, boolean z4, androidx.compose.foundation.text2.input.h hVar, v0 v0Var, androidx.compose.foundation.interaction.k kVar, t1 t1Var, p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, k2> pVar, androidx.compose.foundation.text2.f fVar, w2 w2Var, int i7, int i10, int i11) {
            super(2);
            this.f8349b = str;
            this.f8350c = lVar;
            this.f8351d = qVar;
            this.f8352e = gVar;
            this.f8353f = i4;
            this.f8354g = i5;
            this.f8355h = i6;
            this.f8356i = z4;
            this.f8357j = hVar;
            this.f8358k = v0Var;
            this.f8359l = kVar;
            this.f8360m = t1Var;
            this.f8361n = pVar;
            this.f8362o = fVar;
            this.f8363p = w2Var;
            this.f8364q = i7;
            this.f8365r = i10;
            this.f8366s = i11;
        }

        public final void a(@fg.m t tVar, int i4) {
            a.a(this.f8349b, this.f8350c, this.f8351d, this.f8352e, this.f8353f, this.f8354g, this.f8355h, this.f8356i, this.f8357j, this.f8358k, this.f8359l, this.f8360m, this.f8361n, this.f8362o, this.f8363p, tVar, g3.b(this.f8364q | 1), g3.b(this.f8365r), this.f8366s);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/BasicSecureTextFieldKt$BasicSecureTextField$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,523:1\n1#2:524\n*E\n"})
    static final class c extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.h f8368c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.e f8369d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f8370e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8371f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.g f8372g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u f8373h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ q f8374i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f8375j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ v0 f8376k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.ui.unit.d, ld.a<androidx.compose.ui.text.n0>, k2> f8377l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f8378m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ t1 f8379n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.c f8380o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.f f8381p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ w2 f8382q;

        /* compiled from: BasicSecureTextField.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text2.a$c$a, reason: collision with other inner class name */
        /* synthetic */ class C0173a implements androidx.compose.foundation.text2.input.g, d0 {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text2.input.g f8383b;

            C0173a(androidx.compose.foundation.text2.input.g gVar) {
                this.f8383b = gVar;
            }

            @Override // androidx.compose.foundation.text2.input.g
            public final boolean a(int i4) {
                return this.f8383b.a(i4);
            }

            @Override // kotlin.jvm.internal.d0
            @fg.l
            public final v<?> d() {
                return new h0(1, this.f8383b, androidx.compose.foundation.text2.input.g.class, "onImeAction", "onImeAction-KlQnJC8(I)Z", 0);
            }

            public final boolean equals(@fg.m Object obj) {
                if ((obj instanceof androidx.compose.foundation.text2.input.g) && (obj instanceof d0)) {
                    return l0.g(d(), ((d0) obj).d());
                }
                return false;
            }

            public final int hashCode() {
                return d().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z4, androidx.compose.foundation.text2.input.h hVar, androidx.compose.foundation.text2.e eVar, int i4, int i5, androidx.compose.foundation.text2.input.g gVar, u uVar, q qVar, boolean z5, v0 v0Var, p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, k2> pVar, androidx.compose.foundation.interaction.k kVar, t1 t1Var, androidx.compose.foundation.text2.input.c cVar, androidx.compose.foundation.text2.f fVar, w2 w2Var) {
            super(2);
            this.f8367b = z4;
            this.f8368c = hVar;
            this.f8369d = eVar;
            this.f8370e = i4;
            this.f8371f = i5;
            this.f8372g = gVar;
            this.f8373h = uVar;
            this.f8374i = qVar;
            this.f8375j = z5;
            this.f8376k = v0Var;
            this.f8377l = pVar;
            this.f8378m = kVar;
            this.f8379n = t1Var;
            this.f8380o = cVar;
            this.f8381p = fVar;
            this.f8382q = w2Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m t tVar, int i4) {
            androidx.compose.foundation.text.d0 d0Var;
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(-1415093334, i4, -1, "androidx.compose.foundation.text2.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:323)");
            }
            androidx.compose.foundation.text2.input.h b5 = this.f8367b ? androidx.compose.foundation.text2.input.j.b(this.f8368c, this.f8369d.getPasswordRevealFilter()) : this.f8368c;
            t.c cVar = t.c.f9061b;
            f0 f0Var = new f0(0, false, this.f8370e, this.f8371f, null, 17, null);
            androidx.compose.foundation.text2.input.g gVar = this.f8372g;
            if (gVar == null || (d0Var = a.f(new C0173a(gVar))) == null) {
                androidx.compose.foundation.text.d0.INSTANCE.getClass();
                d0Var = androidx.compose.foundation.text.d0.f7313i;
            }
            androidx.compose.foundation.text2.b.a(this.f8373h, this.f8374i, this.f8375j, false, b5, this.f8376k, f0Var, d0Var, cVar, this.f8377l, this.f8378m, this.f8379n, this.f8380o, this.f8381p, this.f8382q, tVar, 100666368, 0, 0);
            if (x.b0()) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends n0 implements p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f8384b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f8385c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.g f8386d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f8387e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f8388f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f8389g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f8390h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.h f8391i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ v0 f8392j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f8393k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ t1 f8394l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.ui.unit.d, ld.a<androidx.compose.ui.text.n0>, k2> f8395m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.f f8396n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ w2 f8397o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f8398p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f8399q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f8400r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(u uVar, q qVar, androidx.compose.foundation.text2.input.g gVar, int i4, int i5, int i6, boolean z4, androidx.compose.foundation.text2.input.h hVar, v0 v0Var, androidx.compose.foundation.interaction.k kVar, t1 t1Var, p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, k2> pVar, androidx.compose.foundation.text2.f fVar, w2 w2Var, int i7, int i10, int i11) {
            super(2);
            this.f8384b = uVar;
            this.f8385c = qVar;
            this.f8386d = gVar;
            this.f8387e = i4;
            this.f8388f = i5;
            this.f8389g = i6;
            this.f8390h = z4;
            this.f8391i = hVar;
            this.f8392j = v0Var;
            this.f8393k = kVar;
            this.f8394l = t1Var;
            this.f8395m = pVar;
            this.f8396n = fVar;
            this.f8397o = w2Var;
            this.f8398p = i7;
            this.f8399q = i10;
            this.f8400r = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a.b(this.f8384b, this.f8385c, this.f8386d, this.f8387e, this.f8388f, this.f8389g, this.f8390h, this.f8391i, this.f8392j, this.f8393k, this.f8394l, this.f8395m, this.f8396n, this.f8397o, tVar, g3.b(this.f8398p | 1), g3.b(this.f8399q), this.f8400r);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.l<z, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f8401b = new e(1);

        /* compiled from: BasicSecureTextField.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.a$e$a, reason: collision with other inner class name */
        static final class C0174a extends n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0174a f8402b = new C0174a(0);

            C0174a() {
                super(0);
            }

            @fg.l
            public final Boolean a() {
                return Boolean.FALSE;
            }

            @Override // ld.a
            public Boolean invoke() {
                return Boolean.FALSE;
            }
        }

        /* compiled from: BasicSecureTextField.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class b extends n0 implements ld.a<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f8403b = new b(0);

            b() {
                super(0);
            }

            @fg.l
            public final Boolean a() {
                return Boolean.FALSE;
            }

            @Override // ld.a
            public Boolean invoke() {
                return Boolean.FALSE;
            }
        }

        e() {
            super(1);
        }

        public final void a(@fg.l z zVar) {
            w.K0(zVar);
            w.j(zVar, null, C0174a.f8402b, 1, null);
            w.l(zVar, null, b.f8403b, 1, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(z zVar) {
            a(zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/BasicSecureTextFieldKt$DisableCutCopy$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,523:1\n68#2,6:524\n74#2:558\n78#2:563\n79#3,11:530\n92#3:562\n456#4,8:541\n464#4,3:555\n467#4,3:559\n3737#5,6:549\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/BasicSecureTextFieldKt$DisableCutCopy$1\n*L\n513#1:524,6\n513#1:558\n513#1:563\n513#1:530,11\n513#1:562\n513#1:541,8\n513#1:555,3\n513#1:559,3\n513#1:549,6\n*E\n"})
    static final class f extends n0 implements p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.runtime.t, Integer, k2> f8404b;

        /* compiled from: BasicSecureTextField.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/key/c;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.text2.a$f$a, reason: collision with other inner class name */
        static final class C0175a extends n0 implements ld.l<androidx.compose.ui.input.key.c, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0175a f8405b = new C0175a(1);

            C0175a() {
                super(1);
            }

            @fg.l
            public final Boolean a(@fg.l KeyEvent keyEvent) {
                androidx.compose.foundation.text.w a5 = a0.a().a(keyEvent);
                return Boolean.valueOf(a5 == androidx.compose.foundation.text.w.COPY || a5 == androidx.compose.foundation.text.w.CUT);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
                return a(cVar.h());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar) {
            super(2);
            this.f8404b = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(-1741121166, i4, -1, "androidx.compose.foundation.text2.DisableCutCopy.<anonymous> (BasicSecureTextField.kt:512)");
            }
            q b5 = androidx.compose.ui.input.key.f.b(q.INSTANCE, C0175a.f8405b);
            p<androidx.compose.runtime.t, Integer, k2> pVar = this.f8404b;
            tVar.P(733328855);
            m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g4 = androidx.compose.ui.layout.a0.g(b5);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
            if (tVar.getInserting() || !l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends n0 implements p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.runtime.t, Integer, k2> f8406b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4) {
            super(2);
            this.f8406b = pVar;
            this.f8407c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            a.e(this.f8406b, tVar, g3.b(this.f8407c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0003\u0010\u0004JW\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"androidx/compose/foundation/text2/a$h", "Landroidx/compose/ui/platform/i5;", "Lkotlin/k2;", "a", "()V", "Li0/i;", "rect", "Lkotlin/Function0;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "c", "(Li0/i;Lld/a;Lld/a;Lld/a;Lld/a;)V", "Landroidx/compose/ui/platform/k5;", "getStatus", "()Landroidx/compose/ui/platform/k5;", "status", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h implements i5 {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ i5 f8408a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i5 f8409b;

        h(i5 i5Var) {
            this.f8409b = i5Var;
            this.f8408a = i5Var;
        }

        @Override // androidx.compose.ui.platform.i5
        public void a() {
            this.f8408a.a();
        }

        @Override // androidx.compose.ui.platform.i5
        public void c(@fg.l i0.i rect, @fg.m ld.a<k2> onCopyRequested, @fg.m ld.a<k2> onPasteRequested, @fg.m ld.a<k2> onCutRequested, @fg.m ld.a<k2> onSelectAllRequested) {
            this.f8409b.c(rect, null, onPasteRequested, null, onSelectAllRequested);
        }

        @Override // androidx.compose.ui.platform.i5
        @fg.l
        public k5 getStatus() {
            return this.f8408a.getStatus();
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/c0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/c0;)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends n0 implements ld.l<c0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.g f8410b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.foundation.text2.input.g gVar) {
            super(1);
            this.f8410b = gVar;
        }

        public final void a(@fg.l c0 c0Var) {
            androidx.compose.foundation.text2.input.g gVar = this.f8410b;
            y.Companion companion = y.INSTANCE;
            companion.getClass();
            if (gVar.a(y.f21138j)) {
                return;
            }
            companion.getClass();
            c0Var.a(y.f21138j);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(c0 c0Var) {
            a(c0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/c0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/c0;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends n0 implements ld.l<c0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.g f8411b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.foundation.text2.input.g gVar) {
            super(1);
            this.f8411b = gVar;
        }

        public final void a(@fg.l c0 c0Var) {
            androidx.compose.foundation.text2.input.g gVar = this.f8411b;
            y.Companion companion = y.INSTANCE;
            companion.getClass();
            if (gVar.a(y.f21133e)) {
                return;
            }
            companion.getClass();
            c0Var.a(y.f21133e);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(c0 c0Var) {
            a(c0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/c0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/c0;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends n0 implements ld.l<c0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.g f8412b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.compose.foundation.text2.input.g gVar) {
            super(1);
            this.f8412b = gVar;
        }

        public final void a(@fg.l c0 c0Var) {
            androidx.compose.foundation.text2.input.g gVar = this.f8412b;
            y.Companion companion = y.INSTANCE;
            companion.getClass();
            if (gVar.a(y.f21137i)) {
                return;
            }
            companion.getClass();
            c0Var.a(y.f21137i);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(c0 c0Var) {
            a(c0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/c0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/c0;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends n0 implements ld.l<c0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.g f8413b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.compose.foundation.text2.input.g gVar) {
            super(1);
            this.f8413b = gVar;
        }

        public final void a(@fg.l c0 c0Var) {
            androidx.compose.foundation.text2.input.g gVar = this.f8413b;
            y.Companion companion = y.INSTANCE;
            companion.getClass();
            if (gVar.a(y.f21136h)) {
                return;
            }
            companion.getClass();
            c0Var.a(y.f21136h);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(c0 c0Var) {
            a(c0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/c0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/c0;)V"}, k = 3, mv = {1, 8, 0})
    static final class m extends n0 implements ld.l<c0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.g f8414b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.compose.foundation.text2.input.g gVar) {
            super(1);
            this.f8414b = gVar;
        }

        public final void a(@fg.l c0 c0Var) {
            androidx.compose.foundation.text2.input.g gVar = this.f8414b;
            y.Companion companion = y.INSTANCE;
            companion.getClass();
            if (gVar.a(y.f21134f)) {
                return;
            }
            companion.getClass();
            c0Var.a(y.f21134f);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(c0 c0Var) {
            a(c0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicSecureTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/c0;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text/c0;)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends n0 implements ld.l<c0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.g f8415b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(androidx.compose.foundation.text2.input.g gVar) {
            super(1);
            this.f8415b = gVar;
        }

        public final void a(@fg.l c0 c0Var) {
            androidx.compose.foundation.text2.input.g gVar = this.f8415b;
            y.Companion companion = y.INSTANCE;
            companion.getClass();
            if (gVar.a(y.f21135g)) {
                return;
            }
            companion.getClass();
            c0Var.a(y.f21135g);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(c0 c0Var) {
            a(c0Var);
            return k2.f75408a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023d  */
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l java.lang.String r37, @fg.l ld.l<? super java.lang.String, kotlin.k2> r38, @fg.m androidx.compose.ui.q r39, @fg.m androidx.compose.foundation.text2.input.g r40, int r41, int r42, int r43, boolean r44, @fg.m androidx.compose.foundation.text2.input.h r45, @fg.m androidx.compose.ui.text.v0 r46, @fg.m androidx.compose.foundation.interaction.k r47, @fg.m androidx.compose.ui.graphics.t1 r48, @fg.m ld.p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, kotlin.k2> r49, @fg.m androidx.compose.foundation.text2.f r50, @fg.m androidx.compose.foundation.w2 r51, @fg.m androidx.compose.runtime.t r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.a.a(java.lang.String, ld.l, androidx.compose.ui.q, androidx.compose.foundation.text2.input.g, int, int, int, boolean, androidx.compose.foundation.text2.input.h, androidx.compose.ui.text.v0, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.t1, ld.p, androidx.compose.foundation.text2.f, androidx.compose.foundation.w2, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0350  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v7, types: [androidx.compose.foundation.text2.f] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r31v0, types: [androidx.compose.foundation.text2.f] */
    /* JADX WARN: Type inference failed for: r49v0, types: [androidx.compose.foundation.text2.f, java.lang.Object] */
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l androidx.compose.foundation.text2.input.u r37, @fg.m androidx.compose.ui.q r38, @fg.m androidx.compose.foundation.text2.input.g r39, int r40, int r41, int r42, boolean r43, @fg.m androidx.compose.foundation.text2.input.h r44, @fg.m androidx.compose.ui.text.v0 r45, @fg.m androidx.compose.foundation.interaction.k r46, @fg.m androidx.compose.ui.graphics.t1 r47, @fg.m ld.p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, kotlin.k2> r48, @fg.m androidx.compose.foundation.text2.f r49, @fg.m androidx.compose.foundation.w2 r50, @fg.m androidx.compose.runtime.t r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.a.b(androidx.compose.foundation.text2.input.u, androidx.compose.ui.q, androidx.compose.foundation.text2.input.g, int, int, int, boolean, androidx.compose.foundation.text2.input.h, androidx.compose.ui.text.v0, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.t1, ld.p, androidx.compose.foundation.text2.f, androidx.compose.foundation.w2, androidx.compose.runtime.t, int, int, int):void");
    }

    private static final z0 c(androidx.compose.runtime.k2<z0> k2Var) {
        return k2Var.getValue();
    }

    private static final void d(androidx.compose.runtime.k2<z0> k2Var, z0 z0Var) {
        k2Var.setValue(z0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void e(p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(930154034);
        if ((i4 & 14) == 0) {
            i5 = (o4.S(pVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 11) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (x.b0()) {
                x.r0(930154034, i5, -1, "androidx.compose.foundation.text2.DisableCutCopy (BasicSecureTextField.kt:490)");
            }
            i5 i5Var = (i5) o4.x(h1.t());
            o4.P(1157296644);
            boolean q02 = o4.q0(i5Var);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new h(i5Var);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.runtime.f0.b(h1.t().e((h) Q), androidx.compose.runtime.internal.c.b(o4, -1741121166, true, new f(pVar)), o4, 56);
            if (x.b0()) {
                x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new g(pVar, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.text.d0 f(androidx.compose.foundation.text2.input.g gVar) {
        return new androidx.compose.foundation.text.d0(new i(gVar), new j(gVar), new k(gVar), new l(gVar), new m(gVar), new n(gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final z0 g(androidx.compose.runtime.k2 k2Var) {
        return (z0) k2Var.getValue();
    }

    public static final void h(androidx.compose.runtime.k2 k2Var, z0 z0Var) {
        k2Var.setValue(z0Var);
    }
}
