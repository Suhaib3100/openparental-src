package androidx.content;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.media.d;
import androidx.annotation.c1;
import fg.l;
import fg.m;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.r;

/* compiled from: NavDeepLinkRequest.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000eB'\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0012\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/navigation/d0;", "", "Landroid/net/Uri;", "uri", "", "action", "mimeType", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "(Landroid/content/Intent;)V", "toString", "()Ljava/lang/String;", "a", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "b", "Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @m
    private final Uri uri;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final String action;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final String mimeType;

    /* compiled from: NavDeepLinkRequest.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/navigation/d0$a;", "", "<init>", "()V", "Landroid/net/Uri;", "uri", "g", "(Landroid/net/Uri;)Landroidx/navigation/d0$a;", "", "action", "e", "(Ljava/lang/String;)Landroidx/navigation/d0$a;", "mimeType", "f", "Landroidx/navigation/d0;", "a", "()Landroidx/navigation/d0;", "Landroid/net/Uri;", "b", "Ljava/lang/String;", "c", "d", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @m
        private Uri uri;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private String action;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @m
        private String mimeType;

        /* compiled from: NavDeepLinkRequest.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/navigation/d0$a$a;", "", "<init>", "()V", "Landroid/net/Uri;", "uri", "Landroidx/navigation/d0$a;", "c", "(Landroid/net/Uri;)Landroidx/navigation/d0$a;", "", "action", "a", "(Ljava/lang/String;)Landroidx/navigation/d0$a;", "mimeType", "b", "navigation-common_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* renamed from: androidx.navigation.d0$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @l
            @n
            public final a a(@l String action) {
                l0.p(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
                }
                a aVar = new a();
                aVar.e(action);
                return aVar;
            }

            @l
            @n
            public final a b(@l String mimeType) {
                l0.p(mimeType, "mimeType");
                a aVar = new a();
                aVar.f(mimeType);
                return aVar;
            }

            @l
            @n
            public final a c(@l Uri uri) {
                l0.p(uri, "uri");
                a aVar = new a();
                aVar.g(uri);
                return aVar;
            }

            public Companion(w wVar) {
            }
        }

        private a() {
        }

        @l
        @n
        public static final a b(@l String str) {
            return INSTANCE.a(str);
        }

        @l
        @n
        public static final a c(@l String str) {
            return INSTANCE.b(str);
        }

        @l
        @n
        public static final a d(@l Uri uri) {
            return INSTANCE.c(uri);
        }

        @l
        public final d0 a() {
            return new d0(this.uri, this.action, this.mimeType);
        }

        @l
        public final a e(@l String action) {
            l0.p(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLinkRequest cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        @l
        public final a f(@l String mimeType) {
            l0.p(mimeType, "mimeType");
            if (!new r("^[-\\w*.]+/[-\\w+*.]+$").k(mimeType)) {
                throw new IllegalArgumentException(d.a("The given mimeType ", mimeType, " does not match to required \"type/subtype\" format").toString());
            }
            this.mimeType = mimeType;
            return this;
        }

        @l
        public final a g(@l Uri uri) {
            l0.p(uri, "uri");
            this.uri = uri;
            return this;
        }

        public a(w wVar) {
        }
    }

    @c1({c1.a.LIBRARY_GROUP})
    public d0(@m Uri uri, @m String str, @m String str2) {
        this.uri = uri;
        this.action = str;
        this.mimeType = str2;
    }

    @m
    /* renamed from: a, reason: from getter */
    public String getAction() {
        return this.action;
    }

    @m
    /* renamed from: b, reason: from getter */
    public String getMimeType() {
        return this.mimeType;
    }

    @m
    /* renamed from: c, reason: from getter */
    public Uri getUri() {
        return this.uri;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        if (getUri() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(getUri()));
        }
        if (getAction() != null) {
            sb.append(" action=");
            sb.append(getAction());
        }
        if (getMimeType() != null) {
            sb.append(" mimetype=");
            sb.append(getMimeType());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        l0.o(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @c1({c1.a.LIBRARY_GROUP})
    public d0(@l Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        l0.p(intent, "intent");
    }
}
