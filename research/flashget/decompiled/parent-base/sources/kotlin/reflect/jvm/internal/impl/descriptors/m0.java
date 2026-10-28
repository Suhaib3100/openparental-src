package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;

/* compiled from: PackageFragmentProvider.kt */
/* loaded from: classes7.dex */
public interface m0 {
    @fg.l
    @kotlin.k(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    List<l0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar);

    @fg.l
    Collection<kotlin.reflect.jvm.internal.impl.name.c> z(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar);
}
