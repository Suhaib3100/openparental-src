package kotlin.comparisons;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.apache.log4j.net.SyslogAppender;
import q3.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Comparisons.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001aY\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\t\u001aZ\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001a>\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001aZ\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001a-\u0010\r\u001a\u00020\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u000f\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0010\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0011\u001aA\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aY\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0014\u001a]\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001aG\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022 \u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001a&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a-\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a-\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0087\b\u001a@\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a&\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a0\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\u001aO\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004\u001aR\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001an\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001aR\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\u0087\bø\u0001\u0000\u001an\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\u0087\bø\u0001\u0000\u001ap\u0010!\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u000328\b\u0004\u0010\"\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000e0#H\u0087\bø\u0001\u0000\u001aO\u0010&\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0086\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'"}, d2 = {"compareBy", "Ljava/util/Comparator;", "T", "Lkotlin/Comparator;", "selector", "Lkotlin/Function1;", "", "selectors", "", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "compareByDescending", "compareValues", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "naturalOrder", "nullsFirst", "", "nullsLast", "reverseOrder", "reversed", "then", "thenBy", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thenDescending", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes5.dex */
public class g {

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class a<T> implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.l<T, Comparable<?>> f23255o;

        /* JADX WARN: Multi-variable type inference failed */
        public a(q3.l<? super T, ? extends Comparable<?>> lVar) {
            this.f23255o = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            q3.l<T, Comparable<?>> lVar = this.f23255o;
            return g.l(lVar.N(t5), lVar.N(t6));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    public static final class b<T> implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f23256o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.l<T, K> f23257p;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Comparator<? super K> comparator, q3.l<? super T, ? extends K> lVar) {
            this.f23256o = comparator;
            this.f23257p = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            Comparator<? super K> comparator = this.f23256o;
            q3.l<T, K> lVar = this.f23257p;
            return comparator.compare(lVar.N(t5), lVar.N(t6));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class c<T> implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ q3.l<T, Comparable<?>> f23258o;

        /* JADX WARN: Multi-variable type inference failed */
        public c(q3.l<? super T, ? extends Comparable<?>> lVar) {
            this.f23258o = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            q3.l<T, Comparable<?>> lVar = this.f23258o;
            return g.l(lVar.N(t6), lVar.N(t5));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class d<T> implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f23259o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.l<T, K> f23260p;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Comparator<? super K> comparator, q3.l<? super T, ? extends K> lVar) {
            this.f23259o = comparator;
            this.f23260p = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            Comparator<? super K> comparator = this.f23259o;
            q3.l<T, K> lVar = this.f23260p;
            return comparator.compare(lVar.N(t6), lVar.N(t5));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    public static final class e<T> implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f23261o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.l<T, Comparable<?>> f23262p;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<T> comparator, q3.l<? super T, ? extends Comparable<?>> lVar) {
            this.f23261o = comparator;
            this.f23262p = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int compare = this.f23261o.compare(t5, t6);
            if (compare != 0) {
                return compare;
            }
            q3.l<T, Comparable<?>> lVar = this.f23262p;
            return g.l(lVar.N(t5), lVar.N(t6));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class f<T> implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f23263o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f23264p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ q3.l<T, K> f23265q;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Comparator<T> comparator, Comparator<? super K> comparator2, q3.l<? super T, ? extends K> lVar) {
            this.f23263o = comparator;
            this.f23264p = comparator2;
            this.f23265q = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int compare = this.f23263o.compare(t5, t6);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f23264p;
            q3.l<T, K> lVar = this.f23265q;
            return comparator.compare(lVar.N(t5), lVar.N(t6));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$g, reason: collision with other inner class name */
    public static final class C0253g<T> implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f23266o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ q3.l<T, Comparable<?>> f23267p;

        /* JADX WARN: Multi-variable type inference failed */
        public C0253g(Comparator<T> comparator, q3.l<? super T, ? extends Comparable<?>> lVar) {
            this.f23266o = comparator;
            this.f23267p = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int compare = this.f23266o.compare(t5, t6);
            if (compare != 0) {
                return compare;
            }
            q3.l<T, Comparable<?>> lVar = this.f23267p;
            return g.l(lVar.N(t6), lVar.N(t5));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class h<T> implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f23268o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f23269p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ q3.l<T, K> f23270q;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Comparator<T> comparator, Comparator<? super K> comparator2, q3.l<? super T, ? extends K> lVar) {
            this.f23268o = comparator;
            this.f23269p = comparator2;
            this.f23270q = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int compare = this.f23268o.compare(t5, t6);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f23269p;
            q3.l<T, K> lVar = this.f23270q;
            return comparator.compare(lVar.N(t6), lVar.N(t5));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    public static final class i<T> implements Comparator {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f23271o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<T, T, Integer> f23272p;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
            this.f23271o = comparator;
            this.f23272p = pVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t5, T t6) {
            int compare = this.f23271o.compare(t5, t6);
            return compare != 0 ? compare : this.f23272p.g0(t5, t6).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        l0.p(comparator, ProtectedSandApp.s("㸜"));
        l0.p(comparator2, ProtectedSandApp.s("㸝"));
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj, obj2);
    }

    @InlineOnly
    private static final <T, K> Comparator<T> B(Comparator<T> comparator, Comparator<? super K> comparator2, q3.l<? super T, ? extends K> lVar) {
        l0.p(comparator, ProtectedSandApp.s("㸞"));
        l0.p(comparator2, ProtectedSandApp.s("㸟"));
        l0.p(lVar, ProtectedSandApp.s("㸠"));
        return new f(comparator, comparator2, lVar);
    }

    @InlineOnly
    private static final <T> Comparator<T> C(Comparator<T> comparator, q3.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(comparator, ProtectedSandApp.s("㸡"));
        l0.p(lVar, ProtectedSandApp.s("㸢"));
        return new e(comparator, lVar);
    }

    @InlineOnly
    private static final <T, K> Comparator<T> D(Comparator<T> comparator, Comparator<? super K> comparator2, q3.l<? super T, ? extends K> lVar) {
        l0.p(comparator, ProtectedSandApp.s("㸣"));
        l0.p(comparator2, ProtectedSandApp.s("㸤"));
        l0.p(lVar, ProtectedSandApp.s("㸥"));
        return new h(comparator, comparator2, lVar);
    }

    @InlineOnly
    private static final <T> Comparator<T> E(Comparator<T> comparator, q3.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(comparator, ProtectedSandApp.s("㸦"));
        l0.p(lVar, ProtectedSandApp.s("㸧"));
        return new C0253g(comparator, lVar);
    }

    @InlineOnly
    private static final <T> Comparator<T> F(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
        l0.p(comparator, ProtectedSandApp.s("㸨"));
        l0.p(pVar, ProtectedSandApp.s("㸩"));
        return new i(comparator, pVar);
    }

    @d5.d
    public static final <T> Comparator<T> G(@d5.d final Comparator<T> comparator, @d5.d final Comparator<? super T> comparator2) {
        l0.p(comparator, ProtectedSandApp.s("㸪"));
        l0.p(comparator2, ProtectedSandApp.s("㸫"));
        return new Comparator() { // from class: kotlin.comparisons.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int H;
                H = g.H(comparator, comparator2, obj, obj2);
                return H;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        l0.p(comparator, ProtectedSandApp.s("㸬"));
        l0.p(comparator2, ProtectedSandApp.s("㸭"));
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj2, obj);
    }

    @InlineOnly
    private static final <T, K> Comparator<T> f(Comparator<? super K> comparator, q3.l<? super T, ? extends K> lVar) {
        l0.p(comparator, ProtectedSandApp.s("㸮"));
        l0.p(lVar, ProtectedSandApp.s("㸯"));
        return new b(comparator, lVar);
    }

    @InlineOnly
    private static final <T> Comparator<T> g(q3.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, ProtectedSandApp.s("㸰"));
        return new a(lVar);
    }

    @d5.d
    public static final <T> Comparator<T> h(@d5.d final q3.l<? super T, ? extends Comparable<?>>... lVarArr) {
        l0.p(lVarArr, ProtectedSandApp.s("㸱"));
        if (lVarArr.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i5;
                    i5 = g.i(lVarArr, obj, obj2);
                    return i5;
                }
            };
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㸲").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(q3.l[] lVarArr, Object obj, Object obj2) {
        l0.p(lVarArr, ProtectedSandApp.s("㸳"));
        return p(obj, obj2, lVarArr);
    }

    @InlineOnly
    private static final <T, K> Comparator<T> j(Comparator<? super K> comparator, q3.l<? super T, ? extends K> lVar) {
        l0.p(comparator, ProtectedSandApp.s("㸴"));
        l0.p(lVar, ProtectedSandApp.s("㸵"));
        return new d(comparator, lVar);
    }

    @InlineOnly
    private static final <T> Comparator<T> k(q3.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, ProtectedSandApp.s("㸶"));
        return new c(lVar);
    }

    public static <T extends Comparable<?>> int l(@d5.e T t5, @d5.e T t6) {
        if (t5 == t6) {
            return 0;
        }
        if (t5 == null) {
            return -1;
        }
        if (t6 == null) {
            return 1;
        }
        return t5.compareTo(t6);
    }

    @InlineOnly
    private static final <T, K> int m(T t5, T t6, Comparator<? super K> comparator, q3.l<? super T, ? extends K> lVar) {
        l0.p(comparator, ProtectedSandApp.s("㸷"));
        l0.p(lVar, ProtectedSandApp.s("㸸"));
        return comparator.compare(lVar.N(t5), lVar.N(t6));
    }

    @InlineOnly
    private static final <T> int n(T t5, T t6, q3.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, ProtectedSandApp.s("㸹"));
        return l(lVar.N(t5), lVar.N(t6));
    }

    public static final <T> int o(T t5, T t6, @d5.d q3.l<? super T, ? extends Comparable<?>>... lVarArr) {
        l0.p(lVarArr, ProtectedSandApp.s("㸺"));
        if (lVarArr.length > 0) {
            return p(t5, t6, lVarArr);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("㸻").toString());
    }

    private static final <T> int p(T t5, T t6, q3.l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (q3.l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int l5 = l(lVar.N(t5), lVar.N(t6));
            if (l5 != 0) {
                return l5;
            }
        }
        return 0;
    }

    @d5.d
    public static <T extends Comparable<? super T>> Comparator<T> q() {
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.f23273o;
        l0.n(naturalOrderComparator, ProtectedSandApp.s("㸼"));
        return naturalOrderComparator;
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> r() {
        return s(q());
    }

    @d5.d
    public static final <T> Comparator<T> s(@d5.d final Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("㸽"));
        return new Comparator() { // from class: kotlin.comparisons.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int t5;
                t5 = g.t(comparator, obj, obj2);
                return t5;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(Comparator comparator, Object obj, Object obj2) {
        l0.p(comparator, ProtectedSandApp.s("㸾"));
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> u() {
        return v(q());
    }

    @d5.d
    public static final <T> Comparator<T> v(@d5.d final Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("㸿"));
        return new Comparator() { // from class: kotlin.comparisons.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w5;
                w5 = g.w(comparator, obj, obj2);
                return w5;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(Comparator comparator, Object obj, Object obj2) {
        l0.p(comparator, ProtectedSandApp.s("㹀"));
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @d5.d
    public static <T extends Comparable<? super T>> Comparator<T> x() {
        ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.f23274o;
        l0.n(reverseOrderComparator, ProtectedSandApp.s("㹁"));
        return reverseOrderComparator;
    }

    @d5.d
    public static final <T> Comparator<T> y(@d5.d Comparator<T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("㹂"));
        if (comparator instanceof ReversedComparator) {
            return ((ReversedComparator) comparator).a();
        }
        Comparator<T> comparator2 = NaturalOrderComparator.f23273o;
        boolean g5 = l0.g(comparator, comparator2);
        String s5 = ProtectedSandApp.s("㹃");
        if (g5) {
            ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.f23274o;
            l0.n(reverseOrderComparator, s5);
            return reverseOrderComparator;
        }
        if (l0.g(comparator, ReverseOrderComparator.f23274o)) {
            l0.n(comparator2, s5);
        } else {
            comparator2 = new ReversedComparator<>(comparator);
        }
        return comparator2;
    }

    @d5.d
    public static final <T> Comparator<T> z(@d5.d final Comparator<T> comparator, @d5.d final Comparator<? super T> comparator2) {
        l0.p(comparator, ProtectedSandApp.s("㹄"));
        l0.p(comparator2, ProtectedSandApp.s("㹅"));
        return new Comparator() { // from class: kotlin.comparisons.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A;
                A = g.A(comparator, comparator2, obj, obj2);
                return A;
            }
        };
    }
}
