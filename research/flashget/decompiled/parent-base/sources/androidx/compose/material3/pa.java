package androidx.compose.material3;

import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: TextFieldDefaults.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b7\b\u0007\u0018\u00002\u00020\u0001Bß\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100JÀ\u0003\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102J#\u00105\u001a\u00020\r*\u0004\u0018\u00010\r2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\r03H\u0000¢\u0006\u0004\b5\u00106J-\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>J-\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b?\u0010>J-\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b@\u0010>J-\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bA\u0010>J-\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bB\u0010>J-\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bC\u0010>J-\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bD\u0010>J-\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bE\u0010>J-\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bF\u0010>J-\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\bG\u0010>J\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u00109\u001a\u000207H\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010K\u001a\u0002072\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bQ\u0010RR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bA\u0010Q\u001a\u0004\bS\u0010RR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010Q\u001a\u0004\bT\u0010RR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bV\u0010RR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bH\u0010Q\u001a\u0004\bW\u0010RR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bX\u0010Q\u001a\u0004\bY\u0010RR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bZ\u0010Q\u001a\u0004\bZ\u0010RR\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010RR\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b]\u0010Q\u001a\u0004\bX\u0010RR\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b^\u0010Q\u001a\u0004\b_\u0010RR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bd\u0010Q\u001a\u0004\be\u0010RR\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bf\u0010Q\u001a\u0004\bg\u0010RR\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bh\u0010Q\u001a\u0004\b[\u0010RR\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bT\u0010Q\u001a\u0004\bi\u0010RR\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bj\u0010Q\u001a\u0004\bk\u0010RR\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\\\u0010Q\u001a\u0004\bl\u0010RR\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b_\u0010Q\u001a\u0004\b^\u0010RR\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bi\u0010Q\u001a\u0004\bm\u0010RR\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bn\u0010Q\u001a\u0004\bo\u0010RR\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bm\u0010Q\u001a\u0004\bp\u0010RR\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bq\u0010Q\u001a\u0004\bj\u0010RR\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\br\u0010Q\u001a\u0004\bs\u0010RR\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bt\u0010Q\u001a\u0004\bu\u0010RR\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bv\u0010Q\u001a\u0004\bw\u0010RR\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bV\u0010Q\u001a\u0004\b]\u0010RR\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bs\u0010Q\u001a\u0004\bn\u0010RR\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bW\u0010Q\u001a\u0004\bx\u0010RR\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\be\u0010Q\u001a\u0004\by\u0010RR\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bu\u0010Q\u001a\u0004\b`\u0010RR\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bk\u0010Q\u001a\u0004\bq\u0010RR\u001d\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bx\u0010Q\u001a\u0004\bz\u0010RR\u001d\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b{\u0010Q\u001a\u0004\b|\u0010RR\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b}\u0010Q\u001a\u0004\bh\u0010RR\u001d\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bz\u0010Q\u001a\u0004\bv\u0010RR\u001d\u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bQ\u0010Q\u001a\u0004\b{\u0010RR\u001d\u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bo\u0010Q\u001a\u0004\b~\u0010RR\u001d\u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u007f\u0010Q\u001a\u0004\bd\u0010RR\u001d\u0010*\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bb\u0010Q\u001a\u0004\br\u0010RR\u001d\u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bY\u0010Q\u001a\u0004\b}\u0010RR\u001e\u0010,\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\bg\u0010Q\u001a\u0005\b\u0080\u0001\u0010RR\u001d\u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bw\u0010Q\u001a\u0004\bf\u0010RR\u001d\u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bl\u0010Q\u001a\u0004\bt\u0010RR\u0016\u0010\u0082\u0001\u001a\u00020\r8AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0081\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0084\u0001²\u0006\r\u0010\u0083\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u0083\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u0083\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u0083\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u0083\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u0083\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u0083\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u0083\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u0083\u0001\u001a\u0002078\nX\u008a\u0084\u0002²\u0006\r\u0010\u0083\u0001\u001a\u0002078\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/pa;", "", "Landroidx/compose/ui/graphics/d2;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/x0;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/x0;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "c", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/x0;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/pa;", "Lkotlin/Function0;", "block", "l0", "(Landroidx/compose/foundation/text/selection/x0;Lld/a;)Landroidx/compose/foundation/text/selection/x0;", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/i;", "interactionSource", "Landroidx/compose/runtime/b5;", "c0", "(ZZLandroidx/compose/foundation/interaction/i;Landroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "p0", "Y", "b", "e0", "a0", "n0", "k0", "g0", "i0", "e", "(ZLandroidx/compose/runtime/t;I)Landroidx/compose/runtime/b5;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "()J", "V", "o", "d", "z", "B", "f", "N", "g", "h", "q", "i", "j", "r", "k", "Landroidx/compose/foundation/text/selection/x0;", "M", "()Landroidx/compose/foundation/text/selection/x0;", "l", "C", "m", "O", "n", "s", "p", "E", "Q", "u", "t", "K", "W", "v", "w", "A", "x", "D", "y", "P", "F", "R", "I", "G", "U", "H", "S", "L", "T", "(Landroidx/compose/runtime/t;I)Landroidx/compose/foundation/text/selection/x0;", "selectionColors", "focused", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2400:1\n658#2:2401\n646#2:2402\n658#2:2403\n646#2:2404\n658#2:2405\n646#2:2406\n658#2:2407\n646#2:2408\n658#2:2409\n646#2:2410\n658#2:2411\n646#2:2412\n658#2:2413\n646#2:2414\n658#2:2415\n646#2:2416\n658#2:2417\n646#2:2418\n658#2:2419\n646#2:2420\n658#2:2421\n646#2:2422\n658#2:2423\n646#2:2424\n658#2:2425\n646#2:2426\n658#2:2427\n646#2:2428\n658#2:2429\n646#2:2430\n658#2:2431\n646#2:2432\n658#2:2433\n646#2:2434\n658#2:2435\n646#2:2436\n658#2:2437\n646#2:2438\n658#2:2439\n646#2:2440\n658#2:2441\n646#2:2442\n658#2:2443\n646#2:2444\n658#2:2445\n646#2:2446\n658#2:2447\n646#2:2448\n658#2:2449\n646#2:2450\n658#2:2451\n646#2:2452\n658#2:2453\n646#2:2454\n658#2:2455\n646#2:2456\n658#2:2457\n646#2:2458\n658#2:2459\n646#2:2460\n658#2:2461\n646#2:2462\n658#2:2463\n646#2:2464\n658#2:2465\n646#2:2466\n658#2:2467\n646#2:2468\n658#2:2469\n646#2:2470\n658#2:2471\n646#2:2472\n658#2:2473\n646#2:2474\n658#2:2475\n646#2:2476\n658#2:2477\n646#2:2478\n658#2:2479\n646#2:2480\n658#2:2481\n646#2:2482\n658#2:2483\n646#2:2484\n81#3:2485\n81#3:2486\n81#3:2487\n81#3:2488\n81#3:2489\n81#3:2490\n81#3:2491\n81#3:2492\n81#3:2493\n81#3:2494\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n*L\n1967#1:2401\n1967#1:2402\n1968#1:2403\n1968#1:2404\n1969#1:2405\n1969#1:2406\n1970#1:2407\n1970#1:2408\n1971#1:2409\n1971#1:2410\n1972#1:2411\n1972#1:2412\n1973#1:2413\n1973#1:2414\n1974#1:2415\n1974#1:2416\n1975#1:2417\n1975#1:2418\n1976#1:2419\n1976#1:2420\n1978#1:2421\n1978#1:2422\n1979#1:2423\n1979#1:2424\n1980#1:2425\n1980#1:2426\n1981#1:2427\n1981#1:2428\n1982#1:2429\n1982#1:2430\n1983#1:2431\n1983#1:2432\n1984#1:2433\n1984#1:2434\n1985#1:2435\n1985#1:2436\n1986#1:2437\n1986#1:2438\n1987#1:2439\n1987#1:2440\n1988#1:2441\n1988#1:2442\n1989#1:2443\n1989#1:2444\n1990#1:2445\n1990#1:2446\n1991#1:2447\n1991#1:2448\n1992#1:2449\n1992#1:2450\n1993#1:2451\n1993#1:2452\n1994#1:2453\n1994#1:2454\n1995#1:2455\n1995#1:2456\n1996#1:2457\n1996#1:2458\n1997#1:2459\n1997#1:2460\n1998#1:2461\n1998#1:2462\n1999#1:2463\n1999#1:2464\n2000#1:2465\n2000#1:2466\n2001#1:2467\n2001#1:2468\n2002#1:2469\n2002#1:2470\n2003#1:2471\n2003#1:2472\n2004#1:2473\n2004#1:2474\n2005#1:2475\n2005#1:2476\n2006#1:2477\n2006#1:2478\n2007#1:2479\n2007#1:2480\n2008#1:2481\n2008#1:2482\n2009#1:2483\n2009#1:2484\n2029#1:2485\n2055#1:2486\n2081#1:2487\n2110#1:2488\n2135#1:2489\n2160#1:2490\n2185#1:2491\n2202#1:2492\n2228#1:2493\n2253#1:2494\n*E\n"})
/* loaded from: classes.dex */
public final class pa {
    public static final int R = 0;

