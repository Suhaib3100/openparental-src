package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.CharIterator;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0011\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u001f\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086\u0002\u001a\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\n\u001a\u0018\u0010\u0017\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u0018\u0010\u0018\u001a\u00020\u0010*\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010\u0019\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a:\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001aE\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b!\u001a:\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010#\u001a\u00020\u0010*\u00020\u00022\u0006\u0010$\u001a\u00020\u0006\u001a7\u0010%\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a7\u0010+\u001a\u0002H&\"\f\b\u0000\u0010'*\u00020\u0002*\u0002H&\"\u0004\b\u0001\u0010&*\u0002H'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H&0)H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010*\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a;\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0002\b.\u001a&\u0010,\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u00100\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u00100\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\r\u00103\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00104\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a\r\u00105\u001a\u00020\u0010*\u00020\u0002H\u0087\b\u001a \u00106\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u00107\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u00108\u001a\u000209*\u00020\u0002H\u0086\u0002\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010:\u001a\u00020\u0006*\u00020\u00022\u0006\u0010/\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a&\u0010;\u001a\u00020\u0006*\u00020\u00022\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a,\u0010;\u001a\u00020\u0006*\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u0002\u001a\u0010\u0010>\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u0002\u001a\u0015\u0010@\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0087\f\u001a\u000f\u0010A\u001a\u00020\r*\u0004\u0018\u00010\rH\u0087\b\u001a\u001c\u0010B\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010B\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001a\u001c\u0010E\u001a\u00020\r*\u00020\r2\u0006\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u0014\u001aG\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u000e\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H2\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010J\u001a=\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00010=*\u00020\u00022\u0006\u0010G\u001a\u0002022\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bI\u001a4\u0010K\u001a\u00020\u0010*\u00020\u00022\u0006\u0010L\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\u0012\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u0002\u001a\u0012\u0010N\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u0002\u001a\u001a\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006\u001a\u0012\u0010P\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010P\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001H\u0087\b\u001a\u0012\u0010R\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010R\u001a\u00020\r*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\u0002*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a\u0012\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u0002\u001a\u001a\u0010S\u001a\u00020\r*\u00020\r2\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002\u001a.\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0014\b\b\u0010V\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000\u001a\u001d\u0010U\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010Z\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010\\\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010]\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a$\u0010^\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001d\u0010_\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010Y\u001a\u00020\rH\u0087\b\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140WH\u0087\bø\u0001\u0000¢\u0006\u0002\ba\u001a)\u0010`\u001a\u00020\r*\u00020\r2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020WH\u0087\bø\u0001\u0000¢\u0006\u0002\bb\u001a\"\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002\u001a\u001a\u0010c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002\u001a%\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a\u001d\u0010c\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010Y\u001a\u00020\u0002H\u0087\b\u001a=\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010e\u001a0\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a/\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010T\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0002\bf\u001a%\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0?*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a=\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0012\u0010G\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0H\"\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010h\u001a0\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\n\u0010G\u001a\u000202\"\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u001a%\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0=*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0087\b\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u001c\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a$\u0010i\u001a\u00020\u0010*\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0012\u0010j\u001a\u00020\u0002*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u001d\u0010j\u001a\u00020\u0002*\u00020\r2\u0006\u0010k\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u0006H\u0087\b\u001a\u001f\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u0006H\u0087\b\u001a\u0012\u0010m\u001a\u00020\r*\u00020\u00022\u0006\u0010Q\u001a\u00020\u0001\u001a\u0012\u0010m\u001a\u00020\r*\u00020\r2\u0006\u0010Q\u001a\u00020\u0001\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010n\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010o\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010p\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\u00142\b\b\u0002\u0010[\u001a\u00020\r\u001a\u001c\u0010q\u001a\u00020\r*\u00020\r2\u0006\u0010T\u001a\u00020\r2\b\b\u0002\u0010[\u001a\u00020\r\u001a\f\u0010r\u001a\u00020\u0010*\u00020\rH\u0007\u001a\u0013\u0010s\u001a\u0004\u0018\u00010\u0010*\u00020\rH\u0007¢\u0006\u0002\u0010t\u001a\n\u0010u\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010u\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010u\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010u\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010u\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010w\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010w\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010w\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010w\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010w\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\u001a\n\u0010x\u001a\u00020\u0002*\u00020\u0002\u001a$\u0010x\u001a\u00020\u0002*\u00020\u00022\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\u0002*\u00020\u00022\n\u00101\u001a\u000202\"\u00020\u0014\u001a\r\u0010x\u001a\u00020\r*\u00020\rH\u0087\b\u001a$\u0010x\u001a\u00020\r*\u00020\r2\u0012\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100WH\u0086\bø\u0001\u0000\u001a\u0016\u0010x\u001a\u00020\r*\u00020\r2\n\u00101\u001a\u000202\"\u00020\u0014\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006y"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "requireNonNegativeLimit", "", "limit", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "contentEqualsIgnoreCaseImpl", "contentEqualsImpl", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "ifBlank", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ifEmpty", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceFirstChar", "replaceFirstCharWithChar", "replaceFirstCharWithCharSequence", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "toBooleanStrict", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n79#1,22:1487\n113#1,5:1509\n130#1,5:1514\n79#1,22:1519\n107#1:1541\n79#1,22:1542\n113#1,5:1564\n124#1:1569\n113#1,5:1570\n130#1,5:1575\n141#1:1580\n130#1,5:1581\n79#1,22:1586\n113#1,5:1608\n130#1,5:1613\n12554#2,2:1618\n12554#2,2:1620\n288#3,2:1622\n288#3,2:1624\n1549#3:1627\n1620#3,3:1628\n1549#3:1631\n1620#3,3:1632\n1#4:1626\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n107#1:1487,22\n124#1:1509,5\n141#1:1514,5\n146#1:1519,22\n151#1:1541\n151#1:1542,22\n156#1:1564,5\n161#1:1569\n161#1:1570,5\n166#1:1575,5\n171#1:1580\n171#1:1581,5\n176#1:1586,22\n187#1:1608,5\n198#1:1613,5\n940#1:1618,2\n964#1:1620,2\n1003#1:1622,2\n1009#1:1624,2\n1309#1:1627\n1309#1:1628,3\n1334#1:1631\n1334#1:1632,3\n*E\n"})
/* loaded from: classes6.dex */
public class h0 extends e0 {

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"kotlin/text/StringsKt__StringsKt$iterator$1", "Lkotlin/collections/CharIterator;", "index", "", "hasNext", "", "nextChar", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends CharIterator {

        /* renamed from: o, reason: collision with root package name */
        private int f27068o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ CharSequence f27069p;

        a(CharSequence charSequence) {
            this.f27069p = charSequence;
        }

        @Override // kotlin.collections.CharIterator
        public char d() {
            CharSequence charSequence = this.f27069p;
            int i5 = this.f27068o;
            this.f27068o = i5 + 1;
            return charSequence.charAt(i5);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27068o < this.f27069p.length();
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    static final class b extends Lambda implements q3.p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ char[] f27070p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f27071q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(char[] cArr, boolean z5) {
            super(2);
            this.f27070p = cArr;
            this.f27071q = z5;
        }

        @d5.e
        public final Pair<Integer, Integer> a(@d5.d CharSequence charSequence, int i5) {
            kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("趥"));
            int r32 = h0.r3(charSequence, this.f27070p, i5, this.f27071q);
            if (r32 < 0) {
                return null;
            }
            return new Pair<>(Integer.valueOf(r32), 1);
        }

        @Override // q3.p
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> g0(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    static final class c extends Lambda implements q3.p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ List<String> f27072p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ boolean f27073q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<String> list, boolean z5) {
            super(2);
            this.f27072p = list;
            this.f27073q = z5;
        }

        @d5.e
        public final Pair<Integer, Integer> a(@d5.d CharSequence charSequence, int i5) {
            kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("趦"));
            Pair b32 = h0.b3(charSequence, this.f27072p, i5, this.f27073q, false);
            if (b32 != null) {
                return new Pair<>(b32.e(), Integer.valueOf(((String) b32.f()).length()));
            }
            return null;
        }

