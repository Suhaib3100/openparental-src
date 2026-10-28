package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: TextFieldDefaults.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J8\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJÂ\u0003\u0010I\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020\u001c2\b\b\u0002\u0010%\u001a\u00020\u001c2\b\b\u0002\u0010&\u001a\u00020\u001c2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010)\u001a\u00020\u001c2\b\b\u0002\u0010*\u001a\u00020\u001c2\b\b\u0002\u0010+\u001a\u00020\u001c2\b\b\u0002\u0010,\u001a\u00020\u001c2\b\b\u0002\u0010-\u001a\u00020\u001c2\b\b\u0002\u0010.\u001a\u00020\u001c2\b\b\u0002\u0010/\u001a\u00020\u001c2\b\b\u0002\u00100\u001a\u00020\u001c2\b\b\u0002\u00101\u001a\u00020\u001c2\b\b\u0002\u00102\u001a\u00020\u001c2\b\b\u0002\u00103\u001a\u00020\u001c2\b\b\u0002\u00104\u001a\u00020\u001c2\b\b\u0002\u00105\u001a\u00020\u001c2\b\b\u0002\u00106\u001a\u00020\u001c2\b\b\u0002\u00107\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020\u001c2\b\b\u0002\u00109\u001a\u00020\u001c2\b\b\u0002\u0010:\u001a\u00020\u001c2\b\b\u0002\u0010;\u001a\u00020\u001c2\b\b\u0002\u0010<\u001a\u00020\u001c2\b\b\u0002\u0010=\u001a\u00020\u001c2\b\b\u0002\u0010>\u001a\u00020\u001c2\b\b\u0002\u0010?\u001a\u00020\u001c2\b\b\u0002\u0010@\u001a\u00020\u001c2\b\b\u0002\u0010A\u001a\u00020\u001c2\b\b\u0002\u0010B\u001a\u00020\u001c2\b\b\u0002\u0010C\u001a\u00020\u001c2\b\b\u0002\u0010D\u001a\u00020\u001c2\b\b\u0002\u0010E\u001a\u00020\u001c2\b\b\u0002\u0010F\u001a\u00020\u001c2\b\b\u0002\u0010G\u001a\u00020\u001c2\b\b\u0002\u0010H\u001a\u00020\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ\u009e\u0002\u0010\\\u001a\u00020\u00102\u0006\u0010L\u001a\u00020K2\u0011\u0010O\u001a\r\u0012\u0004\u0012\u00020\u00100M¢\u0006\u0002\bN2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010R\u001a\u00020Q2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0015\b\u0002\u0010S\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010M¢\u0006\u0002\bN2\u0015\b\u0002\u0010T\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010M¢\u0006\u0002\bN2\u0015\b\u0002\u0010U\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010M¢\u0006\u0002\bN2\u0015\b\u0002\u0010V\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010M¢\u0006\u0002\bN2\u0015\b\u0002\u0010W\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010M¢\u0006\u0002\bN2\u0015\b\u0002\u0010X\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010M¢\u0006\u0002\bN2\u0015\b\u0002\u0010Y\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010M¢\u0006\u0002\bN2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010Z\u001a\u00020\u00172\u0013\b\u0002\u0010[\u001a\r\u0012\u0004\u0012\u00020\u00100M¢\u0006\u0002\bNH\u0007¢\u0006\u0004\b\\\u0010]R\u001d\u0010a\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\\\u0010^\u001a\u0004\b_\u0010`R\u001d\u0010c\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010^\u001a\u0004\bb\u0010`R\u001d\u0010e\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bI\u0010^\u001a\u0004\bd\u0010`R\u001d\u0010g\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010^\u001a\u0004\bf\u0010`R\u0011\u0010\f\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0018\u0010m\u001a\u00020\t*\u00020j8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bk\u0010l\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006n"}, d2 = {"Landroidx/compose/material3/q7;", "", "<init>", "()V", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/material3/pa;", "colors", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/unit/h;", "focusedBorderThickness", "unfocusedBorderThickness", "Lkotlin/k2;", "a", "(ZZLandroidx/compose/foundation/interaction/i;Landroidx/compose/material3/pa;Landroidx/compose/ui/graphics/e6;FFLandroidx/compose/runtime/t;II)V", "start", "top", "end", "bottom", "Landroidx/compose/foundation/layout/l1;", "e", "(FFFF)Landroidx/compose/foundation/layout/l1;", "c", "(Landroidx/compose/runtime/t;I)Landroidx/compose/material3/pa;", "Landroidx/compose/ui/graphics/d2;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/x0;", "selectionColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "d", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/x0;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/t;IIIIIII)Landroidx/compose/material3/pa;", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/k1;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "contentPadding", "container", "b", "(Ljava/lang/String;Lld/p;ZZLandroidx/compose/ui/text/input/k1;Landroidx/compose/foundation/interaction/i;ZLld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Landroidx/compose/material3/pa;Landroidx/compose/foundation/layout/l1;Lld/p;Landroidx/compose/runtime/t;III)V", "F", "i", "()F", "MinHeight", "j", "MinWidth", "l", "UnfocusedBorderThickness", "h", "FocusedBorderThickness", "k", "(Landroidx/compose/runtime/t;I)Landroidx/compose/ui/graphics/e6;", "Landroidx/compose/material3/a3;", "g", "(Landroidx/compose/material3/a3;Landroidx/compose/runtime/t;I)Landroidx/compose/material3/pa;", "defaultOutlinedTextFieldColors", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2400:1\n74#2:2401\n154#3:2402\n154#3:2403\n154#3:2404\n154#3:2405\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n*L\n1655#1:2401\n1416#1:2402\n1422#1:2403\n1427#1:2404\n1432#1:2405\n*E\n"})
/* loaded from: classes.dex */
public final class q7 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final q7 f13678a = new q7();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight = androidx.compose.ui.unit.h.g(56);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth = 280;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float UnfocusedBorderThickness = 1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedBorderThickness = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13683f = 0;

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13685c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13686d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f13687e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ pa f13688f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13689g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f13690h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f13691i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f13692j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f13693k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z4, boolean z5, androidx.compose.foundation.interaction.i iVar, pa paVar, androidx.compose.ui.graphics.e6 e6Var, float f4, float f5, int i4, int i5) {
            super(2);
            this.f13685c = z4;
            this.f13686d = z5;
            this.f13687e = iVar;
            this.f13688f = paVar;
            this.f13689g = e6Var;
            this.f13690h = f4;
            this.f13691i = f5;
            this.f13692j = i4;
            this.f13693k = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q7.this.a(this.f13685c, this.f13686d, this.f13687e, this.f13688f, this.f13689g, this.f13690h, this.f13691i, tVar, androidx.compose.runtime.g3.b(this.f13692j | 1), this.f13693k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13694b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13695c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f13696d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ pa f13697e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z4, boolean z5, androidx.compose.foundation.interaction.i iVar, pa paVar) {
            super(2);
            this.f13694b = z4;
            this.f13695c = z5;
            this.f13696d = iVar;
            this.f13697e = paVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1448570018, i4, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
            }
            q7.f13678a.a(this.f13694b, this.f13695c, this.f13696d, this.f13697e, null, 0.0f, 0.0f, tVar, 12582912, 112);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13699c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13700d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f13701e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f13702f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f13703g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f13704h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f13705i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13706j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13707k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13708l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13709m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13710n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13711o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13712p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ pa f13713q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f13714r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13715s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f13716t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f13717u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f13718v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, boolean z4, boolean z5, androidx.compose.ui.text.input.k1 k1Var, androidx.compose.foundation.interaction.i iVar, boolean z6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar8, pa paVar, androidx.compose.foundation.layout.l1 l1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar9, int i4, int i5, int i6) {
            super(2);
            this.f13699c = str;
            this.f13700d = pVar;
            this.f13701e = z4;
            this.f13702f = z5;
            this.f13703g = k1Var;
            this.f13704h = iVar;
            this.f13705i = z6;
            this.f13706j = pVar2;
            this.f13707k = pVar3;
            this.f13708l = pVar4;
            this.f13709m = pVar5;
            this.f13710n = pVar6;
            this.f13711o = pVar7;
            this.f13712p = pVar8;
            this.f13713q = paVar;
            this.f13714r = l1Var;
            this.f13715s = pVar9;
            this.f13716t = i4;
            this.f13717u = i5;
            this.f13718v = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            q7.this.b(this.f13699c, this.f13700d, this.f13701e, this.f13702f, this.f13703g, this.f13704h, this.f13705i, this.f13706j, this.f13707k, this.f13708l, this.f13709m, this.f13710n, this.f13711o, this.f13712p, this.f13713q, this.f13714r, this.f13715s, tVar, androidx.compose.runtime.g3.b(this.f13716t | 1), androidx.compose.runtime.g3.b(this.f13717u), this.f13718v);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    private q7() {
    }

    public static androidx.compose.foundation.layout.l1 f(q7 q7Var, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = sa.l();
        }
        if ((i4 & 2) != 0) {
            f5 = sa.l();
        }
        if ((i4 & 4) != 0) {
            f6 = sa.l();
        }
        if ((i4 & 8) != 0) {
            f7 = sa.l();
        }
        q7Var.getClass();
        return androidx.compose.foundation.layout.j1.d(f4, f5, f6, f7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0127, code lost:
    
        if ((r29 & 64) != 0) goto L105;
     */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r20, boolean r21, @fg.l androidx.compose.foundation.interaction.i r22, @fg.l androidx.compose.material3.pa r23, @fg.m androidx.compose.ui.graphics.e6 r24, float r25, float r26, @fg.m androidx.compose.runtime.t r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.q7.a(boolean, boolean, androidx.compose.foundation.interaction.i, androidx.compose.material3.pa, androidx.compose.ui.graphics.e6, float, float, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0337  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@fg.l java.lang.String r43, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r44, boolean r45, boolean r46, @fg.l androidx.compose.ui.text.input.k1 r47, @fg.l androidx.compose.foundation.interaction.i r48, boolean r49, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r50, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r51, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r52, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r53, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r54, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r55, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r56, @fg.m androidx.compose.material3.pa r57, @fg.m androidx.compose.foundation.layout.l1 r58, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r59, @fg.m androidx.compose.runtime.t r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.q7.b(java.lang.String, ld.p, boolean, boolean, androidx.compose.ui.text.input.k1, androidx.compose.foundation.interaction.i, boolean, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, androidx.compose.material3.pa, androidx.compose.foundation.layout.l1, ld.p, androidx.compose.runtime.t, int, int, int):void");
    }

    @fg.l
    @androidx.compose.runtime.i
    public final pa c(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-471651810);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-471651810, i4, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1492)");
        }
        pa g4 = g(p6.f13227a.a(tVar, 6), tVar, (i4 << 3) & 112);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return g4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final pa d(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, @fg.m androidx.compose.foundation.text.selection.x0 x0Var, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, @fg.m androidx.compose.runtime.t tVar, int i4, int i5, int i6, int i7, int i10, int i11, int i12) {
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59;
        long j60;
        long j61;
        long j62;
        long j63;
        long j64;
        long j65;
        long j66;
        long j67;
        long j68;
        long j69;
        long j70;
        long j71;
        long j72;
        long j73;
        long j74;
        long j75;
        long j76;
        long j77;
        long j78;
        long j79;
        long j80;
        long j81;
        long j82;
        long j83;
        long j84;
        long j85;
        long j86;
        long j87;
        long j88;
        long j89;
        tVar.P(1767617725);
        if ((i11 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j48 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j48 = j4;
        }
        if ((i11 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j49 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j49 = j5;
        }
        if ((i11 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j50 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j50 = j6;
        }
        if ((i11 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j51 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j51 = j7;
        }
        if ((i11 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j52 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j52 = j10;
        }
        if ((i11 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j53 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j53 = j11;
        }
        if ((i11 & 64) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j54 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j54 = j12;
        }
        if ((i11 & 128) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j55 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j55 = j13;
        }
        if ((i11 & 256) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j56 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j56 = j14;
        }
        if ((i11 & 512) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j57 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j57 = j15;
        }
        androidx.compose.foundation.text.selection.x0 x0Var2 = (i11 & 1024) != 0 ? null : x0Var;
        if ((i11 & 2048) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j58 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j58 = j16;
        }
        if ((i11 & 4096) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j59 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j59 = j17;
        }
        if ((i11 & 8192) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j60 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j60 = j18;
        }
        if ((i11 & 16384) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j61 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j61 = j19;
        }
        if ((32768 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j62 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j62 = j20;
        }
        if ((65536 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j63 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j63 = j21;
        }
        if ((131072 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j64 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j64 = j22;
        }
        if ((262144 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j65 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j65 = j23;
        }
        if ((524288 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j66 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j66 = j24;
        }
        if ((1048576 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j67 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j67 = j25;
        }
        if ((2097152 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j68 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j68 = j26;
        }
        if ((4194304 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j69 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j69 = j27;
        }
        if ((8388608 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j70 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j70 = j28;
        }
        if ((16777216 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j71 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j71 = j29;
        }
        if ((33554432 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j72 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j72 = j30;
        }
        if ((67108864 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j73 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j73 = j31;
        }
        if ((134217728 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j74 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j74 = j32;
        }
        if ((268435456 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j75 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j75 = j33;
        }
        if ((536870912 & i11) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j76 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j76 = j34;
        }
        if ((i11 & 1073741824) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j77 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j77 = j35;
        }
        if ((i12 & 1) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j78 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j78 = j36;
        }
        if ((i12 & 2) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j79 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j79 = j37;
        }
        if ((i12 & 4) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j80 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j80 = j38;
        }
        if ((i12 & 8) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j81 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j81 = j39;
        }
        if ((i12 & 16) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j82 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j82 = j40;
        }
        if ((i12 & 32) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j83 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j83 = j41;
        }
        if ((i12 & 64) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j84 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j84 = j42;
        }
        if ((i12 & 128) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j85 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j85 = j43;
        }
        if ((i12 & 256) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j86 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j86 = j44;
        }
        if ((i12 & 512) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j87 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j87 = j45;
        }
        if ((i12 & 1024) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j88 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j88 = j46;
        }
        if ((i12 & 2048) != 0) {
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            j89 = androidx.compose.ui.graphics.d2.f17778o;
        } else {
            j89 = j47;
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1767617725, i4, i5, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1593)");
        }
        pa c5 = g(p6.f13227a.a(tVar, 6), tVar, (i10 >> 6) & 112).c(j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, x0Var2, j58, j59, j60, j61, j62, j63, j64, j65, j66, j67, j68, j69, j70, j71, j72, j73, j74, j75, j76, j77, j78, j79, j80, j81, j82, j83, j84, j85, j86, j87, j88, j89);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    public final androidx.compose.foundation.layout.l1 e(float start, float top2, float end, float bottom) {
        return androidx.compose.foundation.layout.j1.d(start, top2, end, bottom);
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getDefaultOutlinedTextFieldColors")
    public final pa g(@fg.l a3 a3Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-292363577);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-292363577, i4, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1641)");
        }
        pa defaultOutlinedTextFieldColorsCached = a3Var.getDefaultOutlinedTextFieldColorsCached();
        if (defaultOutlinedTextFieldColorsCached == null) {
            c0.q0 q0Var = c0.q0.f37967a;
            long h4 = b3.h(a3Var, q0Var.D());
            long h5 = b3.h(a3Var, q0Var.R());
            long w4 = androidx.compose.ui.graphics.d2.w(b3.h(a3Var, q0Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long h6 = b3.h(a3Var, q0Var.x());
            d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
            companion.getClass();
            long j4 = androidx.compose.ui.graphics.d2.f17777n;
            companion.getClass();
            long j5 = androidx.compose.ui.graphics.d2.f17777n;
            companion.getClass();
            long j6 = androidx.compose.ui.graphics.d2.f17777n;
            companion.getClass();
            defaultOutlinedTextFieldColorsCached = new pa(h4, h5, w4, h6, j4, j5, j6, androidx.compose.ui.graphics.d2.f17777n, b3.h(a3Var, q0Var.a()), b3.h(a3Var, q0Var.k()), (androidx.compose.foundation.text.selection.x0) tVar.x(androidx.compose.foundation.text.selection.y0.c()), b3.h(a3Var, q0Var.G()), b3.h(a3Var, q0Var.a0()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, q0Var.g()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, q0Var.A()), b3.h(a3Var, q0Var.F()), b3.h(a3Var, q0Var.Y()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, q0Var.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, q0Var.z()), b3.h(a3Var, q0Var.J()), b3.h(a3Var, q0Var.e0()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, q0Var.j()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, q0Var.C()), b3.h(a3Var, q0Var.E()), b3.h(a3Var, q0Var.W()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, q0Var.e()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, q0Var.y()), b3.h(a3Var, q0Var.T()), b3.h(a3Var, q0Var.T()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, q0Var.d()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, q0Var.T()), b3.h(a3Var, q0Var.I()), b3.h(a3Var, q0Var.c0()), androidx.compose.ui.graphics.d2.w(b3.k(q0Var.i(), tVar, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, q0Var.B()), b3.h(a3Var, q0Var.U()), b3.h(a3Var, q0Var.U()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, q0Var.U()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, q0Var.U()), b3.h(a3Var, q0Var.V()), b3.h(a3Var, q0Var.V()), androidx.compose.ui.graphics.d2.w(b3.h(a3Var, q0Var.V()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), b3.h(a3Var, q0Var.V()), null);
            a3Var.Z0(defaultOutlinedTextFieldColorsCached);
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return defaultOutlinedTextFieldColorsCached;
    }

    public final float h() {
        return FocusedBorderThickness;
    }

    public final float i() {
        return MinHeight;
    }

    public final float j() {
        return MinWidth;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getShape")
    public final androidx.compose.ui.graphics.e6 k(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1066756961);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1066756961, i4, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:1409)");
        }
        androidx.compose.ui.graphics.e6 e4 = x8.e(c0.q0.f37967a.c(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return e4;
    }

    public final float l() {
        return UnfocusedBorderThickness;
    }
}
