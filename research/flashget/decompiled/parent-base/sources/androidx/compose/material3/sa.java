package androidx.compose.material3;

import androidx.compose.runtime.t;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import com.tencent.rtmp.TXLiveConstants;
import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a¢\u0002\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010#\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a#\u0010'\u001a\u00020%*\u00020%2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0002H\u0000¢\u0006\u0004\b'\u0010(\u001a\u0019\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010.\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b.\u0010-\"\u0014\u00100\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010/\"\u0014\u00101\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010/\"\u0014\u00102\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010/\"\u0014\u00104\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010/\"\u0014\u00106\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010/\"\u0014\u00108\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010/\"\u0014\u0010:\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010/\"\u0014\u0010<\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010/\"\u0014\u0010>\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u0010/\"\u001a\u0010D\u001a\u00020?8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0014\u0010G\u001a\u00020+8\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010F\"\u0014\u0010I\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010F\"\u0014\u0010J\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010F\"\u001a\u0010N\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010L\u001a\u0004\bH\u0010M\"\u001a\u0010O\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010L\u001a\u0004\b3\u0010M\"\u001a\u0010Q\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bE\u0010M\"\u001a\u0010S\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\b@\u0010M\"\u001a\u0010U\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010L\u001a\u0004\b=\u0010M\"\u001a\u0010W\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010L\u001a\u0004\b9\u0010M\"\u001a\u0010Y\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010L\u001a\u0004\b;\u0010M\"\u001a\u0010]\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b5\u0010\\\"\u001a\u0010a\u001a\u0004\u0018\u00010_*\u00020^8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u0010`\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006b"}, d2 = {"Landroidx/compose/material3/wa;", "type", "", "value", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "innerTextField", "Landroidx/compose/ui/text/input/k1;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/foundation/layout/l1;", "contentPadding", "Landroidx/compose/material3/pa;", "colors", "container", "a", "(Landroidx/compose/material3/wa;Ljava/lang/String;Lld/p;Landroidx/compose/ui/text/input/k1;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;ZZZLandroidx/compose/foundation/interaction/i;Landroidx/compose/foundation/layout/l1;Landroidx/compose/material3/pa;Lld/p;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/ui/graphics/d2;", "contentColor", "Landroidx/compose/ui/text/v0;", "typography", "content", "b", "(JLandroidx/compose/ui/text/v0;Lld/p;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/q;", "defaultErrorMessage", "c", "(Landroidx/compose/ui/q;ZLjava/lang/String;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/layout/i1;", "placeable", "", "o", "(Landroidx/compose/ui/layout/i1;)I", "n", "Ljava/lang/String;", "TextFieldId", "PlaceholderId", "LabelId", "d", "LeadingId", "e", "TrailingId", "f", "PrefixId", "g", "SuffixId", "h", "SupportingId", "i", "ContainerId", "Landroidx/compose/ui/unit/b;", "j", "J", "m", "()J", "ZeroConstraints", "k", "I", "AnimationDuration", "l", "PlaceholderAnimationDuration", "PlaceholderAnimationDelayOrDuration", "Landroidx/compose/ui/unit/h;", "F", "()F", "TextFieldPadding", "HorizontalIconPadding", "p", "SupportingTopPadding", "q", "PrefixSuffixTextPadding", "r", "MinTextLineHeight", "s", "MinFocusedLabelLineHeight", "t", "MinSupportingTextLineHeight", "u", "Landroidx/compose/ui/q;", "()Landroidx/compose/ui/q;", "IconDefaultSizeModifier", "Landroidx/compose/ui/layout/p;", "", "(Landroidx/compose/ui/layout/p;)Ljava/lang/Object;", "layoutId", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n1116#2,6:434\n658#3:440\n646#3:441\n658#3:442\n646#3:443\n154#4:444\n154#4:445\n154#4:446\n154#4:447\n154#4:448\n154#4:449\n154#4:450\n154#4:451\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt\n*L\n81#1:434,6\n106#1:440\n106#1:441\n109#1:442\n109#1:443\n424#1:444\n425#1:445\n426#1:446\n427#1:447\n428#1:448\n429#1:449\n430#1:450\n432#1:451\n*E\n"})
/* loaded from: classes.dex */
public final class sa {

    /* renamed from: k, reason: collision with root package name */
    public static final int f14413k = 150;

