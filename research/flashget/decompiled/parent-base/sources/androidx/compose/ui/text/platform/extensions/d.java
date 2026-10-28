package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.a6;
import androidx.compose.ui.graphics.c6;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.drawscope.i;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.g6;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.text.d0;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.k0;
import androidx.compose.ui.text.font.l0;
import androidx.compose.ui.text.font.o0;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.style.h;
import androidx.compose.ui.text.style.k;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.unit.a0;
import androidx.compose.ui.unit.b0;
import androidx.compose.ui.unit.z;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.text.v;
import ld.q;
import ld.r;
import s0.g;
import s0.n;
import s0.o;

/* compiled from: SpannableExtensions.android.kt */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a6\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a.\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a_\u0010+\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u0006\u0010\u000e\u001a\u00020\r2&\u0010*\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0$H\u0000¢\u0006\u0004\b+\u0010,\u001a)\u0010.\u001a\u00020\u0006*\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010/\u001aW\u00100\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2&\u0010*\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0$H\u0002¢\u0006\u0004\b0\u00101\u001aM\u00105\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\"2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 2\u001e\u00104\u001a\u001a\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000603H\u0000¢\u0006\u0004\b5\u00106\u001a$\u00109\u001a\u0004\u0018\u0001082\u0006\u00107\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a-\u0010=\u001a\u00020\u0006*\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>\u001a-\u0010A\u001a\u00020\u0006*\u00020\u00002\b\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bA\u0010B\u001a.\u0010E\u001a\u00020\u0006*\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a-\u0010I\u001a\u00020\u0006*\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010G2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bI\u0010J\u001a-\u0010M\u001a\u00020\u0006*\u00020\u00002\b\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bM\u0010N\u001a-\u0010Q\u001a\u00020\u0006*\u00020\u00002\b\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bQ\u0010R\u001a6\u0010T\u001a\u00020\u0006*\u00020\u00002\u0006\u0010S\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a-\u0010X\u001a\u00020\u0006*\u00020\u00002\b\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bX\u0010Y\u001a.\u0010Z\u001a\u00020\u0006*\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\bZ\u0010F\u001a0\u0010]\u001a\u00020\u0006*\u00020\u00002\b\u0010\\\u001a\u0004\u0018\u00010[2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b]\u0010^\u001a5\u0010b\u001a\u00020\u0006*\u00020\u00002\b\u0010`\u001a\u0004\u0018\u00010_2\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bb\u0010c\u001a\u0013\u0010d\u001a\u00020\u001b*\u00020\u001eH\u0002¢\u0006\u0004\bd\u0010e\u001a\u001d\u0010g\u001a\u00020\"*\u0004\u0018\u00010\"2\u0006\u0010f\u001a\u00020\"H\u0002¢\u0006\u0004\bg\u0010h\"\u0018\u0010k\u001a\u00020\u001b*\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006l"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "Lkotlin/k2;", "u", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Landroidx/compose/ui/text/style/q;", "textIndent", "", "contextFontSize", "Landroidx/compose/ui/unit/d;", "density", "y", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/q;FLandroidx/compose/ui/unit/d;)V", "Landroidx/compose/ui/unit/z;", "lineHeight", "Landroidx/compose/ui/text/style/h;", "lineHeightStyle", "q", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/style/h;)V", "r", "(Landroid/text/Spannable;JFLandroidx/compose/ui/unit/d;)V", "g", "(JFLandroidx/compose/ui/unit/d;)F", "", "e", "(Landroidx/compose/ui/unit/d;)Z", "Landroidx/compose/ui/text/v0;", "contextTextStyle", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/i0;", "spanStyles", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/y;", "Landroidx/compose/ui/text/font/o0;", "Landroidx/compose/ui/text/font/k0;", "Landroidx/compose/ui/text/font/l0;", "Landroid/graphics/Typeface;", "resolveTypeface", "w", "(Landroid/text/Spannable;Landroidx/compose/ui/text/v0;Ljava/util/List;Landroidx/compose/ui/unit/d;Lld/r;)V", "spanStyleRange", "v", "(Landroid/text/Spannable;Landroidx/compose/ui/text/e$b;Landroidx/compose/ui/unit/d;)V", "m", "(Landroid/text/Spannable;Landroidx/compose/ui/text/v0;Ljava/util/List;Lld/r;)V", "contextFontSpanStyle", "Lkotlin/Function3;", "block", "b", "(Landroidx/compose/ui/text/i0;Ljava/util/List;Lld/q;)V", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "a", "(JLandroidx/compose/ui/unit/d;)Landroid/text/style/MetricAffectingSpan;", "Landroidx/compose/ui/graphics/c6;", "shadow", "t", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/c6;II)V", "Landroidx/compose/ui/graphics/drawscope/i;", "drawStyle", "l", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/drawscope/i;II)V", "Landroidx/compose/ui/graphics/d2;", "color", "h", "(Landroid/text/Spannable;JII)V", "Lu0/f;", "localeList", "s", "(Landroid/text/Spannable;Lu0/f;II)V", "Landroidx/compose/ui/text/style/o;", "textGeometricTransform", "p", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/o;II)V", "", "fontFeatureSettings", "n", "(Landroid/text/Spannable;Ljava/lang/String;II)V", "fontSize", "o", "(Landroid/text/Spannable;JLandroidx/compose/ui/unit/d;II)V", "Landroidx/compose/ui/text/style/k;", "textDecoration", "x", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/k;II)V", "k", "Landroidx/compose/ui/text/style/a;", "baselineShift", "i", "(Landroid/text/Spannable;Landroidx/compose/ui/text/style/a;II)V", "Landroidx/compose/ui/graphics/t1;", "brush", "alpha", "j", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/t1;FII)V", "d", "(Landroidx/compose/ui/text/v0;)Z", "spanStyle", "f", "(Landroidx/compose/ui/text/i0;Landroidx/compose/ui/text/i0;)Landroidx/compose/ui/text/i0;", "c", "(Landroidx/compose/ui/text/i0;)Z", "needsLetterSpacingSpan", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,566:1\n1#2:567\n235#3,3:568\n33#3,4:571\n238#3,2:575\n38#3:577\n240#3:578\n69#3,6:579\n33#3,6:585\n646#4:591\n646#4:592\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n296#1:568,3\n296#1:571,4\n296#1:575,2\n296#1:577\n296#1:578\n364#1:579,6\n384#1:585,6\n448#1:591\n521#1:592\n*E\n"})
/* loaded from: classes.dex */
public final class d {

