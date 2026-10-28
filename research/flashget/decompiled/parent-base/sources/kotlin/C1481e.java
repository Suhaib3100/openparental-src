package kotlin;

import kotlin.AbstractC1477a;
import kotlin.Metadata;

/* compiled from: CreationExtras.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J,\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lm2/e;", "Lm2/a;", "initialExtras", "<init>", "(Lm2/a;)V", "T", "Lm2/a$b;", "key", "t", "Lkotlin/k2;", "c", "(Lm2/a$b;Ljava/lang/Object;)V", "a", "(Lm2/a$b;)Ljava/lang/Object;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1481e extends AbstractC1477a {
    /* JADX WARN: Multi-variable type inference failed */
    public C1481e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // kotlin.AbstractC1477a
    @fg.m
    public <T> T a(@fg.l AbstractC1477a.b<T> key) {
        kotlin.jvm.internal.l0.p(key, "key");
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(@fg.l AbstractC1477a.b<T> key, T t4) {
        kotlin.jvm.internal.l0.p(key, "key");
        b().put(key, t4);
    }

    public C1481e(@fg.l AbstractC1477a initialExtras) {
        kotlin.jvm.internal.l0.p(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ C1481e(AbstractC1477a abstractC1477a, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? AbstractC1477a.C1272a.f81491b : abstractC1477a);
    }
}