    /* renamed from: l, reason: collision with root package name */
    private static final int f14414l = 83;

    /* renamed from: m, reason: collision with root package name */
    private static final int f14415m = 67;

    /* renamed from: n, reason: collision with root package name */
    private static final float f14416n;

    /* renamed from: s, reason: collision with root package name */
    private static final float f14421s;

    /* renamed from: t, reason: collision with root package name */
    private static final float f14422t;

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.ui.q f14423u;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final String f14403a = "TextField";

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final String f14404b = "Hint";

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    public static final String f14405c = "Label";

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    public static final String f14406d = "Leading";

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    public static final String f14407e = "Trailing";

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    public static final String f14408f = "Prefix";

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    public static final String f14409g = "Suffix";

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    public static final String f14410h = "Supporting";

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    public static final String f14411i = "Container";

    /* renamed from: j, reason: collision with root package name */
    private static final long f14412j = androidx.compose.ui.unit.c.a(0, 0, 0, 0);

    /* renamed from: o, reason: collision with root package name */
    private static final float f14417o = 12;

    /* renamed from: p, reason: collision with root package name */
    private static final float f14418p = 4;

    /* renamed from: q, reason: collision with root package name */
    private static final float f14419q = 2;

    /* renamed from: r, reason: collision with root package name */
    private static final float f14420r = 24;

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "labelProgress", "Landroidx/compose/ui/graphics/d2;", "labelTextStyleColor", "labelContentColor", "placeholderAlphaProgress", "prefixSuffixAlphaProgress", "Lkotlin/k2;", "a", "(FJJFFLandroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,433:1\n1116#2,6:434\n1116#2,6:440\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3\n*L\n223#1:434,6\n246#1:440,6\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.u<Float, androidx.compose.ui.graphics.d2, androidx.compose.ui.graphics.d2, Float, Float, androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14424b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ pa f14425c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14426d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f14427e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f14428f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14429g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f14430h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14431i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14432j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14433k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14434l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14435m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ wa f14436n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14437o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f14438p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f14439q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f14440r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14441s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14442t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14443u;

        /* compiled from: TextFieldImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/n;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.sa$a$a, reason: collision with other inner class name */
        static final class C0293a extends kotlin.jvm.internal.n0 implements ld.l<i0.n, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f14444b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<i0.n> f14445c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0293a(float f4, androidx.compose.runtime.k2<i0.n> k2Var) {
                super(1);
                this.f14444b = f4;
                this.f14445c = k2Var;
            }