    /* renamed from: A, reason: from kotlin metadata */
    private final long errorLabelColor;

    /* renamed from: B, reason: from kotlin metadata */
    private final long focusedPlaceholderColor;

    /* renamed from: C, reason: from kotlin metadata */
    private final long unfocusedPlaceholderColor;

    /* renamed from: D, reason: from kotlin metadata */
    private final long disabledPlaceholderColor;

    /* renamed from: E, reason: from kotlin metadata */
    private final long errorPlaceholderColor;

    /* renamed from: F, reason: from kotlin metadata */
    private final long focusedSupportingTextColor;

    /* renamed from: G, reason: from kotlin metadata */
    private final long unfocusedSupportingTextColor;

    /* renamed from: H, reason: from kotlin metadata */
    private final long disabledSupportingTextColor;

    /* renamed from: I, reason: from kotlin metadata */
    private final long errorSupportingTextColor;

    /* renamed from: J, reason: from kotlin metadata */
    private final long focusedPrefixColor;

    /* renamed from: K, reason: from kotlin metadata */
    private final long unfocusedPrefixColor;

    /* renamed from: L, reason: from kotlin metadata */
    private final long disabledPrefixColor;

    /* renamed from: M, reason: from kotlin metadata */
    private final long errorPrefixColor;

    /* renamed from: N, reason: from kotlin metadata */
    private final long focusedSuffixColor;

