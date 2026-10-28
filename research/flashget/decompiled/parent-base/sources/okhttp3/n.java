package okhttp3;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CookieJar.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \b2\u00020\u0001:\u0001\nJ%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/n;", "", "Lokhttp3/v;", "url", "", "Lokhttp3/m;", "cookies", "Lkotlin/k2;", "b", "(Lokhttp3/v;Ljava/util/List;)V", "a", "(Lokhttp3/v;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public interface n {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    @kd.f
    public static final n f85045a = new Companion.C1328a();

    /* compiled from: CookieJar.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lokhttp3/n$a;", "", "<init>", "()V", "Lokhttp3/n;", "NO_COOKIES", "Lokhttp3/n;", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* renamed from: okhttp3.n$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f85047a = null;

        /* compiled from: CookieJar.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lokhttp3/n$a$a;", "Lokhttp3/n;", "<init>", "()V", "Lokhttp3/v;", "url", "", "Lokhttp3/m;", "cookies", "Lkotlin/k2;", "b", "(Lokhttp3/v;Ljava/util/List;)V", "a", "(Lokhttp3/v;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: okhttp3.n$a$a, reason: collision with other inner class name */
        private static final class C1328a implements n {
            @Override // okhttp3.n
            @fg.l
            public List<m> a(@fg.l v url) {
                l0.p(url, ProtectedSandApp.s("ꇯ\u0001"));
                return kotlin.collections.j0.f74919b;
            }

            @Override // okhttp3.n
            public void b(@fg.l v url, @fg.l List<m> cookies) {
                l0.p(url, ProtectedSandApp.s("ꇯ\u0001"));
                l0.p(cookies, ProtectedSandApp.s("ꇰ\u0001"));
            }
        }

        private Companion() {
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    @fg.l
    List<m> a(@fg.l v url);

    void b(@fg.l v url, @fg.l List<m> cookies);
}
