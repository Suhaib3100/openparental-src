package android.view;

import d5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import q3.l;

/* compiled from: Transformations.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a>\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\bø\u0001\u0000\u001aD\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00020\u0003H\u0086\bø\u0001\u0000\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"X", "Y", "Landroidx/lifecycle/LiveData;", "Lkotlin/Function1;", "transform", "b", "c", "a", "lifecycle-livedata-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class a1 {

    /* compiled from: Transformations.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a<I, O> implements h.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<X, Y> f8486a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super X, ? extends Y> lVar) {
            this.f8486a = lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [Y, java.lang.Object] */
        @Override // h.a
        public final Y apply(X x5) {
            return this.f8486a.N(x5);
        }
    }

    /* compiled from: Transformations.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00018\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00018\u0001\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "it", "Landroidx/lifecycle/LiveData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b<I, O> implements h.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<X, LiveData<Y>> f8487a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super X, ? extends LiveData<Y>> lVar) {
            this.f8487a = lVar;
        }

        @Override // h.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveData<Y> apply(X x5) {
            return (LiveData) this.f8487a.N(x5);
        }
    }

    @d
    public static final <X> LiveData<X> a(@d LiveData<X> liveData) {
        l0.p(liveData, "<this>");
        LiveData<X> a6 = z0.a(liveData);
        l0.o(a6, "distinctUntilChanged(this)");
        return a6;
    }

    @d
    public static final <X, Y> LiveData<Y> b(@d LiveData<X> liveData, @d l<? super X, ? extends Y> transform) {
        l0.p(liveData, "<this>");
        l0.p(transform, "transform");
        LiveData<Y> b6 = z0.b(liveData, new a(transform));
        l0.o(b6, "crossinline transform: (…p(this) { transform(it) }");
        return b6;
    }

    @d
    public static final <X, Y> LiveData<Y> c(@d LiveData<X> liveData, @d l<? super X, ? extends LiveData<Y>> transform) {
        l0.p(liveData, "<this>");
        l0.p(transform, "transform");
        LiveData<Y> c6 = z0.c(liveData, new b(transform));
        l0.o(c6, "crossinline transform: (…p(this) { transform(it) }");
        return c6;
    }
}
