package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;

/* compiled from: PackageFragmentProvider.kt */
/* loaded from: classes5.dex */
public interface m0 {
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @d5.d
    List<l0> a(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    @d5.d
    Collection<kotlin.reflect.jvm.internal.impl.name.c> t(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);
}
