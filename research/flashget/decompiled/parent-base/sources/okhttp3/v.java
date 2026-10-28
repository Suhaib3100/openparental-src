package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.m0;
import kotlin.x0;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: HttpUrl.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\"\n\u0002\b%\u0018\u0000 U2\u00020\u0001:\u0002E6Bc\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u0004\u0018\u00010\u00002\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u0004\u0018\u00010$2\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u0010 J\u000f\u00100\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b0\u0010 J\u000f\u00101\u001a\u00020\u0010H\u0007¢\u0006\u0004\b1\u0010\u0012J\u000f\u00102\u001a\u00020\u0013H\u0007¢\u0006\u0004\b2\u0010\u0015J\u000f\u00103\u001a\u00020\u0002H\u0007¢\u0006\u0004\b3\u0010 J\u000f\u00104\u001a\u00020\u0002H\u0007¢\u0006\u0004\b4\u0010 J\u000f\u00105\u001a\u00020\u0002H\u0007¢\u0006\u0004\b5\u0010 J\u000f\u00106\u001a\u00020\u0002H\u0007¢\u0006\u0004\b6\u0010 J\u000f\u00107\u001a\u00020\u0002H\u0007¢\u0006\u0004\b7\u0010 J\u000f\u00108\u001a\u00020\u0002H\u0007¢\u0006\u0004\b8\u0010 J\u000f\u00109\u001a\u00020\u0007H\u0007¢\u0006\u0004\b9\u0010.J\u000f\u0010:\u001a\u00020\u0007H\u0007¢\u0006\u0004\b:\u0010.J\u000f\u0010;\u001a\u00020\u0002H\u0007¢\u0006\u0004\b;\u0010 J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b>\u0010=J\u0011\u0010?\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b?\u0010 J\u0011\u0010@\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b@\u0010 J\u000f\u0010A\u001a\u00020\u0007H\u0007¢\u0006\u0004\bA\u0010.J\u0015\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020BH\u0007¢\u0006\u0004\bC\u0010DJ\u0011\u0010E\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\bE\u0010 J\u0011\u0010F\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\bF\u0010 R\u0017\u0010I\u001a\u00020*8\u0006¢\u0006\f\n\u0004\bE\u0010\u0014\u001a\u0004\bG\u0010HR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b6\u0010J\u001a\u0004\bK\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b;\u0010J\u001a\u0004\bL\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b<\u0010J\u001a\u0004\bM\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b?\u0010J\u001a\u0004\bN\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\bO\u0010.R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0007¢\u0006\f\n\u0004\bF\u0010P\u001a\u0004\bQ\u0010=R\u001e\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010PR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b7\u0010J\u001a\u0004\bR\u0010 R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010JR\u0011\u0010T\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bS\u0010 R\u0011\u0010V\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bU\u0010 R\u0011\u0010X\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bW\u0010.R\u0011\u0010Z\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\bY\u0010 R\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\u0006\u001a\u0004\b[\u0010=R\u0013\u0010^\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b]\u0010 R\u0013\u0010`\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b_\u0010 R\u0011\u0010b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\ba\u0010.R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00020B8G¢\u0006\u0006\u001a\u0004\bc\u0010DR\u0013\u0010f\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\be\u0010 ¨\u0006g"}, d2 = {"Lokhttp3/v;", "", "", "scheme", "username", "password", "host", "", "port", "", "pathSegments", "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URL;", "a0", "()Ljava/net/URL;", "Ljava/net/URI;", "Z", "()Ljava/net/URI;", "name", "P", "(Ljava/lang/String;)Ljava/lang/String;", "T", "(Ljava/lang/String;)Ljava/util/List;", "index", "Q", "(I)Ljava/lang/String;", "S", "V", "()Ljava/lang/String;", "link", "W", "(Ljava/lang/String;)Lokhttp3/v;", "Lokhttp3/v$a;", "H", "()Lokhttp3/v$a;", "I", "(Ljava/lang/String;)Lokhttp3/v$a;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Y", "r", "q", "p", "f", "s", "b", "i", "h", "l", "k", "c", "d", "()Ljava/util/List;", "j", "e", "m", "o", "", "n", "()Ljava/util/Set;", "a", "g", "G", "()Z", "isHttps", "Ljava/lang/String;", "X", "b0", "K", "F", "N", "Ljava/util/List;", "L", "B", "A", "encodedUsername", "w", "encodedPassword", "M", "pathSize", "x", "encodedPath", "y", "encodedPathSegments", "z", "encodedQuery", "O", "query", "U", "querySize", "R", "queryParameterNames", "v", "encodedFragment", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isHttps;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String scheme;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String username;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String password;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String host;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int port;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<String> pathSegments;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<String> queryNamesAndValues;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String fragment;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    public static final String f85082p = ProtectedSandApp.s("ꊈ\u0001");

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    public static final String f85083q = ProtectedSandApp.s("ꊉ\u0001");

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    public static final String f85084r = ProtectedSandApp.s("ꊊ\u0001");

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    public static final String f85085s = ProtectedSandApp.s("ꊋ\u0001");

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    public static final String f85086t = ProtectedSandApp.s("ꊌ\u0001");

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    public static final String f85087u = "";

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    public static final String f85088v = ProtectedSandApp.s("ꊍ\u0001");

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    public static final String f85078l = ProtectedSandApp.s("ꊎ\u0001");

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    public static final String f85079m = ProtectedSandApp.s("ꊎ\u0001");

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    public static final String f85080n = ProtectedSandApp.s("ꊏ\u0001");

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    public static final String f85081o = ProtectedSandApp.s("ꊐ\u0001");

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: k, reason: collision with root package name */
    private static final char[] f85077k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\n\u0018\u0000 N2\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010 J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0007¢\u0006\u0004\b$\u0010 J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0007¢\u0006\u0004\b&\u0010 J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010 J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0007¢\u0006\u0004\b*\u0010 J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0007¢\u0006\u0004\b/\u0010 J\u0015\u00100\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b0\u0010 J\u0015\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0007¢\u0006\u0004\b2\u0010 J\u0015\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0007¢\u0006\u0004\b4\u0010 J\u001d\u00106\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0007¢\u0006\u0004\b6\u00107J\u001d\u00108\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0007¢\u0006\u0004\b8\u00107J\u0015\u00109\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0004¢\u0006\u0004\b9\u0010-J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u0007¢\u0006\u0004\b;\u0010 J\u0017\u0010=\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b=\u0010 J\u0017\u0010?\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b?\u0010 J\u001f\u0010B\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bF\u0010CJ\u001f\u0010G\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bG\u0010CJ\u001f\u0010H\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00072\b\u0010E\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bH\u0010CJ\u0015\u0010I\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u0007¢\u0006\u0004\bI\u0010 J\u0015\u0010J\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010 J\u0017\u0010L\u001a\u00020\u00002\b\u0010K\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bL\u0010 J\u0017\u0010N\u001a\u00020\u00002\b\u0010M\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bN\u0010 J\u000f\u0010O\u001a\u00020\u0000H\u0000¢\u0006\u0004\bO\u0010PJ\r\u0010R\u001a\u00020Q¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0007H\u0016¢\u0006\u0004\bT\u0010UJ!\u0010W\u001a\u00020\u00002\b\u0010V\u001a\u0004\u0018\u00010Q2\u0006\u0010\u0011\u001a\u00020\u0007H\u0000¢\u0006\u0004\bW\u0010XR$\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010Y\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010\u0010R\"\u0010#\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010Y\u001a\u0004\b\\\u0010U\"\u0004\b]\u0010\u0010R\"\u0010'\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010Y\u001a\u0004\b^\u0010U\"\u0004\b_\u0010\u0010R$\u0010)\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010Y\u001a\u0004\b`\u0010U\"\u0004\ba\u0010\u0010R\"\u0010+\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010J\u001a\u0004\bb\u0010\u0006\"\u0004\bc\u0010dR \u00103\u001a\b\u0012\u0004\u0012\u00020\u00070e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010f\u001a\u0004\bg\u0010hR,\u0010l\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010f\u001a\u0004\bi\u0010h\"\u0004\bj\u0010kR$\u0010M\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010Y\u001a\u0004\bm\u0010U\"\u0004\bn\u0010\u0010¨\u0006o"}, d2 = {"Lokhttp3/v$a;", "", "<init>", "()V", "", "i", "()I", "", "pathSegments", "", "alreadyEncoded", "f", "(Ljava/lang/String;Z)Lokhttp3/v$a;", "canonicalName", "Lkotlin/k2;", "H", "(Ljava/lang/String;)V", "input", "startPos", "limit", "L", "(Ljava/lang/String;II)V", "pos", "addTrailingSlash", "E", "(Ljava/lang/String;IIZZ)V", "y", "(Ljava/lang/String;)Z", "z", "C", "scheme", "M", "(Ljava/lang/String;)Lokhttp3/v$a;", "username", "Y", "encodedUsername", "n", "password", "B", "encodedPassword", "k", "host", "x", "port", "D", "(I)Lokhttp3/v$a;", "pathSegment", "d", "e", "encodedPathSegment", "a", "encodedPathSegments", "b", "index", "U", "(ILjava/lang/String;)Lokhttp3/v$a;", "P", "K", "encodedPath", "l", "query", "F", "encodedQuery", "m", "name", "value", "g", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/v$a;", "encodedName", "encodedValue", "c", "W", "R", "J", "I", "fragment", "o", "encodedFragment", "j", "G", "()Lokhttp3/v$a;", "Lokhttp3/v;", "h", "()Lokhttp3/v;", "toString", "()Ljava/lang/String;", "base", "A", "(Lokhttp3/v;Ljava/lang/String;)Lokhttp3/v$a;", "Ljava/lang/String;", "w", "X", "t", "S", "q", "O", "u", "T", "v", "V", "(I)V", "", "Ljava/util/List;", "r", "()Ljava/util/List;", "s", "Q", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "p", "N", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        @fg.l
        public static final String f85100i = ProtectedSandApp.s("ꈽ\u0001");

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private String scheme;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private String host;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<String> encodedPathSegments;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private List<String> encodedQueryNamesAndValues;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private String encodedFragment;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private String encodedUsername = "";

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private String encodedPassword = "";

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int port = -1;

        /* compiled from: HttpUrl.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lokhttp3/v$a$a;", "", "<init>", "()V", "", "input", "", "pos", "limit", "g", "(Ljava/lang/String;II)I", "h", "f", "e", "INVALID_HOST", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.v$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int e(String input, int pos, int limit) {
                try {
                    int parseInt = Integer.parseInt(Companion.f(v.INSTANCE, input, pos, limit, "", false, false, false, false, null, 248, null));
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
                if ((l0.t(charAt, 97) < 0 || l0.t(charAt, 122) > 0) && (l0.t(charAt, 65) < 0 || l0.t(charAt, 90) > 0)) {
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
            public final int h(String str, int i4, int i5) {
                int i6 = 0;
                while (i4 < i5) {
                    char charAt = str.charAt(i4);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i6++;
                    i4++;
                }
                return i6;
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
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r0.size() - 1, "");
            }
        }

        private final void E(String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            String f4 = Companion.f(v.INSTANCE, input, pos, limit, ProtectedSandApp.s("ꈾ\u0001"), alreadyEncoded, false, false, false, null, 240, null);
            if (y(f4)) {
                return;
            }
            if (z(f4)) {
                C();
                return;
            }
            if (((CharSequence) androidx.appcompat.view.menu.d.a(this.encodedPathSegments, 1)).length() == 0) {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, f4);
            } else {
                this.encodedPathSegments.add(f4);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add("");
            }
        }

        private final void H(String canonicalName) {
            List<String> list = this.encodedQueryNamesAndValues;
            l0.m(list);
            kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.k0(list.size() - 2, 0), 2);
            int first = B1.getFirst();
            int last = B1.getLast();
            int step = B1.getStep();
            if (step >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                l0.m(list2);
                if (l0.g(canonicalName, list2.get(first))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    l0.m(list3);
                    list3.remove(first + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    l0.m(list4);
                    list4.remove(first);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    l0.m(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        private final void L(String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char charAt = input.charAt(startPos);
            if (charAt == '/' || charAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                startPos++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i4 = startPos;
                if (i4 >= limit) {
                    return;
                }
                startPos = okhttp3.internal.d.q(input, ProtectedSandApp.s("ꈿ\u0001"), i4, limit);
                boolean z4 = startPos < limit;
                E(input, i4, startPos, z4, true);
                if (z4) {
                    startPos++;
                }
            }
        }

        private final a f(String pathSegments, boolean alreadyEncoded) {
            int i4 = 0;
            do {
                int q4 = okhttp3.internal.d.q(pathSegments, ProtectedSandApp.s("ꈿ\u0001"), i4, pathSegments.length());
                E(pathSegments, i4, q4, q4 < pathSegments.length(), alreadyEncoded);
                i4 = q4 + 1;
            } while (i4 <= pathSegments.length());
            return this;
        }

        private final int i() {
            int i4 = this.port;
            if (i4 != -1) {
                return i4;
            }
            Companion companion = v.INSTANCE;
            String str = this.scheme;
            l0.m(str);
            return companion.g(str);
        }

        private final boolean y(String input) {
            return l0.g(input, ProtectedSandApp.s("ꉀ\u0001")) || kotlin.text.v.K1(input, ProtectedSandApp.s("ꉁ\u0001"), true);
        }

        private final boolean z(String input) {
            return l0.g(input, ProtectedSandApp.s("ꉂ\u0001")) || kotlin.text.v.K1(input, ProtectedSandApp.s("ꉃ\u0001"), true) || kotlin.text.v.K1(input, ProtectedSandApp.s("ꉄ\u0001"), true) || kotlin.text.v.K1(input, ProtectedSandApp.s("ꉅ\u0001"), true);
        }

        @fg.l
        public final a A(@fg.m v base, @fg.l String input) {
            int q4;
            int i4;
            int i5;
            boolean z4;
            int i6;
            String str;
            int i7;
            boolean z5;
            boolean z6;
            l0.p(input, ProtectedSandApp.s("ꉆ\u0001"));
            int D = okhttp3.internal.d.D(input, 0, 0, 3, null);
            int F = okhttp3.internal.d.F(input, D, 0, 2, null);
            Companion companion = INSTANCE;
            int g4 = companion.g(input, D, F);
            String s4 = ProtectedSandApp.s("ꉇ\u0001");
            boolean z7 = true;
            char c5 = 65535;
            if (g4 != -1) {
                if (kotlin.text.v.p2(input, ProtectedSandApp.s("ꉈ\u0001"), D, true)) {
                    this.scheme = ProtectedSandApp.s("ꉉ\u0001");
                    D += 6;
                } else {
                    if (!kotlin.text.v.p2(input, ProtectedSandApp.s("ꉊ\u0001"), D, true)) {
                        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꉌ\u0001"));
                        String substring = input.substring(0, g4);
                        l0.o(substring, s4);
                        sb.append(substring);
                        sb.append(ProtectedSandApp.s("ꉍ\u0001"));
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.scheme = ProtectedSandApp.s("ꉋ\u0001");
                    D += 5;
                }
            } else {
                if (base == null) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ꉕ\u0001"));
                }
                this.scheme = base.getScheme();
            }
            int h4 = companion.h(input, D, F);
            char c6 = '?';
            char c7 = '#';
            if (h4 >= 2 || base == null || !l0.g(base.getScheme(), this.scheme)) {
                int i10 = D + h4;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    q4 = okhttp3.internal.d.q(input, ProtectedSandApp.s("ꉎ\u0001"), i10, F);
                    char charAt = q4 != F ? input.charAt(q4) : c5;
                    if (charAt == c5 || charAt == c7 || charAt == '/' || charAt == '\\' || charAt == c6) {
                        break;
                    }
                    if (charAt != '@') {
                        z4 = z7;
                        i6 = F;
                        str = s4;
                    } else {
                        String s5 = ProtectedSandApp.s("ꉏ\u0001");
                        if (z10) {
                            z4 = z7;
                            i6 = F;
                            str = s4;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.encodedPassword);
                            sb2.append(s5);
                            i7 = q4;
                            sb2.append(Companion.f(v.INSTANCE, input, i10, q4, ProtectedSandApp.s("ꉐ\u0001"), true, false, false, false, null, 240, null));
                            this.encodedPassword = sb2.toString();
                            z5 = z11;
                        } else {
                            int p4 = okhttp3.internal.d.p(input, ':', i10, q4);
                            Companion companion2 = v.INSTANCE;
                            z4 = z7;
                            i6 = F;
                            str = s4;
                            String f4 = Companion.f(companion2, input, i10, p4, ProtectedSandApp.s("ꉐ\u0001"), true, false, false, false, null, 240, null);
                            if (z11) {
                                f4 = androidx.fragment.app.k0.a(new StringBuilder(), this.encodedUsername, s5, f4);
                            }
                            this.encodedUsername = f4;
                            i7 = q4;
                            if (p4 != i7) {
                                this.encodedPassword = Companion.f(companion2, input, p4 + 1, i7, ProtectedSandApp.s("ꉐ\u0001"), true, false, false, false, null, 240, null);
                                z6 = z4;
                            } else {
                                z6 = z10;
                            }
                            z10 = z6;
                            z5 = z4;
                        }
                        i10 = i7 + 1;
                        z11 = z5;
                    }
                    s4 = str;
                    F = i6;
                    z7 = z4;
                    c7 = '#';
                    c6 = '?';
                    c5 = 65535;
                }
                boolean z12 = z7;
                i4 = F;
                String str2 = s4;
                Companion companion3 = INSTANCE;
                int f5 = companion3.f(input, i10, q4);
                int i11 = f5 + 1;
                if (i11 < q4) {
                    i5 = i10;
                    this.host = okhttp3.internal.a.e(Companion.n(v.INSTANCE, input, i10, f5, false, 4, null));
                    int e4 = companion3.e(input, i11, q4);
                    this.port = e4;
                    if (!(e4 != -1 ? z12 : false)) {
                        StringBuilder sb3 = new StringBuilder(ProtectedSandApp.s("ꉑ\u0001"));
                        String substring2 = input.substring(i11, q4);
                        l0.o(substring2, str2);
                        sb3.append(substring2);
                        sb3.append(m0.quote);
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    i5 = i10;
                    Companion companion4 = v.INSTANCE;
                    this.host = okhttp3.internal.a.e(Companion.n(companion4, input, i5, f5, false, 4, null));
                    String str3 = this.scheme;
                    l0.m(str3);
                    this.port = companion4.g(str3);
                }
                if (!(this.host != null ? z12 : false)) {
                    StringBuilder sb4 = new StringBuilder(ProtectedSandApp.s("ꉔ\u0001"));
                    String substring3 = input.substring(i5, f5);
                    l0.o(substring3, str2);
                    sb4.append(substring3);
                    sb4.append(m0.quote);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                D = q4;
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
                i4 = F;
            }
            int i12 = i4;
            int q5 = okhttp3.internal.d.q(input, ProtectedSandApp.s("ꉒ\u0001"), D, i12);
            L(input, D, q5);
            if (q5 < i12 && input.charAt(q5) == '?') {
                int p5 = okhttp3.internal.d.p(input, '#', q5, i12);
                Companion companion5 = v.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.p(Companion.f(companion5, input, q5 + 1, p5, ProtectedSandApp.s("ꉓ\u0001"), true, false, true, false, null, 208, null));
                q5 = p5;
            }
            if (q5 < i12 && input.charAt(q5) == '#') {
                this.encodedFragment = Companion.f(v.INSTANCE, input, q5 + 1, i12, "", true, false, false, true, null, SyslogAppender.LOG_LOCAL6, null);
            }
            return this;
        }

        @fg.l
        public final a B(@fg.l String password) {
            l0.p(password, ProtectedSandApp.s("ꉖ\u0001"));
            this.encodedPassword = Companion.f(v.INSTANCE, password, 0, 0, ProtectedSandApp.s("ꉐ\u0001"), false, false, false, false, null, 251, null);
            return this;
        }

        @fg.l
        public final a D(int port) {
            if (!(1 <= port && 65535 >= port)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ꉗ\u0001"), port).toString());
            }
            this.port = port;
            return this;
        }

        @fg.l
        public final a F(@fg.m String query) {
            List<String> list;
            if (query != null) {
                Companion companion = v.INSTANCE;
                String f4 = Companion.f(companion, query, 0, 0, ProtectedSandApp.s("ꉓ\u0001"), false, false, true, false, null, 219, null);
                if (f4 != null) {
                    list = companion.p(f4);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @fg.l
        public final a G() {
            String str = this.host;
            this.host = str != null ? new kotlin.text.r(ProtectedSandApp.s("ꉘ\u0001")).m(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i4 = 0; i4 < size; i4++) {
                List<String> list = this.encodedPathSegments;
                list.set(i4, Companion.f(v.INSTANCE, list.get(i4), 0, 0, ProtectedSandApp.s("ꉙ\u0001"), true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    String str2 = list2.get(i5);
                    list2.set(i5, str2 != null ? Companion.f(v.INSTANCE, str2, 0, 0, ProtectedSandApp.s("ꉚ\u0001"), true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.f(v.INSTANCE, str3, 0, 0, ProtectedSandApp.s("ꉛ\u0001"), true, true, false, true, null, 163, null) : null;
            return this;
        }

        @fg.l
        public final a I(@fg.l String encodedName) {
            l0.p(encodedName, ProtectedSandApp.s("ꉜ\u0001"));
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            H(Companion.f(v.INSTANCE, encodedName, 0, 0, ProtectedSandApp.s("ꉝ\u0001"), true, false, true, false, null, 211, null));
            return this;
        }

        @fg.l
        public final a J(@fg.l String name) {
            l0.p(name, ProtectedSandApp.s("ꉞ\u0001"));
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            H(Companion.f(v.INSTANCE, name, 0, 0, ProtectedSandApp.s("ꉟ\u0001"), false, false, true, false, null, 219, null));
            return this;
        }

        @fg.l
        public final a K(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        @fg.l
        public final a M(@fg.l String scheme) {
            l0.p(scheme, ProtectedSandApp.s("ꉠ\u0001"));
            String s4 = ProtectedSandApp.s("ꉋ\u0001");
            if (kotlin.text.v.K1(scheme, s4, true)) {
                this.scheme = s4;
            } else {
                String s5 = ProtectedSandApp.s("ꉉ\u0001");
                if (!kotlin.text.v.K1(scheme, s5, true)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꉡ\u0001"), scheme));
                }
                this.scheme = s5;
            }
            return this;
        }

        public final void N(@fg.m String str) {
            this.encodedFragment = str;
        }

        public final void O(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("ꉢ\u0001"));
            this.encodedPassword = str;
        }

        @fg.l
        public final a P(int index, @fg.l String encodedPathSegment) {
            l0.p(encodedPathSegment, ProtectedSandApp.s("ꉣ\u0001"));
            String f4 = Companion.f(v.INSTANCE, encodedPathSegment, 0, 0, ProtectedSandApp.s("ꈾ\u0001"), true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(index, f4);
            if ((y(f4) || z(f4)) ? false : true) {
                return this;
            }
            throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꉤ\u0001"), encodedPathSegment).toString());
        }

        public final void Q(@fg.m List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @fg.l
        public final a R(@fg.l String encodedName, @fg.m String encodedValue) {
            l0.p(encodedName, ProtectedSandApp.s("ꉜ\u0001"));
            I(encodedName);
            c(encodedName, encodedValue);
            return this;
        }

        public final void S(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("ꉢ\u0001"));
            this.encodedUsername = str;
        }

        public final void T(@fg.m String str) {
            this.host = str;
        }

        @fg.l
        public final a U(int index, @fg.l String pathSegment) {
            l0.p(pathSegment, ProtectedSandApp.s("ꉥ\u0001"));
            String f4 = Companion.f(v.INSTANCE, pathSegment, 0, 0, ProtectedSandApp.s("ꈾ\u0001"), false, false, false, false, null, 251, null);
            if (!((y(f4) || z(f4)) ? false : true)) {
                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꉤ\u0001"), pathSegment).toString());
            }
            this.encodedPathSegments.set(index, f4);
            return this;
        }

        public final void V(int i4) {
            this.port = i4;
        }

        @fg.l
        public final a W(@fg.l String name, @fg.m String value) {
            l0.p(name, ProtectedSandApp.s("ꉞ\u0001"));
            J(name);
            g(name, value);
            return this;
        }

        public final void X(@fg.m String str) {
            this.scheme = str;
        }

        @fg.l
        public final a Y(@fg.l String username) {
            l0.p(username, ProtectedSandApp.s("ꉦ\u0001"));
            this.encodedUsername = Companion.f(v.INSTANCE, username, 0, 0, ProtectedSandApp.s("ꉐ\u0001"), false, false, false, false, null, 251, null);
            return this;
        }

        @fg.l
        public final a a(@fg.l String encodedPathSegment) {
            l0.p(encodedPathSegment, ProtectedSandApp.s("ꉣ\u0001"));
            E(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @fg.l
        public final a b(@fg.l String encodedPathSegments) {
            l0.p(encodedPathSegments, ProtectedSandApp.s("ꉧ\u0001"));
            return f(encodedPathSegments, true);
        }

        @fg.l
        public final a c(@fg.l String encodedName, @fg.m String encodedValue) {
            l0.p(encodedName, ProtectedSandApp.s("ꉜ\u0001"));
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l0.m(list);
            Companion companion = v.INSTANCE;
            list.add(Companion.f(companion, encodedName, 0, 0, ProtectedSandApp.s("ꉝ\u0001"), true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            l0.m(list2);
            list2.add(encodedValue != null ? Companion.f(companion, encodedValue, 0, 0, ProtectedSandApp.s("ꉝ\u0001"), true, false, true, false, null, 211, null) : null);
            return this;
        }

        @fg.l
        public final a d(@fg.l String pathSegment) {
            l0.p(pathSegment, ProtectedSandApp.s("ꉥ\u0001"));
            E(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @fg.l
        public final a e(@fg.l String pathSegments) {
            l0.p(pathSegments, ProtectedSandApp.s("ꉨ\u0001"));
            return f(pathSegments, false);
        }

        @fg.l
        public final a g(@fg.l String name, @fg.m String value) {
            l0.p(name, ProtectedSandApp.s("ꉞ\u0001"));
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l0.m(list);
            Companion companion = v.INSTANCE;
            list.add(Companion.f(companion, name, 0, 0, ProtectedSandApp.s("ꉟ\u0001"), false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            l0.m(list2);
            list2.add(value != null ? Companion.f(companion, value, 0, 0, ProtectedSandApp.s("ꉟ\u0001"), false, false, true, false, null, 219, null) : null);
            return this;
        }

        @fg.l
        public final v h() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException(ProtectedSandApp.s("ꉪ\u0001"));
            }
            Companion companion = v.INSTANCE;
            String n4 = Companion.n(companion, this.encodedUsername, 0, 0, false, 7, null);
            String n5 = Companion.n(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException(ProtectedSandApp.s("ꉩ\u0001"));
            }
            int i4 = i();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.w.b0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.n(v.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                List<String> list3 = list2;
                arrayList = new ArrayList(kotlin.collections.w.b0(list3, 10));
                for (String str3 : list3) {
                    arrayList.add(str3 != null ? Companion.n(v.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new v(str, n4, n5, str2, i4, arrayList2, arrayList, str4 != null ? Companion.n(v.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        @fg.l
        public final a j(@fg.m String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? Companion.f(v.INSTANCE, encodedFragment, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @fg.l
        public final a k(@fg.l String encodedPassword) {
            l0.p(encodedPassword, ProtectedSandApp.s("ꉫ\u0001"));
            this.encodedPassword = Companion.f(v.INSTANCE, encodedPassword, 0, 0, ProtectedSandApp.s("ꉐ\u0001"), true, false, false, false, null, 243, null);
            return this;
        }

        @fg.l
        public final a l(@fg.l String encodedPath) {
            l0.p(encodedPath, ProtectedSandApp.s("ꉬ\u0001"));
            if (!kotlin.text.v.s2(encodedPath, ProtectedSandApp.s("ꉭ\u0001"), false, 2, null)) {
                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꉮ\u0001"), encodedPath).toString());
            }
            L(encodedPath, 0, encodedPath.length());
            return this;
        }

        @fg.l
        public final a m(@fg.m String encodedQuery) {
            List<String> list;
            if (encodedQuery != null) {
                Companion companion = v.INSTANCE;
                String f4 = Companion.f(companion, encodedQuery, 0, 0, ProtectedSandApp.s("ꉓ\u0001"), true, false, true, false, null, 211, null);
                if (f4 != null) {
                    list = companion.p(f4);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        @fg.l
        public final a n(@fg.l String encodedUsername) {
            l0.p(encodedUsername, ProtectedSandApp.s("ꉯ\u0001"));
            this.encodedUsername = Companion.f(v.INSTANCE, encodedUsername, 0, 0, ProtectedSandApp.s("ꉐ\u0001"), true, false, false, false, null, 243, null);
            return this;
        }

        @fg.l
        public final a o(@fg.m String fragment) {
            this.encodedFragment = fragment != null ? Companion.f(v.INSTANCE, fragment, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @fg.m
        /* renamed from: p, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        @fg.l
        /* renamed from: q, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        @fg.l
        public final List<String> r() {
            return this.encodedPathSegments;
        }

        @fg.m
        public final List<String> s() {
            return this.encodedQueryNamesAndValues;
        }

        @fg.l
        /* renamed from: t, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
        
            if (r1 != r4.g(r3)) goto L29;
         */
        @fg.l
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
                if (r1 == 0) goto L17
                r0.append(r1)
                java.lang.String r1 = "ꉰ\u0001"
                java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                r0.append(r1)
                goto L21
            L17:
                java.lang.String r1 = "ꉱ\u0001"
                java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                r0.append(r1)
            L21:
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L2c
                goto L34
            L2c:
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L4e
            L34:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L49
                r0.append(r2)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L49:
                r1 = 64
                r0.append(r1)
            L4e:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L73
                kotlin.jvm.internal.l0.m(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.v.S2(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L6e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L73
            L6e:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L73:
                int r1 = r6.port
                r3 = -1
                if (r1 != r3) goto L7c
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L95
            L7c:
                int r1 = r6.i()
                java.lang.String r3 = r6.scheme
                if (r3 == 0) goto L8f
                okhttp3.v$b r4 = okhttp3.v.INSTANCE
                kotlin.jvm.internal.l0.m(r3)
                int r3 = r4.g(r3)
                if (r1 == r3) goto L95
            L8f:
                r0.append(r2)
                r0.append(r1)
            L95:
                okhttp3.v$b r1 = okhttp3.v.INSTANCE
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.o(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto Lad
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                kotlin.jvm.internal.l0.m(r2)
                r1.q(r2, r0)
            Lad:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto Lbb
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            Lbb:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "ꉲ\u0001"
                java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                kotlin.jvm.internal.l0.o(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.v.a.toString():java.lang.String");
        }

        @fg.m
        /* renamed from: u, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* renamed from: v, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        @fg.m
        /* renamed from: w, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        @fg.l
        public final a x(@fg.l String host) {
            l0.p(host, ProtectedSandApp.s("ꉳ\u0001"));
            String e4 = okhttp3.internal.a.e(Companion.n(v.INSTANCE, host, 0, 0, false, 7, null));
            if (e4 == null) {
                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ꉴ\u0001"), host));
            }
            this.host = e4;
            return this;
        }
    }

    /* compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u0018\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b#\u0010\"J\u001b\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050$*\u00020\u0005H\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'*\u00020\u0005H\u0007¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u0004\u0018\u00010'*\u00020\u0005H\u0007¢\u0006\u0004\b*\u0010)J\u0015\u0010,\u001a\u0004\u0018\u00010'*\u00020+H\u0007¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\u0004\u0018\u00010'*\u00020.H\u0007¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020'2\u0006\u00101\u001a\u00020\u0005H\u0007¢\u0006\u0004\b2\u0010)J\u0019\u00103\u001a\u0004\u0018\u00010'2\u0006\u00101\u001a\u00020\u0005H\u0007¢\u0006\u0004\b3\u0010)J\u0019\u00104\u001a\u0004\u0018\u00010'2\u0006\u00101\u001a\u00020+H\u0007¢\u0006\u0004\b4\u0010-J\u0019\u00106\u001a\u0004\u0018\u00010'2\u0006\u00105\u001a\u00020.H\u0007¢\u0006\u0004\b6\u00100J1\u00107\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b7\u00108Jc\u00109\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010<R\u0014\u0010C\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010<R\u0014\u0010D\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u0010<R\u0014\u0010E\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010<R\u0014\u0010F\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010<R\u0014\u0010G\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010<R\u0014\u0010H\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010<R\u0014\u0010I\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010<¨\u0006J"}, d2 = {"Lokhttp3/v$b;", "", "<init>", "()V", "Lokio/m;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lkotlin/k2;", "s", "(Lokio/m;Ljava/lang/String;IIZ)V", "k", "(Ljava/lang/String;II)Z", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "r", "(Lokio/m;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "scheme", "g", "(Ljava/lang/String;)I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "o", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "q", "", "p", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/v;", "h", "(Ljava/lang/String;)Lokhttp3/v;", "l", "Ljava/net/URL;", "j", "(Ljava/net/URL;)Lokhttp3/v;", "Ljava/net/URI;", "i", "(Ljava/net/URI;)Lokhttp3/v;", "url", "a", "d", "c", "uri", "b", "m", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "e", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.v$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ String f(Companion companion, String str, int i4, int i5, String str2, boolean z4, boolean z5, boolean z6, boolean z7, Charset charset, int i6, Object obj) {
            return companion.e(str, (i6 & 1) != 0 ? 0 : i4, (i6 & 2) != 0 ? str.length() : i5, str2, (i6 & 8) != 0 ? false : z4, (i6 & 16) != 0 ? false : z5, (i6 & 32) != 0 ? false : z6, (i6 & 64) != 0 ? false : z7, (i6 & 128) != 0 ? null : charset);
        }

        private final boolean k(String str, int i4, int i5) {
            int i6 = i4 + 2;
            return i6 < i5 && str.charAt(i4) == '%' && okhttp3.internal.d.N(str.charAt(i4 + 1)) != -1 && okhttp3.internal.d.N(str.charAt(i6)) != -1;
        }

        public static /* synthetic */ String n(Companion companion, String str, int i4, int i5, boolean z4, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i4 = 0;
            }
            if ((i6 & 2) != 0) {
                i5 = str.length();
            }
            if ((i6 & 4) != 0) {
                z4 = false;
            }
            return companion.m(str, i4, i5, z4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
        
            if (k(r16, r5, r18) == false) goto L44;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void r(okio.m r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.v.Companion.r(okio.m, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void s(okio.m mVar, String str, int i4, int i5, boolean z4) {
            int i6;
            while (i4 < i5) {
                if (str == null) {
                    throw new NullPointerException(ProtectedSandApp.s("ꉷ\u0001"));
                }
                int codePointAt = str.codePointAt(i4);
                if (codePointAt != 37 || (i6 = i4 + 2) >= i5) {
                    if (codePointAt == 43 && z4) {
                        mVar.writeByte(32);
                        i4++;
                    }
                    mVar.f0(codePointAt);
                    i4 += Character.charCount(codePointAt);
                } else {
                    int N = okhttp3.internal.d.N(str.charAt(i4 + 1));
                    int N2 = okhttp3.internal.d.N(str.charAt(i6));
                    if (N != -1 && N2 != -1) {
                        mVar.writeByte((N << 4) + N2);
                        i4 = Character.charCount(codePointAt) + i6;
                    }
                    mVar.f0(codePointAt);
                    i4 += Character.charCount(codePointAt);
                }
            }
        }

        @fg.l
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @kd.i(name = "-deprecated_get")
        public final v a(@fg.l String url) {
            l0.p(url, ProtectedSandApp.s("ꉸ\u0001"));
            return h(url);
        }

        @fg.m
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @kd.i(name = "-deprecated_get")
        public final v b(@fg.l URI uri) {
            l0.p(uri, ProtectedSandApp.s("ꉹ\u0001"));
            return i(uri);
        }

        @fg.m
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @kd.i(name = "-deprecated_get")
        public final v c(@fg.l URL url) {
            l0.p(url, ProtectedSandApp.s("ꉸ\u0001"));
            return j(url);
        }

        @fg.m
        @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @x0(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @kd.i(name = "-deprecated_parse")
        public final v d(@fg.l String url) {
            l0.p(url, ProtectedSandApp.s("ꉸ\u0001"));
            return l(url);
        }

        @fg.l
        public final String e(@fg.l String str, int i4, int i5, @fg.l String str2, boolean z4, boolean z5, boolean z6, boolean z7, @fg.m Charset charset) {
            l0.p(str, ProtectedSandApp.s("ꉺ\u0001"));
            l0.p(str2, ProtectedSandApp.s("ꉻ\u0001"));
            int i6 = i4;
            while (i6 < i5) {
                int codePointAt = str.codePointAt(i6);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z7) && !kotlin.text.v.S2(str2, (char) codePointAt, false, 2, null))) {
                    if (codePointAt == 37) {
                        if (z4) {
                            if (z5) {
                                if (!k(str, i6, i5)) {
                                    okio.m mVar = new okio.m();
                                    mVar.a1(str, i4, i6);
                                    r(mVar, str, i6, i5, str2, z4, z5, z6, z7, charset);
                                    return mVar.n3();
                                }
                                if (codePointAt != 43 && z6) {
                                    okio.m mVar2 = new okio.m();
                                    mVar2.a1(str, i4, i6);
                                    r(mVar2, str, i6, i5, str2, z4, z5, z6, z7, charset);
                                    return mVar2.n3();
                                }
                                i6 += Character.charCount(codePointAt);
                            }
                        }
                    }
                    if (codePointAt != 43) {
                    }
                    i6 += Character.charCount(codePointAt);
                }
                okio.m mVar22 = new okio.m();
                mVar22.a1(str, i4, i6);
                r(mVar22, str, i6, i5, str2, z4, z5, z6, z7, charset);
                return mVar22.n3();
            }
            String substring = str.substring(i4, i5);
            l0.o(substring, ProtectedSandApp.s("ꉼ\u0001"));
            return substring;
        }

        @kd.n
        public final int g(@fg.l String scheme) {
            l0.p(scheme, ProtectedSandApp.s("ꉽ\u0001"));
            int hashCode = scheme.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals(ProtectedSandApp.s("ꉾ\u0001"))) {
                    return org.java_websocket_new.d.F2;
                }
            } else if (scheme.equals(ProtectedSandApp.s("ꉿ\u0001"))) {
                return 80;
            }
            return -1;
        }

        @fg.l
        @kd.n
        @kd.i(name = "get")
        public final v h(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("ꊀ\u0001"));
            return new a().A(null, str).h();
        }

        @fg.m
        @kd.n
        @kd.i(name = "get")
        public final v i(@fg.l URI uri) {
            l0.p(uri, ProtectedSandApp.s("ꊁ\u0001"));
            String uri2 = uri.toString();
            l0.o(uri2, ProtectedSandApp.s("ꊂ\u0001"));
            return l(uri2);
        }

        @fg.m
        @kd.n
        @kd.i(name = "get")
        public final v j(@fg.l URL url) {
            l0.p(url, ProtectedSandApp.s("ꊁ\u0001"));
            String url2 = url.toString();
            l0.o(url2, ProtectedSandApp.s("ꊂ\u0001"));
            return l(url2);
        }

        @fg.m
        @kd.n
        @kd.i(name = "parse")
        public final v l(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("ꊁ\u0001"));
            try {
                return h(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @fg.l
        public final String m(@fg.l String str, int i4, int i5, boolean z4) {
            l0.p(str, ProtectedSandApp.s("ꊃ\u0001"));
            for (int i6 = i4; i6 < i5; i6++) {
                char charAt = str.charAt(i6);
                if (charAt == '%' || (charAt == '+' && z4)) {
                    okio.m mVar = new okio.m();
                    mVar.a1(str, i4, i6);
                    s(mVar, str, i6, i5, z4);
                    return mVar.n3();
                }
            }
            String substring = str.substring(i4, i5);
            l0.o(substring, ProtectedSandApp.s("ꉼ\u0001"));
            return substring;
        }

        public final void o(@fg.l List<String> list, @fg.l StringBuilder sb) {
            l0.p(list, ProtectedSandApp.s("ꊄ\u0001"));
            l0.p(sb, ProtectedSandApp.s("ꊅ\u0001"));
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                sb.append('/');
                sb.append(list.get(i4));
            }
        }

        @fg.l
        public final List<String> p(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("ꊆ\u0001"));
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 <= str.length()) {
                int o32 = kotlin.text.v.o3(str, m0.amp, i4, false, 4, null);
                if (o32 == -1) {
                    o32 = str.length();
                }
                int i5 = o32;
                int o33 = kotlin.text.v.o3(str, '=', i4, false, 4, null);
                String s4 = ProtectedSandApp.s("ꉼ\u0001");
                if (o33 == -1 || o33 > i5) {
                    String substring = str.substring(i4, i5);
                    l0.o(substring, s4);
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str.substring(i4, o33);
                    l0.o(substring2, s4);
                    arrayList.add(substring2);
                    String substring3 = str.substring(o33 + 1, i5);
                    l0.o(substring3, s4);
                    arrayList.add(substring3);
                }
                i4 = i5 + 1;
            }
            return arrayList;
        }

        public final void q(@fg.l List<String> list, @fg.l StringBuilder sb) {
            l0.p(list, ProtectedSandApp.s("ꊇ\u0001"));
            l0.p(sb, ProtectedSandApp.s("ꊅ\u0001"));
            kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, list.size()), 2);
            int first = B1.getFirst();
            int last = B1.getLast();
            int step = B1.getStep();
            if (step >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    sb.append(m0.amp);
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }
    }

    public v(@fg.l String str, @fg.l String str2, @fg.l String str3, @fg.l String str4, int i4, @fg.l List<String> list, @fg.m List<String> list2, @fg.m String str5, @fg.l String str6) {
        l0.p(str, ProtectedSandApp.s("ꊑ\u0001"));
        l0.p(str2, ProtectedSandApp.s("ꊒ\u0001"));
        l0.p(str3, ProtectedSandApp.s("ꊓ\u0001"));
        l0.p(str4, ProtectedSandApp.s("ꊔ\u0001"));
        l0.p(list, ProtectedSandApp.s("ꊕ\u0001"));
        l0.p(str6, ProtectedSandApp.s("ꊖ\u0001"));
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i4;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = l0.g(str, ProtectedSandApp.s("ꊗ\u0001"));
    }

    @fg.l
    @kd.n
    @kd.i(name = "get")
    public static final v C(@fg.l String str) {
        return INSTANCE.h(str);
    }

    @fg.m
    @kd.n
    @kd.i(name = "get")
    public static final v D(@fg.l URI uri) {
        return INSTANCE.i(uri);
    }

    @fg.m
    @kd.n
    @kd.i(name = "get")
    public static final v E(@fg.l URL url) {
        return INSTANCE.j(url);
    }

    @fg.m
    @kd.n
    @kd.i(name = "parse")
    public static final v J(@fg.l String str) {
        return INSTANCE.l(str);
    }

    @kd.n
    public static final int u(@fg.l String str) {
        return INSTANCE.g(str);
    }

    @fg.l
    @kd.i(name = "encodedUsername")
    public final String A() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int q4 = okhttp3.internal.d.q(str, ProtectedSandApp.s("ꊘ\u0001"), length, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("ꊚ\u0001"));
        }
        String substring = str2.substring(length, q4);
        l0.o(substring, ProtectedSandApp.s("ꊙ\u0001"));
        return substring;
    }

    @fg.m
    @kd.i(name = "fragment")
    /* renamed from: B, reason: from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @fg.l
    @kd.i(name = "host")
    /* renamed from: F, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* renamed from: G, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    @fg.l
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

    @fg.m
    public final a I(@fg.l String link) {
        l0.p(link, ProtectedSandApp.s("ꊛ\u0001"));
        try {
            return new a().A(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @fg.l
    @kd.i(name = "password")
    /* renamed from: K, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @fg.l
    @kd.i(name = "pathSegments")
    public final List<String> L() {
        return this.pathSegments;
    }

    @kd.i(name = "pathSize")
    public final int M() {
        return this.pathSegments.size();
    }

    @kd.i(name = "port")
    /* renamed from: N, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    @fg.m
    @kd.i(name = "query")
    public final String O() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        INSTANCE.q(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    @fg.m
    public final String P(@fg.l String name) {
        l0.p(name, ProtectedSandApp.s("ꊜ\u0001"));
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, list.size()), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if (step < 0 ? first >= last : first <= last) {
            while (!l0.g(name, this.queryNamesAndValues.get(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return this.queryNamesAndValues.get(first + 1);
        }
        return null;
    }

    @fg.l
    public final String Q(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(index * 2);
        l0.m(str);
        return str;
    }

    @fg.l
    @kd.i(name = "queryParameterNames")
    public final Set<String> R() {
        if (this.queryNamesAndValues == null) {
            return kotlin.collections.l0.f74939b;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, this.queryNamesAndValues.size()), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if (step < 0 ? first >= last : first <= last) {
            while (true) {
                String str = this.queryNamesAndValues.get(first);
                l0.m(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        l0.o(unmodifiableSet, ProtectedSandApp.s("ꊝ\u0001"));
        return unmodifiableSet;
    }

    @fg.m
    public final String S(int index) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @fg.l
    public final List<String> T(@fg.l String name) {
        l0.p(name, ProtectedSandApp.s("ꊜ\u0001"));
        if (this.queryNamesAndValues == null) {
            return kotlin.collections.j0.f74919b;
        }
        ArrayList arrayList = new ArrayList();
        kotlin.ranges.j B1 = kotlin.ranges.s.B1(kotlin.ranges.s.W1(0, this.queryNamesAndValues.size()), 2);
        int first = B1.getFirst();
        int last = B1.getLast();
        int step = B1.getStep();
        if (step < 0 ? first >= last : first <= last) {
            while (true) {
                if (l0.g(name, this.queryNamesAndValues.get(first))) {
                    arrayList.add(this.queryNamesAndValues.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        l0.o(unmodifiableList, ProtectedSandApp.s("ꊞ\u0001"));
        return unmodifiableList;
    }

    @kd.i(name = "querySize")
    public final int U() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @fg.l
    public final String V() {
        a I = I(ProtectedSandApp.s("ꊟ\u0001"));
        l0.m(I);
        return I.Y("").B("").h().url;
    }

    @fg.m
    public final v W(@fg.l String link) {
        l0.p(link, ProtectedSandApp.s("ꊛ\u0001"));
        a I = I(link);
        if (I != null) {
            return I.h();
        }
        return null;
    }

    @fg.l
    @kd.i(name = "scheme")
    /* renamed from: X, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @fg.m
    public final String Y() {
        if (okhttp3.internal.d.h(this.host)) {
            return null;
        }
        PublicSuffixDatabase.INSTANCE.getClass();
        return PublicSuffixDatabase.f84872i.e(this.host);
    }

    @fg.l
    @kd.i(name = "uri")
    public final URI Z() {
        String aVar = H().G().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e4) {
            try {
                URI create = URI.create(new kotlin.text.r(ProtectedSandApp.s("ꊠ\u0001")).m(aVar, ""));
                l0.o(create, ProtectedSandApp.s("ꊡ\u0001"));
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e4);
            }
        }
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "encodedFragment", imports = {}))
    @kd.i(name = "-deprecated_encodedFragment")
    public final String a() {
        return v();
    }

    @fg.l
    @kd.i(name = "url")
    public final URL a0() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e4) {
            throw new RuntimeException(e4);
        }
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "encodedPassword", imports = {}))
    @kd.i(name = "-deprecated_encodedPassword")
    public final String b() {
        return w();
    }

    @fg.l
    @kd.i(name = "username")
    /* renamed from: b0, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "encodedPath", imports = {}))
    @kd.i(name = "-deprecated_encodedPath")
    public final String c() {
        return x();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "encodedPathSegments", imports = {}))
    @kd.i(name = "-deprecated_encodedPathSegments")
    public final List<String> d() {
        return y();
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "encodedQuery", imports = {}))
    @kd.i(name = "-deprecated_encodedQuery")
    public final String e() {
        return z();
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof v) && l0.g(((v) other).url, this.url);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "encodedUsername", imports = {}))
    @kd.i(name = "-deprecated_encodedUsername")
    public final String f() {
        return A();
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "fragment", imports = {}))
    @kd.i(name = "-deprecated_fragment")
    public final String g() {
        return this.fragment;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "host", imports = {}))
    @kd.i(name = "-deprecated_host")
    public final String h() {
        return this.host;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "password", imports = {}))
    @kd.i(name = "-deprecated_password")
    public final String i() {
        return this.password;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "pathSegments", imports = {}))
    @kd.i(name = "-deprecated_pathSegments")
    public final List<String> j() {
        return this.pathSegments;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "pathSize", imports = {}))
    @kd.i(name = "-deprecated_pathSize")
    public final int k() {
        return this.pathSegments.size();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "port", imports = {}))
    @kd.i(name = "-deprecated_port")
    public final int l() {
        return this.port;
    }

    @fg.m
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "query", imports = {}))
    @kd.i(name = "-deprecated_query")
    public final String m() {
        return O();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "queryParameterNames", imports = {}))
    @kd.i(name = "-deprecated_queryParameterNames")
    public final Set<String> n() {
        return R();
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "querySize", imports = {}))
    @kd.i(name = "-deprecated_querySize")
    public final int o() {
        return U();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "scheme", imports = {}))
    @kd.i(name = "-deprecated_scheme")
    public final String p() {
        return this.scheme;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to toUri()", replaceWith = @x0(expression = "toUri()", imports = {}))
    @kd.i(name = "-deprecated_uri")
    public final URI q() {
        return Z();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to toUrl()", replaceWith = @x0(expression = "toUrl()", imports = {}))
    @kd.i(name = "-deprecated_url")
    public final URL r() {
        return a0();
    }

    @fg.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "username", imports = {}))
    @kd.i(name = "-deprecated_username")
    public final String s() {
        return this.username;
    }

    @fg.l
    /* renamed from: toString, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @fg.m
    @kd.i(name = "encodedFragment")
    public final String v() {
        if (this.fragment == null) {
            return null;
        }
        int o32 = kotlin.text.v.o3(this.url, '#', 0, false, 6, null) + 1;
        String str = this.url;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("ꊚ\u0001"));
        }
        String substring = str.substring(o32);
        l0.o(substring, ProtectedSandApp.s("ꊢ\u0001"));
        return substring;
    }

    @fg.l
    @kd.i(name = "encodedPassword")
    public final String w() {
        if (this.password.length() == 0) {
            return "";
        }
        int o32 = kotlin.text.v.o3(this.url, ':', this.scheme.length() + 3, false, 4, null) + 1;
        int o33 = kotlin.text.v.o3(this.url, '@', 0, false, 6, null);
        String str = this.url;
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("ꊚ\u0001"));
        }
        String substring = str.substring(o32, o33);
        l0.o(substring, ProtectedSandApp.s("ꊙ\u0001"));
        return substring;
    }

    @fg.l
    @kd.i(name = "encodedPath")
    public final String x() {
        int o32 = kotlin.text.v.o3(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int q4 = okhttp3.internal.d.q(str, ProtectedSandApp.s("ꊣ\u0001"), o32, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("ꊚ\u0001"));
        }
        String substring = str2.substring(o32, q4);
        l0.o(substring, ProtectedSandApp.s("ꊙ\u0001"));
        return substring;
    }

    @fg.l
    @kd.i(name = "encodedPathSegments")
    public final List<String> y() {
        int o32 = kotlin.text.v.o3(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int q4 = okhttp3.internal.d.q(str, ProtectedSandApp.s("ꊣ\u0001"), o32, str.length());
        ArrayList arrayList = new ArrayList();
        while (o32 < q4) {
            int i4 = o32 + 1;
            int p4 = okhttp3.internal.d.p(this.url, '/', i4, q4);
            String str2 = this.url;
            if (str2 == null) {
                throw new NullPointerException(ProtectedSandApp.s("ꊚ\u0001"));
            }
            String substring = str2.substring(i4, p4);
            l0.o(substring, ProtectedSandApp.s("ꊙ\u0001"));
            arrayList.add(substring);
            o32 = p4;
        }
        return arrayList;
    }

    @fg.m
    @kd.i(name = "encodedQuery")
    public final String z() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int o32 = kotlin.text.v.o3(this.url, '?', 0, false, 6, null) + 1;
        String str = this.url;
        int p4 = okhttp3.internal.d.p(str, '#', o32, str.length());
        String str2 = this.url;
        if (str2 == null) {
            throw new NullPointerException(ProtectedSandApp.s("ꊚ\u0001"));
        }
        String substring = str2.substring(o32, p4);
        l0.o(substring, ProtectedSandApp.s("ꊙ\u0001"));
        return substring;
    }
}
