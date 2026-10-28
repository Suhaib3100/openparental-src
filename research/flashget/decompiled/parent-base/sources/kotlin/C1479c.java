package kotlin;

import androidx.view.k1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* compiled from: InitializerViewModelFactory.kt */
@InterfaceC1483g
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\b\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Lm2/c;", "", "<init>", "()V", "Landroidx/lifecycle/h1;", "T", "Lkotlin/reflect/d;", "clazz", "Lkotlin/Function1;", "Lm2/a;", "Lkotlin/u;", "initializer", "Lkotlin/k2;", "a", "(Lkotlin/reflect/d;Lld/l;)V", "Landroidx/lifecycle/k1$b;", "b", "()Landroidx/lifecycle/k1$b;", "", "Lm2/h;", "Ljava/util/List;", "initializers", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
/* renamed from: m2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1479c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<C1484h<?>> initializers = new ArrayList();

    public final <T extends androidx.view.h1> void a(@fg.l kotlin.reflect.d<T> clazz, @fg.l ld.l<? super AbstractC1477a, ? extends T> initializer) {
        kotlin.jvm.internal.l0.p(clazz, "clazz");
        kotlin.jvm.internal.l0.p(initializer, "initializer");
        this.initializers.add(new C1484h<>(kd.b.e(clazz), initializer));
    }

    @fg.l
    public final k1.b b() {
        C1484h[] c1484hArr = (C1484h[]) this.initializers.toArray(new C1484h[0]);
        return new C1478b((C1484h[]) Arrays.copyOf(c1484hArr, c1484hArr.length));
    }
}
