package okhttp3.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.EmptyList;
import kotlin.collections.IntIterator;
import kotlin.collections.a0;
import kotlin.collections.b0;
import kotlin.collections.f1;
import kotlin.collections.j0;
import kotlin.collections.t;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u1;
import kotlin.m2;
import kotlin.ranges.IntRange;
import kotlin.ranges.u;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.h0;
import okhttp3.r;
import okhttp3.v;
import okhttp3.w;
import okio.d0;
import okio.m;
import okio.m0;
import okio.n;
import okio.o;
import okio.o0;
import okio.p;
import p3.f;
import p3.i;
import q3.l;

/* compiled from: Util.kt */
@i(name = "Util")
@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010&\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010'\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010(\u001a\u00020\b*\u00020\u0006\u001a)\u0010,\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0\f\"\u00020*¢\u0006\u0004\b,\u0010-\u001a\u0012\u00101\u001a\u00020/*\u00020.2\u0006\u00100\u001a\u00020/\u001a \u00105\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u000103\u001a\n\u00106\u001a\u00020\u0018*\u00020$\u001a\u0010\u0010:\u001a\u000209*\b\u0012\u0004\u0012\u00020807\u001a\u0010\u0010;\u001a\b\u0012\u0004\u0012\u00020807*\u000209\u001a\u0012\u0010<\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010?\u001a\u00020>*\u00020=\u001a\u0015\u0010B\u001a\u00020\u0018*\u00020@2\u0006\u0010A\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010D\u001a\u00020\u0018*\u00020C2\u0006\u0010A\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010E\u001a\u00020\u0000*\u00020\u00182\u0006\u0010A\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010H\u001a\u00020\u0004*\u00020F2\u0006\u0010G\u001a\u00020\u0018\u001a\n\u0010I\u001a\u00020\u0018*\u00020.\u001a\u001a\u0010L\u001a\u00020\b*\u00020J2\u0006\u00102\u001a\u00020\u00182\u0006\u0010K\u001a\u000203\u001a\u001a\u0010N\u001a\u00020\b*\u00020J2\u0006\u0010M\u001a\u00020\u00182\u0006\u0010K\u001a\u000203\u001a\n\u0010P\u001a\u00020\u0006*\u00020O\u001a\u0012\u0010R\u001a\u00020\b*\u00020O2\u0006\u0010Q\u001a\u00020.\u001a\u001a\u0010U\u001a\u00020\u00042\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00040SH\u0086\bø\u0001\u0000\u001a\"\u0010V\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00040SH\u0086\bø\u0001\u0000\u001a\u0012\u0010X\u001a\u00020\u0018*\u00020W2\u0006\u0010B\u001a\u00020@\u001a\u0014\u0010Y\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010[\u001a\u00020\u0000*\u00020Z\u001a\u0012\u0010]\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\\\u001a\u00020\u0000\u001a\u0014\u0010^\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010\\\u001a\u00020\u0018\u001a\u001c\u0010_\u001a\b\u0012\u0004\u0012\u00028\u000007\"\u0004\b\u0000\u0010L*\b\u0012\u0004\u0012\u00028\u000007\u001a/\u0010a\u001a\b\u0012\u0004\u0012\u00028\u000007\"\u0004\b\u0000\u0010L2\u0012\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\ba\u0010b\u001a.\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\"\u0004\b\u0000\u0010R\"\u0004\b\u0001\u0010V*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\u001a\n\u0010f\u001a\u00020\u0004*\u00020e\u001a\n\u0010g\u001a\u00020\u0004*\u00020O\u001a\n\u0010i\u001a\u00020\u0004*\u00020h\u001a\u0012\u0010m\u001a\u00020\b*\u00020j2\u0006\u0010l\u001a\u00020k\u001a\n\u0010n\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010o\u001a\u00020\u0006*\u00020\u0018\u001a\r\u0010p\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010q\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010r\u001a\u00020\u0004*\u00020*H\u0086\b\u001a3\u0010w\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010L2\u0006\u0010s\u001a\u00020*2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t2\u0006\u0010v\u001a\u00020\u0006¢\u0006\u0004\bw\u0010x\u001a'\u0010{\u001a\u00020\u0004\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000y2\u0006\u0010z\u001a\u00028\u0000H\u0000¢\u0006\u0004\b{\u0010|\u001a\r\u0010}\u001a\u00020\u0004*\u00020*H\u0080\b\u001a\r\u0010~\u001a\u00020\u0004*\u00020*H\u0080\b\u001a%\u0010\u0083\u0001\u001a\u00030\u0082\u0001*\u00070\u007fj\u0003`\u0080\u00012\u0012\u0010\u0081\u0001\u001a\r\u0012\t\u0012\u00070\u007fj\u0003`\u0080\u000107\u001a@\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00028\u000007\"\u0004\b\u0000\u0010L*\t\u0012\u0004\u0012\u00028\u00000\u0084\u00012\u001a\u0010\u0087\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0085\u0001¢\u0006\u0003\b\u0086\u0001H\u0086\bø\u0001\u0000\"\u0017\u0010\u008b\u0001\u001a\u00030\u0089\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b{\u0010\u008a\u0001\"\u0016\u0010\u008d\u0001\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bB\u0010\u008c\u0001\"\u0017\u0010\u0090\u0001\u001a\u00030\u008e\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bD\u0010\u008f\u0001\"\u0017\u0010\u0093\u0001\u001a\u00030\u0091\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bE\u0010\u0092\u0001\"\u0017\u0010\u0096\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010\u0095\u0001\"\u0017\u0010\u0099\u0001\u001a\u00030\u0097\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b~\u0010\u0098\u0001\"\u0017\u0010\u009c\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b}\u0010\u009b\u0001\"\u0015\u0010\u009d\u0001\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b(\u0010n\"\u0016\u0010\u009f\u0001\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b<\u0010\u009e\u0001\"\u0016\u0010 \u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0007\n\u0005\b5\u0010\u009e\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006¡\u0001"}, d2 = {"", "arrayLength", "offset", "count", "Lkotlin/m2;", "k", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "U", "", "other", "Ljava/util/Comparator;", "comparator", "I", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "w", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/w;", "includeDefaultPort", "a0", "value", "", "A", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "o", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "C", "E", "g0", "delimiters", "q", "", "delimiter", "p", "B", "h", "format", "", "args", "v", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/o;", "Ljava/nio/charset/Charset;", "default", "P", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "j", "N", "", "Lokhttp3/internal/http2/b;", "Lokhttp3/v;", "X", "W", "i", "Lokhttp3/r;", "Lokhttp3/r$c;", "e", "", "mask", "b", "", "c", "d", "Lokio/n;", "medium", "k0", "R", "Lokio/o0;", "timeUnit", "T", "timeout", "t", "Ljava/net/Socket;", "O", "source", "K", "Lkotlin/Function0;", "block", "y", "V", "Lokio/m;", "S", "G", "Lokhttp3/g0;", "x", "defaultValue", "e0", "f0", "c0", "elements", "z", "([Ljava/lang/Object;)Ljava/util/List;", "", "d0", "Ljava/io/Closeable;", "l", "n", "Ljava/net/ServerSocket;", "m", "Lokhttp3/internal/io/a;", "Ljava/io/File;", "file", "J", "Z", "Y", "i0", "L", "M", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "Q", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "", "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "g", "f", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "j0", "", "Lkotlin/Function1;", "Lkotlin/u;", "predicate", "u", "", "[B", "EMPTY_BYTE_ARRAY", "Lokhttp3/v;", "EMPTY_HEADERS", "Lokhttp3/h0;", "Lokhttp3/h0;", "EMPTY_RESPONSE", "Lokhttp3/f0;", "Lokhttp3/f0;", "EMPTY_REQUEST", "Lokio/d0;", "Lokio/d0;", "UNICODE_BOMS", "Ljava/util/TimeZone;", "Ljava/util/TimeZone;", "UTC", "Lkotlin/text/r;", "Lkotlin/text/r;", "VERIFY_AS_IP_ADDRESS", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "userAgent", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    @f
    public static final byte[] f30929a;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    @f
    public static final h0 f30931c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    @f
    public static final f0 f30932d;

    /* renamed from: e, reason: collision with root package name */
    private static final d0 f30933e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    @f
    public static final TimeZone f30934f;

    /* renamed from: g, reason: collision with root package name */
    private static final Regex f30935g;

    /* renamed from: h, reason: collision with root package name */
    @f
    public static final boolean f30936h;

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    @f
    public static final String f30937i;

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    public static final String f30938j = ProtectedSandApp.s("执");

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    @f
    public static final v f30930b = v.INSTANCE.j(new String[0]);

    /* compiled from: Util.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/e;", "it", "Lokhttp3/r;", "a", "(Lokhttp3/e;)Lokhttp3/r;"}, k = 3, mv = {1, 4, 0})
    static final class a implements r.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f30939a;

        a(r rVar) {
            this.f30939a = rVar;
        }

        @Override // okhttp3.r.c
        @d5.d
        public final r a(@d5.d e eVar) {
            l0.p(eVar, ProtectedSandApp.s("扦"));
            return this.f30939a;
        }
    }

    /* compiled from: Util.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "runnable", "Ljava/lang/Runnable;", "newThread"}, k = 3, mv = {1, 4, 0})
    static final class b implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30940a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30941b;

        b(String str, boolean z5) {
            this.f30940a = str;
            this.f30941b = z5;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f30940a);
            thread.setDaemon(this.f30941b);
            return thread;
        }
    }

    static {
        String a42;
        String g42;
        byte[] bArr = new byte[0];
        f30929a = bArr;
        f30931c = h0.Companion.l(h0.INSTANCE, bArr, null, 1, null);
        f30932d = f0.Companion.r(f0.INSTANCE, bArr, null, 0, 0, 7, null);
        d0.Companion companion = d0.INSTANCE;
        p.Companion companion2 = p.INSTANCE;
        f30933e = companion.d(companion2.i(ProtectedSandApp.s("扨")), companion2.i(ProtectedSandApp.s("扩")), companion2.i(ProtectedSandApp.s("扪")), companion2.i(ProtectedSandApp.s("扫")), companion2.i(ProtectedSandApp.s("扬")));
        TimeZone timeZone = TimeZone.getTimeZone(ProtectedSandApp.s("扭"));
        l0.m(timeZone);
        f30934f = timeZone;
        f30935g = new Regex(ProtectedSandApp.s("扮"));
        f30936h = false;
        String name = c0.class.getName();
        l0.o(name, ProtectedSandApp.s("扯"));
        a42 = kotlin.text.h0.a4(name, ProtectedSandApp.s("扰"));
        g42 = kotlin.text.h0.g4(a42, ProtectedSandApp.s("扱"));
        f30937i = g42;
    }

    public static final int A(@d5.d String[] strArr, @d5.d String str, @d5.d Comparator<String> comparator) {
        l0.p(strArr, ProtectedSandApp.s("扲"));
        l0.p(str, ProtectedSandApp.s("扳"));
        l0.p(comparator, ProtectedSandApp.s("扴"));
        int length = strArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (comparator.compare(strArr[i5], str) == 0) {
                return i5;
            }
        }
        return -1;
    }

    public static final int B(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("扵"));
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (l0.t(charAt, 31) <= 0 || l0.t(charAt, 127) >= 0) {
                return i5;
            }
        }
        return -1;
    }

    public static final int C(@d5.d String str, int i5, int i6) {
        l0.p(str, ProtectedSandApp.s("扶"));
        while (i5 < i6) {
            char charAt = str.charAt(i5);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    public static /* synthetic */ int D(String str, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        return C(str, i5, i6);
    }

    public static final int E(@d5.d String str, int i5, int i6) {
        l0.p(str, ProtectedSandApp.s("扷"));
        int i7 = i6 - 1;
        if (i7 >= i5) {
            while (true) {
                char charAt = str.charAt(i7);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i7 + 1;
                }
                if (i7 == i5) {
                    break;
                }
                i7--;
            }
        }
        return i5;
    }

    public static /* synthetic */ int F(String str, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        return E(str, i5, i6);
    }

    public static final int G(@d5.d String str, int i5) {
        l0.p(str, ProtectedSandApp.s("扸"));
        int length = str.length();
        while (i5 < length) {
            char charAt = str.charAt(i5);
            if (charAt != ' ' && charAt != '\t') {
                return i5;
            }
            i5++;
        }
        return str.length();
    }

    public static /* synthetic */ int H(String str, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        return G(str, i5);
    }

    @d5.d
    public static final String[] I(@d5.d String[] strArr, @d5.d String[] strArr2, @d5.d Comparator<? super String> comparator) {
        l0.p(strArr, ProtectedSandApp.s("批"));
        l0.p(strArr2, ProtectedSandApp.s("扺"));
        l0.p(comparator, ProtectedSandApp.s("扻"));
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i5]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i5++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException(ProtectedSandApp.s("扼"));
    }

    public static final boolean J(@d5.d okhttp3.internal.io.a aVar, @d5.d File file) {
        l0.p(aVar, ProtectedSandApp.s("扽"));
        l0.p(file, ProtectedSandApp.s("找"));
        m0 b6 = aVar.b(file);
        try {
            try {
                aVar.f(file);
                kotlin.io.b.a(b6, null);
                return true;
            } catch (IOException unused) {
                m2 m2Var = m2.f23662a;
                kotlin.io.b.a(b6, null);
                aVar.f(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean K(@d5.d Socket socket, @d5.d o oVar) {
        l0.p(socket, ProtectedSandApp.s("承"));
        l0.p(oVar, ProtectedSandApp.s("技"));
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z5 = !oVar.M();
                socket.setSoTimeout(soTimeout);
                return z5;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final void L(@d5.d Object obj) {
        l0.p(obj, ProtectedSandApp.s("抁"));
        obj.notify();
    }

    public static final void M(@d5.d Object obj) {
        l0.p(obj, ProtectedSandApp.s("抂"));
        obj.notifyAll();
    }

    public static final int N(char c6) {
        if ('0' <= c6 && '9' >= c6) {
            return c6 - '0';
        }
        char c7 = 'a';
        if ('a' > c6 || 'f' < c6) {
            c7 = 'A';
            if ('A' > c6 || 'F' < c6) {
                return -1;
            }
        }
        return (c6 - c7) + 10;
    }

    @d5.d
    public static final String O(@d5.d Socket socket) {
        l0.p(socket, ProtectedSandApp.s("抃"));
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        l0.o(hostName, ProtectedSandApp.s("抄"));
        return hostName;
    }

    @d5.d
    public static final Charset P(@d5.d o oVar, @d5.d Charset charset) throws IOException {
        l0.p(oVar, ProtectedSandApp.s("抅"));
        l0.p(charset, ProtectedSandApp.s("抆"));
        int r12 = oVar.r1(f30933e);
        if (r12 == -1) {
            return charset;
        }
        if (r12 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            l0.o(charset2, ProtectedSandApp.s("抉"));
            return charset2;
        }
        if (r12 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            l0.o(charset3, ProtectedSandApp.s("抈"));
            return charset3;
        }
        if (r12 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            l0.o(charset4, ProtectedSandApp.s("抇"));
            return charset4;
        }
        if (r12 == 3) {
            return Charsets.f27048a.b();
        }
        if (r12 == 4) {
            return Charsets.f27048a.c();
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        return r4;
     */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T Q(@d5.d java.lang.Object r5, @d5.d java.lang.Class<T> r6, @d5.d java.lang.String r7) {
        /*
            java.lang.String r0 = "把"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r5, r0)
            java.lang.String r0 = "抋"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r6, r0)
            java.lang.String r0 = "抌"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.Class r0 = r5.getClass()
        L1f:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r2 = kotlin.jvm.internal.l0.g(r0, r1)
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            if (r2 == 0) goto L58
            java.lang.reflect.Field r1 = r0.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L4a
            java.lang.String r2 = "抍"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)     // Catch: java.lang.NoSuchFieldException -> L4a
            kotlin.jvm.internal.l0.o(r1, r2)     // Catch: java.lang.NoSuchFieldException -> L4a
            r1.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L4a
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.NoSuchFieldException -> L4a
            boolean r2 = r6.isInstance(r1)     // Catch: java.lang.NoSuchFieldException -> L4a
            if (r2 != 0) goto L45
            goto L49
        L45:
            java.lang.Object r4 = r6.cast(r1)     // Catch: java.lang.NoSuchFieldException -> L4a
        L49:
            return r4
        L4a:
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.String r1 = "抎"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            goto L1f
        L58:
            java.lang.String r0 = "抏"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            boolean r2 = kotlin.jvm.internal.l0.g(r7, r0)
            r2 = r2 ^ r3
            if (r2 == 0) goto L70
            java.lang.Object r5 = Q(r5, r1, r0)
            if (r5 == 0) goto L70
            java.lang.Object r5 = Q(r5, r6, r7)
            return r5
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.d.Q(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }

    public static final int R(@d5.d o oVar) throws IOException {
        l0.p(oVar, ProtectedSandApp.s("抐"));
        return (oVar.readByte() & UByte.f27220r) | ((oVar.readByte() & UByte.f27220r) << 16) | ((oVar.readByte() & UByte.f27220r) << 8);
    }

    public static final int S(@d5.d m mVar, byte b6) {
        l0.p(mVar, ProtectedSandApp.s("抑"));
        int i5 = 0;
        while (!mVar.M() && mVar.b0(0L) == b6) {
            i5++;
            mVar.readByte();
        }
        return i5;
    }

    public static final boolean T(@d5.d o0 o0Var, int i5, @d5.d TimeUnit timeUnit) throws IOException {
        l0.p(o0Var, ProtectedSandApp.s("抒"));
        l0.p(timeUnit, ProtectedSandApp.s("抓"));
        long nanoTime = System.nanoTime();
        long d6 = o0Var.getTimeout().getHasDeadline() ? o0Var.getTimeout().d() - nanoTime : Long.MAX_VALUE;
        o0Var.getTimeout().e(Math.min(d6, timeUnit.toNanos(i5)) + nanoTime);
        try {
            m mVar = new m();
            while (o0Var.X0(mVar, 8192L) != -1) {
                mVar.c();
            }
            if (d6 == Long.MAX_VALUE) {
                o0Var.getTimeout().a();
            } else {
                o0Var.getTimeout().e(nanoTime + d6);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (d6 == Long.MAX_VALUE) {
                o0Var.getTimeout().a();
            } else {
                o0Var.getTimeout().e(nanoTime + d6);
            }
            return false;
        } catch (Throwable th) {
            if (d6 == Long.MAX_VALUE) {
                o0Var.getTimeout().a();
            } else {
                o0Var.getTimeout().e(nanoTime + d6);
            }
            throw th;
        }
    }

    @d5.d
    public static final ThreadFactory U(@d5.d String str, boolean z5) {
        l0.p(str, ProtectedSandApp.s("抔"));
        return new b(str, z5);
    }

    public static final void V(@d5.d String str, @d5.d q3.a<m2> aVar) {
        l0.p(str, ProtectedSandApp.s("投"));
        l0.p(aVar, ProtectedSandApp.s("抖"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("抗"));
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            aVar.n();
        } finally {
            currentThread.setName(name);
        }
    }

    @d5.d
    public static final List<okhttp3.internal.http2.b> W(@d5.d v vVar) {
        IntRange W1;
        int b02;
        l0.p(vVar, ProtectedSandApp.s("折"));
        W1 = u.W1(0, vVar.size());
        b02 = b0.b0(W1, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            arrayList.add(new okhttp3.internal.http2.b(vVar.q(nextInt), vVar.x(nextInt)));
        }
        return arrayList;
    }

    @d5.d
    public static final v X(@d5.d List<okhttp3.internal.http2.b> list) {
        l0.p(list, ProtectedSandApp.s("抙"));
        v.a aVar = new v.a();
        for (okhttp3.internal.http2.b bVar : list) {
            aVar.g(bVar.name.t0(), bVar.value.t0());
        }
        return aVar.i();
    }

    @d5.d
    public static final String Y(int i5) {
        String hexString = Integer.toHexString(i5);
        l0.o(hexString, ProtectedSandApp.s("抚"));
        return hexString;
    }

    @d5.d
    public static final String Z(long j5) {
        String hexString = Long.toHexString(j5);
        l0.o(hexString, ProtectedSandApp.s("抛"));
        return hexString;
    }

    public static final <E> void a(@d5.d List<E> list, E e6) {
        l0.p(list, ProtectedSandApp.s("抜"));
        if (list.contains(e6)) {
            return;
        }
        list.add(e6);
    }

    @d5.d
    public static final String a0(@d5.d w wVar, boolean z5) {
        boolean T2;
        String host;
        l0.p(wVar, ProtectedSandApp.s("抝"));
        T2 = kotlin.text.h0.T2(wVar.getHost(), ProtectedSandApp.s("択"), false, 2, null);
        if (T2) {
            host = ProtectedSandApp.s("抟") + wVar.getHost() + ']';
        } else {
            host = wVar.getHost();
        }
        if (!z5 && wVar.getPort() == w.INSTANCE.g(wVar.getScheme())) {
            return host;
        }
        return host + ':' + wVar.getPort();
    }

    public static final int b(byte b6, int i5) {
        return b6 & i5;
    }

    public static /* synthetic */ String b0(w wVar, boolean z5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        return a0(wVar, z5);
    }

    public static final int c(short s5, int i5) {
        return s5 & i5;
    }

    @d5.d
    public static final <T> List<T> c0(@d5.d List<? extends T> list) {
        List Y5;
        l0.p(list, ProtectedSandApp.s("抠"));
        Y5 = j0.Y5(list);
        List<T> unmodifiableList = Collections.unmodifiableList(Y5);
        l0.o(unmodifiableList, ProtectedSandApp.s("抡"));
        return unmodifiableList;
    }

    public static final long d(int i5, long j5) {
        return i5 & j5;
    }

    @d5.d
    public static final <K, V> Map<K, V> d0(@d5.d Map<K, ? extends V> map) {
        Map<K, V> z5;
        l0.p(map, ProtectedSandApp.s("抢"));
        if (map.isEmpty()) {
            z5 = f1.z();
            return z5;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        l0.o(unmodifiableMap, ProtectedSandApp.s("抣"));
        return unmodifiableMap;
    }

    @d5.d
    public static final r.c e(@d5.d r rVar) {
        l0.p(rVar, ProtectedSandApp.s("护"));
        return new a(rVar);
    }

    public static final long e0(@d5.d String str, long j5) {
        l0.p(str, ProtectedSandApp.s("报"));
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j5;
        }
    }

    public static final void f(@d5.d Object obj) {
        l0.p(obj, ProtectedSandApp.s("抦"));
        if (f30936h && Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("抧"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("抨"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("抩"));
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final int f0(@d5.e String str, int i5) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i5;
    }

    public static final void g(@d5.d Object obj) {
        l0.p(obj, ProtectedSandApp.s("抪"));
        if (!f30936h || Thread.holdsLock(obj)) {
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("披"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("抬"));
        sb.append(currentThread.getName());
        sb.append(ProtectedSandApp.s("抭"));
        sb.append(obj);
        throw new AssertionError(sb.toString());
    }

    @d5.d
    public static final String g0(@d5.d String str, int i5, int i6) {
        l0.p(str, ProtectedSandApp.s("抮"));
        int C = C(str, i5, i6);
        String substring = str.substring(C, E(str, C, i6));
        l0.o(substring, ProtectedSandApp.s("抯"));
        return substring;
    }

    public static final boolean h(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("抰"));
        return f30935g.k(str);
    }

    public static /* synthetic */ String h0(String str, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        return g0(str, i5, i6);
    }

    public static final boolean i(@d5.d w wVar, @d5.d w wVar2) {
        l0.p(wVar, ProtectedSandApp.s("抱"));
        l0.p(wVar2, ProtectedSandApp.s("抲"));
        return l0.g(wVar.getHost(), wVar2.getHost()) && wVar.getPort() == wVar2.getPort() && l0.g(wVar.getScheme(), wVar2.getScheme());
    }

    public static final void i0(@d5.d Object obj) {
        l0.p(obj, ProtectedSandApp.s("抳"));
        obj.wait();
    }

    public static final int j(@d5.d String str, long j5, @d5.e TimeUnit timeUnit) {
        l0.p(str, ProtectedSandApp.s("抴"));
        boolean z5 = true;
        if (!(j5 >= 0)) {
            throw new IllegalStateException(androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("抸")).toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException(ProtectedSandApp.s("抷").toString());
        }
        long millis = timeUnit.toMillis(j5);
        if (!(millis <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("抶")).toString());
        }
        if (millis == 0 && j5 > 0) {
            z5 = false;
        }
        if (z5) {
            return (int) millis;
        }
        throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("抵")).toString());
    }

    @d5.d
    public static final Throwable j0(@d5.d Exception exc, @d5.d List<? extends Exception> list) {
        l0.p(exc, ProtectedSandApp.s("抹"));
        l0.p(list, ProtectedSandApp.s("抺"));
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            kotlin.p.a(exc, it.next());
        }
        return exc;
    }

    public static final void k(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void k0(@d5.d n nVar, int i5) throws IOException {
        l0.p(nVar, ProtectedSandApp.s("抻"));
        nVar.writeByte((i5 >>> 16) & 255);
        nVar.writeByte((i5 >>> 8) & 255);
        nVar.writeByte(i5 & 255);
    }

    public static final void l(@d5.d Closeable closeable) {
        l0.p(closeable, ProtectedSandApp.s("押"));
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final void m(@d5.d ServerSocket serverSocket) {
        l0.p(serverSocket, ProtectedSandApp.s("抽"));
        try {
            serverSocket.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final void n(@d5.d Socket socket) {
        l0.p(socket, ProtectedSandApp.s("抾"));
        try {
            socket.close();
        } catch (AssertionError e6) {
            throw e6;
        } catch (RuntimeException e7) {
            if (!l0.g(e7.getMessage(), ProtectedSandApp.s("抿"))) {
                throw e7;
            }
        } catch (Exception unused) {
        }
    }

    @d5.d
    public static final String[] o(@d5.d String[] strArr, @d5.d String str) {
        int we;
        l0.p(strArr, ProtectedSandApp.s("拀"));
        l0.p(str, ProtectedSandApp.s("拁"));
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        l0.o(copyOf, ProtectedSandApp.s("拂"));
        String[] strArr2 = (String[]) copyOf;
        we = t.we(strArr2);
        strArr2[we] = str;
        return strArr2;
    }

    public static final int p(@d5.d String str, char c6, int i5, int i6) {
        l0.p(str, ProtectedSandApp.s("拃"));
        while (i5 < i6) {
            if (str.charAt(i5) == c6) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    public static final int q(@d5.d String str, @d5.d String str2, int i5, int i6) {
        boolean S2;
        l0.p(str, ProtectedSandApp.s("拄"));
        l0.p(str2, ProtectedSandApp.s("担"));
        while (i5 < i6) {
            S2 = kotlin.text.h0.S2(str2, str.charAt(i5), false, 2, null);
            if (S2) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    public static /* synthetic */ int r(String str, char c6, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = str.length();
        }
        return p(str, c6, i5, i6);
    }

    public static /* synthetic */ int s(String str, String str2, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = str.length();
        }
        return q(str, str2, i5, i6);
    }

    public static final boolean t(@d5.d o0 o0Var, int i5, @d5.d TimeUnit timeUnit) {
        l0.p(o0Var, ProtectedSandApp.s("拆"));
        l0.p(timeUnit, ProtectedSandApp.s("拇"));
        try {
            return T(o0Var, i5, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @d5.d
    public static final <T> List<T> u(@d5.d Iterable<? extends T> iterable, @d5.d l<? super T, Boolean> lVar) {
        l0.p(iterable, ProtectedSandApp.s("拈"));
        l0.p(lVar, ProtectedSandApp.s("拉"));
        ArrayList arrayList = EmptyList.f23167o;
        for (T t5 : iterable) {
            if (lVar.N(t5).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                u1.g(arrayList).add(t5);
            }
        }
        return arrayList;
    }

    @d5.d
    public static final String v(@d5.d String str, @d5.d Object... objArr) {
        l0.p(str, ProtectedSandApp.s("拊"));
        l0.p(objArr, ProtectedSandApp.s("拋"));
        StringCompanionObject stringCompanionObject = StringCompanionObject.f23622a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        l0.o(format, ProtectedSandApp.s("拌"));
        return format;
    }

    public static final boolean w(@d5.d String[] strArr, @d5.e String[] strArr2, @d5.d Comparator<? super String> comparator) {
        l0.p(strArr, ProtectedSandApp.s("拍"));
        l0.p(comparator, ProtectedSandApp.s("拎"));
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long x(@d5.d g0 g0Var) {
        l0.p(g0Var, ProtectedSandApp.s("拏"));
        String g5 = g0Var.getHeaders().g(ProtectedSandApp.s("拐"));
        if (g5 != null) {
            return e0(g5, -1L);
        }
        return -1L;
    }

    public static final void y(@d5.d q3.a<m2> aVar) {
        l0.p(aVar, ProtectedSandApp.s("拑"));
        try {
            aVar.n();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @d5.d
    public static final <T> List<T> z(@d5.d T... tArr) {
        List O;
        l0.p(tArr, ProtectedSandApp.s("拒"));
        Object[] objArr = (Object[]) tArr.clone();
        O = a0.O(Arrays.copyOf(objArr, objArr.length));
        List<T> unmodifiableList = Collections.unmodifiableList(O);
        l0.o(unmodifiableList, ProtectedSandApp.s("拓"));
        return unmodifiableList;
    }
}
