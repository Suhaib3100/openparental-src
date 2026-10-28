package u3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.p1;
import kotlin.collections.z;
import kotlin.jvm.internal.l0;
import kotlin.sequences.Sequence;
import kotlin.sequences.p;
import kotlin.sequences.s;

/* compiled from: Optionals.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u001a,\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\f\u0012\b\b\u0001\u0012\u0004\b\u0002H\u00020\u00042\u0006\u0010\u0006\u001a\u0002H\u0002H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a6\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\f\u0012\b\b\u0001\u0012\u0004\b\u0002H\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a#\u0010\u000b\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0007¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0010\b\u0001\u0010\u000e*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u000f*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0010\u001a\u0002H\u000eH\u0007¢\u0006\u0002\u0010\u0011\u001a$\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0013\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u001a$\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\b\b\u0000\u0010\u0002*\u00020\u0003*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004H\u0007\u0082\u0002\u000b\n\u0002\b9\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "T", "", "Ljava/util/Optional;", "getOrDefault", "defaultValue", "(Ljava/util/Optional;Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(Ljava/util/Optional;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrNull", "(Ljava/util/Optional;)Ljava/lang/Object;", "toCollection", "C", "", "destination", "(Ljava/util/Optional;Ljava/util/Collection;)Ljava/util/Collection;", "toList", "", "toSet", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {
    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d
    public static final <T> Sequence<T> a(@d Optional<? extends T> optional) {
        Sequence<T> q5;
        l0.p(optional, ProtectedSandApp.s("様"));
        if (!optional.isPresent()) {
            return p.g();
        }
        q5 = s.q(optional.get());
        return q5;
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T b(@d Optional<? extends T> optional, T t5) {
        l0.p(optional, ProtectedSandApp.s("槙"));
        return optional.isPresent() ? optional.get() : t5;
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T c(@d Optional<? extends T> optional, @d q3.a<? extends T> aVar) {
        l0.p(optional, ProtectedSandApp.s("槚"));
        l0.p(aVar, ProtectedSandApp.s("槛"));
        return optional.isPresent() ? optional.get() : aVar.n();
    }

    @SinceKotlin(version = "1.8")
    @e
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T> T d(@d Optional<T> optional) {
        l0.p(optional, ProtectedSandApp.s("槜"));
        return optional.orElse(null);
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d
    public static final <T, C extends Collection<? super T>> C e(@d Optional<T> optional, @d C c6) {
        l0.p(optional, ProtectedSandApp.s("槝"));
        l0.p(c6, ProtectedSandApp.s("槞"));
        if (optional.isPresent()) {
            T t5 = optional.get();
            l0.o(t5, ProtectedSandApp.s("槟"));
            c6.add(t5);
        }
        return c6;
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d
    public static final <T> List<T> f(@d Optional<? extends T> optional) {
        List<T> k5;
        l0.p(optional, ProtectedSandApp.s("槠"));
        if (!optional.isPresent()) {
            return EmptyList.f23167o;
        }
        k5 = z.k(optional.get());
        return k5;
    }

    @SinceKotlin(version = "1.8")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d
    public static final <T> Set<T> g(@d Optional<? extends T> optional) {
        Set<T> f6;
        l0.p(optional, ProtectedSandApp.s("槡"));
        if (!optional.isPresent()) {
            return EmptySet.f23181o;
        }
        f6 = p1.f(optional.get());
        return f6;
    }
}
