package c1;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: DownloadEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/flashget/kidsdownloader/event/DownloadProgressEvent;", "", "progress", "", "contentLength", "(JJ)V", "getContentLength", "()J", "getProgress", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    private final long f10668a;

    /* renamed from: b, reason: collision with root package name */
    private final long f10669b;

    public b(long j5, long j6) {
        this.f10668a = j5;
        this.f10669b = j6;
    }

    public static b d(b bVar, long j5, long j6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = bVar.f10668a;
        }
        if ((i5 & 2) != 0) {
            j6 = bVar.f10669b;
        }
        bVar.getClass();
        return new b(j5, j6);
    }

    /* renamed from: a, reason: from getter */
    public final long getF10668a() {
        return this.f10668a;
    }

    /* renamed from: b, reason: from getter */
    public final long getF10669b() {
        return this.f10669b;
    }

    @d5.d
    public final b c(long j5, long j6) {
        return new b(j5, j6);
    }

    public final long e() {
        return this.f10669b;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return this.f10668a == bVar.f10668a && this.f10669b == bVar.f10669b;
    }

    public final long f() {
        return this.f10668a;
    }

    public int hashCode() {
        return Long.hashCode(this.f10669b) + (Long.hashCode(this.f10668a) * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("}") + this.f10668a + ProtectedSandApp.s("~") + this.f10669b + ')';
    }
}
