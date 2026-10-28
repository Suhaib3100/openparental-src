package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;

/* compiled from: Typography.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b-\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0002R\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0002R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b*\u0010\u0002R\u0016\u0010+\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b,\u0010\u0002R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lkotlin/text/Typography;", "", "()V", "almostEqual", "", "amp", "bullet", "cent", "copyright", "dagger", "degree", "dollar", "doubleDagger", "doublePrime", "ellipsis", "euro", "greater", "greaterOrEqual", "half", "leftDoubleQuote", "leftGuillemet", "getLeftGuillemet$annotations", "leftGuillemete", "getLeftGuillemete$annotations", "leftSingleQuote", "less", "lessOrEqual", "lowDoubleQuote", "lowSingleQuote", "mdash", "middleDot", "nbsp", "ndash", "notEqual", "paragraph", "plusMinus", "pound", "prime", "quote", "registered", "rightDoubleQuote", "rightGuillemet", "getRightGuillemet$annotations", "rightGuillemete", "getRightGuillemete$annotations", "rightSingleQuote", "section", "times", "tm", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.m0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class Typography {
    public static final char A = 8221;
    public static final char B = 8222;
    public static final char C = 8224;
    public static final char D = 8225;
    public static final char E = 8226;
    public static final char F = 8230;
    public static final char G = 8242;
    public static final char H = 8243;
    public static final char I = 8364;
    public static final char J = 8482;
    public static final char K = 8776;
    public static final char L = 8800;
    public static final char M = 8804;
    public static final char N = 8805;
    public static final char O = 171;
    public static final char P = 187;

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final Typography f27125a = new Typography();

    /* renamed from: b, reason: collision with root package name */
    public static final char f27126b = '\"';

    /* renamed from: c, reason: collision with root package name */
    public static final char f27127c = '$';

    /* renamed from: d, reason: collision with root package name */
    public static final char f27128d = '&';

    /* renamed from: e, reason: collision with root package name */
    public static final char f27129e = '<';

    /* renamed from: f, reason: collision with root package name */
    public static final char f27130f = '>';

    /* renamed from: g, reason: collision with root package name */
    public static final char f27131g = 160;

    /* renamed from: h, reason: collision with root package name */
    public static final char f27132h = 215;

    /* renamed from: i, reason: collision with root package name */
    public static final char f27133i = 162;

    /* renamed from: j, reason: collision with root package name */
    public static final char f27134j = 163;

    /* renamed from: k, reason: collision with root package name */
    public static final char f27135k = 167;

    /* renamed from: l, reason: collision with root package name */
    public static final char f27136l = 169;

    /* renamed from: m, reason: collision with root package name */
    public static final char f27137m = 171;

    /* renamed from: n, reason: collision with root package name */
    public static final char f27138n = 187;

    /* renamed from: o, reason: collision with root package name */
    public static final char f27139o = 174;

    /* renamed from: p, reason: collision with root package name */
    public static final char f27140p = 176;

    /* renamed from: q, reason: collision with root package name */
    public static final char f27141q = 177;

    /* renamed from: r, reason: collision with root package name */
    public static final char f27142r = 182;

    /* renamed from: s, reason: collision with root package name */
    public static final char f27143s = 183;

    /* renamed from: t, reason: collision with root package name */
    public static final char f27144t = 189;

    /* renamed from: u, reason: collision with root package name */
    public static final char f27145u = 8211;

    /* renamed from: v, reason: collision with root package name */
    public static final char f27146v = 8212;

    /* renamed from: w, reason: collision with root package name */
    public static final char f27147w = 8216;

    /* renamed from: x, reason: collision with root package name */
    public static final char f27148x = 8217;

    /* renamed from: y, reason: collision with root package name */
    public static final char f27149y = 8218;

    /* renamed from: z, reason: collision with root package name */
    public static final char f27150z = 8220;

    private Typography() {
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void a() {
    }

    @Deprecated(message = "This constant has a typo in the name. Use leftGuillemet instead.", replaceWith = @ReplaceWith(expression = "Typography.leftGuillemet", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.6")
    public static /* synthetic */ void b() {
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void c() {
    }

    @Deprecated(message = "This constant has a typo in the name. Use rightGuillemet instead.", replaceWith = @ReplaceWith(expression = "Typography.rightGuillemet", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.6")
    public static /* synthetic */ void d() {
    }
}
