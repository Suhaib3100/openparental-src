package androidx.compose.runtime;

import kotlin.Metadata;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Effects.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00072\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/w0;", "", "<init>", "()V", "Lkotlin/Function0;", "Lkotlin/k2;", "onDisposeEffect", "Landroidx/compose/runtime/v0;", "a", "(Lld/a;)Landroidx/compose/runtime/v0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17268a = 0;

    /* compiled from: Effects.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n*L\n1#1,497:1\n*E\n"})
    public static final class a implements v0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f17269a;

        public a(ld.a<kotlin.k2> aVar) {
            this.f17269a = aVar;
        }

        @Override // androidx.compose.runtime.v0
        public void dispose() {
            this.f17269a.invoke();
        }
    }

    @fg.l
    public final v0 a(@fg.l ld.a<kotlin.k2> onDisposeEffect) {
        return new a(onDisposeEffect);
    }
}
