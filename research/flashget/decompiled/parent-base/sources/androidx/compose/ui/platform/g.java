package androidx.compose.ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidClipboardManager.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u001a\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\n\"\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\n\"\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\n\"\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\n\"\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\n\"\u0014\u0010\u0017\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\n\"\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\n\"\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\n\"\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\n\"\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\n\"\u0014\u0010!\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\n\"\u0014\u0010#\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\n\"\u0014\u0010%\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\n\"\u0014\u0010'\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\n\"\u0014\u0010)\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\n\"\u0014\u0010+\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\n\"\u0014\u0010-\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\n\"\u0014\u0010/\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\n\"\u0014\u00101\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\n\"\u0014\u00103\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\n\"\u0014\u00107\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106\"\u0014\u00109\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00106\"\u0014\u0010;\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u00106\"\u0014\u0010=\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00106\"\u0014\u0010?\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u00106\"\u0014\u0010@\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u00106\"\u0014\u0010B\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u00106\"\u0014\u0010D\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u00106\"\u0014\u0010F\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u00106\"\u0014\u0010H\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u00106\"\u0014\u0010J\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u00106\"\u0014\u0010L\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u00106\"\u0014\u0010M\u001a\u0002048\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00106¨\u0006N"}, d2 = {"", "Landroidx/compose/ui/text/e;", "a", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/e;", "b", "(Landroidx/compose/ui/text/e;)Ljava/lang/CharSequence;", "", "Ljava/lang/String;", "PLAIN_TEXT_LABEL", "", "B", "UNIT_TYPE_UNSPECIFIED", "c", "UNIT_TYPE_SP", "d", "UNIT_TYPE_EM", "e", "FONT_STYLE_NORMAL", "f", "FONT_STYLE_ITALIC", "g", "FONT_SYNTHESIS_NONE", "h", "FONT_SYNTHESIS_ALL", "i", "FONT_SYNTHESIS_WEIGHT", "j", "FONT_SYNTHESIS_STYLE", "k", "COLOR_ID", "l", "FONT_SIZE_ID", "m", "FONT_WEIGHT_ID", "n", "FONT_STYLE_ID", "o", "FONT_SYNTHESIS_ID", "p", "FONT_FEATURE_SETTINGS_ID", "q", "LETTER_SPACING_ID", "r", "BASELINE_SHIFT_ID", "s", "TEXT_GEOMETRIC_TRANSFORM_ID", "t", "BACKGROUND_ID", "u", "TEXT_DECORATION_ID", "v", "SHADOW_ID", "", "w", "I", "BYTE_SIZE", "x", "INT_SIZE", "y", "FLOAT_SIZE", "z", "LONG_SIZE", "A", "COLOR_SIZE", "TEXT_UNIT_SIZE", "C", "FONT_WEIGHT_SIZE", "D", "FONT_STYLE_SIZE", "E", "FONT_SYNTHESIS_SIZE", "F", "BASELINE_SHIFT_SIZE", "G", "TEXT_GEOMETRIC_TRANSFORM_SIZE", "H", "TEXT_DECORATION_SIZE", "SHADOW_SIZE", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,551:1\n33#2,6:552\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n*L\n110#1:552,6\n*E\n"})
/* loaded from: classes.dex */
public final class g {
    private static final int A = 8;
    private static final int B = 5;
    private static final int C = 4;
    private static final int D = 1;
    private static final int E = 1;
    private static final int F = 4;
    private static final int G = 8;
    private static final int H = 4;
    private static final int I = 20;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final String f19847a = "plain text";

    /* renamed from: b, reason: collision with root package name */
    private static final byte f19848b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final byte f19849c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final byte f19850d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f19851e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final byte f19852f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f19853g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static final byte f19854h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final byte f19855i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final byte f19856j = 3;

    /* renamed from: k, reason: collision with root package name */
    private static final byte f19857k = 1;

    /* renamed from: l, reason: collision with root package name */
    private static final byte f19858l = 2;

    /* renamed from: m, reason: collision with root package name */
    private static final byte f19859m = 3;

    /* renamed from: n, reason: collision with root package name */
    private static final byte f19860n = 4;

    /* renamed from: o, reason: collision with root package name */
    private static final byte f19861o = 5;

    /* renamed from: p, reason: collision with root package name */
    private static final byte f19862p = 6;

    /* renamed from: q, reason: collision with root package name */
    private static final byte f19863q = 7;

    /* renamed from: r, reason: collision with root package name */
    private static final byte f19864r = 8;

    /* renamed from: s, reason: collision with root package name */
    private static final byte f19865s = 9;

    /* renamed from: t, reason: collision with root package name */
    private static final byte f19866t = 10;

    /* renamed from: u, reason: collision with root package name */
    private static final byte f19867u = 11;

    /* renamed from: v, reason: collision with root package name */
    private static final byte f19868v = 12;

    /* renamed from: w, reason: collision with root package name */
    private static final int f19869w = 1;

    /* renamed from: x, reason: collision with root package name */
    private static final int f19870x = 4;

    /* renamed from: y, reason: collision with root package name */
    private static final int f19871y = 4;

    /* renamed from: z, reason: collision with root package name */
    private static final int f19872z = 8;

    @fg.m
    public static final androidx.compose.ui.text.e a(@fg.m CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new androidx.compose.ui.text.e(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i4 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int we2 = kotlin.collections.l.we(annotationArr);
        if (we2 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i4];
                if (kotlin.jvm.internal.l0.g(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new e.b(new j1(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i4 == we2) {
                    break;
                }
                i4++;
            }
        }
        return new androidx.compose.ui.text.e(charSequence.toString(), arrayList, null, 4, null);
    }

    @fg.l
    public static final CharSequence b(@fg.l androidx.compose.ui.text.e eVar) {
        if (eVar.i().isEmpty()) {
            return eVar.getText();
        }
        SpannableString spannableString = new SpannableString(eVar.getText());
        r1 r1Var = new r1();
        List<e.b<androidx.compose.ui.text.i0>> i4 = eVar.i();
        int size = i4.size();
        for (int i5 = 0; i5 < size; i5++) {
            e.b<androidx.compose.ui.text.i0> bVar = i4.get(i5);
            androidx.compose.ui.text.i0 a5 = bVar.a();
            int start = bVar.getStart();
            int end = bVar.getEnd();
            r1Var.q();
            r1Var.e(a5);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", r1Var.p()), start, end, 33);
        }
        return spannableString;
    }
}
