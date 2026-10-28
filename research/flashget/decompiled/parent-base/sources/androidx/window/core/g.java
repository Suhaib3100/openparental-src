package androidx.window.core;

import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: SpecificationComputer.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 \r*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\r\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/window/core/g;", "", "T", "<init>", "()V", "", "message", "Lkotlin/Function1;", "", "Lkotlin/u;", "condition", "c", "(Ljava/lang/String;Lld/l;)Landroidx/window/core/g;", "a", "()Ljava/lang/Object;", "value", "b", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class g<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: SpecificationComputer.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\u0004*\u00020\u0001*\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/window/core/g$a;", "", "<init>", "()V", "T", "", "tag", "Landroidx/window/core/g$b;", "verificationMode", "Landroidx/window/core/f;", "logger", "Landroidx/window/core/g;", "a", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/window/core/g$b;Landroidx/window/core/f;)Landroidx/window/core/g;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.window.core.g$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ g b(Companion companion, Object obj, String str, b bVar, f fVar, int i4, Object obj2) {
            if ((i4 & 2) != 0) {
                bVar = c.f35689a.a();
            }
            if ((i4 & 4) != 0) {
                fVar = a.f35684a;
            }
            return companion.a(obj, str, bVar, fVar);
        }

        @l
        public final <T> g<T> a(@l T t4, @l String tag, @l b verificationMode, @l f logger) {
            l0.p(t4, "<this>");
            l0.p(tag, "tag");
            l0.p(verificationMode, "verificationMode");
            l0.p(logger, "logger");
            return new h(t4, tag, verificationMode, logger);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: SpecificationComputer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/core/g$b;", "", "<init>", "(Ljava/lang/String;I)V", "STRICT", "LOG", "QUIET", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum b {
        STRICT,
        LOG,
        QUIET
    }

    @m
    public abstract T a();

    @l
    protected final String b(@l Object value, @l String message) {
        l0.p(value, "value");
        l0.p(message, "message");
        return message + " value: " + value;
    }

    @l
    public abstract g<T> c(@l String message, @l ld.l<? super T, Boolean> condition);
}
