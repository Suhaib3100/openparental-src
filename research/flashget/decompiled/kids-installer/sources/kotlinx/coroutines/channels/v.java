package kotlinx.coroutines.channels;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.a1;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.m2;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.m1;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aL\u0010\n\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t2\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a+\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013\u001a+\u0010\u0019\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a%\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013\u001a#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001a%\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0013\u001a0\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001aV\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aV\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010'\u001ak\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010%\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aV\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010'\u001a$\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0001\u001aC\u0010/\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020$\"\u0010\b\u0001\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00000-*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001aA\u00102\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020$\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u00028\u000001*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a0\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001aV\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010'\u001a;\u00106\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u00028\u000001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b6\u00103\u001a=\u00107\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0010\b\u0001\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00000-*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b7\u00100\u001aA\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010;\"\u0004\b\u0000\u00108\"\u0004\b\u0001\u00109*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b<\u0010\u0013\u001aW\u0010?\u001a\u00028\u0002\"\u0004\b\u0000\u00108\"\u0004\b\u0001\u00109\"\u0018\b\u0002\u0010>*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010=*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u00012\u0006\u0010.\u001a\u00028\u0002H\u0081@ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a)\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bB\u0010\u0013\u001a)\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bD\u0010\u0013\u001ab\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2(\u0010E\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\bF\u0010'\u001a\\\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010E\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010'\u001aq\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010E\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010*\u001aw\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u001c*\u00020$*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e29\u0010E\u001a5\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010*\u001ab\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u001c*\u00020$*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2$\u0010E\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010'\u001a.\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000I0\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001a\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\\\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u00108*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010L\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010'\u001a)\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000N\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\bO\u0010\u0013\u001a#\u0010P\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bP\u0010\u0013\u001a#\u0010Q\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0013\u001aA\u0010>\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010T\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Rj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`SH\u0087@ø\u0001\u0000¢\u0006\u0004\b>\u0010U\u001aA\u0010V\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010T\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Rj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`SH\u0087@ø\u0001\u0000¢\u0006\u0004\bV\u0010U\u001a#\u0010W\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bW\u0010\u0013\u001a$\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0007\u001a?\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0087\u0004\u001az\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c\"\u0004\b\u0002\u00109*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e26\u0010E\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b([\u0012\u0004\u0012\u00028\u00020!H\u0001\u001a1\u0010[\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t*\u0006\u0012\u0002\b\u00030\u0001H\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"", "Lkotlinx/coroutines/channels/g0;", "channels", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/m2;", "Lkotlinx/coroutines/CompletionHandler;", "c", "([Lkotlinx/coroutines/channels/g0;)Lq3/l;", "E", "", "index", "l", "(Lkotlinx/coroutines/channels/g0;ILkotlin/coroutines/d;)Ljava/lang/Object;", "m", "w", "(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "x", "element", "A", "(Lkotlinx/coroutines/channels/g0;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "B", "C", "D", "Q", "R", "n", "Lkotlin/coroutines/g;", "context", "h", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "j", "(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/g;Lq3/p;)Lkotlinx/coroutines/channels/g0;", "Lkotlin/Function3;", "p", "(Lkotlinx/coroutines/channels/g0;Lkotlin/coroutines/g;Lq3/q;)Lkotlinx/coroutines/channels/g0;", "r", "t", "", "destination", "u", "(Lkotlinx/coroutines/channels/g0;Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/k0;", "v", "(Lkotlinx/coroutines/channels/g0;Lkotlinx/coroutines/channels/k0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "S", "U", "W", "X", "K", "V", "Lkotlin/q0;", "", "Z", "", "M", "Y", "(Lkotlinx/coroutines/channels/g0;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a0", "", "c0", "transform", "y", "G", "I", "Lkotlin/collections/u0;", "d0", "e", "selector", "f", "", "b0", "a", "d", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Lkotlinx/coroutines/channels/g0;Ljava/util/Comparator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "N", "O", "P", "other", "f0", "b", "g0", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes5.dex */
final /* synthetic */ class v {

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {404}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27415r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f27416s;

        /* renamed from: t, reason: collision with root package name */
        int f27417t;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27416s = obj;
            this.f27417t |= Integer.MIN_VALUE;
            return v.a(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {434, 436}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class a0<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27418r;

        /* renamed from: s, reason: collision with root package name */
        Object f27419s;

        /* renamed from: t, reason: collision with root package name */
        Object f27420t;

        /* renamed from: u, reason: collision with root package name */
        Object f27421u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f27422v;

        /* renamed from: w, reason: collision with root package name */
        int f27423w;

        a0(Continuation<? super a0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27422v = obj;
            this.f27423w |= Integer.MIN_VALUE;
            return v.N(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.l<Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<?> f27424p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlinx.coroutines.channels.g0<?> g0Var) {
            super(1);
            this.f27424p = g0Var;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.e Throwable th) {
            kotlinx.coroutines.channels.u.a(this.f27424p, th);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {447}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class b0<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27425r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f27426s;

        /* renamed from: t, reason: collision with root package name */
        int f27427t;

        b0(Continuation<? super b0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27426s = obj;
            this.f27427t |= Integer.MIN_VALUE;
            return v.O(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/m2;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.l<Throwable, m2> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<?>[] f27428p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlinx.coroutines.channels.g0<?>[] g0VarArr) {
            super(1);
            this.f27428p = g0VarArr;
        }

        @Override // q3.l
        public /* bridge */ /* synthetic */ m2 N(Throwable th) {
            a(th);
            return m2.f23662a;
        }

        public final void a(@d5.e Throwable th) {
            Throwable th2 = null;
            for (kotlinx.coroutines.channels.g0<?> g0Var : this.f27428p) {
                try {
                    kotlinx.coroutines.channels.u.a(g0Var, th);
                } catch (Throwable th3) {
                    if (th2 == null) {
                        th2 = th3;
                    } else {
                        kotlin.p.a(th2, th3);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u008a@"}, d2 = {"", "E", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class c0 extends SuspendLambda implements q3.p<Object, Continuation<Object>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27429s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f27430t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> f27431u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(kotlinx.coroutines.channels.g0<Object> g0Var, Continuation<? super c0> continuation) {
            super(2, continuation);
            this.f27431u = g0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f27429s != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("邞"));
            }
            a1.n(obj);
            Object obj2 = this.f27430t;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("邝") + this.f27431u + org.apache.commons.io.k.f32026a);
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.e Object obj, @d5.e Continuation<Object> continuation) {
            return ((c0) c(obj, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            c0 c0Var = new c0(this.f27431u, continuation);
            c0Var.f27430t = obj;
            return c0Var;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class d<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27432r;

        /* renamed from: s, reason: collision with root package name */
        Object f27433s;

        /* renamed from: t, reason: collision with root package name */
        Object f27434t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27435u;

        /* renamed from: v, reason: collision with root package name */
        int f27436v;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27435u = obj;
            this.f27436v |= Integer.MIN_VALUE;
            return v.d(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {SyslogAppender.LOG_LOCAL1, 139}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class d0<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27437r;

        /* renamed from: s, reason: collision with root package name */
        Object f27438s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f27439t;

        /* renamed from: u, reason: collision with root package name */
        int f27440u;

        d0(Continuation<? super d0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27439t = obj;
            this.f27440u |= Integer.MIN_VALUE;
            return v.Q(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"E", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class e extends SuspendLambda implements q3.p<Object, Continuation<Object>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27441s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f27442t;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f27441s != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("邟"));
            }
            a1.n(obj);
            return this.f27442t;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(Object obj, @d5.e Continuation<Object> continuation) {
            return ((e) c(obj, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.f27442t = obj;
            return eVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {149, SyslogAppender.LOG_LOCAL3}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class e0<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27443r;

        /* renamed from: s, reason: collision with root package name */
        Object f27444s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f27445t;

        /* renamed from: u, reason: collision with root package name */
        int f27446u;

        e0(Continuation<? super e0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27445t = obj;
            this.f27446u |= Integer.MIN_VALUE;
            return v.R(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, d2 = {"E", "K", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class f<E> extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<? super E>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27447s;

        /* renamed from: t, reason: collision with root package name */
        Object f27448t;

        /* renamed from: u, reason: collision with root package name */
        Object f27449u;

        /* renamed from: v, reason: collision with root package name */
        int f27450v;

        /* renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f27451w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<E> f27452x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ q3.p<E, Continuation<? super K>, Object> f27453y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(kotlinx.coroutines.channels.g0<? extends E> g0Var, q3.p<? super E, ? super Continuation<? super K>, ? extends Object> pVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f27452x = g0Var;
            this.f27453y = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0084 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v19 */
        /* JADX WARN: Type inference failed for: r6v4 */
        /* JADX WARN: Type inference failed for: r6v9, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c7 -> B:7:0x00cd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d4 -> B:8:0x0073). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 221
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.f.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<? super E> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((f) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            f fVar = new f(this.f27452x, this.f27453y, continuation);
            fVar.f27451w = obj;
            return fVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class f0 extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<Object>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27454s;

        /* renamed from: t, reason: collision with root package name */
        int f27455t;

        /* renamed from: u, reason: collision with root package name */
        int f27456u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f27457v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f27458w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> f27459x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(int i5, kotlinx.coroutines.channels.g0<Object> g0Var, Continuation<? super f0> continuation) {
            super(2, continuation);
            this.f27458w = i5;
            this.f27459x = g0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0062 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0081 -> B:6:0x0082). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r8.f27456u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L38
                if (r1 == r3) goto L28
                if (r1 != r2) goto L1c
                int r1 = r8.f27455t
                java.lang.Object r4 = r8.f27454s
                kotlinx.coroutines.channels.p r4 = (kotlinx.coroutines.channels.p) r4
                java.lang.Object r5 = r8.f27457v
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.a1.n(r9)
                r9 = r5
                r5 = r8
                goto L82
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "邠"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r9.<init>(r0)
                throw r9
            L28:
                int r1 = r8.f27455t
                java.lang.Object r4 = r8.f27454s
                kotlinx.coroutines.channels.p r4 = (kotlinx.coroutines.channels.p) r4
                java.lang.Object r5 = r8.f27457v
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.a1.n(r9)
                r6 = r5
                r5 = r8
                goto L66
            L38:
                kotlin.a1.n(r9)
                java.lang.Object r9 = r8.f27457v
                kotlinx.coroutines.channels.e0 r9 = (kotlinx.coroutines.channels.e0) r9
                int r1 = r8.f27458w
                if (r1 != 0) goto L46
                kotlin.m2 r9 = kotlin.m2.f23662a
                return r9
            L46:
                if (r1 < 0) goto L4a
                r4 = r3
                goto L4b
            L4a:
                r4 = 0
            L4b:
                if (r4 == 0) goto L8c
                kotlinx.coroutines.channels.g0<java.lang.Object> r4 = r8.f27459x
                kotlinx.coroutines.channels.p r4 = r4.iterator()
                r5 = r8
            L54:
                r5.f27457v = r9
                r5.f27454s = r4
                r5.f27455t = r1
                r5.f27456u = r3
                java.lang.Object r6 = r4.a(r5)
                if (r6 != r0) goto L63
                return r0
            L63:
                r7 = r6
                r6 = r9
                r9 = r7
            L66:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L89
                java.lang.Object r9 = r4.next()
                r5.f27457v = r6
                r5.f27454s = r4
                r5.f27455t = r1
                r5.f27456u = r2
                java.lang.Object r9 = r6.a0(r9, r5)
                if (r9 != r0) goto L81
                return r0
            L81:
                r9 = r6
            L82:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L54
                kotlin.m2 r9 = kotlin.m2.f23662a
                return r9
            L89:
                kotlin.m2 r9 = kotlin.m2.f23662a
                return r9
            L8c:
                java.lang.String r9 = "邡"
                java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
                java.lang.String r0 = "邢"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                java.lang.String r9 = androidx.constraintlayout.solver.f.a(r9, r1, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.f0.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<Object> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((f0) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            f0 f0Var = new f0(this.f27458w, this.f27459x, continuation);
            f0Var.f27457v = obj;
            return f0Var;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {164, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class g extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<Object>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27460s;

        /* renamed from: t, reason: collision with root package name */
        int f27461t;

        /* renamed from: u, reason: collision with root package name */
        int f27462u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f27463v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f27464w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> f27465x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i5, kotlinx.coroutines.channels.g0<Object> g0Var, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f27464w = i5;
            this.f27465x = g0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00b9 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00da -> B:7:0x00ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007c -> B:24:0x0086). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.g.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<Object> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((g) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            g gVar = new g(this.f27464w, this.f27465x, continuation);
            gVar.f27463v = obj;
            return gVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {269, SubsamplingScaleImageView.ORIENTATION_270, 271}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class g0 extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<Object>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27466s;

        /* renamed from: t, reason: collision with root package name */
        Object f27467t;

        /* renamed from: u, reason: collision with root package name */
        int f27468u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f27469v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> f27470w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ q3.p<Object, Continuation<? super Boolean>, Object> f27471x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g0(kotlinx.coroutines.channels.g0<Object> g0Var, q3.p<Object, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super g0> continuation) {
            super(2, continuation);
            this.f27470w = g0Var;
            this.f27471x = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a9 -> B:8:0x0059). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.f27468u
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L4a
                if (r1 == r4) goto L3a
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r9.f27466s
                kotlinx.coroutines.channels.p r1 = (kotlinx.coroutines.channels.p) r1
                java.lang.Object r5 = r9.f27469v
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.a1.n(r10)
                goto L58
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "邤"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.f27467t
                java.lang.Object r5 = r9.f27466s
                kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
                java.lang.Object r6 = r9.f27469v
                kotlinx.coroutines.channels.e0 r6 = (kotlinx.coroutines.channels.e0) r6
                kotlin.a1.n(r10)
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L8e
            L3a:
                java.lang.Object r1 = r9.f27466s
                kotlinx.coroutines.channels.p r1 = (kotlinx.coroutines.channels.p) r1
                java.lang.Object r5 = r9.f27469v
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.a1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L6c
            L4a:
                kotlin.a1.n(r10)
                java.lang.Object r10 = r9.f27469v
                kotlinx.coroutines.channels.e0 r10 = (kotlinx.coroutines.channels.e0) r10
                kotlinx.coroutines.channels.g0<java.lang.Object> r1 = r9.f27470w
                kotlinx.coroutines.channels.p r1 = r1.iterator()
                r5 = r10
            L58:
                r10 = r9
            L59:
                r10.f27469v = r5
                r10.f27466s = r1
                r10.f27468u = r4
                java.lang.Object r6 = r1.a(r10)
                if (r6 != r0) goto L66
                return r0
            L66:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L6c:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto Lae
                java.lang.Object r10 = r5.next()
                q3.p<java.lang.Object, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r7 = r0.f27471x
                r0.f27469v = r6
                r0.f27466s = r5
                r0.f27467t = r10
                r0.f27468u = r3
                java.lang.Object r7 = r7.g0(r10, r0)
                if (r7 != r1) goto L89
                return r1
            L89:
                r8 = r5
                r5 = r10
                r10 = r7
                r7 = r6
                r6 = r8
            L8e:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L99
                kotlin.m2 r10 = kotlin.m2.f23662a
                return r10
            L99:
                r0.f27469v = r7
                r0.f27466s = r6
                r10 = 0
                r0.f27467t = r10
                r0.f27468u = r2
                java.lang.Object r10 = r7.a0(r5, r0)
                if (r10 != r1) goto La9
                return r1
            La9:
                r10 = r0
                r0 = r1
                r1 = r6
                r5 = r7
                goto L59
            Lae:
                kotlin.m2 r10 = kotlin.m2.f23662a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.g0.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<Object> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((g0) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            g0 g0Var = new g0(this.f27470w, this.f27471x, continuation);
            g0Var.f27469v = obj;
            return g0Var;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, 183, 187, 188}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class h extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<Object>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27472s;

        /* renamed from: t, reason: collision with root package name */
        Object f27473t;

        /* renamed from: u, reason: collision with root package name */
        int f27474u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f27475v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> f27476w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ q3.p<Object, Continuation<? super Boolean>, Object> f27477x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(kotlinx.coroutines.channels.g0<Object> g0Var, q3.p<Object, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f27476w = g0Var;
            this.f27477x = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x00e7 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0104 -> B:9:0x00db). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b3 -> B:29:0x00b7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.h.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<Object> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((h) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            h hVar = new h(this.f27476w, this.f27477x, continuation);
            hVar.f27475v = obj;
            return hVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 278}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class h0<E, C extends kotlinx.coroutines.channels.k0<? super E>> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27478r;

        /* renamed from: s, reason: collision with root package name */
        Object f27479s;

        /* renamed from: t, reason: collision with root package name */
        Object f27480t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27481u;

        /* renamed from: v, reason: collision with root package name */
        int f27482v;

        h0(Continuation<? super h0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27481u = obj;
            this.f27482v |= Integer.MIN_VALUE;
            return v.W(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class i<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        int f27483r;

        /* renamed from: s, reason: collision with root package name */
        int f27484s;

        /* renamed from: t, reason: collision with root package name */
        Object f27485t;

        /* renamed from: u, reason: collision with root package name */
        Object f27486u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f27487v;

        /* renamed from: w, reason: collision with root package name */
        int f27488w;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27487v = obj;
            this.f27488w |= Integer.MIN_VALUE;
            return v.l(null, 0, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class i0<E, C extends Collection<? super E>> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27489r;

        /* renamed from: s, reason: collision with root package name */
        Object f27490s;

        /* renamed from: t, reason: collision with root package name */
        Object f27491t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27492u;

        /* renamed from: v, reason: collision with root package name */
        int f27493v;

        i0(Continuation<? super i0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27492u = obj;
            this.f27493v |= Integer.MIN_VALUE;
            return v.X(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {53}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class j<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        int f27494r;

        /* renamed from: s, reason: collision with root package name */
        int f27495s;

        /* renamed from: t, reason: collision with root package name */
        Object f27496t;

        /* renamed from: u, reason: collision with root package name */
        Object f27497u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f27498v;

        /* renamed from: w, reason: collision with root package name */
        int f27499w;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27498v = obj;
            this.f27499w |= Integer.MIN_VALUE;
            return v.m(null, 0, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class j0<K, V, M extends Map<? super K, ? super V>> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27500r;

        /* renamed from: s, reason: collision with root package name */
        Object f27501s;

        /* renamed from: t, reason: collision with root package name */
        Object f27502t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27503u;

        /* renamed from: v, reason: collision with root package name */
        int f27504v;

        j0(Continuation<? super j0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27503u = obj;
            this.f27504v |= Integer.MIN_VALUE;
            return v.Y(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, 199, 199}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class k<E> extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<? super E>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27505s;

        /* renamed from: t, reason: collision with root package name */
        Object f27506t;

        /* renamed from: u, reason: collision with root package name */
        int f27507u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f27508v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<E> f27509w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ q3.p<E, Continuation<? super Boolean>, Object> f27510x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(kotlinx.coroutines.channels.g0<? extends E> g0Var, q3.p<? super E, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f27509w = g0Var;
            this.f27510x = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        
            r11 = r0;
            r0 = r1;
            r1 = r6;
            r6 = r8;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0067 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r10.f27507u
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L4a
                if (r1 == r5) goto L3a
                if (r1 == r4) goto L28
                if (r1 != r3) goto L1c
                java.lang.Object r1 = r10.f27505s
                kotlinx.coroutines.channels.p r1 = (kotlinx.coroutines.channels.p) r1
                java.lang.Object r6 = r10.f27508v
                kotlinx.coroutines.channels.e0 r6 = (kotlinx.coroutines.channels.e0) r6
                kotlin.a1.n(r11)
                goto L58
            L1c:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "邪"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r11.<init>(r0)
                throw r11
            L28:
                java.lang.Object r1 = r10.f27506t
                java.lang.Object r6 = r10.f27505s
                kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
                java.lang.Object r7 = r10.f27508v
                kotlinx.coroutines.channels.e0 r7 = (kotlinx.coroutines.channels.e0) r7
                kotlin.a1.n(r11)
                r8 = r7
                r7 = r1
                r1 = r0
                r0 = r10
                goto L8f
            L3a:
                java.lang.Object r1 = r10.f27505s
                kotlinx.coroutines.channels.p r1 = (kotlinx.coroutines.channels.p) r1
                java.lang.Object r6 = r10.f27508v
                kotlinx.coroutines.channels.e0 r6 = (kotlinx.coroutines.channels.e0) r6
                kotlin.a1.n(r11)
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r10
                goto L6e
            L4a:
                kotlin.a1.n(r11)
                java.lang.Object r11 = r10.f27508v
                kotlinx.coroutines.channels.e0 r11 = (kotlinx.coroutines.channels.e0) r11
                kotlinx.coroutines.channels.g0<E> r1 = r10.f27509w
                kotlinx.coroutines.channels.p r1 = r1.iterator()
                r6 = r11
            L58:
                r11 = r10
            L59:
                r11.f27508v = r6
                r11.f27505s = r1
                r11.f27506t = r2
                r11.f27507u = r5
                java.lang.Object r7 = r1.a(r11)
                if (r7 != r0) goto L68
                return r0
            L68:
                r9 = r0
                r0 = r11
                r11 = r7
                r7 = r6
                r6 = r1
                r1 = r9
            L6e:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lab
                java.lang.Object r11 = r6.next()
                q3.p<E, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r8 = r0.f27510x
                r0.f27508v = r7
                r0.f27505s = r6
                r0.f27506t = r11
                r0.f27507u = r4
                java.lang.Object r8 = r8.g0(r11, r0)
                if (r8 != r1) goto L8b
                return r1
            L8b:
                r9 = r7
                r7 = r11
                r11 = r8
                r8 = r9
            L8f:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto La6
                r0.f27508v = r8
                r0.f27505s = r6
                r0.f27506t = r2
                r0.f27507u = r3
                java.lang.Object r11 = r8.a0(r7, r0)
                if (r11 != r1) goto La6
                return r1
            La6:
                r11 = r0
                r0 = r1
                r1 = r6
                r6 = r8
                goto L59
            Lab:
                kotlin.m2 r11 = kotlin.m2.f23662a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.k.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<? super E> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((k) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            k kVar = new k(this.f27509w, this.f27510x, continuation);
            kVar.f27508v = obj;
            return kVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/collections/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class k0 extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<? super IndexedValue<Object>>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27511s;

        /* renamed from: t, reason: collision with root package name */
        int f27512t;

        /* renamed from: u, reason: collision with root package name */
        int f27513u;

        /* renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f27514v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> f27515w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(kotlinx.coroutines.channels.g0<Object> g0Var, Continuation<? super k0> continuation) {
            super(2, continuation);
            this.f27515w = g0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0081 -> B:6:0x0049). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r11.f27513u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L2b
                if (r1 != r2) goto L1f
                int r1 = r11.f27512t
                java.lang.Object r4 = r11.f27511s
                kotlinx.coroutines.channels.p r4 = (kotlinx.coroutines.channels.p) r4
                java.lang.Object r5 = r11.f27514v
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.a1.n(r12)
                r12 = r5
                r5 = r11
                r9 = r4
                r4 = r1
                r1 = r9
                goto L49
            L1f:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "邩"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r12.<init>(r0)
                throw r12
            L2b:
                int r1 = r11.f27512t
                java.lang.Object r4 = r11.f27511s
                kotlinx.coroutines.channels.p r4 = (kotlinx.coroutines.channels.p) r4
                java.lang.Object r5 = r11.f27514v
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.a1.n(r12)
                r6 = r11
                goto L5f
            L3a:
                kotlin.a1.n(r12)
                java.lang.Object r12 = r11.f27514v
                kotlinx.coroutines.channels.e0 r12 = (kotlinx.coroutines.channels.e0) r12
                kotlinx.coroutines.channels.g0<java.lang.Object> r1 = r11.f27515w
                kotlinx.coroutines.channels.p r1 = r1.iterator()
                r4 = 0
                r5 = r11
            L49:
                r5.f27514v = r12
                r5.f27511s = r1
                r5.f27512t = r4
                r5.f27513u = r3
                java.lang.Object r6 = r1.a(r5)
                if (r6 != r0) goto L58
                return r0
            L58:
                r9 = r5
                r5 = r12
                r12 = r6
                r6 = r9
                r10 = r4
                r4 = r1
                r1 = r10
            L5f:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L86
                java.lang.Object r12 = r4.next()
                kotlin.collections.u0 r7 = new kotlin.collections.u0
                int r8 = r1 + 1
                r7.<init>(r1, r12)
                r6.f27514v = r5
                r6.f27511s = r4
                r6.f27512t = r8
                r6.f27513u = r2
                java.lang.Object r12 = r5.a0(r7, r6)
                if (r12 != r0) goto L81
                return r0
            L81:
                r1 = r4
                r12 = r5
                r5 = r6
                r4 = r8
                goto L49
            L86:
                kotlin.m2 r12 = kotlin.m2.f23662a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.k0.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<? super IndexedValue<Object>> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((k0) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            k0 k0Var = new k0(this.f27515w, continuation);
            k0Var.f27514v = obj;
            return k0Var;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"E", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class l extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<Object>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27516s;

        /* renamed from: t, reason: collision with root package name */
        Object f27517t;

        /* renamed from: u, reason: collision with root package name */
        int f27518u;

        /* renamed from: v, reason: collision with root package name */
        int f27519v;

        /* renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f27520w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> f27521x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ q3.q<Integer, Object, Continuation<? super Boolean>, Object> f27522y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(kotlinx.coroutines.channels.g0<Object> g0Var, q3.q<? super Integer, Object, ? super Continuation<? super Boolean>, ? extends Object> qVar, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f27521x = g0Var;
            this.f27522y = qVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        
            r14 = r0;
            r0 = r1;
            r7 = r8;
            r1 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 203
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.l.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<Object> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((l) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            l lVar = new l(this.f27521x, this.f27522y, continuation);
            lVar.f27520w = obj;
            return lVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"E", "R", "t1", "t2", "Lkotlin/q0;", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/q0;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class l0 extends Lambda implements q3.p<Object, Object, Pair<Object, Object>> {

        /* renamed from: p, reason: collision with root package name */
        public static final l0 f27523p = new l0();

        l0() {
            super(2);
        }

        @d5.d
        public final Pair<Object, Object> a(Object obj, Object obj2) {
            return new Pair<>(obj, obj2);
        }

        @Override // q3.p
        public Pair<Object, Object> g0(Object obj, Object obj2) {
            return new Pair<>(obj, obj2);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"E", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class m extends SuspendLambda implements q3.p<Object, Continuation<? super Boolean>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27524s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f27525t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ q3.p<Object, Continuation<? super Boolean>, Object> f27526u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(q3.p<Object, ? super Continuation<? super Boolean>, ? extends Object> pVar, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f27526u = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f27524s;
            if (i5 == 0) {
                a1.n(obj);
                Object obj2 = this.f27525t;
                q3.p<Object, Continuation<? super Boolean>, Object> pVar = this.f27526u;
                this.f27524s = 1;
                obj = pVar.g0(obj2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("邭"));
                }
                a1.n(obj);
            }
            return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(Object obj, @d5.e Continuation<? super Boolean> continuation) {
            return ((m) c(obj, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            m mVar = new m(this.f27526u, continuation);
            mVar.f27525t = obj;
            return mVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@"}, d2 = {"E", "R", "V", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class m0<V> extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<? super V>, Continuation<? super m2>, Object> {
        final /* synthetic */ kotlinx.coroutines.channels.g0<E> A;
        final /* synthetic */ q3.p<E, R, V> B;

        /* renamed from: s, reason: collision with root package name */
        Object f27527s;

        /* renamed from: t, reason: collision with root package name */
        Object f27528t;

        /* renamed from: u, reason: collision with root package name */
        Object f27529u;

        /* renamed from: v, reason: collision with root package name */
        Object f27530v;

        /* renamed from: w, reason: collision with root package name */
        Object f27531w;

        /* renamed from: x, reason: collision with root package name */
        int f27532x;

        /* renamed from: y, reason: collision with root package name */
        private /* synthetic */ Object f27533y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<R> f27534z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m0(kotlinx.coroutines.channels.g0<? extends R> g0Var, kotlinx.coroutines.channels.g0<? extends E> g0Var2, q3.p<? super E, ? super R, ? extends V> pVar, Continuation<? super m0> continuation) {
            super(2, continuation);
            this.f27534z = g0Var;
            this.A = g0Var2;
            this.B = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
        
            r14 = r0;
            r0 = r1;
            r1 = r6;
            r6 = r8;
            r7 = r9;
            r8 = r10;
            r9 = r11;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00bb A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #3 {all -> 0x0058, blocks: (B:15:0x00b3, B:17:0x00bb, B:38:0x010b, B:49:0x004c), top: B:48:0x004c }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e3 A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #2 {all -> 0x0108, blocks: (B:22:0x00db, B:24:0x00e3), top: B:21:0x00db }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x010b A[Catch: all -> 0x0058, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0058, blocks: (B:15:0x00b3, B:17:0x00bb, B:38:0x010b, B:49:0x004c), top: B:48:0x004c }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.m0.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<? super V> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((m0) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            m0 m0Var = new m0(this.f27534z, this.A, this.B, continuation);
            m0Var.f27533y = obj;
            return m0Var;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u008a@"}, d2 = {"", "E", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class n<E> extends SuspendLambda implements q3.p<E, Continuation<? super Boolean>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f27535s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f27536t;

        n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f27535s != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("邮"));
            }
            a1.n(obj);
            return Boolean.valueOf(this.f27536t != null);
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.e E e6, @d5.e Continuation<? super Boolean> continuation) {
            return ((n) c(e6, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            n nVar = new n(continuation);
            nVar.f27536t = obj;
            return nVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class o<E, C extends Collection<? super E>> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27537r;

        /* renamed from: s, reason: collision with root package name */
        Object f27538s;

        /* renamed from: t, reason: collision with root package name */
        Object f27539t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27540u;

        /* renamed from: v, reason: collision with root package name */
        int f27541v;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27540u = obj;
            this.f27541v |= Integer.MIN_VALUE;
            return v.u(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 242}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class p<E, C extends kotlinx.coroutines.channels.k0<? super E>> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27542r;

        /* renamed from: s, reason: collision with root package name */
        Object f27543s;

        /* renamed from: t, reason: collision with root package name */
        Object f27544t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27545u;

        /* renamed from: v, reason: collision with root package name */
        int f27546v;

        p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27545u = obj;
            this.f27546v |= Integer.MIN_VALUE;
            return v.v(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class q<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27547r;

        /* renamed from: s, reason: collision with root package name */
        Object f27548s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f27549t;

        /* renamed from: u, reason: collision with root package name */
        int f27550u;

        q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27549t = obj;
            this.f27550u |= Integer.MIN_VALUE;
            return v.w(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {75}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class r<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27551r;

        /* renamed from: s, reason: collision with root package name */
        Object f27552s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f27553t;

        /* renamed from: u, reason: collision with root package name */
        int f27554u;

        r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27553t = obj;
            this.f27554u |= Integer.MIN_VALUE;
            return v.x(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class s extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<Object>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27555s;

        /* renamed from: t, reason: collision with root package name */
        int f27556t;

        /* renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f27557u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<Object> f27558v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ q3.p<Object, Continuation<? super kotlinx.coroutines.channels.g0<Object>>, Object> f27559w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(kotlinx.coroutines.channels.g0<Object> g0Var, q3.p<Object, ? super Continuation<? super kotlinx.coroutines.channels.g0<Object>>, ? extends Object> pVar, Continuation<? super s> continuation) {
            super(2, continuation);
            this.f27558v = g0Var;
            this.f27559w = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0062 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0092 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0093 -> B:8:0x0056). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r9.f27556t
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L47
                if (r1 == r4) goto L37
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r9.f27555s
                kotlinx.coroutines.channels.p r1 = (kotlinx.coroutines.channels.p) r1
                java.lang.Object r5 = r9.f27557u
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.a1.n(r10)
                goto L55
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "邯"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.f27555s
                kotlinx.coroutines.channels.p r1 = (kotlinx.coroutines.channels.p) r1
                java.lang.Object r5 = r9.f27557u
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.a1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L84
            L37:
                java.lang.Object r1 = r9.f27555s
                kotlinx.coroutines.channels.p r1 = (kotlinx.coroutines.channels.p) r1
                java.lang.Object r5 = r9.f27557u
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                kotlin.a1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L69
            L47:
                kotlin.a1.n(r10)
                java.lang.Object r10 = r9.f27557u
                kotlinx.coroutines.channels.e0 r10 = (kotlinx.coroutines.channels.e0) r10
                kotlinx.coroutines.channels.g0<java.lang.Object> r1 = r9.f27558v
                kotlinx.coroutines.channels.p r1 = r1.iterator()
                r5 = r10
            L55:
                r10 = r9
            L56:
                r10.f27557u = r5
                r10.f27555s = r1
                r10.f27556t = r4
                java.lang.Object r6 = r1.a(r10)
                if (r6 != r0) goto L63
                return r0
            L63:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L69:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L98
                java.lang.Object r10 = r5.next()
                q3.p<java.lang.Object, kotlin.coroutines.d<? super kotlinx.coroutines.channels.g0<java.lang.Object>>, java.lang.Object> r7 = r0.f27559w
                r0.f27557u = r6
                r0.f27555s = r5
                r0.f27556t = r3
                java.lang.Object r10 = r7.g0(r10, r0)
                if (r10 != r1) goto L84
                return r1
            L84:
                kotlinx.coroutines.channels.g0 r10 = (kotlinx.coroutines.channels.g0) r10
                r0.f27557u = r6
                r0.f27555s = r5
                r0.f27556t = r2
                java.lang.Object r10 = kotlinx.coroutines.channels.v.W(r10, r6, r0)
                if (r10 != r1) goto L93
                return r1
            L93:
                r10 = r0
                r0 = r1
                r1 = r5
                r5 = r6
                goto L56
            L98:
                kotlin.m2 r10 = kotlin.m2.f23662a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.s.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<Object> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((s) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            s sVar = new s(this.f27558v, this.f27559w, continuation);
            sVar.f27557u = obj;
            return sVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {487}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class t<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27560r;

        /* renamed from: s, reason: collision with root package name */
        Object f27561s;

        /* renamed from: t, reason: collision with root package name */
        Object f27562t;

        /* renamed from: u, reason: collision with root package name */
        Object f27563u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f27564v;

        /* renamed from: w, reason: collision with root package name */
        int f27565w;

        t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27564v = obj;
            this.f27565w |= Integer.MIN_VALUE;
            return v.A(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {97, 100}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class u<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27566r;

        /* renamed from: s, reason: collision with root package name */
        Object f27567s;

        /* renamed from: t, reason: collision with root package name */
        Object f27568t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27569u;

        /* renamed from: v, reason: collision with root package name */
        int f27570v;

        u(Continuation<? super u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27569u = obj;
            this.f27570v |= Integer.MIN_VALUE;
            return v.B(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {487}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.v$v, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0412v<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27571r;

        /* renamed from: s, reason: collision with root package name */
        Object f27572s;

        /* renamed from: t, reason: collision with root package name */
        Object f27573t;

        /* renamed from: u, reason: collision with root package name */
        Object f27574u;

        /* renamed from: v, reason: collision with root package name */
        Object f27575v;

        /* renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f27576w;

        /* renamed from: x, reason: collision with root package name */
        int f27577x;

        C0412v(Continuation<? super C0412v> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27576w = obj;
            this.f27577x |= Integer.MIN_VALUE;
            return v.C(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {123, 126}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class w<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27578r;

        /* renamed from: s, reason: collision with root package name */
        Object f27579s;

        /* renamed from: t, reason: collision with root package name */
        Object f27580t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f27581u;

        /* renamed from: v, reason: collision with root package name */
        int f27582v;

        w(Continuation<? super w> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27581u = obj;
            this.f27582v |= Integer.MIN_VALUE;
            return v.D(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class x<R> extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27583s;

        /* renamed from: t, reason: collision with root package name */
        Object f27584t;

        /* renamed from: u, reason: collision with root package name */
        Object f27585u;

        /* renamed from: v, reason: collision with root package name */
        Object f27586v;

        /* renamed from: w, reason: collision with root package name */
        int f27587w;

        /* renamed from: x, reason: collision with root package name */
        private /* synthetic */ Object f27588x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<E> f27589y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ q3.p<E, Continuation<? super R>, Object> f27590z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(kotlinx.coroutines.channels.g0<? extends E> g0Var, q3.p<? super E, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super x> continuation) {
            super(2, continuation);
            this.f27589y = g0Var;
            this.f27590z = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0095 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:8:0x0020, B:10:0x0078, B:15:0x008d, B:17:0x0095, B:34:0x00cb, B:45:0x0060, B:48:0x0070), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00cb A[Catch: all -> 0x00d1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:8:0x0020, B:10:0x0078, B:15:0x008d, B:17:0x0095, B:34:0x00cb, B:45:0x0060, B:48:0x0070), top: B:2:0x0008 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c5 -> B:10:0x0078). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.x.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<? super R> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((x) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            x xVar = new x(this.f27589y, this.f27590z, continuation);
            xVar.f27588x = obj;
            return xVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/e0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes6.dex */
    static final class y<R> extends SuspendLambda implements q3.p<kotlinx.coroutines.channels.e0<? super R>, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f27591s;

        /* renamed from: t, reason: collision with root package name */
        Object f27592t;

        /* renamed from: u, reason: collision with root package name */
        int f27593u;

        /* renamed from: v, reason: collision with root package name */
        int f27594v;

        /* renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f27595w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.g0<E> f27596x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ q3.q<Integer, E, Continuation<? super R>, Object> f27597y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(kotlinx.coroutines.channels.g0<? extends E> g0Var, q3.q<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super y> continuation) {
            super(2, continuation);
            this.f27596x = g0Var;
            this.f27597y = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00af A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b0 -> B:7:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r12.f27594v
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L4e
                if (r1 == r4) goto L3f
                if (r1 == r3) goto L2b
                if (r1 != r2) goto L1f
                int r1 = r12.f27593u
                java.lang.Object r5 = r12.f27591s
                kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
                java.lang.Object r6 = r12.f27595w
                kotlinx.coroutines.channels.e0 r6 = (kotlinx.coroutines.channels.e0) r6
                kotlin.a1.n(r13)
                r13 = r6
                r6 = r12
                goto L60
            L1f:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "邱"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r13.<init>(r0)
                throw r13
            L2b:
                int r1 = r12.f27593u
                java.lang.Object r5 = r12.f27592t
                kotlinx.coroutines.channels.e0 r5 = (kotlinx.coroutines.channels.e0) r5
                java.lang.Object r6 = r12.f27591s
                kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
                java.lang.Object r7 = r12.f27595w
                kotlinx.coroutines.channels.e0 r7 = (kotlinx.coroutines.channels.e0) r7
                kotlin.a1.n(r13)
                r8 = r12
                goto L9e
            L3f:
                int r1 = r12.f27593u
                java.lang.Object r5 = r12.f27591s
                kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
                java.lang.Object r6 = r12.f27595w
                kotlinx.coroutines.channels.e0 r6 = (kotlinx.coroutines.channels.e0) r6
                kotlin.a1.n(r13)
                r7 = r12
                goto L73
            L4e:
                kotlin.a1.n(r13)
                java.lang.Object r13 = r12.f27595w
                kotlinx.coroutines.channels.e0 r13 = (kotlinx.coroutines.channels.e0) r13
                kotlinx.coroutines.channels.g0<E> r1 = r12.f27596x
                kotlinx.coroutines.channels.p r1 = r1.iterator()
                r5 = 0
                r6 = r12
                r11 = r5
                r5 = r1
                r1 = r11
            L60:
                r6.f27595w = r13
                r6.f27591s = r5
                r6.f27593u = r1
                r6.f27594v = r4
                java.lang.Object r7 = r5.a(r6)
                if (r7 != r0) goto L6f
                return r0
            L6f:
                r11 = r6
                r6 = r13
                r13 = r7
                r7 = r11
            L73:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb4
                java.lang.Object r13 = r5.next()
                q3.q<java.lang.Integer, E, kotlin.coroutines.d<? super R>, java.lang.Object> r8 = r7.f27597y
                int r9 = r1 + 1
                java.lang.Integer r10 = new java.lang.Integer
                r10.<init>(r1)
                r7.f27595w = r6
                r7.f27591s = r5
                r7.f27592t = r6
                r7.f27593u = r9
                r7.f27594v = r3
                java.lang.Object r13 = r8.G(r10, r13, r7)
                if (r13 != r0) goto L99
                return r0
            L99:
                r8 = r7
                r1 = r9
                r7 = r6
                r6 = r5
                r5 = r7
            L9e:
                r8.f27595w = r7
                r8.f27591s = r6
                r9 = 0
                r8.f27592t = r9
                r8.f27593u = r1
                r8.f27594v = r2
                java.lang.Object r13 = r5.a0(r13, r8)
                if (r13 != r0) goto Lb0
                return r0
            Lb0:
                r5 = r6
                r13 = r7
                r6 = r8
                goto L60
            Lb4:
                kotlin.m2 r13 = kotlin.m2.f23662a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.y.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d kotlinx.coroutines.channels.e0<? super R> e0Var, @d5.e Continuation<? super m2> continuation) {
            return ((y) c(e0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            y yVar = new y(this.f27596x, this.f27597y, continuation);
            yVar.f27595w = obj;
            return yVar;
        }
    }

    /* compiled from: Deprecated.kt */
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {420, 422}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class z<E> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f27598r;

        /* renamed from: s, reason: collision with root package name */
        Object f27599s;

        /* renamed from: t, reason: collision with root package name */
        Object f27600t;

        /* renamed from: u, reason: collision with root package name */
        Object f27601u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f27602v;

        /* renamed from: w, reason: collision with root package name */
        int f27603w;

        z(Continuation<? super z> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f27602v = obj;
            this.f27603w |= Integer.MIN_VALUE;
            return v.M(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0069, B:14:0x0072, B:16:0x007c, B:20:0x0087, B:21:0x0055, B:25:0x008e), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0069, B:14:0x0072, B:16:0x007c, B:20:0x0087, B:21:0x0055, B:25:0x008e), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0066 -> B:12:0x0069). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(kotlinx.coroutines.channels.g0 r7, java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.v.t
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.v$t r0 = (kotlinx.coroutines.channels.v.t) r0
            int r1 = r0.f27565w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27565w = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$t r0 = new kotlinx.coroutines.channels.v$t
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27564v
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27565w
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f27563u
            kotlinx.coroutines.channels.p r7 = (kotlinx.coroutines.channels.p) r7
            java.lang.Object r8 = r0.f27562t
            kotlinx.coroutines.channels.g0 r8 = (kotlinx.coroutines.channels.g0) r8
            java.lang.Object r2 = r0.f27561s
            kotlin.jvm.internal.k1$f r2 = (kotlin.jvm.internal.k1.f) r2
            java.lang.Object r4 = r0.f27560r
            kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L35
            goto L69
        L35:
            r7 = move-exception
            goto L9e
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "峝"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L44:
            kotlin.a1.n(r9)
            kotlin.jvm.internal.k1$f r9 = new kotlin.jvm.internal.k1$f
            r9.<init>()
            kotlinx.coroutines.channels.p r2 = r7.iterator()     // Catch: java.lang.Throwable -> L9a
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L55:
            r0.f27560r = r9     // Catch: java.lang.Throwable -> L35
            r0.f27561s = r2     // Catch: java.lang.Throwable -> L35
            r0.f27562t = r8     // Catch: java.lang.Throwable -> L35
            r0.f27563u = r7     // Catch: java.lang.Throwable -> L35
            r0.f27565w = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r7.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r4 != r1) goto L66
            return r1
        L66:
            r6 = r4
            r4 = r9
            r9 = r6
        L69:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L35
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L35
            r5 = 0
            if (r9 == 0) goto L8e
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L35
            boolean r9 = kotlin.jvm.internal.l0.g(r4, r9)     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L87
            int r7 = r2.f23570o     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r9 = new java.lang.Integer     // Catch: java.lang.Throwable -> L35
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.channels.u.a(r8, r5)
            return r9
        L87:
            int r9 = r2.f23570o     // Catch: java.lang.Throwable -> L35
            int r9 = r9 + r3
            r2.f23570o = r9     // Catch: java.lang.Throwable -> L35
            r9 = r4
            goto L55
        L8e:
            kotlin.m2 r7 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.channels.u.a(r8, r5)
            java.lang.Integer r7 = new java.lang.Integer
            r8 = -1
            r7.<init>(r8)
            return r7
        L9a:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L9e:
            throw r7     // Catch: java.lang.Throwable -> L9f
        L9f:
            r9 = move-exception
            kotlinx.coroutines.channels.u.a(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.A(kotlinx.coroutines.channels.g0, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x0030, B:13:0x008c, B:15:0x0094), top: B:11:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:40:0x004c, B:41:0x006a, B:43:0x0072, B:45:0x009f, B:46:0x00aa), top: B:39:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:40:0x004c, B:41:0x006a, B:43:0x0072, B:45:0x009f, B:46:0x00aa), top: B:39:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0088 -> B:13:0x008c). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(kotlinx.coroutines.channels.g0 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.v.u
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.v$u r0 = (kotlinx.coroutines.channels.v.u) r0
            int r1 = r0.f27570v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27570v = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$u r0 = new kotlinx.coroutines.channels.v$u
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27569u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27570v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L44
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f27568t
            java.lang.Object r2 = r0.f27567s
            kotlinx.coroutines.channels.p r2 = (kotlinx.coroutines.channels.p) r2
            java.lang.Object r4 = r0.f27566r
            kotlinx.coroutines.channels.g0 r4 = (kotlinx.coroutines.channels.g0) r4
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L34
            goto L8c
        L34:
            r6 = move-exception
            r2 = r4
            goto Lae
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "峞"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L44:
            java.lang.Object r6 = r0.f27567s
            kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
            java.lang.Object r2 = r0.f27566r
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L50
            goto L6a
        L50:
            r6 = move-exception
            goto Lae
        L52:
            kotlin.a1.n(r7)
            kotlinx.coroutines.channels.p r7 = r6.iterator()     // Catch: java.lang.Throwable -> Lab
            r0.f27566r = r6     // Catch: java.lang.Throwable -> Lab
            r0.f27567s = r7     // Catch: java.lang.Throwable -> Lab
            r0.f27570v = r4     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r2 = r7.a(r0)     // Catch: java.lang.Throwable -> Lab
            if (r2 != r1) goto L66
            return r1
        L66:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L6a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L50
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto L9f
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L50
            r5 = r2
            r2 = r6
            r6 = r5
        L79:
            r0.f27566r = r6     // Catch: java.lang.Throwable -> Lab
            r0.f27567s = r2     // Catch: java.lang.Throwable -> Lab
            r0.f27568t = r7     // Catch: java.lang.Throwable -> Lab
            r0.f27570v = r3     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r4 = r2.a(r0)     // Catch: java.lang.Throwable -> Lab
            if (r4 != r1) goto L88
            return r1
        L88:
            r5 = r4
            r4 = r6
            r6 = r7
            r7 = r5
        L8c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L34
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L9a
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L34
            r6 = r4
            goto L79
        L9a:
            r7 = 0
            kotlinx.coroutines.channels.u.a(r4, r7)
            return r6
        L9f:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = "峟"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)     // Catch: java.lang.Throwable -> L50
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L50
            throw r6     // Catch: java.lang.Throwable -> L50
        Lab:
            r7 = move-exception
            r2 = r6
            r6 = r7
        Lae:
            throw r6     // Catch: java.lang.Throwable -> Laf
        Laf:
            r7 = move-exception
            kotlinx.coroutines.channels.u.a(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.B(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0077, B:14:0x007f, B:16:0x0089, B:17:0x008d, B:18:0x0061, B:23:0x0094), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0077, B:14:0x007f, B:16:0x0089, B:17:0x008d, B:18:0x0061, B:23:0x0094), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:12:0x0077). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(kotlinx.coroutines.channels.g0 r7, java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.v.C0412v
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.v$v r0 = (kotlinx.coroutines.channels.v.C0412v) r0
            int r1 = r0.f27577x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27577x = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$v r0 = new kotlinx.coroutines.channels.v$v
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27576w
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27577x
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.f27575v
            kotlinx.coroutines.channels.p r7 = (kotlinx.coroutines.channels.p) r7
            java.lang.Object r8 = r0.f27574u
            kotlinx.coroutines.channels.g0 r8 = (kotlinx.coroutines.channels.g0) r8
            java.lang.Object r2 = r0.f27573t
            kotlin.jvm.internal.k1$f r2 = (kotlin.jvm.internal.k1.f) r2
            java.lang.Object r4 = r0.f27572s
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            java.lang.Object r5 = r0.f27571r
            kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L39
            goto L77
        L39:
            r7 = move-exception
            goto La6
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "峠"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L48:
            kotlin.a1.n(r9)
            kotlin.jvm.internal.k1$f r9 = new kotlin.jvm.internal.k1$f
            r9.<init>()
            r2 = -1
            r9.f23570o = r2
            kotlin.jvm.internal.k1$f r2 = new kotlin.jvm.internal.k1$f
            r2.<init>()
            kotlinx.coroutines.channels.p r4 = r7.iterator()     // Catch: java.lang.Throwable -> La2
            r6 = r8
            r8 = r7
            r7 = r4
            r4 = r9
            r9 = r6
        L61:
            r0.f27571r = r9     // Catch: java.lang.Throwable -> L39
            r0.f27572s = r4     // Catch: java.lang.Throwable -> L39
            r0.f27573t = r2     // Catch: java.lang.Throwable -> L39
            r0.f27574u = r8     // Catch: java.lang.Throwable -> L39
            r0.f27575v = r7     // Catch: java.lang.Throwable -> L39
            r0.f27577x = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = r7.a(r0)     // Catch: java.lang.Throwable -> L39
            if (r5 != r1) goto L74
            return r1
        L74:
            r6 = r5
            r5 = r9
            r9 = r6
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L39
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r9 == 0) goto L94
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Throwable -> L39
            boolean r9 = kotlin.jvm.internal.l0.g(r5, r9)     // Catch: java.lang.Throwable -> L39
            if (r9 == 0) goto L8d
            int r9 = r2.f23570o     // Catch: java.lang.Throwable -> L39
            r4.f23570o = r9     // Catch: java.lang.Throwable -> L39
        L8d:
            int r9 = r2.f23570o     // Catch: java.lang.Throwable -> L39
            int r9 = r9 + r3
            r2.f23570o = r9     // Catch: java.lang.Throwable -> L39
            r9 = r5
            goto L61
        L94:
            kotlin.m2 r7 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L39
            r7 = 0
            kotlinx.coroutines.channels.u.a(r8, r7)
            int r7 = r4.f23570o
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            return r8
        La2:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La6:
            throw r7     // Catch: java.lang.Throwable -> La7
        La7:
            r9 = move-exception
            kotlinx.coroutines.channels.u.a(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.C(kotlinx.coroutines.channels.g0, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0031, B:13:0x0091, B:15:0x0099), top: B:11:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:40:0x004d, B:41:0x006b, B:45:0x0077), top: B:39:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008d -> B:13:0x0091). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(kotlinx.coroutines.channels.g0 r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.v.w
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.v$w r0 = (kotlinx.coroutines.channels.v.w) r0
            int r1 = r0.f27582v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27582v = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$w r0 = new kotlinx.coroutines.channels.v$w
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27581u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27582v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L53
            if (r2 == r4) goto L45
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.f27580t
            java.lang.Object r2 = r0.f27579s
            kotlinx.coroutines.channels.p r2 = (kotlinx.coroutines.channels.p) r2
            java.lang.Object r4 = r0.f27578r
            kotlinx.coroutines.channels.g0 r4 = (kotlinx.coroutines.channels.g0) r4
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L35
            goto L91
        L35:
            r7 = move-exception
            r2 = r4
            goto La6
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "峡"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L45:
            java.lang.Object r7 = r0.f27579s
            kotlinx.coroutines.channels.p r7 = (kotlinx.coroutines.channels.p) r7
            java.lang.Object r2 = r0.f27578r
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L51
            goto L6b
        L51:
            r7 = move-exception
            goto La6
        L53:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.p r8 = r7.iterator()     // Catch: java.lang.Throwable -> La3
            r0.f27578r = r7     // Catch: java.lang.Throwable -> La3
            r0.f27579s = r8     // Catch: java.lang.Throwable -> La3
            r0.f27582v = r4     // Catch: java.lang.Throwable -> La3
            java.lang.Object r2 = r8.a(r0)     // Catch: java.lang.Throwable -> La3
            if (r2 != r1) goto L67
            return r1
        L67:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L6b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L51
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L51
            if (r8 != 0) goto L77
            kotlinx.coroutines.channels.u.a(r2, r5)
            return r5
        L77:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L51
            r6 = r2
            r2 = r7
            r7 = r6
        L7e:
            r0.f27578r = r7     // Catch: java.lang.Throwable -> La3
            r0.f27579s = r2     // Catch: java.lang.Throwable -> La3
            r0.f27580t = r8     // Catch: java.lang.Throwable -> La3
            r0.f27582v = r3     // Catch: java.lang.Throwable -> La3
            java.lang.Object r4 = r2.a(r0)     // Catch: java.lang.Throwable -> La3
            if (r4 != r1) goto L8d
            return r1
        L8d:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L91:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L35
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r2.next()     // Catch: java.lang.Throwable -> L35
            r7 = r4
            goto L7e
        L9f:
            kotlinx.coroutines.channels.u.a(r4, r5)
            return r7
        La3:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La6:
            throw r7     // Catch: java.lang.Throwable -> La7
        La7:
            r8 = move-exception
            kotlinx.coroutines.channels.u.a(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.D(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    @PublishedApi
    @d5.d
    public static final <E, R> kotlinx.coroutines.channels.g0<R> E(@d5.d kotlinx.coroutines.channels.g0<? extends E> g0Var, @d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super E, ? super Continuation<? super R>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new b(g0Var), new x(g0Var, pVar, null), 6, null);
    }

    public static kotlinx.coroutines.channels.g0 F(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return E(g0Var, coroutineContext, pVar);
    }

    @PublishedApi
    @d5.d
    public static final <E, R> kotlinx.coroutines.channels.g0<R> G(@d5.d kotlinx.coroutines.channels.g0<? extends E> g0Var, @d5.d CoroutineContext coroutineContext, @d5.d q3.q<? super Integer, ? super E, ? super Continuation<? super R>, ? extends Object> qVar) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new b(g0Var), new y(g0Var, qVar, null), 6, null);
    }

    public static kotlinx.coroutines.channels.g0 H(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.q qVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return G(g0Var, coroutineContext, qVar);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.g0 I(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.q qVar) {
        return t(G(g0Var, coroutineContext, qVar));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 J(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.q qVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return I(g0Var, coroutineContext, qVar);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.g0 K(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar) {
        return t(E(g0Var, coroutineContext, pVar));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 L(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return K(g0Var, coroutineContext, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:15:0x00a6, B:17:0x00ae, B:21:0x0091, B:55:0x0065), top: B:54:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089 A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:44:0x005b, B:45:0x007d, B:49:0x0089), top: B:43:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a2 -> B:14:0x003b). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(kotlinx.coroutines.channels.g0 r8, java.util.Comparator r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.M(kotlinx.coroutines.channels.g0, java.util.Comparator, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:15:0x00a6, B:17:0x00ae, B:21:0x0091, B:55:0x0065), top: B:54:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089 A[Catch: all -> 0x005f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:44:0x005b, B:45:0x007d, B:49:0x0089), top: B:43:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a2 -> B:14:0x003b). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(kotlinx.coroutines.channels.g0 r8, java.util.Comparator r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.N(kotlinx.coroutines.channels.g0, java.util.Comparator, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(kotlinx.coroutines.channels.g0 r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.v.b0
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.v$b0 r0 = (kotlinx.coroutines.channels.v.b0) r0
            int r1 = r0.f27427t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27427t = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$b0 r0 = new kotlinx.coroutines.channels.v$b0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27426s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27427t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f27425r
            kotlinx.coroutines.channels.g0 r4 = (kotlinx.coroutines.channels.g0) r4
            kotlin.a1.n(r5)     // Catch: java.lang.Throwable -> L5c
            goto L49
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "峤"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r5)
            kotlinx.coroutines.channels.p r5 = r4.iterator()     // Catch: java.lang.Throwable -> L5c
            r0.f27425r = r4     // Catch: java.lang.Throwable -> L5c
            r0.f27427t = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Throwable -> L5c
            if (r5 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L5c
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L52
            goto L53
        L52:
            r3 = 0
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L5c
            r0 = 0
            kotlinx.coroutines.channels.u.a(r4, r0)
            return r5
        L5c:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            kotlinx.coroutines.channels.u.a(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.O(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090 A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x0083, B:18:0x0090, B:19:0x009b), top: B:11:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #2 {all -> 0x004c, blocks: (B:33:0x0048, B:34:0x0066, B:36:0x006e, B:40:0x009c, B:41:0x00a7), top: B:32:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #2 {all -> 0x004c, blocks: (B:33:0x0048, B:34:0x0066, B:36:0x006e, B:40:0x009c, B:41:0x00a7), top: B:32:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(kotlinx.coroutines.channels.g0 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.v.d0
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.v$d0 r0 = (kotlinx.coroutines.channels.v.d0) r0
            int r1 = r0.f27440u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27440u = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$d0 r0 = new kotlinx.coroutines.channels.v$d0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27439t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27440u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L40
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f27438s
            java.lang.Object r0 = r0.f27437r
            kotlinx.coroutines.channels.g0 r0 = (kotlinx.coroutines.channels.g0) r0
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L30
            goto L83
        L30:
            r6 = move-exception
            r2 = r0
            goto Lab
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "峥"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.f27438s
            kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
            java.lang.Object r2 = r0.f27437r
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L4c
            goto L66
        L4c:
            r6 = move-exception
            goto Lab
        L4e:
            kotlin.a1.n(r7)
            kotlinx.coroutines.channels.p r7 = r6.iterator()     // Catch: java.lang.Throwable -> La8
            r0.f27437r = r6     // Catch: java.lang.Throwable -> La8
            r0.f27438s = r7     // Catch: java.lang.Throwable -> La8
            r0.f27440u = r4     // Catch: java.lang.Throwable -> La8
            java.lang.Object r2 = r7.a(r0)     // Catch: java.lang.Throwable -> La8
            if (r2 != r1) goto L62
            return r1
        L62:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L66:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4c
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r7 == 0) goto L9c
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L4c
            r0.f27437r = r2     // Catch: java.lang.Throwable -> L4c
            r0.f27438s = r7     // Catch: java.lang.Throwable -> L4c
            r0.f27440u = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r6.a(r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L7f
            return r1
        L7f:
            r0 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L83:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L30
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L30
            if (r7 != 0) goto L90
            r7 = 0
            kotlinx.coroutines.channels.u.a(r0, r7)
            return r6
        L90:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "峦"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)     // Catch: java.lang.Throwable -> L30
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L30
            throw r6     // Catch: java.lang.Throwable -> L30
        L9c:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = "峧"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)     // Catch: java.lang.Throwable -> L4c
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4c
            throw r6     // Catch: java.lang.Throwable -> L4c
        La8:
            r7 = move-exception
            r2 = r6
            r6 = r7
        Lab:
            throw r6     // Catch: java.lang.Throwable -> Lac
        Lac:
            r7 = move-exception
            kotlinx.coroutines.channels.u.a(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.Q(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004d, blocks: (B:33:0x0049, B:34:0x0067, B:38:0x0073), top: B:32:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(kotlinx.coroutines.channels.g0 r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.v.e0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.v$e0 r0 = (kotlinx.coroutines.channels.v.e0) r0
            int r1 = r0.f27446u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27446u = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$e0 r0 = new kotlinx.coroutines.channels.v$e0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27445t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27446u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.f27444s
            java.lang.Object r0 = r0.f27443r
            kotlinx.coroutines.channels.g0 r0 = (kotlinx.coroutines.channels.g0) r0
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L31
            goto L88
        L31:
            r7 = move-exception
            r2 = r0
            goto L9b
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "峨"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r7 = r0.f27444s
            kotlinx.coroutines.channels.p r7 = (kotlinx.coroutines.channels.p) r7
            java.lang.Object r2 = r0.f27443r
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L4d
            goto L67
        L4d:
            r7 = move-exception
            goto L9b
        L4f:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.p r8 = r7.iterator()     // Catch: java.lang.Throwable -> L98
            r0.f27443r = r7     // Catch: java.lang.Throwable -> L98
            r0.f27444s = r8     // Catch: java.lang.Throwable -> L98
            r0.f27446u = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r2 = r8.a(r0)     // Catch: java.lang.Throwable -> L98
            if (r2 != r1) goto L63
            return r1
        L63:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L67:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L4d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L4d
            if (r8 != 0) goto L73
            kotlinx.coroutines.channels.u.a(r2, r5)
            return r5
        L73:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4d
            r0.f27443r = r2     // Catch: java.lang.Throwable -> L4d
            r0.f27444s = r8     // Catch: java.lang.Throwable -> L4d
            r0.f27446u = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Throwable -> L4d
            if (r7 != r1) goto L84
            return r1
        L84:
            r0 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L88:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L31
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L94
            kotlinx.coroutines.channels.u.a(r0, r5)
            return r5
        L94:
            kotlinx.coroutines.channels.u.a(r0, r5)
            return r7
        L98:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L9b:
            throw r7     // Catch: java.lang.Throwable -> L9c
        L9c:
            r8 = move-exception
            kotlinx.coroutines.channels.u.a(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.R(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.g0 S(kotlinx.coroutines.channels.g0 g0Var, int i5, CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new b(g0Var), new f0(i5, g0Var, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 T(kotlinx.coroutines.channels.g0 g0Var, int i5, CoroutineContext coroutineContext, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            coroutineContext = m1.g();
        }
        return S(g0Var, i5, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.g0 U(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new b(g0Var), new g0(g0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 V(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return U(g0Var, coroutineContext, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:12:0x0032, B:19:0x0072, B:21:0x007a, B:24:0x008d, B:40:0x0051), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:12:0x0032, B:19:0x0072, B:21:0x007a, B:24:0x008d, B:40:0x0051), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends kotlinx.coroutines.channels.k0<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.g0] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.g0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:13:0x0035). Please report as a decompilation issue!!! */
    @d5.e
    @kotlin.PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends kotlinx.coroutines.channels.k0<? super E>> java.lang.Object W(@d5.d kotlinx.coroutines.channels.g0<? extends E> r6, @d5.d C r7, @d5.d kotlin.coroutines.Continuation<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.v.h0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.v$h0 r0 = (kotlinx.coroutines.channels.v.h0) r0
            int r1 = r0.f27482v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27482v = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$h0 r0 = new kotlinx.coroutines.channels.v$h0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27481u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27482v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L45
            if (r2 != r3) goto L39
            java.lang.Object r6 = r0.f27480t
            kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
            java.lang.Object r7 = r0.f27479s
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.f27478r
            kotlinx.coroutines.channels.k0 r2 = (kotlinx.coroutines.channels.k0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L55
        L35:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5e
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "峩"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L45:
            java.lang.Object r6 = r0.f27480t
            kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
            java.lang.Object r7 = r0.f27479s
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.f27478r
            kotlinx.coroutines.channels.k0 r2 = (kotlinx.coroutines.channels.k0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L55
            goto L72
        L55:
            r6 = move-exception
            goto L98
        L57:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.p r8 = r6.iterator()     // Catch: java.lang.Throwable -> L94
        L5e:
            r0.f27478r = r7     // Catch: java.lang.Throwable -> L94
            r0.f27479s = r6     // Catch: java.lang.Throwable -> L94
            r0.f27480t = r8     // Catch: java.lang.Throwable -> L94
            r0.f27482v = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r8.a(r0)     // Catch: java.lang.Throwable -> L94
            if (r2 != r1) goto L6d
            return r1
        L6d:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L72:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L55
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L55
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L55
            r0.f27478r = r2     // Catch: java.lang.Throwable -> L55
            r0.f27479s = r7     // Catch: java.lang.Throwable -> L55
            r0.f27480t = r6     // Catch: java.lang.Throwable -> L55
            r0.f27482v = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r8 = r2.a0(r8, r0)     // Catch: java.lang.Throwable -> L55
            if (r8 != r1) goto L35
            return r1
        L8d:
            kotlin.m2 r6 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L55
            r6 = 0
            kotlinx.coroutines.channels.u.a(r7, r6)
            return r2
        L94:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L98:
            throw r6     // Catch: java.lang.Throwable -> L99
        L99:
            r8 = move-exception
            kotlinx.coroutines.channels.u.a(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.W(kotlinx.coroutines.channels.g0, kotlinx.coroutines.channels.k0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x006f), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x006f), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:12:0x005e). Please report as a decompilation issue!!! */
    @d5.e
    @kotlin.PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object X(@d5.d kotlinx.coroutines.channels.g0<? extends E> r5, @d5.d C r6, @d5.d kotlin.coroutines.Continuation<? super C> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.v.i0
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.v$i0 r0 = (kotlinx.coroutines.channels.v.i0) r0
            int r1 = r0.f27493v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27493v = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$i0 r0 = new kotlinx.coroutines.channels.v$i0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27492u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27493v
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.f27491t
            kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
            java.lang.Object r6 = r0.f27490s
            kotlinx.coroutines.channels.g0 r6 = (kotlinx.coroutines.channels.g0) r6
            java.lang.Object r2 = r0.f27489r
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L33
            goto L5e
        L33:
            r5 = move-exception
            goto L7a
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "峪"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.a1.n(r7)
            kotlinx.coroutines.channels.p r7 = r5.iterator()     // Catch: java.lang.Throwable -> L76
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4c:
            r0.f27489r = r7     // Catch: java.lang.Throwable -> L33
            r0.f27490s = r6     // Catch: java.lang.Throwable -> L33
            r0.f27491t = r5     // Catch: java.lang.Throwable -> L33
            r0.f27493v = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r5.a(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r4 = r2
            r2 = r7
            r7 = r4
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L33
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L6f
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L33
            r2.add(r7)     // Catch: java.lang.Throwable -> L33
            r7 = r2
            goto L4c
        L6f:
            kotlin.m2 r5 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L33
            r5 = 0
            kotlinx.coroutines.channels.u.a(r6, r5)
            return r2
        L76:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r7 = move-exception
            kotlinx.coroutines.channels.u.a(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.X(kotlinx.coroutines.channels.g0, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x0079), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x0079), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:12:0x005e). Please report as a decompilation issue!!! */
    @d5.e
    @kotlin.PublishedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object Y(@d5.d kotlinx.coroutines.channels.g0<? extends kotlin.Pair<? extends K, ? extends V>> r6, @d5.d M r7, @d5.d kotlin.coroutines.Continuation<? super M> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.v.j0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.v$j0 r0 = (kotlinx.coroutines.channels.v.j0) r0
            int r1 = r0.f27504v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27504v = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$j0 r0 = new kotlinx.coroutines.channels.v$j0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27503u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27504v
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f27502t
            kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
            java.lang.Object r7 = r0.f27501s
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.f27500r
            java.util.Map r2 = (java.util.Map) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L33
            goto L5e
        L33:
            r6 = move-exception
            goto L84
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "峫"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L41:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.p r8 = r6.iterator()     // Catch: java.lang.Throwable -> L80
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4c:
            r0.f27500r = r8     // Catch: java.lang.Throwable -> L33
            r0.f27501s = r7     // Catch: java.lang.Throwable -> L33
            r0.f27502t = r6     // Catch: java.lang.Throwable -> L33
            r0.f27504v = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r6.a(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r5 = r2
            r2 = r8
            r8 = r5
        L5e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L79
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L33
            kotlin.q0 r8 = (kotlin.Pair) r8     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r8.e()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r8 = r8.f()     // Catch: java.lang.Throwable -> L33
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L33
            r8 = r2
            goto L4c
        L79:
            kotlin.m2 r6 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L33
            r6 = 0
            kotlinx.coroutines.channels.u.a(r7, r6)
            return r2
        L80:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L84:
            throw r6     // Catch: java.lang.Throwable -> L85
        L85:
            r8 = move-exception
            kotlinx.coroutines.channels.u.a(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.Y(kotlinx.coroutines.channels.g0, java.util.Map, kotlin.coroutines.d):java.lang.Object");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object Z(kotlinx.coroutines.channels.g0 g0Var, Continuation continuation) {
        return Y(g0Var, new LinkedHashMap(), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlinx.coroutines.channels.g0 r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.v.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.v$a r0 = (kotlinx.coroutines.channels.v.a) r0
            int r1 = r0.f27417t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27417t = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$a r0 = new kotlinx.coroutines.channels.v$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27416s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27417t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f27415r
            kotlinx.coroutines.channels.g0 r4 = (kotlinx.coroutines.channels.g0) r4
            kotlin.a1.n(r5)     // Catch: java.lang.Throwable -> L4e
            goto L49
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "峬"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r5)
            kotlinx.coroutines.channels.p r5 = r4.iterator()     // Catch: java.lang.Throwable -> L4e
            r0.f27415r = r4     // Catch: java.lang.Throwable -> L4e
            r0.f27417t = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = 0
            kotlinx.coroutines.channels.u.a(r4, r0)
            return r5
        L4e:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L50
        L50:
            r0 = move-exception
            kotlinx.coroutines.channels.u.a(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.a(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object a0(kotlinx.coroutines.channels.g0 g0Var, Continuation continuation) {
        return X(g0Var, new ArrayList(), continuation);
    }

    @PublishedApi
    @d5.d
    public static final q3.l<Throwable, m2> b(@d5.d kotlinx.coroutines.channels.g0<?> g0Var) {
        return new b(g0Var);
    }

    @d5.e
    @PublishedApi
    public static final <E> Object b0(@d5.d kotlinx.coroutines.channels.g0<? extends E> g0Var, @d5.d Continuation<? super Set<E>> continuation) {
        return X(g0Var, new LinkedHashSet(), continuation);
    }

    @PublishedApi
    @d5.d
    public static final q3.l<Throwable, m2> c(@d5.d kotlinx.coroutines.channels.g0<?>... g0VarArr) {
        return new c(g0VarArr);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final Object c0(kotlinx.coroutines.channels.g0 g0Var, Continuation continuation) {
        return b0(g0Var, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x0062, B:14:0x006a, B:30:0x0074), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x0062, B:14:0x006a, B:30:0x0074), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005f -> B:12:0x0062). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(kotlinx.coroutines.channels.g0 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.v.d
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.v$d r0 = (kotlinx.coroutines.channels.v.d) r0
            int r1 = r0.f27436v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27436v = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$d r0 = new kotlinx.coroutines.channels.v$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27435u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27436v
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f27434t
            kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
            java.lang.Object r2 = r0.f27433s
            kotlinx.coroutines.channels.g0 r2 = (kotlinx.coroutines.channels.g0) r2
            java.lang.Object r4 = r0.f27432r
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L33
            goto L62
        L33:
            r6 = move-exception
            goto L88
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "峭"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L41:
            kotlin.a1.n(r7)
            kotlin.jvm.internal.k1$f r7 = new kotlin.jvm.internal.k1$f
            r7.<init>()
            kotlinx.coroutines.channels.p r2 = r6.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = r7
            r7 = r6
            r6 = r2
        L50:
            r0.f27432r = r4     // Catch: java.lang.Throwable -> L82
            r0.f27433s = r7     // Catch: java.lang.Throwable -> L82
            r0.f27434t = r6     // Catch: java.lang.Throwable -> L82
            r0.f27436v = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r2 = r6.a(r0)     // Catch: java.lang.Throwable -> L82
            if (r2 != r1) goto L5f
            return r1
        L5f:
            r5 = r2
            r2 = r7
            r7 = r5
        L62:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L33
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L74
            r6.next()     // Catch: java.lang.Throwable -> L33
            int r7 = r4.f23570o     // Catch: java.lang.Throwable -> L33
            int r7 = r7 + r3
            r4.f23570o = r7     // Catch: java.lang.Throwable -> L33
            r7 = r2
            goto L50
        L74:
            kotlin.m2 r6 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L33
            r6 = 0
            kotlinx.coroutines.channels.u.a(r2, r6)
            int r6 = r4.f23570o
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            return r7
        L82:
            r6 = move-exception
            r2 = r7
            goto L88
        L85:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L88:
            throw r6     // Catch: java.lang.Throwable -> L89
        L89:
            r7 = move-exception
            kotlinx.coroutines.channels.u.a(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.d(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.g0 d0(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new b(g0Var), new k0(g0Var, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 e0(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return d0(g0Var, coroutineContext);
    }

    @PublishedApi
    @d5.d
    public static final <E, K> kotlinx.coroutines.channels.g0<E> f(@d5.d kotlinx.coroutines.channels.g0<? extends E> g0Var, @d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super E, ? super Continuation<? super K>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new b(g0Var), new f(g0Var, pVar, null), 6, null);
    }

    public static kotlinx.coroutines.channels.g0 g(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return f(g0Var, coroutineContext, pVar);
    }

    @PublishedApi
    @d5.d
    public static final <E, R, V> kotlinx.coroutines.channels.g0<V> g0(@d5.d kotlinx.coroutines.channels.g0<? extends E> g0Var, @d5.d kotlinx.coroutines.channels.g0<? extends R> g0Var2, @d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super E, ? super R, ? extends V> pVar) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new c(new kotlinx.coroutines.channels.g0[]{g0Var, g0Var2}), new m0(g0Var2, g0Var, pVar, null), 6, null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.g0 h(kotlinx.coroutines.channels.g0 g0Var, int i5, CoroutineContext coroutineContext) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new b(g0Var), new g(i5, g0Var, null), 6, null);
    }

    public static kotlinx.coroutines.channels.g0 h0(kotlinx.coroutines.channels.g0 g0Var, kotlinx.coroutines.channels.g0 g0Var2, CoroutineContext coroutineContext, q3.p pVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            coroutineContext = m1.g();
        }
        return g0(g0Var, g0Var2, coroutineContext, pVar);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 i(kotlinx.coroutines.channels.g0 g0Var, int i5, CoroutineContext coroutineContext, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            coroutineContext = m1.g();
        }
        return h(g0Var, i5, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.g0 j(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new b(g0Var), new h(g0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 k(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return j(g0Var, coroutineContext, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0037, B:13:0x006a, B:15:0x0072, B:26:0x0083, B:27:0x009a), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0037, B:13:0x006a, B:15:0x0072, B:26:0x0083, B:27:0x009a), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:13:0x006a). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(kotlinx.coroutines.channels.g0 r9, int r10, kotlin.coroutines.Continuation r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.v.i
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.v$i r0 = (kotlinx.coroutines.channels.v.i) r0
            int r1 = r0.f27488w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27488w = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$i r0 = new kotlinx.coroutines.channels.v$i
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f27487v
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27488w
            r3 = 46
            r4 = 1
            java.lang.String r5 = "峮"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            if (r2 == 0) goto L4a
            if (r2 != r4) goto L3e
            int r9 = r0.f27484s
            int r10 = r0.f27483r
            java.lang.Object r2 = r0.f27486u
            kotlinx.coroutines.channels.p r2 = (kotlinx.coroutines.channels.p) r2
            java.lang.Object r6 = r0.f27485t
            kotlinx.coroutines.channels.g0 r6 = (kotlinx.coroutines.channels.g0) r6
            kotlin.a1.n(r11)     // Catch: java.lang.Throwable -> L3b
            goto L6a
        L3b:
            r9 = move-exception
            goto Lb4
        L3e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "峯"
            java.lang.String r10 = com.flashget.kidsdownloader.ProtectedSandApp.s(r10)
            r9.<init>(r10)
            throw r9
        L4a:
            kotlin.a1.n(r11)
            if (r10 < 0) goto L9f
            kotlinx.coroutines.channels.p r11 = r9.iterator()     // Catch: java.lang.Throwable -> L9b
            r2 = 0
        L54:
            r0.f27485t = r9     // Catch: java.lang.Throwable -> L9b
            r0.f27486u = r11     // Catch: java.lang.Throwable -> L9b
            r0.f27483r = r10     // Catch: java.lang.Throwable -> L9b
            r0.f27484s = r2     // Catch: java.lang.Throwable -> L9b
            r0.f27488w = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r6 = r11.a(r0)     // Catch: java.lang.Throwable -> L9b
            if (r6 != r1) goto L65
            return r1
        L65:
            r8 = r6
            r6 = r9
            r9 = r2
            r2 = r11
            r11 = r8
        L6a:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L3b
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r11 == 0) goto L83
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L3b
            int r7 = r9 + 1
            if (r10 != r9) goto L7f
            r9 = 0
            kotlinx.coroutines.channels.u.a(r6, r9)
            return r11
        L7f:
            r11 = r2
            r9 = r6
            r2 = r7
            goto L54
        L83:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L3b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r11.<init>()     // Catch: java.lang.Throwable -> L3b
            r11.append(r5)     // Catch: java.lang.Throwable -> L3b
            r11.append(r10)     // Catch: java.lang.Throwable -> L3b
            r11.append(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L3b
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L3b
            throw r9     // Catch: java.lang.Throwable -> L3b
        L9b:
            r10 = move-exception
            r6 = r9
            r9 = r10
            goto Lb4
        L9f:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L9b
            r0.append(r10)     // Catch: java.lang.Throwable -> L9b
            r0.append(r3)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L9b
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L9b
            throw r11     // Catch: java.lang.Throwable -> L9b
        Lb4:
            throw r9     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r10 = move-exception
            kotlinx.coroutines.channels.u.a(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.l(kotlinx.coroutines.channels.g0, int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #0 {all -> 0x0089, blocks: (B:13:0x006c, B:15:0x0074, B:22:0x0056, B:46:0x0051), top: B:45:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0067 -> B:13:0x006c). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(kotlinx.coroutines.channels.g0 r8, int r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.v.j
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.v$j r0 = (kotlinx.coroutines.channels.v.j) r0
            int r1 = r0.f27499w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27499w = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$j r0 = new kotlinx.coroutines.channels.v$j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f27498v
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27499w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L3c
            int r8 = r0.f27495s
            int r9 = r0.f27494r
            java.lang.Object r2 = r0.f27497u
            kotlinx.coroutines.channels.p r2 = (kotlinx.coroutines.channels.p) r2
            java.lang.Object r5 = r0.f27496t
            kotlinx.coroutines.channels.g0 r5 = (kotlinx.coroutines.channels.g0) r5
            kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L3a
            r7 = r2
            r2 = r8
            r8 = r5
            r5 = r1
            r1 = r0
            r0 = r7
            goto L6c
        L3a:
            r8 = move-exception
            goto L8c
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "峰"
            java.lang.String r9 = com.flashget.kidsdownloader.ProtectedSandApp.s(r9)
            r8.<init>(r9)
            throw r8
        L48:
            kotlin.a1.n(r10)
            if (r9 >= 0) goto L51
            kotlinx.coroutines.channels.u.a(r8, r4)
            return r4
        L51:
            kotlinx.coroutines.channels.p r10 = r8.iterator()     // Catch: java.lang.Throwable -> L89
            r2 = 0
        L56:
            r0.f27496t = r8     // Catch: java.lang.Throwable -> L89
            r0.f27497u = r10     // Catch: java.lang.Throwable -> L89
            r0.f27494r = r9     // Catch: java.lang.Throwable -> L89
            r0.f27495s = r2     // Catch: java.lang.Throwable -> L89
            r0.f27499w = r3     // Catch: java.lang.Throwable -> L89
            java.lang.Object r5 = r10.a(r0)     // Catch: java.lang.Throwable -> L89
            if (r5 != r1) goto L67
            return r1
        L67:
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r1
            r1 = r7
        L6c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L89
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L89
            if (r10 == 0) goto L85
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L89
            int r6 = r2 + 1
            if (r9 != r2) goto L80
            kotlinx.coroutines.channels.u.a(r8, r4)
            return r10
        L80:
            r10 = r0
            r0 = r1
            r1 = r5
            r2 = r6
            goto L56
        L85:
            kotlinx.coroutines.channels.u.a(r8, r4)
            return r4
        L89:
            r9 = move-exception
            r5 = r8
            r8 = r9
        L8c:
            throw r8     // Catch: java.lang.Throwable -> L8d
        L8d:
            r9 = move-exception
            kotlinx.coroutines.channels.u.a(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.m(kotlinx.coroutines.channels.g0, int, kotlin.coroutines.d):java.lang.Object");
    }

    @PublishedApi
    @d5.d
    public static final <E> kotlinx.coroutines.channels.g0<E> n(@d5.d kotlinx.coroutines.channels.g0<? extends E> g0Var, @d5.d CoroutineContext coroutineContext, @d5.d q3.p<? super E, ? super Continuation<? super Boolean>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new b(g0Var), new k(g0Var, pVar, null), 6, null);
    }

    public static kotlinx.coroutines.channels.g0 o(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return n(g0Var, coroutineContext, pVar);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.g0 p(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.q qVar) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new b(g0Var), new l(g0Var, qVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 q(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.q qVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return p(g0Var, coroutineContext, qVar);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.g0 r(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar) {
        return n(g0Var, coroutineContext, new m(pVar, null));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 s(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return r(g0Var, coroutineContext, pVar);
    }

    @PublishedApi
    @d5.d
    public static final <E> kotlinx.coroutines.channels.g0<E> t(@d5.d kotlinx.coroutines.channels.g0<? extends E> g0Var) {
        return o(g0Var, null, new n(null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:16:0x006c, B:18:0x004c, B:23:0x0071), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:16:0x006c, B:18:0x004c, B:23:0x0071), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:12:0x005e). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(kotlinx.coroutines.channels.g0 r5, java.util.Collection r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.v.o
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.v$o r0 = (kotlinx.coroutines.channels.v.o) r0
            int r1 = r0.f27541v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27541v = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$o r0 = new kotlinx.coroutines.channels.v$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27540u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27541v
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.f27539t
            kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
            java.lang.Object r6 = r0.f27538s
            kotlinx.coroutines.channels.g0 r6 = (kotlinx.coroutines.channels.g0) r6
            java.lang.Object r2 = r0.f27537r
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L33
            goto L5e
        L33:
            r5 = move-exception
            goto L7c
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "峱"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.a1.n(r7)
            kotlinx.coroutines.channels.p r7 = r5.iterator()     // Catch: java.lang.Throwable -> L78
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4c:
            r0.f27537r = r7     // Catch: java.lang.Throwable -> L33
            r0.f27538s = r6     // Catch: java.lang.Throwable -> L33
            r0.f27539t = r5     // Catch: java.lang.Throwable -> L33
            r0.f27541v = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r5.a(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r4 = r2
            r2 = r7
            r7 = r4
        L5e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L33
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L71
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L33
            if (r7 == 0) goto L6f
            r2.add(r7)     // Catch: java.lang.Throwable -> L33
        L6f:
            r7 = r2
            goto L4c
        L71:
            kotlin.m2 r5 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L33
            r5 = 0
            kotlinx.coroutines.channels.u.a(r6, r5)
            return r2
        L78:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L7c:
            throw r5     // Catch: java.lang.Throwable -> L7d
        L7d:
            r7 = move-exception
            kotlinx.coroutines.channels.u.a(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.u(kotlinx.coroutines.channels.g0, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r8 = r0;
        r0 = r1;
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[Catch: all -> 0x009f, TryCatch #2 {all -> 0x009f, blocks: (B:11:0x0064, B:17:0x0077, B:19:0x007f, B:21:0x0085, B:26:0x0098, B:10:0x0060), top: B:9:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #2 {all -> 0x009f, blocks: (B:11:0x0064, B:17:0x0077, B:19:0x007f, B:21:0x0085, B:26:0x0098, B:10:0x0060), top: B:9:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005d  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.k0] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, kotlinx.coroutines.channels.k0] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [kotlinx.coroutines.channels.g0] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(kotlinx.coroutines.channels.g0 r6, kotlinx.coroutines.channels.k0 r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.v.p
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.v$p r0 = (kotlinx.coroutines.channels.v.p) r0
            int r1 = r0.f27546v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27546v = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$p r0 = new kotlinx.coroutines.channels.v$p
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27545u
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27546v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5d
            if (r2 == r4) goto L45
            if (r2 != r3) goto L39
            java.lang.Object r6 = r0.f27544t
            kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
            java.lang.Object r7 = r0.f27543s
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.f27542r
            kotlinx.coroutines.channels.k0 r2 = (kotlinx.coroutines.channels.k0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L5b
            r8 = r6
            r6 = r7
            r7 = r2
            goto L64
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "峲"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L45:
            java.lang.Object r6 = r0.f27544t
            kotlinx.coroutines.channels.p r6 = (kotlinx.coroutines.channels.p) r6
            java.lang.Object r7 = r0.f27543s
            kotlinx.coroutines.channels.g0 r7 = (kotlinx.coroutines.channels.g0) r7
            java.lang.Object r2 = r0.f27542r
            kotlinx.coroutines.channels.k0 r2 = (kotlinx.coroutines.channels.k0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L5b
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r2
        L58:
            r2 = r1
            r1 = r5
            goto L77
        L5b:
            r6 = move-exception
            goto La3
        L5d:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.p r8 = r6.iterator()     // Catch: java.lang.Throwable -> L9f
        L64:
            r0.f27542r = r7     // Catch: java.lang.Throwable -> L9f
            r0.f27543s = r6     // Catch: java.lang.Throwable -> L9f
            r0.f27544t = r8     // Catch: java.lang.Throwable -> L9f
            r0.f27546v = r4     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r2 = r8.a(r0)     // Catch: java.lang.Throwable -> L9f
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L58
        L77:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L9f
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L98
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L94
            r1.f27542r = r7     // Catch: java.lang.Throwable -> L9f
            r1.f27543s = r6     // Catch: java.lang.Throwable -> L9f
            r1.f27544t = r0     // Catch: java.lang.Throwable -> L9f
            r1.f27546v = r3     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r8 = r7.a0(r8, r1)     // Catch: java.lang.Throwable -> L9f
            if (r8 != r2) goto L94
            return r2
        L94:
            r8 = r0
            r0 = r1
            r1 = r2
            goto L64
        L98:
            kotlin.m2 r8 = kotlin.m2.f23662a     // Catch: java.lang.Throwable -> L9f
            r8 = 0
            kotlinx.coroutines.channels.u.a(r6, r8)
            return r7
        L9f:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        La3:
            throw r6     // Catch: java.lang.Throwable -> La4
        La4:
            r8 = move-exception
            kotlinx.coroutines.channels.u.a(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.v(kotlinx.coroutines.channels.g0, kotlinx.coroutines.channels.k0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0055, B:14:0x005d, B:18:0x0066, B:19:0x0071), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #2 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0055, B:14:0x005d, B:18:0x0066, B:19:0x0071), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(kotlinx.coroutines.channels.g0 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.v.q
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.v$q r0 = (kotlinx.coroutines.channels.v.q) r0
            int r1 = r0.f27550u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27550u = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$q r0 = new kotlinx.coroutines.channels.v$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27549t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27550u
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f27548s
            kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
            java.lang.Object r0 = r0.f27547r
            kotlinx.coroutines.channels.g0 r0 = (kotlinx.coroutines.channels.g0) r0
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L2f
            goto L55
        L2f:
            r5 = move-exception
            goto L75
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "峳"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.a1.n(r6)
            kotlinx.coroutines.channels.p r6 = r5.iterator()     // Catch: java.lang.Throwable -> L72
            r0.f27547r = r5     // Catch: java.lang.Throwable -> L72
            r0.f27548s = r6     // Catch: java.lang.Throwable -> L72
            r0.f27550u = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r6.a(r0)     // Catch: java.lang.Throwable -> L72
            if (r0 != r1) goto L51
            return r1
        L51:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L55:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2f
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L66
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L2f
            r6 = 0
            kotlinx.coroutines.channels.u.a(r0, r6)
            return r5
        L66:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = "峴"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)     // Catch: java.lang.Throwable -> L2f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2f
            throw r5     // Catch: java.lang.Throwable -> L2f
        L72:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L75:
            throw r5     // Catch: java.lang.Throwable -> L76
        L76:
            r6 = move-exception
            kotlinx.coroutines.channels.u.a(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.w(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0055, B:18:0x0062), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(kotlinx.coroutines.channels.g0 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.v.r
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.v$r r0 = (kotlinx.coroutines.channels.v.r) r0
            int r1 = r0.f27554u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27554u = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.v$r r0 = new kotlinx.coroutines.channels.v$r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27553t
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f27554u
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f27552s
            kotlinx.coroutines.channels.p r5 = (kotlinx.coroutines.channels.p) r5
            java.lang.Object r0 = r0.f27551r
            kotlinx.coroutines.channels.g0 r0 = (kotlinx.coroutines.channels.g0) r0
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L2f
            goto L55
        L2f:
            r5 = move-exception
            goto L6d
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "峵"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.a1.n(r6)
            kotlinx.coroutines.channels.p r6 = r5.iterator()     // Catch: java.lang.Throwable -> L6a
            r0.f27551r = r5     // Catch: java.lang.Throwable -> L6a
            r0.f27552s = r6     // Catch: java.lang.Throwable -> L6a
            r0.f27554u = r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r6.a(r0)     // Catch: java.lang.Throwable -> L6a
            if (r0 != r1) goto L51
            return r1
        L51:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L55:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2f
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            if (r6 != 0) goto L62
            kotlinx.coroutines.channels.u.a(r0, r1)
            return r1
        L62:
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L2f
            kotlinx.coroutines.channels.u.a(r0, r1)
            return r5
        L6a:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6d:
            throw r5     // Catch: java.lang.Throwable -> L6e
        L6e:
            r6 = move-exception
            kotlinx.coroutines.channels.u.a(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.v.x(kotlinx.coroutines.channels.g0, kotlin.coroutines.d):java.lang.Object");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.g0 y(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar) {
        return kotlinx.coroutines.channels.c0.f(e2.f27717o, coroutineContext, 0, null, new b(g0Var), new s(g0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.g0 z(kotlinx.coroutines.channels.g0 g0Var, CoroutineContext coroutineContext, q3.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            coroutineContext = m1.g();
        }
        return y(g0Var, coroutineContext, pVar);
    }
}
