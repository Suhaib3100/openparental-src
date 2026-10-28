package c1;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DownloadEvent.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/flashget/kidsdownloader/event/DownloadStatusEvent;", "", "action", "Lcom/flashget/kidsdownloader/event/Action;", "path", "", "(Lcom/flashget/kidsdownloader/event/Action;Ljava/lang/String;)V", "getAction", "()Lcom/flashget/kidsdownloader/event/Action;", "getPath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final a f10670a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final String f10671b;

    public d(@d5.d a aVar, @d5.d String str) {
        l0.p(aVar, ProtectedSandApp.s("\u007f"));
        l0.p(str, ProtectedSandApp.s("\u0080"));
        this.f10670a = aVar;
        this.f10671b = str;
    }

    public static /* synthetic */ d d(d dVar, a aVar, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            aVar = dVar.f10670a;
        }
        if ((i5 & 2) != 0) {
            str = dVar.f10671b;
        }
        return dVar.c(aVar, str);
    }

    @d5.d
    /* renamed from: a, reason: from getter */
    public final a getF10670a() {
        return this.f10670a;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final String getF10671b() {
        return this.f10671b;
    }

    @d5.d
    public final d c(@d5.d a aVar, @d5.d String str) {
        l0.p(aVar, ProtectedSandApp.s("\u0081"));
        l0.p(str, ProtectedSandApp.s("\u0082"));
        return new d(aVar, str);
    }

    @d5.d
    public final a e() {
        return this.f10670a;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return this.f10670a == dVar.f10670a && l0.g(this.f10671b, dVar.f10671b);
    }

    @d5.d
    public final String f() {
        return this.f10671b;
    }

    public int hashCode() {
        return this.f10671b.hashCode() + (this.f10670a.hashCode() * 31);
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u0083"));
        sb.append(this.f10670a);
        sb.append(ProtectedSandApp.s("\u0084"));
        return c.a(sb, this.f10671b, ')');
    }
}
