package androidx.compose.material3;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: Text.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010!\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aÆ\u0001\u0010#\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001aæ\u0001\u0010)\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020%2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'0&2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aÜ\u0001\u0010+\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020%2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020'0&2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a*\u00101\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001f2\u0011\u00100\u001a\r\u0012\u0004\u0012\u00020\u001d0.¢\u0006\u0002\b/H\u0007¢\u0006\u0004\b1\u00102\"\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020\u001f038\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"", "text", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/ui/unit/z;", "fontSize", "Landroidx/compose/ui/text/font/k0;", "fontStyle", "Landroidx/compose/ui/text/font/o0;", "fontWeight", "Landroidx/compose/ui/text/font/y;", "fontFamily", "letterSpacing", "Landroidx/compose/ui/text/style/k;", "textDecoration", "Landroidx/compose/ui/text/style/j;", "textAlign", "lineHeight", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "Landroidx/compose/ui/text/n0;", "Lkotlin/k2;", "onTextLayout", "Landroidx/compose/ui/text/v0;", "style", "c", "(Ljava/lang/String;Landroidx/compose/ui/q;JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/y;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/text/style/j;JIZIILld/l;Landroidx/compose/ui/text/v0;Landroidx/compose/runtime/t;III)V", "e", "(Ljava/lang/String;Landroidx/compose/ui/q;JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/y;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/text/style/j;JIZILld/l;Landroidx/compose/ui/text/v0;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/ui/text/e;", "", "Landroidx/compose/foundation/text/t;", "inlineContent", "d", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/q;JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/y;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/text/style/j;JIZIILjava/util/Map;Lld/l;Landroidx/compose/ui/text/v0;Landroidx/compose/runtime/t;III)V", "b", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/q;JJLandroidx/compose/ui/text/font/k0;Landroidx/compose/ui/text/font/o0;Landroidx/compose/ui/text/font/y;JLandroidx/compose/ui/text/style/k;Landroidx/compose/ui/text/style/j;JIZILjava/util/Map;Lld/l;Landroidx/compose/ui/text/v0;Landroidx/compose/runtime/t;III)V", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "content", "a", "(Landroidx/compose/ui/text/v0;Lld/p;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/runtime/a3;", "Landroidx/compose/runtime/a3;", "f", "()Landroidx/compose/runtime/a3;", "LocalTextStyle", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\nandroidx/compose/material3/TextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,354:1\n74#2:355\n74#2:360\n74#2:361\n74#2:362\n74#2:367\n74#2:368\n74#2:369\n658#3:356\n646#3:357\n658#3:358\n646#3:359\n658#3:363\n646#3:364\n658#3:365\n646#3:366\n*S KotlinDebug\n*F\n+ 1 Text.kt\nandroidx/compose/material3/TextKt\n*L\n109#1:355\n114#1:360\n161#1:361\n255#1:362\n259#1:367\n308#1:368\n351#1:369\n112#1:356\n112#1:357\n113#1:358\n113#1:359\n257#1:363\n257#1:364\n258#1:365\n258#1:366\n*E\n"})
/* loaded from: classes.dex */
public final class xa {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<androidx.compose.ui.text.v0> f15665a = new androidx.compose.runtime.z0(androidx.compose.runtime.o4.x(), a.f15666b);

