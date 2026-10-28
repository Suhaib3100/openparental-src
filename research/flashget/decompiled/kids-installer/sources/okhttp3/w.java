package okhttp3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.Typography;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: HttpUrl.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\"\n\u0002\b0\u0018\u0000 L2\u00020\u0001:\u00023#Bc\b\u0000\u0012\u0006\u0010:\u001a\u00020\b\u0012\u0006\u0010<\u001a\u00020\b\u0012\u0006\u0010>\u001a\u00020\b\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010B\u001a\u00020\r\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0010\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000b\u0012\b\u0010H\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010I\u001a\u00020\b¢\u0006\u0004\b^\u0010_J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\bJ\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u0004\u0018\u00010\bJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0007¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010 J\u000f\u0010$\u001a\u00020\bH\u0007¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010 J\u000f\u0010&\u001a\u00020\rH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0007¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\bH\u0007¢\u0006\u0004\b)\u0010 J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0007¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0007¢\u0006\u0004\b,\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b-\u0010 J\u0011\u0010.\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u00020\rH\u0007¢\u0006\u0004\b/\u0010'J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\b00H\u0007¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b3\u0010 J\u0011\u00104\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b4\u0010 R\u0017\u00107\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b5\u00106R\u0017\u0010:\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\b9\u0010 R\u0017\u0010<\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\b;\u0010 R\u0017\u0010>\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\b=\u0010 R\u0017\u0010@\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b?\u0010 R\u0017\u0010B\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\bA\u0010'R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0007¢\u0006\f\n\u0004\b4\u0010C\u001a\u0004\bD\u0010+R\u001e\u0010F\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010CR\u0019\u0010H\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b$\u00108\u001a\u0004\bG\u0010 R\u0014\u0010I\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00108R\u0011\u0010K\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\bJ\u0010 R\u0011\u0010M\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\bL\u0010 R\u0011\u0010O\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bN\u0010'R\u0011\u0010Q\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\bP\u0010 R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8G¢\u0006\u0006\u001a\u0004\bR\u0010+R\u0013\u0010U\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\bT\u0010 R\u0013\u0010W\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\bV\u0010 R\u0011\u0010Y\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bX\u0010'R\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\b008G¢\u0006\u0006\u001a\u0004\bZ\u00102R\u0013\u0010]\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\\\u0010 ¨\u0006`"}, d2 = {"Lokhttp3/w;", "", "Ljava/net/URL;", "a0", "()Ljava/net/URL;", "Ljava/net/URI;", "Z", "()Ljava/net/URI;", "", "name", "P", "", "T", "", "index", "Q", "S", "V", "link", "W", "Lokhttp3/w$a;", "H", "I", "other", "", "equals", "hashCode", "toString", "Y", "r", "q", "p", "()Ljava/lang/String;", "f", "s", "b", "i", "h", "l", "()I", "k", "c", "d", "()Ljava/util/List;", "j", "e", "m", "o", "", "n", "()Ljava/util/Set;", "a", "g", "G", "()Z", "isHttps", "Ljava/lang/String;", "X", "scheme", "b0", "username", "K", "password", "F", "host", "N", "port", "Ljava/util/List;", "L", "pathSegments", "queryNamesAndValues", "B", "fragment", "url", "A", "encodedUsername", "w", "encodedPassword", "M", "pathSize", "x", "encodedPath", "y", "encodedPathSegments", "z", "encodedQuery", "O", "query", "U", "querySize", "R", "queryParameterNames", "v", "encodedFragment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isHttps;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String scheme;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String username;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String password;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String host;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int port;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<String> pathSegments;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<String> queryNamesAndValues;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final String fragment;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    public static final String f31540p = ProtectedSandApp.s("枎");

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    public static final String f31541q = ProtectedSandApp.s("枏");

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    public static final String f31542r = ProtectedSandApp.s("析");

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    public static final String f31543s = ProtectedSandApp.s("枑");

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    public static final String f31544t = ProtectedSandApp.s("枒");

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    public static final String f31545u = "";

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    public static final String f31546v = ProtectedSandApp.s("枓");

    /* renamed from: l, reason: collision with root package name */
    @d5.d
    public static final String f31536l = ProtectedSandApp.s("枔");

    /* renamed from: m, reason: collision with root package name */
    @d5.d
    public static final String f31537m = ProtectedSandApp.s("枕");

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    public static final String f31538n = ProtectedSandApp.s("枖");

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    public static final String f31539o = ProtectedSandApp.s("林");

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: k, reason: collision with root package name */
    private static final char[] f31535k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\f\u0018\u0000 B2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\bd\u0010eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002J \u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J0\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0002J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004J\u0016\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0004J\u0016\u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0002J\u000e\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0004J\u0010\u00102\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0004J\u0010\u00104\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u0004J\u0018\u00107\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004J\u0018\u0010:\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\u0004J\u0018\u0010;\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0004J\u0018\u0010<\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00042\b\u00109\u001a\u0004\u0018\u00010\u0004J\u000e\u0010=\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0004J\u000e\u0010>\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0004J\u0010\u0010@\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010\u0004J\u0010\u0010B\u001a\u00020\u00002\b\u0010A\u001a\u0004\u0018\u00010\u0004J\u000f\u0010C\u001a\u00020\u0000H\u0000¢\u0006\u0004\bC\u0010DJ\u0006\u0010F\u001a\u00020EJ\b\u0010G\u001a\u00020\u0004H\u0016J!\u0010I\u001a\u00020\u00002\b\u0010H\u001a\u0004\u0018\u00010E2\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\bI\u0010JR$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010\u001a\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010K\u001a\u0004\bP\u0010M\"\u0004\bQ\u0010OR\"\u0010\u001e\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR$\u0010 \u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010K\u001a\u0004\bT\u0010M\"\u0004\bU\u0010OR\"\u0010\"\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010>\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010[\u001a\u0004\b\\\u0010]R,\u0010a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u0010[\u001a\u0004\b^\u0010]\"\u0004\b_\u0010`R$\u0010A\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010K\u001a\u0004\bb\u0010M\"\u0004\bc\u0010O¨\u0006f"}, d2 = {"Lokhttp3/w$a;", "", "", "i", "", "pathSegments", "", "alreadyEncoded", "f", "canonicalName", "Lkotlin/m2;", "H", "input", "startPos", "limit", "L", "pos", "addTrailingSlash", "E", "y", "z", "C", "scheme", "M", "username", "Y", "encodedUsername", "n", "password", "B", "encodedPassword", "k", "host", "x", "port", "D", "pathSegment", "d", "e", "encodedPathSegment", "a", "encodedPathSegments", "b", "index", "U", "P", "K", "encodedPath", "l", "query", "F", "encodedQuery", "m", "name", "value", "g", "encodedName", "encodedValue", "c", "W", "R", "J", "I", "fragment", "o", "encodedFragment", "j", "G", "()Lokhttp3/w$a;", "Lokhttp3/w;", "h", "toString", "base", "A", "(Lokhttp3/w;Ljava/lang/String;)Lokhttp3/w$a;", "Ljava/lang/String;", "w", "()Ljava/lang/String;", "X", "(Ljava/lang/String;)V", "t", "S", "q", "O", "u", "T", "v", "()I", "V", "(I)V", "", "Ljava/util/List;", "r", "()Ljava/util/List;", "s", "Q", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "p", "N", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        @d5.d
        public static final String f31558i = ProtectedSandApp.s("朡");

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private String scheme;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private String host;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final List<String> encodedPathSegments;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private List<String> encodedQueryNamesAndValues;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private String encodedFragment;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private String encodedUsername = "";

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private String encodedPassword = "";

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int port = -1;

        /* compiled from: HttpUrl.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/w$a$a;", "", "", "input", "", "pos", "limit", "g", "h", "f", "e", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.w$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String input, int pos, int limit) {
                try {
                    int parseInt = Integer.parseInt(Companion.f(w.INSTANCE, input, pos, limit, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int f(String input, int pos, int limit) {
                while (pos < limit) {
                    char charAt = input.charAt(pos);
                    if (charAt == ':') {
                        return pos;
                    }
                    if (charAt == '[') {
                        do {
                            pos++;
                            if (pos < limit) {
                            }
                        } while (input.charAt(pos) != ']');
                    }
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int g(String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char charAt = input.charAt(pos);
                if ((kotlin.jvm.internal.l0.t(charAt, 97) < 0 || kotlin.jvm.internal.l0.t(charAt, 122) > 0) && (kotlin.jvm.internal.l0.t(charAt, 65) < 0 || kotlin.jvm.internal.l0.t(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    pos++;
                    if (pos >= limit) {
                        return -1;
                    }
                    char charAt2 = input.charAt(pos);
                    if ('a' > charAt2 || 'z' < charAt2) {
                        if ('A' > charAt2 || 'Z' < charAt2) {
                            if ('0' > charAt2 || '9' < charAt2) {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return pos;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int h(String str, int i5, int i6) {
                int i7 = 0;
                while (i5 < i6) {
                    char charAt = str.charAt(i5);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i7++;
                    i5++;
                }
                return i7;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final void C() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add("");
            } else {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void E(String str, int i5, int i6, boolean z5, boolean z6) {
            String f6 = Companion.f(w.INSTANCE, str, i5, i6, ProtectedSandApp.s("朢"), z6, false, false, false, null, 240, null);
            if (y(f6)) {
                return;
            }
            if (z(f6)) {
                C();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, f6);
            } else {
                this.encodedPathSegments.add(f6);
            }
            if (z5) {
                this.encodedPathSegments.add("");
            }
        }

        private final void H(String str) {
            IntProgression k02;
            IntProgression B1;
            List<String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.l0.m(list);
            k02 = kotlin.ranges.u.k0(list.size() - 2, 0);
            B1 = kotlin.ranges.u.B1(k02, 2);
            int f23724o = B1.getF23724o();
            int f23725p = B1.getF23725p();
            int f23726q = B1.getF23726q();
            if (f23726q >= 0) {
                if (f23724o > f23725p) {
                    return;
                }
            } else if (f23724o < f23725p) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                kotlin.jvm.internal.l0.m(list2);
                if (kotlin.jvm.internal.l0.g(str, list2.get(f23724o))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.l0.m(list3);
                    list3.remove(f23724o + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.l0.m(list4);
                    list4.remove(f23724o);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.l0.m(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (f23724o == f23725p) {
                    return;
                } else {
                    f23724o += f23726q;
                }
            }
        }

        private final void L(String str, int i5, int i6) {
            if (i5 == i6) {
                return;
            }
            char charAt = str.charAt(i5);
            if (charAt == '/' || charAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i5++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i7 = i5;
                if (i7 >= i6) {
                    return;
                }
                i5 = okhttp3.internal.d.q(str, ProtectedSandApp.s("朣"), i7, i6);
                boolean z5 = i5 < i6;
                E(str, i7, i5, z5, true);
                if (z5) {
                    i5++;
                }
            }
        }

        private final a f(String pathSegments, boolean alreadyEncoded) {
            int i5 = 0;
            do {
                int q5 = okhttp3.internal.d.q(pathSegments, ProtectedSandApp.s("朤"), i5, pathSegments.length());
                E(pathSegments, i5, q5, q5 < pathSegments.length(), alreadyEncoded);
                i5 = q5 + 1;
            } while (i5 <= pathSegments.length());
            return this;
        }

        private final int i() {
            int i5 = this.port;
            if (i5 != -1) {
                return i5;
            }
            Companion companion = w.INSTANCE;
            String str = this.scheme;
            kotlin.jvm.internal.l0.m(str);
            return companion.g(str);
        }

        private final boolean y(String input) {
            boolean K1;
            if (kotlin.jvm.internal.l0.g(input, ProtectedSandApp.s("朥"))) {
                return true;
            }
            K1 = kotlin.text.e0.K1(input, ProtectedSandApp.s("朦"), true);
            return K1;
        }

        private final boolean z(String input) {
            boolean K1;
            boolean K12;
            boolean K13;
            if (kotlin.jvm.internal.l0.g(input, ProtectedSandApp.s("朧"))) {
                return true;
            }
            K1 = kotlin.text.e0.K1(input, ProtectedSandApp.s("木"), true);
            if (K1) {
                return true;
            }
            K12 = kotlin.text.e0.K1(input, ProtectedSandApp.s("朩"), true);
            if (K12) {
                return true;
            }
            K13 = kotlin.text.e0.K1(input, ProtectedSandApp.s("未"), true);
            return K13;
        }

        @d5.d
        public final a A(@d5.e w base, @d5.d String input) {
            int q5;
            int i5;
            int i6;
            boolean z5;
            int i7;
            boolean z6;
            boolean z7;
            boolean p22;
            boolean p23;
            kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("末"));
            int D = okhttp3.internal.d.D(input, 0, 0, 3, null);
            int F = okhttp3.internal.d.F(input, D, 0, 2, null);
            Companion companion = INSTANCE;
            int g5 = companion.g(input, D, F);
            String s5 = ProtectedSandApp.s("本");
            boolean z8 = true;
            char c6 = 65535;
            if (g5 != -1) {
                p22 = kotlin.text.e0.p2(input, ProtectedSandApp.s("札"), D, true);
                if (p22) {
                    this.scheme = ProtectedSandApp.s("朮");
                    D += 6;
                } else {
                    p23 = kotlin.text.e0.p2(input, ProtectedSandApp.s("术"), D, true);
                    if (!p23) {
                        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("朱"));
                        String substring = input.substring(0, g5);
                        kotlin.jvm.internal.l0.o(substring, s5);
                        sb.append(substring);
                        sb.append(ProtectedSandApp.s("朲"));
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = ProtectedSandApp.s("朰");
                    D += 5;
                }
            } else {
                if (base == null) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("朼"));
                }
                this.scheme = base.getScheme();
            }
            int h5 = companion.h(input, D, F);
            char c7 = '?';
            char c8 = '#';
            if (h5 >= 2 || base == null || (!kotlin.jvm.internal.l0.g(base.getScheme(), this.scheme))) {
                boolean z9 = false;
                boolean z10 = false;
                int i8 = D + h5;
                while (true) {
                    q5 = okhttp3.internal.d.q(input, ProtectedSandApp.s("朳"), i8, F);
                    char charAt = q5 != F ? input.charAt(q5) : c6;
                    if (charAt == c6 || charAt == c8 || charAt == '/' || charAt == '\\' || charAt == c7) {
                        break;
                    }
                    if (charAt != '@') {
                        z5 = z8;
                        i7 = F;
                    } else {
                        String s6 = ProtectedSandApp.s("朴");
                        if (z9) {
                            i6 = q5;
                            z5 = z8;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append(s6);
                            i7 = F;
                            sb2.append(Companion.f(w.INSTANCE, input, i8, i6, ProtectedSandApp.s("朷"), true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                            z6 = z10;
                        } else {
                            int p5 = okhttp3.internal.d.p(input, ':', i8, q5);
                            Companion companion2 = w.INSTANCE;
                            z5 = z8;
                            String f6 = Companion.f(companion2, input, i8, p5, ProtectedSandApp.s("朵"), true, false, false, false, null, 240, null);
                            if (z10) {
                                f6 = androidx.fragment.app.e0.a(new StringBuilder(), this.encodedUsername, s6, f6);
                            }
                            this.encodedUsername = f6;
                            if (p5 != q5) {
                                i6 = q5;
                                this.encodedPassword = Companion.f(companion2, input, p5 + 1, q5, ProtectedSandApp.s("朶"), true, false, false, false, null, 240, null);
                                z7 = z5;
                            } else {
                                i6 = q5;
                                z7 = z9;
                            }
                            z9 = z7;
                            i7 = F;
                            z6 = z5;
                        }
                        i8 = i6 + 1;
                        z10 = z6;
                    }
                    c8 = '#';
                    c7 = '?';
                    c6 = 65535;
                    F = i7;
                    z8 = z5;
                }
                boolean z11 = z8;
                i5 = F;
                Companion companion3 = INSTANCE;
                int f7 = companion3.f(input, i8, q5);
                int i9 = f7 + 1;
                if (i9 < q5) {
                    this.host = okhttp3.internal.a.e(Companion.n(w.INSTANCE, input, i8, f7, false, 4, null));
                    int e6 = companion3.e(input, i9, q5);
                    this.port = e6;
                    if (!(e6 != -1 ? z11 : false)) {
                        StringBuilder sb3 = new StringBuilder(ProtectedSandApp.s("朸"));
                        String substring2 = input.substring(i9, q5);
                        kotlin.jvm.internal.l0.o(substring2, s5);
                        sb3.append(substring2);
                        sb3.append(Typography.f27126b);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = w.INSTANCE;
                    this.host = okhttp3.internal.a.e(Companion.n(companion4, input, i8, f7, false, 4, null));
                    String str = this.scheme;
                    kotlin.jvm.internal.l0.m(str);
                    this.port = companion4.g(str);
                }
                if (!(this.host != null ? z11 : false)) {
                    StringBuilder sb4 = new StringBuilder(ProtectedSandApp.s("朻"));
                    String substring3 = input.substring(i8, f7);
                    kotlin.jvm.internal.l0.o(substring3, s5);
                    sb4.append(substring3);
                    sb4.append(Typography.f27126b);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                D = q5;
            } else {
                this.encodedUsername = base.A();
                this.encodedPassword = base.w();
                this.host = base.getHost();
                this.port = base.getPort();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.y());
                if (D == F || input.charAt(D) == '#') {
                    m(base.z());
                }
                i5 = F;
            }
            int i10 = i5;
            int q6 = okhttp3.internal.d.q(input, ProtectedSandApp.s("朹"), D, i10);
            L(input, D, q6);
            if (q6 < i10 && input.charAt(q6) == '?') {
                int p6 = okhttp3.internal.d.p(input, '#', q6, i10);
                Companion companion5 = w.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.p(Companion.f(companion5, input, q6 + 1, p6, ProtectedSandApp.s("机"), true, false, true, false, null, 208, null));
                q6 = p6;
            }
            if (q6 < i10 && input.charAt(q6) == '#') {
                this.encodedFragment = Companion.f(w.INSTANCE, input, q6 + 1, i10, "", true, false, false, true, null, SyslogAppender.LOG_LOCAL6, null);
            }
            return this;
        }

        @d5.d
        public final a B(@d5.d String password) {
            kotlin.jvm.internal.l0.p(password, ProtectedSandApp.s("朽"));
            this.encodedPassword = Companion.f(w.INSTANCE, password, 0, 0, ProtectedSandApp.s("朾"), false, false, false, false, null, 251, null);
            return this;
        }

        @d5.d
        public final a D(int port) {
            if (!(1 <= port && 65535 >= port)) {
                throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("朿"), port).toString());
            }
            this.port = port;
            return this;
        }

        @d5.d
        public final a F(@d5.e String query) {
            List<String> list;
            if (query != null) {
                Companion companion = w.INSTANCE;
                String f6 = Companion.f(companion, query, 0, 0, ProtectedSandApp.s("杀"), false, false, true, false, null, 219, null);
                if (f6 != null) {
                    list = companion.p(f6);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @d5.d
        public final a G() {
            String str = this.host;
            this.host = str != null ? new Regex(ProtectedSandApp.s("杁")).m(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i5 = 0; i5 < size; i5++) {
                List<String> list = this.encodedPathSegments;
                list.set(i5, Companion.f(w.INSTANCE, list.get(i5), 0, 0, ProtectedSandApp.s("杂"), true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    String str2 = list2.get(i6);
                    list2.set(i6, str2 != null ? Companion.f(w.INSTANCE, str2, 0, 0, ProtectedSandApp.s("权"), true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.f(w.INSTANCE, str3, 0, 0, ProtectedSandApp.s("杄"), true, true, false, true, null, 163, null) : null;
            return this;
        }

        @d5.d
        public final a I(@d5.d String encodedName) {
            kotlin.jvm.internal.l0.p(encodedName, ProtectedSandApp.s("杅"));
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            H(Companion.f(w.INSTANCE, encodedName, 0, 0, ProtectedSandApp.s("杆"), true, false, true, false, null, 211, null));
            return this;
        }

        @d5.d
        public final a J(@d5.d String name) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("杇"));
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            H(Companion.f(w.INSTANCE, name, 0, 0, ProtectedSandApp.s("杈"), false, false, true, false, null, 219, null));
            return this;
        }

        @d5.d
        public final a K(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @d5.d
        public final a M(@d5.d String scheme) {
            boolean K1;
            boolean K12;
            kotlin.jvm.internal.l0.p(scheme, ProtectedSandApp.s("杉"));
            String s5 = ProtectedSandApp.s("杊");
            K1 = kotlin.text.e0.K1(scheme, s5, true);
            if (K1) {
                this.scheme = s5;
            } else {
                String s6 = ProtectedSandApp.s("杋");
                K12 = kotlin.text.e0.K1(scheme, s6, true);
                if (!K12) {
                    throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("杌"), scheme));
                }
                this.scheme = s6;
            }
            return this;
        }

        public final void N(@d5.e String str) {
            this.encodedFragment = str;
        }

        public final void O(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("杍"));
            this.encodedPassword = str;
        }

        @d5.d
        public final a P(int index, @d5.d String encodedPathSegment) {
            kotlin.jvm.internal.l0.p(encodedPathSegment, ProtectedSandApp.s("李"));
            String f6 = Companion.f(w.INSTANCE, encodedPathSegment, 0, 0, ProtectedSandApp.s("杏"), true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(index, f6);
            if ((y(f6) || z(f6)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("材"), encodedPathSegment).toString());
        }

        public final void Q(@d5.e List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @d5.d
        public final a R(@d5.d String encodedName, @d5.e String encodedValue) {
            kotlin.jvm.internal.l0.p(encodedName, ProtectedSandApp.s("村"));
            I(encodedName);
            c(encodedName, encodedValue);
            return this;
        }

        public final void S(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("杒"));
            this.encodedUsername = str;
        }

        public final void T(@d5.e String str) {
            this.host = str;
        }

        @d5.d
        public final a U(int index, @d5.d String pathSegment) {
            kotlin.jvm.internal.l0.p(pathSegment, ProtectedSandApp.s("杓"));
            String f6 = Companion.f(w.INSTANCE, pathSegment, 0, 0, ProtectedSandApp.s("杔"), false, false, false, false, null, 251, null);
            if (!((y(f6) || z(f6)) ? false : true)) {
                throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("杕"), pathSegment).toString());
            }
            this.encodedPathSegments.set(index, f6);
            return this;
        }

        public final void V(int i5) {
            this.port = i5;
        }

        @d5.d
        public final a W(@d5.d String name, @d5.e String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("杖"));
            J(name);
            g(name, value);
            return this;
        }

        public final void X(@d5.e String str) {
            this.scheme = str;
        }

        @d5.d
        public final a Y(@d5.d String username) {
            kotlin.jvm.internal.l0.p(username, ProtectedSandApp.s("杗"));
            this.encodedUsername = Companion.f(w.INSTANCE, username, 0, 0, ProtectedSandApp.s("杘"), false, false, false, false, null, 251, null);
            return this;
        }

        @d5.d
        public final a a(@d5.d String encodedPathSegment) {
            kotlin.jvm.internal.l0.p(encodedPathSegment, ProtectedSandApp.s("杙"));
            E(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @d5.d
        public final a b(@d5.d String encodedPathSegments) {
            kotlin.jvm.internal.l0.p(encodedPathSegments, ProtectedSandApp.s("杚"));
            return f(encodedPathSegments, true);
        }

        @d5.d
        public final a c(@d5.d String encodedName, @d5.e String encodedValue) {
            kotlin.jvm.internal.l0.p(encodedName, ProtectedSandApp.s("杛"));
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.l0.m(list);
            Companion companion = w.INSTANCE;
            list.add(Companion.f(companion, encodedName, 0, 0, ProtectedSandApp.s("杜"), true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.l0.m(list2);
            list2.add(encodedValue != null ? Companion.f(companion, encodedValue, 0, 0, ProtectedSandApp.s("杝"), true, false, true, false, null, 211, null) : null);
            return this;
        }

        @d5.d
        public final a d(@d5.d String pathSegment) {
            kotlin.jvm.internal.l0.p(pathSegment, ProtectedSandApp.s("杞"));
            E(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @d5.d
        public final a e(@d5.d String pathSegments) {
            kotlin.jvm.internal.l0.p(pathSegments, ProtectedSandApp.s("束"));
            return f(pathSegments, false);
        }

        @d5.d
        public final a g(@d5.d String name, @d5.e String value) {
            kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("杠"));
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.l0.m(list);
            Companion companion = w.INSTANCE;
            list.add(Companion.f(companion, name, 0, 0, ProtectedSandApp.s("条"), false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.l0.m(list2);
            list2.add(value != null ? Companion.f(companion, value, 0, 0, ProtectedSandApp.s("杢"), false, false, true, false, null, 219, null) : null);
            return this;
        }

        @d5.d
        public final w h() {
            int b02;
            ArrayList arrayList;
            int b03;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException(ProtectedSandApp.s("杤"));
            }
            Companion companion = w.INSTANCE;
            String n5 = Companion.n(companion, this.encodedUsername, 0, 0, false, 7, null);
            String n6 = Companion.n(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException(ProtectedSandApp.s("杣"));
            }
            int i5 = i();
            List<String> list = this.encodedPathSegments;
            b02 = kotlin.collections.b0.b0(list, 10);
            ArrayList arrayList2 = new ArrayList(b02);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.n(w.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                b03 = kotlin.collections.b0.b0(list2, 10);
                arrayList = new ArrayList(b03);
                for (String str3 : list2) {
                    arrayList.add(str3 != null ? Companion.n(w.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new w(str, n5, n6, str2, i5, arrayList2, arrayList, str4 != null ? Companion.n(w.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        @d5.d
        public final a j(@d5.e String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? Companion.f(w.INSTANCE, encodedFragment, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @d5.d
        public final a k(@d5.d String encodedPassword) {
            kotlin.jvm.internal.l0.p(encodedPassword, ProtectedSandApp.s("来"));
            this.encodedPassword = Companion.f(w.INSTANCE, encodedPassword, 0, 0, ProtectedSandApp.s("杦"), true, false, false, false, null, 243, null);
            return this;
        }

        @d5.d
        public final a l(@d5.d String encodedPath) {
            boolean s22;
            kotlin.jvm.internal.l0.p(encodedPath, ProtectedSandApp.s("杧"));
            s22 = kotlin.text.e0.s2(encodedPath, ProtectedSandApp.s("杨"), false, 2, null);
            if (!s22) {
                throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("杩"), encodedPath).toString());
            }
            L(encodedPath, 0, encodedPath.length());
            return this;
        }

        @d5.d
        public final a m(@d5.e String encodedQuery) {
            List<String> list;
            if (encodedQuery != null) {
                Companion companion = w.INSTANCE;
                String f6 = Companion.f(companion, encodedQuery, 0, 0, ProtectedSandApp.s("杪"), true, false, true, false, null, 211, null);
                if (f6 != null) {
                    list = companion.p(f6);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @d5.d
        public final a n(@d5.d String encodedUsername) {
            kotlin.jvm.internal.l0.p(encodedUsername, ProtectedSandApp.s("杫"));
            this.encodedUsername = Companion.f(w.INSTANCE, encodedUsername, 0, 0, ProtectedSandApp.s("杬"), true, false, false, false, null, 243, null);
            return this;
        }

        @d5.d
        public final a o(@d5.e String fragment) {
            this.encodedFragment = fragment != null ? Companion.f(w.INSTANCE, fragment, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @d5.e
        /* renamed from: p, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        @d5.d
        /* renamed from: q, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        @d5.d
        public final List<String> r() {
            return this.encodedPathSegments;
        }

        @d5.e
        public final List<String> s() {
            return this.encodedQueryNamesAndValues;
        }

        @d5.d
        /* renamed from: t, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        
            if ((r6.encodedPassword.length() > 0) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
        
            if (r1 != r3.g(r2)) goto L38;
         */
        @d5.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L16
                r0.append(r1)
                java.lang.String r1 = "杭"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
                r0.append(r1)
                goto L1f
            L16:
                java.lang.String r1 = "杮"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
                r0.append(r1)
            L1f:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L2b
                r1 = r2
                goto L2c
            L2b:
                r1 = r3
            L2c:
                r4 = 58
                if (r1 != 0) goto L3d
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L3a
                r1 = r2
                goto L3b
            L3a:
                r1 = r3
            L3b:
                if (r1 == 0) goto L5b
            L3d:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L4b
                goto L4c
            L4b:
                r2 = r3
            L4c:
                if (r2 == 0) goto L56
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L56:
                r1 = 64
                r0.append(r1)
            L5b:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L7f
                kotlin.jvm.internal.l0.m(r1)
                r2 = 2
                r5 = 0
                boolean r1 = kotlin.text.v.S2(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L7a
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L7f
            L7a:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L7f:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L88
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto La1
            L88:
                int r1 = r6.i()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L9b
                okhttp3.w$b r3 = okhttp3.w.INSTANCE
                kotlin.jvm.internal.l0.m(r2)
                int r2 = r3.g(r2)
                if (r1 == r2) goto La1
            L9b:
                r0.append(r4)
                r0.append(r1)
            La1:
                okhttp3.w$b r1 = okhttp3.w.INSTANCE
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.o(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto Lb9
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.l0.m(r2)
                r1.q(r2, r0)
            Lb9:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lc7
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lc7:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "杯"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
                kotlin.jvm.internal.l0.o(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.w.a.toString():java.lang.String");
        }

        @d5.e
        /* renamed from: u, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* renamed from: v, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        @d5.e
        /* renamed from: w, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        @d5.d
        public final a x(@d5.d String host) {
            kotlin.jvm.internal.l0.p(host, ProtectedSandApp.s("杰"));
            String e6 = okhttp3.internal.a.e(Companion.n(w.INSTANCE, host, 0, 0, false, 7, null));
            if (e6 == null) {
                throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("東"), host));
            }
            this.host = e6;
            return this;
        }
    }

    /* compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010EJ,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e*\u00020\u0003H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0003H\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u0004\u0018\u00010!*\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010#J\u0015\u0010&\u001a\u0004\u0018\u00010!*\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u0004\u0018\u00010!*\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0003H\u0007¢\u0006\u0004\b,\u0010#J\u0019\u0010-\u001a\u0004\u0018\u00010!2\u0006\u0010+\u001a\u00020\u0003H\u0007¢\u0006\u0004\b-\u0010#J\u0019\u0010.\u001a\u0004\u0018\u00010!2\u0006\u0010+\u001a\u00020%H\u0007¢\u0006\u0004\b.\u0010'J\u0019\u00100\u001a\u0004\u0018\u00010!2\u0006\u0010/\u001a\u00020(H\u0007¢\u0006\u0004\b0\u0010*J1\u00101\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b1\u00102Jc\u00103\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00106R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u00106R\u0014\u0010=\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u00106R\u0014\u0010>\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u00106R\u0014\u0010?\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u00106R\u0014\u0010@\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u00106R\u0014\u0010A\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u00106R\u0014\u0010B\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u00106R\u0014\u0010C\u001a\u00020\u00038\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u00106¨\u0006F"}, d2 = {"Lokhttp3/w$b;", "", "Lokio/m;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lkotlin/m2;", "s", "k", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "r", "scheme", "g", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "o", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "q", "", "p", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/w;", "h", "(Ljava/lang/String;)Lokhttp3/w;", "l", "Ljava/net/URL;", "j", "(Ljava/net/URL;)Lokhttp3/w;", "Ljava/net/URI;", "i", "(Ljava/net/URI;)Lokhttp3/w;", "url", "a", "d", "c", "uri", "b", "m", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "e", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.w$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ String f(Companion companion, String str, int i5, int i6, String str2, boolean z5, boolean z6, boolean z7, boolean z8, Charset charset, int i7, Object obj) {
            return companion.e(str, (i7 & 1) != 0 ? 0 : i5, (i7 & 2) != 0 ? str.length() : i6, str2, (i7 & 8) != 0 ? false : z5, (i7 & 16) != 0 ? false : z6, (i7 & 32) != 0 ? false : z7, (i7 & 64) != 0 ? false : z8, (i7 & 128) != 0 ? null : charset);
        }

        private final boolean k(String str, int i5, int i6) {
            int i7 = i5 + 2;
            return i7 < i6 && str.charAt(i5) == '%' && okhttp3.internal.d.N(str.charAt(i5 + 1)) != -1 && okhttp3.internal.d.N(str.charAt(i7)) != -1;
        }

        public static /* synthetic */ String n(Companion companion, String str, int i5, int i6, boolean z5, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                i5 = 0;
            }
            if ((i7 & 2) != 0) {
                i6 = str.length();
            }
            if ((i7 & 4) != 0) {
                z5 = false;
            }
            return companion.m(str, i5, i6, z5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
        
            if (k(r16, r5, r18) == false) goto L43;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void r(okio.m r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                Method dump skipped, instructions count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.w.Companion.r(okio.m, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void s(okio.m mVar, String str, int i5, int i6, boolean z5) {
            int i7;
            while (i5 < i6) {
                if (str == null) {
                    throw new NullPointerException(ProtectedSandApp.s("杵"));
                }
                int codePointAt = str.codePointAt(i5);
                if (codePointAt != 37 || (i7 = i5 + 2) >= i6) {
                    if (codePointAt == 43 && z5) {
                        mVar.writeByte(32);
                        i5++;
                    }
                    mVar.y(codePointAt);
                    i5 += Character.charCount(codePointAt);
                } else {
                    int N = okhttp3.internal.d.N(str.charAt(i5 + 1));
                    int N2 = okhttp3.internal.d.N(str.charAt(i7));
                    if (N != -1 && N2 != -1) {
                        mVar.writeByte((N << 4) + N2);
                        i5 = Character.charCount(codePointAt) + i7;
                    }
                    mVar.y(codePointAt);
                    i5 += Character.charCount(codePointAt);
                }
            }
        }

        @p3.i(name = "-deprecated_get")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @d5.d
        public final w a(@d5.d String url) {
            kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("杶"));
            return h(url);
        }

        @p3.i(name = "-deprecated_get")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @d5.e
        public final w b(@d5.d URI uri) {
            kotlin.jvm.internal.l0.p(uri, ProtectedSandApp.s("杷"));
            return i(uri);
        }

        @p3.i(name = "-deprecated_get")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @d5.e
        public final w c(@d5.d URL url) {
            kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("杸"));
            return j(url);
        }

        @p3.i(name = "-deprecated_parse")
        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @d5.e
        public final w d(@d5.d String url) {
            kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("杹"));
            return l(url);
        }

        @d5.d
        public final String e(@d5.d String str, int i5, int i6, @d5.d String str2, boolean z5, boolean z6, boolean z7, boolean z8, @d5.e Charset charset) {
            boolean S2;
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("杺"));
            kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("杻"));
            int i7 = i5;
            while (i7 < i6) {
                int codePointAt = str.codePointAt(i7);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z8)) {
                    S2 = kotlin.text.h0.S2(str2, (char) codePointAt, false, 2, null);
                    if (!S2) {
                        if (codePointAt == 37) {
                            if (z5) {
                                if (z6) {
                                    if (!k(str, i7, i6)) {
                                        okio.m mVar = new okio.m();
                                        mVar.u0(str, i5, i7);
                                        r(mVar, str, i7, i6, str2, z5, z6, z7, z8, charset);
                                        return mVar.L0();
                                    }
                                    if (codePointAt != 43 && z7) {
                                        okio.m mVar2 = new okio.m();
                                        mVar2.u0(str, i5, i7);
                                        r(mVar2, str, i7, i6, str2, z5, z6, z7, z8, charset);
                                        return mVar2.L0();
                                    }
                                    i7 += Character.charCount(codePointAt);
                                }
                            }
                        }
                        if (codePointAt != 43) {
                        }
                        i7 += Character.charCount(codePointAt);
                    }
                }
                okio.m mVar22 = new okio.m();
                mVar22.u0(str, i5, i7);
                r(mVar22, str, i7, i6, str2, z5, z6, z7, z8, charset);
                return mVar22.L0();
            }
            String substring = str.substring(i5, i6);
            kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("杼"));
            return substring;
        }

        @p3.n
        public final int g(@d5.d String scheme) {
            kotlin.jvm.internal.l0.p(scheme, ProtectedSandApp.s("杽"));
            int hashCode = scheme.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals(ProtectedSandApp.s("松"))) {
                    return 443;
                }
            } else if (scheme.equals(ProtectedSandApp.s("板"))) {
                return 80;
            }
            return -1;
        }

        @p3.i(name = "get")
        @d5.d
        @p3.n
        public final w h(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("枀"));
            return new a().A(null, str).h();
        }

        @p3.i(name = "get")
        @d5.e
        @p3.n
        public final w i(@d5.d URI uri) {
            kotlin.jvm.internal.l0.p(uri, ProtectedSandApp.s("极"));
            String uri2 = uri.toString();
            kotlin.jvm.internal.l0.o(uri2, ProtectedSandApp.s("枂"));
            return l(uri2);
        }

        @p3.i(name = "get")
        @d5.e
        @p3.n
        public final w j(@d5.d URL url) {
            kotlin.jvm.internal.l0.p(url, ProtectedSandApp.s("枃"));
            String url2 = url.toString();
            kotlin.jvm.internal.l0.o(url2, ProtectedSandApp.s("构"));
            return l(url2);
        }

        @p3.i(name = "parse")
        @d5.e
        @p3.n
        public final w l(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("枅"));
            try {
                return h(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @d5.d
        public final String m(@d5.d String str, int i5, int i6, boolean z5) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("枆"));
            for (int i7 = i5; i7 < i6; i7++) {
                char charAt = str.charAt(i7);
                if (charAt == '%' || (charAt == '+' && z5)) {
                    okio.m mVar = new okio.m();
                    mVar.u0(str, i5, i7);
                    s(mVar, str, i7, i6, z5);
                    return mVar.L0();
                }
            }
            String substring = str.substring(i5, i6);
            kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("枇"));
            return substring;
        }

        public final void o(@d5.d List<String> list, @d5.d StringBuilder sb) {
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("枈"));
            kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("枉"));
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                sb.append(org.apache.commons.io.n.f32060b);
                sb.append(list.get(i5));
            }
        }

        @d5.d
        public final List<String> p(@d5.d String str) {
            int o32;
            int o33;
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("枊"));
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (i5 <= str.length()) {
                o32 = kotlin.text.h0.o3(str, Typography.f27128d, i5, false, 4, null);
                if (o32 == -1) {
                    o32 = str.length();
                }
                int i6 = o32;
                o33 = kotlin.text.h0.o3(str, '=', i5, false, 4, null);
                String s5 = ProtectedSandApp.s("枋");
                if (o33 == -1 || o33 > i6) {
                    String substring = str.substring(i5, i6);
                    kotlin.jvm.internal.l0.o(substring, s5);
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i5, o33);
                    kotlin.jvm.internal.l0.o(substring2, s5);
                    arrayList.add(substring2);
                    String substring3 = str.substring(o33 + 1, i6);
                    kotlin.jvm.internal.l0.o(substring3, s5);
                    arrayList.add(substring3);
                }
                i5 = i6 + 1;
            }
            return arrayList;
        }

        public final void q(@d5.d List<String> list, @d5.d StringBuilder sb) {
            IntRange W1;
            IntProgression B1;
            kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("枌"));
            kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("枍"));
            W1 = kotlin.ranges.u.W1(0, list.size());
            B1 = kotlin.ranges.u.B1(W1, 2);
            int f23724o = B1.getF23724o();
            int f23725p = B1.getF23725p();
            int f23726q = B1.getF23726q();
            if (f23726q >= 0) {
                if (f23724o > f23725p) {
                    return;
                }
            } else if (f23724o < f23725p) {
                return;
            }
            while (true) {
                String str = list.get(f23724o);
                String str2 = list.get(f23724o + 1);
                if (f23724o > 0) {
                    sb.append(Typography.f27128d);
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (f23724o == f23725p) {
                    return;
                } else {
                    f23724o += f23726q;
                }
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public w(@d5.d String str, @d5.d String str2, @d5.d String str3, @d5.d String str4, int i5, @d5.d List<String> list, @d5.e List<String> list2, @d5.e String str5, @d5.d String str6) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("枘"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("枙"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("枚"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("枛"));
        kotlin.jvm.internal.l0.p(list, ProtectedSandApp.s("果"));
        kotlin.jvm.internal.l0.p(str6, ProtectedSandApp.s("枝"));
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i5;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = kotlin.jvm.internal.l0.g(str, ProtectedSandApp.s("枞"));
    }

    @p3.i(name = "get")
    @d5.d
    @p3.n
    public static final w C(@d5.d String str) {
        return INSTANCE.h(str);
    }

    @p3.i(name = "get")
    @d5.e
    @p3.n
    public static final w D(@d5.d URI uri) {
        return INSTANCE.i(uri);
    }

    @p3.i(name = "get")
    @d5.e
    @p3.n
    public static final w E(@d5.d URL url) {
        return INSTANCE.j(url);
    }

    @p3.i(name = "parse")
    @d5.e
    @p3.n
    public static final w J(@d5.d String str) {
        return INSTANCE.l(str);
    }

    @p3.n
    public static final int u(@d5.d String str) {
        return INSTANCE.g(str);
    }

    @p3.i(name = "encodedUsername")
    @d5.d
    public final String A() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int q5 = okhttp3.internal.d.q(str, ProtectedSandApp.s("枟"), length, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("枡"));
        }
        String substring = str2.substring(length, q5);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("枠"));
        return substring;
    }

    @p3.i(name = "fragment")
    @d5.e
    /* renamed from: B, reason: from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @p3.i(name = "host")
    @d5.d
    /* renamed from: F, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: G, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    @d5.d
    public final a H() {
        a aVar = new a();
        aVar.X(this.scheme);
        aVar.S(A());
        aVar.O(w());
        aVar.T(this.host);
        aVar.V(this.port != INSTANCE.g(this.scheme) ? this.port : -1);
        aVar.r().clear();
        aVar.r().addAll(y());
        aVar.m(z());
        aVar.N(v());
        return aVar;
    }

    @d5.e
    public final a I(@d5.d String link) {
        kotlin.jvm.internal.l0.p(link, ProtectedSandApp.s("枢"));
        try {
            return new a().A(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @p3.i(name = "password")
    @d5.d
    /* renamed from: K, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @p3.i(name = "pathSegments")
    @d5.d
    public final List<String> L() {
        return this.pathSegments;
    }

    @p3.i(name = "pathSize")
    public final int M() {
        return this.pathSegments.size();
    }

    @p3.i(name = "port")
    /* renamed from: N, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    @p3.i(name = "query")
    @d5.e
    public final String O() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.q(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @d5.e
    public final String P(@d5.d String name) {
        IntRange W1;
        IntProgression B1;
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("枣"));
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        W1 = kotlin.ranges.u.W1(0, list.size());
        B1 = kotlin.ranges.u.B1(W1, 2);
        int f23724o = B1.getF23724o();
        int f23725p = B1.getF23725p();
        int f23726q = B1.getF23726q();
        if (f23726q < 0 ? f23724o >= f23725p : f23724o <= f23725p) {
            while (!kotlin.jvm.internal.l0.g(name, this.queryNamesAndValues.get(f23724o))) {
                if (f23724o != f23725p) {
                    f23724o += f23726q;
                }
            }
            return this.queryNamesAndValues.get(f23724o + 1);
        }
        return null;
    }

    @d5.d
    public final String Q(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(index * 2);
        kotlin.jvm.internal.l0.m(str);
        return str;
    }

    @p3.i(name = "queryParameterNames")
    @d5.d
    public final Set<String> R() {
        IntRange W1;
        IntProgression B1;
        if (this.queryNamesAndValues == null) {
            return EmptySet.f23181o;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        W1 = kotlin.ranges.u.W1(0, this.queryNamesAndValues.size());
        B1 = kotlin.ranges.u.B1(W1, 2);
        int f23724o = B1.getF23724o();
        int f23725p = B1.getF23725p();
        int f23726q = B1.getF23726q();
        if (f23726q < 0 ? f23724o >= f23725p : f23724o <= f23725p) {
            while (true) {
                String str = this.queryNamesAndValues.get(f23724o);
                kotlin.jvm.internal.l0.m(str);
                linkedHashSet.add(str);
                if (f23724o == f23725p) {
                    break;
                }
                f23724o += f23726q;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        kotlin.jvm.internal.l0.o(unmodifiableSet, ProtectedSandApp.s("枤"));
        return unmodifiableSet;
    }

    @d5.e
    public final String S(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @d5.d
    public final List<String> T(@d5.d String name) {
        IntRange W1;
        IntProgression B1;
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("枥"));
        if (this.queryNamesAndValues == null) {
            return EmptyList.f23167o;
        }
        ArrayList arrayList = new ArrayList();
        W1 = kotlin.ranges.u.W1(0, this.queryNamesAndValues.size());
        B1 = kotlin.ranges.u.B1(W1, 2);
        int f23724o = B1.getF23724o();
        int f23725p = B1.getF23725p();
        int f23726q = B1.getF23726q();
        if (f23726q < 0 ? f23724o >= f23725p : f23724o <= f23725p) {
            while (true) {
                if (kotlin.jvm.internal.l0.g(name, this.queryNamesAndValues.get(f23724o))) {
                    arrayList.add(this.queryNamesAndValues.get(f23724o + 1));
                }
                if (f23724o == f23725p) {
                    break;
                }
                f23724o += f23726q;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.l0.o(unmodifiableList, ProtectedSandApp.s("枦"));
        return unmodifiableList;
    }

    @p3.i(name = "querySize")
    public final int U() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @d5.d
    public final String V() {
        a I = I(ProtectedSandApp.s("枧"));
        kotlin.jvm.internal.l0.m(I);
        return I.Y("").B("").h().url;
    }

    @d5.e
    public final w W(@d5.d String link) {
        kotlin.jvm.internal.l0.p(link, ProtectedSandApp.s("枨"));
        a I = I(link);
        if (I != null) {
            return I.h();
        }
        return null;
    }

    @p3.i(name = "scheme")
    @d5.d
    /* renamed from: X, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @d5.e
    public final String Y() {
        if (okhttp3.internal.d.h(this.host)) {
            return null;
        }
        PublicSuffixDatabase.INSTANCE.getClass();
        return PublicSuffixDatabase.f31332i.e(this.host);
    }

    @p3.i(name = "uri")
    @d5.d
    public final URI Z() {
        String aVar = H().G().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e6) {
            try {
                URI create = URI.create(new Regex(ProtectedSandApp.s("枩")).m(aVar, ""));
                kotlin.jvm.internal.l0.o(create, ProtectedSandApp.s("枪"));
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e6);
            }
        }
    }

    @p3.i(name = "-deprecated_encodedFragment")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedFragment", imports = {}))
    @d5.e
    public final String a() {
        return v();
    }

    @p3.i(name = "url")
    @d5.d
    public final URL a0() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e6) {
            throw new RuntimeException(e6);
        }
    }

    @p3.i(name = "-deprecated_encodedPassword")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPassword", imports = {}))
    @d5.d
    public final String b() {
        return w();
    }

    @p3.i(name = "username")
    @d5.d
    /* renamed from: b0, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @p3.i(name = "-deprecated_encodedPath")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPath", imports = {}))
    @d5.d
    public final String c() {
        return x();
    }

    @p3.i(name = "-deprecated_encodedPathSegments")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPathSegments", imports = {}))
    @d5.d
    public final List<String> d() {
        return y();
    }

    @p3.i(name = "-deprecated_encodedQuery")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedQuery", imports = {}))
    @d5.e
    public final String e() {
        return z();
    }

    public boolean equals(@d5.e Object other) {
        return (other instanceof w) && kotlin.jvm.internal.l0.g(((w) other).url, this.url);
    }

    @p3.i(name = "-deprecated_encodedUsername")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedUsername", imports = {}))
    @d5.d
    public final String f() {
        return A();
    }

    @p3.i(name = "-deprecated_fragment")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "fragment", imports = {}))
    @d5.e
    public final String g() {
        return this.fragment;
    }

    @p3.i(name = "-deprecated_host")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "host", imports = {}))
    @d5.d
    public final String h() {
        return this.host;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @p3.i(name = "-deprecated_password")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "password", imports = {}))
    @d5.d
    public final String i() {
        return this.password;
    }

    @p3.i(name = "-deprecated_pathSegments")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSegments", imports = {}))
    @d5.d
    public final List<String> j() {
        return this.pathSegments;
    }

    @p3.i(name = "-deprecated_pathSize")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSize", imports = {}))
    public final int k() {
        return M();
    }

    @p3.i(name = "-deprecated_port")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "port", imports = {}))
    public final int l() {
        return this.port;
    }

    @p3.i(name = "-deprecated_query")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "query", imports = {}))
    @d5.e
    public final String m() {
        return O();
    }

    @p3.i(name = "-deprecated_queryParameterNames")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "queryParameterNames", imports = {}))
    @d5.d
    public final Set<String> n() {
        return R();
    }

    @p3.i(name = "-deprecated_querySize")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "querySize", imports = {}))
    public final int o() {
        return U();
    }

    @p3.i(name = "-deprecated_scheme")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    @d5.d
    public final String p() {
        return this.scheme;
    }

    @p3.i(name = "-deprecated_uri")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @ReplaceWith(expression = "toUri()", imports = {}))
    @d5.d
    public final URI q() {
        return Z();
    }

    @p3.i(name = "-deprecated_url")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @ReplaceWith(expression = "toUrl()", imports = {}))
    @d5.d
    public final URL r() {
        return a0();
    }

    @p3.i(name = "-deprecated_username")
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "username", imports = {}))
    @d5.d
    public final String s() {
        return this.username;
    }

    @d5.d
    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @p3.i(name = "encodedFragment")
    @d5.e
    public final String v() {
        int o32;
        if (this.fragment == null) {
            return null;
        }
        o32 = kotlin.text.h0.o3(this.url, '#', 0, false, 6, null);
        int i5 = o32 + 1;
        String str = this.url;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("枬"));
        }
        String substring = str.substring(i5);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("枫"));
        return substring;
    }

    @p3.i(name = "encodedPassword")
    @d5.d
    public final String w() {
        int o32;
        int o33;
        if (this.password.length() == 0) {
            return "";
        }
        o32 = kotlin.text.h0.o3(this.url, ':', this.scheme.length() + 3, false, 4, null);
        int i5 = o32 + 1;
        o33 = kotlin.text.h0.o3(this.url, '@', 0, false, 6, null);
        String str = this.url;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("枮"));
        }
        String substring = str.substring(i5, o33);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("枭"));
        return substring;
    }

    @p3.i(name = "encodedPath")
    @d5.d
    public final String x() {
        int o32;
        o32 = kotlin.text.h0.o3(this.url, org.apache.commons.io.n.f32060b, this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int q5 = okhttp3.internal.d.q(str, ProtectedSandApp.s("枯"), o32, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("枱"));
        }
        String substring = str2.substring(o32, q5);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("枰"));
        return substring;
    }

    @p3.i(name = "encodedPathSegments")
    @d5.d
    public final List<String> y() {
        int o32;
        o32 = kotlin.text.h0.o3(this.url, org.apache.commons.io.n.f32060b, this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int q5 = okhttp3.internal.d.q(str, ProtectedSandApp.s("枲"), o32, str.length());
        ArrayList arrayList = new ArrayList();
        while (o32 < q5) {
            int i5 = o32 + 1;
            int p5 = okhttp3.internal.d.p(this.url, org.apache.commons.io.n.f32060b, i5, q5);
            String str2 = this.url;
            if (str2 == null) {
                throw new NullPointerException(ProtectedSandApp.s("枴"));
            }
            String substring = str2.substring(i5, p5);
            kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("枳"));
            arrayList.add(substring);
            o32 = p5;
        }
        return arrayList;
    }

    @p3.i(name = "encodedQuery")
    @d5.e
    public final String z() {
        int o32;
        if (this.queryNamesAndValues == null) {
            return null;
        }
        o32 = kotlin.text.h0.o3(this.url, '?', 0, false, 6, null);
        int i5 = o32 + 1;
        String str = this.url;
        int p5 = okhttp3.internal.d.p(str, '#', i5, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("架"));
        }
        String substring = str2.substring(i5, p5);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("枵"));
        return substring;
    }
}
