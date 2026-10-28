package kotlin;

import androidx.view.h1;
import kotlin.Metadata;

/* compiled from: InitializerViewModelFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B.\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR+\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lm2/h;", "Landroidx/lifecycle/h1;", "T", "", "Ljava/lang/Class;", "clazz", "Lkotlin/Function1;", "Lm2/a;", "Lkotlin/u;", "initializer", "<init>", "(Ljava/lang/Class;Lld/l;)V", "a", "Ljava/lang/Class;", "()Ljava/lang/Class;", "b", "Lld/l;", "()Lld/l;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m2.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1484h<T extends androidx.view.h1> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Class<T> clazz;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<AbstractC1477a, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public C1484h(@fg.l Class<T> clazz, @fg.l ld.l<? super AbstractC1477a, ? extends T> initializer) {
        kotlin.jvm.internal.l0.p(clazz, "clazz");
        kotlin.jvm.internal.l0.p(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    @fg.l
    public final Class<T> a() {
        return this.clazz;
    }

    @fg.l
    public final ld.l<AbstractC1477a, T> b() {
        return this.initializer;
    }
}
