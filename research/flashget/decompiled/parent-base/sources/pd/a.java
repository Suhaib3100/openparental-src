package pd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.collections.j0;
import kotlin.collections.l1;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.o2;
import kotlin.r;
import kotlin.sequences.m;
import kotlin.sequences.p;

/* compiled from: Optionals.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\f\u0012\b\b\u0001\u0012\u0004\b\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00028\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a8\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0001*\f\u0012\b\b\u0001\u0012\u0004\b\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u000e\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b9\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"", "T", "Ljava/util/Optional;", "d", "(Ljava/util/Optional;)Ljava/lang/Object;", "defaultValue", "b", "(Ljava/util/Optional;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function0;", "c", "(Ljava/util/Optional;Lld/a;)Ljava/lang/Object;", "", "C", "destination", "e", "(Ljava/util/Optional;Ljava/util/Collection;)Ljava/util/Collection;", "", "f", "(Ljava/util/Optional;)Ljava/util/List;", "", "g", "(Ljava/util/Optional;)Ljava/util/Set;", "Lkotlin/sequences/m;", "a", "(Ljava/util/Optional;)Lkotlin/sequences/m;", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {
    @l
    @o2(markerClass = {r.class})
    @c1(version = "1.8")
    public static final <T> m<T> a(@l Optional<? extends T> optional) {
        l0.p(optional, ProtectedSandApp.s("ꋲ\u0001"));
        return optional.isPresent() ? p.q(optional.get()) : p.g();
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.8")
    public static final <T> T b(@l Optional<? extends T> optional, T t4) {
        l0.p(optional, ProtectedSandApp.s("ꋲ\u0001"));
        return optional.isPresent() ? optional.get() : t4;
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.8")
    public static final <T> T c(@l Optional<? extends T> optional, @l ld.a<? extends T> aVar) {
        l0.p(optional, ProtectedSandApp.s("ꋲ\u0001"));
        l0.p(aVar, ProtectedSandApp.s("ꋳ\u0001"));
        return optional.isPresent() ? optional.get() : aVar.invoke();
    }

    @o2(markerClass = {r.class})
    @fg.m
    @c1(version = "1.8")
    public static final <T> T d(@l Optional<T> optional) {
        l0.p(optional, ProtectedSandApp.s("ꋲ\u0001"));
        return optional.orElse(null);
    }

    @l
    @o2(markerClass = {r.class})
    @c1(version = "1.8")
    public static final <T, C extends Collection<? super T>> C e(@l Optional<T> optional, @l C c5) {
        l0.p(optional, ProtectedSandApp.s("ꋲ\u0001"));
        l0.p(c5, ProtectedSandApp.s("ꋴ\u0001"));
        if (optional.isPresent()) {
            T t4 = optional.get();
            l0.o(t4, ProtectedSandApp.s("ꋵ\u0001"));
            c5.add(t4);
        }
        return c5;
    }

    @l
    @o2(markerClass = {r.class})
    @c1(version = "1.8")
    public static final <T> List<T> f(@l Optional<? extends T> optional) {
        l0.p(optional, ProtectedSandApp.s("ꋲ\u0001"));
        return optional.isPresent() ? w.k(optional.get()) : j0.f74919b;
    }

    @l
    @o2(markerClass = {r.class})
    @c1(version = "1.8")
    public static final <T> Set<T> g(@l Optional<? extends T> optional) {
        l0.p(optional, ProtectedSandApp.s("ꋲ\u0001"));
        return optional.isPresent() ? l1.f(optional.get()) : kotlin.collections.l0.f74939b;
    }
}