    /* renamed from: O, reason: from kotlin metadata */
    private final long unfocusedSuffixColor;

    /* renamed from: P, reason: from kotlin metadata */
    private final long disabledSuffixColor;

    /* renamed from: Q, reason: from kotlin metadata */
    private final long errorSuffixColor;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long focusedTextColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedTextColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledTextColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long errorTextColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long focusedContainerColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedContainerColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long errorContainerColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long cursorColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long errorCursorColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text.selection.x0 textSelectionColors;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long focusedIndicatorColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedIndicatorColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndicatorColor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long errorIndicatorColor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long focusedLeadingIconColor;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedLeadingIconColor;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long errorLeadingIconColor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long focusedTrailingIconColor;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedTrailingIconColor;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long errorTrailingIconColor;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long focusedLabelColor;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedLabelColor;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final long disabledLabelColor;

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/x0;", "a", "()Landroidx/compose/foundation/text/selection/x0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.foundation.text.selection.x0> {
        a() {
            super(0);
        }

        @fg.l
        public final androidx.compose.foundation.text.selection.x0 a() {
            return pa.this.getTextSelectionColors();
        }

        @Override // ld.a
        public androidx.compose.foundation.text.selection.x0 invoke() {
            return pa.this.getTextSelectionColors();
        }
    }

    public /* synthetic */ pa(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, androidx.compose.foundation.text.selection.x0 x0Var, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, kotlin.jvm.internal.w wVar) {
        this(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, x0Var, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47);
    }

