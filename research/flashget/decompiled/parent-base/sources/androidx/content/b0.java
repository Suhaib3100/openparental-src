package androidx.content;

import androidx.content.y;
import fg.l;
import fg.m;
import kotlin.Metadata;

/* compiled from: NavDeepLinkDslBuilder.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u0014\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, d2 = {"Landroidx/navigation/b0;", "", "<init>", "()V", "Landroidx/navigation/y;", "a", "()Landroidx/navigation/y;", "Landroidx/navigation/y$a;", "Landroidx/navigation/y$a;", "builder", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "uriPattern", "p", "c", "e", "action", "f", "mimeType", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@a0
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final y.a builder = new y.a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private String uriPattern;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private String action;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private String mimeType;

    @l
    public final y a() {
        y.a aVar = this.builder;
        String str = this.uriPattern;
        if (str == null && this.action == null && this.mimeType == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.");
        }
        if (str != null) {
            aVar.g(str);
        }
        String str2 = this.action;
        if (str2 != null) {
            aVar.e(str2);
        }
        String str3 = this.mimeType;
        if (str3 != null) {
            aVar.f(str3);
        }
        return aVar.a();
    }

    @m
    /* renamed from: b, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @m
    /* renamed from: c, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @m
    /* renamed from: d, reason: from getter */
    public final String getUriPattern() {
        return this.uriPattern;
    }

    public final void e(@m String str) {
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.action = str;
    }

    public final void f(@m String str) {
        this.mimeType = str;
    }

    public final void g(@m String str) {
        this.uriPattern = str;
    }
}
