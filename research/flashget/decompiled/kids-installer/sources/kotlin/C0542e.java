package kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.AbstractC0540a;
import kotlin.Metadata;

/* compiled from: CreationExtras.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Ll0/e;", "Ll0/a;", "T", "Ll0/a$b;", "key", "t", "Lkotlin/m2;", "c", "(Ll0/a$b;Ljava/lang/Object;)V", "a", "(Ll0/a$b;)Ljava/lang/Object;", "initialExtras", "<init>", "(Ll0/a;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0542e extends AbstractC0540a {
    /* JADX WARN: Multi-variable type inference failed */
    public C0542e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // kotlin.AbstractC0540a
    @d5.e
    public <T> T a(@d5.d AbstractC0540a.b<T> key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("⯪"));
        return (T) b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(@d5.d AbstractC0540a.b<T> key, T t5) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("⯫"));
        b().put(key, t5);
    }

    public C0542e(@d5.d AbstractC0540a abstractC0540a) {
        kotlin.jvm.internal.l0.p(abstractC0540a, ProtectedSandApp.s("⯩"));
        b().putAll(abstractC0540a.b());
    }

    public /* synthetic */ C0542e(AbstractC0540a abstractC0540a, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? AbstractC0540a.C0459a.f29101b : abstractC0540a);
    }
}