    private static final boolean X(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    private static final boolean Z(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    private static final boolean a(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    private static final boolean b0(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    private static final boolean d0(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    private static final boolean f0(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    private static final boolean h0(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    private static final boolean j0(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    private static final boolean m0(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    private static final boolean o0(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    /* renamed from: A, reason: from getter */
    public final long getErrorTrailingIconColor() {
        return this.errorTrailingIconColor;
    }

    /* renamed from: B, reason: from getter */
    public final long getFocusedContainerColor() {
        return this.focusedContainerColor;
    }

    /* renamed from: C, reason: from getter */
    public final long getFocusedIndicatorColor() {
        return this.focusedIndicatorColor;
    }

    /* renamed from: D, reason: from getter */
    public final long getFocusedLabelColor() {
        return this.focusedLabelColor;
    }

    /* renamed from: E, reason: from getter */
    public final long getFocusedLeadingIconColor() {
        return this.focusedLeadingIconColor;
    }

    /* renamed from: F, reason: from getter */
    public final long getFocusedPlaceholderColor() {
        return this.focusedPlaceholderColor;
    }

    /* renamed from: G, reason: from getter */
    public final long getFocusedPrefixColor() {
        return this.focusedPrefixColor;
    }

    /* renamed from: H, reason: from getter */
    public final long getFocusedSuffixColor() {
        return this.focusedSuffixColor;
    }

    /* renamed from: I, reason: from getter */
    public final long getFocusedSupportingTextColor() {
        return this.focusedSupportingTextColor;
    }

    /* renamed from: J, reason: from getter */
    public final long getFocusedTextColor() {
        return this.focusedTextColor;
    }

    /* renamed from: K, reason: from getter */
    public final long getFocusedTrailingIconColor() {
        return this.focusedTrailingIconColor;
    }

    @fg.l
    @androidx.compose.runtime.i
    @kd.i(name = "getSelectionColors")
    public final androidx.compose.foundation.text.selection.x0 L(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(997785083);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(997785083, i4, -1, "androidx.compose.material3.TextFieldColors.<get-selectionColors> (TextFieldDefaults.kt:2277)");
        }
        androidx.compose.foundation.text.selection.x0 x0Var = this.textSelectionColors;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return x0Var;
    }

    @fg.l
    /* renamed from: M, reason: from getter */
    public final androidx.compose.foundation.text.selection.x0 getTextSelectionColors() {
        return this.textSelectionColors;
    }

    /* renamed from: N, reason: from getter */
    public final long getUnfocusedContainerColor() {
        return this.unfocusedContainerColor;
    }

    /* renamed from: O, reason: from getter */
    public final long getUnfocusedIndicatorColor() {
        return this.unfocusedIndicatorColor;
    }

    /* renamed from: P, reason: from getter */
    public final long getUnfocusedLabelColor() {
        return this.unfocusedLabelColor;
    }

    /* renamed from: Q, reason: from getter */
    public final long getUnfocusedLeadingIconColor() {
        return this.unfocusedLeadingIconColor;
    }

    /* renamed from: R, reason: from getter */
    public final long getUnfocusedPlaceholderColor() {
        return this.unfocusedPlaceholderColor;
    }

    /* renamed from: S, reason: from getter */
    public final long getUnfocusedPrefixColor() {
        return this.unfocusedPrefixColor;
    }

    /* renamed from: T, reason: from getter */
    public final long getUnfocusedSuffixColor() {
        return this.unfocusedSuffixColor;
    }

    /* renamed from: U, reason: from getter */
    public final long getUnfocusedSupportingTextColor() {
        return this.unfocusedSupportingTextColor;
    }

    /* renamed from: V, reason: from getter */
    public final long getUnfocusedTextColor() {
        return this.unfocusedTextColor;
    }

    /* renamed from: W, reason: from getter */
    public final long getUnfocusedTrailingIconColor() {
        return this.unfocusedTrailingIconColor;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> Y(boolean z4, boolean z5, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4;
        tVar.P(-1877482635);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1877482635, i4, -1, "androidx.compose.material3.TextFieldColors.indicatorColor (TextFieldDefaults.kt:2079)");
        }
        long j4 = !z4 ? this.disabledIndicatorColor : z5 ? this.errorIndicatorColor : X(androidx.compose.foundation.interaction.e.a(iVar, tVar, (i4 >> 6) & 14)) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        if (z4) {
            tVar.P(715804770);
            u4 = androidx.compose.animation.u0.c(j4, androidx.compose.animation.core.l.r(150, 0, null, 6, null), null, null, tVar, 48, 12);
            tVar.p0();
        } else {
            tVar.P(715804875);
            u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(j4), tVar, 0);
            tVar.p0();
        }
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> a0(boolean z4, boolean z5, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1167161306);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1167161306, i4, -1, "androidx.compose.material3.TextFieldColors.labelColor (TextFieldDefaults.kt:2158)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(!z4 ? this.disabledLabelColor : z5 ? this.errorLabelColor : Z(androidx.compose.foundation.interaction.e.a(iVar, tVar, (i4 >> 6) & 14)) ? this.focusedLabelColor : this.unfocusedLabelColor), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> b(boolean z4, boolean z5, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1921164569);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1921164569, i4, -1, "androidx.compose.material3.TextFieldColors.containerColor (TextFieldDefaults.kt:2108)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> c5 = androidx.compose.animation.u0.c(!z4 ? this.disabledContainerColor : z5 ? this.errorContainerColor : a(androidx.compose.foundation.interaction.e.a(iVar, tVar, (i4 >> 6) & 14)) ? this.focusedContainerColor : this.unfocusedContainerColor, androidx.compose.animation.core.l.r(150, 0, null, 6, null), null, null, tVar, 48, 12);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    @fg.l
    public final pa c(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, @fg.m androidx.compose.foundation.text.selection.x0 textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        d2.Companion companion = androidx.compose.ui.graphics.d2.INSTANCE;
        companion.getClass();
        long j4 = focusedTextColor != androidx.compose.ui.graphics.d2.f17778o ? focusedTextColor : this.focusedTextColor;
        companion.getClass();
        long j5 = unfocusedTextColor != androidx.compose.ui.graphics.d2.f17778o ? unfocusedTextColor : this.unfocusedTextColor;
        companion.getClass();
        long j6 = disabledTextColor != androidx.compose.ui.graphics.d2.f17778o ? disabledTextColor : this.disabledTextColor;
        companion.getClass();
        long j7 = errorTextColor != androidx.compose.ui.graphics.d2.f17778o ? errorTextColor : this.errorTextColor;
        companion.getClass();
        long j10 = focusedContainerColor != androidx.compose.ui.graphics.d2.f17778o ? focusedContainerColor : this.focusedContainerColor;
        companion.getClass();
        long j11 = unfocusedContainerColor != androidx.compose.ui.graphics.d2.f17778o ? unfocusedContainerColor : this.unfocusedContainerColor;
        companion.getClass();
        long j12 = disabledContainerColor != androidx.compose.ui.graphics.d2.f17778o ? disabledContainerColor : this.disabledContainerColor;
        companion.getClass();
        long j13 = errorContainerColor != androidx.compose.ui.graphics.d2.f17778o ? errorContainerColor : this.errorContainerColor;
        companion.getClass();
        long j14 = cursorColor != androidx.compose.ui.graphics.d2.f17778o ? cursorColor : this.cursorColor;
        companion.getClass();
        long j15 = errorCursorColor != androidx.compose.ui.graphics.d2.f17778o ? errorCursorColor : this.errorCursorColor;
        androidx.compose.foundation.text.selection.x0 l02 = l0(textSelectionColors, new a());
        companion.getClass();
        long j16 = focusedIndicatorColor != androidx.compose.ui.graphics.d2.f17778o ? focusedIndicatorColor : this.focusedIndicatorColor;
        companion.getClass();
        long j17 = unfocusedIndicatorColor != androidx.compose.ui.graphics.d2.f17778o ? unfocusedIndicatorColor : this.unfocusedIndicatorColor;
        companion.getClass();
        long j18 = disabledIndicatorColor != androidx.compose.ui.graphics.d2.f17778o ? disabledIndicatorColor : this.disabledIndicatorColor;
        companion.getClass();
        long j19 = errorIndicatorColor != androidx.compose.ui.graphics.d2.f17778o ? errorIndicatorColor : this.errorIndicatorColor;
        companion.getClass();
        long j20 = focusedLeadingIconColor != androidx.compose.ui.graphics.d2.f17778o ? focusedLeadingIconColor : this.focusedLeadingIconColor;
        companion.getClass();
        long j21 = unfocusedLeadingIconColor != androidx.compose.ui.graphics.d2.f17778o ? unfocusedLeadingIconColor : this.unfocusedLeadingIconColor;
        companion.getClass();
        long j22 = disabledLeadingIconColor != androidx.compose.ui.graphics.d2.f17778o ? disabledLeadingIconColor : this.disabledLeadingIconColor;
        companion.getClass();
        long j23 = errorLeadingIconColor != androidx.compose.ui.graphics.d2.f17778o ? errorLeadingIconColor : this.errorLeadingIconColor;
        companion.getClass();
        long j24 = focusedTrailingIconColor != androidx.compose.ui.graphics.d2.f17778o ? focusedTrailingIconColor : this.focusedTrailingIconColor;
        companion.getClass();
        long j25 = unfocusedTrailingIconColor != androidx.compose.ui.graphics.d2.f17778o ? unfocusedTrailingIconColor : this.unfocusedTrailingIconColor;
        companion.getClass();
        long j26 = disabledTrailingIconColor != androidx.compose.ui.graphics.d2.f17778o ? disabledTrailingIconColor : this.disabledTrailingIconColor;
        companion.getClass();
        long j27 = errorTrailingIconColor != androidx.compose.ui.graphics.d2.f17778o ? errorTrailingIconColor : this.errorTrailingIconColor;
        companion.getClass();
        long j28 = focusedLabelColor != androidx.compose.ui.graphics.d2.f17778o ? focusedLabelColor : this.focusedLabelColor;
        companion.getClass();
        long j29 = unfocusedLabelColor != androidx.compose.ui.graphics.d2.f17778o ? unfocusedLabelColor : this.unfocusedLabelColor;
        companion.getClass();
        long j30 = disabledLabelColor != androidx.compose.ui.graphics.d2.f17778o ? disabledLabelColor : this.disabledLabelColor;
        companion.getClass();
        long j31 = errorLabelColor != androidx.compose.ui.graphics.d2.f17778o ? errorLabelColor : this.errorLabelColor;
        companion.getClass();
        long j32 = focusedPlaceholderColor != androidx.compose.ui.graphics.d2.f17778o ? focusedPlaceholderColor : this.focusedPlaceholderColor;
        companion.getClass();
        long j33 = unfocusedPlaceholderColor != androidx.compose.ui.graphics.d2.f17778o ? unfocusedPlaceholderColor : this.unfocusedPlaceholderColor;
        companion.getClass();
        long j34 = disabledPlaceholderColor != androidx.compose.ui.graphics.d2.f17778o ? disabledPlaceholderColor : this.disabledPlaceholderColor;
        companion.getClass();
        long j35 = errorPlaceholderColor != androidx.compose.ui.graphics.d2.f17778o ? errorPlaceholderColor : this.errorPlaceholderColor;
        companion.getClass();
        long j36 = focusedSupportingTextColor != androidx.compose.ui.graphics.d2.f17778o ? focusedSupportingTextColor : this.focusedSupportingTextColor;
        companion.getClass();
        long j37 = unfocusedSupportingTextColor != androidx.compose.ui.graphics.d2.f17778o ? unfocusedSupportingTextColor : this.unfocusedSupportingTextColor;
        companion.getClass();
        long j38 = disabledSupportingTextColor != androidx.compose.ui.graphics.d2.f17778o ? disabledSupportingTextColor : this.disabledSupportingTextColor;
        companion.getClass();
        long j39 = errorSupportingTextColor != androidx.compose.ui.graphics.d2.f17778o ? errorSupportingTextColor : this.errorSupportingTextColor;
        companion.getClass();
        long j40 = focusedPrefixColor != androidx.compose.ui.graphics.d2.f17778o ? focusedPrefixColor : this.focusedPrefixColor;
        companion.getClass();
        long j41 = unfocusedPrefixColor != androidx.compose.ui.graphics.d2.f17778o ? unfocusedPrefixColor : this.unfocusedPrefixColor;
        companion.getClass();
        long j42 = disabledPrefixColor != androidx.compose.ui.graphics.d2.f17778o ? disabledPrefixColor : this.disabledPrefixColor;
        companion.getClass();
        long j43 = errorPrefixColor != androidx.compose.ui.graphics.d2.f17778o ? errorPrefixColor : this.errorPrefixColor;
        companion.getClass();
        long j44 = focusedSuffixColor != androidx.compose.ui.graphics.d2.f17778o ? focusedSuffixColor : this.focusedSuffixColor;
        companion.getClass();
        long j45 = unfocusedSuffixColor != androidx.compose.ui.graphics.d2.f17778o ? unfocusedSuffixColor : this.unfocusedSuffixColor;
        companion.getClass();
        long j46 = disabledSuffixColor != androidx.compose.ui.graphics.d2.f17778o ? disabledSuffixColor : this.disabledSuffixColor;
        companion.getClass();
        return new pa(j4, j5, j6, j7, j10, j11, j12, j13, j14, j15, l02, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, errorSuffixColor != androidx.compose.ui.graphics.d2.f17778o ? errorSuffixColor : this.errorSuffixColor);
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> c0(boolean z4, boolean z5, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(925127045);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(925127045, i4, -1, "androidx.compose.material3.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:2027)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(!z4 ? this.disabledLeadingIconColor : z5 ? this.errorLeadingIconColor : b0(androidx.compose.foundation.interaction.e.a(iVar, tVar, (i4 >> 6) & 14)) ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> e(boolean z4, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-1885422187);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1885422187, i4, -1, "androidx.compose.material3.TextFieldColors.cursorColor (TextFieldDefaults.kt:2269)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(z4 ? this.errorCursorColor : this.cursorColor), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> e0(boolean z4, boolean z5, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(653850713);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(653850713, i4, -1, "androidx.compose.material3.TextFieldColors.placeholderColor (TextFieldDefaults.kt:2133)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(!z4 ? this.disabledPlaceholderColor : z5 ? this.errorPlaceholderColor : d0(androidx.compose.foundation.interaction.e.a(iVar, tVar, (i4 >> 6) & 14)) ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof pa)) {
            return false;
        }
        pa paVar = (pa) other;
        return androidx.compose.ui.graphics.d2.y(this.focusedTextColor, paVar.focusedTextColor) && kotlin.a2.o(this.unfocusedTextColor, paVar.unfocusedTextColor) && kotlin.a2.o(this.disabledTextColor, paVar.disabledTextColor) && kotlin.a2.o(this.errorTextColor, paVar.errorTextColor) && kotlin.a2.o(this.focusedContainerColor, paVar.focusedContainerColor) && kotlin.a2.o(this.unfocusedContainerColor, paVar.unfocusedContainerColor) && kotlin.a2.o(this.disabledContainerColor, paVar.disabledContainerColor) && kotlin.a2.o(this.errorContainerColor, paVar.errorContainerColor) && kotlin.a2.o(this.cursorColor, paVar.cursorColor) && kotlin.a2.o(this.errorCursorColor, paVar.errorCursorColor) && kotlin.jvm.internal.l0.g(this.textSelectionColors, paVar.textSelectionColors) && kotlin.a2.o(this.focusedIndicatorColor, paVar.focusedIndicatorColor) && kotlin.a2.o(this.unfocusedIndicatorColor, paVar.unfocusedIndicatorColor) && kotlin.a2.o(this.disabledIndicatorColor, paVar.disabledIndicatorColor) && kotlin.a2.o(this.errorIndicatorColor, paVar.errorIndicatorColor) && kotlin.a2.o(this.focusedLeadingIconColor, paVar.focusedLeadingIconColor) && kotlin.a2.o(this.unfocusedLeadingIconColor, paVar.unfocusedLeadingIconColor) && kotlin.a2.o(this.disabledLeadingIconColor, paVar.disabledLeadingIconColor) && kotlin.a2.o(this.errorLeadingIconColor, paVar.errorLeadingIconColor) && kotlin.a2.o(this.focusedTrailingIconColor, paVar.focusedTrailingIconColor) && kotlin.a2.o(this.unfocusedTrailingIconColor, paVar.unfocusedTrailingIconColor) && kotlin.a2.o(this.disabledTrailingIconColor, paVar.disabledTrailingIconColor) && kotlin.a2.o(this.errorTrailingIconColor, paVar.errorTrailingIconColor) && kotlin.a2.o(this.focusedLabelColor, paVar.focusedLabelColor) && kotlin.a2.o(this.unfocusedLabelColor, paVar.unfocusedLabelColor) && kotlin.a2.o(this.disabledLabelColor, paVar.disabledLabelColor) && kotlin.a2.o(this.errorLabelColor, paVar.errorLabelColor) && kotlin.a2.o(this.focusedPlaceholderColor, paVar.focusedPlaceholderColor) && kotlin.a2.o(this.unfocusedPlaceholderColor, paVar.unfocusedPlaceholderColor) && kotlin.a2.o(this.disabledPlaceholderColor, paVar.disabledPlaceholderColor) && kotlin.a2.o(this.errorPlaceholderColor, paVar.errorPlaceholderColor) && kotlin.a2.o(this.focusedSupportingTextColor, paVar.focusedSupportingTextColor) && kotlin.a2.o(this.unfocusedSupportingTextColor, paVar.unfocusedSupportingTextColor) && kotlin.a2.o(this.disabledSupportingTextColor, paVar.disabledSupportingTextColor) && kotlin.a2.o(this.errorSupportingTextColor, paVar.errorSupportingTextColor) && kotlin.a2.o(this.focusedPrefixColor, paVar.focusedPrefixColor) && kotlin.a2.o(this.unfocusedPrefixColor, paVar.unfocusedPrefixColor) && kotlin.a2.o(this.disabledPrefixColor, paVar.disabledPrefixColor) && kotlin.a2.o(this.errorPrefixColor, paVar.errorPrefixColor) && kotlin.a2.o(this.focusedSuffixColor, paVar.focusedSuffixColor) && kotlin.a2.o(this.unfocusedSuffixColor, paVar.unfocusedSuffixColor) && kotlin.a2.o(this.disabledSuffixColor, paVar.disabledSuffixColor) && kotlin.a2.o(this.errorSuffixColor, paVar.errorSuffixColor);
    }

    /* renamed from: f, reason: from getter */
    public final long getCursorColor() {
        return this.cursorColor;
    }

    /* renamed from: g, reason: from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> g0(boolean z4, boolean z5, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(129569364);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(129569364, i4, -1, "androidx.compose.material3.TextFieldColors.prefixColor (TextFieldDefaults.kt:2226)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(!z4 ? this.disabledPrefixColor : z5 ? this.errorPrefixColor : f0(androidx.compose.foundation.interaction.e.a(iVar, tVar, (i4 >> 6) & 14)) ? this.focusedPrefixColor : this.unfocusedPrefixColor), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    /* renamed from: h, reason: from getter */
    public final long getDisabledIndicatorColor() {
        return this.disabledIndicatorColor;
    }

    public int hashCode() {
        return kotlin.a2.u(this.errorSuffixColor) + m0.a(this.disabledSuffixColor, m0.a(this.unfocusedSuffixColor, m0.a(this.focusedSuffixColor, m0.a(this.errorPrefixColor, m0.a(this.disabledPrefixColor, m0.a(this.unfocusedPrefixColor, m0.a(this.focusedPrefixColor, m0.a(this.errorSupportingTextColor, m0.a(this.disabledSupportingTextColor, m0.a(this.unfocusedSupportingTextColor, m0.a(this.focusedSupportingTextColor, m0.a(this.errorPlaceholderColor, m0.a(this.disabledPlaceholderColor, m0.a(this.unfocusedPlaceholderColor, m0.a(this.focusedPlaceholderColor, m0.a(this.errorLabelColor, (kotlin.a2.u(this.disabledLabelColor) + m0.a(this.unfocusedLabelColor, m0.a(this.focusedLabelColor, m0.a(this.errorTrailingIconColor, m0.a(this.disabledTrailingIconColor, m0.a(this.unfocusedTrailingIconColor, m0.a(this.focusedTrailingIconColor, m0.a(this.errorLeadingIconColor, m0.a(this.disabledLeadingIconColor, m0.a(this.unfocusedLeadingIconColor, m0.a(this.focusedLeadingIconColor, m0.a(this.errorIndicatorColor, m0.a(this.disabledIndicatorColor, m0.a(this.unfocusedIndicatorColor, m0.a(this.focusedIndicatorColor, (this.textSelectionColors.hashCode() + m0.a(this.errorCursorColor, m0.a(this.cursorColor, m0.a(this.errorContainerColor, m0.a(this.disabledContainerColor, m0.a(this.unfocusedContainerColor, m0.a(this.focusedContainerColor, m0.a(this.errorTextColor, m0.a(this.disabledTextColor, m0.a(this.unfocusedTextColor, androidx.compose.ui.graphics.d2.K(this.focusedTextColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: i, reason: from getter */
    public final long getDisabledLabelColor() {
        return this.disabledLabelColor;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> i0(boolean z4, boolean z5, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1575329427);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1575329427, i4, -1, "androidx.compose.material3.TextFieldColors.suffixColor (TextFieldDefaults.kt:2251)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(!z4 ? this.disabledSuffixColor : z5 ? this.errorSuffixColor : h0(androidx.compose.foundation.interaction.e.a(iVar, tVar, (i4 >> 6) & 14)) ? this.focusedSuffixColor : this.unfocusedSuffixColor), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    /* renamed from: j, reason: from getter */
    public final long getDisabledLeadingIconColor() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: k, reason: from getter */
    public final long getDisabledPlaceholderColor() {
        return this.disabledPlaceholderColor;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> k0(boolean z4, boolean z5, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1464709698);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1464709698, i4, -1, "androidx.compose.material3.TextFieldColors.supportingTextColor (TextFieldDefaults.kt:2200)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(!z4 ? this.disabledSupportingTextColor : z5 ? this.errorSupportingTextColor : j0(androidx.compose.foundation.interaction.e.a(iVar, tVar, (i4 >> 6) & 14)) ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    /* renamed from: l, reason: from getter */
    public final long getDisabledPrefixColor() {
        return this.disabledPrefixColor;
    }

    @fg.l
    public final androidx.compose.foundation.text.selection.x0 l0(@fg.m androidx.compose.foundation.text.selection.x0 x0Var, @fg.l ld.a<androidx.compose.foundation.text.selection.x0> aVar) {
        return x0Var == null ? aVar.invoke() : x0Var;
    }

    /* renamed from: m, reason: from getter */
    public final long getDisabledSuffixColor() {
        return this.disabledSuffixColor;
    }

    /* renamed from: n, reason: from getter */
    public final long getDisabledSupportingTextColor() {
        return this.disabledSupportingTextColor;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> n0(boolean z4, boolean z5, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(68412911);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(68412911, i4, -1, "androidx.compose.material3.TextFieldColors.textColor (TextFieldDefaults.kt:2183)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(!z4 ? this.disabledTextColor : z5 ? this.errorTextColor : m0(androidx.compose.foundation.interaction.e.a(iVar, tVar, (i4 >> 6) & 14)) ? this.focusedTextColor : this.unfocusedTextColor), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    /* renamed from: o, reason: from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    /* renamed from: p, reason: from getter */
    public final long getDisabledTrailingIconColor() {
        return this.disabledTrailingIconColor;
    }

    @fg.l
    @androidx.compose.runtime.i
    public final androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> p0(boolean z4, boolean z5, @fg.l androidx.compose.foundation.interaction.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(-109504137);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-109504137, i4, -1, "androidx.compose.material3.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:2053)");
        }
        androidx.compose.runtime.b5<androidx.compose.ui.graphics.d2> u4 = androidx.compose.runtime.o4.u(androidx.compose.ui.graphics.d2.n(!z4 ? this.disabledTrailingIconColor : z5 ? this.errorTrailingIconColor : o0(androidx.compose.foundation.interaction.e.a(iVar, tVar, (i4 >> 6) & 14)) ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor), tVar, 0);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return u4;
    }

    /* renamed from: q, reason: from getter */
    public final long getErrorContainerColor() {
        return this.errorContainerColor;
    }

    /* renamed from: r, reason: from getter */
    public final long getErrorCursorColor() {
        return this.errorCursorColor;
    }

    /* renamed from: s, reason: from getter */
    public final long getErrorIndicatorColor() {
        return this.errorIndicatorColor;
    }

    /* renamed from: t, reason: from getter */
    public final long getErrorLabelColor() {
        return this.errorLabelColor;
    }

    /* renamed from: u, reason: from getter */
    public final long getErrorLeadingIconColor() {
        return this.errorLeadingIconColor;
    }

    /* renamed from: v, reason: from getter */
    public final long getErrorPlaceholderColor() {
        return this.errorPlaceholderColor;
    }

    /* renamed from: w, reason: from getter */
    public final long getErrorPrefixColor() {
        return this.errorPrefixColor;
    }

    /* renamed from: x, reason: from getter */
    public final long getErrorSuffixColor() {
        return this.errorSuffixColor;
    }

    /* renamed from: y, reason: from getter */
    public final long getErrorSupportingTextColor() {
        return this.errorSupportingTextColor;
    }

    /* renamed from: z, reason: from getter */
    public final long getErrorTextColor() {
        return this.errorTextColor;
    }

    private pa(long j4, long j5, long j6, long j7, long j10, long j11, long j12, long j13, long j14, long j15, androidx.compose.foundation.text.selection.x0 x0Var, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47) {
        this.focusedTextColor = j4;
        this.unfocusedTextColor = j5;
        this.disabledTextColor = j6;
        this.errorTextColor = j7;
        this.focusedContainerColor = j10;
        this.unfocusedContainerColor = j11;
        this.disabledContainerColor = j12;
        this.errorContainerColor = j13;
        this.cursorColor = j14;
        this.errorCursorColor = j15;
        this.textSelectionColors = x0Var;
        this.focusedIndicatorColor = j16;
        this.unfocusedIndicatorColor = j17;
        this.disabledIndicatorColor = j18;
        this.errorIndicatorColor = j19;
        this.focusedLeadingIconColor = j20;
        this.unfocusedLeadingIconColor = j21;
        this.disabledLeadingIconColor = j22;
        this.errorLeadingIconColor = j23;
        this.focusedTrailingIconColor = j24;
        this.unfocusedTrailingIconColor = j25;
        this.disabledTrailingIconColor = j26;
        this.errorTrailingIconColor = j27;
        this.focusedLabelColor = j28;
        this.unfocusedLabelColor = j29;
        this.disabledLabelColor = j30;
        this.errorLabelColor = j31;
        this.focusedPlaceholderColor = j32;
        this.unfocusedPlaceholderColor = j33;
        this.disabledPlaceholderColor = j34;
        this.errorPlaceholderColor = j35;
        this.focusedSupportingTextColor = j36;
        this.unfocusedSupportingTextColor = j37;
        this.disabledSupportingTextColor = j38;
        this.errorSupportingTextColor = j39;
        this.focusedPrefixColor = j40;
        this.unfocusedPrefixColor = j41;
        this.disabledPrefixColor = j42;
        this.errorPrefixColor = j43;
        this.focusedSuffixColor = j44;
        this.unfocusedSuffixColor = j45;
        this.disabledSuffixColor = j46;
        this.errorSuffixColor = j47;
    }
}