            public final void a(long j4) {
                float t4 = i0.n.t(j4) * this.f14444b;
                float m4 = i0.n.m(j4) * this.f14444b;
                if (i0.n.t(this.f14445c.getValue().getPackedValue()) == t4 && i0.n.m(this.f14445c.getValue().getPackedValue()) == m4) {
                    return;
                }
                this.f14445c.setValue(i0.n.c(i0.o.a(t4, m4)));
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.n nVar) {
                a(nVar.getPackedValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: TextFieldImpl.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14446a;

            static {
                int[] iArr = new int[wa.values().length];
                try {
                    iArr[wa.Filled.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[wa.Outlined.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f14446a = iArr;
            }
        }

        /* compiled from: TextFieldImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,433:1\n68#2,6:434\n74#2:468\n78#2:473\n78#3,11:440\n91#3:472\n456#4,8:451\n464#4,3:465\n467#4,3:469\n3737#5,6:459\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1\n*L\n225#1:434,6\n225#1:468\n225#1:473\n225#1:440,11\n225#1:472\n225#1:451,8\n225#1:465,3\n225#1:469,3\n225#1:459,6\n*E\n"})
        static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.runtime.k2<i0.n> f14447b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.l1 f14448c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14449d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(androidx.compose.runtime.k2<i0.n> k2Var, androidx.compose.foundation.layout.l1 l1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f14447b = k2Var;
                this.f14448c = l1Var;
                this.f14449d = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(1902535592, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:224)");
                }
                androidx.compose.ui.q n4 = r7.n(androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "Container"), this.f14447b.getValue().getPackedValue(), this.f14448c);
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14449d;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, true, tVar, 48, -1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(n4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a7);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: TextFieldImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$containerWithId$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,433:1\n68#2,6:434\n74#2:468\n78#2:473\n78#3,11:440\n91#3:472\n456#4,8:451\n464#4,3:465\n467#4,3:469\n3737#5,6:459\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$containerWithId$1\n*L\n199#1:434,6\n199#1:468\n199#1:473\n199#1:440,11\n199#1:472\n199#1:451,8\n199#1:465,3\n199#1:469,3\n199#1:459,6\n*E\n"})
        static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14450b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f14450b = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-2124779163, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:198)");
                }
                androidx.compose.ui.q b5 = androidx.compose.ui.layout.w.b(androidx.compose.ui.q.INSTANCE, "Container");
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14450b;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, true, tVar, 48, -1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(b5);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a7);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: TextFieldImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f14451b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f14452c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14453d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f14454e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f14455f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            e(float f4, long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, boolean z4, long j5) {
                super(2);
                this.f14451b = f4;
                this.f14452c = j4;
                this.f14453d = pVar;
                this.f14454e = z4;
                this.f14455f = j5;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                androidx.compose.ui.text.v0 v0Var;
                androidx.compose.ui.text.v0 l4;
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-382297919, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:117)");
                }
                p6 p6Var = p6.f13227a;
                androidx.compose.ui.text.v0 c5 = androidx.compose.ui.text.w0.c(p6Var.c(tVar, 6).getBodyLarge(), p6Var.c(tVar, 6).getBodySmall(), this.f14451b);
                boolean z4 = this.f14454e;
                long j4 = this.f14455f;
                if (z4) {
                    l4 = c5.l((r48 & 1) != 0 ? c5.spanStyle.m() : j4, (r48 & 2) != 0 ? c5.spanStyle.getFontSize() : 0L, (r48 & 4) != 0 ? c5.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? c5.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? c5.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? c5.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? c5.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? c5.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? c5.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? c5.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? c5.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? c5.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? c5.spanStyle.getBackground() : null, (r48 & 8192) != 0 ? c5.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? c5.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? c5.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? c5.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? c5.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? c5.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? c5.platformStyle : null, (r48 & 1048576) != 0 ? c5.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? c5.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? c5.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? c5.paragraphStyle.getTextMotion() : null);
                    v0Var = l4;
                } else {
                    v0Var = c5;
                }
                sa.b(this.f14452c, v0Var, this.f14453d, tVar, 0, 0);
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

        /* compiled from: TextFieldImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f14456b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14457c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            f(long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f14456b = j4;
                this.f14457c = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(90769583, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:176)");
                }
                sa.b(this.f14456b, null, this.f14457c, tVar, 0, 2);
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

        /* compiled from: TextFieldImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/q;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,433:1\n68#2,6:434\n74#2:468\n78#2:473\n78#3,11:440\n91#3:472\n456#4,8:451\n464#4,3:465\n467#4,3:469\n3737#5,6:459\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1\n*L\n136#1:434,6\n136#1:468\n136#1:473\n136#1:440,11\n136#1:472\n136#1:451,8\n136#1:465,3\n136#1:469,3\n136#1:459,6\n*E\n"})
        static final class g extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.ui.q, androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f14458b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f14459c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14460d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            g(float f4, long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(3);
                this.f14458b = f4;
                this.f14459c = j4;
                this.f14460d = pVar;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ kotlin.k2 R(androidx.compose.ui.q qVar, androidx.compose.runtime.t tVar, Integer num) {
                a(qVar, tVar, num.intValue());
                return kotlin.k2.f75408a;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.l androidx.compose.ui.q qVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 6) == 0) {
                    i4 |= tVar.q0(qVar) ? 4 : 2;
                }
                if ((i4 & 19) == 18 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-524658155, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:135)");
                }
                androidx.compose.ui.q a5 = androidx.compose.ui.draw.a.a(qVar, this.f14458b);
                long j4 = this.f14459c;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14460d;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a6 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
                int j5 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a7 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(a5);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a7);
                } else {
                    tVar.C();
                }
                ld.p a8 = androidx.compose.animation.p.a(companion, tVar, a6, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, tVar, j5, a8);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                sa.b(j4, p6.f13227a.c(tVar, 6).getBodyLarge(), pVar, tVar, 0, 0);
                if (t.a(tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }
        }

        /* compiled from: TextFieldImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,433:1\n68#2,6:434\n74#2:468\n78#2:473\n78#3,11:440\n91#3:472\n456#4,8:451\n464#4,3:465\n467#4,3:469\n3737#5,6:459\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1\n*L\n150#1:434,6\n150#1:468\n150#1:473\n150#1:440,11\n150#1:472\n150#1:451,8\n150#1:465,3\n150#1:469,3\n150#1:459,6\n*E\n"})
        static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f14461b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f14462c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.v0 f14463d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14464e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            h(float f4, long j4, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f14461b = f4;
                this.f14462c = j4;
                this.f14463d = v0Var;
                this.f14464e = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(1824482619, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:149)");
                }
                androidx.compose.ui.q a5 = androidx.compose.ui.draw.a.a(androidx.compose.ui.q.INSTANCE, this.f14461b);
                long j4 = this.f14462c;
                androidx.compose.ui.text.v0 v0Var = this.f14463d;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14464e;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a6 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
                int j5 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a7 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(a5);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a7);
                } else {
                    tVar.C();
                }
                ld.p a8 = androidx.compose.animation.p.a(companion, tVar, a6, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, tVar, j5, a8);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                sa.b(j4, v0Var, pVar, tVar, 0, 0);
                if (t.a(tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: TextFieldImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,433:1\n68#2,6:434\n74#2:468\n78#2:473\n78#3,11:440\n91#3:472\n456#4,8:451\n464#4,3:465\n467#4,3:469\n3737#5,6:459\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1\n*L\n164#1:434,6\n164#1:468\n164#1:473\n164#1:440,11\n164#1:472\n164#1:451,8\n164#1:465,3\n164#1:469,3\n164#1:459,6\n*E\n"})
        static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f14465b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f14466c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.v0 f14467d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14468e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            i(float f4, long j4, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f14465b = f4;
                this.f14466c = j4;
                this.f14467d = v0Var;
                this.f14468e = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(907456412, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:163)");
                }
                androidx.compose.ui.q a5 = androidx.compose.ui.draw.a.a(androidx.compose.ui.q.INSTANCE, this.f14465b);
                long j4 = this.f14466c;
                androidx.compose.ui.text.v0 v0Var = this.f14467d;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14468e;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a6 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
                int j5 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a7 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(a5);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a7);
                } else {
                    tVar.C();
                }
                ld.p a8 = androidx.compose.animation.p.a(companion, tVar, a6, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, tVar, j5, a8);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                sa.b(j4, v0Var, pVar, tVar, 0, 0);
                if (t.a(tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: TextFieldImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f14469b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.v0 f14470c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14471d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            j(long j4, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f14469b = j4;
                this.f14470c = v0Var;
                this.f14471d = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-1531019900, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:191)");
                }
                sa.b(this.f14469b, this.f14470c, this.f14471d, tVar, 0, 0);
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

        /* compiled from: TextFieldImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f14472b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14473c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            k(long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f14472b = j4;
                this.f14473c = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(2077796155, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:183)");
                }
                sa.b(this.f14472b, null, this.f14473c, tVar, 0, 2);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, pa paVar, boolean z4, boolean z5, androidx.compose.foundation.interaction.i iVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, String str, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, wa waVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar8, boolean z6, androidx.compose.foundation.layout.l1 l1Var, boolean z7, androidx.compose.ui.text.v0 v0Var, androidx.compose.ui.text.v0 v0Var2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar9) {
            super(7);
            this.f14424b = pVar;
            this.f14425c = paVar;
            this.f14426d = z4;
            this.f14427e = z5;
            this.f14428f = iVar;
            this.f14429g = pVar2;
            this.f14430h = str;
            this.f14431i = pVar3;
            this.f14432j = pVar4;
            this.f14433k = pVar5;
            this.f14434l = pVar6;
            this.f14435m = pVar7;
            this.f14436n = waVar;
            this.f14437o = pVar8;
            this.f14438p = z6;
            this.f14439q = l1Var;
            this.f14440r = z7;
            this.f14441s = v0Var;
            this.f14442t = v0Var2;
            this.f14443u = pVar9;
        }

        @Override // ld.u
        public /* bridge */ /* synthetic */ kotlin.k2 K(Float f4, androidx.compose.ui.graphics.d2 d2Var, androidx.compose.ui.graphics.d2 d2Var2, Float f5, Float f6, androidx.compose.runtime.t tVar, Integer num) {
            a(f4.floatValue(), d2Var.M(), d2Var2.M(), f5.floatValue(), f6.floatValue(), tVar, num.intValue());
            return kotlin.k2.f75408a;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(float f4, long j4, long j5, float f5, float f6, @fg.m androidx.compose.runtime.t tVar, int i4) {
            int i5;
            boolean z4;
            androidx.compose.runtime.internal.a aVar;
            if ((i4 & 6) == 0) {
                i5 = (tVar.d(f4) ? 4 : 2) | i4;
            } else {
                i5 = i4;
            }
            if ((i4 & 48) == 0) {
                i5 |= tVar.g(j4) ? 32 : 16;
            }
            if ((i4 & 384) == 0) {
                i5 |= tVar.g(j5) ? 256 : 128;
            }
            if ((i4 & 3072) == 0) {
                i5 |= tVar.d(f5) ? 2048 : 1024;
            }
            if ((i4 & 24576) == 0) {
                i5 |= tVar.d(f6) ? 16384 : 8192;
            }
            int i6 = i5;
            if ((74899 & i6) == 74898 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1290853831, i6, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:115)");
            }
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f14424b;
            if (pVar != null) {
                z4 = true;
                aVar = androidx.compose.runtime.internal.c.b(tVar, -382297919, true, new e(f4, j5, pVar, this.f14440r, j4));
            } else {
                z4 = true;
                aVar = null;
            }
            androidx.compose.runtime.internal.a b5 = (this.f14429g == null || this.f14430h.length() != 0 || f5 <= 0.0f) ? null : androidx.compose.runtime.internal.c.b(tVar, -524658155, z4, new g(f5, this.f14425c.e0(this.f14426d, this.f14427e, this.f14428f, tVar, 0).getValue().M(), this.f14429g));
            long M = this.f14425c.g0(this.f14426d, this.f14427e, this.f14428f, tVar, 0).getValue().M();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f14431i;
            androidx.compose.runtime.internal.a b6 = (pVar2 == null || f6 <= 0.0f) ? null : androidx.compose.runtime.internal.c.b(tVar, 1824482619, z4, new h(f6, M, this.f14441s, pVar2));
            long M2 = this.f14425c.i0(this.f14426d, this.f14427e, this.f14428f, tVar, 0).getValue().M();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f14432j;
            androidx.compose.runtime.internal.a b7 = (pVar3 == null || f6 <= 0.0f) ? null : androidx.compose.runtime.internal.c.b(tVar, 907456412, z4, new i(f6, M2, this.f14441s, pVar3));
            long M3 = this.f14425c.c0(this.f14426d, this.f14427e, this.f14428f, tVar, 0).getValue().M();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar4 = this.f14433k;
            androidx.compose.runtime.internal.a b10 = pVar4 != null ? androidx.compose.runtime.internal.c.b(tVar, 90769583, z4, new f(M3, pVar4)) : null;
            long M4 = this.f14425c.p0(this.f14426d, this.f14427e, this.f14428f, tVar, 0).getValue().M();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar5 = this.f14434l;
            androidx.compose.runtime.internal.a b11 = pVar5 != null ? androidx.compose.runtime.internal.c.b(tVar, 2077796155, z4, new k(M4, pVar5)) : null;
            long M5 = this.f14425c.k0(this.f14426d, this.f14427e, this.f14428f, tVar, 0).getValue().M();
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar6 = this.f14435m;
            androidx.compose.runtime.internal.a b12 = pVar6 != null ? androidx.compose.runtime.internal.c.b(tVar, -1531019900, z4, new j(M5, this.f14442t, pVar6)) : null;
            int i7 = b.f14446a[this.f14436n.ordinal()];
            if (i7 == z4) {
                tVar.P(404042583);
                ta.e(androidx.compose.ui.q.INSTANCE, this.f14437o, aVar, b5, b10, b11, b6, b7, this.f14438p, f4, androidx.compose.runtime.internal.c.b(tVar, -2124779163, true, new d(this.f14443u)), b12, this.f14439q, tVar, ((i6 << 27) & 1879048192) | 6, 6);
                tVar.p0();
            } else if (i7 != 2) {
                tVar.P(404045277);
                tVar.p0();
            } else {
                Object a5 = androidx.compose.foundation.j.a(tVar, 404043576, 404043645);
                t.Companion companion = androidx.compose.runtime.t.INSTANCE;
                if (a5 == companion.a()) {
                    i0.n.INSTANCE.getClass();
                    a5 = androidx.compose.runtime.t4.g(i0.n.c(i0.n.f74171c), null, 2, null);
                    tVar.E(a5);
                }
                androidx.compose.runtime.k2 k2Var = (androidx.compose.runtime.k2) a5;
                tVar.p0();
                androidx.compose.runtime.internal.a b13 = androidx.compose.runtime.internal.c.b(tVar, 1902535592, z4, new c(k2Var, this.f14439q, this.f14443u));
                q.Companion companion2 = androidx.compose.ui.q.INSTANCE;
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar7 = this.f14437o;
                boolean z5 = this.f14438p;
                tVar.P(404044653);
                boolean z6 = (i6 & 14) == 4;
                Object Q = tVar.Q();
                if (z6 || Q == companion.a()) {
                    Q = new C0293a(f4, k2Var);
                    tVar.E(Q);
                }
                tVar.p0();
                r7.e(companion2, pVar7, b5, aVar, b10, b11, b6, b7, z5, f4, (ld.l) Q, b13, b12, this.f14439q, tVar, ((i6 << 27) & 1879048192) | 6, 48);
                tVar.p0();
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ wa f14474b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f14475c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14476d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.input.k1 f14477e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14478f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14479g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14480h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14481i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14482j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14483k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14484l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f14485m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f14486n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f14487o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f14488p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f14489q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ pa f14490r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14491s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f14492t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f14493u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f14494v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wa waVar, String str, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.text.input.k1 k1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar8, boolean z4, boolean z5, boolean z6, androidx.compose.foundation.interaction.i iVar, androidx.compose.foundation.layout.l1 l1Var, pa paVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar9, int i4, int i5, int i6) {
            super(2);
            this.f14474b = waVar;
            this.f14475c = str;
            this.f14476d = pVar;
            this.f14477e = k1Var;
            this.f14478f = pVar2;
            this.f14479g = pVar3;
            this.f14480h = pVar4;
            this.f14481i = pVar5;
            this.f14482j = pVar6;
            this.f14483k = pVar7;
            this.f14484l = pVar8;
            this.f14485m = z4;
            this.f14486n = z5;
            this.f14487o = z6;
            this.f14488p = iVar;
            this.f14489q = l1Var;
            this.f14490r = paVar;
            this.f14491s = pVar9;
            this.f14492t = i4;
            this.f14493u = i5;
            this.f14494v = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            sa.a(this.f14474b, this.f14475c, this.f14476d, this.f14477e, this.f14478f, this.f14479g, this.f14480h, this.f14481i, this.f14482j, this.f14483k, this.f14484l, this.f14485m, this.f14486n, this.f14487o, this.f14488p, this.f14489q, this.f14490r, this.f14491s, tVar, androidx.compose.runtime.g3.b(this.f14492t | 1), androidx.compose.runtime.g3.b(this.f14493u), this.f14494v);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/z5;", "it", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroidx/compose/material3/z5;Landroidx/compose/runtime/t;I)J"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.q<z5, androidx.compose.runtime.t, Integer, androidx.compose.ui.graphics.d2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ pa f14495b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f14496c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14497d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f14498e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(pa paVar, boolean z4, boolean z5, androidx.compose.foundation.interaction.i iVar) {
            super(3);
            this.f14495b = paVar;
            this.f14496c = z4;
            this.f14497d = z5;
            this.f14498e = iVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.d2 R(z5 z5Var, androidx.compose.runtime.t tVar, Integer num) {
            return androidx.compose.ui.graphics.d2.n(a(z5Var, tVar, num.intValue()));
        }

        @androidx.compose.runtime.i
        public final long a(@fg.l z5 z5Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
            tVar.P(-502832279);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-502832279, i4, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:92)");
            }
            long M = this.f14495b.a0(this.f14496c, this.f14497d, this.f14498e, tVar, 0).getValue().M();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
            tVar.p0();
            return M;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f14499b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f14500c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14501d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f14502e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f14503f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(long j4, androidx.compose.ui.text.v0 v0Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4, int i5) {
            super(2);
            this.f14499b = j4;
            this.f14500c = v0Var;
            this.f14501d = pVar;
            this.f14502e = i4;
            this.f14503f = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            sa.b(this.f14499b, this.f14500c, this.f14501d, tVar, androidx.compose.runtime.g3.b(this.f14502e | 1), this.f14503f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f14504b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f14505c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f14504b = j4;
            this.f14505c = pVar;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1449369305, i4, -1, "androidx.compose.material3.Decoration.<anonymous> (TextFieldImpl.kt:273)");
            }
            androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(this.f14504b)), this.f14505c, tVar, androidx.compose.runtime.b3.f15974d);
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

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f14506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(1);
            this.f14506b = str;
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
            androidx.compose.ui.semantics.w.q(zVar, this.f14506b);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            a(zVar);
            return kotlin.k2.f75408a;
        }
    }

    static {
        float f4 = 16;
        f14416n = androidx.compose.ui.unit.h.g(f4);
        f14421s = f4;
        f14422t = f4;
        float f5 = 48;
        f14423u = androidx.compose.foundation.layout.c2.a(androidx.compose.ui.q.INSTANCE, f5, f5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x033d, code lost:
    
        if (kotlin.a2.o(r7, androidx.compose.ui.graphics.d2.f17778o) != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0361, code lost:
    
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x035f, code lost:
    
        if (kotlin.a2.o(r7, androidx.compose.ui.graphics.d2.f17778o) != false) goto L257;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0299  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.material3.wa r42, @fg.l java.lang.String r43, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r44, @fg.l androidx.compose.ui.text.input.k1 r45, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r46, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r47, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r48, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r49, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r50, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r51, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r52, boolean r53, boolean r54, boolean r55, @fg.l androidx.compose.foundation.interaction.i r56, @fg.l androidx.compose.foundation.layout.l1 r57, @fg.l androidx.compose.material3.pa r58, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r59, @fg.m androidx.compose.runtime.t r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.sa.a(androidx.compose.material3.wa, java.lang.String, ld.p, androidx.compose.ui.text.input.k1, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, ld.p, boolean, boolean, boolean, androidx.compose.foundation.interaction.i, androidx.compose.foundation.layout.l1, androidx.compose.material3.pa, ld.p, androidx.compose.runtime.t, int, int, int):void");
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    public static final void b(long j4, @fg.m androidx.compose.ui.text.v0 v0Var, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(-1520066345);
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (o4.g(j4) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i7 = i5 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= o4.q0(v0Var) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= o4.S(pVar) ? 256 : 128;
        }
        if ((i6 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (i7 != 0) {
                v0Var = null;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1520066345, i6, -1, "androidx.compose.material3.Decoration (TextFieldImpl.kt:271)");
            }
            androidx.compose.runtime.internal.a b5 = androidx.compose.runtime.internal.c.b(o4, 1449369305, true, new e(j4, pVar));
            if (v0Var != null) {
                o4.P(1830467586);
                w7.a(j4, v0Var, pVar, o4, i6 & TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED);
                o4.p0();
            } else {
                o4.P(1830467667);
                b5.invoke(o4, 6);
                o4.p0();
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.ui.text.v0 v0Var2 = v0Var;
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new d(j4, v0Var2, pVar, i4, i5));
        }
    }

    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, boolean z4, @fg.l String str) {
        return z4 ? androidx.compose.ui.semantics.o.f(qVar, false, new f(str), 1, null) : qVar;
    }

    public static final float d() {
        return f14417o;
    }

    @fg.l
    public static final androidx.compose.ui.q e() {
        return f14423u;
    }

    @fg.m
    public static final Object f(@fg.l androidx.compose.ui.layout.p pVar) {
        Object parentData = pVar.getParentData();
        androidx.compose.ui.layout.y yVar = parentData instanceof androidx.compose.ui.layout.y ? (androidx.compose.ui.layout.y) parentData : null;
        if (yVar != null) {
            return yVar.getLayoutId();
        }
        return null;
    }

    public static final float g() {
        return f14421s;
    }

    public static final float h() {
        return f14422t;
    }

    public static final float i() {
        return f14420r;
    }

    public static final float j() {
        return f14419q;
    }

    public static final float k() {
        return f14418p;
    }

    public static final float l() {
        return f14416n;
    }

    public static final long m() {
        return f14412j;
    }

    public static final int n(@fg.m androidx.compose.ui.layout.i1 i1Var) {
        if (i1Var != null) {
            return i1Var.getHeight();
        }
        return 0;
    }

    public static final int o(@fg.m androidx.compose.ui.layout.i1 i1Var) {
        if (i1Var != null) {
            return i1Var.getWidth();
        }
        return 0;
    }
}
