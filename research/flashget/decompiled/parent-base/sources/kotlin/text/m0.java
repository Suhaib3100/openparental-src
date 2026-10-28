package kotlin.text;

import kotlin.Metadata;
import kotlin.c1;
import kotlin.x0;

/* compiled from: Typography.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\bT\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u001a\u0010\u001e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001d\u0010\u0003R\u001a\u0010 \u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b\b\u0010\u0003R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00108\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b7\u0010\u0006R\u0014\u0010:\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u0010\u0006R\u0014\u0010<\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b@\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010\u0006R\u0014\u0010E\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010\u0006R\u0014\u0010G\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010\u0006R\u0014\u0010I\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010\u0006R\u0014\u0010K\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010\u0006R\u0014\u0010M\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010\u0006R\u0014\u0010O\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010\u0006R\u0014\u0010Q\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010\u0006R\u0014\u0010S\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010\u0006R\u001a\u0010U\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\bT\u0010\u0006\u0012\u0004\b\u0005\u0010\u0003R\u001a\u0010W\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\bV\u0010\u0006\u0012\u0004\b\n\u0010\u0003¨\u0006X"}, d2 = {"Lkotlin/text/m0;", "", "<init>", "()V", "", "b", "C", "quote", "c", "dollar", "d", "amp", "e", "less", "f", "greater", "g", "nbsp", "h", "times", "i", "cent", "j", "pound", "k", "section", "l", "copyright", "m", "a", "leftGuillemet", "n", "rightGuillemet", "o", "registered", "p", "degree", "q", "plusMinus", "r", "paragraph", "s", "middleDot", "t", "half", "u", "ndash", "v", "mdash", "w", "leftSingleQuote", "x", "rightSingleQuote", "y", "lowSingleQuote", "z", "leftDoubleQuote", "A", "rightDoubleQuote", "B", "lowDoubleQuote", "dagger", "D", "doubleDagger", "E", "bullet", "F", "ellipsis", "G", "prime", "H", "doublePrime", "I", "euro", "J", "tm", "K", "almostEqual", "L", "notEqual", "M", "lessOrEqual", "N", "greaterOrEqual", "O", "leftGuillemete", "P", "rightGuillemete", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: A, reason: from kotlin metadata */
    public static final char rightDoubleQuote = 8221;

    /* renamed from: B, reason: from kotlin metadata */
    public static final char lowDoubleQuote = 8222;

    /* renamed from: C, reason: from kotlin metadata */
    public static final char dagger = 8224;

    /* renamed from: D, reason: from kotlin metadata */
    public static final char doubleDagger = 8225;

    /* renamed from: E, reason: from kotlin metadata */
    public static final char bullet = 8226;

    /* renamed from: F, reason: from kotlin metadata */
    public static final char ellipsis = 8230;

    /* renamed from: G, reason: from kotlin metadata */
    public static final char prime = 8242;

    /* renamed from: H, reason: from kotlin metadata */
    public static final char doublePrime = 8243;

    /* renamed from: I, reason: from kotlin metadata */
    public static final char euro = 8364;

    /* renamed from: J, reason: from kotlin metadata */
    public static final char tm = 8482;

    /* renamed from: K, reason: from kotlin metadata */
    public static final char almostEqual = 8776;

    /* renamed from: L, reason: from kotlin metadata */
    public static final char notEqual = 8800;

    /* renamed from: M, reason: from kotlin metadata */
    public static final char lessOrEqual = 8804;

    /* renamed from: N, reason: from kotlin metadata */
    public static final char greaterOrEqual = 8805;

    /* renamed from: O, reason: from kotlin metadata */
    public static final char leftGuillemete = 171;

    /* renamed from: P, reason: from kotlin metadata */
    public static final char rightGuillemete = 187;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final m0 f79138a = new m0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final char quote = '\"';

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final char dollar = '$';

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final char amp = '&';

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final char less = '<';

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final char greater = '>';

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final char nbsp = 160;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final char times = 215;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final char cent = 162;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final char pound = 163;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final char section = 167;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final char copyright = 169;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final char leftGuillemet = 171;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final char rightGuillemet = 187;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final char registered = 174;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final char degree = 176;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final char plusMinus = 177;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final char paragraph = 182;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final char middleDot = 183;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final char half = 189;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final char ndash = 8211;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final char mdash = 8212;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final char leftSingleQuote = 8216;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final char rightSingleQuote = 8217;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final char lowSingleQuote = 8218;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final char leftDoubleQuote = 8220;

    private m0() {
    }

    @c1(version = "1.6")
    public static /* synthetic */ void a() {
    }

    @kotlin.k(message = "This constant has a typo in the name. Use leftGuillemet instead.", replaceWith = @x0(expression = "Typography.leftGuillemet", imports = {}))
    @kotlin.l(warningSince = "1.6")
    public static /* synthetic */ void b() {
    }

    @c1(version = "1.6")
    public static /* synthetic */ void c() {
    }

    @kotlin.k(message = "This constant has a typo in the name. Use rightGuillemet instead.", replaceWith = @x0(expression = "Typography.rightGuillemet", imports = {}))
    @kotlin.l(warningSince = "1.6")
    public static /* synthetic */ void d() {
    }
}
