package kotlin;

import androidx.view.k1;
import kotlin.Metadata;

/* compiled from: InitializerViewModelFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lm2/b;", "Landroidx/lifecycle/k1$b;", "", "Lm2/h;", "initializers", "<init>", "([Lm2/h;)V", "Landroidx/lifecycle/h1;", "T", "Ljava/lang/Class;", "modelClass", "Lm2/a;", "extras", "b", "(Ljava/lang/Class;Lm2/a;)Landroidx/lifecycle/h1;", "[Lm2/h;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1478b implements k1.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final C1484h<?>[] initializers;

    public C1478b(@fg.l C1484h<?>... initializers) {
        kotlin.jvm.internal.l0.p(initializers, "initializers");
        this.initializers = initializers;
    }

    @Override // androidx.lifecycle.k1.b
    @fg.l
    public <T extends androidx.view.h1> T b(@fg.l Class<T> modelClass, @fg.l AbstractC1477a extras) {
        kotlin.jvm.internal.l0.p(modelClass, "modelClass");
        kotlin.jvm.internal.l0.p(extras, "extras");
        T t4 = null;
        for (C1484h<?> c1484h : this.initializers) {
            if (kotlin.jvm.internal.l0.g(c1484h.a(), modelClass)) {
                Object invoke = c1484h.b().invoke(extras);
                t4 = invoke instanceof androidx.view.h1 ? (T) invoke : null;
            }
        }
        if (t4 != null) {
            return t4;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(modelClass.getName()));
    }
}
