package androidx.core.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.UnderlineSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: SpannableStringBuilder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a%\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001aD\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a)\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a)\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a)\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a3\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a3\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\b\b\u0001\u0010\u0012\u001a\u00020\u00112\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a)\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a1\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00162\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a)\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u001a)\u0010\u001a\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"Lkotlin/Function1;", "Landroid/text/SpannableStringBuilder;", "Lkotlin/m2;", "Lkotlin/u;", "builderAction", "Landroid/text/SpannedString;", "c", "", "", "spans", "f", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lq3/l;)Landroid/text/SpannableStringBuilder;", "span", "e", "b", "g", "l", "", "color", "d", "a", "i", "", "proportion", "h", "k", "j", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class x {
    @d5.d
    public static final SpannableStringBuilder a(@d5.d SpannableStringBuilder spannableStringBuilder, @androidx.annotation.l int i5, @d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(builderAction, "builderAction");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(i5);
        int length = spannableStringBuilder.length();
        builderAction.N(spannableStringBuilder);
        spannableStringBuilder.setSpan(backgroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @d5.d
    public static final SpannableStringBuilder b(@d5.d SpannableStringBuilder spannableStringBuilder, @d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(builderAction, "builderAction");
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        builderAction.N(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @d5.d
    public static final SpannedString c(@d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(builderAction, "builderAction");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        builderAction.N(spannableStringBuilder);
        return new SpannedString(spannableStringBuilder);
    }

    @d5.d
    public static final SpannableStringBuilder d(@d5.d SpannableStringBuilder spannableStringBuilder, @androidx.annotation.l int i5, @d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(builderAction, "builderAction");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i5);
        int length = spannableStringBuilder.length();
        builderAction.N(spannableStringBuilder);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @d5.d
    public static final SpannableStringBuilder e(@d5.d SpannableStringBuilder spannableStringBuilder, @d5.d Object span, @d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(span, "span");
        l0.p(builderAction, "builderAction");
        int length = spannableStringBuilder.length();
        builderAction.N(spannableStringBuilder);
        spannableStringBuilder.setSpan(span, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @d5.d
    public static final SpannableStringBuilder f(@d5.d SpannableStringBuilder spannableStringBuilder, @d5.d Object[] spans, @d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(spans, "spans");
        l0.p(builderAction, "builderAction");
        int length = spannableStringBuilder.length();
        builderAction.N(spannableStringBuilder);
        int length2 = spans.length;
        int i5 = 0;
        while (i5 < length2) {
            Object obj = spans[i5];
            i5++;
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    @d5.d
    public static final SpannableStringBuilder g(@d5.d SpannableStringBuilder spannableStringBuilder, @d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(builderAction, "builderAction");
        StyleSpan styleSpan = new StyleSpan(2);
        int length = spannableStringBuilder.length();
        builderAction.N(spannableStringBuilder);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @d5.d
    public static final SpannableStringBuilder h(@d5.d SpannableStringBuilder spannableStringBuilder, float f6, @d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(builderAction, "builderAction");
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(f6);
        int length = spannableStringBuilder.length();
        builderAction.N(spannableStringBuilder);
        spannableStringBuilder.setSpan(relativeSizeSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @d5.d
    public static final SpannableStringBuilder i(@d5.d SpannableStringBuilder spannableStringBuilder, @d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(builderAction, "builderAction");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        int length = spannableStringBuilder.length();
        builderAction.N(spannableStringBuilder);
        spannableStringBuilder.setSpan(strikethroughSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @d5.d
    public static final SpannableStringBuilder j(@d5.d SpannableStringBuilder spannableStringBuilder, @d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(builderAction, "builderAction");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        int length = spannableStringBuilder.length();
        builderAction.N(spannableStringBuilder);
        spannableStringBuilder.setSpan(subscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @d5.d
    public static final SpannableStringBuilder k(@d5.d SpannableStringBuilder spannableStringBuilder, @d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(builderAction, "builderAction");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        int length = spannableStringBuilder.length();
        builderAction.N(spannableStringBuilder);
        spannableStringBuilder.setSpan(superscriptSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    @d5.d
    public static final SpannableStringBuilder l(@d5.d SpannableStringBuilder spannableStringBuilder, @d5.d q3.l<? super SpannableStringBuilder, m2> builderAction) {
        l0.p(spannableStringBuilder, "<this>");
        l0.p(builderAction, "builderAction");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        int length = spannableStringBuilder.length();
        builderAction.N(spannableStringBuilder);
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
