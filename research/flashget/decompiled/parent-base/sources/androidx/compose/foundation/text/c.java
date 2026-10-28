package androidx.compose.foundation.text;

import androidx.compose.runtime.g3;
import androidx.compose.ui.graphics.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: BasicTextField.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001aî\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\"\u0010#\u001aî\u0001\u0010%\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020$2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b%\u0010&\u001aä\u0001\u0010'\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b'\u0010(\u001aä\u0001\u0010)\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020$2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b)\u0010*¨\u0006-²\u0006\u000e\u0010+\u001a\u00020$8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010,\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/k2;", "onValueChange", "Landroidx/compose/ui/q;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/v0;", "textStyle", "Landroidx/compose/foundation/text/f0;", "keyboardOptions", "Landroidx/compose/foundation/text/d0;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/k1;", "visualTransformation", "Landroidx/compose/ui/text/n0;", "onTextLayout", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/ui/graphics/t1;", "cursorBrush", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "Lkotlin/r0;", "name", "innerTextField", "decorationBox", "c", "(Ljava/lang/String;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZIILandroidx/compose/ui/text/input/k1;Lld/l;Landroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/t1;Lld/q;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/ui/text/input/z0;", "a", "(Landroidx/compose/ui/text/input/z0;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZIILandroidx/compose/ui/text/input/k1;Lld/l;Landroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/t1;Lld/q;Landroidx/compose/runtime/t;III)V", "d", "(Ljava/lang/String;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZILandroidx/compose/ui/text/input/k1;Lld/l;Landroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/t1;Lld/q;Landroidx/compose/runtime/t;III)V", "b", "(Landroidx/compose/ui/text/input/z0;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/ui/text/v0;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;ZILandroidx/compose/ui/text/input/k1;Lld/l;Landroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/t1;Lld/q;Landroidx/compose/runtime/t;III)V", "textFieldValueState", "lastTextValue", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBasicTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,400:1\n25#2:401\n25#2:408\n36#2:421\n25#2:434\n25#2:447\n25#2:454\n1116#3,6:402\n1116#3,6:409\n1116#3,6:415\n1116#3,6:422\n1116#3,6:428\n1116#3,6:435\n1116#3,6:441\n1116#3,6:448\n1116#3,6:455\n81#4:461\n107#4,2:462\n81#4:464\n107#4,2:465\n*S KotlinDebug\n*F\n+ 1 BasicTextField.kt\nandroidx/compose/foundation/text/BasicTextFieldKt\n*L\n142#1:401\n149#1:408\n164#1:421\n292#1:434\n336#1:447\n376#1:454\n142#1:402,6\n149#1:409,6\n155#1:415,6\n164#1:422,6\n168#1:428,6\n292#1:435,6\n299#1:441,6\n336#1:448,6\n376#1:455,6\n149#1:461\n149#1:462,2\n164#1:464\n164#1:465,2\n*E\n"})
/* loaded from: classes.dex */
public final class c {

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f7129b = new a(1);

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

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7130b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, k2> f7131c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7132d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7133e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7134f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7135g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f7136h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ d0 f7137i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f7138j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7139k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f7140l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7141m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f7142n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ t1 f7143o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, androidx.compose.runtime.t, Integer, k2> f7144p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f7145q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f7146r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f7147s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, ld.l<? super String, k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, f0 f0Var, d0 d0Var, boolean z6, int i4, androidx.compose.ui.text.input.k1 k1Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar2, androidx.compose.foundation.interaction.k kVar, t1 t1Var, ld.q<? super ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i5, int i6, int i7) {
            super(2);
            this.f7130b = str;
            this.f7131c = lVar;
            this.f7132d = qVar;
            this.f7133e = z4;
            this.f7134f = z5;
            this.f7135g = v0Var;
            this.f7136h = f0Var;
            this.f7137i = d0Var;
            this.f7138j = z6;
            this.f7139k = i4;
            this.f7140l = k1Var;
            this.f7141m = lVar2;
            this.f7142n = kVar;
            this.f7143o = t1Var;
            this.f7144p = qVar2;
            this.f7145q = i5;
            this.f7146r = i6;
            this.f7147s = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            c.d(this.f7130b, this.f7131c, this.f7132d, this.f7133e, this.f7134f, this.f7135g, this.f7136h, this.f7137i, this.f7138j, this.f7139k, this.f7140l, this.f7141m, this.f7142n, this.f7143o, this.f7144p, tVar, g3.b(this.f7145q | 1), g3.b(this.f7146r), this.f7147s);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.c$c, reason: collision with other inner class name */
    static final class C0132c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0132c f7148b = new C0132c(1);

        C0132c() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.n0 n0Var) {
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.text.n0 n0Var) {
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7149b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, k2> f7150c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7151d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7152e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7153f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7154g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f7155h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ d0 f7156i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f7157j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7158k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f7159l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7160m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f7161n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ t1 f7162o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, androidx.compose.runtime.t, Integer, k2> f7163p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f7164q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f7165r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f7166s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(androidx.compose.ui.text.input.z0 z0Var, ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, f0 f0Var, d0 d0Var, boolean z6, int i4, androidx.compose.ui.text.input.k1 k1Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar2, androidx.compose.foundation.interaction.k kVar, t1 t1Var, ld.q<? super ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i5, int i6, int i7) {
            super(2);
            this.f7149b = z0Var;
            this.f7150c = lVar;
            this.f7151d = qVar;
            this.f7152e = z4;
            this.f7153f = z5;
            this.f7154g = v0Var;
            this.f7155h = f0Var;
            this.f7156i = d0Var;
            this.f7157j = z6;
            this.f7158k = i4;
            this.f7159l = k1Var;
            this.f7160m = lVar2;
            this.f7161n = kVar;
            this.f7162o = t1Var;
            this.f7163p = qVar2;
            this.f7164q = i5;
            this.f7165r = i6;
            this.f7166s = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            c.b(this.f7149b, this.f7150c, this.f7151d, this.f7152e, this.f7153f, this.f7154g, this.f7155h, this.f7156i, this.f7157j, this.f7158k, this.f7159l, this.f7160m, this.f7161n, this.f7162o, this.f7163p, tVar, g3.b(this.f7164q | 1), g3.b(this.f7165r), this.f7166s);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f7167b = new e(1);

        e() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.n0 n0Var) {
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.text.n0 n0Var) {
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7168b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> f7169c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.text.input.z0 z0Var, androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var) {
            super(0);
            this.f7168b = z0Var;
            this.f7169c = k2Var;
        }

        public final void a() {
            if (androidx.compose.ui.text.t0.g(this.f7168b.getSelection(), this.f7169c.getValue().getSelection()) && kotlin.jvm.internal.l0.g(this.f7168b.getComposition(), this.f7169c.getValue().getComposition())) {
                return;
            }
            this.f7169c.setValue(this.f7168b);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "newTextFieldValueState", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<String, k2> f7170b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> f7171c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<String> f7172d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(ld.l<? super String, k2> lVar, androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var, androidx.compose.runtime.k2<String> k2Var2) {
            super(1);
            this.f7170b = lVar;
            this.f7171c = k2Var;
            this.f7172d = k2Var2;
        }

        public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
            this.f7171c.setValue(z0Var);
            boolean g4 = kotlin.jvm.internal.l0.g(this.f7172d.getValue(), z0Var.i());
            this.f7172d.setValue(z0Var.i());
            if (g4) {
                return;
            }
            this.f7170b.invoke(z0Var.i());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
            a(z0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7173b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, k2> f7174c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7175d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7176e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7177f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7178g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f7179h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ d0 f7180i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f7181j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7182k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7183l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f7184m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7185n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f7186o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ t1 f7187p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, androidx.compose.runtime.t, Integer, k2> f7188q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f7189r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f7190s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f7191t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(String str, ld.l<? super String, k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, f0 f0Var, d0 d0Var, boolean z6, int i4, int i5, androidx.compose.ui.text.input.k1 k1Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar2, androidx.compose.foundation.interaction.k kVar, t1 t1Var, ld.q<? super ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i6, int i7, int i10) {
            super(2);
            this.f7173b = str;
            this.f7174c = lVar;
            this.f7175d = qVar;
            this.f7176e = z4;
            this.f7177f = z5;
            this.f7178g = v0Var;
            this.f7179h = f0Var;
            this.f7180i = d0Var;
            this.f7181j = z6;
            this.f7182k = i4;
            this.f7183l = i5;
            this.f7184m = k1Var;
            this.f7185n = lVar2;
            this.f7186o = kVar;
            this.f7187p = t1Var;
            this.f7188q = qVar2;
            this.f7189r = i6;
            this.f7190s = i7;
            this.f7191t = i10;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            c.c(this.f7173b, this.f7174c, this.f7175d, this.f7176e, this.f7177f, this.f7178g, this.f7179h, this.f7180i, this.f7181j, this.f7182k, this.f7183l, this.f7184m, this.f7185n, this.f7186o, this.f7187p, this.f7188q, tVar, g3.b(this.f7189r | 1), g3.b(this.f7190s), this.f7191t);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f7192b = new i(1);

        i() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.n0 n0Var) {
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.text.n0 n0Var) {
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7193b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, k2> f7194c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(androidx.compose.ui.text.input.z0 z0Var, ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar) {
            super(1);
            this.f7193b = z0Var;
            this.f7194c = lVar;
        }

        public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
            if (kotlin.jvm.internal.l0.g(this.f7193b, z0Var)) {
                return;
            }
            this.f7194c.invoke(z0Var);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
            a(z0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.z0 f7195b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.input.z0, k2> f7196c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7197d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f7198e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f7199f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7200g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f7201h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ d0 f7202i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f7203j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7204k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7205l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f7206m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7207n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f7208o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ t1 f7209p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.q<ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, androidx.compose.runtime.t, Integer, k2> f7210q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f7211r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f7212s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f7213t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(androidx.compose.ui.text.input.z0 z0Var, ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar, androidx.compose.ui.q qVar, boolean z4, boolean z5, androidx.compose.ui.text.v0 v0Var, f0 f0Var, d0 d0Var, boolean z6, int i4, int i5, androidx.compose.ui.text.input.k1 k1Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar2, androidx.compose.foundation.interaction.k kVar, t1 t1Var, ld.q<? super ld.p<? super androidx.compose.runtime.t, ? super Integer, k2>, ? super androidx.compose.runtime.t, ? super Integer, k2> qVar2, int i6, int i7, int i10) {
            super(2);
            this.f7195b = z0Var;
            this.f7196c = lVar;
            this.f7197d = qVar;
            this.f7198e = z4;
            this.f7199f = z5;
            this.f7200g = v0Var;
            this.f7201h = f0Var;
            this.f7202i = d0Var;
            this.f7203j = z6;
            this.f7204k = i4;
            this.f7205l = i5;
            this.f7206m = k1Var;
            this.f7207n = lVar2;
            this.f7208o = kVar;
            this.f7209p = t1Var;
            this.f7210q = qVar2;
            this.f7211r = i6;
            this.f7212s = i7;
            this.f7213t = i10;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            c.a(this.f7195b, this.f7196c, this.f7197d, this.f7198e, this.f7199f, this.f7200g, this.f7201h, this.f7202i, this.f7203j, this.f7204k, this.f7205l, this.f7206m, this.f7207n, this.f7208o, this.f7209p, this.f7210q, tVar, g3.b(this.f7211r | 1), g3.b(this.f7212s), this.f7213t);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0373  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.ui.text.input.z0 r37, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> r38, @fg.m androidx.compose.ui.q r39, boolean r40, boolean r41, @fg.m androidx.compose.ui.text.v0 r42, @fg.m androidx.compose.foundation.text.f0 r43, @fg.m androidx.compose.foundation.text.d0 r44, boolean r45, int r46, int r47, @fg.m androidx.compose.ui.text.input.k1 r48, @fg.m ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> r49, @fg.m androidx.compose.foundation.interaction.k r50, @fg.m androidx.compose.ui.graphics.t1 r51, @fg.m ld.q<? super ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2>, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r52, @fg.m androidx.compose.runtime.t r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.c.a(androidx.compose.ui.text.input.z0, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, int, androidx.compose.ui.text.input.k1, ld.l, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.t1, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0307  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.text.input.z0 r41, ld.l r42, androidx.compose.ui.q r43, boolean r44, boolean r45, androidx.compose.ui.text.v0 r46, androidx.compose.foundation.text.f0 r47, androidx.compose.foundation.text.d0 r48, boolean r49, int r50, androidx.compose.ui.text.input.k1 r51, ld.l r52, androidx.compose.foundation.interaction.k r53, androidx.compose.ui.graphics.t1 r54, ld.q r55, androidx.compose.runtime.t r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.c.b(androidx.compose.ui.text.input.z0, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, androidx.compose.ui.text.input.k1, ld.l, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.t1, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x040d  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.l java.lang.String r41, @fg.l ld.l<? super java.lang.String, kotlin.k2> r42, @fg.m androidx.compose.ui.q r43, boolean r44, boolean r45, @fg.m androidx.compose.ui.text.v0 r46, @fg.m androidx.compose.foundation.text.f0 r47, @fg.m androidx.compose.foundation.text.d0 r48, boolean r49, int r50, int r51, @fg.m androidx.compose.ui.text.input.k1 r52, @fg.m ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> r53, @fg.m androidx.compose.foundation.interaction.k r54, @fg.m androidx.compose.ui.graphics.t1 r55, @fg.m ld.q<? super ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2>, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r56, @fg.m androidx.compose.runtime.t r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.c.c(java.lang.String, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, int, androidx.compose.ui.text.input.k1, ld.l, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.t1, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0307  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r41, ld.l r42, androidx.compose.ui.q r43, boolean r44, boolean r45, androidx.compose.ui.text.v0 r46, androidx.compose.foundation.text.f0 r47, androidx.compose.foundation.text.d0 r48, boolean r49, int r50, androidx.compose.ui.text.input.k1 r51, ld.l r52, androidx.compose.foundation.interaction.k r53, androidx.compose.ui.graphics.t1 r54, ld.q r55, androidx.compose.runtime.t r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.c.d(java.lang.String, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.ui.text.v0, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, boolean, int, androidx.compose.ui.text.input.k1, ld.l, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.t1, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    private static final androidx.compose.ui.text.input.z0 e(androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var) {
        return k2Var.getValue();
    }

    private static final void f(androidx.compose.runtime.k2<androidx.compose.ui.text.input.z0> k2Var, androidx.compose.ui.text.input.z0 z0Var) {
        k2Var.setValue(z0Var);
    }

    private static final String g(androidx.compose.runtime.k2<String> k2Var) {
        return k2Var.getValue();
    }

    private static final void h(androidx.compose.runtime.k2<String> k2Var, String str) {
        k2Var.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.text.input.z0 i(androidx.compose.runtime.k2 k2Var) {
        return (androidx.compose.ui.text.input.z0) k2Var.getValue();
    }

    public static final void j(androidx.compose.runtime.k2 k2Var, androidx.compose.ui.text.input.z0 z0Var) {
        k2Var.setValue(z0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String k(androidx.compose.runtime.k2 k2Var) {
        return (String) k2Var.getValue();
    }

    public static final void l(androidx.compose.runtime.k2 k2Var, String str) {
        k2Var.setValue(str);
    }
}
