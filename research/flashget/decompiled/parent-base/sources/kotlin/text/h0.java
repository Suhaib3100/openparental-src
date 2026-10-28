package kotlin.text;

import androidx.collection.q2;
import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.collections.u0;
import kotlin.jvm.internal.r1;
import kotlin.o2;
import kotlin.q0;
import kotlin.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u001e\u001a+\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006\u001a+\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a+\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006\u001a+\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\t\u001a\u001d\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u001d\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0011\u001a\u001d\u0010\u0017\u001a\u00020\u0007*\u00020\u00072\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0013\u001a\u0011\u0010\u0018\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0007*\u00020\u0007H\u0087\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u0019\u001a\u0014\u0010\u001d\u001a\u00020\u0007*\u00020\u0007H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u0019\u001a\u0014\u0010\u001f\u001a\u00020\u0007*\u00020\u0007H\u0087\b¢\u0006\u0004\b\u001f\u0010\u001b\u001a#\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u0007*\u00020\u00072\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&\u001a#\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b'\u0010$\u001a#\u0010(\u001a\u00020\u0007*\u00020\u00072\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b(\u0010&\u001a'\u0010)\u001a\u00020\u0003*\u0004\u0018\u00010\u0000H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b)\u0010*\u001a\u0014\u0010+\u001a\u00020\u0003*\u00020\u0000H\u0087\b¢\u0006\u0004\b+\u0010*\u001a\u0014\u0010,\u001a\u00020\u0003*\u00020\u0000H\u0087\b¢\u0006\u0004\b,\u0010*\u001a\u0014\u0010-\u001a\u00020\u0003*\u00020\u0000H\u0087\b¢\u0006\u0004\b-\u0010*\u001a'\u0010.\u001a\u00020\u0003*\u0004\u0018\u00010\u0000H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b.\u0010*\u001a\u0014\u00100\u001a\u00020/*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b0\u00101\u001a\u0016\u00102\u001a\u00020\u0007*\u0004\u0018\u00010\u0007H\u0087\b¢\u0006\u0004\b2\u0010\u001b\u001a9\u00107\u001a\u00028\u0001\"\f\b\u0000\u00103*\u00020\u0000*\u00028\u0001\"\u0004\b\u0001\u00104*\u00028\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000105H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a9\u00109\u001a\u00028\u0001\"\f\b\u0000\u00103*\u00020\u0000*\u00028\u0001\"\u0004\b\u0001\u00104*\u00028\u00002\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000105H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u00108\u001a\u0019\u0010;\u001a\u00020\u0003*\u00020\u00002\u0006\u0010:\u001a\u00020 ¢\u0006\u0004\b;\u0010<\u001a\u0019\u0010?\u001a\u00020\u0007*\u00020\u00072\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@\u001a\u0019\u0010A\u001a\u00020\u0000*\u00020\u00002\u0006\u0010>\u001a\u00020=¢\u0006\u0004\bA\u0010B\u001a$\u0010E\u001a\u00020\u0000*\u00020\u00072\u0006\u0010C\u001a\u00020 2\u0006\u0010D\u001a\u00020 H\u0087\b¢\u0006\u0004\bE\u0010F\u001a&\u0010I\u001a\u00020\u0007*\u00020\u00002\u0006\u0010G\u001a\u00020 2\b\b\u0002\u0010H\u001a\u00020 H\u0087\b¢\u0006\u0004\bI\u0010J\u001a\u0019\u0010K\u001a\u00020\u0007*\u00020\u00002\u0006\u0010>\u001a\u00020=¢\u0006\u0004\bK\u0010L\u001a#\u0010O\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00022\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\bO\u0010P\u001a#\u0010Q\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\bQ\u0010R\u001a#\u0010S\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00022\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\bS\u0010P\u001a#\u0010T\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\bT\u0010R\u001a#\u0010U\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00022\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\bU\u0010P\u001a#\u0010V\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\bV\u0010R\u001a#\u0010W\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00022\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\bW\u0010P\u001a#\u0010X\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\bX\u0010R\u001a)\u0010Z\u001a\u00020\u0000*\u00020\u00002\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 2\u0006\u0010Y\u001a\u00020\u0000¢\u0006\u0004\bZ\u0010[\u001a,\u0010\\\u001a\u00020\u0007*\u00020\u00072\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 2\u0006\u0010Y\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\\\u0010]\u001a!\u0010^\u001a\u00020\u0000*\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010Y\u001a\u00020\u0000¢\u0006\u0004\b^\u0010_\u001a$\u0010`\u001a\u00020\u0007*\u00020\u00072\u0006\u0010>\u001a\u00020=2\u0006\u0010Y\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b`\u0010a\u001a!\u0010b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 ¢\u0006\u0004\bb\u0010c\u001a$\u0010d\u001a\u00020\u0007*\u00020\u00072\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 H\u0087\b¢\u0006\u0004\bd\u0010e\u001a\u0019\u0010f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010>\u001a\u00020=¢\u0006\u0004\bf\u0010B\u001a\u001c\u0010g\u001a\u00020\u0007*\u00020\u00072\u0006\u0010>\u001a\u00020=H\u0087\b¢\u0006\u0004\bg\u0010@\u001a\u0019\u0010i\u001a\u00020\u0000*\u00020\u00002\u0006\u0010h\u001a\u00020\u0000¢\u0006\u0004\bi\u0010j\u001a\u0019\u0010k\u001a\u00020\u0007*\u00020\u00072\u0006\u0010h\u001a\u00020\u0000¢\u0006\u0004\bk\u0010l\u001a\u0019\u0010n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010m\u001a\u00020\u0000¢\u0006\u0004\bn\u0010j\u001a\u0019\u0010o\u001a\u00020\u0007*\u00020\u00072\u0006\u0010m\u001a\u00020\u0000¢\u0006\u0004\bo\u0010l\u001a!\u0010p\u001a\u00020\u0000*\u00020\u00002\u0006\u0010h\u001a\u00020\u00002\u0006\u0010m\u001a\u00020\u0000¢\u0006\u0004\bp\u0010q\u001a!\u0010r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010h\u001a\u00020\u00002\u0006\u0010m\u001a\u00020\u0000¢\u0006\u0004\br\u0010s\u001a\u0019\u0010t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010M\u001a\u00020\u0000¢\u0006\u0004\bt\u0010j\u001a\u0019\u0010u\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u0000¢\u0006\u0004\bu\u0010l\u001a+\u0010v\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\bv\u0010w\u001a+\u0010x\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\bx\u0010y\u001a+\u0010z\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\bz\u0010w\u001a+\u0010{\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\b{\u0010y\u001a+\u0010|\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\b|\u0010y\u001a+\u0010}\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\b}\u0010w\u001a+\u0010~\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\b~\u0010w\u001a+\u0010\u007f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u00072\b\b\u0002\u0010N\u001a\u00020\u0007¢\u0006\u0004\b\u007f\u0010y\u001a)\u0010\u0082\u0001\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0006\u0010Y\u001a\u00020\u0007H\u0087\b¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a<\u0010\u0086\u0001\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0016\b\b\u0010\u0085\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0084\u0001\u0012\u0004\u0012\u00020\u00000\u0001H\u0087\bø\u0001\u0000¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a)\u0010\u0088\u0001\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0006\u0010Y\u001a\u00020\u0007H\u0087\b¢\u0006\u0006\b\u0088\u0001\u0010\u0083\u0001\u001a.\u0010\u0089\u0001\u001a\u00020\u0007*\u00020\u00072\u0013\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0005\b\u0089\u0001\u0010\t\u001a.\u0010\u008a\u0001\u001a\u00020\u0007*\u00020\u00072\u0013\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001H\u0087\bø\u0001\u0000¢\u0006\u0005\b\u008a\u0001\u0010\t\u001a!\u0010\u008b\u0001\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0087\f¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001aB\u0010\u0091\u0001\u001a\u00020\u0003*\u00020\u00002\u0007\u0010\u008d\u0001\u001a\u00020 2\u0007\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0007\u0010\u0090\u0001\u001a\u00020\u0003H\u0000¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a(\u0010\u0094\u0001\u001a\u00020\u0003*\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u00022\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a(\u0010\u0096\u0001\u001a\u00020\u0003*\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u00022\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0096\u0001\u0010\u0095\u0001\u001a'\u0010\u0097\u0001\u001a\u00020\u0003*\u00020\u00002\u0006\u0010h\u001a\u00020\u00002\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a/\u0010\u0099\u0001\u001a\u00020\u0003*\u00020\u00002\u0006\u0010h\u001a\u00020\u00002\u0006\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a'\u0010\u009b\u0001\u001a\u00020\u0003*\u00020\u00002\u0006\u0010m\u001a\u00020\u00002\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u009b\u0001\u0010\u0098\u0001\u001a(\u0010\u009c\u0001\u001a\u00020\u0007*\u00020\u00002\u0007\u0010\u008e\u0001\u001a\u00020\u00002\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a(\u0010\u009e\u0001\u001a\u00020\u0007*\u00020\u00002\u0007\u0010\u008e\u0001\u001a\u00020\u00002\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u009e\u0001\u0010\u009d\u0001\u001a1\u0010\u009f\u0001\u001a\u00020 *\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u009f\u0001\u0010 \u0001\u001a1\u0010¡\u0001\u001a\u00020 *\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b¡\u0001\u0010 \u0001\u001aC\u0010£\u0001\u001a\u00020 *\u00020\u00002\u0007\u0010\u008e\u0001\u001a\u00020\u00002\u0006\u0010G\u001a\u00020 2\u0006\u0010H\u001a\u00020 2\u0007\u0010\u0090\u0001\u001a\u00020\u00032\t\b\u0002\u0010¢\u0001\u001a\u00020\u0003H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001\u001aO\u0010¨\u0001\u001a\u0011\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0007\u0018\u00010§\u0001*\u00020\u00002\u000e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¥\u00012\u0006\u0010G\u001a\u00020 2\u0007\u0010\u0090\u0001\u001a\u00020\u00032\u0007\u0010¢\u0001\u001a\u00020\u0003H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001\u001aH\u0010ª\u0001\u001a\u0011\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0007\u0018\u00010§\u0001*\u00020\u00002\u000e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¥\u00012\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\bª\u0001\u0010«\u0001\u001aH\u0010¬\u0001\u001a\u0011\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0007\u0018\u00010§\u0001*\u00020\u00002\u000e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¥\u00012\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b¬\u0001\u0010«\u0001\u001a9\u0010\u00ad\u0001\u001a\u00020 *\u00020\u00002\u000e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¥\u00012\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001\u001a9\u0010¯\u0001\u001a\u00020 *\u00020\u00002\u000e\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¥\u00012\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b¯\u0001\u0010®\u0001\u001a2\u0010°\u0001\u001a\u00020 *\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u00022\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b°\u0001\u0010±\u0001\u001a2\u0010³\u0001\u001a\u00020 *\u00020\u00002\u0007\u0010²\u0001\u001a\u00020\u00072\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b³\u0001\u0010´\u0001\u001a2\u0010µ\u0001\u001a\u00020 *\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u00022\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\bµ\u0001\u0010±\u0001\u001a2\u0010¶\u0001\u001a\u00020 *\u00020\u00002\u0007\u0010²\u0001\u001a\u00020\u00072\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003¢\u0006\u0006\b¶\u0001\u0010´\u0001\u001a+\u0010·\u0001\u001a\u00020\u0003*\u00020\u00002\u0007\u0010\u008e\u0001\u001a\u00020\u00002\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0006\b·\u0001\u0010\u0098\u0001\u001a+\u0010¸\u0001\u001a\u00020\u0003*\u00020\u00002\u0007\u0010\u0093\u0001\u001a\u00020\u00022\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0006\b¸\u0001\u0010\u0095\u0001\u001a!\u0010¹\u0001\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0087\n¢\u0006\u0006\b¹\u0001\u0010\u008c\u0001\u001aF\u0010½\u0001\u001a\t\u0012\u0004\u0012\u00020=0¼\u0001*\u00020\u00002\u0007\u0010º\u0001\u001a\u00020\u000e2\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u00032\t\b\u0002\u0010»\u0001\u001a\u00020 H\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001\u001aO\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020=0¼\u0001*\u00020\u00002\u0010\u0010º\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u00070¿\u00012\b\b\u0002\u0010G\u001a\u00020 2\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u00032\t\b\u0002\u0010»\u0001\u001a\u00020 H\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001\u001a\u001c\u0010Ã\u0001\u001a\u00030Â\u00012\u0007\u0010»\u0001\u001a\u00020 H\u0000¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001\u001aG\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¼\u0001*\u00020\u00002\u0014\u0010º\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u00070¿\u0001\"\u00020\u00072\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u00032\t\b\u0002\u0010»\u0001\u001a\u00020 ¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001\u001aG\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070Ç\u0001*\u00020\u00002\u0014\u0010º\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u00070¿\u0001\"\u00020\u00072\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u00032\t\b\u0002\u0010»\u0001\u001a\u00020 ¢\u0006\u0006\bÈ\u0001\u0010É\u0001\u001a>\u0010Ê\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¼\u0001*\u00020\u00002\u000b\u0010º\u0001\u001a\u00020\u000e\"\u00020\u00022\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u00032\t\b\u0002\u0010»\u0001\u001a\u00020 ¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001\u001a>\u0010Ì\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070Ç\u0001*\u00020\u00002\u000b\u0010º\u0001\u001a\u00020\u000e\"\u00020\u00022\t\b\u0002\u0010\u0090\u0001\u001a\u00020\u00032\t\b\u0002\u0010»\u0001\u001a\u00020 ¢\u0006\u0006\bÌ\u0001\u0010Í\u0001\u001a7\u0010Î\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070Ç\u0001*\u00020\u00002\u0006\u0010M\u001a\u00020\u00072\u0007\u0010\u0090\u0001\u001a\u00020\u00032\u0007\u0010»\u0001\u001a\u00020 H\u0002¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001\u001a3\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070Ç\u0001*\u00020\u00002\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\t\b\u0002\u0010»\u0001\u001a\u00020 H\u0087\b¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001\u001a3\u0010Ò\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¼\u0001*\u00020\u00002\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\t\b\u0002\u0010»\u0001\u001a\u00020 H\u0087\b¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u001b\u0010Ô\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¼\u0001*\u00020\u0000¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u001b\u0010Ö\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070Ç\u0001*\u00020\u0000¢\u0006\u0006\bÖ\u0001\u0010×\u0001\u001a#\u0010Ø\u0001\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0006\bØ\u0001\u0010Ù\u0001\u001a#\u0010Ú\u0001\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0006\bÚ\u0001\u0010Ù\u0001\u001a\u0016\u0010Û\u0001\u001a\u00020\u0003*\u00020\u0007H\u0007¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0018\u0010Ý\u0001\u001a\u0004\u0018\u00010\u0003*\u00020\u0007H\u0007¢\u0006\u0006\bÝ\u0001\u0010Þ\u0001\"\u0018\u0010á\u0001\u001a\u00020=*\u00020\u00008F¢\u0006\b\u001a\u0006\bß\u0001\u0010à\u0001\"\u0018\u0010ä\u0001\u001a\u00020 *\u00020\u00008F¢\u0006\b\u001a\u0006\bâ\u0001\u0010ã\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006å\u0001"}, d2 = {"", "Lkotlin/Function1;", "", "", "predicate", "D5", "(Ljava/lang/CharSequence;Lld/l;)Ljava/lang/CharSequence;", "", "G5", "(Ljava/lang/String;Lld/l;)Ljava/lang/String;", "P5", "S5", "J5", "M5", "", "chars", "E5", "(Ljava/lang/CharSequence;[C)Ljava/lang/CharSequence;", "H5", "(Ljava/lang/String;[C)Ljava/lang/String;", "Q5", "T5", "K5", "N5", "C5", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "F5", "(Ljava/lang/String;)Ljava/lang/String;", "O5", "R5", "I5", "L5", "", "length", "padChar", "Q3", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "R3", "(Ljava/lang/String;IC)Ljava/lang/String;", "M3", "N3", "y3", "(Ljava/lang/CharSequence;)Z", "u3", "w3", "v3", "x3", "Lkotlin/collections/v;", "z3", "(Ljava/lang/CharSequence;)Lkotlin/collections/v;", "L3", "C", "R", "Lkotlin/Function0;", "defaultValue", "j3", "(Ljava/lang/CharSequence;Lld/a;)Ljava/lang/Object;", "i3", "index", "h3", "(Ljava/lang/CharSequence;I)Z", "Lkotlin/ranges/l;", "range", "i5", "(Ljava/lang/String;Lkotlin/ranges/l;)Ljava/lang/String;", "e5", "(Ljava/lang/CharSequence;Lkotlin/ranges/l;)Ljava/lang/CharSequence;", "start", "end", "f5", "(Ljava/lang/String;II)Ljava/lang/CharSequence;", "startIndex", "endIndex", "g5", "(Ljava/lang/CharSequence;II)Ljava/lang/String;", "h5", "(Ljava/lang/CharSequence;Lkotlin/ranges/l;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "s5", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "t5", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "k5", "l5", "w5", "x5", "o5", "p5", "replacement", "G4", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "I4", "(Ljava/lang/String;IILjava/lang/CharSequence;)Ljava/lang/String;", "H4", "(Ljava/lang/CharSequence;Lkotlin/ranges/l;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "J4", "(Ljava/lang/String;Lkotlin/ranges/l;Ljava/lang/CharSequence;)Ljava/lang/String;", "b4", "(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;", "d4", "(Ljava/lang/String;II)Ljava/lang/String;", "c4", "e4", "prefix", "Z3", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "a4", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "f4", "g4", "i4", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "k4", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "h4", "j4", "v4", "(Ljava/lang/String;CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "w4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "n4", "o4", "s4", "r4", "z4", "A4", "Lkotlin/text/r;", "regex", "l4", "(Ljava/lang/CharSequence;Lkotlin/text/r;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/text/p;", "transform", "m4", "(Ljava/lang/CharSequence;Lkotlin/text/r;Lld/l;)Ljava/lang/String;", "D4", "E4", "F4", "K3", "(Ljava/lang/CharSequence;Lkotlin/text/r;)Z", "thisOffset", "other", "otherOffset", "ignoreCase", "Y3", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "Y4", "(Ljava/lang/CharSequence;CZ)Z", "W2", "a5", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "Z4", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZ)Z", "X2", "L2", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Ljava/lang/String;", "N2", "r3", "(Ljava/lang/CharSequence;[CIZ)I", "F3", "last", "m3", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/q0;", "b3", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/q0;", "a3", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZ)Lkotlin/q0;", "d3", "q3", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZ)I", "E3", "k3", "(Ljava/lang/CharSequence;CIZ)I", "string", "l3", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "A3", "B3", "Q2", "P2", "R2", "delimiters", "limit", "Lkotlin/sequences/m;", "U3", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/m;", "", "V3", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/m;", "Lkotlin/k2;", "K4", "(I)V", "U4", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/m;", "", "N4", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "T4", "(Ljava/lang/CharSequence;[CZI)Lkotlin/sequences/m;", "M4", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "O4", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "L4", "(Ljava/lang/CharSequence;Lkotlin/text/r;I)Ljava/util/List;", "S4", "(Ljava/lang/CharSequence;Lkotlin/text/r;I)Lkotlin/sequences/m;", "I3", "(Ljava/lang/CharSequence;)Lkotlin/sequences/m;", "J3", "(Ljava/lang/CharSequence;)Ljava/util/List;", "U2", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "V2", "A5", "(Ljava/lang/String;)Z", "B5", "(Ljava/lang/String;)Ljava/lang/Boolean;", "f3", "(Ljava/lang/CharSequence;)Lkotlin/ranges/l;", "indices", "g3", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n79#1,22:1487\n113#1,5:1509\n130#1,5:1514\n79#1,22:1519\n107#1:1541\n79#1,22:1542\n113#1,5:1564\n124#1:1569\n113#1,5:1570\n130#1,5:1575\n141#1:1580\n130#1,5:1581\n79#1,22:1586\n113#1,5:1608\n130#1,5:1613\n12554#2,2:1618\n12554#2,2:1620\n288#3,2:1622\n288#3,2:1624\n1549#3:1627\n1620#3,3:1628\n1549#3:1631\n1620#3,3:1632\n1#4:1626\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n107#1:1487,22\n124#1:1509,5\n141#1:1514,5\n146#1:1519,22\n151#1:1541\n151#1:1542,22\n156#1:1564,5\n161#1:1569\n161#1:1570,5\n166#1:1575,5\n171#1:1580\n171#1:1581,5\n176#1:1586,22\n187#1:1608,5\n198#1:1613,5\n940#1:1618,2\n964#1:1620,2\n1003#1:1622,2\n1009#1:1624,2\n1309#1:1627\n1309#1:1628,3\n1334#1:1631\n1334#1:1632,3\n*E\n"})
/* loaded from: classes7.dex */
public class h0 extends e0 {

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"kotlin/text/h0$a", "Lkotlin/collections/v;", "", "c", "()C", "", "hasNext", "()Z", "", "b", "I", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.collections.v {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f79082c;

        a(CharSequence charSequence) {
            this.f79082c = charSequence;
        }

        @Override // kotlin.collections.v
        public char c() {
            CharSequence charSequence = this.f79082c;
            int i4 = this.index;
            this.index = i4 + 1;
            return charSequence.charAt(i4);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f79082c.length();
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "currentIndex", "Lkotlin/q0;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/q0;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<CharSequence, Integer, q0<? extends Integer, ? extends Integer>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ char[] f79083b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f79084c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(char[] cArr, boolean z4) {
            super(2);
            this.f79083b = cArr;
            this.f79084c = z4;
        }

        @fg.m
        public final q0<Integer, Integer> a(@fg.l CharSequence charSequence, int i4) {
            kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萧\u0001"));
            int r32 = h0.r3(charSequence, this.f79083b, i4, this.f79084c);
            if (r32 < 0) {
                return null;
            }
            return new q0<>(Integer.valueOf(r32), 1);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ q0<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "currentIndex", "Lkotlin/q0;", "a", "(Ljava/lang/CharSequence;I)Lkotlin/q0;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<CharSequence, Integer, q0<? extends Integer, ? extends Integer>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f79085b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f79086c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<String> list, boolean z4) {
            super(2);
            this.f79085b = list;
            this.f79086c = z4;
        }

        @fg.m
        public final q0<Integer, Integer> a(@fg.l CharSequence charSequence, int i4) {
            kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萨\u0001"));
            q0 b32 = h0.b3(charSequence, this.f79085b, i4, this.f79086c, false);
            if (b32 != null) {
                return new q0<>(b32.e(), Integer.valueOf(((String) b32.f()).length()));
            }
            return null;
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ q0<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/ranges/l;", "it", "", "a", "(Lkotlin/ranges/l;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<kotlin.ranges.l, String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f79087b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence) {
            super(1);
            this.f79087b = charSequence;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.l kotlin.ranges.l lVar) {
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("萩\u0001"));
            return h0.h5(this.f79087b, lVar);
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/ranges/l;", "it", "", "a", "(Lkotlin/ranges/l;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<kotlin.ranges.l, String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f79088b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence) {
            super(1);
            this.f79088b = charSequence;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.l kotlin.ranges.l lVar) {
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("萪\u0001"));
            return h0.h5(this.f79088b, lVar);
        }
    }

