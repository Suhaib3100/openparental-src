package kotlin.comparisons;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import ld.p;
import org.apache.log4j.net.SyslogAppender;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Comparisons.kt */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\n\u001a[\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002 \u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003H\u0002¢\u0006\u0004\b\n\u0010\t\u001aC\u0010\f\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a_\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e2\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0014\u001a\u00020\u0007\"\f\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a[\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017\u001aE\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001aa\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aE\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019\u001aa\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001b\u001aY\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001b\u001au\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aY\u0010!\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001b\u001au\u0010\"\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000e*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0001`\u00102\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\"\u0010 \u001aw\u0010'\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u001028\b\u0004\u0010&\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00070#H\u0087\bø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aV\u0010)\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010H\u0086\u0004¢\u0006\u0004\b)\u0010*\u001aV\u0010+\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010H\u0086\u0004¢\u0006\u0004\b+\u0010*\u001aG\u0010-\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\b\b\u0000\u0010\u0000*\u00020,2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010¢\u0006\u0004\b-\u0010.\u001a4\u0010/\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0087\b¢\u0006\u0004\b/\u00100\u001aG\u00101\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\b\b\u0000\u0010\u0000*\u00020,2\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u000fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0010¢\u0006\u0004\b1\u0010.\u001a4\u00102\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0087\b¢\u0006\u0004\b2\u00100\u001a-\u00103\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b3\u00100\u001a-\u00104\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b4\u00100\u001a7\u00105\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u000fj\b\u0012\u0004\u0012\u00028\u0000`\u0010¢\u0006\u0004\b5\u0010.\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00066"}, d2 = {"T", "a", "b", "", "Lkotlin/Function1;", "", "selectors", "", "o", "(Ljava/lang/Object;Ljava/lang/Object;[Lld/l;)I", "p", "selector", "n", "(Ljava/lang/Object;Ljava/lang/Object;Lld/l;)I", "K", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "m", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lld/l;)I", "l", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "h", "([Lld/l;)Ljava/util/Comparator;", "g", "(Lld/l;)Ljava/util/Comparator;", "f", "(Ljava/util/Comparator;Lld/l;)Ljava/util/Comparator;", "k", "j", "C", "B", "(Ljava/util/Comparator;Ljava/util/Comparator;Lld/l;)Ljava/util/Comparator;", "E", "D", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "comparison", "F", "(Ljava/util/Comparator;Lld/p;)Ljava/util/Comparator;", "z", "(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;", "G", "", "s", "(Ljava/util/Comparator;)Ljava/util/Comparator;", "r", "()Ljava/util/Comparator;", "v", "u", "q", "x", "y", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes7.dex */
public class g {

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class a<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Comparable<?>> f75018b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ld.l<? super T, ? extends Comparable<?>> lVar) {
            this.f75018b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            ld.l<T, Comparable<?>> lVar = this.f75018b;
            return g.l(lVar.invoke(t4), lVar.invoke(t5));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    public static final class b<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f75019b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<T, K> f75020c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Comparator<? super K> comparator, ld.l<? super T, ? extends K> lVar) {
            this.f75019b = comparator;
            this.f75020c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            Comparator<? super K> comparator = this.f75019b;
            ld.l<T, K> lVar = this.f75020c;
            return comparator.compare(lVar.invoke(t4), lVar.invoke(t5));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class c<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Comparable<?>> f75021b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(ld.l<? super T, ? extends Comparable<?>> lVar) {
            this.f75021b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            ld.l<T, Comparable<?>> lVar = this.f75021b;
            return g.l(lVar.invoke(t5), lVar.invoke(t4));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class d<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f75022b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<T, K> f75023c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Comparator<? super K> comparator, ld.l<? super T, ? extends K> lVar) {
            this.f75022b = comparator;
            this.f75023c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            Comparator<? super K> comparator = this.f75022b;
            ld.l<T, K> lVar = this.f75023c;
            return comparator.compare(lVar.invoke(t5), lVar.invoke(t4));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    public static final class e<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f75024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Comparable<?>> f75025c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<T> comparator, ld.l<? super T, ? extends Comparable<?>> lVar) {
            this.f75024b = comparator;
            this.f75025c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int compare = this.f75024b.compare(t4, t5);
            if (compare != 0) {
                return compare;
            }
            ld.l<T, Comparable<?>> lVar = this.f75025c;
            return g.l(lVar.invoke(t4), lVar.invoke(t5));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class f<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f75026b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f75027c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<T, K> f75028d;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Comparator<T> comparator, Comparator<? super K> comparator2, ld.l<? super T, ? extends K> lVar) {
            this.f75026b = comparator;
            this.f75027c = comparator2;
            this.f75028d = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int compare = this.f75026b.compare(t4, t5);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f75027c;
            ld.l<T, K> lVar = this.f75028d;
            return comparator.compare(lVar.invoke(t4), lVar.invoke(t5));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$g, reason: collision with other inner class name */
    public static final class C1052g<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f75029b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<T, Comparable<?>> f75030c;

        /* JADX WARN: Multi-variable type inference failed */
        public C1052g(Comparator<T> comparator, ld.l<? super T, ? extends Comparable<?>> lVar) {
            this.f75029b = comparator;
            this.f75030c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int compare = this.f75029b.compare(t4, t5);
            if (compare != 0) {
                return compare;
            }
            ld.l<T, Comparable<?>> lVar = this.f75030c;
            return g.l(lVar.invoke(t5), lVar.invoke(t4));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "T", "K", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class h<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f75031b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f75032c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.l<T, K> f75033d;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Comparator<T> comparator, Comparator<? super K> comparator2, ld.l<? super T, ? extends K> lVar) {
            this.f75031b = comparator;
            this.f75032c = comparator2;
            this.f75033d = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int compare = this.f75031b.compare(t4, t5);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f75032c;
            ld.l<T, K> lVar = this.f75033d;
            return comparator.compare(lVar.invoke(t5), lVar.invoke(t4));
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I"}, k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    public static final class i<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f75034b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<T, T, Integer> f75035c;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
            this.f75034b = comparator;
            this.f75035c = pVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t4, T t5) {
            int compare = this.f75034b.compare(t4, t5);
            return compare != 0 ? compare : this.f75035c.invoke(t4, t5).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        l0.p(comparator, ProtectedSandApp.s("拌\u0001"));
        l0.p(comparator2, ProtectedSandApp.s("拍\u0001"));
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj, obj2);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> B(Comparator<T> comparator, Comparator<? super K> comparator2, ld.l<? super T, ? extends K> lVar) {
        l0.p(comparator, ProtectedSandApp.s("拎\u0001"));
        l0.p(comparator2, ProtectedSandApp.s("拏\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拐\u0001"));
        return new f(comparator, comparator2, lVar);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> C(Comparator<T> comparator, ld.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(comparator, ProtectedSandApp.s("拎\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拐\u0001"));
        return new e(comparator, lVar);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> D(Comparator<T> comparator, Comparator<? super K> comparator2, ld.l<? super T, ? extends K> lVar) {
        l0.p(comparator, ProtectedSandApp.s("拎\u0001"));
        l0.p(comparator2, ProtectedSandApp.s("拏\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拐\u0001"));
        return new h(comparator, comparator2, lVar);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> E(Comparator<T> comparator, ld.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(comparator, ProtectedSandApp.s("拎\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拐\u0001"));
        return new C1052g(comparator, lVar);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> F(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
        l0.p(comparator, ProtectedSandApp.s("拎\u0001"));
        l0.p(pVar, ProtectedSandApp.s("拑\u0001"));
        return new i(comparator, pVar);
    }

    @fg.l
    public static final <T> Comparator<T> G(@fg.l final Comparator<T> comparator, @fg.l final Comparator<? super T> comparator2) {
        l0.p(comparator, ProtectedSandApp.s("拎\u0001"));
        l0.p(comparator2, ProtectedSandApp.s("拏\u0001"));
        return new Comparator() { // from class: kotlin.comparisons.c
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
        l0.p(comparator, ProtectedSandApp.s("拒\u0001"));
        l0.p(comparator2, ProtectedSandApp.s("拍\u0001"));
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj2, obj);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> f(Comparator<? super K> comparator, ld.l<? super T, ? extends K> lVar) {
        l0.p(comparator, ProtectedSandApp.s("拏\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拐\u0001"));
        return new b(comparator, lVar);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> g(ld.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, ProtectedSandApp.s("拐\u0001"));
        return new a(lVar);
    }

    @fg.l
    public static <T> Comparator<T> h(@fg.l final ld.l<? super T, ? extends Comparable<?>>... lVarArr) {
        l0.p(lVarArr, ProtectedSandApp.s("拓\u0001"));
        if (lVarArr.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i4;
                    i4 = g.i(lVarArr, obj, obj2);
                    return i4;
                }
            };
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("拔\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(ld.l[] lVarArr, Object obj, Object obj2) {
        l0.p(lVarArr, ProtectedSandApp.s("拕\u0001"));
        return p(obj, obj2, lVarArr);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> j(Comparator<? super K> comparator, ld.l<? super T, ? extends K> lVar) {
        l0.p(comparator, ProtectedSandApp.s("拏\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拐\u0001"));
        return new d(comparator, lVar);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> k(ld.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, ProtectedSandApp.s("拐\u0001"));
        return new c(lVar);
    }

    public static <T extends Comparable<?>> int l(@fg.m T t4, @fg.m T t5) {
        if (t4 == t5) {
            return 0;
        }
        if (t4 == null) {
            return -1;
        }
        if (t5 == null) {
            return 1;
        }
        return t4.compareTo(t5);
    }

    @kotlin.internal.f
    private static final <T, K> int m(T t4, T t5, Comparator<? super K> comparator, ld.l<? super T, ? extends K> lVar) {
        l0.p(comparator, ProtectedSandApp.s("拏\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拐\u0001"));
        return comparator.compare(lVar.invoke(t4), lVar.invoke(t5));
    }

    @kotlin.internal.f
    private static final <T> int n(T t4, T t5, ld.l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, ProtectedSandApp.s("拐\u0001"));
        return l(lVar.invoke(t4), lVar.invoke(t5));
    }

    public static <T> int o(T t4, T t5, @fg.l ld.l<? super T, ? extends Comparable<?>>... lVarArr) {
        l0.p(lVarArr, ProtectedSandApp.s("拓\u0001"));
        if (lVarArr.length > 0) {
            return p(t4, t5, lVarArr);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("拔\u0001"));
    }

    private static final <T> int p(T t4, T t5, ld.l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (ld.l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int l4 = l(lVar.invoke(t4), lVar.invoke(t5));
            if (l4 != 0) {
                return l4;
            }
        }
        return 0;
    }

    @fg.l
    public static <T extends Comparable<? super T>> Comparator<T> q() {
        j jVar = j.f75036b;
        l0.n(jVar, ProtectedSandApp.s("拖\u0001"));
        return jVar;
    }

    @kotlin.internal.f
    private static final <T extends Comparable<? super T>> Comparator<T> r() {
        return s(q());
    }

    @fg.l
    public static final <T> Comparator<T> s(@fg.l final Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("拏\u0001"));
        return new Comparator() { // from class: kotlin.comparisons.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int t4;
                t4 = g.t(comparator, obj, obj2);
                return t4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(Comparator comparator, Object obj, Object obj2) {
        l0.p(comparator, ProtectedSandApp.s("拍\u0001"));
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

    @kotlin.internal.f
    private static final <T extends Comparable<? super T>> Comparator<T> u() {
        return v(q());
    }

    @fg.l
    public static final <T> Comparator<T> v(@fg.l final Comparator<? super T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("拏\u0001"));
        return new Comparator() { // from class: kotlin.comparisons.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w4;
                w4 = g.w(comparator, obj, obj2);
                return w4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(Comparator comparator, Object obj, Object obj2) {
        l0.p(comparator, ProtectedSandApp.s("拍\u0001"));
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

    @fg.l
    public static <T extends Comparable<? super T>> Comparator<T> x() {
        k kVar = k.f75037b;
        l0.n(kVar, ProtectedSandApp.s("拗\u0001"));
        return kVar;
    }

    @fg.l
    public static final <T> Comparator<T> y(@fg.l Comparator<T> comparator) {
        l0.p(comparator, ProtectedSandApp.s("拎\u0001"));
        if (comparator instanceof l) {
            return ((l) comparator).a();
        }
        Comparator<T> comparator2 = j.f75036b;
        boolean g4 = l0.g(comparator, comparator2);
        String s4 = ProtectedSandApp.s("拘\u0001");
        if (g4) {
            k kVar = k.f75037b;
            l0.n(kVar, s4);
            return kVar;
        }
        if (l0.g(comparator, k.f75037b)) {
            l0.n(comparator2, s4);
        } else {
            comparator2 = new l<>(comparator);
        }
        return comparator2;
    }

    @fg.l
    public static final <T> Comparator<T> z(@fg.l final Comparator<T> comparator, @fg.l final Comparator<? super T> comparator2) {
        l0.p(comparator, ProtectedSandApp.s("拎\u0001"));
        l0.p(comparator2, ProtectedSandApp.s("拏\u0001"));
        return new Comparator() { // from class: kotlin.comparisons.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A;
                A = g.A(comparator, comparator2, obj, obj2);
                return A;
            }
        };
    }
}
