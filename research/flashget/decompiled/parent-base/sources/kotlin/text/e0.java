package kotlin.text;

import androidx.compose.animation.core.a2;
import androidx.compose.material3.s3;
import androidx.compose.material3.u9;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.collections.u0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.t1;
import kotlin.o2;
import kotlin.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringsJVM.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0019\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\b\u0010\t\u001a$\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\n\u0010\u0006\u001a$\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\u000b\u0010\t\u001a'\u0010\u000f\u001a\u00020\r*\u0004\u0018\u00010\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u0014\u001a+\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0018\u001a\u0014\u0010\u001b\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001d\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u0014\u0010\u001e\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001c\u001a\u0014\u0010\u001f\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001f\u0010\u001c\u001a\u0013\u0010!\u001a\u00020\u0000*\u00020 H\u0007¢\u0006\u0004\b!\u0010\"\u001a'\u0010%\u001a\u00020\u0000*\u00020 2\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u0003H\u0007¢\u0006\u0004\b%\u0010&\u001a'\u0010'\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u0003H\u0007¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010*\u001a\u00020\u0000*\u00020)H\u0007¢\u0006\u0004\b*\u0010+\u001a1\u0010-\u001a\u00020\u0000*\u00020)2\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\rH\u0007¢\u0006\u0004\b-\u0010.\u001a\u0013\u0010/\u001a\u00020)*\u00020\u0000H\u0007¢\u0006\u0004\b/\u00100\u001a1\u00101\u001a\u00020)*\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\rH\u0007¢\u0006\u0004\b1\u00102\u001a\u0014\u00103\u001a\u00020 *\u00020\u0000H\u0087\b¢\u0006\u0004\b3\u00104\u001a:\u00107\u001a\u00020 *\u00020\u00002\u0006\u00105\u001a\u00020 2\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\b7\u00108\u001a,\u0010<\u001a\u00020\u0000*\u00020\u00002\u0016\u0010;\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010:09\"\u0004\u0018\u00010:H\u0087\b¢\u0006\u0004\b<\u0010=\u001a4\u0010@\u001a\u00020\u0000*\u00020>2\u0006\u0010?\u001a\u00020\u00002\u0016\u0010;\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010:09\"\u0004\u0018\u00010:H\u0087\b¢\u0006\u0004\b@\u0010A\u001a6\u0010D\u001a\u00020\u0000*\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010B2\u0016\u0010;\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010:09\"\u0004\u0018\u00010:H\u0087\b¢\u0006\u0004\bD\u0010E\u001a>\u0010F\u001a\u00020\u0000*\u00020>2\b\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010?\u001a\u00020\u00002\u0016\u0010;\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010:09\"\u0004\u0018\u00010:H\u0087\b¢\u0006\u0004\bF\u0010G\u001a)\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00000L*\u00020H2\u0006\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020\u0003¢\u0006\u0004\bM\u0010N\u001a\u001c\u0010O\u001a\u00020\u0000*\u00020\u00002\u0006\u0010#\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bO\u0010P\u001a$\u0010Q\u001a\u00020\u0000*\u00020\u00002\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bQ\u0010R\u001a#\u0010T\u001a\u00020\r*\u00020\u00002\u0006\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bT\u0010\u0010\u001a+\u0010U\u001a\u00020\r*\u00020\u00002\u0006\u0010S\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bU\u0010V\u001a#\u0010X\u001a\u00020\r*\u00020\u00002\u0006\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bX\u0010\u0010\u001a0\u0010^\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020)2\u0006\u0010Z\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u00032\u0006\u0010]\u001a\u00020\\H\u0087\b¢\u0006\u0004\b^\u0010_\u001a \u0010`\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020)2\u0006\u0010]\u001a\u00020\\H\u0087\b¢\u0006\u0004\b`\u0010a\u001a(\u0010b\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020)2\u0006\u0010Z\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bb\u0010c\u001a\u0018\u0010d\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020)H\u0087\b¢\u0006\u0004\bd\u0010+\u001a\u0018\u0010f\u001a\u00020\u00002\u0006\u0010e\u001a\u00020 H\u0087\b¢\u0006\u0004\bf\u0010\"\u001a(\u0010g\u001a\u00020\u00002\u0006\u0010e\u001a\u00020 2\u0006\u0010Z\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bg\u0010&\u001a(\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020h2\u0006\u0010Z\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bj\u0010k\u001a\u0018\u0010n\u001a\u00020\u00002\u0006\u0010m\u001a\u00020lH\u0087\b¢\u0006\u0004\bn\u0010o\u001a\u0018\u0010r\u001a\u00020\u00002\u0006\u0010q\u001a\u00020pH\u0087\b¢\u0006\u0004\br\u0010s\u001a\u001c\u0010u\u001a\u00020\u0003*\u00020\u00002\u0006\u0010t\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bu\u0010v\u001a\u001c\u0010w\u001a\u00020\u0003*\u00020\u00002\u0006\u0010t\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\bw\u0010v\u001a$\u0010y\u001a\u00020\u0003*\u00020\u00002\u0006\u0010x\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0087\b¢\u0006\u0004\by\u0010z\u001a#\u0010{\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b{\u0010|\u001a\u001c\u0010~\u001a\u00020\r*\u00020\u00002\u0006\u0010}\u001a\u00020HH\u0087\b¢\u0006\u0004\b~\u0010\u007f\u001a\u001f\u0010\u0080\u0001\u001a\u00020\r*\u00020\u00002\u0006\u0010q\u001a\u00020lH\u0087\b¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a#\u0010\u0082\u0001\u001a\u00020\r*\u0004\u0018\u00010H2\b\u0010\f\u001a\u0004\u0018\u00010HH\u0087\u0004¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a*\u0010\u0084\u0001\u001a\u00020\r*\u0004\u0018\u00010H2\b\u0010\f\u001a\u0004\u0018\u00010H2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0016\u0010\u0086\u0001\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0005\b\u0086\u0001\u0010\u001c\u001a\u0014\u0010\u0087\u0001\u001a\u00020\r*\u00020H¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a'\u0010\u008a\u0001\u001a\u00020\u0003*\u00020\u00002\u0006\u0010t\u001a\u00020\u00032\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u0087\b¢\u0006\u0005\b\u008a\u0001\u0010z\u001a@\u0010\u008d\u0001\u001a\u00020\r*\u00020H2\u0007\u0010\u008b\u0001\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020H2\u0007\u0010\u008c\u0001\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a@\u0010\u008f\u0001\u001a\u00020\r*\u00020\u00002\u0007\u0010\u008b\u0001\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00002\u0007\u0010\u008c\u0001\u001a\u00020\u00032\u0006\u0010[\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u001f\u0010\u0091\u0001\u001a\u00020\u0000*\u00020\u00002\u0006\u0010C\u001a\u00020BH\u0087\b¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u001f\u0010\u0093\u0001\u001a\u00020\u0000*\u00020\u00002\u0006\u0010C\u001a\u00020BH\u0087\b¢\u0006\u0006\b\u0093\u0001\u0010\u0092\u0001\u001a\u001f\u0010\u0094\u0001\u001a\u00020\u0000*\u00020\u00002\u0006\u0010C\u001a\u00020BH\u0087\b¢\u0006\u0006\b\u0094\u0001\u0010\u0092\u0001\u001a\u001f\u0010\u0095\u0001\u001a\u00020\u0000*\u00020\u00002\u0006\u0010C\u001a\u00020BH\u0087\b¢\u0006\u0006\b\u0095\u0001\u0010\u0092\u0001\u001a!\u0010\u0096\u0001\u001a\u00020)*\u00020\u00002\b\b\u0002\u0010]\u001a\u00020\\H\u0087\b¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\"\u0010\u0099\u0001\u001a\u00020I*\u00020\u00002\t\b\u0002\u0010\u0098\u0001\u001a\u00020\u0003H\u0087\b¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0015\u0010\u009b\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0005\b\u009b\u0001\u0010\u001c\u001a\u001e\u0010\u009c\u0001\u001a\u00020\u0000*\u00020\u00002\u0006\u0010C\u001a\u00020BH\u0007¢\u0006\u0006\b\u009c\u0001\u0010\u0092\u0001\u001a\u0015\u0010\u009d\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0005\b\u009d\u0001\u0010\u001c\u001a\u001e\u0010\u009e\u0001\u001a\u00020\u0000*\u00020\u00002\u0006\u0010C\u001a\u00020BH\u0007¢\u0006\u0006\b\u009e\u0001\u0010\u0092\u0001\u001a\u001d\u0010 \u0001\u001a\u00020\u0000*\u00020H2\u0007\u0010\u009f\u0001\u001a\u00020\u0003¢\u0006\u0006\b \u0001\u0010¡\u0001\"*\u0010¦\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u00000¢\u0001j\t\u0012\u0004\u0012\u00020\u0000`£\u0001*\u00020>8F¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001¨\u0006§\u0001"}, d2 = {"", "", "ch", "", "fromIndex", "V1", "(Ljava/lang/String;CI)I", "str", "W1", "(Ljava/lang/String;Ljava/lang/String;I)I", "X1", "Y1", "other", "", "ignoreCase", "K1", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "oldChar", "newChar", "f2", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "oldValue", "newValue", "g2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "j2", "k2", "G2", "(Ljava/lang/String;)Ljava/lang/String;", "I2", "C2", "T1", "", "t1", "([C)Ljava/lang/String;", "startIndex", "endIndex", "u1", "([CII)Ljava/lang/String;", "y2", "(Ljava/lang/String;II)[C", "", "C1", "([B)Ljava/lang/String;", "throwOnInvalidSequence", "D1", "([BIIZ)Ljava/lang/String;", "F1", "(Ljava/lang/String;)[B", "G1", "(Ljava/lang/String;IIZ)[B", "x2", "(Ljava/lang/String;)[C", "destination", "destinationOffset", "z2", "(Ljava/lang/String;[CIII)[C", "", "", "args", "N1", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/String$Companion;", "format", "O1", "(Lkotlin/jvm/internal/t1;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Ljava/util/Locale;", "locale", "M1", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "P1", "(Lkotlin/jvm/internal/t1;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "", "Ljava/util/regex/Pattern;", "regex", "limit", "", "n2", "(Ljava/lang/CharSequence;Ljava/util/regex/Pattern;I)Ljava/util/List;", "t2", "(Ljava/lang/String;I)Ljava/lang/String;", "u2", "(Ljava/lang/String;II)Ljava/lang/String;", "prefix", "q2", "p2", "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "suffix", "I1", "bytes", "offset", "length", "Ljava/nio/charset/Charset;", "charset", "h1", "([BIILjava/nio/charset/Charset;)Ljava/lang/String;", "i1", "([BLjava/nio/charset/Charset;)Ljava/lang/String;", "g1", "([BII)Ljava/lang/String;", "f1", "chars", "j1", "k1", "", "codePoints", "l1", "([III)Ljava/lang/String;", "Ljava/lang/StringBuffer;", "stringBuffer", "d1", "(Ljava/lang/StringBuffer;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "stringBuilder", "e1", "(Ljava/lang/StringBuilder;)Ljava/lang/String;", "index", "o1", "(Ljava/lang/String;I)I", "p1", "beginIndex", "q1", "(Ljava/lang/String;II)I", "r1", "(Ljava/lang/String;Ljava/lang/String;Z)I", "charSequence", "y1", "(Ljava/lang/String;Ljava/lang/CharSequence;)Z", "z1", "(Ljava/lang/String;Ljava/lang/StringBuffer;)Z", "w1", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "x1", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "R1", "S1", "(Ljava/lang/CharSequence;)Z", "codePointOffset", "Z1", "thisOffset", "otherOffset", "a2", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "b2", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "D2", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "U1", "H2", "J2", "v2", "(Ljava/lang/String;Ljava/nio/charset/Charset;)[B", "flags", "E2", "(Ljava/lang/String;I)Ljava/util/regex/Pattern;", "m1", "n1", "A1", "B1", "n", "e2", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Q1", "(Lkotlin/jvm/internal/t1;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,829:1\n1174#2,2:830\n1#3:832\n1726#4,3:833\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:830,2\n624#1:833,3\n*E\n"})
/* loaded from: classes7.dex */
public class e0 extends d0 {
    @fg.l
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @x0(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = "1.5")
    public static final String A1(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        String s4 = ProtectedSandApp.s("菸\u0001");
        kotlin.jvm.internal.l0.o(substring, s4);
        kotlin.jvm.internal.l0.n(substring, ProtectedSandApp.s("菹\u0001"));
        String lowerCase = substring.toLowerCase();
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("菺\u0001"));
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        kotlin.jvm.internal.l0.o(substring2, s4);
        sb.append(substring2);
        return sb.toString();
    }

    public static /* synthetic */ char[] A2(String str, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        return y2(str, i4, i5);
    }

    @o2(markerClass = {kotlin.r.class})
    @kotlin.internal.h
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @x0(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @fg.l
    @c1(version = "1.4")
    public static final String B1(@fg.l String str, @fg.l Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("菻\u0001"));
        if (str.length() <= 0 || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        String s4 = ProtectedSandApp.s("菸\u0001");
        kotlin.jvm.internal.l0.o(substring, s4);
        kotlin.jvm.internal.l0.n(substring, ProtectedSandApp.s("菹\u0001"));
        String lowerCase = substring.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("菺\u0001"));
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        kotlin.jvm.internal.l0.o(substring2, s4);
        sb.append(substring2);
        return sb.toString();
    }

    static /* synthetic */ char[] B2(String str, char[] cArr, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = str.length();
        }
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("菼\u0001"));
        str.getChars(i5, i6, cArr, i4);
        return cArr;
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    public static final String C1(@fg.l byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("菷\u0001"));
        return new String(bArr, f.UTF_8);
    }

    @kotlin.k(message = "Use lowercase() instead.", replaceWith = @x0(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final String C2(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("菺\u0001"));
        return lowerCase;
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    public static final String D1(@fg.l byte[] bArr, int i4, int i5, boolean z4) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("菷\u0001"));
        kotlin.collections.c.INSTANCE.a(i4, i5, bArr.length);
        if (!z4) {
            return new String(bArr, i4, i5 - i4, f.UTF_8);
        }
        CharsetDecoder newDecoder = f.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String charBuffer = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i4, i5 - i4)).toString();
        kotlin.jvm.internal.l0.o(charBuffer, ProtectedSandApp.s("菽\u0001"));
        return charBuffer;
    }

    @kotlin.k(message = "Use lowercase() instead.", replaceWith = @x0(expression = "lowercase(locale)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final String D2(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("菻\u0001"));
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("菺\u0001"));
        return lowerCase;
    }

    public static /* synthetic */ String E1(byte[] bArr, int i4, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = bArr.length;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return D1(bArr, i4, i5, z4);
    }

    @kotlin.internal.f
    private static final Pattern E2(String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        Pattern compile = Pattern.compile(str, i4);
        kotlin.jvm.internal.l0.o(compile, ProtectedSandApp.s("菾\u0001"));
        return compile;
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    public static byte[] F1(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        byte[] bytes = str.getBytes(f.UTF_8);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("菿\u0001"));
        return bytes;
    }

    static /* synthetic */ Pattern F2(String str, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = 0;
        }
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        Pattern compile = Pattern.compile(str, i4);
        kotlin.jvm.internal.l0.o(compile, ProtectedSandApp.s("菾\u0001"));
        return compile;
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    public static final byte[] G1(@fg.l String str, int i4, int i5, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.collections.c.INSTANCE.a(i4, i5, str.length());
        if (!z4) {
            String substring = str.substring(i4, i5);
            kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("菸\u0001"));
            Charset charset = f.UTF_8;
            kotlin.jvm.internal.l0.n(substring, ProtectedSandApp.s("菹\u0001"));
            byte[] bytes = substring.getBytes(charset);
            kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("菿\u0001"));
            return bytes;
        }
        CharsetEncoder newEncoder = f.UTF_8.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, i4, i5));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            kotlin.jvm.internal.l0.m(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                kotlin.jvm.internal.l0.m(array2);
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    @kotlin.k(message = "Use uppercase() instead.", replaceWith = @x0(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final String G2(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        String upperCase = str.toUpperCase();
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("萀\u0001"));
        return upperCase;
    }

    public static /* synthetic */ byte[] H1(String str, int i4, int i5, boolean z4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = str.length();
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        return G1(str, i4, i5, z4);
    }

    @kotlin.k(message = "Use uppercase() instead.", replaceWith = @x0(expression = "uppercase(locale)", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @kotlin.internal.f
    private static final String H2(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("菻\u0001"));
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("萀\u0001"));
        return upperCase;
    }

    public static boolean I1(@fg.l String str, @fg.l String str2, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萁\u0001"));
        return !z4 ? str.endsWith(str2) : b2(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final String I2(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("萀\u0001"));
        return upperCase;
    }

    public static /* synthetic */ boolean J1(String str, String str2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return I1(str, str2, z4);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final String J2(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("菻\u0001"));
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("萀\u0001"));
        return upperCase;
    }

    public static boolean K1(@fg.m String str, @fg.m String str2, boolean z4) {
        return str == null ? str2 == null : !z4 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean L1(String str, String str2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return K1(str, str2, z4);
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final String M1(String str, Locale locale, Object... objArr) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("萂\u0001"));
        return u9.a(objArr, objArr.length, locale, str, ProtectedSandApp.s("萃\u0001"));
    }

    @kotlin.internal.f
    private static final String N1(String str, Object... objArr) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("萂\u0001"));
        return s3.a(objArr, objArr.length, str, ProtectedSandApp.s("萃\u0001"));
    }

    @kotlin.internal.f
    private static final String O1(t1 t1Var, String str, Object... objArr) {
        kotlin.jvm.internal.l0.p(t1Var, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萄\u0001"));
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("萂\u0001"));
        return s3.a(objArr, objArr.length, str, ProtectedSandApp.s("萃\u0001"));
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final String P1(t1 t1Var, Locale locale, String str, Object... objArr) {
        kotlin.jvm.internal.l0.p(t1Var, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萄\u0001"));
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("萂\u0001"));
        return u9.a(objArr, objArr.length, locale, str, ProtectedSandApp.s("萃\u0001"));
    }

    @fg.l
    public static Comparator<String> Q1(@fg.l t1 t1Var) {
        kotlin.jvm.internal.l0.p(t1Var, ProtectedSandApp.s("菷\u0001"));
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.l0.o(comparator, ProtectedSandApp.s("萅\u0001"));
        return comparator;
    }

    @kotlin.internal.f
    private static final String R1(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        String intern = str.intern();
        kotlin.jvm.internal.l0.o(intern, ProtectedSandApp.s("萆\u0001"));
        return intern;
    }

    public static boolean S1(@fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("菷\u0001"));
        if (charSequence.length() != 0) {
            Iterable f32 = h0.f3(charSequence);
            if (!(f32 instanceof Collection) || !((Collection) f32).isEmpty()) {
                Iterator it = f32.iterator();
                while (it.hasNext()) {
                    if (!d.r(charSequence.charAt(((u0) it).c()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final String T1(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("菺\u0001"));
        return lowerCase;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    @kotlin.internal.f
    private static final String U1(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("菻\u0001"));
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("菺\u0001"));
        return lowerCase;
    }

    @kotlin.internal.f
    private static final int V1(String str, char c5, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        return str.indexOf(c5, i4);
    }

    @kotlin.internal.f
    private static final int W1(String str, String str2, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萇\u0001"));
        return str.indexOf(str2, i4);
    }

    @kotlin.internal.f
    private static final int X1(String str, char c5, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        return str.lastIndexOf(c5, i4);
    }

    @kotlin.internal.f
    private static final int Y1(String str, String str2, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萇\u0001"));
        return str.lastIndexOf(str2, i4);
    }

    @kotlin.internal.f
    private static final int Z1(String str, int i4, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        return str.offsetByCodePoints(i4, i5);
    }

    public static final boolean a2(@fg.l CharSequence charSequence, int i4, @fg.l CharSequence charSequence2, int i5, int i6, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("萈\u0001"));
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? b2((String) charSequence, i4, (String) charSequence2, i5, i6, z4) : h0.Y3(charSequence, i4, charSequence2, i5, i6, z4);
    }

    public static boolean b2(@fg.l String str, int i4, @fg.l String str2, int i5, int i6, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萈\u0001"));
        return !z4 ? str.regionMatches(i4, str2, i5, i6) : str.regionMatches(z4, i4, str2, i5, i6);
    }

    public static /* synthetic */ boolean c2(CharSequence charSequence, int i4, CharSequence charSequence2, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            z4 = false;
        }
        return a2(charSequence, i4, charSequence2, i5, i6, z4);
    }

    @kotlin.internal.f
    private static final String d1(StringBuffer stringBuffer) {
        kotlin.jvm.internal.l0.p(stringBuffer, ProtectedSandApp.s("萉\u0001"));
        return new String(stringBuffer);
    }

    public static /* synthetic */ boolean d2(String str, int i4, String str2, int i5, int i6, boolean z4, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            z4 = false;
        }
        return b2(str, i4, str2, i5, i6, z4);
    }

    @kotlin.internal.f
    private static final String e1(StringBuilder sb) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("萊\u0001"));
        return new String(sb);
    }

    @fg.l
    public static String e2(@fg.l CharSequence charSequence, int i4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("菷\u0001"));
        if (i4 < 0) {
            throw new IllegalArgumentException(a2.a(ProtectedSandApp.s("萋\u0001"), i4, '.').toString());
        }
        if (i4 == 0) {
            return "";
        }
        if (i4 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                cArr[i5] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i4);
        u0 a5 = androidx.compose.animation.g.a(1, i4, 1);
        while (a5.hasNext()) {
            a5.c();
            sb.append(charSequence);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.m(sb2);
        return sb2;
    }

    @kotlin.internal.f
    private static final String f1(byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("萌\u0001"));
        return new String(bArr, f.UTF_8);
    }

    @fg.l
    public static final String f2(@fg.l String str, char c5, char c6, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        if (!z4) {
            String replace = str.replace(c5, c6);
            kotlin.jvm.internal.l0.o(replace, ProtectedSandApp.s("萍\u0001"));
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (e.J(charAt, c5, z4)) {
                charAt = c6;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("菽\u0001"));
        return sb2;
    }

    @kotlin.internal.f
    private static final String g1(byte[] bArr, int i4, int i5) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("萌\u0001"));
        return new String(bArr, i4, i5, f.UTF_8);
    }

    @fg.l
    public static final String g2(@fg.l String str, @fg.l String str2, @fg.l String str3, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萎\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萏\u0001"));
        int i4 = 0;
        int l32 = h0.l3(str, str2, 0, z4);
        if (l32 < 0) {
            return str;
        }
        int length = str2.length();
        int i5 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i4, l32);
            sb.append(str3);
            i4 = l32 + length;
            if (l32 >= str.length()) {
                break;
            }
            l32 = h0.l3(str, str2, l32 + i5, z4);
        } while (l32 > 0);
        sb.append((CharSequence) str, i4, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("菽\u0001"));
        return sb2;
    }

    @kotlin.internal.f
    private static final String h1(byte[] bArr, int i4, int i5, Charset charset) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("萌\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("萐\u0001"));
        return new String(bArr, i4, i5, charset);
    }

    public static /* synthetic */ String h2(String str, char c5, char c6, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return f2(str, c5, c6, z4);
    }

    @kotlin.internal.f
    private static final String i1(byte[] bArr, Charset charset) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("萌\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("萐\u0001"));
        return new String(bArr, charset);
    }

    public static /* synthetic */ String i2(String str, String str2, String str3, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return g2(str, str2, str3, z4);
    }

    @kotlin.internal.f
    private static final String j1(char[] cArr) {
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("萑\u0001"));
        return new String(cArr);
    }

    @fg.l
    public static final String j2(@fg.l String str, char c5, char c6, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        int o32 = h0.o3(str, c5, 0, z4, 2, null);
        return o32 < 0 ? str : h0.G4(str, o32, o32 + 1, String.valueOf(c6)).toString();
    }

    @kotlin.internal.f
    private static final String k1(char[] cArr, int i4, int i5) {
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("萑\u0001"));
        return new String(cArr, i4, i5);
    }

    @fg.l
    public static final String k2(@fg.l String str, @fg.l String str2, @fg.l String str3, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萎\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萏\u0001"));
        int p32 = h0.p3(str, str2, 0, z4, 2, null);
        return p32 < 0 ? str : h0.G4(str, p32, str2.length() + p32, str3).toString();
    }

    @kotlin.internal.f
    private static final String l1(int[] iArr, int i4, int i5) {
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("萒\u0001"));
        return new String(iArr, i4, i5);
    }

    public static /* synthetic */ String l2(String str, char c5, char c6, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return j2(str, c5, c6, z4);
    }

    @fg.l
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @x0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @kotlin.l(warningSince = "1.5")
    public static final String m1(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.l0.o(locale, ProtectedSandApp.s("萓\u0001"));
        return n1(str, locale);
    }

    public static /* synthetic */ String m2(String str, String str2, String str3, boolean z4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        return k2(str, str2, str3, z4);
    }

    @o2(markerClass = {kotlin.r.class})
    @kotlin.internal.h
    @kotlin.k(message = "Use replaceFirstChar instead.", replaceWith = @x0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @kotlin.l(warningSince = "1.5")
    @fg.l
    @c1(version = "1.4")
    public static final String n1(@fg.l String str, @fg.l Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("菻\u0001"));
        if (str.length() <= 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        char upperCase = Character.toUpperCase(charAt);
        String s4 = ProtectedSandApp.s("菸\u0001");
        if (titleCase != upperCase) {
            sb.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            kotlin.jvm.internal.l0.o(substring, s4);
            kotlin.jvm.internal.l0.n(substring, ProtectedSandApp.s("菹\u0001"));
            String upperCase2 = substring.toUpperCase(locale);
            kotlin.jvm.internal.l0.o(upperCase2, ProtectedSandApp.s("萀\u0001"));
            sb.append(upperCase2);
        }
        String substring2 = str.substring(1);
        kotlin.jvm.internal.l0.o(substring2, s4);
        sb.append(substring2);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("菽\u0001"));
        return sb2;
    }

    @fg.l
    public static final List<String> n2(@fg.l CharSequence charSequence, @fg.l Pattern pattern, int i4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(pattern, ProtectedSandApp.s("萔\u0001"));
        h0.K4(i4);
        if (i4 == 0) {
            i4 = -1;
        }
        String[] split = pattern.split(charSequence, i4);
        kotlin.jvm.internal.l0.o(split, ProtectedSandApp.s("萕\u0001"));
        return kotlin.collections.l.t(split);
    }

    @kotlin.internal.f
    private static final int o1(String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        return str.codePointAt(i4);
    }

    public static /* synthetic */ List o2(CharSequence charSequence, Pattern pattern, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return n2(charSequence, pattern, i4);
    }

    @kotlin.internal.f
    private static final int p1(String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        return str.codePointBefore(i4);
    }

    public static boolean p2(@fg.l String str, @fg.l String str2, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萖\u0001"));
        return !z4 ? str.startsWith(str2, i4) : b2(str, i4, str2, 0, str2.length(), z4);
    }

    @kotlin.internal.f
    private static final int q1(String str, int i4, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        return str.codePointCount(i4, i5);
    }

    public static boolean q2(@fg.l String str, @fg.l String str2, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萖\u0001"));
        return !z4 ? str.startsWith(str2) : b2(str, 0, str2, 0, str2.length(), z4);
    }

    public static int r1(@fg.l String str, @fg.l String str2, boolean z4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萈\u0001"));
        return z4 ? str.compareToIgnoreCase(str2) : str.compareTo(str2);
    }

    public static /* synthetic */ boolean r2(String str, String str2, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return p2(str, str2, i4, z4);
    }

    public static /* synthetic */ int s1(String str, String str2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return r1(str, str2, z4);
    }

    public static /* synthetic */ boolean s2(String str, String str2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return q2(str, str2, z4);
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    public static final String t1(@fg.l char[] cArr) {
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("菷\u0001"));
        return new String(cArr);
    }

    @kotlin.internal.f
    private static final String t2(String str, int i4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        String substring = str.substring(i4);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("菸\u0001"));
        return substring;
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    public static final String u1(@fg.l char[] cArr, int i4, int i5) {
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("菷\u0001"));
        kotlin.collections.c.INSTANCE.a(i4, i5, cArr.length);
        return new String(cArr, i4, i5 - i4);
    }

    @kotlin.internal.f
    private static final String u2(String str, int i4, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        String substring = str.substring(i4, i5);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("菸\u0001"));
        return substring;
    }

    public static /* synthetic */ String v1(char[] cArr, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = cArr.length;
        }
        return u1(cArr, i4, i5);
    }

    @kotlin.internal.f
    private static final byte[] v2(String str, Charset charset) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("萐\u0001"));
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("菿\u0001"));
        return bytes;
    }

    @c1(version = "1.5")
    public static boolean w1(@fg.m CharSequence charSequence, @fg.m CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? h0.V2(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    static /* synthetic */ byte[] w2(String str, Charset charset, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charset = f.UTF_8;
        }
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("萐\u0001"));
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("菿\u0001"));
        return bytes;
    }

    @c1(version = "1.5")
    public static final boolean x1(@fg.m CharSequence charSequence, @fg.m CharSequence charSequence2, boolean z4) {
        return z4 ? h0.U2(charSequence, charSequence2) : w1(charSequence, charSequence2);
    }

    @kotlin.internal.f
    private static final char[] x2(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.l0.o(charArray, ProtectedSandApp.s("萗\u0001"));
        return charArray;
    }

    @kotlin.internal.f
    private static final boolean y1(String str, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萘\u0001"));
        return str.contentEquals(charSequence);
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    public static final char[] y2(@fg.l String str, int i4, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.collections.c.INSTANCE.a(i4, i5, str.length());
        char[] cArr = new char[i5 - i4];
        str.getChars(i4, i5, cArr, 0);
        return cArr;
    }

    @kotlin.internal.f
    private static final boolean z1(String str, StringBuffer stringBuffer) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(stringBuffer, ProtectedSandApp.s("萊\u0001"));
        return str.contentEquals(stringBuffer);
    }

    @kotlin.internal.f
    private static final char[] z2(String str, char[] cArr, int i4, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("菷\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("菼\u0001"));
        str.getChars(i5, i6, cArr, i4);
        return cArr;
    }
}
