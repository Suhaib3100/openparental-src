package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.PictureConfig;
import com.tencent.beacon.event.open.EventResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.collections.r0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.q0;
import kotlin.w0;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.j1;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001aL\u0010\n\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t2\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a+\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013\u001a+\u0010\u0019\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a%\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013\u001a#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001a%\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0013\u001a7\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!\u001aV\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010&\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0012\u0004\u0018\u00010%0\"H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aV\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010&\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0012\u0004\u0018\u00010%0\"H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010(\u001ak\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010&\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0012\u0004\u0018\u00010%0)H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001aV\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010&\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0012\u0004\u0018\u00010%0\"H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010(\u001a+\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020%*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0001¢\u0006\u0004\b-\u0010.\u001aC\u00101\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020%\"\u0010\b\u0001\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00000/*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u00100\u001a\u00028\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001aA\u00104\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020%\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u00028\u000003*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u00100\u001a\u00028\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a7\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b6\u0010!\u001aV\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010&\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0012\u0006\u0012\u0004\u0018\u00010%0\"H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u0010(\u001a;\u00108\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u00028\u000003*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00100\u001a\u00028\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b8\u00105\u001a=\u00109\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0010\b\u0001\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00000/*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u00100\u001a\u00028\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\b9\u00102\u001aA\u0010>\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<0\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\b>\u0010\u0013\u001aW\u0010A\u001a\u00028\u0002\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;\"\u0018\b\u0002\u0010@*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010?*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<0\u00012\u0006\u00100\u001a\u00028\u0002H\u0081@ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a)\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bD\u0010\u0013\u001a)\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000E\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bF\u0010\u0013\u001ab\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2(\u0010G\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010#\u0012\u0006\u0012\u0004\u0018\u00010%0\"H\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010(\u001a\\\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010G\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010#\u0012\u0006\u0012\u0004\u0018\u00010%0\"H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010(\u001aq\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010G\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010#\u0012\u0006\u0012\u0004\u0018\u00010%0)H\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010+\u001aw\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u001c*\u00020%*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e29\u0010G\u001a5\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010#\u0012\u0006\u0012\u0004\u0018\u00010%0)H\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010+\u001ab\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u001c*\u00020%*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2$\u0010G\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010#\u0012\u0006\u0012\u0004\u0018\u00010%0\"H\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010(\u001a5\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000K0\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\bL\u0010M\u001a%\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bN\u0010.\u001a\\\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010:*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010O\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010#\u0012\u0006\u0012\u0004\u0018\u00010%0\"H\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010(\u001a)\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000Q\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0081@ø\u0001\u0000¢\u0006\u0004\bR\u0010\u0013\u001a#\u0010S\u001a\u00020$\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bS\u0010\u0013\u001a#\u0010T\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bT\u0010\u0013\u001aA\u0010@\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010W\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Uj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`VH\u0087@ø\u0001\u0000¢\u0006\u0004\b@\u0010X\u001aA\u0010Y\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010W\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Uj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`VH\u0087@ø\u0001\u0000¢\u0006\u0004\bY\u0010X\u001a#\u0010Z\u001a\u00020$\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087@ø\u0001\u0000¢\u0006\u0004\bZ\u0010\u0013\u001a+\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020%*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0007¢\u0006\u0004\b[\u0010.\u001aF\u0010]\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010<0\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0087\u0004¢\u0006\u0004\b]\u0010^\u001a\u0081\u0001\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c\"\u0004\b\u0002\u0010;*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e26\u0010G\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(S\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(_\u0012\u0004\u0012\u00028\u00020\"H\u0001¢\u0006\u0004\b`\u0010a\u001a8\u0010_\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t*\u0006\u0012\u0002\b\u00030\u0001H\u0001¢\u0006\u0004\b_\u0010b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006c"}, d2 = {"", "Lkotlinx/coroutines/channels/d0;", "channels", "Lkotlin/Function1;", "", "Lkotlin/r0;", "name", "cause", "Lkotlin/k2;", "Lkotlinx/coroutines/CompletionHandler;", "c", "([Lkotlinx/coroutines/channels/d0;)Lld/l;", "E", "", "index", "l", "(Lkotlinx/coroutines/channels/d0;ILkotlin/coroutines/d;)Ljava/lang/Object;", "m", "w", "(Lkotlinx/coroutines/channels/d0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "x", "element", "A", "(Lkotlinx/coroutines/channels/d0;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "B", "C", "D", "Q", "R", "n", "Lkotlin/coroutines/g;", "context", "h", "(Lkotlinx/coroutines/channels/d0;ILkotlin/coroutines/g;)Lkotlinx/coroutines/channels/d0;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "", "predicate", "j", "(Lkotlinx/coroutines/channels/d0;Lkotlin/coroutines/g;Lld/p;)Lkotlinx/coroutines/channels/d0;", "Lkotlin/Function3;", "p", "(Lkotlinx/coroutines/channels/d0;Lkotlin/coroutines/g;Lld/q;)Lkotlinx/coroutines/channels/d0;", "r", "t", "(Lkotlinx/coroutines/channels/d0;)Lkotlinx/coroutines/channels/d0;", "", "destination", "u", "(Lkotlinx/coroutines/channels/d0;Ljava/util/Collection;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/e0;", "v", "(Lkotlinx/coroutines/channels/d0;Lkotlinx/coroutines/channels/e0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "S", "U", "W", "X", "K", "V", "Lkotlin/q0;", "", "Z", "", "M", "Y", "(Lkotlinx/coroutines/channels/d0;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "a0", "", "c0", "transform", "y", "G", "I", "Lkotlin/collections/r0;", "d0", "(Lkotlinx/coroutines/channels/d0;Lkotlin/coroutines/g;)Lkotlinx/coroutines/channels/d0;", "e", "selector", "f", "", "b0", "a", "d", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Lkotlinx/coroutines/channels/d0;Ljava/util/Comparator;Lkotlin/coroutines/d;)Ljava/lang/Object;", "N", "O", "P", "other", "f0", "(Lkotlinx/coroutines/channels/d0;Lkotlinx/coroutines/channels/d0;)Lkotlinx/coroutines/channels/d0;", "b", "g0", "(Lkotlinx/coroutines/channels/d0;Lkotlinx/coroutines/channels/d0;Lkotlin/coroutines/g;Lld/p;)Lkotlinx/coroutines/channels/d0;", "(Lkotlinx/coroutines/channels/d0;)Lld/l;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
@r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n82#2,11:480\n82#2,11:491\n82#2,11:502\n82#2,11:513\n105#2:524\n82#2,6:525\n106#2:531\n92#2:532\n107#2:533\n88#2,3:534\n82#2,11:537\n105#2:548\n82#2,6:549\n106#2,2:555\n92#2:557\n88#2,3:558\n82#2,11:561\n82#2,11:572\n82#2,11:583\n105#2:594\n82#2,6:595\n106#2,2:601\n92#2:603\n88#2,3:604\n105#2:607\n82#2,6:608\n106#2,2:614\n92#2:616\n88#2,3:617\n105#2:620\n82#2,6:621\n106#2,2:627\n92#2:629\n88#2,3:630\n105#2:633\n82#2,6:634\n106#2,2:640\n92#2:642\n88#2,3:643\n105#2:646\n82#2,6:647\n106#2,2:653\n92#2:655\n88#2,3:656\n82#2,11:659\n105#2:670\n82#2,6:671\n106#2,2:677\n92#2:679\n88#2,3:680\n82#2,11:683\n82#2,11:694\n82#2,11:705\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt\n*L\n34#1:480,11\n49#1:491,11\n63#1:502,11\n73#1:513,11\n84#1:524\n84#1:525,6\n84#1:531\n84#1:532\n84#1:533\n84#1:534,3\n95#1:537,11\n110#1:548\n110#1:549,6\n110#1:555,2\n110#1:557\n110#1:558,3\n121#1:561,11\n134#1:572,11\n147#1:583,11\n232#1:594\n232#1:595,6\n232#1:601,2\n232#1:603\n232#1:604,3\n241#1:607\n241#1:608,6\n241#1:614,2\n241#1:616\n241#1:617,3\n277#1:620\n277#1:621,6\n277#1:627,2\n277#1:629\n277#1:630,3\n285#1:633\n285#1:634,6\n285#1:640,2\n285#1:642\n285#1:643,3\n298#1:646\n298#1:647,6\n298#1:653,2\n298#1:655\n298#1:656,3\n403#1:659,11\n411#1:670\n411#1:671,6\n411#1:677,2\n411#1:679\n411#1:680,3\n418#1:683,11\n432#1:694,11\n446#1:705,11\n*E\n"})
/* loaded from: classes7.dex */
final /* synthetic */ class u {

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {404}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79440b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79441c;

        /* renamed from: d, reason: collision with root package name */
        int f79442d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79441c = obj;
            this.f79442d |= Integer.MIN_VALUE;
            return u.a(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {434, 436}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a0<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79443b;

        /* renamed from: c, reason: collision with root package name */
        Object f79444c;

        /* renamed from: d, reason: collision with root package name */
        Object f79445d;

        /* renamed from: e, reason: collision with root package name */
        Object f79446e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f79447f;

        /* renamed from: g, reason: collision with root package name */
        int f79448g;

        a0(kotlin.coroutines.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79447f = obj;
            this.f79448g |= Integer.MIN_VALUE;
            return u.N(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<?> f79449b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlinx.coroutines.channels.d0<?> d0Var) {
            super(1);
            this.f79449b = d0Var;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            kotlinx.coroutines.channels.t.a(this.f79449b, th);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {447}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b0<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79450b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79451c;

        /* renamed from: d, reason: collision with root package name */
        int f79452d;

        b0(kotlin.coroutines.d<? super b0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79451c = obj;
            this.f79452d |= Integer.MIN_VALUE;
            return u.O(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumesAll$1\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n75#2:480\n1#3:481\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$consumesAll$1\n*L\n26#1:480\n*E\n"})
    static final class c extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<?>[] f79453b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlinx.coroutines.channels.d0<?>[] d0VarArr) {
            super(1);
            this.f79453b = d0VarArr;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            Throwable th2 = null;
            for (kotlinx.coroutines.channels.d0<?> d0Var : this.f79453b) {
                try {
                    kotlinx.coroutines.channels.t.a(d0Var, th);
                } catch (Throwable th3) {
                    if (th2 == null) {
                        th2 = th3;
                    } else {
                        kotlin.o.a(th2, th3);
                    }
                }
            }
            if (th2 != null) {
                throw th2;
            }
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0001H\u008a@"}, d2 = {"<anonymous>", "E", "", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c0 extends kotlin.coroutines.jvm.internal.o implements ld.p<Object, kotlin.coroutines.d<Object>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79454b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79455c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<Object> f79456d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(kotlinx.coroutines.channels.d0<Object> d0Var, kotlin.coroutines.d<? super c0> dVar) {
            super(2, dVar);
            this.f79456d = d0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m Object obj, @fg.m kotlin.coroutines.d<Object> dVar) {
            return ((c0) create(obj, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            c0 c0Var = new c0(this.f79456d, dVar);
            c0Var.f79455c = obj;
            return c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f79454b != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("虪\u0001"));
            }
            a1.n(obj);
            Object obj2 = this.f79455c;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("虩\u0001") + this.f79456d + '.');
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79457b;

        /* renamed from: c, reason: collision with root package name */
        Object f79458c;

        /* renamed from: d, reason: collision with root package name */
        Object f79459d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79460e;

        /* renamed from: f, reason: collision with root package name */
        int f79461f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79460e = obj;
            this.f79461f |= Integer.MIN_VALUE;
            return u.d(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {SyslogAppender.LOG_LOCAL1, 139}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d0<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79462b;

        /* renamed from: c, reason: collision with root package name */
        Object f79463c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f79464d;

        /* renamed from: e, reason: collision with root package name */
        int f79465e;

        d0(kotlin.coroutines.d<? super d0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79464d = obj;
            this.f79465e |= Integer.MIN_VALUE;
            return u.Q(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "E", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.p<Object, kotlin.coroutines.d<Object>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79466b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79467c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, @fg.m kotlin.coroutines.d<Object> dVar) {
            return ((e) create(obj, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            e eVar = new e(2, dVar);
            eVar.f79467c = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f79466b != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("虫\u0001"));
            }
            a1.n(obj);
            return this.f79467c;
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {149, SyslogAppender.LOG_LOCAL3}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e0<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79468b;

        /* renamed from: c, reason: collision with root package name */
        Object f79469c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f79470d;

        /* renamed from: e, reason: collision with root package name */
        int f79471e;

        e0(kotlin.coroutines.d<? super e0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79470d = obj;
            this.f79471e |= Integer.MIN_VALUE;
            return u.R(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "K", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class f<E> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super E>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79472b;

        /* renamed from: c, reason: collision with root package name */
        Object f79473c;

        /* renamed from: d, reason: collision with root package name */
        Object f79474d;

        /* renamed from: e, reason: collision with root package name */
        int f79475e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f79476f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<E> f79477g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<E, kotlin.coroutines.d<? super K>, Object> f79478h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(kotlinx.coroutines.channels.d0<? extends E> d0Var, ld.p<? super E, ? super kotlin.coroutines.d<? super K>, ? extends Object> pVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f79477g = d0Var;
            this.f79478h = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super E> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f79477g, this.f79478h, dVar);
            fVar.f79476f = obj;
            return fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15 */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a3 -> B:8:0x00bc). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b6 -> B:7:0x00b8). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r10.f79475e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L53
                if (r1 == r4) goto L43
                if (r1 == r3) goto L2e
                if (r1 != r2) goto L22
                java.lang.Object r1 = r10.f79474d
                java.lang.Object r5 = r10.f79473c
                kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
                java.lang.Object r6 = r10.f79472b
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.f79476f
                kotlinx.coroutines.channels.b0 r7 = (kotlinx.coroutines.channels.b0) r7
                kotlin.a1.n(r11)
                goto Lb8
            L22:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "虯\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r11.<init>(r0)
                throw r11
            L2e:
                java.lang.Object r1 = r10.f79474d
                java.lang.Object r5 = r10.f79473c
                kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
                java.lang.Object r6 = r10.f79472b
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r10.f79476f
                kotlinx.coroutines.channels.b0 r7 = (kotlinx.coroutines.channels.b0) r7
                kotlin.a1.n(r11)
                r9 = r5
                r5 = r1
                r1 = r9
                goto L9f
            L43:
                java.lang.Object r1 = r10.f79473c
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r5 = r10.f79472b
                java.util.HashSet r5 = (java.util.HashSet) r5
                java.lang.Object r6 = r10.f79476f
                kotlinx.coroutines.channels.b0 r6 = (kotlinx.coroutines.channels.b0) r6
                kotlin.a1.n(r11)
                goto L7b
            L53:
                kotlin.a1.n(r11)
                java.lang.Object r11 = r10.f79476f
                kotlinx.coroutines.channels.b0 r11 = (kotlinx.coroutines.channels.b0) r11
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                kotlinx.coroutines.channels.d0<E> r5 = r10.f79477g
                kotlinx.coroutines.channels.n r5 = r5.iterator()
                r6 = r11
                r9 = r5
                r5 = r1
                r1 = r9
            L69:
                r10.f79476f = r6
                r10.f79472b = r5
                r10.f79473c = r1
                r11 = 0
                r10.f79474d = r11
                r10.f79475e = r4
                java.lang.Object r11 = r1.c(r10)
                if (r11 != r0) goto L7b
                return r0
            L7b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lbf
                java.lang.Object r11 = r1.next()
                ld.p<E, kotlin.coroutines.d<? super K>, java.lang.Object> r7 = r10.f79478h
                r10.f79476f = r6
                r10.f79472b = r5
                r10.f79473c = r1
                r10.f79474d = r11
                r10.f79475e = r3
                java.lang.Object r7 = r7.invoke(r11, r10)
                if (r7 != r0) goto L9a
                return r0
            L9a:
                r9 = r5
                r5 = r11
                r11 = r7
                r7 = r6
                r6 = r9
            L9f:
                boolean r8 = r6.contains(r11)
                if (r8 != 0) goto Lbc
                r10.f79476f = r7
                r10.f79472b = r6
                r10.f79473c = r1
                r10.f79474d = r11
                r10.f79475e = r2
                java.lang.Object r5 = r7.f0(r5, r10)
                if (r5 != r0) goto Lb6
                return r0
            Lb6:
                r5 = r1
                r1 = r11
            Lb8:
                r6.add(r1)
                r1 = r5
            Lbc:
                r5 = r6
                r6 = r7
                goto L69
            Lbf:
                kotlin.k2 r11 = kotlin.k2.f75408a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$take$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"})
    static final class f0 extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<Object>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79479b;

        /* renamed from: c, reason: collision with root package name */
        int f79480c;

        /* renamed from: d, reason: collision with root package name */
        int f79481d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f79482e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f79483f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<Object> f79484g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(int i4, kotlinx.coroutines.channels.d0<Object> d0Var, kotlin.coroutines.d<? super f0> dVar) {
            super(2, dVar);
            this.f79483f = i4;
            this.f79484g = d0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<Object> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((f0) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            f0 f0Var = new f0(this.f79483f, this.f79484g, dVar);
            f0Var.f79482e = obj;
            return f0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:6:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r7.f79481d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L35
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1b
                int r1 = r7.f79480c
                java.lang.Object r4 = r7.f79479b
                kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
                java.lang.Object r5 = r7.f79482e
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                kotlin.a1.n(r8)
            L19:
                r8 = r5
                goto L7d
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "虬\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r8.<init>(r0)
                throw r8
            L27:
                int r1 = r7.f79480c
                java.lang.Object r4 = r7.f79479b
                kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
                java.lang.Object r5 = r7.f79482e
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                kotlin.a1.n(r8)
                goto L62
            L35:
                kotlin.a1.n(r8)
                java.lang.Object r8 = r7.f79482e
                kotlinx.coroutines.channels.b0 r8 = (kotlinx.coroutines.channels.b0) r8
                int r1 = r7.f79483f
                if (r1 != 0) goto L43
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            L43:
                if (r1 < 0) goto L47
                r4 = r3
                goto L48
            L47:
                r4 = 0
            L48:
                if (r4 == 0) goto L87
                kotlinx.coroutines.channels.d0<java.lang.Object> r4 = r7.f79484g
                kotlinx.coroutines.channels.n r4 = r4.iterator()
            L50:
                r7.f79482e = r8
                r7.f79479b = r4
                r7.f79480c = r1
                r7.f79481d = r3
                java.lang.Object r5 = r4.c(r7)
                if (r5 != r0) goto L5f
                return r0
            L5f:
                r6 = r5
                r5 = r8
                r8 = r6
            L62:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L84
                java.lang.Object r8 = r4.next()
                r7.f79482e = r5
                r7.f79479b = r4
                r7.f79480c = r1
                r7.f79481d = r2
                java.lang.Object r8 = r5.f0(r8, r7)
                if (r8 != r0) goto L19
                return r0
            L7d:
                int r1 = r1 + (-1)
                if (r1 != 0) goto L50
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            L84:
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            L87:
                java.lang.String r8 = "虭\u0001"
                java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
                java.lang.String r0 = "虮\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                java.lang.String r8 = androidx.collection.r2.a(r8, r1, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r0.<init>(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.f0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {164, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$drop$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,479:1\n1#2:480\n*E\n"})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<Object>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79485b;

        /* renamed from: c, reason: collision with root package name */
        int f79486c;

        /* renamed from: d, reason: collision with root package name */
        int f79487d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f79488e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f79489f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<Object> f79490g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i4, kotlinx.coroutines.channels.d0<Object> d0Var, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f79489f = i4;
            this.f79490g = d0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<Object> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f79489f, this.f79490g, dVar);
            gVar.f79488e = obj;
            return gVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
        
            if (r1 == 0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x008c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a6 -> B:7:0x001a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0067 -> B:24:0x006a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r8.f79487d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L42
                if (r1 == r4) goto L34
                if (r1 == r3) goto L28
                if (r1 != r2) goto L1c
                java.lang.Object r1 = r8.f79485b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r4 = r8.f79488e
                kotlinx.coroutines.channels.b0 r4 = (kotlinx.coroutines.channels.b0) r4
                kotlin.a1.n(r9)
            L1a:
                r9 = r4
                goto L80
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "虱\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r9.<init>(r0)
                throw r9
            L28:
                java.lang.Object r1 = r8.f79485b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r4 = r8.f79488e
                kotlinx.coroutines.channels.b0 r4 = (kotlinx.coroutines.channels.b0) r4
                kotlin.a1.n(r9)
                goto L90
            L34:
                int r1 = r8.f79486c
                java.lang.Object r5 = r8.f79485b
                kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
                java.lang.Object r6 = r8.f79488e
                kotlinx.coroutines.channels.b0 r6 = (kotlinx.coroutines.channels.b0) r6
                kotlin.a1.n(r9)
                goto L6a
            L42:
                kotlin.a1.n(r9)
                java.lang.Object r9 = r8.f79488e
                kotlinx.coroutines.channels.b0 r9 = (kotlinx.coroutines.channels.b0) r9
                int r1 = r8.f79489f
                if (r1 < 0) goto L4f
                r5 = r4
                goto L50
            L4f:
                r5 = 0
            L50:
                if (r5 == 0) goto Lac
                if (r1 <= 0) goto L7a
                kotlinx.coroutines.channels.d0<java.lang.Object> r5 = r8.f79490g
                kotlinx.coroutines.channels.n r5 = r5.iterator()
                r6 = r9
            L5b:
                r8.f79488e = r6
                r8.f79485b = r5
                r8.f79486c = r1
                r8.f79487d = r4
                java.lang.Object r9 = r5.c(r8)
                if (r9 != r0) goto L6a
                return r0
            L6a:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L79
                r5.next()
                int r1 = r1 + (-1)
                if (r1 != 0) goto L5b
            L79:
                r9 = r6
            L7a:
                kotlinx.coroutines.channels.d0<java.lang.Object> r1 = r8.f79490g
                kotlinx.coroutines.channels.n r1 = r1.iterator()
            L80:
                r8.f79488e = r9
                r8.f79485b = r1
                r8.f79487d = r3
                java.lang.Object r4 = r1.c(r8)
                if (r4 != r0) goto L8d
                return r0
            L8d:
                r7 = r4
                r4 = r9
                r9 = r7
            L90:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La9
                java.lang.Object r9 = r1.next()
                r8.f79488e = r4
                r8.f79485b = r1
                r8.f79487d = r2
                java.lang.Object r9 = r4.f0(r9, r8)
                if (r9 != r0) goto L1a
                return r0
            La9:
                kotlin.k2 r9 = kotlin.k2.f75408a
                return r9
            Lac:
                java.lang.String r9 = "虲\u0001"
                java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
                java.lang.String r0 = "虳\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                java.lang.String r9 = androidx.collection.r2.a(r9, r1, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {269, 270, 271}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g0 extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<Object>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79491b;

        /* renamed from: c, reason: collision with root package name */
        Object f79492c;

        /* renamed from: d, reason: collision with root package name */
        int f79493d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f79494e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<Object> f79495f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<Object, kotlin.coroutines.d<? super Boolean>, Object> f79496g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g0(kotlinx.coroutines.channels.d0<Object> d0Var, ld.p<Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super g0> dVar) {
            super(2, dVar);
            this.f79495f = d0Var;
            this.f79496g = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<Object> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((g0) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            g0 g0Var = new g0(this.f79495f, this.f79496g, dVar);
            g0Var.f79494e = obj;
            return g0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0099 -> B:7:0x004f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r8.f79493d
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L41
                if (r1 == r4) goto L35
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r8.f79491b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r5 = r8.f79494e
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                kotlin.a1.n(r9)
                goto L4f
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "虰\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r9.<init>(r0)
                throw r9
            L27:
                java.lang.Object r1 = r8.f79492c
                java.lang.Object r5 = r8.f79491b
                kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
                java.lang.Object r6 = r8.f79494e
                kotlinx.coroutines.channels.b0 r6 = (kotlinx.coroutines.channels.b0) r6
                kotlin.a1.n(r9)
                goto L7e
            L35:
                java.lang.Object r1 = r8.f79491b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r5 = r8.f79494e
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                kotlin.a1.n(r9)
                goto L5c
            L41:
                kotlin.a1.n(r9)
                java.lang.Object r9 = r8.f79494e
                kotlinx.coroutines.channels.b0 r9 = (kotlinx.coroutines.channels.b0) r9
                kotlinx.coroutines.channels.d0<java.lang.Object> r1 = r8.f79495f
                kotlinx.coroutines.channels.n r1 = r1.iterator()
                r5 = r9
            L4f:
                r8.f79494e = r5
                r8.f79491b = r1
                r8.f79493d = r4
                java.lang.Object r9 = r1.c(r8)
                if (r9 != r0) goto L5c
                return r0
            L5c:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L9c
                java.lang.Object r9 = r1.next()
                ld.p<java.lang.Object, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r6 = r8.f79496g
                r8.f79494e = r5
                r8.f79491b = r1
                r8.f79492c = r9
                r8.f79493d = r3
                java.lang.Object r6 = r6.invoke(r9, r8)
                if (r6 != r0) goto L79
                return r0
            L79:
                r7 = r1
                r1 = r9
                r9 = r6
                r6 = r5
                r5 = r7
            L7e:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 != 0) goto L89
                kotlin.k2 r9 = kotlin.k2.f75408a
                return r9
            L89:
                r8.f79494e = r6
                r8.f79491b = r5
                r9 = 0
                r8.f79492c = r9
                r8.f79493d = r2
                java.lang.Object r9 = r6.f0(r1, r8)
                if (r9 != r0) goto L99
                return r0
            L99:
                r1 = r5
                r5 = r6
                goto L4f
            L9c:
                kotlin.k2 r9 = kotlin.k2.f75408a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.g0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, 183, 187, PictureConfig.CHOOSE_REQUEST}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<Object>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79497b;

        /* renamed from: c, reason: collision with root package name */
        Object f79498c;

        /* renamed from: d, reason: collision with root package name */
        int f79499d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f79500e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<Object> f79501f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<Object, kotlin.coroutines.d<? super Boolean>, Object> f79502g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(kotlinx.coroutines.channels.d0<Object> d0Var, ld.p<Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f79501f = d0Var;
            this.f79502g = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<Object> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f79501f, this.f79502g, dVar);
            hVar.f79500e = obj;
            return hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x00d3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0083 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ee -> B:9:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a1 -> B:28:0x0056). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 278}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h0<E, C extends kotlinx.coroutines.channels.e0<? super E>> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79503b;

        /* renamed from: c, reason: collision with root package name */
        Object f79504c;

        /* renamed from: d, reason: collision with root package name */
        Object f79505d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79506e;

        /* renamed from: f, reason: collision with root package name */
        int f79507f;

        h0(kotlin.coroutines.d<? super h0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79506e = obj;
            this.f79507f |= Integer.MIN_VALUE;
            return u.W(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        int f79508b;

        /* renamed from: c, reason: collision with root package name */
        int f79509c;

        /* renamed from: d, reason: collision with root package name */
        Object f79510d;

        /* renamed from: e, reason: collision with root package name */
        Object f79511e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f79512f;

        /* renamed from: g, reason: collision with root package name */
        int f79513g;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79512f = obj;
            this.f79513g |= Integer.MIN_VALUE;
            return u.l(null, 0, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i0<E, C extends Collection<? super E>> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79514b;

        /* renamed from: c, reason: collision with root package name */
        Object f79515c;

        /* renamed from: d, reason: collision with root package name */
        Object f79516d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79517e;

        /* renamed from: f, reason: collision with root package name */
        int f79518f;

        i0(kotlin.coroutines.d<? super i0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79517e = obj;
            this.f79518f |= Integer.MIN_VALUE;
            return u.X(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {53}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        int f79519b;

        /* renamed from: c, reason: collision with root package name */
        int f79520c;

        /* renamed from: d, reason: collision with root package name */
        Object f79521d;

        /* renamed from: e, reason: collision with root package name */
        Object f79522e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f79523f;

        /* renamed from: g, reason: collision with root package name */
        int f79524g;

        j(kotlin.coroutines.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79523f = obj;
            this.f79524g |= Integer.MIN_VALUE;
            return u.m(null, 0, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j0<K, V, M extends Map<? super K, ? super V>> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79525b;

        /* renamed from: c, reason: collision with root package name */
        Object f79526c;

        /* renamed from: d, reason: collision with root package name */
        Object f79527d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79528e;

        /* renamed from: f, reason: collision with root package name */
        int f79529f;

        j0(kotlin.coroutines.d<? super j0> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79528e = obj;
            this.f79529f |= Integer.MIN_VALUE;
            return u.Y(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, EventResult.ERROR_CODE_OTHER, EventResult.ERROR_CODE_OTHER}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class k<E> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super E>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79530b;

        /* renamed from: c, reason: collision with root package name */
        Object f79531c;

        /* renamed from: d, reason: collision with root package name */
        int f79532d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f79533e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<E> f79534f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<E, kotlin.coroutines.d<? super Boolean>, Object> f79535g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(kotlinx.coroutines.channels.d0<? extends E> d0Var, ld.p<? super E, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
            this.f79534f = d0Var;
            this.f79535g = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super E> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            k kVar = new k(this.f79534f, this.f79535g, dVar);
            kVar.f79533e = obj;
            return kVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        
            r6 = r7;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r9.f79532d
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L45
                if (r1 == r5) goto L39
                if (r1 == r4) goto L28
                if (r1 != r3) goto L1c
                java.lang.Object r1 = r9.f79530b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r6 = r9.f79533e
                kotlinx.coroutines.channels.b0 r6 = (kotlinx.coroutines.channels.b0) r6
                kotlin.a1.n(r10)
                goto L53
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "虶\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r10.<init>(r0)
                throw r10
            L28:
                java.lang.Object r1 = r9.f79531c
                java.lang.Object r6 = r9.f79530b
                kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
                java.lang.Object r7 = r9.f79533e
                kotlinx.coroutines.channels.b0 r7 = (kotlinx.coroutines.channels.b0) r7
                kotlin.a1.n(r10)
                r8 = r6
                r6 = r1
                r1 = r8
                goto L83
            L39:
                java.lang.Object r1 = r9.f79530b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r6 = r9.f79533e
                kotlinx.coroutines.channels.b0 r6 = (kotlinx.coroutines.channels.b0) r6
                kotlin.a1.n(r10)
                goto L62
            L45:
                kotlin.a1.n(r10)
                java.lang.Object r10 = r9.f79533e
                kotlinx.coroutines.channels.b0 r10 = (kotlinx.coroutines.channels.b0) r10
                kotlinx.coroutines.channels.d0<E> r1 = r9.f79534f
                kotlinx.coroutines.channels.n r1 = r1.iterator()
                r6 = r10
            L53:
                r9.f79533e = r6
                r9.f79530b = r1
                r9.f79531c = r2
                r9.f79532d = r5
                java.lang.Object r10 = r1.c(r9)
                if (r10 != r0) goto L62
                return r0
            L62:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L9c
                java.lang.Object r10 = r1.next()
                ld.p<E, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r7 = r9.f79535g
                r9.f79533e = r6
                r9.f79530b = r1
                r9.f79531c = r10
                r9.f79532d = r4
                java.lang.Object r7 = r7.invoke(r10, r9)
                if (r7 != r0) goto L7f
                return r0
            L7f:
                r8 = r6
                r6 = r10
                r10 = r7
                r7 = r8
            L83:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L9a
                r9.f79533e = r7
                r9.f79530b = r1
                r9.f79531c = r2
                r9.f79532d = r3
                java.lang.Object r10 = r7.f0(r6, r9)
                if (r10 != r0) goto L9a
                return r0
            L9a:
                r6 = r7
                goto L53
            L9c:
                kotlin.k2 r10 = kotlin.k2.f75408a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/collections/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class k0 extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super r0<Object>>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79536b;

        /* renamed from: c, reason: collision with root package name */
        int f79537c;

        /* renamed from: d, reason: collision with root package name */
        int f79538d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f79539e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<Object> f79540f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(kotlinx.coroutines.channels.d0<Object> d0Var, kotlin.coroutines.d<? super k0> dVar) {
            super(2, dVar);
            this.f79540f = d0Var;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super r0<Object>> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((k0) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            k0 k0Var = new k0(this.f79540f, dVar);
            k0Var.f79539e = obj;
            return k0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007d -> B:6:0x0046). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r10.f79538d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L38
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L1e
                int r1 = r10.f79537c
                java.lang.Object r4 = r10.f79536b
                kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
                java.lang.Object r5 = r10.f79539e
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                kotlin.a1.n(r11)
                r11 = r5
                r8 = r4
                r4 = r1
                r1 = r8
                goto L46
            L1e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "虵\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r11.<init>(r0)
                throw r11
            L2a:
                int r1 = r10.f79537c
                java.lang.Object r4 = r10.f79536b
                kotlinx.coroutines.channels.n r4 = (kotlinx.coroutines.channels.n) r4
                java.lang.Object r5 = r10.f79539e
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                kotlin.a1.n(r11)
                goto L5b
            L38:
                kotlin.a1.n(r11)
                java.lang.Object r11 = r10.f79539e
                kotlinx.coroutines.channels.b0 r11 = (kotlinx.coroutines.channels.b0) r11
                kotlinx.coroutines.channels.d0<java.lang.Object> r1 = r10.f79540f
                kotlinx.coroutines.channels.n r1 = r1.iterator()
                r4 = 0
            L46:
                r10.f79539e = r11
                r10.f79536b = r1
                r10.f79537c = r4
                r10.f79538d = r3
                java.lang.Object r5 = r1.c(r10)
                if (r5 != r0) goto L55
                return r0
            L55:
                r8 = r5
                r5 = r11
                r11 = r8
                r9 = r4
                r4 = r1
                r1 = r9
            L5b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L81
                java.lang.Object r11 = r4.next()
                kotlin.collections.r0 r6 = new kotlin.collections.r0
                int r7 = r1 + 1
                r6.<init>(r1, r11)
                r10.f79539e = r5
                r10.f79536b = r4
                r10.f79537c = r7
                r10.f79538d = r2
                java.lang.Object r11 = r5.f0(r6, r10)
                if (r11 != r0) goto L7d
                return r0
            L7d:
                r1 = r4
                r11 = r5
                r4 = r7
                goto L46
            L81:
                kotlin.k2 r11 = kotlin.k2.f75408a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.k0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<Object>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79541b;

        /* renamed from: c, reason: collision with root package name */
        Object f79542c;

        /* renamed from: d, reason: collision with root package name */
        int f79543d;

        /* renamed from: e, reason: collision with root package name */
        int f79544e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f79545f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<Object> f79546g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<Integer, Object, kotlin.coroutines.d<? super Boolean>, Object> f79547h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(kotlinx.coroutines.channels.d0<Object> d0Var, ld.q<? super Integer, Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> qVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f79546g = d0Var;
            this.f79547h = qVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<Object> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((l) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.f79546g, this.f79547h, dVar);
            lVar.f79545f = obj;
            return lVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        
            r7 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r12.f79544e
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L4b
                if (r1 == r5) goto L3d
                if (r1 == r4) goto L2a
                if (r1 != r3) goto L1e
                int r1 = r12.f79543d
                java.lang.Object r6 = r12.f79541b
                kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
                java.lang.Object r7 = r12.f79545f
                kotlinx.coroutines.channels.b0 r7 = (kotlinx.coroutines.channels.b0) r7
                kotlin.a1.n(r13)
                goto L5d
            L1e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "虷\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r13.<init>(r0)
                throw r13
            L2a:
                int r1 = r12.f79543d
                java.lang.Object r6 = r12.f79542c
                java.lang.Object r7 = r12.f79541b
                kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
                java.lang.Object r8 = r12.f79545f
                kotlinx.coroutines.channels.b0 r8 = (kotlinx.coroutines.channels.b0) r8
                kotlin.a1.n(r13)
                r11 = r7
                r7 = r6
                r6 = r11
                goto L98
            L3d:
                int r1 = r12.f79543d
                java.lang.Object r6 = r12.f79541b
                kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
                java.lang.Object r7 = r12.f79545f
                kotlinx.coroutines.channels.b0 r7 = (kotlinx.coroutines.channels.b0) r7
                kotlin.a1.n(r13)
                goto L6e
            L4b:
                kotlin.a1.n(r13)
                java.lang.Object r13 = r12.f79545f
                kotlinx.coroutines.channels.b0 r13 = (kotlinx.coroutines.channels.b0) r13
                kotlinx.coroutines.channels.d0<java.lang.Object> r1 = r12.f79546g
                kotlinx.coroutines.channels.n r1 = r1.iterator()
                r6 = 0
                r7 = r13
                r11 = r6
                r6 = r1
                r1 = r11
            L5d:
                r12.f79545f = r7
                r12.f79541b = r6
                r12.f79542c = r2
                r12.f79543d = r1
                r12.f79544e = r5
                java.lang.Object r13 = r6.c(r12)
                if (r13 != r0) goto L6e
                return r0
            L6e:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb3
                java.lang.Object r13 = r6.next()
                ld.q<java.lang.Integer, java.lang.Object, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r8 = r12.f79547h
                int r9 = r1 + 1
                java.lang.Integer r10 = new java.lang.Integer
                r10.<init>(r1)
                r12.f79545f = r7
                r12.f79541b = r6
                r12.f79542c = r13
                r12.f79543d = r9
                r12.f79544e = r4
                java.lang.Object r1 = r8.R(r10, r13, r12)
                if (r1 != r0) goto L94
                return r0
            L94:
                r8 = r7
                r7 = r13
                r13 = r1
                r1 = r9
            L98:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto Lb1
                r12.f79545f = r8
                r12.f79541b = r6
                r12.f79542c = r2
                r12.f79543d = r1
                r12.f79544e = r3
                java.lang.Object r13 = r8.f0(r7, r12)
                if (r13 != r0) goto Lb1
                return r0
            Lb1:
                r7 = r8
                goto L5d
            Lb3:
                kotlin.k2 r13 = kotlin.k2.f75408a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Deprecated.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"E", "R", "t1", "t2", "Lkotlin/q0;", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/q0;"}, k = 3, mv = {1, 8, 0})
    static final class l0 extends n0 implements ld.p<Object, Object, q0<Object, Object>> {

        /* renamed from: b, reason: collision with root package name */
        public static final l0 f79548b = new l0(2);

        l0() {
            super(2);
        }

        @fg.l
        public final q0<Object, Object> a(Object obj, Object obj2) {
            return new q0<>(obj, obj2);
        }

        @Override // ld.p
        public q0<Object, Object> invoke(Object obj, Object obj2) {
            return new q0<>(obj, obj2);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "E", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends kotlin.coroutines.jvm.internal.o implements ld.p<Object, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79549b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79550c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<Object, kotlin.coroutines.d<? super Boolean>, Object> f79551d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(ld.p<Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar, kotlin.coroutines.d<? super m> dVar) {
            super(2, dVar);
            this.f79551d = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((m) create(obj, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            m mVar = new m(this.f79551d, dVar);
            mVar.f79550c = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f79549b;
            if (i4 == 0) {
                a1.n(obj);
                Object obj2 = this.f79550c;
                ld.p<Object, kotlin.coroutines.d<? super Boolean>, Object> pVar = this.f79551d;
                this.f79549b = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("虹\u0001"));
                }
                a1.n(obj);
            }
            return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"E", "R", "V", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n105#2:480\n82#2,6:481\n106#2,2:487\n92#2:489\n88#2,3:490\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$zip$2\n*L\n468#1:480\n468#1:481,6\n468#1:487,2\n468#1:489\n468#1:490,3\n*E\n"})
    static final class m0<V> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super V>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79552b;

        /* renamed from: c, reason: collision with root package name */
        Object f79553c;

        /* renamed from: d, reason: collision with root package name */
        Object f79554d;

        /* renamed from: e, reason: collision with root package name */
        Object f79555e;

        /* renamed from: f, reason: collision with root package name */
        Object f79556f;

        /* renamed from: g, reason: collision with root package name */
        int f79557g;

        /* renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f79558h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<R> f79559i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<E> f79560j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<E, R, V> f79561k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m0(kotlinx.coroutines.channels.d0<? extends R> d0Var, kotlinx.coroutines.channels.d0<? extends E> d0Var2, ld.p<? super E, ? super R, ? extends V> pVar, kotlin.coroutines.d<? super m0> dVar) {
            super(2, dVar);
            this.f79559i = d0Var;
            this.f79560j = d0Var2;
            this.f79561k = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super V> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((m0) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            m0 m0Var = new m0(this.f79559i, this.f79560j, this.f79561k, dVar);
            m0Var.f79558h = obj;
            return m0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        
            r6 = r7;
            r7 = r8;
            r8 = r9;
            r9 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00a7 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #2 {all -> 0x0028, blocks: (B:8:0x0024, B:9:0x008a, B:13:0x009f, B:15:0x00a7, B:35:0x00f1, B:46:0x006d, B:48:0x0082), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00cf A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:19:0x00c7, B:21:0x00cf, B:43:0x004d), top: B:42:0x004d }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f1 A[Catch: all -> 0x0028, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0028, blocks: (B:8:0x0024, B:9:0x008a, B:13:0x009f, B:15:0x00a7, B:35:0x00f1, B:46:0x006d, B:48:0x0082), top: B:2:0x0008 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "E", "", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class n<E> extends kotlin.coroutines.jvm.internal.o implements ld.p<E, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f79562b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79563c;

        n(kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.m E e4, @fg.m kotlin.coroutines.d<? super Boolean> dVar) {
            return ((n) create(e4, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            n nVar = new n(2, dVar);
            nVar.f79563c = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f79562b != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("虺\u0001"));
            }
            a1.n(obj);
            return Boolean.valueOf(this.f79563c != null);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class o<E, C extends Collection<? super E>> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79564b;

        /* renamed from: c, reason: collision with root package name */
        Object f79565c;

        /* renamed from: d, reason: collision with root package name */
        Object f79566d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79567e;

        /* renamed from: f, reason: collision with root package name */
        int f79568f;

        o(kotlin.coroutines.d<? super o> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79567e = obj;
            this.f79568f |= Integer.MIN_VALUE;
            return u.u(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 242}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class p<E, C extends kotlinx.coroutines.channels.e0<? super E>> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79569b;

        /* renamed from: c, reason: collision with root package name */
        Object f79570c;

        /* renamed from: d, reason: collision with root package name */
        Object f79571d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79572e;

        /* renamed from: f, reason: collision with root package name */
        int f79573f;

        p(kotlin.coroutines.d<? super p> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79572e = obj;
            this.f79573f |= Integer.MIN_VALUE;
            return u.v(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class q<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79574b;

        /* renamed from: c, reason: collision with root package name */
        Object f79575c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f79576d;

        /* renamed from: e, reason: collision with root package name */
        int f79577e;

        q(kotlin.coroutines.d<? super q> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79576d = obj;
            this.f79577e |= Integer.MIN_VALUE;
            return u.w(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {75}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class r<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79578b;

        /* renamed from: c, reason: collision with root package name */
        Object f79579c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f79580d;

        /* renamed from: e, reason: collision with root package name */
        int f79581e;

        r(kotlin.coroutines.d<? super r> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79580d = obj;
            this.f79581e |= Integer.MIN_VALUE;
            return u.x(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class s extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<Object>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79582b;

        /* renamed from: c, reason: collision with root package name */
        int f79583c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f79584d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<Object> f79585e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<Object, kotlin.coroutines.d<? super kotlinx.coroutines.channels.d0<Object>>, Object> f79586f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(kotlinx.coroutines.channels.d0<Object> d0Var, ld.p<Object, ? super kotlin.coroutines.d<? super kotlinx.coroutines.channels.d0<Object>>, ? extends Object> pVar, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.f79585e = d0Var;
            this.f79586f = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<Object> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((s) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            s sVar = new s(this.f79585e, this.f79586f, dVar);
            sVar.f79584d = obj;
            return sVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:7:0x004d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r7.f79583c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3f
                if (r1 == r4) goto L33
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.f79582b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r5 = r7.f79584d
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                kotlin.a1.n(r8)
                goto L4d
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "虻\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r8.<init>(r0)
                throw r8
            L27:
                java.lang.Object r1 = r7.f79582b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r5 = r7.f79584d
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                kotlin.a1.n(r8)
                goto L75
            L33:
                java.lang.Object r1 = r7.f79582b
                kotlinx.coroutines.channels.n r1 = (kotlinx.coroutines.channels.n) r1
                java.lang.Object r5 = r7.f79584d
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                kotlin.a1.n(r8)
                goto L5a
            L3f:
                kotlin.a1.n(r8)
                java.lang.Object r8 = r7.f79584d
                kotlinx.coroutines.channels.b0 r8 = (kotlinx.coroutines.channels.b0) r8
                kotlinx.coroutines.channels.d0<java.lang.Object> r1 = r7.f79585e
                kotlinx.coroutines.channels.n r1 = r1.iterator()
                r5 = r8
            L4d:
                r7.f79584d = r5
                r7.f79582b = r1
                r7.f79583c = r4
                java.lang.Object r8 = r1.c(r7)
                if (r8 != r0) goto L5a
                return r0
            L5a:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L84
                java.lang.Object r8 = r1.next()
                ld.p<java.lang.Object, kotlin.coroutines.d<? super kotlinx.coroutines.channels.d0<java.lang.Object>>, java.lang.Object> r6 = r7.f79586f
                r7.f79584d = r5
                r7.f79582b = r1
                r7.f79583c = r3
                java.lang.Object r8 = r6.invoke(r8, r7)
                if (r8 != r0) goto L75
                return r0
            L75:
                kotlinx.coroutines.channels.d0 r8 = (kotlinx.coroutines.channels.d0) r8
                r7.f79584d = r5
                r7.f79582b = r1
                r7.f79583c = r2
                java.lang.Object r8 = kotlinx.coroutines.channels.u.W(r8, r5, r7)
                if (r8 != r0) goto L4d
                return r0
            L84:
                kotlin.k2 r8 = kotlin.k2.f75408a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {487}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class t<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79587b;

        /* renamed from: c, reason: collision with root package name */
        Object f79588c;

        /* renamed from: d, reason: collision with root package name */
        Object f79589d;

        /* renamed from: e, reason: collision with root package name */
        Object f79590e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f79591f;

        /* renamed from: g, reason: collision with root package name */
        int f79592g;

        t(kotlin.coroutines.d<? super t> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79591f = obj;
            this.f79592g |= Integer.MIN_VALUE;
            return u.A(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {97, 100}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.u$u, reason: collision with other inner class name */
    static final class C1218u<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79593b;

        /* renamed from: c, reason: collision with root package name */
        Object f79594c;

        /* renamed from: d, reason: collision with root package name */
        Object f79595d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79596e;

        /* renamed from: f, reason: collision with root package name */
        int f79597f;

        C1218u(kotlin.coroutines.d<? super C1218u> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79596e = obj;
            this.f79597f |= Integer.MIN_VALUE;
            return u.B(null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {487}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class v<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79598b;

        /* renamed from: c, reason: collision with root package name */
        Object f79599c;

        /* renamed from: d, reason: collision with root package name */
        Object f79600d;

        /* renamed from: e, reason: collision with root package name */
        Object f79601e;

        /* renamed from: f, reason: collision with root package name */
        Object f79602f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f79603g;

        /* renamed from: h, reason: collision with root package name */
        int f79604h;

        v(kotlin.coroutines.d<? super v> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79603g = obj;
            this.f79604h |= Integer.MIN_VALUE;
            return u.C(null, null, this);
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {123, 126}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class w<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79605b;

        /* renamed from: c, reason: collision with root package name */
        Object f79606c;

        /* renamed from: d, reason: collision with root package name */
        Object f79607d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79608e;

        /* renamed from: f, reason: collision with root package name */
        int f79609f;

        w(kotlin.coroutines.d<? super w> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79608e = obj;
            this.f79609f |= Integer.MIN_VALUE;
            return u.D(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDeprecated.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,479:1\n105#2:480\n82#2,6:481\n106#2,2:487\n92#2:489\n88#2,3:490\n*S KotlinDebug\n*F\n+ 1 Deprecated.kt\nkotlinx/coroutines/channels/ChannelsKt__DeprecatedKt$map$1\n*L\n332#1:480\n332#1:481,6\n332#1:487,2\n332#1:489\n332#1:490,3\n*E\n"})
    static final class x<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79610b;

        /* renamed from: c, reason: collision with root package name */
        Object f79611c;

        /* renamed from: d, reason: collision with root package name */
        Object f79612d;

        /* renamed from: e, reason: collision with root package name */
        Object f79613e;

        /* renamed from: f, reason: collision with root package name */
        int f79614f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f79615g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<E> f79616h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<E, kotlin.coroutines.d<? super R>, Object> f79617i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        x(kotlinx.coroutines.channels.d0<? extends E> d0Var, ld.p<? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar, kotlin.coroutines.d<? super x> dVar) {
            super(2, dVar);
            this.f79616h = d0Var;
            this.f79617i = pVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super R> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((x) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            x xVar = new x(this.f79616h, this.f79617i, dVar);
            xVar.f79615g = obj;
            return xVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x0025, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:10:0x0077, B:15:0x008b, B:17:0x0093, B:34:0x00c7, B:44:0x0061, B:46:0x0070), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00c1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c7 A[Catch: all -> 0x0025, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x0020, B:10:0x0077, B:15:0x008b, B:17:0x0093, B:34:0x00c7, B:44:0x0061, B:46:0x0070), top: B:2:0x0008 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c2 -> B:10:0x0077). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.x.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/channels/b0;)V"}, k = 3, mv = {1, 8, 0})
    static final class y<R> extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.channels.b0<? super R>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f79618b;

        /* renamed from: c, reason: collision with root package name */
        Object f79619c;

        /* renamed from: d, reason: collision with root package name */
        int f79620d;

        /* renamed from: e, reason: collision with root package name */
        int f79621e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f79622f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.d0<E> f79623g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<Integer, E, kotlin.coroutines.d<? super R>, Object> f79624h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(kotlinx.coroutines.channels.d0<? extends E> d0Var, ld.q<? super Integer, ? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar, kotlin.coroutines.d<? super y> dVar) {
            super(2, dVar);
            this.f79623g = d0Var;
            this.f79624h = qVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlinx.coroutines.channels.b0<? super R> b0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((y) create(b0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            y yVar = new y(this.f79623g, this.f79624h, dVar);
            yVar.f79622f = obj;
            return yVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00a8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a9 -> B:7:0x005b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r11.f79621e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L4a
                if (r1 == r4) goto L3c
                if (r1 == r3) goto L2a
                if (r1 != r2) goto L1e
                int r1 = r11.f79620d
                java.lang.Object r5 = r11.f79618b
                kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
                java.lang.Object r6 = r11.f79622f
                kotlinx.coroutines.channels.b0 r6 = (kotlinx.coroutines.channels.b0) r6
                kotlin.a1.n(r12)
                r12 = r6
                goto L5b
            L1e:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "虽\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r12.<init>(r0)
                throw r12
            L2a:
                int r1 = r11.f79620d
                java.lang.Object r5 = r11.f79619c
                kotlinx.coroutines.channels.b0 r5 = (kotlinx.coroutines.channels.b0) r5
                java.lang.Object r6 = r11.f79618b
                kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
                java.lang.Object r7 = r11.f79622f
                kotlinx.coroutines.channels.b0 r7 = (kotlinx.coroutines.channels.b0) r7
                kotlin.a1.n(r12)
                goto L97
            L3c:
                int r1 = r11.f79620d
                java.lang.Object r5 = r11.f79618b
                kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
                java.lang.Object r6 = r11.f79622f
                kotlinx.coroutines.channels.b0 r6 = (kotlinx.coroutines.channels.b0) r6
                kotlin.a1.n(r12)
                goto L6d
            L4a:
                kotlin.a1.n(r12)
                java.lang.Object r12 = r11.f79622f
                kotlinx.coroutines.channels.b0 r12 = (kotlinx.coroutines.channels.b0) r12
                kotlinx.coroutines.channels.d0<E> r1 = r11.f79623g
                kotlinx.coroutines.channels.n r1 = r1.iterator()
                r5 = 0
                r10 = r5
                r5 = r1
                r1 = r10
            L5b:
                r11.f79622f = r12
                r11.f79618b = r5
                r11.f79620d = r1
                r11.f79621e = r4
                java.lang.Object r6 = r5.c(r11)
                if (r6 != r0) goto L6a
                return r0
            L6a:
                r10 = r6
                r6 = r12
                r12 = r10
            L6d:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto Lac
                java.lang.Object r12 = r5.next()
                ld.q<java.lang.Integer, E, kotlin.coroutines.d<? super R>, java.lang.Object> r7 = r11.f79624h
                int r8 = r1 + 1
                java.lang.Integer r9 = new java.lang.Integer
                r9.<init>(r1)
                r11.f79622f = r6
                r11.f79618b = r5
                r11.f79619c = r6
                r11.f79620d = r8
                r11.f79621e = r3
                java.lang.Object r12 = r7.R(r9, r12, r11)
                if (r12 != r0) goto L93
                return r0
            L93:
                r7 = r6
                r1 = r8
                r6 = r5
                r5 = r7
            L97:
                r11.f79622f = r7
                r11.f79618b = r6
                r8 = 0
                r11.f79619c = r8
                r11.f79620d = r1
                r11.f79621e = r2
                java.lang.Object r12 = r5.f0(r12, r11)
                if (r12 != r0) goto La9
                return r0
            La9:
                r5 = r6
                r12 = r7
                goto L5b
            Lac:
                kotlin.k2 r12 = kotlin.k2.f75408a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Deprecated.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {420, 422}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class z<E> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f79625b;

        /* renamed from: c, reason: collision with root package name */
        Object f79626c;

        /* renamed from: d, reason: collision with root package name */
        Object f79627d;

        /* renamed from: e, reason: collision with root package name */
        Object f79628e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f79629f;

        /* renamed from: g, reason: collision with root package name */
        int f79630g;

        z(kotlin.coroutines.d<? super z> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f79629f = obj;
            this.f79630g |= Integer.MIN_VALUE;
            return u.M(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0069, B:14:0x0072, B:16:0x007c, B:20:0x0087, B:21:0x0055, B:25:0x008e), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:11:0x0031, B:12:0x0069, B:14:0x0072, B:16:0x007c, B:20:0x0087, B:21:0x0055, B:25:0x008e), top: B:10:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0066 -> B:12:0x0069). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(kotlinx.coroutines.channels.d0 r7, java.lang.Object r8, kotlin.coroutines.d r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.u.t
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.u$t r0 = (kotlinx.coroutines.channels.u.t) r0
            int r1 = r0.f79592g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79592g = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$t r0 = new kotlinx.coroutines.channels.u$t
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f79591f
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79592g
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f79590e
            kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
            java.lang.Object r8 = r0.f79589d
            kotlinx.coroutines.channels.d0 r8 = (kotlinx.coroutines.channels.d0) r8
            java.lang.Object r2 = r0.f79588c
            kotlin.jvm.internal.k1$f r2 = (kotlin.jvm.internal.k1.f) r2
            java.lang.Object r4 = r0.f79587b
            kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L35
            goto L69
        L35:
            r7 = move-exception
            goto L9e
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "虾\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L44:
            kotlin.a1.n(r9)
            kotlin.jvm.internal.k1$f r9 = new kotlin.jvm.internal.k1$f
            r9.<init>()
            kotlinx.coroutines.channels.n r2 = r7.iterator()     // Catch: java.lang.Throwable -> L9a
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L55:
            r0.f79587b = r9     // Catch: java.lang.Throwable -> L35
            r0.f79588c = r2     // Catch: java.lang.Throwable -> L35
            r0.f79589d = r8     // Catch: java.lang.Throwable -> L35
            r0.f79590e = r7     // Catch: java.lang.Throwable -> L35
            r0.f79592g = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r7.c(r0)     // Catch: java.lang.Throwable -> L35
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
            int r7 = r2.f75327b     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r9 = new java.lang.Integer     // Catch: java.lang.Throwable -> L35
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.channels.t.a(r8, r5)
            return r9
        L87:
            int r9 = r2.f75327b     // Catch: java.lang.Throwable -> L35
            int r9 = r9 + r3
            r2.f75327b = r9     // Catch: java.lang.Throwable -> L35
            r9 = r4
            goto L55
        L8e:
            kotlin.k2 r7 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L35
            kotlinx.coroutines.channels.t.a(r8, r5)
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
            kotlinx.coroutines.channels.t.a(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.A(kotlinx.coroutines.channels.d0, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0095 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #3 {all -> 0x0034, blocks: (B:12:0x0030, B:13:0x008d, B:15:0x0095), top: B:11:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073 A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:40:0x004c, B:41:0x006b, B:43:0x0073, B:45:0x00a4, B:46:0x00af), top: B:39:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {all -> 0x0050, blocks: (B:40:0x004c, B:41:0x006b, B:43:0x0073, B:45:0x00a4, B:46:0x00af), top: B:39:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0089 -> B:13:0x008d). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(kotlinx.coroutines.channels.d0 r6, kotlin.coroutines.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.C1218u
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$u r0 = (kotlinx.coroutines.channels.u.C1218u) r0
            int r1 = r0.f79597f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79597f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$u r0 = new kotlinx.coroutines.channels.u$u
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f79596e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79597f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L44
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f79595d
            java.lang.Object r2 = r0.f79594c
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.n) r2
            java.lang.Object r4 = r0.f79593b
            kotlinx.coroutines.channels.d0 r4 = (kotlinx.coroutines.channels.d0) r4
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L34
            goto L8d
        L34:
            r6 = move-exception
            r2 = r4
            goto Lb0
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "虾\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L44:
            java.lang.Object r6 = r0.f79594c
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r2 = r0.f79593b
            kotlinx.coroutines.channels.d0 r2 = (kotlinx.coroutines.channels.d0) r2
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L50
            goto L6b
        L50:
            r6 = move-exception
            goto Lb0
        L53:
            kotlin.a1.n(r7)
            kotlinx.coroutines.channels.n r7 = r6.iterator()     // Catch: java.lang.Throwable -> La0
            r0.f79593b = r6     // Catch: java.lang.Throwable -> La0
            r0.f79594c = r7     // Catch: java.lang.Throwable -> La0
            r0.f79597f = r4     // Catch: java.lang.Throwable -> La0
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> La0
            if (r2 != r1) goto L67
            return r1
        L67:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L6b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L50
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L50
            if (r7 == 0) goto La4
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L50
            r5 = r2
            r2 = r6
            r6 = r5
        L7a:
            r0.f79593b = r6     // Catch: java.lang.Throwable -> La0
            r0.f79594c = r2     // Catch: java.lang.Throwable -> La0
            r0.f79595d = r7     // Catch: java.lang.Throwable -> La0
            r0.f79597f = r3     // Catch: java.lang.Throwable -> La0
            java.lang.Object r4 = r2.c(r0)     // Catch: java.lang.Throwable -> La0
            if (r4 != r1) goto L89
            return r1
        L89:
            r5 = r4
            r4 = r6
            r6 = r7
            r7 = r5
        L8d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L34
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L9b
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L34
            r6 = r4
            goto L7a
        L9b:
            r7 = 0
            kotlinx.coroutines.channels.t.a(r4, r7)
            return r6
        La0:
            r7 = move-exception
            r2 = r6
            r6 = r7
            goto Lb0
        La4:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = "虿\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)     // Catch: java.lang.Throwable -> L50
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L50
            throw r6     // Catch: java.lang.Throwable -> L50
        Lb0:
            throw r6     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r7 = move-exception
            kotlinx.coroutines.channels.t.a(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.B(kotlinx.coroutines.channels.d0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0077, B:14:0x007f, B:16:0x0089, B:17:0x008d, B:18:0x0061, B:23:0x0094), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:11:0x0035, B:12:0x0077, B:14:0x007f, B:16:0x0089, B:17:0x008d, B:18:0x0061, B:23:0x0094), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:12:0x0077). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(kotlinx.coroutines.channels.d0 r7, java.lang.Object r8, kotlin.coroutines.d r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.u.v
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.channels.u$v r0 = (kotlinx.coroutines.channels.u.v) r0
            int r1 = r0.f79604h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79604h = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$v r0 = new kotlinx.coroutines.channels.u$v
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f79603g
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79604h
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.f79602f
            kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
            java.lang.Object r8 = r0.f79601e
            kotlinx.coroutines.channels.d0 r8 = (kotlinx.coroutines.channels.d0) r8
            java.lang.Object r2 = r0.f79600d
            kotlin.jvm.internal.k1$f r2 = (kotlin.jvm.internal.k1.f) r2
            java.lang.Object r4 = r0.f79599c
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            java.lang.Object r5 = r0.f79598b
            kotlin.a1.n(r9)     // Catch: java.lang.Throwable -> L39
            goto L77
        L39:
            r7 = move-exception
            goto La6
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "虾\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L48:
            kotlin.a1.n(r9)
            kotlin.jvm.internal.k1$f r9 = new kotlin.jvm.internal.k1$f
            r9.<init>()
            r2 = -1
            r9.f75327b = r2
            kotlin.jvm.internal.k1$f r2 = new kotlin.jvm.internal.k1$f
            r2.<init>()
            kotlinx.coroutines.channels.n r4 = r7.iterator()     // Catch: java.lang.Throwable -> La2
            r6 = r8
            r8 = r7
            r7 = r4
            r4 = r9
            r9 = r6
        L61:
            r0.f79598b = r9     // Catch: java.lang.Throwable -> L39
            r0.f79599c = r4     // Catch: java.lang.Throwable -> L39
            r0.f79600d = r2     // Catch: java.lang.Throwable -> L39
            r0.f79601e = r8     // Catch: java.lang.Throwable -> L39
            r0.f79602f = r7     // Catch: java.lang.Throwable -> L39
            r0.f79604h = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = r7.c(r0)     // Catch: java.lang.Throwable -> L39
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
            int r9 = r2.f75327b     // Catch: java.lang.Throwable -> L39
            r4.f75327b = r9     // Catch: java.lang.Throwable -> L39
        L8d:
            int r9 = r2.f75327b     // Catch: java.lang.Throwable -> L39
            int r9 = r9 + r3
            r2.f75327b = r9     // Catch: java.lang.Throwable -> L39
            r9 = r5
            goto L61
        L94:
            kotlin.k2 r7 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L39
            r7 = 0
            kotlinx.coroutines.channels.t.a(r8, r7)
            int r7 = r4.f75327b
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
            kotlinx.coroutines.channels.t.a(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.C(kotlinx.coroutines.channels.d0, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
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
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(kotlinx.coroutines.channels.d0 r7, kotlin.coroutines.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.w
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$w r0 = (kotlinx.coroutines.channels.u.w) r0
            int r1 = r0.f79609f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79609f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$w r0 = new kotlinx.coroutines.channels.u$w
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f79608e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79609f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L53
            if (r2 == r4) goto L45
            if (r2 != r3) goto L39
            java.lang.Object r7 = r0.f79607d
            java.lang.Object r2 = r0.f79606c
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.n) r2
            java.lang.Object r4 = r0.f79605b
            kotlinx.coroutines.channels.d0 r4 = (kotlinx.coroutines.channels.d0) r4
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L35
            goto L91
        L35:
            r7 = move-exception
            r2 = r4
            goto La6
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "虾\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L45:
            java.lang.Object r7 = r0.f79606c
            kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
            java.lang.Object r2 = r0.f79605b
            kotlinx.coroutines.channels.d0 r2 = (kotlinx.coroutines.channels.d0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L51
            goto L6b
        L51:
            r7 = move-exception
            goto La6
        L53:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.n r8 = r7.iterator()     // Catch: java.lang.Throwable -> La3
            r0.f79605b = r7     // Catch: java.lang.Throwable -> La3
            r0.f79606c = r8     // Catch: java.lang.Throwable -> La3
            r0.f79609f = r4     // Catch: java.lang.Throwable -> La3
            java.lang.Object r2 = r8.c(r0)     // Catch: java.lang.Throwable -> La3
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
            kotlinx.coroutines.channels.t.a(r2, r5)
            return r5
        L77:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L51
            r6 = r2
            r2 = r7
            r7 = r6
        L7e:
            r0.f79605b = r7     // Catch: java.lang.Throwable -> La3
            r0.f79606c = r2     // Catch: java.lang.Throwable -> La3
            r0.f79607d = r8     // Catch: java.lang.Throwable -> La3
            r0.f79609f = r3     // Catch: java.lang.Throwable -> La3
            java.lang.Object r4 = r2.c(r0)     // Catch: java.lang.Throwable -> La3
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
            kotlinx.coroutines.channels.t.a(r4, r5)
            return r7
        La3:
            r8 = move-exception
            r2 = r7
            r7 = r8
        La6:
            throw r7     // Catch: java.lang.Throwable -> La7
        La7:
            r8 = move-exception
            kotlinx.coroutines.channels.t.a(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.D(kotlinx.coroutines.channels.d0, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    @w0
    public static final <E, R> kotlinx.coroutines.channels.d0<R> E(@fg.l kotlinx.coroutines.channels.d0<? extends E> d0Var, @fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new b(d0Var), new x(d0Var, pVar, null), 6, null);
    }

    public static kotlinx.coroutines.channels.d0 F(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return E(d0Var, gVar, pVar);
    }

    @fg.l
    @w0
    public static final <E, R> kotlinx.coroutines.channels.d0<R> G(@fg.l kotlinx.coroutines.channels.d0<? extends E> d0Var, @fg.l kotlin.coroutines.g gVar, @fg.l ld.q<? super Integer, ? super E, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new b(d0Var), new y(d0Var, qVar, null), 6, null);
    }

    public static kotlinx.coroutines.channels.d0 H(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.q qVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return G(d0Var, gVar, qVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.d0 I(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.q qVar) {
        return t(G(d0Var, gVar, qVar));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d0 J(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.q qVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return I(d0Var, gVar, qVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.d0 K(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar) {
        return t(E(d0Var, gVar, pVar));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d0 L(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return K(d0Var, gVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #1 {all -> 0x00bb, blocks: (B:15:0x00a5, B:17:0x00ad, B:20:0x0090, B:55:0x0064), top: B:54:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005e, blocks: (B:44:0x005a, B:45:0x007c, B:49:0x0088), top: B:43:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a1 -> B:14:0x003b). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(kotlinx.coroutines.channels.d0 r8, java.util.Comparator r9, kotlin.coroutines.d r10) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.M(kotlinx.coroutines.channels.d0, java.util.Comparator, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #1 {all -> 0x00bb, blocks: (B:15:0x00a5, B:17:0x00ad, B:20:0x0090, B:55:0x0064), top: B:54:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088 A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x005e, blocks: (B:44:0x005a, B:45:0x007c, B:49:0x0088), top: B:43:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a1 -> B:14:0x003b). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(kotlinx.coroutines.channels.d0 r8, java.util.Comparator r9, kotlin.coroutines.d r10) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.N(kotlinx.coroutines.channels.d0, java.util.Comparator, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(kotlinx.coroutines.channels.d0 r4, kotlin.coroutines.d r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.u.b0
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.u$b0 r0 = (kotlinx.coroutines.channels.u.b0) r0
            int r1 = r0.f79452d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79452d = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$b0 r0 = new kotlinx.coroutines.channels.u$b0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f79451c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79452d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f79450b
            kotlinx.coroutines.channels.d0 r4 = (kotlinx.coroutines.channels.d0) r4
            kotlin.a1.n(r5)     // Catch: java.lang.Throwable -> L2b
            goto L4b
        L2b:
            r5 = move-exception
            goto L5b
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "虾\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.a1.n(r5)
            kotlinx.coroutines.channels.n r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2b
            r0.f79450b = r4     // Catch: java.lang.Throwable -> L2b
            r0.f79452d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r5.c(r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L2b
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L2b
            r0 = 0
            kotlinx.coroutines.channels.t.a(r4, r0)
            return r5
        L5b:
            throw r5     // Catch: java.lang.Throwable -> L5c
        L5c:
            r0 = move-exception
            kotlinx.coroutines.channels.t.a(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.O(kotlinx.coroutines.channels.d0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090 A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x0083, B:18:0x0090, B:19:0x009b), top: B:11:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #2 {all -> 0x004c, blocks: (B:33:0x0048, B:34:0x0066, B:36:0x006e, B:40:0x009c, B:41:0x00a7), top: B:32:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c A[Catch: all -> 0x004c, TRY_ENTER, TryCatch #2 {all -> 0x004c, blocks: (B:33:0x0048, B:34:0x0066, B:36:0x006e, B:40:0x009c, B:41:0x00a7), top: B:32:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(kotlinx.coroutines.channels.d0 r6, kotlin.coroutines.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.d0
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$d0 r0 = (kotlinx.coroutines.channels.u.d0) r0
            int r1 = r0.f79465e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79465e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$d0 r0 = new kotlinx.coroutines.channels.u$d0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f79464d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79465e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4e
            if (r2 == r4) goto L40
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f79463c
            java.lang.Object r0 = r0.f79462b
            kotlinx.coroutines.channels.d0 r0 = (kotlinx.coroutines.channels.d0) r0
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L30
            goto L83
        L30:
            r6 = move-exception
            r2 = r0
            goto Lab
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "虾\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L40:
            java.lang.Object r6 = r0.f79463c
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r2 = r0.f79462b
            kotlinx.coroutines.channels.d0 r2 = (kotlinx.coroutines.channels.d0) r2
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L4c
            goto L66
        L4c:
            r6 = move-exception
            goto Lab
        L4e:
            kotlin.a1.n(r7)
            kotlinx.coroutines.channels.n r7 = r6.iterator()     // Catch: java.lang.Throwable -> La8
            r0.f79462b = r6     // Catch: java.lang.Throwable -> La8
            r0.f79463c = r7     // Catch: java.lang.Throwable -> La8
            r0.f79465e = r4     // Catch: java.lang.Throwable -> La8
            java.lang.Object r2 = r7.c(r0)     // Catch: java.lang.Throwable -> La8
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
            r0.f79462b = r2     // Catch: java.lang.Throwable -> L4c
            r0.f79463c = r7     // Catch: java.lang.Throwable -> L4c
            r0.f79465e = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r6.c(r0)     // Catch: java.lang.Throwable -> L4c
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
            kotlinx.coroutines.channels.t.a(r0, r7)
            return r6
        L90:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "蚀\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)     // Catch: java.lang.Throwable -> L30
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L30
            throw r6     // Catch: java.lang.Throwable -> L30
        L9c:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = "虿\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)     // Catch: java.lang.Throwable -> L4c
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
            kotlinx.coroutines.channels.t.a(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.Q(kotlinx.coroutines.channels.d0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x004d, blocks: (B:33:0x0049, B:34:0x0067, B:38:0x0073), top: B:32:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(kotlinx.coroutines.channels.d0 r7, kotlin.coroutines.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.e0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$e0 r0 = (kotlinx.coroutines.channels.u.e0) r0
            int r1 = r0.f79471e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79471e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$e0 r0 = new kotlinx.coroutines.channels.u$e0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f79470d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79471e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.f79469c
            java.lang.Object r0 = r0.f79468b
            kotlinx.coroutines.channels.d0 r0 = (kotlinx.coroutines.channels.d0) r0
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L31
            goto L88
        L31:
            r7 = move-exception
            r2 = r0
            goto L9b
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "虾\u0001"
            java.lang.String r8 = com.flashget.parentalcontrol.ProtectedSandApp.s(r8)
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r7 = r0.f79469c
            kotlinx.coroutines.channels.n r7 = (kotlinx.coroutines.channels.n) r7
            java.lang.Object r2 = r0.f79468b
            kotlinx.coroutines.channels.d0 r2 = (kotlinx.coroutines.channels.d0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L4d
            goto L67
        L4d:
            r7 = move-exception
            goto L9b
        L4f:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.n r8 = r7.iterator()     // Catch: java.lang.Throwable -> L98
            r0.f79468b = r7     // Catch: java.lang.Throwable -> L98
            r0.f79469c = r8     // Catch: java.lang.Throwable -> L98
            r0.f79471e = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r2 = r8.c(r0)     // Catch: java.lang.Throwable -> L98
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
            kotlinx.coroutines.channels.t.a(r2, r5)
            return r5
        L73:
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L4d
            r0.f79468b = r2     // Catch: java.lang.Throwable -> L4d
            r0.f79469c = r8     // Catch: java.lang.Throwable -> L4d
            r0.f79471e = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r7 = r7.c(r0)     // Catch: java.lang.Throwable -> L4d
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
            kotlinx.coroutines.channels.t.a(r0, r5)
            return r5
        L94:
            kotlinx.coroutines.channels.t.a(r0, r5)
            return r7
        L98:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L9b:
            throw r7     // Catch: java.lang.Throwable -> L9c
        L9c:
            r8 = move-exception
            kotlinx.coroutines.channels.t.a(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.R(kotlinx.coroutines.channels.d0, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.d0 S(kotlinx.coroutines.channels.d0 d0Var, int i4, kotlin.coroutines.g gVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new b(d0Var), new f0(i4, d0Var, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d0 T(kotlinx.coroutines.channels.d0 d0Var, int i4, kotlin.coroutines.g gVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            gVar = j1.g();
        }
        return S(d0Var, i4, gVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.d0 U(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new b(d0Var), new g0(d0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d0 V(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return U(d0Var, gVar, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0032, B:19:0x0072, B:21:0x007a, B:24:0x008d, B:40:0x0053), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #2 {all -> 0x0039, blocks: (B:12:0x0032, B:19:0x0072, B:21:0x007a, B:24:0x008d, B:40:0x0053), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [C extends kotlinx.coroutines.channels.e0<? super E>] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.d0] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.d0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008a -> B:13:0x0035). Please report as a decompilation issue!!! */
    @fg.m
    @kotlin.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends kotlinx.coroutines.channels.e0<? super E>> java.lang.Object W(@fg.l kotlinx.coroutines.channels.d0<? extends E> r6, @fg.l C r7, @fg.l kotlin.coroutines.d<? super C> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.h0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$h0 r0 = (kotlinx.coroutines.channels.u.h0) r0
            int r1 = r0.f79507f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79507f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$h0 r0 = new kotlinx.coroutines.channels.u$h0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f79506e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79507f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L47
            if (r2 != r3) goto L3b
            java.lang.Object r6 = r0.f79505d
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.f79504c
            kotlinx.coroutines.channels.d0 r7 = (kotlinx.coroutines.channels.d0) r7
            java.lang.Object r2 = r0.f79503b
            kotlinx.coroutines.channels.e0 r2 = (kotlinx.coroutines.channels.e0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L39
        L35:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5e
        L39:
            r6 = move-exception
            goto L98
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "虾\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L47:
            java.lang.Object r6 = r0.f79505d
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.f79504c
            kotlinx.coroutines.channels.d0 r7 = (kotlinx.coroutines.channels.d0) r7
            java.lang.Object r2 = r0.f79503b
            kotlinx.coroutines.channels.e0 r2 = (kotlinx.coroutines.channels.e0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L39
            goto L72
        L57:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.n r8 = r6.iterator()     // Catch: java.lang.Throwable -> L94
        L5e:
            r0.f79503b = r7     // Catch: java.lang.Throwable -> L94
            r0.f79504c = r6     // Catch: java.lang.Throwable -> L94
            r0.f79505d = r8     // Catch: java.lang.Throwable -> L94
            r0.f79507f = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r8.c(r0)     // Catch: java.lang.Throwable -> L94
            if (r2 != r1) goto L6d
            return r1
        L6d:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L72:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L39
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L39
            r0.f79503b = r2     // Catch: java.lang.Throwable -> L39
            r0.f79504c = r7     // Catch: java.lang.Throwable -> L39
            r0.f79505d = r6     // Catch: java.lang.Throwable -> L39
            r0.f79507f = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r8 = r2.f0(r8, r0)     // Catch: java.lang.Throwable -> L39
            if (r8 != r1) goto L35
            return r1
        L8d:
            kotlin.k2 r6 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L39
            r6 = 0
            kotlinx.coroutines.channels.t.a(r7, r6)
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
            kotlinx.coroutines.channels.t.a(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.W(kotlinx.coroutines.channels.d0, kotlinx.coroutines.channels.e0, kotlin.coroutines.d):java.lang.Object");
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
    @fg.m
    @kotlin.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object X(@fg.l kotlinx.coroutines.channels.d0<? extends E> r5, @fg.l C r6, @fg.l kotlin.coroutines.d<? super C> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.i0
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$i0 r0 = (kotlinx.coroutines.channels.u.i0) r0
            int r1 = r0.f79518f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79518f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$i0 r0 = new kotlinx.coroutines.channels.u$i0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f79517e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79518f
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.f79516d
            kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
            java.lang.Object r6 = r0.f79515c
            kotlinx.coroutines.channels.d0 r6 = (kotlinx.coroutines.channels.d0) r6
            java.lang.Object r2 = r0.f79514b
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L33
            goto L5e
        L33:
            r5 = move-exception
            goto L7a
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "虾\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.a1.n(r7)
            kotlinx.coroutines.channels.n r7 = r5.iterator()     // Catch: java.lang.Throwable -> L76
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4c:
            r0.f79514b = r7     // Catch: java.lang.Throwable -> L33
            r0.f79515c = r6     // Catch: java.lang.Throwable -> L33
            r0.f79516d = r5     // Catch: java.lang.Throwable -> L33
            r0.f79518f = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L33
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
            kotlin.k2 r5 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L33
            r5 = 0
            kotlinx.coroutines.channels.t.a(r6, r5)
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
            kotlinx.coroutines.channels.t.a(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.X(kotlinx.coroutines.channels.d0, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
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
    @fg.m
    @kotlin.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object Y(@fg.l kotlinx.coroutines.channels.d0<? extends kotlin.q0<? extends K, ? extends V>> r6, @fg.l M r7, @fg.l kotlin.coroutines.d<? super M> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.j0
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$j0 r0 = (kotlinx.coroutines.channels.u.j0) r0
            int r1 = r0.f79529f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79529f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$j0 r0 = new kotlinx.coroutines.channels.u$j0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f79528e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79529f
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f79527d
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.f79526c
            kotlinx.coroutines.channels.d0 r7 = (kotlinx.coroutines.channels.d0) r7
            java.lang.Object r2 = r0.f79525b
            java.util.Map r2 = (java.util.Map) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L33
            goto L5e
        L33:
            r6 = move-exception
            goto L84
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "虾\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L41:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.n r8 = r6.iterator()     // Catch: java.lang.Throwable -> L80
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L4c:
            r0.f79525b = r8     // Catch: java.lang.Throwable -> L33
            r0.f79526c = r7     // Catch: java.lang.Throwable -> L33
            r0.f79527d = r6     // Catch: java.lang.Throwable -> L33
            r0.f79529f = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L33
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
            kotlin.q0 r8 = (kotlin.q0) r8     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r8.e()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r8 = r8.f()     // Catch: java.lang.Throwable -> L33
            r2.put(r4, r8)     // Catch: java.lang.Throwable -> L33
            r8 = r2
            goto L4c
        L79:
            kotlin.k2 r6 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L33
            r6 = 0
            kotlinx.coroutines.channels.t.a(r7, r6)
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
            kotlinx.coroutines.channels.t.a(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.Y(kotlinx.coroutines.channels.d0, java.util.Map, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final Object Z(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.d dVar) {
        return Y(d0Var, new LinkedHashMap(), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlinx.coroutines.channels.d0 r4, kotlin.coroutines.d r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.u.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.channels.u$a r0 = (kotlinx.coroutines.channels.u.a) r0
            int r1 = r0.f79442d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79442d = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$a r0 = new kotlinx.coroutines.channels.u$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f79441c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79442d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f79440b
            kotlinx.coroutines.channels.d0 r4 = (kotlinx.coroutines.channels.d0) r4
            kotlin.a1.n(r5)     // Catch: java.lang.Throwable -> L2b
            goto L4b
        L2b:
            r5 = move-exception
            goto L50
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "虾\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.a1.n(r5)
            kotlinx.coroutines.channels.n r5 = r4.iterator()     // Catch: java.lang.Throwable -> L2b
            r0.f79440b = r4     // Catch: java.lang.Throwable -> L2b
            r0.f79442d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r5.c(r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r0 = 0
            kotlinx.coroutines.channels.t.a(r4, r0)
            return r5
        L50:
            throw r5     // Catch: java.lang.Throwable -> L51
        L51:
            r0 = move-exception
            kotlinx.coroutines.channels.t.a(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.a(kotlinx.coroutines.channels.d0, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final Object a0(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.d dVar) {
        return X(d0Var, new ArrayList(), dVar);
    }

    @fg.l
    @w0
    public static final ld.l<Throwable, k2> b(@fg.l kotlinx.coroutines.channels.d0<?> d0Var) {
        return new b(d0Var);
    }

    @fg.m
    @w0
    public static final <E> Object b0(@fg.l kotlinx.coroutines.channels.d0<? extends E> d0Var, @fg.l kotlin.coroutines.d<? super Set<E>> dVar) {
        return X(d0Var, new LinkedHashSet(), dVar);
    }

    @fg.l
    @w0
    public static final ld.l<Throwable, k2> c(@fg.l kotlinx.coroutines.channels.d0<?>... d0VarArr) {
        return new c(d0VarArr);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final Object c0(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.d dVar) {
        return b0(d0Var, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x0062, B:14:0x006a, B:30:0x0074), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x0062, B:14:0x006a, B:30:0x0074), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005f -> B:12:0x0062). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(kotlinx.coroutines.channels.d0 r6, kotlin.coroutines.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.d
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$d r0 = (kotlinx.coroutines.channels.u.d) r0
            int r1 = r0.f79461f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79461f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$d r0 = new kotlinx.coroutines.channels.u$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f79460e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79461f
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f79459d
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r2 = r0.f79458c
            kotlinx.coroutines.channels.d0 r2 = (kotlinx.coroutines.channels.d0) r2
            java.lang.Object r4 = r0.f79457b
            kotlin.jvm.internal.k1$f r4 = (kotlin.jvm.internal.k1.f) r4
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L33
            goto L62
        L33:
            r6 = move-exception
            goto L88
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "虾\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L41:
            kotlin.a1.n(r7)
            kotlin.jvm.internal.k1$f r7 = new kotlin.jvm.internal.k1$f
            r7.<init>()
            kotlinx.coroutines.channels.n r2 = r6.iterator()     // Catch: java.lang.Throwable -> L85
            r4 = r7
            r7 = r6
            r6 = r2
        L50:
            r0.f79457b = r4     // Catch: java.lang.Throwable -> L82
            r0.f79458c = r7     // Catch: java.lang.Throwable -> L82
            r0.f79459d = r6     // Catch: java.lang.Throwable -> L82
            r0.f79461f = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r2 = r6.c(r0)     // Catch: java.lang.Throwable -> L82
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
            int r7 = r4.f75327b     // Catch: java.lang.Throwable -> L33
            int r7 = r7 + r3
            r4.f75327b = r7     // Catch: java.lang.Throwable -> L33
            r7 = r2
            goto L50
        L74:
            kotlin.k2 r6 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L33
            r6 = 0
            kotlinx.coroutines.channels.t.a(r2, r6)
            int r6 = r4.f75327b
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
            kotlinx.coroutines.channels.t.a(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.d(kotlinx.coroutines.channels.d0, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.d0 d0(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new b(d0Var), new k0(d0Var, null), 6, null);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.d0 e(kotlinx.coroutines.channels.d0 d0Var) {
        return g(d0Var, null, new e(2, null), 1, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d0 e0(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return d0(d0Var, gVar);
    }

    @fg.l
    @w0
    public static final <E, K> kotlinx.coroutines.channels.d0<E> f(@fg.l kotlinx.coroutines.channels.d0<? extends E> d0Var, @fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super E, ? super kotlin.coroutines.d<? super K>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new b(d0Var), new f(d0Var, pVar, null), 6, null);
    }

    public static kotlinx.coroutines.channels.d0 g(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return f(d0Var, gVar, pVar);
    }

    @fg.l
    @w0
    public static final <E, R, V> kotlinx.coroutines.channels.d0<V> g0(@fg.l kotlinx.coroutines.channels.d0<? extends E> d0Var, @fg.l kotlinx.coroutines.channels.d0<? extends R> d0Var2, @fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super E, ? super R, ? extends V> pVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new c(new kotlinx.coroutines.channels.d0[]{d0Var, d0Var2}), new m0(d0Var2, d0Var, pVar, null), 6, null);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.d0 h(kotlinx.coroutines.channels.d0 d0Var, int i4, kotlin.coroutines.g gVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new b(d0Var), new g(i4, d0Var, null), 6, null);
    }

    public static kotlinx.coroutines.channels.d0 h0(kotlinx.coroutines.channels.d0 d0Var, kotlinx.coroutines.channels.d0 d0Var2, kotlin.coroutines.g gVar, ld.p pVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            gVar = j1.g();
        }
        return g0(d0Var, d0Var2, gVar, pVar);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d0 i(kotlinx.coroutines.channels.d0 d0Var, int i4, kotlin.coroutines.g gVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            gVar = j1.g();
        }
        return h(d0Var, i4, gVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.d0 j(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new b(d0Var), new h(d0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d0 k(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return j(d0Var, gVar, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0037, B:13:0x006a, B:15:0x0072, B:26:0x0083, B:27:0x009a), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #2 {all -> 0x003b, blocks: (B:12:0x0037, B:13:0x006a, B:15:0x0072, B:26:0x0083, B:27:0x009a), top: B:11:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0065 -> B:13:0x006a). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(kotlinx.coroutines.channels.d0 r9, int r10, kotlin.coroutines.d r11) {
        /*
            boolean r0 = r11 instanceof kotlinx.coroutines.channels.u.i
            if (r0 == 0) goto L13
            r0 = r11
            kotlinx.coroutines.channels.u$i r0 = (kotlinx.coroutines.channels.u.i) r0
            int r1 = r0.f79513g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79513g = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$i r0 = new kotlinx.coroutines.channels.u$i
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f79512f
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79513g
            r3 = 46
            r4 = 1
            java.lang.String r5 = "蚁\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            if (r2 == 0) goto L4a
            if (r2 != r4) goto L3e
            int r9 = r0.f79509c
            int r10 = r0.f79508b
            java.lang.Object r2 = r0.f79511e
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.n) r2
            java.lang.Object r6 = r0.f79510d
            kotlinx.coroutines.channels.d0 r6 = (kotlinx.coroutines.channels.d0) r6
            kotlin.a1.n(r11)     // Catch: java.lang.Throwable -> L3b
            goto L6a
        L3b:
            r9 = move-exception
            goto Lb4
        L3e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "虾\u0001"
            java.lang.String r10 = com.flashget.parentalcontrol.ProtectedSandApp.s(r10)
            r9.<init>(r10)
            throw r9
        L4a:
            kotlin.a1.n(r11)
            if (r10 < 0) goto L9f
            kotlinx.coroutines.channels.n r11 = r9.iterator()     // Catch: java.lang.Throwable -> L9b
            r2 = 0
        L54:
            r0.f79510d = r9     // Catch: java.lang.Throwable -> L9b
            r0.f79511e = r11     // Catch: java.lang.Throwable -> L9b
            r0.f79508b = r10     // Catch: java.lang.Throwable -> L9b
            r0.f79509c = r2     // Catch: java.lang.Throwable -> L9b
            r0.f79513g = r4     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r6 = r11.c(r0)     // Catch: java.lang.Throwable -> L9b
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
            kotlinx.coroutines.channels.t.a(r6, r9)
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
            kotlinx.coroutines.channels.t.a(r6, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.l(kotlinx.coroutines.channels.d0, int, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:13:0x006a, B:15:0x0072, B:22:0x0055, B:46:0x0050), top: B:45:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0066 -> B:13:0x006a). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(kotlinx.coroutines.channels.d0 r8, int r9, kotlin.coroutines.d r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.channels.u.j
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.channels.u$j r0 = (kotlinx.coroutines.channels.u.j) r0
            int r1 = r0.f79524g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79524g = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$j r0 = new kotlinx.coroutines.channels.u$j
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f79523f
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79524g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3b
            int r8 = r0.f79520c
            int r9 = r0.f79519b
            java.lang.Object r2 = r0.f79522e
            kotlinx.coroutines.channels.n r2 = (kotlinx.coroutines.channels.n) r2
            java.lang.Object r5 = r0.f79521d
            kotlinx.coroutines.channels.d0 r5 = (kotlinx.coroutines.channels.d0) r5
            kotlin.a1.n(r10)     // Catch: java.lang.Throwable -> L39
            r7 = r2
            r2 = r8
            r8 = r5
            r5 = r0
            r0 = r7
            goto L6a
        L39:
            r8 = move-exception
            goto L8a
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "虾\u0001"
            java.lang.String r9 = com.flashget.parentalcontrol.ProtectedSandApp.s(r9)
            r8.<init>(r9)
            throw r8
        L47:
            kotlin.a1.n(r10)
            if (r9 >= 0) goto L50
            kotlinx.coroutines.channels.t.a(r8, r4)
            return r4
        L50:
            kotlinx.coroutines.channels.n r10 = r8.iterator()     // Catch: java.lang.Throwable -> L82
            r2 = 0
        L55:
            r0.f79521d = r8     // Catch: java.lang.Throwable -> L82
            r0.f79522e = r10     // Catch: java.lang.Throwable -> L82
            r0.f79519b = r9     // Catch: java.lang.Throwable -> L82
            r0.f79520c = r2     // Catch: java.lang.Throwable -> L82
            r0.f79524g = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r5 = r10.c(r0)     // Catch: java.lang.Throwable -> L82
            if (r5 != r1) goto L66
            return r1
        L66:
            r7 = r0
            r0 = r10
            r10 = r5
            r5 = r7
        L6a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L82
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L82
            if (r10 == 0) goto L86
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L82
            int r6 = r2 + 1
            if (r9 != r2) goto L7e
            kotlinx.coroutines.channels.t.a(r8, r4)
            return r10
        L7e:
            r10 = r0
            r0 = r5
            r2 = r6
            goto L55
        L82:
            r9 = move-exception
            r5 = r8
            r8 = r9
            goto L8a
        L86:
            kotlinx.coroutines.channels.t.a(r8, r4)
            return r4
        L8a:
            throw r8     // Catch: java.lang.Throwable -> L8b
        L8b:
            r9 = move-exception
            kotlinx.coroutines.channels.t.a(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.m(kotlinx.coroutines.channels.d0, int, kotlin.coroutines.d):java.lang.Object");
    }

    @fg.l
    @w0
    public static final <E> kotlinx.coroutines.channels.d0<E> n(@fg.l kotlinx.coroutines.channels.d0<? extends E> d0Var, @fg.l kotlin.coroutines.g gVar, @fg.l ld.p<? super E, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> pVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new b(d0Var), new k(d0Var, pVar, null), 6, null);
    }

    public static kotlinx.coroutines.channels.d0 o(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return n(d0Var, gVar, pVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.d0 p(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.q qVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new b(d0Var), new l(d0Var, qVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d0 q(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.q qVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return p(d0Var, gVar, qVar);
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.d0 r(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar) {
        return n(d0Var, gVar, new m(pVar, null));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d0 s(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return r(d0Var, gVar, pVar);
    }

    @fg.l
    @w0
    public static final <E> kotlinx.coroutines.channels.d0<E> t(@fg.l kotlinx.coroutines.channels.d0<? extends E> d0Var) {
        kotlinx.coroutines.channels.d0<E> o4 = o(d0Var, null, new n(2, null), 1, null);
        kotlin.jvm.internal.l0.n(o4, ProtectedSandApp.s("蚂\u0001"));
        return o4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:16:0x006c, B:18:0x004c, B:23:0x0071), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x005e, B:14:0x0066, B:16:0x006c, B:18:0x004c, B:23:0x0071), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:12:0x005e). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(kotlinx.coroutines.channels.d0 r5, java.util.Collection r6, kotlin.coroutines.d r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.u.o
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.u$o r0 = (kotlinx.coroutines.channels.u.o) r0
            int r1 = r0.f79568f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79568f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$o r0 = new kotlinx.coroutines.channels.u$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f79567e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79568f
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.f79566d
            kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
            java.lang.Object r6 = r0.f79565c
            kotlinx.coroutines.channels.d0 r6 = (kotlinx.coroutines.channels.d0) r6
            java.lang.Object r2 = r0.f79564b
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.a1.n(r7)     // Catch: java.lang.Throwable -> L33
            goto L5e
        L33:
            r5 = move-exception
            goto L7c
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "虾\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L41:
            kotlin.a1.n(r7)
            kotlinx.coroutines.channels.n r7 = r5.iterator()     // Catch: java.lang.Throwable -> L78
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4c:
            r0.f79564b = r7     // Catch: java.lang.Throwable -> L33
            r0.f79565c = r6     // Catch: java.lang.Throwable -> L33
            r0.f79566d = r5     // Catch: java.lang.Throwable -> L33
            r0.f79568f = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r5.c(r0)     // Catch: java.lang.Throwable -> L33
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
            kotlin.k2 r5 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L33
            r5 = 0
            kotlinx.coroutines.channels.t.a(r6, r5)
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
            kotlinx.coroutines.channels.t.a(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.u(kotlinx.coroutines.channels.d0, java.util.Collection, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:19:0x0070, B:21:0x0078, B:23:0x007e, B:26:0x0091, B:42:0x0051), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0032, B:19:0x0070, B:21:0x0078, B:23:0x007e, B:26:0x0091, B:42:0x0051), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.channels.e0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlinx.coroutines.channels.d0] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlinx.coroutines.channels.d0] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007c -> B:13:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008a -> B:13:0x008d). Please report as a decompilation issue!!! */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(kotlinx.coroutines.channels.d0 r6, kotlinx.coroutines.channels.e0 r7, kotlin.coroutines.d r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.u.p
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.u$p r0 = (kotlinx.coroutines.channels.u.p) r0
            int r1 = r0.f79573f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79573f = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$p r0 = new kotlinx.coroutines.channels.u$p
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f79572e
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79573f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L55
            if (r2 == r4) goto L45
            if (r2 != r3) goto L39
            java.lang.Object r6 = r0.f79571d
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.f79570c
            kotlinx.coroutines.channels.d0 r7 = (kotlinx.coroutines.channels.d0) r7
            java.lang.Object r2 = r0.f79569b
            kotlinx.coroutines.channels.e0 r2 = (kotlinx.coroutines.channels.e0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L36
            goto L8d
        L36:
            r6 = move-exception
            goto L9c
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "虾\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L45:
            java.lang.Object r6 = r0.f79571d
            kotlinx.coroutines.channels.n r6 = (kotlinx.coroutines.channels.n) r6
            java.lang.Object r7 = r0.f79570c
            kotlinx.coroutines.channels.d0 r7 = (kotlinx.coroutines.channels.d0) r7
            java.lang.Object r2 = r0.f79569b
            kotlinx.coroutines.channels.e0 r2 = (kotlinx.coroutines.channels.e0) r2
            kotlin.a1.n(r8)     // Catch: java.lang.Throwable -> L36
            goto L70
        L55:
            kotlin.a1.n(r8)
            kotlinx.coroutines.channels.n r8 = r6.iterator()     // Catch: java.lang.Throwable -> L98
        L5c:
            r0.f79569b = r7     // Catch: java.lang.Throwable -> L98
            r0.f79570c = r6     // Catch: java.lang.Throwable -> L98
            r0.f79571d = r8     // Catch: java.lang.Throwable -> L98
            r0.f79573f = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r2 = r8.c(r0)     // Catch: java.lang.Throwable -> L98
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r2
            r2 = r5
        L70:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L36
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L91
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L36
            if (r8 == 0) goto L8d
            r0.f79569b = r2     // Catch: java.lang.Throwable -> L36
            r0.f79570c = r7     // Catch: java.lang.Throwable -> L36
            r0.f79571d = r6     // Catch: java.lang.Throwable -> L36
            r0.f79573f = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r8 = r2.f0(r8, r0)     // Catch: java.lang.Throwable -> L36
            if (r8 != r1) goto L8d
            return r1
        L8d:
            r8 = r6
            r6 = r7
            r7 = r2
            goto L5c
        L91:
            kotlin.k2 r6 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> L36
            r6 = 0
            kotlinx.coroutines.channels.t.a(r7, r6)
            return r2
        L98:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L9c:
            throw r6     // Catch: java.lang.Throwable -> L9d
        L9d:
            r8 = move-exception
            kotlinx.coroutines.channels.t.a(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.v(kotlinx.coroutines.channels.d0, kotlinx.coroutines.channels.e0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0055, B:14:0x005d, B:18:0x0066, B:19:0x0071), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[Catch: all -> 0x002f, TRY_ENTER, TryCatch #2 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0055, B:14:0x005d, B:18:0x0066, B:19:0x0071), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(kotlinx.coroutines.channels.d0 r5, kotlin.coroutines.d r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.u.q
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.u$q r0 = (kotlinx.coroutines.channels.u.q) r0
            int r1 = r0.f79577e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79577e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$q r0 = new kotlinx.coroutines.channels.u$q
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f79576d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79577e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f79575c
            kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
            java.lang.Object r0 = r0.f79574b
            kotlinx.coroutines.channels.d0 r0 = (kotlinx.coroutines.channels.d0) r0
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L2f
            goto L55
        L2f:
            r5 = move-exception
            goto L75
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "虾\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.a1.n(r6)
            kotlinx.coroutines.channels.n r6 = r5.iterator()     // Catch: java.lang.Throwable -> L72
            r0.f79574b = r5     // Catch: java.lang.Throwable -> L72
            r0.f79575c = r6     // Catch: java.lang.Throwable -> L72
            r0.f79577e = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r6.c(r0)     // Catch: java.lang.Throwable -> L72
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
            kotlinx.coroutines.channels.t.a(r0, r6)
            return r5
        L66:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L2f
            java.lang.String r6 = "虿\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)     // Catch: java.lang.Throwable -> L2f
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
            kotlinx.coroutines.channels.t.a(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.w(kotlinx.coroutines.channels.d0, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:11:0x002b, B:12:0x0055, B:18:0x0062), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(kotlinx.coroutines.channels.d0 r5, kotlin.coroutines.d r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.u.r
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.u$r r0 = (kotlinx.coroutines.channels.u.r) r0
            int r1 = r0.f79581e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79581e = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.u$r r0 = new kotlinx.coroutines.channels.u$r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f79580d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f79581e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f79579c
            kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
            java.lang.Object r0 = r0.f79578b
            kotlinx.coroutines.channels.d0 r0 = (kotlinx.coroutines.channels.d0) r0
            kotlin.a1.n(r6)     // Catch: java.lang.Throwable -> L2f
            goto L55
        L2f:
            r5 = move-exception
            goto L6d
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "虾\u0001"
            java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.a1.n(r6)
            kotlinx.coroutines.channels.n r6 = r5.iterator()     // Catch: java.lang.Throwable -> L6a
            r0.f79578b = r5     // Catch: java.lang.Throwable -> L6a
            r0.f79579c = r6     // Catch: java.lang.Throwable -> L6a
            r0.f79581e = r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r6.c(r0)     // Catch: java.lang.Throwable -> L6a
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
            kotlinx.coroutines.channels.t.a(r0, r1)
            return r1
        L62:
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L2f
            kotlinx.coroutines.channels.t.a(r0, r1)
            return r5
        L6a:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L6d:
            throw r5     // Catch: java.lang.Throwable -> L6e
        L6e:
            r6 = move-exception
            kotlinx.coroutines.channels.t.a(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.u.x(kotlinx.coroutines.channels.d0, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.k(level = kotlin.m.HIDDEN, message = "Binary compatibility")
    public static final kotlinx.coroutines.channels.d0 y(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar) {
        return kotlinx.coroutines.channels.z.f(b2.f79269b, gVar, 0, null, new b(d0Var), new s(d0Var, pVar, null), 6, null);
    }

    public static /* synthetic */ kotlinx.coroutines.channels.d0 z(kotlinx.coroutines.channels.d0 d0Var, kotlin.coroutines.g gVar, ld.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = j1.g();
        }
        return y(d0Var, gVar, pVar);
    }
}
