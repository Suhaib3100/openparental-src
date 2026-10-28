package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: LayoutCompat.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0007Y\u0005\b\n\f\u000e\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00109\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b8\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b<\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u0014\u0010C\u001a\u00020@8\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020@8\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010BR\u0014\u0010H\u001a\u00020E8\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010\u0006R\u0014\u0010K\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0006R\u0014\u0010M\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bL\u0010\u0006R\u0014\u0010O\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010\u0006R\u0014\u0010Q\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bP\u0010\u0006R\u0014\u0010S\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010\u0006R\u0014\u0010U\u001a\u00020E8\u0000X\u0080T¢\u0006\u0006\n\u0004\bT\u0010GR\u001a\u0010[\u001a\u00020V8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010`\u001a\u00020\\8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b\u0005\u0010_¨\u0006a"}, d2 = {"Landroidx/compose/ui/text/android/k;", "", "<init>", "()V", "", "b", "I", "ALIGN_NORMAL", "c", "ALIGN_OPPOSITE", "d", "ALIGN_CENTER", "e", "ALIGN_LEFT", "f", "ALIGN_RIGHT", "g", "JUSTIFICATION_MODE_NONE", "h", "JUSTIFICATION_MODE_INTER_WORD", "i", "HYPHENATION_FREQUENCY_NONE", "j", "HYPHENATION_FREQUENCY_NORMAL", "k", "HYPHENATION_FREQUENCY_NORMAL_FAST", "l", "HYPHENATION_FREQUENCY_FULL", "m", "HYPHENATION_FREQUENCY_FULL_FAST", "n", "BREAK_STRATEGY_SIMPLE", "o", "BREAK_STRATEGY_HIGH_QUALITY", "p", "BREAK_STRATEGY_BALANCED", "q", "LINE_BREAK_STYLE_NONE", "r", "LINE_BREAK_STYLE_LOOSE", "s", "LINE_BREAK_STYLE_NORMAL", "t", "LINE_BREAK_STYLE_STRICT", "u", "LINE_BREAK_WORD_STYLE_NONE", "v", "LINE_BREAK_WORD_STYLE_PHRASE", "w", "TEXT_DIRECTION_LTR", "x", "TEXT_DIRECTION_RTL", "y", "TEXT_DIRECTION_FIRST_STRONG_LTR", "z", "TEXT_DIRECTION_FIRST_STRONG_RTL", "A", "TEXT_DIRECTION_ANY_RTL_LTR", "B", "TEXT_DIRECTION_LOCALE", "C", "DEFAULT_ALIGNMENT", "D", "DEFAULT_TEXT_DIRECTION", "", "E", "F", "DEFAULT_LINESPACING_MULTIPLIER", "DEFAULT_LINESPACING_EXTRA", "", "G", "Z", "DEFAULT_INCLUDE_PADDING", "H", "DEFAULT_MAX_LINES", "DEFAULT_BREAK_STRATEGY", "J", "DEFAULT_LINE_BREAK_STYLE", "K", "DEFAULT_LINE_BREAK_WORD_STYLE", "L", "DEFAULT_HYPHENATION_FREQUENCY", "M", "DEFAULT_JUSTIFICATION_MODE", "N", "DEFAULT_FALLBACK_LINE_SPACING", "Landroid/text/Layout$Alignment;", "O", "Landroid/text/Layout$Alignment;", "a", "()Landroid/text/Layout$Alignment;", "DEFAULT_LAYOUT_ALIGNMENT", "Landroid/text/TextDirectionHeuristic;", "P", "Landroid/text/TextDirectionHeuristic;", "()Landroid/text/TextDirectionHeuristic;", "DEFAULT_TEXT_DIRECTION_HEURISTIC", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: A, reason: from kotlin metadata */
    public static final int TEXT_DIRECTION_ANY_RTL_LTR = 4;

    /* renamed from: B, reason: from kotlin metadata */
    public static final int TEXT_DIRECTION_LOCALE = 5;

    /* renamed from: C, reason: from kotlin metadata */
    public static final int DEFAULT_ALIGNMENT = 0;

    /* renamed from: D, reason: from kotlin metadata */
    public static final int DEFAULT_TEXT_DIRECTION = 2;

    /* renamed from: E, reason: from kotlin metadata */
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;

    /* renamed from: F, reason: from kotlin metadata */
    public static final float DEFAULT_LINESPACING_EXTRA = 0.0f;

    /* renamed from: G, reason: from kotlin metadata */
    public static final boolean DEFAULT_INCLUDE_PADDING = false;

    /* renamed from: H, reason: from kotlin metadata */
    public static final int DEFAULT_MAX_LINES = Integer.MAX_VALUE;

    /* renamed from: I, reason: from kotlin metadata */
    public static final int DEFAULT_BREAK_STRATEGY = 0;

    /* renamed from: J, reason: from kotlin metadata */
    public static final int DEFAULT_LINE_BREAK_STYLE = 0;

    /* renamed from: K, reason: from kotlin metadata */
    public static final int DEFAULT_LINE_BREAK_WORD_STYLE = 0;

    /* renamed from: L, reason: from kotlin metadata */
    public static final int DEFAULT_HYPHENATION_FREQUENCY = 0;

    /* renamed from: M, reason: from kotlin metadata */
    public static final int DEFAULT_JUSTIFICATION_MODE = 0;

    /* renamed from: N, reason: from kotlin metadata */
    public static final boolean DEFAULT_FALLBACK_LINE_SPACING = true;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int ALIGN_NORMAL = 0;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int ALIGN_OPPOSITE = 1;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final int ALIGN_CENTER = 2;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final int ALIGN_LEFT = 3;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final int ALIGN_RIGHT = 4;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final int JUSTIFICATION_MODE_NONE = 0;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_NONE = 0;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_NORMAL_FAST = 3;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_FULL = 2;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final int HYPHENATION_FREQUENCY_FULL_FAST = 4;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final int BREAK_STRATEGY_SIMPLE = 0;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final int BREAK_STRATEGY_BALANCED = 2;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_STYLE_NONE = 0;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_STYLE_LOOSE = 1;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_STYLE_NORMAL = 2;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_STYLE_STRICT = 3;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_WORD_STYLE_NONE = 0;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final int LINE_BREAK_WORD_STYLE_PHRASE = 1;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final int TEXT_DIRECTION_LTR = 0;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final int TEXT_DIRECTION_RTL = 1;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 2;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 3;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k f20511a = new k();

    /* renamed from: O, reason: from kotlin metadata */
    @fg.l
    private static final Layout.Alignment DEFAULT_LAYOUT_ALIGNMENT = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: P, reason: from kotlin metadata */
    @fg.l
    private static final TextDirectionHeuristic DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    public static final int Q = 8;

    /* compiled from: LayoutCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/k$a;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: LayoutCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/k$b;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: LayoutCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/k$c;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: LayoutCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/k$d;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* compiled from: LayoutCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/k$e;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* compiled from: LayoutCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/k$f;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    /* compiled from: LayoutCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/android/k$g;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    private k() {
    }

    @fg.l
    public final Layout.Alignment a() {
        return DEFAULT_LAYOUT_ALIGNMENT;
    }

    @fg.l
    public final TextDirectionHeuristic b() {
        return DEFAULT_TEXT_DIRECTION_HEURISTIC;
    }
}
