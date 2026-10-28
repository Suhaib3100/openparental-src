package c4;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: LogUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0015\b\u0016\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0005J\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005J\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lc4/a;", "", "", "tag", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "clazz", "(Ljava/lang/Class;)V", "msg", "Lkotlin/k2;", "c", "h", "d", "e", "f", "", "tr", "g", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "Ljava/lang/String;", "b", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f38597c;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final String tag;

    /* compiled from: LogUtils.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc4/a$a;", "", "<init>", "()V", "", "isPrintLog", "Z", "a", "()Z", "b", "(Z)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c4.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final boolean a() {
            return a.f38597c;
        }

        public final void b(boolean z4) {
            a.f38597c = z4;
        }

        public Companion(w wVar) {
        }
    }

    public a(@l String str) {
        l0.p(str, ProtectedSandApp.s("å"));
        this.tag = str;
    }

    public final void c(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("æ"));
    }

    public final void d(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("æ"));
    }

    public final void e(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("æ"));
    }

    public final void f(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("æ"));
    }

    public final void g(@l String msg, @l Throwable tr) {
        l0.p(msg, ProtectedSandApp.s("æ"));
        l0.p(tr, ProtectedSandApp.s("ç"));
    }

    public final void h(@l String msg) {
        l0.p(msg, ProtectedSandApp.s("æ"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(@fg.l java.lang.Class<?> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "ã"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r0 = "ä"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.a.<init>(java.lang.Class):void");
    }
}
