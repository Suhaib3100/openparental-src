package okhttp3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.material3.u9;
import androidx.compose.runtime.changelist.j;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
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
import kd.f;
import kd.i;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.collections.u0;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t1;
import kotlin.jvm.internal.u1;
import kotlin.k2;
import kotlin.ranges.s;
import kotlin.text.r;
import kotlin.text.v;
import okhttp3.b0;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.r;
import okhttp3.u;
import okio.d0;
import okio.m;
import okio.m0;
import okio.n;
import okio.o;
import okio.o0;
import okio.p;

/* compiled from: Util.kt */
@i(name = "Util")
@Metadata(d1 = {"\u0000È\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a7\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0007*\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001c\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u001c\u0010\u001d\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e*\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010\"\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#\u001a%\u0010$\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b$\u0010#\u001a%\u0010%\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&\u001a-\u0010(\u001a\u00020\u001b*\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)\u001a-\u0010,\u001a\u00020\u001b*\u00020\u00072\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010 \u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u001b¢\u0006\u0004\b,\u0010-\u001a\u0011\u0010.\u001a\u00020\u001b*\u00020\u0007¢\u0006\u0004\b.\u0010/\u001a\u0011\u00100\u001a\u00020\t*\u00020\u0007¢\u0006\u0004\b0\u00101\u001a)\u00105\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0012\u00104\u001a\n\u0012\u0006\b\u0001\u0012\u0002030\u000e\"\u000203¢\u0006\u0004\b5\u00106\u001a\u0019\u0010:\u001a\u000208*\u0002072\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;\u001a'\u0010?\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@\u001a\u0011\u0010A\u001a\u00020\u001b*\u00020*¢\u0006\u0004\bA\u0010B\u001a\u0017\u0010F\u001a\u00020E*\b\u0012\u0004\u0012\u00020D0C¢\u0006\u0004\bF\u0010G\u001a\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020D0C*\u00020E¢\u0006\u0004\bH\u0010I\u001a\u0019\u0010J\u001a\u00020\t*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\bJ\u0010K\u001a\u0011\u0010N\u001a\u00020M*\u00020L¢\u0006\u0004\bN\u0010O\u001a\u001c\u0010R\u001a\u00020\u001b*\u00020P2\u0006\u0010Q\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bR\u0010S\u001a\u001c\u0010U\u001a\u00020\u001b*\u00020T2\u0006\u0010Q\u001a\u00020\u001bH\u0086\u0004¢\u0006\u0004\bU\u0010V\u001a\u001c\u0010W\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010Q\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\bW\u0010X\u001a\u0019\u0010[\u001a\u00020\u0004*\u00020Y2\u0006\u0010Z\u001a\u00020\u001b¢\u0006\u0004\b[\u0010\\\u001a\u0011\u0010]\u001a\u00020\u001b*\u000207¢\u0006\u0004\b]\u0010^\u001a!\u0010a\u001a\u00020\t*\u00020_2\u0006\u0010<\u001a\u00020\u001b2\u0006\u0010`\u001a\u00020=¢\u0006\u0004\ba\u0010b\u001a!\u0010d\u001a\u00020\t*\u00020_2\u0006\u0010c\u001a\u00020\u001b2\u0006\u0010`\u001a\u00020=¢\u0006\u0004\bd\u0010b\u001a\u0011\u0010f\u001a\u00020\u0007*\u00020e¢\u0006\u0004\bf\u0010g\u001a\u0019\u0010i\u001a\u00020\t*\u00020e2\u0006\u0010h\u001a\u000207¢\u0006\u0004\bi\u0010j\u001a!\u0010m\u001a\u00020\u00042\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00040kH\u0086\bø\u0001\u0000¢\u0006\u0004\bm\u0010n\u001a)\u0010o\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00040kH\u0086\bø\u0001\u0000¢\u0006\u0004\bo\u0010p\u001a\u0019\u0010r\u001a\u00020\u001b*\u00020q2\u0006\u0010R\u001a\u00020P¢\u0006\u0004\br\u0010s\u001a\u001b\u0010t\u001a\u00020\u001b*\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\bt\u0010u\u001a\u0011\u0010w\u001a\u00020\u0000*\u00020v¢\u0006\u0004\bw\u0010x\u001a\u0019\u0010z\u001a\u00020\u0000*\u00020\u00072\u0006\u0010y\u001a\u00020\u0000¢\u0006\u0004\bz\u0010{\u001a\u001b\u0010|\u001a\u00020\u001b*\u0004\u0018\u00010\u00072\u0006\u0010y\u001a\u00020\u001b¢\u0006\u0004\b|\u0010u\u001a#\u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010a*\b\u0012\u0004\u0012\u00028\u00000C¢\u0006\u0004\b}\u0010~\u001a2\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010a2\u0012\u0010\u007f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e\"\u00028\u0000H\u0007¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a:\u0010\u0083\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001\"\u0004\b\u0000\u0010i\"\u0004\b\u0001\u0010o*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0082\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0015\u0010\u0086\u0001\u001a\u00020\u0004*\u00030\u0085\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0014\u0010\u0088\u0001\u001a\u00020\u0004*\u00020e¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0015\u0010\u008b\u0001\u001a\u00020\u0004*\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u001f\u0010\u0090\u0001\u001a\u00020\t*\u00030\u008d\u00012\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0014\u0010\u0092\u0001\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0014\u0010\u0094\u0001\u001a\u00020\u0007*\u00020\u001b¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0017\u0010\u0096\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0017\u0010\u0098\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0098\u0001\u0010\u0097\u0001\u001a\u0017\u0010\u0099\u0001\u001a\u00020\u0004*\u000203H\u0086\b¢\u0006\u0006\b\u0099\u0001\u0010\u0097\u0001\u001a:\u0010\u009e\u0001\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010a2\u0007\u0010\u009a\u0001\u001a\u0002032\u000e\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u009b\u00012\u0007\u0010\u009d\u0001\u001a\u00020\u0007¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a,\u0010¢\u0001\u001a\u00020\u0004\"\u0004\b\u0000\u0010$*\t\u0012\u0004\u0012\u00028\u00000 \u00012\u0007\u0010¡\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0006\b¢\u0001\u0010£\u0001\u001a\u0017\u0010¤\u0001\u001a\u00020\u0004*\u000203H\u0080\b¢\u0006\u0006\b¤\u0001\u0010\u0097\u0001\u001a\u0017\u0010¥\u0001\u001a\u00020\u0004*\u000203H\u0080\b¢\u0006\u0006\b¥\u0001\u0010\u0097\u0001\u001a0\u0010ª\u0001\u001a\u00030©\u0001*\b0¦\u0001j\u0003`§\u00012\u0013\u0010¨\u0001\u001a\u000e\u0012\n\u0012\b0¦\u0001j\u0003`§\u00010C¢\u0006\u0006\bª\u0001\u0010«\u0001\u001aI\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010a*\t\u0012\u0004\u0012\u00028\u00000¬\u00012\u001a\u0010¯\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u00ad\u0001¢\u0006\u0003\b®\u0001H\u0086\bø\u0001\u0000¢\u0006\u0006\b°\u0001\u0010±\u0001\"\u0018\u0010´\u0001\u001a\u00030²\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010³\u0001\"\u0016\u0010¶\u0001\u001a\u00020E8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bR\u0010µ\u0001\"\u0017\u0010¹\u0001\u001a\u00030·\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bU\u0010¸\u0001\"\u0017\u0010¼\u0001\u001a\u00030º\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bW\u0010»\u0001\"\u0017\u0010¿\u0001\u001a\u00030½\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bN\u0010¾\u0001\"\u0018\u0010Â\u0001\u001a\u00030À\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010Á\u0001\"\u0018\u0010Å\u0001\u001a\u00030Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010Ä\u0001\"\u0016\u0010Æ\u0001\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b0\u0010\u0092\u0001\"\u0016\u0010È\u0001\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\bJ\u0010Ç\u0001\"\u0016\u0010É\u0001\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0007\n\u0005\b?\u0010Ç\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Ê\u0001"}, d2 = {"", "arrayLength", "offset", "count", "Lkotlin/k2;", "k", "(JJJ)V", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "U", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "", "other", "Ljava/util/Comparator;", "comparator", "I", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "w", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/v;", "includeDefaultPort", "a0", "(Lokhttp3/v;Z)Ljava/lang/String;", "value", "", "A", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "o", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "C", "(Ljava/lang/String;II)I", "E", "g0", "(Ljava/lang/String;II)Ljava/lang/String;", "delimiters", "q", "(Ljava/lang/String;Ljava/lang/String;II)I", "", "delimiter", "p", "(Ljava/lang/String;CII)I", "B", "(Ljava/lang/String;)I", "h", "(Ljava/lang/String;)Z", "format", "", "args", "v", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/o;", "Ljava/nio/charset/Charset;", "default", "P", "(Lokio/o;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "j", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "N", "(C)I", "", "Lokhttp3/internal/http2/b;", "Lokhttp3/u;", "X", "(Ljava/util/List;)Lokhttp3/u;", "W", "(Lokhttp3/u;)Ljava/util/List;", "i", "(Lokhttp3/v;Lokhttp3/v;)Z", "Lokhttp3/r;", "Lokhttp3/r$c;", "e", "(Lokhttp3/r;)Lokhttp3/r$c;", "", "mask", "b", "(BI)I", "", "c", "(SI)I", "d", "(IJ)J", "Lokio/n;", "medium", "k0", "(Lokio/n;I)V", "R", "(Lokio/o;)I", "Lokio/o0;", "timeUnit", "T", "(Lokio/o0;ILjava/util/concurrent/TimeUnit;)Z", "timeout", "t", "Ljava/net/Socket;", "O", "(Ljava/net/Socket;)Ljava/lang/String;", "source", "K", "(Ljava/net/Socket;Lokio/o;)Z", "Lkotlin/Function0;", "block", "y", "(Lld/a;)V", "V", "(Ljava/lang/String;Lld/a;)V", "Lokio/m;", "S", "(Lokio/m;B)I", "G", "(Ljava/lang/String;I)I", "Lokhttp3/f0;", "x", "(Lokhttp3/f0;)J", "defaultValue", "e0", "(Ljava/lang/String;J)J", "f0", "c0", "(Ljava/util/List;)Ljava/util/List;", "elements", "z", "([Ljava/lang/Object;)Ljava/util/List;", "", "d0", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/io/Closeable;", "l", "(Ljava/io/Closeable;)V", "n", "(Ljava/net/Socket;)V", "Ljava/net/ServerSocket;", "m", "(Ljava/net/ServerSocket;)V", "Lokhttp3/internal/io/a;", "Ljava/io/File;", "file", "J", "(Lokhttp3/internal/io/a;Ljava/io/File;)Z", "Z", "(J)Ljava/lang/String;", "Y", "(I)Ljava/lang/String;", "i0", "(Ljava/lang/Object;)V", "L", "M", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "Q", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "", "element", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "g", "f", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "j0", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "", "Lkotlin/Function1;", "Lkotlin/u;", "predicate", "u", "(Ljava/lang/Iterable;Lld/l;)Ljava/util/List;", "", "[B", "EMPTY_BYTE_ARRAY", "Lokhttp3/u;", "EMPTY_HEADERS", "Lokhttp3/g0;", "Lokhttp3/g0;", "EMPTY_RESPONSE", "Lokhttp3/e0;", "Lokhttp3/e0;", "EMPTY_REQUEST", "Lokio/d0;", "Lokio/d0;", "UNICODE_BOMS", "Ljava/util/TimeZone;", "Ljava/util/TimeZone;", "UTC", "Lkotlin/text/r;", "Lkotlin/text/r;", "VERIFY_AS_IP_ADDRESS", "assertionsEnabled", "Ljava/lang/String;", "okHttpName", "userAgent", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    @f
    public static final byte[] f84456a;

    /* renamed from: c, reason: collision with root package name */
    @l
    @f
    public static final g0 f84458c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @f
    public static final e0 f84459d;

    /* renamed from: e, reason: collision with root package name */
    private static final d0 f84460e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @f
    public static final TimeZone f84461f;

    /* renamed from: g, reason: collision with root package name */
    private static final r f84462g;

    /* renamed from: h, reason: collision with root package name */
    @f
    public static final boolean f84463h;

    /* renamed from: i, reason: collision with root package name */
    @l
    @f
    public static final String f84464i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public static final String f84465j = ProtectedSandApp.s("ꄿ\u0001");

    /* renamed from: b, reason: collision with root package name */
    @l
    @f
    public static final u f84457b = u.INSTANCE.j(new String[0]);

    /* compiled from: Util.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/e;", "it", "Lokhttp3/r;", "create", "(Lokhttp3/e;)Lokhttp3/r;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    static final class a implements r.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ okhttp3.r f84466a;

        a(okhttp3.r rVar) {
            this.f84466a = rVar;
        }

        @Override // okhttp3.r.c
        @l
        public final okhttp3.r create(@l e eVar) {
            l0.p(eVar, ProtectedSandApp.s("ꄾ\u0001"));
            return this.f84466a;
        }
    }

    /* compiled from: Util.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "runnable", "Ljava/lang/Runnable;", "newThread"}, k = 3, mv = {1, 4, 0})
    static final class b implements ThreadFactory {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f84467b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f84468c;

        b(String str, boolean z4) {
            this.f84467b = str;
            this.f84468c = z4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f84467b);
            thread.setDaemon(this.f84468c);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f84456a = bArr;
        f84458c = g0.Companion.l(g0.INSTANCE, bArr, null, 1, null);
        f84459d = e0.Companion.r(e0.INSTANCE, bArr, null, 0, 0, 7, null);
        d0.Companion companion = d0.INSTANCE;
        p.Companion companion2 = p.INSTANCE;
        f84460e = companion.d(companion2.i(ProtectedSandApp.s("ꅀ\u0001")), companion2.i(ProtectedSandApp.s("ꅁ\u0001")), companion2.i(ProtectedSandApp.s("ꅂ\u0001")), companion2.i(ProtectedSandApp.s("ꅃ\u0001")), companion2.i(ProtectedSandApp.s("ꅄ\u0001")));
        TimeZone timeZone = TimeZone.getTimeZone(ProtectedSandApp.s("ꅅ\u0001"));
        l0.m(timeZone);
        f84461f = timeZone;
        f84462g = new kotlin.text.r(ProtectedSandApp.s("ꅆ\u0001"));
        f84463h = false;
        String name = b0.class.getName();
        l0.o(name, ProtectedSandApp.s("ꅇ\u0001"));
        f84464i = v.g4(v.a4(name, ProtectedSandApp.s("ꅈ\u0001")), ProtectedSandApp.s("ꅉ\u0001"));
    }

    public static final int A(@l String[] strArr, @l String str, @l Comparator<String> comparator) {
        l0.p(strArr, ProtectedSandApp.s("ꅊ\u0001"));
        l0.p(str, ProtectedSandApp.s("ꅋ\u0001"));
        l0.p(comparator, ProtectedSandApp.s("ꅌ\u0001"));
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (comparator.compare(strArr[i4], str) == 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int B(@l String str) {
        l0.p(str, ProtectedSandApp.s("ꅍ\u0001"));
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (l0.t(charAt, 31) <= 0 || l0.t(charAt, 127) >= 0) {
                return i4;
            }
        }
        return -1;
    }

    public static final int C(@l String str, int i4, int i5) {
        l0.p(str, ProtectedSandApp.s("ꅎ\u0001"));
        while (i4 < i5) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static /* synthetic */ int D(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return C(str, i4, i5);
    }

    public static final int E(@l String str, int i4, int i5) {
        l0.p(str, ProtectedSandApp.s("ꅏ\u0001"));
        int i6 = i5 - 1;
        if (i6 >= i4) {
            while (true) {
                char charAt = str.charAt(i6);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i6 + 1;
                }
                if (i6 == i4) {
                    break;
                }
                i6--;
            }
        }
        return i4;
    }

    public static /* synthetic */ int F(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return E(str, i4, i5);
    }

    public static final int G(@l String str, int i4) {
        l0.p(str, ProtectedSandApp.s("ꅐ\u0001"));
        int length = str.length();
        while (i4 < length) {
            char charAt = str.charAt(i4);
            if (charAt != ' ' && charAt != '\t') {
                return i4;
            }
            i4++;
        }
        return str.length();
    }

    public static /* synthetic */ int H(String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        return G(str, i4);
    }

    @l
    public static final String[] I(@l String[] strArr, @l String[] strArr2, @l Comparator<? super String> comparator) {
        l0.p(strArr, ProtectedSandApp.s("ꅑ\u0001"));
        l0.p(strArr2, ProtectedSandApp.s("ꅒ\u0001"));
        l0.p(comparator, ProtectedSandApp.s("ꅌ\u0001"));
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i4]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i4++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException(ProtectedSandApp.s("ꅓ\u0001"));
    }

    public static final boolean J(@l okhttp3.internal.io.a aVar, @l File file) {
        l0.p(aVar, ProtectedSandApp.s("ꅔ\u0001"));
        l0.p(file, ProtectedSandApp.s("ꅕ\u0001"));
        m0 f4 = aVar.f(file);
        try {
            try {
                aVar.h(file);
                kotlin.io.b.a(f4, null);
                return true;
            } catch (IOException unused) {
                k2 k2Var = k2.f75408a;
                kotlin.io.b.a(f4, null);
                aVar.h(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean K(@l Socket socket, @l o oVar) {
        l0.p(socket, ProtectedSandApp.s("ꅖ\u0001"));
        l0.p(oVar, ProtectedSandApp.s("ꅗ\u0001"));
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z4 = !oVar.t2();
                socket.setSoTimeout(soTimeout);
                return z4;
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

    public static final void L(@l Object obj) {
        l0.p(obj, ProtectedSandApp.s("ꅘ\u0001"));
        obj.notify();
    }

    public static final void M(@l Object obj) {
        l0.p(obj, ProtectedSandApp.s("ꅙ\u0001"));
        obj.notifyAll();
    }

    public static final int N(char c5) {
        if ('0' <= c5 && '9' >= c5) {
            return c5 - '0';
        }
        if ('a' <= c5 && 'f' >= c5) {
            return c5 - 'W';
        }
        if ('A' <= c5 && 'F' >= c5) {
            return c5 - '7';
        }
        return -1;
    }

    @l
    public static final String O(@l Socket socket) {
        l0.p(socket, ProtectedSandApp.s("ꅚ\u0001"));
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        l0.o(hostName, ProtectedSandApp.s("ꅛ\u0001"));
        return hostName;
    }

    @l
    public static final Charset P(@l o oVar, @l Charset charset) throws IOException {
        l0.p(oVar, ProtectedSandApp.s("ꅜ\u0001"));
        l0.p(charset, ProtectedSandApp.s("ꅝ\u0001"));
        int K3 = oVar.K3(f84460e);
        if (K3 == -1) {
            return charset;
        }
        if (K3 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            l0.o(charset2, ProtectedSandApp.s("ꅠ\u0001"));
            return charset2;
        }
        if (K3 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            l0.o(charset3, ProtectedSandApp.s("ꅟ\u0001"));
            return charset3;
        }
        if (K3 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            l0.o(charset4, ProtectedSandApp.s("ꅞ\u0001"));
            return charset4;
        }
        if (K3 == 3) {
            return kotlin.text.f.f79061a.b();
        }
        if (K3 == 4) {
            return kotlin.text.f.f79061a.c();
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        return r3;
     */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T Q(@fg.l java.lang.Object r4, @fg.l java.lang.Class<T> r5, @fg.l java.lang.String r6) {
        /*
            java.lang.String r0 = "ꅡ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "ꅢ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r5, r0)
            java.lang.String r0 = "ꅣ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r6, r0)
            java.lang.Class r0 = r4.getClass()
        L22:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r2 = kotlin.jvm.internal.l0.g(r0, r1)
            r3 = 0
            if (r2 != 0) goto L5c
            java.lang.reflect.Field r1 = r0.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L4d
            java.lang.String r2 = "ꅤ\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)     // Catch: java.lang.NoSuchFieldException -> L4d
            kotlin.jvm.internal.l0.o(r1, r2)     // Catch: java.lang.NoSuchFieldException -> L4d
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L4d
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.NoSuchFieldException -> L4d
            boolean r2 = r5.isInstance(r1)     // Catch: java.lang.NoSuchFieldException -> L4d
            if (r2 != 0) goto L48
            goto L4c
        L48:
            java.lang.Object r3 = r5.cast(r1)     // Catch: java.lang.NoSuchFieldException -> L4d
        L4c:
            return r3
        L4d:
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.String r1 = "ꅥ\u0001"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            kotlin.jvm.internal.l0.o(r0, r1)
            goto L22
        L5c:
            java.lang.String r0 = "ꅦ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            boolean r2 = kotlin.jvm.internal.l0.g(r6, r0)
            if (r2 != 0) goto L74
            java.lang.Object r4 = Q(r4, r1, r0)
            if (r4 == 0) goto L74
            java.lang.Object r4 = Q(r4, r5, r6)
            return r4
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.d.Q(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }

    public static final int R(@l o oVar) throws IOException {
        l0.p(oVar, ProtectedSandApp.s("ꅧ\u0001"));
        return (oVar.readByte() & 255) | ((oVar.readByte() & 255) << 16) | ((oVar.readByte() & 255) << 8);
    }

    public static final int S(@l m mVar, byte b5) {
        l0.p(mVar, ProtectedSandApp.s("ꅨ\u0001"));
        int i4 = 0;
        while (!mVar.t2() && mVar.z(0L) == b5) {
            i4++;
            mVar.readByte();
        }
        return i4;
    }

    public static final boolean T(@l o0 o0Var, int i4, @l TimeUnit timeUnit) throws IOException {
        l0.p(o0Var, ProtectedSandApp.s("ꅨ\u0001"));
        l0.p(timeUnit, ProtectedSandApp.s("ꅩ\u0001"));
        long nanoTime = System.nanoTime();
        long d5 = o0Var.getTimeout().getHasDeadline() ? o0Var.getTimeout().d() - nanoTime : Long.MAX_VALUE;
        o0Var.getTimeout().e(Math.min(d5, timeUnit.toNanos(i4)) + nanoTime);
        try {
            m mVar = new m();
            while (o0Var.w3(mVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                mVar.d();
            }
            if (d5 == Long.MAX_VALUE) {
                o0Var.getTimeout().a();
            } else {
                o0Var.getTimeout().e(nanoTime + d5);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (d5 == Long.MAX_VALUE) {
                o0Var.getTimeout().a();
            } else {
                o0Var.getTimeout().e(nanoTime + d5);
            }
            return false;
        } catch (Throwable th) {
            if (d5 == Long.MAX_VALUE) {
                o0Var.getTimeout().a();
            } else {
                o0Var.getTimeout().e(nanoTime + d5);
            }
            throw th;
        }
    }

    @l
    public static final ThreadFactory U(@l String str, boolean z4) {
        l0.p(str, ProtectedSandApp.s("ꅪ\u0001"));
        return new b(str, z4);
    }

    public static final void V(@l String str, @l ld.a<k2> aVar) {
        l0.p(str, ProtectedSandApp.s("ꅪ\u0001"));
        l0.p(aVar, ProtectedSandApp.s("ꅫ\u0001"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("ꅬ\u0001"));
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            currentThread.setName(name);
        }
    }

    @l
    public static final List<okhttp3.internal.http2.b> W(@l u uVar) {
        l0.p(uVar, ProtectedSandApp.s("ꅭ\u0001"));
        kotlin.ranges.l W1 = s.W1(0, uVar.size());
        ArrayList arrayList = new ArrayList(w.b0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int c5 = ((u0) it).c();
            arrayList.add(new okhttp3.internal.http2.b(uVar.j(c5), uVar.s(c5)));
        }
        return arrayList;
    }

    @l
    public static final u X(@l List<okhttp3.internal.http2.b> list) {
        l0.p(list, ProtectedSandApp.s("ꅮ\u0001"));
        u.a aVar = new u.a();
        for (okhttp3.internal.http2.b bVar : list) {
            aVar.g(bVar.name.o0(), bVar.value.o0());
        }
        return aVar.i();
    }

    @l
    public static final String Y(int i4) {
        String hexString = Integer.toHexString(i4);
        l0.o(hexString, ProtectedSandApp.s("ꅯ\u0001"));
        return hexString;
    }

    @l
    public static final String Z(long j4) {
        String hexString = Long.toHexString(j4);
        l0.o(hexString, ProtectedSandApp.s("ꅰ\u0001"));
        return hexString;
    }

    public static final <E> void a(@l List<E> list, E e4) {
        l0.p(list, ProtectedSandApp.s("ꅱ\u0001"));
        if (list.contains(e4)) {
            return;
        }
        list.add(e4);
    }

    @l
    public static final String a0(@l okhttp3.v vVar, boolean z4) {
        String host;
        l0.p(vVar, ProtectedSandApp.s("ꅲ\u0001"));
        if (v.T2(vVar.getHost(), ProtectedSandApp.s("ꅳ\u0001"), false, 2, null)) {
            host = ProtectedSandApp.s("ꅴ\u0001") + vVar.getHost() + ']';
        } else {
            host = vVar.getHost();
        }
        if (!z4 && vVar.getPort() == okhttp3.v.INSTANCE.g(vVar.getScheme())) {
            return host;
        }
        return host + ':' + vVar.getPort();
    }

    public static final int b(byte b5, int i4) {
        return b5 & i4;
    }

    public static /* synthetic */ String b0(okhttp3.v vVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return a0(vVar, z4);
    }

    public static final int c(short s4, int i4) {
        return s4 & i4;
    }

    @l
    public static final <T> List<T> c0(@l List<? extends T> list) {
        l0.p(list, ProtectedSandApp.s("ꅵ\u0001"));
        List<T> unmodifiableList = Collections.unmodifiableList(w.Y5(list));
        l0.o(unmodifiableList, ProtectedSandApp.s("ꅶ\u0001"));
        return unmodifiableList;
    }

    public static final long d(int i4, long j4) {
        return i4 & j4;
    }

    @l
    public static final <K, V> Map<K, V> d0(@l Map<K, ? extends V> map) {
        l0.p(map, ProtectedSandApp.s("ꅷ\u0001"));
        if (map.isEmpty()) {
            return z0.z();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        l0.o(unmodifiableMap, ProtectedSandApp.s("ꅸ\u0001"));
        return unmodifiableMap;
    }

    @l
    public static final r.c e(@l okhttp3.r rVar) {
        l0.p(rVar, ProtectedSandApp.s("ꅹ\u0001"));
        return new a(rVar);
    }

    public static final long e0(@l String str, long j4) {
        l0.p(str, ProtectedSandApp.s("ꅺ\u0001"));
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j4;
        }
    }

    public static final void f(@l Object obj) {
        l0.p(obj, ProtectedSandApp.s("ꅻ\u0001"));
        if (f84463h && Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꅼ\u0001"));
            Thread currentThread = Thread.currentThread();
            l0.o(currentThread, ProtectedSandApp.s("ꅽ\u0001"));
            sb.append(currentThread.getName());
            sb.append(ProtectedSandApp.s("ꅾ\u0001"));
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final int f0(@fg.m String str, int i4) {
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
        return i4;
    }

    public static final void g(@l Object obj) {
        l0.p(obj, ProtectedSandApp.s("ꅿ\u0001"));
        if (!f84463h || Thread.holdsLock(obj)) {
            return;
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ꅼ\u0001"));
        Thread currentThread = Thread.currentThread();
        l0.o(currentThread, ProtectedSandApp.s("ꅽ\u0001"));
        sb.append(currentThread.getName());
        sb.append(ProtectedSandApp.s("ꆀ\u0001"));
        sb.append(obj);
        throw new AssertionError(sb.toString());
    }

    @l
    public static final String g0(@l String str, int i4, int i5) {
        l0.p(str, ProtectedSandApp.s("ꆁ\u0001"));
        int C = C(str, i4, i5);
        String substring = str.substring(C, E(str, C, i5));
        l0.o(substring, ProtectedSandApp.s("ꆂ\u0001"));
        return substring;
    }

    public static final boolean h(@l String str) {
        l0.p(str, ProtectedSandApp.s("ꆃ\u0001"));
        return f84462g.k(str);
    }

    public static /* synthetic */ String h0(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return g0(str, i4, i5);
    }

    public static final boolean i(@l okhttp3.v vVar, @l okhttp3.v vVar2) {
        l0.p(vVar, ProtectedSandApp.s("ꆄ\u0001"));
        l0.p(vVar2, ProtectedSandApp.s("ꅒ\u0001"));
        return l0.g(vVar.getHost(), vVar2.getHost()) && vVar.getPort() == vVar2.getPort() && l0.g(vVar.getScheme(), vVar2.getScheme());
    }

    public static final void i0(@l Object obj) {
        l0.p(obj, ProtectedSandApp.s("ꆅ\u0001"));
        obj.wait();
    }

    public static final int j(@l String str, long j4, @fg.m TimeUnit timeUnit) {
        l0.p(str, ProtectedSandApp.s("ꅪ\u0001"));
        if (!(j4 >= 0)) {
            throw new IllegalStateException(j.a(str, ProtectedSandApp.s("ꆉ\u0001")).toString());
        }
        if (!(timeUnit != null)) {
            throw new IllegalStateException(ProtectedSandApp.s("ꆈ\u0001"));
        }
        long millis = timeUnit.toMillis(j4);
        if (!(millis <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(j.a(str, ProtectedSandApp.s("ꆇ\u0001")).toString());
        }
        if (millis != 0 || j4 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(j.a(str, ProtectedSandApp.s("ꆆ\u0001")).toString());
    }

    @l
    public static final Throwable j0(@l Exception exc, @l List<? extends Exception> list) {
        l0.p(exc, ProtectedSandApp.s("ꆊ\u0001"));
        l0.p(list, ProtectedSandApp.s("ꆋ\u0001"));
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            kotlin.o.a(exc, it.next());
        }
        return exc;
    }

    public static final void k(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void k0(@l n nVar, int i4) throws IOException {
        l0.p(nVar, ProtectedSandApp.s("ꆌ\u0001"));
        nVar.writeByte((i4 >>> 16) & 255);
        nVar.writeByte((i4 >>> 8) & 255);
        nVar.writeByte(i4 & 255);
    }

    public static final void l(@l Closeable closeable) {
        l0.p(closeable, ProtectedSandApp.s("ꆍ\u0001"));
        try {
            closeable.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void m(@l ServerSocket serverSocket) {
        l0.p(serverSocket, ProtectedSandApp.s("ꆍ\u0001"));
        try {
            serverSocket.close();
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception unused) {
        }
    }

    public static final void n(@l Socket socket) {
        l0.p(socket, ProtectedSandApp.s("ꆍ\u0001"));
        try {
            socket.close();
        } catch (AssertionError e4) {
            throw e4;
        } catch (RuntimeException e5) {
            if (!l0.g(e5.getMessage(), ProtectedSandApp.s("ꆎ\u0001"))) {
                throw e5;
            }
        } catch (Exception unused) {
        }
    }

    @l
    public static final String[] o(@l String[] strArr, @l String str) {
        l0.p(strArr, ProtectedSandApp.s("ꆏ\u0001"));
        l0.p(str, ProtectedSandApp.s("ꅋ\u0001"));
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        l0.o(copyOf, ProtectedSandApp.s("ꆐ\u0001"));
        String[] strArr2 = (String[]) copyOf;
        strArr2[kotlin.collections.l.we(strArr2)] = str;
        return strArr2;
    }

    public static final int p(@l String str, char c5, int i4, int i5) {
        l0.p(str, ProtectedSandApp.s("ꆑ\u0001"));
        while (i4 < i5) {
            if (str.charAt(i4) == c5) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static final int q(@l String str, @l String str2, int i4, int i5) {
        l0.p(str, ProtectedSandApp.s("ꆑ\u0001"));
        l0.p(str2, ProtectedSandApp.s("ꆒ\u0001"));
        while (i4 < i5) {
            if (v.S2(str2, str.charAt(i4), false, 2, null)) {
                return i4;
            }
            i4++;
        }
        return i5;
    }

    public static /* synthetic */ int r(String str, char c5, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = str.length();
        }
        return p(str, c5, i4, i5);
    }

    public static /* synthetic */ int s(String str, String str2, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            i5 = str.length();
        }
        return q(str, str2, i4, i5);
    }

    public static final boolean t(@l o0 o0Var, int i4, @l TimeUnit timeUnit) {
        l0.p(o0Var, ProtectedSandApp.s("ꆓ\u0001"));
        l0.p(timeUnit, ProtectedSandApp.s("ꅩ\u0001"));
        try {
            return T(o0Var, i4, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @l
    public static final <T> List<T> u(@l Iterable<? extends T> iterable, @l ld.l<? super T, Boolean> lVar) {
        l0.p(iterable, ProtectedSandApp.s("ꆔ\u0001"));
        l0.p(lVar, ProtectedSandApp.s("ꆕ\u0001"));
        ArrayList arrayList = j0.f74919b;
        for (T t4 : iterable) {
            if (lVar.invoke(t4).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                u1.g(arrayList).add(t4);
            }
        }
        return arrayList;
    }

    @l
    public static final String v(@l String str, @l Object... objArr) {
        l0.p(str, ProtectedSandApp.s("ꆖ\u0001"));
        l0.p(objArr, ProtectedSandApp.s("ꆗ\u0001"));
        t1 t1Var = t1.f75371a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return u9.a(copyOf, copyOf.length, locale, str, ProtectedSandApp.s("ꆘ\u0001"));
    }

    public static final boolean w(@l String[] strArr, @fg.m String[] strArr2, @l Comparator<? super String> comparator) {
        l0.p(strArr, ProtectedSandApp.s("ꆙ\u0001"));
        l0.p(comparator, ProtectedSandApp.s("ꅌ\u0001"));
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long x(@l f0 f0Var) {
        l0.p(f0Var, ProtectedSandApp.s("ꆚ\u0001"));
        String f4 = f0Var.getHeaders().f(ProtectedSandApp.s("ꆛ\u0001"));
        if (f4 != null) {
            return e0(f4, -1L);
        }
        return -1L;
    }

    public static final void y(@l ld.a<k2> aVar) {
        l0.p(aVar, ProtectedSandApp.s("ꅫ\u0001"));
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @l
    @SafeVarargs
    public static final <T> List<T> z(@l T... tArr) {
        l0.p(tArr, ProtectedSandApp.s("ꆜ\u0001"));
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(w.O(Arrays.copyOf(objArr, objArr.length)));
        l0.o(unmodifiableList, ProtectedSandApp.s("ꆝ\u0001"));
        return unmodifiableList;
    }
}