        @Override // q3.p
        public /* bridge */ /* synthetic */ Pair<? extends Integer, ? extends Integer> g0(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements q3.l<IntRange, String> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ CharSequence f27074p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence) {
            super(1);
            this.f27074p = charSequence;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String N(@d5.d IntRange intRange) {
            kotlin.jvm.internal.l0.p(intRange, ProtectedSandApp.s("趧"));
            return h0.h5(this.f27074p, intRange);
        }
    }

    /* compiled from: Strings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/ranges/IntRange;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends Lambda implements q3.l<IntRange, String> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ CharSequence f27075p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence) {
            super(1);
            this.f27075p = charSequence;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String N(@d5.d IntRange intRange) {
            kotlin.jvm.internal.l0.p(intRange, ProtectedSandApp.s("趨"));
            return h0.h5(this.f27075p, intRange);
        }
    }

    public static final int A3(@d5.d CharSequence charSequence, char c6, int i5, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("趩"));
        return (z5 || !(charSequence instanceof String)) ? F3(charSequence, new char[]{c6}, i5, z5) : ((String) charSequence).lastIndexOf(c6, i5);
    }

    @d5.d
    public static final String A4(@d5.d String str, @d5.d String str2, @d5.d String str3, @d5.d String str4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趪"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("趫"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("趬"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("趭"));
        int D3 = D3(str, str2, 0, false, 6, null);
        return D3 == -1 ? str4 : G4(str, 0, D3, str3).toString();
    }

    @SinceKotlin(version = "1.5")
    public static final boolean A5(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趮"));
        if (kotlin.jvm.internal.l0.g(str, ProtectedSandApp.s("趯"))) {
            return true;
        }
        if (kotlin.jvm.internal.l0.g(str, ProtectedSandApp.s("趰"))) {
            return false;
        }
        throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("趱"), str));
    }

    public static final int B3(@d5.d CharSequence charSequence, @d5.d String str, int i5, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("趲"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("足"));
        return (z5 || !(charSequence instanceof String)) ? m3(charSequence, str, i5, 0, z5, true) : ((String) charSequence).lastIndexOf(str, i5);
    }

    public static /* synthetic */ String B4(String str, char c6, String str2, String str3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str3 = str;
        }
        return z4(str, c6, str2, str3);
    }

    @SinceKotlin(version = "1.5")
    @d5.e
    public static final Boolean B5(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趴"));
        if (kotlin.jvm.internal.l0.g(str, ProtectedSandApp.s("趵"))) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.l0.g(str, ProtectedSandApp.s("趶"))) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ int C3(CharSequence charSequence, char c6, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = g3(charSequence);
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return A3(charSequence, c6, i5, z5);
    }

    public static /* synthetic */ String C4(String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str4 = str;
        }
        return A4(str, str2, str3, str4);
    }

    @d5.d
    public static CharSequence C5(@d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("趷"));
        int length = charSequence.length() - 1;
        int i5 = 0;
        boolean z5 = false;
        while (i5 <= length) {
            boolean r5 = kotlin.text.d.r(charSequence.charAt(!z5 ? i5 : length));
            if (z5) {
                if (!r5) {
                    break;
                }
                length--;
            } else if (r5) {
                i5++;
            } else {
                z5 = true;
            }
        }
        return charSequence.subSequence(i5, length + 1);
    }

    public static /* synthetic */ int D3(CharSequence charSequence, String str, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = g3(charSequence);
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return B3(charSequence, str, i5, z5);
    }

    @InlineOnly
    private static final String D4(CharSequence charSequence, Regex regex, String str) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("趸"));
        kotlin.jvm.internal.l0.p(regex, ProtectedSandApp.s("趹"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趺"));
        return regex.o(charSequence, str);
    }

    @d5.d
    public static final CharSequence D5(@d5.d CharSequence charSequence, @d5.d q3.l<? super Character, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("趻"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("趼"));
        int length = charSequence.length() - 1;
        int i5 = 0;
        boolean z5 = false;
        while (i5 <= length) {
            boolean booleanValue = ((Boolean) g0.a(charSequence, !z5 ? i5 : length, lVar)).booleanValue();
            if (z5) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i5++;
            } else {
                z5 = true;
            }
        }
        return charSequence.subSequence(i5, length + 1);
    }

    public static final int E3(@d5.d CharSequence charSequence, @d5.d Collection<String> collection, int i5, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("趽"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("趾"));
        Pair<Integer, String> b32 = b3(charSequence, collection, i5, z5, true);
        if (b32 != null) {
            return b32.e().intValue();
        }
        return -1;
    }

    @p3.i(name = "replaceFirstCharWithChar")
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final String E4(String str, q3.l<? super Character, Character> lVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趿"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("跀"));
        if (!(str.length() > 0)) {
            return str;
        }
        char charValue = lVar.N(Character.valueOf(str.charAt(0))).charValue();
        String substring = str.substring(1);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("跁"));
        return charValue + substring;
    }

    @d5.d
    public static final CharSequence E5(@d5.d CharSequence charSequence, @d5.d char... cArr) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跂"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("跃"));
        int length = charSequence.length() - 1;
        int i5 = 0;
        boolean z5 = false;
        while (i5 <= length) {
            boolean n8 = kotlin.collections.t.n8(cArr, charSequence.charAt(!z5 ? i5 : length));
            if (z5) {
                if (!n8) {
                    break;
                }
                length--;
            } else if (n8) {
                i5++;
            } else {
                z5 = true;
            }
        }
        return charSequence.subSequence(i5, length + 1);
    }

    public static final int F3(@d5.d CharSequence charSequence, @d5.d char[] cArr, int i5, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跄"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("跅"));
        if (!z5 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.t.Vs(cArr), i5);
        }
        int g32 = g3(charSequence);
        if (i5 > g32) {
            i5 = g32;
        }
        while (-1 < i5) {
            char charAt = charSequence.charAt(i5);
            int length = cArr.length;
            boolean z6 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (kotlin.text.e.J(cArr[i6], charAt, z5)) {
                    z6 = true;
                    break;
                }
                i6++;
            }
            if (z6) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    @p3.i(name = "replaceFirstCharWithCharSequence")
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    @OverloadResolutionByLambdaReturnType
    private static final String F4(String str, q3.l<? super Character, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("跆"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("跇"));
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) lVar.N(Character.valueOf(str.charAt(0))));
        String substring = str.substring(1);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("跈"));
        sb.append(substring);
        return sb.toString();
    }

    @InlineOnly
    private static final String F5(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("跉"));
        return C5(str).toString();
    }

    public static /* synthetic */ int G3(CharSequence charSequence, Collection collection, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = g3(charSequence);
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return E3(charSequence, collection, i5, z5);
    }

    @d5.d
    public static final CharSequence G4(@d5.d CharSequence charSequence, int i5, int i6, @d5.d CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跊"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("跋"));
        if (i6 < i5) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("跍") + i6 + ProtectedSandApp.s("跎") + i5 + ProtectedSandApp.s("跏"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i5);
        String s5 = ProtectedSandApp.s("跌");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append(charSequence2);
        sb.append(charSequence, i6, charSequence.length());
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @d5.d
    public static final String G5(@d5.d String str, @d5.d q3.l<? super Character, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("跐"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("跑"));
        int length = str.length() - 1;
        int i5 = 0;
        boolean z5 = false;
        while (i5 <= length) {
            boolean booleanValue = lVar.N(Character.valueOf(str.charAt(!z5 ? i5 : length))).booleanValue();
            if (z5) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i5++;
            } else {
                z5 = true;
            }
        }
        return str.subSequence(i5, length + 1).toString();
    }

    public static /* synthetic */ int H3(CharSequence charSequence, char[] cArr, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = g3(charSequence);
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return F3(charSequence, cArr, i5, z5);
    }

    @d5.d
    public static final CharSequence H4(@d5.d CharSequence charSequence, @d5.d IntRange intRange, @d5.d CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跒"));
        kotlin.jvm.internal.l0.p(intRange, ProtectedSandApp.s("跓"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("跔"));
        return G4(charSequence, intRange.f().intValue(), kotlin.collections.r.a(intRange, 1), charSequence2);
    }

    @d5.d
    public static final String H5(@d5.d String str, @d5.d char... cArr) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("跕"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("跖"));
        int length = str.length() - 1;
        int i5 = 0;
        boolean z5 = false;
        while (i5 <= length) {
            boolean n8 = kotlin.collections.t.n8(cArr, str.charAt(!z5 ? i5 : length));
            if (z5) {
                if (!n8) {
                    break;
                }
                length--;
            } else if (n8) {
                i5++;
            } else {
                z5 = true;
            }
        }
        return str.subSequence(i5, length + 1).toString();
    }

    @d5.d
    public static final Sequence<String> I3(@d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跗"));
        return X4(charSequence, new String[]{ProtectedSandApp.s("跚"), ProtectedSandApp.s("跘"), ProtectedSandApp.s("跙")}, false, 0, 6, null);
    }

    @InlineOnly
    private static final String I4(String str, int i5, int i6, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("跛"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跜"));
        return G4(str, i5, i6, charSequence).toString();
    }

    @d5.d
    public static final CharSequence I5(@d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("距"));
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (!kotlin.text.d.r(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return "";
    }

    @d5.d
    public static final List<String> J3(@d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跞"));
        return kotlin.sequences.v.c3(I3(charSequence));
    }

    @InlineOnly
    private static final String J4(String str, IntRange intRange, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("跟"));
        kotlin.jvm.internal.l0.p(intRange, ProtectedSandApp.s("跠"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跡"));
        return H4(str, intRange, charSequence).toString();
    }

    @d5.d
    public static final CharSequence J5(@d5.d CharSequence charSequence, @d5.d q3.l<? super Character, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跢"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("跣"));
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i5 = length - 1;
            if (!((Boolean) g0.a(charSequence, length, lVar)).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i5 < 0) {
                return "";
            }
            length = i5;
        }
    }

    @InlineOnly
    private static final boolean K3(CharSequence charSequence, Regex regex) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跤"));
        kotlin.jvm.internal.l0.p(regex, ProtectedSandApp.s("跥"));
        return regex.k(charSequence);
    }

    public static final void K4(int i5) {
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("跦"), i5).toString());
        }
    }

    @d5.d
    public static final CharSequence K5(@d5.d CharSequence charSequence, @d5.d char... cArr) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跧"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("跨"));
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (!kotlin.collections.t.n8(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return "";
    }

    @d5.d
    public static final String L2(@d5.d CharSequence charSequence, @d5.d CharSequence charSequence2, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跩"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("跪"));
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i5 = 0;
        while (i5 < min && kotlin.text.e.J(charSequence.charAt(i5), charSequence2.charAt(i5), z5)) {
            i5++;
        }
        int i6 = i5 - 1;
        if (h3(charSequence, i6) || h3(charSequence2, i6)) {
            i5--;
        }
        return charSequence.subSequence(0, i5).toString();
    }

    @InlineOnly
    private static final String L3(String str) {
        return str == null ? "" : str;
    }

    @InlineOnly
    private static final List<String> L4(CharSequence charSequence, Regex regex, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跫"));
        kotlin.jvm.internal.l0.p(regex, ProtectedSandApp.s("跬"));
        return regex.p(charSequence, i5);
    }

    @InlineOnly
    private static final String L5(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("跭"));
        return I5(str).toString();
    }

    public static /* synthetic */ String M2(CharSequence charSequence, CharSequence charSequence2, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return L2(charSequence, charSequence2, z5);
    }

    @d5.d
    public static final CharSequence M3(@d5.d CharSequence charSequence, int i5, char c6) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跮"));
        if (i5 < 0) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("路"), i5, ProtectedSandApp.s("跰")));
        }
        if (i5 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i5);
        sb.append(charSequence);
        IntIterator it = new IntRange(1, i5 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c6);
        }
        return sb;
    }

    @d5.d
    public static final List<String> M4(@d5.d CharSequence charSequence, @d5.d char[] cArr, boolean z5, int i5) {
        Iterable N;
        int b02;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跱"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("跲"));
        if (cArr.length == 1) {
            return O4(charSequence, String.valueOf(cArr[0]), z5, i5);
        }
        N = kotlin.sequences.v.N(W3(charSequence, cArr, 0, z5, i5, 2, null));
        b02 = kotlin.collections.b0.b0(N, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = N.iterator();
        while (it.hasNext()) {
            arrayList.add(h5(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    @d5.d
    public static final String M5(@d5.d String str, @d5.d q3.l<? super Character, Boolean> lVar) {
        CharSequence charSequence;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("跳"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("跴"));
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (!lVar.N(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    @d5.d
    public static final String N2(@d5.d CharSequence charSequence, @d5.d CharSequence charSequence2, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("践"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("跶"));
        int length = charSequence.length();
        int min = Math.min(length, charSequence2.length());
        int i5 = 0;
        while (i5 < min && kotlin.text.e.J(charSequence.charAt((length - i5) - 1), charSequence2.charAt((r1 - i5) - 1), z5)) {
            i5++;
        }
        if (h3(charSequence, (length - i5) - 1) || h3(charSequence2, (r1 - i5) - 1)) {
            i5--;
        }
        return charSequence.subSequence(length - i5, length).toString();
    }

    @d5.d
    public static final String N3(@d5.d String str, int i5, char c6) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("跷"));
        return M3(str, i5, c6).toString();
    }

    @d5.d
    public static final List<String> N4(@d5.d CharSequence charSequence, @d5.d String[] strArr, boolean z5, int i5) {
        Iterable N;
        int b02;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跸"));
        kotlin.jvm.internal.l0.p(strArr, ProtectedSandApp.s("跹"));
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                return O4(charSequence, str, z5, i5);
            }
        }
        N = kotlin.sequences.v.N(X3(charSequence, strArr, 0, z5, i5, 2, null));
        b02 = kotlin.collections.b0.b0(N, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator it = N.iterator();
        while (it.hasNext()) {
            arrayList.add(h5(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    @d5.d
    public static final String N5(@d5.d String str, @d5.d char... cArr) {
        CharSequence charSequence;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("跺"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("跻"));
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (!kotlin.collections.t.n8(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static /* synthetic */ String O2(CharSequence charSequence, CharSequence charSequence2, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return N2(charSequence, charSequence2, z5);
    }

    public static /* synthetic */ CharSequence O3(CharSequence charSequence, int i5, char c6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            c6 = ' ';
        }
        return M3(charSequence, i5, c6);
    }

    private static final List<String> O4(CharSequence charSequence, String str, boolean z5, int i5) {
        List<String> k5;
        K4(i5);
        int i6 = 0;
        int l32 = l3(charSequence, str, 0, z5);
        if (l32 == -1 || i5 == 1) {
            k5 = kotlin.collections.z.k(charSequence.toString());
            return k5;
        }
        boolean z6 = i5 > 0;
        int i7 = 10;
        if (z6 && i5 <= 10) {
            i7 = i5;
        }
        ArrayList arrayList = new ArrayList(i7);
        do {
            arrayList.add(charSequence.subSequence(i6, l32).toString());
            i6 = str.length() + l32;
            if (z6 && arrayList.size() == i5 - 1) {
                break;
            }
            l32 = l3(charSequence, str, i6, z5);
        } while (l32 != -1);
        arrayList.add(charSequence.subSequence(i6, charSequence.length()).toString());
        return arrayList;
    }

    @d5.d
    public static final CharSequence O5(@d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跼"));
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!kotlin.text.d.r(charSequence.charAt(i5))) {
                return charSequence.subSequence(i5, charSequence.length());
            }
        }
        return "";
    }

    public static final boolean P2(@d5.d CharSequence charSequence, char c6, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跽"));
        return o3(charSequence, c6, 0, z5, 2, null) >= 0;
    }

    public static /* synthetic */ String P3(String str, int i5, char c6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            c6 = ' ';
        }
        return N3(str, i5, c6);
    }

    static /* synthetic */ List P4(CharSequence charSequence, Regex regex, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("跾"));
        kotlin.jvm.internal.l0.p(regex, ProtectedSandApp.s("跿"));
        return regex.p(charSequence, i5);
    }

    @d5.d
    public static final CharSequence P5(@d5.d CharSequence charSequence, @d5.d q3.l<? super Character, Boolean> lVar) {
        int a6 = f0.a(charSequence, ProtectedSandApp.s("踀"), lVar, ProtectedSandApp.s("踁"));
        for (int i5 = 0; i5 < a6; i5++) {
            if (!((Boolean) g0.a(charSequence, i5, lVar)).booleanValue()) {
                return charSequence.subSequence(i5, charSequence.length());
            }
        }
        return "";
    }

    public static boolean Q2(@d5.d CharSequence charSequence, @d5.d CharSequence charSequence2, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踂"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("踃"));
        if (charSequence2 instanceof String) {
            if (p3(charSequence, (String) charSequence2, 0, z5, 2, null) >= 0) {
                return true;
            }
        } else if (n3(charSequence, charSequence2, 0, charSequence.length(), z5, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    @d5.d
    public static final CharSequence Q3(@d5.d CharSequence charSequence, int i5, char c6) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踄"));
        if (i5 < 0) {
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("踅"), i5, ProtectedSandApp.s("踆")));
        }
        if (i5 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i5);
        IntIterator it = new IntRange(1, i5 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c6);
        }
        sb.append(charSequence);
        return sb;
    }

    public static /* synthetic */ List Q4(CharSequence charSequence, char[] cArr, boolean z5, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z5 = false;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return M4(charSequence, cArr, z5, i5);
    }

    @d5.d
    public static final CharSequence Q5(@d5.d CharSequence charSequence, @d5.d char... cArr) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踇"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("踈"));
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!kotlin.collections.t.n8(cArr, charSequence.charAt(i5))) {
                return charSequence.subSequence(i5, charSequence.length());
            }
        }
        return "";
    }

    @InlineOnly
    private static final boolean R2(CharSequence charSequence, Regex regex) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踉"));
        kotlin.jvm.internal.l0.p(regex, ProtectedSandApp.s("踊"));
        return regex.b(charSequence);
    }

    @d5.d
    public static String R3(@d5.d String str, int i5, char c6) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("踋"));
        return Q3(str, i5, c6).toString();
    }

    public static /* synthetic */ List R4(CharSequence charSequence, String[] strArr, boolean z5, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z5 = false;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return N4(charSequence, strArr, z5, i5);
    }

    @InlineOnly
    private static final String R5(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("踌"));
        return O5(str).toString();
    }

    public static /* synthetic */ boolean S2(CharSequence charSequence, char c6, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return P2(charSequence, c6, z5);
    }

    public static /* synthetic */ CharSequence S3(CharSequence charSequence, int i5, char c6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            c6 = ' ';
        }
        return Q3(charSequence, i5, c6);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Sequence<String> S4(CharSequence charSequence, Regex regex, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踍"));
        kotlin.jvm.internal.l0.p(regex, ProtectedSandApp.s("踎"));
        return regex.r(charSequence, i5);
    }

    @d5.d
    public static final String S5(@d5.d String str, @d5.d q3.l<? super Character, Boolean> lVar) {
        CharSequence charSequence;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("踏"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("踐"));
        int length = str.length();
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                charSequence = "";
                break;
            }
            if (!lVar.N(Character.valueOf(str.charAt(i5))).booleanValue()) {
                charSequence = str.subSequence(i5, str.length());
                break;
            }
            i5++;
        }
        return charSequence.toString();
    }

    public static /* synthetic */ boolean T2(CharSequence charSequence, CharSequence charSequence2, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return Q2(charSequence, charSequence2, z5);
    }

    public static /* synthetic */ String T3(String str, int i5, char c6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            c6 = ' ';
        }
        return R3(str, i5, c6);
    }

    @d5.d
    public static final Sequence<String> T4(@d5.d CharSequence charSequence, @d5.d char[] cArr, boolean z5, int i5) {
        Sequence<String> k12;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踑"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("踒"));
        k12 = kotlin.sequences.v.k1(W3(charSequence, cArr, 0, z5, i5, 2, null), new e(charSequence));
        return k12;
    }

    @d5.d
    public static final String T5(@d5.d String str, @d5.d char... cArr) {
        CharSequence charSequence;
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("踓"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("踔"));
        int length = str.length();
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                charSequence = "";
                break;
            }
            if (!kotlin.collections.t.n8(cArr, str.charAt(i5))) {
                charSequence = str.subSequence(i5, str.length());
                break;
            }
            i5++;
        }
        return charSequence.toString();
    }

    public static final boolean U2(@d5.e CharSequence charSequence, @d5.e CharSequence charSequence2) {
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
        for (int i5 = 0; i5 < length; i5++) {
            if (!kotlin.text.e.J(charSequence.charAt(i5), charSequence2.charAt(i5), true)) {
                return false;
            }
        }
        return true;
    }

    private static final Sequence<IntRange> U3(CharSequence charSequence, char[] cArr, int i5, boolean z5, int i6) {
        K4(i6);
        return new DelimitedRangesSequence(charSequence, i5, i6, new b(cArr, z5));
    }

    @d5.d
    public static final Sequence<String> U4(@d5.d CharSequence charSequence, @d5.d String[] strArr, boolean z5, int i5) {
        Sequence<String> k12;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踕"));
        kotlin.jvm.internal.l0.p(strArr, ProtectedSandApp.s("踖"));
        k12 = kotlin.sequences.v.k1(X3(charSequence, strArr, 0, z5, i5, 2, null), new d(charSequence));
        return k12;
    }

    public static final boolean V2(@d5.e CharSequence charSequence, @d5.e CharSequence charSequence2) {
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
        for (int i5 = 0; i5 < length; i5++) {
            if (charSequence.charAt(i5) != charSequence2.charAt(i5)) {
                return false;
            }
        }
        return true;
    }

    private static final Sequence<IntRange> V3(CharSequence charSequence, String[] strArr, int i5, boolean z5, int i6) {
        List t5;
        K4(i6);
        t5 = kotlin.collections.p.t(strArr);
        return new DelimitedRangesSequence(charSequence, i5, i6, new c(t5, z5));
    }

    static /* synthetic */ Sequence V4(CharSequence charSequence, Regex regex, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踗"));
        kotlin.jvm.internal.l0.p(regex, ProtectedSandApp.s("踘"));
        return regex.r(charSequence, i5);
    }

    public static final boolean W2(@d5.d CharSequence charSequence, char c6, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踙"));
        return charSequence.length() > 0 && kotlin.text.e.J(charSequence.charAt(g3(charSequence)), c6, z5);
    }

    static /* synthetic */ Sequence W3(CharSequence charSequence, char[] cArr, int i5, boolean z5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        if ((i7 & 8) != 0) {
            i6 = 0;
        }
        return U3(charSequence, cArr, i5, z5, i6);
    }

    public static /* synthetic */ Sequence W4(CharSequence charSequence, char[] cArr, boolean z5, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z5 = false;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return T4(charSequence, cArr, z5, i5);
    }

    public static final boolean X2(@d5.d CharSequence charSequence, @d5.d CharSequence charSequence2, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踚"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("踛"));
        return (!z5 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? e0.J1((String) charSequence, (String) charSequence2, false, 2, null) : Y3(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z5);
    }

    static /* synthetic */ Sequence X3(CharSequence charSequence, String[] strArr, int i5, boolean z5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        if ((i7 & 8) != 0) {
            i6 = 0;
        }
        return V3(charSequence, strArr, i5, z5, i6);
    }

    public static /* synthetic */ Sequence X4(CharSequence charSequence, String[] strArr, boolean z5, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z5 = false;
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        return U4(charSequence, strArr, z5, i5);
    }

    public static /* synthetic */ boolean Y2(CharSequence charSequence, char c6, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return W2(charSequence, c6, z5);
    }

    public static final boolean Y3(@d5.d CharSequence charSequence, int i5, @d5.d CharSequence charSequence2, int i6, int i7, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踜"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("踝"));
        if (i6 < 0 || i5 < 0 || i5 > charSequence.length() - i7 || i6 > charSequence2.length() - i7) {
            return false;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!kotlin.text.e.J(charSequence.charAt(i5 + i8), charSequence2.charAt(i6 + i8), z5)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean Y4(@d5.d CharSequence charSequence, char c6, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踞"));
        return charSequence.length() > 0 && kotlin.text.e.J(charSequence.charAt(0), c6, z5);
    }

    public static /* synthetic */ boolean Z2(CharSequence charSequence, CharSequence charSequence2, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return X2(charSequence, charSequence2, z5);
    }

    @d5.d
    public static final CharSequence Z3(@d5.d CharSequence charSequence, @d5.d CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踟"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("踠"));
        return d5(charSequence, charSequence2, false, 2, null) ? charSequence.subSequence(charSequence2.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final boolean Z4(@d5.d CharSequence charSequence, @d5.d CharSequence charSequence2, int i5, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踡"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("踢"));
        return (!z5 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? e0.r2((String) charSequence, (String) charSequence2, i5, false, 4, null) : Y3(charSequence, i5, charSequence2, 0, charSequence2.length(), z5);
    }

    @d5.e
    public static final Pair<Integer, String> a3(@d5.d CharSequence charSequence, @d5.d Collection<String> collection, int i5, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踣"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("踤"));
        return b3(charSequence, collection, i5, z5, false);
    }

    @d5.d
    public static String a4(@d5.d String str, @d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("踥"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踦"));
        if (!d5(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("踧"));
        return substring;
    }

    public static final boolean a5(@d5.d CharSequence charSequence, @d5.d CharSequence charSequence2, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踨"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("踩"));
        return (!z5 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? e0.s2((String) charSequence, (String) charSequence2, false, 2, null) : Y3(charSequence, 0, charSequence2, 0, charSequence2.length(), z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, String> b3(CharSequence charSequence, Collection<String> collection, int i5, boolean z5, boolean z6) {
        IntProgression k02;
        Object obj;
        Object obj2;
        Object f52;
        if (!z5 && collection.size() == 1) {
            f52 = kotlin.collections.j0.f5(collection);
            String str = (String) f52;
            int p32 = !z6 ? p3(charSequence, str, i5, false, 4, null) : D3(charSequence, str, i5, false, 4, null);
            if (p32 < 0) {
                return null;
            }
            return new Pair<>(Integer.valueOf(p32), str);
        }
        if (z6) {
            int g32 = g3(charSequence);
            if (i5 > g32) {
                i5 = g32;
            }
            k02 = kotlin.ranges.u.k0(i5, 0);
        } else {
            if (i5 < 0) {
                i5 = 0;
            }
            k02 = new IntRange(i5, charSequence.length());
        }
        if (charSequence instanceof String) {
            int f23724o = k02.getF23724o();
            int f23725p = k02.getF23725p();
            int f23726q = k02.getF23726q();
            if ((f23726q > 0 && f23724o <= f23725p) || (f23726q < 0 && f23725p <= f23724o)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (e0.b2(str2, 0, (String) charSequence, f23724o, str2.length(), z5)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (f23724o == f23725p) {
                            break;
                        }
                        f23724o += f23726q;
                    } else {
                        return new Pair<>(Integer.valueOf(f23724o), str3);
                    }
                }
            }
        } else {
            int f23724o2 = k02.getF23724o();
            int f23725p2 = k02.getF23725p();
            int f23726q2 = k02.getF23726q();
            if ((f23726q2 > 0 && f23724o2 <= f23725p2) || (f23726q2 < 0 && f23725p2 <= f23724o2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (Y3(str4, 0, charSequence, f23724o2, str4.length(), z5)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (f23724o2 == f23725p2) {
                            break;
                        }
                        f23724o2 += f23726q2;
                    } else {
                        return new Pair<>(Integer.valueOf(f23724o2), str5);
                    }
                }
            }
        }
        return null;
    }

    @d5.d
    public static final CharSequence b4(@d5.d CharSequence charSequence, int i5, int i6) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踪"));
        if (i6 < i5) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("踬") + i6 + ProtectedSandApp.s("踭") + i5 + ProtectedSandApp.s("踮"));
        }
        if (i6 == i5) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i6 - i5));
        sb.append(charSequence, 0, i5);
        String s5 = ProtectedSandApp.s("踫");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append(charSequence, i6, charSequence.length());
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    public static /* synthetic */ boolean b5(CharSequence charSequence, char c6, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return Y4(charSequence, c6, z5);
    }

    public static /* synthetic */ Pair c3(CharSequence charSequence, Collection collection, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return a3(charSequence, collection, i5, z5);
    }

    @d5.d
    public static final CharSequence c4(@d5.d CharSequence charSequence, @d5.d IntRange intRange) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踯"));
        kotlin.jvm.internal.l0.p(intRange, ProtectedSandApp.s("踰"));
        return b4(charSequence, intRange.f().intValue(), kotlin.collections.r.a(intRange, 1));
    }

    public static /* synthetic */ boolean c5(CharSequence charSequence, CharSequence charSequence2, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return Z4(charSequence, charSequence2, i5, z5);
    }

    @d5.e
    public static final Pair<Integer, String> d3(@d5.d CharSequence charSequence, @d5.d Collection<String> collection, int i5, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踱"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("踲"));
        return b3(charSequence, collection, i5, z5, true);
    }

    @InlineOnly
    private static final String d4(String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("踳"));
        return b4(str, i5, i6).toString();
    }

    public static /* synthetic */ boolean d5(CharSequence charSequence, CharSequence charSequence2, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return a5(charSequence, charSequence2, z5);
    }

    public static /* synthetic */ Pair e3(CharSequence charSequence, Collection collection, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = g3(charSequence);
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return d3(charSequence, collection, i5, z5);
    }

    @InlineOnly
    private static final String e4(String str, IntRange intRange) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("踴"));
        kotlin.jvm.internal.l0.p(intRange, ProtectedSandApp.s("踵"));
        return c4(str, intRange).toString();
    }

    @d5.d
    public static final CharSequence e5(@d5.d CharSequence charSequence, @d5.d IntRange intRange) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踶"));
        kotlin.jvm.internal.l0.p(intRange, ProtectedSandApp.s("踷"));
        return charSequence.subSequence(intRange.f().intValue(), intRange.p().intValue() + 1);
    }

    @d5.d
    public static IntRange f3(@d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踸"));
        return new IntRange(0, charSequence.length() - 1);
    }

    @d5.d
    public static final CharSequence f4(@d5.d CharSequence charSequence, @d5.d CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踹"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("踺"));
        return Z2(charSequence, charSequence2, false, 2, null) ? charSequence.subSequence(0, charSequence.length() - charSequence2.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @Deprecated(message = "Use parameters named startIndex and endIndex.", replaceWith = @ReplaceWith(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    @InlineOnly
    private static final CharSequence f5(String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("踻"));
        return str.subSequence(i5, i6);
    }

    public static int g3(@d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踼"));
        return charSequence.length() - 1;
    }

    @d5.d
    public static String g4(@d5.d String str, @d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("踽"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("踾"));
        if (!Z2(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("踿"));
        return substring;
    }

    @InlineOnly
    private static final String g5(CharSequence charSequence, int i5, int i6) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹀"));
        return charSequence.subSequence(i5, i6).toString();
    }

    public static final boolean h3(@d5.d CharSequence charSequence, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹁"));
        return new IntRange(0, charSequence.length() + (-2)).v(i5) && Character.isHighSurrogate(charSequence.charAt(i5)) && Character.isLowSurrogate(charSequence.charAt(i5 + 1));
    }

    @d5.d
    public static final CharSequence h4(@d5.d CharSequence charSequence, @d5.d CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹂"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("蹃"));
        return i4(charSequence, charSequence2, charSequence2);
    }

    @d5.d
    public static final String h5(@d5.d CharSequence charSequence, @d5.d IntRange intRange) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹄"));
        kotlin.jvm.internal.l0.p(intRange, ProtectedSandApp.s("蹅"));
        return charSequence.subSequence(intRange.f().intValue(), intRange.p().intValue() + 1).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <C extends CharSequence & R, R> R i3(C c6, q3.a<? extends R> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("蹆"));
        return e0.S1(c6) ? aVar.n() : c6;
    }

    @d5.d
    public static final CharSequence i4(@d5.d CharSequence charSequence, @d5.d CharSequence charSequence2, @d5.d CharSequence charSequence3) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹇"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("蹈"));
        kotlin.jvm.internal.l0.p(charSequence3, ProtectedSandApp.s("蹉"));
        return (charSequence.length() >= charSequence3.length() + charSequence2.length() && d5(charSequence, charSequence2, false, 2, null) && Z2(charSequence, charSequence3, false, 2, null)) ? charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @d5.d
    public static final String i5(@d5.d String str, @d5.d IntRange intRange) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹊"));
        kotlin.jvm.internal.l0.p(intRange, ProtectedSandApp.s("蹋"));
        String substring = str.substring(intRange.f().intValue(), intRange.p().intValue() + 1);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("蹌"));
        return substring;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <C extends CharSequence & R, R> R j3(C c6, q3.a<? extends R> aVar) {
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("蹍"));
        return c6.length() == 0 ? aVar.n() : c6;
    }

    @d5.d
    public static String j4(@d5.d String str, @d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹎"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹏"));
        return k4(str, charSequence, charSequence);
    }

    static /* synthetic */ String j5(CharSequence charSequence, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = charSequence.length();
        }
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹐"));
        return charSequence.subSequence(i5, i6).toString();
    }

    public static final int k3(@d5.d CharSequence charSequence, char c6, int i5, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹑"));
        return (z5 || !(charSequence instanceof String)) ? r3(charSequence, new char[]{c6}, i5, z5) : ((String) charSequence).indexOf(c6, i5);
    }

    @d5.d
    public static final String k4(@d5.d String str, @d5.d CharSequence charSequence, @d5.d CharSequence charSequence2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹒"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹓"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("蹔"));
        if (str.length() < charSequence2.length() + charSequence.length() || !d5(str, charSequence, false, 2, null) || !Z2(str, charSequence2, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("蹕"));
        return substring;
    }

    @d5.d
    public static final String k5(@d5.d String str, char c6, @d5.d String str2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹖"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蹗"));
        int o32 = o3(str, c6, 0, false, 6, null);
        if (o32 == -1) {
            return str2;
        }
        String substring = str.substring(o32 + 1, str.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("蹘"));
        return substring;
    }

    public static final int l3(@d5.d CharSequence charSequence, @d5.d String str, int i5, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹙"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹚"));
        return (z5 || !(charSequence instanceof String)) ? n3(charSequence, str, i5, charSequence.length(), z5, false, 16, null) : ((String) charSequence).indexOf(str, i5);
    }

    @InlineOnly
    private static final String l4(CharSequence charSequence, Regex regex, String str) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹛"));
        kotlin.jvm.internal.l0.p(regex, ProtectedSandApp.s("蹜"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹝"));
        return regex.m(charSequence, str);
    }

    @d5.d
    public static String l5(@d5.d String str, @d5.d String str2, @d5.d String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹞"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蹟"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("蹠"));
        int p32 = p3(str, str2, 0, false, 6, null);
        if (p32 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + p32, str.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("蹡"));
        return substring;
    }

    private static final int m3(CharSequence charSequence, CharSequence charSequence2, int i5, int i6, boolean z5, boolean z6) {
        IntProgression k02;
        if (z6) {
            int g32 = g3(charSequence);
            if (i5 > g32) {
                i5 = g32;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            k02 = kotlin.ranges.u.k0(i5, i6);
        } else {
            if (i5 < 0) {
                i5 = 0;
            }
            int length = charSequence.length();
            if (i6 > length) {
                i6 = length;
            }
            k02 = new IntRange(i5, i6);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int f23724o = k02.getF23724o();
            int f23725p = k02.getF23725p();
            int f23726q = k02.getF23726q();
            if ((f23726q <= 0 || f23724o > f23725p) && (f23726q >= 0 || f23725p > f23724o)) {
                return -1;
            }
            while (!e0.b2((String) charSequence2, 0, (String) charSequence, f23724o, charSequence2.length(), z5)) {
                if (f23724o == f23725p) {
                    return -1;
                }
                f23724o += f23726q;
            }
            return f23724o;
        }
        int f23724o2 = k02.getF23724o();
        int f23725p2 = k02.getF23725p();
        int f23726q2 = k02.getF23726q();
        if ((f23726q2 <= 0 || f23724o2 > f23725p2) && (f23726q2 >= 0 || f23725p2 > f23724o2)) {
            return -1;
        }
        while (!Y3(charSequence2, 0, charSequence, f23724o2, charSequence2.length(), z5)) {
            if (f23724o2 == f23725p2) {
                return -1;
            }
            f23724o2 += f23726q2;
        }
        return f23724o2;
    }

    @InlineOnly
    private static final String m4(CharSequence charSequence, Regex regex, q3.l<? super MatchResult, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹢"));
        kotlin.jvm.internal.l0.p(regex, ProtectedSandApp.s("蹣"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("蹤"));
        return regex.n(charSequence, lVar);
    }

    public static /* synthetic */ String m5(String str, char c6, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = str;
        }
        return k5(str, c6, str2);
    }

    static /* synthetic */ int n3(CharSequence charSequence, CharSequence charSequence2, int i5, int i6, boolean z5, boolean z6, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            z6 = false;
        }
        return m3(charSequence, charSequence2, i5, i6, z5, z6);
    }

    @d5.d
    public static final String n4(@d5.d String str, char c6, @d5.d String str2, @d5.d String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹥"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蹦"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("蹧"));
        int o32 = o3(str, c6, 0, false, 6, null);
        return o32 == -1 ? str3 : G4(str, o32 + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ String n5(String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str3 = str;
        }
        return l5(str, str2, str3);
    }

    public static /* synthetic */ int o3(CharSequence charSequence, char c6, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return k3(charSequence, c6, i5, z5);
    }

    @d5.d
    public static final String o4(@d5.d String str, @d5.d String str2, @d5.d String str3, @d5.d String str4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹨"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蹩"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("蹪"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("蹫"));
        int p32 = p3(str, str2, 0, false, 6, null);
        return p32 == -1 ? str4 : G4(str, str2.length() + p32, str.length(), str3).toString();
    }

    @d5.d
    public static String o5(@d5.d String str, char c6, @d5.d String str2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹬"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蹭"));
        int C3 = C3(str, c6, 0, false, 6, null);
        if (C3 == -1) {
            return str2;
        }
        String substring = str.substring(C3 + 1, str.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("蹮"));
        return substring;
    }

    public static /* synthetic */ int p3(CharSequence charSequence, String str, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return l3(charSequence, str, i5, z5);
    }

    public static /* synthetic */ String p4(String str, char c6, String str2, String str3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str3 = str;
        }
        return n4(str, c6, str2, str3);
    }

    @d5.d
    public static final String p5(@d5.d String str, @d5.d String str2, @d5.d String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹯"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蹰"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("蹱"));
        int D3 = D3(str, str2, 0, false, 6, null);
        if (D3 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + D3, str.length());
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("蹲"));
        return substring;
    }

    public static final int q3(@d5.d CharSequence charSequence, @d5.d Collection<String> collection, int i5, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹳"));
        kotlin.jvm.internal.l0.p(collection, ProtectedSandApp.s("蹴"));
        Pair<Integer, String> b32 = b3(charSequence, collection, i5, z5, false);
        if (b32 != null) {
            return b32.e().intValue();
        }
        return -1;
    }

    public static /* synthetic */ String q4(String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str4 = str;
        }
        return o4(str, str2, str3, str4);
    }

    public static /* synthetic */ String q5(String str, char c6, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = str;
        }
        return o5(str, c6, str2);
    }

    public static final int r3(@d5.d CharSequence charSequence, @d5.d char[] cArr, int i5, boolean z5) {
        boolean z6;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("蹵"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("蹶"));
        if (!z5 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.t.Vs(cArr), i5);
        }
        if (i5 < 0) {
            i5 = 0;
        }
        IntIterator it = new IntRange(i5, g3(charSequence)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            int length = cArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    z6 = false;
                    break;
                }
                if (kotlin.text.e.J(cArr[i6], charAt, z5)) {
                    z6 = true;
                    break;
                }
                i6++;
            }
            if (z6) {
                return nextInt;
            }
        }
        return -1;
    }

    @d5.d
    public static final String r4(@d5.d String str, char c6, @d5.d String str2, @d5.d String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹷"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蹸"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("蹹"));
        int C3 = C3(str, c6, 0, false, 6, null);
        return C3 == -1 ? str3 : G4(str, C3 + 1, str.length(), str2).toString();
    }

    public static /* synthetic */ String r5(String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str3 = str;
        }
        return p5(str, str2, str3);
    }

    public static /* synthetic */ int s3(CharSequence charSequence, Collection collection, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return q3(charSequence, collection, i5, z5);
    }

    @d5.d
    public static final String s4(@d5.d String str, @d5.d String str2, @d5.d String str3, @d5.d String str4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹺"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蹻"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("蹼"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("蹽"));
        int D3 = D3(str, str2, 0, false, 6, null);
        return D3 == -1 ? str4 : G4(str, str2.length() + D3, str.length(), str3).toString();
    }

    @d5.d
    public static final String s5(@d5.d String str, char c6, @d5.d String str2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蹾"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蹿"));
        int o32 = o3(str, c6, 0, false, 6, null);
        if (o32 == -1) {
            return str2;
        }
        String substring = str.substring(0, o32);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("躀"));
        return substring;
    }

    public static /* synthetic */ int t3(CharSequence charSequence, char[] cArr, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return r3(charSequence, cArr, i5, z5);
    }

    public static /* synthetic */ String t4(String str, char c6, String str2, String str3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str3 = str;
        }
        return r4(str, c6, str2, str3);
    }

    @d5.d
    public static final String t5(@d5.d String str, @d5.d String str2, @d5.d String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("躁"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("躂"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("躃"));
        int p32 = p3(str, str2, 0, false, 6, null);
        if (p32 == -1) {
            return str3;
        }
        String substring = str.substring(0, p32);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("躄"));
        return substring;
    }

    @InlineOnly
    private static final boolean u3(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躅"));
        return charSequence.length() == 0;
    }

    public static /* synthetic */ String u4(String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str4 = str;
        }
        return s4(str, str2, str3, str4);
    }

    public static /* synthetic */ String u5(String str, char c6, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = str;
        }
        return s5(str, c6, str2);
    }

    @InlineOnly
    private static final boolean v3(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躆"));
        return !e0.S1(charSequence);
    }

    @d5.d
    public static final String v4(@d5.d String str, char c6, @d5.d String str2, @d5.d String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("躇"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("躈"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("躉"));
        int o32 = o3(str, c6, 0, false, 6, null);
        return o32 == -1 ? str3 : G4(str, 0, o32, str2).toString();
    }

    public static /* synthetic */ String v5(String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str3 = str;
        }
        return t5(str, str2, str3);
    }

    @InlineOnly
    private static final boolean w3(CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躊"));
        return charSequence.length() > 0;
    }

    @d5.d
    public static final String w4(@d5.d String str, @d5.d String str2, @d5.d String str3, @d5.d String str4) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("躋"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("躌"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("躍"));
        kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("躎"));
        int p32 = p3(str, str2, 0, false, 6, null);
        return p32 == -1 ? str4 : G4(str, 0, p32, str3).toString();
    }

    @d5.d
    public static final String w5(@d5.d String str, char c6, @d5.d String str2) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("躏"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("躐"));
        int C3 = C3(str, c6, 0, false, 6, null);
        if (C3 == -1) {
            return str2;
        }
        String substring = str.substring(0, C3);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("躑"));
        return substring;
    }

    @InlineOnly
    private static final boolean x3(CharSequence charSequence) {
        return charSequence == null || e0.S1(charSequence);
    }

    public static /* synthetic */ String x4(String str, char c6, String str2, String str3, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str3 = str;
        }
        return v4(str, c6, str2, str3);
    }

    @d5.d
    public static String x5(@d5.d String str, @d5.d String str2, @d5.d String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("躒"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("躓"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("躔"));
        int D3 = D3(str, str2, 0, false, 6, null);
        if (D3 == -1) {
            return str3;
        }
        String substring = str.substring(0, D3);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("躕"));
        return substring;
    }

    @InlineOnly
    private static final boolean y3(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static /* synthetic */ String y4(String str, String str2, String str3, String str4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            str4 = str;
        }
        return w4(str, str2, str3, str4);
    }

    public static /* synthetic */ String y5(String str, char c6, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = str;
        }
        return w5(str, c6, str2);
    }

    @d5.d
    public static final CharIterator z3(@d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("躖"));
        return new a(charSequence);
    }

    @d5.d
    public static final String z4(@d5.d String str, char c6, @d5.d String str2, @d5.d String str3) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("躗"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("躘"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("躙"));
        int C3 = C3(str, c6, 0, false, 6, null);
        return C3 == -1 ? str3 : G4(str, 0, C3, str2).toString();
    }

    public static /* synthetic */ String z5(String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str3 = str;
        }
        return x5(str, str2, str3);
    }
}