    /* compiled from: Text.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/v0;", "a", "()Landroidx/compose/ui/text/v0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.text.v0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15666b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final androidx.compose.ui.text.v0 a() {
            return c0.t1.b();
        }

        @Override // ld.a
        public androidx.compose.ui.text.v0 invoke() {
            return c0.t1.b();
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f15667b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f15668c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f15669d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f15667b = v0Var;
            this.f15668c = pVar;
            this.f15669d = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            xa.a(this.f15667b, this.f15668c, tVar, androidx.compose.runtime.g3.b(this.f15669d | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15670b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15671c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15672d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15673e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.k0 f15674f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.o0 f15675g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.y f15676h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f15677i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.style.k f15678j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.style.j f15679k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f15680l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15681m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f15682n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f15683o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f15684p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, kotlin.k2> f15685q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f15686r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f15687s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f15688t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f15689u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, androidx.compose.ui.q qVar, long j4, long j5, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.y yVar, long j6, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.text.style.j jVar, long j7, int i4, boolean z4, int i5, int i6, ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> lVar, androidx.compose.ui.text.v0 v0Var, int i7, int i10, int i11) {
            super(2);
            this.f15670b = str;
            this.f15671c = qVar;
            this.f15672d = j4;
            this.f15673e = j5;
            this.f15674f = k0Var;
            this.f15675g = o0Var;
            this.f15676h = yVar;
            this.f15677i = j6;
            this.f15678j = kVar;
            this.f15679k = jVar;
            this.f15680l = j7;
            this.f15681m = i4;
            this.f15682n = z4;
            this.f15683o = i5;
            this.f15684p = i6;
            this.f15685q = lVar;
            this.f15686r = v0Var;
            this.f15687s = i7;
            this.f15688t = i10;
            this.f15689u = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            xa.c(this.f15670b, this.f15671c, this.f15672d, this.f15673e, this.f15674f, this.f15675g, this.f15676h, this.f15677i, this.f15678j, this.f15679k, this.f15680l, this.f15681m, this.f15682n, this.f15683o, this.f15684p, this.f15685q, this.f15686r, tVar, androidx.compose.runtime.g3.b(this.f15687s | 1), androidx.compose.runtime.g3.b(this.f15688t), this.f15689u);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f15690b = new d(1);

        d() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.n0 n0Var) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.text.n0 n0Var) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15691b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15692c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15693d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15694e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.k0 f15695f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.o0 f15696g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.y f15697h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f15698i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.style.k f15699j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.style.j f15700k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f15701l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15702m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f15703n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f15704o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, kotlin.k2> f15705p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f15706q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f15707r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f15708s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f15709t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(String str, androidx.compose.ui.q qVar, long j4, long j5, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.y yVar, long j6, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.text.style.j jVar, long j7, int i4, boolean z4, int i5, ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> lVar, androidx.compose.ui.text.v0 v0Var, int i6, int i7, int i10) {
            super(2);
            this.f15691b = str;
            this.f15692c = qVar;
            this.f15693d = j4;
            this.f15694e = j5;
            this.f15695f = k0Var;
            this.f15696g = o0Var;
            this.f15697h = yVar;
            this.f15698i = j6;
            this.f15699j = kVar;
            this.f15700k = jVar;
            this.f15701l = j7;
            this.f15702m = i4;
            this.f15703n = z4;
            this.f15704o = i5;
            this.f15705p = lVar;
            this.f15706q = v0Var;
            this.f15707r = i6;
            this.f15708s = i7;
            this.f15709t = i10;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            xa.e(this.f15691b, this.f15692c, this.f15693d, this.f15694e, this.f15695f, this.f15696g, this.f15697h, this.f15698i, this.f15699j, this.f15700k, this.f15701l, this.f15702m, this.f15703n, this.f15704o, this.f15705p, this.f15706q, tVar, androidx.compose.runtime.g3.b(this.f15707r | 1), androidx.compose.runtime.g3.b(this.f15708s), this.f15709t);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f15710b = new f(1);

        f() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.n0 n0Var) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.text.n0 n0Var) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.e f15711b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15712c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15713d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15714e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.k0 f15715f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.o0 f15716g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.y f15717h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f15718i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.style.k f15719j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.style.j f15720k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f15721l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15722m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f15723n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f15724o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f15725p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Map<String, androidx.compose.foundation.text.t> f15726q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, kotlin.k2> f15727r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f15728s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f15729t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f15730u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f15731v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.text.e eVar, androidx.compose.ui.q qVar, long j4, long j5, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.y yVar, long j6, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.text.style.j jVar, long j7, int i4, boolean z4, int i5, int i6, Map<String, androidx.compose.foundation.text.t> map, ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> lVar, androidx.compose.ui.text.v0 v0Var, int i7, int i10, int i11) {
            super(2);
            this.f15711b = eVar;
            this.f15712c = qVar;
            this.f15713d = j4;
            this.f15714e = j5;
            this.f15715f = k0Var;
            this.f15716g = o0Var;
            this.f15717h = yVar;
            this.f15718i = j6;
            this.f15719j = kVar;
            this.f15720k = jVar;
            this.f15721l = j7;
            this.f15722m = i4;
            this.f15723n = z4;
            this.f15724o = i5;
            this.f15725p = i6;
            this.f15726q = map;
            this.f15727r = lVar;
            this.f15728s = v0Var;
            this.f15729t = i7;
            this.f15730u = i10;
            this.f15731v = i11;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            xa.d(this.f15711b, this.f15712c, this.f15713d, this.f15714e, this.f15715f, this.f15716g, this.f15717h, this.f15718i, this.f15719j, this.f15720k, this.f15721l, this.f15722m, this.f15723n, this.f15724o, this.f15725p, this.f15726q, this.f15727r, this.f15728s, tVar, androidx.compose.runtime.g3.b(this.f15729t | 1), androidx.compose.runtime.g3.b(this.f15730u), this.f15731v);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.n0, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f15732b = new h(1);

        h() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.n0 n0Var) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.text.n0 n0Var) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Text.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.e f15733b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f15734c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f15735d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f15736e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.k0 f15737f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.o0 f15738g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.font.y f15739h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f15740i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.style.k f15741j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.style.j f15742k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f15743l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f15744m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f15745n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f15746o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Map<String, androidx.compose.foundation.text.t> f15747p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, kotlin.k2> f15748q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f15749r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f15750s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f15751t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f15752u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(androidx.compose.ui.text.e eVar, androidx.compose.ui.q qVar, long j4, long j5, androidx.compose.ui.text.font.k0 k0Var, androidx.compose.ui.text.font.o0 o0Var, androidx.compose.ui.text.font.y yVar, long j6, androidx.compose.ui.text.style.k kVar, androidx.compose.ui.text.style.j jVar, long j7, int i4, boolean z4, int i5, Map<String, androidx.compose.foundation.text.t> map, ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> lVar, androidx.compose.ui.text.v0 v0Var, int i6, int i7, int i10) {
            super(2);
            this.f15733b = eVar;
            this.f15734c = qVar;
            this.f15735d = j4;
            this.f15736e = j5;
            this.f15737f = k0Var;
            this.f15738g = o0Var;
            this.f15739h = yVar;
            this.f15740i = j6;
            this.f15741j = kVar;
            this.f15742k = jVar;
            this.f15743l = j7;
            this.f15744m = i4;
            this.f15745n = z4;
            this.f15746o = i5;
            this.f15747p = map;
            this.f15748q = lVar;
            this.f15749r = v0Var;
            this.f15750s = i6;
            this.f15751t = i7;
            this.f15752u = i10;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            xa.b(this.f15733b, this.f15734c, this.f15735d, this.f15736e, this.f15737f, this.f15738g, this.f15739h, this.f15740i, this.f15741j, this.f15742k, this.f15743l, this.f15744m, this.f15745n, this.f15746o, this.f15747p, this.f15748q, this.f15749r, tVar, androidx.compose.runtime.g3.b(this.f15750s | 1), androidx.compose.runtime.g3.b(this.f15751t), this.f15752u);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    public static final void a(@fg.l androidx.compose.ui.text.v0 v0Var, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-460300127);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(v0Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i5 & 19) == 18 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-460300127, i5, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:349)");
            }
            androidx.compose.runtime.a3<androidx.compose.ui.text.v0> a3Var = f15665a;
            androidx.compose.runtime.f0.b(a3Var.e(((androidx.compose.ui.text.v0) o4.x(a3Var)).e0(v0Var)), pVar, o4, (i5 & 112) | androidx.compose.runtime.b3.f15974d);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(v0Var, pVar, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0298  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.text.e r56, androidx.compose.ui.q r57, long r58, long r60, androidx.compose.ui.text.font.k0 r62, androidx.compose.ui.text.font.o0 r63, androidx.compose.ui.text.font.y r64, long r65, androidx.compose.ui.text.style.k r67, androidx.compose.ui.text.style.j r68, long r69, int r71, boolean r72, int r73, java.util.Map r74, ld.l r75, androidx.compose.ui.text.v0 r76, androidx.compose.runtime.t r77, int r78, int r79, int r80) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.xa.b(androidx.compose.ui.text.e, androidx.compose.ui.q, long, long, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.y, long, androidx.compose.ui.text.style.k, androidx.compose.ui.text.style.j, long, int, boolean, int, java.util.Map, ld.l, androidx.compose.ui.text.v0, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0400  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.l java.lang.String r68, @fg.m androidx.compose.ui.q r69, long r70, long r72, @fg.m androidx.compose.ui.text.font.k0 r74, @fg.m androidx.compose.ui.text.font.o0 r75, @fg.m androidx.compose.ui.text.font.y r76, long r77, @fg.m androidx.compose.ui.text.style.k r79, @fg.m androidx.compose.ui.text.style.j r80, long r81, int r83, boolean r84, int r85, int r86, @fg.m ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> r87, @fg.m androidx.compose.ui.text.v0 r88, @fg.m androidx.compose.runtime.t r89, int r90, int r91, int r92) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.xa.c(java.lang.String, androidx.compose.ui.q, long, long, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.y, long, androidx.compose.ui.text.style.k, androidx.compose.ui.text.style.j, long, int, boolean, int, int, ld.l, androidx.compose.ui.text.v0, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0441  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@fg.l androidx.compose.ui.text.e r61, @fg.m androidx.compose.ui.q r62, long r63, long r65, @fg.m androidx.compose.ui.text.font.k0 r67, @fg.m androidx.compose.ui.text.font.o0 r68, @fg.m androidx.compose.ui.text.font.y r69, long r70, @fg.m androidx.compose.ui.text.style.k r72, @fg.m androidx.compose.ui.text.style.j r73, long r74, int r76, boolean r77, int r78, int r79, @fg.m java.util.Map<java.lang.String, androidx.compose.foundation.text.t> r80, @fg.m ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> r81, @fg.m androidx.compose.ui.text.v0 r82, @fg.m androidx.compose.runtime.t r83, int r84, int r85, int r86) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.xa.d(androidx.compose.ui.text.e, androidx.compose.ui.q, long, long, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.y, long, androidx.compose.ui.text.style.k, androidx.compose.ui.text.style.j, long, int, boolean, int, int, java.util.Map, ld.l, androidx.compose.ui.text.v0, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0286  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(java.lang.String r54, androidx.compose.ui.q r55, long r56, long r58, androidx.compose.ui.text.font.k0 r60, androidx.compose.ui.text.font.o0 r61, androidx.compose.ui.text.font.y r62, long r63, androidx.compose.ui.text.style.k r65, androidx.compose.ui.text.style.j r66, long r67, int r69, boolean r70, int r71, ld.l r72, androidx.compose.ui.text.v0 r73, androidx.compose.runtime.t r74, int r75, int r76, int r77) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.xa.e(java.lang.String, androidx.compose.ui.q, long, long, androidx.compose.ui.text.font.k0, androidx.compose.ui.text.font.o0, androidx.compose.ui.text.font.y, long, androidx.compose.ui.text.style.k, androidx.compose.ui.text.style.j, long, int, boolean, int, ld.l, androidx.compose.ui.text.v0, androidx.compose.runtime.t, int, int, int):void");
    }

    @fg.l
    public static final androidx.compose.runtime.a3<androidx.compose.ui.text.v0> f() {
        return f15665a;
    }
}