    /* compiled from: SpannableExtensions.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/text/i0;", "spanStyle", "", "start", "end", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/i0;II)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements q<i0, Integer, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Spannable f21245b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r<y, o0, k0, l0, Typeface> f21246c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Spannable spannable, r<? super y, ? super o0, ? super k0, ? super l0, ? extends Typeface> rVar) {
            super(3);
            this.f21245b = spannable;
            this.f21246c = rVar;
        }

        @Override // ld.q
        public /* bridge */ /* synthetic */ k2 R(i0 i0Var, Integer num, Integer num2) {
            a(i0Var, num.intValue(), num2.intValue());
            return k2.f75408a;
        }

        public final void a(@l i0 i0Var, int i4, int i5) {
            int i6;
            int i7;
            Spannable spannable = this.f21245b;
            r<y, o0, k0, l0, Typeface> rVar = this.f21246c;
            y fontFamily = i0Var.getFontFamily();
            o0 fontWeight = i0Var.getFontWeight();
            if (fontWeight == null) {
                o0.INSTANCE.getClass();
                fontWeight = o0.f20834q;
            }
            k0 fontStyle = i0Var.getFontStyle();
            if (fontStyle != null) {
                i6 = fontStyle.j();
            } else {
                k0.INSTANCE.getClass();
                i6 = k0.f20754c;
            }
            k0 c5 = k0.c(i6);
            l0 fontSynthesis = i0Var.getFontSynthesis();
            if (fontSynthesis != null) {
                i7 = fontSynthesis.getValue();
            } else {
                l0.INSTANCE.getClass();
                i7 = l0.f20760d;
            }
            spannable.setSpan(new o(rVar.i(fontFamily, fontWeight, c5, l0.e(i7))), i4, i5, 33);
        }
    }

    private static final MetricAffectingSpan a(long j4, androidx.compose.ui.unit.d dVar) {
        long m4 = z.m(j4);
        b0.Companion companion = b0.INSTANCE;
        companion.getClass();
        if (b0.g(m4, b0.f21487d)) {
            return new s0.f(dVar.J2(j4));
        }
        companion.getClass();
        if (b0.g(m4, b0.f21488e)) {
            return new s0.e(z.n(j4));
        }
        return null;
    }

    public static final void b(@m i0 i0Var, @l List<e.b<i0>> list, @l q<? super i0, ? super Integer, ? super Integer, k2> qVar) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            i0 h4 = list.get(0).h();
            if (i0Var != null) {
                h4 = i0Var.E(h4);
            }
            qVar.R(h4, Integer.valueOf(list.get(0).i()), Integer.valueOf(list.get(0).g()));
            return;
        }
        int size = list.size();
        int i4 = size * 2;
        Integer[] numArr = new Integer[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            numArr[i5] = 0;
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            e.b<i0> bVar = list.get(i6);
            numArr[i6] = Integer.valueOf(bVar.i());
            numArr[i6 + size] = Integer.valueOf(bVar.g());
        }
        kotlin.collections.l.U3(numArr);
        int intValue = ((Number) kotlin.collections.l.Rb(numArr)).intValue();
        for (int i7 = 0; i7 < i4; i7++) {
            Integer num = numArr[i7];
            int intValue2 = num.intValue();
            if (intValue2 != intValue) {
                int size3 = list.size();
                i0 i0Var2 = i0Var;
                for (int i10 = 0; i10 < size3; i10++) {
                    e.b<i0> bVar2 = list.get(i10);
                    if (bVar2.i() != bVar2.g() && androidx.compose.ui.text.f.t(intValue, intValue2, bVar2.i(), bVar2.g())) {
                        i0 h5 = bVar2.h();
                        i0Var2 = i0Var2 == null ? h5 : i0Var2.E(h5);
                    }
                }
                if (i0Var2 != null) {
                    qVar.R(i0Var2, Integer.valueOf(intValue), num);
                }
                intValue = intValue2;
            }
        }
    }

    private static final boolean c(i0 i0Var) {
        long m4 = z.m(i0Var.getLetterSpacing());
        b0.Companion companion = b0.INSTANCE;
        companion.getClass();
        if (!b0.g(m4, b0.f21487d)) {
            long m5 = z.m(i0Var.getLetterSpacing());
            companion.getClass();
            if (!b0.g(m5, b0.f21488e)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean d(v0 v0Var) {
        return e.e(v0Var.o0()) || v0Var.z() != null;
    }

    private static final boolean e(androidx.compose.ui.unit.d dVar) {
        return ((double) dVar.getFontScale()) > 1.05d;
    }

    private static final i0 f(i0 i0Var, i0 i0Var2) {
        return i0Var == null ? i0Var2 : i0Var.E(i0Var2);
    }

    private static final float g(long j4, float f4, androidx.compose.ui.unit.d dVar) {
        float n4;
        long m4 = z.m(j4);
        b0.Companion companion = b0.INSTANCE;
        companion.getClass();
        if (!b0.g(m4, b0.f21487d)) {
            companion.getClass();
            if (!b0.g(m4, b0.f21488e)) {
                return Float.NaN;
            }
            n4 = z.n(j4);
        } else {
            if (!e(dVar)) {
                return dVar.J2(j4);
            }
            n4 = z.n(j4) / z.n(dVar.w(f4));
        }
        return n4 * f4;
    }

    public static final void h(@l Spannable spannable, long j4, int i4, int i5) {
        d2.INSTANCE.getClass();
        if (j4 != d2.f17778o) {
            u(spannable, new BackgroundColorSpan(f2.r(j4)), i4, i5);
        }
    }

    private static final void i(Spannable spannable, androidx.compose.ui.text.style.a aVar, int i4, int i5) {
        if (aVar != null) {
            u(spannable, new s0.a(aVar.k()), i4, i5);
        }
    }

    private static final void j(Spannable spannable, t1 t1Var, float f4, int i4, int i5) {
        if (t1Var != null) {
            if (t1Var instanceof g6) {
                k(spannable, ((g6) t1Var).getValue(), i4, i5);
            } else if (t1Var instanceof a6) {
                u(spannable, new androidx.compose.ui.text.platform.style.b((a6) t1Var, f4), i4, i5);
            }
        }
    }

    public static final void k(@l Spannable spannable, long j4, int i4, int i5) {
        d2.INSTANCE.getClass();
        if (j4 != d2.f17778o) {
            u(spannable, new ForegroundColorSpan(f2.r(j4)), i4, i5);
        }
    }

    private static final void l(Spannable spannable, i iVar, int i4, int i5) {
        if (iVar != null) {
            u(spannable, new androidx.compose.ui.text.platform.style.a(iVar), i4, i5);
        }
    }

    private static final void m(Spannable spannable, v0 v0Var, List<e.b<i0>> list, r<? super y, ? super o0, ? super k0, ? super l0, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            e.b<i0> bVar = list.get(i4);
            e.b<i0> bVar2 = bVar;
            if (e.e(bVar2.h()) || bVar2.h().getFontSynthesis() != null) {
                arrayList.add(bVar);
            }
        }
        b(d(v0Var) ? new i0(0L, 0L, v0Var.A(), v0Var.y(), v0Var.z(), v0Var.v(), (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.o) null, (u0.f) null, 0L, (k) null, (c6) null, (d0) null, (i) null, 65475, (w) null) : null, arrayList, new a(spannable, rVar));
    }

    private static final void n(Spannable spannable, String str, int i4, int i5) {
        if (str != null) {
            u(spannable, new s0.b(str), i4, i5);
        }
    }

    public static final void o(@l Spannable spannable, long j4, @l androidx.compose.ui.unit.d dVar, int i4, int i5) {
        long m4 = z.m(j4);
        b0.Companion companion = b0.INSTANCE;
        companion.getClass();
        if (b0.g(m4, b0.f21487d)) {
            u(spannable, new AbsoluteSizeSpan(kotlin.math.b.L0(dVar.J2(j4)), false), i4, i5);
            return;
        }
        companion.getClass();
        if (b0.g(m4, b0.f21488e)) {
            u(spannable, new RelativeSizeSpan(z.n(j4)), i4, i5);
        }
    }

    private static final void p(Spannable spannable, androidx.compose.ui.text.style.o oVar, int i4, int i5) {
        if (oVar != null) {
            u(spannable, new ScaleXSpan(oVar.getScaleX()), i4, i5);
            u(spannable, new s0.m(oVar.getSkewX()), i4, i5);
        }
    }

    public static final void q(@l Spannable spannable, long j4, float f4, @l androidx.compose.ui.unit.d dVar, @l h hVar) {
        float g4 = g(j4, f4, dVar);
        if (Float.isNaN(g4)) {
            return;
        }
        u(spannable, new s0.h(g4, 0, (spannable.length() == 0 || v.r7(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), h.c.j(hVar.getTrim()), h.c.k(hVar.getTrim()), hVar.getAlignment()), 0, spannable.length());
    }

    public static final void r(@l Spannable spannable, long j4, float f4, @l androidx.compose.ui.unit.d dVar) {
        float g4 = g(j4, f4, dVar);
        if (Float.isNaN(g4)) {
            return;
        }
        u(spannable, new g(g4), 0, spannable.length());
    }

    public static final void s(@l Spannable spannable, @m u0.f fVar, int i4, int i5) {
        if (fVar != null) {
            u(spannable, b.f21243a.a(fVar), i4, i5);
        }
    }

    private static final void t(Spannable spannable, c6 c6Var, int i4, int i5) {
        if (c6Var != null) {
            u(spannable, new s0.l(f2.r(c6Var.getColor()), i0.f.p(c6Var.getOffset()), i0.f.r(c6Var.getOffset()), e.c(c6Var.getBlurRadius())), i4, i5);
        }
    }

    public static final void u(@l Spannable spannable, @l Object obj, int i4, int i5) {
        spannable.setSpan(obj, i4, i5, 33);
    }

    private static final void v(Spannable spannable, e.b<i0> bVar, androidx.compose.ui.unit.d dVar) {
        int i4 = bVar.i();
        int g4 = bVar.g();
        i0 h4 = bVar.h();
        i(spannable, h4.getBaselineShift(), i4, g4);
        k(spannable, h4.m(), i4, g4);
        j(spannable, h4.l(), h4.i(), i4, g4);
        x(spannable, h4.getBackground(), i4, g4);
        o(spannable, h4.getFontSize(), dVar, i4, g4);
        n(spannable, h4.getFontFeatureSettings(), i4, g4);
        p(spannable, h4.getTextGeometricTransform(), i4, g4);
        s(spannable, h4.getLocaleList(), i4, g4);
        h(spannable, h4.getBackground(), i4, g4);
        t(spannable, h4.getShadow(), i4, g4);
        l(spannable, h4.getDrawStyle(), i4, g4);
    }

    public static final void w(@l Spannable spannable, @l v0 v0Var, @l List<e.b<i0>> list, @l androidx.compose.ui.unit.d dVar, @l r<? super y, ? super o0, ? super k0, ? super l0, ? extends Typeface> rVar) {
        MetricAffectingSpan a5;
        m(spannable, v0Var, list, rVar);
        int size = list.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            e.b<i0> bVar = list.get(i4);
            int i5 = bVar.i();
            int g4 = bVar.g();
            if (i5 >= 0 && i5 < spannable.length() && g4 > i5 && g4 <= spannable.length()) {
                v(spannable, bVar, dVar);
                if (c(bVar.h())) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                e.b<i0> bVar2 = list.get(i6);
                int i7 = bVar2.i();
                int g5 = bVar2.g();
                i0 h4 = bVar2.h();
                if (i7 >= 0 && i7 < spannable.length() && g5 > i7 && g5 <= spannable.length() && (a5 = a(h4.getLetterSpacing(), dVar)) != null) {
                    u(spannable, a5, i7, g5);
                }
            }
        }
    }

    public static final void x(@l Spannable spannable, @m k kVar, int i4, int i5) {
        if (kVar != null) {
            k.Companion companion = k.INSTANCE;
            companion.getClass();
            boolean d5 = kVar.d(k.f21365e);
            companion.getClass();
            u(spannable, new n(d5, kVar.d(k.f21366f)), i4, i5);
        }
    }

    public static final void y(@l Spannable spannable, @m androidx.compose.ui.text.style.q qVar, float f4, @l androidx.compose.ui.unit.d dVar) {
        float n4;
        if (qVar != null) {
            if ((z.j(qVar.getFirstLine(), a0.m(0)) && z.j(qVar.getRestLine(), a0.m(0))) || a0.s(qVar.getFirstLine()) || a0.s(qVar.getRestLine())) {
                return;
            }
            long m4 = z.m(qVar.getFirstLine());
            b0.Companion companion = b0.INSTANCE;
            companion.getClass();
            float f5 = 0.0f;
            if (b0.g(m4, b0.f21487d)) {
                n4 = dVar.J2(qVar.getFirstLine());
            } else {
                companion.getClass();
                n4 = b0.g(m4, b0.f21488e) ? z.n(qVar.getFirstLine()) * f4 : 0.0f;
            }
            long m5 = z.m(qVar.getRestLine());
            companion.getClass();
            if (b0.g(m5, b0.f21487d)) {
                f5 = dVar.J2(qVar.getRestLine());
            } else {
                companion.getClass();
                if (b0.g(m5, b0.f21488e)) {
                    f5 = z.n(qVar.getRestLine()) * f4;
                }
            }
            u(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(n4), (int) Math.ceil(f5)), 0, spannable.length());
        }
    }
}
