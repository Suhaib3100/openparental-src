package androidx.window.sidecar;

import fg.l;
import kd.f;
import kotlin.Metadata;

/* compiled from: FoldingFeature.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u000b\u0003\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/q;", "Landroidx/window/layout/l;", "", "b", "()Z", "isSeparating", "Landroidx/window/layout/q$a;", "c", "()Landroidx/window/layout/q$a;", "occlusionType", "Landroidx/window/layout/q$b;", "a", "()Landroidx/window/layout/q$b;", "orientation", "Landroidx/window/layout/q$c;", "getState", "()Landroidx/window/layout/q$c;", "state", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface q extends l {

    /* compiled from: FoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/q$a;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        @l
        @f
        public static final a f35822c = new a("NONE");

        /* renamed from: d, reason: collision with root package name */
        @l
        @f
        public static final a f35823d = new a("FULL");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final String description;

        private a(String str) {
            this.description = str;
        }

        @l
        /* renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    /* compiled from: FoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/q$b;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        @l
        @f
        public static final b f35826c = new b("VERTICAL");

        /* renamed from: d, reason: collision with root package name */
        @l
        @f
        public static final b f35827d = new b("HORIZONTAL");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final String description;

        private b(String str) {
            this.description = str;
        }

        @l
        /* renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    /* compiled from: FoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/q$c;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        @l
        @f
        public static final c f35830c = new c("FLAT");

        /* renamed from: d, reason: collision with root package name */
        @l
        @f
        public static final c f35831d = new c("HALF_OPENED");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final String description;

        private c(String str) {
            this.description = str;
        }

        @l
        /* renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    @l
    b a();

    boolean b();

    @l
    a c();

    @l
    c getState();
}
