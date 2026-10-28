package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;

/* compiled from: HotReloader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/k1;", "", "<init>", "()V", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class k1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: HotReloader.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0014\u0010\u0003¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/k1$a;", "", "<init>", "()V", "context", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "token", "Lkotlin/k2;", "d", "(Ljava/lang/Object;)V", "f", "", "key", "c", "(I)V", "", "Landroidx/compose/runtime/j3;", "b", "()Ljava/util/List;", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.k1$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final void d(Object token) {
            i3.INSTANCE.h(token);
        }

        private final Object e(Object context) {
            return i3.INSTANCE.j();
        }

        @fg.p
        public final void a() {
            i3.INSTANCE.d();
        }

        @fg.l
        @fg.p
        public final List<j3> b() {
            return i3.INSTANCE.e();
        }

        @fg.p
        public final void c(int key) {
            i3.INSTANCE.g(key);
        }

        @fg.p
        public final void f(@fg.l Object context) {
            d(i3.INSTANCE.j());
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }
}