    public static final int A3(@fg.l CharSequence charSequence, char c5, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return (z4 || !(charSequence instanceof String)) ? F3(charSequence, new char[]{c5}, i4, z4) : ((String) charSequence).lastIndexOf(c5, i4);
    }

    @fg.l
    public static final String A4(@fg.l String str, @fg.l String str2, @fg.l String str3, @fg.l String str4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萬\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萭\u0001"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("萮\u0001"));
        int D3 = D3(str, str2, 0, false, 6, null);
        return D3 == -1 ? str4 : G4(str, 0, D3, str3).toString();
    }

    @c1(version = "1.5")
    public static final boolean A5(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        if (kotlin.jvm.internal.l0.g(str, ProtectedSandApp.s("萯\u0001"))) {
            return true;
        }
        if (kotlin.jvm.internal.l0.g(str, ProtectedSandApp.s("萰\u0001"))) {
            return false;
        }
        throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("萱\u0001"), str));
    }

    public static final int B3(@fg.l CharSequence charSequence, @fg.l String str, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萲\u0001"));
        return (z4 || !(charSequence instanceof String)) ? m3(charSequence, str, i4, 0, z4, true) : ((String) charSequence).lastIndexOf(str, i4);
    }

    public static /* synthetic */ String B4(String str, char c5, String str2, String str3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str3 = str;
        }
        return z4(str, c5, str2, str3);
    }

    @fg.m
    @c1(version = "1.5")
    public static final Boolean B5(@fg.l String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        if (kotlin.jvm.internal.l0.g(str, ProtectedSandApp.s("萯\u0001"))) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.l0.g(str, ProtectedSandApp.s("萰\u0001"))) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int C3(CharSequence charSequence, char c5, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = g3(charSequence);
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return A3(charSequence, c5, i4, z4);
    }

    public static /* synthetic */ String C4(String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str4 = str;
        }
        return A4(str, str2, str3, str4);
    }

    @fg.l
    public static CharSequence C5(@fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        int length = charSequence.length() - 1;
        int i4 = 0;
        boolean z4 = false;
        while (i4 <= length) {
            boolean r4 = kotlin.text.d.r(charSequence.charAt(!z4 ? i4 : length));
            if (z4) {
                if (!r4) {
                    break;
                }
                length--;
            } else if (r4) {
                i4++;
            } else {
                z4 = true;
            }
        }
        return charSequence.subSequence(i4, length + 1);
    }

    public static /* synthetic */ int D3(CharSequence charSequence, String str, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = g3(charSequence);
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return B3(charSequence, str, i4, z4);
    }

    @kotlin.internal.f
    private static final String D4(CharSequence charSequence, r rVar, String str) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("萳\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萭\u0001"));
        return rVar.o(charSequence, str);
    }

    @fg.l
    public static final CharSequence D5(@fg.l CharSequence charSequence, @fg.l ld.l<? super Character, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("萴\u0001"));
        int length = charSequence.length() - 1;
        int i4 = 0;
        boolean z4 = false;
        while (i4 <= length) {
            boolean booleanValue = ((Boolean) g0.a(charSequence, !z4 ? i4 : length, lVar)).booleanValue();
            if (z4) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i4++;
            } else {
                z4 = true;
            }
        }
        return charSequence.subSequence(i4, length + 1);
    }

    public static final int E3(@fg.l CharSequence charSequence, @fg.l Collection<String> collection, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("萵\u0001"));
        q0<Integer, String> b32 = b3(charSequence, collection, i4, z4, true);
        if (b32 != null) {
            return b32.e().intValue();
        }
        return -1;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    @kd.i(name = "replaceFirstCharWithChar")
    @kotlin.internal.f
    @kotlin.p0
    private static final String E4(String str, ld.l<? super Character, Character> lVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("萶\u0001"));
        if (str.length() <= 0) {
            return str;
        }
        char charValue = lVar.invoke(Character.valueOf(str.charAt(0))).charValue();
        String substring = str.substring(1);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return charValue + substring;
    }

    @fg.l
    public static final CharSequence E5(@fg.l CharSequence charSequence, @fg.l char... cArr) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("萸\u0001"));
        int length = charSequence.length() - 1;
        int i4 = 0;
        boolean z4 = false;
        while (i4 <= length) {
            boolean n82 = kotlin.collections.l.n8(cArr, charSequence.charAt(!z4 ? i4 : length));
            if (z4) {
                if (!n82) {
                    break;
                }
                length--;
            } else if (n82) {
                i4++;
            } else {
                z4 = true;
            }
        }
        return charSequence.subSequence(i4, length + 1);
    }

    public static final int F3(@fg.l CharSequence charSequence, @fg.l char[] cArr, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("萸\u0001"));
        if (!z4 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.l.Ws(cArr), i4);
        }
        int g32 = g3(charSequence);
        if (i4 > g32) {
            i4 = g32;
        }
        while (-1 < i4) {
            char charAt = charSequence.charAt(i4);
            for (char c5 : cArr) {
                if (kotlin.text.e.J(c5, charAt, z4)) {
                    return i4;
                }
            }
            i4--;
        }
        return -1;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.5")
    @kd.i(name = "replaceFirstCharWithCharSequence")
    @kotlin.internal.f
    @kotlin.p0
    private static final String F4(String str, ld.l<? super Character, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("萶\u0001"));
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) lVar.invoke(Character.valueOf(str.charAt(0))));
        String substring = str.substring(1);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        sb.append(substring);
        return sb.toString();
    }

    @kotlin.internal.f
    private static final String F5(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        return C5(str).toString();
    }

    public static /* synthetic */ int G3(CharSequence charSequence, Collection collection, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = g3(charSequence);
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return E3(charSequence, collection, i4, z4);
    }

    @fg.l
    public static CharSequence G4(@fg.l CharSequence charSequence, int i4, int i5, @fg.l CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("萭\u0001"));
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(q2.a(ProtectedSandApp.s("萺\u0001"), i5, ProtectedSandApp.s("萻\u0001"), i4, ProtectedSandApp.s("萼\u0001")));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i4);
        String s4 = ProtectedSandApp.s("萹\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append(charSequence2);
        sb.append(charSequence, i5, charSequence.length());
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @fg.l
    public static final String G5(@fg.l String str, @fg.l ld.l<? super Character, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("萴\u0001"));
        int length = str.length() - 1;
        int i4 = 0;
        boolean z4 = false;
        while (i4 <= length) {
            boolean booleanValue = lVar.invoke(Character.valueOf(str.charAt(!z4 ? i4 : length))).booleanValue();
            if (z4) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i4++;
            } else {
                z4 = true;
            }
        }
        return str.subSequence(i4, length + 1).toString();
    }

    public static /* synthetic */ int H3(CharSequence charSequence, char[] cArr, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = g3(charSequence);
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return F3(charSequence, cArr, i4, z4);
    }

    @fg.l
    public static CharSequence H4(@fg.l CharSequence charSequence, @fg.l kotlin.ranges.l lVar, @fg.l CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("落\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("萭\u0001"));
        return G4(charSequence, lVar.c().intValue(), kotlin.collections.p.a(lVar, 1), charSequence2);
    }

    @fg.l
    public static final String H5(@fg.l String str, @fg.l char... cArr) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("萸\u0001"));
        int length = str.length() - 1;
        int i4 = 0;
        boolean z4 = false;
        while (i4 <= length) {
            boolean n82 = kotlin.collections.l.n8(cArr, str.charAt(!z4 ? i4 : length));
            if (z4) {
                if (!n82) {
                    break;
                }
                length--;
            } else if (n82) {
                i4++;
            } else {
                z4 = true;
            }
        }
        return str.subSequence(i4, length + 1).toString();
    }

    @fg.l
    public static final kotlin.sequences.m<String> I3(@fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return X4(charSequence, new String[]{ProtectedSandApp.s("葀\u0001"), ProtectedSandApp.s("萾\u0001"), ProtectedSandApp.s("萿\u0001")}, false, 0, 6, null);
    }

    @kotlin.internal.f
    private static final String I4(String str, int i4, int i5, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萭\u0001"));
        return G4(str, i4, i5, charSequence).toString();
    }

    @fg.l
    public static CharSequence I5(@fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (!kotlin.text.d.r(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return "";
    }

    @fg.l
    public static final List<String> J3(@fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return kotlin.sequences.p.c3(I3(charSequence));
    }

    @kotlin.internal.f
    private static final String J4(String str, kotlin.ranges.l lVar, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("落\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萭\u0001"));
        return H4(str, lVar, charSequence).toString();
    }

    @fg.l
    public static final CharSequence J5(@fg.l CharSequence charSequence, @fg.l ld.l<? super Character, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("萴\u0001"));
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i4 = length - 1;
            if (!((Boolean) g0.a(charSequence, length, lVar)).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i4 < 0) {
                return "";
            }
            length = i4;
        }
    }

    @kotlin.internal.f
    private static final boolean K3(CharSequence charSequence, r rVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("萳\u0001"));
        return rVar.k(charSequence);
    }

    public static final void K4(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("葁\u0001"), i4).toString());
        }
    }

    @fg.l
    public static final CharSequence K5(@fg.l CharSequence charSequence, @fg.l char... cArr) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("萸\u0001"));
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (!kotlin.collections.l.n8(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        return "";
    }

    @fg.l
    public static final String L2(@fg.l CharSequence charSequence, @fg.l CharSequence charSequence2, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("葂\u0001"));
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i4 = 0;
        while (i4 < min && kotlin.text.e.J(charSequence.charAt(i4), charSequence2.charAt(i4), z4)) {
            i4++;
        }
        int i5 = i4 - 1;
        if (h3(charSequence, i5) || h3(charSequence2, i5)) {
            i4--;
        }
        return charSequence.subSequence(0, i4).toString();
    }

    @kotlin.internal.f
    private static final String L3(String str) {
        return str == null ? "" : str;
    }

    @kotlin.internal.f
    private static final List<String> L4(CharSequence charSequence, r rVar, int i4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("萳\u0001"));
        return rVar.p(charSequence, i4);
    }

    @kotlin.internal.f
    private static final String L5(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        return I5(str).toString();
    }

    public static /* synthetic */ String M2(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return L2(charSequence, charSequence2, z4);
    }

    @fg.l
    public static final CharSequence M3(@fg.l CharSequence charSequence, int i4, char c5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        if (i4 < 0) {
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("葃\u0001"), i4, ProtectedSandApp.s("葄\u0001")));
        }
        if (i4 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i4);
        sb.append(charSequence);
        u0 it = new kotlin.ranges.l(1, i4 - charSequence.length(), 1).iterator();
        while (it.hasNext()) {
            it.c();
            sb.append(c5);
        }
        return sb;
    }

    @fg.l
    public static final List<String> M4(@fg.l CharSequence charSequence, @fg.l char[] cArr, boolean z4, int i4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("葅\u0001"));
        if (cArr.length == 1) {
            return O4(charSequence, String.valueOf(cArr[0]), z4, i4);
        }
        Iterable N = kotlin.sequences.p.N(W3(charSequence, cArr, 0, z4, i4, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(N, 10));
        Iterator it = N.iterator();
        while (it.hasNext()) {
            arrayList.add(h5(charSequence, (kotlin.ranges.l) it.next()));
        }
        return arrayList;
    }

    @fg.l
    public static final String M5(@fg.l String str, @fg.l ld.l<? super Character, Boolean> lVar) {
        CharSequence charSequence;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("萴\u0001"));
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (!lVar.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    @fg.l
    public static final String N2(@fg.l CharSequence charSequence, @fg.l CharSequence charSequence2, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("葂\u0001"));
        int length = charSequence.length();
        int min = Math.min(length, charSequence2.length());
        int i4 = 0;
        while (i4 < min && kotlin.text.e.J(charSequence.charAt((length - i4) - 1), charSequence2.charAt((r1 - i4) - 1), z4)) {
            i4++;
        }
        if (h3(charSequence, (length - i4) - 1) || h3(charSequence2, (r1 - i4) - 1)) {
            i4--;
        }
        return charSequence.subSequence(length - i4, length).toString();
    }

    @fg.l
    public static final String N3(@fg.l String str, int i4, char c5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        return M3(str, i4, c5).toString();
    }

    @fg.l
    public static final List<String> N4(@fg.l CharSequence charSequence, @fg.l String[] strArr, boolean z4, int i4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(strArr, ProtectedSandApp.s("葅\u0001"));
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return O4(charSequence, str, z4, i4);
            }
        }
        Iterable N = kotlin.sequences.p.N(X3(charSequence, strArr, 0, z4, i4, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(N, 10));
        Iterator it = N.iterator();
        while (it.hasNext()) {
            arrayList.add(h5(charSequence, (kotlin.ranges.l) it.next()));
        }
        return arrayList;
    }

    @fg.l
    public static final String N5(@fg.l String str, @fg.l char... cArr) {
        CharSequence charSequence;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("萸\u0001"));
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i4 = length - 1;
                if (!kotlin.collections.l.n8(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i4 < 0) {
                    break;
                }
                length = i4;
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static /* synthetic */ String O2(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return N2(charSequence, charSequence2, z4);
    }

    public static /* synthetic */ CharSequence O3(CharSequence charSequence, int i4, char c5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            c5 = ' ';
        }
        return M3(charSequence, i4, c5);
    }

    private static final List<String> O4(CharSequence charSequence, String str, boolean z4, int i4) {
        K4(i4);
        int i5 = 0;
        int l32 = l3(charSequence, str, 0, z4);
        if (l32 == -1 || i4 == 1) {
            return kotlin.collections.w.k(charSequence.toString());
        }
        boolean z5 = i4 > 0;
        int i6 = 10;
        if (z5 && i4 <= 10) {
            i6 = i4;
        }
        ArrayList arrayList = new ArrayList(i6);
        do {
            arrayList.add(charSequence.subSequence(i5, l32).toString());
            i5 = str.length() + l32;
            if (z5 && arrayList.size() == i4 - 1) {
                break;
            }
            l32 = l3(charSequence, str, i5, z4);
        } while (l32 != -1);
        arrayList.add(charSequence.subSequence(i5, charSequence.length()).toString());
        return arrayList;
    }

    @fg.l
    public static final CharSequence O5(@fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!kotlin.text.d.r(charSequence.charAt(i4))) {
                return charSequence.subSequence(i4, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean P2(@fg.l CharSequence charSequence, char c5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return o3(charSequence, c5, 0, z4, 2, null) >= 0;
    }

    public static /* synthetic */ String P3(String str, int i4, char c5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            c5 = ' ';
        }
        return N3(str, i4, c5);
    }

    static /* synthetic */ List P4(CharSequence charSequence, r rVar, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("萳\u0001"));
        return rVar.p(charSequence, i4);
    }

    @fg.l
    public static final CharSequence P5(@fg.l CharSequence charSequence, @fg.l ld.l<? super Character, Boolean> lVar) {
        int a5 = f0.a(charSequence, ProtectedSandApp.s("萫\u0001"), lVar, ProtectedSandApp.s("萴\u0001"));
        for (int i4 = 0; i4 < a5; i4++) {
            if (!((Boolean) g0.a(charSequence, i4, lVar)).booleanValue()) {
                return charSequence.subSequence(i4, charSequence.length());
            }
        }
        return "";
    }

    public static boolean Q2(@fg.l CharSequence charSequence, @fg.l CharSequence charSequence2, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("葂\u0001"));
        if (charSequence2 instanceof String) {
            if (p3(charSequence, (String) charSequence2, 0, z4, 2, null) < 0) {
                return false;
            }
        } else if (n3(charSequence, charSequence2, 0, charSequence.length(), z4, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    @fg.l
    public static final CharSequence Q3(@fg.l CharSequence charSequence, int i4, char c5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        if (i4 < 0) {
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("葃\u0001"), i4, ProtectedSandApp.s("葄\u0001")));
        }
        if (i4 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i4);
        u0 it = new kotlin.ranges.l(1, i4 - charSequence.length(), 1).iterator();
        while (it.hasNext()) {
            it.c();
            sb.append(c5);
        }
        sb.append(charSequence);
        return sb;
    }

    public static /* synthetic */ List Q4(CharSequence charSequence, char[] cArr, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return M4(charSequence, cArr, z4, i4);
    }

    @fg.l
    public static final CharSequence Q5(@fg.l CharSequence charSequence, @fg.l char... cArr) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("萸\u0001"));
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!kotlin.collections.l.n8(cArr, charSequence.charAt(i4))) {
                return charSequence.subSequence(i4, charSequence.length());
            }
        }
        return "";
    }

    @kotlin.internal.f
    private static final boolean R2(CharSequence charSequence, r rVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("萳\u0001"));
        return rVar.b(charSequence);
    }

    @fg.l
    public static String R3(@fg.l String str, int i4, char c5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        return Q3(str, i4, c5).toString();
    }

    public static /* synthetic */ List R4(CharSequence charSequence, String[] strArr, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return N4(charSequence, strArr, z4, i4);
    }

    @kotlin.internal.f
    private static final String R5(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        return O5(str).toString();
    }

    public static /* synthetic */ boolean S2(CharSequence charSequence, char c5, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return P2(charSequence, c5, z4);
    }

    public static /* synthetic */ CharSequence S3(CharSequence charSequence, int i4, char c5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            c5 = ' ';
        }
        return Q3(charSequence, i4, c5);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.6")
    @kotlin.internal.f
    private static final kotlin.sequences.m<String> S4(CharSequence charSequence, r rVar, int i4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("萳\u0001"));
        return rVar.r(charSequence, i4);
    }

    @fg.l
    public static final String S5(@fg.l String str, @fg.l ld.l<? super Character, Boolean> lVar) {
        CharSequence charSequence;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("萴\u0001"));
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                charSequence = "";
                break;
            }
            if (!lVar.invoke(Character.valueOf(str.charAt(i4))).booleanValue()) {
                charSequence = str.subSequence(i4, str.length());
                break;
            }
            i4++;
        }
        return charSequence.toString();
    }

    public static /* synthetic */ boolean T2(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return Q2(charSequence, charSequence2, z4);
    }

    public static /* synthetic */ String T3(String str, int i4, char c5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            c5 = ' ';
        }
        return R3(str, i4, c5);
    }

    @fg.l
    public static final kotlin.sequences.m<String> T4(@fg.l CharSequence charSequence, @fg.l char[] cArr, boolean z4, int i4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("葅\u0001"));
        return kotlin.sequences.p.k1(W3(charSequence, cArr, 0, z4, i4, 2, null), new e(charSequence));
    }

    @fg.l
    public static final String T5(@fg.l String str, @fg.l char... cArr) {
        CharSequence charSequence;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("萸\u0001"));
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                charSequence = "";
                break;
            }
            if (!kotlin.collections.l.n8(cArr, str.charAt(i4))) {
                charSequence = str.subSequence(i4, str.length());
                break;
            }
            i4++;
        }
        return charSequence.toString();
    }

    public static final boolean U2(@fg.m CharSequence charSequence, @fg.m CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return e0.K1((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!kotlin.text.e.J(charSequence.charAt(i4), charSequence2.charAt(i4), true)) {
                return false;
            }
        }
        return true;
    }

    private static final kotlin.sequences.m<kotlin.ranges.l> U3(CharSequence charSequence, char[] cArr, int i4, boolean z4, int i5) {
        K4(i5);
        return new h(charSequence, i4, i5, new b(cArr, z4));
    }

    @fg.l
    public static final kotlin.sequences.m<String> U4(@fg.l CharSequence charSequence, @fg.l String[] strArr, boolean z4, int i4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(strArr, ProtectedSandApp.s("葅\u0001"));
        return kotlin.sequences.p.k1(X3(charSequence, strArr, 0, z4, i4, 2, null), new d(charSequence));
    }

    public static final boolean V2(@fg.m CharSequence charSequence, @fg.m CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kotlin.jvm.internal.l0.g(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (charSequence.charAt(i4) != charSequence2.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    private static final kotlin.sequences.m<kotlin.ranges.l> V3(CharSequence charSequence, String[] strArr, int i4, boolean z4, int i5) {
        K4(i5);
        return new h(charSequence, i4, i5, new c(kotlin.collections.l.t(strArr), z4));
    }

    static /* synthetic */ kotlin.sequences.m V4(CharSequence charSequence, r rVar, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("萳\u0001"));
        return rVar.r(charSequence, i4);
    }

    public static final boolean W2(@fg.l CharSequence charSequence, char c5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return charSequence.length() > 0 && kotlin.text.e.J(charSequence.charAt(g3(charSequence)), c5, z4);
    }

    static /* synthetic */ kotlin.sequences.m W3(CharSequence charSequence, char[] cArr, int i4, boolean z4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return U3(charSequence, cArr, i4, z4, i5);
    }

    public static /* synthetic */ kotlin.sequences.m W4(CharSequence charSequence, char[] cArr, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return T4(charSequence, cArr, z4, i4);
    }

    public static final boolean X2(@fg.l CharSequence charSequence, @fg.l CharSequence charSequence2, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("葆\u0001"));
        return (!z4 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? e0.J1((String) charSequence, (String) charSequence2, false, 2, null) : Y3(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z4);
    }

    static /* synthetic */ kotlin.sequences.m X3(CharSequence charSequence, String[] strArr, int i4, boolean z4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i4 = 0;
        }
        if ((i6 & 4) != 0) {
            z4 = false;
        }
        if ((i6 & 8) != 0) {
            i5 = 0;
        }
        return V3(charSequence, strArr, i4, z4, i5);
    }

    public static /* synthetic */ kotlin.sequences.m X4(CharSequence charSequence, String[] strArr, boolean z4, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return U4(charSequence, strArr, z4, i4);
    }

    public static /* synthetic */ boolean Y2(CharSequence charSequence, char c5, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return W2(charSequence, c5, z4);
    }

    public static final boolean Y3(@fg.l CharSequence charSequence, int i4, @fg.l CharSequence charSequence2, int i5, int i6, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("葂\u0001"));
        if (i5 < 0 || i4 < 0 || i4 > charSequence.length() - i6 || i5 > charSequence2.length() - i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!kotlin.text.e.J(charSequence.charAt(i4 + i7), charSequence2.charAt(i5 + i7), z4)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean Y4(@fg.l CharSequence charSequence, char c5, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return charSequence.length() > 0 && kotlin.text.e.J(charSequence.charAt(0), c5, z4);
    }

    public static /* synthetic */ boolean Z2(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return X2(charSequence, charSequence2, z4);
    }

    @fg.l
    public static final CharSequence Z3(@fg.l CharSequence charSequence, @fg.l CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("葇\u0001"));
        return d5(charSequence, charSequence2, false, 2, null) ? charSequence.subSequence(charSequence2.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final boolean Z4(@fg.l CharSequence charSequence, @fg.l CharSequence charSequence2, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("葇\u0001"));
        return (!z4 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? e0.r2((String) charSequence, (String) charSequence2, i4, false, 4, null) : Y3(charSequence, i4, charSequence2, 0, charSequence2.length(), z4);
    }

    @fg.m
    public static final q0<Integer, String> a3(@fg.l CharSequence charSequence, @fg.l Collection<String> collection, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("萵\u0001"));
        return b3(charSequence, collection, i4, z4, false);
    }

    @fg.l
    public static String a4(@fg.l String str, @fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葇\u0001"));
        if (!d5(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    public static final boolean a5(@fg.l CharSequence charSequence, @fg.l CharSequence charSequence2, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("葇\u0001"));
        return (!z4 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? e0.s2((String) charSequence, (String) charSequence2, false, 2, null) : Y3(charSequence, 0, charSequence2, 0, charSequence2.length(), z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0<Integer, String> b3(CharSequence charSequence, Collection<String> collection, int i4, boolean z4, boolean z5) {
        kotlin.ranges.j k02;
        Object obj;
        Object obj2;
        if (!z4 && collection.size() == 1) {
            String str = (String) kotlin.collections.w.f5(collection);
            int p32 = !z5 ? p3(charSequence, str, i4, false, 4, null) : D3(charSequence, str, i4, false, 4, null);
            if (p32 < 0) {
                return null;
            }
            return new q0<>(Integer.valueOf(p32), str);
        }
        if (z5) {
            int g32 = g3(charSequence);
            if (i4 > g32) {
                i4 = g32;
            }
            k02 = kotlin.ranges.s.k0(i4, 0);
        } else {
            if (i4 < 0) {
                i4 = 0;
            }
            k02 = new kotlin.ranges.l(i4, charSequence.length(), 1);
        }
        if (charSequence instanceof String) {
            int first = k02.getFirst();
            int last = k02.getLast();
            int step = k02.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (e0.b2(str2, 0, (String) charSequence, first, str2.length(), z4)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (first == last) {
                            break;
                        }
                        first += step;
                    } else {
                        return new q0<>(Integer.valueOf(first), str3);
                    }
                }
            }
        } else {
            int first2 = k02.getFirst();
            int last2 = k02.getLast();
            int step2 = k02.getStep();
            if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (Y3(str4, 0, charSequence, first2, str4.length(), z4)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    } else {
                        return new q0<>(Integer.valueOf(first2), str5);
                    }
                }
            }
        }
        return null;
    }

    @fg.l
    public static final CharSequence b4(@fg.l CharSequence charSequence, int i4, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(q2.a(ProtectedSandApp.s("萺\u0001"), i5, ProtectedSandApp.s("萻\u0001"), i4, ProtectedSandApp.s("萼\u0001")));
        }
        if (i5 == i4) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i5 - i4));
        sb.append(charSequence, 0, i4);
        String s4 = ProtectedSandApp.s("萹\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append(charSequence, i5, charSequence.length());
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    public static /* synthetic */ boolean b5(CharSequence charSequence, char c5, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return Y4(charSequence, c5, z4);
    }

    public static /* synthetic */ q0 c3(CharSequence charSequence, Collection collection, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return a3(charSequence, collection, i4, z4);
    }

    @fg.l
    public static final CharSequence c4(@fg.l CharSequence charSequence, @fg.l kotlin.ranges.l lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("落\u0001"));
        return b4(charSequence, lVar.c().intValue(), kotlin.collections.p.a(lVar, 1));
    }

    public static /* synthetic */ boolean c5(CharSequence charSequence, CharSequence charSequence2, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return Z4(charSequence, charSequence2, i4, z4);
    }

    @fg.m
    public static final q0<Integer, String> d3(@fg.l CharSequence charSequence, @fg.l Collection<String> collection, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("萵\u0001"));
        return b3(charSequence, collection, i4, z4, true);
    }

    @kotlin.internal.f
    private static final String d4(String str, int i4, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        return b4(str, i4, i5).toString();
    }

    public static /* synthetic */ boolean d5(CharSequence charSequence, CharSequence charSequence2, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return a5(charSequence, charSequence2, z4);
    }

    public static /* synthetic */ q0 e3(CharSequence charSequence, Collection collection, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = g3(charSequence);
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return d3(charSequence, collection, i4, z4);
    }

    @kotlin.internal.f
    private static final String e4(String str, kotlin.ranges.l lVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("落\u0001"));
        return c4(str, lVar).toString();
    }

    @fg.l
    public static final CharSequence e5(@fg.l CharSequence charSequence, @fg.l kotlin.ranges.l lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("落\u0001"));
        return charSequence.subSequence(lVar.c().intValue(), lVar.h().intValue() + 1);
    }

    @fg.l
    public static kotlin.ranges.l f3(@fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return new kotlin.ranges.l(0, charSequence.length() - 1, 1);
    }

    @fg.l
    public static final CharSequence f4(@fg.l CharSequence charSequence, @fg.l CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("葆\u0001"));
        return Z2(charSequence, charSequence2, false, 2, null) ? charSequence.subSequence(0, charSequence.length() - charSequence2.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @kotlin.k(message = "Use parameters named startIndex and endIndex.", replaceWith = @x0(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @kotlin.internal.f
    private static final CharSequence f5(String str, int i4, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        return str.subSequence(i4, i5);
    }

    public static int g3(@fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return charSequence.length() - 1;
    }

    @fg.l
    public static String g4(@fg.l String str, @fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葆\u0001"));
        if (!Z2(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    @kotlin.internal.f
    private static final String g5(CharSequence charSequence, int i4, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return charSequence.subSequence(i4, i5).toString();
    }

    public static final boolean h3(@fg.l CharSequence charSequence, int i4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return new kotlin.ranges.l(0, charSequence.length() + (-2), 1).r(i4) && Character.isHighSurrogate(charSequence.charAt(i4)) && Character.isLowSurrogate(charSequence.charAt(i4 + 1));
    }

    @fg.l
    public static final CharSequence h4(@fg.l CharSequence charSequence, @fg.l CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("萬\u0001"));
        return i4(charSequence, charSequence2, charSequence2);
    }

    @fg.l
    public static final String h5(@fg.l CharSequence charSequence, @fg.l kotlin.ranges.l lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("落\u0001"));
        return charSequence.subSequence(lVar.c().intValue(), lVar.h().intValue() + 1).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <C extends CharSequence & R, R> R i3(C c5, ld.a<? extends R> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("葈\u0001"));
        return e0.S1(c5) ? aVar.invoke() : c5;
    }

    @fg.l
    public static final CharSequence i4(@fg.l CharSequence charSequence, @fg.l CharSequence charSequence2, @fg.l CharSequence charSequence3) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("葇\u0001"));
        kotlin.jvm.internal.l0.p(charSequence3, ProtectedSandApp.s("葆\u0001"));
        return (charSequence.length() >= charSequence3.length() + charSequence2.length() && d5(charSequence, charSequence2, false, 2, null) && Z2(charSequence, charSequence3, false, 2, null)) ? charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @fg.l
    public static String i5(@fg.l String str, @fg.l kotlin.ranges.l lVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("落\u0001"));
        String substring = str.substring(lVar.c().intValue(), lVar.h().intValue() + 1);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @c1(version = "1.3")
    @kotlin.internal.f
    private static final <C extends CharSequence & R, R> R j3(C c5, ld.a<? extends R> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("葈\u0001"));
        return c5.length() == 0 ? aVar.invoke() : c5;
    }

    @fg.l
    public static String j4(@fg.l String str, @fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萬\u0001"));
        return k4(str, charSequence, charSequence);
    }

    static /* synthetic */ String j5(CharSequence charSequence, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = charSequence.length();
        }
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return charSequence.subSequence(i4, i5).toString();
    }

    public static final int k3(@fg.l CharSequence charSequence, char c5, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return (z4 || !(charSequence instanceof String)) ? r3(charSequence, new char[]{c5}, i4, z4) : ((String) charSequence).indexOf(c5, i4);
    }

    @fg.l
    public static final String k4(@fg.l String str, @fg.l CharSequence charSequence, @fg.l CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("葇\u0001"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("葆\u0001"));
        if (str.length() < charSequence2.length() + charSequence.length() || !d5(str, charSequence, false, 2, null) || !Z2(str, charSequence2, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    @fg.l
    public static final String k5(@fg.l String str, char c5, @fg.l String str2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萮\u0001"));
        int o32 = o3(str, c5, 0, false, 6, null);
        if (o32 == -1) {
            return str2;
        }
        String substring = str.substring(o32 + 1, str.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    public static final int l3(@fg.l CharSequence charSequence, @fg.l String str, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萲\u0001"));
        return (z4 || !(charSequence instanceof String)) ? n3(charSequence, str, i4, charSequence.length(), z4, false, 16, null) : ((String) charSequence).indexOf(str, i4);
    }

    @kotlin.internal.f
    private static final String l4(CharSequence charSequence, r rVar, String str) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("萳\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萭\u0001"));
        return rVar.m(charSequence, str);
    }

    @fg.l
    public static String l5(@fg.l String str, @fg.l String str2, @fg.l String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萬\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萮\u0001"));
        int p32 = p3(str, str2, 0, false, 6, null);
        if (p32 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + p32, str.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    private static final int m3(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z4, boolean z5) {
        kotlin.ranges.j k02;
        if (z5) {
            int g32 = g3(charSequence);
            if (i4 > g32) {
                i4 = g32;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            k02 = kotlin.ranges.s.k0(i4, i5);
        } else {
            if (i4 < 0) {
                i4 = 0;
            }
            int length = charSequence.length();
            if (i5 > length) {
                i5 = length;
            }
            k02 = new kotlin.ranges.l(i4, i5, 1);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = k02.getFirst();
            int last = k02.getLast();
            int step = k02.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return -1;
            }
            while (!e0.b2((String) charSequence2, 0, (String) charSequence, first, ((String) charSequence2).length(), z4)) {
                if (first == last) {
                    return -1;
                }
                first += step;
            }
            return first;
        }
        int first2 = k02.getFirst();
        int last2 = k02.getLast();
        int step2 = k02.getStep();
        if ((step2 <= 0 || first2 > last2) && (step2 >= 0 || last2 > first2)) {
            return -1;
        }
        while (!Y3(charSequence2, 0, charSequence, first2, charSequence2.length(), z4)) {
            if (first2 == last2) {
                return -1;
            }
            first2 += step2;
        }
        return first2;
    }

    @kotlin.internal.f
    private static final String m4(CharSequence charSequence, r rVar, ld.l<? super p, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("萳\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("萶\u0001"));
        return rVar.n(charSequence, lVar);
    }

    public static /* synthetic */ String m5(String str, char c5, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return k5(str, c5, str2);
    }

    static /* synthetic */ int n3(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z4, boolean z5, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            z5 = false;
        }
        return m3(charSequence, charSequence2, i4, i5, z4, z5);
    }

    @fg.l
    public static final String n4(@fg.l String str, char c5, @fg.l String str2, @fg.l String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萭\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萮\u0001"));
        int o32 = o3(str, c5, 0, false, 6, null);
        return o32 == -1 ? str3 : G4(str, o32 + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ String n5(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return l5(str, str2, str3);
    }

    public static /* synthetic */ int o3(CharSequence charSequence, char c5, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return k3(charSequence, c5, i4, z4);
    }

    @fg.l
    public static final String o4(@fg.l String str, @fg.l String str2, @fg.l String str3, @fg.l String str4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萬\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萭\u0001"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("萮\u0001"));
        int p32 = p3(str, str2, 0, false, 6, null);
        return p32 == -1 ? str4 : G4(str, str2.length() + p32, str.length(), str3).toString();
    }

    @fg.l
    public static String o5(@fg.l String str, char c5, @fg.l String str2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萮\u0001"));
        int C3 = C3(str, c5, 0, false, 6, null);
        if (C3 == -1) {
            return str2;
        }
        String substring = str.substring(C3 + 1, str.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    public static /* synthetic */ int p3(CharSequence charSequence, String str, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return l3(charSequence, str, i4, z4);
    }

    public static /* synthetic */ String p4(String str, char c5, String str2, String str3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str3 = str;
        }
        return n4(str, c5, str2, str3);
    }

    @fg.l
    public static final String p5(@fg.l String str, @fg.l String str2, @fg.l String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萬\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萮\u0001"));
        int D3 = D3(str, str2, 0, false, 6, null);
        if (D3 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + D3, str.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    public static final int q3(@fg.l CharSequence charSequence, @fg.l Collection<String> collection, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("萵\u0001"));
        q0<Integer, String> b32 = b3(charSequence, collection, i4, z4, false);
        if (b32 != null) {
            return b32.e().intValue();
        }
        return -1;
    }

    public static /* synthetic */ String q4(String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str4 = str;
        }
        return o4(str, str2, str3, str4);
    }

    public static /* synthetic */ String q5(String str, char c5, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return o5(str, c5, str2);
    }

    public static final int r3(@fg.l CharSequence charSequence, @fg.l char[] cArr, int i4, boolean z4) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("萸\u0001"));
        if (!z4 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.l.Ws(cArr), i4);
        }
        if (i4 < 0) {
            i4 = 0;
        }
        u0 it = new kotlin.ranges.l(i4, g3(charSequence), 1).iterator();
        while (it.hasNext()) {
            int c5 = it.c();
            char charAt = charSequence.charAt(c5);
            for (char c6 : cArr) {
                if (kotlin.text.e.J(c6, charAt, z4)) {
                    return c5;
                }
            }
        }
        return -1;
    }

    @fg.l
    public static final String r4(@fg.l String str, char c5, @fg.l String str2, @fg.l String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萭\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萮\u0001"));
        int C3 = C3(str, c5, 0, false, 6, null);
        return C3 == -1 ? str3 : G4(str, C3 + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ String r5(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return p5(str, str2, str3);
    }

    public static /* synthetic */ int s3(CharSequence charSequence, Collection collection, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return q3(charSequence, collection, i4, z4);
    }

    @fg.l
    public static final String s4(@fg.l String str, @fg.l String str2, @fg.l String str3, @fg.l String str4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萬\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萭\u0001"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("萮\u0001"));
        int D3 = D3(str, str2, 0, false, 6, null);
        return D3 == -1 ? str4 : G4(str, str2.length() + D3, str.length(), str3).toString();
    }

    @fg.l
    public static final String s5(@fg.l String str, char c5, @fg.l String str2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萮\u0001"));
        int o32 = o3(str, c5, 0, false, 6, null);
        if (o32 == -1) {
            return str2;
        }
        String substring = str.substring(0, o32);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    public static /* synthetic */ int t3(CharSequence charSequence, char[] cArr, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return r3(charSequence, cArr, i4, z4);
    }

    public static /* synthetic */ String t4(String str, char c5, String str2, String str3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str3 = str;
        }
        return r4(str, c5, str2, str3);
    }

    @fg.l
    public static final String t5(@fg.l String str, @fg.l String str2, @fg.l String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萬\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萮\u0001"));
        int p32 = p3(str, str2, 0, false, 6, null);
        if (p32 == -1) {
            return str3;
        }
        String substring = str.substring(0, p32);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    @kotlin.internal.f
    private static final boolean u3(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return charSequence.length() == 0;
    }

    public static /* synthetic */ String u4(String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str4 = str;
        }
        return s4(str, str2, str3, str4);
    }

    public static /* synthetic */ String u5(String str, char c5, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return s5(str, c5, str2);
    }

    @kotlin.internal.f
    private static final boolean v3(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return !e0.S1(charSequence);
    }

    @fg.l
    public static final String v4(@fg.l String str, char c5, @fg.l String str2, @fg.l String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萭\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萮\u0001"));
        int o32 = o3(str, c5, 0, false, 6, null);
        return o32 == -1 ? str3 : G4(str, 0, o32, str2).toString();
    }

    public static /* synthetic */ String v5(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return t5(str, str2, str3);
    }

    @kotlin.internal.f
    private static final boolean w3(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return charSequence.length() > 0;
    }

    @fg.l
    public static final String w4(@fg.l String str, @fg.l String str2, @fg.l String str3, @fg.l String str4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萬\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萭\u0001"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("萮\u0001"));
        int p32 = p3(str, str2, 0, false, 6, null);
        return p32 == -1 ? str4 : G4(str, 0, p32, str3).toString();
    }

    @fg.l
    public static final String w5(@fg.l String str, char c5, @fg.l String str2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萮\u0001"));
        int C3 = C3(str, c5, 0, false, 6, null);
        if (C3 == -1) {
            return str2;
        }
        String substring = str.substring(0, C3);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    @kotlin.internal.f
    private static final boolean x3(CharSequence charSequence) {
        return charSequence == null || e0.S1(charSequence);
    }

    public static /* synthetic */ String x4(String str, char c5, String str2, String str3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str3 = str;
        }
        return v4(str, c5, str2, str3);
    }

    @fg.l
    public static String x5(@fg.l String str, @fg.l String str2, @fg.l String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萬\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萮\u0001"));
        int D3 = D3(str, str2, 0, false, 6, null);
        if (D3 == -1) {
            return str3;
        }
        String substring = str.substring(0, D3);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("萷\u0001"));
        return substring;
    }

    @kotlin.internal.f
    private static final boolean y3(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static /* synthetic */ String y4(String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str4 = str;
        }
        return w4(str, str2, str3, str4);
    }

    public static /* synthetic */ String y5(String str, char c5, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return w5(str, c5, str2);
    }

    @fg.l
    public static final kotlin.collections.v z3(@fg.l CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("萫\u0001"));
        return new a(charSequence);
    }

    @fg.l
    public static final String z4(@fg.l String str, char c5, @fg.l String str2, @fg.l String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("萫\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("萭\u0001"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("萮\u0001"));
        int C3 = C3(str, c5, 0, false, 6, null);
        return C3 == -1 ? str3 : G4(str, 0, C3, str2).toString();
    }

    public static /* synthetic */ String z5(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return x5(str, str2, str3);
    }
}
